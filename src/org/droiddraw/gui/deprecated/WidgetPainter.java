/*
 * Copyright (C) 2015 Jack Jiang(cngeeker.com) The DroidUIBuilder Project. 
 * All rights reserved.
 * Project URL:https://github.com/JackJiang2011/DroidUIBuilder
 * Version 1.0
 * 
 * Jack Jiang PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 * 
 * WidgetPainter.java at 2015-2-6 16:11:59, original version by Jack Jiang.
 * You can contact author with jb2011@163.com.
 */
package org.droiddraw.gui.deprecated;

import java.awt.Graphics;

import org.droiddraw.widget.Widget;

@Deprecated
//2012-11-20：由Jack Jiang标记为过时——目前为止不需要
//painter机制，它是droiddraw原作者的实现，目前的评估是没
//有多大必要，相反还使得代码复杂性增加，以后以下所有代码可
//能会被删除！
public interface WidgetPainter
{
	public void paint(Widget w, Graphics g);
}