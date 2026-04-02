package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class zzelq extends zzbfm {
    private final zzbdl zza;
    private final Context zzb;
    private final zzeyc zzc;
    private final String zzd;
    private final zzeli zze;
    private final zzezc zzf;
    @GuardedBy("this")
    private zzdji zzg;
    @GuardedBy("this")
    private boolean zzh = ((Boolean) zzbet.zzc().zzc(zzbjl.zzat)).booleanValue();

    public zzelq(Context context, zzbdl zzbdlVar, String str, zzeyc zzeycVar, zzeli zzeliVar, zzezc zzezcVar) {
        this.zza = zzbdlVar;
        this.zzd = str;
        this.zzb = context;
        this.zzc = zzeycVar;
        this.zze = zzeliVar;
        this.zzf = zzezcVar;
    }

    private final synchronized boolean zzd() {
        boolean z;
        zzdji zzdjiVar = this.zzg;
        if (zzdjiVar != null) {
            z = zzdjiVar.zzb() ? false : true;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized zzbgz zzA() {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfb)).booleanValue()) {
            zzdji zzdjiVar = this.zzg;
            if (zzdjiVar == null) {
                return null;
            }
            return zzdjiVar.zzm();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized String zzB() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final zzbfu zzC() {
        return this.zze.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final zzbfa zzD() {
        return this.zze.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized void zzE(zzbkg zzbkgVar) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzc.zzg(zzbkgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzF(zzbex zzbexVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzG(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized boolean zzH() {
        return this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzI(zzccf zzccfVar) {
        this.zzf.zzp(zzccfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzJ(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzK(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final zzbhc zzL() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzM(zzbis zzbisVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzN(zzbhg zzbhgVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzO(zzbdr zzbdrVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzP(zzaxz zzaxzVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized void zzQ(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzh = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzX(zzbgw zzbgwVar) {
        Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        this.zze.zzr(zzbgwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzY(zzbdg zzbdgVar, zzbfd zzbfdVar) {
        this.zze.zzs(zzbfdVar);
        zzl(zzbdgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized void zzZ(IObjectWrapper iObjectWrapper) {
        if (this.zzg == null) {
            zzcgt.zzi("Interstitial can not be shown before loaded.");
            this.zze.zzn(zzfbm.zzd(9, null, null));
            return;
        }
        this.zzg.zza(this.zzh, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzaa(zzbgb zzbgbVar) {
        this.zze.zzt(zzbgbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzab(zzbfy zzbfyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final IObjectWrapper zzi() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized void zzj() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zzdji zzdjiVar = this.zzg;
        if (zzdjiVar != null) {
            zzdjiVar.zzl().zzc(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized boolean zzk() {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized boolean zzl(zzbdg zzbdgVar) {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzK(this.zzb) && zzbdgVar.zzs == null) {
            zzcgt.zzf("Failed to load the ad because app ID is missing.");
            zzeli zzeliVar = this.zze;
            if (zzeliVar != null) {
                zzeliVar.zzbD(zzfbm.zzd(4, null, null));
            }
            return false;
        } else if (zzd()) {
            return false;
        } else {
            zzfbh.zzb(this.zzb, zzbdgVar.zzf);
            this.zzg = null;
            return this.zzc.zza(zzbdgVar, this.zzd, new zzexv(this.zza), new zzelp(this));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized void zzm() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        zzdji zzdjiVar = this.zzg;
        if (zzdjiVar != null) {
            zzdjiVar.zzl().zza(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized void zzn() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        zzdji zzdjiVar = this.zzg;
        if (zzdjiVar != null) {
            zzdjiVar.zzl().zzb(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzo(zzbfa zzbfaVar) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.zze.zze(zzbfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzp(zzbfu zzbfuVar) {
        Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        this.zze.zzp(zzbfuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzq(zzbfr zzbfrVar) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final Bundle zzr() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized void zzs() {
        Preconditions.checkMainThread("showInterstitial must be called on the main UI thread.");
        zzdji zzdjiVar = this.zzg;
        if (zzdjiVar != null) {
            zzdjiVar.zza(this.zzh, null);
            return;
        }
        zzcgt.zzi("Interstitial can not be shown before loaded.");
        this.zze.zzn(zzfbm.zzd(9, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzt() {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final zzbdl zzu() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzv(zzbdl zzbdlVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzw(zzbzz zzbzzVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzx(zzcac zzcacVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized String zzy() {
        zzdji zzdjiVar = this.zzg;
        if (zzdjiVar == null || zzdjiVar.zzm() == null) {
            return null;
        }
        return this.zzg.zzm().zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized String zzz() {
        zzdji zzdjiVar = this.zzg;
        if (zzdjiVar == null || zzdjiVar.zzm() == null) {
            return null;
        }
        return this.zzg.zzm().zze();
    }
}
