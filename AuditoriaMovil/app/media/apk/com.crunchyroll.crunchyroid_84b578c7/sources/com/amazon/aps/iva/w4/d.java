package com.amazon.aps.iva.w4;

import android.os.Build;
import android.widget.RemoteViews;
import com.amazon.aps.iva.yb0.j;
/* compiled from: TextTranslator.kt */
/* loaded from: classes.dex */
public final class d {
    public static final d a = new d();

    public final void a(RemoteViews remoteViews, int i, int i2) {
        boolean z;
        j.f(remoteViews, "rv");
        if (Build.VERSION.SDK_INT >= 31) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            remoteViews.setInt(i, "setGravity", i2);
            return;
        }
        throw new IllegalArgumentException(("setGravity is only available on SDK 31 and higher").toString());
    }
}
