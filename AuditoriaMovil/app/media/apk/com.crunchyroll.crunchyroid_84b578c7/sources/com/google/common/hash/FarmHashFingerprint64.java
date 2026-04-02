package com.google.common.hash;

import com.amazon.aps.iva.e4.t0;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.primitives.UnsignedBytes;
@ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
final class FarmHashFingerprint64 extends AbstractNonStreamingHashFunction {
    static final HashFunction FARMHASH_FINGERPRINT_64 = new FarmHashFingerprint64();
    private static final long K0 = -4348849565147123417L;
    private static final long K1 = -5435081209227447693L;
    private static final long K2 = -7286425919675154353L;

    @VisibleForTesting
    public static long fingerprint(byte[] bArr, int i, int i2) {
        if (i2 <= 32) {
            if (i2 <= 16) {
                return hashLength0to16(bArr, i, i2);
            }
            return hashLength17to32(bArr, i, i2);
        } else if (i2 <= 64) {
            return hashLength33To64(bArr, i, i2);
        } else {
            return hashLength65Plus(bArr, i, i2);
        }
    }

    private static long hashLength0to16(byte[] bArr, int i, int i2) {
        if (i2 >= 8) {
            long j = (i2 * 2) + K2;
            long load64 = LittleEndianByteArray.load64(bArr, i) + K2;
            long load642 = LittleEndianByteArray.load64(bArr, (i + i2) - 8);
            return hashLength16((Long.rotateRight(load642, 37) * j) + load64, (Long.rotateRight(load64, 25) + load642) * j, j);
        } else if (i2 >= 4) {
            return hashLength16(i2 + ((LittleEndianByteArray.load32(bArr, i) & 4294967295L) << 3), LittleEndianByteArray.load32(bArr, (i + i2) - 4) & 4294967295L, (i2 * 2) + K2);
        } else if (i2 <= 0) {
            return K2;
        } else {
            return shiftMix((((bArr[i] & UnsignedBytes.MAX_VALUE) + ((bArr[(i2 >> 1) + i] & UnsignedBytes.MAX_VALUE) << 8)) * K2) ^ ((i2 + ((bArr[(i2 - 1) + i] & 255) << 2)) * K0)) * K2;
        }
    }

