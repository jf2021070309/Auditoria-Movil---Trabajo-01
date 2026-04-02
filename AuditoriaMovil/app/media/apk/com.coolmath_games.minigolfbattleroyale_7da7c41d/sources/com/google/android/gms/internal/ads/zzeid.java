package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public class zzeid extends zzeje {
    private final zzdix zza;

    public zzeid(zzdba zzdbaVar, zzdim zzdimVar, zzdbu zzdbuVar, zzdcj zzdcjVar, zzdco zzdcoVar, zzdbp zzdbpVar, zzdfz zzdfzVar, zzdjf zzdjfVar, zzddi zzddiVar, zzdix zzdixVar, zzdfv zzdfvVar) {
        super(zzdbaVar, zzdimVar, zzdbuVar, zzdcjVar, zzdcoVar, zzdfzVar, zzddiVar, zzdjfVar, zzdfvVar, zzdbpVar);
        this.zza = zzdixVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeje, com.google.android.gms.internal.ads.zzbvm
    public final void zzn() {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzeje, com.google.android.gms.internal.ads.zzbvm
    public final void zzo() {
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeje, com.google.android.gms.internal.ads.zzbvm
    public final void zzp(zzccl zzcclVar) {
        this.zza.zzb(zzcclVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeje, com.google.android.gms.internal.ads.zzbvm
    public final void zzr(zzccp zzccpVar) throws RemoteException {
        this.zza.zzb(new zzccl(zzccpVar.zze(), zzccpVar.zzf()));
    }

    @Override // com.google.android.gms.internal.ads.zzeje, com.google.android.gms.internal.ads.zzbvm
    public final void zzt() throws RemoteException {
        this.zza.zzc();
    }
}
