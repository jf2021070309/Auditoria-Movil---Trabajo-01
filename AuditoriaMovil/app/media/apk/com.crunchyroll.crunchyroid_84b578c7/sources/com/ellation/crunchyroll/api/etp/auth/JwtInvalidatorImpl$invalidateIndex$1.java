package com.ellation.crunchyroll.api.etp.auth;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.pb0.a;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.api.etp.index.EtpIndexProvider;
import kotlin.Metadata;
/* compiled from: JwtInvalidator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lcom/amazon/aps/iva/se0/g0;", "Lcom/amazon/aps/iva/kb0/q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.ellation.crunchyroll.api.etp.auth.JwtInvalidatorImpl$invalidateIndex$1", f = "JwtInvalidator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class JwtInvalidatorImpl$invalidateIndex$1 extends i implements p<g0, d<? super q>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ JwtInvalidatorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JwtInvalidatorImpl$invalidateIndex$1(JwtInvalidatorImpl jwtInvalidatorImpl, d<? super JwtInvalidatorImpl$invalidateIndex$1> dVar) {
        super(2, dVar);
        this.this$0 = jwtInvalidatorImpl;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final d<q> create(Object obj, d<?> dVar) {
        JwtInvalidatorImpl$invalidateIndex$1 jwtInvalidatorImpl$invalidateIndex$1 = new JwtInvalidatorImpl$invalidateIndex$1(this.this$0, dVar);
        jwtInvalidatorImpl$invalidateIndex$1.L$0 = obj;
        return jwtInvalidatorImpl$invalidateIndex$1;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, d<? super q> dVar) {
        return ((JwtInvalidatorImpl$invalidateIndex$1) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        EtpIndexProvider etpIndexProvider;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            x.i0(obj);
            g0 g0Var = (g0) this.L$0;
            try {
                etpIndexProvider = this.this$0.etpIndexProvider;
                etpIndexProvider.getEtpIndex(true);
            } catch (Throwable th) {
                x.H(th);
            }
            return q.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
