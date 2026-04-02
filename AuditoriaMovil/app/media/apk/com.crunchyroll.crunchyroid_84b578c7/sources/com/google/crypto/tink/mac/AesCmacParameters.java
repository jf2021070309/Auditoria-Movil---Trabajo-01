package com.google.crypto.tink.mac;

import com.amazon.aps.iva.q.c0;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
/* loaded from: classes4.dex */
public final class AesCmacParameters extends MacParameters {
    private final int keySizeBytes;
    private final int tagSizeBytes;
    private final Variant variant;

    /* loaded from: classes4.dex */
    public static final class Builder {
        private Integer keySizeBytes;
        private Integer tagSizeBytes;
        private Variant variant;

        public AesCmacParameters build() throws GeneralSecurityException {
            Integer num = this.keySizeBytes;
            if (num != null) {
                if (this.tagSizeBytes != null) {
                    if (this.variant != null) {
                        return new AesCmacParameters(num.intValue(), this.tagSizeBytes.intValue(), this.variant);
                    }
                    throw new GeneralSecurityException("variant not set");
                }
                throw new GeneralSecurityException("tag size not set");
            }
            throw new GeneralSecurityException("key size not set");
        }

        @CanIgnoreReturnValue
        public Builder setKeySizeBytes(int i) throws GeneralSecurityException {
            if (i != 16 && i != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
            }
            this.keySizeBytes = Integer.valueOf(i);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTagSizeBytes(int i) throws GeneralSecurityException {
            if (i >= 10 && 16 >= i) {
                this.tagSizeBytes = Integer.valueOf(i);
                return this;
            }
            throw new GeneralSecurityException(c0.a("Invalid tag size for AesCmacParameters: ", i));
        }

        @CanIgnoreReturnValue
        public Builder setVariant(Variant variant) {
            this.variant = variant;
            return this;
        }

        private Builder() {
            this.keySizeBytes = null;
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
        public static final Variant LEGACY = new Variant("LEGACY");
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
        if (!(obj instanceof AesCmacParameters)) {
            return false;
        }
        AesCmacParameters aesCmacParameters = (AesCmacParameters) obj;
        if (aesCmacParameters.getKeySizeBytes() != getKeySizeBytes() || aesCmacParameters.getTotalTagSizeBytes() != getTotalTagSizeBytes() || aesCmacParameters.getVariant() != getVariant()) {
            return false;
        }
        return true;
    }

    public int getCryptographicTagSizeBytes() {
        return this.tagSizeBytes;
    }

    public int getKeySizeBytes() {
        return this.keySizeBytes;
    }

    public int getTotalTagSizeBytes() {
        int cryptographicTagSizeBytes;
        Variant variant = this.variant;
        if (variant == Variant.NO_PREFIX) {
            return getCryptographicTagSizeBytes();
        }
        if (variant == Variant.TINK) {
            cryptographicTagSizeBytes = getCryptographicTagSizeBytes();
        } else if (variant == Variant.CRUNCHY) {
            cryptographicTagSizeBytes = getCryptographicTagSizeBytes();
        } else if (variant == Variant.LEGACY) {
            cryptographicTagSizeBytes = getCryptographicTagSizeBytes();
        } else {
            throw new IllegalStateException("Unknown variant");
        }
        return cryptographicTagSizeBytes + 5;
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
        return Objects.hash(Integer.valueOf(this.keySizeBytes), Integer.valueOf(this.tagSizeBytes), this.variant);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AES-CMAC Parameters (variant: ");
        sb.append(this.variant);
        sb.append(", ");
        sb.append(this.tagSizeBytes);
        sb.append("-byte tags, and ");
        return defpackage.e.f(sb, this.keySizeBytes, "-byte key)");
    }

    private AesCmacParameters(int i, int i2, Variant variant) {
        this.keySizeBytes = i;
        this.tagSizeBytes = i2;
        this.variant = variant;
    }
}
