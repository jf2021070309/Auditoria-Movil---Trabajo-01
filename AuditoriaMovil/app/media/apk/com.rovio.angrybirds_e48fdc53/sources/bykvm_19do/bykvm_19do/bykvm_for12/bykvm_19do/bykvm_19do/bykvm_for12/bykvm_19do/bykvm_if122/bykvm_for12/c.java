package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_for12;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_new1.g;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.j;
import com.bytedance.android.live.base.api.push.model.PushUIConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class c extends HandlerThread implements e, d, Handler.Callback {
    private volatile boolean a;
    private final Object b;
    protected bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.d c;
    private bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.c d;
    private final PriorityBlockingQueue<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a> e;
    private volatile int f;
    private volatile long g;
    private volatile long h;
    private final AtomicInteger i;
    private final AtomicInteger j;
    private volatile Handler k;
    private final List<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a> l;
    private final AtomicInteger m;
    private final AtomicInteger n;
    private int o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends g {
        final /* synthetic */ List b;
        final /* synthetic */ boolean c;
        final /* synthetic */ long d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, List list, boolean z, long j) {
            super(str);
            this.b = list;
            this.c = z;
            this.d = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar = c.this;
            cVar.a(this.b, this.c, this.d, cVar.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.b {
        final /* synthetic */ boolean a;
        final /* synthetic */ long b;

        b(boolean z, long j) {
            this.a = z;
            this.b = j;
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.b
        public void a(List<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_for12.a> list) {
            try {
                c.this.j.decrementAndGet();
                if (list == null || list.size() == 0) {
                    return;
                }
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_for12.a aVar = list.get(i);
                    if (aVar != null) {
                        c.this.a(this.a, aVar.b(), aVar.a(), this.b);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public c(PriorityBlockingQueue<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a> priorityBlockingQueue) {
        super("csj_log");
        this.a = true;
        this.b = new Object();
        this.g = 0L;
        this.h = 0L;
        this.i = new AtomicInteger(0);
        this.j = new AtomicInteger(0);
        this.l = new ArrayList();
        this.m = new AtomicInteger(0);
        this.n = new AtomicInteger(0);
        this.o = 10;
        this.e = priorityBlockingQueue;
        this.c = new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x011c A[Catch: all -> 0x0158, TryCatch #0 {, blocks: (B:5:0x0005, B:8:0x000b, B:10:0x001d, B:12:0x0023, B:54:0x0118, B:56:0x011c, B:57:0x0126, B:23:0x003c, B:25:0x0051, B:26:0x0058, B:28:0x0065, B:29:0x006c, B:31:0x007f, B:32:0x0084, B:33:0x0089, B:35:0x008f, B:37:0x0095, B:39:0x00a5, B:40:0x00aa, B:42:0x00b2, B:43:0x00b7, B:44:0x00d9, B:46:0x00e9, B:47:0x00ef, B:49:0x00fc, B:50:0x0102, B:52:0x0110, B:53:0x0115, B:59:0x0156), top: B:64:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(int r6, java.util.List<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a> r7, long r8) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_for12.c.a(int, java.util.List, long):void");
    }

    private void a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_for12.b bVar, List<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a> list) {
        if (bVar == null || !bVar.a) {
            return;
        }
        List<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.e> b2 = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.b.b();
        if (list == null || b2 == null || b2.size() == 0) {
            return;
        }
        for (bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a aVar : list) {
            if (aVar.c() == 1) {
                String c = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.a.c(aVar);
                String e = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.a.e(aVar);
                for (bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.e eVar : b2) {
                    if (eVar != null) {
                        eVar.a(c, e);
                    }
                }
            }
        }
    }

    private void a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a aVar) {
        this.i.set(0);
        this.f = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.g.b ? 5 : bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.g.c ? 7 : 4;
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.b.a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.h.n(), 1);
        this.c.a(aVar, this.f);
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.a.k(aVar);
    }

    private void a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a aVar, int i) {
        this.i.set(0);
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.a("handleThreadMessage()");
        if (i == 0) {
            this.f = ((bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.b) aVar).j();
            if (this.f == 6) {
                return;
            }
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.b.a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.h.d0(), 1);
        } else {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.b bVar = (bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.b) aVar;
            if (bVar.j() == 1) {
                this.f = 1;
            } else if (bVar.j() != 2) {
                return;
            } else {
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.a("before size:" + i);
                f();
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.a("after size :" + i);
                this.f = 2;
            }
        }
        b(aVar);
    }

    private void a(String str) {
        if (this.k.hasMessages(11)) {
            this.k.removeMessages(11);
        }
        if (this.l.size() == 0) {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.a("ensureUploadOptBatch empty：" + str);
            return;
        }
        ArrayList arrayList = new ArrayList(this.l);
        this.l.clear();
        a((List<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a>) arrayList, false, "before_" + str);
        b();
    }

    private void a(List<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a> list) {
        this.l.addAll(list);
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.g b2 = j.m().b();
        if (b2 != null && b2.g() != null) {
            this.o = b2.g().h();
        }
        if (this.l.size() >= this.o) {
            if (this.k.hasMessages(11)) {
                this.k.removeMessages(11);
            }
            ArrayList arrayList = new ArrayList(this.l);
            this.l.clear();
            a((List<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a>) arrayList, false, "max_size_dispatch");
            b();
        } else if (this.e.size() != 0) {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.a("uploadBatchOptimize nothing：" + this.e.size() + "  " + this.a);
        } else {
            a(false);
            if (this.k.hasMessages(11)) {
                this.k.removeMessages(11);
            }
            if (this.k.hasMessages(1)) {
                this.k.removeMessages(1);
            }
            long j = 200;
            if (b2 != null && b2.g() != null) {
                j = b2.g().c();
            }
            this.k.sendEmptyMessageDelayed(11, j);
        }
    }

    private void a(List<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a> list, String str) {
        a(str);
        a(list, false, str);
        b();
    }

    private void a(List<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a> list, boolean z, long j) {
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.g b2 = j.m().b();
        if (b2 != null) {
            Executor b3 = b2.b();
            if (list.get(0).c() == 1) {
                b3 = b2.a();
            }
            if (b3 == null) {
                return;
            }
            this.j.incrementAndGet();
            b3.execute(new a("csj_log_upload", list, z, j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a> list, boolean z, long j, int i) {
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_for12.b a2;
        try {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.b.a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.h.K(), 1);
            if (list.get(0).f() == 0) {
                a2 = j.n().a(list);
                a(a2, list);
                if (a2 != null) {
                    bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.a.a(list, a2.d);
                }
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a aVar : list) {
                        jSONArray.put(aVar.b());
                    }
                    jSONObject.put("stats_list", jSONArray);
                } catch (Exception e) {
                    bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.b("json exception:" + e.getMessage());
                }
                a2 = j.n().a(jSONObject);
            }
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_for12.b bVar = a2;
            this.j.decrementAndGet();
            a(z, bVar, list, j);
        } catch (Throwable th) {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.b("inner exception:" + th.getMessage());
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.b.a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.h.I(), 1);
            this.j.decrementAndGet();
        }
    }

    private void a(List<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a> list, boolean z, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.a.a(list, this.f, str);
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.c i = j.m().i();
        this.d = i;
        if (i != null) {
            b(list, z, currentTimeMillis);
        } else {
            a(list, z, currentTimeMillis);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_for12.b bVar, List<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a> list, long j) {
        if (z || bVar == null) {
            return;
        }
        int i = bVar.b;
        int i2 = -2;
        if (bVar.e) {
            i = -1;
        } else if (i < 0) {
            i = -2;
        }
        if (i == 510 || i == 511) {
            i = -2;
        }
        if (bVar.a || ((i < 500 || i >= 509) && i <= 513)) {
            i2 = i;
        }
        if (list != null) {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.a("preprocessResult code is " + i2 + " sz:" + list.size() + "  count:" + this.j.get());
        }
        a(i2, list, j);
    }

    private void b() {
        long nanoTime;
        StringBuilder sb;
        boolean z;
        if (this.k.hasMessages(11)) {
            d();
        } else {
            b(1);
        }
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.a("afterUpload message:" + this.f);
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.b.a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.h.h(), 1);
        if (this.f == 2) {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.b.a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.h.e(), 1);
            synchronized (this.b) {
                try {
                    long nanoTime2 = System.nanoTime();
                    this.b.wait(PushUIConfig.dismissTime);
                    nanoTime = System.nanoTime() - nanoTime2;
                    sb = new StringBuilder();
                    sb.append("afterUpload delta:");
                    sb.append(nanoTime);
                    sb.append(" start:");
                    sb.append(nanoTime2);
                    sb.append(" condition:");
                } catch (InterruptedException e) {
                    bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.b("wait exception:" + e.getMessage());
                    e.printStackTrace();
                }
                if (!bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.g.b && !bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.g.c) {
                    z = false;
                    sb.append(z);
                    bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.a(sb.toString());
                    if (nanoTime < 5000000000L && 5000000000L - nanoTime >= 50000000) {
                        if (!bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.g.b && !bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.g.c) {
                            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.d("afterUpload meet notifyRunOnce again");
                            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.b.a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.h.g(), 1);
                            a(2);
                        }
                        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.b.a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.h.U(), 1);
                        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.b("afterUpload wait serverBusy");
                    }
                    bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.b("afterUpload wait timeout");
                    bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.b.a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.h.e0(), 1);
                }
                z = true;
                sb.append(z);
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.a(sb.toString());
                if (nanoTime < 5000000000L) {
                    if (!bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.g.b) {
                        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.d("afterUpload meet notifyRunOnce again");
                        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.b.a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.h.g(), 1);
                        a(2);
                    }
                    bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.b.a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.h.U(), 1);
                    bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.b("afterUpload wait serverBusy");
                }
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.b("afterUpload wait timeout");
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.b.a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.h.e0(), 1);
            }
        }
    }

    private void b(int i) {
        AtomicLong H;
        if (a()) {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.b.a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.h.w(), 1);
        } else if (this.k == null) {
        } else {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.b.a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.h.N(), 1);
            if (this.k.hasMessages(1)) {
                return;
            }
            if (i == 1) {
                H = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.h.f();
            } else if (i != 2) {
                if (i == 3) {
                    H = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.h.H();
                }
                this.k.sendEmptyMessage(1);
            } else {
                H = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.h.v();
            }
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.b.a(H, 1);
            this.k.sendEmptyMessage(1);
        }
    }

    private void b(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a aVar) {
        if (g()) {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.d("upload cancel:" + bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.a.a(this.f));
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.b.a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.h.q(), 1);
            if (this.e.size() != 0) {
                return;
            }
            if (this.k.hasMessages(2)) {
                a(false);
                return;
            }
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.g.b = false;
            this.h = 0L;
            this.g = 0L;
            this.m.set(0);
            this.n.set(0);
        }
        boolean a2 = a(this.f, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.g.b);
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.a.a(a2, this.f, aVar);
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.b.a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.h.p(), 1);
        if (a2) {
            List<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a> a3 = this.c.a(this.f, -1);
            if (a3 != null) {
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.d("upload size:" + a3.size());
                b(a3);
                return;
            }
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.c("no need upload");
        }
        d();
    }

    private void b(List<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a> list) {
        String str;
        String str2;
        if (list.size() != 0) {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.a.a(list, this.e.size());
            if (list.size() > 1 || bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.a.d()) {
                str2 = "batchRead";
            } else {
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a aVar = list.get(0);
                if (aVar == null) {
                    str = "upload adLogEvent is null";
                } else if (aVar.c() == 1) {
                    str2 = "highPriority";
                } else if (aVar.f() == 0 && aVar.c() == 2) {
                    if (aVar.g() != 3) {
                        a(list);
                        return;
                    }
                    str2 = "version_v3";
                } else if (aVar.f() == 1) {
                    str2 = "stats";
                } else if (aVar.f() == 3) {
                    str2 = "adType_v3";
                } else if (aVar.f() == 2) {
                    str2 = "other";
                } else {
                    str = "upload adLogEvent adType error";
                }
            }
            a(list, str2);
            return;
        }
        d();
        str = "upload list is empty";
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.a(str);
    }

    private void b(List<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a> list, boolean z, long j) {
        this.j.incrementAndGet();
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.b.a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.h.K(), 1);
        try {
            this.d.a(list, new b(z, j));
        } catch (Exception e) {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.b("outer exception：" + e.getMessage());
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.b.a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.h.I(), 1);
            this.j.decrementAndGet();
        }
    }

    private void c() {
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.b.a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.h.Z(), 1);
        a(false);
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.g.e();
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.d("exit log thread");
    }

    private boolean c(int i) {
        return i >= 4 && this.j.get() == 0 && !bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.g.b && !bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.g.c;
    }

    private void d() {
        try {
            if (this.e.size() == 0 && this.k.hasMessages(11) && a()) {
                a(false);
            }
        } catch (Exception e) {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.b(e.getMessage());
        }
    }

    private void e() {
        while (a()) {
            try {
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.b.a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.h.F(), 1);
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a poll = this.e.poll(120000L, TimeUnit.MILLISECONDS);
                int size = this.e.size();
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.a("poll size:" + size);
                if (poll instanceof bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.b) {
                    a(poll, size);
                } else if (poll == null) {
                    int incrementAndGet = this.i.incrementAndGet();
                    bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.b.a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.h.o(), 1);
                    if (c(incrementAndGet)) {
                        c();
                        return;
                    } else if (incrementAndGet < 4) {
                        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.a("timeoutCount:" + incrementAndGet);
                        this.f = 1;
                        b((bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a) null);
                    }
                } else {
                    a(poll);
                    b(poll);
                }
            } catch (Throwable th) {
                th.printStackTrace();
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.b("run exception:" + th.getMessage());
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.b.a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.h.I(), 1);
            }
        }
    }

    private void f() {
        if (this.e.size() >= 100) {
            for (int i = 0; i < 100; i++) {
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a poll = this.e.poll();
                if (poll instanceof bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.b) {
                    bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.a("ignore tm");
                } else if (poll != null) {
                    a(poll);
                } else {
                    bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.b("event == null");
                }
            }
        }
    }

    private boolean g() {
        return bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.g.b && (this.f == 4 || this.f == 7 || this.f == 6 || this.f == 5 || this.f == 2);
    }

    private void h() {
        if (!isAlive()) {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.a("th dead");
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.g.a();
        } else if (a()) {
        } else {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.a("monitor  mLogThread ");
            a(6);
        }
    }

    private void i() {
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.a("sendServerBusyOrRoutineErrorRetryMessage");
        h();
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.b.a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.h.G(), 1);
        a(1);
    }

    public void a(int i) {
        try {
            boolean a2 = a(i, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.g.b);
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.d("notify flush : " + a2 + " " + i);
            if (i == 6 || a2) {
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.b bVar = new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.b();
                bVar.a(i);
                this.e.add(bVar);
                b(3);
            }
        } catch (Throwable th) {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.b(th.getMessage());
        }
    }

    public void a(int i, long j) {
        String str;
        if (this.k == null) {
            str = "mHandler == null";
        } else {
            Message obtain = Message.obtain();
            obtain.what = i;
            if (i == 2) {
                int incrementAndGet = this.m.incrementAndGet();
                long j2 = (((incrementAndGet - 1) % 4) + 1) * j;
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.a("sendMonitorMessage:" + i + "  busy:" + incrementAndGet + "  l:" + j2);
                this.k.sendMessageDelayed(obtain, j2);
                return;
            } else if (i == 3) {
                int incrementAndGet2 = this.n.incrementAndGet();
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.a("sendMonitorMessage:" + i + "  error:" + incrementAndGet2);
                this.k.sendMessageDelayed(obtain, ((long) (((incrementAndGet2 + (-1)) % 4) + 1)) * j);
                return;
            } else {
                str = "sendMonitorMessage error state";
            }
        }
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.b(str);
    }

    public void a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a aVar, boolean z) {
        if (aVar == null) {
            return;
        }
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.a("ignore result : " + z + ":" + this.a + " adType: " + ((int) aVar.f()));
        if (!z) {
            this.e.add(aVar);
            b(2);
        } else if (this.k == null) {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.b("handler is null，ignore is true");
        } else {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(aVar);
            a((List<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a>) arrayList, true, "ignore_result_dispatch");
        }
    }

    public void a(boolean z) {
        this.a = z;
    }

    public boolean a() {
        return this.a;
    }

    public boolean a(int i, boolean z) {
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.g b2 = j.m().b();
        if (b2 == null || !b2.a(j.m().d())) {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.b("AdThread NET IS NOT AVAILABLE!!!");
            return false;
        }
        return this.c.a(i, z);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        try {
        } catch (Throwable th) {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.b("error:" + th.getMessage());
        }
        if (i == 1) {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.a("HANDLER_MESSAGE_INIT");
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.b.a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.h.u(), 1);
            a(true);
            e();
        } else if (i != 2 && i != 3) {
            if (i == 11) {
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.a("opt upload");
                ArrayList arrayList = new ArrayList(this.l);
                this.l.clear();
                a((List<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a>) arrayList, false, "timeout_dispatch");
                b();
            }
            return true;
        } else {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.a("-----------------server busy handleMessage---------------- ");
            i();
        }
        return true;
    }

    @Override // android.os.HandlerThread
    protected void onLooperPrepared() {
        super.onLooperPrepared();
        this.k = new Handler(getLooper(), this);
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.g.a(this.k);
        this.k.sendEmptyMessage(1);
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.a("onLooperPrepared");
    }
}
