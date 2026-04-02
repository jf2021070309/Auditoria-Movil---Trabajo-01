package com.google.crypto.tink.mac;

import com.google.crypto.tink.AccessesPartialKey;
import com.google.crypto.tink.Key;
import com.google.crypto.tink.annotations.Alpha;
import com.google.crypto.tink.mac.HmacParameters;
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
public final class HmacKey extends MacKey {
    private final Integer idRequirement;
    private final SecretBytes keyBytes;
    private final Bytes outputPrefix;
    private final HmacParameters parameters;

    /* loaded from: classes4.dex */
    public static class Builder {
        private Integer idRequirement;
        private SecretBytes keyBytes;
        private HmacParameters parameters;

        private Bytes getOutputPrefix() {
            if (this.parameters.getVariant() == HmacParameters.Variant.NO_PREFIX) {
                return Bytes.copyFrom(new byte[0]);
            }
            if (this.parameters.getVariant() != HmacParameters.Variant.LEGACY && this.parameters.getVariant() != HmacParameters.Variant.CRUNCHY) {
                if (this.parameters.getVariant() == HmacParameters.Variant.TINK) {
                    return Bytes.copyFrom(ByteBuffer.allocate(5).put((byte) 1).putInt(this.idRequirement.intValue()).array());
                }
                throw new IllegalStateException("Unknown HmacParameters.Variant: " + this.parameters.getVariant());
            }
            return Bytes.copyFrom(ByteBuffer.allocate(5).put((byte) 0).putInt(this.idRequirement.intValue()).array());
        }

        public HmacKey build() throws GeneralSecurityException {
            HmacParameters hmacParameters = this.parameters;
            if (hmacParameters != null && this.keyBytes != null) {
                if (hmacParameters.getKeySizeBytes() == this.keyBytes.size()) {
                    if (this.parameters.hasIdRequirement() && this.idRequirement == null) {
                        throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                    }
                    if (!this.parameters.hasIdRequirement() && this.idRequirement != null) {
                        throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                    }
                    return new HmacKey(this.parameters, this.keyBytes, getOutputPrefix(), this.idRequirement);
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
        public Builder setParameters(HmacParameters hmacParameters) {
            this.parameters = hmacParameters;
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
        if (!(key instanceof HmacKey)) {
            return false;
        }
        HmacKey hmacKey = (HmacKey) key;
        if (!hmacKey.parameters.equals(this.parameters) || !hmacKey.keyBytes.equalsSecretBytes(this.keyBytes) || !Objects.equals(hmacKey.idRequirement, this.idRequirement)) {
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

    @Override // com.google.crypto.tink.mac.MacKey
    public Bytes getOutputPrefix() {
        return this.outputPrefix;
    }

    private HmacKey(HmacParameters hmacParameters, SecretBytes secretBytes, Bytes bytes, Integer num) {
        this.parameters = hmacParameters;
        this.keyBytes = secretBytes;
        this.outputPrefix = bytes;
        this.idRequirement = num;
    }

    @Override // com.google.crypto.tink.mac.MacKey, com.google.crypto.tink.Key
    public HmacParameters getParameters() {
        return this.parameters;
    }
}
