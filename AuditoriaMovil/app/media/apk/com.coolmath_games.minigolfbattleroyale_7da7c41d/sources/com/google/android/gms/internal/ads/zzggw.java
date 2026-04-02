package com.google.android.gms.internal.ads;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public abstract class zzggw {
    private static final zzggw zza = new zzggt(null);
    private static final zzggw zzb = new zzggu(null);

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzggw(zzggv zzggvVar) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzggw zzd() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzggw zze() {
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> List<L> zza(Object obj, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(Object obj, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> void zzc(Object obj, Object obj2, long j);
}
