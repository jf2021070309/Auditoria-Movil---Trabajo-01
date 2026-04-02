package com.google.ads.interactivemedia.v3.internal;

import com.amazon.aps.iva.k.q;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public abstract class zzvp extends AtomicReference implements Runnable {
    private static final Runnable zza = new zzvo(null);
    private static final Runnable zzb = new zzvo(null);

    private final void zzc(Thread thread) {
        Runnable runnable = (Runnable) get();
        zzvm zzvmVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            if (!(runnable instanceof zzvm)) {
                if (runnable != zzb) {
                    break;
                }
            } else {
                zzvmVar = (zzvm) runnable;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = zzb;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    if (!Thread.interrupted() && !z) {
                        z = false;
                    } else {
                        z = true;
                    }
                    LockSupport.park(zzvmVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (!compareAndSet(null, currentThread)) {
            return;
        }
        boolean z = !zzg();
        if (z) {
            try {
                obj = zza();
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    if (!compareAndSet(currentThread, zza)) {
                        zzc(currentThread);
                    }
                    zzd(th);
                    return;
                } catch (Throwable th2) {
                    if (!compareAndSet(currentThread, zza)) {
                        zzc(currentThread);
                    }
                    zze(null);
                    throw th2;
                }
            }
        }
        if (!compareAndSet(currentThread, zza)) {
            zzc(currentThread);
        }
        if (z) {
            zze(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == zza) {
            str = "running=[DONE]";
        } else if (runnable instanceof zzvm) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = e.e("running=[RUNNING ON ", ((Thread) runnable).getName(), "]");
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return q.b(str, ", ", zzb());
    }

    public abstract Object zza() throws Exception;

    public abstract String zzb();

    public abstract void zzd(Throwable th);

    public abstract void zze(Object obj);

    public abstract boolean zzg();

    public final void zzh() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            zzvm zzvmVar = new zzvm(this, null);
            zzvmVar.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, zzvmVar)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }
}
