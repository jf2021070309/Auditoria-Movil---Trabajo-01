package com.google.common.util.concurrent;

import androidx.fragment.app.t;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Callables;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.segment.analytics.internal.Utils;
import java.util.concurrent.Callable;
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = Utils.DEFAULT_COLLECT_DEVICE_ID)
/* loaded from: classes3.dex */
public final class Callables {
    private Callables() {
    }

    @Beta
    @GwtIncompatible
    public static <T> AsyncCallable<T> asAsyncCallable(final Callable<T> callable, final ListeningExecutorService listeningExecutorService) {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(listeningExecutorService);
        return new AsyncCallable() { // from class: com.amazon.aps.iva.j90.b
            @Override // com.google.common.util.concurrent.AsyncCallable
            public final ListenableFuture call() {
                ListenableFuture submit;
                submit = ListeningExecutorService.this.submit(callable);
                return submit;
            }
        };
    }

    public static /* synthetic */ void b(Supplier supplier, Runnable runnable) {
        lambda$threadRenaming$3(supplier, runnable);
    }

    public static /* synthetic */ Object lambda$threadRenaming$2(Supplier supplier, Callable callable) throws Exception {
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        boolean trySetName = trySetName((String) supplier.get(), currentThread);
        try {
            return callable.call();
        } finally {
            if (trySetName) {
                trySetName(name, currentThread);
            }
        }
    }

    public static /* synthetic */ void lambda$threadRenaming$3(Supplier supplier, Runnable runnable) {
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        boolean trySetName = trySetName((String) supplier.get(), currentThread);
        try {
            runnable.run();
        } finally {
            if (trySetName) {
                trySetName(name, currentThread);
            }
        }
    }

    public static <T> Callable<T> returning(@ParametricNullness final T t) {
        return new Callable() { // from class: com.amazon.aps.iva.sq.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object lambda$returning$0;
                lambda$returning$0 = Callables.lambda$returning$0(t);
                return lambda$returning$0;
            }
        };
    }

    @GwtIncompatible
    public static <T> Callable<T> threadRenaming(final Callable<T> callable, final Supplier<String> supplier) {
        Preconditions.checkNotNull(supplier);
        Preconditions.checkNotNull(callable);
        return new Callable() { // from class: com.amazon.aps.iva.j90.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object lambda$threadRenaming$2;
                lambda$threadRenaming$2 = Callables.lambda$threadRenaming$2(Supplier.this, callable);
                return lambda$threadRenaming$2;
            }
        };
    }

    @GwtIncompatible
    private static boolean trySetName(String str, Thread thread) {
        try {
            thread.setName(str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    @GwtIncompatible
    public static Runnable threadRenaming(Runnable runnable, Supplier<String> supplier) {
        Preconditions.checkNotNull(supplier);
        Preconditions.checkNotNull(runnable);
        return new t(7, supplier, runnable);
    }

    public static /* synthetic */ Object lambda$returning$0(Object obj) throws Exception {
        return obj;
    }
}
