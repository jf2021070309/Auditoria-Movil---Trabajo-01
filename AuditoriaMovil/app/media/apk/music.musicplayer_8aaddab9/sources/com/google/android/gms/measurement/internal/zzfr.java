package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;
/* loaded from: classes2.dex */
public final class zzfr extends Thread {
    public final /* synthetic */ zzfs zza;
    private final Object zzb;
    private final BlockingQueue<zzfq<?>> zzc;
    private boolean zzd = false;

    public zzfr(zzfs zzfsVar, String str, BlockingQueue<zzfq<?>> blockingQueue) {
        this.zza = zzfsVar;
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
        zzfr zzfrVar;
        zzfr zzfrVar2;
        obj = this.zza.zzh;
        synchronized (obj) {
            if (!this.zzd) {
                semaphore = this.zza.zzi;
                semaphore.release();
                obj2 = this.zza.zzh;
                obj2.notifyAll();
                zzfrVar = this.zza.zzb;
                if (this == zzfrVar) {
                    this.zza.zzb = null;
                } else {
                    zzfrVar2 = this.zza.zzc;
                    if (this == zzfrVar2) {
                        this.zza.zzc = null;
                    } else {
                        this.zza.zzs.zzay().zzd().zza("Current scheduler thread is neither worker nor network");
                    }
                }
                this.zzd = true;
            }
        }
    }

    private final void zzc(InterruptedException interruptedException) {
        this.zza.zzs.zzay().zzk().zzb(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Semaphore semaphore;
        Object obj;
        boolean z = false;
        while (!z) {
            try {
                semaphore = this.zza.zzi;
                semaphore.acquire();
                z = true;
            } catch (InterruptedException e2) {
                zzc(e2);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                zzfq<?> poll = this.zzc.poll();
                if (poll == null) {
                    synchronized (this.zzb) {
                        if (this.zzc.peek() == null) {
                            zzfs.zzr(this.zza);
                            try {
                                this.zzb.wait(30000L);
                            } catch (InterruptedException e3) {
                                zzc(e3);
                            }
                        }
                    }
                    obj = this.zza.zzh;
                    synchronized (obj) {
                        if (this.zzc.peek() == null) {
                            break;
                        }
                    }
                } else {
                    Process.setThreadPriority(true != poll.zza ? 10 : threadPriority);
                    poll.run();
                }
            }
            if (this.zza.zzs.zzf().zzs(null, zzdy.zzaj)) {
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
