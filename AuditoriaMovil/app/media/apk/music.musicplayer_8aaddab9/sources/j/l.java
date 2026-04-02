package j;

import j.y;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class l {
    @Nullable
    public ExecutorService a;

    /* renamed from: b  reason: collision with root package name */
    public final Deque<y.b> f9527b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    public final Deque<y.b> f9528c = new ArrayDeque();

    /* renamed from: d  reason: collision with root package name */
    public final Deque<y> f9529d = new ArrayDeque();

    public void a(y.b bVar) {
        Deque<y.b> deque = this.f9528c;
        synchronized (this) {
            if (!deque.remove(bVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() {
        /*
            r15 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r15)
            java.util.Deque<j.y$b> r1 = r15.f9527b     // Catch: java.lang.Throwable -> Lc1
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lc1
        Lc:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Lc1
            if (r2 == 0) goto L37
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Lc1
            j.y$b r2 = (j.y.b) r2     // Catch: java.lang.Throwable -> Lc1
            java.util.Deque<j.y$b> r3 = r15.f9528c     // Catch: java.lang.Throwable -> Lc1
            int r3 = r3.size()     // Catch: java.lang.Throwable -> Lc1
            r4 = 64
            if (r3 < r4) goto L23
            goto L37
        L23:
            int r3 = r15.c(r2)     // Catch: java.lang.Throwable -> Lc1
            r4 = 5
            if (r3 < r4) goto L2b
            goto Lc
        L2b:
            r1.remove()     // Catch: java.lang.Throwable -> Lc1
            r0.add(r2)     // Catch: java.lang.Throwable -> Lc1
            java.util.Deque<j.y$b> r3 = r15.f9528c     // Catch: java.lang.Throwable -> Lc1
            r3.add(r2)     // Catch: java.lang.Throwable -> Lc1
            goto Lc
        L37:
            monitor-enter(r15)     // Catch: java.lang.Throwable -> Lc1
            java.util.Deque<j.y$b> r1 = r15.f9528c     // Catch: java.lang.Throwable -> Lbe
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Lbe
            java.util.Deque<j.y> r2 = r15.f9529d     // Catch: java.lang.Throwable -> Lbe
            int r2 = r2.size()     // Catch: java.lang.Throwable -> Lbe
            int r1 = r1 + r2
            monitor-exit(r15)     // Catch: java.lang.Throwable -> Lc1
            r2 = 0
            if (r1 <= 0) goto L4b
            r1 = 1
            goto L4c
        L4b:
            r1 = 0
        L4c:
            monitor-exit(r15)     // Catch: java.lang.Throwable -> Lc1
            int r3 = r0.size()
            r4 = 0
        L52:
            if (r4 >= r3) goto Lbd
            java.lang.Object r5 = r0.get(r4)
            j.y$b r5 = (j.y.b) r5
            monitor-enter(r15)
            java.util.concurrent.ExecutorService r6 = r15.a     // Catch: java.lang.Throwable -> Lba
            if (r6 != 0) goto L7d
            java.util.concurrent.ThreadPoolExecutor r6 = new java.util.concurrent.ThreadPoolExecutor     // Catch: java.lang.Throwable -> Lba
            r8 = 0
            r9 = 2147483647(0x7fffffff, float:NaN)
            r10 = 60
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> Lba
            java.util.concurrent.SynchronousQueue r13 = new java.util.concurrent.SynchronousQueue     // Catch: java.lang.Throwable -> Lba
            r13.<init>()     // Catch: java.lang.Throwable -> Lba
            java.lang.String r7 = "OkHttp Dispatcher"
            byte[] r14 = j.i0.c.a     // Catch: java.lang.Throwable -> Lba
            j.i0.d r14 = new j.i0.d     // Catch: java.lang.Throwable -> Lba
            r14.<init>(r7, r2)     // Catch: java.lang.Throwable -> Lba
            r7 = r6
            r7.<init>(r8, r9, r10, r12, r13, r14)     // Catch: java.lang.Throwable -> Lba
            r15.a = r6     // Catch: java.lang.Throwable -> Lba
        L7d:
            java.util.concurrent.ExecutorService r6 = r15.a     // Catch: java.lang.Throwable -> Lba
            monitor-exit(r15)
            java.util.Objects.requireNonNull(r5)
            r6.execute(r5)     // Catch: java.lang.Throwable -> L87 java.util.concurrent.RejectedExecutionException -> L89
            goto Lad
        L87:
            r0 = move-exception
            goto Lb0
        L89:
            r6 = move-exception
            java.io.InterruptedIOException r7 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L87
            java.lang.String r8 = "executor rejected"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L87
            r7.initCause(r6)     // Catch: java.lang.Throwable -> L87
            j.y r6 = j.y.this     // Catch: java.lang.Throwable -> L87
            j.n r6 = r6.f9595d     // Catch: java.lang.Throwable -> L87
            java.util.Objects.requireNonNull(r6)     // Catch: java.lang.Throwable -> L87
            j.e r6 = r5.f9600b     // Catch: java.lang.Throwable -> L87
            j.y r8 = j.y.this     // Catch: java.lang.Throwable -> L87
            m.s$a r6 = (m.s.a) r6     // Catch: java.lang.Throwable -> L87
            r6.a(r8, r7)     // Catch: java.lang.Throwable -> L87
            j.y r6 = j.y.this
            j.w r6 = r6.a
            j.l r6 = r6.f9568c
            r6.a(r5)
        Lad:
            int r4 = r4 + 1
            goto L52
        Lb0:
            j.y r1 = j.y.this
            j.w r1 = r1.a
            j.l r1 = r1.f9568c
            r1.a(r5)
            throw r0
        Lba:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        Lbd:
            return r1
        Lbe:
            r0 = move-exception
            monitor-exit(r15)     // Catch: java.lang.Throwable -> Lc1
            throw r0     // Catch: java.lang.Throwable -> Lc1
        Lc1:
            r0 = move-exception
            monitor-exit(r15)     // Catch: java.lang.Throwable -> Lc1
            goto Lc5
        Lc4:
            throw r0
        Lc5:
            goto Lc4
        */
        throw new UnsupportedOperationException("Method not decompiled: j.l.b():boolean");
    }

    public final int c(y.b bVar) {
        int i2 = 0;
        for (y.b bVar2 : this.f9528c) {
            y yVar = y.this;
            if (!yVar.f9597f && yVar.f9596e.a.f9539e.equals(y.this.f9596e.a.f9539e)) {
                i2++;
            }
        }
        return i2;
    }
}
