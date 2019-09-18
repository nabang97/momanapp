package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class stewardshipdonationdetail_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (stewardshipdonationdetail) ","stewardshipdonationdetail",7,stewardshipdonationdetail.mostCurrent.activityBA,stewardshipdonationdetail.mostCurrent,25);
if (RapidSub.canDelegate("activity_create")) return b4a.example.stewardshipdonationdetail.remoteMe.runUserSub(false, "stewardshipdonationdetail","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 25;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 28;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(134217728);
stewardshipdonationdetail.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),stewardshipdonationdetail.mostCurrent.activityBA);
 BA.debugLineNum = 29;BA.debugLine="MainScroll.Panel.LoadLayout(\"DonationJamaahDetail";
Debug.ShouldStop(268435456);
stewardshipdonationdetail.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("DonationJamaahDetail")),stewardshipdonationdetail.mostCurrent.activityBA);
 BA.debugLineNum = 30;BA.debugLine="MainScroll.Panel.Height= PanelQurban.Height";
Debug.ShouldStop(536870912);
stewardshipdonationdetail.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",stewardshipdonationdetail.mostCurrent._panelqurban.runMethod(true,"getHeight"));
 BA.debugLineNum = 31;BA.debugLine="MainScroll.Height =100%y - MainScroll.Top";
Debug.ShouldStop(1073741824);
stewardshipdonationdetail.mostCurrent._mainscroll.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {stewardshipdonationdetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),stewardshipdonationdetail.mostCurrent.activityBA),stewardshipdonationdetail.mostCurrent._mainscroll.runMethod(true,"getTop")}, "-",1, 1));
 BA.debugLineNum = 32;BA.debugLine="NavbarTitle.Text = \"Development\"";
Debug.ShouldStop(-2147483648);
stewardshipdonationdetail.mostCurrent._navbartitle.runMethod(true,"setText",BA.ObjectToCharSequence("Development"));
 BA.debugLineNum = 33;BA.debugLine="CheckGuna.Text = \"Public\"";
Debug.ShouldStop(1);
stewardshipdonationdetail.mostCurrent._checkguna.runMethod(true,"setText",BA.ObjectToCharSequence("Public"));
 BA.debugLineNum = 34;BA.debugLine="CheckHamba.Text = \"Private\"";
Debug.ShouldStop(2);
stewardshipdonationdetail.mostCurrent._checkhamba.runMethod(true,"setText",BA.ObjectToCharSequence("Private"));
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (stewardshipdonationdetail) ","stewardshipdonationdetail",7,stewardshipdonationdetail.mostCurrent.activityBA,stewardshipdonationdetail.mostCurrent,43);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.stewardshipdonationdetail.remoteMe.runUserSub(false, "stewardshipdonationdetail","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 43;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1024);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (stewardshipdonationdetail) ","stewardshipdonationdetail",7,stewardshipdonationdetail.mostCurrent.activityBA,stewardshipdonationdetail.mostCurrent,37);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.stewardshipdonationdetail.remoteMe.runUserSub(false, "stewardshipdonationdetail","activity_resume");
 BA.debugLineNum = 37;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="spinAccount.Initialize";
Debug.ShouldStop(32);
stewardshipdonationdetail.mostCurrent._spinaccount.runVoidMethod ("Initialize");
 BA.debugLineNum = 39;BA.debugLine="spinAccount.Clear";
Debug.ShouldStop(64);
stewardshipdonationdetail.mostCurrent._spinaccount.runVoidMethod ("Clear");
 BA.debugLineNum = 40;BA.debugLine="CodeSemua.ExecuteUrlGet(Main.server&\"api/donation";
Debug.ShouldStop(128);
stewardshipdonationdetail.mostCurrent._codesemua.runVoidMethod ("_executeurlget",stewardshipdonationdetail.mostCurrent.activityBA,(Object)(RemoteObject.concat(stewardshipdonationdetail.mostCurrent._main._server,RemoteObject.createImmutable("api/donation/detail?id="),stewardshipdonationdetail.mostCurrent._orphansjamaah._id_clicked)),(Object)(BA.ObjectToString("LoadData")),(Object)(stewardshipdonationdetail.getObject()));
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("Button1_Click (stewardshipdonationdetail) ","stewardshipdonationdetail",7,stewardshipdonationdetail.mostCurrent.activityBA,stewardshipdonationdetail.mostCurrent,95);
if (RapidSub.canDelegate("button1_click")) return b4a.example.stewardshipdonationdetail.remoteMe.runUserSub(false, "stewardshipdonationdetail","button1_click");
 BA.debugLineNum = 95;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 96;BA.debugLine="StartActivity(DonationJamaahConfirm)";
