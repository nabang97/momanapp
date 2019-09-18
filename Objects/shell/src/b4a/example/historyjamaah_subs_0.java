package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class historyjamaah_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (historyjamaah) ","historyjamaah",3,historyjamaah.mostCurrent.activityBA,historyjamaah.mostCurrent,29);
if (RapidSub.canDelegate("activity_create")) return b4a.example.historyjamaah.remoteMe.runUserSub(false, "historyjamaah","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 29;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 32;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(-2147483648);
historyjamaah.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),historyjamaah.mostCurrent.activityBA);
 BA.debugLineNum = 33;BA.debugLine="MainScroll.Panel.LoadLayout(\"List\")";
Debug.ShouldStop(1);
historyjamaah.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("List")),historyjamaah.mostCurrent.activityBA);
 BA.debugLineNum = 35;BA.debugLine="MainScroll.Panel.Height = PanelQurban.Height";
Debug.ShouldStop(4);
historyjamaah.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",historyjamaah.mostCurrent._panelqurban.runMethod(true,"getHeight"));
 BA.debugLineNum = 36;BA.debugLine="MainScroll.Height = 100%y";
Debug.ShouldStop(8);
historyjamaah.mostCurrent._mainscroll.runMethod(true,"setHeight",historyjamaah.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),historyjamaah.mostCurrent.activityBA));
 BA.debugLineNum = 38;BA.debugLine="NavbarTitle.Text=\"History Transaction\"";
Debug.ShouldStop(32);
historyjamaah.mostCurrent._navbartitle.runMethod(true,"setText",BA.ObjectToCharSequence("History Transaction"));
 BA.debugLineNum = 39;BA.debugLine="NavbarTitle.TextSize = 20";
Debug.ShouldStop(64);
historyjamaah.mostCurrent._navbartitle.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
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
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (historyjamaah) ","historyjamaah",3,historyjamaah.mostCurrent.activityBA,historyjamaah.mostCurrent,130);
if (RapidSub.canDelegate("activity_keypress")) return b4a.example.historyjamaah.remoteMe.runUserSub(false, "historyjamaah","activity_keypress", _keycode);
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 130;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(2);
 BA.debugLineNum = 131;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, historyjamaah.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 132;BA.debugLine="StartActivity(HomeJamaah)";
Debug.ShouldStop(8);
historyjamaah.mostCurrent.__c.runVoidMethod ("StartActivity",historyjamaah.processBA,(Object)((historyjamaah.mostCurrent._homejamaah.getObject())));
 }else {
 BA.debugLineNum = 134;BA.debugLine="Return False";
Debug.ShouldStop(32);
Debug.CheckDeviceExceptions();if (true) return historyjamaah.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (historyjamaah) ","historyjamaah",3,historyjamaah.mostCurrent.activityBA,historyjamaah.mostCurrent,47);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.historyjamaah.remoteMe.runUserSub(false, "historyjamaah","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 47;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("Activity_Resume (historyjamaah) ","historyjamaah",3,historyjamaah.mostCurrent.activityBA,historyjamaah.mostCurrent,42);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.historyjamaah.remoteMe.runUserSub(false, "historyjamaah","activity_resume");
 BA.debugLineNum = 42;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="CLV.Clear";
Debug.ShouldStop(1024);
historyjamaah.mostCurrent._clv.runVoidMethod ("_clear");
 BA.debugLineNum = 44;BA.debugLine="CodeSemua.ExecuteUrlGet(Main.server&\"api/history?";
Debug.ShouldStop(2048);
historyjamaah.mostCurrent._codesemua.runVoidMethod ("_executeurlget",historyjamaah.mostCurrent.activityBA,(Object)(RemoteObject.concat(historyjamaah.mostCurrent._main._server,RemoteObject.createImmutable("api/history?id="),historyjamaah.mostCurrent._homejamaah._id)),(Object)(BA.ObjectToString("LoadData")),(Object)(historyjamaah.getObject()));
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clv_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CLV_ItemClick (historyjamaah) ","historyjamaah",3,historyjamaah.mostCurrent.activityBA,historyjamaah.mostCurrent,114);
if (RapidSub.canDelegate("clv_itemclick")) return b4a.example.historyjamaah.remoteMe.runUserSub(false, "historyjamaah","clv_itemclick", _index, _value);
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 114;BA.debugLine="Sub CLV_ItemClick (Index As Int, Value As Object)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createitem(RemoteObject _width,RemoteObject _idtrx,RemoteObject _title,RemoteObject _date,RemoteObject _fund,RemoteObject _confirm) throws Exception{
try {
		Debug.PushSubsStack("CreateItem (historyjamaah) ","historyjamaah",3,historyjamaah.mostCurrent.activityBA,historyjamaah.mostCurrent,51);
if (RapidSub.canDelegate("createitem")) return b4a.example.historyjamaah.remoteMe.runUserSub(false, "historyjamaah","createitem", _width, _idtrx, _title, _date, _fund, _confirm);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Width", _width);
Debug.locals.put("idtrx", _idtrx);
Debug.locals.put("title", _title);
Debug.locals.put("date", _date);
Debug.locals.put("fund", _fund);
Debug.locals.put("confirm", _confirm);
 BA.debugLineNum = 51;BA.debugLine="Private Sub CreateItem(Width As Int, idtrx As Stri";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(524288);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = historyjamaah._xui.runMethod(false,"CreatePanel",historyjamaah.processBA,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 54;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, Width, 30%y)";
Debug.ShouldStop(2097152);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(historyjamaah.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 30)),historyjamaah.mostCurrent.activityBA)));
 BA.debugLineNum = 55;BA.debugLine="p.LoadLayout(\"ListHistoryJamaah\")";
