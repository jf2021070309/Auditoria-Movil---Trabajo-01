package com.amazon.aps.iva.xq;

import android.app.Activity;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import androidx.fragment.app.Fragment;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fr.e;
import com.amazon.aps.iva.j0.j0;
import com.amazon.aps.iva.lb0.i0;
import com.amazon.aps.iva.xq.e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
/* compiled from: RumViewScope.kt */
/* loaded from: classes2.dex */
public final class k implements h {
    public static final long K = TimeUnit.SECONDS.toNanos(1);
    public static final long L = TimeUnit.MILLISECONDS.toNanos(700);
    public static final /* synthetic */ int M = 0;
    public long A;
    public long B;
    public Long C;
    public e.r D;
    public final LinkedHashMap E;
    public boolean F;
    public Double G;
    public com.amazon.aps.iva.er.e H;
    public double I;
    public com.amazon.aps.iva.er.e J;
    public final h a;
    public final String b;
    public final com.amazon.aps.iva.l9.a c;
    public final com.amazon.aps.iva.wq.d d;
    public final r e;
    public final a f;
    public final com.amazon.aps.iva.aq.a g;
    public final String h;
    public final WeakReference i;
    public final LinkedHashMap j;
    public String k;
    public String l;
    public final long m;
    public final long n;
    public final long o;
    public h p;
    public final LinkedHashMap q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public long w;
    public long x;
    public long y;
    public long z;

    /* compiled from: RumViewScope.kt */
    /* loaded from: classes2.dex */
    public enum a {
        NONE,
        FOREGROUND,
        BACKGROUND,
        APPLICATION_LAUNCH
    }

