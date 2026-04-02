package com.amazon.aps.iva.ef0;

import com.amazon.aps.iva.ef0.e;
import com.amazon.aps.iva.j0.j0;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
/* compiled from: GzipSource.kt */
/* loaded from: classes4.dex */
public final class o implements d0 {
    public byte b;
    public final x c;
    public final Inflater d;
    public final p e;
    public final CRC32 f;

    public o(d0 d0Var) {
        com.amazon.aps.iva.yb0.j.f(d0Var, FirebaseAnalytics.Param.SOURCE);
        x xVar = new x(d0Var);
        this.c = xVar;
        Inflater inflater = new Inflater(true);
        this.d = inflater;
        this.e = new p(xVar, inflater);
        this.f = new CRC32();
    }

    public static void a(int i, int i2, String str) {
        if (i2 == i) {
            return;
        }
        String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3));
        com.amazon.aps.iva.yb0.j.e(format, "format(this, *args)");
        throw new IOException(format);
    }

    public final void c(long j, e eVar, long j2) {
        int i;
        y yVar = eVar.b;
        com.amazon.aps.iva.yb0.j.c(yVar);
        while (true) {
            int i2 = yVar.c;
            int i3 = yVar.b;
            if (j < i2 - i3) {
                break;
            }
            j -= i2 - i3;
            yVar = yVar.f;
            com.amazon.aps.iva.yb0.j.c(yVar);
        }
        while (j2 > 0) {
            int min = (int) Math.min(yVar.c - i, j2);
            this.f.update(yVar.a, (int) (yVar.b + j), min);
            j2 -= min;
            yVar = yVar.f;
            com.amazon.aps.iva.yb0.j.c(yVar);
            j = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.e.close();
    }

    @Override // com.amazon.aps.iva.ef0.d0
    public final long read(e eVar, long j) throws IOException {
        boolean z;
        x xVar;
        boolean z2;
        e eVar2;
        boolean z3;
        boolean z4;
        boolean z5;
        long j2;
        com.amazon.aps.iva.yb0.j.f(eVar, "sink");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i == 0) {
                return 0L;
            }
            byte b = this.b;
            CRC32 crc32 = this.f;
            x xVar2 = this.c;
            if (b == 0) {
                xVar2.P(10L);
                e eVar3 = xVar2.c;
                byte i2 = eVar3.i(3L);
                if (((i2 >> 1) & 1) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    eVar2 = eVar3;
                    c(0L, xVar2.c, 10L);
                } else {
                    eVar2 = eVar3;
                }
                a(8075, xVar2.readShort(), "ID1ID2");
                xVar2.e(8L);
                if (((i2 >> 2) & 1) == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    xVar2.P(2L);
                    if (z2) {
                        c(0L, xVar2.c, 2L);
                    }
                    short readShort = eVar2.readShort();
                    e.a aVar = b.a;
                    int i3 = readShort & 65535;
                    long j3 = ((short) (((i3 & 255) << 8) | ((i3 & 65280) >>> 8))) & 65535;
                    xVar2.P(j3);
                    if (z2) {
                        c(0L, xVar2.c, j3);
                        j2 = j3;
                    } else {
                        j2 = j3;
                    }
                    xVar2.e(j2);
                }
                if (((i2 >> 3) & 1) == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    long a = xVar2.a((byte) 0, 0L, Long.MAX_VALUE);
                    if (a != -1) {
                        if (z2) {
                            xVar = xVar2;
                            c(0L, xVar2.c, a + 1);
                        } else {
                            xVar = xVar2;
                        }
                        xVar.e(a + 1);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    xVar = xVar2;
                }
                if (((i2 >> 4) & 1) == 1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    long a2 = xVar.a((byte) 0, 0L, Long.MAX_VALUE);
                    if (a2 != -1) {
                        if (z2) {
                            c(0L, xVar.c, a2 + 1);
                        }
                        xVar.e(a2 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z2) {
                    xVar.P(2L);
                    short readShort2 = eVar2.readShort();
                    e.a aVar2 = b.a;
                    int i4 = readShort2 & 65535;
                    a((short) (((i4 & 255) << 8) | ((i4 & 65280) >>> 8)), (short) crc32.getValue(), "FHCRC");
                    crc32.reset();
                }
                this.b = (byte) 1;
            } else {
                xVar = xVar2;
            }
            if (this.b == 1) {
                long j4 = eVar.c;
                long read = this.e.read(eVar, j);
                if (read != -1) {
                    c(j4, eVar, read);
                    return read;
                }
                this.b = (byte) 2;
            }
            if (this.b == 2) {
                xVar.P(4L);
                int readInt = xVar.c.readInt();
                e.a aVar3 = b.a;
                a(((readInt & 255) << 24) | ((readInt & (-16777216)) >>> 24) | ((readInt & 16711680) >>> 8) | ((readInt & 65280) << 8), (int) crc32.getValue(), "CRC");
                xVar.P(4L);
                int readInt2 = xVar.c.readInt();
                a(((readInt2 & 255) << 24) | ((readInt2 & (-16777216)) >>> 24) | ((readInt2 & 16711680) >>> 8) | ((65280 & readInt2) << 8), (int) this.d.getBytesWritten(), "ISIZE");
                this.b = (byte) 3;
                if (!xVar.Y()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(j0.f("byteCount < 0: ", j).toString());
    }

    @Override // com.amazon.aps.iva.ef0.d0
    public final e0 timeout() {
        return this.c.timeout();
    }
}
