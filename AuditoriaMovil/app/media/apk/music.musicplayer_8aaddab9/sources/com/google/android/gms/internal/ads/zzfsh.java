package com.google.android.gms.internal.ads;

import e.a.d.a.a;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class zzfsh<V> implements zzfsm<V> {
    public static final zzfsm<?> zza = new zzfsh(null);
    private static final Logger zzb = Logger.getLogger(zzfsh.class.getName());
    private final V zzc;

    public zzfsh(V v) {
        this.zzc = v;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        return this.zzc;
    }

    @Override // java.util.concurrent.Future
    public final V get(long j2, TimeUnit timeUnit) throws ExecutionException {
        Objects.requireNonNull(timeUnit);
        return this.zzc;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.zzc);
        return a.t(new StringBuilder(String.valueOf(obj).length() + 27 + valueOf.length()), obj, "[status=SUCCESS, result=[", valueOf, "]]");
    }

    @Override // com.google.android.gms.internal.ads.zzfsm
    public final void zze(Runnable runnable, Executor executor) {
        zzflx.zzc(runnable, "Runnable was null.");
        zzflx.zzc(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = zzb;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            logger.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", a.t(new StringBuilder(valueOf.length() + 57 + valueOf2.length()), "RuntimeException while executing runnable ", valueOf, " with executor ", valueOf2), (Throwable) e2);
        }
    }
}
