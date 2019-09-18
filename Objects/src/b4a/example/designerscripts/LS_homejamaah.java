package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_homejamaah{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("panelhome").vw.setLeft((int)((0d / 100 * width)));
views.get("panelhome").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("panelbanner").vw.setTop((int)((0d / 100 * height)));
views.get("panelbanner").vw.setLeft((int)((0d / 100 * width)));
views.get("panelbanner").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("panelbanner").vw.setHeight((int)((50d / 100 * width)));
views.get("panelprofile").vw.setTop((int)((views.get("panelbanner").vw.getTop())+(views.get("panelbanner").vw.getHeight())));
views.get("panelprofile").vw.setLeft((int)((0d / 100 * width)));
views.get("panelprofile").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("mapbtn").vw.setTop((int)((6d / 100 * height)));
views.get("mapbtn").vw.setLeft((int)((10d / 100 * width)));
views.get("mapbtn").vw.setWidth((int)((20d / 100 * width)));
views.get("mapbtn").vw.setHeight((int)((views.get("mapbtn").vw.getWidth())));
views.get("maplabel").vw.setTop((int)((views.get("mapbtn").vw.getTop())+(views.get("mapbtn").vw.getHeight())));
views.get("maplabel").vw.setHeight((int)((5d / 100 * width)));
views.get("maplabel").vw.setLeft((int)((10d / 100 * width)));
views.get("maplabel").vw.setWidth((int)((30d / 100 * width) - ((10d / 100 * width))));
views.get("qurbanbtn").vw.setTop((int)((6d / 100 * height)));
views.get("qurbanbtn").vw.setHeight((int)((20d / 100 * height) - ((6d / 100 * height))));
views.get("qurbanbtn").vw.setLeft((int)((40d / 100 * width)));
views.get("qurbanbtn").vw.setWidth((int)((60d / 100 * width) - ((40d / 100 * width))));
views.get("qurbanlabel").vw.setTop((int)((views.get("mapbtn").vw.getTop())+(views.get("mapbtn").vw.getHeight())));
views.get("qurbanlabel").vw.setHeight((int)((5d / 100 * width)));
views.get("qurbanlabel").vw.setLeft((int)((40d / 100 * width)));
views.get("qurbanlabel").vw.setWidth((int)((60d / 100 * width) - ((40d / 100 * width))));
views.get("constructionbtn").vw.setTop((int)((6d / 100 * height)));
views.get("constructionbtn").vw.setHeight((int)((20d / 100 * height) - ((6d / 100 * height))));
views.get("constructionbtn").vw.setLeft((int)((70d / 100 * width)));
views.get("constructionbtn").vw.setWidth((int)((90d / 100 * width) - ((70d / 100 * width))));
views.get("constructionlabel").vw.setTop((int)((views.get("mapbtn").vw.getTop())+(views.get("mapbtn").vw.getHeight())));
views.get("constructionlabel").vw.setHeight((int)((5d / 100 * width)));
views.get("constructionlabel").vw.setLeft((int)((70d / 100 * width)));
views.get("constructionlabel").vw.setWidth((int)((90d / 100 * width) - ((70d / 100 * width))));
views.get("orphanbtn").vw.setLeft((int)((10d / 100 * width)));
views.get("orphanbtn").vw.setWidth((int)((30d / 100 * width) - ((10d / 100 * width))));
views.get("orphanbtn").vw.setTop((int)((25d / 100 * height)));
views.get("orphanbtn").vw.setHeight((int)((39d / 100 * height) - ((25d / 100 * height))));
views.get("orphanlabel").vw.setTop((int)((views.get("orphanbtn").vw.getTop())+(views.get("mapbtn").vw.getHeight())));
views.get("orphanlabel").vw.setHeight((int)((5d / 100 * width)));
views.get("orphanlabel").vw.setLeft((int)((10d / 100 * width)));
views.get("orphanlabel").vw.setWidth((int)((30d / 100 * width) - ((10d / 100 * width))));
views.get("tpabtn").vw.setLeft((int)((40d / 100 * width)));
views.get("tpabtn").vw.setWidth((int)((60d / 100 * width) - ((40d / 100 * width))));
views.get("tpabtn").vw.setTop((int)((25d / 100 * height)));
views.get("tpabtn").vw.setHeight((int)((39d / 100 * height) - ((25d / 100 * height))));
views.get("tpalabel").vw.setTop((int)((views.get("orphanbtn").vw.getTop())+(views.get("mapbtn").vw.getHeight())));
views.get("tpalabel").vw.setHeight((int)((5d / 100 * width)));
views.get("tpalabel").vw.setLeft((int)((40d / 100 * width)));
views.get("tpalabel").vw.setWidth((int)((60d / 100 * width) - ((40d / 100 * width))));
views.get("poorbtn").vw.setLeft((int)((70d / 100 * width)));
views.get("poorbtn").vw.setWidth((int)((90d / 100 * width) - ((70d / 100 * width))));
views.get("poorbtn").vw.setTop((int)((25d / 100 * height)));
views.get("poorbtn").vw.setHeight((int)((39d / 100 * height) - ((25d / 100 * height))));
views.get("poorlabel").vw.setTop((int)((views.get("orphanbtn").vw.getTop())+(views.get("mapbtn").vw.getHeight())));
views.get("poorlabel").vw.setHeight((int)((5d / 100 * width)));
views.get("poorlabel").vw.setLeft((int)((70d / 100 * width)));
views.get("poorlabel").vw.setWidth((int)((90d / 100 * width) - ((70d / 100 * width))));
views.get("historybtn").vw.setLeft((int)((10d / 100 * width)));
views.get("historybtn").vw.setWidth((int)((30d / 100 * width) - ((10d / 100 * width))));
views.get("historybtn").vw.setTop((int)((45d / 100 * height)));
views.get("historybtn").vw.setHeight((int)((59d / 100 * height) - ((45d / 100 * height))));
views.get("historylabel").vw.setTop((int)((views.get("historybtn").vw.getTop())+(views.get("mapbtn").vw.getHeight())));
views.get("historylabel").vw.setHeight((int)((5d / 100 * width)));
views.get("historylabel").vw.setLeft((int)((10d / 100 * width)));
views.get("historylabel").vw.setWidth((int)((30d / 100 * width) - ((10d / 100 * width))));
views.get("logoutbtn").vw.setLeft((int)((70d / 100 * width)));
views.get("logoutbtn").vw.setWidth((int)((90d / 100 * width) - ((70d / 100 * width))));
views.get("logoutbtn").vw.setTop((int)((45d / 100 * height)));
views.get("logoutbtn").vw.setHeight((int)((59d / 100 * height) - ((45d / 100 * height))));
views.get("logoutlabel").vw.setTop((int)((views.get("historybtn").vw.getTop())+(views.get("mapbtn").vw.getHeight())));
//BA.debugLineNum = 66;BA.debugLine="logoutLabel.Height= 5%x"[HomeJamaah/General script]
views.get("logoutlabel").vw.setHeight((int)((5d / 100 * width)));
//BA.debugLineNum = 67;BA.debugLine="logoutLabel.SetLeftAndRight(70%x,90%x)"[HomeJamaah/General script]
views.get("logoutlabel").vw.setLeft((int)((70d / 100 * width)));
views.get("logoutlabel").vw.setWidth((int)((90d / 100 * width) - ((70d / 100 * width))));
//BA.debugLineNum = 69;BA.debugLine="Label1.SetLeftAndRight(5%x,95%x)"[HomeJamaah/General script]
views.get("label1").vw.setLeft((int)((5d / 100 * width)));
views.get("label1").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 70;BA.debugLine="Label1.SetTopAndBottom(5%y,20%y)"[HomeJamaah/General script]
views.get("label1").vw.setTop((int)((5d / 100 * height)));
views.get("label1").vw.setHeight((int)((20d / 100 * height) - ((5d / 100 * height))));
//BA.debugLineNum = 72;BA.debugLine="PanelPhoto.SetLeftAndRight(10%x,35%x)"[HomeJamaah/General script]
views.get("panelphoto").vw.setLeft((int)((10d / 100 * width)));
views.get("panelphoto").vw.setWidth((int)((35d / 100 * width) - ((10d / 100 * width))));
//BA.debugLineNum = 75;BA.debugLine="LabelName.SetLeftAndRight(40%x,98%x)"[HomeJamaah/General script]
views.get("labelname").vw.setLeft((int)((40d / 100 * width)));
views.get("labelname").vw.setWidth((int)((98d / 100 * width) - ((40d / 100 * width))));
//BA.debugLineNum = 76;BA.debugLine="LabelNumber.SetLeftAndRight(40%x,98%x)"[HomeJamaah/General script]
views.get("labelnumber").vw.setLeft((int)((40d / 100 * width)));
views.get("labelnumber").vw.setWidth((int)((98d / 100 * width) - ((40d / 100 * width))));
//BA.debugLineNum = 77;BA.debugLine="LabelUser.SetLeftAndRight(40%x,98%x)"[HomeJamaah/General script]
views.get("labeluser").vw.setLeft((int)((40d / 100 * width)));
views.get("labeluser").vw.setWidth((int)((98d / 100 * width) - ((40d / 100 * width))));
//BA.debugLineNum = 79;BA.debugLine="LabelName.Height = 7%x"[HomeJamaah/General script]
views.get("labelname").vw.setHeight((int)((7d / 100 * width)));
//BA.debugLineNum = 80;BA.debugLine="LabelNumber.Height = 7%x"[HomeJamaah/General script]
views.get("labelnumber").vw.setHeight((int)((7d / 100 * width)));
//BA.debugLineNum = 81;BA.debugLine="LabelUser.Height = 7%x"[HomeJamaah/General script]
views.get("labeluser").vw.setHeight((int)((7d / 100 * width)));
//BA.debugLineNum = 83;BA.debugLine="PanelPhoto.Top = 10%x"[HomeJamaah/General script]
views.get("panelphoto").vw.setTop((int)((10d / 100 * width)));
//BA.debugLineNum = 84;BA.debugLine="LabelName.Top = PanelPhoto.Top"[HomeJamaah/General script]
views.get("labelname").vw.setTop((int)((views.get("panelphoto").vw.getTop())));
//BA.debugLineNum = 85;BA.debugLine="LabelNumber.Top = LabelName.Top + LabelName.Height"[HomeJamaah/General script]
views.get("labelnumber").vw.setTop((int)((views.get("labelname").vw.getTop())+(views.get("labelname").vw.getHeight())));
//BA.debugLineNum = 86;BA.debugLine="LabelUser.Top= LabelNumber.Top + LabelNumber.Height"[HomeJamaah/General script]
views.get("labeluser").vw.setTop((int)((views.get("labelnumber").vw.getTop())+(views.get("labelnumber").vw.getHeight())));
//BA.debugLineNum = 87;BA.debugLine="logoutLabel.Top=logoutBtn.Top+logoutBtn.Height"[HomeJamaah/General script]
views.get("logoutlabel").vw.setTop((int)((views.get("logoutbtn").vw.getTop())+(views.get("logoutbtn").vw.getHeight())));
//BA.debugLineNum = 89;BA.debugLine="PanelPhoto.Height = LabelUser.Top"[HomeJamaah/General script]
views.get("panelphoto").vw.setHeight((int)((views.get("labeluser").vw.getTop())));
//BA.debugLineNum = 90;BA.debugLine="PanelProfile.Height = PanelPhoto.Height + PanelPhoto.Top+ 8%x"[HomeJamaah/General script]
views.get("panelprofile").vw.setHeight((int)((views.get("panelphoto").vw.getHeight())+(views.get("panelphoto").vw.getTop())+(8d / 100 * width)));
//BA.debugLineNum = 92;BA.debugLine="PanelMenu.Top = PanelProfile.Top + PanelProfile.Height"[HomeJamaah/General script]
views.get("panelmenu").vw.setTop((int)((views.get("panelprofile").vw.getTop())+(views.get("panelprofile").vw.getHeight())));
//BA.debugLineNum = 93;BA.debugLine="PanelMenu.SetLeftAndRight(0%x,100%x)"[HomeJamaah/General script]
views.get("panelmenu").vw.setLeft((int)((0d / 100 * width)));
views.get("panelmenu").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 94;BA.debugLine="PanelMenu.Height=logoutLabel.Top+logoutLabel.Height+7%y"[HomeJamaah/General script]
views.get("panelmenu").vw.setHeight((int)((views.get("logoutlabel").vw.getTop())+(views.get("logoutlabel").vw.getHeight())+(7d / 100 * height)));

}
}