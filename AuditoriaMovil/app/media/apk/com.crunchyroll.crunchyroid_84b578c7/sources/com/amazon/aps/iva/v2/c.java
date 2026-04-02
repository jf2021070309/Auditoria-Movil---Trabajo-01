package com.amazon.aps.iva.v2;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ChainRun.java */
/* loaded from: classes.dex */
public final class c extends p {
    public final ArrayList<p> k;
    public int l;

    public c(int i, com.amazon.aps.iva.u2.e eVar) {
        super(eVar);
        p pVar;
        boolean z;
        int i2;
        p pVar2;
        this.k = new ArrayList<>();
        this.f = i;
        com.amazon.aps.iva.u2.e eVar2 = this.b;
        com.amazon.aps.iva.u2.e n = eVar2.n(i);
        while (n != null) {
            eVar2 = n;
            n = n.n(this.f);
        }
        this.b = eVar2;
        int i3 = this.f;
        if (i3 == 0) {
            pVar = eVar2.d;
        } else if (i3 == 1) {
            pVar = eVar2.e;
        } else {
            pVar = null;
        }
        ArrayList<p> arrayList = this.k;
        arrayList.add(pVar);
        com.amazon.aps.iva.u2.e m = eVar2.m(this.f);
        while (m != null) {
            int i4 = this.f;
            if (i4 == 0) {
                pVar2 = m.d;
            } else if (i4 == 1) {
                pVar2 = m.e;
            } else {
                pVar2 = null;
            }
            arrayList.add(pVar2);
            m = m.m(this.f);
        }
        Iterator<p> it = arrayList.iterator();
        while (it.hasNext()) {
            p next = it.next();
            int i5 = this.f;
            if (i5 == 0) {
                next.b.b = this;
            } else if (i5 == 1) {
                next.b.c = this;
            }
        }
        if (this.f == 0 && ((com.amazon.aps.iva.u2.f) this.b.W).x0) {
            z = true;
        } else {
            z = false;
        }
        if (z && arrayList.size() > 1) {
            this.b = arrayList.get(arrayList.size() - 1).b;
        }
        if (this.f == 0) {
            i2 = this.b.l0;
        } else {
            i2 = this.b.m0;
        }
        this.l = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:271:0x03b1, code lost:
        r2 = r2 - r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    @Override // com.amazon.aps.iva.v2.p, com.amazon.aps.iva.v2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.amazon.aps.iva.v2.d r27) {
        /*
            Method dump skipped, instructions count: 976
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.v2.c.a(com.amazon.aps.iva.v2.d):void");
    }

    @Override // com.amazon.aps.iva.v2.p
    public final void d() {
        ArrayList<p> arrayList = this.k;
        Iterator<p> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        com.amazon.aps.iva.u2.e eVar = arrayList.get(0).b;
        com.amazon.aps.iva.u2.e eVar2 = arrayList.get(size - 1).b;
        int i = this.f;
        f fVar = this.i;
        f fVar2 = this.h;
        if (i == 0) {
            com.amazon.aps.iva.u2.d dVar = eVar.K;
            com.amazon.aps.iva.u2.d dVar2 = eVar2.M;
            f i2 = p.i(dVar, 0);
            int e = dVar.e();
            com.amazon.aps.iva.u2.e m = m();
            if (m != null) {
                e = m.K.e();
            }
            if (i2 != null) {
                p.b(fVar2, i2, e);
            }
            f i3 = p.i(dVar2, 0);
            int e2 = dVar2.e();
            com.amazon.aps.iva.u2.e n = n();
            if (n != null) {
                e2 = n.M.e();
            }
            if (i3 != null) {
                p.b(fVar, i3, -e2);
            }
        } else {
            com.amazon.aps.iva.u2.d dVar3 = eVar.L;
            com.amazon.aps.iva.u2.d dVar4 = eVar2.N;
            f i4 = p.i(dVar3, 1);
            int e3 = dVar3.e();
            com.amazon.aps.iva.u2.e m2 = m();
            if (m2 != null) {
                e3 = m2.L.e();
            }
            if (i4 != null) {
                p.b(fVar2, i4, e3);
            }
            f i5 = p.i(dVar4, 1);
            int e4 = dVar4.e();
            com.amazon.aps.iva.u2.e n2 = n();
            if (n2 != null) {
                e4 = n2.N.e();
            }
            if (i5 != null) {
                p.b(fVar, i5, -e4);
            }
        }
        fVar2.a = this;
        fVar.a = this;
    }

    @Override // com.amazon.aps.iva.v2.p
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList<p> arrayList = this.k;
            if (i < arrayList.size()) {
                arrayList.get(i).e();
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.amazon.aps.iva.v2.p
    public final void f() {
        this.c = null;
        Iterator<p> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // com.amazon.aps.iva.v2.p
    public final long j() {
        ArrayList<p> arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            p pVar = arrayList.get(i);
            j = pVar.i.f + pVar.j() + j + pVar.h.f;
        }
        return j;
    }

    @Override // com.amazon.aps.iva.v2.p
    public final boolean k() {
        ArrayList<p> arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!arrayList.get(i).k()) {
                return false;
            }
        }
        return true;
    }

    public final com.amazon.aps.iva.u2.e m() {
        int i = 0;
        while (true) {
            ArrayList<p> arrayList = this.k;
            if (i < arrayList.size()) {
                com.amazon.aps.iva.u2.e eVar = arrayList.get(i).b;
                if (eVar.j0 != 8) {
                    return eVar;
                }
                i++;
            } else {
                return null;
            }
        }
    }

    public final com.amazon.aps.iva.u2.e n() {
        ArrayList<p> arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            com.amazon.aps.iva.u2.e eVar = arrayList.get(size).b;
            if (eVar.j0 != 8) {
                return eVar;
            }
        }
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ChainRun ");
        if (this.f == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        sb.append(str);
        Iterator<p> it = this.k.iterator();
        while (it.hasNext()) {
            sb.append("<");
            sb.append(it.next());
            sb.append("> ");
        }
        return sb.toString();
    }
}
