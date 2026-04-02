package com.amazon.aps.iva.tm;

import com.amazon.aps.iva.ab.t;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.m0.f2;
import com.amazon.aps.iva.m0.g2;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
/* compiled from: SwitchProfileDialog.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.profiles.presentation.switchprofile.SwitchProfileDialog$onCreateView$1$1$3", f = "SwitchProfileDialog.kt", l = {106, 107}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public int h;
    public final /* synthetic */ f2 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f2 f2Var, com.amazon.aps.iva.ob0.d<? super g> dVar) {
        super(2, dVar);
        this.i = f2Var;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new g(this.i, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((g) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    x.i0(obj);
                    return q.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.i0(obj);
        } else {
            x.i0(obj);
            this.h = 1;
            if (t.l(100L, this) == obj2) {
                return obj2;
            }
        }
        this.h = 2;
        f2 f2Var = this.i;
        f2Var.getClass();
        g2 g2Var = g2.HalfExpanded;
        if (!f2Var.c.b().containsKey(g2Var)) {
            g2Var = g2.Expanded;
        }
        Object b = f2.b(f2Var, g2Var, this);
        if (b != obj2) {
            b = q.a;
        }
        if (b == obj2) {
            return obj2;
        }
        return q.a;
    }
}
