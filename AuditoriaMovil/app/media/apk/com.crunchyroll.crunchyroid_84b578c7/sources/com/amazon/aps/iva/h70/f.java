package com.amazon.aps.iva.h70;

import android.content.Context;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.error.ApiErrorContext;
import com.ellation.crunchyroll.api.etp.error.BadRequestException;
import com.ellation.crunchyroll.api.etp.error.TooManyRequestsException;
/* compiled from: PhoneNumberValidationErrorProvider.kt */
/* loaded from: classes2.dex */
public final class f implements e {
    public final Context a;

    public f(com.amazon.aps.iva.t40.c cVar) {
        this.a = cVar;
    }

    @Override // com.amazon.aps.iva.h70.e
    public final String a(Throwable th) {
        j.f(th, "throwable");
        boolean z = th instanceof BadRequestException;
        Context context = this.a;
        if (z) {
            ApiErrorContext apiErrorContext = (ApiErrorContext) x.v0(((BadRequestException) th).getError().getContexts());
            if (apiErrorContext != null) {
                com.amazon.aps.iva.kb0.j jVar = new com.amazon.aps.iva.kb0.j(apiErrorContext.getField(), apiErrorContext.getCode());
                if (j.a(jVar, new com.amazon.aps.iva.kb0.j("phone_number", "auth.phone_verify.invalid_field"))) {
                    String string = context.getString(R.string.error_message_invalid_phone);
                    j.e(string, "context.getString(R.stri…or_message_invalid_phone)");
                    return string;
                } else if (j.a(jVar, new com.amazon.aps.iva.kb0.j("phone_number", "accounts.phone_verify.invalid_field"))) {
                    String string2 = context.getString(R.string.error_message_invalid_phone);
                    j.e(string2, "context.getString(R.stri…or_message_invalid_phone)");
                    return string2;
                } else if (j.a(jVar, new com.amazon.aps.iva.kb0.j("phone_number", "accounts.phone_verify.not_unique"))) {
                    String string3 = context.getString(R.string.error_message_invalid_phone_not_unique);
                    j.e(string3, "context.getString(R.stri…invalid_phone_not_unique)");
                    return string3;
                } else {
                    String string4 = context.getString(R.string.something_wrong);
                    j.e(string4, "context.getString(Common…s.string.something_wrong)");
                    return string4;
                }
            }
            String string5 = context.getString(R.string.something_wrong);
            j.e(string5, "context.getString(Common…s.string.something_wrong)");
            return string5;
        } else if (th instanceof TooManyRequestsException) {
            String string6 = context.getString(R.string.error_message_too_many_attempts);
            j.e(string6, "context.getString(R.stri…essage_too_many_attempts)");
            return string6;
        } else {
            String string7 = context.getString(R.string.something_wrong);
            j.e(string7, "context.getString(Common…s.string.something_wrong)");
            return string7;
        }
    }
}
