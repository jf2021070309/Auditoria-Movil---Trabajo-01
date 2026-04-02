package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdyj implements com.google.android.gms.ads.internal.overlay.zzo, zzcnx {
    private final Context zza;
    private final zzcgz zzb;
    private zzdyc zzc;
    private zzcml zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private zzbgq zzh;
    private boolean zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdyj(Context context, zzcgz zzcgzVar) {
        this.zza = context;
        this.zzb = zzcgzVar;
    }

    private final synchronized boolean zzj(zzbgq zzbgqVar) {
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzgp)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzi("Ad inspector had an internal error.");
            try {
                zzbgqVar.zze(zzfbm.zzd(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        } else if (this.zzc == null) {
            com.google.android.gms.ads.internal.util.zze.zzi("Ad inspector had an internal error.");
            try {
                zzbgqVar.zze(zzfbm.zzd(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        } else {
            if (!this.zze && !this.zzf) {
                if (com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis() >= this.zzg + ((Integer) zzbet.zzc().zzc(zzbjl.zzgs)).intValue()) {
                    return true;
                }
            }
            com.google.android.gms.ads.internal.util.zze.zzi("Ad inspector cannot be opened because it is already open.");
            try {
                zzbgqVar.zze(zzfbm.zzd(19, null, null));
            } catch (RemoteException unused3) {
            }
            return false;
        }
    }

    private final synchronized void zzk() {
        if (this.zze && this.zzf) {
            zzchg.zze.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdyi
                private final zzdyj zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzi();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcnx
    public final synchronized void zza(boolean z) {
        if (z) {
            com.google.android.gms.ads.internal.util.zze.zza("Ad inspector loaded.");
            this.zze = true;
            zzk();
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zzi("Ad inspector failed to load.");
        try {
            zzbgq zzbgqVar = this.zzh;
            if (zzbgqVar != null) {
                zzbgqVar.zze(zzfbm.zzd(17, null, null));
            }
        } catch (RemoteException unused) {
        }
        this.zzi = true;
        this.zzd.destroy();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbp() {
        this.zzf = true;
        zzk();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbs(int i) {
        this.zzd.destroy();
        if (!this.zzi) {
            com.google.android.gms.ads.internal.util.zze.zza("Inspector closed.");
            zzbgq zzbgqVar = this.zzh;
            if (zzbgqVar != null) {
                try {
                    zzbgqVar.zze(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.zzf = false;
        this.zze = false;
        this.zzg = 0L;
        this.zzi = false;
        this.zzh = null;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzd() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    public final void zzg(zzdyc zzdycVar) {
        this.zzc = zzdycVar;
    }

    public final synchronized void zzh(zzbgq zzbgqVar, zzbps zzbpsVar) {
        if (zzj(zzbgqVar)) {
            try {
                com.google.android.gms.ads.internal.zzt.zzd();
                zzcml zza = zzcmx.zza(this.zza, zzcob.zzb(), "", false, false, null, null, this.zzb, null, null, null, zzazb.zza(), null, null);
                this.zzd = zza;
                zzcnz zzR = zza.zzR();
                if (zzR == null) {
                    com.google.android.gms.ads.internal.util.zze.zzi("Failed to obtain a web view for the ad inspector");
                    try {
                        zzbgqVar.zze(zzfbm.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException unused) {
                        return;
                    }
                }
                this.zzh = zzbgqVar;
                zzR.zzL(null, null, null, null, null, false, null, null, null, null, null, null, null, null, zzbpsVar, null);
                zzR.zzy(this);
                this.zzd.loadUrl((String) zzbet.zzc().zzc(zzbjl.zzgq));
                com.google.android.gms.ads.internal.zzt.zzb();
                com.google.android.gms.ads.internal.overlay.zzm.zza(this.zza, new AdOverlayInfoParcel(this, this.zzd, 1, this.zzb), true);
                this.zzg = com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis();
            } catch (zzcmw e) {
                com.google.android.gms.ads.internal.util.zze.zzj("Failed to obtain a web view for the ad inspector", e);
                try {
                    zzbgqVar.zze(zzfbm.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException unused2) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzi() {
        this.zzd.zzbl("window.inspectorInfo", this.zzc.zzm().toString());
    }
}
