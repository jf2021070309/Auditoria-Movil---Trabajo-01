package com.google.crypto.tink.aead;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
/* loaded from: classes4.dex */
public final class AesGcmSivParameters extends AeadParameters {
    private final int keySizeBytes;
    private final Variant variant;

    /* loaded from: classes4.dex */
    public static final class Builder {
        private Integer keySizeBytes;
        private Variant variant;

        public AesGcmSivParameters build() throws GeneralSecurityException {
            Integer num = this.keySizeBytes;
            if (num != null) {
                if (this.variant != null) {
                    return new AesGcmSivParameters(num.intValue(), this.variant);
                }
                throw new GeneralSecurityException("Variant is not set");
            }
            throw new GeneralSecurityException("Key size is not set");
        }

        @CanIgnoreReturnValue
        public Builder setKeySizeBytes(int i) throws GeneralSecurityException {
            if (i != 16 && i != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
            }
            this.keySizeBytes = Integer.valueOf(i);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setVariant(Variant variant) {
            this.variant = variant;
            return this;
        }

        private Builder() {
            this.keySizeBytes = null;
            this.variant = Variant.NO_PREFIX;
        }
    }

    @Immutable
    /* loaded from: classes4.dex */
    public static final class Variant {
        private final String name;
        public static final Variant TINK = new Variant("TINK");
        public static final Variant CRUNCHY = new Variant("CRUNCHY");
        public static final Variant NO_PREFIX = new Variant("NO_PREFIX");

        private Variant(String str) {
            this.name = str;
        }

        public String toString() {
            return this.name;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AesGcmSivParameters)) {
            return false;
        }
        AesGcmSivParameters aesGcmSivParameters = (AesGcmSivParameters) obj;
        if (aesGcmSivParameters.getKeySizeBytes() != getKeySizeBytes() || aesGcmSivParameters.getVariant() != getVariant()) {
            return false;
        }
        return true;
    }

    public int getKeySizeBytes() {
        return this.keySizeBytes;
    }

    public Variant getVariant() {
        return this.variant;
    }

    @Override // com.google.crypto.tink.Parameters
    public boolean hasIdRequirement() {
        if (this.variant != Variant.NO_PREFIX) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.keySizeBytes), this.variant);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AesGcmSiv Parameters (variant: ");
        sb.append(this.variant);
        sb.append(", ");
        return defpackage.e.f(sb, this.keySizeBytes, "-byte key)");
    }

    private AesGcmSivParameters(int i, Variant variant) {
        this.keySizeBytes = i;
        this.variant = variant;
    }
}
