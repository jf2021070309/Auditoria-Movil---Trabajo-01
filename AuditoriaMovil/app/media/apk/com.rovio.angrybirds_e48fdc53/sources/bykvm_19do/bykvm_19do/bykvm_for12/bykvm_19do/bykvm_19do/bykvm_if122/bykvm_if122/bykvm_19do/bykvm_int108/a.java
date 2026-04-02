package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_int108;

import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.i;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.l;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.r;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.s;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.t;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.a0;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.b0;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_for12.h;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_for12.k;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.r;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.v;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.y;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class a implements bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_for12.c {
    final v a;
    final bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_if122.g b;
    final bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.e c;
    final bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.d d;
    int e = 0;
    private long f = 262144;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public abstract class b implements s {
        protected final i a;
        protected boolean b;
        protected long c;

        private b() {
            this.a = new i(a.this.c.b());
            this.c = 0L;
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.s
        public long a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c cVar, long j) throws IOException {
            try {
                long a = a.this.c.a(cVar, j);
                if (a > 0) {
                    this.c += a;
                }
                return a;
            } catch (IOException e) {
                a(false, e);
                throw e;
            }
        }

        protected final void a(boolean z, IOException iOException) throws IOException {
            a aVar = a.this;
            int i = aVar.e;
            if (i == 6) {
                return;
            }
            if (i != 5) {
                throw new IllegalStateException("state: " + a.this.e);
            }
            aVar.a(this.a);
            a aVar2 = a.this;
            aVar2.e = 6;
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_if122.g gVar = aVar2.b;
            if (gVar != null) {
                gVar.a(!z, aVar2, this.c, iOException);
            }
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.s
        public t b() {
            return this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class c implements r {
        private final i a;
        private boolean b;

        c() {
            this.a = new i(a.this.d.b());
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.r
        public t b() {
            return this.a;
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.r
        public void b(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c cVar, long j) throws IOException {
            if (this.b) {
                throw new IllegalStateException("closed");
            }
            if (j == 0) {
                return;
            }
            a.this.d.e(j);
            a.this.d.a("\r\n");
            a.this.d.b(cVar, j);
            a.this.d.a("\r\n");
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (this) {
                if (!this.b) {
                    this.b = true;
                    a.this.d.a("0\r\n\r\n");
                    a.this.a(this.a);
                    a.this.e = 3;
                }
            }
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.r, java.io.Flushable
        public void flush() throws IOException {
            synchronized (this) {
                if (!this.b) {
                    a.this.d.flush();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d extends b {
        private final bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.s e;
        private long f;
        private boolean g;

        d(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.s sVar) {
            super();
            this.f = -1L;
            this.g = true;
            this.e = sVar;
        }

        private void h() throws IOException {
            if (this.f != -1) {
                a.this.c.d();
            }
            try {
                this.f = a.this.c.g();
                String trim = a.this.c.d().trim();
                if (this.f < 0 || !(trim.isEmpty() || trim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f + trim + "\"");
                } else if (this.f == 0) {
                    this.g = false;
                    bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_for12.e.a(a.this.a.f(), this.e, a.this.e());
                    a(true, (IOException) null);
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_int108.a.b, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.s
        public long a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c cVar, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.b) {
                throw new IllegalStateException("closed");
            } else {
                if (this.g) {
                    long j2 = this.f;
                    if (j2 == 0 || j2 == -1) {
                        h();
                        if (!this.g) {
                            return -1L;
                        }
                    }
                    long a = super.a(cVar, Math.min(j, this.f));
                    if (a != -1) {
                        this.f -= a;
                        return a;
                    }
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    a(false, (IOException) protocolException);
                    throw protocolException;
                }
                return -1L;
            }
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.b) {
                return;
            }
            if (this.g && !bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a(this, 100, TimeUnit.MILLISECONDS)) {
                a(false, (IOException) null);
            }
            this.b = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class e implements r {
        private final i a;
        private boolean b;
        private long c;

        e(long j) {
            this.a = new i(a.this.d.b());
            this.c = j;
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.r
        public t b() {
            return this.a;
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.r
        public void b(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c cVar, long j) throws IOException {
            if (this.b) {
                throw new IllegalStateException("closed");
            }
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a(cVar.o(), 0L, j);
            if (j <= this.c) {
                a.this.d.b(cVar, j);
                this.c -= j;
                return;
            }
            throw new ProtocolException("expected " + this.c + " bytes but received " + j);
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.b) {
                return;
            }
            this.b = true;
            if (this.c > 0) {
                throw new ProtocolException("unexpected end of stream");
            }
            a.this.a(this.a);
            a.this.e = 3;
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.r, java.io.Flushable
        public void flush() throws IOException {
            if (this.b) {
                return;
            }
            a.this.d.flush();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class f extends b {
        private long e;

        f(a aVar, long j) throws IOException {
            super();
            this.e = j;
            if (j == 0) {
                a(true, (IOException) null);
            }
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_int108.a.b, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.s
        public long a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c cVar, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.b) {
                throw new IllegalStateException("closed");
            } else {
                long j2 = this.e;
                if (j2 == 0) {
                    return -1L;
                }
                long a = super.a(cVar, Math.min(j2, j));
                if (a == -1) {
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    a(false, (IOException) protocolException);
                    throw protocolException;
                }
                long j3 = this.e - a;
                this.e = j3;
                if (j3 == 0) {
                    a(true, (IOException) null);
                }
                return a;
            }
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.b) {
                return;
            }
            if (this.e != 0 && !bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a(this, 100, TimeUnit.MILLISECONDS)) {
                a(false, (IOException) null);
            }
            this.b = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class g extends b {
        private boolean e;

        g(a aVar) {
            super();
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_int108.a.b, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.s
        public long a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c cVar, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.b) {
                throw new IllegalStateException("closed");
            } else {
                if (this.e) {
                    return -1L;
                }
                long a = super.a(cVar, j);
                if (a == -1) {
                    this.e = true;
                    a(true, (IOException) null);
                    return -1L;
                }
                return a;
            }
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.b) {
                return;
            }
            if (!this.e) {
                a(false, (IOException) null);
            }
            this.b = true;
        }
    }

    public a(v vVar, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_if122.g gVar, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.e eVar, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.d dVar) {
        this.a = vVar;
        this.b = gVar;
        this.c = eVar;
        this.d = dVar;
    }

    private String f() throws IOException {
        String b2 = this.c.b(this.f);
        this.f -= b2.length();
        return b2;
    }

    public r a(long j) {
        if (this.e == 1) {
            this.e = 2;
            return new e(j);
        }
        throw new IllegalStateException("state: " + this.e);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_for12.c
    public r a(y yVar, long j) {
        if (DownloadUtils.VALUE_CHUNKED.equalsIgnoreCase(yVar.a(DownloadUtils.TRANSFER_ENCODING))) {
            return c();
        }
        if (j != -1) {
            return a(j);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    public s a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.s sVar) throws IOException {
        if (this.e == 4) {
            this.e = 5;
            return new d(sVar);
        }
        throw new IllegalStateException("state: " + this.e);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_for12.c
    public a0.a a(boolean z) throws IOException {
        int i = this.e;
        if (i != 1 && i != 3) {
            throw new IllegalStateException("state: " + this.e);
        }
        try {
            k a = k.a(f());
            a0.a a2 = new a0.a().a(a.a).a(a.b).a(a.c).a(e());
            if (z && a.b == 100) {
                return null;
            }
            this.e = 4;
            return a2;
        } catch (EOFException e2) {
            IOException iOException = new IOException("unexpected end of stream on " + this.b);
            iOException.initCause(e2);
            throw iOException;
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_for12.c
    public b0 a(a0 a0Var) throws IOException {
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_if122.g gVar = this.b;
        gVar.f.e(gVar.e);
        String b2 = a0Var.b(DownloadUtils.CONTENT_TYPE);
        if (bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_for12.e.b(a0Var)) {
            if (DownloadUtils.VALUE_CHUNKED.equalsIgnoreCase(a0Var.b(DownloadUtils.TRANSFER_ENCODING))) {
                return new h(b2, -1L, l.a(a(a0Var.s().g())));
            }
            long a = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_for12.e.a(a0Var);
            return a != -1 ? new h(b2, a, l.a(b(a))) : new h(b2, -1L, l.a(d()));
        }
        return new h(b2, 0L, l.a(b(0L)));
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_for12.c
    public void a() throws IOException {
        this.d.flush();
    }

    void a(i iVar) {
        t g2 = iVar.g();
        iVar.a(t.d);
        g2.a();
        g2.b();
    }

    public void a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.r rVar, String str) throws IOException {
        if (this.e != 0) {
            throw new IllegalStateException("state: " + this.e);
        }
        this.d.a(str).a("\r\n");
        int b2 = rVar.b();
        for (int i = 0; i < b2; i++) {
            this.d.a(rVar.a(i)).a(": ").a(rVar.b(i)).a("\r\n");
        }
        this.d.a("\r\n");
        this.e = 1;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_for12.c
    public void a(y yVar) throws IOException {
        a(yVar.c(), bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_for12.i.a(yVar, this.b.b().a().b().type()));
    }

    public s b(long j) throws IOException {
        if (this.e == 4) {
            this.e = 5;
            return new f(this, j);
        }
        throw new IllegalStateException("state: " + this.e);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_for12.c
    public void b() throws IOException {
        this.d.flush();
    }

    public r c() {
        if (this.e == 1) {
            this.e = 2;
            return new c();
        }
        throw new IllegalStateException("state: " + this.e);
    }

    public s d() throws IOException {
        if (this.e != 4) {
            throw new IllegalStateException("state: " + this.e);
        }
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_if122.g gVar = this.b;
        if (gVar != null) {
            this.e = 5;
            gVar.d();
            return new g(this);
        }
        throw new IllegalStateException("streamAllocation == null");
    }

    public bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.r e() throws IOException {
        r.a aVar = new r.a();
        while (true) {
            String f2 = f();
            if (f2.length() == 0) {
                return aVar.a();
            }
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.a.a.a(aVar, f2);
        }
    }
}