Debug.ShouldStop(-2147483648);
stewardshipdonationdetail.mostCurrent.__c.runVoidMethod ("StartActivity",stewardshipdonationdetail.processBA,(Object)((stewardshipdonationdetail.mostCurrent._donationjamaahconfirm.getObject())));
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
stewardshipdonationdetail.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private PanelQurban As Panel";
stewardshipdonationdetail.mostCurrent._panelqurban = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private Button1 As Button";
stewardshipdonationdetail.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private NavbarTitle As Label";
stewardshipdonationdetail.mostCurrent._navbartitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Dim spinAccount As Map";
stewardshipdonationdetail.mostCurrent._spinaccount = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 20;BA.debugLine="Private SpinPengurus As Spinner";
stewardshipdonationdetail.mostCurrent._spinpengurus = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private CheckGuna As CheckBox";
stewardshipdonationdetail.mostCurrent._checkguna = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private CheckHamba As CheckBox";
stewardshipdonationdetail.mostCurrent._checkhamba = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (stewardshipdonationdetail) ","stewardshipdonationdetail",7,stewardshipdonationdetail.mostCurrent.activityBA,stewardshipdonationdetail.mostCurrent,47);
if (RapidSub.canDelegate("jobdone")) return b4a.example.stewardshipdonationdetail.remoteMe.runUserSub(false, "stewardshipdonationdetail","jobdone", _job);
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _project = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _worship_place_id = RemoteObject.createImmutable("");
RemoteObject _worship_id = RemoteObject.createImmutable("");
RemoteObject _fund = RemoteObject.createImmutable("");
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _description = RemoteObject.createImmutable("");
RemoteObject _progress = RemoteObject.createImmutable("");
RemoteObject _id = RemoteObject.createImmutable("");
RemoteObject _worship = RemoteObject.createImmutable("");
RemoteObject _account = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colaccount = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _whatsapp = RemoteObject.createImmutable("");
RemoteObject _owner = RemoteObject.createImmutable("");
RemoteObject _account_number = RemoteObject.createImmutable("");
RemoteObject _bank = RemoteObject.createImmutable("");
RemoteObject _phone = RemoteObject.createImmutable("");
RemoteObject _stewardship_id = RemoteObject.createImmutable("");
RemoteObject _username = RemoteObject.createImmutable("");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 47;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \" &";
Debug.ShouldStop(32768);
stewardshipdonationdetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("JobName = "),_job.getField(true,"_jobname"),RemoteObject.createImmutable(", Success = "),_job.getField(true,"_success"))));
 BA.debugLineNum = 49;BA.debugLine="If Job.Success = True Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success"),stewardshipdonationdetail.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 50;BA.debugLine="Dim res As String";
Debug.ShouldStop(131072);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 51;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
Debug.ShouldStop(262144);
_res = _job.runMethod(true,"_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 52;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
Debug.ShouldStop(524288);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 53;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(1048576);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 54;BA.debugLine="Log(\"Response from server :\"& res)";
Debug.ShouldStop(2097152);
stewardshipdonationdetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Response from server :"),_res)));
 BA.debugLineNum = 55;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(4194304);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname"),BA.ObjectToString("LoadData"))) {
case 0: {
 BA.debugLineNum = 57;BA.debugLine="Try";
Debug.ShouldStop(16777216);
try { BA.debugLineNum = 58;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(33554432);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 59;BA.debugLine="Dim project As Map = root.Get(\"project\")";
Debug.ShouldStop(67108864);
_project = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_project.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("project")))));Debug.locals.put("project", _project);
 BA.debugLineNum = 60;BA.debugLine="Dim worship_place_id As String = project.Get(";
Debug.ShouldStop(134217728);
_worship_place_id = BA.ObjectToString(_project.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("worship_place_id")))));Debug.locals.put("worship_place_id", _worship_place_id);Debug.locals.put("worship_place_id", _worship_place_id);
 BA.debugLineNum = 61;BA.debugLine="Dim worship_id As String = project.Get(\"worsh";
Debug.ShouldStop(268435456);
_worship_id = BA.ObjectToString(_project.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("worship_id")))));Debug.locals.put("worship_id", _worship_id);Debug.locals.put("worship_id", _worship_id);
 BA.debugLineNum = 62;BA.debugLine="Dim fund As String = project.Get(\"fund\")";
Debug.ShouldStop(536870912);
_fund = BA.ObjectToString(_project.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fund")))));Debug.locals.put("fund", _fund);Debug.locals.put("fund", _fund);
 BA.debugLineNum = 63;BA.debugLine="Dim name As String = project.Get(\"name\")";
Debug.ShouldStop(1073741824);
_name = BA.ObjectToString(_project.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))));Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 64;BA.debugLine="Dim description As String = project.Get(\"desc";
Debug.ShouldStop(-2147483648);
_description = BA.ObjectToString(_project.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("description")))));Debug.locals.put("description", _description);Debug.locals.put("description", _description);
 BA.debugLineNum = 65;BA.debugLine="Dim progress As String = project.Get(\"progres";
Debug.ShouldStop(1);
_progress = BA.ObjectToString(_project.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("progress")))));Debug.locals.put("progress", _progress);Debug.locals.put("progress", _progress);
 BA.debugLineNum = 66;BA.debugLine="Dim id As String = project.Get(\"id\")";
Debug.ShouldStop(2);
_id = BA.ObjectToString(_project.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 67;BA.debugLine="Dim worship As String = project.Get(\"worship\"";
Debug.ShouldStop(4);
_worship = BA.ObjectToString(_project.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("worship")))));Debug.locals.put("worship", _worship);Debug.locals.put("worship", _worship);
 BA.debugLineNum = 68;BA.debugLine="Dim account As List = root.Get(\"account\")";
