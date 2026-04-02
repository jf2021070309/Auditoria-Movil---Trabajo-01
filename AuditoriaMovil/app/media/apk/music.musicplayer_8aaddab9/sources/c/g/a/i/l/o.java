package c.g.a.i.l;

import c.g.a.i.d;
/* loaded from: classes.dex */
public abstract class o implements d {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public c.g.a.i.d f1798b;

    /* renamed from: c  reason: collision with root package name */
    public l f1799c;

    /* renamed from: d  reason: collision with root package name */
    public d.a f1800d;

    /* renamed from: e  reason: collision with root package name */
    public g f1801e = new g(this);

    /* renamed from: f  reason: collision with root package name */
    public int f1802f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1803g = false;

    /* renamed from: h  reason: collision with root package name */
    public f f1804h = new f(this);

    /* renamed from: i  reason: collision with root package name */
    public f f1805i = new f(this);

    /* renamed from: j  reason: collision with root package name */
    public a f1806j = a.NONE;

    /* loaded from: classes.dex */
    public enum a {
        NONE,
        START,
        END,
        CENTER
    }

    public o(c.g.a.i.d dVar) {
        this.f1798b = dVar;
    }

    @Override // c.g.a.i.l.d
    public void a(d dVar) {
    }

    public final void b(f fVar, f fVar2, int i2) {
        fVar.f1784l.add(fVar2);
        fVar.f1778f = i2;
        fVar2.f1783k.add(fVar);
    }

    public final void c(f fVar, f fVar2, int i2, g gVar) {
        fVar.f1784l.add(fVar2);
        fVar.f1784l.add(this.f1801e);
        fVar.f1780h = i2;
        fVar.f1781i = gVar;
        fVar2.f1783k.add(fVar);
        gVar.f1783k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i2, int i3) {
        int max;
        if (i3 == 0) {
            c.g.a.i.d dVar = this.f1798b;
            int i4 = dVar.v;
            max = Math.max(dVar.u, i2);
            if (i4 > 0) {
                max = Math.min(i4, i2);
            }
            if (max == i2) {
                return i2;
            }
        } else {
            c.g.a.i.d dVar2 = this.f1798b;
            int i5 = dVar2.y;
            max = Math.max(dVar2.x, i2);
            if (i5 > 0) {
                max = Math.min(i5, i2);
            }
            if (max == i2) {
                return i2;
            }
        }
        return max;
    }

    public final f h(c.g.a.i.c cVar) {
        c.g.a.i.c cVar2 = cVar.f1737f;
        if (cVar2 == null) {
            return null;
        }
        c.g.a.i.d dVar = cVar2.f1735d;
        int ordinal = cVar2.f1736e.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal != 5) {
                            return null;
                        }
                        return dVar.f1744e.f1791k;
                    }
                    return dVar.f1744e.f1805i;
                }
                return dVar.f1743d.f1805i;
            }
            return dVar.f1744e.f1804h;
        }
        return dVar.f1743d.f1804h;
    }

    public final f i(c.g.a.i.c cVar, int i2) {
        c.g.a.i.c cVar2 = cVar.f1737f;
        if (cVar2 == null) {
            return null;
        }
        c.g.a.i.d dVar = cVar2.f1735d;
        o oVar = i2 == 0 ? dVar.f1743d : dVar.f1744e;
        int ordinal = cVar2.f1736e.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return oVar.f1804h;
        }
        if (ordinal == 3 || ordinal == 4) {
            return oVar.f1805i;
        }
        return null;
    }

    public long j() {
        g gVar = this.f1801e;
        if (gVar.f1782j) {
            return gVar.f1779g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
        if (r10.a == 3) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(c.g.a.i.c r13, c.g.a.i.c r14, int r15) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.g.a.i.l.o.l(c.g.a.i.c, c.g.a.i.c, int):void");
    }
}
