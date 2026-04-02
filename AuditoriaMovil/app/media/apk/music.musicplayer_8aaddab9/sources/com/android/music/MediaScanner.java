package com.android.music;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import e.a.c.a7;
import e.h.g.j0;
import e.h.g.r0;
import e.h.g.t1;
/* loaded from: classes.dex */
public class MediaScanner extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        r0 r0Var = a7.a;
        int i2 = t1.a;
        j0.f(new j0.b() { // from class: e.a.c.j4
            @Override // e.h.g.j0.b
            public final void a() {
                e.h.g.r0 r0Var2 = a7.a;
                try {
                    e.h.g.r0 r0Var3 = a7.a;
                    synchronized (r0Var3) {
                        if (r0Var3.c() > 10) {
                            r0Var3.g();
                            a7.d();
                        }
                    }
                } catch (Throwable th) {
                    e.h.g.s1.l(th, true);
                }
            }
        });
    }
}
