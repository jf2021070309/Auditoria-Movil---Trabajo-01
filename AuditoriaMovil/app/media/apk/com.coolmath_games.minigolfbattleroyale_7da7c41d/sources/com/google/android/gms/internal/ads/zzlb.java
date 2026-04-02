package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzlc;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzlb<T extends zzlc> extends Handler implements Runnable {
    final /* synthetic */ zzlh zza;
    private final T zzb;
    private final long zzc;
    private zzkz<T> zzd;
    private IOException zze;
    private int zzf;
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlb(zzlh zzlhVar, Looper looper, T t, zzkz<T> zzkzVar, int i, long j) {
        super(looper);
        this.zza = zzlhVar;
        this.zzb = t;
        this.zzd = zzkzVar;
        this.zzc = j;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i;
        int i2;
        int i3;
        long j;
        if (this.zzi) {
            return;
        }
        if (message.what == 0) {
            zzd();
        } else if (message.what != 3) {
            this.zza.zzf = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = elapsedRealtime - this.zzc;
            zzkz<T> zzkzVar = this.zzd;
            if (zzkzVar == null) {
                throw null;
            }
            if (this.zzh) {
                zzkzVar.zzI(this.zzb, elapsedRealtime, j2, false);
                return;
            }
            int i4 = message.what;
            if (i4 == 1) {
                try {
                    zzkzVar.zzJ(this.zzb, elapsedRealtime, j2);
                } catch (RuntimeException e) {
                    zzaln.zzb("LoadTask", "Unexpected exception handling load completed", e);
                    this.zza.zzg = new zzlg(e);
                }
            } else if (i4 != 2) {
            } else {
                IOException iOException = (IOException) message.obj;
                this.zze = iOException;
                int i5 = this.zzf + 1;
                this.zzf = i5;
                zzla zzH = zzkzVar.zzH(this.zzb, elapsedRealtime, j2, iOException, i5);
                i = zzH.zza;
                if (i == 3) {
                    this.zza.zzg = this.zze;
                    return;
                }
                i2 = zzH.zza;
                if (i2 != 2) {
                    i3 = zzH.zza;
                    if (i3 == 1) {
                        this.zzf = 1;
                    }
                    j = zzH.zzb;
                    zzb(j != -9223372036854775807L ? zzH.zzb : Math.min((this.zzf - 1) * 1000, 5000));
                }
            }
        } else {
            throw ((Error) message.obj);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = !this.zzh;
                this.zzg = Thread.currentThread();
            }
            if (z) {
                String valueOf = String.valueOf(this.zzb.getClass().getSimpleName());
                zzamo.zza(valueOf.length() != 0 ? "load:".concat(valueOf) : new String("load:"));
                try {
                    this.zzb.zzh();
                    zzamo.zzb();
                } catch (Throwable th) {
                    zzamo.zzb();
                    throw th;
                }
            }
            synchronized (this) {
                this.zzg = null;
                Thread.interrupted();
            }
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e) {
            if (this.zzi) {
                return;
            }
            obtainMessage(2, e).sendToTarget();
        } catch (Error e2) {
            if (!this.zzi) {
                zzaln.zzb("LoadTask", "Unexpected error loading stream", e2);
                obtainMessage(3, e2).sendToTarget();
            }
            throw e2;
        } catch (Exception e3) {
            if (this.zzi) {
                return;
            }
            zzaln.zzb("LoadTask", "Unexpected exception loading stream", e3);
            obtainMessage(2, new zzlg(e3)).sendToTarget();
        } catch (OutOfMemoryError e4) {
            if (this.zzi) {
                return;
            }
            zzaln.zzb("LoadTask", "OutOfMemory error loading stream", e4);
            obtainMessage(2, new zzlg(e4)).sendToTarget();
        }
    }

    public final void zza(int i) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null && this.zzf > i) {
            throw iOException;
        }
    }

    public final void zzb(long j) {
        zzlb zzlbVar;
        zzlbVar = this.zza.zzf;
        zzakt.zzd(zzlbVar == null);
        this.zza.zzf = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            zzd();
        }
    }

    public final void zzc(boolean z) {
        this.zzi = z;
        this.zze = null;
        if (hasMessages(0)) {
            this.zzh = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.zzh = true;
                this.zzb.zzg();
                Thread thread = this.zzg;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            this.zza.zzf = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            zzkz<T> zzkzVar = this.zzd;
            if (zzkzVar != null) {
                zzkzVar.zzI(this.zzb, elapsedRealtime, elapsedRealtime - this.zzc, true);
                this.zzd = null;
                return;
            }
            throw null;
        }
    }

    private final void zzd() {
        ExecutorService executorService;
        zzlb zzlbVar;
        this.zze = null;
        executorService = this.zza.zze;
        zzlbVar = this.zza.zzf;
        if (zzlbVar != null) {
            executorService.execute(zzlbVar);
            return;
        }
        throw null;
    }
}
