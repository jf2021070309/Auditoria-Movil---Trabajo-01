package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class zzefz extends zzccj implements zzdcm {
    @GuardedBy("this")
    private zzcck zza;
    @GuardedBy("this")
    private zzdcl zzb;
    @GuardedBy("this")
    private zzdiz zzc;

    @Override // com.google.android.gms.internal.ads.zzdcm
    public final synchronized void zza(zzdcl zzdclVar) {
        this.zzb = zzdclVar;
    }

    public final synchronized void zzc(zzcck zzcckVar) {
        this.zza = zzcckVar;
    }

    public final synchronized void zzd(zzdiz zzdizVar) {
        this.zzc = zzdizVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final synchronized void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Executor executor;
        zzdiz zzdizVar = this.zzc;
        if (zzdizVar != null) {
            executor = ((zzeir) zzdizVar).zzd.zzb;
            final zzfal zzfalVar = ((zzeir) zzdizVar).zza;
            final zzezz zzezzVar = ((zzeir) zzdizVar).zzb;
            final zzeef zzeefVar = ((zzeir) zzdizVar).zzc;
            final zzeir zzeirVar = (zzeir) zzdizVar;
            executor.execute(new Runnable(zzeirVar, zzfalVar, zzezzVar, zzeefVar) { // from class: com.google.android.gms.internal.ads.zzeiq
                private final zzeir zza;
                private final zzfal zzb;
                private final zzezz zzc;
                private final zzeef zzd;

                {
                    this.zza = zzeirVar;
                    this.zzb = zzfalVar;
                    this.zzc = zzezzVar;
                    this.zzd = zzeefVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzeir zzeirVar2 = this.zza;
                    zzfal zzfalVar2 = this.zzb;
                    zzezz zzezzVar2 = this.zzc;
                    zzeef zzeefVar2 = this.zzd;
                    zzeit zzeitVar = zzeirVar2.zzd;
                    zzeit.zze(zzfalVar2, zzezzVar2, zzeefVar2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final synchronized void zzf(IObjectWrapper iObjectWrapper, int i2) throws RemoteException {
        zzdiz zzdizVar = this.zzc;
        if (zzdizVar != null) {
            String valueOf = String.valueOf(((zzeir) zzdizVar).zzc.zza);
            zzcgt.zzi(valueOf.length() != 0 ? "Fail to initialize adapter ".concat(valueOf) : new String("Fail to initialize adapter "));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final synchronized void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzdcl zzdclVar = this.zzb;
        if (zzdclVar != null) {
            zzdclVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final synchronized void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcck zzcckVar = this.zza;
        if (zzcckVar != null) {
            ((zzeis) zzcckVar).zza.zzbp();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcck zzcckVar = this.zza;
        if (zzcckVar != null) {
            ((zzeis) zzcckVar).zzd.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final synchronized void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcck zzcckVar = this.zza;
        if (zzcckVar != null) {
            zzcckVar.zzj(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final synchronized void zzk(IObjectWrapper iObjectWrapper, zzccl zzcclVar) throws RemoteException {
        zzcck zzcckVar = this.zza;
        if (zzcckVar != null) {
            ((zzeis) zzcckVar).zzd.zzb(zzcclVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final synchronized void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcck zzcckVar = this.zza;
        if (zzcckVar != null) {
            zzdba zzdbaVar = ((zzeis) zzcckVar).zzb;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final synchronized void zzm(IObjectWrapper iObjectWrapper, int i2) throws RemoteException {
        zzdcl zzdclVar = this.zzb;
        if (zzdclVar != null) {
            zzdclVar.zzb(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final synchronized void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcck zzcckVar = this.zza;
        if (zzcckVar != null) {
            ((zzeis) zzcckVar).zzc.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final synchronized void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcck zzcckVar = this.zza;
        if (zzcckVar != null) {
            ((zzeis) zzcckVar).zzc.zzf();
        }
    }
}
