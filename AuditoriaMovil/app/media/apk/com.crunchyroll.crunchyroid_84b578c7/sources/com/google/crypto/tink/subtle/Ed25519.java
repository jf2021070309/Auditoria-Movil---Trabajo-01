package com.google.crypto.tink.subtle;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class Ed25519 {
    public static final int PUBLIC_KEY_LEN = 32;
    public static final int SECRET_KEY_LEN = 32;
    public static final int SIGNATURE_LEN = 64;
    private static final CachedXYT CACHED_NEUTRAL = new CachedXYT(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    private static final PartialXYZT NEUTRAL = new PartialXYZT(new XYZ(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    static final byte[] GROUP_ORDER = {-19, -45, -11, 92, Ascii.SUB, 99, Ascii.DC2, 88, -42, -100, -9, -94, -34, -7, -34, Ascii.DC4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Ascii.DLE};

    /* loaded from: classes4.dex */
    public static class CachedXYT {
        final long[] t2d;
        final long[] yMinusX;
        final long[] yPlusX;

        public CachedXYT() {
            this(new long[10], new long[10], new long[10]);
        }

        public void copyConditional(CachedXYT cachedXYT, int i) {
            Curve25519.copyConditional(this.yPlusX, cachedXYT.yPlusX, i);
            Curve25519.copyConditional(this.yMinusX, cachedXYT.yMinusX, i);
            Curve25519.copyConditional(this.t2d, cachedXYT.t2d, i);
        }

        public void multByZ(long[] jArr, long[] jArr2) {
            System.arraycopy(jArr2, 0, jArr, 0, 10);
        }

        public CachedXYT(long[] jArr, long[] jArr2, long[] jArr3) {
            this.yPlusX = jArr;
            this.yMinusX = jArr2;
            this.t2d = jArr3;
        }

        public CachedXYT(CachedXYT cachedXYT) {
            this.yPlusX = Arrays.copyOf(cachedXYT.yPlusX, 10);
            this.yMinusX = Arrays.copyOf(cachedXYT.yMinusX, 10);
            this.t2d = Arrays.copyOf(cachedXYT.t2d, 10);
        }
    }

    /* loaded from: classes4.dex */
    public static class CachedXYZT extends CachedXYT {
        private final long[] z;

        public CachedXYZT() {
            this(new long[10], new long[10], new long[10], new long[10]);
        }

        @Override // com.google.crypto.tink.subtle.Ed25519.CachedXYT
        public void multByZ(long[] jArr, long[] jArr2) {
            Field25519.mult(jArr, jArr2, this.z);
        }

        public CachedXYZT(XYZT xyzt) {
            this();
            long[] jArr = this.yPlusX;
            XYZ xyz = xyzt.xyz;
            Field25519.sum(jArr, xyz.y, xyz.x);
            long[] jArr2 = this.yMinusX;
            XYZ xyz2 = xyzt.xyz;
            Field25519.sub(jArr2, xyz2.y, xyz2.x);
            System.arraycopy(xyzt.xyz.z, 0, this.z, 0, 10);
            Field25519.mult(this.t2d, xyzt.t, Ed25519Constants.D2);
        }

        public CachedXYZT(long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4) {
            super(jArr, jArr2, jArr4);
            this.z = jArr3;
        }
    }

    /* loaded from: classes4.dex */
    public static class PartialXYZT {
        final long[] t;
        final XYZ xyz;

        public PartialXYZT() {
            this(new XYZ(), new long[10]);
        }

        public PartialXYZT(XYZ xyz, long[] jArr) {
            this.xyz = xyz;
            this.t = jArr;
        }

        public PartialXYZT(PartialXYZT partialXYZT) {
            this.xyz = new XYZ(partialXYZT.xyz);
            this.t = Arrays.copyOf(partialXYZT.t, 10);
        }
    }

    /* loaded from: classes4.dex */
    public static class XYZ {
        final long[] x;
        final long[] y;
        final long[] z;

        public XYZ() {
            this(new long[10], new long[10], new long[10]);
        }

        @CanIgnoreReturnValue
        public static XYZ fromPartialXYZT(XYZ xyz, PartialXYZT partialXYZT) {
            Field25519.mult(xyz.x, partialXYZT.xyz.x, partialXYZT.t);
            long[] jArr = xyz.y;
            XYZ xyz2 = partialXYZT.xyz;
            Field25519.mult(jArr, xyz2.y, xyz2.z);
            Field25519.mult(xyz.z, partialXYZT.xyz.z, partialXYZT.t);
            return xyz;
        }

        public boolean isOnCurve() {
            long[] jArr = new long[10];
            Field25519.square(jArr, this.x);
            long[] jArr2 = new long[10];
            Field25519.square(jArr2, this.y);
            long[] jArr3 = new long[10];
            Field25519.square(jArr3, this.z);
            long[] jArr4 = new long[10];
            Field25519.square(jArr4, jArr3);
            long[] jArr5 = new long[10];
            Field25519.sub(jArr5, jArr2, jArr);
            Field25519.mult(jArr5, jArr5, jArr3);
            long[] jArr6 = new long[10];
            Field25519.mult(jArr6, jArr, jArr2);
            Field25519.mult(jArr6, jArr6, Ed25519Constants.D);
            Field25519.sum(jArr6, jArr4);
            Field25519.reduce(jArr6, jArr6);
            return Bytes.equal(Field25519.contract(jArr5), Field25519.contract(jArr6));
        }

        public byte[] toBytes() {
            long[] jArr = new long[10];
            long[] jArr2 = new long[10];
            long[] jArr3 = new long[10];
            Field25519.inverse(jArr, this.z);
            Field25519.mult(jArr2, this.x, jArr);
            Field25519.mult(jArr3, this.y, jArr);
            byte[] contract = Field25519.contract(jArr3);
            contract[31] = (byte) ((Ed25519.getLsb(jArr2) << 7) ^ contract[31]);
            return contract;
        }

        public XYZ(long[] jArr, long[] jArr2, long[] jArr3) {
            this.x = jArr;
            this.y = jArr2;
            this.z = jArr3;
        }

        public XYZ(XYZ xyz) {
            this.x = Arrays.copyOf(xyz.x, 10);
            this.y = Arrays.copyOf(xyz.y, 10);
            this.z = Arrays.copyOf(xyz.z, 10);
        }

        public XYZ(PartialXYZT partialXYZT) {
            this();
            fromPartialXYZT(this, partialXYZT);
        }
    }

    /* loaded from: classes4.dex */
    public static class XYZT {
        final long[] t;
        final XYZ xyz;

        public XYZT() {
            this(new XYZ(), new long[10]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static XYZT fromBytesNegateVarTime(byte[] bArr) throws GeneralSecurityException {
            long[] jArr = new long[10];
            long[] expand = Field25519.expand(bArr);
            long[] jArr2 = new long[10];
            jArr2[0] = 1;
            long[] jArr3 = new long[10];
            long[] jArr4 = new long[10];
            long[] jArr5 = new long[10];
            long[] jArr6 = new long[10];
            long[] jArr7 = new long[10];
            Field25519.square(jArr4, expand);
            Field25519.mult(jArr5, jArr4, Ed25519Constants.D);
            Field25519.sub(jArr4, jArr4, jArr2);
            Field25519.sum(jArr5, jArr5, jArr2);
            long[] jArr8 = new long[10];
            Field25519.square(jArr8, jArr5);
            Field25519.mult(jArr8, jArr8, jArr5);
            Field25519.square(jArr, jArr8);
            Field25519.mult(jArr, jArr, jArr5);
            Field25519.mult(jArr, jArr, jArr4);
            Ed25519.pow2252m3(jArr, jArr);
            Field25519.mult(jArr, jArr, jArr8);
            Field25519.mult(jArr, jArr, jArr4);
            Field25519.square(jArr6, jArr);
            Field25519.mult(jArr6, jArr6, jArr5);
            Field25519.sub(jArr7, jArr6, jArr4);
            if (Ed25519.isNonZeroVarTime(jArr7)) {
                Field25519.sum(jArr7, jArr6, jArr4);
                if (!Ed25519.isNonZeroVarTime(jArr7)) {
                    Field25519.mult(jArr, jArr, Ed25519Constants.SQRTM1);
                } else {
                    throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                }
            }
            if (!Ed25519.isNonZeroVarTime(jArr) && ((bArr[31] & UnsignedBytes.MAX_VALUE) >> 7) != 0) {
                throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
            }
            if (Ed25519.getLsb(jArr) == ((bArr[31] & UnsignedBytes.MAX_VALUE) >> 7)) {
                Ed25519.neg(jArr, jArr);
            }
            Field25519.mult(jArr3, jArr, expand);
            return new XYZT(new XYZ(jArr, expand, jArr2), jArr3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @CanIgnoreReturnValue
        public static XYZT fromPartialXYZT(XYZT xyzt, PartialXYZT partialXYZT) {
            Field25519.mult(xyzt.xyz.x, partialXYZT.xyz.x, partialXYZT.t);
            long[] jArr = xyzt.xyz.y;
            XYZ xyz = partialXYZT.xyz;
            Field25519.mult(jArr, xyz.y, xyz.z);
            Field25519.mult(xyzt.xyz.z, partialXYZT.xyz.z, partialXYZT.t);
            long[] jArr2 = xyzt.t;
            XYZ xyz2 = partialXYZT.xyz;
            Field25519.mult(jArr2, xyz2.x, xyz2.y);
            return xyzt;
        }

        public XYZT(XYZ xyz, long[] jArr) {
            this.xyz = xyz;
            this.t = jArr;
        }

        public XYZT(PartialXYZT partialXYZT) {
            this();
            fromPartialXYZT(this, partialXYZT);
        }
    }

    private Ed25519() {
    }

    private static void add(PartialXYZT partialXYZT, XYZT xyzt, CachedXYT cachedXYT) {
        long[] jArr = new long[10];
        long[] jArr2 = partialXYZT.xyz.x;
        XYZ xyz = xyzt.xyz;
        Field25519.sum(jArr2, xyz.y, xyz.x);
        long[] jArr3 = partialXYZT.xyz.y;
        XYZ xyz2 = xyzt.xyz;
        Field25519.sub(jArr3, xyz2.y, xyz2.x);
        long[] jArr4 = partialXYZT.xyz.y;
        Field25519.mult(jArr4, jArr4, cachedXYT.yMinusX);
        XYZ xyz3 = partialXYZT.xyz;
        Field25519.mult(xyz3.z, xyz3.x, cachedXYT.yPlusX);
        Field25519.mult(partialXYZT.t, xyzt.t, cachedXYT.t2d);
        cachedXYT.multByZ(partialXYZT.xyz.x, xyzt.xyz.z);
        long[] jArr5 = partialXYZT.xyz.x;
        Field25519.sum(jArr, jArr5, jArr5);
        XYZ xyz4 = partialXYZT.xyz;
        Field25519.sub(xyz4.x, xyz4.z, xyz4.y);
        XYZ xyz5 = partialXYZT.xyz;
        long[] jArr6 = xyz5.y;
        Field25519.sum(jArr6, xyz5.z, jArr6);
        Field25519.sum(partialXYZT.xyz.z, jArr, partialXYZT.t);
        long[] jArr7 = partialXYZT.t;
        Field25519.sub(jArr7, jArr, jArr7);
    }

    private static XYZ doubleScalarMultVarTime(byte[] bArr, XYZT xyzt, byte[] bArr2) {
        CachedXYZT[] cachedXYZTArr = new CachedXYZT[8];
        cachedXYZTArr[0] = new CachedXYZT(xyzt);
        PartialXYZT partialXYZT = new PartialXYZT();
        doubleXYZT(partialXYZT, xyzt);
        XYZT xyzt2 = new XYZT(partialXYZT);
        for (int i = 1; i < 8; i++) {
            add(partialXYZT, xyzt2, cachedXYZTArr[i - 1]);
            cachedXYZTArr[i] = new CachedXYZT(new XYZT(partialXYZT));
        }
        byte[] slide = slide(bArr);
        byte[] slide2 = slide(bArr2);
        PartialXYZT partialXYZT2 = new PartialXYZT(NEUTRAL);
        XYZT xyzt3 = new XYZT();
        int i2 = 255;
        while (i2 >= 0 && slide[i2] == 0 && slide2[i2] == 0) {
            i2--;
        }
        while (i2 >= 0) {
            doubleXYZ(partialXYZT2, new XYZ(partialXYZT2));
            byte b = slide[i2];
            if (b > 0) {
                add(partialXYZT2, XYZT.fromPartialXYZT(xyzt3, partialXYZT2), cachedXYZTArr[slide[i2] / 2]);
            } else if (b < 0) {
                sub(partialXYZT2, XYZT.fromPartialXYZT(xyzt3, partialXYZT2), cachedXYZTArr[(-slide[i2]) / 2]);
            }
            byte b2 = slide2[i2];
            if (b2 > 0) {
                add(partialXYZT2, XYZT.fromPartialXYZT(xyzt3, partialXYZT2), Ed25519Constants.B2[slide2[i2] / 2]);
            } else if (b2 < 0) {
                sub(partialXYZT2, XYZT.fromPartialXYZT(xyzt3, partialXYZT2), Ed25519Constants.B2[(-slide2[i2]) / 2]);
            }
            i2--;
        }
        return new XYZ(partialXYZT2);
    }

    private static void doubleXYZ(PartialXYZT partialXYZT, XYZ xyz) {
        long[] jArr = new long[10];
        Field25519.square(partialXYZT.xyz.x, xyz.x);
        Field25519.square(partialXYZT.xyz.z, xyz.y);
        Field25519.square(partialXYZT.t, xyz.z);
        long[] jArr2 = partialXYZT.t;
        Field25519.sum(jArr2, jArr2, jArr2);
        Field25519.sum(partialXYZT.xyz.y, xyz.x, xyz.y);
        Field25519.square(jArr, partialXYZT.xyz.y);
        XYZ xyz2 = partialXYZT.xyz;
        Field25519.sum(xyz2.y, xyz2.z, xyz2.x);
        XYZ xyz3 = partialXYZT.xyz;
        long[] jArr3 = xyz3.z;
        Field25519.sub(jArr3, jArr3, xyz3.x);
        XYZ xyz4 = partialXYZT.xyz;
        Field25519.sub(xyz4.x, jArr, xyz4.y);
        long[] jArr4 = partialXYZT.t;
        Field25519.sub(jArr4, jArr4, partialXYZT.xyz.z);
    }

    private static void doubleXYZT(PartialXYZT partialXYZT, XYZT xyzt) {
        doubleXYZ(partialXYZT, xyzt.xyz);
    }

    private static int eq(int i, int i2) {
        int i3 = (~(i ^ i2)) & 255;
        int i4 = i3 & (i3 << 4);
        int i5 = i4 & (i4 << 2);
        return ((i5 & (i5 << 1)) >> 7) & 1;
    }

    public static byte[] getHashedScalar(byte[] bArr) throws GeneralSecurityException {
        MessageDigest engineFactory = EngineFactory.MESSAGE_DIGEST.getInstance("SHA-512");
        engineFactory.update(bArr, 0, 32);
        byte[] digest = engineFactory.digest();
        digest[0] = (byte) (digest[0] & 248);
        byte b = (byte) (digest[31] & Ascii.DEL);
        digest[31] = b;
        digest[31] = (byte) (b | SignedBytes.MAX_POWER_OF_TWO);
        return digest;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getLsb(long[] jArr) {
        return Field25519.contract(jArr)[0] & 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isNonZeroVarTime(long[] jArr) {
        long[] jArr2 = new long[jArr.length + 1];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        Field25519.reduceCoefficients(jArr2);
        for (byte b : Field25519.contract(jArr2)) {
            if (b != 0) {
                return true;
            }
        }
        return false;
    }

    private static boolean isSmallerThanGroupOrder(byte[] bArr) {
        for (int i = 31; i >= 0; i--) {
            int i2 = bArr[i] & UnsignedBytes.MAX_VALUE;
            int i3 = GROUP_ORDER[i] & UnsignedBytes.MAX_VALUE;
            if (i2 != i3) {
                if (i2 >= i3) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    private static long load3(byte[] bArr, int i) {
        return ((bArr[i + 2] & UnsignedBytes.MAX_VALUE) << 16) | (bArr[i] & 255) | ((bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 8);
    }

    private static long load4(byte[] bArr, int i) {
        return ((bArr[i + 3] & UnsignedBytes.MAX_VALUE) << 24) | load3(bArr, i);
    }

    private static void mulAdd(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        long load3 = load3(bArr2, 0) & 2097151;
        long load4 = (load4(bArr2, 2) >> 5) & 2097151;
        long load32 = (load3(bArr2, 5) >> 2) & 2097151;
        long load42 = (load4(bArr2, 7) >> 7) & 2097151;
        long load43 = (load4(bArr2, 10) >> 4) & 2097151;
        long load33 = (load3(bArr2, 13) >> 1) & 2097151;
        long load44 = (load4(bArr2, 15) >> 6) & 2097151;
        long load34 = (load3(bArr2, 18) >> 3) & 2097151;
        long load35 = load3(bArr2, 21) & 2097151;
        long load45 = (load4(bArr2, 23) >> 5) & 2097151;
        long load36 = (load3(bArr2, 26) >> 2) & 2097151;
        long load46 = load4(bArr2, 28) >> 7;
        long load37 = load3(bArr3, 0) & 2097151;
        long load47 = (load4(bArr3, 2) >> 5) & 2097151;
        long load38 = (load3(bArr3, 5) >> 2) & 2097151;
        long load48 = (load4(bArr3, 7) >> 7) & 2097151;
        long load49 = (load4(bArr3, 10) >> 4) & 2097151;
        long load39 = (load3(bArr3, 13) >> 1) & 2097151;
        long load410 = (load4(bArr3, 15) >> 6) & 2097151;
        long load310 = (load3(bArr3, 18) >> 3) & 2097151;
        long load311 = load3(bArr3, 21) & 2097151;
        long load411 = (load4(bArr3, 23) >> 5) & 2097151;
        long load312 = (load3(bArr3, 26) >> 2) & 2097151;
        long load412 = load4(bArr3, 28) >> 7;
        long load313 = (load3(bArr4, 26) >> 2) & 2097151;
        long load314 = (load3 * load37) + (load3(bArr4, 0) & 2097151);
        long load413 = (load4 * load37) + (load3 * load47) + ((load4(bArr4, 2) >> 5) & 2097151);
        long load315 = (load32 * load37) + (load4 * load47) + (load3 * load38) + ((load3(bArr4, 5) >> 2) & 2097151);
        long load414 = (load42 * load37) + (load32 * load47) + (load4 * load38) + (load3 * load48) + ((load4(bArr4, 7) >> 7) & 2097151);
        long load415 = (load43 * load37) + (load42 * load47) + (load32 * load38) + (load4 * load48) + (load3 * load49) + ((load4(bArr4, 10) >> 4) & 2097151);
        long load316 = (load33 * load37) + (load43 * load47) + (load42 * load38) + (load32 * load48) + (load4 * load49) + (load3 * load39) + ((load3(bArr4, 13) >> 1) & 2097151);
        long load416 = (load44 * load37) + (load33 * load47) + (load43 * load38) + (load42 * load48) + (load32 * load49) + (load4 * load39) + (load3 * load410) + ((load4(bArr4, 15) >> 6) & 2097151);
        long load317 = (load34 * load37) + (load44 * load47) + (load33 * load38) + (load43 * load48) + (load42 * load49) + (load32 * load39) + (load4 * load410) + (load3 * load310) + ((load3(bArr4, 18) >> 3) & 2097151);
        long load318 = (load35 * load37) + (load34 * load47) + (load44 * load38) + (load33 * load48) + (load43 * load49) + (load42 * load39) + (load32 * load410) + (load4 * load310) + (load3 * load311) + (load3(bArr4, 21) & 2097151);
        long load417 = (load45 * load37) + (load35 * load47) + (load34 * load38) + (load44 * load48) + (load33 * load49) + (load43 * load39) + (load42 * load410) + (load32 * load310) + (load4 * load311) + (load3 * load411) + ((load4(bArr4, 23) >> 5) & 2097151);
        long j = (load36 * load37) + (load45 * load47) + (load35 * load38) + (load34 * load48) + (load44 * load49) + (load33 * load39) + (load43 * load410) + (load42 * load310) + (load32 * load311) + (load4 * load411) + (load3 * load312) + load313;
        long j2 = load37 * load46;
        long load418 = j2 + (load36 * load47) + (load45 * load38) + (load35 * load48) + (load34 * load49) + (load44 * load39) + (load33 * load410) + (load43 * load310) + (load42 * load311) + (load32 * load411) + (load4 * load312) + (load3 * load412) + (load4(bArr4, 28) >> 7);
        long j3 = load42 * load411;
        long j4 = load47 * load46;
        long j5 = j4 + (load36 * load38) + (load45 * load48) + (load35 * load49) + (load34 * load39) + (load44 * load410) + (load33 * load310) + (load43 * load311) + j3 + (load32 * load312) + (load4 * load412);
        long j6 = load43 * load411;
        long j7 = load38 * load46;
        long j8 = j7 + (load36 * load48) + (load45 * load49) + (load35 * load39) + (load34 * load410) + (load44 * load310) + (load33 * load311) + j6 + (load42 * load312) + (load32 * load412);
        long j9 = load33 * load411;
        long j10 = load48 * load46;
        long j11 = j10 + (load36 * load49) + (load45 * load39) + (load35 * load410) + (load34 * load310) + (load44 * load311) + j9 + (load43 * load312) + (load42 * load412);
        long j12 = load44 * load411;
        long j13 = load49 * load46;
        long j14 = j13 + (load36 * load39) + (load45 * load410) + (load35 * load310) + (load34 * load311) + j12 + (load33 * load312) + (load43 * load412);
        long j15 = load34 * load411;
        long j16 = load39 * load46;
        long j17 = j16 + (load36 * load410) + (load45 * load310) + (load35 * load311) + j15 + (load44 * load312) + (load33 * load412);
        long j18 = load35 * load411;
        long j19 = load410 * load46;
        long j20 = j19 + (load36 * load310) + (load45 * load311) + j18 + (load34 * load312) + (load44 * load412);
        long j21 = load45 * load411;
        long j22 = load310 * load46;
        long j23 = j22 + (load36 * load311) + j21 + (load35 * load312) + (load34 * load412);
        long j24 = load45 * load312;
        long j25 = load36 * load411;
        long j26 = load311 * load46;
        long j27 = load411 * load46;
        long j28 = j27 + (load36 * load312) + (load45 * load412);
        long j29 = load312 * load46;
        long j30 = load46 * load412;
        long j31 = (load314 + 1048576) >> 21;
        long j32 = load413 + j31;
        long j33 = load314 - (j31 << 21);
        long j34 = (load315 + 1048576) >> 21;
        long j35 = load414 + j34;
        long j36 = load315 - (j34 << 21);
        long j37 = (load415 + 1048576) >> 21;
        long j38 = load316 + j37;
        long j39 = load415 - (j37 << 21);
        long j40 = (load416 + 1048576) >> 21;
        long j41 = load317 + j40;
        long j42 = load416 - (j40 << 21);
        long j43 = (load318 + 1048576) >> 21;
        long j44 = load417 + j43;
        long j45 = load318 - (j43 << 21);
        long j46 = (j + 1048576) >> 21;
        long j47 = load418 + j46;
        long j48 = j - (j46 << 21);
        long j49 = (j5 + 1048576) >> 21;
        long j50 = j8 + j49;
        long j51 = j5 - (j49 << 21);
        long j52 = (j11 + 1048576) >> 21;
        long j53 = j14 + j52;
        long j54 = j11 - (j52 << 21);
        long j55 = (j17 + 1048576) >> 21;
        long j56 = j20 + j55;
        long j57 = j17 - (j55 << 21);
        long j58 = (j23 + 1048576) >> 21;
        long j59 = j26 + j25 + j24 + (load35 * load412) + j58;
        long j60 = j23 - (j58 << 21);
        long j61 = (j28 + 1048576) >> 21;
        long j62 = j29 + (load36 * load412) + j61;
        long j63 = j28 - (j61 << 21);
        long j64 = (j30 + 1048576) >> 21;
        long j65 = 0 + j64;
        long j66 = j30 - (j64 << 21);
        long j67 = (j32 + 1048576) >> 21;
        long j68 = j36 + j67;
        long j69 = j32 - (j67 << 21);
        long j70 = (j35 + 1048576) >> 21;
        long j71 = j39 + j70;
        long j72 = j35 - (j70 << 21);
        long j73 = (j38 + 1048576) >> 21;
        long j74 = j42 + j73;
        long j75 = j38 - (j73 << 21);
        long j76 = (j41 + 1048576) >> 21;
        long j77 = j45 + j76;
        long j78 = j41 - (j76 << 21);
        long j79 = (j44 + 1048576) >> 21;
        long j80 = j48 + j79;
        long j81 = j44 - (j79 << 21);
        long j82 = (j47 + 1048576) >> 21;
        long j83 = j51 + j82;
        long j84 = j47 - (j82 << 21);
        long j85 = (j50 + 1048576) >> 21;
        long j86 = j54 + j85;
        long j87 = j50 - (j85 << 21);
        long j88 = (j53 + 1048576) >> 21;
        long j89 = j57 + j88;
        long j90 = j53 - (j88 << 21);
        long j91 = (j56 + 1048576) >> 21;
        long j92 = j60 + j91;
        long j93 = j56 - (j91 << 21);
        long j94 = (j59 + 1048576) >> 21;
        long j95 = j63 + j94;
        long j96 = j59 - (j94 << 21);
        long j97 = (j62 + 1048576) >> 21;
        long j98 = j66 + j97;
        long j99 = j62 - (j97 << 21);
        long j100 = j89 - (j65 * 683901);
        long j101 = ((j65 * 654183) + j87) - (j98 * 997805);
        long j102 = j98 * 136657;
        long j103 = ((j65 * 136657) + j90) - (j98 * 683901);
        long j104 = (j99 * 654183) + (j98 * 470296) + (j65 * 666643) + j84;
        long j105 = (j99 * 136657) + j101;
        long j106 = (j102 + (j86 - (j65 * 997805))) - (j99 * 683901);
        long j107 = (j95 * 654183) + (j99 * 470296) + (j98 * 666643) + j80;
        long j108 = (j96 * 654183) + (j95 * 470296) + (j99 * 666643) + j81;
        long j109 = (j96 * 136657) + (j104 - (j95 * 997805));
        long j110 = ((j95 * 136657) + (((j98 * 654183) + ((j65 * 470296) + j83)) - (j99 * 997805))) - (j96 * 683901);
        long j111 = (j92 * 666643) + j74;
        long j112 = (j92 * 654183) + (j96 * 470296) + (j95 * 666643) + j77;
        long j113 = (j92 * 136657) + (j107 - (j96 * 997805));
        long j114 = (j111 + 1048576) >> 21;
        long j115 = (j92 * 470296) + (j96 * 666643) + j78 + j114;
        long j116 = j111 - (j114 << 21);
        long j117 = (j112 + 1048576) >> 21;
        long j118 = (j108 - (j92 * 997805)) + j117;
        long j119 = j112 - (j117 << 21);
        long j120 = (j113 + 1048576) >> 21;
        long j121 = (j109 - (j92 * 683901)) + j120;
        long j122 = j113 - (j120 << 21);
        long j123 = (j110 + 1048576) >> 21;
        long j124 = (j105 - (j95 * 683901)) + j123;
        long j125 = j110 - (j123 << 21);
        long j126 = (j106 + 1048576) >> 21;
        long j127 = j103 + j126;
        long j128 = j106 - (j126 << 21);
        long j129 = (j100 + 1048576) >> 21;
        long j130 = j93 + j129;
        long j131 = j100 - (j129 << 21);
        long j132 = (j115 + 1048576) >> 21;
        long j133 = j119 + j132;
        long j134 = j115 - (j132 << 21);
        long j135 = (j118 + 1048576) >> 21;
        long j136 = j122 + j135;
        long j137 = j118 - (j135 << 21);
        long j138 = (j121 + 1048576) >> 21;
        long j139 = j125 + j138;
        long j140 = j121 - (j138 << 21);
        long j141 = (j124 + 1048576) >> 21;
        long j142 = j128 + j141;
        long j143 = j124 - (j141 << 21);
        long j144 = (j127 + 1048576) >> 21;
        long j145 = j131 + j144;
        long j146 = j127 - (j144 << 21);
        long j147 = (j130 * 470296) + j116;
        long j148 = (j130 * 654183) + j134;
        long j149 = j136 - (j130 * 683901);
        long j150 = (j145 * 654183) + j147;
        long j151 = j148 - (j145 * 997805);
        long j152 = (j145 * 136657) + (j133 - (j130 * 997805));
        long j153 = ((j130 * 136657) + j137) - (j145 * 683901);
        long j154 = (j146 * 654183) + (j145 * 470296) + (j130 * 666643) + j75;
        long j155 = j150 - (j146 * 997805);
        long j156 = (j146 * 136657) + j151;
        long j157 = j152 - (j146 * 683901);
        long j158 = (j142 * 654183) + (j146 * 470296) + (j145 * 666643) + j71;
        long j159 = (j142 * 136657) + j155;
        long j160 = j156 - (j142 * 683901);
        long j161 = (j143 * 654183) + (j142 * 470296) + (j146 * 666643) + j72;
        long j162 = j158 - (j143 * 997805);
        long j163 = (j143 * 136657) + (j154 - (j142 * 997805));
        long j164 = j159 - (j143 * 683901);
        long j165 = (j139 * 666643) + j33;
        long j166 = (j139 * 654183) + (j143 * 470296) + (j142 * 666643) + j68;
        long j167 = (j139 * 136657) + j162;
        long j168 = (j165 + 1048576) >> 21;
        long j169 = (j139 * 470296) + (j143 * 666643) + j69 + j168;
        long j170 = j165 - (j168 << 21);
        long j171 = (j166 + 1048576) >> 21;
        long j172 = (j161 - (j139 * 997805)) + j171;
        long j173 = j166 - (j171 << 21);
        long j174 = (j167 + 1048576) >> 21;
        long j175 = (j163 - (j139 * 683901)) + j174;
        long j176 = j167 - (j174 << 21);
        long j177 = (j164 + 1048576) >> 21;
        long j178 = j160 + j177;
        long j179 = j164 - (j177 << 21);
        long j180 = (j157 + 1048576) >> 21;
        long j181 = j153 + j180;
        long j182 = j157 - (j180 << 21);
        long j183 = (j149 + 1048576) >> 21;
        long j184 = j140 + j183;
        long j185 = j149 - (j183 << 21);
        long j186 = (j169 + 1048576) >> 21;
        long j187 = j173 + j186;
        long j188 = j169 - (j186 << 21);
        long j189 = (j172 + 1048576) >> 21;
        long j190 = j176 + j189;
        long j191 = j172 - (j189 << 21);
        long j192 = (j175 + 1048576) >> 21;
        long j193 = j179 + j192;
        long j194 = j175 - (j192 << 21);
        long j195 = (j178 + 1048576) >> 21;
        long j196 = j182 + j195;
        long j197 = j178 - (j195 << 21);
        long j198 = (j181 + 1048576) >> 21;
        long j199 = j185 + j198;
        long j200 = j181 - (j198 << 21);
        long j201 = (j184 + 1048576) >> 21;
        long j202 = 0 + j201;
        long j203 = j184 - (j201 << 21);
        long j204 = (j202 * 666643) + j170;
        long j205 = (j202 * 470296) + j188;
        long j206 = (j202 * 654183) + j187;
        long j207 = (j202 * 136657) + j190;
        long j208 = j204 >> 21;
        long j209 = j205 + j208;
        long j210 = j204 - (j208 << 21);
        long j211 = j209 >> 21;
        long j212 = j206 + j211;
        long j213 = j209 - (j211 << 21);
        long j214 = j212 >> 21;
        long j215 = (j191 - (j202 * 997805)) + j214;
        long j216 = j212 - (j214 << 21);
        long j217 = j215 >> 21;
        long j218 = j207 + j217;
        long j219 = j215 - (j217 << 21);
        long j220 = j218 >> 21;
        long j221 = (j194 - (j202 * 683901)) + j220;
        long j222 = j218 - (j220 << 21);
        long j223 = j221 >> 21;
        long j224 = j193 + j223;
        long j225 = j221 - (j223 << 21);
        long j226 = j224 >> 21;
        long j227 = j197 + j226;
        long j228 = j224 - (j226 << 21);
        long j229 = j227 >> 21;
        long j230 = j196 + j229;
        long j231 = j227 - (j229 << 21);
        long j232 = j230 >> 21;
        long j233 = j200 + j232;
        long j234 = j230 - (j232 << 21);
        long j235 = j233 >> 21;
        long j236 = j199 + j235;
        long j237 = j233 - (j235 << 21);
        long j238 = j236 >> 21;
        long j239 = j203 + j238;
        long j240 = j236 - (j238 << 21);
        long j241 = j239 >> 21;
        long j242 = j241 + 0;
        long j243 = (666643 * j242) + j210;
        long j244 = (470296 * j242) + j213;
        long j245 = j243 >> 21;
        long j246 = j244 + j245;
        long j247 = j243 - (j245 << 21);
        long j248 = j246 >> 21;
        long j249 = (654183 * j242) + j216 + j248;
        long j250 = j246 - (j248 << 21);
        long j251 = j249 >> 21;
        long j252 = (j219 - (997805 * j242)) + j251;
        long j253 = j249 - (j251 << 21);
        long j254 = j252 >> 21;
        long j255 = (136657 * j242) + j222 + j254;
        long j256 = j252 - (j254 << 21);
        long j257 = j255 >> 21;
        long j258 = (j225 - (j242 * 683901)) + j257;
        long j259 = j255 - (j257 << 21);
        long j260 = j258 >> 21;
        long j261 = j228 + j260;
        long j262 = j258 - (j260 << 21);
        long j263 = j261 >> 21;
        long j264 = j231 + j263;
        long j265 = j261 - (j263 << 21);
        long j266 = j264 >> 21;
        long j267 = j234 + j266;
        long j268 = j264 - (j266 << 21);
        long j269 = j267 >> 21;
        long j270 = j237 + j269;
        long j271 = j267 - (j269 << 21);
        long j272 = j270 >> 21;
        long j273 = j240 + j272;
        long j274 = j270 - (j272 << 21);
        long j275 = j273 >> 21;
        long j276 = (j239 - (j241 << 21)) + j275;
        long j277 = j273 - (j275 << 21);
        bArr[0] = (byte) j247;
        bArr[1] = (byte) (j247 >> 8);
        bArr[2] = (byte) ((j247 >> 16) | (j250 << 5));
        bArr[3] = (byte) (j250 >> 3);
        bArr[4] = (byte) (j250 >> 11);
        bArr[5] = (byte) ((j250 >> 19) | (j253 << 2));
        bArr[6] = (byte) (j253 >> 6);
        bArr[7] = (byte) ((j253 >> 14) | (j256 << 7));
        bArr[8] = (byte) (j256 >> 1);
        bArr[9] = (byte) (j256 >> 9);
        bArr[10] = (byte) ((j256 >> 17) | (j259 << 4));
        bArr[11] = (byte) (j259 >> 4);
        bArr[12] = (byte) (j259 >> 12);
        bArr[13] = (byte) ((j259 >> 20) | (j262 << 1));
        bArr[14] = (byte) (j262 >> 7);
        bArr[15] = (byte) ((j262 >> 15) | (j265 << 6));
        bArr[16] = (byte) (j265 >> 2);
        bArr[17] = (byte) (j265 >> 10);
        bArr[18] = (byte) ((j265 >> 18) | (j268 << 3));
        bArr[19] = (byte) (j268 >> 5);
        bArr[20] = (byte) (j268 >> 13);
        bArr[21] = (byte) j271;
        bArr[22] = (byte) (j271 >> 8);
        bArr[23] = (byte) ((j271 >> 16) | (j274 << 5));
        bArr[24] = (byte) (j274 >> 3);
        bArr[25] = (byte) (j274 >> 11);
        bArr[26] = (byte) ((j274 >> 19) | (j277 << 2));
        bArr[27] = (byte) (j277 >> 6);
        bArr[28] = (byte) ((j277 >> 14) | (j276 << 7));
        bArr[29] = (byte) (j276 >> 1);
        bArr[30] = (byte) (j276 >> 9);
        bArr[31] = (byte) (j276 >> 17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void neg(long[] jArr, long[] jArr2) {
        for (int i = 0; i < jArr2.length; i++) {
            jArr[i] = -jArr2[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void pow2252m3(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        Field25519.square(jArr3, jArr2);
        Field25519.square(jArr4, jArr3);
        Field25519.square(jArr4, jArr4);
        Field25519.mult(jArr4, jArr2, jArr4);
        Field25519.mult(jArr3, jArr3, jArr4);
        Field25519.square(jArr3, jArr3);
        Field25519.mult(jArr3, jArr4, jArr3);
        Field25519.square(jArr4, jArr3);
        for (int i = 1; i < 5; i++) {
            Field25519.square(jArr4, jArr4);
        }
        Field25519.mult(jArr3, jArr4, jArr3);
        Field25519.square(jArr4, jArr3);
        for (int i2 = 1; i2 < 10; i2++) {
            Field25519.square(jArr4, jArr4);
        }
        Field25519.mult(jArr4, jArr4, jArr3);
        Field25519.square(jArr5, jArr4);
        for (int i3 = 1; i3 < 20; i3++) {
            Field25519.square(jArr5, jArr5);
        }
        Field25519.mult(jArr4, jArr5, jArr4);
        Field25519.square(jArr4, jArr4);
        for (int i4 = 1; i4 < 10; i4++) {
            Field25519.square(jArr4, jArr4);
        }
        Field25519.mult(jArr3, jArr4, jArr3);
        Field25519.square(jArr4, jArr3);
        for (int i5 = 1; i5 < 50; i5++) {
            Field25519.square(jArr4, jArr4);
        }
        Field25519.mult(jArr4, jArr4, jArr3);
        Field25519.square(jArr5, jArr4);
        for (int i6 = 1; i6 < 100; i6++) {
            Field25519.square(jArr5, jArr5);
        }
        Field25519.mult(jArr4, jArr5, jArr4);
        Field25519.square(jArr4, jArr4);
        for (int i7 = 1; i7 < 50; i7++) {
            Field25519.square(jArr4, jArr4);
        }
        Field25519.mult(jArr3, jArr4, jArr3);
        Field25519.square(jArr3, jArr3);
        Field25519.square(jArr3, jArr3);
        Field25519.mult(jArr, jArr3, jArr2);
    }

    private static void reduce(byte[] bArr) {
        long load3 = (load3(bArr, 47) >> 2) & 2097151;
        long load4 = (load4(bArr, 49) >> 7) & 2097151;
        long load42 = (load4(bArr, 52) >> 4) & 2097151;
        long load32 = (load3(bArr, 55) >> 1) & 2097151;
        long load43 = (load4(bArr, 57) >> 6) & 2097151;
        long load44 = load4(bArr, 60) >> 3;
        long j = load44 * 666643;
        long j2 = load44 * 470296;
        long j3 = load44 * 654183;
        long j4 = load44 * 136657;
        long load33 = (load3(bArr, 42) & 2097151) - (load44 * 683901);
        long load34 = (load43 * 666643) + ((load3(bArr, 26) >> 2) & 2097151);
        long load45 = (load43 * 470296) + j + ((load4(bArr, 28) >> 7) & 2097151);
        long load46 = (load43 * 654183) + j2 + ((load4(bArr, 31) >> 4) & 2097151);
        long load35 = (j3 + ((load3(bArr, 34) >> 1) & 2097151)) - (load43 * 997805);
        long load47 = (load43 * 136657) + (((load4(bArr, 36) >> 6) & 2097151) - (load44 * 997805));
        long load36 = (j4 + ((load3(bArr, 39) >> 3) & 2097151)) - (load43 * 683901);
        long load48 = (load32 * 666643) + ((load4(bArr, 23) >> 5) & 2097151);
        long j5 = (load32 * 654183) + load45;
        long j6 = load46 - (load32 * 997805);
        long j7 = load47 - (load32 * 683901);
        long load37 = (load42 * 666643) + (load3(bArr, 21) & 2097151);
        long j8 = (load42 * 470296) + load48;
        long j9 = (load42 * 654183) + (load32 * 470296) + load34;
        long j10 = j5 - (load42 * 997805);
        long j11 = ((load32 * 136657) + load35) - (load42 * 683901);
        long load38 = (load4 * 666643) + ((load3(bArr, 18) >> 3) & 2097151);
        long j12 = (load4 * 470296) + load37;
        long j13 = (load4 * 654183) + j8;
        long j14 = j9 - (load4 * 997805);
        long j15 = (load4 * 136657) + j10;
        long j16 = ((load42 * 136657) + j6) - (load4 * 683901);
        long load49 = (load3 * 666643) + ((load4(bArr, 15) >> 6) & 2097151);
        long j17 = (load3 * 654183) + j12;
        long j18 = j13 - (load3 * 997805);
        long j19 = (load3 * 136657) + j14;
        long j20 = j15 - (load3 * 683901);
        long j21 = (load49 + 1048576) >> 21;
        long j22 = (load3 * 470296) + load38 + j21;
        long j23 = load49 - (j21 << 21);
        long j24 = (j17 + 1048576) >> 21;
        long j25 = j18 + j24;
        long j26 = j17 - (j24 << 21);
        long j27 = (j19 + 1048576) >> 21;
        long j28 = j20 + j27;
        long j29 = j19 - (j27 << 21);
        long j30 = (j16 + 1048576) >> 21;
        long j31 = j11 + j30;
        long j32 = j16 - (j30 << 21);
        long j33 = (j7 + 1048576) >> 21;
        long j34 = load36 + j33;
        long j35 = j7 - (j33 << 21);
        long j36 = (load33 + 1048576) >> 21;
        long load410 = ((load4(bArr, 44) >> 5) & 2097151) + j36;
        long j37 = load33 - (j36 << 21);
        long j38 = (j22 + 1048576) >> 21;
        long j39 = j26 + j38;
        long j40 = j22 - (j38 << 21);
        long j41 = (j25 + 1048576) >> 21;
        long j42 = j29 + j41;
        long j43 = j25 - (j41 << 21);
        long j44 = (j28 + 1048576) >> 21;
        long j45 = j32 + j44;
        long j46 = j28 - (j44 << 21);
        long j47 = (j31 + 1048576) >> 21;
        long j48 = j35 + j47;
        long j49 = j31 - (j47 << 21);
        long j50 = (j34 + 1048576) >> 21;
        long j51 = j37 + j50;
        long j52 = j34 - (j50 << 21);
        long j53 = (load410 * 470296) + j23;
        long j54 = (load410 * 654183) + j40;
        long j55 = j39 - (load410 * 997805);
        long j56 = j42 - (load410 * 683901);
        long j57 = j51 * 666643;
        long load39 = (j51 * 470296) + (load410 * 666643) + ((load3(bArr, 13) >> 1) & 2097151);
        long j58 = (j51 * 654183) + j53;
        long j59 = j54 - (j51 * 997805);
        long j60 = ((load410 * 136657) + j43) - (j51 * 683901);
        long load411 = (j52 * 666643) + ((load4(bArr, 7) >> 7) & 2097151);
        long load412 = (j52 * 470296) + j57 + ((load4(bArr, 10) >> 4) & 2097151);
        long j61 = (j52 * 654183) + load39;
        long j62 = (j52 * 136657) + j59;
        long j63 = ((j51 * 136657) + j55) - (j52 * 683901);
        long load310 = (j48 * 666643) + ((load3(bArr, 5) >> 2) & 2097151);
        long j64 = (j48 * 470296) + load411;
        long j65 = (j48 * 654183) + load412;
        long j66 = (j48 * 136657) + (j58 - (j52 * 997805));
        long load413 = (j49 * 666643) + ((load4(bArr, 2) >> 5) & 2097151);
        long j67 = (j49 * 470296) + load310;
        long j68 = (j49 * 654183) + j64;
        long j69 = j65 - (j49 * 997805);
        long j70 = (j49 * 136657) + (j61 - (j48 * 997805));
        long j71 = j66 - (j49 * 683901);
        long load311 = (j45 * 666643) + (load3(bArr, 0) & 2097151);
        long j72 = (j45 * 654183) + j67;
        long j73 = (j45 * 136657) + j69;
        long j74 = (load311 + 1048576) >> 21;
        long j75 = (j45 * 470296) + load413 + j74;
        long j76 = load311 - (j74 << 21);
        long j77 = (j72 + 1048576) >> 21;
        long j78 = (j68 - (j45 * 997805)) + j77;
        long j79 = j72 - (j77 << 21);
        long j80 = (j73 + 1048576) >> 21;
        long j81 = (j70 - (j45 * 683901)) + j80;
        long j82 = j73 - (j80 << 21);
        long j83 = (j71 + 1048576) >> 21;
        long j84 = (j62 - (j48 * 683901)) + j83;
        long j85 = j71 - (j83 << 21);
        long j86 = (j63 + 1048576) >> 21;
        long j87 = j60 + j86;
        long j88 = j63 - (j86 << 21);
        long j89 = (j56 + 1048576) >> 21;
        long j90 = j46 + j89;
        long j91 = j56 - (j89 << 21);
        long j92 = (j75 + 1048576) >> 21;
        long j93 = j79 + j92;
        long j94 = j75 - (j92 << 21);
        long j95 = (j78 + 1048576) >> 21;
        long j96 = j82 + j95;
        long j97 = j78 - (j95 << 21);
        long j98 = (j81 + 1048576) >> 21;
        long j99 = j85 + j98;
        long j100 = j81 - (j98 << 21);
        long j101 = (j84 + 1048576) >> 21;
        long j102 = j88 + j101;
        long j103 = j84 - (j101 << 21);
        long j104 = (j87 + 1048576) >> 21;
        long j105 = j91 + j104;
        long j106 = j87 - (j104 << 21);
        long j107 = (j90 + 1048576) >> 21;
        long j108 = j107 + 0;
        long j109 = j90 - (j107 << 21);
        long j110 = (j108 * 666643) + j76;
        long j111 = j110 >> 21;
        long j112 = (j108 * 470296) + j94 + j111;
        long j113 = j110 - (j111 << 21);
        long j114 = j112 >> 21;
        long j115 = (j108 * 654183) + j93 + j114;
        long j116 = j112 - (j114 << 21);
        long j117 = j115 >> 21;
        long j118 = (j97 - (j108 * 997805)) + j117;
        long j119 = j115 - (j117 << 21);
        long j120 = j118 >> 21;
        long j121 = (j108 * 136657) + j96 + j120;
        long j122 = j118 - (j120 << 21);
        long j123 = j121 >> 21;
        long j124 = (j100 - (j108 * 683901)) + j123;
        long j125 = j121 - (j123 << 21);
        long j126 = j124 >> 21;
        long j127 = j99 + j126;
        long j128 = j124 - (j126 << 21);
        long j129 = j127 >> 21;
        long j130 = j103 + j129;
        long j131 = j127 - (j129 << 21);
        long j132 = j130 >> 21;
        long j133 = j102 + j132;
        long j134 = j130 - (j132 << 21);
        long j135 = j133 >> 21;
        long j136 = j106 + j135;
        long j137 = j133 - (j135 << 21);
        long j138 = j136 >> 21;
        long j139 = j105 + j138;
        long j140 = j136 - (j138 << 21);
        long j141 = j139 >> 21;
        long j142 = j109 + j141;
        long j143 = j139 - (j141 << 21);
        long j144 = j142 >> 21;
        long j145 = j144 + 0;
        long j146 = (666643 * j145) + j113;
        long j147 = j146 >> 21;
        long j148 = (470296 * j145) + j116 + j147;
        long j149 = j146 - (j147 << 21);
        long j150 = j148 >> 21;
        long j151 = (654183 * j145) + j119 + j150;
        long j152 = j148 - (j150 << 21);
        long j153 = j151 >> 21;
        long j154 = (j122 - (997805 * j145)) + j153;
        long j155 = j151 - (j153 << 21);
        long j156 = j154 >> 21;
        long j157 = (136657 * j145) + j125 + j156;
        long j158 = j154 - (j156 << 21);
        long j159 = j157 >> 21;
        long j160 = (j128 - (j145 * 683901)) + j159;
        long j161 = j157 - (j159 << 21);
        long j162 = j160 >> 21;
        long j163 = j131 + j162;
        long j164 = j160 - (j162 << 21);
        long j165 = j163 >> 21;
        long j166 = j134 + j165;
        long j167 = j163 - (j165 << 21);
        long j168 = j166 >> 21;
        long j169 = j137 + j168;
        long j170 = j166 - (j168 << 21);
        long j171 = j169 >> 21;
        long j172 = j140 + j171;
        long j173 = j169 - (j171 << 21);
        long j174 = j172 >> 21;
        long j175 = j143 + j174;
        long j176 = j172 - (j174 << 21);
        long j177 = j175 >> 21;
        long j178 = (j142 - (j144 << 21)) + j177;
        long j179 = j175 - (j177 << 21);
        bArr[0] = (byte) j149;
        bArr[1] = (byte) (j149 >> 8);
        bArr[2] = (byte) ((j149 >> 16) | (j152 << 5));
        bArr[3] = (byte) (j152 >> 3);
        bArr[4] = (byte) (j152 >> 11);
        bArr[5] = (byte) ((j152 >> 19) | (j155 << 2));
        bArr[6] = (byte) (j155 >> 6);
        bArr[7] = (byte) ((j155 >> 14) | (j158 << 7));
        bArr[8] = (byte) (j158 >> 1);
        bArr[9] = (byte) (j158 >> 9);
        bArr[10] = (byte) ((j158 >> 17) | (j161 << 4));
        bArr[11] = (byte) (j161 >> 4);
        bArr[12] = (byte) (j161 >> 12);
        bArr[13] = (byte) ((j161 >> 20) | (j164 << 1));
        bArr[14] = (byte) (j164 >> 7);
        bArr[15] = (byte) ((j164 >> 15) | (j167 << 6));
        bArr[16] = (byte) (j167 >> 2);
        bArr[17] = (byte) (j167 >> 10);
        bArr[18] = (byte) ((j167 >> 18) | (j170 << 3));
        bArr[19] = (byte) (j170 >> 5);
        bArr[20] = (byte) (j170 >> 13);
        bArr[21] = (byte) j173;
        bArr[22] = (byte) (j173 >> 8);
        bArr[23] = (byte) ((j173 >> 16) | (j176 << 5));
        bArr[24] = (byte) (j176 >> 3);
        bArr[25] = (byte) (j176 >> 11);
        bArr[26] = (byte) ((j176 >> 19) | (j179 << 2));
        bArr[27] = (byte) (j179 >> 6);
        bArr[28] = (byte) ((j179 >> 14) | (j178 << 7));
        bArr[29] = (byte) (j178 >> 1);
        bArr[30] = (byte) (j178 >> 9);
        bArr[31] = (byte) (j178 >> 17);
    }

    private static XYZ scalarMultWithBase(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[64];
        int i2 = 0;
        while (true) {
            if (i2 >= 32) {
                break;
            }
            int i3 = i2 * 2;
            bArr2[i3 + 0] = (byte) (((bArr[i2] & UnsignedBytes.MAX_VALUE) >> 0) & 15);
            bArr2[i3 + 1] = (byte) (((bArr[i2] & UnsignedBytes.MAX_VALUE) >> 4) & 15);
            i2++;
        }
        int i4 = 0;
        byte b = 0;
        while (i4 < 63) {
            byte b2 = (byte) (bArr2[i4] + b);
            bArr2[i4] = b2;
            int i5 = (b2 + 8) >> 4;
            bArr2[i4] = (byte) (b2 - (i5 << 4));
            i4++;
            b = i5;
        }
        bArr2[63] = (byte) (bArr2[63] + b);
        PartialXYZT partialXYZT = new PartialXYZT(NEUTRAL);
        XYZT xyzt = new XYZT();
        for (i = 1; i < 64; i += 2) {
            CachedXYT cachedXYT = new CachedXYT(CACHED_NEUTRAL);
            select(cachedXYT, i / 2, bArr2[i]);
            add(partialXYZT, XYZT.fromPartialXYZT(xyzt, partialXYZT), cachedXYT);
        }
        XYZ xyz = new XYZ();
        doubleXYZ(partialXYZT, XYZ.fromPartialXYZT(xyz, partialXYZT));
        doubleXYZ(partialXYZT, XYZ.fromPartialXYZT(xyz, partialXYZT));
        doubleXYZ(partialXYZT, XYZ.fromPartialXYZT(xyz, partialXYZT));
        doubleXYZ(partialXYZT, XYZ.fromPartialXYZT(xyz, partialXYZT));
        for (int i6 = 0; i6 < 64; i6 += 2) {
            CachedXYT cachedXYT2 = new CachedXYT(CACHED_NEUTRAL);
            select(cachedXYT2, i6 / 2, bArr2[i6]);
            add(partialXYZT, XYZT.fromPartialXYZT(xyzt, partialXYZT), cachedXYT2);
        }
        XYZ xyz2 = new XYZ(partialXYZT);
        if (xyz2.isOnCurve()) {
            return xyz2;
        }
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }

    public static byte[] scalarMultWithBaseToBytes(byte[] bArr) {
        return scalarMultWithBase(bArr).toBytes();
    }

    private static void select(CachedXYT cachedXYT, int i, byte b) {
        int i2 = (b & UnsignedBytes.MAX_VALUE) >> 7;
        int i3 = b - (((-i2) & b) << 1);
        CachedXYT[][] cachedXYTArr = Ed25519Constants.B_TABLE;
        cachedXYT.copyConditional(cachedXYTArr[i][0], eq(i3, 1));
        cachedXYT.copyConditional(cachedXYTArr[i][1], eq(i3, 2));
        cachedXYT.copyConditional(cachedXYTArr[i][2], eq(i3, 3));
        cachedXYT.copyConditional(cachedXYTArr[i][3], eq(i3, 4));
        cachedXYT.copyConditional(cachedXYTArr[i][4], eq(i3, 5));
        cachedXYT.copyConditional(cachedXYTArr[i][5], eq(i3, 6));
        cachedXYT.copyConditional(cachedXYTArr[i][6], eq(i3, 7));
        cachedXYT.copyConditional(cachedXYTArr[i][7], eq(i3, 8));
        long[] copyOf = Arrays.copyOf(cachedXYT.yMinusX, 10);
        long[] copyOf2 = Arrays.copyOf(cachedXYT.yPlusX, 10);
        long[] copyOf3 = Arrays.copyOf(cachedXYT.t2d, 10);
        neg(copyOf3, copyOf3);
        cachedXYT.copyConditional(new CachedXYT(copyOf, copyOf2, copyOf3), i2);
    }

    public static byte[] sign(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length);
        MessageDigest engineFactory = EngineFactory.MESSAGE_DIGEST.getInstance("SHA-512");
        engineFactory.update(bArr3, 32, 32);
        engineFactory.update(copyOfRange);
        byte[] digest = engineFactory.digest();
        reduce(digest);
        byte[] copyOfRange2 = Arrays.copyOfRange(scalarMultWithBase(digest).toBytes(), 0, 32);
        engineFactory.reset();
        engineFactory.update(copyOfRange2);
        engineFactory.update(bArr2);
        engineFactory.update(copyOfRange);
        byte[] digest2 = engineFactory.digest();
        reduce(digest2);
        byte[] bArr4 = new byte[32];
        mulAdd(bArr4, digest2, bArr3, digest);
        return Bytes.concat(copyOfRange2, bArr4);
    }

    private static byte[] slide(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[256];
        for (int i2 = 0; i2 < 256; i2++) {
            bArr2[i2] = (byte) (1 & ((bArr[i2 >> 3] & UnsignedBytes.MAX_VALUE) >> (i2 & 7)));
        }
        for (int i3 = 0; i3 < 256; i3++) {
            if (bArr2[i3] != 0) {
                for (int i4 = 1; i4 <= 6 && (i = i3 + i4) < 256; i4++) {
                    byte b = bArr2[i];
                    if (b != 0) {
                        byte b2 = bArr2[i3];
                        if ((b << i4) + b2 <= 15) {
                            bArr2[i3] = (byte) (b2 + (b << i4));
                            bArr2[i] = 0;
                        } else if (b2 - (b << i4) >= -15) {
                            bArr2[i3] = (byte) (b2 - (b << i4));
                            while (true) {
                                if (i >= 256) {
                                    break;
                                } else if (bArr2[i] == 0) {
                                    bArr2[i] = 1;
                                    break;
                                } else {
                                    bArr2[i] = 0;
                                    i++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    private static void sub(PartialXYZT partialXYZT, XYZT xyzt, CachedXYT cachedXYT) {
        long[] jArr = new long[10];
        long[] jArr2 = partialXYZT.xyz.x;
        XYZ xyz = xyzt.xyz;
        Field25519.sum(jArr2, xyz.y, xyz.x);
        long[] jArr3 = partialXYZT.xyz.y;
        XYZ xyz2 = xyzt.xyz;
        Field25519.sub(jArr3, xyz2.y, xyz2.x);
        long[] jArr4 = partialXYZT.xyz.y;
        Field25519.mult(jArr4, jArr4, cachedXYT.yPlusX);
        XYZ xyz3 = partialXYZT.xyz;
        Field25519.mult(xyz3.z, xyz3.x, cachedXYT.yMinusX);
        Field25519.mult(partialXYZT.t, xyzt.t, cachedXYT.t2d);
        cachedXYT.multByZ(partialXYZT.xyz.x, xyzt.xyz.z);
        long[] jArr5 = partialXYZT.xyz.x;
        Field25519.sum(jArr, jArr5, jArr5);
        XYZ xyz4 = partialXYZT.xyz;
        Field25519.sub(xyz4.x, xyz4.z, xyz4.y);
        XYZ xyz5 = partialXYZT.xyz;
        long[] jArr6 = xyz5.y;
        Field25519.sum(jArr6, xyz5.z, jArr6);
        Field25519.sub(partialXYZT.xyz.z, jArr, partialXYZT.t);
        long[] jArr7 = partialXYZT.t;
        Field25519.sum(jArr7, jArr, jArr7);
    }

    public static boolean verify(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (bArr2.length != 64) {
            return false;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr2, 32, 64);
        if (!isSmallerThanGroupOrder(copyOfRange)) {
            return false;
        }
        MessageDigest engineFactory = EngineFactory.MESSAGE_DIGEST.getInstance("SHA-512");
        engineFactory.update(bArr2, 0, 32);
        engineFactory.update(bArr3);
        engineFactory.update(bArr);
        byte[] digest = engineFactory.digest();
        reduce(digest);
        byte[] bytes = doubleScalarMultVarTime(digest, XYZT.fromBytesNegateVarTime(bArr3), copyOfRange).toBytes();
        for (int i = 0; i < 32; i++) {
            if (bytes[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
