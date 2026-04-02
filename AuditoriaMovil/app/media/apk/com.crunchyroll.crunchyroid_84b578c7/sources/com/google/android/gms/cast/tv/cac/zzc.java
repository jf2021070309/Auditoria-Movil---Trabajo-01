package com.google.android.gms.cast.tv.cac;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.cast_tv.zzaj;
import com.google.android.gms.internal.cast_tv.zzcb;
import com.google.android.gms.internal.cast_tv.zzeq;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzc {
    private final zzg zza;
    private final zzcb zzb;

    public zzc(zzaj zzajVar, zzcb zzcbVar) {
        this.zzb = zzcbVar;
        this.zza = new zzg(new zza(zzajVar), new zzb(this));
    }

    public final void zza(String str, String str2, String str3, zzeq zzeqVar) {
        this.zza.zzf(str2, str3, zzeqVar);
    }

    @VisibleForTesting
    public final void zzb(String str, String str2) {
        this.zzb.zza(str, str2);
    }
}
