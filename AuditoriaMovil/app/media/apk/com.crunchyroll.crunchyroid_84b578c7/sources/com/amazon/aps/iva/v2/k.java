package com.amazon.aps.iva.v2;

import com.amazon.aps.iva.v2.f;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: HelperReferences.java */
/* loaded from: classes.dex */
public final class k extends p {
    @Override // com.amazon.aps.iva.v2.p, com.amazon.aps.iva.v2.d
    public final void a(d dVar) {
        com.amazon.aps.iva.u2.a aVar = (com.amazon.aps.iva.u2.a) this.b;
        int i = aVar.u0;
        f fVar = this.h;
        Iterator it = fVar.l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((f) it.next()).g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i != 0 && i != 2) {
            fVar.d(i2 + aVar.w0);
        } else {
            fVar.d(i3 + aVar.w0);
        }
    }

    @Override // com.amazon.aps.iva.v2.p
    public final void d() {
        com.amazon.aps.iva.u2.e eVar = this.b;
        if (eVar instanceof com.amazon.aps.iva.u2.a) {
            f fVar = this.h;
            fVar.b = true;
            com.amazon.aps.iva.u2.a aVar = (com.amazon.aps.iva.u2.a) eVar;
            int i = aVar.u0;
            boolean z = aVar.v0;
            ArrayList arrayList = fVar.l;
            int i2 = 0;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            fVar.e = f.a.BOTTOM;
                            while (i2 < aVar.t0) {
                                com.amazon.aps.iva.u2.e eVar2 = aVar.s0[i2];
                                if (z || eVar2.j0 != 8) {
                                    f fVar2 = eVar2.e.i;
                                    fVar2.k.add(fVar);
                                    arrayList.add(fVar2);
                                }
                                i2++;
                            }
                            m(this.b.e.h);
                            m(this.b.e.i);
                            return;
                        }
                        return;
                    }
                    fVar.e = f.a.TOP;
                    while (i2 < aVar.t0) {
                        com.amazon.aps.iva.u2.e eVar3 = aVar.s0[i2];
                        if (z || eVar3.j0 != 8) {
                            f fVar3 = eVar3.e.h;
                            fVar3.k.add(fVar);
                            arrayList.add(fVar3);
                        }
                        i2++;
                    }
                    m(this.b.e.h);
                    m(this.b.e.i);
                    return;
                }
                fVar.e = f.a.RIGHT;
                while (i2 < aVar.t0) {
                    com.amazon.aps.iva.u2.e eVar4 = aVar.s0[i2];
                    if (z || eVar4.j0 != 8) {
                        f fVar4 = eVar4.d.i;
                        fVar4.k.add(fVar);
                        arrayList.add(fVar4);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            fVar.e = f.a.LEFT;
            while (i2 < aVar.t0) {
                com.amazon.aps.iva.u2.e eVar5 = aVar.s0[i2];
                if (z || eVar5.j0 != 8) {
                    f fVar5 = eVar5.d.h;
                    fVar5.k.add(fVar);
                    arrayList.add(fVar5);
                }
                i2++;
            }
            m(this.b.d.h);
            m(this.b.d.i);
        }
    }

    @Override // com.amazon.aps.iva.v2.p
    public final void e() {
        com.amazon.aps.iva.u2.e eVar = this.b;
        if (eVar instanceof com.amazon.aps.iva.u2.a) {
            int i = ((com.amazon.aps.iva.u2.a) eVar).u0;
            f fVar = this.h;
            if (i != 0 && i != 1) {
                eVar.c0 = fVar.g;
            } else {
                eVar.b0 = fVar.g;
            }
        }
    }

    @Override // com.amazon.aps.iva.v2.p
    public final void f() {
        this.c = null;
        this.h.c();
    }

    @Override // com.amazon.aps.iva.v2.p
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.h;
        fVar2.k.add(fVar);
        fVar.l.add(fVar2);
    }
}