    private static long hashLength16(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    private static long hashLength17to32(byte[] bArr, int i, int i2) {
        long j = (i2 * 2) + K2;
        long load64 = LittleEndianByteArray.load64(bArr, i) * K1;
        long load642 = LittleEndianByteArray.load64(bArr, i + 8);
        int i3 = i + i2;
        long load643 = LittleEndianByteArray.load64(bArr, i3 - 8) * j;
        return hashLength16((LittleEndianByteArray.load64(bArr, i3 - 16) * K2) + Long.rotateRight(load643, 30) + Long.rotateRight(load64 + load642, 43), Long.rotateRight(load642 + K2, 18) + load64 + load643, j);
    }

    private static long hashLength33To64(byte[] bArr, int i, int i2) {
        long j = (i2 * 2) + K2;
        long load64 = LittleEndianByteArray.load64(bArr, i) * K2;
        long load642 = LittleEndianByteArray.load64(bArr, i + 8);
        int i3 = i + i2;
        long load643 = LittleEndianByteArray.load64(bArr, i3 - 8) * j;
        long rotateRight = Long.rotateRight(load643, 30) + Long.rotateRight(load64 + load642, 43) + (LittleEndianByteArray.load64(bArr, i3 - 16) * K2);
        long hashLength16 = hashLength16(rotateRight, load643 + Long.rotateRight(load642 + K2, 18) + load64, j);
        long load644 = LittleEndianByteArray.load64(bArr, i + 16) * j;
        long load645 = LittleEndianByteArray.load64(bArr, i + 24);
        long load646 = (rotateRight + LittleEndianByteArray.load64(bArr, i3 - 32)) * j;
        return hashLength16(((hashLength16 + LittleEndianByteArray.load64(bArr, i3 - 24)) * j) + Long.rotateRight(load646, 30) + Long.rotateRight(load644 + load645, 43), Long.rotateRight(load645 + load64, 18) + load644 + load646, j);
    }

    private static long hashLength65Plus(byte[] bArr, int i, int i2) {
        long j = 81;
        long j2 = (j * K1) + 113;
        long shiftMix = shiftMix((j2 * K2) + 113) * K2;
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long load64 = (j * K2) + LittleEndianByteArray.load64(bArr, i);
        int i3 = i2 - 1;
        int i4 = i;
        int c = t0.c(i3, 64, 64, i4);
        int i5 = i3 & 63;
        int i6 = (c + i5) - 63;
        while (true) {
            long rotateRight = Long.rotateRight(load64 + j2 + jArr[0] + LittleEndianByteArray.load64(bArr, i4 + 8), 37) * K1;
            long rotateRight2 = Long.rotateRight(j2 + jArr[1] + LittleEndianByteArray.load64(bArr, i4 + 48), 42) * K1;
            long j3 = rotateRight ^ jArr2[1];
            long load642 = jArr[0] + LittleEndianByteArray.load64(bArr, i4 + 40) + rotateRight2;
            long rotateRight3 = Long.rotateRight(shiftMix + jArr2[0], 33) * K1;
            weakHashLength32WithSeeds(bArr, i4, jArr[1] * K1, j3 + jArr2[0], jArr);
            weakHashLength32WithSeeds(bArr, i4 + 32, rotateRight3 + jArr2[1], load642 + LittleEndianByteArray.load64(bArr, i4 + 16), jArr2);
            i4 += 64;
            if (i4 == c) {
                long j4 = K1 + ((j3 & 255) << 1);
                long j5 = jArr2[0] + i5;
                jArr2[0] = j5;
                long j6 = jArr[0] + j5;
                jArr[0] = j6;
                jArr2[0] = jArr2[0] + j6;
                long rotateRight4 = (Long.rotateRight(((rotateRight3 + load642) + jArr[0]) + LittleEndianByteArray.load64(bArr, i6 + 8), 37) * j4) ^ (jArr2[1] * 9);
                long load643 = (jArr[0] * 9) + LittleEndianByteArray.load64(bArr, i6 + 40) + (Long.rotateRight(load642 + jArr[1] + LittleEndianByteArray.load64(bArr, i6 + 48), 42) * j4);
                long rotateRight5 = Long.rotateRight(j3 + jArr2[0], 33) * j4;
                weakHashLength32WithSeeds(bArr, i6, jArr[1] * j4, rotateRight4 + jArr2[0], jArr);
                weakHashLength32WithSeeds(bArr, i6 + 32, rotateRight5 + jArr2[1], LittleEndianByteArray.load64(bArr, i6 + 16) + load643, jArr2);
                return hashLength16((shiftMix(load643) * K0) + hashLength16(jArr[0], jArr2[0], j4) + rotateRight4, hashLength16(jArr[1], jArr2[1], j4) + rotateRight5, j4);
            }
            shiftMix = j3;
            j2 = load642;
            load64 = rotateRight3;
        }
    }

    private static long shiftMix(long j) {
        return j ^ (j >>> 47);
    }

    private static void weakHashLength32WithSeeds(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long load64 = LittleEndianByteArray.load64(bArr, i);
        long load642 = LittleEndianByteArray.load64(bArr, i + 8);
        long load643 = LittleEndianByteArray.load64(bArr, i + 16);
        long load644 = LittleEndianByteArray.load64(bArr, i + 24);
        long j3 = j + load64;
        long rotateRight = Long.rotateRight(j2 + j3 + load644, 21);
        long j4 = load642 + j3 + load643;
        jArr[0] = j4 + load644;
        jArr[1] = Long.rotateRight(j4, 44) + rotateRight + j3;
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 64;
    }

    @Override // com.google.common.hash.AbstractNonStreamingHashFunction, com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashBytes(byte[] bArr, int i, int i2) {
        Preconditions.checkPositionIndexes(i, i + i2, bArr.length);
        return HashCode.fromLong(fingerprint(bArr, i, i2));
    }

    public String toString() {
        return "Hashing.farmHashFingerprint64()";
    }
}
