package com.amazon.aps.iva.oa0;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.amazon.aps.iva.oa0.j0;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ApiManager.java */
/* loaded from: classes4.dex */
public final class e {
    public static final /* synthetic */ int e = 0;
    public final Context a;
    public final f0 b;
    public final d1 c;
    public final b d = new b();

    /* compiled from: ApiManager.java */
    /* loaded from: classes4.dex */
    public class a extends HashMap {
        public a(Boolean bool) {
            put("limit_data_sharing", Boolean.valueOf(bool.booleanValue()));
        }
    }

    /* compiled from: ApiManager.java */
    /* loaded from: classes4.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            String b;
            if (!u0.p.l) {
                int i = e.e;
                return;
            }
            Context context = e.this.a;
            int i2 = f1.b;
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                int i3 = e.e;
                return;
            }
            try {
                j0 j0Var = (j0) e.this.b;
                synchronized (j0Var) {
                    b = j0Var.a.b();
                }
                if (b == null) {
                    int i4 = e.e;
                    return;
                }
                i e = i.e(b);
                int i5 = e.e;
                if (e.i(u0.p)) {
                    j0 j0Var2 = (j0) e.this.b;
                    synchronized (j0Var2) {
                        j0.b bVar = j0Var2.a;
                        bVar.getClass();
                        SQLiteDatabase writableDatabase = bVar.a.getWritableDatabase();
                        j0.b.e(writableDatabase);
                        writableDatabase.close();
                    }
                    e.this.c();
                }
            } catch (Throwable th) {
                int i6 = e.e;
                th.getMessage();
            }
        }
    }

    static {
        new com.amazon.aps.iva.b30.j(e.class.getSimpleName());
    }

    public e(d1 d1Var, Context context, j0 j0Var) {
        this.a = context;
        this.b = j0Var;
        this.c = d1Var;
        d1Var.start();
    }

    public static void b(i iVar) {
        Boolean valueOf;
        u0 u0Var = u0.p;
        com.amazon.aps.iva.if0.c cVar = new com.amazon.aps.iva.if0.c((Map<?, ?>) u0Var.g);
        if (cVar.length() != 0) {
            iVar.put("global_properties", cVar.toString());
        }
        SharedPreferences b2 = u0Var.b();
        if (!b2.contains("limit_data_sharing")) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(b2.getBoolean("limit_data_sharing", false));
        }
        if (valueOf != null) {
            iVar.put("data_sharing_options", new com.amazon.aps.iva.if0.c((Map<?, ?>) new a(valueOf)).toString());
        }
    }

    public final void a(i iVar) {
        f0 f0Var;
        if (iVar != null && (f0Var = this.b) != null) {
            try {
                boolean z = iVar instanceof c;
                Context context = this.a;
                if (!z && !(iVar instanceof d)) {
                    iVar.put("event_index", String.valueOf(f1.d(context)));
                }
                iVar.put("singular_install_id", f1.f(context).toString());
                b(iVar);
                ((j0) f0Var).a(iVar.j());
                c();
            } catch (Throwable unused) {
            }
        }
    }

    public final void c() {
        d1 d1Var = this.c;
        if (d1Var == null) {
            return;
        }
        d1Var.a().removeCallbacksAndMessages(null);
        d1Var.a().post(this.d);
    }
}
