package com.amazon.aps.iva.u9;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
/* compiled from: SerialExecutor.java */
/* loaded from: classes.dex */
public final class j implements Executor {
    public final Executor c;
    public volatile Runnable e;
    public final ArrayDeque<a> b = new ArrayDeque<>();
    public final Object d = new Object();

    /* compiled from: SerialExecutor.java */
    /* loaded from: classes.dex */
    public static class a implements Runnable {
        public final j b;
        public final Runnable c;

        public a(j jVar, Runnable runnable) {
            this.b = jVar;
            this.c = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            j jVar = this.b;
            try {
                this.c.run();
            } finally {
                jVar.a();
            }
        }
    }

    public j(ExecutorService executorService) {
        this.c = executorService;
    }

    public final void a() {
        synchronized (this.d) {
            a poll = this.b.poll();
            this.e = poll;
            if (poll != null) {
                this.c.execute(this.e);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.d) {
            this.b.add(new a(this, runnable));
            if (this.e == null) {
                a();
            }
        }
    }
}
