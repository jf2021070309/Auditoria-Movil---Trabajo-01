package com.amazon.aps.iva.k10;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.google.android.gms.common.Scopes;
import java.io.IOException;
/* compiled from: ForgotPasswordViewModel.kt */
/* loaded from: classes2.dex */
public final class l extends com.amazon.aps.iva.ez.b implements k {
    public final com.amazon.aps.iva.k10.a b;
    public final com.amazon.aps.iva.y30.a c;
    public final v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.ez.g<q>>> d;

    /* compiled from: ForgotPasswordViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.forgotpassword.ForgotPasswordViewModelImpl$resetPassword$1", f = "ForgotPasswordViewModel.kt", l = {34}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;
        public final /* synthetic */ String j;
        public final /* synthetic */ com.amazon.aps.iva.fs.b k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, com.amazon.aps.iva.fs.b bVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.j = str;
            this.k = bVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.j, this.k, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            com.amazon.aps.iva.fs.b bVar = this.k;
            l lVar = l.this;
            try {
                if (i != 0) {
                    if (i == 1) {
                        x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    x.i0(obj);
                    com.amazon.aps.iva.k10.a aVar2 = lVar.b;
                    String str = this.j;
                    this.h = 1;
                    if (aVar2.M1(str, this) == aVar) {
                        return aVar;
                    }
                }
                lVar.d.k(new com.amazon.aps.iva.ez.d<>(new g.c(q.a, null)));
                lVar.c.c(bVar);
            } catch (IOException e) {
                lVar.d.k(new com.amazon.aps.iva.ez.d<>(new g.a(null, e)));
                lVar.c.d(bVar, e);
            }
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(b bVar, com.amazon.aps.iva.y30.b bVar2) {
        super(bVar);
        com.amazon.aps.iva.yb0.j.f(bVar2, "forgotPasswordAnalytics");
        this.b = bVar;
        this.c = bVar2;
        this.d = new v<>();
    }

    @Override // com.amazon.aps.iva.k10.k
    public final void T1(String str, com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.yb0.j.f(str, Scopes.EMAIL);
        this.c.b(bVar);
        this.d.k(new com.amazon.aps.iva.ez.d<>(new g.b(null)));
        com.amazon.aps.iva.se0.i.d(w.D(this), null, null, new a(str, bVar, null), 3);
    }

    @Override // com.amazon.aps.iva.k10.k
    public final v j5() {
        return this.d;
    }
}
