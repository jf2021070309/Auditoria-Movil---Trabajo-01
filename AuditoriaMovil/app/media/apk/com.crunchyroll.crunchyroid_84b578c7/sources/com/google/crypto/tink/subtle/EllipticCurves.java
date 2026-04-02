package com.google.crypto.tink.subtle;

import com.google.common.primitives.UnsignedBytes;
import com.google.crypto.tink.internal.BigIntegerEncoding;
import com.google.crypto.tink.internal.EllipticCurvesUtil;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import javax.crypto.KeyAgreement;
/* loaded from: classes4.dex */
public final class EllipticCurves {

    /* renamed from: com.google.crypto.tink.subtle.EllipticCurves$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType;

        static {
            int[] iArr = new int[CurveType.values().length];
            $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType = iArr;
            try {
                iArr[CurveType.NIST_P256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType[CurveType.NIST_P384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType[CurveType.NIST_P521.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[PointFormatType.values().length];
            $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType = iArr2;
            try {
                iArr2[PointFormatType.UNCOMPRESSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType[PointFormatType.DO_NOT_USE_CRUNCHY_UNCOMPRESSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType[PointFormatType.COMPRESSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public enum CurveType {
        NIST_P256,
        NIST_P384,
        NIST_P521
    }

    /* loaded from: classes4.dex */
    public enum EcdsaEncoding {
        IEEE_P1363,
        DER
    }

    /* loaded from: classes4.dex */
    public enum PointFormatType {
        UNCOMPRESSED,
        COMPRESSED,
        DO_NOT_USE_CRUNCHY_UNCOMPRESSED
    }

    private EllipticCurves() {
    }

