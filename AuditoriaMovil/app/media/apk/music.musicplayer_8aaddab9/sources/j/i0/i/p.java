package j.i0.i;

import j.i0.i.d;
import j.i0.i.g;
import j.i0.i.q;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import k.x;
import k.y;
/* loaded from: classes2.dex */
public final class p implements Closeable {
    public static final Logger a = Logger.getLogger(e.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public final k.g f9451b;

    /* renamed from: c  reason: collision with root package name */
    public final a f9452c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f9453d;

    /* renamed from: e  reason: collision with root package name */
    public final d.a f9454e;

    /* loaded from: classes2.dex */
    public static final class a implements x {
        public final k.g a;

        /* renamed from: b  reason: collision with root package name */
        public int f9455b;

        /* renamed from: c  reason: collision with root package name */
        public byte f9456c;

        /* renamed from: d  reason: collision with root package name */
        public int f9457d;

        /* renamed from: e  reason: collision with root package name */
        public int f9458e;

        /* renamed from: f  reason: collision with root package name */
        public short f9459f;

        public a(k.g gVar) {
            this.a = gVar;
        }

        @Override // k.x
        public long S(k.d dVar, long j2) throws IOException {
            int i2;
            int readInt;
            do {
                int i3 = this.f9458e;
                if (i3 != 0) {
                    long S = this.a.S(dVar, Math.min(j2, i3));
                    if (S == -1) {
                        return -1L;
                    }
                    this.f9458e = (int) (this.f9458e - S);
                    return S;
                }
                this.a.skip(this.f9459f);
                this.f9459f = (short) 0;
                if ((this.f9456c & 4) != 0) {
                    return -1L;
                }
                i2 = this.f9457d;
                int r = p.r(this.a);
                this.f9458e = r;
                this.f9455b = r;
                byte readByte = (byte) (this.a.readByte() & 255);
                this.f9456c = (byte) (this.a.readByte() & 255);
                Logger logger = p.a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(e.a(true, this.f9457d, this.f9455b, readByte, this.f9456c));
                }
                readInt = this.a.readInt() & Integer.MAX_VALUE;
                this.f9457d = readInt;
                if (readByte != 9) {
                    e.c("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
                    throw null;
                }
            } while (readInt == i2);
            e.c("TYPE_CONTINUATION streamId changed", new Object[0]);
            throw null;
        }

        @Override // k.x
        public y c() {
            return this.a.c();
        }

        @Override // k.x, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
    }

    public p(k.g gVar, boolean z) {
        this.f9451b = gVar;
        this.f9453d = z;
        a aVar = new a(gVar);
        this.f9452c = aVar;
        this.f9454e = new d.a(4096, aVar);
    }

    public static int a(int i2, byte b2, short s) throws IOException {
        if ((b2 & 8) != 0) {
            i2--;
        }
        if (s <= i2) {
            return (short) (i2 - s);
        }
        e.c("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i2));
        throw null;
    }

    public static int r(k.g gVar) throws IOException {
        return (gVar.readByte() & 255) | ((gVar.readByte() & 255) << 16) | ((gVar.readByte() & 255) << 8);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f9451b.close();
    }

    public boolean f(boolean z, b bVar) throws IOException {
        boolean z2;
        boolean z3;
        long j2;
        boolean h2;
        try {
            this.f9451b.Y(9L);
            int r = r(this.f9451b);
            if (r < 0 || r > 16384) {
                e.c("FRAME_SIZE_ERROR: %s", Integer.valueOf(r));
                throw null;
            }
            byte readByte = (byte) (this.f9451b.readByte() & 255);
            if (z && readByte != 4) {
                e.c("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte));
                throw null;
            }
            byte readByte2 = (byte) (this.f9451b.readByte() & 255);
            int readInt = this.f9451b.readInt() & Integer.MAX_VALUE;
            Logger logger = a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(e.a(true, readInt, r, readByte, readByte2));
            }
            try {
                switch (readByte) {
                    case 0:
                        if (readInt == 0) {
                            e.c("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
                            throw null;
                        }
                        boolean z4 = (readByte2 & 1) != 0;
                        if ((readByte2 & 32) != 0) {
                            e.c("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                            throw null;
                        }
                        short readByte3 = (readByte2 & 8) != 0 ? (short) (this.f9451b.readByte() & 255) : (short) 0;
                        int a2 = a(r, readByte2, readByte3);
                        k.g gVar = this.f9451b;
                        g.C0209g c0209g = (g.C0209g) bVar;
                        if (g.this.r(readInt)) {
                            g gVar2 = g.this;
                            Objects.requireNonNull(gVar2);
                            k.d dVar = new k.d();
                            long j3 = a2;
                            gVar.Y(j3);
                            gVar.S(dVar, j3);
                            if (dVar.f9620b != j3) {
                                throw new IOException(dVar.f9620b + " != " + a2);
                            }
                            gVar2.m(new k(gVar2, "OkHttp %s Push Data[%s]", new Object[]{gVar2.f9401e, Integer.valueOf(readInt)}, readInt, dVar, a2, z4));
                        } else {
                            q h3 = g.this.h(readInt);
                            if (h3 == null) {
                                g.this.H(readInt, j.i0.i.b.PROTOCOL_ERROR);
                                long j4 = a2;
                                g.this.y(j4);
                                gVar.skip(j4);
                            } else {
                                q.b bVar2 = h3.f9465g;
                                long j5 = a2;
                                Objects.requireNonNull(bVar2);
                                while (true) {
                                    if (j5 > 0) {
                                        synchronized (q.this) {
                                            z2 = bVar2.f9476e;
                                            z3 = bVar2.f9473b.f9620b + j5 > bVar2.f9474c;
                                        }
                                        if (z3) {
                                            gVar.skip(j5);
                                            q.this.e(j.i0.i.b.FLOW_CONTROL_ERROR);
                                        } else if (z2) {
                                            gVar.skip(j5);
                                        } else {
                                            long S = gVar.S(bVar2.a, j5);
                                            if (S == -1) {
                                                throw new EOFException();
                                            }
                                            j5 -= S;
                                            synchronized (q.this) {
                                                if (bVar2.f9475d) {
                                                    k.d dVar2 = bVar2.a;
                                                    j2 = dVar2.f9620b;
                                                    dVar2.skip(j2);
                                                } else {
                                                    k.d dVar3 = bVar2.f9473b;
                                                    boolean z5 = dVar3.f9620b == 0;
                                                    dVar3.g0(bVar2.a);
                                                    if (z5) {
                                                        q.this.notifyAll();
                                                    }
                                                    j2 = 0;
                                                }
                                            }
                                            if (j2 > 0) {
                                                bVar2.a(j2);
                                            }
                                        }
                                    }
                                }
                                if (z4) {
                                    h3.i();
                                }
                            }
                        }
                        this.f9451b.skip(readByte3);
                        break;
                    case 1:
                        if (readInt == 0) {
                            e.c("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                            throw null;
                        }
                        boolean z6 = (readByte2 & 1) != 0;
                        short readByte4 = (readByte2 & 8) != 0 ? (short) (this.f9451b.readByte() & 255) : (short) 0;
                        if ((readByte2 & 32) != 0) {
                            this.f9451b.readInt();
                            this.f9451b.readByte();
                            Objects.requireNonNull((g.C0209g) bVar);
                            r -= 5;
                        }
                        List<c> m2 = m(a(r, readByte2, readByte4), readByte4, readByte2, readInt);
                        g.C0209g c0209g2 = (g.C0209g) bVar;
                        if (g.this.r(readInt)) {
                            g gVar3 = g.this;
                            Objects.requireNonNull(gVar3);
                            gVar3.m(new j(gVar3, "OkHttp %s Push Headers[%s]", new Object[]{gVar3.f9401e, Integer.valueOf(readInt)}, readInt, m2, z6));
                            break;
                        } else {
                            synchronized (g.this) {
                                q h4 = g.this.h(readInt);
                                if (h4 == null) {
                                    g gVar4 = g.this;
                                    if (!gVar4.f9404h) {
                                        if (readInt > gVar4.f9402f) {
                                            if (readInt % 2 != gVar4.f9403g % 2) {
                                                q qVar = new q(readInt, g.this, false, z6, j.i0.c.x(m2));
                                                g gVar5 = g.this;
                                                gVar5.f9402f = readInt;
                                                gVar5.f9400d.put(Integer.valueOf(readInt), qVar);
                                                g.a.execute(new m(c0209g2, "OkHttp %s stream %d", new Object[]{g.this.f9401e, Integer.valueOf(readInt)}, qVar));
                                            }
                                        }
                                    }
                                } else {
                                    synchronized (h4) {
                                        h4.f9464f = true;
                                        h4.f9463e.add(j.i0.c.x(m2));
                                        h2 = h4.h();
                                        h4.notifyAll();
                                    }
                                    if (!h2) {
                                        h4.f9462d.u(h4.f9461c);
                                    }
                                    if (z6) {
                                        h4.i();
                                    }
                                }
                            }
                            break;
                        }
                    case 2:
                        if (r == 5) {
                            if (readInt != 0) {
                                this.f9451b.readInt();
                                this.f9451b.readByte();
                                Objects.requireNonNull((g.C0209g) bVar);
                                break;
                            } else {
                                e.c("TYPE_PRIORITY streamId == 0", new Object[0]);
                                throw null;
                            }
                        } else {
                            e.c("TYPE_PRIORITY length: %d != 5", Integer.valueOf(r));
                            throw null;
                        }
                    case 3:
                        y(bVar, r, readInt);
                        break;
                    case 4:
                        if (readInt == 0) {
                            if ((readByte2 & 1) == 0) {
                                if (r % 6 == 0) {
                                    u uVar = new u();
                                    for (int i2 = 0; i2 < r; i2 += 6) {
                                        int readShort = this.f9451b.readShort() & 65535;
                                        int readInt2 = this.f9451b.readInt();
                                        if (readShort != 2) {
                                            if (readShort == 3) {
                                                readShort = 4;
                                            } else if (readShort == 4) {
                                                readShort = 7;
                                                if (readInt2 < 0) {
                                                    e.c("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                                    throw null;
                                                }
                                            } else if (readShort == 5 && (readInt2 < 16384 || readInt2 > 16777215)) {
                                                e.c("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt2));
                                                throw null;
                                            }
                                        } else if (readInt2 != 0 && readInt2 != 1) {
                                            e.c("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                            throw null;
                                        }
                                        uVar.b(readShort, readInt2);
                                    }
                                    g.C0209g c0209g3 = (g.C0209g) bVar;
                                    Objects.requireNonNull(c0209g3);
                                    g gVar6 = g.this;
                                    gVar6.f9405i.execute(new n(c0209g3, "OkHttp %s ACK Settings", new Object[]{gVar6.f9401e}, false, uVar));
                                    break;
                                } else {
                                    e.c("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(r));
                                    throw null;
                                }
                            } else {
                                if (r != 0) {
                                    e.c("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                                    throw null;
                                }
                                Objects.requireNonNull((g.C0209g) bVar);
                                break;
                            }
                        } else {
                            e.c("TYPE_SETTINGS streamId != 0", new Object[0]);
                            throw null;
                        }
                    case 5:
                        v(bVar, r, readByte2, readInt);
                        break;
                    case 6:
                        u(bVar, r, readByte2, readInt);
                        break;
                    case 7:
                        i(bVar, r, readInt);
                        break;
                    case 8:
                        z(bVar, r, readInt);
                        break;
                    default:
                        this.f9451b.skip(r);
                        break;
                }
            } catch (RejectedExecutionException unused) {
            }
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public void h(b bVar) throws IOException {
        if (this.f9453d) {
            if (f(true, bVar)) {
                return;
            }
            e.c("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
        k.g gVar = this.f9451b;
        k.h hVar = e.a;
        k.h g2 = gVar.g(hVar.i());
        Logger logger = a;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(j.i0.c.m("<< CONNECTION %s", g2.t()));
        }
        if (hVar.equals(g2)) {
            return;
        }
        e.c("Expected a connection header but was %s", g2.K());
        throw null;
    }

    public final void i(b bVar, int i2, int i3) throws IOException {
        q[] qVarArr;
        if (i2 < 8) {
            e.c("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i2));
            throw null;
        } else if (i3 != 0) {
            e.c("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        } else {
            int readInt = this.f9451b.readInt();
            int readInt2 = this.f9451b.readInt();
            int i4 = i2 - 8;
            if (j.i0.i.b.fromHttp2(readInt2) == null) {
                e.c("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
                throw null;
            }
            k.h hVar = k.h.f9621b;
            if (i4 > 0) {
                hVar = this.f9451b.g(i4);
            }
            g.C0209g c0209g = (g.C0209g) bVar;
            Objects.requireNonNull(c0209g);
            hVar.i();
            synchronized (g.this) {
                qVarArr = (q[]) g.this.f9400d.values().toArray(new q[g.this.f9400d.size()]);
                g.this.f9404h = true;
            }
            for (q qVar : qVarArr) {
                if (qVar.f9461c > readInt && qVar.g()) {
                    j.i0.i.b bVar2 = j.i0.i.b.REFUSED_STREAM;
                    synchronized (qVar) {
                        if (qVar.f9469k == null) {
                            qVar.f9469k = bVar2;
                            qVar.notifyAll();
                        }
                    }
                    g.this.u(qVar.f9461c);
                }
            }
        }
    }

    public final List<c> m(int i2, short s, byte b2, int i3) throws IOException {
        a aVar = this.f9452c;
        aVar.f9458e = i2;
        aVar.f9455b = i2;
        aVar.f9459f = s;
        aVar.f9456c = b2;
        aVar.f9457d = i3;
        d.a aVar2 = this.f9454e;
        while (!aVar2.f9372b.p()) {
            int readByte = aVar2.f9372b.readByte() & 255;
            if (readByte == 128) {
                throw new IOException("index == 0");
            }
            if ((readByte & 128) == 128) {
                int g2 = aVar2.g(readByte, 127) - 1;
                if (!(g2 >= 0 && g2 <= d.a.length + (-1))) {
                    int b3 = aVar2.b(g2 - d.a.length);
                    if (b3 >= 0) {
                        c[] cVarArr = aVar2.f9375e;
                        if (b3 < cVarArr.length) {
                            aVar2.a.add(cVarArr[b3]);
                        }
                    }
                    StringBuilder y = e.a.d.a.a.y("Header index too large ");
                    y.append(g2 + 1);
                    throw new IOException(y.toString());
                }
                aVar2.a.add(d.a[g2]);
            } else if (readByte == 64) {
                k.h f2 = aVar2.f();
                d.a(f2);
                aVar2.e(-1, new c(f2, aVar2.f()));
            } else if ((readByte & 64) == 64) {
                aVar2.e(-1, new c(aVar2.d(aVar2.g(readByte, 63) - 1), aVar2.f()));
            } else if ((readByte & 32) == 32) {
                int g3 = aVar2.g(readByte, 31);
                aVar2.f9374d = g3;
                if (g3 < 0 || g3 > aVar2.f9373c) {
                    StringBuilder y2 = e.a.d.a.a.y("Invalid dynamic table size update ");
                    y2.append(aVar2.f9374d);
                    throw new IOException(y2.toString());
                }
                int i4 = aVar2.f9378h;
                if (g3 < i4) {
                    if (g3 == 0) {
                        aVar2.a();
                    } else {
                        aVar2.c(i4 - g3);
                    }
                }
            } else if (readByte == 16 || readByte == 0) {
                k.h f3 = aVar2.f();
                d.a(f3);
                aVar2.a.add(new c(f3, aVar2.f()));
            } else {
                aVar2.a.add(new c(aVar2.d(aVar2.g(readByte, 15) - 1), aVar2.f()));
            }
        }
        d.a aVar3 = this.f9454e;
        Objects.requireNonNull(aVar3);
        ArrayList arrayList = new ArrayList(aVar3.a);
        aVar3.a.clear();
        return arrayList;
    }

    public final void u(b bVar, int i2, byte b2, int i3) throws IOException {
        if (i2 != 8) {
            e.c("TYPE_PING length != 8: %s", Integer.valueOf(i2));
            throw null;
        } else if (i3 != 0) {
            e.c("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        } else {
            int readInt = this.f9451b.readInt();
            int readInt2 = this.f9451b.readInt();
            boolean z = (b2 & 1) != 0;
            g.C0209g c0209g = (g.C0209g) bVar;
            Objects.requireNonNull(c0209g);
            if (!z) {
                try {
                    g gVar = g.this;
                    gVar.f9405i.execute(new g.f(true, readInt, readInt2));
                    return;
                } catch (RejectedExecutionException unused) {
                    return;
                }
            }
            synchronized (g.this) {
                try {
                    if (readInt == 1) {
                        g.this.f9409m++;
                    } else if (readInt == 2) {
                        g.this.o++;
                    } else if (readInt == 3) {
                        g gVar2 = g.this;
                        gVar2.p++;
                        gVar2.notifyAll();
                    }
                } finally {
                }
            }
        }
    }

    public final void v(b bVar, int i2, byte b2, int i3) throws IOException {
        if (i3 == 0) {
            e.c("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            throw null;
        }
        short readByte = (b2 & 8) != 0 ? (short) (this.f9451b.readByte() & 255) : (short) 0;
        int readInt = this.f9451b.readInt() & Integer.MAX_VALUE;
        List<c> m2 = m(a(i2 - 4, b2, readByte), readByte, b2, i3);
        g gVar = g.this;
        synchronized (gVar) {
            if (gVar.y.contains(Integer.valueOf(readInt))) {
                gVar.H(readInt, j.i0.i.b.PROTOCOL_ERROR);
                return;
            }
            gVar.y.add(Integer.valueOf(readInt));
            try {
                gVar.m(new i(gVar, "OkHttp %s Push Request[%s]", new Object[]{gVar.f9401e, Integer.valueOf(readInt)}, readInt, m2));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    public final void y(b bVar, int i2, int i3) throws IOException {
        if (i2 != 4) {
            e.c("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i2));
            throw null;
        } else if (i3 == 0) {
            e.c("TYPE_RST_STREAM streamId == 0", new Object[0]);
            throw null;
        } else {
            int readInt = this.f9451b.readInt();
            j.i0.i.b fromHttp2 = j.i0.i.b.fromHttp2(readInt);
            if (fromHttp2 == null) {
                e.c("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
                throw null;
            }
            g.C0209g c0209g = (g.C0209g) bVar;
            if (g.this.r(i3)) {
                g gVar = g.this;
                gVar.m(new l(gVar, "OkHttp %s Push Reset[%s]", new Object[]{gVar.f9401e, Integer.valueOf(i3)}, i3, fromHttp2));
                return;
            }
            q u = g.this.u(i3);
            if (u != null) {
                synchronized (u) {
                    if (u.f9469k == null) {
                        u.f9469k = fromHttp2;
                        u.notifyAll();
                    }
                }
            }
        }
    }

    public final void z(b bVar, int i2, int i3) throws IOException {
        if (i2 != 4) {
            e.c("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i2));
            throw null;
        }
        long readInt = this.f9451b.readInt() & 2147483647L;
        if (readInt == 0) {
            e.c("windowSizeIncrement was 0", Long.valueOf(readInt));
            throw null;
        }
        g.C0209g c0209g = (g.C0209g) bVar;
        if (i3 == 0) {
            synchronized (g.this) {
                g gVar = g.this;
                gVar.s += readInt;
                gVar.notifyAll();
            }
            return;
        }
        q h2 = g.this.h(i3);
        if (h2 != null) {
            synchronized (h2) {
                h2.f9460b += readInt;
                if (readInt > 0) {
                    h2.notifyAll();
                }
            }
        }
    }
}
