package com.amazon.aps.iva.yd;

import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.crunchyroll.api.etp.account.model.SetEmailBody;
/* compiled from: EmailMandatoryInteractor.kt */
/* loaded from: classes.dex */
public final class i extends com.amazon.aps.iva.wy.a implements h {
    public final EtpAccountService b;

    public i(EtpAccountService etpAccountService) {
        this.b = etpAccountService;
    }

    @Override // com.amazon.aps.iva.yd.h
    public final Object O(String str, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        Object email = this.b.setEmail(new SetEmailBody(str), dVar);
        if (email == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return email;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
