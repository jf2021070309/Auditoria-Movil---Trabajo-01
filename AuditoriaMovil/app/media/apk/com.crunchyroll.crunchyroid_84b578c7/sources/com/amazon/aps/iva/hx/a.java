package com.amazon.aps.iva.hx;

import com.amazon.aps.iva.yg.g;
import com.google.gson.annotations.SerializedName;
/* compiled from: EmailVerificationBannerConfigImpl.kt */
/* loaded from: classes2.dex */
public final class a implements g {
    @SerializedName("occurrence_interval_after_dismiss_minutes")
    private final int a;
    @SerializedName("occurrence_interval_after_confirmation_minutes")
    private final int b;

    @Override // com.amazon.aps.iva.yg.g
    public final int a() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.yg.g
    public final int b() {
        return this.b;
    }
}
