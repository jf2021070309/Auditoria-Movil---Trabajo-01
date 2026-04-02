package com.crunchyroll.connectivity;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.g;
import com.amazon.aps.iva.x50.q;
import com.amazon.aps.iva.x50.r;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.connectivity.NetworkChangeMonitor;
/* compiled from: NetworkChangeRegister.kt */
/* loaded from: classes.dex */
public interface d extends com.amazon.aps.iva.mf.e {

    /* compiled from: NetworkChangeRegister.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static d a(Context context, g gVar) {
            j.f(context, "context");
            if (q.a.a == null) {
                q.a.a = new r(context);
            }
            r rVar = q.a.a;
            j.c(rVar);
            j.f(context, "context");
            NetworkChangeMonitor networkChangeMonitor = NetworkChangeMonitor.a.a;
            if (networkChangeMonitor == null) {
                Context applicationContext = context.getApplicationContext();
                j.e(applicationContext, "context.applicationContext");
                networkChangeMonitor = new NetworkChangeMonitorImpl(applicationContext, new Handler(Looper.getMainLooper()));
                NetworkChangeMonitor.a.a = networkChangeMonitor;
            }
            j.f(context, "context");
            j.f(gVar, "lifecycle");
            return new NetworkChangeRegisterImpl(networkChangeMonitor, rVar, gVar);
        }
    }

    void a(com.amazon.aps.iva.mf.a aVar);

    void b(com.amazon.aps.iva.mf.a aVar);
}
