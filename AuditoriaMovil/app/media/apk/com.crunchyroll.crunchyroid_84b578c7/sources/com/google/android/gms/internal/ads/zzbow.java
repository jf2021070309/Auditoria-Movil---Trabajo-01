package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbow extends zzbny {
    private final Adapter zza;
    private final zzbvc zzb;

    public zzbow(Adapter adapter, zzbvc zzbvcVar) {
        this.zza = adapter;
        this.zzb = zzbvcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zze() throws RemoteException {
        zzbvc zzbvcVar = this.zzb;
        if (zzbvcVar != null) {
            zzbvcVar.zze(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzf() throws RemoteException {
        zzbvc zzbvcVar = this.zzb;
        if (zzbvcVar != null) {
            zzbvcVar.zzf(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzg(int i) throws RemoteException {
        zzbvc zzbvcVar = this.zzb;
        if (zzbvcVar != null) {
            zzbvcVar.zzg(ObjectWrapper.wrap(this.zza), i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzo() throws RemoteException {
        zzbvc zzbvcVar = this.zzb;
        if (zzbvcVar != null) {
            zzbvcVar.zzi(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzp() throws RemoteException {
        zzbvc zzbvcVar = this.zzb;
        if (zzbvcVar != null) {
            zzbvcVar.zzj(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzt(zzbvh zzbvhVar) throws RemoteException {
        zzbvc zzbvcVar = this.zzb;
        if (zzbvcVar != null) {
            zzbvcVar.zzm(ObjectWrapper.wrap(this.zza), new zzbvd(zzbvhVar.zzf(), zzbvhVar.zze()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzu() throws RemoteException {
        zzbvc zzbvcVar = this.zzb;
        if (zzbvcVar != null) {
            zzbvcVar.zzn(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzy() throws RemoteException {
        zzbvc zzbvcVar = this.zzb;
        if (zzbvcVar != null) {
            zzbvcVar.zzo(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzm() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzn() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzv() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzw() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzx() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzh(zze zzeVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzj(int i) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzk(zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzl(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzs(zzbvd zzbvdVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzi(int i, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzq(String str, String str2) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzr(zzbff zzbffVar, String str) throws RemoteException {
    }
}
