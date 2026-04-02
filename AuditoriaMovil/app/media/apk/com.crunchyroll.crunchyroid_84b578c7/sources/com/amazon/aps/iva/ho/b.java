package com.amazon.aps.iva.ho;

import android.content.Context;
import android.content.Intent;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.usermigration.terms.AcceptTermsAndPrivacyPolicyActivity;
import com.crunchyroll.usermigration.verification.CrOwnershipVerificationActivity;
import com.crunchyroll.usermigration.welcome.UserMigrationWelcomeActivity;
/* compiled from: ScreensLauncher.kt */
/* loaded from: classes2.dex */
public final class b implements a {
    public final Context a;
    public final com.amazon.aps.iva.h.c<Intent> b;

    public b(com.amazon.aps.iva.i60.b bVar, com.amazon.aps.iva.h.c cVar) {
        j.f(bVar, "context");
        this.a = bVar;
        this.b = cVar;
    }

    @Override // com.amazon.aps.iva.ho.a
    public final void n0() {
        int i = AcceptTermsAndPrivacyPolicyActivity.n;
        Context context = this.a;
        j.f(context, "context");
        context.startActivity(new Intent(context, AcceptTermsAndPrivacyPolicyActivity.class));
    }

    @Override // com.amazon.aps.iva.ho.a
    public final void o0(boolean z) {
        UserMigrationWelcomeActivity.n.getClass();
        Context context = this.a;
        j.f(context, "context");
        Intent intent = new Intent(context, UserMigrationWelcomeActivity.class);
        intent.putExtra("show_steps_title", z);
        context.startActivity(intent);
    }

    @Override // com.amazon.aps.iva.ho.a
    public final void p0(String str) {
        j.f(str, "emailText");
        com.amazon.aps.iva.h.c<Intent> cVar = this.b;
        if (cVar != null) {
            CrOwnershipVerificationActivity.o.getClass();
            Context context = this.a;
            j.f(context, "context");
            cVar.a(new Intent(context, CrOwnershipVerificationActivity.class).putExtra("email_edit_text", str));
        }
    }
}
