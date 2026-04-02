package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzeuv extends zzbfm implements com.google.android.gms.ads.internal.overlay.zzz, zzaxq, zzddb {
    protected zzcuq zza;
    private final zzcoj zzb;
    private final Context zzc;
    private final ViewGroup zzd;
    private final String zzf;
    private final zzeup zzg;
    private final zzevv zzh;
    private final zzcgz zzi;
    private zzcuc zzk;
    private AtomicBoolean zze = new AtomicBoolean();
    private long zzj = -1;

    public zzeuv(zzcoj zzcojVar, Context context, String str, zzeup zzeupVar, zzevv zzevvVar, zzcgz zzcgzVar) {
        this.zzd = new FrameLayout(context);
        this.zzb = zzcojVar;
        this.zzc = context;
        this.zzf = str;
        this.zzg = zzeupVar;
        this.zzh = zzevvVar;
        zzevvVar.zzj(this);
        this.zzi = zzcgzVar;
    }

    private final synchronized void zzT(int i) {
        if (this.zze.compareAndSet(false, true)) {
            zzcuq zzcuqVar = this.zza;
            if (zzcuqVar != null && zzcuqVar.zzk() != null) {
                this.zzh.zzr(this.zza.zzk());
            }
            this.zzh.zzp();
            this.zzd.removeAllViews();
            zzcuc zzcucVar = this.zzk;
            if (zzcucVar != null) {
                com.google.android.gms.ads.internal.zzt.zzf().zzc(zzcucVar);
            }
            if (this.zza != null) {
                long j = -1;
                if (this.zzj != -1) {
                    j = com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime() - this.zzj;
                }
                this.zza.zzi(j, i);
            }
            zzj();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ com.google.android.gms.ads.internal.overlay.zzq zzf(zzeuv zzeuvVar, zzcuq zzcuqVar) {
        boolean zzf = zzcuqVar.zzf();
        int intValue = ((Integer) zzbet.zzc().zzc(zzbjl.zzdn)).intValue();
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = new com.google.android.gms.ads.internal.overlay.zzp();
        zzpVar.zzd = 50;
        zzpVar.zza = true != zzf ? 0 : intValue;
        zzpVar.zzb = true != zzf ? intValue : 0;
        zzpVar.zzc = intValue;
        return new com.google.android.gms.ads.internal.overlay.zzq(zzeuvVar.zzc, zzpVar, zzeuvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized zzbgz zzA() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized String zzB() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final zzbfu zzC() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final zzbfa zzD() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized void zzE(zzbkg zzbkgVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzF(zzbex zzbexVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized void zzG(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized boolean zzH() {
        return this.zzg.zzb();
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
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized void zzM(zzbis zzbisVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzN(zzbhg zzbhgVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzO(zzbdr zzbdrVar) {
        this.zzg.zzi(zzbdrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzP(zzaxz zzaxzVar) {
        this.zzh.zzh(zzaxzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzQ(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zzR() {
        if (this.zza == null) {
            return;
        }
        this.zzj = com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime();
        int zzc = this.zza.zzc();
        if (zzc <= 0) {
            return;
        }
        zzcuc zzcucVar = new zzcuc(this.zzb.zzf(), com.google.android.gms.ads.internal.zzt.zzj());
        this.zzk = zzcucVar;
        zzcucVar.zzb(zzc, new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzeus
            private final zzeuv zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzg();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzS() {
        zzT(5);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzX(zzbgw zzbgwVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzY(zzbdg zzbdgVar, zzbfd zzbfdVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzZ(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzaxq
    public final void zza() {
        zzT(3);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzaa(zzbgb zzbgbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized void zzab(zzbfy zzbfyVar) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzz
    public final void zzd() {
        zzT(4);
    }

    public final void zzg() {
        zzber.zza();
        if (zzcgm.zzp()) {
            zzT(5);
        } else {
            this.zzb.zze().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzeur
                private final zzeuv zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzS();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final IObjectWrapper zzi() {
        Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        return ObjectWrapper.wrap(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized void zzj() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zzcuq zzcuqVar = this.zza;
        if (zzcuqVar != null) {
            zzcuqVar.zzT();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final boolean zzk() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized boolean zzl(zzbdg zzbdgVar) throws RemoteException {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzK(this.zzc) && zzbdgVar.zzs == null) {
            com.google.android.gms.ads.internal.util.zze.zzf("Failed to load the ad because app ID is missing.");
            this.zzh.zzbD(zzfbm.zzd(4, null, null));
            return false;
        }
        if (zzH()) {
            return false;
        }
        this.zze = new AtomicBoolean();
        return this.zzg.zza(zzbdgVar, this.zzf, new zzeut(this), new zzeuu(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized void zzm() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized void zzn() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzo(zzbfa zzbfaVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzp(zzbfu zzbfuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzq(zzbfr zzbfrVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final Bundle zzr() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzs() {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized void zzt() {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized zzbdl zzu() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        zzcuq zzcuqVar = this.zza;
        if (zzcuqVar != null) {
            return zzfav.zzb(this.zzc, Collections.singletonList(zzcuqVar.zza()));
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized void zzv(zzbdl zzbdlVar) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzw(zzbzz zzbzzVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzx(zzcac zzcacVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized String zzy() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized String zzz() {
        return null;
    }
}
