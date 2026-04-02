package com.amazon.aps.iva.k10;

import android.content.Context;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.error.TooManyRequestsException;
import com.ellation.crunchyroll.presentation.forgotpassword.ForgotPasswordActivity;
/* compiled from: ForgotPasswordValidationErrorProvider.kt */
/* loaded from: classes2.dex */
public final class i implements h {
    public final Context a;

    public i(ForgotPasswordActivity forgotPasswordActivity) {
        this.a = forgotPasswordActivity;
    }

    @Override // com.amazon.aps.iva.k10.h
    public final String a(Throwable th) {
        com.amazon.aps.iva.yb0.j.f(th, "throwable");
        boolean z = th instanceof TooManyRequestsException;
        Context context = this.a;
        if (z) {
            String string = context.getString(R.string.error_message_too_many_attempts);
            com.amazon.aps.iva.yb0.j.e(string, "context.getString(R.stri…essage_too_many_attempts)");
            return string;
        }
        String string2 = context.getString(R.string.something_wrong);
        com.amazon.aps.iva.yb0.j.e(string2, "context.getString(Common…s.string.something_wrong)");
        return string2;
    }
}
