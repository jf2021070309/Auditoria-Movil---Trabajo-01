package com.amazon.aps.iva.oa0;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.aps.iva.oa0.h;
import com.google.android.gms.cast.MediaError;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executors;
/* compiled from: SingularInstance.java */
/* loaded from: classes4.dex */
public final class u0 {
    public static int o;
    public static u0 p;
    public final Context a;
    public final e b;
    public final d1 c;
    public com.amazon.aps.iva.na0.b d;
    public m0 e;
    public y f;
    public HashMap<String, String> g;
    public Map<String, Object> h;
    public Map<String, Object> i;
    public Map<String, Object> j;
    public String k;
    public boolean l = false;
    public boolean m;
    public double n;

    /* compiled from: SingularInstance.java */
    /* loaded from: classes4.dex */
    public class a implements Runnable {
        public final /* synthetic */ u0 b;

        public a(u0 u0Var) {
            this.b = u0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            u0 u0Var = this.b;
            u0 u0Var2 = u0.this;
            if (!u0Var2.l) {
                try {
                    u0Var2.d.getClass();
                    if (!f1.i(null)) {
                        u0Var2.d.getClass();
                        SharedPreferences.Editor edit = u0Var2.b().edit();
                        edit.putString("fcm_device_token_key", null);
                        edit.commit();
                    }
                    u0Var2.d.getClass();
                    u0Var2.d.getClass();
                    u0Var2.d.getClass();
                    Context context = u0Var.a;
                    u0Var2.d.getClass();
                    y yVar = new y(context, u0Var2.d.l);
                    u0Var.f = yVar;
                    yVar.i.a(yVar, u0Var.a);
                    v vVar = new v(u0Var2.a);
                    u uVar = new u(new b0());
                    x0 x0Var = new x0(u0Var2, u0Var);
                    if (r.g == null) {
                        vVar.a(new p(vVar, uVar, x0Var));
                    }
                    u0Var.e = new m0(u0Var);
                    u0Var2.l = true;
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* compiled from: SingularInstance.java */
    /* loaded from: classes4.dex */
    public class b implements Runnable {
        public final /* synthetic */ h.c b;
        public final /* synthetic */ u0 c;

        public b(h.c cVar, u0 u0Var) {
            this.c = u0Var;
            this.b = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.c.c(this.b);
        }
    }

    /* compiled from: SingularInstance.java */
    /* loaded from: classes4.dex */
    public class c implements Runnable {
        public final /* synthetic */ h.c b;

        public c(h.c cVar) {
            this.b = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            h.c cVar = this.b;
            h hVar = new h(cVar.c);
            u0 u0Var = u0.p;
            int i = h.b.b;
            long j = u0Var.e.d;
            h.b bVar = new h.b();
            bVar.put("n", cVar.a);
            String str = cVar.b;
            try {
                if (f1.i(str)) {
                    str = new com.amazon.aps.iva.if0.c().put("is_revenue_event", false).toString();
                } else {
                    com.amazon.aps.iva.if0.c cVar2 = new com.amazon.aps.iva.if0.c(str);
                    if (!cVar2.optBoolean("is_revenue_event", false)) {
                        str = cVar2.put("is_revenue_event", false).toString();
                    }
                }
                bVar.put("e", str);
            } catch (com.amazon.aps.iva.if0.b unused) {
                int i2 = h.b;
            }
            bVar.put("t", String.valueOf((cVar.c - j) * 0.001d));
            bVar.put("s", String.valueOf(j));
            m0 m0Var = u0Var.e;
            long j2 = m0Var.f + 1;
            m0Var.f = j2;
            bVar.put("seq", String.valueOf(j2));
            bVar.put("a", u0Var.d.a);
            bVar.h(u0Var.f);
            hVar.putAll(bVar);
            l lVar = l.m;
            if (lVar != null) {
                boolean z = lVar.d;
                l lVar2 = l.m;
                if (z && lVar.e && hVar.h()) {
                    try {
                        ((w0) lVar.i).a.b.b.a(i.e(hVar.j()));
                    } catch (Throwable unused2) {
                    }
                }
                try {
                    Executors.newSingleThreadExecutor().execute(new k(lVar, hVar));
                    return;
                } catch (Throwable th) {
                    f1.b(th);
                    lVar.c(th);
                    return;
                }
            }
            u0.p.b.a(hVar);
        }
    }

    static {
        new com.amazon.aps.iva.b30.j("Instance");
        o = 0;
    }

    public u0(Context context, com.amazon.aps.iva.na0.b bVar) throws IOException {
        com.amazon.aps.iva.if0.c cVar;
        boolean z = false;
        this.m = false;
        String str = x.a;
        String str2 = x.a;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            this.a = applicationContext;
            this.d = bVar;
            d1 d1Var = new d1("worker");
            this.c = d1Var;
            this.b = new e(new d1("api"), context, new j0(context));
            int i = f1.b;
            if (!applicationContext.getSharedPreferences("singular-first-install", 0).getBoolean("wasOpenedAfterInstall", false)) {
                SharedPreferences.Editor edit = applicationContext.getSharedPreferences("singular-first-install", 0).edit();
                z = true;
                edit.putBoolean("wasOpenedAfterInstall", true);
                edit.commit();
            }
            this.m = z;
            d1Var.start();
            try {
                cVar = new com.amazon.aps.iva.if0.c(b().getString("global_properties", "{}"));
            } catch (Throwable unused) {
                cVar = new com.amazon.aps.iva.if0.c();
            }
            HashMap<String, String> hashMap = new HashMap<>();
            Iterator<String> keys = cVar.keys();
            while (keys.hasNext()) {
                try {
                    String next = keys.next();
                    hashMap.put(next, cVar.getString(next));
                } catch (Throwable unused2) {
                }
            }
            this.g = hashMap;
            if (this.d.d.size() != 0) {
                HashMap<String, String> hashMap2 = (HashMap) this.g.clone();
                for (q0 q0Var : this.d.d.values()) {
                    q0Var.getClass();
                    if (!hashMap2.containsKey(null)) {
                        hashMap2.put(null, null);
                    }
                }
                if (hashMap2.size() <= 5) {
                    this.g = hashMap2;
                    e();
                    if (this.g == null) {
                        this.g = null;
                        e();
                    }
                }
            }
            this.c.a().post(new a(this));
            return;
        }
        throw new IllegalStateException("Context failed to cast to ApplicationContext");
    }

    public static u0 a(Context context, com.amazon.aps.iva.na0.b bVar) throws IOException {
        if (p == null) {
            synchronized (u0.class) {
                if (p == null) {
                    int i = bVar.f;
                    p = new u0(context, bVar);
                }
            }
        }
        u0 u0Var = p;
        u0Var.d = bVar;
        return u0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(long r12) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.oa0.u0.f(long):void");
    }

    public final SharedPreferences b() {
        return this.a.getSharedPreferences("singular-pref-session", 0);
    }

    public final void c(h.c cVar) {
        boolean z = false;
        if (b().getBoolean("stop_all_tracking", false)) {
            return;
        }
        if (this.l && p != null && this.e != null) {
            z = true;
        }
        d1 d1Var = this.c;
        if (!z) {
            b bVar = new b(cVar, this);
            if (o < 10) {
                d1Var.a().postDelayed(bVar, (long) MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN);
                o++;
                return;
            }
            return;
        }
        d1Var.a().post(new c(cVar));
    }

    public final boolean d(String str, String str2) {
        int i;
        int i2;
        if (str != null) {
            i = str.length();
        } else {
            i = 0;
        }
        if (str2 != null) {
            i2 = str2.length();
        } else {
            i2 = 0;
        }
        if (i + i2 > 3746) {
            return false;
        }
        c(new h.c(str, str2));
        return true;
    }

    public final void e() {
        if (this.g == null) {
            this.g = new HashMap<>();
        }
        SharedPreferences.Editor edit = b().edit();
        edit.putString("global_properties", new com.amazon.aps.iva.if0.c((Map<?, ?>) this.g).toString());
        edit.commit();
    }
}
