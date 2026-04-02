package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzezw extends zzccb {
    private final zzezm zza;
    private final zzezc zzb;
    private final zzfam zzc;
    private zzdrw zzd;
    private boolean zze = false;

    public zzezw(zzezm zzezmVar, zzezc zzezcVar, zzfam zzfamVar) {
        this.zza = zzezmVar;
        this.zzb = zzezcVar;
        this.zzc = zzfamVar;
    }

    private final synchronized boolean zzx() {
        boolean z;
        zzdrw zzdrwVar = this.zzd;
        if (zzdrwVar != null) {
            z = zzdrwVar.zze() ? false : true;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final synchronized void zzb(zzccg zzccgVar) throws RemoteException {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        String str = zzccgVar.zzb;
        String str2 = (String) zzbet.zzc().zzc(zzbjl.zzdJ);
        if (str2 != null && str != null) {
            try {
                if (Pattern.matches(str2, str)) {
                    return;
                }
            } catch (RuntimeException e) {
                com.google.android.gms.ads.internal.zzt.zzg().zzk(e, "NonagonUtil.isPatternMatched");
            }
        }
        if (zzx()) {
            if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzdL)).booleanValue()) {
                return;
            }
        }
        zzeze zzezeVar = new zzeze(null);
        this.zzd = null;
        this.zza.zzi(1);
        this.zza.zza(zzccgVar.zza, zzccgVar.zzb, zzezeVar, new zzezu(this));
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final synchronized void zzc() throws RemoteException {
        zzp(null);
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final void zzd(zzccf zzccfVar) throws RemoteException {
        Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzb.zzp(zzccfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final boolean zze() throws RemoteException {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final void zzf() {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final void zzg() {
        zzj(null);
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final void zzh() throws RemoteException {
        zzk(null);
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzl().zza(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final synchronized void zzj(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzl().zzb(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final synchronized void zzk(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        Context context = null;
        this.zzb.zze(null);
        if (this.zzd != null) {
            if (iObjectWrapper != null) {
                context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            }
            this.zzd.zzl().zzc(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final synchronized String zzl() throws RemoteException {
        zzdrw zzdrwVar = this.zzd;
        if (zzdrwVar == null || zzdrwVar.zzm() == null) {
            return null;
        }
        return this.zzd.zzm().zze();
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final synchronized void zzm(String str) throws RemoteException {
        Preconditions.checkMainThread("setUserId must be called on the main UI thread.");
        this.zzc.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final void zzn(zzbfr zzbfrVar) {
        Preconditions.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
        if (zzbfrVar == null) {
            this.zzb.zze(null);
        } else {
            this.zzb.zze(new zzezv(this, zzbfrVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final Bundle zzo() {
        Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
        zzdrw zzdrwVar = this.zzd;
        return zzdrwVar != null ? zzdrwVar.zzg() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final synchronized void zzp(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.checkMainThread("showAd must be called on the main UI thread.");
        if (this.zzd != null) {
            Activity activity = null;
            if (iObjectWrapper != null) {
                Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
                if (unwrap instanceof Activity) {
                    activity = (Activity) unwrap;
                }
            }
            this.zzd.zza(this.zze, activity);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final synchronized void zzq(String str) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
        this.zzc.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final synchronized void zzr(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zze = z;
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final boolean zzs() {
        zzdrw zzdrwVar = this.zzd;
        return zzdrwVar != null && zzdrwVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final synchronized zzbgz zzt() throws RemoteException {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfb)).booleanValue()) {
            zzdrw zzdrwVar = this.zzd;
            if (zzdrwVar != null) {
                return zzdrwVar.zzm();
            }
            return null;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final void zzu(zzcca zzccaVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzb.zzs(zzccaVar);
    }
}
