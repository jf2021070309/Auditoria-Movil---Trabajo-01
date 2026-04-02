package com.ellation.crunchyroll.presentation.signing.signin;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.presentation.signing.signin.SignInActivity;
/* compiled from: SignInActivity.kt */
/* loaded from: classes2.dex */
public final class a extends l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ SignInActivity h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SignInActivity signInActivity) {
        super(0);
        this.h = signInActivity;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        SignInActivity.a aVar = SignInActivity.O;
        this.h.vi().R2(null);
        return q.a;
    }
}
