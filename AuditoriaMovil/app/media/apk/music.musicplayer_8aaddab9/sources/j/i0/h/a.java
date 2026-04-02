package j.i0.h;

import h.o.c.j;
import j.d0;
import j.f0;
import j.i0.g.i;
import j.r;
import j.s;
import j.w;
import j.z;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import k.k;
import k.v;
import k.x;
import k.y;
/* loaded from: classes2.dex */
public final class a implements j.i0.g.c {
    public final w a;

    /* renamed from: b  reason: collision with root package name */
    public final j.i0.f.g f9344b;

    /* renamed from: c  reason: collision with root package name */
    public final k.g f9345c;

    /* renamed from: d  reason: collision with root package name */
    public final k.f f9346d;

    /* renamed from: e  reason: collision with root package name */
    public int f9347e = 0;

    /* renamed from: f  reason: collision with root package name */
    public long f9348f = 262144;

    /* loaded from: classes2.dex */
    public abstract class b implements x {
        public final k a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f9349b;

        /* renamed from: c  reason: collision with root package name */
        public long f9350c = 0;

        public b(C0208a c0208a) {
            this.a = new k(a.this.f9345c.c());
        }

        @Override // k.x
        public long S(k.d dVar, long j2) throws IOException {
            try {
                long S = a.this.f9345c.S(dVar, j2);
                if (S > 0) {
                    this.f9350c += S;
                }
                return S;
            } catch (IOException e2) {
                a(false, e2);
                throw e2;
            }
        }

        public final void a(boolean z, IOException iOException) throws IOException {
            a aVar = a.this;
            int i2 = aVar.f9347e;
            if (i2 == 6) {
                return;
            }
            if (i2 != 5) {
                StringBuilder y = e.a.d.a.a.y("state: ");
                y.append(a.this.f9347e);
                throw new IllegalStateException(y.toString());
            }
            aVar.g(this.a);
            a aVar2 = a.this;
            aVar2.f9347e = 6;
            j.i0.f.g gVar = aVar2.f9344b;
            if (gVar != null) {
                gVar.i(!z, aVar2, this.f9350c, iOException);
            }
        }

        @Override // k.x
        public y c() {
            return this.a;
        }
    }

    /* loaded from: classes2.dex */
    public final class c implements v {
        public final k a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f9352b;

        public c() {
            this.a = new k(a.this.f9346d.c());
        }

        @Override // k.v
        public void E(k.d dVar, long j2) throws IOException {
            if (this.f9352b) {
                throw new IllegalStateException("closed");
            }
            if (j2 == 0) {
                return;
            }
            a.this.f9346d.F(j2);
            a.this.f9346d.x("\r\n");
            a.this.f9346d.E(dVar, j2);
            a.this.f9346d.x("\r\n");
        }

        @Override // k.v
        public y c() {
            return this.a;
        }

        @Override // k.v, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() throws IOException {
            if (this.f9352b) {
                return;
            }
            this.f9352b = true;
            a.this.f9346d.x("0\r\n\r\n");
            a.this.g(this.a);
            a.this.f9347e = 3;
        }

