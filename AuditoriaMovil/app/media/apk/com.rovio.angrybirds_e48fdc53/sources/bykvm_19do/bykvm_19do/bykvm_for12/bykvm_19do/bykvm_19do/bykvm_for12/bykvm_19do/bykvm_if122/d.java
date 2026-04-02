package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_new1.g;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.j;
import java.util.Comparator;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public class d {
    public static final d g = new d();
    public static final bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_19do.a h = new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_19do.a();
    public static final long i;
    public static long j;
    private volatile bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_for12.c a;
    public volatile boolean b = false;
    public volatile boolean c = false;
    private volatile Handler d;
    private final Comparator<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a> e;
    private final PriorityBlockingQueue<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a> f;

    /* loaded from: classes.dex */
    class a implements Comparator<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a aVar, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a aVar2) {
            return d.this.a(aVar, aVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends g {
        final /* synthetic */ bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.g b;
        final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.g gVar, long j) {
            super(str);
            this.b = gVar;
            this.c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.a(this.b, this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends g {
        final /* synthetic */ bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_for12.c b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(d dVar, String str, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_for12.c cVar) {
            super(str);
            this.b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_for12.c cVar = this.b;
            if (cVar != null) {
                cVar.a(2);
            }
        }
    }

    static {
        new AtomicLong(0L);
        new AtomicLong(0L);
        i = System.currentTimeMillis();
        j = 0L;
    }

    private d() {
        a aVar = new a();
        this.e = aVar;
        this.f = new PriorityBlockingQueue<>(8, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a aVar, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a aVar2) {
        long j2;
        long j3;
        long j4;
        long j5;
        if (aVar == null) {
            return aVar2 == null ? 0 : -1;
        } else if (aVar2 == null) {
            return 1;
        } else {
            if (aVar.c() == aVar2.c()) {
                if (aVar.d() != null) {
                    j2 = aVar.d().b();
                    j3 = aVar.d().c();
                } else {
                    j2 = 0;
                    j3 = 0;
                }
                if (aVar2.d() != null) {
                    j5 = aVar2.d().b();
                    j4 = aVar2.d().c();
                } else {
                    j4 = 0;
                    j5 = 0;
                }
                if (j2 == 0 || j5 == 0) {
                    return 0;
                }
                long j6 = j2 - j5;
                if (Math.abs(j6) > 2147483647L) {
                    return 0;
                }
                if (j6 == 0) {
                    if (j3 == 0 || j4 == 0) {
                        return 0;
                    }
                    return (int) (j3 - j4);
                }
                return (int) j6;
            }
            return aVar.c() - aVar2.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.g gVar, long j2) {
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_for12.c cVar = this.a;
        if (gVar == null || cVar == null) {
            return;
        }
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_19do.a aVar = h;
        cVar.a(gVar.a(aVar.a(j2)), true);
        aVar.h0();
    }

    private void a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.g gVar, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a aVar) {
        if (gVar != null) {
            try {
                if (gVar.e()) {
                    long j2 = 0;
                    if (aVar != null && aVar.d() != null) {
                        j2 = aVar.d().c();
                    }
                    long j3 = j2;
                    if (j3 == 1) {
                        j = System.currentTimeMillis();
                    }
                    AtomicLong f0 = h.f0();
                    bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.b.a(f0, 1);
                    if (f0.get() == 200) {
                        if (Looper.getMainLooper() != Looper.myLooper()) {
                            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.a("==> monitor upload index1:" + j3);
                            a(gVar, j3);
                            return;
                        }
                        Executor a2 = gVar.a();
                        if (a2 == null) {
                            a2 = gVar.b();
                        }
                        if (a2 != null) {
                            a2.execute(new b("report", gVar, j3));
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void a(Handler handler) {
        this.d = handler;
    }

    public void a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a aVar, int i2) {
        a();
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.g b2 = j.m().b();
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_for12.c cVar = this.a;
        if (cVar != null) {
            a(b2, aVar);
            cVar.a(aVar, aVar.c() == 4);
        }
    }

    public boolean a() {
        boolean z;
        synchronized (this) {
            try {
            } catch (Throwable th) {
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.b(th.getMessage());
            }
            if (this.a != null && this.a.isAlive()) {
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.a("LogThread state:" + this.a.getState());
                z = false;
            }
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.a("--start LogThread--");
            this.a = new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_for12.c(this.f);
            this.a.start();
            z = true;
        }
        return z;
    }

    public void b() {
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.b.a(h.C(), 1);
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.d("flushMemoryAndDB()");
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_for12.c cVar = this.a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (cVar != null) {
                cVar.a(2);
                return;
            }
            return;
        }
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.g b2 = j.m().b();
        if (b2 == null) {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.d("discard flush");
            return;
        }
        Executor a2 = b2.a();
        if (a2 == null) {
            a2 = b2.b();
        }
        if (a2 != null) {
            a2.execute(new c(this, "flush", cVar));
        }
    }

    public PriorityBlockingQueue<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a> c() {
        return this.f;
    }

    public void d() {
        a();
        b();
    }

    public void e() {
        synchronized (this) {
            if (this.a != null && this.a.isAlive()) {
                if (this.d != null) {
                    this.d.removeCallbacksAndMessages(null);
                }
                this.a.a(false);
                if (Build.VERSION.SDK_INT >= 18) {
                    this.a.quitSafely();
                } else {
                    this.a.quit();
                }
                this.a = null;
            }
        }
    }
}
