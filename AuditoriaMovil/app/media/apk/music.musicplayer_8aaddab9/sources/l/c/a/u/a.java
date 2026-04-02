package l.c.a.u;

import ch.qos.logback.core.CoreConstants;
import e.j.d.w;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;
import l.c.a.p;
import l.c.a.t.m;
import l.c.a.u.b;
/* loaded from: classes2.dex */
public final class a {
    public static final a a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f9759b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f9760c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f9761d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f9762e;

    /* renamed from: f  reason: collision with root package name */
    public final b.d f9763f;

    /* renamed from: g  reason: collision with root package name */
    public final Locale f9764g;

    /* renamed from: h  reason: collision with root package name */
    public final h f9765h;

    /* renamed from: i  reason: collision with root package name */
    public final i f9766i;

    /* renamed from: j  reason: collision with root package name */
    public final Set<l.c.a.w.i> f9767j;

    /* renamed from: k  reason: collision with root package name */
    public final l.c.a.t.h f9768k;

    /* renamed from: l  reason: collision with root package name */
    public final p f9769l;

    static {
        b bVar = new b();
        l.c.a.w.a aVar = l.c.a.w.a.YEAR;
        j jVar = j.EXCEEDS_PAD;
        b i2 = bVar.i(aVar, 4, 10, jVar);
        i2.c(CoreConstants.DASH_CHAR);
        l.c.a.w.a aVar2 = l.c.a.w.a.MONTH_OF_YEAR;
        i2.h(aVar2, 2);
        i2.c(CoreConstants.DASH_CHAR);
        l.c.a.w.a aVar3 = l.c.a.w.a.DAY_OF_MONTH;
        i2.h(aVar3, 2);
        i iVar = i.STRICT;
        a n2 = i2.n(iVar);
        m mVar = m.f9736c;
        a b2 = n2.b(mVar);
        a = b2;
        b bVar2 = new b();
        b.j jVar2 = b.j.INSENSITIVE;
        bVar2.b(jVar2);
        bVar2.a(b2);
        b.i iVar2 = b.i.f9786b;
        bVar2.b(iVar2);
        bVar2.n(iVar).b(mVar);
        b bVar3 = new b();
        bVar3.b(jVar2);
        bVar3.a(b2);
        bVar3.k();
        bVar3.b(iVar2);
        bVar3.n(iVar).b(mVar);
        b bVar4 = new b();
        l.c.a.w.a aVar4 = l.c.a.w.a.HOUR_OF_DAY;
        bVar4.h(aVar4, 2);
        bVar4.c(CoreConstants.COLON_CHAR);
        l.c.a.w.a aVar5 = l.c.a.w.a.MINUTE_OF_HOUR;
        bVar4.h(aVar5, 2);
        bVar4.k();
        bVar4.c(CoreConstants.COLON_CHAR);
        l.c.a.w.a aVar6 = l.c.a.w.a.SECOND_OF_MINUTE;
        bVar4.h(aVar6, 2);
        bVar4.k();
        bVar4.b(new b.f(l.c.a.w.a.NANO_OF_SECOND, 0, 9, true));
        a n3 = bVar4.n(iVar);
        f9759b = n3;
        b bVar5 = new b();
        bVar5.b(jVar2);
        bVar5.a(n3);
        bVar5.b(iVar2);
        bVar5.n(iVar);
        b bVar6 = new b();
        bVar6.b(jVar2);
        bVar6.a(n3);
        bVar6.k();
        bVar6.b(iVar2);
        bVar6.n(iVar);
        b bVar7 = new b();
        bVar7.b(jVar2);
        bVar7.a(b2);
        bVar7.c('T');
        bVar7.a(n3);
        a b3 = bVar7.n(iVar).b(mVar);
        f9760c = b3;
        b bVar8 = new b();
        bVar8.b(jVar2);
        bVar8.a(b3);
        bVar8.b(iVar2);
        a b4 = bVar8.n(iVar).b(mVar);
        f9761d = b4;
        b bVar9 = new b();
        bVar9.a(b4);
        bVar9.k();
        bVar9.c('[');
        b.j jVar3 = b.j.SENSITIVE;
        bVar9.b(jVar3);
        l.c.a.w.k<p> kVar = b.a;
        bVar9.b(new b.m(kVar, "ZoneRegionId()"));
        bVar9.c(']');
        bVar9.n(iVar).b(mVar);
        b bVar10 = new b();
        bVar10.a(b3);
        bVar10.k();
        bVar10.b(iVar2);
        bVar10.k();
        bVar10.c('[');
        bVar10.b(jVar3);
        bVar10.b(new b.m(kVar, "ZoneRegionId()"));
        bVar10.c(']');
        bVar10.n(iVar).b(mVar);
        b bVar11 = new b();
        bVar11.b(jVar2);
        b i3 = bVar11.i(aVar, 4, 10, jVar);
        i3.c(CoreConstants.DASH_CHAR);
        i3.h(l.c.a.w.a.DAY_OF_YEAR, 3);
        i3.k();
        i3.b(iVar2);
        i3.n(iVar).b(mVar);
        b bVar12 = new b();
        bVar12.b(jVar2);
        b i4 = bVar12.i(l.c.a.w.c.f9805c, 4, 10, jVar);
        i4.d("-W");
        i4.h(l.c.a.w.c.f9804b, 2);
        i4.c(CoreConstants.DASH_CHAR);
        l.c.a.w.a aVar7 = l.c.a.w.a.DAY_OF_WEEK;
        i4.h(aVar7, 1);
        i4.k();
        i4.b(iVar2);
        i4.n(iVar).b(mVar);
        b bVar13 = new b();
        bVar13.b(jVar2);
        bVar13.b(new b.g(-2));
        f9762e = bVar13.n(iVar);
        b bVar14 = new b();
        bVar14.b(jVar2);
        bVar14.h(aVar, 4);
        bVar14.h(aVar2, 2);
        bVar14.h(aVar3, 2);
        bVar14.k();
        bVar14.b(new b.i("Z", "+HHMMss"));
        bVar14.n(iVar).b(mVar);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        b bVar15 = new b();
        bVar15.b(jVar2);
        bVar15.b(b.j.LENIENT);
        bVar15.k();
        bVar15.e(aVar7, hashMap);
        bVar15.d(", ");
        bVar15.j();
        b i5 = bVar15.i(aVar3, 1, 2, j.NOT_NEGATIVE);
        i5.c(' ');
        i5.e(aVar2, hashMap2);
        i5.c(' ');
        i5.h(aVar, 4);
        i5.c(' ');
        i5.h(aVar4, 2);
        i5.c(CoreConstants.COLON_CHAR);
        i5.h(aVar5, 2);
        i5.k();
        i5.c(CoreConstants.COLON_CHAR);
        i5.h(aVar6, 2);
        i5.j();
        i5.c(' ');
        i5.b(new b.i("GMT", "+HHMM"));
        i5.n(i.SMART).b(mVar);
    }

