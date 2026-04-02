package com.amazon.aps.iva.v40;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import java.io.IOException;
/* compiled from: SignUpViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.signing.signup.SignUpViewModelImpl$signUpWithPhoneNumber$1", f = "SignUpViewModel.kt", l = {62}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class n extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public int h;
    public final /* synthetic */ m i;
    public final /* synthetic */ String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(m mVar, String str, com.amazon.aps.iva.ob0.d<? super n> dVar) {
        super(2, dVar);
        this.i = mVar;
        this.j = str;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new n(this.i, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((n) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        String str = this.j;
        m mVar = this.i;
        try {
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                com.amazon.aps.iva.fe.f fVar = mVar.d;
                this.h = 1;
                if (fVar.C1(str, this) == aVar) {
                    return aVar;
                }
            }
            mVar.h.k(new com.amazon.aps.iva.ez.d<>(new g.c(str, null)));
        } catch (IOException e) {
            mVar.h.k(new com.amazon.aps.iva.ez.d<>(new g.a(null, e)));
        }
        return q.a;
    }
}
