B4A=true
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
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private MainScroll As ScrollView
	Private NavbarTitle As Label
	
	Private PanelQurban As Panel
	Private Button1 As Button
	Private Button3 As Button
	Private CustomListView1 As CustomListView
	Private HorizontalScrollView1 As HorizontalScrollView
	Private ImageView1 As ImageView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Activity.LoadLayout("MainScrollView")
	MainScroll.Panel.LoadLayout("DonationJamaahDetail")
	MainScroll.Panel.Height= PanelQurban.Height
	MainScroll.Height =100%y - MainScroll.Top
	
	
	
End Sub

Sub Activity_Resume	
	CodeSemua.ExecuteUrlGet(Main.server&"api/donation/detail?id="&DonationJamaah.idSelected,"LoadData",Me)
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub JobDone (Job As HttpJob)	
	If Job.Success = True Then
		
		Dim parser As JSONParser
		parser.Initialize(Job.GetString)
		Dim root As Map = parser.NextObject
		Dim FirstValue As String = root.Get("project")
		'Log(FirstValue)
		'all values
								
		Dim a As Map
		a = root.Get("project")		
		NavbarTitle.Text = a.Get("name")
		NavbarTitle.TextSize = 20
		
		Dim data As List : data.Initialize		
		data = root.Get("account")		
		
		If data.Size = 0 Then
			Log("rekening pengurus kosong")
		End If
		
		Dim gallery As List : data.Initialize
		gallery = root.Get("gallery")
		HorizontalScrollView1.Panel.LoadLayout("CLV_donation")
		For i=0 To gallery.Size-1
			Dim w As Map
			w=gallery.Get(i)
			Dim image = w.Get("image") As String
			Dim gambar = ""&Main.Server&"images/project/"&image As String
			
			Dim m As Map
			m.Initialize
			Dim p As Panel
			p.Initialize("")
			p.SetLayout(0,0,100%x,20%y)
			p.Color=Colors.Green
			p.LoadLayout("ListImageProjectJamaah")
			
			CustomListView1.AsView.Color= Colors.Magenta
			CustomListView1.Add(p,m)
			m.Put(ImageView1, gambar)
			Log (gambar)
			CallSubDelayed2(Starter, "Download", m)		
			
		Next
		
		CustomListView1.sv.Height = (ImageView1.width) * CustomListView1.Size
		CustomListView1.AsView.Width = CustomListView1.sv.Height
		HorizontalScrollView1.Panel.Width = CustomListView1.sv.Height
		
		'HorizontalScrollView1.Panel.Width=500%x
	Else
		Log("Error: " & Job.ErrorMessage)
		ToastMessageShow("Error: " & Job.ErrorMessage, True)
	End If
	Job.Release
End Sub


Sub Button1_Click
	StartActivity(HistoryJamaah)
End Sub