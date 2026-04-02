package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class zzefy extends zzbvl implements zzdcm {
    @GuardedBy("this")
    private zzbvm zza;
    @GuardedBy("this")
    private zzdcl zzb;

    @Override // com.google.android.gms.internal.ads.zzdcm
    public final synchronized void zza(zzdcl zzdclVar) {
        this.zzb = zzdclVar;
    }

    public final synchronized void zzc(zzbvm zzbvmVar) {
        this.zza = zzbvmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final synchronized void zze() throws RemoteException {
        zzbvm zzbvmVar = this.zza;
        if (zzbvmVar != null) {
            zzbvmVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final synchronized void zzf() throws RemoteException {
        zzbvm zzbvmVar = this.zza;
        if (zzbvmVar != null) {
            zzbvmVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final synchronized void zzg(int i2) throws RemoteException {
        zzdcl zzdclVar = this.zzb;
        if (zzdclVar != null) {
            zzdclVar.zzb(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final synchronized void zzh() throws RemoteException {
        zzbvm zzbvmVar = this.zza;
        if (zzbvmVar != null) {
            zzbvmVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final synchronized void zzi() throws RemoteException {
        zzbvm zzbvmVar = this.zza;
        if (zzbvmVar != null) {
            zzbvmVar.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final synchronized void zzj() throws RemoteException {
        zzbvm zzbvmVar = this.zza;
        if (zzbvmVar != null) {
            zzbvmVar.zzj();
        }
        zzdcl zzdclVar = this.zzb;
        if (zzdclVar != null) {
            zzdclVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final synchronized void zzk() throws RemoteException {
        zzbvm zzbvmVar = this.zza;
        if (zzbvmVar != null) {
            zzbvmVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final synchronized void zzl(String str, String str2) throws RemoteException {
        zzbvm zzbvmVar = this.zza;
        if (zzbvmVar != null) {
            zzbvmVar.zzl(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final synchronized void zzm(zzbnb zzbnbVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final synchronized void zzn() throws RemoteException {
        zzbvm zzbvmVar = this.zza;
        if (zzbvmVar != null) {
            zzbvmVar.zzn();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final synchronized void zzo() throws RemoteException {
        zzbvm zzbvmVar = this.zza;
        if (zzbvmVar != null) {
            zzbvmVar.zzo();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final synchronized void zzp(zzccl zzcclVar) throws RemoteException {
        zzbvm zzbvmVar = this.zza;
        if (zzbvmVar != null) {
            zzbvmVar.zzp(zzcclVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final synchronized void zzq() throws RemoteException {
        zzbvm zzbvmVar = this.zza;
        if (zzbvmVar != null) {
            zzbvmVar.zzq();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final synchronized void zzr(zzccp zzccpVar) throws RemoteException {
        zzbvm zzbvmVar = this.zza;
        if (zzbvmVar != null) {
            zzbvmVar.zzr(zzccpVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final synchronized void zzs(int i2) throws RemoteException {
        zzbvm zzbvmVar = this.zza;
        if (zzbvmVar != null) {
            zzbvmVar.zzs(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final synchronized void zzt() throws RemoteException {
        zzbvm zzbvmVar = this.zza;
        if (zzbvmVar != null) {
            zzbvmVar.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final synchronized void zzu() throws RemoteException {
        zzbvm zzbvmVar = this.zza;
        if (zzbvmVar != null) {
            zzbvmVar.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final synchronized void zzv(String str) throws RemoteException {
        zzbvm zzbvmVar = this.zza;
        if (zzbvmVar != null) {
            zzbvmVar.zzv(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final synchronized void zzw(int i2, String str) throws RemoteException {
        zzdcl zzdclVar = this.zzb;
        if (zzdclVar != null) {
            zzdclVar.zzc(i2, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final synchronized void zzx(zzbcz zzbczVar) throws RemoteException {
        zzdcl zzdclVar = this.zzb;
        if (zzdclVar != null) {
            zzdclVar.zzd(zzbczVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final synchronized void zzy(zzbcz zzbczVar) throws RemoteException {
        zzbvm zzbvmVar = this.zza;
        if (zzbvmVar != null) {
            zzbvmVar.zzy(zzbczVar);
        }
    }
}
