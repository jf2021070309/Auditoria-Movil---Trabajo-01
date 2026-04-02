package com.amazon.aps.iva.oa0;

import android.content.SharedPreferences;
import com.amazon.aps.iva.oa0.o;
/* compiled from: SessionManager.java */
/* loaded from: classes4.dex */
public final class k0 implements Runnable {
    public final /* synthetic */ long b;
    public final /* synthetic */ m0 c;

    public k0(m0 m0Var, long j) {
        this.c = m0Var;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m0 m0Var = this.c;
        m0Var.e = this.b;
        try {
            SharedPreferences.Editor edit = m0Var.a.a.getSharedPreferences("singular-pref-session", 0).edit();
            edit.putLong("id", m0Var.d);
            edit.putLong("lastSessionPauseTime", m0Var.e);
            edit.putLong("seq", m0Var.f);
            edit.commit();
        } catch (Throwable th) {
            f1.b(th);
        }
        m0Var.g = false;
        o.a aVar = m0Var.b;
        if (aVar != null) {
            try {
                m0Var.a.a.unregisterReceiver(aVar);
            } catch (Throwable unused) {
            }
        }
        int i = f1.b;
        u0.p.d.j = false;
    }
}
