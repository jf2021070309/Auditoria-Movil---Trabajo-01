package com.amazon.aps.iva.v1;

import android.view.RenderNode;
/* compiled from: RenderNodeApi23.android.kt */
/* loaded from: classes.dex */
public final class g2 {
    public static final g2 a = new g2();

    public final int a(RenderNode renderNode) {
        com.amazon.aps.iva.yb0.j.f(renderNode, "renderNode");
        return renderNode.getAmbientShadowColor();
    }

    public final int b(RenderNode renderNode) {
        com.amazon.aps.iva.yb0.j.f(renderNode, "renderNode");
        return renderNode.getSpotShadowColor();
    }

    public final void c(RenderNode renderNode, int i) {
        com.amazon.aps.iva.yb0.j.f(renderNode, "renderNode");
        renderNode.setAmbientShadowColor(i);
    }

    public final void d(RenderNode renderNode, int i) {
        com.amazon.aps.iva.yb0.j.f(renderNode, "renderNode");
        renderNode.setSpotShadowColor(i);
    }
}
