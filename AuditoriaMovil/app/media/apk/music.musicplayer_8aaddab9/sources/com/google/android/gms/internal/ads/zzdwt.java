package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;
/* loaded from: classes.dex */
public final class zzdwt implements zzdwh {
    private final long zza;
    private final zzelq zzb;

    public zzdwt(long j2, Context context, zzdwm zzdwmVar, zzcoj zzcojVar, String str) {
        this.zza = j2;
        zzeye zzq = zzcojVar.zzq();
        zzq.zzd(context);
        zzq.zzb(new zzbdl());
        zzq.zzc(str);
        zzelq zza = zzq.zza().zza();
        this.zzb = zza;
        zza.zzo(new zzdws(this, zzdwmVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdwh
    public final void zza(zzbdg zzbdgVar) {
        this.zzb.zzl(zzbdgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwh
    public final void zzb() {
        this.zzb.zzZ(ObjectWrapper.wrap(null));
    }

    @Override // com.google.android.gms.internal.ads.zzdwh
    public final void zzc() {
        this.zzb.zzj();
    }
}
