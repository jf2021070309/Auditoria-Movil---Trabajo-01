package com.amazon.aps.iva.bj;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.g0;
import java.io.IOException;
/* compiled from: SendVerificationEmailViewModel.kt */
/* loaded from: classes.dex */
public final class p extends com.amazon.aps.iva.ez.b implements o {
    public final com.amazon.aps.iva.zg.l b;
    public final v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.u70.i>> c;

    /* compiled from: SendVerificationEmailViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.pendingstategate.SendVerificationEmailViewModelImpl$sendVerificationEmail$1", f = "SendVerificationEmailViewModel.kt", l = {30}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.j = str;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            p pVar = p.this;
            try {
                if (i != 0) {
                    if (i == 1) {
                        x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    x.i0(obj);
                    com.amazon.aps.iva.zg.l lVar = pVar.b;
                    this.h = 1;
                    if (lVar.sendVerificationEmail(this) == aVar) {
                        return aVar;
                    }
                }
                pVar.c.i(new com.amazon.aps.iva.ez.d<>(new com.amazon.aps.iva.zg.o(this.j)));
            } catch (IOException e) {
                if (e instanceof com.amazon.aps.iva.zg.b) {
                    pVar.c.i(new com.amazon.aps.iva.ez.d<>(com.amazon.aps.iva.zg.c.b));
                } else {
                    pVar.c.i(new com.amazon.aps.iva.ez.d<>(com.amazon.aps.iva.bt.c.b));
                }
            }
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.amazon.aps.iva.zg.l lVar) {
        super(lVar);
        com.amazon.aps.iva.yb0.j.f(lVar, "interactor");
        this.b = lVar;
        this.c = new v<>();
    }

    @Override // com.amazon.aps.iva.bj.o
    public final void I2(String str) {
        com.amazon.aps.iva.se0.i.d(w.D(this), null, null, new a(str, null), 3);
    }

    @Override // com.amazon.aps.iva.bj.o
    public final v u5() {
        return this.c;
    }
}
