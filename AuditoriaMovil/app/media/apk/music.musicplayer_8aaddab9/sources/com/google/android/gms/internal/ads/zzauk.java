package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import ch.qos.logback.classic.Level;
import com.google.android.gms.internal.ads.zzaul;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
@SuppressLint({"HandlerLeak"})
/* loaded from: classes.dex */
public final class zzauk<T extends zzaul> extends Handler implements Runnable {
    public final int zza;
    public final /* synthetic */ zzaun zzb;
    private final T zzc;
    private final zzauj<T> zzd;
    private final long zze;
    private IOException zzf;
    private int zzg;
    private volatile Thread zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzauk(zzaun zzaunVar, Looper looper, T t, zzauj<T> zzaujVar, int i2, long j2) {
        super(looper);
        this.zzb = zzaunVar;
        this.zzc = t;
        this.zzd = zzaujVar;
        this.zza = i2;
        this.zze = j2;
    }

    private final void zzd() {
        ExecutorService executorService;
        zzauk zzaukVar;
        this.zzf = null;
        executorService = this.zzb.zza;
        zzaukVar = this.zzb.zzb;
        executorService.execute(zzaukVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.zzi) {
            return;
        }
        int i2 = message.what;
        if (i2 == 0) {
            zzd();
        } else if (i2 == 4) {
            throw ((Error) message.obj);
        } else {
            this.zzb.zzb = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = elapsedRealtime - this.zze;
            if (this.zzc.zzd()) {
                this.zzd.zzz(this.zzc, elapsedRealtime, j2, false);
                return;
            }
            int i3 = message.what;
            if (i3 == 1) {
                this.zzd.zzz(this.zzc, elapsedRealtime, j2, false);
            } else if (i3 == 2) {
                this.zzd.zzA(this.zzc, elapsedRealtime, j2);
            } else if (i3 != 3) {
            } else {
                IOException iOException = (IOException) message.obj;
                this.zzf = iOException;
                int zzy = this.zzd.zzy(this.zzc, elapsedRealtime, j2, iOException);
                if (zzy == 3) {
                    this.zzb.zzc = this.zzf;
                } else if (zzy != 2) {
                    int i4 = zzy != 1 ? 1 + this.zzg : 1;
                    this.zzg = i4;
                    zzb(Math.min((i4 - 1) * 1000, (int) Level.TRACE_INT));
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzh = Thread.currentThread();
            if (!this.zzc.zzd()) {
                String simpleName = this.zzc.getClass().getSimpleName();
                zzavc.zza(simpleName.length() != 0 ? "load:".concat(simpleName) : new String("load:"));
                try {
                    this.zzc.zze();
                    zzavc.zzb();
                } catch (Throwable th) {
                    zzavc.zzb();
                    throw th;
                }
            }
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e2) {
            if (this.zzi) {
                return;
            }
            obtainMessage(3, e2).sendToTarget();
        } catch (Error e3) {
            Log.e("LoadTask", "Unexpected error loading stream", e3);
            if (!this.zzi) {
                obtainMessage(4, e3).sendToTarget();
            }
            throw e3;
        } catch (InterruptedException unused) {
            zzaup.zzd(this.zzc.zzd());
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(2);
        } catch (Exception e4) {
            Log.e("LoadTask", "Unexpected exception loading stream", e4);
            if (this.zzi) {
                return;
            }
            obtainMessage(3, new zzaum(e4)).sendToTarget();
        } catch (OutOfMemoryError e5) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e5);
            if (this.zzi) {
                return;
            }
            obtainMessage(3, new zzaum(e5)).sendToTarget();
        }
    }

    public final void zza(int i2) throws IOException {
        IOException iOException = this.zzf;
        if (iOException != null && this.zzg > i2) {
            throw iOException;
        }
    }

    public final void zzb(long j2) {
        zzauk zzaukVar;
        zzaukVar = this.zzb.zzb;
        zzaup.zzd(zzaukVar == null);
        this.zzb.zzb = this;
        if (j2 > 0) {
            sendEmptyMessageDelayed(0, j2);
        } else {
            zzd();
        }
    }

    public final void zzc(boolean z) {
        this.zzi = z;
        this.zzf = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
                return;
            }
        } else {
            this.zzc.zzc();
            if (this.zzh != null) {
                this.zzh.interrupt();
            }
            if (!z) {
                return;
            }
        }
        this.zzb.zzb = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.zzd.zzz(this.zzc, elapsedRealtime, elapsedRealtime - this.zze, true);
    }
}
