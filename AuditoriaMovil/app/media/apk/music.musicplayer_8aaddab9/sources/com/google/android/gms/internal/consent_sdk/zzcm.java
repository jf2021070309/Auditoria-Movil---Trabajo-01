package com.google.android.gms.internal.consent_sdk;

import java.util.Objects;
/* loaded from: classes.dex */
public final class zzcm extends zzci {
    private final zzcl zza = new zzcl();

    @Override // com.google.android.gms.internal.consent_sdk.zzci
    public final void zza(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        Objects.requireNonNull(th2, "The suppressed exception cannot be null.");
        this.zza.zza(th, true).add(th2);
    }
}
