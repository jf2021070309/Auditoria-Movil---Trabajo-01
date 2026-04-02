package com.amazon.aps.iva.cx;

import com.google.gson.annotations.SerializedName;
/* compiled from: DisableUsernameLoginConfigImpl.kt */
/* loaded from: classes2.dex */
public final class h implements com.amazon.aps.iva.co.b {
    @SerializedName("is_enabled")
    private final boolean a;

    @Override // com.amazon.aps.iva.co.b
    public final boolean isEnabled() {
        return this.a;
    }
}
