package com.amazon.aps.iva.rc0;

import java.util.List;
import java.util.Set;
/* compiled from: ModuleDescriptorImpl.kt */
/* loaded from: classes4.dex */
public final class d0 implements c0 {
    public final List<g0> a;
    public final Set<g0> b;
    public final List<g0> c;
    public final Set<g0> d;

    public d0(List list) {
        com.amazon.aps.iva.lb0.b0 b0Var = com.amazon.aps.iva.lb0.b0.b;
        com.amazon.aps.iva.lb0.z zVar = com.amazon.aps.iva.lb0.z.b;
        this.a = list;
        this.b = b0Var;
        this.c = zVar;
        this.d = b0Var;
    }

    @Override // com.amazon.aps.iva.rc0.c0
    public final List<g0> a() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.rc0.c0
    public final List<g0> b() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.rc0.c0
    public final Set<g0> c() {
        return this.b;
    }
}
