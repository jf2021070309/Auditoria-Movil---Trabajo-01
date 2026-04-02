package com.google.crypto.tink.hybrid;

import com.amazon.aps.iva.oa.a;
import com.google.crypto.tink.Aead;
import com.google.crypto.tink.DeterministicAead;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.aead.AeadConfig;
import com.google.crypto.tink.daead.DeterministicAeadConfig;
import com.google.crypto.tink.hybrid.subtle.AeadOrDaead;
import com.google.crypto.tink.proto.AesCtrHmacAeadKey;
import com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat;
import com.google.crypto.tink.proto.AesCtrKey;
import com.google.crypto.tink.proto.AesGcmKey;
import com.google.crypto.tink.proto.AesGcmKeyFormat;
import com.google.crypto.tink.proto.AesSivKey;
import com.google.crypto.tink.proto.AesSivKeyFormat;
import com.google.crypto.tink.proto.HmacKey;
import com.google.crypto.tink.proto.KeyTemplate;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.subtle.EciesAeadHkdfDemHelper;
import java.security.GeneralSecurityException;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class RegistryEciesAeadHkdfDemHelper implements EciesAeadHkdfDemHelper {
    private AesCtrHmacAeadKey aesCtrHmacAeadKey;
    private int aesCtrKeySize;
    private AesGcmKey aesGcmKey;
    private AesSivKey aesSivKey;
    private final String demKeyTypeUrl;
    private final int symmetricKeySize;

    public RegistryEciesAeadHkdfDemHelper(KeyTemplate keyTemplate) throws GeneralSecurityException {
        String typeUrl = keyTemplate.getTypeUrl();
        this.demKeyTypeUrl = typeUrl;
        if (typeUrl.equals(AeadConfig.AES_GCM_TYPE_URL)) {
            try {
                AesGcmKeyFormat parseFrom = AesGcmKeyFormat.parseFrom(keyTemplate.getValue(), ExtensionRegistryLite.getEmptyRegistry());
                this.aesGcmKey = (AesGcmKey) Registry.newKey(keyTemplate);
                this.symmetricKeySize = parseFrom.getKeySize();
            } catch (InvalidProtocolBufferException e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (typeUrl.equals(AeadConfig.AES_CTR_HMAC_AEAD_TYPE_URL)) {
            try {
                AesCtrHmacAeadKeyFormat parseFrom2 = AesCtrHmacAeadKeyFormat.parseFrom(keyTemplate.getValue(), ExtensionRegistryLite.getEmptyRegistry());
                this.aesCtrHmacAeadKey = (AesCtrHmacAeadKey) Registry.newKey(keyTemplate);
                this.aesCtrKeySize = parseFrom2.getAesCtrKeyFormat().getKeySize();
                this.symmetricKeySize = this.aesCtrKeySize + parseFrom2.getHmacKeyFormat().getKeySize();
            } catch (InvalidProtocolBufferException e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        } else if (typeUrl.equals(DeterministicAeadConfig.AES_SIV_TYPE_URL)) {
            try {
                AesSivKeyFormat parseFrom3 = AesSivKeyFormat.parseFrom(keyTemplate.getValue(), ExtensionRegistryLite.getEmptyRegistry());
                this.aesSivKey = (AesSivKey) Registry.newKey(keyTemplate);
                this.symmetricKeySize = parseFrom3.getKeySize();
            } catch (InvalidProtocolBufferException e3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
            }
        } else {
            throw new GeneralSecurityException(a.a("unsupported AEAD DEM key type: ", typeUrl));
        }
    }

    @Override // com.google.crypto.tink.subtle.EciesAeadHkdfDemHelper
    public AeadOrDaead getAeadOrDaead(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length == getSymmetricKeySizeInBytes()) {
            if (this.demKeyTypeUrl.equals(AeadConfig.AES_GCM_TYPE_URL)) {
                return new AeadOrDaead((Aead) Registry.getPrimitive(this.demKeyTypeUrl, AesGcmKey.newBuilder().mergeFrom((AesGcmKey.Builder) this.aesGcmKey).setKeyValue(ByteString.copyFrom(bArr, 0, this.symmetricKeySize)).build(), Aead.class));
            } else if (this.demKeyTypeUrl.equals(AeadConfig.AES_CTR_HMAC_AEAD_TYPE_URL)) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.aesCtrKeySize);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.aesCtrKeySize, this.symmetricKeySize);
                AesCtrHmacAeadKey.Builder aesCtrKey = AesCtrHmacAeadKey.newBuilder().setVersion(this.aesCtrHmacAeadKey.getVersion()).setAesCtrKey(AesCtrKey.newBuilder().mergeFrom((AesCtrKey.Builder) this.aesCtrHmacAeadKey.getAesCtrKey()).setKeyValue(ByteString.copyFrom(copyOfRange)).build());
                return new AeadOrDaead((Aead) Registry.getPrimitive(this.demKeyTypeUrl, aesCtrKey.setHmacKey(HmacKey.newBuilder().mergeFrom((HmacKey.Builder) this.aesCtrHmacAeadKey.getHmacKey()).setKeyValue(ByteString.copyFrom(copyOfRange2)).build()).build(), Aead.class));
            } else if (this.demKeyTypeUrl.equals(DeterministicAeadConfig.AES_SIV_TYPE_URL)) {
                return new AeadOrDaead((DeterministicAead) Registry.getPrimitive(this.demKeyTypeUrl, AesSivKey.newBuilder().mergeFrom((AesSivKey.Builder) this.aesSivKey).setKeyValue(ByteString.copyFrom(bArr, 0, this.symmetricKeySize)).build(), DeterministicAead.class));
            } else {
                throw new GeneralSecurityException("unknown DEM key type");
            }
        }
        throw new GeneralSecurityException("Symmetric key has incorrect length");
    }

    @Override // com.google.crypto.tink.subtle.EciesAeadHkdfDemHelper
    public int getSymmetricKeySizeInBytes() {
        return this.symmetricKeySize;
    }
}
