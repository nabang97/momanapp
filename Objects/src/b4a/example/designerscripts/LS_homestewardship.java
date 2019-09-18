package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_homestewardship{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("panelhome").vw.setLeft((int)((0d / 100 * width)));
views.get("panelhome").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("panelbanner").vw.setTop((int)((0d / 100 * height)));
views.get("panelbanner").vw.setLeft((int)((0d / 100 * width)));
views.get("panelbanner").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("panelbanner").vw.setHeight((int)((60d / 100 * width)));
views.get("panelprofile").vw.setTop((int)((views.get("panelbanner").vw.getTop())+(views.get("panelbanner").vw.getHeight())));
views.get("panelprofile").vw.setLeft((int)((0d / 100 * width)));
views.get("panelprofile").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("mapbtn").vw.setTop((int)((6d / 100 * height)));
views.get("mapbtn").vw.setHeight((int)((20d / 100 * height) - ((6d / 100 * height))));
views.get("mapbtn").vw.setLeft((int)((10d / 100 * width)));
views.get("mapbtn").vw.setWidth((int)((30d / 100 * width) - ((10d / 100 * width))));
views.get("qurbanbtn").vw.setTop((int)((6d / 100 * height)));
views.get("qurbanbtn").vw.setHeight((int)((20d / 100 * height) - ((6d / 100 * height))));
views.get("qurbanbtn").vw.setLeft((int)((40d / 100 * width)));
views.get("qurbanbtn").vw.setWidth((int)((60d / 100 * width) - ((40d / 100 * width))));
views.get("constructionbtn").vw.setTop((int)((6d / 100 * height)));
views.get("constructionbtn").vw.setHeight((int)((20d / 100 * height) - ((6d / 100 * height))));
views.get("constructionbtn").vw.setLeft((int)((70d / 100 * width)));
views.get("constructionbtn").vw.setWidth((int)((90d / 100 * width) - ((70d / 100 * width))));
views.get("orphanbtn").vw.setLeft((int)((10d / 100 * width)));
views.get("orphanbtn").vw.setWidth((int)((30d / 100 * width) - ((10d / 100 * width))));
views.get("orphanbtn").vw.setTop((int)((25d / 100 * height)));
views.get("orphanbtn").vw.setHeight((int)((39d / 100 * height) - ((25d / 100 * height))));
views.get("tpabtn").vw.setLeft((int)((40d / 100 * width)));
views.get("tpabtn").vw.setWidth((int)((60d / 100 * width) - ((40d / 100 * width))));
views.get("tpabtn").vw.setTop((int)((25d / 100 * height)));
views.get("tpabtn").vw.setHeight((int)((39d / 100 * height) - ((25d / 100 * height))));
views.get("poorbtn").vw.setLeft((int)((70d / 100 * width)));
views.get("poorbtn").vw.setWidth((int)((90d / 100 * width) - ((70d / 100 * width))));
views.get("poorbtn").vw.setTop((int)((25d / 100 * height)));
views.get("poorbtn").vw.setHeight((int)((39d / 100 * height) - ((25d / 100 * height))));
views.get("historybtn").vw.setLeft((int)((10d / 100 * width)));
views.get("historybtn").vw.setWidth((int)((30d / 100 * width) - ((10d / 100 * width))));
views.get("historybtn").vw.setTop((int)((45d / 100 * height)));
views.get("historybtn").vw.setHeight((int)((59d / 100 * height) - ((45d / 100 * height))));
views.get("logoutbtn").vw.setLeft((int)((70d / 100 * width)));
views.get("logoutbtn").vw.setWidth((int)((90d / 100 * width) - ((70d / 100 * width))));
views.get("logoutbtn").vw.setTop((int)((45d / 100 * height)));
views.get("logoutbtn").vw.setHeight((int)((59d / 100 * height) - ((45d / 100 * height))));
views.get("label1").vw.setLeft((int)((5d / 100 * width)));
views.get("label1").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("label1").vw.setTop((int)((5d / 100 * height)));
views.get("label1").vw.setHeight((int)((20d / 100 * height) - ((5d / 100 * height))));
views.get("panelphoto").vw.setLeft((int)((5d / 100 * width)));
views.get("panelphoto").vw.setWidth((int)((33d / 100 * width) - ((5d / 100 * width))));
views.get("labelname").vw.setLeft((int)((40d / 100 * width)));
views.get("labelname").vw.setWidth((int)((98d / 100 * width) - ((40d / 100 * width))));
views.get("labelnumber").vw.setLeft((int)((40d / 100 * width)));
views.get("labelnumber").vw.setWidth((int)((98d / 100 * width) - ((40d / 100 * width))));
views.get("labeluser").vw.setLeft((int)((40d / 100 * width)));
views.get("labeluser").vw.setWidth((int)((98d / 100 * width) - ((40d / 100 * width))));
views.get("labelname").vw.setHeight((int)((7d / 100 * width)));
views.get("labelnumber").vw.setHeight((int)((7d / 100 * width)));
views.get("labeluser").vw.setHeight((int)((7d / 100 * width)));
views.get("panelphoto").vw.setTop((int)((10d / 100 * width)));
views.get("labelname").vw.setTop((int)((views.get("panelphoto").vw.getTop())));
views.get("labelnumber").vw.setTop((int)((views.get("labelname").vw.getTop())+(views.get("labelname").vw.getHeight())));
views.get("labeluser").vw.setTop((int)((views.get("labelnumber").vw.getTop())+(views.get("labelnumber").vw.getHeight())));
views.get("panelphoto").vw.setHeight((int)((views.get("labeluser").vw.getTop())));
views.get("panelprofile").vw.setHeight((int)((views.get("panelphoto").vw.getHeight())+(views.get("panelphoto").vw.getTop())+(10d / 100 * width)));
views.get("panelmenu").vw.setTop((int)((views.get("panelprofile").vw.getTop())+(views.get("panelprofile").vw.getHeight())));
views.get("panelmenu").vw.setLeft((int)((0d / 100 * width)));
views.get("panelmenu").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("panelmenu").vw.setHeight((int)((views.get("historybtn").vw.getTop())+(views.get("historybtn").vw.getHeight())+(7d / 100 * height)));

}
}