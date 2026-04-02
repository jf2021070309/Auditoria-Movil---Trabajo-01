package com.google.crypto.tink.jwt;

import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.jwt.JwtFormat;
import com.google.crypto.tink.proto.JwtHmacAlgorithm;
import com.google.crypto.tink.proto.JwtHmacKey;
import com.google.crypto.tink.proto.JwtHmacKeyFormat;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.subtle.PrfHmacJce;
import com.google.crypto.tink.subtle.PrfMac;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import com.google.errorprone.annotations.Immutable;
import com.google.gson.JsonObject;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes4.dex */
public final class JwtHmacKeyManager extends KeyTypeManager<JwtHmacKey> {

    /* renamed from: com.google.crypto.tink.jwt.JwtHmacKeyManager$3  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$JwtHmacAlgorithm;

        static {
            int[] iArr = new int[JwtHmacAlgorithm.values().length];
            $SwitchMap$com$google$crypto$tink$proto$JwtHmacAlgorithm = iArr;
            try {
                iArr[JwtHmacAlgorithm.HS256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$JwtHmacAlgorithm[JwtHmacAlgorithm.HS384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$JwtHmacAlgorithm[JwtHmacAlgorithm.HS512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Immutable
    /* loaded from: classes4.dex */
    public static final class JwtHmac implements JwtMacInternal {
        private final String algorithm;
        private final Optional<String> customKidFromHmacKey;
        private final PrfMac prfMac;

        public JwtHmac(String str, Optional<String> optional, PrfMac prfMac) {
            this.algorithm = str;
            this.customKidFromHmacKey = optional;
            this.prfMac = prfMac;
        }

        @Override // com.google.crypto.tink.jwt.JwtMacInternal
        public String computeMacAndEncodeWithKid(RawJwt rawJwt, Optional<String> optional) throws GeneralSecurityException {
            if (this.customKidFromHmacKey.isPresent()) {
                if (!optional.isPresent()) {
                    optional = this.customKidFromHmacKey;
                } else {
                    throw new JwtInvalidException("custom_kid can only be set for RAW keys.");
                }
            }
            String createUnsignedCompact = JwtFormat.createUnsignedCompact(this.algorithm, optional, rawJwt);
            return JwtFormat.createSignedCompact(createUnsignedCompact, this.prfMac.computeMac(createUnsignedCompact.getBytes(StandardCharsets.US_ASCII)));
        }

        @Override // com.google.crypto.tink.jwt.JwtMacInternal
        public VerifiedJwt verifyMacAndDecodeWithKid(String str, JwtValidator jwtValidator, Optional<String> optional) throws GeneralSecurityException {
            JwtFormat.Parts splitSignedCompact = JwtFormat.splitSignedCompact(str);
            this.prfMac.verifyMac(splitSignedCompact.signatureOrMac, splitSignedCompact.unsignedCompact.getBytes(StandardCharsets.US_ASCII));
            JsonObject parseJson = JsonUtil.parseJson(splitSignedCompact.header);
            JwtFormat.validateHeader(this.algorithm, optional, this.customKidFromHmacKey, parseJson);
            return jwtValidator.validate(RawJwt.fromJsonPayload(JwtFormat.getTypeHeader(parseJson), splitSignedCompact.payload));
        }
    }

