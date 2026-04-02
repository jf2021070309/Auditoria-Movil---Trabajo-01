package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Objects;
/* loaded from: classes.dex */
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
        int i2 = message.what;
        try {
            if (i2 != 1) {
                if (i2 != 2) {
                    return true;
                }
                try {
                    zzalb zzalbVar = this.zza;
                    Objects.requireNonNull(zzalbVar);
                    zzalbVar.zzb();
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                return true;
            }
            try {
                int i3 = message.arg1;
                zzalb zzalbVar2 = this.zza;
                Objects.requireNonNull(zzalbVar2);
                zzalbVar2.zza(i3);
                this.zze = new zzlu(this, this.zza.zzc(), i3 != 0, null);
                synchronized (this) {
                    notify();
                }
            } catch (Error e2) {
                zzaln.zzb("DummySurface", "Failed to initialize dummy surface", e2);
                this.zzc = e2;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e3) {
                zzaln.zzb("DummySurface", "Failed to initialize dummy surface", e3);
                this.zzd = e3;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }

    public final zzlu zza(int i2) {
        boolean z;
        start();
        Handler handler = new Handler(getLooper(), this);
        this.zzb = handler;
        this.zza = new zzalb(handler, null);
        synchronized (this) {
            z = false;
            this.zzb.obtainMessage(1, i2, 0).sendToTarget();
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
                Objects.requireNonNull(zzluVar);
                return zzluVar;
            }
            throw error;
        }
        throw runtimeException;
    }

    public final void zzb() {
        Handler handler = this.zzb;
        Objects.requireNonNull(handler);
        handler.sendEmptyMessage(2);
    }
}
