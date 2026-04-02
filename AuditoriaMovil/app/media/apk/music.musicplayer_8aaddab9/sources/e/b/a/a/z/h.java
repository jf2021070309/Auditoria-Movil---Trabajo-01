package e.b.a.a.z;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class h extends j implements e {

    /* renamed from: f  reason: collision with root package name */
    public final Object f5409f;

    /* renamed from: g  reason: collision with root package name */
    public final a f5410g;

    /* renamed from: h  reason: collision with root package name */
    public final c f5411h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5412i;

    /* renamed from: j  reason: collision with root package name */
    public final AtomicBoolean f5413j;

    /* renamed from: k  reason: collision with root package name */
    public final e.b.a.a.c0.a f5414k;

    public h(e.b.a.a.c0.a aVar, c cVar, String str) {
        super(cVar, str);
        this.f5409f = new Object();
        this.f5412i = false;
        this.f5413j = new AtomicBoolean(false);
        this.f5411h = cVar;
        this.f5414k = aVar;
        this.f5410g = new a(cVar);
    }

    @Override // e.b.a.a.z.j, e.b.a.a.z.e
    public void a(b bVar) {
        synchronized (this.f5409f) {
            this.f5412i = true;
            super.a(bVar);
            e.b.a.a.c0.a aVar = this.f5414k;
            Object obj = this.f5409f;
            Objects.requireNonNull(aVar);
            obj.notifyAll();
        }
    }

    @Override // e.b.a.a.z.j
    public void b() {
        synchronized (this.f5409f) {
            while (true) {
                b bVar = this.f5417d;
                if (bVar != null) {
                    this.f5417d = bVar.f5401c;
                    this.f5416c.b(bVar);
                } else {
                    this.f5418e = null;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r0 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
        r11.b();
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
        r7 = r10.f5409f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
        monitor-enter(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
        if (r10.f5412i == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
        monitor-exit(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
        if (r6 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0050, code lost:
        if (r6.longValue() > r4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0052, code lost:
        e.b.a.a.y.c.a.a("[%s] next message is ready, requery", r10.f5415b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005f, code lost:
        monitor-exit(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
        if (r10.f5413j.get() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
        if (r6 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
        e.b.a.a.y.c.a.a("[%s] will wait on the lock forever", r10.f5415b);
        r3 = r10.f5414k;
        r4 = r10.f5409f;
        java.util.Objects.requireNonNull(r3);
        r4.wait();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0083, code lost:
        e.b.a.a.y.c.a.a("[%s] will wait on the lock until %d", r10.f5415b, r6);
        r10.f5414k.b(r10.f5409f, r6.longValue());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(e.b.a.a.z.f r11) {
        /*
            r10 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r10.f5413j
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 != 0) goto Lc2
            r11.c()
        Lc:
            java.util.concurrent.atomic.AtomicBoolean r0 = r10.f5413j
            boolean r0 = r0.get()
            r2 = 0
            if (r0 == 0) goto Lb4
            r0 = 0
        L16:
            java.util.concurrent.atomic.AtomicBoolean r3 = r10.f5413j
            boolean r3 = r3.get()
            if (r3 == 0) goto La7
            java.lang.Object r3 = r10.f5409f
            monitor-enter(r3)
            e.b.a.a.c0.a r4 = r10.f5414k     // Catch: java.lang.Throwable -> La4
            long r4 = r4.a()     // Catch: java.lang.Throwable -> La4
            e.b.a.a.z.a r6 = r10.f5410g     // Catch: java.lang.Throwable -> La4
            java.lang.Long r6 = r6.b(r4, r10)     // Catch: java.lang.Throwable -> La4
            e.b.a.a.z.b r7 = r10.c()     // Catch: java.lang.Throwable -> La4
            if (r7 == 0) goto L36
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La4
            goto La8
        L36:
            r10.f5412i = r2     // Catch: java.lang.Throwable -> La4
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La4
            if (r0 != 0) goto L3f
            r11.b()
            r0 = 1
        L3f:
            java.lang.Object r7 = r10.f5409f
            monitor-enter(r7)
            boolean r3 = r10.f5412i     // Catch: java.lang.Throwable -> La1
            if (r3 == 0) goto L48
            monitor-exit(r7)     // Catch: java.lang.Throwable -> La1
            goto L16
        L48:
            if (r6 == 0) goto L61
            long r8 = r6.longValue()     // Catch: java.lang.Throwable -> La1
            int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r3 > 0) goto L61
            java.lang.String r3 = "[%s] next message is ready, requery"
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> La1
            java.lang.String r5 = r10.f5415b     // Catch: java.lang.Throwable -> La1
            r4[r2] = r5     // Catch: java.lang.Throwable -> La1
            e.b.a.a.y.a r5 = e.b.a.a.y.c.a     // Catch: java.lang.Throwable -> La1
            r5.a(r3, r4)     // Catch: java.lang.Throwable -> La1
            monitor-exit(r7)     // Catch: java.lang.Throwable -> La1
            goto L16
        L61:
            java.util.concurrent.atomic.AtomicBoolean r3 = r10.f5413j     // Catch: java.lang.Throwable -> La1
            boolean r3 = r3.get()     // Catch: java.lang.Throwable -> La1
            if (r3 == 0) goto L9e
            if (r6 != 0) goto L83
            java.lang.String r3 = "[%s] will wait on the lock forever"
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.InterruptedException -> L9e java.lang.Throwable -> La1
            java.lang.String r5 = r10.f5415b     // Catch: java.lang.InterruptedException -> L9e java.lang.Throwable -> La1
            r4[r2] = r5     // Catch: java.lang.InterruptedException -> L9e java.lang.Throwable -> La1
            e.b.a.a.y.a r5 = e.b.a.a.y.c.a     // Catch: java.lang.InterruptedException -> L9e java.lang.Throwable -> La1
            r5.a(r3, r4)     // Catch: java.lang.InterruptedException -> L9e java.lang.Throwable -> La1
            e.b.a.a.c0.a r3 = r10.f5414k     // Catch: java.lang.InterruptedException -> L9e java.lang.Throwable -> La1
            java.lang.Object r4 = r10.f5409f     // Catch: java.lang.InterruptedException -> L9e java.lang.Throwable -> La1
            java.util.Objects.requireNonNull(r3)     // Catch: java.lang.InterruptedException -> L9e java.lang.Throwable -> La1
            r4.wait()     // Catch: java.lang.InterruptedException -> L9e java.lang.Throwable -> La1
            goto L9e
        L83:
            java.lang.String r3 = "[%s] will wait on the lock until %d"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.InterruptedException -> L9e java.lang.Throwable -> La1
            java.lang.String r5 = r10.f5415b     // Catch: java.lang.InterruptedException -> L9e java.lang.Throwable -> La1
            r4[r2] = r5     // Catch: java.lang.InterruptedException -> L9e java.lang.Throwable -> La1
            r4[r1] = r6     // Catch: java.lang.InterruptedException -> L9e java.lang.Throwable -> La1
            e.b.a.a.y.a r5 = e.b.a.a.y.c.a     // Catch: java.lang.InterruptedException -> L9e java.lang.Throwable -> La1
            r5.a(r3, r4)     // Catch: java.lang.InterruptedException -> L9e java.lang.Throwable -> La1
            e.b.a.a.c0.a r3 = r10.f5414k     // Catch: java.lang.InterruptedException -> L9e java.lang.Throwable -> La1
            java.lang.Object r4 = r10.f5409f     // Catch: java.lang.InterruptedException -> L9e java.lang.Throwable -> La1
            long r5 = r6.longValue()     // Catch: java.lang.InterruptedException -> L9e java.lang.Throwable -> La1
            r3.b(r4, r5)     // Catch: java.lang.InterruptedException -> L9e java.lang.Throwable -> La1
        L9e:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> La1
            goto L16
        La1:
            r11 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> La1
            throw r11
        La4:
            r11 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La4
            throw r11
        La7:
            r7 = 0
        La8:
            if (r7 == 0) goto Lc
            r11.a(r7)
            e.b.a.a.z.c r0 = r10.f5411h
            r0.b(r7)
            goto Lc
        Lb4:
            java.lang.String r11 = "[%s] finished queue"
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = r10.f5415b
            r0[r2] = r1
            e.b.a.a.y.a r1 = e.b.a.a.y.c.a
            r1.a(r11, r0)
            return
        Lc2:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "only 1 consumer per MQ"
            r11.<init>(r0)
            goto Lcb
        Lca:
            throw r11
        Lcb:
            goto Lca
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.a.a.z.h.d(e.b.a.a.z.f):void");
    }

    public void e() {
        this.f5413j.set(false);
        synchronized (this.f5409f) {
            e.b.a.a.c0.a aVar = this.f5414k;
            Object obj = this.f5409f;
            Objects.requireNonNull(aVar);
            obj.notifyAll();
        }
    }
}
