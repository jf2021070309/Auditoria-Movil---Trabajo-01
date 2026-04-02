package com.amazon.aps.iva.ka0;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import com.amazon.aps.iva.a6.m0;
import com.amazon.aps.iva.ca0.b;
import com.amazon.aps.iva.d0.b2;
import java.util.UUID;
/* compiled from: MuxDataSdk.kt */
/* loaded from: classes4.dex */
public abstract class p<Player, PlayerView extends View> {
    public static final b g = new b();
    public final t<PlayerView, Player> a;
    public final a0 b;
    public final com.amazon.aps.iva.da0.c c;
    public final Player d;
    public final d0<PlayerView> e;
    public final y f;

    /* compiled from: MuxDataSdk.kt */
    /* loaded from: classes4.dex */
    public static final class b {
    }

    /* compiled from: MuxDataSdk.kt */
    /* loaded from: classes4.dex */
    public enum c {
        NONE,
        DEBUG,
        VERBOSE
    }

    /* compiled from: MuxDataSdk.kt */
    /* loaded from: classes4.dex */
    public class d implements f {
        public d() {
        }

        @Override // com.amazon.aps.iva.ka0.f
        public final long a() {
            y yVar = p.this.f;
            if (yVar != null) {
                return yVar.g;
            }
            return 0L;
        }

        @Override // com.amazon.aps.iva.ka0.f
        public final Long b() {
            y yVar = p.this.f;
            if (yVar != null) {
                return yVar.m;
            }
            return null;
        }

        @Override // com.amazon.aps.iva.ka0.f
        public final Integer c() {
            y yVar = p.this.f;
            if (yVar != null) {
                return Integer.valueOf(yVar.j);
            }
            return null;
        }

        @Override // com.amazon.aps.iva.ka0.f
        public final Long d() {
            y yVar = p.this.f;
            if (yVar != null) {
                return yVar.n;
            }
            return null;
        }

        @Override // com.amazon.aps.iva.ka0.f
        public final int e() {
            p<Player, PlayerView> pVar = p.this;
            return (int) Math.ceil(pVar.e.b().x / pVar.e.a());
        }

        @Override // com.amazon.aps.iva.ka0.f
        public final Integer f() {
            y yVar = p.this.f;
            if (yVar != null) {
                return Integer.valueOf(yVar.k);
            }
            return null;
        }

        @Override // com.amazon.aps.iva.ka0.f
        public final boolean g() {
            u uVar;
            y yVar = p.this.f;
            if (yVar == null || (uVar = yVar.c) == u.PAUSED || uVar == u.ENDED || uVar == u.ERROR || uVar == u.INIT) {
                return true;
            }
            return false;
        }

        @Override // com.amazon.aps.iva.ka0.f
        public final Integer h() {
            y yVar = p.this.f;
            if (yVar != null) {
                return Integer.valueOf(yVar.h);
            }
            return null;
        }

        @Override // com.amazon.aps.iva.ka0.f
        public final String i() {
            y yVar = p.this.f;
            if (yVar != null) {
                return yVar.e;
            }
            return null;
        }

        @Override // com.amazon.aps.iva.ka0.f
        public final Long j() {
            y yVar = p.this.f;
            if (yVar != null) {
                return Long.valueOf(yVar.f);
            }
            return null;
        }

        @Override // com.amazon.aps.iva.ka0.f
        public final Long k() {
            y yVar = p.this.f;
            if (yVar != null) {
                return yVar.q;
            }
            return null;
        }

        @Override // com.amazon.aps.iva.ka0.f
        public final Long l() {
            y yVar = p.this.f;
            if (yVar != null) {
                return yVar.p;
            }
            return null;
        }

        @Override // com.amazon.aps.iva.ka0.f
        public final Long m() {
            Long l;
            y yVar = p.this.f;
            if (yVar == null || (l = yVar.m) == null) {
                return null;
            }
            return Long.valueOf(l.longValue() + yVar.g);
        }

        @Override // com.amazon.aps.iva.ka0.f
        public final Long n() {
            y yVar = p.this.f;
            if (yVar != null) {
                return yVar.o;
            }
            return null;
        }

        @Override // com.amazon.aps.iva.ka0.f
        public final int o() {
            p<Player, PlayerView> pVar = p.this;
            return (int) Math.ceil(pVar.e.b().y / pVar.e.a());
        }

        @Override // com.amazon.aps.iva.ka0.f
        public final Float p() {
            y yVar = p.this.f;
            if (yVar != null) {
                return Float.valueOf(yVar.i);
            }
            return null;
        }
    }

