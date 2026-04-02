package com.amazon.aps.iva.h70;

import android.content.Context;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.error.ApiErrorContext;
import com.ellation.crunchyroll.api.etp.error.BadRequestException;
import com.ellation.crunchyroll.api.etp.error.TooManyRequestsException;
import com.ellation.crunchyroll.api.etp.error.UnauthorizedAccessException;
import com.google.android.gms.common.Scopes;
/* compiled from: EmailAndPasswordValidationErrorProvider.kt */
/* loaded from: classes2.dex */
public final class d implements c {
    public final Context a;

    public d(com.amazon.aps.iva.i60.b bVar) {
        this.a = bVar;
    }

    @Override // com.amazon.aps.iva.h70.c
    public final String a(Throwable th) {
        j.f(th, "throwable");
        boolean z = th instanceof BadRequestException;
        Context context = this.a;
        if (z) {
            ApiErrorContext apiErrorContext = (ApiErrorContext) x.v0(((BadRequestException) th).getError().getContexts());
            if (apiErrorContext != null) {
                com.amazon.aps.iva.kb0.j jVar = new com.amazon.aps.iva.kb0.j(apiErrorContext.getField(), apiErrorContext.getCode());
                if (j.a(jVar, new com.amazon.aps.iva.kb0.j(Scopes.EMAIL, "accounts.create_account_v2.invalid_field"))) {
                    String string = context.getString(R.string.error_message_invalid_email);
                    j.e(string, "context.getString(R.stri…or_message_invalid_email)");
                    return string;
                } else if (j.a(jVar, new com.amazon.aps.iva.kb0.j(Scopes.EMAIL, "accounts.create_account_v2.not_unique"))) {
                    String string2 = context.getString(R.string.error_message_invalid_email_non_unique);
                    j.e(string2, "context.getString(R.stri…invalid_email_non_unique)");
                    return string2;
                } else if (j.a(jVar, new com.amazon.aps.iva.kb0.j("password", "accounts.create_account_v2.invalid_length"))) {
                    String string3 = context.getString(R.string.error_message_invalid_password_minimum_length, apiErrorContext.getViolatedConstraints().get("min_length"));
                    j.e(string3, "context.getString(\n     …s[\"min_length\"]\n        )");
                    return string3;
                } else if (j.a(jVar, new com.amazon.aps.iva.kb0.j("password", "accounts.create_account_v2.invalid_field"))) {
                    String string4 = context.getString(R.string.error_message_invalid_password);
                    j.e(string4, "context.getString(R.stri…message_invalid_password)");
                    return string4;
                } else {
                    String string5 = context.getString(R.string.something_wrong);
                    j.e(string5, "context.getString(Common…s.string.something_wrong)");
                    return string5;
                }
            }
            String string6 = context.getString(R.string.something_wrong);
            j.e(string6, "context.getString(Common…s.string.something_wrong)");
            return string6;
        } else if (th instanceof UnauthorizedAccessException) {
            String string7 = context.getString(R.string.error_message_sign_in_up);
            j.e(string7, "context.getString(R.stri…error_message_sign_in_up)");
            return string7;
        } else if (th instanceof TooManyRequestsException) {
            String string8 = context.getString(R.string.error_message_too_many_attempts);
            j.e(string8, "context.getString(R.stri…essage_too_many_attempts)");
            return string8;
        } else {
            String string9 = context.getString(R.string.something_wrong);
            j.e(string9, "context.getString(Common…s.string.something_wrong)");
            return string9;
        }
    }
}
