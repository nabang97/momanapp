﻿B4A=true
Group=Default Group\Jamaah
ModulesStructureVersion=1
Type=Activity
Version=8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Private xui As XUI
	Dim idSelected As String
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private MainScroll As ScrollView
	Private PanelQurban As Panel	
	Private NavbarTitle As Label
	
	Private CLV As CustomListView
	Private PanelListItem As B4XView
	Private MosqueName As B4XView
	Private QurbanCow As Label	
	Private BtnQurbanHere As Button
	Private IdQurban As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("MainScrollView")
	MainScroll.Panel.LoadLayout("List")	
	MainScroll.Height = 100%y
	
	NavbarTitle.Text="Qurban"
	NavbarTitle.TextSize = 22
	
End Sub

Sub Activity_Resume
	CLV.Clear
	CodeSemua.ExecuteUrlGet(Main.server&"api/qurban","LoadData",Me)
	
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Private Sub CreateItem(Width As Int, id As String, title As String, status As String) As Panel
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0, 0, Width, 30%y)
	p.LoadLayout("ListQurbanJamaah")
	
	MosqueName.Text = title
	IdQurban.Text = id
	QurbanCow.Text = status
	
	Return p
	
End Sub

Sub JobDone (Job As HttpJob)	
	If Job.Success = True Then
		Dim res As String
		res = Job.GetString 'menyimpan json dalam bentuk string
		Dim parser As JSONParser 'mengambil data dalam bentuk json menjadi array
		parser.Initialize(res)		
		Select Job.JobName
			Case "LoadData"
				Try
					Dim data As List
					data=parser.NextArray
					If data.Size-1 > 0 Then
						For i=0 To data.Size -1
							Dim a As Map
							Dim animal As List
							
							a = data.Get(i)
							animal = a.Get("animal_type")
														
							If animal.Size <> 0 Then								
								CLV.Add(CreateItem(CLV.AsView.Width,a.Get("id"),"Qurban "&a.Get("name"), "Qurban Available"),"")
								CLV.AsView.Height = (PanelListItem.Height+2%y) *CLV.Size
							End If														
						Next
						PanelQurban.Height= CLV.AsView.Height + 10%y
						CLV.sv.Height = CLV.AsView.Height
						CLV.AsView.Height = CLV.AsView.Height
						MainScroll.Panel.Height = PanelQurban.Height
					End If
								
				Catch
					Log(LastException)
				End Try
		End Select
		
	Else
		Log("Error: " & Job.ErrorMessage)
		ToastMessageShow("Error: " & Job.ErrorMessage, True)
	End If
	Job.Release
End Sub

Sub CLV_ItemClick (Index As Int, Value As Object)
	'StartActivity(DonationJamaahDetail)
End Sub

Sub PanelListItem_Click
	Dim item As Int = CLV.GetItemFromView(Sender)
	Dim p As B4XView
	p = CLV.GetPanel(item)
	
	Dim a As B4XView
	a = p.GetView(0)
	
	'----- mendapatkan label ID dan disimpan pada variabel global
	'Log("ID donation:" &a.GetView(0).GetView(0).Text)
	'----- mendapatkan nama building dan disimpan pada variabel global
	'Log("Project name: "& a.GetView(0).GetView(5).Text)
	
	idSelected = a.GetView(0).GetView(4).Text
	Log(idSelected)
	StartActivity(QurbanJamaahDetail)
End Sub