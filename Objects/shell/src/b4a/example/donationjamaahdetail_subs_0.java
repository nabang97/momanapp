package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class donationjamaahdetail_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (donationjamaahdetail) ","donationjamaahdetail",8,donationjamaahdetail.mostCurrent.activityBA,donationjamaahdetail.mostCurrent,26);
if (RapidSub.canDelegate("activity_create")) return b4a.example.donationjamaahdetail.remoteMe.runUserSub(false, "donationjamaahdetail","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 26;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 29;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(268435456);
donationjamaahdetail.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),donationjamaahdetail.mostCurrent.activityBA);
 BA.debugLineNum = 30;BA.debugLine="MainScroll.Panel.LoadLayout(\"DonationJamaahDetail";
Debug.ShouldStop(536870912);
donationjamaahdetail.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("DonationJamaahDetail")),donationjamaahdetail.mostCurrent.activityBA);
 BA.debugLineNum = 31;BA.debugLine="MainScroll.Panel.Height= PanelQurban.Height";
Debug.ShouldStop(1073741824);
donationjamaahdetail.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",donationjamaahdetail.mostCurrent._panelqurban.runMethod(true,"getHeight"));
 BA.debugLineNum = 32;BA.debugLine="MainScroll.Height =100%y - MainScroll.Top";
Debug.ShouldStop(-2147483648);
donationjamaahdetail.mostCurrent._mainscroll.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {donationjamaahdetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),donationjamaahdetail.mostCurrent.activityBA),donationjamaahdetail.mostCurrent._mainscroll.runMethod(true,"getTop")}, "-",1, 1));
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (donationjamaahdetail) ","donationjamaahdetail",8,donationjamaahdetail.mostCurrent.activityBA,donationjamaahdetail.mostCurrent,42);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.donationjamaahdetail.remoteMe.runUserSub(false, "donationjamaahdetail","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 42;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(512);
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (donationjamaahdetail) ","donationjamaahdetail",8,donationjamaahdetail.mostCurrent.activityBA,donationjamaahdetail.mostCurrent,38);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.donationjamaahdetail.remoteMe.runUserSub(false, "donationjamaahdetail","activity_resume");
 BA.debugLineNum = 38;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="CodeSemua.ExecuteUrlGet(Main.server&\"api/donation";
Debug.ShouldStop(64);
donationjamaahdetail.mostCurrent._codesemua.runVoidMethod ("_executeurlget",donationjamaahdetail.mostCurrent.activityBA,(Object)(RemoteObject.concat(donationjamaahdetail.mostCurrent._main._server,RemoteObject.createImmutable("api/donation/detail?id="),donationjamaahdetail.mostCurrent._donationjamaah._idselected)),(Object)(BA.ObjectToString("LoadData")),(Object)(donationjamaahdetail.getObject()));
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (donationjamaahdetail) ","donationjamaahdetail",8,donationjamaahdetail.mostCurrent.activityBA,donationjamaahdetail.mostCurrent,107);
if (RapidSub.canDelegate("button1_click")) return b4a.example.donationjamaahdetail.remoteMe.runUserSub(false, "donationjamaahdetail","button1_click");
 BA.debugLineNum = 107;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 108;BA.debugLine="StartActivity(HistoryJamaah)";
Debug.ShouldStop(2048);
donationjamaahdetail.mostCurrent.__c.runVoidMethod ("StartActivity",donationjamaahdetail.processBA,(Object)((donationjamaahdetail.mostCurrent._historyjamaah.getObject())));
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 15;BA.debugLine="Private MainScroll As ScrollView";
donationjamaahdetail.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private NavbarTitle As Label";
donationjamaahdetail.mostCurrent._navbartitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private PanelQurban As Panel";
donationjamaahdetail.mostCurrent._panelqurban = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private Button1 As Button";
donationjamaahdetail.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private Button3 As Button";
donationjamaahdetail.mostCurrent._button3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private CustomListView1 As CustomListView";
donationjamaahdetail.mostCurrent._customlistview1 = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 22;BA.debugLine="Private HorizontalScrollView1 As HorizontalScroll";
donationjamaahdetail.mostCurrent._horizontalscrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.HorizontalScrollViewWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private ImageView1 As ImageView";
donationjamaahdetail.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (donationjamaahdetail) ","donationjamaahdetail",8,donationjamaahdetail.mostCurrent.activityBA,donationjamaahdetail.mostCurrent,46);
if (RapidSub.canDelegate("jobdone")) return b4a.example.donationjamaahdetail.remoteMe.runUserSub(false, "donationjamaahdetail","jobdone", _job);
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _firstvalue = RemoteObject.createImmutable("");
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _gallery = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _w = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _image = RemoteObject.createImmutable("");
RemoteObject _gambar = RemoteObject.createImmutable("");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 46;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="If Job.Success = True Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success"),donationjamaahdetail.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 49;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(65536);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 50;BA.debugLine="parser.Initialize(Job.GetString)";
Debug.ShouldStop(131072);
_parser.runVoidMethod ("Initialize",(Object)(_job.runMethod(true,"_getstring")));
 BA.debugLineNum = 51;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(262144);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 52;BA.debugLine="Dim FirstValue As String = root.Get(\"project\")";
