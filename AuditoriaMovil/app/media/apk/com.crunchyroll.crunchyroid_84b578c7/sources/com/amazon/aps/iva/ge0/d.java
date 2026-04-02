package com.amazon.aps.iva.ge0;

import com.amazon.aps.iva.a9.w;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.oc0.c0;
import com.amazon.aps.iva.oc0.j0;
import com.amazon.aps.iva.oc0.m;
import com.amazon.aps.iva.pc0.h;
import java.util.Collection;
import java.util.List;
/* compiled from: ErrorModuleDescriptor.kt */
/* loaded from: classes4.dex */
public final class d implements c0 {
    public static final d b = new d();
    public static final com.amazon.aps.iva.nd0.f c = com.amazon.aps.iva.nd0.f.j(b.ERROR_MODULE.getDebugText());
    public static final z d = z.b;
    public static final com.amazon.aps.iva.lc0.d e;

    static {
        com.amazon.aps.iva.lc0.d dVar = com.amazon.aps.iva.lc0.d.f;
        e = com.amazon.aps.iva.lc0.d.f;
    }

    @Override // com.amazon.aps.iva.oc0.c0
    public final <T> T A(w wVar) {
        com.amazon.aps.iva.yb0.j.f(wVar, "capability");
        return null;
    }

    @Override // com.amazon.aps.iva.oc0.k
    public final <R, D> R D0(m<R, D> mVar, D d2) {
        return null;
    }

    @Override // com.amazon.aps.iva.oc0.k
    public final com.amazon.aps.iva.oc0.k d() {
        return null;
    }

    @Override // com.amazon.aps.iva.pc0.a
    public final com.amazon.aps.iva.pc0.h getAnnotations() {
        return h.a.a;
    }

    @Override // com.amazon.aps.iva.oc0.k
    public final com.amazon.aps.iva.nd0.f getName() {
        return c;
    }

    @Override // com.amazon.aps.iva.oc0.c0
    public final com.amazon.aps.iva.lc0.k j() {
        return e;
    }

    @Override // com.amazon.aps.iva.oc0.c0
    public final Collection<com.amazon.aps.iva.nd0.c> r(com.amazon.aps.iva.nd0.c cVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.nd0.f, Boolean> lVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        com.amazon.aps.iva.yb0.j.f(lVar, "nameFilter");
        return z.b;
    }

    @Override // com.amazon.aps.iva.oc0.c0
    public final boolean v(c0 c0Var) {
        com.amazon.aps.iva.yb0.j.f(c0Var, "targetModule");
        return false;
    }

    @Override // com.amazon.aps.iva.oc0.c0
    public final List<c0> v0() {
        return d;
    }

    @Override // com.amazon.aps.iva.oc0.c0
    public final j0 y(com.amazon.aps.iva.nd0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    @Override // com.amazon.aps.iva.oc0.k
    public final com.amazon.aps.iva.oc0.k a() {
        return this;
    }
}
