package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class zzewd extends zzbfm implements com.google.android.gms.ads.internal.overlay.zzo, zzaxq {
    @GuardedBy("this")
    public zzcva zza;
    private final zzcoj zzb;
    private final Context zzc;
    private final String zze;
    private final zzevx zzf;
    private final zzevv zzg;
    @GuardedBy("this")
    private zzcuc zzi;
    private AtomicBoolean zzd = new AtomicBoolean();
    @GuardedBy("this")
    private long zzh = -1;

    public zzewd(zzcoj zzcojVar, Context context, String str, zzevx zzevxVar, zzevv zzevvVar) {
        this.zzb = zzcojVar;
        this.zzc = context;
        this.zze = str;
        this.zzf = zzevxVar;
        this.zzg = zzevvVar;
        zzevvVar.zzk(this);
    }

    private final synchronized void zzS(int i2) {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzg.zzp();
            zzcuc zzcucVar = this.zzi;
            if (zzcucVar != null) {
                com.google.android.gms.ads.internal.zzt.zzf().zzc(zzcucVar);
            }
            if (this.zza != null) {
                long j2 = -1;
                if (this.zzh != -1) {
                    j2 = com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime() - this.zzh;
                }
                this.zza.zze(j2, i2);
            }
            zzj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized zzbgz zzA() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized String zzB() {
        return this.zze;
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
        return this.zzf.zzb();
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
        this.zzf.zzi(zzbdrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzP(zzaxz zzaxzVar) {
        this.zzg.zzh(zzaxzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzQ(boolean z) {
    }

    public final /* synthetic */ void zzR() {
        zzS(5);
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
        zzS(3);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzaa(zzbgb zzbgbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized void zzab(zzbfy zzbfyVar) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbp() {
        if (this.zza == null) {
            return;
        }
        this.zzh = com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime();
        int zzc = this.zza.zzc();
        if (zzc <= 0) {
            return;
        }
        zzcuc zzcucVar = new zzcuc(this.zzb.zzf(), com.google.android.gms.ads.internal.zzt.zzj());
        this.zzi = zzcucVar;
        zzcucVar.zzb(zzc, new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzewa
            private final zzewd zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzh();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbs(int i2) {
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 0) {
            zzS(2);
        } else if (i3 == 1) {
            zzS(4);
        } else if (i3 == 2) {
            zzS(3);
        } else if (i3 != 3) {
        } else {
            zzS(6);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzd() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zze() {
        zzcva zzcvaVar = this.zza;
        if (zzcvaVar != null) {
            zzcvaVar.zze(com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime() - this.zzh, 1);
        }
    }

    @VisibleForTesting
    public final void zzh() {
        this.zzb.zze().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzevz
            private final zzewd zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzR();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final IObjectWrapper zzi() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized void zzj() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zzcva zzcvaVar = this.zza;
        if (zzcvaVar != null) {
            zzcvaVar.zzT();
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
            zzcgt.zzf("Failed to load the ad because app ID is missing.");
            this.zzg.zzbD(zzfbm.zzd(4, null, null));
            return false;
        }
        if (zzH()) {
            return false;
        }
        this.zzd = new AtomicBoolean();
        return this.zzf.zza(zzbdgVar, this.zze, new zzewb(this), new zzewc(this));
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
    public final synchronized void zzs() {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized void zzt() {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized zzbdl zzu() {
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