Debug.ShouldStop(4194304);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("ListHistoryJamaah")),historyjamaah.mostCurrent.activityBA);
 BA.debugLineNum = 57;BA.debugLine="If confirm = False Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_confirm,historyjamaah.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 58;BA.debugLine="TotalTrans.Text = fund&\" (Checking)\"";
Debug.ShouldStop(33554432);
historyjamaah.mostCurrent._totaltrans.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_fund,RemoteObject.createImmutable(" (Checking)"))));
 }else {
 BA.debugLineNum = 60;BA.debugLine="TotalTrans.Text = fund&\" (Confirmed)\"";
Debug.ShouldStop(134217728);
historyjamaah.mostCurrent._totaltrans.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_fund,RemoteObject.createImmutable(" (Confirmed)"))));
 };
 BA.debugLineNum = 63;BA.debugLine="Id.Text = idtrx";
Debug.ShouldStop(1073741824);
historyjamaah.mostCurrent._id.runMethod(true,"setText",BA.ObjectToCharSequence(_idtrx));
 BA.debugLineNum = 64;BA.debugLine="DateTrans.Text = date";
Debug.ShouldStop(-2147483648);
historyjamaah.mostCurrent._datetrans.runMethod(true,"setText",BA.ObjectToCharSequence(_date));
 BA.debugLineNum = 65;BA.debugLine="TransName.Text = \"#\"&idtrx&\" (\"&title&\")\"";
Debug.ShouldStop(1);
historyjamaah.mostCurrent._transname.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("#"),_idtrx,RemoteObject.createImmutable(" ("),_title,RemoteObject.createImmutable(")"))));
 BA.debugLineNum = 67;BA.debugLine="Return p";
Debug.ShouldStop(4);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _p.getObject());
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private MainScroll As ScrollView";
historyjamaah.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private PanelQurban As Panel";
historyjamaah.mostCurrent._panelqurban = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private NavbarTitle As Label";
historyjamaah.mostCurrent._navbartitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private CLV As CustomListView";
historyjamaah.mostCurrent._clv = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 21;BA.debugLine="Private PanelListItem As Panel";
historyjamaah.mostCurrent._panellistitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private TransName As Label";
historyjamaah.mostCurrent._transname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private DateTrans As Label";
historyjamaah.mostCurrent._datetrans = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private TotalTrans As Label";
historyjamaah.mostCurrent._totaltrans = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private Id As Label";
historyjamaah.mostCurrent._id = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (historyjamaah) ","historyjamaah",3,historyjamaah.mostCurrent.activityBA,historyjamaah.mostCurrent,70);
if (RapidSub.canDelegate("jobdone")) return b4a.example.historyjamaah.remoteMe.runUserSub(false, "historyjamaah","jobdone", _job);
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 70;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(32);
 BA.debugLineNum = 72;BA.debugLine="If Job.Success = True Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success"),historyjamaah.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 73;BA.debugLine="Dim res As String";
Debug.ShouldStop(256);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 74;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
Debug.ShouldStop(512);
_res = _job.runMethod(true,"_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 76;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
Debug.ShouldStop(2048);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 77;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(4096);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 80;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(32768);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname"),BA.ObjectToString("LoadData"))) {
case 0: {
 BA.debugLineNum = 82;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 83;BA.debugLine="Dim data As List";
Debug.ShouldStop(262144);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("data", _data);
 BA.debugLineNum = 84;BA.debugLine="data=parser.NextArray";
Debug.ShouldStop(524288);
_data = _parser.runMethod(false,"NextArray");Debug.locals.put("data", _data);
 BA.debugLineNum = 85;BA.debugLine="If data.Size-1 > 0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(">",RemoteObject.solve(new RemoteObject[] {_data.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 87;BA.debugLine="For i=0 To data.Size -1";
Debug.ShouldStop(4194304);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {_data.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12) ;_i = ((int)(0 + _i + step12))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 88;BA.debugLine="Dim a As Map";
Debug.ShouldStop(8388608);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 89;BA.debugLine="a = data.Get(i)";
Debug.ShouldStop(16777216);
_a.setObject(_data.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 91;BA.debugLine="CLV.Add(CreateItem(CLV.AsView.Width, a.Get(";
Debug.ShouldStop(67108864);
historyjamaah.mostCurrent._clv.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createitem(historyjamaah.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"getWidth"),BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))),BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("donation_name"))))),RemoteObject.concat(RemoteObject.createImmutable("Datetime: "),_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("datetime"))))),RemoteObject.concat(RemoteObject.createImmutable("Total Infaq: "),_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fund"))))),BA.ObjectToBoolean(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("confirmation")))))).getObject()),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 92;BA.debugLine="CLV.AsView.Height = (PanelListItem.Height+1";
Debug.ShouldStop(134217728);
historyjamaah.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {historyjamaah.mostCurrent._panellistitem.runMethod(true,"getHeight"),historyjamaah.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1.4)),historyjamaah.mostCurrent.activityBA)}, "+",1, 1)),historyjamaah.mostCurrent._clv.runMethod(true,"_getsize")}, "*",0, 1));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 95;BA.debugLine="PanelQurban.Height= CLV.AsView.Height + 10%y";
Debug.ShouldStop(1073741824);
historyjamaah.mostCurrent._panelqurban.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {historyjamaah.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"getHeight"),historyjamaah.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),historyjamaah.mostCurrent.activityBA)}, "+",1, 1));
 BA.debugLineNum = 96;BA.debugLine="CLV.sv.Height = CLV.AsView.Height";
