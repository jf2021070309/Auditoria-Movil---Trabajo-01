package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzeac extends zzeaa {
    public zzeac(Context context) {
        this.zzf = new zzcau(context, com.google.android.gms.ads.internal.zzt.zzq().zza(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    this.zzf.zzp().zzf(this.zze, new zzdzz(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zzd(new zzeap(1));
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzt.zzg().zzk(th, "RemoteSignalsClientTask.onConnected");
                    this.zza.zzd(new zzeap(1));
                }
            }
        }
    }
}
