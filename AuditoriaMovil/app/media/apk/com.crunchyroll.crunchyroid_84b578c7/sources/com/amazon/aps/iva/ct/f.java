package com.amazon.aps.iva.ct;

import com.google.gson.annotations.SerializedName;
import java.util.concurrent.TimeUnit;
/* compiled from: UserBenefitsConfigImpl.kt */
/* loaded from: classes2.dex */
public final class f implements e {
    @SerializedName("fetch_interval_sec")
    private final long a;

    @Override // com.amazon.aps.iva.ct.e
    public final long a() {
        return TimeUnit.SECONDS.toMillis(this.a);
    }
}
