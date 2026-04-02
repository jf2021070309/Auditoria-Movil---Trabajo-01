package com.amazon.aps.iva.r4;

import android.widget.RemoteViews;
/* compiled from: RemoteViewsTranslator.kt */
/* loaded from: classes.dex */
public final class u1 {
    public static final u1 a = new u1();

    public final void a(RemoteViews remoteViews, int i, RemoteViews remoteViews2, int i2) {
        com.amazon.aps.iva.yb0.j.f(remoteViews, "rv");
        com.amazon.aps.iva.yb0.j.f(remoteViews2, "childView");
        remoteViews.addStableView(i, remoteViews2, i2);
    }
}
