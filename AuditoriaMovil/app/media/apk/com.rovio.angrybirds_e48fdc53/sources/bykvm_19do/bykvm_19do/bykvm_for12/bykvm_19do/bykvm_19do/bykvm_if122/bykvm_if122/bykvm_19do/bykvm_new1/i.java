package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1;

import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.r;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.s;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.t;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class i {
    static final /* synthetic */ boolean l = true;
    long b;
    final int c;
    final g d;
    private List<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1.c> e;
    private boolean f;
    private final b g;
    final a h;
    long a = 0;
    final c i = new c();
    final c j = new c();
    bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1.b k = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class a implements r {
        static final /* synthetic */ boolean e = true;
        private final bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c a = new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c();
        boolean b;
        boolean c;

        a() {
        }

        private void a(boolean z) throws IOException {
            long min;
            synchronized (i.this) {
                i.this.j.g();
                while (i.this.b <= 0 && !this.c && !this.b && i.this.k == null) {
                    i.this.k();
                }
                i.this.j.k();
                i.this.b();
                min = Math.min(i.this.b, this.a.o());
                i.this.b -= min;
            }
            i.this.j.g();
            try {
                i.this.d.a(i.this.c, z && min == this.a.o(), this.a, min);
            } finally {
                i.this.j.k();
            }
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.r
        public t b() {
            return i.this.j;
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.r
        public void b(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c cVar, long j) throws IOException {
            if (!e && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            this.a.b(cVar, j);
            while (this.a.o() >= 16384) {
                a(false);
            }
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!e && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            synchronized (i.this) {
                if (this.b) {
                    return;
                }
                if (!i.this.h.c) {
                    if (this.a.o() > 0) {
                        while (this.a.o() > 0) {
                            a(true);
                        }
                    } else {
                        i iVar = i.this;
                        iVar.d.a(iVar.c, true, (bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c) null, 0L);
                    }
                }
                synchronized (i.this) {
                    this.b = true;
                }
                i.this.d.flush();
                i.this.a();
            }
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.r, java.io.Flushable
        public void flush() throws IOException {
            if (!e && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            synchronized (i.this) {
                i.this.b();
            }
            while (this.a.o() > 0) {
                a(false);
                i.this.d.flush();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class b implements s {
        static final /* synthetic */ boolean g = true;
        private final bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c a = new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c();
        private final bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c b = new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c();
        private final long c;
        boolean d;
        boolean e;

        b(long j) {
            this.c = j;
        }

        private void h() throws IOException {
            if (this.d) {
                throw new IOException("stream closed");
            }
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1.b bVar = i.this.k;
            if (bVar != null) {
                throw new o(bVar);
            }
        }

        private void i() throws IOException {
            i.this.i.g();
            while (this.b.o() == 0 && !this.e && !this.d && i.this.k == null) {
                try {
                    i.this.k();
                } finally {
                    i.this.i.k();
                }
            }
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.s
        public long a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c cVar, long j) throws IOException {
            long a;
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            synchronized (i.this) {
                i();
                h();
                if (this.b.o() == 0) {
                    a = -1;
                } else {
                    bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c cVar2 = this.b;
                    a = cVar2.a(cVar, Math.min(j, cVar2.o()));
                    i.this.a += a;
                    if (i.this.a >= i.this.d.m.c() / 2) {
                        i.this.d.a(i.this.c, i.this.a);
                        i.this.a = 0L;
                    }
                    synchronized (i.this.d) {
                        i.this.d.k += a;
                        if (i.this.d.k >= i.this.d.m.c() / 2) {
                            i.this.d.a(0, i.this.d.k);
                            i.this.d.k = 0L;
                        }
                    }
                }
            }
            return a;
        }

        void a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.e eVar, long j) throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            if (!g && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            while (j > 0) {
                synchronized (i.this) {
                    z = this.e;
                    z2 = true;
                    z3 = this.b.o() + j > this.c;
                }
                if (z3) {
                    eVar.skip(j);
                    i.this.b(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1.b.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    eVar.skip(j);
                    return;
                } else {
                    long a = eVar.a(this.a, j);
                    if (a == -1) {
                        throw new EOFException();
                    }
                    j -= a;
                    synchronized (i.this) {
                        if (this.b.o() != 0) {
                            z2 = false;
                        }
                        this.b.a(this.a);
                        if (z2) {
                            i.this.notifyAll();
                        }
                    }
                }
            }
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.s
        public t b() {
            return i.this.i;
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (i.this) {
                this.d = true;
                this.b.j();
                i.this.notifyAll();
            }
            i.this.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a {
        c() {
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a
        protected IOException b(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a
        protected void i() {
            i.this.b(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1.b.CANCEL);
        }

        public void k() throws IOException {
            if (h()) {
                throw b((IOException) null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(int i, g gVar, boolean z, boolean z2, List<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1.c> list) {
        if (gVar == null) {
            throw new NullPointerException("connection == null");
        }
        if (list == null) {
            throw new NullPointerException("requestHeaders == null");
        }
        this.c = i;
        this.d = gVar;
        this.b = gVar.n.c();
        b bVar = new b(gVar.m.c());
        this.g = bVar;
        a aVar = new a();
        this.h = aVar;
        bVar.e = z2;
        aVar.c = z;
    }

    private boolean d(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1.b bVar) {
        if (l || !Thread.holdsLock(this)) {
            synchronized (this) {
                if (this.k == null && (!this.g.e || !this.h.c)) {
                    this.k = bVar;
                    notifyAll();
                    this.d.d(this.c);
                    return true;
                }
                return false;
            }
        }
        throw new AssertionError();
    }

    void a() throws IOException {
        boolean z;
        boolean g;
        if (!l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            z = !this.g.e && this.g.d && (this.h.c || this.h.b);
            g = g();
        }
        if (z) {
            a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1.b.CANCEL);
        } else if (g) {
        } else {
            this.d.d(this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(long j) {
        this.b += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.e eVar, int i) throws IOException {
        if (!l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        this.g.a(eVar, i);
    }

    public void a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1.b bVar) throws IOException {
        if (d(bVar)) {
            this.d.b(this.c, bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(List<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1.c> list) {
        boolean z;
        if (!l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            z = true;
            this.f = true;
            if (this.e == null) {
                this.e = list;
                z = g();
                notifyAll();
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.e);
                arrayList.add(null);
                arrayList.addAll(list);
                this.e = arrayList;
            }
        }
        if (z) {
            return;
        }
        this.d.d(this.c);
    }

    void b() throws IOException {
        a aVar = this.h;
        if (aVar.b) {
            throw new IOException("stream closed");
        }
        if (aVar.c) {
            throw new IOException("stream finished");
        }
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1.b bVar = this.k;
        if (bVar != null) {
            throw new o(bVar);
        }
    }

    public void b(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1.b bVar) {
        if (d(bVar)) {
            this.d.c(this.c, bVar);
        }
    }

    public int c() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1.b bVar) {
        synchronized (this) {
            if (this.k == null) {
                this.k = bVar;
                notifyAll();
            }
        }
    }

    public r d() {
        synchronized (this) {
            if (!this.f && !f()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.h;
    }

    public s e() {
        return this.g;
    }

    public boolean f() {
        return this.d.a == ((this.c & 1) == 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001c, code lost:
        if (r2.f == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean g() {
        /*
            r2 = this;
            monitor-enter(r2)
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1.b r0 = r2.k     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L6
            goto L20
        L6:
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1.i$b r0 = r2.g     // Catch: java.lang.Throwable -> L23
            boolean r1 = r0.e     // Catch: java.lang.Throwable -> L23
            if (r1 != 0) goto L10
            boolean r0 = r0.d     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L1e
        L10:
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1.i$a r0 = r2.h     // Catch: java.lang.Throwable -> L23
            boolean r1 = r0.c     // Catch: java.lang.Throwable -> L23
            if (r1 != 0) goto L1a
            boolean r0 = r0.b     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L1e
        L1a:
            boolean r0 = r2.f     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L20
        L1e:
            r0 = 1
            goto L21
        L20:
            r0 = 0
        L21:
            monitor-exit(r2)
            return r0
        L23:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1.i.g():boolean");
    }

    public t h() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        boolean g;
        if (!l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            this.g.e = true;
            g = g();
            notifyAll();
        }
        if (g) {
            return;
        }
        this.d.d(this.c);
    }

    public List<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1.c> j() throws IOException {
        List<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1.c> list;
        synchronized (this) {
            if (!f()) {
                throw new IllegalStateException("servers cannot read response headers");
            }
            this.i.g();
            while (this.e == null && this.k == null) {
                k();
            }
            this.i.k();
            list = this.e;
            if (list == null) {
                throw new o(this.k);
            }
            this.e = null;
        }
        return list;
    }

    void k() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException e) {
            throw new InterruptedIOException();
        }
    }

    public t l() {
        return this.j;
    }
}
