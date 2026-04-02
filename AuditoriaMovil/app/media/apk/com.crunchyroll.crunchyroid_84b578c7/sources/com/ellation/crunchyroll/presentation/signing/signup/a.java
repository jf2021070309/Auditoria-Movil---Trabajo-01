package com.ellation.crunchyroll.presentation.signing.signup;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.cx.l;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.auth.AuthActivity;
import com.crunchyroll.auth.c;
import com.ellation.crunchyroll.application.a;
import com.ellation.crunchyroll.presentation.signing.signin.SignInActivity;
/* compiled from: SignUpActivityResultContract.kt */
/* loaded from: classes2.dex */
public final class a extends com.amazon.aps.iva.i.a<c, Integer> {
    @Override // com.amazon.aps.iva.i.a
    public final Intent a(ComponentActivity componentActivity, Object obj) {
        Class cls;
        c cVar = (c) obj;
        j.f(componentActivity, "context");
        j.f(cVar, "input");
        com.ellation.crunchyroll.application.a aVar = a.C0959a.a;
        if (aVar != null) {
            Object c = aVar.c().c(l.class, "otp");
            if (c != null) {
                if (((l) c).b()) {
                    cls = AuthActivity.class;
                } else {
                    SignUpFlowActivity.I.getClass();
                    if (k.n(componentActivity).b) {
                        cls = SignInActivity.class;
                    } else {
                        cls = SignUpFlowActivity.class;
                    }
                }
                Intent intent = new Intent(componentActivity, cls);
                w.o(cVar, intent);
                return intent;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.OtpConfigImpl");
        }
        j.m("instance");
        throw null;
    }

    @Override // com.amazon.aps.iva.i.a
    public final Integer c(int i, Intent intent) {
        return Integer.valueOf(i);
    }
}
