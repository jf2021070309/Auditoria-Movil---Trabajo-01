package com.google.ads.interactivemedia.v3.internal;

import android.util.Pair;
import com.amazon.aps.iva.c80.a;
import com.amazon.aps.iva.j0.j0;
import com.amazon.aps.iva.q.c0;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzi {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.nio.Buffer, java.nio.ByteBuffer] */
    public static X509Certificate[][] zza(String str) throws zzf, SecurityException, IOException {
        ?? r6;
        ?? r1 = "end > capacity: ";
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair zzc = zzj.zzc(randomAccessFile);
            try {
                if (zzc != null) {
                    ByteBuffer byteBuffer = (ByteBuffer) zzc.first;
                    long longValue = ((Long) zzc.second).longValue();
                    long j = (-20) + longValue;
                    if (j >= 0) {
                        randomAccessFile.seek(j);
                        if (randomAccessFile.readInt() == 1347094023) {
                            throw new zzf("ZIP64 APK not supported");
                        }
                    }
                    long zza = zzj.zza(byteBuffer);
                    if (zza < longValue) {
                        if (zzj.zzb(byteBuffer) + zza == longValue) {
                            if (zza >= 32) {
                                try {
                                    r6 = ByteBuffer.allocate(24);
                                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                    r6.order(byteOrder);
                                    long j2 = longValue;
                                    randomAccessFile.seek(zza - r6.capacity());
                                    randomAccessFile.readFully(r6.array(), r6.arrayOffset(), r6.capacity());
                                    try {
                                        if (r6.getLong(8) == 2334950737559900225L && r6.getLong(16) == 3617552046287187010L) {
                                            long j3 = r6.getLong(0);
                                            if (j3 >= r6.capacity() && j3 <= 2147483639) {
                                                int i = (int) (8 + j3);
                                                long j4 = zza - i;
                                                if (j4 >= 0) {
                                                    try {
                                                        ByteBuffer allocate = ByteBuffer.allocate(i);
                                                        allocate.order(byteOrder);
                                                        randomAccessFile.seek(j4);
                                                        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                                                        long j5 = zza;
                                                        long j6 = allocate.getLong(0);
                                                        if (j6 == j3) {
                                                            Pair create = Pair.create(allocate, Long.valueOf(j4));
                                                            ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
                                                            long longValue2 = ((Long) create.second).longValue();
                                                            if (byteBuffer2.order() == byteOrder) {
                                                                int capacity = byteBuffer2.capacity() - 24;
                                                                if (capacity >= 8) {
                                                                    int capacity2 = byteBuffer2.capacity();
                                                                    if (capacity <= byteBuffer2.capacity()) {
                                                                        int limit = byteBuffer2.limit();
                                                                        int position = byteBuffer2.position();
                                                                        byteBuffer2.position(0);
                                                                        byteBuffer2.limit(capacity);
                                                                        byteBuffer2.position(8);
                                                                        ByteBuffer slice = byteBuffer2.slice();
                                                                        slice.order(byteBuffer2.order());
                                                                        byteBuffer2.position(0);
                                                                        byteBuffer2.limit(limit);
                                                                        byteBuffer2.position(position);
                                                                        int i2 = 0;
                                                                        while (slice.hasRemaining()) {
                                                                            i2++;
                                                                            if (slice.remaining() >= 8) {
                                                                                long j7 = slice.getLong();
                                                                                if (j7 >= 4 && j7 <= 2147483647L) {
                                                                                    int i3 = (int) j7;
                                                                                    int position2 = slice.position() + i3;
                                                                                    if (i3 <= slice.remaining()) {
                                                                                        if (slice.getInt() == 1896449818) {
                                                                                            X509Certificate[][] zzl = zzl(randomAccessFile.getChannel(), new zze(zze(slice, i3 - 4), longValue2, j5, j2, byteBuffer, null));
                                                                                            randomAccessFile.close();
                                                                                            try {
                                                                                                randomAccessFile.close();
                                                                                            } catch (IOException unused) {
                                                                                            }
                                                                                            return zzl;
                                                                                        }
                                                                                        long j8 = j2;
                                                                                        long j9 = j5;
                                                                                        slice.position(position2);
                                                                                        j5 = j9;
                                                                                        j2 = j8;
                                                                                    } else {
                                                                                        throw new zzf("APK Signing Block entry #" + i2 + " size out of range: " + i3 + ", available: " + slice.remaining());
                                                                                    }
                                                                                } else {
                                                                                    throw new zzf("APK Signing Block entry #" + i2 + " size out of range: " + j7);
                                                                                }
                                                                            } else {
                                                                                throw new zzf("Insufficient data to read size of APK Signing Block entry #" + i2);
                                                                            }
                                                                        }
                                                                        throw new zzf("No APK Signature Scheme v2 block in APK Signing Block");
                                                                    }
                                                                    throw new IllegalArgumentException("end > capacity: " + capacity + " > " + capacity2);
                                                                }
                                                                throw new IllegalArgumentException("end < start: " + capacity + " < 8");
                                                            }
                                                            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                                                        }
                                                        throw new zzf("APK Signing Block sizes in header and footer do not match: " + j6 + " vs " + j3);
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        r6 = randomAccessFile;
                                                        r1 = r6;
                                                        try {
                                                            r1.close();
                                                        } catch (IOException unused2) {
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                throw new zzf("APK Signing Block offset out of range: " + j4);
                                            }
                                            throw new zzf("APK Signing Block size out of range: " + j3);
                                        }
                                        throw new zzf("No APK Signing Block before ZIP Central Directory");
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    r6 = randomAccessFile;
                                }
                            } else {
                                throw new zzf("APK too small for APK Signing Block. ZIP Central Directory offset: " + zza);
                            }
                        } else {
                            throw new zzf("ZIP Central Directory is not immediately followed by End of Central Directory");
                        }
                    } else {
                        throw new zzf("ZIP Central Directory offset out of range: " + zza + ". ZIP End of Central Directory offset: " + longValue);
                    }
                } else {
                    throw new zzf("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            r1 = randomAccessFile;
        }
    }

    private static int zzb(int i) {
        if (i != 1) {
            if (i == 2) {
                return 64;
            }
            throw new IllegalArgumentException(c0.a("Unknown content digest algorthm: ", i));
        }
        return 32;
    }

    private static int zzc(int i) {
        if (i != 513) {
            if (i != 514) {
                if (i != 769) {
                    switch (i) {
                        case 257:
                        case 259:
                            return 1;
                        case 258:
                        case 260:
                            return 2;
                        default:
                            throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
                    }
                }
                return 1;
            }
            return 2;
        }
        return 1;
    }

    private static String zzd(int i) {
        if (i != 1) {
            if (i == 2) {
                return "SHA-512";
            }
            throw new IllegalArgumentException(c0.a("Unknown content digest algorthm: ", i));
        }
        return "SHA-256";
    }

    private static ByteBuffer zze(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (i2 >= position && i2 <= limit) {
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
        throw new BufferUnderflowException();
    }

    private static ByteBuffer zzf(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() >= 4) {
            int i = byteBuffer.getInt();
            if (i >= 0) {
                if (i <= byteBuffer.remaining()) {
                    return zze(byteBuffer, i);
                }
                throw new IOException(j0.e("Length-prefixed field longer than remaining buffer. Field length: ", i, ", remaining: ", byteBuffer.remaining()));
            }
            throw new IllegalArgumentException("Negative length");
        }
        throw new IOException(c0.a("Remaining buffer too short to contain length of length-prefixed field. Remaining: ", byteBuffer.remaining()));
    }

    private static void zzg(int i, byte[] bArr, int i2) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    private static void zzh(Map map, FileChannel fileChannel, long j, long j2, long j3, ByteBuffer byteBuffer) throws SecurityException {
        if (!map.isEmpty()) {
            zzc zzcVar = new zzc(fileChannel, 0L, j);
            zzc zzcVar2 = new zzc(fileChannel, j2, j3 - j2);
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.order(ByteOrder.LITTLE_ENDIAN);
            zzj.zzd(duplicate, j);
            zza zzaVar = new zza(duplicate);
            int size = map.size();
            int[] iArr = new int[size];
            int i = 0;
            for (Integer num : map.keySet()) {
                iArr[i] = num.intValue();
                i++;
            }
            try {
                byte[][] zzk = zzk(iArr, new zzb[]{zzcVar, zzcVar2, zzaVar});
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = iArr[i2];
                    if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i3)), zzk[i2])) {
                        throw new SecurityException(zzd(i3).concat(" digest of contents did not verify"));
                    }
                }
                return;
            } catch (DigestException e) {
                throw new SecurityException("Failed to compute digest(s) of contents", e);
            }
        }
        throw new SecurityException("No digests provided");
    }

    private static byte[] zzi(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i >= 0) {
            if (i <= byteBuffer.remaining()) {
                byte[] bArr = new byte[i];
                byteBuffer.get(bArr);
                return bArr;
            }
            throw new IOException(j0.e("Underflow while reading length-prefixed value. Length: ", i, ", available: ", byteBuffer.remaining()));
        }
        throw new IOException("Negative length");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
        r11 = zzc(r10);
        r12 = zzc(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (r11 == 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r12 == 1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.security.cert.X509Certificate[] zzj(java.nio.ByteBuffer r21, java.util.Map r22, java.security.cert.CertificateFactory r23) throws java.lang.SecurityException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzi.zzj(java.nio.ByteBuffer, java.util.Map, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    private static byte[][] zzk(int[] iArr, zzb[] zzbVarArr) throws DigestException {
        int length;
        int i = 0;
        long j = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            j += (zzbVarArr[i2].zza() + 1048575) / 1048576;
        }
        if (j < 2097151) {
            byte[][] bArr = new byte[iArr.length];
            int i3 = 0;
            while (true) {
                length = iArr.length;
                if (i3 >= length) {
                    break;
                }
                int i4 = (int) j;
                byte[] bArr2 = new byte[(zzb(iArr[i3]) * i4) + 5];
                bArr2[0] = 90;
                zzg(i4, bArr2, 1);
                bArr[i3] = bArr2;
                i3++;
            }
            byte[] bArr3 = new byte[5];
            bArr3[0] = -91;
            MessageDigest[] messageDigestArr = new MessageDigest[length];
            for (int i5 = 0; i5 < iArr.length; i5++) {
                String zzd = zzd(iArr[i5]);
                try {
                    messageDigestArr[i5] = MessageDigest.getInstance(zzd);
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(zzd.concat(" digest not supported"), e);
                }
            }
            int i6 = 3;
            long j2 = 1048576;
            long j3 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i < i6) {
                zzb zzbVar = zzbVarArr[i];
                int i9 = i;
                int i10 = i7;
                long zza = zzbVar.zza();
                long j4 = j2;
                long j5 = j3;
                while (zza > j3) {
                    int min = (int) Math.min(zza, j4);
                    zzg(min, bArr3, 1);
                    for (int i11 = 0; i11 < length; i11++) {
                        messageDigestArr[i11].update(bArr3);
                    }
                    try {
                        zzbVar.zzb(messageDigestArr, j5, min);
                        int i12 = 0;
                        while (i12 < iArr.length) {
                            int i13 = iArr[i12];
                            byte[] bArr4 = bArr[i12];
                            int zzb = zzb(i13);
                            byte[] bArr5 = bArr3;
                            MessageDigest messageDigest = messageDigestArr[i12];
                            MessageDigest[] messageDigestArr2 = messageDigestArr;
                            int digest = messageDigest.digest(bArr4, (i8 * zzb) + 5, zzb);
                            if (digest == zzb) {
                                i12++;
                                bArr3 = bArr5;
                                messageDigestArr = messageDigestArr2;
                            } else {
                                throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + digest);
                            }
                        }
                        byte[] bArr6 = bArr3;
                        long j6 = min;
                        j5 += j6;
                        zza -= j6;
                        i8++;
                        j3 = 0;
                        j4 = 1048576;
                        bArr3 = bArr6;
                        messageDigestArr = messageDigestArr;
                    } catch (IOException e2) {
                        throw new DigestException(j0.e("Failed to digest chunk #", i8, " of section #", i10), e2);
                    }
                }
                i7 = i10 + 1;
                i = i9 + 1;
                j3 = 0;
                j2 = 1048576;
                i6 = 3;
                bArr3 = bArr3;
            }
            byte[][] bArr7 = new byte[iArr.length];
            for (int i14 = 0; i14 < iArr.length; i14++) {
                int i15 = iArr[i14];
                byte[] bArr8 = bArr[i14];
                String zzd2 = zzd(i15);
                try {
                    bArr7[i14] = MessageDigest.getInstance(zzd2).digest(bArr8);
                } catch (NoSuchAlgorithmException e3) {
                    throw new RuntimeException(zzd2.concat(" digest not supported"), e3);
                }
            }
            return bArr7;
        }
        throw new DigestException(j0.f("Too many chunks: ", j));
    }

    private static X509Certificate[][] zzl(FileChannel fileChannel, zze zzeVar) throws SecurityException {
        ByteBuffer byteBuffer;
        long j;
        long j2;
        long j3;
        ByteBuffer byteBuffer2;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                byteBuffer = zzeVar.zza;
                ByteBuffer zzf = zzf(byteBuffer);
                int i = 0;
                while (zzf.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(zzj(zzf(zzf), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        throw new SecurityException(a.d("Failed to parse/verify signer #", i, " block"), e);
                    }
                }
                if (i > 0) {
                    if (!hashMap.isEmpty()) {
                        j = zzeVar.zzb;
                        j2 = zzeVar.zzc;
                        j3 = zzeVar.zzd;
                        byteBuffer2 = zzeVar.zze;
                        zzh(hashMap, fileChannel, j, j2, j3, byteBuffer2);
                        return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                    }
                    throw new SecurityException("No content digests found");
                }
                throw new SecurityException("No signers found");
            } catch (IOException e2) {
                throw new SecurityException("Failed to read list of signers", e2);
            }
        } catch (CertificateException e3) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
        }
    }
}
