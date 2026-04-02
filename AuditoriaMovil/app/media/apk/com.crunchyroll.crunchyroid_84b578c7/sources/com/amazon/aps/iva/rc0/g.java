package com.amazon.aps.iva.rc0;

import com.amazon.aps.iva.ee0.c1;
import com.amazon.aps.iva.oc0.y0;
import java.util.Collection;
import java.util.List;
/* compiled from: AbstractTypeAliasDescriptor.kt */
/* loaded from: classes4.dex */
public final class g implements c1 {
    public final /* synthetic */ f a;

    public g(f fVar) {
        this.a = fVar;
    }

    @Override // com.amazon.aps.iva.ee0.c1
    public final Collection<com.amazon.aps.iva.ee0.e0> g() {
        Collection<com.amazon.aps.iva.ee0.e0> g = ((com.amazon.aps.iva.ce0.p) this.a).o0().I0().g();
        com.amazon.aps.iva.yb0.j.e(g, "declarationDescriptor.un…pe.constructor.supertypes");
        return g;
    }

    @Override // com.amazon.aps.iva.ee0.c1
    public final List<y0> getParameters() {
        List list = ((com.amazon.aps.iva.ce0.p) this.a).r;
        if (list != null) {
            return list;
        }
        com.amazon.aps.iva.yb0.j.m("typeConstructorParameters");
        throw null;
    }

    @Override // com.amazon.aps.iva.ee0.c1
    public final com.amazon.aps.iva.lc0.k j() {
        return com.amazon.aps.iva.ud0.b.e(this.a);
    }

    @Override // com.amazon.aps.iva.ee0.c1
    public final com.amazon.aps.iva.oc0.h k() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.ee0.c1
    public final boolean l() {
        return true;
    }

    public final String toString() {
        return "[typealias " + this.a.getName().b() + ']';
    }
}
