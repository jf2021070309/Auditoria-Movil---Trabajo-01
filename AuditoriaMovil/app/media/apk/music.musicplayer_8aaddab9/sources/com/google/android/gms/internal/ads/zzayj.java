package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.util.VisibleForTesting;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class zzayj {
    private final Runnable zza = new zzayf(this);
    private final Object zzb = new Object();
    @GuardedBy("lock")
    private zzaym zzc;
    @GuardedBy("lock")
    private Context zzd;
    @GuardedBy("lock")
    private zzayp zze;

    public static /* synthetic */ zzaym zzc(zzayj zzayjVar, zzaym zzaymVar) {
        zzayjVar.zzc = null;
        return null;
    }

    public static /* synthetic */ void zzj(zzayj zzayjVar) {
        synchronized (zzayjVar.zzb) {
            zzaym zzaymVar = zzayjVar.zzc;
            if (zzaymVar == null) {
                return;
            }
            if (zzaymVar.isConnected() || zzayjVar.zzc.isConnecting()) {
                zzayjVar.zzc.disconnect();
            }
            zzayjVar.zzc = null;
            zzayjVar.zze = null;
            Binder.flushPendingCommands();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl() {
        synchronized (this.zzb) {
            if (this.zzd != null && this.zzc == null) {
                zzaym zzi = zzi(new zzayh(this), new zzayi(this));
                this.zzc = zzi;
                zzi.checkAvailabilityAndConnect();
            }
        }
    }

    public final void zzd(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.zzb) {
            if (this.zzd != null) {
                return;
            }
            this.zzd = context.getApplicationContext();
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzcE)).booleanValue()) {
                zzl();
            } else {
                if (((Boolean) zzbet.zzc().zzc(zzbjl.zzcD)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzf().zzb(new zzayg(this));
                }
            }
        }
    }

    public final void zze() {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzcF)).booleanValue()) {
            synchronized (this.zzb) {
                zzl();
                zzfla zzflaVar = com.google.android.gms.ads.internal.util.zzs.zza;
                zzflaVar.removeCallbacks(this.zza);
                zzflaVar.postDelayed(this.zza, ((Long) zzbet.zzc().zzc(zzbjl.zzcG)).longValue());
            }
        }
    }

    public final zzayk zzf(zzayn zzaynVar) {
        synchronized (this.zzb) {
            if (this.zze == null) {
                return new zzayk();
            }
            try {
                if (this.zzc.zzp()) {
                    return this.zze.zzf(zzaynVar);
                }
                return this.zze.zze(zzaynVar);
            } catch (RemoteException e2) {
                zzcgt.zzg("Unable to call into cache service.", e2);
                return new zzayk();
            }
        }
    }

    public final long zzg(zzayn zzaynVar) {
        synchronized (this.zzb) {
            if (this.zze == null) {
                return -2L;
            }
            if (this.zzc.zzp()) {
                try {
                    return this.zze.zzg(zzaynVar);
                } catch (RemoteException e2) {
                    zzcgt.zzg("Unable to call into cache service.", e2);
                }
            }
            return -2L;
        }
    }

    @VisibleForTesting
    public final synchronized zzaym zzi(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new zzaym(this.zzd, com.google.android.gms.ads.internal.zzt.zzq().zza(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }
}
