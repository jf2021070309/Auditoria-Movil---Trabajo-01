package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* loaded from: classes.dex */
public final class zzeis extends zzccj {
    public final /* synthetic */ zzddi zza;
    public final /* synthetic */ zzdba zzb;
    public final /* synthetic */ zzdcj zzc;
    public final /* synthetic */ zzdix zzd;

    public zzeis(zzeit zzeitVar, zzddi zzddiVar, zzdba zzdbaVar, zzdcj zzdcjVar, zzdix zzdixVar) {
        this.zza = zzddiVar;
        this.zzb = zzdbaVar;
        this.zzc = zzdcjVar;
        this.zzd = zzdixVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final void zze(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final void zzf(IObjectWrapper iObjectWrapper, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final void zzg(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final void zzh(IObjectWrapper iObjectWrapper) {
        this.zza.zzbp();
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final void zzi(IObjectWrapper iObjectWrapper) {
        this.zzd.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zza.zzbs(4);
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final void zzk(IObjectWrapper iObjectWrapper, zzccl zzcclVar) {
        this.zzd.zzb(zzcclVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final void zzl(IObjectWrapper iObjectWrapper) {
        zzdba zzdbaVar = this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final void zzm(IObjectWrapper iObjectWrapper, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final void zzn(IObjectWrapper iObjectWrapper) {
        this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        this.zzc.zzf();
    }
}
