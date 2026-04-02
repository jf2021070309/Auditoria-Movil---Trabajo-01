package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzny {
    private static final AtomicReference zzb = new AtomicReference();
    private static final AtomicReference zzc = new AtomicReference();
    static final AtomicBoolean zza = new AtomicBoolean();

    public static zznw zza() {
        return (zznw) zzb.get();
    }

    public static zznx zzb() {
        return (zznx) zzc.get();
    }

    public static void zzc(zznw zznwVar) {
        zzb.set(zznwVar);
    }
}
