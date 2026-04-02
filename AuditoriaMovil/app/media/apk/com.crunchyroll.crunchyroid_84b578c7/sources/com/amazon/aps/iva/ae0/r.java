package com.amazon.aps.iva.ae0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: DeserializedPackageFragmentImpl.kt */
/* loaded from: classes4.dex */
public abstract class r extends p {
    public final com.amazon.aps.iva.kd0.a h;
    public final com.amazon.aps.iva.ce0.j i;
    public final com.amazon.aps.iva.kd0.d j;
    public final d0 k;
    public com.amazon.aps.iva.id0.l l;
    public com.amazon.aps.iva.ce0.m m;

    /* compiled from: DeserializedPackageFragmentImpl.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Collection<? extends com.amazon.aps.iva.nd0.f>> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Collection<? extends com.amazon.aps.iva.nd0.f> invoke() {
            boolean z;
            ArrayList arrayList = new ArrayList();
            for (Object obj : r.this.k.d.keySet()) {
                com.amazon.aps.iva.nd0.b bVar = (com.amazon.aps.iva.nd0.b) obj;
                if (!bVar.k() && !j.c.contains(bVar)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(arrayList));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((com.amazon.aps.iva.nd0.b) it.next()).j());
            }
            return arrayList2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.amazon.aps.iva.nd0.c cVar, com.amazon.aps.iva.de0.l lVar, com.amazon.aps.iva.oc0.c0 c0Var, com.amazon.aps.iva.id0.l lVar2, com.amazon.aps.iva.kd0.a aVar) {
        super(cVar, lVar, c0Var);
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        com.amazon.aps.iva.yb0.j.f(lVar, "storageManager");
        com.amazon.aps.iva.yb0.j.f(c0Var, "module");
        this.h = aVar;
        this.i = null;
        com.amazon.aps.iva.id0.o oVar = lVar2.e;
        com.amazon.aps.iva.yb0.j.e(oVar, "proto.strings");
        com.amazon.aps.iva.id0.n nVar = lVar2.f;
        com.amazon.aps.iva.yb0.j.e(nVar, "proto.qualifiedNames");
        com.amazon.aps.iva.kd0.d dVar = new com.amazon.aps.iva.kd0.d(oVar, nVar);
        this.j = dVar;
        this.k = new d0(lVar2, dVar, aVar, new q(this));
        this.l = lVar2;
    }

    @Override // com.amazon.aps.iva.ae0.p
    public final d0 E0() {
        return this.k;
    }

    public final void G0(l lVar) {
        com.amazon.aps.iva.id0.l lVar2 = this.l;
        if (lVar2 != null) {
            this.l = null;
            com.amazon.aps.iva.id0.k kVar = lVar2.g;
            com.amazon.aps.iva.yb0.j.e(kVar, "proto.`package`");
            com.amazon.aps.iva.kd0.d dVar = this.j;
            com.amazon.aps.iva.kd0.a aVar = this.h;
            com.amazon.aps.iva.ce0.j jVar = this.i;
            this.m = new com.amazon.aps.iva.ce0.m(this, kVar, dVar, aVar, jVar, lVar, "scope of " + this, new a());
            return;
        }
        throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize".toString());
    }

    @Override // com.amazon.aps.iva.oc0.f0
    public final com.amazon.aps.iva.xd0.i l() {
        com.amazon.aps.iva.ce0.m mVar = this.m;
        if (mVar != null) {
            return mVar;
        }
        com.amazon.aps.iva.yb0.j.m("_memberScope");
        throw null;
    }
}
