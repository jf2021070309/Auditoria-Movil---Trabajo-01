package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbln {
    private static final AtomicReference<zzblm> zzb = new AtomicReference<>();
    static final AtomicBoolean zza = new AtomicBoolean();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzblm zza() {
        return zzb.get();
    }

    public static void zzb(zzblm zzblmVar) {
        zzb.set(zzblmVar);
    }
}
