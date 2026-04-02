package com.amazon.aps.iva.hd;

import java.util.concurrent.Executor;
/* compiled from: Executors.java */
/* loaded from: classes.dex */
public final class e {
    public static final a a = new a();
    public static final b b = new b();

    /* compiled from: Executors.java */
    /* loaded from: classes.dex */
    public class a implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            l.e().post(runnable);
        }
    }

    /* compiled from: Executors.java */
    /* loaded from: classes.dex */
    public class b implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    }
}
