package com.google.crypto.tink.jwt;

import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.jwt.JwtFormat;
import com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm;
import com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.subtle.EngineFactory;
import com.google.crypto.tink.subtle.Enums;
import com.google.crypto.tink.subtle.RsaSsaPssVerifyJce;
import com.google.crypto.tink.subtle.Validators;
import com.google.gson.JsonObject;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Optional;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class JwtRsaSsaPssVerifyKeyManager extends KeyTypeManager<JwtRsaSsaPssPublicKey> {

    /* renamed from: com.google.crypto.tink.jwt.JwtRsaSsaPssVerifyKeyManager$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm;

        static {
            int[] iArr = new int[JwtRsaSsaPssAlgorithm.values().length];
            $SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm = iArr;
            try {
                iArr[JwtRsaSsaPssAlgorithm.PS256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm[JwtRsaSsaPssAlgorithm.PS384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm[JwtRsaSsaPssAlgorithm.PS512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public JwtRsaSsaPssVerifyKeyManager() {
        super(JwtRsaSsaPssPublicKey.class, new PrimitiveFactory<JwtPublicKeyVerifyInternal, JwtRsaSsaPssPublicKey>(JwtPublicKeyVerifyInternal.class) { // from class: com.google.crypto.tink.jwt.JwtRsaSsaPssVerifyKeyManager.1
            @Override // com.google.crypto.tink.internal.PrimitiveFactory
            public JwtPublicKeyVerifyInternal getPrimitive(JwtRsaSsaPssPublicKey jwtRsaSsaPssPublicKey) throws GeneralSecurityException {
                final Optional empty;
                RSAPublicKey createPublicKey = JwtRsaSsaPssVerifyKeyManager.createPublicKey(jwtRsaSsaPssPublicKey);
                Enums.HashType hashForPssAlgorithm = JwtRsaSsaPssVerifyKeyManager.hashForPssAlgorithm(jwtRsaSsaPssPublicKey.getAlgorithm());
                final RsaSsaPssVerifyJce rsaSsaPssVerifyJce = new RsaSsaPssVerifyJce(createPublicKey, hashForPssAlgorithm, hashForPssAlgorithm, JwtRsaSsaPssVerifyKeyManager.saltLengthForPssAlgorithm(jwtRsaSsaPssPublicKey.getAlgorithm()));
                final String name = jwtRsaSsaPssPublicKey.getAlgorithm().name();
                if (jwtRsaSsaPssPublicKey.hasCustomKid()) {
                    empty = Optional.of(jwtRsaSsaPssPublicKey.getCustomKid().getValue());
                } else {
                    empty = Optional.empty();
                }
                return new JwtPublicKeyVerifyInternal() { // from class: com.google.crypto.tink.jwt.JwtRsaSsaPssVerifyKeyManager.1.1
                    @Override // com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal
                    public VerifiedJwt verifyAndDecodeWithKid(String str, JwtValidator jwtValidator, Optional<String> optional) throws GeneralSecurityException {
                        JwtFormat.Parts splitSignedCompact = JwtFormat.splitSignedCompact(str);
                        rsaSsaPssVerifyJce.verify(splitSignedCompact.signatureOrMac, splitSignedCompact.unsignedCompact.getBytes(StandardCharsets.US_ASCII));
                        JsonObject parseJson = JsonUtil.parseJson(splitSignedCompact.header);
                        JwtFormat.validateHeader(name, optional, empty, parseJson);
                        return jwtValidator.validate(RawJwt.fromJsonPayload(JwtFormat.getTypeHeader(parseJson), splitSignedCompact.payload));
                    }
                };
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RSAPublicKey createPublicKey(JwtRsaSsaPssPublicKey jwtRsaSsaPssPublicKey) throws GeneralSecurityException {
        return (RSAPublicKey) EngineFactory.KEY_FACTORY.getInstance("RSA").generatePublic(new RSAPublicKeySpec(new BigInteger(1, jwtRsaSsaPssPublicKey.getN().toByteArray()), new BigInteger(1, jwtRsaSsaPssPublicKey.getE().toByteArray())));
    }

    public static final Enums.HashType hashForPssAlgorithm(JwtRsaSsaPssAlgorithm jwtRsaSsaPssAlgorithm) throws GeneralSecurityException {
        int i = AnonymousClass2.$SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm[jwtRsaSsaPssAlgorithm.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return Enums.HashType.SHA512;
                }
                throw new GeneralSecurityException("unknown algorithm " + jwtRsaSsaPssAlgorithm.name());
            }
            return Enums.HashType.SHA384;
        }
        return Enums.HashType.SHA256;
    }

    public static final int saltLengthForPssAlgorithm(JwtRsaSsaPssAlgorithm jwtRsaSsaPssAlgorithm) throws GeneralSecurityException {
        int i = AnonymousClass2.$SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm[jwtRsaSsaPssAlgorithm.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return 64;
                }
                throw new GeneralSecurityException("unknown algorithm " + jwtRsaSsaPssAlgorithm.name());
            }
            return 48;
        }
        return 32;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.JwtRsaSsaPssPublicKey";
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public JwtRsaSsaPssPublicKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return JwtRsaSsaPssPublicKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public void validateKey(JwtRsaSsaPssPublicKey jwtRsaSsaPssPublicKey) throws GeneralSecurityException {
        Validators.validateVersion(jwtRsaSsaPssPublicKey.getVersion(), getVersion());
        Validators.validateRsaModulusSize(new BigInteger(1, jwtRsaSsaPssPublicKey.getN().toByteArray()).bitLength());
        Validators.validateRsaPublicExponent(new BigInteger(1, jwtRsaSsaPssPublicKey.getE().toByteArray()));
    }
}
