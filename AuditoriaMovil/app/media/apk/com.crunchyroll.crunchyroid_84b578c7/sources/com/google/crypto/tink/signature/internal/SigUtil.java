package com.google.crypto.tink.signature.internal;

import com.google.crypto.tink.proto.EcdsaParams;
import com.google.crypto.tink.proto.EcdsaSignatureEncoding;
import com.google.crypto.tink.proto.EllipticCurveType;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.RsaSsaPkcs1Params;
import com.google.crypto.tink.proto.RsaSsaPssParams;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.subtle.EllipticCurves;
import com.google.crypto.tink.subtle.Enums;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
/* loaded from: classes4.dex */
public final class SigUtil {
    static final String INVALID_PARAMS = "Invalid ECDSA parameters";

    /* renamed from: com.google.crypto.tink.signature.internal.SigUtil$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$EcdsaSignatureEncoding;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$EllipticCurveType;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$HashType;

        static {
            int[] iArr = new int[HashType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$HashType = iArr;
            try {
                iArr[HashType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[HashType.SHA384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[HashType.SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[EllipticCurveType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$EllipticCurveType = iArr2;
            try {
                iArr2[EllipticCurveType.NIST_P256.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$EllipticCurveType[EllipticCurveType.NIST_P384.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$EllipticCurveType[EllipticCurveType.NIST_P521.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[EcdsaSignatureEncoding.values().length];
            $SwitchMap$com$google$crypto$tink$proto$EcdsaSignatureEncoding = iArr3;
            try {
                iArr3[EcdsaSignatureEncoding.DER.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$EcdsaSignatureEncoding[EcdsaSignatureEncoding.IEEE_P1363.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private SigUtil() {
    }

    public static EllipticCurves.CurveType toCurveType(EllipticCurveType ellipticCurveType) throws GeneralSecurityException {
        int i = AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EllipticCurveType[ellipticCurveType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return EllipticCurves.CurveType.NIST_P521;
                }
                throw new GeneralSecurityException("unknown curve type: " + ellipticCurveType.name());
            }
            return EllipticCurves.CurveType.NIST_P384;
        }
        return EllipticCurves.CurveType.NIST_P256;
    }

    public static EllipticCurves.EcdsaEncoding toEcdsaEncoding(EcdsaSignatureEncoding ecdsaSignatureEncoding) throws GeneralSecurityException {
        int i = AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EcdsaSignatureEncoding[ecdsaSignatureEncoding.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return EllipticCurves.EcdsaEncoding.IEEE_P1363;
            }
            throw new GeneralSecurityException("unknown ECDSA encoding: " + ecdsaSignatureEncoding.name());
        }
        return EllipticCurves.EcdsaEncoding.DER;
    }

    public static Enums.HashType toHashType(HashType hashType) throws GeneralSecurityException {
        int i = AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType[hashType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return Enums.HashType.SHA512;
                }
                throw new GeneralSecurityException("unsupported hash type: " + hashType.name());
            }
            return Enums.HashType.SHA384;
        }
        return Enums.HashType.SHA256;
    }

    public static ByteString toUnsignedIntByteString(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] == 0) {
            return ByteString.copyFrom(byteArray, 1, byteArray.length - 1);
        }
        return ByteString.copyFrom(byteArray);
    }

    public static void validateEcdsaParams(EcdsaParams ecdsaParams) throws GeneralSecurityException {
        EcdsaSignatureEncoding encoding = ecdsaParams.getEncoding();
        HashType hashType = ecdsaParams.getHashType();
        EllipticCurveType curve = ecdsaParams.getCurve();
        int i = AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EcdsaSignatureEncoding[encoding.ordinal()];
        if (i != 1 && i != 2) {
            throw new GeneralSecurityException("unsupported signature encoding");
        }
        int i2 = AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EllipticCurveType[curve.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    if (hashType != HashType.SHA512) {
                        throw new GeneralSecurityException(INVALID_PARAMS);
                    }
                    return;
                }
                throw new GeneralSecurityException(INVALID_PARAMS);
            } else if (hashType != HashType.SHA384 && hashType != HashType.SHA512) {
                throw new GeneralSecurityException(INVALID_PARAMS);
            }
        } else if (hashType == HashType.SHA256) {
        } else {
            throw new GeneralSecurityException(INVALID_PARAMS);
        }
    }

    public static void validateRsaSsaPkcs1Params(RsaSsaPkcs1Params rsaSsaPkcs1Params) throws GeneralSecurityException {
        toHashType(rsaSsaPkcs1Params.getHashType());
    }

    public static void validateRsaSsaPssParams(RsaSsaPssParams rsaSsaPssParams) throws GeneralSecurityException {
        toHashType(rsaSsaPssParams.getSigHash());
        if (rsaSsaPssParams.getSigHash() == rsaSsaPssParams.getMgf1Hash()) {
            if (rsaSsaPssParams.getSaltLength() >= 0) {
                return;
            }
            throw new GeneralSecurityException("salt length is negative");
        }
        throw new GeneralSecurityException("MGF1 hash is different from signature hash");
    }
}
