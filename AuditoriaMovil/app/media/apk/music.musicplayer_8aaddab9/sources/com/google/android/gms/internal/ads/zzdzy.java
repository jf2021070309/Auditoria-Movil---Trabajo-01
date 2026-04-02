package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
/* loaded from: classes.dex */
public final class zzdzy extends zzeaa {
    public zzdzy(Context context) {
        this.zzf = new zzcau(context, com.google.android.gms.ads.internal.zzt.zzq().zza(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    this.zzf.zzp().zze(this.zze, new zzdzz(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zzd(new zzeap(1));
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzt.zzg().zzk(th, "RemoteAdRequestClientTask.onConnected");
                    this.zza.zzd(new zzeap(1));
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeaa, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        zzcgt.zzd("Cannot connect to remote service, fallback to local instance.");
        this.zza.zzd(new zzeap(1));
    }
}
