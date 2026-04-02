package com.amazon.aps.iva.cg;

import com.amazon.aps.iva.cg.u;
/* compiled from: DeepLinkInput.kt */
/* loaded from: classes.dex */
public class e0 implements u {
    public final u.a a;
    public final com.amazon.aps.iva.dg.a b;

    public e0(u.a aVar, com.amazon.aps.iva.dg.a aVar2) {
        com.amazon.aps.iva.yb0.j.f(aVar, "screenToLaunch");
        this.a = aVar;
        this.b = aVar2;
    }

    @Override // com.amazon.aps.iva.cg.u
    public u.a a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (a() == e0Var.a() && com.amazon.aps.iva.yb0.j.a(getUri(), e0Var.getUri())) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.cg.u
    public com.amazon.aps.iva.dg.a getUri() {
        return this.b;
    }

    public int hashCode() {
        return getUri().hashCode() + (a().hashCode() * 31);
    }
}
