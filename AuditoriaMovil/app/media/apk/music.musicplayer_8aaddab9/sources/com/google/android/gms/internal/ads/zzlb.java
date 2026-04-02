package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import ch.qos.logback.classic.Level;
import com.google.android.gms.internal.ads.zzlc;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
@SuppressLint({"HandlerLeak"})
/* loaded from: classes.dex */
public final class zzlb<T extends zzlc> extends Handler implements Runnable {
    public final /* synthetic */ zzlh zza;
    private final T zzb;
    private final long zzc;
    private zzkz<T> zzd;
    private IOException zze;
    private int zzf;
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlb(zzlh zzlhVar, Looper looper, T t, zzkz<T> zzkzVar, int i2, long j2) {
        super(looper);
        this.zza = zzlhVar;
        this.zzb = t;
        this.zzd = zzkzVar;
        this.zzc = j2;
    }

    private final void zzd() {
        ExecutorService executorService;
        zzlb zzlbVar;
        this.zze = null;
        executorService = this.zza.zze;
        zzlbVar = this.zza.zzf;
        Objects.requireNonNull(zzlbVar);
        executorService.execute(zzlbVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i2;
        int i3;
        int i4;
        long j2;
        if (this.zzi) {
            return;
        }
        int i5 = message.what;
        if (i5 == 0) {
            zzd();
        } else if (i5 == 3) {
            throw ((Error) message.obj);
        } else {
            this.zza.zzf = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - this.zzc;
            zzkz<T> zzkzVar = this.zzd;
            Objects.requireNonNull(zzkzVar);
            if (this.zzh) {
                zzkzVar.zzI(this.zzb, elapsedRealtime, j3, false);
                return;
            }
            int i6 = message.what;
            if (i6 == 1) {
                try {
                    zzkzVar.zzJ(this.zzb, elapsedRealtime, j3);
                } catch (RuntimeException e2) {
                    zzaln.zzb("LoadTask", "Unexpected exception handling load completed", e2);
                    this.zza.zzg = new zzlg(e2);
                }
            } else if (i6 != 2) {
            } else {
                IOException iOException = (IOException) message.obj;
                this.zze = iOException;
                int i7 = this.zzf + 1;
                this.zzf = i7;
                zzla zzH = zzkzVar.zzH(this.zzb, elapsedRealtime, j3, iOException, i7);
                i2 = zzH.zza;
                if (i2 == 3) {
                    this.zza.zzg = this.zze;
                    return;
                }
                i3 = zzH.zza;
                if (i3 != 2) {
                    i4 = zzH.zza;
                    if (i4 == 1) {
                        this.zzf = 1;
                    }
                    j2 = zzH.zzb;
                    zzb(j2 != -9223372036854775807L ? zzH.zzb : Math.min((this.zzf - 1) * 1000, (int) Level.TRACE_INT));
                }
            }
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
                String simpleName = this.zzb.getClass().getSimpleName();
                zzamo.zza(simpleName.length() != 0 ? "load:".concat(simpleName) : new String("load:"));
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
        } catch (IOException e2) {
            if (this.zzi) {
                return;
            }
            obtainMessage(2, e2).sendToTarget();
        } catch (Error e3) {
            if (!this.zzi) {
                zzaln.zzb("LoadTask", "Unexpected error loading stream", e3);
                obtainMessage(3, e3).sendToTarget();
            }
            throw e3;
        } catch (Exception e4) {
            if (this.zzi) {
                return;
            }
            zzaln.zzb("LoadTask", "Unexpected exception loading stream", e4);
            obtainMessage(2, new zzlg(e4)).sendToTarget();
        } catch (OutOfMemoryError e5) {
            if (this.zzi) {
                return;
            }
            zzaln.zzb("LoadTask", "OutOfMemory error loading stream", e5);
            obtainMessage(2, new zzlg(e5)).sendToTarget();
        }
    }

    public final void zza(int i2) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null && this.zzf > i2) {
            throw iOException;
        }
    }

    public final void zzb(long j2) {
        zzlb zzlbVar;
        zzlbVar = this.zza.zzf;
        zzakt.zzd(zzlbVar == null);
        this.zza.zzf = this;
        if (j2 > 0) {
            sendEmptyMessageDelayed(0, j2);
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
            Objects.requireNonNull(zzkzVar);
            zzkzVar.zzI(this.zzb, elapsedRealtime, elapsedRealtime - this.zzc, true);
            this.zzd = null;
        }
    }
}
