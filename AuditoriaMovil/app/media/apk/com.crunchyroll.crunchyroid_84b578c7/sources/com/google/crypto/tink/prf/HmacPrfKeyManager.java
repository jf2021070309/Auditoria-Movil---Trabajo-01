package com.google.crypto.tink.prf;

import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.HmacPrfKey;
import com.google.crypto.tink.proto.HmacPrfKeyFormat;
import com.google.crypto.tink.proto.HmacPrfParams;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.subtle.PrfHmacJce;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes4.dex */
public final class HmacPrfKeyManager extends KeyTypeManager<HmacPrfKey> {
    private static final int MIN_KEY_SIZE_IN_BYTES = 16;

    /* renamed from: com.google.crypto.tink.prf.HmacPrfKeyManager$3  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$HashType;

        static {
            int[] iArr = new int[HashType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$HashType = iArr;
            try {
                iArr[HashType.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[HashType.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[HashType.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[HashType.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[HashType.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public HmacPrfKeyManager() {
        super(HmacPrfKey.class, new PrimitiveFactory<Prf, HmacPrfKey>(Prf.class) { // from class: com.google.crypto.tink.prf.HmacPrfKeyManager.1
            @Override // com.google.crypto.tink.internal.PrimitiveFactory
            public Prf getPrimitive(HmacPrfKey hmacPrfKey) throws GeneralSecurityException {
                HashType hash = hmacPrfKey.getParams().getHash();
                SecretKeySpec secretKeySpec = new SecretKeySpec(hmacPrfKey.getKeyValue().toByteArray(), "HMAC");
                int i = AnonymousClass3.$SwitchMap$com$google$crypto$tink$proto$HashType[hash.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i == 5) {
                                    return new PrfHmacJce("HMACSHA512", secretKeySpec);
                                }
                                throw new GeneralSecurityException("unknown hash");
                            }
                            return new PrfHmacJce("HMACSHA384", secretKeySpec);
                        }
                        return new PrfHmacJce("HMACSHA256", secretKeySpec);
                    }
                    return new PrfHmacJce("HMACSHA224", secretKeySpec);
                }
                return new PrfHmacJce("HMACSHA1", secretKeySpec);
            }
        });
    }

    private static KeyTemplate createTemplate(int i, HashType hashType) {
        return KeyTemplate.create(new HmacPrfKeyManager().getKeyType(), HmacPrfKeyFormat.newBuilder().setParams(HmacPrfParams.newBuilder().setHash(hashType).build()).setKeySize(i).build().toByteArray(), KeyTemplate.OutputPrefixType.RAW);
    }

    public static final KeyTemplate hmacSha256Template() {
        return createTemplate(32, HashType.SHA256);
    }

    public static final KeyTemplate hmacSha512Template() {
        return createTemplate(64, HashType.SHA512);
    }

    public static void register(boolean z) throws GeneralSecurityException {
        Registry.registerKeyManager(new HmacPrfKeyManager(), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void validateParams(HmacPrfParams hmacPrfParams) throws GeneralSecurityException {
        if (hmacPrfParams.getHash() != HashType.SHA1 && hmacPrfParams.getHash() != HashType.SHA224 && hmacPrfParams.getHash() != HashType.SHA256 && hmacPrfParams.getHash() != HashType.SHA384 && hmacPrfParams.getHash() != HashType.SHA512) {
            throw new GeneralSecurityException("unknown hash type");
        }
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public TinkFipsUtil.AlgorithmFipsCompatibility fipsStatus() {
        return TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.HmacPrfKey";
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyTypeManager.KeyFactory<?, HmacPrfKey> keyFactory() {
        return new KeyTypeManager.KeyFactory<HmacPrfKeyFormat, HmacPrfKey>(HmacPrfKeyFormat.class) { // from class: com.google.crypto.tink.prf.HmacPrfKeyManager.2
            @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
            public Map<String, KeyTypeManager.KeyFactory.KeyFormat<HmacPrfKeyFormat>> keyFormats() throws GeneralSecurityException {
                HashMap hashMap = new HashMap();
                KeyTemplate.OutputPrefixType outputPrefixType = KeyTemplate.OutputPrefixType.RAW;
                hashMap.put("HMAC_SHA256_PRF", new KeyTypeManager.KeyFactory.KeyFormat(HmacPrfKeyFormat.newBuilder().setParams(HmacPrfParams.newBuilder().setHash(HashType.SHA256).build()).setKeySize(32).build(), outputPrefixType));
                hashMap.put("HMAC_SHA512_PRF", new KeyTypeManager.KeyFactory.KeyFormat(HmacPrfKeyFormat.newBuilder().setParams(HmacPrfParams.newBuilder().setHash(HashType.SHA512).build()).setKeySize(64).build(), outputPrefixType));
                return Collections.unmodifiableMap(hashMap);
            }

            @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
            public HmacPrfKey createKey(HmacPrfKeyFormat hmacPrfKeyFormat) {
                return HmacPrfKey.newBuilder().setVersion(HmacPrfKeyManager.this.getVersion()).setParams(hmacPrfKeyFormat.getParams()).setKeyValue(ByteString.copyFrom(Random.randBytes(hmacPrfKeyFormat.getKeySize()))).build();
            }

            @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
            public HmacPrfKey deriveKey(HmacPrfKeyFormat hmacPrfKeyFormat, InputStream inputStream) throws GeneralSecurityException {
                Validators.validateVersion(hmacPrfKeyFormat.getVersion(), HmacPrfKeyManager.this.getVersion());
                byte[] bArr = new byte[hmacPrfKeyFormat.getKeySize()];
                try {
                    KeyTypeManager.KeyFactory.readFully(inputStream, bArr);
                    return HmacPrfKey.newBuilder().setVersion(HmacPrfKeyManager.this.getVersion()).setParams(hmacPrfKeyFormat.getParams()).setKeyValue(ByteString.copyFrom(bArr)).build();
                } catch (IOException e) {
                    throw new GeneralSecurityException("Reading pseudorandomness failed", e);
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
            public HmacPrfKeyFormat parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
                return HmacPrfKeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
            }

            @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
            public void validateKeyFormat(HmacPrfKeyFormat hmacPrfKeyFormat) throws GeneralSecurityException {
                if (hmacPrfKeyFormat.getKeySize() >= 16) {
                    HmacPrfKeyManager.validateParams(hmacPrfKeyFormat.getParams());
                    return;
                }
                throw new GeneralSecurityException("key too short");
            }
        };
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public HmacPrfKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return HmacPrfKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public void validateKey(HmacPrfKey hmacPrfKey) throws GeneralSecurityException {
        Validators.validateVersion(hmacPrfKey.getVersion(), getVersion());
        if (hmacPrfKey.getKeyValue().size() >= 16) {
            validateParams(hmacPrfKey.getParams());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
