package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class poorjamaahdetail_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (poorjamaahdetail) ","poorjamaahdetail",18,poorjamaahdetail.mostCurrent.activityBA,poorjamaahdetail.mostCurrent,30);
if (RapidSub.canDelegate("activity_create")) return b4a.example.poorjamaahdetail.remoteMe.runUserSub(false, "poorjamaahdetail","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 32;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(-2147483648);
poorjamaahdetail.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),poorjamaahdetail.mostCurrent.activityBA);
 BA.debugLineNum = 33;BA.debugLine="MainScroll.Panel.LoadLayout(\"PoorJamaahDetail\")";
Debug.ShouldStop(1);
poorjamaahdetail.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("PoorJamaahDetail")),poorjamaahdetail.mostCurrent.activityBA);
 BA.debugLineNum = 34;BA.debugLine="MainScroll.Panel.Height= PanelQurban.Height";
Debug.ShouldStop(2);
poorjamaahdetail.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",poorjamaahdetail.mostCurrent._panelqurban.runMethod(true,"getHeight"));
 BA.debugLineNum = 35;BA.debugLine="MainScroll.Height =100%y - MainScroll.Top";
Debug.ShouldStop(4);
poorjamaahdetail.mostCurrent._mainscroll.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {poorjamaahdetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),poorjamaahdetail.mostCurrent.activityBA),poorjamaahdetail.mostCurrent._mainscroll.runMethod(true,"getTop")}, "-",1, 1));
 BA.debugLineNum = 37;BA.debugLine="pengurus.Initialize";
Debug.ShouldStop(16);
poorjamaahdetail.mostCurrent._pengurus.runVoidMethod ("Initialize");
 BA.debugLineNum = 38;BA.debugLine="SpinPengurus.DropdownBackgroundColor= Colors.Whit";