Debug.ShouldStop(524288);
_firstvalue = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("project")))));Debug.locals.put("FirstValue", _firstvalue);Debug.locals.put("FirstValue", _firstvalue);
 BA.debugLineNum = 56;BA.debugLine="Dim a As Map";
Debug.ShouldStop(8388608);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 57;BA.debugLine="a = root.Get(\"project\")";
Debug.ShouldStop(16777216);
_a.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("project")))));
 BA.debugLineNum = 58;BA.debugLine="NavbarTitle.Text = a.Get(\"name\")";
Debug.ShouldStop(33554432);
donationjamaahdetail.mostCurrent._navbartitle.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name"))))));
 BA.debugLineNum = 59;BA.debugLine="NavbarTitle.TextSize = 20";
Debug.ShouldStop(67108864);
donationjamaahdetail.mostCurrent._navbartitle.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 61;BA.debugLine="Dim data As List : data.Initialize";
Debug.ShouldStop(268435456);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("data", _data);
 BA.debugLineNum = 61;BA.debugLine="Dim data As List : data.Initialize";
Debug.ShouldStop(268435456);
_data.runVoidMethod ("Initialize");
 BA.debugLineNum = 62;BA.debugLine="data = root.Get(\"account\")";
Debug.ShouldStop(536870912);
_data.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("account")))));
 BA.debugLineNum = 64;BA.debugLine="If data.Size = 0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_data.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 65;BA.debugLine="Log(\"rekening pengurus kosong\")";
Debug.ShouldStop(1);
donationjamaahdetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("rekening pengurus kosong")));
 };
 BA.debugLineNum = 68;BA.debugLine="Dim gallery As List : data.Initialize";
Debug.ShouldStop(8);
_gallery = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("gallery", _gallery);
 BA.debugLineNum = 68;BA.debugLine="Dim gallery As List : data.Initialize";
Debug.ShouldStop(8);
_data.runVoidMethod ("Initialize");
 BA.debugLineNum = 69;BA.debugLine="gallery = root.Get(\"gallery\")";
Debug.ShouldStop(16);
_gallery.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("gallery")))));
 BA.debugLineNum = 70;BA.debugLine="HorizontalScrollView1.Panel.LoadLayout(\"CLV_dona";
Debug.ShouldStop(32);
donationjamaahdetail.mostCurrent._horizontalscrollview1.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("CLV_donation")),donationjamaahdetail.mostCurrent.activityBA);
 BA.debugLineNum = 71;BA.debugLine="For i=0 To gallery.Size-1";
Debug.ShouldStop(64);
{
final int step20 = 1;
final int limit20 = RemoteObject.solve(new RemoteObject[] {_gallery.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step20 > 0 && _i <= limit20) || (step20 < 0 && _i >= limit20) ;_i = ((int)(0 + _i + step20))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 72;BA.debugLine="Dim w As Map";
Debug.ShouldStop(128);
_w = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("w", _w);
 BA.debugLineNum = 73;BA.debugLine="w=gallery.Get(i)";
Debug.ShouldStop(256);
_w.setObject(_gallery.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 74;BA.debugLine="Dim image = w.Get(\"image\") As String";
Debug.ShouldStop(512);
_image = BA.ObjectToString(_w.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("image")))));Debug.locals.put("image", _image);Debug.locals.put("image", _image);
 BA.debugLineNum = 75;BA.debugLine="Dim gambar = \"\"&Main.Server&\"images/project/\"&i";
Debug.ShouldStop(1024);
_gambar = RemoteObject.concat(RemoteObject.createImmutable(""),donationjamaahdetail.mostCurrent._main._server,RemoteObject.createImmutable("images/project/"),_image);Debug.locals.put("gambar", _gambar);Debug.locals.put("gambar", _gambar);
 BA.debugLineNum = 77;BA.debugLine="Dim m As Map";
