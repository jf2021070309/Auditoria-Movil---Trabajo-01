package com.ellation.crunchyroll.presentation.signing.signin;

import com.amazon.aps.iva.yb0.i;
/* compiled from: SignInActivity.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class c extends i implements com.amazon.aps.iva.xb0.a<Boolean> {
    public c(com.amazon.aps.iva.co.f fVar) {
        super(0, fVar, com.amazon.aps.iva.co.f.class, "isOwnershipVerificationNeeded", "isOwnershipVerificationNeeded()Z", 0);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Boolean invoke() {
        return Boolean.valueOf(((com.amazon.aps.iva.co.f) this.receiver).a());
    }
}
