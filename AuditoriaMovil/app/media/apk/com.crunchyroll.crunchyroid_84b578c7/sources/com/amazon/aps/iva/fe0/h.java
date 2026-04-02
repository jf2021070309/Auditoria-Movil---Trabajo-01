package com.amazon.aps.iva.fe0;

import com.amazon.aps.iva.ee0.a1;
import com.amazon.aps.iva.ee0.c1;
import com.amazon.aps.iva.ee0.j1;
import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.ee0.u1;
import com.amazon.aps.iva.lb0.z;
import java.util.List;
/* compiled from: NewCapturedType.kt */
/* loaded from: classes4.dex */
public final class h extends m0 implements com.amazon.aps.iva.he0.d {
    public final com.amazon.aps.iva.he0.b c;
    public final j d;
    public final u1 e;
    public final a1 f;
    public final boolean g;
    public final boolean h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(com.amazon.aps.iva.he0.b r8, com.amazon.aps.iva.fe0.j r9, com.amazon.aps.iva.ee0.u1 r10, com.amazon.aps.iva.ee0.a1 r11, boolean r12, int r13) {
        /*
            r7 = this;
            r0 = r13 & 8
            if (r0 == 0) goto Lb
            com.amazon.aps.iva.ee0.a1$a r11 = com.amazon.aps.iva.ee0.a1.c
            r11.getClass()
            com.amazon.aps.iva.ee0.a1 r11 = com.amazon.aps.iva.ee0.a1.d
        Lb:
            r4 = r11
            r11 = r13 & 16
            if (r11 == 0) goto L11
            r12 = 0
        L11:
            r5 = r12
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.fe0.h.<init>(com.amazon.aps.iva.he0.b, com.amazon.aps.iva.fe0.j, com.amazon.aps.iva.ee0.u1, com.amazon.aps.iva.ee0.a1, boolean, int):void");
    }

    @Override // com.amazon.aps.iva.ee0.e0
    public final List<j1> G0() {
        return z.b;
    }

    @Override // com.amazon.aps.iva.ee0.e0
    public final a1 H0() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.ee0.e0
    public final c1 I0() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.ee0.e0
    public final boolean J0() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.ee0.m0, com.amazon.aps.iva.ee0.u1
    public final u1 M0(boolean z) {
        return new h(this.c, this.d, this.e, this.f, z, 32);
    }

    @Override // com.amazon.aps.iva.ee0.m0
    public final m0 P0(boolean z) {
        return new h(this.c, this.d, this.e, this.f, z, 32);
    }

    @Override // com.amazon.aps.iva.ee0.m0
    public final m0 Q0(a1 a1Var) {
        com.amazon.aps.iva.yb0.j.f(a1Var, "newAttributes");
        return new h(this.c, this.d, this.e, a1Var, this.g, this.h);
    }

    @Override // com.amazon.aps.iva.ee0.u1
    /* renamed from: R0 */
    public final h N0(f fVar) {
        u1 u1Var;
        com.amazon.aps.iva.yb0.j.f(fVar, "kotlinTypeRefiner");
        com.amazon.aps.iva.he0.b bVar = this.c;
        j c = this.d.c(fVar);
        u1 u1Var2 = this.e;
        if (u1Var2 != null) {
            u1Var = fVar.w(u1Var2).L0();
        } else {
            u1Var = null;
        }
        return new h(bVar, c, u1Var, this.f, this.g, 32);
    }

    @Override // com.amazon.aps.iva.ee0.e0
    public final com.amazon.aps.iva.xd0.i l() {
        return com.amazon.aps.iva.ge0.k.a(com.amazon.aps.iva.ge0.g.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    public h(com.amazon.aps.iva.he0.b bVar, j jVar, u1 u1Var, a1 a1Var, boolean z, boolean z2) {
        com.amazon.aps.iva.yb0.j.f(bVar, "captureStatus");
        com.amazon.aps.iva.yb0.j.f(jVar, "constructor");
        com.amazon.aps.iva.yb0.j.f(a1Var, "attributes");
        this.c = bVar;
        this.d = jVar;
        this.e = u1Var;
        this.f = a1Var;
        this.g = z;
        this.h = z2;
    }
}
