package com.amazon.aps.iva.fz;

import android.app.NotificationManager;
import android.content.Context;
/* compiled from: NotificationChannelsHandler.kt */
/* loaded from: classes2.dex */
public final class h {
    public final Context a;
    public final g b;
    public final NotificationManager c;

    public h(Context context, com.amazon.aps.iva.a0.k kVar) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        this.a = context;
        this.b = kVar;
        Object systemService = context.getSystemService("notification");
        com.amazon.aps.iva.yb0.j.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        this.c = (NotificationManager) systemService;
    }

    public final String a(int i) {
        String string = this.a.getString(i);
        com.amazon.aps.iva.yb0.j.e(string, "context.getString(resId)");
        return string;
    }
}
