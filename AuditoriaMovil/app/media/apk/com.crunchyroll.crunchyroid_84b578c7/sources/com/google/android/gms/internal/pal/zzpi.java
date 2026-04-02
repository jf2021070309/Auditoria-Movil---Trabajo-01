package com.google.android.gms.internal.pal;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzpi {
    private static final zzpi zza = new zzpi();
    private static final zzph zzb = new zzph(null);
    private final AtomicReference zzc = new AtomicReference();

    public static zzpi zza() {
        return zza;
    }

    public final zzrd zzb() {
        zzrd zzrdVar = (zzrd) this.zzc.get();
        if (zzrdVar == null) {
            return zzb;
        }
        return zzrdVar;
    }
}
