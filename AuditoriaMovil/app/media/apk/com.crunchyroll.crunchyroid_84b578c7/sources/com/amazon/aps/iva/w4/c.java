package com.amazon.aps.iva.w4;

import android.graphics.drawable.Icon;
import android.widget.RemoteViews;
import com.amazon.aps.iva.yb0.j;
/* compiled from: ImageTranslator.kt */
/* loaded from: classes.dex */
public final class c {
    public static final c a = new c();

    public final void a(RemoteViews remoteViews, int i, Icon icon) {
        j.f(remoteViews, "rv");
        j.f(icon, "icon");
        remoteViews.setImageViewIcon(i, icon);
    }
}