    public p() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(Context context, String str, m0 m0Var, View view, com.amazon.aps.iva.ga0.e eVar, a aVar, com.amazon.aps.iva.ka0.c cVar, com.amazon.aps.iva.ca0.d dVar, c cVar2) {
        r rVar = new r(aVar);
        b bVar = g;
        i iVar = new i(bVar);
        j jVar = new j(bVar);
        k kVar = new k(bVar);
        m mVar = new m(bVar);
        n nVar = new n(bVar);
        o oVar = new o(bVar);
        com.amazon.aps.iva.yb0.j.f(cVar2, "logLevel");
        com.amazon.aps.iva.yb0.j.f(l.h, "makeEventBus");
        this.d = m0Var;
        a0.r = aVar;
        a0.s = rVar;
        if (eVar.d == null) {
            com.amazon.aps.iva.ga0.f fVar = new com.amazon.aps.iva.ga0.f();
            eVar.d = fVar;
            eVar.e(fVar);
        }
        if (eVar.e == null) {
            com.amazon.aps.iva.ga0.g gVar = new com.amazon.aps.iva.ga0.g();
            eVar.e = gVar;
            eVar.e(gVar);
        }
        if (eVar.f == null) {
            com.amazon.aps.iva.ga0.h hVar = new com.amazon.aps.iva.ga0.h();
            eVar.f = hVar;
            eVar.e(hVar);
        }
        if (eVar.g == null) {
            com.amazon.aps.iva.ga0.i iVar2 = new com.amazon.aps.iva.ga0.i();
            eVar.g = iVar2;
            eVar.e(iVar2);
        }
        if (eVar.h == null) {
            com.amazon.aps.iva.ga0.d dVar2 = new com.amazon.aps.iva.ga0.d();
            eVar.h = dVar2;
            eVar.e(dVar2);
        }
        if (eVar.d == null) {
            com.amazon.aps.iva.ga0.f fVar2 = new com.amazon.aps.iva.ga0.f();
            eVar.d = fVar2;
            eVar.e(fVar2);
        }
        eVar.d.b("ake", str);
        com.amazon.aps.iva.da0.c cVar3 = new com.amazon.aps.iva.da0.c();
        this.c = cVar3;
        d0<PlayerView> d0Var = (d0<PlayerView>) oVar.invoke(context, view);
        this.e = d0Var;
        a0 a0Var = (a0) kVar.K(jVar.invoke(this), iVar.invoke(context, view), eVar, dVar);
        this.b = a0Var;
        y yVar = (y) nVar.invoke(a0Var, cVar3, true);
        this.f = yVar;
        cVar3.b(a0Var);
        a0Var.h(eVar);
        this.a = mVar.K(m0Var, d0Var, yVar, cVar);
        c cVar4 = c.DEBUG;
        c cVar5 = c.VERBOSE;
        boolean N = com.amazon.aps.iva.lb0.o.N(new c[]{cVar4, cVar5}, cVar2);
        boolean z = cVar2 == cVar5;
        com.amazon.aps.iva.ca0.b bVar2 = com.amazon.aps.iva.ca0.a.a.get(a0Var.d);
        if (bVar2 != null) {
            com.amazon.aps.iva.ia0.b.a = Boolean.valueOf(N);
            bVar2.h.i = z;
        }
    }

