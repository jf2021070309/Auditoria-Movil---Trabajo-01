package com.amazon.aps.iva.z90;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.q.c0;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
/* compiled from: SntpClient.java */
/* loaded from: classes4.dex */
public final class f {
    public final com.amazon.aps.iva.x90.a a;
    public final c b;
    public final com.amazon.aps.iva.z90.a c;

    /* compiled from: SntpClient.java */
    /* loaded from: classes4.dex */
    public static class a extends IOException {
    }

    /* compiled from: SntpClient.java */
    /* loaded from: classes4.dex */
    public static final class b {
        public final long a;
        public final long b;
        public final long c;
        public final com.amazon.aps.iva.x90.a d;

        public b(long j, long j2, long j3, com.amazon.aps.iva.x90.a aVar) {
            this.a = j;
            this.b = j2;
            this.c = j3;
            this.d = aVar;
        }
    }

    public f(x xVar, d dVar, com.amazon.aps.iva.z90.b bVar) {
        this.a = xVar;
        this.b = dVar;
        this.c = bVar;
    }

    public static void a(byte b2, byte b3, int i, long j) throws a {
        if (b2 != 3) {
            if (b3 != 4 && b3 != 5) {
                throw new a(c0.a("untrusted mode: ", b3));
            }
            if (i != 0 && i <= 15) {
                if (j != 0) {
                    return;
                }
                throw new a("zero transmitTime");
            }
            throw new a(c0.a("untrusted stratum: ", i));
        }
        throw new a("unsynchronized server");
    }

    public static long b(int i, byte[] bArr) {
        int i2 = bArr[i];
        int i3 = bArr[i + 1];
        int i4 = bArr[i + 2];
        int i5 = bArr[i + 3];
        if ((i2 & 128) == 128) {
            i2 = (i2 & 127) + 128;
        }
        if ((i3 & 128) == 128) {
            i3 = (i3 & 127) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & 127) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        return (i2 << 24) + (i3 << 16) + (i4 << 8) + i5;
    }

    public static long c(int i, byte[] bArr) {
        long b2 = b(i, bArr);
        return ((b(i + 4, bArr) * 1000) / 4294967296L) + ((b2 - 2208988800L) * 1000);
    }

    public final b d(String str, Long l) throws IOException {
        com.amazon.aps.iva.x90.a aVar = this.a;
        com.amazon.aps.iva.z90.a aVar2 = this.c;
        DatagramSocket datagramSocket = null;
        try {
            InetAddress a2 = this.b.a(str);
            datagramSocket = aVar2.a();
            datagramSocket.setSoTimeout(l.intValue());
            byte[] bArr = new byte[48];
            DatagramPacket b2 = aVar2.b(bArr, a2);
            bArr[0] = Ascii.ESC;
            long a3 = aVar.a();
            long c = aVar.c();
            long j = a3 / 1000;
            long j2 = j + 2208988800L;
            bArr[40] = (byte) (j2 >> 24);
            bArr[41] = (byte) (j2 >> 16);
            bArr[42] = (byte) (j2 >> 8);
            bArr[43] = (byte) (j2 >> 0);
            long j3 = ((a3 - (j * 1000)) * 4294967296L) / 1000;
            bArr[44] = (byte) (j3 >> 24);
            bArr[45] = (byte) (j3 >> 16);
            bArr[46] = (byte) (j3 >> 8);
            bArr[47] = (byte) (Math.random() * 255.0d);
            datagramSocket.send(b2);
            byte[] copyOf = Arrays.copyOf(bArr, 48);
            datagramSocket.receive(aVar2.c(copyOf));
            long c2 = aVar.c();
            long j4 = (c2 - c) + a3;
            byte b3 = copyOf[0];
            int i = copyOf[1] & UnsignedBytes.MAX_VALUE;
            long c3 = c(24, copyOf);
            long c4 = c(32, copyOf);
            long c5 = c(40, copyOf);
            a((byte) ((b3 >> 6) & 3), (byte) (b3 & 7), i, c5);
            b bVar = new b(j4, c2, ((c5 - j4) + (c4 - c3)) / 2, this.a);
            datagramSocket.close();
            return bVar;
        } catch (Throwable th) {
            if (datagramSocket != null) {
                datagramSocket.close();
            }
            throw th;
        }
    }
}
