package com.amazon.aps.iva.cx;

import com.amazon.aps.iva.cj.j0;
import com.google.gson.annotations.SerializedName;
/* compiled from: StreamsLimitsConfigImpl.kt */
/* loaded from: classes2.dex */
public final class q implements j0 {
    @SerializedName("is_enabled")
    private final boolean a;

    @Override // com.amazon.aps.iva.cj.j0
    public final boolean isEnabled() {
        return this.a;
    }
}
