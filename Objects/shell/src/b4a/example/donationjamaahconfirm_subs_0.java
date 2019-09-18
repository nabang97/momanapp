package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class donationjamaahconfirm_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (donationjamaahconfirm) ","donationjamaahconfirm",9,donationjamaahconfirm.mostCurrent.activityBA,donationjamaahconfirm.mostCurrent,20);
if (RapidSub.canDelegate("activity_create")) return b4a.example.donationjamaahconfirm.remoteMe.runUserSub(false, "donationjamaahconfirm","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 20;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 22;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(2097152);
donationjamaahconfirm.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),donationjamaahconfirm.mostCurrent.activityBA);
 BA.debugLineNum = 23;BA.debugLine="MainScroll.Panel.LoadLayout(\"ConfirmationDonation";
Debug.ShouldStop(4194304);
donationjamaahconfirm.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ConfirmationDonationJamaah")),donationjamaahconfirm.mostCurrent.activityBA);
 BA.debugLineNum = 24;BA.debugLine="MainScroll.Panel.Height= PanelQurban.Height";
Debug.ShouldStop(8388608);
donationjamaahconfirm.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",donationjamaahconfirm.mostCurrent._panelqurban.runMethod(true,"getHeight"));
 BA.debugLineNum = 25;BA.debugLine="MainScroll.Height = 100%y - MainScroll.Top";
Debug.ShouldStop(16777216);
donationjamaahconfirm.mostCurrent._mainscroll.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {donationjamaahconfirm.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),donationjamaahconfirm.mostCurrent.activityBA),donationjamaahconfirm.mostCurrent._mainscroll.runMethod(true,"getTop")}, "-",1, 1));
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("Activity_Pause (donationjamaahconfirm) ","donationjamaahconfirm",9,donationjamaahconfirm.mostCurrent.activityBA,donationjamaahconfirm.mostCurrent,32);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.donationjamaahconfirm.remoteMe.runUserSub(false, "donationjamaahconfirm","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 32;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("Activity_Resume (donationjamaahconfirm) ","donationjamaahconfirm",9,donationjamaahconfirm.mostCurrent.activityBA,donationjamaahconfirm.mostCurrent,28);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.donationjamaahconfirm.remoteMe.runUserSub(false, "donationjamaahconfirm","activity_resume");
 BA.debugLineNum = 28;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
donationjamaahconfirm.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private PanelQurban As Panel";
donationjamaahconfirm.mostCurrent._panelqurban = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private BtnConfirm As Button";
donationjamaahconfirm.mostCurrent._btnconfirm = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}