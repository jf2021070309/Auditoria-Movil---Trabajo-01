package com.google.android.gms.internal.ads;

import android.util.Pair;
import ch.qos.logback.core.util.FileSize;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import e.a.d.a.a;
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
/* loaded from: classes.dex */
public final class zzvi {
    public static X509Certificate[][] zza(String str) throws zzvf, SecurityException, IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair<ByteBuffer, Long> zza = zzvj.zza(randomAccessFile);
            if (zza == null) {
                long length = randomAccessFile.length();
                StringBuilder sb = new StringBuilder((int) FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH);
                sb.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
                sb.append(length);
                sb.append(" bytes");
                throw new zzvf(sb.toString());
            }
            ByteBuffer byteBuffer = (ByteBuffer) zza.first;
            long longValue = ((Long) zza.second).longValue();
            long j2 = (-20) + longValue;
            if (j2 >= 0) {
                randomAccessFile.seek(j2);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new zzvf("ZIP64 APK not supported");
                }
            }
            long zzb = zzvj.zzb(byteBuffer);
            if (zzb >= longValue) {
                StringBuilder sb2 = new StringBuilder(122);
                sb2.append("ZIP Central Directory offset out of range: ");
                sb2.append(zzb);
                sb2.append(". ZIP End of Central Directory offset: ");
                sb2.append(longValue);
                throw new zzvf(sb2.toString());
            } else if (zzvj.zzd(byteBuffer) + zzb == longValue) {
                if (zzb < 32) {
                    StringBuilder sb3 = new StringBuilder(87);
                    sb3.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                    sb3.append(zzb);
                    throw new zzvf(sb3.toString());
                }
                ByteBuffer allocate = ByteBuffer.allocate(24);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                allocate.order(byteOrder);
                randomAccessFile.seek(zzb - allocate.capacity());
                randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                if (allocate.getLong(8) == 2334950737559900225L && allocate.getLong(16) == 3617552046287187010L) {
                    int i2 = 0;
                    long j3 = allocate.getLong(0);
                    if (j3 < allocate.capacity() || j3 > 2147483639) {
                        StringBuilder sb4 = new StringBuilder(57);
                        sb4.append("APK Signing Block size out of range: ");
                        sb4.append(j3);
                        throw new zzvf(sb4.toString());
                    }
                    int i3 = (int) (8 + j3);
                    long j4 = zzb - i3;
                    if (j4 < 0) {
                        StringBuilder sb5 = new StringBuilder(59);
                        sb5.append("APK Signing Block offset out of range: ");
                        sb5.append(j4);
                        throw new zzvf(sb5.toString());
                    }
                    ByteBuffer allocate2 = ByteBuffer.allocate(i3);
                    allocate2.order(byteOrder);
                    randomAccessFile.seek(j4);
                    randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                    long j5 = allocate2.getLong(0);
                    if (j5 != j3) {
                        StringBuilder sb6 = new StringBuilder((int) FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT);
                        sb6.append("APK Signing Block sizes in header and footer do not match: ");
                        sb6.append(j5);
                        sb6.append(" vs ");
                        sb6.append(j3);
                        throw new zzvf(sb6.toString());
                    }
                    Pair create = Pair.create(allocate2, Long.valueOf(j4));
                    ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
                    long longValue2 = ((Long) create.second).longValue();
                    if (byteBuffer2.order() == byteOrder) {
                        int capacity = byteBuffer2.capacity() - 24;
                        if (capacity < 8) {
                            StringBuilder sb7 = new StringBuilder(38);
                            sb7.append("end < start: ");
                            sb7.append(capacity);
                            sb7.append(" < ");
                            sb7.append(8);
                            throw new IllegalArgumentException(sb7.toString());
                        }
                        int capacity2 = byteBuffer2.capacity();
                        if (capacity > byteBuffer2.capacity()) {
                            StringBuilder sb8 = new StringBuilder(41);
                            sb8.append("end > capacity: ");
                            sb8.append(capacity);
                            sb8.append(" > ");
                            sb8.append(capacity2);
                            throw new IllegalArgumentException(sb8.toString());
                        }
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
                        while (slice.hasRemaining()) {
                            i2++;
                            if (slice.remaining() < 8) {
                                StringBuilder sb9 = new StringBuilder(70);
                                sb9.append("Insufficient data to read size of APK Signing Block entry #");
                                sb9.append(i2);
                                throw new zzvf(sb9.toString());
                            }
                            long j6 = slice.getLong();
                            if (j6 < 4 || j6 > 2147483647L) {
                                StringBuilder sb10 = new StringBuilder(76);
                                sb10.append("APK Signing Block entry #");
                                sb10.append(i2);
                                sb10.append(" size out of range: ");
                                sb10.append(j6);
                                throw new zzvf(sb10.toString());
                            }
                            int i4 = (int) j6;
                            int position2 = slice.position() + i4;
                            if (i4 > slice.remaining()) {
                                int remaining = slice.remaining();
                                StringBuilder sb11 = new StringBuilder(91);
                                sb11.append("APK Signing Block entry #");
                                sb11.append(i2);
                                sb11.append(" size out of range: ");
                                sb11.append(i4);
                                sb11.append(", available: ");
                                sb11.append(remaining);
                                throw new zzvf(sb11.toString());
                            } else if (slice.getInt() == 1896449818) {
                                X509Certificate[][] zzb2 = zzb(randomAccessFile.getChannel(), new zzve(zzi(slice, i4 - 4), longValue2, zzb, longValue, byteBuffer, null));
                                randomAccessFile.close();
                                try {
                                    randomAccessFile.close();
                                } catch (IOException unused) {
                                }
                                return zzb2;
                            } else {
                                slice.position(position2);
                            }
                        }
                        throw new zzvf("No APK Signature Scheme v2 block in APK Signing Block");
                    }
                    throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                }
                throw new zzvf("No APK Signing Block before ZIP Central Directory");
            } else {
                throw new zzvf("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    private static X509Certificate[][] zzb(FileChannel fileChannel, zzve zzveVar) throws SecurityException {
        ByteBuffer byteBuffer;
        long j2;
        long j3;
        long j4;
        ByteBuffer byteBuffer2;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                byteBuffer = zzveVar.zza;
                ByteBuffer zzj = zzj(byteBuffer);
                int i2 = 0;
                while (zzj.hasRemaining()) {
                    i2++;
                    try {
                        arrayList.add(zzc(zzj(zzj), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e2) {
                        StringBuilder sb = new StringBuilder(48);
                        sb.append("Failed to parse/verify signer #");
                        sb.append(i2);
                        sb.append(" block");
                        throw new SecurityException(sb.toString(), e2);
                    }
                }
                if (i2 > 0) {
                    if (hashMap.isEmpty()) {
                        throw new SecurityException("No content digests found");
                    }
                    j2 = zzveVar.zzb;
                    j3 = zzveVar.zzc;
                    j4 = zzveVar.zzd;
                    byteBuffer2 = zzveVar.zze;
                    zzd(hashMap, fileChannel, j2, j3, j4, byteBuffer2);
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                }
                throw new SecurityException("No signers found");
            } catch (IOException e3) {
                throw new SecurityException("Failed to read list of signers", e3);
            }
        } catch (CertificateException e4) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
        r11 = zzf(r10);
        r12 = zzf(r6);
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
    private static java.security.cert.X509Certificate[] zzc(java.nio.ByteBuffer r21, java.util.Map<java.lang.Integer, byte[]> r22, java.security.cert.CertificateFactory r23) throws java.lang.SecurityException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvi.zzc(java.nio.ByteBuffer, java.util.Map, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    private static void zzd(Map<Integer, byte[]> map, FileChannel fileChannel, long j2, long j3, long j4, ByteBuffer byteBuffer) throws SecurityException {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        zzvd zzvdVar = new zzvd(fileChannel, 0L, j2);
        zzvd zzvdVar2 = new zzvd(fileChannel, j3, j4 - j3);
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.order(ByteOrder.LITTLE_ENDIAN);
        zzvj.zzc(duplicate, j2);
        zzvb zzvbVar = new zzvb(duplicate);
        int size = map.size();
        int[] iArr = new int[size];
        int i2 = 0;
        for (Integer num : map.keySet()) {
            iArr[i2] = num.intValue();
            i2++;
        }
        try {
            byte[][] zze = zze(iArr, new zzvc[]{zzvdVar, zzvdVar2, zzvbVar});
            for (int i3 = 0; i3 < size; i3++) {
                int i4 = iArr[i3];
                if (!MessageDigest.isEqual(map.get(Integer.valueOf(i4)), zze[i3])) {
                    throw new SecurityException(zzg(i4).concat(" digest of contents did not verify"));
                }
            }
        } catch (DigestException e2) {
            throw new SecurityException("Failed to compute digest(s) of contents", e2);
        }
    }

    private static byte[][] zze(int[] iArr, zzvc[] zzvcVarArr) throws DigestException {
        long j2;
        int i2;
        int length;
        long j3 = 0;
        int i3 = 0;
        int i4 = 0;
        long j4 = 0;
        while (true) {
            j2 = FileSize.MB_COEFFICIENT;
            if (i4 >= 3) {
                break;
            }
            j4 += (zzvcVarArr[i4].zza() + 1048575) / FileSize.MB_COEFFICIENT;
            i4++;
        }
        if (j4 >= 2097151) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Too many chunks: ");
            sb.append(j4);
            throw new DigestException(sb.toString());
        }
        int i5 = (int) j4;
        byte[][] bArr = new byte[iArr.length];
        int i6 = 0;
        while (true) {
            length = iArr.length;
            if (i6 >= length) {
                break;
            }
            byte[] bArr2 = new byte[(zzh(iArr[i6]) * i5) + 5];
            bArr2[0] = 90;
            zzl(i5, bArr2, 1);
            bArr[i6] = bArr2;
            i6++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            String zzg = zzg(iArr[i7]);
            try {
                messageDigestArr[i7] = MessageDigest.getInstance(zzg);
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(zzg.concat(" digest not supported"), e2);
            }
        }
        int i8 = 0;
        int i9 = 0;
        for (i2 = 3; i8 < i2; i2 = 3) {
            zzvc zzvcVar = zzvcVarArr[i8];
            int i10 = i8;
            int i11 = i9;
            long zza = zzvcVar.zza();
            long j5 = j2;
            long j6 = j3;
            while (zza > j3) {
                int min = (int) Math.min(zza, j5);
                zzl(min, bArr3, 1);
                for (int i12 = 0; i12 < length; i12++) {
                    messageDigestArr[i12].update(bArr3);
                }
                try {
                    zzvcVar.zzb(messageDigestArr, j6, min);
                    int i13 = 0;
                    while (i13 < iArr.length) {
                        int i14 = iArr[i13];
                        byte[] bArr4 = bArr[i13];
                        int zzh = zzh(i14);
                        byte[] bArr5 = bArr3;
                        MessageDigest messageDigest = messageDigestArr[i13];
                        MessageDigest[] messageDigestArr2 = messageDigestArr;
                        int digest = messageDigest.digest(bArr4, (i11 * zzh) + 5, zzh);
                        if (digest != zzh) {
                            String algorithm = messageDigest.getAlgorithm();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(algorithm).length() + 46);
                            sb2.append("Unexpected output size of ");
                            sb2.append(algorithm);
                            sb2.append(" digest: ");
                            sb2.append(digest);
                            throw new RuntimeException(sb2.toString());
                        }
                        i13++;
                        bArr3 = bArr5;
                        messageDigestArr = messageDigestArr2;
                    }
                    long j7 = min;
                    j6 += j7;
                    zza -= j7;
                    i11++;
                    j3 = 0;
                    j5 = FileSize.MB_COEFFICIENT;
                } catch (IOException e3) {
                    throw new DigestException(a.S(59, "Failed to digest chunk #", i11, " of section #", i3), e3);
                }
            }
            i9 = i11;
            i3++;
            i8 = i10 + 1;
            j3 = 0;
            j2 = FileSize.MB_COEFFICIENT;
        }
        byte[][] bArr6 = new byte[iArr.length];
        for (int i15 = 0; i15 < iArr.length; i15++) {
            int i16 = iArr[i15];
            byte[] bArr7 = bArr[i15];
            String zzg2 = zzg(i16);
            try {
                bArr6[i15] = MessageDigest.getInstance(zzg2).digest(bArr7);
            } catch (NoSuchAlgorithmException e4) {
                throw new RuntimeException(zzg2.concat(" digest not supported"), e4);
            }
        }
        return bArr6;
    }

    private static int zzf(int i2) {
        if (i2 != 513) {
            if (i2 != 514) {
                if (i2 != 769) {
                    switch (i2) {
                        case 257:
                        case 259:
                            return 1;
                        case 258:
                        case 260:
                            return 2;
                        default:
                            String valueOf = String.valueOf(Long.toHexString(i2));
                            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unknown signature algorithm: 0x".concat(valueOf) : new String("Unknown signature algorithm: 0x"));
                    }
                }
                return 1;
            }
            return 2;
        }
        return 1;
    }

    private static String zzg(int i2) {
        if (i2 != 1) {
            if (i2 == 2) {
                return "SHA-512";
            }
            throw new IllegalArgumentException(a.R(44, "Unknown content digest algorthm: ", i2));
        }
        return "SHA-256";
    }

    private static int zzh(int i2) {
        if (i2 != 1) {
            if (i2 == 2) {
                return 64;
            }
            throw new IllegalArgumentException(a.R(44, "Unknown content digest algorthm: ", i2));
        }
        return 32;
    }

    private static ByteBuffer zzi(ByteBuffer byteBuffer, int i2) throws BufferUnderflowException {
        if (i2 >= 0) {
            int limit = byteBuffer.limit();
            int position = byteBuffer.position();
            int i3 = i2 + position;
            if (i3 < position || i3 > limit) {
                throw new BufferUnderflowException();
            }
            byteBuffer.limit(i3);
            try {
                ByteBuffer slice = byteBuffer.slice();
                slice.order(byteBuffer.order());
                byteBuffer.position(i3);
                return slice;
            } finally {
                byteBuffer.limit(limit);
            }
        }
        throw new IllegalArgumentException(a.R(17, "size: ", i2));
    }

    private static ByteBuffer zzj(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() >= 4) {
            int i2 = byteBuffer.getInt();
            if (i2 >= 0) {
                if (i2 <= byteBuffer.remaining()) {
                    return zzi(byteBuffer, i2);
                }
                throw new IOException(a.S(101, "Length-prefixed field longer than remaining buffer. Field length: ", i2, ", remaining: ", byteBuffer.remaining()));
            }
            throw new IllegalArgumentException("Negative length");
        }
        throw new IOException(a.R(93, "Remaining buffer too short to contain length of length-prefixed field. Remaining: ", byteBuffer.remaining()));
    }

    private static byte[] zzk(ByteBuffer byteBuffer) throws IOException {
        int i2 = byteBuffer.getInt();
        if (i2 >= 0) {
            if (i2 <= byteBuffer.remaining()) {
                byte[] bArr = new byte[i2];
                byteBuffer.get(bArr);
                return bArr;
            }
            throw new IOException(a.S(90, "Underflow while reading length-prefixed value. Length: ", i2, ", available: ", byteBuffer.remaining()));
        }
        throw new IOException("Negative length");
    }

    private static void zzl(int i2, byte[] bArr, int i3) {
        bArr[1] = (byte) (i2 & 255);
        bArr[2] = (byte) ((i2 >>> 8) & 255);
        bArr[3] = (byte) ((i2 >>> 16) & 255);
        bArr[4] = (byte) (i2 >> 24);
    }
}
