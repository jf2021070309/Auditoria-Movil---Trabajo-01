package com.ellation.crunchyroll.cast;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.jf0.a0;
import com.amazon.aps.iva.kb0.k;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.crunchyroll.api.etp.account.model.UserCodeBody;
import kotlin.Metadata;
/* compiled from: CastDeviceInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lcom/amazon/aps/iva/se0/g0;", "Lcom/amazon/aps/iva/kb0/q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.ellation.crunchyroll.cast.CastDeviceInteractorImpl$authDevice$1", f = "CastDeviceInteractor.kt", l = {28}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CastDeviceInteractorImpl$authDevice$1 extends i implements p<g0, d<? super q>, Object> {
    final /* synthetic */ l<Throwable, q> $failure;
    final /* synthetic */ com.amazon.aps.iva.xb0.a<q> $success;
    final /* synthetic */ UserCodeBody $userCodeBody;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CastDeviceInteractorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CastDeviceInteractorImpl$authDevice$1(l<? super Throwable, q> lVar, CastDeviceInteractorImpl castDeviceInteractorImpl, UserCodeBody userCodeBody, com.amazon.aps.iva.xb0.a<q> aVar, d<? super CastDeviceInteractorImpl$authDevice$1> dVar) {
        super(2, dVar);
        this.$failure = lVar;
        this.this$0 = castDeviceInteractorImpl;
        this.$userCodeBody = userCodeBody;
        this.$success = aVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final d<q> create(Object obj, d<?> dVar) {
        CastDeviceInteractorImpl$authDevice$1 castDeviceInteractorImpl$authDevice$1 = new CastDeviceInteractorImpl$authDevice$1(this.$failure, this.this$0, this.$userCodeBody, this.$success, dVar);
        castDeviceInteractorImpl$authDevice$1.L$0 = obj;
        return castDeviceInteractorImpl$authDevice$1;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, d<? super q> dVar) {
        return ((CastDeviceInteractorImpl$authDevice$1) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        Object H;
        EtpAccountService etpAccountService;
        a0 a0Var;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                g0 g0Var = (g0) this.L$0;
                CastDeviceInteractorImpl castDeviceInteractorImpl = this.this$0;
                UserCodeBody userCodeBody = this.$userCodeBody;
                etpAccountService = castDeviceInteractorImpl.accountService;
                this.label = 1;
                obj = etpAccountService.authDevice(userCodeBody, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            a0Var = (a0) obj;
        } catch (Throwable th) {
            H = x.H(th);
        }
        if (a0Var.a()) {
            H = q.a;
            com.amazon.aps.iva.xb0.a<q> aVar2 = this.$success;
            if (!(H instanceof k.a)) {
                q qVar = (q) H;
                aVar2.invoke();
            }
            l<Throwable, q> lVar = this.$failure;
            Throwable a = k.a(H);
            if (a != null) {
                lVar.invoke(a);
            }
            return q.a;
        }
        throw new com.amazon.aps.iva.jf0.i(a0Var);
    }
}
