package com.google.crypto.tink.mac;

import com.google.crypto.tink.AccessesPartialKey;
import com.google.crypto.tink.Key;
import com.google.crypto.tink.mac.AesCmacParameters;
import com.google.crypto.tink.util.Bytes;
import com.google.crypto.tink.util.SecretBytes;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import com.google.errorprone.annotations.RestrictedApi;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Objects;
@Immutable
/* loaded from: classes4.dex */
public final class AesCmacKey extends MacKey {
    private final SecretBytes aesKeyBytes;
    private final Integer idRequirement;
    private final Bytes outputPrefix;
    private final AesCmacParameters parameters;

    /* loaded from: classes4.dex */
    public static class Builder {
        private SecretBytes aesKeyBytes;
        private Integer idRequirement;
        private AesCmacParameters parameters;

        private Bytes getOutputPrefix() {
            if (this.parameters.getVariant() == AesCmacParameters.Variant.NO_PREFIX) {
                return Bytes.copyFrom(new byte[0]);
            }
            if (this.parameters.getVariant() != AesCmacParameters.Variant.LEGACY && this.parameters.getVariant() != AesCmacParameters.Variant.CRUNCHY) {
                if (this.parameters.getVariant() == AesCmacParameters.Variant.TINK) {
                    return Bytes.copyFrom(ByteBuffer.allocate(5).put((byte) 1).putInt(this.idRequirement.intValue()).array());
                }
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + this.parameters.getVariant());
            }
            return Bytes.copyFrom(ByteBuffer.allocate(5).put((byte) 0).putInt(this.idRequirement.intValue()).array());
        }

        public AesCmacKey build() throws GeneralSecurityException {
            AesCmacParameters aesCmacParameters = this.parameters;
            if (aesCmacParameters != null && this.aesKeyBytes != null) {
                if (aesCmacParameters.getKeySizeBytes() == this.aesKeyBytes.size()) {
                    if (this.parameters.hasIdRequirement() && this.idRequirement == null) {
                        throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                    }
                    if (!this.parameters.hasIdRequirement() && this.idRequirement != null) {
                        throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                    }
                    return new AesCmacKey(this.parameters, this.aesKeyBytes, getOutputPrefix(), this.idRequirement);
                }
                throw new GeneralSecurityException("Key size mismatch");
            }
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }

        @CanIgnoreReturnValue
        public Builder setAesKeyBytes(SecretBytes secretBytes) throws GeneralSecurityException {
            this.aesKeyBytes = secretBytes;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setIdRequirement(Integer num) {
            this.idRequirement = num;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setParameters(AesCmacParameters aesCmacParameters) {
            this.parameters = aesCmacParameters;
            return this;
        }

        private Builder() {
            this.parameters = null;
            this.aesKeyBytes = null;
            this.idRequirement = null;
        }
    }

    @RestrictedApi(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {AccessesPartialKey.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public static Builder builder() {
        return new Builder();
    }

    @Override // com.google.crypto.tink.Key
    public boolean equalsKey(Key key) {
        if (!(key instanceof AesCmacKey)) {
            return false;
        }
        AesCmacKey aesCmacKey = (AesCmacKey) key;
        if (!aesCmacKey.parameters.equals(this.parameters) || !aesCmacKey.aesKeyBytes.equalsSecretBytes(this.aesKeyBytes) || !Objects.equals(aesCmacKey.idRequirement, this.idRequirement)) {
            return false;
        }
        return true;
    }

    @RestrictedApi(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {AccessesPartialKey.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public SecretBytes getAesKey() {
        return this.aesKeyBytes;
    }

    @Override // com.google.crypto.tink.Key
    public Integer getIdRequirementOrNull() {
        return this.idRequirement;
    }

    @Override // com.google.crypto.tink.mac.MacKey
    public Bytes getOutputPrefix() {
        return this.outputPrefix;
    }

    private AesCmacKey(AesCmacParameters aesCmacParameters, SecretBytes secretBytes, Bytes bytes, Integer num) {
        this.parameters = aesCmacParameters;
        this.aesKeyBytes = secretBytes;
        this.outputPrefix = bytes;
        this.idRequirement = num;
    }

    @Override // com.google.crypto.tink.mac.MacKey, com.google.crypto.tink.Key
    public AesCmacParameters getParameters() {
        return this.parameters;
    }
}
