package com.google.crypto.tink.aead;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
/* loaded from: classes4.dex */
public final class AesGcmParameters extends AeadParameters {
    private final int ivSizeBytes;
    private final int keySizeBytes;
    private final int tagSizeBytes;
    private final Variant variant;

    /* loaded from: classes4.dex */
    public static final class Builder {
        private Integer ivSizeBytes;
        private Integer keySizeBytes;
        private Integer tagSizeBytes;
        private Variant variant;

        public AesGcmParameters build() throws GeneralSecurityException {
            Integer num = this.keySizeBytes;
            if (num != null) {
                if (this.variant != null) {
                    if (this.ivSizeBytes != null) {
                        if (this.tagSizeBytes != null) {
                            return new AesGcmParameters(num.intValue(), this.ivSizeBytes.intValue(), this.tagSizeBytes.intValue(), this.variant);
                        }
                        throw new GeneralSecurityException("Tag size is not set");
                    }
                    throw new GeneralSecurityException("IV size is not set");
                }
                throw new GeneralSecurityException("Variant is not set");
            }
            throw new GeneralSecurityException("Key size is not set");
        }

        @CanIgnoreReturnValue
        public Builder setIvSizeBytes(int i) throws GeneralSecurityException {
            if (i > 0) {
                this.ivSizeBytes = Integer.valueOf(i);
                return this;
            }
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be positive", Integer.valueOf(i)));
        }

        @CanIgnoreReturnValue
        public Builder setKeySizeBytes(int i) throws GeneralSecurityException {
            if (i != 16 && i != 24 && i != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
            }
            this.keySizeBytes = Integer.valueOf(i);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTagSizeBytes(int i) throws GeneralSecurityException {
            if (i != 12 && i != 13 && i != 14 && i != 15 && i != 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be one of the following: 12, 13, 14, 15 or 16 bytes", Integer.valueOf(i)));
            }
            this.tagSizeBytes = Integer.valueOf(i);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setVariant(Variant variant) {
            this.variant = variant;
            return this;
        }

        private Builder() {
            this.keySizeBytes = null;
            this.ivSizeBytes = null;
            this.tagSizeBytes = null;
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
        if (!(obj instanceof AesGcmParameters)) {
            return false;
        }
        AesGcmParameters aesGcmParameters = (AesGcmParameters) obj;
        if (aesGcmParameters.getKeySizeBytes() != getKeySizeBytes() || aesGcmParameters.getIvSizeBytes() != getIvSizeBytes() || aesGcmParameters.getTagSizeBytes() != getTagSizeBytes() || aesGcmParameters.getVariant() != getVariant()) {
            return false;
        }
        return true;
    }

    public int getIvSizeBytes() {
        return this.ivSizeBytes;
    }

    public int getKeySizeBytes() {
        return this.keySizeBytes;
    }

    public int getTagSizeBytes() {
        return this.tagSizeBytes;
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
        return Objects.hash(Integer.valueOf(this.keySizeBytes), Integer.valueOf(this.ivSizeBytes), Integer.valueOf(this.tagSizeBytes), this.variant);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AesGcm Parameters (variant: ");
        sb.append(this.variant);
        sb.append(", ");
        sb.append(this.ivSizeBytes);
        sb.append("-byte IV, ");
        sb.append(this.tagSizeBytes);
        sb.append("-byte tag, and ");
        return defpackage.e.f(sb, this.keySizeBytes, "-byte key)");
    }

    private AesGcmParameters(int i, int i2, int i3, Variant variant) {
        this.keySizeBytes = i;
        this.ivSizeBytes = i2;
        this.tagSizeBytes = i3;
        this.variant = variant;
    }
}
