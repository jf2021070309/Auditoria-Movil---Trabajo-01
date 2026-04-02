package com.bytedance.pangle.g;

import android.util.ArrayMap;
import android.util.Pair;
import android.util.SparseArray;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
final class f {
    static final HashMap<String, SparseArray<m>> a = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Map<Integer, byte[]> map, RandomAccessFile randomAccessFile, m mVar) {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        ArrayMap arrayMap = new ArrayMap();
        boolean z = true;
        if (map.containsKey(1)) {
            arrayMap.put(1, map.get(1));
        }
        if (map.containsKey(2)) {
            arrayMap.put(2, map.get(2));
        }
        boolean z2 = false;
        if (!arrayMap.isEmpty()) {
            try {
                a(arrayMap, randomAccessFile.getFD(), mVar);
                z = false;
            } catch (IOException e) {
                throw new SecurityException("Cannot get FD", e);
            }
        }
        if (!map.containsKey(3)) {
            z2 = z;
        } else {
            try {
                if (!Arrays.equals(a(map.get(3), randomAccessFile.length(), mVar), g.a(randomAccessFile, mVar, new i() { // from class: com.bytedance.pangle.g.f.1
                    @Override // com.bytedance.pangle.g.i
                    public final ByteBuffer a(int i) {
                        return ByteBuffer.allocate(i);
                    }
                }).b)) {
                    throw new SecurityException("APK verity digest of contents did not verify");
                }
            } catch (IOException | DigestException | NoSuchAlgorithmException e2) {
                throw new SecurityException("Error during verification", e2);
            }
        }
        if (z2) {
            throw new SecurityException("No known digest exists for integrity check");
        }
    }

    private static void a(Map<Integer, byte[]> map, FileDescriptor fileDescriptor, m mVar) {
        int i;
        l lVar = new l(fileDescriptor, 0L, mVar.b);
        l lVar2 = new l(fileDescriptor, mVar.c, mVar.d - mVar.c);
        ByteBuffer duplicate = mVar.e.duplicate();
        duplicate.order(ByteOrder.LITTLE_ENDIAN);
        long j = mVar.b;
        s.a(duplicate);
        int position = duplicate.position() + 16;
        if (j < 0 || j > 4294967295L) {
            throw new IllegalArgumentException("uint32 value of out range: ".concat(String.valueOf(j)));
        }
        duplicate.putInt(duplicate.position() + position, (int) j);
        h hVar = new h(duplicate);
        int size = map.size();
        int[] iArr = new int[size];
        int i2 = 0;
        for (Integer num : map.keySet()) {
            iArr[i2] = num.intValue();
            i2++;
        }
        try {
            byte[][] a2 = a(iArr, new k[]{lVar, lVar2, hVar});
            for (int i3 = 0; i3 < size; i3++) {
                if (!MessageDigest.isEqual(map.get(Integer.valueOf(iArr[i3])), a2[i3])) {
                    throw new SecurityException(b(i) + " digest of contents did not verify");
                }
            }
        } catch (DigestException e) {
            throw new SecurityException("Failed to compute digest(s) of contents", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0106, code lost:
        r1 = r1;
        r3 = r8 + r1;
        r11 = r11 - r1;
        r7 = r7 + 1;
        r1 = 0;
        r8 = 1048576;
        r3 = r18;
        r4 = r4;
        r19 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static byte[][] a(int[] r25, com.bytedance.pangle.g.k[] r26) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pangle.g.f.a(int[], com.bytedance.pangle.g.k[]):byte[][]");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] a(byte[] bArr, long j, m mVar) {
        if (bArr.length != 40) {
            throw new SecurityException("Verity digest size is wrong: " + bArr.length);
        }
        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        order.position(32);
        if (order.getLong() == j - (mVar.c - mVar.b)) {
            return Arrays.copyOfRange(bArr, 0, 32);
        }
        throw new SecurityException("APK content size did not verify");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, int i2) {
        int a2 = a(i);
        int a3 = a(i2);
        if (a2 == 1) {
            if (a3 != 1) {
                if (a3 == 2 || a3 == 3) {
                    return -1;
                }
                throw new IllegalArgumentException("Unknown digestAlgorithm2: ".concat(String.valueOf(a3)));
            }
            return 0;
        } else if (a2 == 2) {
            if (a3 != 1) {
                if (a3 == 2) {
                    return 0;
                }
                if (a3 != 3) {
                    throw new IllegalArgumentException("Unknown digestAlgorithm2: ".concat(String.valueOf(a3)));
                }
            }
            return 1;
        } else if (a2 == 3) {
            if (a3 != 1) {
                if (a3 != 2) {
                    if (a3 == 3) {
                        return 0;
                    }
                    throw new IllegalArgumentException("Unknown digestAlgorithm2: ".concat(String.valueOf(a3)));
                }
                return -1;
            }
            return 1;
        } else {
            throw new IllegalArgumentException("Unknown digestAlgorithm1: ".concat(String.valueOf(a2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i) {
        if (i != 513) {
            if (i != 514) {
                if (i != 769) {
                    if (i != 1057 && i != 1059 && i != 1061) {
                        switch (i) {
                            case 257:
                            case 259:
                                return 1;
                            case 258:
                            case 260:
                                return 2;
                            default:
                                throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(i & (-1)));
                        }
                    }
                    return 3;
                }
                return 1;
            }
            return 2;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "SHA-256";
                }
                throw new IllegalArgumentException("Unknown content digest algorthm: ".concat(String.valueOf(i)));
            }
            return "SHA-512";
        }
        return "SHA-256";
    }

    private static int e(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return 32;
                }
                throw new IllegalArgumentException("Unknown content digest algorthm: ".concat(String.valueOf(i)));
            }
            return 64;
        }
        return 32;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(int i) {
        if (i == 513 || i == 514) {
            return "EC";
        }
        if (i != 769) {
            if (i != 1057) {
                if (i != 1059) {
                    if (i != 1061) {
                        switch (i) {
                            case 257:
                            case 258:
                            case 259:
                            case 260:
                                return "RSA";
                            default:
                                throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(i & (-1)));
                        }
                    }
                    return "DSA";
                }
                return "EC";
            }
            return "RSA";
        }
        return "DSA";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Pair<String, ? extends AlgorithmParameterSpec> d(int i) {
        if (i != 513) {
            if (i == 514) {
                return Pair.create("SHA512withECDSA", null);
            }
            if (i != 769) {
                if (i != 1057) {
                    if (i != 1059) {
                        if (i != 1061) {
                            switch (i) {
                                case 257:
                                    return Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                                case 258:
                                    return Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                                case 259:
                                    break;
                                case 260:
                                    return Pair.create("SHA512withRSA", null);
                                default:
                                    throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(i & (-1)));
                            }
                        }
                    }
                }
                return Pair.create("SHA256withRSA", null);
            }
            return Pair.create("SHA256withDSA", null);
        }
        return Pair.create("SHA256withECDSA", null);
    }

    private static ByteBuffer a(ByteBuffer byteBuffer, int i) {
        if (i < 8) {
            throw new IllegalArgumentException("end < start: " + i + " < 8");
        }
        int capacity = byteBuffer.capacity();
        if (i > byteBuffer.capacity()) {
            throw new IllegalArgumentException("end > capacity: " + i + " > " + capacity);
        }
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        try {
            byteBuffer.position(0);
            byteBuffer.limit(i);
            byteBuffer.position(8);
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            return slice;
        } finally {
            byteBuffer.position(0);
            byteBuffer.limit(limit);
            byteBuffer.position(position);
        }
    }

    private static ByteBuffer b(ByteBuffer byteBuffer, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("size: ".concat(String.valueOf(i)));
        }
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (i2 < position || i2 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ByteBuffer a(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 4) {
            throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i > byteBuffer.remaining()) {
            throw new IOException("Length-prefixed field longer than remaining buffer. Field length: " + i + ", remaining: " + byteBuffer.remaining());
        }
        return b(byteBuffer, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] b(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        }
        if (i > byteBuffer.remaining()) {
            throw new IOException("Underflow while reading length-prefixed value. Length: " + i + ", available: " + byteBuffer.remaining());
        }
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return bArr;
    }

    private static void a(int i, byte[] bArr) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) ((i >>> 24) & 255);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x025c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.lang.String r23, java.io.RandomAccessFile r24, int... r25) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pangle.g.f.a(java.lang.String, java.io.RandomAccessFile, int[]):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements j {
        private final MessageDigest[] a;

        a(MessageDigest[] messageDigestArr) {
            this.a = messageDigestArr;
        }

        @Override // com.bytedance.pangle.g.j
        public final void a(ByteBuffer byteBuffer) {
            MessageDigest[] messageDigestArr;
            ByteBuffer slice = byteBuffer.slice();
            for (MessageDigest messageDigest : this.a) {
                slice.position(0);
                messageDigest.update(slice);
            }
        }
    }
}
