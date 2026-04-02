package com.amazon.aps.iva.k10;

import com.amazon.aps.iva.kb0.q;
import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.crunchyroll.api.etp.account.model.ResetPasswordBody;
/* compiled from: ForgotPasswordInteractor.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.wy.i implements a {
    public final EtpAccountService b;

    public b(EtpAccountService etpAccountService) {
        this.b = etpAccountService;
    }

    @Override // com.amazon.aps.iva.k10.a
    public final Object M1(String str, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        Object resetPassword = this.b.resetPassword(new ResetPasswordBody(str), dVar);
        if (resetPassword == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return resetPassword;
        }
        return q.a;
    }
}
