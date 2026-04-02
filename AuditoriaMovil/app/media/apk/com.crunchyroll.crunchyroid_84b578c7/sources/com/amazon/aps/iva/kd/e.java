package com.amazon.aps.iva.kd;

import com.amazon.aps.iva.kb0.q;
import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
/* compiled from: ChangeEmailInteractor.kt */
/* loaded from: classes.dex */
public final class e extends com.amazon.aps.iva.wy.a implements d {
    public final EtpAccountService b;

    public e(EtpAccountService etpAccountService) {
        this.b = etpAccountService;
    }

    @Override // com.amazon.aps.iva.kd.d
    public final Object requestChangeEmail(com.amazon.aps.iva.ob0.d<? super q> dVar) {
        Object requestChangeEmail = this.b.requestChangeEmail(dVar);
        if (requestChangeEmail == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return requestChangeEmail;
        }
        return q.a;
    }

    @Override // com.amazon.aps.iva.kd.d
    public final Object s1(com.amazon.aps.iva.ob0.d<? super q> dVar) {
        Object sendVerificationEmail = this.b.sendVerificationEmail(dVar);
        if (sendVerificationEmail == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return sendVerificationEmail;
        }
        return q.a;
    }
}
