package com.amazon.aps.iva.tm;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.m0.f2;
import com.amazon.aps.iva.m0.g2;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.ve0.j0;
import com.amazon.aps.iva.xb0.p;
/* compiled from: SwitchProfileDialog.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.profiles.presentation.switchprofile.SwitchProfileDialog$onCreateView$1$1$2", f = "SwitchProfileDialog.kt", l = {101}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public int h;
    public final /* synthetic */ f2 i;
    public final /* synthetic */ c j;

    /* compiled from: SwitchProfileDialog.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<g2> {
        public final /* synthetic */ f2 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f2 f2Var) {
            super(0);
            this.h = f2Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final g2 invoke() {
            return this.h.c.c();
        }
    }

    /* compiled from: SwitchProfileDialog.kt */
    /* loaded from: classes2.dex */
    public static final class b implements com.amazon.aps.iva.ve0.g<g2> {
        public final /* synthetic */ c b;

        public b(c cVar) {
            this.b = cVar;
        }

        @Override // com.amazon.aps.iva.ve0.g
        public final Object a(g2 g2Var, com.amazon.aps.iva.ob0.d dVar) {
            if (g2Var == g2.Hidden) {
                this.b.dismiss();
            }
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(f2 f2Var, c cVar, com.amazon.aps.iva.ob0.d<? super f> dVar) {
        super(2, dVar);
        this.i = f2Var;
        this.j = cVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new f(this.i, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((f) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        if (i != 0) {
            if (i == 1) {
                x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            x.i0(obj);
            j0 m0 = com.amazon.aps.iva.cq.b.m0(new a(this.i));
            b bVar = new b(this.j);
            this.h = 1;
            if (m0.c(bVar, this) == aVar) {
                return aVar;
            }
        }
        return q.a;
    }
}
