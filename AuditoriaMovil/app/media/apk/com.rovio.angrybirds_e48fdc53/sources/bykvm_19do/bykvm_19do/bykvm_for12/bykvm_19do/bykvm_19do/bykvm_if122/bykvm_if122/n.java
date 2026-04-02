package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122;

import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.x;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class n {
    private Runnable c;
    private ExecutorService d;
    private int a = 64;
    private int b = 5;
    private final Deque<x.a> e = new ArrayDeque();
    private final Deque<x.a> f = new ArrayDeque();
    private final Deque<x> g = new ArrayDeque();

    private <T> void a(Deque<T> deque, T t, boolean z) {
        int b;
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(t)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            if (z) {
                c();
            }
            b = b();
            runnable = this.c;
        }
        if (b != 0 || runnable == null) {
            return;
        }
        runnable.run();
    }

    private int c(x.a aVar) {
        int i = 0;
        for (x.a aVar2 : this.f) {
            if (aVar2.c().equals(aVar.c())) {
                i++;
            }
        }
        return i;
    }

    private void c() {
        if (this.f.size() < this.a && !this.e.isEmpty()) {
            Iterator<x.a> it = this.e.iterator();
            while (it.hasNext()) {
                x.a next = it.next();
                if (c(next) < this.b) {
                    it.remove();
                    this.f.add(next);
                    a().execute(next);
                }
                if (this.f.size() >= this.a) {
                    return;
                }
            }
        }
    }

    public ExecutorService a() {
        ExecutorService executorService;
        synchronized (this) {
            if (this.d == null) {
                this.d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 20L, TimeUnit.SECONDS, new SynchronousQueue(), bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a("OkHttp Dispatcher", false));
            }
            executorService = this.d;
        }
        return executorService;
    }

    public void a(int i) {
        synchronized (this) {
            if (i < 1) {
                throw new IllegalArgumentException("max < 1: " + i);
            }
            this.a = i;
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(x.a aVar) {
        synchronized (this) {
            if (this.f.size() >= this.a || c(aVar) >= this.b) {
                this.e.add(aVar);
            } else {
                this.f.add(aVar);
                a().execute(aVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(x xVar) {
        synchronized (this) {
            this.g.add(xVar);
        }
    }

    public int b() {
        int size;
        int size2;
        synchronized (this) {
            size = this.f.size();
            size2 = this.g.size();
        }
        return size + size2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(x.a aVar) {
        a(this.f, aVar, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(x xVar) {
        a(this.g, xVar, false);
    }
}
