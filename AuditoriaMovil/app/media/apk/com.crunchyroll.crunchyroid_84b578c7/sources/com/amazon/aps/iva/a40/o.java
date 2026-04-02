package com.amazon.aps.iva.a40;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import java.io.IOException;
/* compiled from: ChangePasswordViewModel.kt */
/* loaded from: classes2.dex */
public final class o extends com.amazon.aps.iva.ez.b implements n {
    public final c b;
    public final v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.ez.g<q>>> c;

    /* compiled from: ChangePasswordViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.settings.changepassword.ChangePasswordViewModelImpl$updatePassword$1", f = "ChangePasswordViewModel.kt", l = {29}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;
        public final /* synthetic */ String j;
        public final /* synthetic */ String k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.j = str;
            this.k = str2;
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
            o oVar = o.this;
            try {
                if (i != 0) {
                    if (i == 1) {
                        x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    x.i0(obj);
                    c cVar = oVar.b;
                    String str = this.j;
                    String str2 = this.k;
                    this.h = 1;
                    if (cVar.L(str, str2, this) == aVar) {
                        return aVar;
                    }
                }
                oVar.c.k(new com.amazon.aps.iva.ez.d<>(new g.c(q.a, null)));
            } catch (IOException e) {
                oVar.c.k(new com.amazon.aps.iva.ez.d<>(new g.a(null, e)));
            }
            return q.a;
        }
    }

    public o(d dVar) {
        super(dVar);
        this.b = dVar;
        this.c = new v<>();
    }

    @Override // com.amazon.aps.iva.a40.n
    public final void C2(String str, String str2) {
        com.amazon.aps.iva.yb0.j.f(str, "newPassword");
        com.amazon.aps.iva.yb0.j.f(str2, "password");
        com.amazon.aps.iva.ez.h.d(this.c);
        com.amazon.aps.iva.se0.i.d(w.D(this), null, null, new a(str2, str, null), 3);
    }

    @Override // com.amazon.aps.iva.a40.n
    public final v v7() {
        return this.c;
    }
}
