package com.amazon.aps.iva.rd0;

import com.amazon.aps.iva.ee0.a1;
import com.amazon.aps.iva.ee0.c1;
import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.j1;
import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.ee0.u1;
import com.amazon.aps.iva.fe0.f;
import com.amazon.aps.iva.ge0.g;
import com.amazon.aps.iva.ge0.k;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.xd0.i;
import com.amazon.aps.iva.yb0.j;
import java.util.List;
/* compiled from: CapturedTypeConstructor.kt */
/* loaded from: classes4.dex */
public final class a extends m0 implements com.amazon.aps.iva.he0.d {
    public final j1 c;
    public final b d;
    public final boolean e;
    public final a1 f;

    public a(j1 j1Var, b bVar, boolean z, a1 a1Var) {
        j.f(j1Var, "typeProjection");
        j.f(bVar, "constructor");
        j.f(a1Var, "attributes");
        this.c = j1Var;
        this.d = bVar;
        this.e = z;
        this.f = a1Var;
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
        return this.e;
    }

    @Override // com.amazon.aps.iva.ee0.e0
    public final e0 K0(f fVar) {
        j.f(fVar, "kotlinTypeRefiner");
        j1 a = this.c.a(fVar);
        j.e(a, "typeProjection.refine(kotlinTypeRefiner)");
        return new a(a, this.d, this.e, this.f);
    }

    @Override // com.amazon.aps.iva.ee0.m0, com.amazon.aps.iva.ee0.u1
    public final u1 M0(boolean z) {
        if (z == this.e) {
            return this;
        }
        return new a(this.c, this.d, z, this.f);
    }

    @Override // com.amazon.aps.iva.ee0.u1
    public final u1 N0(f fVar) {
        j.f(fVar, "kotlinTypeRefiner");
        j1 a = this.c.a(fVar);
        j.e(a, "typeProjection.refine(kotlinTypeRefiner)");
        return new a(a, this.d, this.e, this.f);
    }

    @Override // com.amazon.aps.iva.ee0.m0
    public final m0 P0(boolean z) {
        if (z == this.e) {
            return this;
        }
        return new a(this.c, this.d, z, this.f);
    }

    @Override // com.amazon.aps.iva.ee0.m0
    public final m0 Q0(a1 a1Var) {
        j.f(a1Var, "newAttributes");
        return new a(this.c, this.d, this.e, a1Var);
    }

    @Override // com.amazon.aps.iva.ee0.e0
    public final i l() {
        return k.a(g.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // com.amazon.aps.iva.ee0.m0
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Captured(");
        sb.append(this.c);
        sb.append(')');
        if (this.e) {
            str = "?";
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }
}
