package com.google.crypto.tink.mac;

import com.google.crypto.tink.annotations.Alpha;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
@Alpha
/* loaded from: classes4.dex */
public final class HmacParameters extends MacParameters {
    private final HashType hashType;
    private final int keySizeBytes;
    private final int tagSizeBytes;
    private final Variant variant;

    /* loaded from: classes4.dex */
    public static final class Builder {
        private HashType hashType;
        private Integer keySizeBytes;
        private Integer tagSizeBytes;
        private Variant variant;

        private static void validateTagSizeBytes(int i, HashType hashType) throws GeneralSecurityException {
            if (i >= 10) {
                if (hashType == HashType.SHA1) {
                    if (i <= 20) {
                        return;
                    }
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(i)));
                } else if (hashType == HashType.SHA224) {
                    if (i <= 28) {
                        return;
                    }
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(i)));
                } else if (hashType == HashType.SHA256) {
                    if (i <= 32) {
                        return;
                    }
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(i)));
                } else if (hashType == HashType.SHA384) {
                    if (i <= 48) {
                        return;
                    }
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(i)));
                } else if (hashType == HashType.SHA512) {
                    if (i <= 64) {
                        return;
                    }
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(i)));
                } else {
                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                }
            }
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i)));
        }

        public HmacParameters build() throws GeneralSecurityException {
            Integer num = this.keySizeBytes;
            if (num != null) {
                if (this.tagSizeBytes != null) {
                    if (this.hashType != null) {
                        if (this.variant != null) {
                            if (num.intValue() >= 16) {
                                validateTagSizeBytes(this.tagSizeBytes.intValue(), this.hashType);
                                return new HmacParameters(this.keySizeBytes.intValue(), this.tagSizeBytes.intValue(), this.variant, this.hashType);
                            }
                            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.keySizeBytes));
                        }
                        throw new GeneralSecurityException("variant is not set");
                    }
                    throw new GeneralSecurityException("hash type is not set");
                }
                throw new GeneralSecurityException("tag size is not set");
            }
            throw new GeneralSecurityException("key size is not set");
        }

        @CanIgnoreReturnValue
        public Builder setHashType(HashType hashType) {
            this.hashType = hashType;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setKeySizeBytes(int i) throws GeneralSecurityException {
            this.keySizeBytes = Integer.valueOf(i);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTagSizeBytes(int i) throws GeneralSecurityException {
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
            this.tagSizeBytes = null;
            this.hashType = null;
            this.variant = Variant.NO_PREFIX;
        }
    }

    @Immutable
    /* loaded from: classes4.dex */
    public static final class HashType {
        public static final HashType SHA1 = new HashType("SHA1");
        public static final HashType SHA224 = new HashType("SHA224");
        public static final HashType SHA256 = new HashType("SHA256");
        public static final HashType SHA384 = new HashType("SHA384");
        public static final HashType SHA512 = new HashType("SHA512");
        private final String name;

        private HashType(String str) {
            this.name = str;
        }

        public String toString() {
            return this.name;
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
        if (!(obj instanceof HmacParameters)) {
            return false;
        }
        HmacParameters hmacParameters = (HmacParameters) obj;
        if (hmacParameters.getKeySizeBytes() != getKeySizeBytes() || hmacParameters.getTotalTagSizeBytes() != getTotalTagSizeBytes() || hmacParameters.getVariant() != getVariant() || hmacParameters.getHashType() != getHashType()) {
            return false;
        }
        return true;
    }

    public int getCryptographicTagSizeBytes() {
        return this.tagSizeBytes;
    }

    public HashType getHashType() {
        return this.hashType;
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
        return Objects.hash(Integer.valueOf(this.keySizeBytes), Integer.valueOf(this.tagSizeBytes), this.variant, this.hashType);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HMAC Parameters (variant: ");
        sb.append(this.variant);
        sb.append(", hashType: ");
        sb.append(this.hashType);
        sb.append(", ");
        sb.append(this.tagSizeBytes);
        sb.append("-byte tags, and ");
        return defpackage.e.f(sb, this.keySizeBytes, "-byte key)");
    }

    private HmacParameters(int i, int i2, Variant variant, HashType hashType) {
        this.keySizeBytes = i;
        this.tagSizeBytes = i2;
        this.variant = variant;
        this.hashType = hashType;
    }
}
