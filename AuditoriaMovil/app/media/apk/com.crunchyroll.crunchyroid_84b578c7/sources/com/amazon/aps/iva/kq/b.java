package com.amazon.aps.iva.kq;

import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.gb0.h;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.oq.d;
import com.amazon.aps.iva.pq.a;
import com.amazon.aps.iva.rp.c;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.DateFormatKt;
import com.google.android.gms.ads.AdRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
/* compiled from: LogGenerator.kt */
/* loaded from: classes2.dex */
public final class b {
    public final String a;
    public final String b;
    public final c c;
    public final d d;
    public final com.amazon.aps.iva.cq.c e;
    public final String f;
    public final com.amazon.aps.iva.aq.b g;
    public final SimpleDateFormat h;
    public final String i;
    public final String j;

    public b(String str, String str2, c cVar, com.amazon.aps.iva.oq.b bVar, com.amazon.aps.iva.cq.c cVar2, String str3, String str4, String str5, com.amazon.aps.iva.aq.b bVar2) {
        boolean z;
        String str6;
        j.f(str, "serviceName");
        j.f(str2, "loggerName");
        j.f(bVar, "userInfoProvider");
        j.f(cVar2, "timeProvider");
        j.f(str3, "sdkVersion");
        j.f(str4, "envName");
        j.f(str5, "variant");
        j.f(bVar2, "appVersionProvider");
        this.a = str;
        this.b = str2;
        this.c = cVar;
        this.d = bVar;
        this.e = cVar2;
        this.f = str3;
        this.g = bVar2;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateFormatKt.SECONDARY_DATE_FORMAT, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        this.h = simpleDateFormat;
        if (str4.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str6 = "env:".concat(str4);
        } else {
            str6 = null;
        }
        this.i = str6;
        this.j = str5.length() > 0 ? "variant:".concat(str5) : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [com.amazon.aps.iva.pq.a$d] */
    /* JADX WARN: Type inference failed for: r26v1, types: [com.amazon.aps.iva.pq.a$d] */
    public static com.amazon.aps.iva.pq.a a(b bVar, int i, String str, Throwable th, Map map, Set set, long j, String str2, boolean z, boolean z2, com.amazon.aps.iva.eq.b bVar2, com.amazon.aps.iva.eq.a aVar, int i2) {
        String format;
        a.b bVar3;
        a.f fVar;
        a.e eVar;
        String str3 = (i2 & 64) != 0 ? null : str2;
        boolean z3 = (i2 & 128) != 0 ? true : z;
        boolean z4 = (i2 & 256) != 0 ? true : z2;
        com.amazon.aps.iva.eq.b bVar4 = (i2 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : bVar2;
        com.amazon.aps.iva.eq.a aVar2 = (i2 & 1024) != 0 ? null : aVar;
        bVar.getClass();
        j.f(str, "message");
        j.f(set, "tags");
        long c = bVar.e.c() + j;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        if (z3) {
            h hVar = com.amazon.aps.iva.ib0.a.b;
        }
        if (z4 && com.amazon.aps.iva.sq.c.b.get()) {
            com.amazon.aps.iva.vq.a a = com.amazon.aps.iva.sq.c.a();
            linkedHashMap.put("application_id", a.a);
            linkedHashMap.put("session_id", a.b);
            linkedHashMap.put("view.id", a.c);
            linkedHashMap.put("user_action.id", a.f);
        }
        synchronized (bVar.h) {
            format = bVar.h.format(new Date(c));
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(set);
        String str4 = bVar.i;
        if (str4 != null) {
            linkedHashSet.add(str4);
        }
        String version = bVar.g.getVersion();
        String concat = version.length() > 0 ? "version:".concat(version) : null;
        if (concat != null) {
            linkedHashSet.add(concat);
        }
        String str5 = bVar.j;
        if (str5 != null) {
            linkedHashSet.add(str5);
        }
        if (th == null) {
            bVar3 = null;
        } else {
            String canonicalName = th.getClass().getCanonicalName();
            if (canonicalName == null) {
                canonicalName = th.getClass().getSimpleName();
            }
            bVar3 = new a.b(canonicalName, th.getMessage(), k.G(th));
        }
        if (bVar4 == null) {
            bVar4 = bVar.d.b();
        }
        a.g gVar = new a.g(bVar4.a, bVar4.b, bVar4.c, bVar4.d);
        if (aVar2 == null) {
            c cVar = bVar.c;
            aVar2 = cVar == null ? null : cVar.g();
        }
        if (aVar2 != null) {
            Long l = aVar2.c;
            String str6 = aVar2.b;
            if (l == null && str6 == null) {
                eVar = null;
            } else {
                eVar = new a.e(l == null ? null : l.toString(), str6);
            }
            Long l2 = aVar2.f;
            String l3 = l2 == null ? null : l2.toString();
            Long l4 = aVar2.e;
            String l5 = l4 == null ? null : l4.toString();
            Long l6 = aVar2.d;
            r4 = new a.d(new a.C0625a(eVar, l3, l5, l6 != null ? l6.toString() : null, aVar2.a.toString()));
        }
        String str7 = bVar.b;
        if (str3 == null) {
            str3 = Thread.currentThread().getName();
        }
        a.c cVar2 = new a.c(str7, str3, bVar.f);
        String str8 = bVar.a;
        switch (i) {
            case 2:
                fVar = a.f.TRACE;
                break;
            case 3:
                fVar = a.f.DEBUG;
                break;
            case 4:
                fVar = a.f.INFO;
                break;
            case 5:
                fVar = a.f.WARN;
                break;
            case 6:
                fVar = a.f.ERROR;
                break;
            case 7:
                fVar = a.f.CRITICAL;
                break;
            case 8:
            default:
                fVar = a.f.DEBUG;
                break;
            case 9:
                fVar = a.f.EMERGENCY;
                break;
        }
        String B0 = x.B0(linkedHashSet, ",", null, null, null, 62);
        j.e(format, "formattedDate");
        return new com.amazon.aps.iva.pq.a(fVar, str8, str, format, cVar2, gVar, r4, bVar3, B0, linkedHashMap);
    }
}
