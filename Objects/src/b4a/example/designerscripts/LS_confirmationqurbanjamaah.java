package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_confirmationqurbanjamaah{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("panelqurban").vw.setLeft((int)((0d / 100 * width)));
views.get("panelqurban").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("panelqurban").vw.setTop((int)((0d / 100 * height)));
views.get("panelqurban").vw.setHeight((int)((100d / 100 * height)));
views.get("panelinvoice").vw.setTop((int)((2d / 100 * height)));
views.get("panelinvoice").vw.setLeft((int)((3d / 100 * width)));
views.get("panelinvoice").vw.setWidth((int)((97d / 100 * width) - ((3d / 100 * width))));
views.get("panelinvoice").vw.setHeight((int)((50d / 100 * height)));
views.get("note").vw.setTop((int)((views.get("panelinvoice").vw.getTop())+(views.get("panelinvoice").vw.getHeight())));
views.get("note").vw.setLeft((int)((3d / 100 * width)));
views.get("note").vw.setWidth((int)((97d / 100 * width) - ((3d / 100 * width))));
views.get("btnconfirm").vw.setTop((int)((100d / 100 * height)-(10d / 100 * height)));
views.get("btnconfirm").vw.setHeight((int)((98d / 100 * height) - ((100d / 100 * height)-(10d / 100 * height))));
views.get("btnconfirm").vw.setLeft((int)((3d / 100 * width)));
views.get("btnconfirm").vw.setWidth((int)((97d / 100 * width) - ((3d / 100 * width))));
views.get("imageview1").vw.setTop((int)((2d / 100 * height)));
views.get("imageview1").vw.setLeft((int)((2d / 100 * width)));
views.get("imageview1").vw.setWidth((int)((30d / 100 * width) - ((2d / 100 * width))));
views.get("imageview1").vw.setHeight((int)((28d / 100 * width)));
views.get("label3").vw.setTop((int)((2d / 100 * height)+(views.get("imageview1").vw.getTop())+(views.get("imageview1").vw.getHeight())));
views.get("label3").vw.setLeft((int)((5d / 100 * width)));
views.get("label3").vw.setWidth((int)((35d / 100 * width) - ((5d / 100 * width))));
views.get("label3").vw.setHeight((int)((5d / 100 * height)));
views.get("label5").vw.setTop((int)((views.get("label3").vw.getHeight())+(views.get("label3").vw.getTop())));
views.get("label5").vw.setHeight((int)((views.get("label3").vw.getHeight())));
views.get("label5").vw.setLeft((int)((5d / 100 * width)));
views.get("label5").vw.setWidth((int)((35d / 100 * width) - ((5d / 100 * width))));
views.get("label7").vw.setTop((int)((views.get("label5").vw.getHeight())+(views.get("label5").vw.getTop())));
views.get("label7").vw.setHeight((int)((views.get("label5").vw.getHeight())));
views.get("label7").vw.setLeft((int)((5d / 100 * width)));
views.get("label7").vw.setWidth((int)((35d / 100 * width) - ((5d / 100 * width))));
views.get("label4").vw.setTop((int)((views.get("label3").vw.getTop())));
views.get("label4").vw.setHeight((int)((views.get("label3").vw.getHeight())));
views.get("label4").vw.setLeft((int)((50d / 100 * width)));
views.get("label4").vw.setWidth((int)((92d / 100 * width) - ((50d / 100 * width))));
views.get("label6").vw.setTop((int)((views.get("label4").vw.getTop())+(views.get("label4").vw.getHeight())));
views.get("label6").vw.setHeight((int)((views.get("label3").vw.getHeight())));
views.get("label6").vw.setLeft((int)((50d / 100 * width)));
views.get("label6").vw.setWidth((int)((92d / 100 * width) - ((50d / 100 * width))));
views.get("label8").vw.setTop((int)((views.get("label6").vw.getTop())+(views.get("label6").vw.getHeight())));
views.get("label8").vw.setHeight((int)((views.get("label3").vw.getHeight())));
views.get("label8").vw.setLeft((int)((50d / 100 * width)));
views.get("label8").vw.setWidth((int)((92d / 100 * width) - ((50d / 100 * width))));
views.get("label1").vw.setLeft((int)((35d / 100 * width)));
views.get("label1").vw.setWidth((int)((90d / 100 * width) - ((35d / 100 * width))));
views.get("label2").vw.setLeft((int)((35d / 100 * width)));
views.get("label2").vw.setWidth((int)((90d / 100 * width) - ((35d / 100 * width))));
views.get("label1").vw.setTop((int)((2d / 100 * height)));
views.get("label1").vw.setHeight((int)((views.get("label3").vw.getHeight())));
views.get("label2").vw.setTop((int)((views.get("label1").vw.getTop())+(views.get("label1").vw.getHeight())));
views.get("label2").vw.setHeight((int)((views.get("label3").vw.getHeight())));
views.get("label9").vw.setTop((int)((43d / 100 * height)));
views.get("label9").vw.setHeight((int)((48d / 100 * height) - ((43d / 100 * height))));
views.get("label9").vw.setLeft((int)((5d / 100 * width)));
views.get("label9").vw.setWidth((int)((35d / 100 * width) - ((5d / 100 * width))));
views.get("label10").vw.setTop((int)((43d / 100 * height)));
views.get("label10").vw.setHeight((int)((48d / 100 * height) - ((43d / 100 * height))));
views.get("label10").vw.setLeft((int)((50d / 100 * width)));
views.get("label10").vw.setWidth((int)((92d / 100 * width) - ((50d / 100 * width))));

}
}