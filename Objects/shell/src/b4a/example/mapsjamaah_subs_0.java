package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mapsjamaah_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (mapsjamaah) ","mapsjamaah",14,mapsjamaah.mostCurrent.activityBA,mapsjamaah.mostCurrent,27);
if (RapidSub.canDelegate("activity_create")) return b4a.example.mapsjamaah.remoteMe.runUserSub(false, "mapsjamaah","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 27;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 29;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(268435456);
mapsjamaah.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),mapsjamaah.mostCurrent.activityBA);
 BA.debugLineNum = 30;BA.debugLine="MainScroll.Panel.LoadLayout(\"MapsJamaah\")";
Debug.ShouldStop(536870912);
mapsjamaah.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MapsJamaah")),mapsjamaah.mostCurrent.activityBA);
 BA.debugLineNum = 31;BA.debugLine="MainScroll.Panel.Height = PanelMaps.Height";
Debug.ShouldStop(1073741824);
mapsjamaah.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",mapsjamaah.mostCurrent._panelmaps.runMethod(true,"getHeight"));
 BA.debugLineNum = 32;BA.debugLine="MainScroll.Height = 100%y - MainScroll.Top";
Debug.ShouldStop(-2147483648);
mapsjamaah.mostCurrent._mainscroll.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {mapsjamaah.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),mapsjamaah.mostCurrent.activityBA),mapsjamaah.mostCurrent._mainscroll.runMethod(true,"getTop")}, "-",1, 1));
 BA.debugLineNum = 34;BA.debugLine="WebView1.LoadUrl(Main.server&\"api/maps\")";
Debug.ShouldStop(2);
mapsjamaah.mostCurrent._webview1.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(mapsjamaah.mostCurrent._main._server,RemoteObject.createImmutable("api/maps"))));
 BA.debugLineNum = 36;BA.debugLine="events.Initialize";
Debug.ShouldStop(8);
mapsjamaah.mostCurrent._events.runVoidMethod ("Initialize");
 BA.debugLineNum = 37;BA.debugLine="facilities.Initialize";
Debug.ShouldStop(16);
mapsjamaah.mostCurrent._facilities.runVoidMethod ("Initialize");
 BA.debugLineNum = 38;BA.debugLine="capacities.Initialize";
Debug.ShouldStop(32);
mapsjamaah.mostCurrent._capacities.runVoidMethod ("Initialize");
 BA.debugLineNum = 39;BA.debugLine="parking.Initialize";
Debug.ShouldStop(64);
mapsjamaah.mostCurrent._parking.runVoidMethod ("Initialize");
 BA.debugLineNum = 40;BA.debugLine="SpinCapacity.DropdownBackgroundColor = Colors.Whi";
Debug.ShouldStop(128);
mapsjamaah.mostCurrent._spincapacity.runMethod(true,"setDropdownBackgroundColor",mapsjamaah.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 41;BA.debugLine="SpinFacility.DropdownBackgroundColor = Colors.Whi";
Debug.ShouldStop(256);
mapsjamaah.mostCurrent._spinfacility.runMethod(true,"setDropdownBackgroundColor",mapsjamaah.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 42;BA.debugLine="SpinEvent.DropdownBackgroundColor = Colors.White";
Debug.ShouldStop(512);
mapsjamaah.mostCurrent._spinevent.runMethod(true,"setDropdownBackgroundColor",mapsjamaah.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 43;BA.debugLine="SpinParking.DropdownBackgroundColor = Colors.Whit";
Debug.ShouldStop(1024);
mapsjamaah.mostCurrent._spinparking.runMethod(true,"setDropdownBackgroundColor",mapsjamaah.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 44;BA.debugLine="CodeSemua.SetBackgroundTintList(EditName, Colors.";
Debug.ShouldStop(2048);
mapsjamaah.mostCurrent._codesemua.runVoidMethod ("_setbackgroundtintlist",mapsjamaah.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), mapsjamaah.mostCurrent._editname.getObject()),(Object)(mapsjamaah.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent")),(Object)(mapsjamaah.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent")));
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (mapsjamaah) ","mapsjamaah",14,mapsjamaah.mostCurrent.activityBA,mapsjamaah.mostCurrent,56);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.mapsjamaah.remoteMe.runUserSub(false, "mapsjamaah","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 56;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("Activity_Resume (mapsjamaah) ","mapsjamaah",14,mapsjamaah.mostCurrent.activityBA,mapsjamaah.mostCurrent,47);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.mapsjamaah.remoteMe.runUserSub(false, "mapsjamaah","activity_resume");
 BA.debugLineNum = 47;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="SpinCapacity.Add(\"Capacity\")";
Debug.ShouldStop(32768);
mapsjamaah.mostCurrent._spincapacity.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Capacity")));
 BA.debugLineNum = 49;BA.debugLine="SpinCapacity.Add(\"hahahah\")";
Debug.ShouldStop(65536);
mapsjamaah.mostCurrent._spincapacity.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("hahahah")));
 BA.debugLineNum = 50;BA.debugLine="SpinFacility.Add(\"Facility\")";
