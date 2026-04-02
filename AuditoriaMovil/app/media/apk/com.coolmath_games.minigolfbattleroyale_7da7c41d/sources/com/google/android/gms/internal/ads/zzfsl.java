package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public abstract class zzfsl<T> extends AtomicReference<Runnable> implements Runnable {
    private static final Runnable zza = new zzfsj(null);
    private static final Runnable zzb = new zzfsj(null);

    private final void zzb(Thread thread) {
        Runnable runnable = get();
        zzfsi zzfsiVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            if (!(runnable instanceof zzfsi)) {
                if (runnable != zzb) {
                    break;
                }
            } else {
                zzfsiVar = (zzfsi) runnable;
            }
            i++;
            if (i > 1000) {
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
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append("]");
            str = sb.toString();
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String zzc = zzc();
        StringBuilder sb2 = new StringBuilder(str.length() + 2 + String.valueOf(zzc).length());
        sb2.append(str);
        sb2.append(", ");
        sb2.append(zzc);
        return sb2.toString();
    }

    abstract T zza() throws Exception;

    abstract String zzc();

    abstract boolean zzd();

    abstract void zzf(T t);

    abstract void zzg(Throwable th);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzh() {
        Runnable runnable = get();
        if (runnable instanceof Thread) {
            zzfsi zzfsiVar = new zzfsi(this, null);
            super/*java.util.concurrent.locks.AbstractOwnableSynchronizer*/.setExclusiveOwnerThread(Thread.currentThread());
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
