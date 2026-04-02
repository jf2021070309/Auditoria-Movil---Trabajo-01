package com.amazon.aps.iva.a40;

import android.content.Context;
import com.amazon.aps.iva.lb0.x;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.error.ApiErrorContext;
import com.ellation.crunchyroll.api.etp.error.BadRequestException;
import com.ellation.crunchyroll.api.etp.error.TooManyRequestsException;
/* compiled from: ChangePasswordValidationErrorProvider.kt */
/* loaded from: classes2.dex */
public final class l implements k {
    public final Context a;
    public final String b;

    public l(Context context) {
        this.a = context;
        String string = context.getString(R.string.password_change_failed);
        com.amazon.aps.iva.yb0.j.e(string, "context.getString(R.string.password_change_failed)");
        this.b = string;
    }

    @Override // com.amazon.aps.iva.a40.k
    public final String a(Throwable th) {
        String str;
        com.amazon.aps.iva.yb0.j.f(th, "throwable");
        boolean z = th instanceof BadRequestException;
        Context context = this.a;
        String str2 = this.b;
        if (z) {
            ApiErrorContext apiErrorContext = (ApiErrorContext) x.v0(((BadRequestException) th).getError().getContexts());
            if (apiErrorContext != null) {
                if (com.amazon.aps.iva.yb0.j.a(new com.amazon.aps.iva.kb0.j(apiErrorContext.getField(), apiErrorContext.getCode()), new com.amazon.aps.iva.kb0.j("new_password", "accounts.update_credentials.invalid_length"))) {
                    str = context.getString(R.string.error_message_invalid_password_minimum_length, apiErrorContext.getViolatedConstraints().get("min_length"));
                    com.amazon.aps.iva.yb0.j.e(str, "context.getString(\n     …s[\"min_length\"]\n        )");
                } else {
                    str = str2;
                }
                if (str != null) {
                    return str;
                }
                return str2;
            }
            return str2;
        } else if (th instanceof TooManyRequestsException) {
            String string = context.getString(R.string.error_message_too_many_attempts);
            com.amazon.aps.iva.yb0.j.e(string, "context.getString(\n     …o_many_attempts\n        )");
            return string;
        } else {
            return str2;
        }
    }
}