    public k(h hVar, Object obj, String str, com.amazon.aps.iva.vq.d dVar, Map map, com.amazon.aps.iva.l9.a aVar, com.amazon.aps.iva.er.g gVar, com.amazon.aps.iva.er.g gVar2, com.amazon.aps.iva.er.g gVar3, com.amazon.aps.iva.cq.c cVar, com.amazon.aps.iva.wq.d dVar2, a aVar2, com.amazon.aps.iva.aq.a aVar3, int i) {
        com.amazon.aps.iva.ab.r rVar;
        com.amazon.aps.iva.xq.a aVar4;
        a aVar5;
        Activity activity;
        WindowManager windowManager;
        Display defaultDisplay;
        if ((i & 2048) != 0) {
            rVar = new com.amazon.aps.iva.ab.r();
        } else {
            rVar = null;
        }
        if ((i & 4096) != 0) {
            aVar4 = new com.amazon.aps.iva.xq.a();
        } else {
            aVar4 = null;
        }
        if ((i & 8192) != 0) {
            aVar5 = a.FOREGROUND;
        } else {
            aVar5 = aVar2;
        }
        com.amazon.aps.iva.yb0.j.f(hVar, "parentScope");
        com.amazon.aps.iva.yb0.j.f(obj, "key");
        com.amazon.aps.iva.yb0.j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(dVar, "eventTime");
        com.amazon.aps.iva.yb0.j.f(map, "initialAttributes");
        com.amazon.aps.iva.yb0.j.f(aVar, "firstPartyHostDetector");
        com.amazon.aps.iva.yb0.j.f(cVar, "timeProvider");
        com.amazon.aps.iva.yb0.j.f(dVar2, "rumEventSourceProvider");
        com.amazon.aps.iva.yb0.j.f(rVar, "buildSdkVersionProvider");
        com.amazon.aps.iva.yb0.j.f(aVar4, "viewUpdatePredicate");
        com.amazon.aps.iva.yb0.j.f(aVar5, "type");
        com.amazon.aps.iva.yb0.j.f(aVar3, "androidInfoProvider");
        this.a = hVar;
        this.b = str;
        this.c = aVar;
        this.d = dVar2;
        this.e = aVar4;
        this.f = aVar5;
        this.g = aVar3;
        this.h = com.amazon.aps.iva.oe0.m.e0(l1.F(obj), '.', '/');
        this.i = new WeakReference(obj);
        LinkedHashMap b0 = i0.b0(map);
        ConcurrentHashMap concurrentHashMap = com.amazon.aps.iva.sq.c.a;
        b0.putAll(concurrentHashMap);
        this.j = b0;
        this.k = hVar.b().b;
        this.l = j0.d("randomUUID().toString()");
        this.m = dVar.b;
        long c = cVar.c();
        this.n = c;
        this.o = dVar.a + c;
        this.q = new LinkedHashMap();
        this.B = 1L;
        this.E = new LinkedHashMap();
        l lVar = new l(this);
        n nVar = new n(this);
        this.I = 1.0d;
        m mVar = new m(this);
        com.amazon.aps.iva.sq.c.c(b(), com.amazon.aps.iva.sq.b.h);
        b0.putAll(concurrentHashMap);
        gVar.a(lVar);
        gVar2.a(nVar);
        gVar3.a(mVar);
        if (obj instanceof Activity) {
            activity = (Activity) obj;
        } else if (obj instanceof Fragment) {
            activity = ((Fragment) obj).getActivity();
        } else if (obj instanceof android.app.Fragment) {
            activity = ((android.app.Fragment) obj).getActivity();
        } else {
            activity = null;
        }
        if (activity != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                defaultDisplay = activity.getDisplay();
            } else {
                Object systemService = activity.getSystemService("window");
                if (systemService instanceof WindowManager) {
                    windowManager = (WindowManager) systemService;
                } else {
                    windowManager = null;
                }
                if (windowManager == null) {
                    defaultDisplay = null;
                } else {
                    defaultDisplay = windowManager.getDefaultDisplay();
                }
            }
            if (defaultDisplay != null) {
                this.I = 60.0d / defaultDisplay.getRefreshRate();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x06f4 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x06f6  */
    @Override // com.amazon.aps.iva.xq.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.xq.h a(com.amazon.aps.iva.xq.f r45, com.amazon.aps.iva.sp.c<java.lang.Object> r46) {
        /*
            Method dump skipped, instructions count: 1816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.xq.k.a(com.amazon.aps.iva.xq.f, com.amazon.aps.iva.sp.c):com.amazon.aps.iva.xq.h");
    }

    @Override // com.amazon.aps.iva.xq.h
    public final com.amazon.aps.iva.vq.a b() {
        c cVar;
        String str;
        com.amazon.aps.iva.vq.a b = this.a.b();
        if (!com.amazon.aps.iva.yb0.j.a(b.b, this.k)) {
            this.k = b.b;
            this.l = j0.d("randomUUID().toString()");
        }
        String str2 = this.l;
        String str3 = this.b;
        String str4 = this.h;
        h hVar = this.p;
        if (hVar instanceof c) {
            cVar = (c) hVar;
        } else {
            cVar = null;
        }
        if (cVar == null) {
            str = null;
        } else {
            str = cVar.h;
        }
        return com.amazon.aps.iva.vq.a.a(b, null, str2, str3, str4, str, null, this.f, 67);
    }

    public final void c(f fVar, com.amazon.aps.iva.sp.c<Object> cVar) {
        Iterator it = this.q.entrySet().iterator();
        while (it.hasNext()) {
            if (((h) ((Map.Entry) it.next()).getValue()).a(fVar, cVar) == null) {
                it.remove();
            }
        }
        h hVar = this.p;
        if (hVar != null && hVar.a(fVar, cVar) == null) {
            this.p = null;
            ConcurrentHashMap concurrentHashMap = com.amazon.aps.iva.sq.c.a;
            com.amazon.aps.iva.sq.c.c(b(), new p(this));
        }
    }

    public final boolean d() {
        long j = this.y + this.x + this.z + this.A;
        if (this.F && this.q.isEmpty() && j <= 0) {
            return true;
        }
        return false;
    }

    public final void e(f fVar, com.amazon.aps.iva.sp.c<Object> cVar) {
        e.i iVar;
        boolean z;
        Boolean valueOf;
        String str;
        String str2;
        String str3;
        e.o oVar;
        Double valueOf2;
        Double valueOf3;
        Double valueOf4;
        e.o oVar2;
        Double d;
        Double valueOf5;
        Double valueOf6;
        e.m mVar;
        boolean d2 = d();
        if (!this.e.a(d2, fVar)) {
            return;
        }
        LinkedHashMap linkedHashMap = this.j;
        linkedHashMap.putAll(com.amazon.aps.iva.sq.c.a);
        this.B++;
        long j = fVar.a().b - this.m;
        if (j <= 0) {
            com.amazon.aps.iva.iq.a aVar = com.amazon.aps.iva.dq.c.b;
            String format = String.format(Locale.US, "The computed duration for your view: %s was 0 or negative. In order to keep the view we forced it to 1ns.", Arrays.copyOf(new Object[]{this.b}, 1));
            com.amazon.aps.iva.yb0.j.e(format, "format(locale, this, *args)");
            com.amazon.aps.iva.iq.a.e(aVar, format, null, 6);
            j = 1;
        }
        com.amazon.aps.iva.vq.a b = b();
        com.amazon.aps.iva.eq.b b2 = com.amazon.aps.iva.lp.a.k.b();
        LinkedHashMap linkedHashMap2 = this.E;
        if (!linkedHashMap2.isEmpty()) {
            iVar = new e.i(new LinkedHashMap(linkedHashMap2));
        } else {
            iVar = null;
        }
        com.amazon.aps.iva.er.e eVar = this.H;
        com.amazon.aps.iva.er.e eVar2 = this.J;
        if (eVar2 == null) {
            valueOf = null;
        } else {
            if (eVar2.d < 55.0d) {
                z = true;
            } else {
                z = false;
            }
            valueOf = Boolean.valueOf(z);
        }
        long j2 = this.o;
        String str4 = b.c;
        if (str4 == null) {
            str = "";
        } else {
            str = str4;
        }
        String str5 = b.d;
        if (str5 == null) {
            str2 = "";
        } else {
            str2 = str5;
        }
        String str6 = b.e;
        if (str6 == null) {
            str3 = "";
        } else {
            str3 = str6;
        }
        Long l = this.C;
        e.r rVar = this.D;
        e.a aVar2 = new e.a(this.s);
        e.v vVar = new e.v(this.r);
        e.n nVar = new e.n(this.t);
        e.h hVar = new e.h(this.u);
        e.s sVar = new e.s(this.v);
        e.o oVar3 = new e.o(this.w);
        boolean z2 = !d2;
        Double d3 = this.G;
        if (d3 == null) {
            oVar = oVar3;
            valueOf2 = null;
        } else {
            oVar = oVar3;
            valueOf2 = Double.valueOf((d3.doubleValue() * K) / j);
        }
        if (eVar == null) {
            valueOf3 = null;
        } else {
            valueOf3 = Double.valueOf(eVar.d);
        }
        if (eVar == null) {
            valueOf4 = null;
        } else {
            valueOf4 = Double.valueOf(eVar.c);
        }
        if (eVar2 == null) {
            oVar2 = oVar;
            d = d3;
            valueOf5 = null;
        } else {
            oVar2 = oVar;
            d = d3;
            valueOf5 = Double.valueOf(eVar2.d * this.I);
        }
        if (eVar2 == null) {
            valueOf6 = null;
        } else {
            valueOf6 = Double.valueOf(eVar2.b * this.I);
        }
        e.a0 a0Var = new e.a0(str, null, str3, str2, l, rVar, j, null, null, null, null, null, null, null, null, null, iVar, Boolean.valueOf(z2), valueOf, aVar2, nVar, hVar, sVar, oVar2, vVar, null, valueOf3, valueOf4, d, valueOf2, valueOf5, valueOf6);
        e.z zVar = new e.z(b2.a, b2.b, b2.c, b2.d);
        e.b bVar = new e.b(b.a);
        e.b0 b0Var = new e.b0(b.b, e.c0.USER, null);
        e.w wVar = (e.w) this.d.a.getValue();
        com.amazon.aps.iva.aq.a aVar3 = this.g;
        e.t tVar = new e.t(aVar3.h(), aVar3.d(), aVar3.g());
        com.amazon.aps.iva.aq.h e = aVar3.e();
        com.amazon.aps.iva.yb0.j.f(e, "<this>");
        int i = e.a.f[e.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        mVar = e.m.OTHER;
                    } else {
                        mVar = e.m.DESKTOP;
                    }
                } else {
                    mVar = e.m.TV;
                }
            } else {
                mVar = e.m.TABLET;
            }
        } else {
            mVar = e.m.MOBILE;
        }
        cVar.b(new com.amazon.aps.iva.fr.e(j2, bVar, null, b0Var, wVar, a0Var, zVar, null, null, null, tVar, new e.l(mVar, aVar3.getDeviceName(), aVar3.c(), aVar3.f(), aVar3.a()), new e.j(new e.k(e.u.PLAN_1), null, this.B), new e.g(linkedHashMap)));
    }

    @Override // com.amazon.aps.iva.xq.h
    public final boolean isActive() {
        return !this.F;
    }
}
