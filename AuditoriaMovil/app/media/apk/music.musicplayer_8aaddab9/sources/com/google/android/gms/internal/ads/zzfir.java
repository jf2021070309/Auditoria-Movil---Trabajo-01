package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.facebook.ads.AdError;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzfir implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    @VisibleForTesting
    public final zzfjp zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue<zzfkb> zzd;
    private final HandlerThread zze;
    private final zzfii zzf;
    private final long zzg;
    private final int zzh;

    public zzfir(Context context, int i2, int i3, String str, String str2, String str3, zzfii zzfiiVar) {
        this.zzb = str;
        this.zzh = i3;
        this.zzc = str2;
        this.zzf = zzfiiVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.zze = handlerThread;
        handlerThread.start();
        this.zzg = System.currentTimeMillis();
        zzfjp zzfjpVar = new zzfjp(context, handlerThread.getLooper(), this, this, 19621000);
        this.zza = zzfjpVar;
        this.zzd = new LinkedBlockingQueue<>();
        zzfjpVar.checkAvailabilityAndConnect();
    }

    @VisibleForTesting
    public static zzfkb zzc() {
        return new zzfkb(null, 1);
    }

    private final void zze(int i2, long j2, Exception exc) {
        this.zzf.zzc(i2, System.currentTimeMillis() - j2, exc);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfju zzd = zzd();
        if (zzd != null) {
            try {
                zzfkb zzg = zzd.zzg(new zzfjz(1, this.zzh, this.zzb, this.zzc));
                zze(5011, this.zzg, null);
                this.zzd.put(zzg);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            zze(4012, this.zzg, null);
            this.zzd.put(zzc());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i2) {
        try {
            zze(4011, this.zzg, null);
            this.zzd.put(zzc());
        } catch (InterruptedException unused) {
        }
    }

    public final zzfkb zza(int i2) {
        zzfkb zzfkbVar;
        try {
            zzfkbVar = this.zzd.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            zze(AdError.INTERSTITIAL_AD_TIMEOUT, this.zzg, e2);
            zzfkbVar = null;
        }
        zze(AuthApiStatusCodes.AUTH_TOKEN_ERROR, this.zzg, null);
        if (zzfkbVar != null) {
            if (zzfkbVar.zzc == 7) {
                zzfii.zzg(3);
            } else {
                zzfii.zzg(2);
            }
        }
        return zzfkbVar == null ? zzc() : zzfkbVar;
    }

    public final void zzb() {
        zzfjp zzfjpVar = this.zza;
        if (zzfjpVar != null) {
            if (zzfjpVar.isConnected() || this.zza.isConnecting()) {
                this.zza.disconnect();
            }
        }
    }

    public final zzfju zzd() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
