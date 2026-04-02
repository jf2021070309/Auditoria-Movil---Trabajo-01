package rx.plugins;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes4.dex */
public class RxJavaPlugins {
    private final AtomicReference<RxJavaErrorHandler> c = new AtomicReference<>();
    private final AtomicReference<RxJavaObservableExecutionHook> d = new AtomicReference<>();
    private final AtomicReference<RxJavaSingleExecutionHook> e = new AtomicReference<>();
    private final AtomicReference<RxJavaCompletableExecutionHook> f = new AtomicReference<>();
    private final AtomicReference<RxJavaSchedulersHook> g = new AtomicReference<>();
    private static final RxJavaPlugins b = new RxJavaPlugins();
    static final RxJavaErrorHandler a = new RxJavaErrorHandler() { // from class: rx.plugins.RxJavaPlugins.1
    };

    @Deprecated
    public static RxJavaPlugins getInstance() {
        return b;
    }

    RxJavaPlugins() {
    }

    public void reset() {
        b.c.set(null);
        b.d.set(null);
        b.e.set(null);
        b.f.set(null);
        b.g.set(null);
    }

    public RxJavaErrorHandler getErrorHandler() {
        if (this.c.get() == null) {
            Object a2 = a(RxJavaErrorHandler.class, System.getProperties());
            if (a2 == null) {
                this.c.compareAndSet(null, a);
            } else {
                this.c.compareAndSet(null, (RxJavaErrorHandler) a2);
            }
        }
        return this.c.get();
    }

    public void registerErrorHandler(RxJavaErrorHandler rxJavaErrorHandler) {
        if (!this.c.compareAndSet(null, rxJavaErrorHandler)) {
            throw new IllegalStateException("Another strategy was already registered: " + this.c.get());
        }
    }

    public RxJavaObservableExecutionHook getObservableExecutionHook() {
        if (this.d.get() == null) {
            Object a2 = a(RxJavaObservableExecutionHook.class, System.getProperties());
            if (a2 == null) {
                this.d.compareAndSet(null, a.a());
            } else {
                this.d.compareAndSet(null, (RxJavaObservableExecutionHook) a2);
            }
        }
        return this.d.get();
    }

    public void registerObservableExecutionHook(RxJavaObservableExecutionHook rxJavaObservableExecutionHook) {
        if (!this.d.compareAndSet(null, rxJavaObservableExecutionHook)) {
            throw new IllegalStateException("Another strategy was already registered: " + this.d.get());
        }
    }

    public RxJavaSingleExecutionHook getSingleExecutionHook() {
        if (this.e.get() == null) {
            Object a2 = a(RxJavaSingleExecutionHook.class, System.getProperties());
            if (a2 == null) {
                this.e.compareAndSet(null, b.a());
            } else {
                this.e.compareAndSet(null, (RxJavaSingleExecutionHook) a2);
            }
        }
        return this.e.get();
    }

    public void registerSingleExecutionHook(RxJavaSingleExecutionHook rxJavaSingleExecutionHook) {
        if (!this.e.compareAndSet(null, rxJavaSingleExecutionHook)) {
            throw new IllegalStateException("Another strategy was already registered: " + this.e.get());
        }
    }

    public RxJavaCompletableExecutionHook getCompletableExecutionHook() {
        if (this.f.get() == null) {
            Object a2 = a(RxJavaCompletableExecutionHook.class, System.getProperties());
            if (a2 == null) {
                this.f.compareAndSet(null, new RxJavaCompletableExecutionHook() { // from class: rx.plugins.RxJavaPlugins.2
                });
            } else {
                this.f.compareAndSet(null, (RxJavaCompletableExecutionHook) a2);
            }
        }
        return this.f.get();
    }

    public void registerCompletableExecutionHook(RxJavaCompletableExecutionHook rxJavaCompletableExecutionHook) {
        if (!this.f.compareAndSet(null, rxJavaCompletableExecutionHook)) {
            throw new IllegalStateException("Another strategy was already registered: " + this.e.get());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0149 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object a(java.lang.Class<?> r10, java.util.Properties r11) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.plugins.RxJavaPlugins.a(java.lang.Class, java.util.Properties):java.lang.Object");
    }

    public RxJavaSchedulersHook getSchedulersHook() {
        if (this.g.get() == null) {
            Object a2 = a(RxJavaSchedulersHook.class, System.getProperties());
            if (a2 == null) {
                this.g.compareAndSet(null, RxJavaSchedulersHook.getDefaultInstance());
            } else {
                this.g.compareAndSet(null, (RxJavaSchedulersHook) a2);
            }
        }
        return this.g.get();
    }

    public void registerSchedulersHook(RxJavaSchedulersHook rxJavaSchedulersHook) {
        if (!this.g.compareAndSet(null, rxJavaSchedulersHook)) {
            throw new IllegalStateException("Another strategy was already registered: " + this.g.get());
        }
    }
}
