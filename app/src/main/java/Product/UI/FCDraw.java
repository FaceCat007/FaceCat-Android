/*
 * FaceCat图形通讯框架
 * 上海卷卷猫信息技术有限公司
 */

package Product.UI;

import facecat.topin.core.*;

/** 
 绘图类
 
*/
public class FCDraw
{
	/** 
	 绘制文字
	 
	 @param paint 绘图对象
	 @param text 文字
	 @param dwPenColor 颜色
	 @param font 字体
	 @param x 横坐标
	 @param y 纵坐标
	*/
	public static void drawText(FCPaint paint, String text, long dwPenColor, FCFont font, int x, int y)
	{
		FCSize tSize = paint.textSize(text, font, -1);
		FCRect tRect = new FCRect(x, y, x + tSize.cx, y + tSize.cy);
		paint.drawText(text, dwPenColor, font, tRect, -1);
	}
}