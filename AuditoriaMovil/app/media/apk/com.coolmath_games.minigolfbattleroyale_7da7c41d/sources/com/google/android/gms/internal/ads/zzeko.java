package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzeko extends zzbfm implements zzdds {
    private final Context zza;
    private final zzewj zzb;
    private final String zzc;
    private final zzeli zzd;
    private zzbdl zze;
    private final zzfap zzf;
    private zzcvh zzg;

    public zzeko(Context context, zzbdl zzbdlVar, String str, zzewj zzewjVar, zzeli zzeliVar) {
        this.zza = context;
        this.zzb = zzewjVar;
        this.zze = zzbdlVar;
        this.zzc = str;
        this.zzd = zzeliVar;
        this.zzf = zzewjVar.zzl();
        zzewjVar.zzn(this);
    }

    private final synchronized void zzd(zzbdl zzbdlVar) {
        this.zzf.zzt(zzbdlVar);
        this.zzf.zzu(this.zze.zzn);
    }

    private final synchronized boolean zze(zzbdg zzbdgVar) throws RemoteException {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        com.google.android.gms.ads.internal.zzt.zzc();
        if (!com.google.android.gms.ads.internal.util.zzs.zzK(this.zza) || zzbdgVar.zzs != null) {
            zzfbh.zzb(this.zza, zzbdgVar.zzf);
            return this.zzb.zza(zzbdgVar, this.zzc, null, new zzekn(this));
        }
        com.google.android.gms.ads.internal.util.zze.zzf("Failed to load the ad because app ID is missing.");
        zzeli zzeliVar = this.zzd;
        if (zzeliVar != null) {
            zzeliVar.zzbD(zzfbm.zzd(4, null, null));
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized zzbgz zzA() {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfb)).booleanValue()) {
            zzcvh zzcvhVar = this.zzg;
            if (zzcvhVar == null) {
                return null;
            }
            return zzcvhVar.zzm();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized String zzB() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final zzbfu zzC() {
        return this.zzd.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final zzbfa zzD() {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized void zzE(zzbkg zzbkgVar) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzb.zzj(zzbkgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzF(zzbex zzbexVar) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.zzb.zzk(zzbexVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized void zzG(boolean z) {
        Preconditions.checkMainThread("setManualImpressionsEnabled must be called from the main thread.");
        this.zzf.zzA(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized boolean zzH() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzI(zzccf zzccfVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzJ(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzK(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized zzbhc zzL() {
        Preconditions.checkMainThread("getVideoController must be called from the main thread.");
        zzcvh zzcvhVar = this.zzg;
        if (zzcvhVar != null) {
            return zzcvhVar.zzc();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized void zzM(zzbis zzbisVar) {
        Preconditions.checkMainThread("setVideoOptions must be called on the main UI thread.");
        this.zzf.zzy(zzbisVar);
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
    public final void zzQ(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzX(zzbgw zzbgwVar) {
        Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        this.zzd.zzr(zzbgwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzY(zzbdg zzbdgVar, zzbfd zzbfdVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzZ(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final synchronized void zza() {
        if (this.zzb.zzm()) {
            zzbdl zzv = this.zzf.zzv();
            zzcvh zzcvhVar = this.zzg;
            if (zzcvhVar != null && zzcvhVar.zzf() != null && this.zzf.zzM()) {
                zzv = zzfav.zzb(this.zza, Collections.singletonList(this.zzg.zzf()));
            }
            zzd(zzv);
            try {
                zze(this.zzf.zzs());
                return;
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.zze.zzi("Failed to refresh the banner ad.");
                return;
            }
        }
        this.zzb.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzaa(zzbgb zzbgbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized void zzab(zzbfy zzbfyVar) {
        Preconditions.checkMainThread("setCorrelationIdProvider must be called on the main UI thread");
        this.zzf.zzO(zzbfyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final IObjectWrapper zzi() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        return ObjectWrapper.wrap(this.zzb.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized void zzj() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zzcvh zzcvhVar = this.zzg;
        if (zzcvhVar != null) {
            zzcvhVar.zzT();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final boolean zzk() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized boolean zzl(zzbdg zzbdgVar) throws RemoteException {
        zzd(this.zze);
        return zze(zzbdgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized void zzm() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        zzcvh zzcvhVar = this.zzg;
        if (zzcvhVar != null) {
            zzcvhVar.zzl().zza(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized void zzn() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        zzcvh zzcvhVar = this.zzg;
        if (zzcvhVar != null) {
            zzcvhVar.zzl().zzb(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzo(zzbfa zzbfaVar) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.zzd.zze(zzbfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzp(zzbfu zzbfuVar) {
        Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        this.zzd.zzp(zzbfuVar);
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
    public final void zzs() {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized void zzt() {
        Preconditions.checkMainThread("recordManualImpression must be called on the main UI thread.");
        zzcvh zzcvhVar = this.zzg;
        if (zzcvhVar != null) {
            zzcvhVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized zzbdl zzu() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        zzcvh zzcvhVar = this.zzg;
        if (zzcvhVar != null) {
            return zzfav.zzb(this.zza, Collections.singletonList(zzcvhVar.zze()));
        }
        return this.zzf.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized void zzv(zzbdl zzbdlVar) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        this.zzf.zzt(zzbdlVar);
        this.zze = zzbdlVar;
        zzcvh zzcvhVar = this.zzg;
        if (zzcvhVar != null) {
            zzcvhVar.zzb(this.zzb.zzi(), zzbdlVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzw(zzbzz zzbzzVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzx(zzcac zzcacVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized String zzy() {
        zzcvh zzcvhVar = this.zzg;
        if (zzcvhVar == null || zzcvhVar.zzm() == null) {
            return null;
        }
        return this.zzg.zzm().zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized String zzz() {
        zzcvh zzcvhVar = this.zzg;
        if (zzcvhVar == null || zzcvhVar.zzm() == null) {
            return null;
        }
        return this.zzg.zzm().zze();
    }
}