Debug.ShouldStop(8);
_account = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_account.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("account")))));Debug.locals.put("account", _account);
 BA.debugLineNum = 69;BA.debugLine="For Each colaccount As Map In account";
Debug.ShouldStop(16);
_colaccount = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group22 = _account;
final int groupLen22 = group22.runMethod(true,"getSize").<Integer>get()
;int index22 = 0;
;
for (; index22 < groupLen22;index22++){
_colaccount.setObject(group22.runMethod(false,"Get",index22));
Debug.locals.put("colaccount", _colaccount);
 BA.debugLineNum = 70;BA.debugLine="Dim whatsapp As String = colaccount.Get(\"wha";
Debug.ShouldStop(32);
_whatsapp = BA.ObjectToString(_colaccount.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("whatsapp")))));Debug.locals.put("whatsapp", _whatsapp);Debug.locals.put("whatsapp", _whatsapp);
 BA.debugLineNum = 71;BA.debugLine="Dim owner As String = colaccount.Get(\"owner\"";
Debug.ShouldStop(64);
_owner = BA.ObjectToString(_colaccount.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("owner")))));Debug.locals.put("owner", _owner);Debug.locals.put("owner", _owner);
 BA.debugLineNum = 72;BA.debugLine="Dim account_number As String = colaccount.Ge";
Debug.ShouldStop(128);
_account_number = BA.ObjectToString(_colaccount.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("account_number")))));Debug.locals.put("account_number", _account_number);Debug.locals.put("account_number", _account_number);
 BA.debugLineNum = 73;BA.debugLine="Dim bank As String = colaccount.Get(\"bank\")";
Debug.ShouldStop(256);
_bank = BA.ObjectToString(_colaccount.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("bank")))));Debug.locals.put("bank", _bank);Debug.locals.put("bank", _bank);
 BA.debugLineNum = 74;BA.debugLine="Dim phone As String = colaccount.Get(\"phone\"";
Debug.ShouldStop(512);
_phone = BA.ObjectToString(_colaccount.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("phone")))));Debug.locals.put("phone", _phone);Debug.locals.put("phone", _phone);
 BA.debugLineNum = 75;BA.debugLine="Dim stewardship_id As String = colaccount.Ge";
Debug.ShouldStop(1024);
_stewardship_id = BA.ObjectToString(_colaccount.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("stewardship_id")))));Debug.locals.put("stewardship_id", _stewardship_id);Debug.locals.put("stewardship_id", _stewardship_id);
 BA.debugLineNum = 76;BA.debugLine="Dim id As String = colaccount.Get(\"id\")";
Debug.ShouldStop(2048);
_id = BA.ObjectToString(_colaccount.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 77;BA.debugLine="Dim username As String = colaccount.Get(\"use";
Debug.ShouldStop(4096);
_username = BA.ObjectToString(_colaccount.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username")))));Debug.locals.put("username", _username);Debug.locals.put("username", _username);
 BA.debugLineNum = 78;BA.debugLine="Log(\"Owner: \"&owner)";
Debug.ShouldStop(8192);
stewardshipdonationdetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Owner: "),_owner)));
 BA.debugLineNum = 79;BA.debugLine="SpinPengurus.Add(owner)";
Debug.ShouldStop(16384);
stewardshipdonationdetail.mostCurrent._spinpengurus.runVoidMethod ("Add",(Object)(_owner));
 BA.debugLineNum = 80;BA.debugLine="spinAccount.Put(id,owner)";
Debug.ShouldStop(32768);
stewardshipdonationdetail.mostCurrent._spinaccount.runVoidMethod ("Put",(Object)((_id)),(Object)((_owner)));
 }
}Debug.locals.put("colaccount", _colaccount);
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e36) {
			BA.rdebugUtils.runVoidMethod("setLastException",stewardshipdonationdetail.processBA, e36.toString()); BA.debugLineNum = 84;BA.debugLine="Log(LastException)";
Debug.ShouldStop(524288);
stewardshipdonationdetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(stewardshipdonationdetail.mostCurrent.__c.runMethod(false,"LastException",stewardshipdonationdetail.mostCurrent.activityBA))));
 BA.debugLineNum = 85;BA.debugLine="Msgbox(\"Wrong username or password\",\"Login Fa";
Debug.ShouldStop(1048576);
stewardshipdonationdetail.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Wrong username or password")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Login Failed"))),stewardshipdonationdetail.mostCurrent.activityBA);
 };
 break; }
}
;
 }else {
 BA.debugLineNum = 89;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(16777216);
stewardshipdonationdetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage"))));
 BA.debugLineNum = 90;BA.debugLine="ToastMessageShow(\"Error: \" & Job.ErrorMessage, T";
Debug.ShouldStop(33554432);
stewardshipdonationdetail.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage")))),(Object)(stewardshipdonationdetail.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 92;BA.debugLine="Job.Release";
Debug.ShouldStop(134217728);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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