package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class starter_subs_0 {


public static RemoteObject  _activityispaused() throws Exception{
try {
		Debug.PushSubsStack("ActivityIsPaused (starter) ","starter",4,starter.processBA,starter.mostCurrent,78);
if (RapidSub.canDelegate("activityispaused")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","activityispaused");
 BA.debugLineNum = 78;BA.debugLine="Sub ActivityIsPaused";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="tasks.Clear";
Debug.ShouldStop(16384);
starter._tasks.runVoidMethod ("Clear");
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (starter) ","starter",4,starter.processBA,starter.mostCurrent,32);
if (RapidSub.canDelegate("application_error")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","application_error", _error, _stacktrace);
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 32;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="Return True";
Debug.ShouldStop(1);
Debug.CheckDeviceExceptions();if (true) return starter.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _download(RemoteObject _imageviewsmap) throws Exception{
try {
		Debug.PushSubsStack("Download (starter) ","starter",4,starter.processBA,starter.mostCurrent,42);
if (RapidSub.canDelegate("download")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","download", _imageviewsmap);
int _i = 0;
RemoteObject _link = RemoteObject.createImmutable("");
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _j = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
Debug.locals.put("ImageViewsMap", _imageviewsmap);
 BA.debugLineNum = 42;BA.debugLine="Sub Download (ImageViewsMap As Map)";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="For i = 0 To ImageViewsMap.Size - 1";
Debug.ShouldStop(1024);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {_imageviewsmap.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 44;BA.debugLine="tasks.Put(ImageViewsMap.GetKeyAt(i), ImageViewsM";
Debug.ShouldStop(2048);
starter._tasks.runVoidMethod ("Put",(Object)(_imageviewsmap.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i)))),(Object)(_imageviewsmap.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i)))));
 BA.debugLineNum = 45;BA.debugLine="Dim link As String = ImageViewsMap.GetValueAt(i)";
Debug.ShouldStop(4096);
_link = BA.ObjectToString(_imageviewsmap.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("link", _link);Debug.locals.put("link", _link);
 BA.debugLineNum = 46;BA.debugLine="If cache.ContainsKey(link) Then";
Debug.ShouldStop(8192);
if (starter._cache.runMethod(true,"ContainsKey",(Object)((_link))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 47;BA.debugLine="Dim iv As ImageView = ImageViewsMap.GetKeyAt(i)";
Debug.ShouldStop(16384);
_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
_iv.setObject(_imageviewsmap.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("iv", _iv);
 BA.debugLineNum = 48;BA.debugLine="iv.SetBackgroundImage(cache.Get(link))";
Debug.ShouldStop(32768);
_iv.runVoidMethod ("SetBackgroundImageNew",(Object)((starter._cache.runMethod(false,"Get",(Object)((_link))))));
 }else 
{ BA.debugLineNum = 49;BA.debugLine="Else If ongoingTasks.ContainsKey(link) = False T";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",starter._ongoingtasks.runMethod(true,"ContainsKey",(Object)((_link))),starter.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 50;BA.debugLine="ongoingTasks.Put(link, \"\")";
Debug.ShouldStop(131072);
starter._ongoingtasks.runVoidMethod ("Put",(Object)((_link)),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 51;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(262144);
_j = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 52;BA.debugLine="j.Initialize(link, Me)";
Debug.ShouldStop(524288);
_j.runVoidMethod ("_initialize",starter.processBA,(Object)(_link),(Object)(starter.getObject()));
 BA.debugLineNum = 53;BA.debugLine="j.Download(link)";
Debug.ShouldStop(1048576);
_j.runVoidMethod ("_download",(Object)(_link));
 }}
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (starter) ","starter",4,starter.processBA,starter.mostCurrent,58);
if (RapidSub.canDelegate("jobdone")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","jobdone", _job);
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
int _i = 0;
RemoteObject _link = RemoteObject.createImmutable("");
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 58;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 59;BA.debugLine="ongoingTasks.Remove(Job.JobName)";
Debug.ShouldStop(67108864);
starter._ongoingtasks.runVoidMethod ("Remove",(Object)((_job.getField(true,"_jobname"))));
 BA.debugLineNum = 60;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(134217728);
if (_job.getField(true,"_success").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 61;BA.debugLine="Dim bmp As Bitmap = Job.GetBitmap";
Debug.ShouldStop(268435456);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
_bmp = _job.runMethod(false,"_getbitmap");Debug.locals.put("bmp", _bmp);Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 62;BA.debugLine="cache.Put(Job.JobName, bmp)";
Debug.ShouldStop(536870912);
starter._cache.runVoidMethod ("Put",(Object)((_job.getField(true,"_jobname"))),(Object)((_bmp.getObject())));
 BA.debugLineNum = 63;BA.debugLine="If tasks.IsInitialized Then";
Debug.ShouldStop(1073741824);
if (starter._tasks.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 64;BA.debugLine="For i = 0 To tasks.Size - 1";
Debug.ShouldStop(-2147483648);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {starter._tasks.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 65;BA.debugLine="Dim link As String = tasks.GetValueAt(i)";
Debug.ShouldStop(1);
_link = BA.ObjectToString(starter._tasks.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("link", _link);Debug.locals.put("link", _link);
 BA.debugLineNum = 66;BA.debugLine="If link = Job.JobName Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_link,_job.getField(true,"_jobname"))) { 
 BA.debugLineNum = 67;BA.debugLine="Dim iv As ImageView = tasks.GetKeyAt(i)";
Debug.ShouldStop(4);
_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
_iv.setObject(starter._tasks.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("iv", _iv);
 BA.debugLineNum = 68;BA.debugLine="iv.SetBackgroundImage(bmp)";
Debug.ShouldStop(8);
_iv.runVoidMethod ("SetBackgroundImageNew",(Object)((_bmp.getObject())));
 };
 }
}Debug.locals.put("i", _i);
;
 };
 }else {
 BA.debugLineNum = 73;BA.debugLine="Log(\"Error downloading image: \" & Job.JobName &";
Debug.ShouldStop(256);
starter.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error downloading image: "),_job.getField(true,"_jobname"),starter.mostCurrent.__c.getField(true,"CRLF"),_job.getField(true,"_errormessage"))));
 };
 BA.debugLineNum = 75;BA.debugLine="Job.Release";
Debug.ShouldStop(1024);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
 //BA.debugLineNum = 9;BA.debugLine="Private cache As Map";
starter._cache = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 10;BA.debugLine="Private tasks As Map";
starter._tasks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 11;BA.debugLine="Private ongoingTasks As Map";
starter._ongoingtasks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (starter) ","starter",4,starter.processBA,starter.mostCurrent,14);
if (RapidSub.canDelegate("service_create")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","service_create");
 BA.debugLineNum = 14;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(8192);
 BA.debugLineNum = 17;BA.debugLine="tasks.Initialize";
Debug.ShouldStop(65536);
starter._tasks.runVoidMethod ("Initialize");
 BA.debugLineNum = 18;BA.debugLine="cache.Initialize";
Debug.ShouldStop(131072);
starter._cache.runVoidMethod ("Initialize");
 BA.debugLineNum = 19;BA.debugLine="ongoingTasks.Initialize";
Debug.ShouldStop(262144);
starter._ongoingtasks.runVoidMethod ("Initialize");
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_destroy() throws Exception{
try {
		Debug.PushSubsStack("Service_Destroy (starter) ","starter",4,starter.processBA,starter.mostCurrent,36);
if (RapidSub.canDelegate("service_destroy")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","service_destroy");
 BA.debugLineNum = 36;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(8);
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_start(RemoteObject _startingintent) throws Exception{
try {
		Debug.PushSubsStack("Service_Start (starter) ","starter",4,starter.processBA,starter.mostCurrent,22);
if (RapidSub.canDelegate("service_start")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","service_start", _startingintent);
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 22;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_taskremoved() throws Exception{
try {
		Debug.PushSubsStack("Service_TaskRemoved (starter) ","starter",4,starter.processBA,starter.mostCurrent,27);
if (RapidSub.canDelegate("service_taskremoved")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","service_taskremoved");
 BA.debugLineNum = 27;BA.debugLine="Sub Service_TaskRemoved";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}