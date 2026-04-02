package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzezq extends zzccr {
    private final zzezm zza;
    private final zzezc zzb;
    private final String zzc;
    private final zzfam zzd;
    private final Context zze;
    private zzdrw zzf;
    private boolean zzg = ((Boolean) zzbet.zzc().zzc(zzbjl.zzat)).booleanValue();

    public zzezq(String str, zzezm zzezmVar, Context context, zzezc zzezcVar, zzfam zzfamVar) {
        this.zzc = str;
        this.zza = zzezmVar;
        this.zzb = zzezcVar;
        this.zzd = zzfamVar;
        this.zze = context;
    }

    private final synchronized void zzt(zzbdg zzbdgVar, zzccz zzcczVar, int i) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzc(zzcczVar);
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzK(this.zze) && zzbdgVar.zzs == null) {
            com.google.android.gms.ads.internal.util.zze.zzf("Failed to load the ad because app ID is missing.");
            this.zzb.zzbD(zzfbm.zzd(4, null, null));
            return;
        }
        if (this.zzf != null) {
            return;
        }
        zzeze zzezeVar = new zzeze(null);
        this.zza.zzi(i);
        this.zza.zza(zzbdgVar, this.zzc, zzezeVar, new zzezp(this));
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final synchronized void zzb(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzk(iObjectWrapper, this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final synchronized void zzc(zzbdg zzbdgVar, zzccz zzcczVar) throws RemoteException {
        zzt(zzbdgVar, zzcczVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final synchronized void zzd(zzbdg zzbdgVar, zzccz zzcczVar) throws RemoteException {
        zzt(zzbdgVar, zzcczVar, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zze(zzccv zzccvVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzd(zzccvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzf(zzbgt zzbgtVar) {
        if (zzbgtVar == null) {
            this.zzb.zze(null);
        } else {
            this.zzb.zze(new zzezo(this, zzbgtVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final Bundle zzg() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdrw zzdrwVar = this.zzf;
        return zzdrwVar != null ? zzdrwVar.zzg() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final synchronized void zzh(zzcdg zzcdgVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzfam zzfamVar = this.zzd;
        zzfamVar.zza = zzcdgVar.zza;
        zzfamVar.zzb = zzcdgVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final boolean zzi() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdrw zzdrwVar = this.zzf;
        return (zzdrwVar == null || zzdrwVar.zzb()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final synchronized String zzj() throws RemoteException {
        zzdrw zzdrwVar = this.zzf;
        if (zzdrwVar == null || zzdrwVar.zzm() == null) {
            return null;
        }
        return this.zzf.zzm().zze();
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final synchronized void zzk(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzf == null) {
            com.google.android.gms.ads.internal.util.zze.zzi("Rewarded can not be shown before loaded");
            this.zzb.zzn(zzfbm.zzd(9, null, null));
            return;
        }
        this.zzf.zza(z, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final zzccp zzl() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdrw zzdrwVar = this.zzf;
        if (zzdrwVar != null) {
            return zzdrwVar.zzc();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final zzbgz zzm() {
        zzdrw zzdrwVar;
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfb)).booleanValue() && (zzdrwVar = this.zzf) != null) {
            return zzdrwVar.zzm();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzn(zzbgw zzbgwVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        this.zzb.zzg(zzbgwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final synchronized void zzo(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzg = z;
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzp(zzcda zzcdaVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzr(zzcdaVar);
    }
}
