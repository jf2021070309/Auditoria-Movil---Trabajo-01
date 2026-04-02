package com.bytedance.pangle.g;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.util.ArrayList;
/* loaded from: classes.dex */
abstract class g {
    private static final byte[] a = new byte[8];

    /* loaded from: classes.dex */
    static class a {
        public final ByteBuffer a;
        public final byte[] b;

        a(ByteBuffer byteBuffer, byte[] bArr) {
            this.a = byteBuffer;
            this.b = bArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a a(RandomAccessFile randomAccessFile, m mVar, i iVar) {
        int[] a2 = a(randomAccessFile.length() - (mVar.c - mVar.b));
        int i = a2[a2.length - 1];
        int i2 = i + 4096;
        ByteBuffer a3 = iVar.a(i2);
        a3.order(ByteOrder.LITTLE_ENDIAN);
        ByteBuffer a4 = a(a3, 0, i);
        int i3 = i + 64;
        ByteBuffer a5 = a(a3, i, i3);
        ByteBuffer a6 = a(a3, i3, i2);
        byte[] bArr = new byte[32];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        if (mVar.b % 4096 == 0) {
            if ((mVar.c - mVar.b) % 4096 == 0) {
                long j = mVar.c - mVar.b;
                int[] a7 = a(randomAccessFile.length() - j);
                if (a4 != null) {
                    byte[] a8 = a(randomAccessFile, mVar, a, a7, a4);
                    if (wrap != null) {
                        wrap.put(a8);
                        wrap.flip();
                    }
                }
                if (a5 != null) {
                    a5.order(ByteOrder.LITTLE_ENDIAN);
                    long length = randomAccessFile.length();
                    byte[] bArr2 = a;
                    if (bArr2.length != 8) {
                        throw new IllegalArgumentException("salt is not 8 bytes long");
                    }
                    a5.put("TrueBrew".getBytes());
                    a5.put((byte) 1);
                    a5.put((byte) 0);
                    a5.put((byte) 12);
                    a5.put((byte) 7);
                    a5.putShort((short) 1);
                    a5.putShort((short) 1);
                    a5.putInt(0);
                    a5.putInt(0);
                    a5.putLong(length);
                    a5.put((byte) 2);
                    a5.put((byte) 0);
                    a5.put(bArr2);
                    a(a5, 22);
                    a5.flip();
                }
                if (a6 != null) {
                    a6.order(ByteOrder.LITTLE_ENDIAN);
                    long j2 = mVar.b;
                    long j3 = mVar.d;
                    a6.putInt(24);
                    a6.putShort((short) 1);
                    a(a6, 2);
                    a6.putLong(j2);
                    a6.putLong(j);
                    a6.putInt(20);
                    a6.putShort((short) 2);
                    a(a6, 2);
                    a6.putLong(j3 + 16);
                    a6.putInt(c(j2));
                    a(a6, 4);
                    a6.flip();
                }
                a3.position(i3 + a6.limit());
                a3.putInt(a6.limit() + 64 + 4);
                a3.flip();
                return new a(a3, bArr);
            }
            throw new IllegalArgumentException("Size of APK Signing Block is not a multiple of 4096: " + (mVar.c - mVar.b));
        }
        throw new IllegalArgumentException("APK Signing Block does not start at the page  boundary: " + mVar.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b implements j {
        private int a;
        private final ByteBuffer b;
        private final MessageDigest c;
        private final byte[] d;
        private final byte[] e;

        /* synthetic */ b(byte[] bArr, ByteBuffer byteBuffer, byte b) {
            this(bArr, byteBuffer);
        }

        private b(byte[] bArr, ByteBuffer byteBuffer) {
            this.d = new byte[32];
            this.e = bArr;
            this.b = byteBuffer.slice();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.c = messageDigest;
            messageDigest.update(bArr);
            this.a = 0;
        }

        @Override // com.bytedance.pangle.g.j
        public final void a(ByteBuffer byteBuffer) {
            byteBuffer.position();
            int remaining = byteBuffer.remaining();
            while (remaining > 0) {
                int min = Math.min(remaining, 4096 - this.a);
                byteBuffer.limit(byteBuffer.position() + min);
                this.c.update(byteBuffer);
                remaining -= min;
                int i = this.a + min;
                this.a = i;
                if (i == 4096) {
                    MessageDigest messageDigest = this.c;
                    byte[] bArr = this.d;
                    messageDigest.digest(bArr, 0, bArr.length);
                    this.b.put(this.d);
                    this.c.update(this.e);
                    this.a = 0;
                }
            }
        }

        public final void a() {
            if (this.a != 0) {
                throw new IllegalStateException("Buffer is not empty: " + this.a);
            }
        }

        final void b() {
            int position = this.b.position() % 4096;
            if (position == 0) {
                return;
            }
            this.b.put(ByteBuffer.allocate(4096 - position));
        }
    }

    private static void a(j jVar, k kVar, int i) {
        long a2 = kVar.a();
        long j = 0;
        while (a2 > 0) {
            int min = (int) Math.min(a2, i);
            kVar.a(jVar, j, min);
            long j2 = min;
            j += j2;
            a2 -= j2;
        }
    }

    private static byte[] a(RandomAccessFile randomAccessFile, m mVar, byte[] bArr, int[] iArr, ByteBuffer byteBuffer) {
        b bVar = new b(bArr, a(byteBuffer, iArr[iArr.length - 2], iArr[iArr.length - 1]), (byte) 0);
        a(bVar, new l(randomAccessFile.getFD(), 0L, mVar.b), 1048576);
        long j = mVar.d + 16;
        a(bVar, new l(randomAccessFile.getFD(), mVar.c, j - mVar.c), 1048576);
        ByteBuffer order = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN);
        order.putInt(c(mVar.b));
        order.flip();
        bVar.a(order);
        long j2 = j + 4;
        a(bVar, new l(randomAccessFile.getFD(), j2, randomAccessFile.length() - j2), 1048576);
        int length = (int) (randomAccessFile.length() % 4096);
        if (length != 0) {
            bVar.a(ByteBuffer.allocate(4096 - length));
        }
        bVar.a();
        bVar.b();
        for (int length2 = iArr.length - 3; length2 >= 0; length2--) {
            int i = length2 + 1;
            ByteBuffer a2 = a(byteBuffer, iArr[i], iArr[length2 + 2]);
            ByteBuffer a3 = a(byteBuffer, iArr[length2], iArr[i]);
            h hVar = new h(a2);
            b bVar2 = new b(bArr, a3, (byte) 0);
            a(bVar2, hVar, 4096);
            bVar2.a();
            bVar2.b();
        }
        byte[] bArr2 = new byte[32];
        b bVar3 = new b(bArr, ByteBuffer.wrap(bArr2), (byte) 0);
        bVar3.a(a(byteBuffer, 0, 4096));
        bVar3.a();
        return bArr2;
    }

    private static int[] a(long j) {
        ArrayList arrayList = new ArrayList();
        do {
            j = b(j) * 32;
            arrayList.add(Long.valueOf(b(j) * 4096));
        } while (j > 4096);
        int[] iArr = new int[arrayList.size() + 1];
        int i = 0;
        iArr[0] = 0;
        while (i < arrayList.size()) {
            int i2 = i + 1;
            iArr[i2] = iArr[i] + c(((Long) arrayList.get((arrayList.size() - i) - 1)).longValue());
            i = i2;
        }
        return iArr;
    }

    private static ByteBuffer a(ByteBuffer byteBuffer, int i, int i2) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(0);
        duplicate.limit(i2);
        duplicate.position(i);
        return duplicate.slice();
    }

    private static void a(ByteBuffer byteBuffer, int i) {
        byteBuffer.position(byteBuffer.position() + i);
    }

    private static long b(long j) {
        return ((j + 4096) - 1) / 4096;
    }

    private static int c(long j) {
        int i = (int) j;
        if (i != j) {
            throw new ArithmeticException("integer overflow");
        }
        return i;
    }
}
