
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

public class tpajamaah implements IRemote{
	public static tpajamaah mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public tpajamaah() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("tpajamaah"), "b4a.example.tpajamaah");
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
		pcBA = new PCBA(this, tpajamaah.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _fund = RemoteObject.createImmutable("");
public static RemoteObject _id_clicked = RemoteObject.createImmutable("");
public static RemoteObject _name_project = RemoteObject.createImmutable("");
public static RemoteObject _mainscroll = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _panelqurban = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _navbartitle = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _clv = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _panellistitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _btndonationhere = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _mosquename = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _address = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _status = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _idpro = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
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
public static b4a.example.mapsjamaah _mapsjamaah = null;
public static b4a.example.orphansjamaah _orphansjamaah = null;
public static b4a.example.tpajamaahdetail _tpajamaahdetail = null;
public static b4a.example.poorjamaahdetail _poorjamaahdetail = null;
public static b4a.example.poorjamaah _poorjamaah = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",tpajamaah.mostCurrent._activity,"Address",tpajamaah.mostCurrent._address,"BtnDonationHere",tpajamaah.mostCurrent._btndonationhere,"CLV",tpajamaah.mostCurrent._clv,"CodeSemua",Debug.moduleToString(b4a.example.codesemua.class),"DonationJamaah",Debug.moduleToString(b4a.example.donationjamaah.class),"DonationJamaahConfirm",Debug.moduleToString(b4a.example.donationjamaahconfirm.class),"DonationJamaahDetail",Debug.moduleToString(b4a.example.donationjamaahdetail.class),"fund",tpajamaah._fund,"HistoryJamaah",Debug.moduleToString(b4a.example.historyjamaah.class),"HomeJamaah",Debug.moduleToString(b4a.example.homejamaah.class),"HomeStewardship",Debug.moduleToString(b4a.example.homestewardship.class),"HttpUtils2Service",tpajamaah.mostCurrent._httputils2service,"id",tpajamaah._id,"id_clicked",tpajamaah._id_clicked,"IDpro",tpajamaah.mostCurrent._idpro,"Main",Debug.moduleToString(b4a.example.main.class),"MainScroll",tpajamaah.mostCurrent._mainscroll,"MapsJamaah",Debug.moduleToString(b4a.example.mapsjamaah.class),"MosqueName",tpajamaah.mostCurrent._mosquename,"name_project",tpajamaah._name_project,"NavbarTitle",tpajamaah.mostCurrent._navbartitle,"OrphansJamaah",Debug.moduleToString(b4a.example.orphansjamaah.class),"OrphansJamaahDetail",Debug.moduleToString(b4a.example.orphansjamaahdetail.class),"PanelListItem",tpajamaah.mostCurrent._panellistitem,"PanelQurban",tpajamaah.mostCurrent._panelqurban,"PoorJamaah",Debug.moduleToString(b4a.example.poorjamaah.class),"PoorJamaahDetail",Debug.moduleToString(b4a.example.poorjamaahdetail.class),"QurbanJamaah",Debug.moduleToString(b4a.example.qurbanjamaah.class),"QurbanJamaahConfirm",Debug.moduleToString(b4a.example.qurbanjamaahconfirm.class),"QurbanJamaahDetail",Debug.moduleToString(b4a.example.qurbanjamaahdetail.class),"Starter",Debug.moduleToString(b4a.example.starter.class),"Status",tpajamaah.mostCurrent._status,"StewardshipDonationDetail",Debug.moduleToString(b4a.example.stewardshipdonationdetail.class),"TpaJamaahDetail",Debug.moduleToString(b4a.example.tpajamaahdetail.class),"xui",tpajamaah._xui};
}
}