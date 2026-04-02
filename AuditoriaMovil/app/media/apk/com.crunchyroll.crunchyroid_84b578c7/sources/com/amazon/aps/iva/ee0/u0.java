package com.amazon.aps.iva.ee0;
/* compiled from: StubTypes.kt */
/* loaded from: classes4.dex */
public final class u0 extends d {
    public final c1 f;
    public final com.amazon.aps.iva.xd0.i g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.amazon.aps.iva.fe0.n nVar, boolean z, c1 c1Var) {
        super(nVar, z);
        com.amazon.aps.iva.yb0.j.f(nVar, "originalTypeVariable");
        com.amazon.aps.iva.yb0.j.f(c1Var, "constructor");
        this.f = c1Var;
        this.g = nVar.j().f().l();
    }

    @Override // com.amazon.aps.iva.ee0.e0
    public final c1 I0() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.ee0.d
    public final u0 R0(boolean z) {
        return new u0(this.c, z, this.f);
    }

    @Override // com.amazon.aps.iva.ee0.d, com.amazon.aps.iva.ee0.e0
    public final com.amazon.aps.iva.xd0.i l() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.ee0.m0
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Stub (BI): ");
        sb.append(this.c);
        if (this.d) {
            str = "?";
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }
}
