package com.amazon.aps.iva.jo;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.google.android.gms.common.Scopes;
import java.io.IOException;
/* compiled from: CrOwnershipVerificationViewModel.kt */
/* loaded from: classes2.dex */
public final class l extends com.amazon.aps.iva.ez.b implements k {
    public final com.amazon.aps.iva.co.h b;
    public final v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.ez.g<q>>> c;

    /* compiled from: CrOwnershipVerificationViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.usermigration.verification.CrOwnershipVerificationViewModelImpl$signIn$1", f = "CrOwnershipVerificationViewModel.kt", l = {31}, m = "invokeSuspend")
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
                    com.amazon.aps.iva.co.h hVar = lVar.b;
                    String str = this.j;
                    String str2 = this.k;
                    this.h = 1;
                    if (hVar.signInWithFun(str, str2, this) == aVar) {
                        return aVar;
                    }
                }
                lVar.c.k(new com.amazon.aps.iva.ez.d<>(new g.c(q.a, null)));
            } catch (IOException e) {
                lVar.c.k(new com.amazon.aps.iva.ez.d<>(new g.a(null, e)));
            }
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.amazon.aps.iva.co.h hVar) {
        super(new com.amazon.aps.iva.wy.j[0]);
        com.amazon.aps.iva.yb0.j.f(hVar, "userMigrationSignInInteractor");
        this.b = hVar;
        this.c = new v<>();
    }

    @Override // com.amazon.aps.iva.jo.k
    public final v E() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.jo.k
    public final void S(String str, String str2) {
        com.amazon.aps.iva.yb0.j.f(str, Scopes.EMAIL);
        com.amazon.aps.iva.yb0.j.f(str2, "password");
        com.amazon.aps.iva.ez.h.d(this.c);
        com.amazon.aps.iva.se0.i.d(w.D(this), null, null, new a(str, str2, null), 3);
    }
}
