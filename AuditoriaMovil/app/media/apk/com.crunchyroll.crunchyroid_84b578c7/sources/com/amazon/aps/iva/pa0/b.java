package com.amazon.aps.iva.pa0;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.amazon.aps.iva.oa0.f1;
import com.amazon.aps.iva.oa0.r0;
import java.util.HashMap;
import java.util.concurrent.Executors;
/* compiled from: SLGoogleReferrer.java */
/* loaded from: classes4.dex */
public final class b implements com.amazon.aps.iva.cb.b {
    public final /* synthetic */ com.amazon.aps.iva.ab.a a;
    public final /* synthetic */ d b;
    public final /* synthetic */ Context c;

    /* compiled from: SLGoogleReferrer.java */
    /* loaded from: classes4.dex */
    public class a implements Runnable {
        public final /* synthetic */ int b;

        public a(int i) {
            this.b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            int i = this.b;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            HashMap hashMap = c.a;
                            b.b(bVar, bVar.c);
                            bVar.b.a(c.a);
                        } else {
                            HashMap hashMap2 = c.a;
                            b.b(bVar, bVar.c);
                            bVar.b.a(c.a);
                        }
                    } else {
                        HashMap hashMap3 = c.a;
                        b.b(bVar, bVar.c);
                        bVar.b.a(c.a);
                    }
                } else {
                    HashMap hashMap4 = c.a;
                    b.b(bVar, bVar.c);
                    bVar.b.a(c.a);
                }
            } else {
                try {
                    b.a(bVar, bVar.a);
                } catch (Throwable unused) {
                    HashMap hashMap5 = c.a;
                }
                bVar.b.a(c.a);
            }
            if (bVar.a.k()) {
                com.amazon.aps.iva.cb.a aVar = (com.amazon.aps.iva.cb.a) bVar.a;
                aVar.a = 3;
                if (aVar.d != null) {
                    Log.isLoggable("InstallReferrerClient", 2);
                    aVar.b.unbindService(aVar.d);
                    aVar.d = null;
                }
                aVar.c = null;
            }
        }
    }

    public b(com.amazon.aps.iva.cb.a aVar, r0 r0Var, Context context) {
        this.a = aVar;
        this.b = r0Var;
        this.c = context;
    }

    public static void a(b bVar, com.amazon.aps.iva.ab.a aVar) throws Exception {
        String str;
        long j;
        long j2;
        bVar.getClass();
        com.amazon.aps.iva.cb.a aVar2 = (com.amazon.aps.iva.cb.a) aVar;
        if (aVar2.k()) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", aVar2.b.getPackageName());
            boolean z = false;
            try {
                com.amazon.aps.iva.l9.a aVar3 = new com.amazon.aps.iva.l9.a(aVar2.c.c(bundle));
                try {
                    if (com.amazon.aps.iva.l9.a.class.getMethod("getInstallVersion", new Class[0]) != null) {
                        z = true;
                    }
                } catch (Throwable unused) {
                }
                if (z) {
                    str = ((Bundle) aVar3.a).getString("install_version");
                    j = ((Bundle) aVar3.a).getLong("referrer_click_timestamp_server_seconds");
                    j2 = ((Bundle) aVar3.a).getLong("install_begin_timestamp_server_seconds");
                } else {
                    str = null;
                    j = -1;
                    j2 = -1;
                }
                c.a(((Bundle) aVar3.a).getString("install_referrer"), "service", ((Bundle) aVar3.a).getLong("referrer_click_timestamp_seconds"), ((Bundle) aVar3.a).getLong("install_begin_timestamp_seconds"), str, j, j2);
                return;
            } catch (RemoteException e) {
                Log.isLoggable("InstallReferrerClient", 5);
                aVar2.a = 0;
                throw e;
            }
        }
        throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
    }

    public static void b(b bVar, Context context) {
        bVar.getClass();
        int i = f1.b;
        String string = context.getSharedPreferences("install-openUri", 0).getString("openUri", null);
        if (string != null) {
            c.a(string, "intent", -1L, -1L, null, -1L, -1L);
        }
    }

    public final void c(int i) {
        HashMap hashMap = c.a;
        Executors.newSingleThreadExecutor().execute(new a(i));
    }
}
