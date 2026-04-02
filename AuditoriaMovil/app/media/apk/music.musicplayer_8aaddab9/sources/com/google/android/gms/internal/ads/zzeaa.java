package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.io.InputStream;
/* loaded from: classes.dex */
public abstract class zzeaa implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    public final zzchl<InputStream> zza = new zzchl<>();
    public final Object zzb = new Object();
    public boolean zzc = false;
    public boolean zzd = false;
    public zzcbj zze;
    public zzcau zzf;

    public void onConnectionFailed(ConnectionResult connectionResult) {
        zzcgt.zzd("Disconnected from remote ad request service.");
        this.zza.zzd(new zzeap(1));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i2) {
        zzcgt.zzd("Cannot connect to remote service, fallback to local instance.");
    }

    public final void zza() {
        synchronized (this.zzb) {
            this.zzd = true;
            if (this.zzf.isConnected() || this.zzf.isConnecting()) {
                this.zzf.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }
}
