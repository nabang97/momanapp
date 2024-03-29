
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class mapsjamaah implements IRemote{
	public static mapsjamaah mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public mapsjamaah() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("mapsjamaah"), "b4a.example.mapsjamaah");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, mapsjamaah.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _mainscroll = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _panelmaps = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _webview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.WebViewWrapper");
public static RemoteObject _events = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _facilities = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _capacities = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _parking = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _editname = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _spincapacity = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _spinevent = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _spinfacility = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _spinparking = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _btnsearch = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static b4a.example.main _main = null;
public static b4a.example.homejamaah _homejamaah = null;
public static b4a.example.orphansjamaahdetail _orphansjamaahdetail = null;
public static b4a.example.historyjamaah _historyjamaah = null;
public static b4a.example.starter _starter = null;
public static b4a.example.donationjamaah _donationjamaah = null;
public static b4a.example.qurbanjamaah _qurbanjamaah = null;
public static b4a.example.stewardshipdonationdetail _stewardshipdonationdetail = null;
public static b4a.example.donationjamaahdetail _donationjamaahdetail = null;
public static b4a.example.donationjamaahconfirm _donationjamaahconfirm = null;
public static b4a.example.qurbanjamaahdetail _qurbanjamaahdetail = null;
public static b4a.example.qurbanjamaahconfirm _qurbanjamaahconfirm = null;
public static b4a.example.codesemua _codesemua = null;
public static b4a.example.homestewardship _homestewardship = null;
public static b4a.example.orphansjamaah _orphansjamaah = null;
public static b4a.example.tpajamaah _tpajamaah = null;
public static b4a.example.tpajamaahdetail _tpajamaahdetail = null;
public static b4a.example.poorjamaahdetail _poorjamaahdetail = null;
public static b4a.example.poorjamaah _poorjamaah = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",mapsjamaah.mostCurrent._activity,"btnSearch",mapsjamaah.mostCurrent._btnsearch,"capacities",mapsjamaah.mostCurrent._capacities,"CodeSemua",Debug.moduleToString(b4a.example.codesemua.class),"DonationJamaah",Debug.moduleToString(b4a.example.donationjamaah.class),"DonationJamaahConfirm",Debug.moduleToString(b4a.example.donationjamaahconfirm.class),"DonationJamaahDetail",Debug.moduleToString(b4a.example.donationjamaahdetail.class),"EditName",mapsjamaah.mostCurrent._editname,"events",mapsjamaah.mostCurrent._events,"facilities",mapsjamaah.mostCurrent._facilities,"HistoryJamaah",Debug.moduleToString(b4a.example.historyjamaah.class),"HomeJamaah",Debug.moduleToString(b4a.example.homejamaah.class),"HomeStewardship",Debug.moduleToString(b4a.example.homestewardship.class),"HttpUtils2Service",mapsjamaah.mostCurrent._httputils2service,"Main",Debug.moduleToString(b4a.example.main.class),"MainScroll",mapsjamaah.mostCurrent._mainscroll,"OrphansJamaah",Debug.moduleToString(b4a.example.orphansjamaah.class),"OrphansJamaahDetail",Debug.moduleToString(b4a.example.orphansjamaahdetail.class),"PanelMaps",mapsjamaah.mostCurrent._panelmaps,"parking",mapsjamaah.mostCurrent._parking,"PoorJamaah",Debug.moduleToString(b4a.example.poorjamaah.class),"PoorJamaahDetail",Debug.moduleToString(b4a.example.poorjamaahdetail.class),"QurbanJamaah",Debug.moduleToString(b4a.example.qurbanjamaah.class),"QurbanJamaahConfirm",Debug.moduleToString(b4a.example.qurbanjamaahconfirm.class),"QurbanJamaahDetail",Debug.moduleToString(b4a.example.qurbanjamaahdetail.class),"SpinCapacity",mapsjamaah.mostCurrent._spincapacity,"SpinEvent",mapsjamaah.mostCurrent._spinevent,"SpinFacility",mapsjamaah.mostCurrent._spinfacility,"SpinParking",mapsjamaah.mostCurrent._spinparking,"Starter",Debug.moduleToString(b4a.example.starter.class),"StewardshipDonationDetail",Debug.moduleToString(b4a.example.stewardshipdonationdetail.class),"TpaJamaah",Debug.moduleToString(b4a.example.tpajamaah.class),"TpaJamaahDetail",Debug.moduleToString(b4a.example.tpajamaahdetail.class),"WebView1",mapsjamaah.mostCurrent._webview1};
}
}