package com.amazon.aps.iva.u40;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import com.amazon.aps.iva.e.w;
import com.crunchyroll.auth.AuthActivity;
import com.ellation.crunchyroll.application.a;
import com.ellation.crunchyroll.presentation.signing.signin.SignInActivity;
/* compiled from: SignInActivityResultContract.kt */
/* loaded from: classes2.dex */
public final class a extends com.amazon.aps.iva.i.a<com.crunchyroll.auth.c, Integer> {
    @Override // com.amazon.aps.iva.i.a
    public final Intent a(ComponentActivity componentActivity, Object obj) {
        Class cls;
        com.crunchyroll.auth.c cVar = (com.crunchyroll.auth.c) obj;
        com.amazon.aps.iva.yb0.j.f(componentActivity, "context");
        com.amazon.aps.iva.yb0.j.f(cVar, "input");
        com.ellation.crunchyroll.application.a aVar = a.C0959a.a;
        if (aVar != null) {
            Object c = aVar.c().c(com.amazon.aps.iva.cx.l.class, "otp");
            if (c != null) {
                if (((com.amazon.aps.iva.cx.l) c).b()) {
                    cls = AuthActivity.class;
                } else {
                    cls = SignInActivity.class;
                }
                Intent intent = new Intent(componentActivity, cls);
                w.o(cVar, intent);
                intent.addFlags(131072);
                return intent;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.OtpConfigImpl");
        }
        com.amazon.aps.iva.yb0.j.m("instance");
        throw null;
    }

    @Override // com.amazon.aps.iva.i.a
    public final Integer c(int i, Intent intent) {
        return Integer.valueOf(i);
    }
}
