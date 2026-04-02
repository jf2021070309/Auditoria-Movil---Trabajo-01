package com.amazon.aps.iva.ar;

import android.os.Handler;
import com.amazon.aps.iva.e.i;
import com.amazon.aps.iva.er.g;
import com.amazon.aps.iva.fr.e;
import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.sq.e;
import com.amazon.aps.iva.sq.f;
import com.amazon.aps.iva.sq.h;
import com.amazon.aps.iva.xq.f;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
/* compiled from: DatadogRumMonitor.kt */
/* loaded from: classes2.dex */
public final class b implements f, com.amazon.aps.iva.ar.a {
    public static final long g = TimeUnit.MINUTES.toMillis(5);
    public static final /* synthetic */ int h = 0;
    public final com.amazon.aps.iva.sp.c<Object> a;
    public final Handler b;
    public final com.amazon.aps.iva.hr.a c;
    public final ExecutorService d;
    public final com.amazon.aps.iva.xq.d e;
    public final i f;

    /* compiled from: DatadogRumMonitor.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            iArr[c.ACTION.ordinal()] = 1;
            iArr[c.RESOURCE.ordinal()] = 2;
            iArr[c.ERROR.ordinal()] = 3;
            iArr[c.LONG_TASK.ordinal()] = 4;
            iArr[c.FROZEN_FRAME.ordinal()] = 5;
            iArr[c.VIEW.ordinal()] = 6;
            a = iArr;
        }
    }

    public b(String str, float f, boolean z, com.amazon.aps.iva.sp.c cVar, Handler handler, com.amazon.aps.iva.hr.a aVar, com.amazon.aps.iva.l9.a aVar2, g gVar, g gVar2, g gVar3, com.amazon.aps.iva.cq.c cVar2, com.amazon.aps.iva.aq.a aVar3) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        j.e(newSingleThreadExecutor, "newSingleThreadExecutor()");
        j.f(str, "applicationId");
        j.f(cVar, "writer");
        j.f(aVar2, "firstPartyHostDetector");
        j.f(gVar, "cpuVitalMonitor");
        j.f(gVar2, "memoryVitalMonitor");
        j.f(gVar3, "frameRateVitalMonitor");
        j.f(cVar2, "timeProvider");
        this.a = cVar;
        this.b = handler;
        this.c = aVar;
        this.d = newSingleThreadExecutor;
        this.e = new com.amazon.aps.iva.xq.d(str, f, z, aVar2, gVar, gVar2, gVar3, cVar2, aVar, aVar3);
        i iVar = new i(this, 4);
        this.f = iVar;
        new com.amazon.aps.iva.l9.a((com.amazon.aps.iva.ar.a) this);
        handler.postDelayed(iVar, g);
    }

    public static com.amazon.aps.iva.vq.d p(Map map) {
        Long l;
        Object obj = map.get("_dd.timestamp");
        com.amazon.aps.iva.vq.d dVar = null;
        if (obj instanceof Long) {
            l = (Long) obj;
        } else {
            l = null;
        }
        if (l != null) {
            long longValue = l.longValue();
            dVar = new com.amazon.aps.iva.vq.d(longValue, TimeUnit.MILLISECONDS.toNanos(longValue - System.currentTimeMillis()) + System.nanoTime());
        }
        if (dVar == null) {
            return new com.amazon.aps.iva.vq.d(0);
        }
        return dVar;
    }

    @Override // com.amazon.aps.iva.sq.f
    public final void a(String str, String str2, String str3, Map<String, ? extends Object> map) {
        j.f(str, "key");
        j.f(map, "attributes");
        s(new f.s(str, str3, str2, map, p(map)));
    }

    @Override // com.amazon.aps.iva.sq.f
    public final void b(com.amazon.aps.iva.sq.d dVar, String str, LinkedHashMap linkedHashMap) {
        j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        s(new f.u(dVar, str, linkedHashMap, p(linkedHashMap)));
    }

    @Override // com.amazon.aps.iva.sq.f
    public final void c(String str, Integer num, Long l, h hVar, LinkedHashMap linkedHashMap) {
        Long valueOf;
        j.f(str, "key");
        j.f(hVar, "kind");
        com.amazon.aps.iva.vq.d p = p(linkedHashMap);
        if (num == null) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(num.intValue());
        }
        s(new f.v(str, valueOf, l, hVar, linkedHashMap, p));
    }

    @Override // com.amazon.aps.iva.sq.f
    public final void d(com.amazon.aps.iva.sq.d dVar, String str, Map<String, ? extends Object> map) {
        j.f(dVar, "type");
        j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        s(new f.r(dVar, str, false, map, p(map)));
    }

    @Override // com.amazon.aps.iva.sq.f
    public final void e(Object obj, Map<String, ? extends Object> map) {
        j.f(obj, "key");
        j.f(map, "attributes");
        s(new f.y(obj, map, p(map)));
    }

    @Override // com.amazon.aps.iva.ar.a
    public final void f(String str, com.amazon.aps.iva.wq.a aVar) {
        j.f(str, "key");
        s(new f.C0866f(str, aVar));
    }

    @Override // com.amazon.aps.iva.ar.a
    public final void g(String str, c cVar) {
        j.f(str, "viewId");
        j.f(cVar, "type");
        int i = a.a[cVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            s(new f.l(str, true));
                            return;
                        }
                        return;
                    }
                    s(new f.l(str, false));
                    return;
                }
                s(new f.i(str));
                return;
            }
            s(new f.o(str));
            return;
        }
        s(new f.b(str));
    }

    @Override // com.amazon.aps.iva.ar.a
    public final void h(String str) {
        j.f(str, "message");
        s(new f.q(com.amazon.aps.iva.hr.b.DEBUG, str, null, null));
    }

    @Override // com.amazon.aps.iva.ar.a
    public final void i(String str, e eVar, Throwable th) {
        j.f(str, "message");
        j.f(eVar, FirebaseAnalytics.Param.SOURCE);
        j.f(th, "throwable");
        s(new f.d(str, eVar, th, true, a0.b, null, null, 448));
    }

    @Override // com.amazon.aps.iva.ar.a
    public final void j(String str) {
        j.f(str, "key");
        s(new f.a0(str));
    }

    @Override // com.amazon.aps.iva.ar.a
    public final void k(long j, String str) {
        j.f(str, "target");
        s(new f.e(j, str));
    }

    @Override // com.amazon.aps.iva.sq.f
    public final void l(Object obj, Map map, String str) {
        j.f(obj, "key");
        j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        j.f(map, "attributes");
        s(new f.t(obj, str, map, p(map)));
    }

    @Override // com.amazon.aps.iva.ar.a
    public final void m(Object obj, long j, e.r rVar) {
        j.f(obj, "key");
        j.f(rVar, "type");
        s(new f.z(obj, j, rVar));
    }

    @Override // com.amazon.aps.iva.ar.a
    public final void n(String str, Throwable th) {
        String B;
        String canonicalName;
        j.f(str, "message");
        String str2 = null;
        if (th == null) {
            B = null;
        } else {
            B = com.amazon.aps.iva.dg.b.B(th);
        }
        if (th == null) {
            canonicalName = null;
        } else {
            canonicalName = th.getClass().getCanonicalName();
        }
        if (canonicalName == null) {
            if (th != null) {
                str2 = th.getClass().getSimpleName();
            }
            canonicalName = str2;
        }
        s(new f.q(com.amazon.aps.iva.hr.b.ERROR, str, B, canonicalName));
    }

    @Override // com.amazon.aps.iva.sq.f
    public final void o(String str, String str2, com.amazon.aps.iva.sq.e eVar, Throwable th, Map map) {
        j.f(str, "key");
        j.f(eVar, FirebaseAnalytics.Param.SOURCE);
        j.f(map, "attributes");
        s(new f.w(str, null, str2, eVar, th, map));
    }

    @Override // com.amazon.aps.iva.sq.f
    public final void q(com.amazon.aps.iva.sq.d dVar, String str, LinkedHashMap linkedHashMap) {
        j.f(dVar, "type");
        j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        s(new f.r(dVar, str, true, linkedHashMap, p(linkedHashMap)));
    }

    @Override // com.amazon.aps.iva.sq.f
    public final void r(String str, com.amazon.aps.iva.sq.e eVar, Throwable th, Map<String, ? extends Object> map) {
        String str2;
        j.f(str, "message");
        j.f(eVar, FirebaseAnalytics.Param.SOURCE);
        com.amazon.aps.iva.vq.d p = p(map);
        Object obj = map.get("_dd.error_type");
        if (obj instanceof String) {
            str2 = (String) obj;
        } else {
            str2 = null;
        }
        s(new f.d(str, eVar, th, false, map, p, str2, 256));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(com.amazon.aps.iva.xq.f r24) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ar.b.s(com.amazon.aps.iva.xq.f):void");
    }
}
