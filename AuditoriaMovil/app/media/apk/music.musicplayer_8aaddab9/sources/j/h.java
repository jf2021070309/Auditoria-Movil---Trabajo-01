package j;

import j.i0.f.g;
import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class h {
    public static final Executor a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9252b;

    /* renamed from: c  reason: collision with root package name */
    public final long f9253c;

    /* renamed from: d  reason: collision with root package name */
    public final Runnable f9254d;

    /* renamed from: e  reason: collision with root package name */
    public final Deque<j.i0.f.c> f9255e;

    /* renamed from: f  reason: collision with root package name */
    public final j.i0.f.d f9256f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f9257g;

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long j2;
            while (true) {
                h hVar = h.this;
                long nanoTime = System.nanoTime();
                synchronized (hVar) {
                    j.i0.f.c cVar = null;
                    long j3 = Long.MIN_VALUE;
                    int i2 = 0;
                    int i3 = 0;
                    for (j.i0.f.c cVar2 : hVar.f9255e) {
                        if (hVar.a(cVar2, nanoTime) > 0) {
                            i3++;
                        } else {
                            i2++;
                            long j4 = nanoTime - cVar2.o;
                            if (j4 > j3) {
                                cVar = cVar2;
                                j3 = j4;
                            }
                        }
                    }
                    j2 = hVar.f9253c;
                    if (j3 < j2 && i2 <= hVar.f9252b) {
                        if (i2 > 0) {
                            j2 -= j3;
                        } else if (i3 <= 0) {
                            hVar.f9257g = false;
                            j2 = -1;
                        }
                    }
                    hVar.f9255e.remove(cVar);
                    j.i0.c.f(cVar.f9290e);
                    j2 = 0;
                }
                if (j2 == -1) {
                    return;
                }
                if (j2 > 0) {
                    long j5 = j2 / 1000000;
                    long j6 = j2 - (1000000 * j5);
                    synchronized (h.this) {
                        try {
                            h.this.wait(j5, (int) j6);
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            }
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = j.i0.c.a;
        a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new j.i0.d("OkHttp ConnectionPool", true));
    }

    public h() {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.f9254d = new a();
        this.f9255e = new ArrayDeque();
        this.f9256f = new j.i0.f.d();
        this.f9252b = 5;
        this.f9253c = timeUnit.toNanos(5L);
    }

    public final int a(j.i0.f.c cVar, long j2) {
        List<Reference<j.i0.f.g>> list = cVar.f9299n;
        int i2 = 0;
        while (i2 < list.size()) {
            Reference<j.i0.f.g> reference = list.get(i2);
            if (reference.get() != null) {
                i2++;
            } else {
                StringBuilder y = e.a.d.a.a.y("A connection to ");
                y.append(cVar.f9288c.a.a);
                y.append(" was leaked. Did you forget to close a response body?");
                j.i0.j.f.a.m(y.toString(), ((g.a) reference).a);
                list.remove(i2);
                cVar.f9296k = true;
                if (list.isEmpty()) {
                    cVar.o = j2 - this.f9253c;
                    return 0;
                }
            }
        }
        return list.size();
    }
}
