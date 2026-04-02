package com.amazon.aps.iva.yd;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import com.crunchyroll.auth.emailmandatory.EmailMandatoryActivity;
/* compiled from: EmailMandatoryActivityResultContract.kt */
/* loaded from: classes.dex */
public final class d extends com.amazon.aps.iva.i.a<g, Integer> {
    @Override // com.amazon.aps.iva.i.a
    public final Intent a(ComponentActivity componentActivity, Object obj) {
        g gVar = (g) obj;
        com.amazon.aps.iva.yb0.j.f(componentActivity, "context");
        com.amazon.aps.iva.yb0.j.f(gVar, "input");
        Intent intent = new Intent(componentActivity, EmailMandatoryActivity.class);
        intent.putExtra("email_mandatory_is_sign_up", gVar.a);
        return intent;
    }

    @Override // com.amazon.aps.iva.i.a
    public final Integer c(int i, Intent intent) {
        return Integer.valueOf(i);
    }
}
