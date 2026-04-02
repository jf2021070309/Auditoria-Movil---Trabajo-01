package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzim {
    public final long zza;
    public final long zzb;
    public boolean zzc;
    public zzkb zzd;
    public zzim zze;

    public zzim(long j, int i) {
        this.zza = j;
        this.zzb = j + PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
    }

    public final int zza(long j) {
        long j2 = this.zza;
        int i = this.zzd.zzb;
        return (int) (j - j2);
    }

    public final zzim zzb() {
        this.zzd = null;
        zzim zzimVar = this.zze;
        this.zze = null;
        return zzimVar;
    }
}