Debug.ShouldStop(131072);
mapsjamaah.mostCurrent._spinfacility.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Facility")));
 BA.debugLineNum = 51;BA.debugLine="SpinEvent.Add(\"Event\")";
Debug.ShouldStop(262144);
mapsjamaah.mostCurrent._spinevent.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Event")));
 BA.debugLineNum = 52;BA.debugLine="SpinParking.Add(\"Parking Area\")";
Debug.ShouldStop(524288);
mapsjamaah.mostCurrent._spinparking.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Parking Area")));
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnsearch_click() throws Exception{
try {
		Debug.PushSubsStack("btnSearch_Click (mapsjamaah) ","mapsjamaah",14,mapsjamaah.mostCurrent.activityBA,mapsjamaah.mostCurrent,61);
if (RapidSub.canDelegate("btnsearch_click")) return b4a.example.mapsjamaah.remoteMe.runUserSub(false, "mapsjamaah","btnsearch_click");
 BA.debugLineNum = 61;BA.debugLine="Sub btnSearch_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="StartActivity(QurbanJamaahConfirm)";
Debug.ShouldStop(536870912);
mapsjamaah.mostCurrent.__c.runVoidMethod ("StartActivity",mapsjamaah.processBA,(Object)((mapsjamaah.mostCurrent._qurbanjamaahconfirm.getObject())));
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
mapsjamaah.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private PanelMaps As Panel";
mapsjamaah.mostCurrent._panelmaps = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private WebView1 As WebView";
mapsjamaah.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Dim events,facilities, capacities, parking As Map";
mapsjamaah.mostCurrent._events = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
mapsjamaah.mostCurrent._facilities = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
mapsjamaah.mostCurrent._capacities = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
mapsjamaah.mostCurrent._parking = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 19;BA.debugLine="Private EditName As EditText";
mapsjamaah.mostCurrent._editname = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private SpinCapacity As Spinner";
mapsjamaah.mostCurrent._spincapacity = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private SpinEvent As Spinner";
mapsjamaah.mostCurrent._spinevent = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private SpinFacility As Spinner";
mapsjamaah.mostCurrent._spinfacility = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private SpinParking As Spinner";
mapsjamaah.mostCurrent._spinparking = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private btnSearch As Button";
mapsjamaah.mostCurrent._btnsearch = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _mywebview_pagefinished(RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("myWebView_PageFinished (mapsjamaah) ","mapsjamaah",14,mapsjamaah.mostCurrent.activityBA,mapsjamaah.mostCurrent,65);
if (RapidSub.canDelegate("mywebview_pagefinished")) return b4a.example.mapsjamaah.remoteMe.runUserSub(false, "mapsjamaah","mywebview_pagefinished", _url);
RemoteObject _obj1 = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
Debug.locals.put("Url", _url);
 BA.debugLineNum = 65;BA.debugLine="Sub myWebView_PageFinished (Url As String)";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="Dim Obj1 As Reflector";
Debug.ShouldStop(2);
_obj1 = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("Obj1", _obj1);
 BA.debugLineNum = 67;BA.debugLine="Obj1.Target=WebView1";
Debug.ShouldStop(4);
_obj1.setField ("Target",(mapsjamaah.mostCurrent._webview1.getObject()));
 BA.debugLineNum = 71;BA.debugLine="Obj1.RunMethod2(\"addJavascriptInterface\", \"myNewJ";
Debug.ShouldStop(64);
_obj1.runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("addJavascriptInterface")),(Object)(BA.ObjectToString("myNewJSMethod")),(Object)(RemoteObject.createImmutable("java.lang.String")));
 BA.debugLineNum = 72;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}