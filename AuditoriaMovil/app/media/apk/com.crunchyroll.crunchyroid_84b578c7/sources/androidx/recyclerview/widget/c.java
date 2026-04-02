package androidx.recyclerview.widget;

import androidx.recyclerview.widget.n;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: AsyncDifferConfig.java */
/* loaded from: classes.dex */
public final class c<T> {
    public final Executor a;
    public final n.e<T> b;

    /* compiled from: AsyncDifferConfig.java */
    /* loaded from: classes.dex */
    public static final class a<T> {
        public static final Object c = new Object();
        public static ExecutorService d;
        public Executor a;
        public final n.e<T> b;

        public a(n.e<T> eVar) {
            this.b = eVar;
        }

        public final c<T> a() {
            if (this.a == null) {
                synchronized (c) {
                    try {
                        if (d == null) {
                            d = Executors.newFixedThreadPool(2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.a = d;
            }
            return new c<>(this.a, this.b);
        }
    }

    public c(Executor executor, n.e eVar) {
        this.a = executor;
        this.b = eVar;
    }
}
