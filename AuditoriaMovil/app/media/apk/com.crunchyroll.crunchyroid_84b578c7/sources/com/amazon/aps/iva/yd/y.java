package com.amazon.aps.iva.yd;

import com.amazon.aps.iva.se0.g0;
import com.ellation.crunchyroll.api.notifications.NotificationSettingsInteractor;
/* compiled from: EmailMandatoryViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.auth.emailmandatory.EmailMandatoryViewModelImpl$1", f = "EmailMandatoryViewModel.kt", l = {37}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class y extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ z i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, com.amazon.aps.iva.ob0.d<? super y> dVar) {
        super(2, dVar);
        this.i = zVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new y(this.i, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((y) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        z zVar = this.i;
        if (i != 0) {
            if (i == 1) {
                com.amazon.aps.iva.ab.x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.amazon.aps.iva.ab.x.i0(obj);
            NotificationSettingsInteractor notificationSettingsInteractor = zVar.d;
            this.h = 1;
            obj = notificationSettingsInteractor.getDefaultMarketingOptInState(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        zVar.g.i(Boolean.valueOf(((Boolean) obj).booleanValue()));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