    public final void a(com.amazon.aps.iva.ca0.e eVar) {
        String num;
        com.amazon.aps.iva.yb0.j.f(eVar, "orientation");
        a0 a0Var = this.b;
        a0Var.getClass();
        com.amazon.aps.iva.ca0.b bVar = com.amazon.aps.iva.ca0.a.a.get(a0Var.d);
        if (bVar != null) {
            com.amazon.aps.iva.ga0.p pVar = new com.amazon.aps.iva.ga0.p();
            Integer num2 = 0;
            if (num2 != null) {
                pVar.b("x", num2.toString());
            }
            if (num2 != null) {
                pVar.b("y", num2.toString());
            }
            int i = b.a.a[eVar.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    if (num2 != null) {
                        num = num2.toString();
                        pVar.b("z", num);
                    }
                    com.amazon.aps.iva.ga0.o oVar = new com.amazon.aps.iva.ga0.o();
                    com.amazon.aps.iva.if0.c cVar = new com.amazon.aps.iva.if0.c();
                    cVar.put("x", pVar.g());
                    cVar.put("y", pVar.h());
                    cVar.put("z", pVar.i());
                    oVar.b("xdvor", cVar.toString());
                    com.amazon.aps.iva.fa0.q qVar = new com.amazon.aps.iva.fa0.q(bVar.d, 0);
                    qVar.e = oVar;
                    bVar.a(qVar);
                }
                return;
            }
            Integer num3 = 90;
            if (num3 != null) {
                num = num3.toString();
                pVar.b("z", num);
            }
            com.amazon.aps.iva.ga0.o oVar2 = new com.amazon.aps.iva.ga0.o();
            com.amazon.aps.iva.if0.c cVar2 = new com.amazon.aps.iva.if0.c();
            cVar2.put("x", pVar.g());
            cVar2.put("y", pVar.h());
            cVar2.put("z", pVar.i());
            oVar2.b("xdvor", cVar2.toString());
            com.amazon.aps.iva.fa0.q qVar2 = new com.amazon.aps.iva.fa0.q(bVar.d, 0);
            qVar2.e = oVar2;
            bVar.a(qVar2);
        }
    }

    /* compiled from: MuxDataSdk.kt */
    /* loaded from: classes4.dex */
    public static class a implements com.amazon.aps.iva.ka0.d {
        public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] i = {com.amazon.aps.iva.k.q.a(a.class, "contextRef", "getContextRef()Landroid/content/Context;", 0)};
        public final String a = "1.1.x";
        public final String b = "mux-media3";
        public final String c = "1.0.3";
        public final String d = "media3-generic";
        public final com.amazon.aps.iva.ba0.a e;
        public final String f;
        public final String g;
        public final String h;

        /* compiled from: MuxDataSdk.kt */
        /* renamed from: com.amazon.aps.iva.ka0.p$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0439a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[g.values().length];
                iArr[g.ERROR.ordinal()] = 1;
                iArr[g.WARN.ordinal()] = 2;
                iArr[g.INFO.ordinal()] = 3;
                iArr[g.DEBUG.ordinal()] = 4;
                iArr[g.VERBOSE.ordinal()] = 5;
                a = iArr;
            }
        }

        public a(Context context) {
            String string;
            PackageInfo packageInfo;
            PackageManager.PackageInfoFlags of;
            this.e = new com.amazon.aps.iva.ba0.a(context);
            this.g = "";
            this.h = "";
            synchronized (this) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("MUX_DEVICE_ID", 0);
                string = sharedPreferences.getString("MUX_DEVICE_ID", null);
                if (string == null) {
                    string = UUID.randomUUID().toString();
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putString("MUX_DEVICE_ID", string);
                    edit.commit();
                }
            }
            this.f = string;
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    PackageManager packageManager = context.getPackageManager();
                    String packageName = context.getPackageName();
                    of = PackageManager.PackageInfoFlags.of(0L);
                    packageInfo = packageManager.getPackageInfo(packageName, of);
                    com.amazon.aps.iva.yb0.j.e(packageInfo, "ctx.packageManager.getPa…r.PackageInfoFlags.of(0))");
                } else {
                    packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                    com.amazon.aps.iva.yb0.j.e(packageInfo, "ctx.packageManager.getPa…eInfo(ctx.packageName, 0)");
                }
                String str = packageInfo.packageName;
                com.amazon.aps.iva.yb0.j.e(str, "packageInfo.packageName");
                this.g = str;
                String str2 = packageInfo.versionName;
                com.amazon.aps.iva.yb0.j.e(str2, "packageInfo.versionName");
                this.h = str2;
            } catch (PackageManager.NameNotFoundException unused) {
                com.amazon.aps.iva.ia0.b.a("MuxDevice", "could not get package info");
            }
        }

        @Override // com.amazon.aps.iva.ka0.d
        public final String a() {
            return this.h;
        }

        @Override // com.amazon.aps.iva.ka0.d
        public final long c() {
            return SystemClock.elapsedRealtime();
        }

        @Override // com.amazon.aps.iva.ka0.d
        public final String d() {
            return this.d;
        }

        @Override // com.amazon.aps.iva.ka0.d
        public final String e() {
            StringBuilder sb = new StringBuilder();
            sb.append(Build.VERSION.RELEASE);
            sb.append(" (");
            return b2.b(sb, Build.VERSION.SDK_INT, ')');
        }

        @Override // com.amazon.aps.iva.ka0.d
        public final String f() {
            Context context = (Context) this.e.getValue(this, i[0]);
            if (context != null) {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities == null) {
                    com.amazon.aps.iva.ia0.b.b("MuxDevice", "Could not get network capabilities");
                } else if (networkCapabilities.hasTransport(3)) {
                    return "wired";
                } else {
                    if (networkCapabilities.hasTransport(1)) {
                        return "wifi";
                    }
                    if (networkCapabilities.hasTransport(0)) {
                        return "cellular";
                    }
                    return "other";
                }
            }
            return null;
        }

        @Override // com.amazon.aps.iva.ka0.d
        public final String getDeviceId() {
            return this.f;
        }

        @Override // com.amazon.aps.iva.ka0.d
        public final String getModelName() {
            return Build.MODEL;
        }

        @Override // com.amazon.aps.iva.ka0.d
        public final String getPlayerVersion() {
            return this.a;
        }

        @Override // com.amazon.aps.iva.ka0.d
        public final String h() {
            return Build.MANUFACTURER;
        }

        @Override // com.amazon.aps.iva.ka0.d
        public final String i() {
            return Build.HARDWARE;
        }

        @Override // com.amazon.aps.iva.ka0.d
        public final String j() {
            return this.g;
        }

        @Override // com.amazon.aps.iva.ka0.d
        public final String k() {
            return this.c;
        }

        @Override // com.amazon.aps.iva.ka0.d
        public final String l() {
            return this.b;
        }

        @Override // com.amazon.aps.iva.ka0.d
        public final void m(g gVar, String str, String str2) {
            com.amazon.aps.iva.yb0.j.f(gVar, "logPriority");
            com.amazon.aps.iva.yb0.j.f(str2, "msg");
            int i2 = C0439a.a[gVar.ordinal()];
        }

        @Override // com.amazon.aps.iva.ka0.d
        public final void b() {
        }

        @Override // com.amazon.aps.iva.ka0.d
        public final void g() {
        }

        @Override // com.amazon.aps.iva.ka0.d
        public final void getDeviceName() {
        }
    }
}