    public a(b.d dVar, Locale locale, h hVar, i iVar, Set<l.c.a.w.i> set, l.c.a.t.h hVar2, p pVar) {
        w.k0(dVar, "printerParser");
        this.f9763f = dVar;
        w.k0(locale, "locale");
        this.f9764g = locale;
        w.k0(hVar, "decimalStyle");
        this.f9765h = hVar;
        w.k0(iVar, "resolverStyle");
        this.f9766i = iVar;
        this.f9767j = set;
        this.f9768k = hVar2;
        this.f9769l = pVar;
    }

    public String a(l.c.a.w.e eVar) {
        StringBuilder sb = new StringBuilder(32);
        w.k0(eVar, "temporal");
        w.k0(sb, "appendable");
        try {
            this.f9763f.print(new f(eVar, this), sb);
            return sb.toString();
        } catch (IOException e2) {
            throw new l.c.a.a(e2.getMessage(), e2);
        }
    }

    public a b(l.c.a.t.h hVar) {
        return w.C(this.f9768k, hVar) ? this : new a(this.f9763f, this.f9764g, this.f9765h, this.f9766i, this.f9767j, hVar, this.f9769l);
    }

    public String toString() {
        String dVar = this.f9763f.toString();
        return dVar.startsWith("[") ? dVar : dVar.substring(1, dVar.length() - 1);
    }
}
