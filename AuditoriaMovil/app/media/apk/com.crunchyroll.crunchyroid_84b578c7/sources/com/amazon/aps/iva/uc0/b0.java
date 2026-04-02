package com.amazon.aps.iva.uc0;

import java.util.Collection;
/* compiled from: ReflectJavaPackage.kt */
/* loaded from: classes4.dex */
public final class b0 extends v implements com.amazon.aps.iva.ed0.t {
    public final com.amazon.aps.iva.nd0.c a;

    public b0(com.amazon.aps.iva.nd0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        this.a = cVar;
    }

    @Override // com.amazon.aps.iva.ed0.t
    public final void F(com.amazon.aps.iva.xb0.l lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "nameFilter");
    }

    @Override // com.amazon.aps.iva.ed0.t
    public final com.amazon.aps.iva.nd0.c c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            if (com.amazon.aps.iva.yb0.j.a(this.a, ((b0) obj).a)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.aps.iva.ed0.d
    public final /* bridge */ /* synthetic */ Collection getAnnotations() {
        return com.amazon.aps.iva.lb0.z.b;
    }

    @Override // com.amazon.aps.iva.ed0.d
    public final com.amazon.aps.iva.ed0.a h(com.amazon.aps.iva.nd0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        return null;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        com.amazon.aps.iva.b8.i.d(b0.class, sb, ": ");
        sb.append(this.a);
        return sb.toString();
    }

    @Override // com.amazon.aps.iva.ed0.d
    public final void D() {
    }

    @Override // com.amazon.aps.iva.ed0.t
    public final void t() {
    }
}
