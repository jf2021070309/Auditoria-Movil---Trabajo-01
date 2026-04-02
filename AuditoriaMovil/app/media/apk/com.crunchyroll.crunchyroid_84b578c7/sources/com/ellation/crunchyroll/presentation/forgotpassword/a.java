package com.ellation.crunchyroll.presentation.forgotpassword;

import com.amazon.aps.iva.ab.r;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.presentation.forgotpassword.ForgotPasswordActivity;
/* compiled from: ForgotPasswordActivity.kt */
/* loaded from: classes2.dex */
public final class a extends l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ ForgotPasswordActivity h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ForgotPasswordActivity forgotPasswordActivity) {
        super(0);
        this.h = forgotPasswordActivity;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        ForgotPasswordActivity.a aVar = ForgotPasswordActivity.t;
        ForgotPasswordActivity forgotPasswordActivity = this.h;
        forgotPasswordActivity.ni().c1(r.p(forgotPasswordActivity.oi(), null));
        return q.a;
    }
}
