package com.amazon.aps.iva.ge0;

import com.amazon.aps.iva.ee0.a1;
import com.amazon.aps.iva.ee0.c1;
import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.j1;
import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.ee0.u1;
import java.util.Arrays;
import java.util.List;
/* compiled from: ErrorType.kt */
/* loaded from: classes4.dex */
public final class h extends m0 {
    public final c1 c;
    public final com.amazon.aps.iva.xd0.i d;
    public final j e;
    public final List<j1> f;
    public final boolean g;
    public final String[] h;
    public final String i;

    /* JADX WARN: Multi-variable type inference failed */
    public h(c1 c1Var, com.amazon.aps.iva.xd0.i iVar, j jVar, List<? extends j1> list, boolean z, String... strArr) {
        com.amazon.aps.iva.yb0.j.f(c1Var, "constructor");
        com.amazon.aps.iva.yb0.j.f(iVar, "memberScope");
        com.amazon.aps.iva.yb0.j.f(jVar, "kind");
        com.amazon.aps.iva.yb0.j.f(list, "arguments");
        com.amazon.aps.iva.yb0.j.f(strArr, "formatParams");
        this.c = c1Var;
        this.d = iVar;
        this.e = jVar;
        this.f = list;
        this.g = z;
        this.h = strArr;
        String debugMessage = jVar.getDebugMessage();
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        String format = String.format(debugMessage, Arrays.copyOf(copyOf, copyOf.length));
        com.amazon.aps.iva.yb0.j.e(format, "format(format, *args)");
        this.i = format;
    }

    @Override // com.amazon.aps.iva.ee0.e0
    public final List<j1> G0() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.ee0.e0
    public final a1 H0() {
        a1.c.getClass();
        return a1.d;
    }

    @Override // com.amazon.aps.iva.ee0.e0
    public final c1 I0() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.ee0.e0
    public final boolean J0() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.ee0.e0
    public final e0 K0(com.amazon.aps.iva.fe0.f fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "kotlinTypeRefiner");
        return this;
    }

    @Override // com.amazon.aps.iva.ee0.u1
    public final u1 N0(com.amazon.aps.iva.fe0.f fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "kotlinTypeRefiner");
        return this;
    }

    @Override // com.amazon.aps.iva.ee0.m0, com.amazon.aps.iva.ee0.u1
    public final u1 O0(a1 a1Var) {
        com.amazon.aps.iva.yb0.j.f(a1Var, "newAttributes");
        return this;
    }

    @Override // com.amazon.aps.iva.ee0.m0
    public final m0 P0(boolean z) {
        c1 c1Var = this.c;
        com.amazon.aps.iva.xd0.i iVar = this.d;
        j jVar = this.e;
        List<j1> list = this.f;
        String[] strArr = this.h;
        return new h(c1Var, iVar, jVar, list, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // com.amazon.aps.iva.ee0.m0
    public final m0 Q0(a1 a1Var) {
        com.amazon.aps.iva.yb0.j.f(a1Var, "newAttributes");
        return this;
    }

    @Override // com.amazon.aps.iva.ee0.e0
    public final com.amazon.aps.iva.xd0.i l() {
        return this.d;
    }
}