Debug.ShouldStop(-2147483648);
historyjamaah.mostCurrent._clv.getField(false,"_sv").runMethod(true,"setHeight",historyjamaah.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"getHeight"));
 BA.debugLineNum = 97;BA.debugLine="CLV.AsView.Height = CLV.AsView.Height";
Debug.ShouldStop(1);
historyjamaah.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"setHeight",historyjamaah.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"getHeight"));
 BA.debugLineNum = 98;BA.debugLine="MainScroll.Panel.Height = PanelQurban.Height";
Debug.ShouldStop(2);
historyjamaah.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",historyjamaah.mostCurrent._panelqurban.runMethod(true,"getHeight"));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e24) {
			BA.rdebugUtils.runVoidMethod("setLastException",historyjamaah.processBA, e24.toString()); BA.debugLineNum = 103;BA.debugLine="Log(LastException)";
Debug.ShouldStop(64);
historyjamaah.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(historyjamaah.mostCurrent.__c.runMethod(false,"LastException",historyjamaah.mostCurrent.activityBA))));
 };
 break; }
}
;
 }else {
 BA.debugLineNum = 108;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(2048);
historyjamaah.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage"))));
 BA.debugLineNum = 109;BA.debugLine="ToastMessageShow(\"Error: \" & Job.ErrorMessage, T";
Debug.ShouldStop(4096);
historyjamaah.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage")))),(Object)(historyjamaah.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 111;BA.debugLine="Job.Release";
Debug.ShouldStop(16384);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panellistitem_click() throws Exception{
try {
		Debug.PushSubsStack("PanelListItem_Click (historyjamaah) ","historyjamaah",3,historyjamaah.mostCurrent.activityBA,historyjamaah.mostCurrent,118);
if (RapidSub.canDelegate("panellistitem_click")) return b4a.example.historyjamaah.remoteMe.runUserSub(false, "historyjamaah","panellistitem_click");
RemoteObject _item = RemoteObject.createImmutable(0);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 118;BA.debugLine="Sub PanelListItem_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 119;BA.debugLine="Dim item As Int = CLV.GetItemFromView(Sender)";
Debug.ShouldStop(4194304);
_item = historyjamaah.mostCurrent._clv.runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), historyjamaah.mostCurrent.__c.runMethod(false,"Sender",historyjamaah.mostCurrent.activityBA)));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 120;BA.debugLine="Dim p As B4XView";
Debug.ShouldStop(8388608);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 121;BA.debugLine="p = CLV.GetPanel(item)";
Debug.ShouldStop(16777216);
_p = historyjamaah.mostCurrent._clv.runMethod(false,"_getpanel",(Object)(_item));Debug.locals.put("p", _p);
 BA.debugLineNum = 123;BA.debugLine="Dim a As B4XView";
Debug.ShouldStop(67108864);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("a", _a);
 BA.debugLineNum = 124;BA.debugLine="a = p.GetView(0)";
Debug.ShouldStop(134217728);
_a = _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("a", _a);
 BA.debugLineNum = 126;BA.debugLine="idSelected=a.GetView(0).GetView(4).Text";
Debug.ShouldStop(536870912);
historyjamaah._idselected = _a.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 4))).runMethod(true,"getText");
 BA.debugLineNum = 127;BA.debugLine="StartActivity(DonationJamaahConfirm)";
Debug.ShouldStop(1073741824);
historyjamaah.mostCurrent.__c.runVoidMethod ("StartActivity",historyjamaah.processBA,(Object)((historyjamaah.mostCurrent._donationjamaahconfirm.getObject())));
 BA.debugLineNum = 128;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
historyjamaah._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 10;BA.debugLine="Dim idSelected As String";
historyjamaah._idselected = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}