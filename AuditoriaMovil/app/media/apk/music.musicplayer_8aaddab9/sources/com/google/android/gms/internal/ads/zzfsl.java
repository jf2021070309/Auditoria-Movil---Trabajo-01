package com.google.android.gms.internal.ads;

import e.a.d.a.a;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
/* loaded from: classes.dex */
public abstract class zzfsl<T> extends AtomicReference<Runnable> implements Runnable {
    private static final Runnable zza = new zzfsj(null);
    private static final Runnable zzb = new zzfsj(null);

    private final void zzb(Thread thread) {
        Runnable runnable = get();
        zzfsi zzfsiVar = null;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (!(runnable instanceof zzfsi)) {
                if (runnable != zzb) {
                    break;
                }
            } else {
                zzfsiVar = (zzfsi) runnable;
            }
            i2++;
            if (i2 > 1000) {
                Runnable runnable2 = zzb;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(zzfsiVar);
                }
            } else {
                Thread.yield();
            }
            runnable = get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        T t = null;
        if (compareAndSet(null, currentThread)) {
            boolean z = !zzd();
            if (z) {
                try {
                    t = zza();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, zza)) {
                        zzb(currentThread);
                    }
                    zzg(th);
                    return;
                }
            }
            if (!compareAndSet(currentThread, zza)) {
                zzb(currentThread);
            }
            if (z) {
                zzf(t);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = get();
        if (runnable == zza) {
            str = "running=[DONE]";
        } else if (runnable instanceof zzfsi) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            str = a.s(new StringBuilder(String.valueOf(name).length() + 21), "running=[RUNNING ON ", name, "]");
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String zzc = zzc();
        return a.s(new StringBuilder(str.length() + 2 + String.valueOf(zzc).length()), str, ", ", zzc);
    }

    public abstract T zza() throws Exception;

    public abstract String zzc();

    public abstract boolean zzd();

    public abstract void zzf(T t);

    public abstract void zzg(Throwable th);

    public final void zzh() {
        Runnable runnable = get();
        if (runnable instanceof Thread) {
            zzfsi zzfsiVar = new zzfsi(this, null);
            zzfsiVar.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, zzfsiVar)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (getAndSet(zza) == zzb) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (getAndSet(zza) == zzb) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }
}
