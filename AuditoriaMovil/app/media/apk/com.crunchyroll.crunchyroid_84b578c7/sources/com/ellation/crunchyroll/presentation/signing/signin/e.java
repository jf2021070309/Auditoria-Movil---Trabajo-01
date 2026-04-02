package com.ellation.crunchyroll.presentation.signing.signin;

import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.presentation.signing.signin.SignInActivity;
/* compiled from: SignInActivity.kt */
/* loaded from: classes2.dex */
public final class e extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.v70.b> {
    public final /* synthetic */ SignInActivity h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SignInActivity signInActivity) {
        super(0);
        this.h = signInActivity;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.v70.b invoke() {
        SignInActivity.a aVar = SignInActivity.O;
        return this.h.ui().getCurrentSwitcherItem();
    }
}
