package com.google.crypto.tink.signature;

import com.google.crypto.tink.KeysetReader;
import com.google.crypto.tink.PemKeyType;
import com.google.crypto.tink.proto.EcdsaParams;
import com.google.crypto.tink.proto.EcdsaSignatureEncoding;
import com.google.crypto.tink.proto.EllipticCurveType;
import com.google.crypto.tink.proto.EncryptedKeyset;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.proto.RsaSsaPkcs1Params;
import com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey;
import com.google.crypto.tink.proto.RsaSsaPssParams;
import com.google.crypto.tink.proto.RsaSsaPssPublicKey;
import com.google.crypto.tink.signature.internal.SigUtil;
import com.google.crypto.tink.subtle.Enums;
import com.google.crypto.tink.subtle.Random;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.security.Key;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public final class SignaturePemKeysetReader implements KeysetReader {
    private List<PemKey> pemKeys;

    /* renamed from: com.google.crypto.tink.signature.SignaturePemKeysetReader$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType;

        static {
            int[] iArr = new int[Enums.HashType.values().length];
            $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType = iArr;
            try {
                iArr[Enums.HashType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[Enums.HashType.SHA384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[Enums.HashType.SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class Builder {
        private List<PemKey> pemKeys = new ArrayList();

        @CanIgnoreReturnValue
        public Builder addPem(String str, PemKeyType pemKeyType) {
            PemKey pemKey = new PemKey(null);
            pemKey.reader = new BufferedReader(new StringReader(str));
            pemKey.type = pemKeyType;
            this.pemKeys.add(pemKey);
            return this;
        }

        public KeysetReader build() {
            return new SignaturePemKeysetReader(this.pemKeys);
        }
    }

    /* loaded from: classes4.dex */
    public static final class PemKey {
        BufferedReader reader;
        PemKeyType type;

        private PemKey() {
        }

        public /* synthetic */ PemKey(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public SignaturePemKeysetReader(List<PemKey> list) {
        this.pemKeys = list;
    }

    private static KeyData convertEcPublicKey(PemKeyType pemKeyType, ECPublicKey eCPublicKey) throws IOException {
        if (pemKeyType.algorithm.equals("ECDSA")) {
            return KeyData.newBuilder().setTypeUrl(new EcdsaVerifyKeyManager().getKeyType()).setValue(com.google.crypto.tink.proto.EcdsaPublicKey.newBuilder().setVersion(new EcdsaVerifyKeyManager().getVersion()).setParams(EcdsaParams.newBuilder().setHashType(getHashType(pemKeyType)).setCurve(getCurveType(pemKeyType)).setEncoding(EcdsaSignatureEncoding.DER).build()).setX(SigUtil.toUnsignedIntByteString(eCPublicKey.getW().getAffineX())).setY(SigUtil.toUnsignedIntByteString(eCPublicKey.getW().getAffineY())).build().toByteString()).setKeyMaterialType(KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC).build();
        }
        throw new IOException("unsupported EC signature algorithm: " + pemKeyType.algorithm);
    }

    private static KeyData convertRsaPublicKey(PemKeyType pemKeyType, RSAPublicKey rSAPublicKey) throws IOException {
        if (pemKeyType.algorithm.equals("RSASSA-PKCS1-v1_5")) {
            return KeyData.newBuilder().setTypeUrl(new RsaSsaPkcs1VerifyKeyManager().getKeyType()).setValue(RsaSsaPkcs1PublicKey.newBuilder().setVersion(new RsaSsaPkcs1VerifyKeyManager().getVersion()).setParams(RsaSsaPkcs1Params.newBuilder().setHashType(getHashType(pemKeyType)).build()).setE(SigUtil.toUnsignedIntByteString(rSAPublicKey.getPublicExponent())).setN(SigUtil.toUnsignedIntByteString(rSAPublicKey.getModulus())).build().toByteString()).setKeyMaterialType(KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC).build();
        } else if (pemKeyType.algorithm.equals("RSASSA-PSS")) {
            return KeyData.newBuilder().setTypeUrl(new RsaSsaPssVerifyKeyManager().getKeyType()).setValue(RsaSsaPssPublicKey.newBuilder().setVersion(new RsaSsaPssVerifyKeyManager().getVersion()).setParams(RsaSsaPssParams.newBuilder().setSigHash(getHashType(pemKeyType)).setMgf1Hash(getHashType(pemKeyType)).setSaltLength(getDigestSizeInBytes(pemKeyType)).build()).setE(SigUtil.toUnsignedIntByteString(rSAPublicKey.getPublicExponent())).setN(SigUtil.toUnsignedIntByteString(rSAPublicKey.getModulus())).build().toByteString()).setKeyMaterialType(KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC).build();
        } else {
            throw new IOException("unsupported RSA signature algorithm: " + pemKeyType.algorithm);
        }
    }

    private static EllipticCurveType getCurveType(PemKeyType pemKeyType) {
        int i = pemKeyType.keySizeInBits;
        if (i != 256) {
            if (i != 384) {
                if (i == 521) {
                    return EllipticCurveType.NIST_P521;
                }
                throw new IllegalArgumentException("unsupported curve for key size: " + pemKeyType.keySizeInBits);
            }
            return EllipticCurveType.NIST_P384;
        }
        return EllipticCurveType.NIST_P256;
    }

    private static int getDigestSizeInBytes(PemKeyType pemKeyType) {
        int i = AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[pemKeyType.hash.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return 64;
                }
                throw new IllegalArgumentException("unsupported hash type: " + pemKeyType.hash.name());
            }
            return 48;
        }
        return 32;
    }

    private static HashType getHashType(PemKeyType pemKeyType) {
        int i = AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[pemKeyType.hash.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return HashType.SHA512;
                }
                throw new IllegalArgumentException("unsupported hash type: " + pemKeyType.hash.name());
            }
            return HashType.SHA384;
        }
        return HashType.SHA256;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    private static Keyset.Key readKey(BufferedReader bufferedReader, PemKeyType pemKeyType) throws IOException {
        KeyData convertEcPublicKey;
        Key readKey = pemKeyType.readKey(bufferedReader);
        if (readKey == null) {
            return null;
        }
        if (readKey instanceof RSAPublicKey) {
            convertEcPublicKey = convertRsaPublicKey(pemKeyType, (RSAPublicKey) readKey);
        } else if (!(readKey instanceof ECPublicKey)) {
            return null;
        } else {
            convertEcPublicKey = convertEcPublicKey(pemKeyType, (ECPublicKey) readKey);
        }
        return Keyset.Key.newBuilder().setKeyData(convertEcPublicKey).setStatus(KeyStatusType.ENABLED).setOutputPrefixType(OutputPrefixType.RAW).setKeyId(Random.randInt()).build();
    }

    @Override // com.google.crypto.tink.KeysetReader
    public Keyset read() throws IOException {
        Keyset.Builder newBuilder = Keyset.newBuilder();
        for (PemKey pemKey : this.pemKeys) {
            for (Keyset.Key readKey = readKey(pemKey.reader, pemKey.type); readKey != null; readKey = readKey(pemKey.reader, pemKey.type)) {
                newBuilder.addKey(readKey);
            }
        }
        if (newBuilder.getKeyCount() != 0) {
            newBuilder.setPrimaryKeyId(newBuilder.getKey(0).getKeyId());
            return newBuilder.build();
        }
        throw new IOException("cannot find any key");
    }

    @Override // com.google.crypto.tink.KeysetReader
    public EncryptedKeyset readEncrypted() throws IOException {
        throw new UnsupportedOperationException();
    }
}