        @Override // k.v, java.io.Flushable
        public synchronized void flush() throws IOException {
            if (this.f9352b) {
                return;
            }
            a.this.f9346d.flush();
        }
    }

    /* loaded from: classes2.dex */
    public class d extends b {

        /* renamed from: e  reason: collision with root package name */
        public final s f9354e;

        /* renamed from: f  reason: collision with root package name */
        public long f9355f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f9356g;

        public d(s sVar) {
            super(null);
            this.f9355f = -1L;
            this.f9356g = true;
            this.f9354e = sVar;
        }

        @Override // j.i0.h.a.b, k.x
        public long S(k.d dVar, long j2) throws IOException {
            if (j2 >= 0) {
                if (this.f9349b) {
                    throw new IllegalStateException("closed");
                }
                if (this.f9356g) {
                    long j3 = this.f9355f;
                    if (j3 == 0 || j3 == -1) {
                        if (j3 != -1) {
                            a.this.f9345c.J();
                        }
                        try {
                            this.f9355f = a.this.f9345c.b0();
                            String trim = a.this.f9345c.J().trim();
                            if (this.f9355f < 0 || !(trim.isEmpty() || trim.startsWith(";"))) {
                                throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f9355f + trim + "\"");
                            }
                            if (this.f9355f == 0) {
                                this.f9356g = false;
                                a aVar = a.this;
                                j.i0.g.e.d(aVar.a.f9575j, this.f9354e, aVar.j());
                                a(true, null);
                            }
                            if (!this.f9356g) {
                                return -1L;
                            }
                        } catch (NumberFormatException e2) {
                            throw new ProtocolException(e2.getMessage());
                        }
                    }
                    long S = super.S(dVar, Math.min(j2, this.f9355f));
                    if (S != -1) {
                        this.f9355f -= S;
                        return S;
                    }
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    a(false, protocolException);
                    throw protocolException;
                }
                return -1L;
            }
            throw new IllegalArgumentException(e.a.d.a.a.h("byteCount < 0: ", j2));
        }

        @Override // k.x, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f9349b) {
                return;
            }
            if (this.f9356g && !j.i0.c.k(this, 100, TimeUnit.MILLISECONDS)) {
                a(false, null);
            }
            this.f9349b = true;
        }
    }

    /* loaded from: classes2.dex */
    public final class e implements v {
        public final k a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f9358b;

        /* renamed from: c  reason: collision with root package name */
        public long f9359c;

        public e(long j2) {
            this.a = new k(a.this.f9346d.c());
            this.f9359c = j2;
        }

        @Override // k.v
        public void E(k.d dVar, long j2) throws IOException {
            if (this.f9358b) {
                throw new IllegalStateException("closed");
            }
            j.i0.c.d(dVar.f9620b, 0L, j2);
            if (j2 <= this.f9359c) {
                a.this.f9346d.E(dVar, j2);
                this.f9359c -= j2;
                return;
            }
            StringBuilder y = e.a.d.a.a.y("expected ");
            y.append(this.f9359c);
            y.append(" bytes but received ");
            y.append(j2);
            throw new ProtocolException(y.toString());
        }

        @Override // k.v
        public y c() {
            return this.a;
        }

        @Override // k.v, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f9358b) {
                return;
            }
            this.f9358b = true;
            if (this.f9359c > 0) {
                throw new ProtocolException("unexpected end of stream");
            }
            a.this.g(this.a);
            a.this.f9347e = 3;
        }

        @Override // k.v, java.io.Flushable
        public void flush() throws IOException {
            if (this.f9358b) {
                return;
            }
            a.this.f9346d.flush();
        }
    }

    /* loaded from: classes2.dex */
    public class f extends b {

        /* renamed from: e  reason: collision with root package name */
        public long f9361e;

        public f(a aVar, long j2) throws IOException {
            super(null);
            this.f9361e = j2;
            if (j2 == 0) {
                a(true, null);
            }
        }

        @Override // j.i0.h.a.b, k.x
        public long S(k.d dVar, long j2) throws IOException {
            if (j2 >= 0) {
                if (this.f9349b) {
                    throw new IllegalStateException("closed");
                }
                long j3 = this.f9361e;
                if (j3 == 0) {
                    return -1L;
                }
                long S = super.S(dVar, Math.min(j3, j2));
                if (S == -1) {
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    a(false, protocolException);
                    throw protocolException;
                }
                long j4 = this.f9361e - S;
                this.f9361e = j4;
                if (j4 == 0) {
                    a(true, null);
                }
                return S;
            }
            throw new IllegalArgumentException(e.a.d.a.a.h("byteCount < 0: ", j2));
        }

        @Override // k.x, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f9349b) {
                return;
            }
            if (this.f9361e != 0 && !j.i0.c.k(this, 100, TimeUnit.MILLISECONDS)) {
                a(false, null);
            }
            this.f9349b = true;
        }
    }

    /* loaded from: classes2.dex */
    public class g extends b {

        /* renamed from: e  reason: collision with root package name */
        public boolean f9362e;

        public g(a aVar) {
            super(null);
        }

        @Override // j.i0.h.a.b, k.x
        public long S(k.d dVar, long j2) throws IOException {
            if (j2 >= 0) {
                if (this.f9349b) {
                    throw new IllegalStateException("closed");
                }
                if (this.f9362e) {
                    return -1L;
                }
                long S = super.S(dVar, j2);
                if (S == -1) {
                    this.f9362e = true;
                    a(true, null);
                    return -1L;
                }
                return S;
            }
            throw new IllegalArgumentException(e.a.d.a.a.h("byteCount < 0: ", j2));
        }

        @Override // k.x, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f9349b) {
                return;
            }
            if (!this.f9362e) {
                a(false, null);
            }
            this.f9349b = true;
        }
    }

    public a(w wVar, j.i0.f.g gVar, k.g gVar2, k.f fVar) {
        this.a = wVar;
        this.f9344b = gVar;
        this.f9345c = gVar2;
        this.f9346d = fVar;
    }

    @Override // j.i0.g.c
    public void a() throws IOException {
        this.f9346d.flush();
    }

    @Override // j.i0.g.c
    public void b(z zVar) throws IOException {
        Proxy.Type type = this.f9344b.b().f9288c.f9250b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(zVar.f9602b);
        sb.append(' ');
        if (!zVar.a.f9536b.equals("https") && type == Proxy.Type.HTTP) {
            sb.append(zVar.a);
        } else {
            sb.append(e.j.d.w.j0(zVar.a));
        }
        sb.append(" HTTP/1.1");
        k(zVar.f9603c, sb.toString());
    }

    @Override // j.i0.g.c
    public f0 c(d0 d0Var) throws IOException {
        Objects.requireNonNull(this.f9344b.f9313f);
        String c2 = d0Var.f9211f.c("Content-Type");
        if (c2 == null) {
            c2 = null;
        }
        if (j.i0.g.e.b(d0Var)) {
            String c3 = d0Var.f9211f.c("Transfer-Encoding");
            if ("chunked".equalsIgnoreCase(c3 != null ? c3 : null)) {
                s sVar = d0Var.a.a;
                if (this.f9347e == 4) {
                    this.f9347e = 5;
                    return new j.i0.g.g(c2, -1L, e.j.d.w.l(new d(sVar)));
                }
                StringBuilder y = e.a.d.a.a.y("state: ");
                y.append(this.f9347e);
                throw new IllegalStateException(y.toString());
            }
            long a = j.i0.g.e.a(d0Var);
            if (a != -1) {
                return new j.i0.g.g(c2, a, e.j.d.w.l(h(a)));
            }
            if (this.f9347e != 4) {
                StringBuilder y2 = e.a.d.a.a.y("state: ");
                y2.append(this.f9347e);
                throw new IllegalStateException(y2.toString());
            }
            j.i0.f.g gVar = this.f9344b;
            if (gVar != null) {
                this.f9347e = 5;
                gVar.f();
                return new j.i0.g.g(c2, -1L, e.j.d.w.l(new g(this)));
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        return new j.i0.g.g(c2, 0L, e.j.d.w.l(h(0L)));
    }

    @Override // j.i0.g.c
    public void cancel() {
        j.i0.f.c b2 = this.f9344b.b();
        if (b2 != null) {
            j.i0.c.f(b2.f9289d);
        }
    }

    @Override // j.i0.g.c
    public d0.a d(boolean z) throws IOException {
        int i2 = this.f9347e;
        if (i2 != 1 && i2 != 3) {
            StringBuilder y = e.a.d.a.a.y("state: ");
            y.append(this.f9347e);
            throw new IllegalStateException(y.toString());
        }
        try {
            i a = i.a(i());
            d0.a aVar = new d0.a();
            aVar.f9218b = a.a;
            aVar.f9219c = a.f9342b;
            aVar.f9220d = a.f9343c;
            aVar.d(j());
            if (z && a.f9342b == 100) {
                return null;
            }
            if (a.f9342b == 100) {
                this.f9347e = 3;
                return aVar;
            }
            this.f9347e = 4;
            return aVar;
        } catch (EOFException e2) {
            StringBuilder y2 = e.a.d.a.a.y("unexpected end of stream on ");
            y2.append(this.f9344b);
            IOException iOException = new IOException(y2.toString());
            iOException.initCause(e2);
            throw iOException;
        }
    }

    @Override // j.i0.g.c
    public void e() throws IOException {
        this.f9346d.flush();
    }

    @Override // j.i0.g.c
    public v f(z zVar, long j2) {
        if ("chunked".equalsIgnoreCase(zVar.f9603c.c("Transfer-Encoding"))) {
            if (this.f9347e == 1) {
                this.f9347e = 2;
                return new c();
            }
            StringBuilder y = e.a.d.a.a.y("state: ");
            y.append(this.f9347e);
            throw new IllegalStateException(y.toString());
        } else if (j2 != -1) {
            if (this.f9347e == 1) {
                this.f9347e = 2;
                return new e(j2);
            }
            StringBuilder y2 = e.a.d.a.a.y("state: ");
            y2.append(this.f9347e);
            throw new IllegalStateException(y2.toString());
        } else {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    public void g(k kVar) {
        y yVar = kVar.f9625e;
        y yVar2 = y.a;
        j.e(yVar2, "delegate");
        kVar.f9625e = yVar2;
        yVar.a();
        yVar.b();
    }

    public x h(long j2) throws IOException {
        if (this.f9347e == 4) {
            this.f9347e = 5;
            return new f(this, j2);
        }
        StringBuilder y = e.a.d.a.a.y("state: ");
        y.append(this.f9347e);
        throw new IllegalStateException(y.toString());
    }

    public final String i() throws IOException {
        String w = this.f9345c.w(this.f9348f);
        this.f9348f -= w.length();
        return w;
    }

    public r j() throws IOException {
        r.a aVar = new r.a();
        while (true) {
            String i2 = i();
            if (i2.length() == 0) {
                return new r(aVar);
            }
            Objects.requireNonNull((w.a) j.i0.a.a);
            int indexOf = i2.indexOf(":", 1);
            if (indexOf != -1) {
                aVar.b(i2.substring(0, indexOf), i2.substring(indexOf + 1));
            } else if (i2.startsWith(":")) {
                String substring = i2.substring(1);
                aVar.a.add("");
                aVar.a.add(substring.trim());
            } else {
                aVar.a.add("");
                aVar.a.add(i2.trim());
            }
        }
    }

    public void k(r rVar, String str) throws IOException {
        if (this.f9347e != 0) {
            StringBuilder y = e.a.d.a.a.y("state: ");
            y.append(this.f9347e);
            throw new IllegalStateException(y.toString());
        }
        this.f9346d.x(str).x("\r\n");
        int g2 = rVar.g();
        for (int i2 = 0; i2 < g2; i2++) {
            this.f9346d.x(rVar.d(i2)).x(": ").x(rVar.h(i2)).x("\r\n");
        }
        this.f9346d.x("\r\n");
        this.f9347e = 1;
    }
}
