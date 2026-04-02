package com.amazon.aps.iva.s4;

import android.content.Context;
import android.content.Intent;
/* compiled from: ActionTrampoline.kt */
/* loaded from: classes.dex */
public final class i {
    public static final i a = new i();

    public final void a(Context context, Intent intent) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(intent, "intent");
        context.startForegroundService(intent);
    }
}
