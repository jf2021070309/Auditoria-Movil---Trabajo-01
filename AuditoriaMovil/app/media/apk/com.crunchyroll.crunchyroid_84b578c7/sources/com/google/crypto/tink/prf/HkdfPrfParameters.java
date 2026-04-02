package com.google.crypto.tink.prf;

import com.google.crypto.tink.annotations.Alpha;
import com.google.crypto.tink.util.Bytes;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
@Alpha
/* loaded from: classes4.dex */
public final class HkdfPrfParameters extends PrfParameters {
    private static final int MIN_KEY_SIZE = 16;
    private final HashType hashType;
    private final int keySizeBytes;
    private final Bytes salt;

    /* loaded from: classes4.dex */
    public static final class Builder {
        private HashType hashType;
        private Integer keySizeBytes;
        private Bytes salt;

        public HkdfPrfParameters build() throws GeneralSecurityException {
            Integer num = this.keySizeBytes;
            if (num != null) {
                if (this.hashType != null) {
                    return new HkdfPrfParameters(num.intValue(), this.hashType, this.salt);
                }
                throw new GeneralSecurityException("hash type is not set");
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
            if (i >= 16) {
                this.keySizeBytes = Integer.valueOf(i);
                return this;
            }
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit or larger are supported", Integer.valueOf(i * 8)));
        }

        @CanIgnoreReturnValue
        public Builder setSalt(Bytes bytes) {
            if (bytes.size() == 0) {
                return this;
            }
            this.salt = bytes;
            return this;
        }

        private Builder() {
            this.keySizeBytes = null;
            this.hashType = null;
            this.salt = null;
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

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof HkdfPrfParameters)) {
            return false;
        }
        HkdfPrfParameters hkdfPrfParameters = (HkdfPrfParameters) obj;
        if (hkdfPrfParameters.getKeySizeBytes() != getKeySizeBytes() || hkdfPrfParameters.getHashType() != getHashType() || !Objects.equals(hkdfPrfParameters.getSalt(), getSalt())) {
            return false;
        }
        return true;
    }

    public HashType getHashType() {
        return this.hashType;
    }

    public int getKeySizeBytes() {
        return this.keySizeBytes;
    }

    public Bytes getSalt() {
        return this.salt;
    }

    @Override // com.google.crypto.tink.Parameters
    public boolean hasIdRequirement() {
        return false;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.keySizeBytes), this.hashType, this.salt);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HKDF PRF Parameters (hashType: ");
        sb.append(this.hashType);
        sb.append(", salt: ");
        sb.append(this.salt);
        sb.append(", and ");
        return e.f(sb, this.keySizeBytes, "-byte key)");
    }

    private HkdfPrfParameters(int i, HashType hashType, Bytes bytes) {
        this.keySizeBytes = i;
        this.hashType = hashType;
        this.salt = bytes;
    }
}
