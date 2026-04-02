package com.amazon.aps.iva.fe0;

import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.oc0.c0;
import java.util.Collection;
/* compiled from: KotlinTypeRefiner.kt */
/* loaded from: classes4.dex */
public abstract class f extends com.amazon.aps.iva.ab.a {
    public abstract void s(com.amazon.aps.iva.nd0.b bVar);

    public abstract void t(c0 c0Var);

    public abstract void u(com.amazon.aps.iva.oc0.h hVar);

    public abstract Collection<e0> v(com.amazon.aps.iva.oc0.e eVar);

    public abstract e0 w(com.amazon.aps.iva.he0.h hVar);

    /* compiled from: KotlinTypeRefiner.kt */
    /* loaded from: classes4.dex */
    public static final class a extends f {
        public static final a a = new a();

        @Override // com.amazon.aps.iva.ab.a
        public final e0 q(com.amazon.aps.iva.he0.h hVar) {
            com.amazon.aps.iva.yb0.j.f(hVar, "type");
            return (e0) hVar;
        }

        @Override // com.amazon.aps.iva.fe0.f
        public final void u(com.amazon.aps.iva.oc0.h hVar) {
            com.amazon.aps.iva.yb0.j.f(hVar, "descriptor");
        }

        @Override // com.amazon.aps.iva.fe0.f
        public final Collection<e0> v(com.amazon.aps.iva.oc0.e eVar) {
            com.amazon.aps.iva.yb0.j.f(eVar, "classDescriptor");
            Collection<e0> g = eVar.h().g();
            com.amazon.aps.iva.yb0.j.e(g, "classDescriptor.typeConstructor.supertypes");
            return g;
        }

        @Override // com.amazon.aps.iva.fe0.f
        public final e0 w(com.amazon.aps.iva.he0.h hVar) {
            com.amazon.aps.iva.yb0.j.f(hVar, "type");
            return (e0) hVar;
        }

        @Override // com.amazon.aps.iva.fe0.f
        public final void s(com.amazon.aps.iva.nd0.b bVar) {
        }

        @Override // com.amazon.aps.iva.fe0.f
        public final void t(c0 c0Var) {
        }
    }
}
