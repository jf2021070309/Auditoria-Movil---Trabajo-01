package com.amazon.aps.iva.cx;

import com.google.gson.annotations.SerializedName;
import java.util.concurrent.TimeUnit;
/* compiled from: ScreenReloadIntervalsImpl.kt */
/* loaded from: classes2.dex */
public final class p {
    @SerializedName("short_interval_minutes")
    private final long a;
    @SerializedName("medium_interval_minutes")
    private final long b;
    @SerializedName("long_interval_minutes")
    private final long c;

    public final long a() {
        return TimeUnit.MINUTES.toMillis(this.c);
    }

    public final long b() {
        return TimeUnit.MINUTES.toMillis(this.b);
    }

    public final long c() {
        return TimeUnit.MINUTES.toMillis(this.a);
    }
}
