package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzfir implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzfjp zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue<zzfkb> zzd;
    private final HandlerThread zze;
    private final zzfii zzf;
    private final long zzg;
    private final int zzh;

    public zzfir(Context context, int i, int i2, String str, String str2, String str3, zzfii zzfiiVar) {
        this.zzb = str;
        this.zzh = i2;
        this.zzc = str2;
        this.zzf = zzfiiVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.zze = handlerThread;
        handlerThread.start();
        this.zzg = System.currentTimeMillis();
        this.zza = new zzfjp(context, this.zze.getLooper(), this, this, 19621000);
        this.zzd = new LinkedBlockingQueue<>();
        this.zza.checkAvailabilityAndConnect();
    }

    static zzfkb zzc() {
        return new zzfkb(null, 1);
    }

    private final void zze(int i, long j, Exception exc) {
        this.zzf.zzc(i, System.currentTimeMillis() - j, exc);
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
    public final void onConnectionSuspended(int i) {
        try {
            zze(4011, this.zzg, null);
            this.zzd.put(zzc());
        } catch (InterruptedException unused) {
        }
    }

    public final zzfkb zza(int i) {
        zzfkb zzfkbVar;
        try {
            zzfkbVar = this.zzd.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            zze(2009, this.zzg, e);
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

    protected final zzfju zzd() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
