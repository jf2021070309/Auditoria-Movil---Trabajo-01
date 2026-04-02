package c.g.a.i.l;

import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class c extends o {

    /* renamed from: k  reason: collision with root package name */
    public ArrayList<o> f1765k;

    /* renamed from: l  reason: collision with root package name */
    public int f1766l;

    public c(c.g.a.i.d dVar, int i2) {
        super(dVar);
        c.g.a.i.d dVar2;
        this.f1765k = new ArrayList<>();
        this.f1802f = i2;
        c.g.a.i.d dVar3 = this.f1798b;
        c.g.a.i.d o = dVar3.o(i2);
        while (true) {
            c.g.a.i.d dVar4 = o;
            dVar2 = dVar3;
            dVar3 = dVar4;
            if (dVar3 == null) {
                break;
            }
            o = dVar3.o(this.f1802f);
        }
        this.f1798b = dVar2;
        ArrayList<o> arrayList = this.f1765k;
        int i3 = this.f1802f;
        arrayList.add(i3 == 0 ? dVar2.f1743d : i3 == 1 ? dVar2.f1744e : null);
        c.g.a.i.d n2 = dVar2.n(this.f1802f);
        while (n2 != null) {
            ArrayList<o> arrayList2 = this.f1765k;
            int i4 = this.f1802f;
            arrayList2.add(i4 == 0 ? n2.f1743d : i4 == 1 ? n2.f1744e : null);
            n2 = n2.n(this.f1802f);
        }
        Iterator<o> it = this.f1765k.iterator();
        while (it.hasNext()) {
            o next = it.next();
            int i5 = this.f1802f;
            if (i5 == 0) {
                next.f1798b.f1741b = this;
            } else if (i5 == 1) {
                next.f1798b.f1742c = this;
            }
        }
        if ((this.f1802f == 0 && ((c.g.a.i.e) this.f1798b.V).w0) && this.f1765k.size() > 1) {
            ArrayList<o> arrayList3 = this.f1765k;
            this.f1798b = arrayList3.get(arrayList3.size() - 1).f1798b;
        }
        this.f1766l = this.f1802f == 0 ? this.f1798b.k0 : this.f1798b.l0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:271:0x03d1, code lost:
        r7 = r7 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d8  */
    @Override // c.g.a.i.l.o, c.g.a.i.l.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(c.g.a.i.l.d r26) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.g.a.i.l.c.a(c.g.a.i.l.d):void");
    }

    @Override // c.g.a.i.l.o
    public void d() {
        Iterator<o> it = this.f1765k.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = this.f1765k.size();
        if (size < 1) {
            return;
        }
        c.g.a.i.d dVar = this.f1765k.get(0).f1798b;
        c.g.a.i.d dVar2 = this.f1765k.get(size - 1).f1798b;
        if (this.f1802f == 0) {
            c.g.a.i.c cVar = dVar.J;
            c.g.a.i.c cVar2 = dVar2.L;
            f i2 = i(cVar, 0);
            int d2 = cVar.d();
            c.g.a.i.d m2 = m();
            if (m2 != null) {
                d2 = m2.J.d();
            }
            if (i2 != null) {
                f fVar = this.f1804h;
                fVar.f1784l.add(i2);
                fVar.f1778f = d2;
                i2.f1783k.add(fVar);
            }
            f i3 = i(cVar2, 0);
            int d3 = cVar2.d();
            c.g.a.i.d n2 = n();
            if (n2 != null) {
                d3 = n2.L.d();
            }
            if (i3 != null) {
                f fVar2 = this.f1805i;
                fVar2.f1784l.add(i3);
                fVar2.f1778f = -d3;
                i3.f1783k.add(fVar2);
            }
        } else {
            c.g.a.i.c cVar3 = dVar.K;
            c.g.a.i.c cVar4 = dVar2.M;
            f i4 = i(cVar3, 1);
            int d4 = cVar3.d();
            c.g.a.i.d m3 = m();
            if (m3 != null) {
                d4 = m3.K.d();
            }
            if (i4 != null) {
                f fVar3 = this.f1804h;
                fVar3.f1784l.add(i4);
                fVar3.f1778f = d4;
                i4.f1783k.add(fVar3);
            }
            f i5 = i(cVar4, 1);
            int d5 = cVar4.d();
            c.g.a.i.d n3 = n();
            if (n3 != null) {
                d5 = n3.M.d();
            }
            if (i5 != null) {
                f fVar4 = this.f1805i;
                fVar4.f1784l.add(i5);
                fVar4.f1778f = -d5;
                i5.f1783k.add(fVar4);
            }
        }
        this.f1804h.a = this;
        this.f1805i.a = this;
    }

    @Override // c.g.a.i.l.o
    public void e() {
        for (int i2 = 0; i2 < this.f1765k.size(); i2++) {
            this.f1765k.get(i2).e();
        }
    }

    @Override // c.g.a.i.l.o
    public void f() {
        this.f1799c = null;
        Iterator<o> it = this.f1765k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // c.g.a.i.l.o
    public long j() {
        int size = this.f1765k.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            o oVar = this.f1765k.get(i2);
            j2 = oVar.f1805i.f1778f + oVar.j() + j2 + oVar.f1804h.f1778f;
        }
        return j2;
    }

    @Override // c.g.a.i.l.o
    public boolean k() {
        int size = this.f1765k.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!this.f1765k.get(i2).k()) {
                return false;
            }
        }
        return true;
    }

    public final c.g.a.i.d m() {
        for (int i2 = 0; i2 < this.f1765k.size(); i2++) {
            c.g.a.i.d dVar = this.f1765k.get(i2).f1798b;
            if (dVar.i0 != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final c.g.a.i.d n() {
        for (int size = this.f1765k.size() - 1; size >= 0; size--) {
            c.g.a.i.d dVar = this.f1765k.get(size).f1798b;
            if (dVar.i0 != 8) {
                return dVar;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f1802f == 0 ? "horizontal : " : "vertical : ");
        Iterator<o> it = this.f1765k.iterator();
        while (it.hasNext()) {
            sb.append("<");
            sb.append(it.next());
            sb.append("> ");
        }
        return sb.toString();
    }
}
