package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_confirmationdonationjamaah{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="PanelQurban.SetLeftAndRight(0%x,100%x)"[ConfirmationDonationJamaah/General script]
views.get("panelqurban").vw.setLeft((int)((0d / 100 * width)));
views.get("panelqurban").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 3;BA.debugLine="PanelQurban.Top=0%y"[ConfirmationDonationJamaah/General script]
views.get("panelqurban").vw.setTop((int)((0d / 100 * height)));
//BA.debugLineNum = 4;BA.debugLine="PanelQurban.Height=100%y"[ConfirmationDonationJamaah/General script]
views.get("panelqurban").vw.setHeight((int)((100d / 100 * height)));
//BA.debugLineNum = 6;BA.debugLine="PanelInvoice.Top=2%y"[ConfirmationDonationJamaah/General script]
views.get("panelinvoice").vw.setTop((int)((2d / 100 * height)));
//BA.debugLineNum = 7;BA.debugLine="PanelInvoice.SetLeftAndRight(3%x,97%x)"[ConfirmationDonationJamaah/General script]
views.get("panelinvoice").vw.setLeft((int)((3d / 100 * width)));
views.get("panelinvoice").vw.setWidth((int)((97d / 100 * width) - ((3d / 100 * width))));
//BA.debugLineNum = 8;BA.debugLine="PanelInvoice.Height=55%y"[ConfirmationDonationJamaah/General script]
views.get("panelinvoice").vw.setHeight((int)((55d / 100 * height)));
//BA.debugLineNum = 10;BA.debugLine="Note.Top=PanelInvoice.Top+PanelInvoice.Height"[ConfirmationDonationJamaah/General script]
views.get("note").vw.setTop((int)((views.get("panelinvoice").vw.getTop())+(views.get("panelinvoice").vw.getHeight())));
//BA.debugLineNum = 11;BA.debugLine="Note.SetLeftAndRight(3%x,97%x)"[ConfirmationDonationJamaah/General script]
views.get("note").vw.setLeft((int)((3d / 100 * width)));
views.get("note").vw.setWidth((int)((97d / 100 * width) - ((3d / 100 * width))));
//BA.debugLineNum = 13;BA.debugLine="BtnConfirm.SetTopAndBottom(100%y-10%y,98%y)"[ConfirmationDonationJamaah/General script]
views.get("btnconfirm").vw.setTop((int)((100d / 100 * height)-(10d / 100 * height)));
views.get("btnconfirm").vw.setHeight((int)((98d / 100 * height) - ((100d / 100 * height)-(10d / 100 * height))));
//BA.debugLineNum = 14;BA.debugLine="BtnConfirm.SetLeftAndRight(3%x,97%x)"[ConfirmationDonationJamaah/General script]
views.get("btnconfirm").vw.setLeft((int)((3d / 100 * width)));
views.get("btnconfirm").vw.setWidth((int)((97d / 100 * width) - ((3d / 100 * width))));
//BA.debugLineNum = 16;BA.debugLine="ImageView1.Top=2%y"[ConfirmationDonationJamaah/General script]
views.get("imageview1").vw.setTop((int)((2d / 100 * height)));
//BA.debugLineNum = 17;BA.debugLine="ImageView1.SetLeftAndRight(2%x,30%x)"[ConfirmationDonationJamaah/General script]
views.get("imageview1").vw.setLeft((int)((2d / 100 * width)));
views.get("imageview1").vw.setWidth((int)((30d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 18;BA.debugLine="ImageView1.Height= 28%x"[ConfirmationDonationJamaah/General script]
views.get("imageview1").vw.setHeight((int)((28d / 100 * width)));
//BA.debugLineNum = 20;BA.debugLine="Label3.Top = 2%y + ImageView1.Top+ImageView1.Height"[ConfirmationDonationJamaah/General script]
views.get("label3").vw.setTop((int)((2d / 100 * height)+(views.get("imageview1").vw.getTop())+(views.get("imageview1").vw.getHeight())));
//BA.debugLineNum = 21;BA.debugLine="Label3.SetLeftAndRight(5%x,35%x)"[ConfirmationDonationJamaah/General script]
views.get("label3").vw.setLeft((int)((5d / 100 * width)));
views.get("label3").vw.setWidth((int)((35d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 22;BA.debugLine="Label3.Height=5%y"[ConfirmationDonationJamaah/General script]
views.get("label3").vw.setHeight((int)((5d / 100 * height)));
//BA.debugLineNum = 24;BA.debugLine="Label5.Top = Label3.Height+Label3.Top"[ConfirmationDonationJamaah/General script]
views.get("label5").vw.setTop((int)((views.get("label3").vw.getHeight())+(views.get("label3").vw.getTop())));
//BA.debugLineNum = 25;BA.debugLine="Label5.Height=Label3.Height"[ConfirmationDonationJamaah/General script]
views.get("label5").vw.setHeight((int)((views.get("label3").vw.getHeight())));
//BA.debugLineNum = 26;BA.debugLine="Label5.SetLeftAndRight(5%x,35%x)"[ConfirmationDonationJamaah/General script]
views.get("label5").vw.setLeft((int)((5d / 100 * width)));
views.get("label5").vw.setWidth((int)((35d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 28;BA.debugLine="Label7.Top = Label5.Height+Label5.Top"[ConfirmationDonationJamaah/General script]
views.get("label7").vw.setTop((int)((views.get("label5").vw.getHeight())+(views.get("label5").vw.getTop())));
//BA.debugLineNum = 29;BA.debugLine="Label7.Height=Label5.Height"[ConfirmationDonationJamaah/General script]
views.get("label7").vw.setHeight((int)((views.get("label5").vw.getHeight())));
//BA.debugLineNum = 30;BA.debugLine="Label7.SetLeftAndRight(5%x,35%x)"[ConfirmationDonationJamaah/General script]
views.get("label7").vw.setLeft((int)((5d / 100 * width)));
views.get("label7").vw.setWidth((int)((35d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 32;BA.debugLine="Label4.Top = Label3.Top"[ConfirmationDonationJamaah/General script]
views.get("label4").vw.setTop((int)((views.get("label3").vw.getTop())));
//BA.debugLineNum = 33;BA.debugLine="Label4.Height=Label3.Height"[ConfirmationDonationJamaah/General script]
views.get("label4").vw.setHeight((int)((views.get("label3").vw.getHeight())));
//BA.debugLineNum = 34;BA.debugLine="Label4.SetLeftAndRight(50%x,92%x)"[ConfirmationDonationJamaah/General script]
views.get("label4").vw.setLeft((int)((50d / 100 * width)));
views.get("label4").vw.setWidth((int)((92d / 100 * width) - ((50d / 100 * width))));
//BA.debugLineNum = 36;BA.debugLine="Label6.Top = Label4.Top+Label4.Height"[ConfirmationDonationJamaah/General script]
views.get("label6").vw.setTop((int)((views.get("label4").vw.getTop())+(views.get("label4").vw.getHeight())));
//BA.debugLineNum = 37;BA.debugLine="Label6.Height=Label3.Height"[ConfirmationDonationJamaah/General script]
views.get("label6").vw.setHeight((int)((views.get("label3").vw.getHeight())));
//BA.debugLineNum = 38;BA.debugLine="Label6.SetLeftAndRight(50%x,92%x)"[ConfirmationDonationJamaah/General script]
views.get("label6").vw.setLeft((int)((50d / 100 * width)));
views.get("label6").vw.setWidth((int)((92d / 100 * width) - ((50d / 100 * width))));
//BA.debugLineNum = 40;BA.debugLine="Label8.Top = Label6.Top+Label6.Height"[ConfirmationDonationJamaah/General script]
views.get("label8").vw.setTop((int)((views.get("label6").vw.getTop())+(views.get("label6").vw.getHeight())));
//BA.debugLineNum = 41;BA.debugLine="Label8.Height=Label3.Height"[ConfirmationDonationJamaah/General script]
views.get("label8").vw.setHeight((int)((views.get("label3").vw.getHeight())));
//BA.debugLineNum = 42;BA.debugLine="Label8.SetLeftAndRight(50%x,92%x)"[ConfirmationDonationJamaah/General script]
views.get("label8").vw.setLeft((int)((50d / 100 * width)));
views.get("label8").vw.setWidth((int)((92d / 100 * width) - ((50d / 100 * width))));
//BA.debugLineNum = 44;BA.debugLine="Label11.Top = Label7.Top+Label7.Height"[ConfirmationDonationJamaah/General script]
views.get("label11").vw.setTop((int)((views.get("label7").vw.getTop())+(views.get("label7").vw.getHeight())));
//BA.debugLineNum = 45;BA.debugLine="Label11.Height=Label3.Height"[ConfirmationDonationJamaah/General script]
views.get("label11").vw.setHeight((int)((views.get("label3").vw.getHeight())));
//BA.debugLineNum = 46;BA.debugLine="Label11.SetLeftAndRight(5%x,35%x)"[ConfirmationDonationJamaah/General script]
views.get("label11").vw.setLeft((int)((5d / 100 * width)));
views.get("label11").vw.setWidth((int)((35d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 48;BA.debugLine="Label12.Top = Label8.Top+Label8.Height"[ConfirmationDonationJamaah/General script]
views.get("label12").vw.setTop((int)((views.get("label8").vw.getTop())+(views.get("label8").vw.getHeight())));
//BA.debugLineNum = 49;BA.debugLine="Label12.Height=Label3.Height"[ConfirmationDonationJamaah/General script]
views.get("label12").vw.setHeight((int)((views.get("label3").vw.getHeight())));
//BA.debugLineNum = 50;BA.debugLine="Label12.SetLeftAndRight(50%x,92%x)"[ConfirmationDonationJamaah/General script]
views.get("label12").vw.setLeft((int)((50d / 100 * width)));
views.get("label12").vw.setWidth((int)((92d / 100 * width) - ((50d / 100 * width))));
//BA.debugLineNum = 52;BA.debugLine="Label1.SetLeftAndRight(35%x,90%x)"[ConfirmationDonationJamaah/General script]
views.get("label1").vw.setLeft((int)((35d / 100 * width)));
views.get("label1").vw.setWidth((int)((90d / 100 * width) - ((35d / 100 * width))));
//BA.debugLineNum = 53;BA.debugLine="Label2.SetLeftAndRight(35%x,90%x)"[ConfirmationDonationJamaah/General script]
views.get("label2").vw.setLeft((int)((35d / 100 * width)));
views.get("label2").vw.setWidth((int)((90d / 100 * width) - ((35d / 100 * width))));
//BA.debugLineNum = 54;BA.debugLine="Label1.Top=2%y"[ConfirmationDonationJamaah/General script]
views.get("label1").vw.setTop((int)((2d / 100 * height)));
//BA.debugLineNum = 55;BA.debugLine="Label1.Height=Label3.Height"[ConfirmationDonationJamaah/General script]
views.get("label1").vw.setHeight((int)((views.get("label3").vw.getHeight())));
//BA.debugLineNum = 56;BA.debugLine="Label2.Top=Label1.Top+Label1.Height"[ConfirmationDonationJamaah/General script]
views.get("label2").vw.setTop((int)((views.get("label1").vw.getTop())+(views.get("label1").vw.getHeight())));
//BA.debugLineNum = 57;BA.debugLine="Label2.Height=Label3.Height"[ConfirmationDonationJamaah/General script]
views.get("label2").vw.setHeight((int)((views.get("label3").vw.getHeight())));
//BA.debugLineNum = 59;BA.debugLine="Label9.SetTopAndBottom(48%y,53%y)"[ConfirmationDonationJamaah/General script]
views.get("label9").vw.setTop((int)((48d / 100 * height)));
views.get("label9").vw.setHeight((int)((53d / 100 * height) - ((48d / 100 * height))));
//BA.debugLineNum = 60;BA.debugLine="Label9.SetLeftAndRight(5%x,35%x)"[ConfirmationDonationJamaah/General script]
views.get("label9").vw.setLeft((int)((5d / 100 * width)));
views.get("label9").vw.setWidth((int)((35d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 61;BA.debugLine="Label10.SetTopAndBottom(48%y,53%y)"[ConfirmationDonationJamaah/General script]
views.get("label10").vw.setTop((int)((48d / 100 * height)));
views.get("label10").vw.setHeight((int)((53d / 100 * height) - ((48d / 100 * height))));
//BA.debugLineNum = 62;BA.debugLine="Label10.SetLeftAndRight(50%x,92%x)"[ConfirmationDonationJamaah/General script]
views.get("label10").vw.setLeft((int)((50d / 100 * width)));
views.get("label10").vw.setWidth((int)((92d / 100 * width) - ((50d / 100 * width))));

}
}