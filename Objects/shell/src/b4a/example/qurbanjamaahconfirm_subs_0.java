package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class qurbanjamaahconfirm_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (qurbanjamaahconfirm) ","qurbanjamaahconfirm",11,qurbanjamaahconfirm.mostCurrent.activityBA,qurbanjamaahconfirm.mostCurrent,21);
if (RapidSub.canDelegate("activity_create")) return b4a.example.qurbanjamaahconfirm.remoteMe.runUserSub(false, "qurbanjamaahconfirm","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 21;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 23;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(4194304);
qurbanjamaahconfirm.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),qurbanjamaahconfirm.mostCurrent.activityBA);
 BA.debugLineNum = 24;BA.debugLine="MainScroll.Panel.LoadLayout(\"ConfirmationQurbanJa";
Debug.ShouldStop(8388608);
qurbanjamaahconfirm.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ConfirmationQurbanJamaah")),qurbanjamaahconfirm.mostCurrent.activityBA);
 BA.debugLineNum = 25;BA.debugLine="MainScroll.Panel.Height= PanelQurban.Height";
Debug.ShouldStop(16777216);
qurbanjamaahconfirm.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",qurbanjamaahconfirm.mostCurrent._panelqurban.runMethod(true,"getHeight"));
 BA.debugLineNum = 26;BA.debugLine="MainScroll.Height = 100%y - MainScroll.Top";
Debug.ShouldStop(33554432);
qurbanjamaahconfirm.mostCurrent._mainscroll.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {qurbanjamaahconfirm.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),qurbanjamaahconfirm.mostCurrent.activityBA),qurbanjamaahconfirm.mostCurrent._mainscroll.runMethod(true,"getTop")}, "-",1, 1));
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("Activity_Pause (qurbanjamaahconfirm) ","qurbanjamaahconfirm",11,qurbanjamaahconfirm.mostCurrent.activityBA,qurbanjamaahconfirm.mostCurrent,33);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.qurbanjamaahconfirm.remoteMe.runUserSub(false, "qurbanjamaahconfirm","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 33;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1);
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("Activity_Resume (qurbanjamaahconfirm) ","qurbanjamaahconfirm",11,qurbanjamaahconfirm.mostCurrent.activityBA,qurbanjamaahconfirm.mostCurrent,29);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.qurbanjamaahconfirm.remoteMe.runUserSub(false, "qurbanjamaahconfirm","activity_resume");
 BA.debugLineNum = 29;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnconfirm_click() throws Exception{
try {
		Debug.PushSubsStack("BtnConfirm_Click (qurbanjamaahconfirm) ","qurbanjamaahconfirm",11,qurbanjamaahconfirm.mostCurrent.activityBA,qurbanjamaahconfirm.mostCurrent,38);
if (RapidSub.canDelegate("btnconfirm_click")) return b4a.example.qurbanjamaahconfirm.remoteMe.runUserSub(false, "qurbanjamaahconfirm","btnconfirm_click");
 BA.debugLineNum = 38;BA.debugLine="Sub BtnConfirm_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="StartActivity(QurbanJamaahDetail)";
Debug.ShouldStop(64);
qurbanjamaahconfirm.mostCurrent.__c.runVoidMethod ("StartActivity",qurbanjamaahconfirm.processBA,(Object)((qurbanjamaahconfirm.mostCurrent._qurbanjamaahdetail.getObject())));
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 15;BA.debugLine="Private MainScroll As ScrollView";
qurbanjamaahconfirm.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private PanelQurban As Panel";
qurbanjamaahconfirm.mostCurrent._panelqurban = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private BtnConfirm As Button";
qurbanjamaahconfirm.mostCurrent._btnconfirm = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}