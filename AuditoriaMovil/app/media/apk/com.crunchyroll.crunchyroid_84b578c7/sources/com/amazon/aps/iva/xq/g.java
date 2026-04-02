package com.amazon.aps.iva.xq;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fr.b;
import com.amazon.aps.iva.j0.j0;
import com.amazon.aps.iva.lb0.i0;
import com.amazon.aps.iva.xq.f;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import okhttp3.HttpUrl;
/* compiled from: RumResourceScope.kt */
/* loaded from: classes2.dex */
public final class g implements h {
    public final h a;
    public final String b;
    public final String c;
    public final String d;
    public final com.amazon.aps.iva.l9.a e;
    public final com.amazon.aps.iva.wq.d f;
    public final com.amazon.aps.iva.aq.a g;
    public final String h;
    public final LinkedHashMap i;
    public com.amazon.aps.iva.wq.a j;
    public final com.amazon.aps.iva.vq.a k;
    public final long l;
    public final long m;
    public final com.amazon.aps.iva.eq.a n;
    public boolean o;
    public boolean p;
    public boolean q;
    public com.amazon.aps.iva.sq.h r;
    public Long s;
    public Long t;

    public g(h hVar, String str, String str2, String str3, com.amazon.aps.iva.vq.d dVar, Map<String, ? extends Object> map, long j, com.amazon.aps.iva.l9.a aVar, com.amazon.aps.iva.wq.d dVar2, com.amazon.aps.iva.aq.a aVar2) {
        com.amazon.aps.iva.yb0.j.f(hVar, "parentScope");
        com.amazon.aps.iva.yb0.j.f(str, ImagesContract.URL);
        com.amazon.aps.iva.yb0.j.f(str2, FirebaseAnalytics.Param.METHOD);
        com.amazon.aps.iva.yb0.j.f(str3, "key");
        com.amazon.aps.iva.yb0.j.f(dVar, "eventTime");
        com.amazon.aps.iva.yb0.j.f(map, "initialAttributes");
        this.a = hVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = aVar;
        this.f = dVar2;
        this.g = aVar2;
        this.h = j0.d("randomUUID().toString()");
        LinkedHashMap b0 = i0.b0(map);
        b0.putAll(com.amazon.aps.iva.sq.c.a);
        this.i = b0;
        this.k = hVar.b();
        this.l = dVar.a + j;
        this.m = dVar.b;
        this.n = com.amazon.aps.iva.lp.a.g.g();
        this.r = com.amazon.aps.iva.sq.h.UNKNOWN;
    }

