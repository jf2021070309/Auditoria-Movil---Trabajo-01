package com.amazon.aps.iva.z9;

import android.os.Handler;
import android.os.Looper;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
/* compiled from: LottieTask.java */
/* loaded from: classes.dex */
public final class j0<T> {
    public static final ExecutorService e = Executors.newCachedThreadPool();
    public final LinkedHashSet a;
    public final LinkedHashSet b;
    public final Handler c;
    public volatile i0<T> d;

    /* compiled from: LottieTask.java */
    /* loaded from: classes.dex */
    public class a extends FutureTask<i0<T>> {
        public a(Callable<i0<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public final void done() {
            j0 j0Var = j0.this;
            if (isCancelled()) {
                return;
            }
            try {
                j0Var.c(get());
            } catch (InterruptedException | ExecutionException e) {
                j0Var.c(new i0<>(e));
            }
        }
    }

    public j0() {
        throw null;
    }

    public j0(Callable<i0<T>> callable, boolean z) {
        this.a = new LinkedHashSet(1);
        this.b = new LinkedHashSet(1);
        this.c = new Handler(Looper.getMainLooper());
        this.d = null;
        if (z) {
            try {
                c(callable.call());
                return;
            } catch (Throwable th) {
                c(new i0<>(th));
                return;
            }
        }
        e.execute(new a(callable));
    }

    public final synchronized void a(f0 f0Var) {
        Throwable th;
        i0<T> i0Var = this.d;
        if (i0Var != null && (th = i0Var.b) != null) {
            f0Var.a(th);
        }
        this.b.add(f0Var);
    }

    public final synchronized void b(f0 f0Var) {
        T t;
        i0<T> i0Var = this.d;
        if (i0Var != null && (t = i0Var.a) != null) {
            f0Var.a(t);
        }
        this.a.add(f0Var);
    }

    public final void c(i0<T> i0Var) {
        if (this.d == null) {
            this.d = i0Var;
            this.c.post(new com.amazon.aps.iva.e.d(this, 10));
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }
}
