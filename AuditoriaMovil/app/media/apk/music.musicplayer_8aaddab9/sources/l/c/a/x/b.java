package l.c.a.x;

import e.j.d.w;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import l.c.a.q;
import l.c.a.t.m;
import l.c.a.x.f;
/* loaded from: classes2.dex */
public final class b extends f implements Serializable {
    public final long[] a;

    /* renamed from: b  reason: collision with root package name */
    public final q[] f9819b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f9820c;

    /* renamed from: d  reason: collision with root package name */
    public final l.c.a.f[] f9821d;

    /* renamed from: e  reason: collision with root package name */
    public final q[] f9822e;

    /* renamed from: f  reason: collision with root package name */
    public final e[] f9823f;

    /* renamed from: g  reason: collision with root package name */
    public final ConcurrentMap<Integer, d[]> f9824g = new ConcurrentHashMap();

    public b(long[] jArr, q[] qVarArr, long[] jArr2, q[] qVarArr2, e[] eVarArr) {
        this.a = jArr;
        this.f9819b = qVarArr;
        this.f9820c = jArr2;
        this.f9822e = qVarArr2;
        this.f9823f = eVarArr;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < jArr2.length) {
            q qVar = qVarArr2[i2];
            int i3 = i2 + 1;
            q qVar2 = qVarArr2[i3];
            l.c.a.f c0 = l.c.a.f.c0(jArr2[i2], 0, qVar);
            int i4 = qVar2.f9708g;
            int i5 = qVar.f9708g;
            if (i4 > i5) {
                arrayList.add(c0);
                arrayList.add(c0.g0(qVar2.f9708g - qVar.f9708g));
            } else {
                arrayList.add(c0.g0(i4 - i5));
                arrayList.add(c0);
            }
            i2 = i3;
        }
        this.f9821d = (l.c.a.f[]) arrayList.toArray(new l.c.a.f[arrayList.size()]);
    }

    private Object writeReplace() {
        return new a((byte) 1, this);
    }

    @Override // l.c.a.x.f
    public q a(l.c.a.d dVar) {
        long[] jArr;
        long j2 = dVar.f9674b;
        if (this.f9823f.length > 0) {
            if (j2 > this.f9820c[jArr.length - 1]) {
                q[] qVarArr = this.f9822e;
                d[] t = t(l.c.a.e.l0(w.G(qVarArr[qVarArr.length - 1].f9708g + j2, 86400L)).f9677c);
                d dVar2 = null;
                for (int i2 = 0; i2 < t.length; i2++) {
                    dVar2 = t[i2];
                    if (j2 < dVar2.a.B(dVar2.f9830b)) {
                        return dVar2.f9830b;
                    }
                }
                return dVar2.f9831c;
            }
        }
        int binarySearch = Arrays.binarySearch(this.f9820c, j2);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return this.f9822e[binarySearch + 1];
    }

    @Override // l.c.a.x.f
    public d b(l.c.a.f fVar) {
        Object u = u(fVar);
        if (u instanceof d) {
            return (d) u;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return (obj instanceof f.a) && h() && a(l.c.a.d.a).equals(((f.a) obj).a);
        }
        b bVar = (b) obj;
        return Arrays.equals(this.a, bVar.a) && Arrays.equals(this.f9819b, bVar.f9819b) && Arrays.equals(this.f9820c, bVar.f9820c) && Arrays.equals(this.f9822e, bVar.f9822e) && Arrays.equals(this.f9823f, bVar.f9823f);
    }

    @Override // l.c.a.x.f
    public List<q> f(l.c.a.f fVar) {
        Object u = u(fVar);
        if (u instanceof d) {
            d dVar = (d) u;
            return dVar.b() ? Collections.emptyList() : Arrays.asList(dVar.f9830b, dVar.f9831c);
        }
        return Collections.singletonList((q) u);
    }

    @Override // l.c.a.x.f
    public boolean h() {
        return this.f9820c.length == 0;
    }

    public int hashCode() {
        return (((Arrays.hashCode(this.a) ^ Arrays.hashCode(this.f9819b)) ^ Arrays.hashCode(this.f9820c)) ^ Arrays.hashCode(this.f9822e)) ^ Arrays.hashCode(this.f9823f);
    }

    @Override // l.c.a.x.f
    public boolean i(l.c.a.f fVar, q qVar) {
        return f(fVar).contains(qVar);
    }

    public final d[] t(int i2) {
        l.c.a.e k0;
        Integer valueOf = Integer.valueOf(i2);
        d[] dVarArr = this.f9824g.get(valueOf);
        if (dVarArr != null) {
            return dVarArr;
        }
        e[] eVarArr = this.f9823f;
        d[] dVarArr2 = new d[eVarArr.length];
        for (int i3 = 0; i3 < eVarArr.length; i3++) {
            e eVar = eVarArr[i3];
            byte b2 = eVar.f9832b;
            if (b2 < 0) {
                l.c.a.h hVar = eVar.a;
                k0 = l.c.a.e.k0(i2, hVar, hVar.length(m.f9736c.K(i2)) + 1 + eVar.f9832b);
                l.c.a.b bVar = eVar.f9833c;
                if (bVar != null) {
                    k0 = k0.b(new l.c.a.w.h(1, bVar, null));
                }
            } else {
                k0 = l.c.a.e.k0(i2, eVar.a, b2);
                l.c.a.b bVar2 = eVar.f9833c;
                if (bVar2 != null) {
                    k0 = k0.b(new l.c.a.w.h(0, bVar2, null));
                }
            }
            dVarArr2[i3] = new d(eVar.f9836f.createDateTime(l.c.a.f.b0(k0.n0(eVar.f9835e), eVar.f9834d), eVar.f9837g, eVar.f9838h), eVar.f9838h, eVar.f9839i);
        }
        if (i2 < 2100) {
            this.f9824g.putIfAbsent(valueOf, dVarArr2);
        }
        return dVarArr2;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("StandardZoneRules[currentStandardOffset=");
        q[] qVarArr = this.f9819b;
        y.append(qVarArr[qVarArr.length - 1]);
        y.append("]");
        return y.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        if (r9.f9682d.Q() <= r0.f9682d.Q()) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r9.Q(r0) > 0) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(l.c.a.f r9) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.c.a.x.b.u(l.c.a.f):java.lang.Object");
    }
}
