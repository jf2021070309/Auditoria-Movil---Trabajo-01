package com.google.android.gms.cast.framework;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public abstract class Session {
    private static final Logger zza = new Logger("Session");
    private final zzaw zzb;
    private final zzbi zzc;

    public Session(Context context, String str, String str2) {
        zzbi zzbiVar = new zzbi(this, null);
        this.zzc = zzbiVar;
        this.zzb = com.google.android.gms.internal.cast.zzag.zzd(context, str, str2, zzbiVar);
    }

    public abstract void end(boolean z);

    public final String getCategory() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzaw zzawVar = this.zzb;
        if (zzawVar != null) {
            try {
                return zzawVar.zzh();
            } catch (RemoteException e) {
                zza.d(e, "Unable to call %s on %s.", "getCategory", "zzaw");
            }
        }
        return null;
    }

    public final String getSessionId() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzaw zzawVar = this.zzb;
        if (zzawVar != null) {
            try {
                return zzawVar.zzi();
            } catch (RemoteException e) {
                zza.d(e, "Unable to call %s on %s.", "getSessionId", "zzaw");
            }
        }
        return null;
    }

    public long getSessionRemainingTimeMs() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return 0L;
    }

    public boolean isConnected() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzaw zzawVar = this.zzb;
        if (zzawVar != null) {
            try {
                return zzawVar.zzp();
            } catch (RemoteException e) {
                zza.d(e, "Unable to call %s on %s.", "isConnected", "zzaw");
            }
        }
        return false;
    }

    public boolean isConnecting() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzaw zzawVar = this.zzb;
        if (zzawVar != null) {
            try {
                return zzawVar.zzq();
            } catch (RemoteException e) {
                zza.d(e, "Unable to call %s on %s.", "isConnecting", "zzaw");
            }
        }
        return false;
    }

    public boolean isDisconnected() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzaw zzawVar = this.zzb;
        if (zzawVar != null) {
            try {
                return zzawVar.zzr();
            } catch (RemoteException e) {
                zza.d(e, "Unable to call %s on %s.", "isDisconnected", "zzaw");
            }
        }
        return true;
    }

    public boolean isDisconnecting() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzaw zzawVar = this.zzb;
        if (zzawVar != null) {
            try {
                return zzawVar.zzs();
            } catch (RemoteException e) {
                zza.d(e, "Unable to call %s on %s.", "isDisconnecting", "zzaw");
            }
        }
        return false;
    }

    public boolean isResuming() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzaw zzawVar = this.zzb;
        if (zzawVar != null) {
            try {
                return zzawVar.zzt();
            } catch (RemoteException e) {
                zza.d(e, "Unable to call %s on %s.", "isResuming", "zzaw");
            }
        }
        return false;
    }

    public boolean isSuspended() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzaw zzawVar = this.zzb;
        if (zzawVar != null) {
            try {
                return zzawVar.zzu();
            } catch (RemoteException e) {
                zza.d(e, "Unable to call %s on %s.", "isSuspended", "zzaw");
            }
        }
        return false;
    }

    public final void notifyFailedToResumeSession(int i) {
        zzaw zzawVar = this.zzb;
        if (zzawVar == null) {
            return;
        }
        try {
            zzawVar.zzj(i);
        } catch (RemoteException e) {
            zza.d(e, "Unable to call %s on %s.", "notifyFailedToResumeSession", "zzaw");
        }
    }

    public final void notifyFailedToStartSession(int i) {
        zzaw zzawVar = this.zzb;
        if (zzawVar == null) {
            return;
        }
        try {
            zzawVar.zzk(i);
        } catch (RemoteException e) {
            zza.d(e, "Unable to call %s on %s.", "notifyFailedToStartSession", "zzaw");
        }
    }

    public final void notifySessionEnded(int i) {
        zzaw zzawVar = this.zzb;
        if (zzawVar == null) {
            return;
        }
        try {
            zzawVar.zzl(i);
        } catch (RemoteException e) {
            zza.d(e, "Unable to call %s on %s.", "notifySessionEnded", "zzaw");
        }
    }

    public final void notifySessionResumed(boolean z) {
        zzaw zzawVar = this.zzb;
        if (zzawVar == null) {
            return;
        }
        try {
            zzawVar.zzm(z);
        } catch (RemoteException e) {
            zza.d(e, "Unable to call %s on %s.", "notifySessionResumed", "zzaw");
        }
    }

    public final void notifySessionStarted(String str) {
        zzaw zzawVar = this.zzb;
        if (zzawVar == null) {
            return;
        }
        try {
            zzawVar.zzn(str);
        } catch (RemoteException e) {
            zza.d(e, "Unable to call %s on %s.", "notifySessionStarted", "zzaw");
        }
    }

    public final void notifySessionSuspended(int i) {
        zzaw zzawVar = this.zzb;
        if (zzawVar == null) {
            return;
        }
        try {
            zzawVar.zzo(i);
        } catch (RemoteException e) {
            zza.d(e, "Unable to call %s on %s.", "notifySessionSuspended", "zzaw");
        }
    }

    public void onResuming(Bundle bundle) {
    }

    public void onStarting(Bundle bundle) {
    }

    public abstract void resume(Bundle bundle);

    public abstract void start(Bundle bundle);

    public void zzk(Bundle bundle) {
    }

    public final int zzm() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzaw zzawVar = this.zzb;
        if (zzawVar != null) {
            try {
                if (zzawVar.zze() >= 211100000) {
                    return this.zzb.zzf();
                }
            } catch (RemoteException e) {
                zza.d(e, "Unable to call %s on %s.", "getSessionStartType", "zzaw");
            }
        }
        return 0;
    }

    public final IObjectWrapper zzn() {
        zzaw zzawVar = this.zzb;
        if (zzawVar != null) {
            try {
                return zzawVar.zzg();
            } catch (RemoteException e) {
                zza.d(e, "Unable to call %s on %s.", "getWrappedObject", "zzaw");
            }
        }
        return null;
    }
}
