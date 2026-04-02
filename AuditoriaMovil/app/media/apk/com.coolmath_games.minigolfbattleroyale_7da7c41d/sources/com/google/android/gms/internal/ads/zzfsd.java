package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfsd extends zzfsf {
    public static <V> zzfsm<V> zza(V v) {
        if (v == null) {
            return (zzfsm<V>) zzfsh.zza;
        }
        return new zzfsh(v);
    }

    public static zzfsm<Void> zzb() {
        return zzfsh.zza;
    }

    public static <V> zzfsm<V> zzc(Throwable th) {
        if (th != null) {
            return new zzfsg(th);
        }
        throw null;
    }

    public static <O> zzfsm<O> zzd(Callable<O> callable, Executor executor) {
        zzftb zzftbVar = new zzftb(callable);
        executor.execute(zzftbVar);
        return zzftbVar;
    }

    public static <O> zzfsm<O> zze(zzfrj<O> zzfrjVar, Executor executor) {
        zzftb zzftbVar = new zzftb(zzfrjVar);
        executor.execute(zzftbVar);
        return zzftbVar;
    }

    public static <V, X extends Throwable> zzfsm<V> zzf(zzfsm<? extends V> zzfsmVar, Class<X> cls, zzfln<? super X, ? extends V> zzflnVar, Executor executor) {
        zzfqu zzfquVar = new zzfqu(zzfsmVar, cls, zzflnVar);
        zzfsmVar.zze(zzfquVar, zzfst.zzc(executor, zzfquVar));
        return zzfquVar;
    }

    public static <V, X extends Throwable> zzfsm<V> zzg(zzfsm<? extends V> zzfsmVar, Class<X> cls, zzfrk<? super X, ? extends V> zzfrkVar, Executor executor) {
        zzfqt zzfqtVar = new zzfqt(zzfsmVar, cls, zzfrkVar);
        zzfsmVar.zze(zzfqtVar, zzfst.zzc(executor, zzfqtVar));
        return zzfqtVar;
    }

    public static <V> zzfsm<V> zzh(zzfsm<V> zzfsmVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return zzfsmVar.isDone() ? zzfsmVar : zzfsy.zzy(zzfsmVar, j, timeUnit, scheduledExecutorService);
    }

    public static <I, O> zzfsm<O> zzi(zzfsm<I> zzfsmVar, zzfrk<? super I, ? extends O> zzfrkVar, Executor executor) {
        int i = zzfra.zzc;
        if (executor != null) {
            zzfqy zzfqyVar = new zzfqy(zzfsmVar, zzfrkVar);
            zzfsmVar.zze(zzfqyVar, zzfst.zzc(executor, zzfqyVar));
            return zzfqyVar;
        }
        throw null;
    }

    public static <I, O> zzfsm<O> zzj(zzfsm<I> zzfsmVar, zzfln<? super I, ? extends O> zzflnVar, Executor executor) {
        int i = zzfra.zzc;
        if (zzflnVar != null) {
            zzfqz zzfqzVar = new zzfqz(zzfsmVar, zzflnVar);
            zzfsmVar.zze(zzfqzVar, zzfst.zzc(executor, zzfqzVar));
            return zzfqzVar;
        }
        throw null;
    }

    public static <V> zzfsm<List<V>> zzk(Iterable<? extends zzfsm<? extends V>> iterable) {
        return new zzfrl(zzfoj.zzo(iterable), true);
    }

    @SafeVarargs
    public static <V> zzfsb<V> zzl(zzfsm<? extends V>... zzfsmVarArr) {
        return new zzfsb<>(false, zzfoj.zzq(zzfsmVarArr), null);
    }

    public static <V> zzfsb<V> zzm(Iterable<? extends zzfsm<? extends V>> iterable) {
        return new zzfsb<>(false, zzfoj.zzo(iterable), null);
    }

    @SafeVarargs
    public static <V> zzfsb<V> zzn(zzfsm<? extends V>... zzfsmVarArr) {
        return new zzfsb<>(true, zzfoj.zzq(zzfsmVarArr), null);
    }

    public static <V> zzfsb<V> zzo(Iterable<? extends zzfsm<? extends V>> iterable) {
        return new zzfsb<>(true, zzfoj.zzo(iterable), null);
    }

    public static <V> V zzq(Future<V> future) throws ExecutionException {
        if (!future.isDone()) {
            throw new IllegalStateException(zzfmi.zzd("Future was expected to be done: %s", future));
        }
        return (V) zzftd.zza(future);
    }

    public static <V> V zzr(Future<V> future) {
        try {
            return (V) zzftd.zza(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new zzfrs((Error) cause);
            }
            throw new zzftc(cause);
        }
    }

    public static <V> void zzp(zzfsm<V> zzfsmVar, zzfrz<? super V> zzfrzVar, Executor executor) {
        if (zzfrzVar != null) {
            zzfsmVar.zze(new zzfsa(zzfsmVar, zzfrzVar), executor);
            return;
        }
        throw null;
    }
}
