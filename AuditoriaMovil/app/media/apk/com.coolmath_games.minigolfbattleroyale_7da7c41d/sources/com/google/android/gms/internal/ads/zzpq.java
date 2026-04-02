package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
abstract class zzpq {
    protected final zzox zza;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzpq(zzox zzoxVar) {
        this.zza = zzoxVar;
    }

    protected abstract boolean zza(zzamf zzamfVar) throws zzaha;

    protected abstract boolean zzb(zzamf zzamfVar, long j) throws zzaha;

    public final boolean zzf(zzamf zzamfVar, long j) throws zzaha {
        return zza(zzamfVar) && zzb(zzamfVar, j);
    }
}
