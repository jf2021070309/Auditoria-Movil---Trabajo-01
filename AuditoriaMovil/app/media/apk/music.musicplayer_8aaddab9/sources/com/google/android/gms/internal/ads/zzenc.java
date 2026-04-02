package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class zzenc {
    private final AtomicBoolean zza = new AtomicBoolean(false);

    public final void zza(boolean z) {
        this.zza.set(true);
    }

    public final boolean zzb() {
        return this.zza.get();
    }
}
