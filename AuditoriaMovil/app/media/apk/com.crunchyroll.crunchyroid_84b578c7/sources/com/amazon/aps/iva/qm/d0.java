package com.amazon.aps.iva.qm;

import android.content.Context;
import com.crunchyroll.crunchyroid.R;
import com.crunchyroll.profiles.presentation.profileactivation.ProfileActivationActivityLegacy;
import com.ellation.crunchyroll.api.etp.error.ApiErrorContext;
import com.ellation.crunchyroll.api.etp.error.BadRequestException;
/* compiled from: SetUsernameValidationErrorProvider.kt */
/* loaded from: classes2.dex */
public final class d0 implements c0 {
    public final Context a;
    public final String b;

    public d0(ProfileActivationActivityLegacy profileActivationActivityLegacy) {
        this.a = profileActivationActivityLegacy;
        String string = profileActivationActivityLegacy.getString(R.string.something_wrong);
        com.amazon.aps.iva.yb0.j.e(string, "context.getString(Common…s.string.something_wrong)");
        this.b = string;
    }

    @Override // com.amazon.aps.iva.qm.c0
    public final e0 a(Throwable th) {
        com.amazon.aps.iva.yb0.j.f(th, "throwable");
        boolean z = th instanceof BadRequestException;
        String str = this.b;
        if (z) {
            ApiErrorContext apiErrorContext = (ApiErrorContext) com.amazon.aps.iva.lb0.x.v0(((BadRequestException) th).getError().getContexts());
            if (apiErrorContext != null) {
                com.amazon.aps.iva.kb0.j jVar = new com.amazon.aps.iva.kb0.j(apiErrorContext.getField(), apiErrorContext.getCode());
                boolean a = com.amazon.aps.iva.yb0.j.a(jVar, new com.amazon.aps.iva.kb0.j("username", "accounts.update_credentials.invalid_field"));
                Context context = this.a;
                if (a) {
                    if (apiErrorContext.getViolatedConstraints().isEmpty()) {
                        String string = context.getString(R.string.error_message_username_has_invalid_characters);
                        com.amazon.aps.iva.yb0.j.e(string, "context.getString(R.stri…e_has_invalid_characters)");
                        return new e0(string, null);
                    }
                    String string2 = context.getString(R.string.error_message_username_is_unavailable_with_suggestion);
                    com.amazon.aps.iva.yb0.j.e(string2, "context.getString(\n     …                        )");
                    return new e0(string2, apiErrorContext.getViolatedConstraints().get("username"));
                } else if (com.amazon.aps.iva.yb0.j.a(jVar, new com.amazon.aps.iva.kb0.j("username", "accounts.update_credentials.not_unique"))) {
                    String string3 = context.getString(R.string.error_message_username_is_unavailable);
                    com.amazon.aps.iva.yb0.j.e(string3, "context.getString(R.stri…_username_is_unavailable)");
                    return new e0(string3, null);
                } else if (com.amazon.aps.iva.yb0.j.a(jVar, new com.amazon.aps.iva.kb0.j("username", "accounts.update_credentials.invalid_length"))) {
                    String string4 = context.getString(R.string.error_message_username_invalid_length);
                    com.amazon.aps.iva.yb0.j.e(string4, "context.getString(R.stri…_username_invalid_length)");
                    return new e0(string4, null);
                } else {
                    return new e0(str, null);
                }
            }
            return new e0(str, null);
        }
        return new e0(str, null);
    }
}
