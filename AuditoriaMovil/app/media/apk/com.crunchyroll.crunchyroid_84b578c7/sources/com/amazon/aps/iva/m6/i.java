package com.amazon.aps.iva.m6;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.amazon.aps.iva.m6.i;
import com.amazon.aps.iva.m6.o;
import com.amazon.aps.iva.n4.f0;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.w5.f;
import com.amazon.aps.iva.x5.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
/* compiled from: DownloadManager.java */
/* loaded from: classes.dex */
public final class i {
    public static final com.amazon.aps.iva.n6.b o = new com.amazon.aps.iva.n6.b(1);
    public final Context a;
    public final v b;
    public final b c;
    public final f0 d;
    public final CopyOnWriteArraySet<c> e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public boolean l;
    public List<com.amazon.aps.iva.m6.c> m;
    public com.amazon.aps.iva.n6.c n;

    /* compiled from: DownloadManager.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final com.amazon.aps.iva.m6.c a;
        public final boolean b;
        public final List<com.amazon.aps.iva.m6.c> c;
        public final Exception d;

        public a(com.amazon.aps.iva.m6.c cVar, boolean z, ArrayList arrayList, Exception exc) {
            this.a = cVar;
            this.b = z;
            this.c = arrayList;
            this.d = exc;
        }
    }

    /* compiled from: DownloadManager.java */
    /* loaded from: classes.dex */
    public static final class b extends Handler {
        public static final /* synthetic */ int m = 0;
        public final HandlerThread a;
        public final v b;
        public final p c;
        public final Handler d;
        public final ArrayList<com.amazon.aps.iva.m6.c> e;
        public final HashMap<String, d> f;
        public int g;
        public boolean h;
        public int i;
        public int j;
        public int k;
        public boolean l;

        public b(HandlerThread handlerThread, com.amazon.aps.iva.m6.a aVar, com.amazon.aps.iva.m6.b bVar, Handler handler, int i, boolean z) {
            super(handlerThread.getLooper());
            this.a = handlerThread;
            this.b = aVar;
            this.c = bVar;
            this.d = handler;
            this.i = i;
            this.j = 5;
            this.h = z;
            this.e = new ArrayList<>();
            this.f = new HashMap<>();
        }

        public static com.amazon.aps.iva.m6.c a(com.amazon.aps.iva.m6.c cVar, int i, int i2) {
            return new com.amazon.aps.iva.m6.c(cVar.a, i, cVar.c, System.currentTimeMillis(), cVar.e, i2, 0, cVar.h);
        }

        public final com.amazon.aps.iva.m6.c b(String str, boolean z) {
            int c = c(str);
            if (c != -1) {
                return this.e.get(c);
            }
            if (z) {
                try {
                    return this.b.b(str);
                } catch (IOException e) {
                    com.amazon.aps.iva.t5.p.d("Failed to load download: " + str, e);
                    return null;
                }
            }
            return null;
        }

        public final int c(String str) {
            int i = 0;
            while (true) {
                ArrayList<com.amazon.aps.iva.m6.c> arrayList = this.e;
                if (i < arrayList.size()) {
                    if (arrayList.get(i).a.b.equals(str)) {
                        return i;
                    }
                    i++;
                } else {
                    return -1;
                }
            }
        }

        public final void d(com.amazon.aps.iva.m6.c cVar) {
            boolean z;
            int i = cVar.b;
            boolean z2 = true;
            if (i != 3 && i != 4) {
                z = true;
            } else {
                z = false;
            }
            com.amazon.aps.iva.cq.b.C(z);
            int c = c(cVar.a.b);
            ArrayList<com.amazon.aps.iva.m6.c> arrayList = this.e;
            if (c == -1) {
                arrayList.add(cVar);
                Collections.sort(arrayList, new k(0));
            } else {
                if (cVar.c == arrayList.get(c).c) {
                    z2 = false;
                }
                arrayList.set(c, cVar);
                if (z2) {
                    Collections.sort(arrayList, new com.amazon.aps.iva.d2.k(2));
                }
            }
            try {
                this.b.c(cVar);
            } catch (IOException e) {
                com.amazon.aps.iva.t5.p.d("Failed to update index.", e);
            }
            this.d.obtainMessage(2, new a(cVar, false, new ArrayList(arrayList), null)).sendToTarget();
        }

        public final com.amazon.aps.iva.m6.c e(com.amazon.aps.iva.m6.c cVar, int i, int i2) {
            boolean z;
            if (i != 3 && i != 4) {
                z = true;
            } else {
                z = false;
            }
            com.amazon.aps.iva.cq.b.C(z);
            com.amazon.aps.iva.m6.c a = a(cVar, i, i2);
            d(a);
            return a;
        }

