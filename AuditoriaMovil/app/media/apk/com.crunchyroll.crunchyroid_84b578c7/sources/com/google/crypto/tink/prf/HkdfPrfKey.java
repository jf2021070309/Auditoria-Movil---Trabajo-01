package com.google.crypto.tink.prf;

import com.google.crypto.tink.AccessesPartialKey;
import com.google.crypto.tink.Key;
import com.google.crypto.tink.annotations.Alpha;
import com.google.crypto.tink.util.SecretBytes;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import com.google.errorprone.annotations.RestrictedApi;
import java.security.GeneralSecurityException;
@Immutable
@Alpha
/* loaded from: classes4.dex */
public final class HkdfPrfKey extends PrfKey {
    private final SecretBytes keyBytes;
    private final HkdfPrfParameters parameters;

    /* loaded from: classes4.dex */
    public static final class Builder {
        private SecretBytes keyBytes;
        private HkdfPrfParameters parameters;

        public HkdfPrfKey build() throws GeneralSecurityException {
            HkdfPrfParameters hkdfPrfParameters = this.parameters;
            if (hkdfPrfParameters != null && this.keyBytes != null) {
                if (hkdfPrfParameters.getKeySizeBytes() == this.keyBytes.size()) {
                    return new HkdfPrfKey(this.parameters, this.keyBytes);
                }
                throw new GeneralSecurityException("Key size mismatch");
            }
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }

        @CanIgnoreReturnValue
        public Builder setKeyBytes(SecretBytes secretBytes) {
            this.keyBytes = secretBytes;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setParameters(HkdfPrfParameters hkdfPrfParameters) {
            this.parameters = hkdfPrfParameters;
            return this;
        }

        private Builder() {
            this.parameters = null;
            this.keyBytes = null;
        }
    }

    @RestrictedApi(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {AccessesPartialKey.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public static Builder builder() {
        return new Builder();
    }

    @Override // com.google.crypto.tink.Key
    public boolean equalsKey(Key key) {
        if (!(key instanceof HkdfPrfKey)) {
            return false;
        }
        HkdfPrfKey hkdfPrfKey = (HkdfPrfKey) key;
        if (!hkdfPrfKey.parameters.equals(this.parameters) || !hkdfPrfKey.keyBytes.equalsSecretBytes(this.keyBytes)) {
            return false;
        }
        return true;
    }

    @Override // com.google.crypto.tink.Key
    public Integer getIdRequirementOrNull() {
        return null;
    }

    @RestrictedApi(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {AccessesPartialKey.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public SecretBytes getKeyBytes() {
        return this.keyBytes;
    }

    private HkdfPrfKey(HkdfPrfParameters hkdfPrfParameters, SecretBytes secretBytes) {
        this.parameters = hkdfPrfParameters;
        this.keyBytes = secretBytes;
    }

    @Override // com.google.crypto.tink.prf.PrfKey, com.google.crypto.tink.Key
    public HkdfPrfParameters getParameters() {
        return this.parameters;
    }
}
