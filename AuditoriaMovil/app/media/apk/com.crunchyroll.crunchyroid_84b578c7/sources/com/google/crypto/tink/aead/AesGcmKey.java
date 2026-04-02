package com.google.crypto.tink.aead;

import com.google.crypto.tink.AccessesPartialKey;
import com.google.crypto.tink.Key;
import com.google.crypto.tink.aead.AesGcmParameters;
import com.google.crypto.tink.annotations.Alpha;
import com.google.crypto.tink.util.Bytes;
import com.google.crypto.tink.util.SecretBytes;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import com.google.errorprone.annotations.RestrictedApi;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Objects;
@Immutable
@Alpha
/* loaded from: classes4.dex */
public final class AesGcmKey extends AeadKey {
    private final Integer idRequirement;
    private final SecretBytes keyBytes;
    private final Bytes outputPrefix;
    private final AesGcmParameters parameters;

    /* loaded from: classes4.dex */
    public static class Builder {
        private Integer idRequirement;
        private SecretBytes keyBytes;
        private AesGcmParameters parameters;

        private Bytes getOutputPrefix() {
            if (this.parameters.getVariant() == AesGcmParameters.Variant.NO_PREFIX) {
                return Bytes.copyFrom(new byte[0]);
            }
            if (this.parameters.getVariant() == AesGcmParameters.Variant.CRUNCHY) {
                return Bytes.copyFrom(ByteBuffer.allocate(5).put((byte) 0).putInt(this.idRequirement.intValue()).array());
            }
            if (this.parameters.getVariant() == AesGcmParameters.Variant.TINK) {
                return Bytes.copyFrom(ByteBuffer.allocate(5).put((byte) 1).putInt(this.idRequirement.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + this.parameters.getVariant());
        }

        public AesGcmKey build() throws GeneralSecurityException {
            AesGcmParameters aesGcmParameters = this.parameters;
            if (aesGcmParameters != null && this.keyBytes != null) {
                if (aesGcmParameters.getKeySizeBytes() == this.keyBytes.size()) {
                    if (this.parameters.hasIdRequirement() && this.idRequirement == null) {
                        throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                    }
                    if (!this.parameters.hasIdRequirement() && this.idRequirement != null) {
                        throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                    }
                    return new AesGcmKey(this.parameters, this.keyBytes, getOutputPrefix(), this.idRequirement);
                }
                throw new GeneralSecurityException("Key size mismatch");
            }
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }

        @CanIgnoreReturnValue
        public Builder setIdRequirement(Integer num) {
            this.idRequirement = num;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setKeyBytes(SecretBytes secretBytes) {
            this.keyBytes = secretBytes;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setParameters(AesGcmParameters aesGcmParameters) {
            this.parameters = aesGcmParameters;
            return this;
        }

        private Builder() {
            this.parameters = null;
            this.keyBytes = null;
            this.idRequirement = null;
        }
    }

    @RestrictedApi(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {AccessesPartialKey.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public static Builder builder() {
        return new Builder();
    }

    @Override // com.google.crypto.tink.Key
    public boolean equalsKey(Key key) {
        if (!(key instanceof AesGcmKey)) {
            return false;
        }
        AesGcmKey aesGcmKey = (AesGcmKey) key;
        if (!aesGcmKey.parameters.equals(this.parameters) || !aesGcmKey.keyBytes.equalsSecretBytes(this.keyBytes) || !Objects.equals(aesGcmKey.idRequirement, this.idRequirement)) {
            return false;
        }
        return true;
    }

    @Override // com.google.crypto.tink.Key
    public Integer getIdRequirementOrNull() {
        return this.idRequirement;
    }

    @RestrictedApi(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {AccessesPartialKey.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public SecretBytes getKeyBytes() {
        return this.keyBytes;
    }

    @Override // com.google.crypto.tink.aead.AeadKey
    public Bytes getOutputPrefix() {
        return this.outputPrefix;
    }

    private AesGcmKey(AesGcmParameters aesGcmParameters, SecretBytes secretBytes, Bytes bytes, Integer num) {
        this.parameters = aesGcmParameters;
        this.keyBytes = secretBytes;
        this.outputPrefix = bytes;
        this.idRequirement = num;
    }

    @Override // com.google.crypto.tink.aead.AeadKey, com.google.crypto.tink.Key
    public AesGcmParameters getParameters() {
        return this.parameters;
    }
}
