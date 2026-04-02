package com.amazon.aps.iva.fe0;

import com.amazon.aps.iva.ee0.b1;
import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.ee0.q1;
import com.amazon.aps.iva.ee0.v1;
/* compiled from: ClassicTypeSystemContext.kt */
/* loaded from: classes4.dex */
public final class c extends b1.c.a {
    public final /* synthetic */ b a;
    public final /* synthetic */ q1 b;

    public c(b bVar, q1 q1Var) {
        this.a = bVar;
        this.b = q1Var;
    }

    @Override // com.amazon.aps.iva.ee0.b1.c
    public final com.amazon.aps.iva.he0.i a(b1 b1Var, com.amazon.aps.iva.he0.h hVar) {
        com.amazon.aps.iva.yb0.j.f(b1Var, "state");
        com.amazon.aps.iva.yb0.j.f(hVar, "type");
        b bVar = this.a;
        m0 b = bVar.b(hVar);
        com.amazon.aps.iva.yb0.j.d(b, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType");
        e0 i = this.b.i(b, v1.INVARIANT);
        com.amazon.aps.iva.yb0.j.e(i, "substitutor.safeSubstitu…VARIANT\n                )");
        m0 R = bVar.R(i);
        com.amazon.aps.iva.yb0.j.c(R);
        return R;
    }
}