        public final void f(com.amazon.aps.iva.m6.c cVar, int i) {
            if (i == 0) {
                if (cVar.b == 1) {
                    e(cVar, 0, 0);
                }
            } else if (i != cVar.f) {
                int i2 = cVar.b;
                if (i2 == 0 || i2 == 2) {
                    i2 = 1;
                }
                d(new com.amazon.aps.iva.m6.c(cVar.a, i2, cVar.c, System.currentTimeMillis(), cVar.e, i, 0, cVar.h));
            }
        }

        public final void g() {
            int i = 0;
            int i2 = 0;
            while (true) {
                ArrayList<com.amazon.aps.iva.m6.c> arrayList = this.e;
                if (i < arrayList.size()) {
                    com.amazon.aps.iva.m6.c cVar = arrayList.get(i);
                    HashMap<String, d> hashMap = this.f;
                    d dVar = hashMap.get(cVar.a.b);
                    boolean z = true;
                    p pVar = this.c;
                    int i3 = cVar.b;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 != 5 && i3 != 7) {
                                    throw new IllegalStateException();
                                }
                                if (dVar != null) {
                                    if (!dVar.e) {
                                        dVar.a(false);
                                    }
                                } else if (!this.l) {
                                    m mVar = cVar.a;
                                    d dVar2 = new d(cVar.a, ((com.amazon.aps.iva.m6.b) pVar).a(mVar), cVar.h, true, this.j, this);
                                    hashMap.put(mVar.b, dVar2);
                                    this.l = true;
                                    dVar2.start();
                                }
                            } else {
                                dVar.getClass();
                                com.amazon.aps.iva.cq.b.C(!dVar.e);
                                if (this.h || this.g != 0) {
                                    z = false;
                                }
                                if (!z || i2 >= this.i) {
                                    e(cVar, 0, 0);
                                    dVar.a(false);
                                }
                            }
                        } else if (dVar != null) {
                            com.amazon.aps.iva.cq.b.C(!dVar.e);
                            dVar.a(false);
                        }
                    } else if (dVar != null) {
                        com.amazon.aps.iva.cq.b.C(!dVar.e);
                        dVar.a(false);
                    } else {
                        if (this.h || this.g != 0) {
                            z = false;
                        }
                        if (z && this.k < this.i) {
                            com.amazon.aps.iva.m6.c e = e(cVar, 2, 0);
                            m mVar2 = e.a;
                            d dVar3 = new d(e.a, ((com.amazon.aps.iva.m6.b) pVar).a(mVar2), e.h, false, this.j, this);
                            hashMap.put(mVar2.b, dVar3);
                            int i4 = this.k;
                            this.k = i4 + 1;
                            if (i4 == 0) {
                                sendEmptyMessageDelayed(11, 5000L);
                            }
                            dVar3.start();
                            dVar = dVar3;
                        } else {
                            dVar = null;
                        }
                    }
                    if (dVar != null && !dVar.e) {
                        i2++;
                    }
                    i++;
                } else {
                    return;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:149:0x02d7  */
        /* JADX WARN: Type inference failed for: r4v10 */
        /* JADX WARN: Type inference failed for: r4v11 */
        /* JADX WARN: Type inference failed for: r4v13 */
        /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r6v2 */
        /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void handleMessage(android.os.Message r30) {
            /*
                Method dump skipped, instructions count: 1070
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.m6.i.b.handleMessage(android.os.Message):void");
        }
    }

    /* compiled from: DownloadManager.java */
    /* loaded from: classes.dex */
    public static class d extends Thread implements o.a {
        public final m b;
        public final o c;
        public final l d;
        public final boolean e;
        public final int f;
        public volatile b g;
        public volatile boolean h;
        public Exception i;
        public long j = -1;

        public d(m mVar, o oVar, l lVar, boolean z, int i, b bVar) {
            this.b = mVar;
            this.c = oVar;
            this.d = lVar;
            this.e = z;
            this.f = i;
            this.g = bVar;
        }

        public final void a(boolean z) {
            if (z) {
                this.g = null;
            }
            if (!this.h) {
                this.h = true;
                this.c.cancel();
                interrupt();
            }
        }

        public final void b(long j, long j2, float f) {
            this.d.a = j2;
            this.d.b = f;
            if (j != this.j) {
                this.j = j;
                b bVar = this.g;
                if (bVar != null) {
                    bVar.obtainMessage(10, (int) (j >> 32), (int) j, this).sendToTarget();
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                if (this.e) {
                    this.c.remove();
                } else {
                    long j = -1;
                    int i = 0;
                    while (!this.h) {
                        try {
                            this.c.a(this);
                            break;
                        } catch (IOException e) {
                            if (!this.h) {
                                long j2 = this.d.a;
                                if (j2 != j) {
                                    i = 0;
                                    j = j2;
                                }
                                i++;
                                if (i <= this.f) {
                                    Thread.sleep(Math.min((i - 1) * 1000, 5000));
                                } else {
                                    throw e;
                                }
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception e2) {
                this.i = e2;
            }
            b bVar = this.g;
            if (bVar != null) {
                bVar.obtainMessage(9, this).sendToTarget();
            }
        }
    }

    public i(Context context, com.amazon.aps.iva.v5.b bVar, com.amazon.aps.iva.x5.a aVar, f.a aVar2, ExecutorService executorService) {
        com.amazon.aps.iva.m6.a aVar3 = new com.amazon.aps.iva.m6.a(bVar);
        c.a aVar4 = new c.a();
        aVar4.a = aVar;
        aVar4.e = aVar2;
        com.amazon.aps.iva.m6.b bVar2 = new com.amazon.aps.iva.m6.b(aVar4, executorService);
        this.a = context.getApplicationContext();
        this.b = aVar3;
        this.j = 3;
        this.i = true;
        this.m = Collections.emptyList();
        this.e = new CopyOnWriteArraySet<>();
        Handler n = g0.n(new Handler.Callback() { // from class: com.amazon.aps.iva.m6.h
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean z;
                i iVar = i.this;
                iVar.getClass();
                int i = message.what;
                CopyOnWriteArraySet<i.c> copyOnWriteArraySet = iVar.e;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            i.a aVar5 = (i.a) message.obj;
                            iVar.m = Collections.unmodifiableList(aVar5.c);
                            boolean d2 = iVar.d();
                            boolean z2 = aVar5.b;
                            c cVar = aVar5.a;
                            if (z2) {
                                Iterator<i.c> it = copyOnWriteArraySet.iterator();
                                while (it.hasNext()) {
                                    it.next().f(iVar, cVar);
                                }
                            } else {
                                Iterator<i.c> it2 = copyOnWriteArraySet.iterator();
                                while (it2.hasNext()) {
                                    it2.next().a(iVar, cVar, aVar5.d);
                                }
                            }
                            if (d2) {
                                iVar.a();
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        int i2 = message.arg1;
                        int i3 = message.arg2;
                        int i4 = iVar.f - i2;
                        iVar.f = i4;
                        iVar.g = i3;
                        if (i3 == 0 && i4 == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            Iterator<i.c> it3 = copyOnWriteArraySet.iterator();
                            while (it3.hasNext()) {
                                it3.next().e();
                            }
                        }
                    }
                } else {
                    iVar.h = true;
                    iVar.m = Collections.unmodifiableList((List) message.obj);
                    boolean d3 = iVar.d();
                    Iterator<i.c> it4 = copyOnWriteArraySet.iterator();
                    while (it4.hasNext()) {
                        it4.next().d(iVar);
                    }
                    if (d3) {
                        iVar.a();
                    }
                }
                return true;
            }
        });
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        b bVar3 = new b(handlerThread, aVar3, bVar2, n, this.j, this.i);
        this.c = bVar3;
        f0 f0Var = new f0(this, 2);
        this.d = f0Var;
        com.amazon.aps.iva.n6.c cVar = new com.amazon.aps.iva.n6.c(context, f0Var, o);
        this.n = cVar;
        int b2 = cVar.b();
        this.k = b2;
        this.f = 1;
        bVar3.obtainMessage(0, b2, 0).sendToTarget();
    }

    public final void a() {
        Iterator<c> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().b(this, this.l);
        }
    }

    public final void b(com.amazon.aps.iva.n6.c cVar, int i) {
        com.amazon.aps.iva.n6.b bVar = cVar.c;
        if (this.k != i) {
            this.k = i;
            this.f++;
            this.c.obtainMessage(2, i, 0).sendToTarget();
        }
        boolean d2 = d();
        Iterator<c> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
        if (d2) {
            a();
        }
    }

    public final void c(boolean z) {
        if (this.i == z) {
            return;
        }
        this.i = z;
        this.f++;
        this.c.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
        boolean d2 = d();
        Iterator<c> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
        if (d2) {
            a();
        }
    }

    public final boolean d() {
        boolean z;
        boolean z2 = true;
        if (!this.i && this.k != 0) {
            for (int i = 0; i < this.m.size(); i++) {
                if (this.m.get(i).b == 0) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (this.l == z) {
            z2 = false;
        }
        this.l = z;
        return z2;
    }

    /* compiled from: DownloadManager.java */
    /* loaded from: classes.dex */
    public interface c {
        default void c() {
        }

        default void e() {
        }

        default void d(i iVar) {
        }

        default void b(i iVar, boolean z) {
        }

        default void f(i iVar, com.amazon.aps.iva.m6.c cVar) {
        }

        default void a(i iVar, com.amazon.aps.iva.m6.c cVar, Exception exc) {
        }
    }
}