    @Override // com.amazon.aps.iva.xq.h
    public final h a(f fVar, com.amazon.aps.iva.sp.c<Object> cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "writer");
        boolean z = fVar instanceof f.a0;
        String str = this.d;
        if (z) {
            if (com.amazon.aps.iva.yb0.j.a(str, ((f.a0) fVar).a)) {
                this.p = true;
            }
        } else if (fVar instanceof f.C0866f) {
            f.C0866f c0866f = (f.C0866f) fVar;
            if (com.amazon.aps.iva.yb0.j.a(str, c0866f.a)) {
                this.j = c0866f.b;
                if (this.q && !this.o) {
                    d(this.r, this.s, this.t, c0866f.c, cVar);
                }
            }
        } else {
            boolean z2 = fVar instanceof f.v;
            LinkedHashMap linkedHashMap = this.i;
            if (z2) {
                f.v vVar = (f.v) fVar;
                if (com.amazon.aps.iva.yb0.j.a(str, vVar.a)) {
                    this.q = true;
                    linkedHashMap.putAll(vVar.e);
                    com.amazon.aps.iva.sq.h hVar = vVar.d;
                    this.r = hVar;
                    Long l = vVar.b;
                    this.s = l;
                    Long l2 = vVar.c;
                    this.t = l2;
                    if (!this.p || this.j != null) {
                        d(hVar, l, l2, vVar.f, cVar);
                    }
                }
            } else if (fVar instanceof f.w) {
                f.w wVar = (f.w) fVar;
                if (com.amazon.aps.iva.yb0.j.a(str, wVar.a)) {
                    linkedHashMap.putAll(wVar.f);
                    String str2 = wVar.c;
                    com.amazon.aps.iva.sq.e eVar = wVar.d;
                    Long l3 = wVar.b;
                    Throwable th = wVar.e;
                    c(str2, eVar, l3, com.amazon.aps.iva.dg.b.B(th), th.getClass().getCanonicalName(), cVar);
                }
            } else if (fVar instanceof f.x) {
                f.x xVar = (f.x) fVar;
                if (com.amazon.aps.iva.yb0.j.a(str, null)) {
                    linkedHashMap.putAll(null);
                    c(null, null, null, null, null, cVar);
                }
            }
        }
        if (this.o) {
            return null;
        }
        return this;
    }

    @Override // com.amazon.aps.iva.xq.h
    public final com.amazon.aps.iva.vq.a b() {
        return this.k;
    }

    public final void c(String str, com.amazon.aps.iva.sq.e eVar, Long l, String str2, String str3, com.amazon.aps.iva.sp.c<Object> cVar) {
        b.s sVar;
        long longValue;
        boolean f;
        b.v vVar;
        b.a aVar;
        String str4;
        String str5;
        LinkedHashMap linkedHashMap = this.i;
        linkedHashMap.putAll(com.amazon.aps.iva.sq.c.a);
        com.amazon.aps.iva.eq.b b = com.amazon.aps.iva.lp.a.k.b();
        long j = this.l;
        b.p d = e.d(eVar);
        String str6 = this.b;
        String str7 = this.c;
        com.amazon.aps.iva.yb0.j.f(str7, "<this>");
        try {
            Locale locale = Locale.US;
            com.amazon.aps.iva.yb0.j.e(locale, "US");
            String upperCase = str7.toUpperCase(locale);
            com.amazon.aps.iva.yb0.j.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
            sVar = b.s.valueOf(upperCase);
        } catch (IllegalArgumentException e) {
            l1.z(com.amazon.aps.iva.dq.c.a, defpackage.e.e("Unable to convert [", str7, "] to a valid http method"), e, 4);
            sVar = b.s.GET;
        }
        b.s sVar2 = sVar;
        if (l == null) {
            longValue = 0;
        } else {
            longValue = l.longValue();
        }
        long j2 = longValue;
        com.amazon.aps.iva.l9.a aVar2 = this.e;
        aVar2.getClass();
        String str8 = this.b;
        com.amazon.aps.iva.yb0.j.f(str8, ImagesContract.URL);
        HttpUrl parse = HttpUrl.parse(str8);
        if (parse == null) {
            f = false;
        } else {
            f = aVar2.f(parse);
        }
        if (f) {
            try {
                String host = new URL(str8).getHost();
                com.amazon.aps.iva.yb0.j.e(host, "{\n            URL(url).host\n        }");
                str8 = host;
            } catch (MalformedURLException unused) {
            }
            vVar = new b.v(str8, b.w.FIRST_PARTY, 2);
        } else {
            vVar = null;
        }
        b.l lVar = new b.l(str, d, str2, Boolean.FALSE, str3, b.y.ANDROID, new b.x(sVar2, j2, str6, vVar), 193);
        com.amazon.aps.iva.vq.a aVar3 = this.k;
        String str9 = aVar3.f;
        if (str9 == null) {
            aVar = null;
        } else {
            aVar = new b.a(str9);
        }
        String str10 = aVar3.c;
        if (str10 == null) {
            str4 = "";
        } else {
            str4 = str10;
        }
        String str11 = aVar3.d;
        String str12 = aVar3.e;
        if (str12 == null) {
            str5 = "";
        } else {
            str5 = str12;
        }
        b.c0 c0Var = new b.c0(str4, (String) null, str5, str11, 18);
        b.b0 b0Var = new b.b0(b.a, b.b, b.c, b.d);
        b.f b2 = e.b(this.n);
        b.C0276b c0276b = new b.C0276b(aVar3.a);
        b.m mVar = new b.m(aVar3.b, b.n.USER, null);
        b.o oVar = (b.o) this.f.c.getValue();
        com.amazon.aps.iva.aq.a aVar4 = this.g;
        cVar.b(new com.amazon.aps.iva.fr.b(j, c0276b, null, mVar, oVar, c0Var, b0Var, b2, new b.t(aVar4.h(), aVar4.d(), aVar4.g()), new b.j(e.c(aVar4.e()), aVar4.getDeviceName(), aVar4.c(), aVar4.f(), aVar4.a()), new b.h(new b.i(b.u.PLAN_1), 2), new b.g(linkedHashMap), lVar, aVar, 772));
        this.o = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x039f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0407  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(com.amazon.aps.iva.sq.h r38, java.lang.Long r39, java.lang.Long r40, com.amazon.aps.iva.vq.d r41, com.amazon.aps.iva.sp.c<java.lang.Object> r42) {
        /*
            Method dump skipped, instructions count: 1172
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.xq.g.d(com.amazon.aps.iva.sq.h, java.lang.Long, java.lang.Long, com.amazon.aps.iva.vq.d, com.amazon.aps.iva.sp.c):void");
    }

    @Override // com.amazon.aps.iva.xq.h
    public final boolean isActive() {
        return !this.q;
    }
}
