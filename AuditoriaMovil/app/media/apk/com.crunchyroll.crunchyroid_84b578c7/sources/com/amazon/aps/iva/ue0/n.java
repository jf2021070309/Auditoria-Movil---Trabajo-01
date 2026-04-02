package com.amazon.aps.iva.ue0;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ue0.b;
import java.util.ArrayList;
/* compiled from: LinkedListChannel.kt */
/* loaded from: classes4.dex */
public final class n<E> extends a<E> {
    @Override // com.amazon.aps.iva.ue0.b
    public final boolean k() {
        return false;
    }

    @Override // com.amazon.aps.iva.ue0.b
    public final boolean l() {
        return false;
    }

    @Override // com.amazon.aps.iva.ue0.b
    public final Object m(E e) {
        t tVar;
        do {
            Object m = super.m(e);
            com.amazon.aps.iva.xe0.s sVar = com.amazon.aps.iva.a0.k.f;
            if (m == sVar) {
                return sVar;
            }
            if (m == com.amazon.aps.iva.a0.k.g) {
                com.amazon.aps.iva.xe0.g gVar = this.c;
                b.a aVar = new b.a(e);
                while (true) {
                    com.amazon.aps.iva.xe0.h k = gVar.k();
                    if (k instanceof t) {
                        tVar = (t) k;
                        break;
                    } else if (k.f(aVar, gVar)) {
                        tVar = null;
                        break;
                    }
                }
                if (tVar == null) {
                    return sVar;
                }
            } else if (m instanceof j) {
                return m;
            } else {
                throw new IllegalStateException(("Invalid offerInternal result " + m).toString());
            }
        } while (!(tVar instanceof j));
        return tVar;
    }

    @Override // com.amazon.aps.iva.ue0.a
    public final boolean t() {
        return true;
    }

    @Override // com.amazon.aps.iva.ue0.a
    public final boolean v() {
        return true;
    }

    @Override // com.amazon.aps.iva.ue0.a
    public final void z(Object obj, j<?> jVar) {
        com.amazon.aps.iva.xe0.y yVar = null;
        if (obj != null) {
            boolean z = obj instanceof ArrayList;
            com.amazon.aps.iva.xb0.l<E, com.amazon.aps.iva.kb0.q> lVar = this.b;
            if (!z) {
                v vVar = (v) obj;
                if (vVar instanceof b.a) {
                    if (lVar != null) {
                        yVar = f1.m(lVar, ((b.a) vVar).e, null);
                    }
                } else {
                    vVar.s(jVar);
                }
            } else {
                ArrayList arrayList = (ArrayList) obj;
                com.amazon.aps.iva.xe0.y yVar2 = null;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    v vVar2 = (v) arrayList.get(size);
                    if (vVar2 instanceof b.a) {
                        if (lVar != null) {
                            yVar2 = f1.m(lVar, ((b.a) vVar2).e, yVar2);
                        } else {
                            yVar2 = null;
                        }
                    } else {
                        vVar2.s(jVar);
                    }
                }
                yVar = yVar2;
            }
        }
        if (yVar == null) {
            return;
        }
        throw yVar;
    }
}