    public static void checkPublicKey(ECPublicKey eCPublicKey) throws GeneralSecurityException {
        EllipticCurvesUtil.checkPointOnCurve(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
    }

    public static byte[] computeSharedSecret(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) throws GeneralSecurityException {
        validatePublicKeySpec(eCPublicKey, eCPrivateKey);
        return computeSharedSecret(eCPrivateKey, eCPublicKey.getW());
    }

    public static ECPoint ecPointDecode(EllipticCurve ellipticCurve, PointFormatType pointFormatType, byte[] bArr) throws GeneralSecurityException {
        return pointDecode(ellipticCurve, pointFormatType, bArr);
    }

    public static byte[] ecdsaDer2Ieee(byte[] bArr, int i) throws GeneralSecurityException {
        int i2;
        int i3;
        if (isValidDerEncoding(bArr)) {
            byte[] bArr2 = new byte[i];
            int i4 = 1;
            if ((bArr[1] & UnsignedBytes.MAX_VALUE) >= 128) {
                i2 = 3;
            } else {
                i2 = 2;
            }
            int i5 = i2 + 1;
            int i6 = i5 + 1;
            int i7 = bArr[i5];
            if (bArr[i6] == 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            System.arraycopy(bArr, i6 + i3, bArr2, ((i / 2) - i7) + i3, i7 - i3);
            int i8 = i7 + 1 + i6;
            int i9 = i8 + 1;
            int i10 = bArr[i8];
            if (bArr[i9] != 0) {
                i4 = 0;
            }
            System.arraycopy(bArr, i9 + i4, bArr2, (i - i10) + i4, i10 - i4);
            return bArr2;
        }
        throw new GeneralSecurityException("Invalid DER encoding");
    }

    public static byte[] ecdsaIeee2Der(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2;
        int i;
        if (bArr.length % 2 == 0 && bArr.length != 0 && bArr.length <= 132) {
            byte[] minimalSignedNumber = toMinimalSignedNumber(Arrays.copyOf(bArr, bArr.length / 2));
            byte[] minimalSignedNumber2 = toMinimalSignedNumber(Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length));
            int length = minimalSignedNumber.length + 2 + 1 + 1 + minimalSignedNumber2.length;
            if (length >= 128) {
                bArr2 = new byte[length + 3];
                bArr2[0] = 48;
                bArr2[1] = -127;
                bArr2[2] = (byte) length;
                i = 3;
            } else {
                bArr2 = new byte[length + 2];
                bArr2[0] = 48;
                bArr2[1] = (byte) length;
                i = 2;
            }
            int i2 = i + 1;
            bArr2[i] = 2;
            int i3 = i2 + 1;
            bArr2[i2] = (byte) minimalSignedNumber.length;
            System.arraycopy(minimalSignedNumber, 0, bArr2, i3, minimalSignedNumber.length);
            int length2 = i3 + minimalSignedNumber.length;
            int i4 = length2 + 1;
            bArr2[length2] = 2;
            bArr2[i4] = (byte) minimalSignedNumber2.length;
            System.arraycopy(minimalSignedNumber2, 0, bArr2, i4 + 1, minimalSignedNumber2.length);
            return bArr2;
        }
        throw new GeneralSecurityException("Invalid IEEE_P1363 encoding");
    }

    public static int encodingSizeInBytes(EllipticCurve ellipticCurve, PointFormatType pointFormatType) throws GeneralSecurityException {
        int fieldSizeInBytes = fieldSizeInBytes(ellipticCurve);
        int i = AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType[pointFormatType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return fieldSizeInBytes + 1;
                }
                throw new GeneralSecurityException("unknown EC point format");
            }
            return fieldSizeInBytes * 2;
        }
        return (fieldSizeInBytes * 2) + 1;
    }

    public static int fieldSizeInBits(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        return getModulus(ellipticCurve).subtract(BigInteger.ONE).bitLength();
    }

    public static int fieldSizeInBytes(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        return (fieldSizeInBits(ellipticCurve) + 7) / 8;
    }

    public static KeyPair generateKeyPair(CurveType curveType) throws GeneralSecurityException {
        return generateKeyPair(getCurveSpec(curveType));
    }

    public static ECParameterSpec getCurveSpec(CurveType curveType) throws NoSuchAlgorithmException {
        int i = AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType[curveType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return getNistP521Params();
                }
                throw new NoSuchAlgorithmException("curve not implemented:" + curveType);
            }
            return getNistP384Params();
        }
        return getNistP256Params();
    }

    public static ECPrivateKey getEcPrivateKey(byte[] bArr) throws GeneralSecurityException {
        return (ECPrivateKey) EngineFactory.KEY_FACTORY.getInstance("EC").generatePrivate(new PKCS8EncodedKeySpec(bArr));
    }

    public static ECPublicKey getEcPublicKey(byte[] bArr) throws GeneralSecurityException {
        return (ECPublicKey) EngineFactory.KEY_FACTORY.getInstance("EC").generatePublic(new X509EncodedKeySpec(bArr));
    }

    public static BigInteger getModulus(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        return EllipticCurvesUtil.getModulus(ellipticCurve);
    }

    public static ECParameterSpec getNistP256Params() {
        return EllipticCurvesUtil.NIST_P256_PARAMS;
    }

    public static ECParameterSpec getNistP384Params() {
        return EllipticCurvesUtil.NIST_P384_PARAMS;
    }

    public static ECParameterSpec getNistP521Params() {
        return EllipticCurvesUtil.NIST_P521_PARAMS;
    }

    public static BigInteger getY(BigInteger bigInteger, boolean z, EllipticCurve ellipticCurve) throws GeneralSecurityException {
        BigInteger modulus = getModulus(ellipticCurve);
        BigInteger a = ellipticCurve.getA();
        BigInteger modSqrt = modSqrt(bigInteger.multiply(bigInteger).add(a).multiply(bigInteger).add(ellipticCurve.getB()).mod(modulus), modulus);
        if (z != modSqrt.testBit(0)) {
            return modulus.subtract(modSqrt).mod(modulus);
        }
        return modSqrt;
    }

    public static boolean isNistEcParameterSpec(ECParameterSpec eCParameterSpec) {
        return EllipticCurvesUtil.isNistEcParameterSpec(eCParameterSpec);
    }

    public static boolean isSameEcParameterSpec(ECParameterSpec eCParameterSpec, ECParameterSpec eCParameterSpec2) {
        return EllipticCurvesUtil.isSameEcParameterSpec(eCParameterSpec, eCParameterSpec2);
    }

    public static boolean isValidDerEncoding(byte[] bArr) {
        int i;
        if (bArr.length < 8 || bArr[0] != 48) {
            return false;
        }
        int i2 = bArr[1] & UnsignedBytes.MAX_VALUE;
        if (i2 == 129) {
            i2 = bArr[2] & UnsignedBytes.MAX_VALUE;
            if (i2 < 128) {
                return false;
            }
            i = 2;
        } else if (i2 == 128 || i2 > 129) {
            return false;
        } else {
            i = 1;
        }
        if (i2 != (bArr.length - 1) - i) {
            return false;
        }
        int i3 = i + 1;
        if (bArr[i3] != 2) {
            return false;
        }
        int i4 = i3 + 1;
        int i5 = bArr[i4] & UnsignedBytes.MAX_VALUE;
        int i6 = i4 + 1 + i5 + 1;
        if (i6 >= bArr.length || i5 == 0) {
            return false;
        }
        int i7 = i + 3;
        byte b = bArr[i7];
        if ((b & UnsignedBytes.MAX_VALUE) >= 128) {
            return false;
        }
        if ((i5 > 1 && b == 0 && (bArr[i + 4] & UnsignedBytes.MAX_VALUE) < 128) || bArr[i7 + i5] != 2) {
            return false;
        }
        int i8 = bArr[i6] & UnsignedBytes.MAX_VALUE;
        if (i6 + 1 + i8 != bArr.length || i8 == 0) {
            return false;
        }
        byte b2 = bArr[i + 5 + i5];
        if ((b2 & UnsignedBytes.MAX_VALUE) >= 128) {
            return false;
        }
        if (i8 > 1 && b2 == 0 && (bArr[i + 6 + i5] & UnsignedBytes.MAX_VALUE) < 128) {
            return false;
        }
        return true;
    }

    public static BigInteger modSqrt(BigInteger bigInteger, BigInteger bigInteger2) throws GeneralSecurityException {
        BigInteger bigInteger3;
        if (bigInteger2.signum() == 1) {
            BigInteger mod = bigInteger.mod(bigInteger2);
            BigInteger bigInteger4 = BigInteger.ZERO;
            if (mod.equals(bigInteger4)) {
                return bigInteger4;
            }
            int i = 0;
            if (bigInteger2.testBit(0) && bigInteger2.testBit(1)) {
                bigInteger3 = mod.modPow(bigInteger2.add(BigInteger.ONE).shiftRight(2), bigInteger2);
            } else if (bigInteger2.testBit(0) && !bigInteger2.testBit(1)) {
                BigInteger bigInteger5 = BigInteger.ONE;
                BigInteger shiftRight = bigInteger2.subtract(bigInteger5).shiftRight(1);
                while (true) {
                    BigInteger mod2 = bigInteger5.multiply(bigInteger5).subtract(mod).mod(bigInteger2);
                    if (mod2.equals(BigInteger.ZERO)) {
                        return bigInteger5;
                    }
                    BigInteger modPow = mod2.modPow(shiftRight, bigInteger2);
                    BigInteger bigInteger6 = BigInteger.ONE;
                    if (modPow.add(bigInteger6).equals(bigInteger2)) {
                        BigInteger shiftRight2 = bigInteger2.add(bigInteger6).shiftRight(1);
                        BigInteger bigInteger7 = bigInteger5;
                        for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                            BigInteger multiply = bigInteger7.multiply(bigInteger6);
                            bigInteger7 = bigInteger7.multiply(bigInteger7).add(bigInteger6.multiply(bigInteger6).mod(bigInteger2).multiply(mod2)).mod(bigInteger2);
                            BigInteger mod3 = multiply.add(multiply).mod(bigInteger2);
                            if (shiftRight2.testBit(bitLength)) {
                                BigInteger mod4 = bigInteger7.multiply(bigInteger5).add(mod3.multiply(mod2)).mod(bigInteger2);
                                bigInteger6 = bigInteger5.multiply(mod3).add(bigInteger7).mod(bigInteger2);
                                bigInteger7 = mod4;
                            } else {
                                bigInteger6 = mod3;
                            }
                        }
                        bigInteger3 = bigInteger7;
                    } else if (modPow.equals(bigInteger6)) {
                        bigInteger5 = bigInteger5.add(bigInteger6);
                        i++;
                        if (i == 128 && !bigInteger2.isProbablePrime(80)) {
                            throw new InvalidAlgorithmParameterException("p is not prime");
                        }
                    } else {
                        throw new InvalidAlgorithmParameterException("p is not prime");
                    }
                }
            } else {
                bigInteger3 = null;
            }
            if (bigInteger3 != null && bigInteger3.multiply(bigInteger3).mod(bigInteger2).compareTo(mod) != 0) {
                throw new GeneralSecurityException("Could not find a modular square root");
            }
            return bigInteger3;
        }
        throw new InvalidAlgorithmParameterException("p must be positive");
    }

    public static ECPoint pointDecode(CurveType curveType, PointFormatType pointFormatType, byte[] bArr) throws GeneralSecurityException {
        return pointDecode(getCurveSpec(curveType).getCurve(), pointFormatType, bArr);
    }

    public static byte[] pointEncode(CurveType curveType, PointFormatType pointFormatType, ECPoint eCPoint) throws GeneralSecurityException {
        return pointEncode(getCurveSpec(curveType).getCurve(), pointFormatType, eCPoint);
    }

    private static byte[] toMinimalSignedNumber(byte[] bArr) {
        int i = 0;
        int i2 = 0;
        while (i2 < bArr.length && bArr[i2] == 0) {
            i2++;
        }
        if (i2 == bArr.length) {
            i2 = bArr.length - 1;
        }
        if ((bArr[i2] & UnsignedBytes.MAX_POWER_OF_TWO) == 128) {
            i = 1;
        }
        byte[] bArr2 = new byte[(bArr.length - i2) + i];
        System.arraycopy(bArr, i2, bArr2, i, bArr.length - i2);
        return bArr2;
    }

    public static void validatePublicKey(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) throws GeneralSecurityException {
        validatePublicKeySpec(eCPublicKey, eCPrivateKey);
        EllipticCurvesUtil.checkPointOnCurve(eCPublicKey.getW(), eCPrivateKey.getParams().getCurve());
    }

    public static void validatePublicKeySpec(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) throws GeneralSecurityException {
        try {
            if (isSameEcParameterSpec(eCPublicKey.getParams(), eCPrivateKey.getParams())) {
                return;
            }
            throw new GeneralSecurityException("invalid public key spec");
        } catch (IllegalArgumentException | NullPointerException e) {
            throw new GeneralSecurityException(e);
        }
    }

    private static void validateSharedSecret(byte[] bArr, ECPrivateKey eCPrivateKey) throws GeneralSecurityException {
        EllipticCurve curve = eCPrivateKey.getParams().getCurve();
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.signum() != -1 && bigInteger.compareTo(getModulus(curve)) < 0) {
            getY(bigInteger, true, curve);
            return;
        }
        throw new GeneralSecurityException("shared secret is out of range");
    }

    public static KeyPair generateKeyPair(ECParameterSpec eCParameterSpec) throws GeneralSecurityException {
        KeyPairGenerator engineFactory = EngineFactory.KEY_PAIR_GENERATOR.getInstance("EC");
        engineFactory.initialize(eCParameterSpec);
        return engineFactory.generateKeyPair();
    }

    public static ECPoint pointDecode(EllipticCurve ellipticCurve, PointFormatType pointFormatType, byte[] bArr) throws GeneralSecurityException {
        int fieldSizeInBytes = fieldSizeInBytes(ellipticCurve);
        int i = AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType[pointFormatType.ordinal()];
        boolean z = false;
        if (i == 1) {
            if (bArr.length == (fieldSizeInBytes * 2) + 1) {
                if (bArr[0] == 4) {
                    int i2 = fieldSizeInBytes + 1;
                    ECPoint eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i2)), new BigInteger(1, Arrays.copyOfRange(bArr, i2, bArr.length)));
                    EllipticCurvesUtil.checkPointOnCurve(eCPoint, ellipticCurve);
                    return eCPoint;
                }
                throw new GeneralSecurityException("invalid point format");
            }
            throw new GeneralSecurityException("invalid point size");
        } else if (i == 2) {
            if (bArr.length == fieldSizeInBytes * 2) {
                ECPoint eCPoint2 = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 0, fieldSizeInBytes)), new BigInteger(1, Arrays.copyOfRange(bArr, fieldSizeInBytes, bArr.length)));
                EllipticCurvesUtil.checkPointOnCurve(eCPoint2, ellipticCurve);
                return eCPoint2;
            }
            throw new GeneralSecurityException("invalid point size");
        } else if (i == 3) {
            BigInteger modulus = getModulus(ellipticCurve);
            if (bArr.length == fieldSizeInBytes + 1) {
                byte b = bArr[0];
                if (b != 2) {
                    if (b != 3) {
                        throw new GeneralSecurityException("invalid format");
                    }
                    z = true;
                }
                BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr, 1, bArr.length));
                if (bigInteger.signum() != -1 && bigInteger.compareTo(modulus) < 0) {
                    return new ECPoint(bigInteger, getY(bigInteger, z, ellipticCurve));
                }
                throw new GeneralSecurityException("x is out of range");
            }
            throw new GeneralSecurityException("compressed point has wrong length");
        } else {
            throw new GeneralSecurityException("invalid format:" + pointFormatType);
        }
    }

    public static byte[] pointEncode(EllipticCurve ellipticCurve, PointFormatType pointFormatType, ECPoint eCPoint) throws GeneralSecurityException {
        EllipticCurvesUtil.checkPointOnCurve(eCPoint, ellipticCurve);
        int fieldSizeInBytes = fieldSizeInBytes(ellipticCurve);
        int i = AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType[pointFormatType.ordinal()];
        if (i == 1) {
            int i2 = (fieldSizeInBytes * 2) + 1;
            byte[] bArr = new byte[i2];
            byte[] bigEndianBytes = BigIntegerEncoding.toBigEndianBytes(eCPoint.getAffineX());
            byte[] bigEndianBytes2 = BigIntegerEncoding.toBigEndianBytes(eCPoint.getAffineY());
            System.arraycopy(bigEndianBytes2, 0, bArr, i2 - bigEndianBytes2.length, bigEndianBytes2.length);
            System.arraycopy(bigEndianBytes, 0, bArr, (fieldSizeInBytes + 1) - bigEndianBytes.length, bigEndianBytes.length);
            bArr[0] = 4;
            return bArr;
        }
        if (i != 2) {
            if (i == 3) {
                int i3 = fieldSizeInBytes + 1;
                byte[] bArr2 = new byte[i3];
                byte[] bigEndianBytes3 = BigIntegerEncoding.toBigEndianBytes(eCPoint.getAffineX());
                System.arraycopy(bigEndianBytes3, 0, bArr2, i3 - bigEndianBytes3.length, bigEndianBytes3.length);
                bArr2[0] = (byte) (eCPoint.getAffineY().testBit(0) ? 3 : 2);
                return bArr2;
            }
            throw new GeneralSecurityException("invalid format:" + pointFormatType);
        }
        int i4 = fieldSizeInBytes * 2;
        byte[] bArr3 = new byte[i4];
        byte[] bigEndianBytes4 = BigIntegerEncoding.toBigEndianBytes(eCPoint.getAffineX());
        if (bigEndianBytes4.length > fieldSizeInBytes) {
            bigEndianBytes4 = Arrays.copyOfRange(bigEndianBytes4, bigEndianBytes4.length - fieldSizeInBytes, bigEndianBytes4.length);
        }
        byte[] bigEndianBytes5 = BigIntegerEncoding.toBigEndianBytes(eCPoint.getAffineY());
        if (bigEndianBytes5.length > fieldSizeInBytes) {
            bigEndianBytes5 = Arrays.copyOfRange(bigEndianBytes5, bigEndianBytes5.length - fieldSizeInBytes, bigEndianBytes5.length);
        }
        System.arraycopy(bigEndianBytes5, 0, bArr3, i4 - bigEndianBytes5.length, bigEndianBytes5.length);
        System.arraycopy(bigEndianBytes4, 0, bArr3, fieldSizeInBytes - bigEndianBytes4.length, bigEndianBytes4.length);
        return bArr3;
    }

    public static byte[] computeSharedSecret(ECPrivateKey eCPrivateKey, ECPoint eCPoint) throws GeneralSecurityException {
        EllipticCurvesUtil.checkPointOnCurve(eCPoint, eCPrivateKey.getParams().getCurve());
        PublicKey generatePublic = EngineFactory.KEY_FACTORY.getInstance("EC").generatePublic(new ECPublicKeySpec(eCPoint, eCPrivateKey.getParams()));
        KeyAgreement engineFactory = EngineFactory.KEY_AGREEMENT.getInstance("ECDH");
        engineFactory.init(eCPrivateKey);
        try {
            engineFactory.doPhase(generatePublic, true);
            byte[] generateSecret = engineFactory.generateSecret();
            validateSharedSecret(generateSecret, eCPrivateKey);
            return generateSecret;
        } catch (IllegalStateException e) {
            throw new GeneralSecurityException(e);
        }
    }

    public static ECPrivateKey getEcPrivateKey(CurveType curveType, byte[] bArr) throws GeneralSecurityException {
        return (ECPrivateKey) EngineFactory.KEY_FACTORY.getInstance("EC").generatePrivate(new ECPrivateKeySpec(BigIntegerEncoding.fromUnsignedBigEndianBytes(bArr), getCurveSpec(curveType)));
    }

    public static ECPublicKey getEcPublicKey(CurveType curveType, PointFormatType pointFormatType, byte[] bArr) throws GeneralSecurityException {
        return getEcPublicKey(getCurveSpec(curveType), pointFormatType, bArr);
    }

    public static ECPublicKey getEcPublicKey(ECParameterSpec eCParameterSpec, PointFormatType pointFormatType, byte[] bArr) throws GeneralSecurityException {
        return (ECPublicKey) EngineFactory.KEY_FACTORY.getInstance("EC").generatePublic(new ECPublicKeySpec(pointDecode(eCParameterSpec.getCurve(), pointFormatType, bArr), eCParameterSpec));
    }

    public static ECPublicKey getEcPublicKey(CurveType curveType, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ECParameterSpec curveSpec = getCurveSpec(curveType);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, bArr), new BigInteger(1, bArr2));
        EllipticCurvesUtil.checkPointOnCurve(eCPoint, curveSpec.getCurve());
        return (ECPublicKey) EngineFactory.KEY_FACTORY.getInstance("EC").generatePublic(new ECPublicKeySpec(eCPoint, curveSpec));
    }
}
