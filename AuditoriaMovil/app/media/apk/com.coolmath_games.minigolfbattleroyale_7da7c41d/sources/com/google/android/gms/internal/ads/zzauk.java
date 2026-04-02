package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.zzaul;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzauk<T extends zzaul> extends Handler implements Runnable {
    public final int zza;
    final /* synthetic */ zzaun zzb;
    private final T zzc;
    private final zzauj<T> zzd;
    private final long zze;
    private IOException zzf;
    private int zzg;
    private volatile Thread zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzauk(zzaun zzaunVar, Looper looper, T t, zzauj<T> zzaujVar, int i, long j) {
        super(looper);
        this.zzb = zzaunVar;
        this.zzc = t;
        this.zzd = zzaujVar;
        this.zza = i;
        this.zze = j;
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
        if (message.what == 0) {
            zzd();
        } else if (message.what != 4) {
            this.zzb.zzb = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.zze;
            if (this.zzc.zzd()) {
                this.zzd.zzz(this.zzc, elapsedRealtime, j, false);
                return;
            }
            int i = message.what;
            if (i == 1) {
                this.zzd.zzz(this.zzc, elapsedRealtime, j, false);
            } else if (i == 2) {
                this.zzd.zzA(this.zzc, elapsedRealtime, j);
            } else if (i != 3) {
            } else {
                IOException iOException = (IOException) message.obj;
                this.zzf = iOException;
                int zzy = this.zzd.zzy(this.zzc, elapsedRealtime, j, iOException);
                if (zzy == 3) {
                    this.zzb.zzc = this.zzf;
                } else if (zzy != 2) {
                    int i2 = zzy != 1 ? 1 + this.zzg : 1;
                    this.zzg = i2;
                    zzb(Math.min((i2 - 1) * 1000, 5000));
                }
            }
        } else {
            throw ((Error) message.obj);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzh = Thread.currentThread();
            if (!this.zzc.zzd()) {
                String valueOf = String.valueOf(this.zzc.getClass().getSimpleName());
                zzavc.zza(valueOf.length() != 0 ? "load:".concat(valueOf) : new String("load:"));
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
        } catch (IOException e) {
            if (this.zzi) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (Error e2) {
            Log.e("LoadTask", "Unexpected error loading stream", e2);
            if (!this.zzi) {
                obtainMessage(4, e2).sendToTarget();
            }
            throw e2;
        } catch (InterruptedException unused) {
            zzaup.zzd(this.zzc.zzd());
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(2);
        } catch (Exception e3) {
            Log.e("LoadTask", "Unexpected exception loading stream", e3);
            if (this.zzi) {
                return;
            }
            obtainMessage(3, new zzaum(e3)).sendToTarget();
        } catch (OutOfMemoryError e4) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e4);
            if (this.zzi) {
                return;
            }
            obtainMessage(3, new zzaum(e4)).sendToTarget();
        }
    }

    public final void zza(int i) throws IOException {
        IOException iOException = this.zzf;
        if (iOException != null && this.zzg > i) {
            throw iOException;
        }
    }

    public final void zzb(long j) {
        zzauk zzaukVar;
        zzaukVar = this.zzb.zzb;
        zzaup.zzd(zzaukVar == null);
        this.zzb.zzb = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
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
