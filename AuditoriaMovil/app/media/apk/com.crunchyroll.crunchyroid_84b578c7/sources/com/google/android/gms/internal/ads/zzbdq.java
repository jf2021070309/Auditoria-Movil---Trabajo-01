package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbdq {
    private static final AtomicReference zzb = new AtomicReference();
    private static final AtomicReference zzc = new AtomicReference();
    static final AtomicBoolean zza = new AtomicBoolean();

    public static zzbdo zza() {
        return (zzbdo) zzb.get();
    }

    public static zzbdp zzb() {
        return (zzbdp) zzc.get();
    }

    public static void zzc(zzbdo zzbdoVar) {
        zzb.set(zzbdoVar);
    }
}
