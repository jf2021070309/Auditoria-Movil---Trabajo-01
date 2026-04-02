package com.amazon.aps.iva.fe;

import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.crunchyroll.api.etp.account.model.CreateAccountWithPhoneBody;
import com.ellation.crunchyroll.api.etp.account.model.VerifyPhoneBody;
import com.ellation.crunchyroll.api.etp.auth.EtpAccountAuthService;
/* compiled from: OtpInteractor.kt */
/* loaded from: classes.dex */
public final class g extends com.amazon.aps.iva.wy.a implements f {
    public final EtpAccountAuthService b;
    public final EtpAccountService c;
    public final com.amazon.aps.iva.lh.a d;
    public final com.amazon.aps.iva.kh.e e;
    public final com.amazon.aps.iva.p60.f f;

    public g(EtpAccountAuthService etpAccountAuthService, EtpAccountService etpAccountService, com.amazon.aps.iva.lh.b bVar, com.amazon.aps.iva.kh.e eVar, com.amazon.aps.iva.p60.g gVar) {
        this.b = etpAccountAuthService;
        this.c = etpAccountService;
        this.d = bVar;
        this.e = eVar;
        this.f = gVar;
    }

    @Override // com.amazon.aps.iva.fe.f
    public final Object C1(String str, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        Object requestOtpCode = this.c.requestOtpCode(new VerifyPhoneBody(str), dVar);
        if (requestOtpCode == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return requestOtpCode;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    @Override // com.amazon.aps.iva.fe.f
    public final Object H0(String str, String str2, u uVar) {
        String languageTag = this.f.a().toLanguageTag();
        com.amazon.aps.iva.yb0.j.e(languageTag, "systemLanguageTag");
        Object createAccountWithPhone = this.c.createAccountWithPhone(new CreateAccountWithPhoneBody(str, str2, languageTag, this.e.getSupportedAudioLanguageTag(languageTag), this.d.b(languageTag)), uVar);
        if (createAccountWithPhone == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return createAccountWithPhone;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    @Override // com.amazon.aps.iva.fe.f
    public final Object L1(String str, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        Object requestOtpCode = this.b.requestOtpCode(new VerifyPhoneBody(str), dVar);
        if (requestOtpCode == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return requestOtpCode;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