Debug.ShouldStop(4096);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 78;BA.debugLine="m.Initialize";
Debug.ShouldStop(8192);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 79;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(16384);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 80;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(32768);
_p.runVoidMethod ("Initialize",donationjamaahdetail.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 81;BA.debugLine="p.SetLayout(0,0,100%x,20%y)";
Debug.ShouldStop(65536);
_p.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(donationjamaahdetail.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),donationjamaahdetail.mostCurrent.activityBA)),(Object)(donationjamaahdetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 20)),donationjamaahdetail.mostCurrent.activityBA)));
 BA.debugLineNum = 82;BA.debugLine="p.Color=Colors.Green";
Debug.ShouldStop(131072);
_p.runVoidMethod ("setColor",donationjamaahdetail.mostCurrent.__c.getField(false,"Colors").getField(true,"Green"));
 BA.debugLineNum = 83;BA.debugLine="p.LoadLayout(\"ListImageProjectJamaah\")";
Debug.ShouldStop(262144);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ListImageProjectJamaah")),donationjamaahdetail.mostCurrent.activityBA);
 BA.debugLineNum = 85;BA.debugLine="CustomListView1.AsView.Color= Colors.Magenta";
Debug.ShouldStop(1048576);
donationjamaahdetail.mostCurrent._customlistview1.runMethod(false,"_asview").runMethod(true,"setColor",donationjamaahdetail.mostCurrent.__c.getField(false,"Colors").getField(true,"Magenta"));
 BA.debugLineNum = 86;BA.debugLine="CustomListView1.Add(p,m)";
Debug.ShouldStop(2097152);
donationjamaahdetail.mostCurrent._customlistview1.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _p.getObject()),(Object)((_m.getObject())));
 BA.debugLineNum = 87;BA.debugLine="m.Put(ImageView1, gambar)";
Debug.ShouldStop(4194304);
_m.runVoidMethod ("Put",(Object)((donationjamaahdetail.mostCurrent._imageview1.getObject())),(Object)((_gambar)));
 BA.debugLineNum = 88;BA.debugLine="Log (gambar)";
Debug.ShouldStop(8388608);
donationjamaahdetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(_gambar));
 BA.debugLineNum = 89;BA.debugLine="CallSubDelayed2(Starter, \"Download\", m)";
Debug.ShouldStop(16777216);
donationjamaahdetail.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",donationjamaahdetail.processBA,(Object)((donationjamaahdetail.mostCurrent._starter.getObject())),(Object)(BA.ObjectToString("Download")),(Object)((_m)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 92;BA.debugLine="Log(\"--------- 1\"&CustomListView1.Size)";
Debug.ShouldStop(134217728);
donationjamaahdetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("--------- 1"),donationjamaahdetail.mostCurrent._customlistview1.runMethod(true,"_getsize"))));
 BA.debugLineNum = 93;BA.debugLine="Log(\"--------- 2\"&ImageView1.width)";
Debug.ShouldStop(268435456);
donationjamaahdetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("--------- 2"),donationjamaahdetail.mostCurrent._imageview1.runMethod(true,"getWidth"))));
 BA.debugLineNum = 94;BA.debugLine="CustomListView1.sv.Height = (ImageView1.width) *";
Debug.ShouldStop(536870912);
donationjamaahdetail.mostCurrent._customlistview1.getField(false,"_sv").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {(donationjamaahdetail.mostCurrent._imageview1.runMethod(true,"getWidth")),donationjamaahdetail.mostCurrent._customlistview1.runMethod(true,"_getsize")}, "*",0, 1));
 BA.debugLineNum = 95;BA.debugLine="CustomListView1.AsView.Width = CustomListView1.s";
Debug.ShouldStop(1073741824);
donationjamaahdetail.mostCurrent._customlistview1.runMethod(false,"_asview").runMethod(true,"setWidth",donationjamaahdetail.mostCurrent._customlistview1.getField(false,"_sv").runMethod(true,"getHeight"));
 BA.debugLineNum = 96;BA.debugLine="HorizontalScrollView1.Panel.Width = CustomListVi";
Debug.ShouldStop(-2147483648);
donationjamaahdetail.mostCurrent._horizontalscrollview1.runMethod(false,"getPanel").runMethod(true,"setWidth",donationjamaahdetail.mostCurrent._customlistview1.getField(false,"_sv").runMethod(true,"getHeight"));
 }else {
 BA.debugLineNum = 100;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(8);
donationjamaahdetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage"))));
 BA.debugLineNum = 101;BA.debugLine="ToastMessageShow(\"Error: \" & Job.ErrorMessage, T";
Debug.ShouldStop(16);
donationjamaahdetail.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage")))),(Object)(donationjamaahdetail.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 103;BA.debugLine="Job.Release";
Debug.ShouldStop(64);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 104;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI";
donationjamaahdetail._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}