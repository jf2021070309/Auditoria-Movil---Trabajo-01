package com.google.android.gms.measurement.internal;

import android.os.Process;
import androidx.work.WorkRequest;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
/* loaded from: classes2.dex */
public final class zzfq extends Thread {
    final /* synthetic */ zzfr zza;
    private final Object zzb;
    private final BlockingQueue<zzfp<?>> zzc;
    private boolean zzd = false;

    public zzfq(zzfr zzfrVar, String str, BlockingQueue<zzfp<?>> blockingQueue) {
        this.zza = zzfrVar;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(blockingQueue);
        this.zzb = new Object();
        this.zzc = blockingQueue;
        setName(str);
    }

    private final void zzb() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        zzfq zzfqVar;
        zzfq zzfqVar2;
        obj = this.zza.zzg;
        synchronized (obj) {
            if (!this.zzd) {
                semaphore = this.zza.zzh;
                semaphore.release();
                obj2 = this.zza.zzg;
                obj2.notifyAll();
                zzfqVar = this.zza.zza;
                if (this == zzfqVar) {
                    zzfr.zzp(this.zza, null);
                } else {
                    zzfqVar2 = this.zza.zzb;
                    if (this == zzfqVar2) {
                        zzfr.zzr(this.zza, null);
                    } else {
                        this.zza.zzs.zzau().zzb().zza("Current scheduler thread is neither worker nor network");
                    }
                }
                this.zzd = true;
            }
        }
    }

    private final void zzc(InterruptedException interruptedException) {
        this.zza.zzs.zzau().zze().zzb(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Semaphore semaphore;
        Object obj;
        boolean z = false;
        while (!z) {
            try {
                semaphore = this.zza.zzh;
                semaphore.acquire();
                z = true;
            } catch (InterruptedException e) {
                zzc(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                zzfp<?> poll = this.zzc.poll();
                if (poll != null) {
                    Process.setThreadPriority(true != poll.zza ? 10 : threadPriority);
                    poll.run();
                } else {
                    synchronized (this.zzb) {
                        if (this.zzc.peek() == null) {
                            zzfr.zzm(this.zza);
                            try {
                                this.zzb.wait(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
                            } catch (InterruptedException e2) {
                                zzc(e2);
                            }
                        }
                    }
                    obj = this.zza.zzg;
                    synchronized (obj) {
                        if (this.zzc.peek() == null) {
                            break;
                        }
                    }
                }
            }
            if (this.zza.zzs.zzc().zzn(null, zzea.zzao)) {
                zzb();
            }
        } finally {
            zzb();
        }
    }

    public final void zza() {
        synchronized (this.zzb) {
            this.zzb.notifyAll();
        }
    }
}
