package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzls extends HandlerThread implements Handler.Callback {
    private zzalb zza;
    private Handler zzb;
    private Error zzc;
    private RuntimeException zzd;
    private zzlu zze;

    public zzls() {
        super("ExoPlayer:DummySurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i;
        zzalb zzalbVar;
        zzalb zzalbVar2;
        int i2 = message.what;
        try {
            if (i2 != 1) {
                if (i2 != 2) {
                    return true;
                }
                try {
                    zzalbVar2 = this.zza;
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                if (zzalbVar2 != null) {
                    zzalbVar2.zzb();
                    return true;
                }
                throw null;
            }
            try {
                i = message.arg1;
                zzalbVar = this.zza;
            } catch (Error e) {
                zzaln.zzb("DummySurface", "Failed to initialize dummy surface", e);
                this.zzc = e;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e2) {
                zzaln.zzb("DummySurface", "Failed to initialize dummy surface", e2);
                this.zzd = e2;
                synchronized (this) {
                    notify();
                }
            }
            if (zzalbVar != null) {
                zzalbVar.zza(i);
                this.zze = new zzlu(this, this.zza.zzc(), i != 0, null);
                synchronized (this) {
                    notify();
                }
                return true;
            }
            throw null;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }

    public final zzlu zza(int i) {
        boolean z;
        start();
        this.zzb = new Handler(getLooper(), this);
        this.zza = new zzalb(this.zzb, null);
        synchronized (this) {
            z = false;
            this.zzb.obtainMessage(1, i, 0).sendToTarget();
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzd;
        if (runtimeException == null) {
            Error error = this.zzc;
            if (error == null) {
                zzlu zzluVar = this.zze;
                if (zzluVar != null) {
                    return zzluVar;
                }
                throw null;
            }
            throw error;
        }
        throw runtimeException;
    }

    public final void zzb() {
        Handler handler = this.zzb;
        if (handler != null) {
            handler.sendEmptyMessage(2);
            return;
        }
        throw null;
    }
}