Debug.ShouldStop(32);
poorjamaahdetail.mostCurrent._spinpengurus.runMethod(true,"setDropdownBackgroundColor",poorjamaahdetail.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("Activity_Pause (poorjamaahdetail) ","poorjamaahdetail",18,poorjamaahdetail.mostCurrent.activityBA,poorjamaahdetail.mostCurrent,45);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.poorjamaahdetail.remoteMe.runUserSub(false, "poorjamaahdetail","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 45;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("Activity_Resume (poorjamaahdetail) ","poorjamaahdetail",18,poorjamaahdetail.mostCurrent.activityBA,poorjamaahdetail.mostCurrent,41);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.poorjamaahdetail.remoteMe.runUserSub(false, "poorjamaahdetail","activity_resume");
 BA.debugLineNum = 41;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="CodeSemua.ExecuteUrlGet(Main.server&\"api/mosque/d";
Debug.ShouldStop(512);
poorjamaahdetail.mostCurrent._codesemua.runVoidMethod ("_executeurlget",poorjamaahdetail.mostCurrent.activityBA,(Object)(RemoteObject.concat(poorjamaahdetail.mostCurrent._main._server,RemoteObject.createImmutable("api/mosque/detail?id="),poorjamaahdetail.mostCurrent._poorjamaah._id_clicked)),(Object)(BA.ObjectToString("LoadData")),(Object)(poorjamaahdetail.getObject()));
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("Button1_Click (poorjamaahdetail) ","poorjamaahdetail",18,poorjamaahdetail.mostCurrent.activityBA,poorjamaahdetail.mostCurrent,96);
if (RapidSub.canDelegate("button1_click")) return b4a.example.poorjamaahdetail.remoteMe.runUserSub(false, "poorjamaahdetail","button1_click");
 BA.debugLineNum = 96;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="CodeSemua.ExecuteUrl(Main.server&\"api/mosque/poor";
Debug.ShouldStop(1);
poorjamaahdetail.mostCurrent._codesemua.runVoidMethod ("_executeurl",poorjamaahdetail.mostCurrent.activityBA,(Object)(RemoteObject.concat(poorjamaahdetail.mostCurrent._main._server,RemoteObject.createImmutable("api/mosque/poor/store?id="),poorjamaahdetail.mostCurrent._poorjamaah._id_clicked)),(Object)(RemoteObject.concat(RemoteObject.createImmutable("jamaah="),poorjamaahdetail.mostCurrent._homejamaah._id,RemoteObject.createImmutable("&fund="),poorjamaahdetail.mostCurrent._edittotal.runMethod(true,"getText"),RemoteObject.createImmutable("&account="),poorjamaahdetail.mostCurrent._accountid,RemoteObject.createImmutable("&public="),poorjamaahdetail.mostCurrent._publicid)),(Object)(BA.ObjectToString("Store")),(Object)(poorjamaahdetail.getObject()));
 BA.debugLineNum = 98;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkguna_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("CheckGuna_CheckedChange (poorjamaahdetail) ","poorjamaahdetail",18,poorjamaahdetail.mostCurrent.activityBA,poorjamaahdetail.mostCurrent,100);
if (RapidSub.canDelegate("checkguna_checkedchange")) return b4a.example.poorjamaahdetail.remoteMe.runUserSub(false, "poorjamaahdetail","checkguna_checkedchange", _checked);
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 100;BA.debugLine="Sub CheckGuna_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(8);
 BA.debugLineNum = 101;BA.debugLine="If CheckGuna.Checked Then";
Debug.ShouldStop(16);
if (poorjamaahdetail.mostCurrent._checkguna.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 102;BA.debugLine="CheckHamba.Checked = False";
Debug.ShouldStop(32);
poorjamaahdetail.mostCurrent._checkhamba.runMethodAndSync(true,"setChecked",poorjamaahdetail.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 103;BA.debugLine="CheckGuna.Checked = True";
Debug.ShouldStop(64);
poorjamaahdetail.mostCurrent._checkguna.runMethodAndSync(true,"setChecked",poorjamaahdetail.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 104;BA.debugLine="publicId = True";
Debug.ShouldStop(128);
poorjamaahdetail.mostCurrent._publicid = BA.ObjectToString(poorjamaahdetail.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 106;BA.debugLine="CheckHamba.Checked = True";
Debug.ShouldStop(512);
poorjamaahdetail.mostCurrent._checkhamba.runMethodAndSync(true,"setChecked",poorjamaahdetail.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 107;BA.debugLine="CheckGuna.Checked = False";
Debug.ShouldStop(1024);
poorjamaahdetail.mostCurrent._checkguna.runMethodAndSync(true,"setChecked",poorjamaahdetail.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 108;BA.debugLine="publicId = False";
Debug.ShouldStop(2048);
poorjamaahdetail.mostCurrent._publicid = BA.ObjectToString(poorjamaahdetail.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkhamba_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("CheckHamba_CheckedChange (poorjamaahdetail) ","poorjamaahdetail",18,poorjamaahdetail.mostCurrent.activityBA,poorjamaahdetail.mostCurrent,112);
if (RapidSub.canDelegate("checkhamba_checkedchange")) return b4a.example.poorjamaahdetail.remoteMe.runUserSub(false, "poorjamaahdetail","checkhamba_checkedchange", _checked);
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 112;BA.debugLine="Sub CheckHamba_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 113;BA.debugLine="If CheckHamba.Checked Then";
Debug.ShouldStop(65536);
if (poorjamaahdetail.mostCurrent._checkhamba.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 114;BA.debugLine="CheckHamba.Checked = True";
Debug.ShouldStop(131072);
poorjamaahdetail.mostCurrent._checkhamba.runMethodAndSync(true,"setChecked",poorjamaahdetail.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 115;BA.debugLine="CheckGuna.Checked = False";
Debug.ShouldStop(262144);
poorjamaahdetail.mostCurrent._checkguna.runMethodAndSync(true,"setChecked",poorjamaahdetail.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 116;BA.debugLine="publicId = False";
Debug.ShouldStop(524288);
poorjamaahdetail.mostCurrent._publicid = BA.ObjectToString(poorjamaahdetail.mostCurrent.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 118;BA.debugLine="CheckHamba.Checked = False";
Debug.ShouldStop(2097152);
poorjamaahdetail.mostCurrent._checkhamba.runMethodAndSync(true,"setChecked",poorjamaahdetail.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 119;BA.debugLine="CheckGuna.Checked = True";
Debug.ShouldStop(4194304);
poorjamaahdetail.mostCurrent._checkguna.runMethodAndSync(true,"setChecked",poorjamaahdetail.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 120;BA.debugLine="publicId = True";
Debug.ShouldStop(8388608);
poorjamaahdetail.mostCurrent._publicid = BA.ObjectToString(poorjamaahdetail.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 122;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
poorjamaahdetail.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private NavbarTitle As Label";
poorjamaahdetail.mostCurrent._navbartitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private PanelQurban As Panel";
poorjamaahdetail.mostCurrent._panelqurban = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private Button1 As Button";
poorjamaahdetail.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private EditTotal As EditText";
poorjamaahdetail.mostCurrent._edittotal = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private SpinPengurus As Spinner";
poorjamaahdetail.mostCurrent._spinpengurus = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private CheckGuna As CheckBox";
poorjamaahdetail.mostCurrent._checkguna = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private CheckHamba As CheckBox";
poorjamaahdetail.mostCurrent._checkhamba = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Dim pengurus As Map";
poorjamaahdetail.mostCurrent._pengurus = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 26;BA.debugLine="Dim accountId, publicId, noTransaction As String";
poorjamaahdetail.mostCurrent._accountid = RemoteObject.createImmutable("");
poorjamaahdetail.mostCurrent._publicid = RemoteObject.createImmutable("");
poorjamaahdetail.mostCurrent._notransaction = RemoteObject.createImmutable("");
 //BA.debugLineNum = 27;BA.debugLine="Dim account As List : account.Initialize";
poorjamaahdetail.mostCurrent._account = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 27;BA.debugLine="Dim account As List : account.Initialize";
poorjamaahdetail.mostCurrent._account.runVoidMethod ("Initialize");
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (poorjamaahdetail) ","poorjamaahdetail",18,poorjamaahdetail.mostCurrent.activityBA,poorjamaahdetail.mostCurrent,49);
if (RapidSub.canDelegate("jobdone")) return b4a.example.poorjamaahdetail.remoteMe.runUserSub(false, "poorjamaahdetail","jobdone", _job);
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mosque = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
RemoteObject _accountdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 49;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="If Job.Success = True Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success"),poorjamaahdetail.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 52;BA.debugLine="If Job.JobName = \"Store\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_jobname"),BA.ObjectToString("Store"))) { 
 BA.debugLineNum = 54;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(2097152);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 55;BA.debugLine="parser.Initialize(Job.GetString)";
Debug.ShouldStop(4194304);
_parser.runVoidMethod ("Initialize",(Object)(_job.runMethod(true,"_getstring")));
 BA.debugLineNum = 56;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(8388608);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 58;BA.debugLine="noTransaction = root.Get(\"trx\")";
Debug.ShouldStop(33554432);
poorjamaahdetail.mostCurrent._notransaction = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("trx")))));
 BA.debugLineNum = 59;BA.debugLine="Msgbox(\"Please check payment infromation for tr";
Debug.ShouldStop(67108864);
poorjamaahdetail.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Please check payment infromation for transaction #"),poorjamaahdetail.mostCurrent._notransaction))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Transaction successful!"))),poorjamaahdetail.mostCurrent.activityBA);
 BA.debugLineNum = 60;BA.debugLine="StartActivity(HistoryJamaah)";
Debug.ShouldStop(134217728);
poorjamaahdetail.mostCurrent.__c.runVoidMethod ("StartActivity",poorjamaahdetail.processBA,(Object)((poorjamaahdetail.mostCurrent._historyjamaah.getObject())));
 }else {
 BA.debugLineNum = 64;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(-2147483648);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 65;BA.debugLine="parser.Initialize(Job.GetString)";
Debug.ShouldStop(1);
_parser.runVoidMethod ("Initialize",(Object)(_job.runMethod(true,"_getstring")));
 BA.debugLineNum = 66;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(2);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 67;BA.debugLine="Dim mosque As Map";
Debug.ShouldStop(4);
_mosque = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mosque", _mosque);
 BA.debugLineNum = 68;BA.debugLine="mosque = root.Get(\"mosque\")";
Debug.ShouldStop(8);
_mosque.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("mosque")))));
 BA.debugLineNum = 70;BA.debugLine="NavbarTitle.Text = \"Poor People \"&mosque.Get(\"n";
Debug.ShouldStop(32);
poorjamaahdetail.mostCurrent._navbartitle.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Poor People "),_mosque.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))))));
 BA.debugLineNum = 71;BA.debugLine="NavbarTitle.TextSize = 20";
Debug.ShouldStop(64);
poorjamaahdetail.mostCurrent._navbartitle.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 73;BA.debugLine="account = root.Get(\"account\")";
Debug.ShouldStop(256);
poorjamaahdetail.mostCurrent._account.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("account")))));
 BA.debugLineNum = 75;BA.debugLine="If account.Size = 0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",poorjamaahdetail.mostCurrent._account.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 76;BA.debugLine="SpinPengurus.Add(\"Belum Ada Akun Rekening!\")";
Debug.ShouldStop(2048);
poorjamaahdetail.mostCurrent._spinpengurus.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Belum Ada Akun Rekening!")));
 }else {
 BA.debugLineNum = 78;BA.debugLine="SpinPengurus.Add(\"Pilih Nomor Rekeing Pengirim";
Debug.ShouldStop(8192);
poorjamaahdetail.mostCurrent._spinpengurus.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Pilih Nomor Rekeing Pengiriman Donasi")));
 BA.debugLineNum = 79;BA.debugLine="For i=0 To account.Size-1";
Debug.ShouldStop(16384);
{
final int step22 = 1;
final int limit22 = RemoteObject.solve(new RemoteObject[] {poorjamaahdetail.mostCurrent._account.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step22 > 0 && _i <= limit22) || (step22 < 0 && _i >= limit22) ;_i = ((int)(0 + _i + step22))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 80;BA.debugLine="Dim accountData As Map";
Debug.ShouldStop(32768);
_accountdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("accountData", _accountdata);
 BA.debugLineNum = 81;BA.debugLine="accountData = account.Get(i)";
Debug.ShouldStop(65536);
_accountdata.setObject(poorjamaahdetail.mostCurrent._account.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 82;BA.debugLine="SpinPengurus.Add(accountData.Get(\"owner\")&\" -";
Debug.ShouldStop(131072);
poorjamaahdetail.mostCurrent._spinpengurus.runVoidMethod ("Add",(Object)(RemoteObject.concat(_accountdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("owner")))),RemoteObject.createImmutable(" - "),_accountdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("account_number")))),RemoteObject.createImmutable(" ("),_accountdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("bank")))),RemoteObject.createImmutable(")"))));
 }
}Debug.locals.put("i", _i);
;
 };
 };
 }else {
 BA.debugLineNum = 89;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(16777216);
poorjamaahdetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage"))));
 BA.debugLineNum = 90;BA.debugLine="ToastMessageShow(\"Error: \" & Job.ErrorMessage, T";
Debug.ShouldStop(33554432);
poorjamaahdetail.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage")))),(Object)(poorjamaahdetail.mostCurrent.__c.getField(true,"True")));
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
public static RemoteObject  _spinpengurus_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SpinPengurus_ItemClick (poorjamaahdetail) ","poorjamaahdetail",18,poorjamaahdetail.mostCurrent.activityBA,poorjamaahdetail.mostCurrent,124);
if (RapidSub.canDelegate("spinpengurus_itemclick")) return b4a.example.poorjamaahdetail.remoteMe.runUserSub(false, "poorjamaahdetail","spinpengurus_itemclick", _position, _value);
int _i = 0;
RemoteObject _accountdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 124;BA.debugLine="Sub SpinPengurus_ItemClick (Position As Int, Value";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 125;BA.debugLine="For i=0 To account.Size-1";
Debug.ShouldStop(268435456);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {poorjamaahdetail.mostCurrent._account.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 126;BA.debugLine="If SpinPengurus.SelectedIndex = i Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",poorjamaahdetail.mostCurrent._spinpengurus.runMethod(true,"getSelectedIndex"),BA.numberCast(double.class, _i))) { 
 BA.debugLineNum = 127;BA.debugLine="Dim accountData As Map";
Debug.ShouldStop(1073741824);
_accountdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("accountData", _accountdata);
 BA.debugLineNum = 128;BA.debugLine="accountData = account.Get(i)";
Debug.ShouldStop(-2147483648);
_accountdata.setObject(poorjamaahdetail.mostCurrent._account.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 129;BA.debugLine="accountId = accountData.Get(\"id\")";
Debug.ShouldStop(1);
poorjamaahdetail.mostCurrent._accountid = BA.ObjectToString(_accountdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 132;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}