    public JwtHmacKeyManager() {
        super(JwtHmacKey.class, new PrimitiveFactory<JwtMacInternal, JwtHmacKey>(JwtMacInternal.class) { // from class: com.google.crypto.tink.jwt.JwtHmacKeyManager.1
            @Override // com.google.crypto.tink.internal.PrimitiveFactory
            public JwtMacInternal getPrimitive(JwtHmacKey jwtHmacKey) throws GeneralSecurityException {
                JwtHmacAlgorithm algorithm = jwtHmacKey.getAlgorithm();
                PrfHmacJce prfHmacJce = new PrfHmacJce(JwtHmacKeyManager.getHmacAlgorithm(algorithm), new SecretKeySpec(jwtHmacKey.getKeyValue().toByteArray(), "HMAC"));
                return new JwtHmac(JwtHmacKeyManager.getAlgorithmName(algorithm), jwtHmacKey.hasCustomKid() ? Optional.of(jwtHmacKey.getCustomKid().getValue()) : Optional.empty(), new PrfMac(prfHmacJce, prfHmacJce.getMaxOutputLength()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static KeyTypeManager.KeyFactory.KeyFormat<JwtHmacKeyFormat> createKeyFormat(JwtHmacAlgorithm jwtHmacAlgorithm, int i, KeyTemplate.OutputPrefixType outputPrefixType) {
        return new KeyTypeManager.KeyFactory.KeyFormat<>(JwtHmacKeyFormat.newBuilder().setAlgorithm(jwtHmacAlgorithm).setKeySize(i).build(), outputPrefixType);
    }

    private static KeyTemplate createTemplate(JwtHmacAlgorithm jwtHmacAlgorithm, int i) {
        return KeyTemplate.create(new JwtHmacKeyManager().getKeyType(), JwtHmacKeyFormat.newBuilder().setAlgorithm(jwtHmacAlgorithm).setKeySize(i).build().toByteArray(), KeyTemplate.OutputPrefixType.RAW);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getAlgorithmName(JwtHmacAlgorithm jwtHmacAlgorithm) throws GeneralSecurityException {
        int i = AnonymousClass3.$SwitchMap$com$google$crypto$tink$proto$JwtHmacAlgorithm[jwtHmacAlgorithm.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "HS512";
                }
                throw new GeneralSecurityException("unknown algorithm");
            }
            return "HS384";
        }
        return "HS256";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getHmacAlgorithm(JwtHmacAlgorithm jwtHmacAlgorithm) throws GeneralSecurityException {
        int i = AnonymousClass3.$SwitchMap$com$google$crypto$tink$proto$JwtHmacAlgorithm[jwtHmacAlgorithm.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "HMACSHA512";
                }
                throw new GeneralSecurityException("unknown algorithm");
            }
            return "HMACSHA384";
        }
        return "HMACSHA256";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getMinimumKeySizeInBytes(JwtHmacAlgorithm jwtHmacAlgorithm) throws GeneralSecurityException {
        int i = AnonymousClass3.$SwitchMap$com$google$crypto$tink$proto$JwtHmacAlgorithm[jwtHmacAlgorithm.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return 64;
                }
                throw new GeneralSecurityException("unknown algorithm");
            }
            return 48;
        }
        return 32;
    }

    public static final KeyTemplate hs256Template() {
        return createTemplate(JwtHmacAlgorithm.HS256, 32);
    }

    public static final KeyTemplate hs384Template() {
        return createTemplate(JwtHmacAlgorithm.HS384, 48);
    }

    public static final KeyTemplate hs512Template() {
        return createTemplate(JwtHmacAlgorithm.HS512, 64);
    }

    public static void register(boolean z) throws GeneralSecurityException {
        Registry.registerKeyManager(new JwtHmacKeyManager(), z);
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.JwtHmacKey";
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyTypeManager.KeyFactory<?, JwtHmacKey> keyFactory() {
        return new KeyTypeManager.KeyFactory<JwtHmacKeyFormat, JwtHmacKey>(JwtHmacKeyFormat.class) { // from class: com.google.crypto.tink.jwt.JwtHmacKeyManager.2
            @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
            public Map<String, KeyTypeManager.KeyFactory.KeyFormat<JwtHmacKeyFormat>> keyFormats() {
                HashMap hashMap = new HashMap();
                JwtHmacAlgorithm jwtHmacAlgorithm = JwtHmacAlgorithm.HS256;
                KeyTemplate.OutputPrefixType outputPrefixType = KeyTemplate.OutputPrefixType.RAW;
                hashMap.put("JWT_HS256_RAW", JwtHmacKeyManager.createKeyFormat(jwtHmacAlgorithm, 32, outputPrefixType));
                KeyTemplate.OutputPrefixType outputPrefixType2 = KeyTemplate.OutputPrefixType.TINK;
                hashMap.put("JWT_HS256", JwtHmacKeyManager.createKeyFormat(jwtHmacAlgorithm, 32, outputPrefixType2));
                JwtHmacAlgorithm jwtHmacAlgorithm2 = JwtHmacAlgorithm.HS384;
                hashMap.put("JWT_HS384_RAW", JwtHmacKeyManager.createKeyFormat(jwtHmacAlgorithm2, 48, outputPrefixType));
                hashMap.put("JWT_HS384", JwtHmacKeyManager.createKeyFormat(jwtHmacAlgorithm2, 48, outputPrefixType2));
                JwtHmacAlgorithm jwtHmacAlgorithm3 = JwtHmacAlgorithm.HS512;
                hashMap.put("JWT_HS512_RAW", JwtHmacKeyManager.createKeyFormat(jwtHmacAlgorithm3, 64, outputPrefixType));
                hashMap.put("JWT_HS512", JwtHmacKeyManager.createKeyFormat(jwtHmacAlgorithm3, 64, outputPrefixType2));
                return Collections.unmodifiableMap(hashMap);
            }

            @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
            public JwtHmacKey createKey(JwtHmacKeyFormat jwtHmacKeyFormat) {
                return JwtHmacKey.newBuilder().setVersion(JwtHmacKeyManager.this.getVersion()).setAlgorithm(jwtHmacKeyFormat.getAlgorithm()).setKeyValue(ByteString.copyFrom(Random.randBytes(jwtHmacKeyFormat.getKeySize()))).build();
            }

            @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
            public JwtHmacKey deriveKey(JwtHmacKeyFormat jwtHmacKeyFormat, InputStream inputStream) throws GeneralSecurityException {
                throw new UnsupportedOperationException();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
            public JwtHmacKeyFormat parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
                return JwtHmacKeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
            }

            @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
            public void validateKeyFormat(JwtHmacKeyFormat jwtHmacKeyFormat) throws GeneralSecurityException {
                if (jwtHmacKeyFormat.getKeySize() < JwtHmacKeyManager.getMinimumKeySizeInBytes(jwtHmacKeyFormat.getAlgorithm())) {
                    throw new GeneralSecurityException("key too short");
                }
            }
        };
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public JwtHmacKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return JwtHmacKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public void validateKey(JwtHmacKey jwtHmacKey) throws GeneralSecurityException {
        Validators.validateVersion(jwtHmacKey.getVersion(), getVersion());
        if (jwtHmacKey.getKeyValue().size() < getMinimumKeySizeInBytes(jwtHmacKey.getAlgorithm())) {
            throw new GeneralSecurityException("key too short");
        }
    }
}
