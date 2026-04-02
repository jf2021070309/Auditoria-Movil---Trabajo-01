package e.b.a.a.x;

import e.b.a.a.e;
import e.b.a.a.i;
import e.b.a.a.m;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public class a implements m {
    public final Map<String, i> a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final AtomicLong f5395b = new AtomicLong(0);

    /* renamed from: c  reason: collision with root package name */
    public final TreeSet<i> f5396c = new TreeSet<>(new C0109a(this));

    /* renamed from: d  reason: collision with root package name */
    public final List<String> f5397d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final long f5398e;

    /* renamed from: e.b.a.a.x.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0109a implements Comparator<i> {
        public C0109a(a aVar) {
        }

        @Override // java.util.Comparator
        public int compare(i iVar, i iVar2) {
            i iVar3 = iVar;
            i iVar4 = iVar2;
            int i2 = 0;
            if (iVar3.f5336e.f5329h.equals(iVar4.f5336e.f5329h)) {
                return 0;
            }
            int i3 = iVar3.o;
            int i4 = iVar4.o;
            int i5 = i3 > i4 ? -1 : i4 > i3 ? 1 : 0;
            if (i5 == 0) {
                long j2 = iVar3.f5342k;
                long j3 = iVar4.f5342k;
                i5 = -(j2 > j3 ? -1 : j3 > j2 ? 1 : 0);
                if (i5 == 0) {
                    long longValue = iVar3.f5345n.longValue();
                    long longValue2 = iVar4.f5345n.longValue();
                    if (longValue > longValue2) {
                        i2 = -1;
                    } else if (longValue2 > longValue) {
                        i2 = 1;
                    }
                    return -i2;
                }
            }
            return i5;
        }
    }

    public a(long j2) {
        this.f5398e = j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
        if ((r2 != Long.MAX_VALUE) != false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean l(e.b.a.a.i r7, e.b.a.a.e r8, boolean r9) {
        /*
            long r0 = r8.f5299e
            long r2 = r7.f5343l
            r4 = 0
            r5 = 1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 >= 0) goto L1d
            if (r9 == 0) goto L1b
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 == 0) goto L17
            r9 = 1
            goto L18
        L17:
            r9 = 0
        L18:
            if (r9 == 0) goto L1b
            goto L1d
        L1b:
            r9 = 0
            goto L1e
        L1d:
            r9 = 1
        L1e:
            if (r9 != 0) goto L27
            int r9 = r8.f5298d
            int r0 = r7.f5337f
            if (r9 >= r0) goto L27
            return r4
        L27:
            java.lang.Long r9 = r8.f5302h
            if (r9 == 0) goto L36
            long r0 = r7.f5344m
            long r2 = r9.longValue()
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 <= 0) goto L36
            return r4
        L36:
            java.lang.String r9 = r7.a
            if (r9 == 0) goto L43
            java.util.List<java.lang.String> r0 = r8.a
            boolean r9 = r0.contains(r9)
            if (r9 == 0) goto L43
            return r4
        L43:
            java.util.List<java.lang.String> r9 = r8.f5296b
            java.lang.String r0 = r7.f5333b
            boolean r9 = r9.contains(r0)
            if (r9 == 0) goto L4e
            return r4
        L4e:
            e.b.a.a.s r9 = r8.f5300f
            if (r9 == 0) goto L6b
            java.util.Set<java.lang.String> r9 = r7.f5335d
            if (r9 == 0) goto L6a
            java.util.Set<java.lang.String> r9 = r8.f5301g
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L6a
            e.b.a.a.s r9 = r8.f5300f
            java.util.Set<java.lang.String> r8 = r8.f5301g
            java.util.Set<java.lang.String> r7 = r7.f5335d
            boolean r7 = r9.matches(r8, r7)
            if (r7 != 0) goto L6b
        L6a:
            return r4
        L6b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.a.a.x.a.l(e.b.a.a.i, e.b.a.a.e, boolean):boolean");
    }

    @Override // e.b.a.a.m
    public Set<i> a(e eVar) {
        HashSet hashSet = new HashSet();
        Iterator<i> it = this.f5396c.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (l(next, eVar, false)) {
                hashSet.add(next);
            }
        }
        return hashSet;
    }

    @Override // e.b.a.a.m
    public int b(e eVar) {
        this.f5397d.clear();
        Iterator<i> it = this.f5396c.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i next = it.next();
            String str = next.a;
            if (str == null || !this.f5397d.contains(str)) {
                if (l(next, eVar, false)) {
                    i2++;
                    if (str != null) {
                        this.f5397d.add(str);
                    }
                }
            }
        }
        this.f5397d.clear();
        return i2;
    }

    @Override // e.b.a.a.m
    public void c(i iVar) {
        this.a.remove(iVar.f5333b);
        this.f5396c.remove(iVar);
    }

    @Override // e.b.a.a.m
    public void clear() {
        this.f5396c.clear();
        this.a.clear();
    }

    @Override // e.b.a.a.m
    public void d(i iVar, i iVar2) {
        this.a.remove(iVar2.f5333b);
        this.f5396c.remove(iVar2);
        g(iVar);
    }

    @Override // e.b.a.a.m
    public i e(e eVar) {
        Iterator<i> it = this.f5396c.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (l(next, eVar, false)) {
                this.a.remove(next.f5333b);
                this.f5396c.remove(next);
                next.p++;
                next.q = this.f5398e;
                return next;
            }
        }
        return null;
    }

    @Override // e.b.a.a.m
    public i f(String str) {
        return this.a.get(str);
    }

    @Override // e.b.a.a.m
    public boolean g(i iVar) {
        iVar.b(this.f5395b.incrementAndGet());
        if (this.a.get(iVar.f5333b) == null) {
            this.a.put(iVar.f5333b, iVar);
            this.f5396c.add(iVar);
            return true;
        }
        throw new IllegalArgumentException("cannot add a job with the same id twice");
    }

    @Override // e.b.a.a.m
    public Long h(e eVar) {
        Iterator<i> it = this.f5396c.iterator();
        Long l2 = null;
        while (it.hasNext()) {
            i next = it.next();
            if (l(next, eVar, true)) {
                boolean z = ((next.f5344m > Long.MIN_VALUE ? 1 : (next.f5344m == Long.MIN_VALUE ? 0 : -1)) != 0) && l(next, eVar, false);
                long j2 = next.f5343l;
                boolean z2 = j2 != Long.MAX_VALUE;
                if (z2 == z) {
                    j2 = Math.min(j2, next.f5344m);
                } else if (!z2) {
                    j2 = next.f5344m;
                }
                if (l2 == null || j2 < l2.longValue()) {
                    l2 = Long.valueOf(j2);
                }
            }
        }
        return l2;
    }

    @Override // e.b.a.a.m
    public boolean i(i iVar) {
        if (iVar.f5345n == null) {
            g(iVar);
            return true;
        }
        i iVar2 = this.a.get(iVar.f5333b);
        if (iVar2 != null) {
            this.a.remove(iVar2.f5333b);
            this.f5396c.remove(iVar2);
        }
        this.a.put(iVar.f5333b, iVar);
        this.f5396c.add(iVar);
        return true;
    }

    @Override // e.b.a.a.m
    public void j(i iVar) {
        this.a.remove(iVar.f5333b);
        this.f5396c.remove(iVar);
    }

    @Override // e.b.a.a.m
    public int k() {
        return this.f5396c.size();
    }
}
