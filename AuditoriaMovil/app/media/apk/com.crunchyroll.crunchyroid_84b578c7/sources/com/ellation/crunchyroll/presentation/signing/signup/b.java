package com.ellation.crunchyroll.presentation.signing.signup;

import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.presentation.signing.signup.SignUpFlowActivity;
import com.ellation.widgets.switcher.SwitcherLayout;
/* compiled from: SignUpFlowActivity.kt */
/* loaded from: classes2.dex */
public final class b extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.v70.b> {
    public final /* synthetic */ SignUpFlowActivity h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SignUpFlowActivity signUpFlowActivity) {
        super(0);
        this.h = signUpFlowActivity;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.v70.b invoke() {
        SignUpFlowActivity.a aVar = SignUpFlowActivity.I;
        SignUpFlowActivity signUpFlowActivity = this.h;
        signUpFlowActivity.getClass();
        return ((SwitcherLayout) signUpFlowActivity.C.getValue(signUpFlowActivity, SignUpFlowActivity.J[5])).getCurrentSwitcherItem();
    }
}
