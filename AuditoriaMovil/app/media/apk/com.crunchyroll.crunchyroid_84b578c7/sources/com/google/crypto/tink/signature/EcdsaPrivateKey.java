package com.google.crypto.tink.signature;

import com.google.crypto.tink.AccessesPartialKey;
import com.google.crypto.tink.InsecureSecretKeyAccess;
import com.google.crypto.tink.Key;
import com.google.crypto.tink.annotations.Alpha;
import com.google.crypto.tink.internal.EllipticCurvesUtil;
import com.google.crypto.tink.signature.EcdsaParameters;
import com.google.crypto.tink.util.SecretBigInteger;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import com.google.errorprone.annotations.RestrictedApi;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
@Immutable
@Alpha
/* loaded from: classes4.dex */
public final class EcdsaPrivateKey extends SignaturePrivateKey {
    private final SecretBigInteger privateValue;
    private final EcdsaPublicKey publicKey;

    /* loaded from: classes4.dex */
    public static class Builder {
        private SecretBigInteger privateValue;
        private EcdsaPublicKey publicKey;

        private static void validatePrivateValue(BigInteger bigInteger, ECPoint eCPoint, EcdsaParameters.CurveType curveType) throws GeneralSecurityException {
            BigInteger order = curveType.toParameterSpec().getOrder();
            if (bigInteger.signum() > 0 && bigInteger.compareTo(order) < 0) {
                if (EllipticCurvesUtil.multiplyByGenerator(bigInteger, curveType.toParameterSpec()).equals(eCPoint)) {
                    return;
                }
                throw new GeneralSecurityException("Invalid private value");
            }
            throw new GeneralSecurityException("Invalid private value");
        }

        @AccessesPartialKey
        public EcdsaPrivateKey build() throws GeneralSecurityException {
            if (this.publicKey != null) {
                SecretBigInteger secretBigInteger = this.privateValue;
                if (secretBigInteger != null) {
                    validatePrivateValue(secretBigInteger.getBigInteger(InsecureSecretKeyAccess.get()), this.publicKey.getPublicPoint(), this.publicKey.getParameters().getCurveType());
                    return new EcdsaPrivateKey(this.publicKey, this.privateValue);
                }
                throw new GeneralSecurityException("Cannot build without a private value");
            }
            throw new GeneralSecurityException("Cannot build without a ecdsa public key");
        }

        @CanIgnoreReturnValue
        public Builder setPrivateValue(SecretBigInteger secretBigInteger) {
            this.privateValue = secretBigInteger;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPublicKey(EcdsaPublicKey ecdsaPublicKey) {
            this.publicKey = ecdsaPublicKey;
            return this;
        }

        private Builder() {
            this.publicKey = null;
            this.privateValue = null;
        }
    }

    @RestrictedApi(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {AccessesPartialKey.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public static Builder builder() {
        return new Builder();
    }

    @Override // com.google.crypto.tink.Key
    public boolean equalsKey(Key key) {
        if (!(key instanceof EcdsaPrivateKey)) {
            return false;
        }
        EcdsaPrivateKey ecdsaPrivateKey = (EcdsaPrivateKey) key;
        if (!ecdsaPrivateKey.publicKey.equalsKey(this.publicKey) || !this.privateValue.equalsSecretBigInteger(ecdsaPrivateKey.privateValue)) {
            return false;
        }
        return true;
    }

    @RestrictedApi(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {AccessesPartialKey.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public SecretBigInteger getPrivateValue() {
        return this.privateValue;
    }

    private EcdsaPrivateKey(EcdsaPublicKey ecdsaPublicKey, SecretBigInteger secretBigInteger) {
        this.publicKey = ecdsaPublicKey;
        this.privateValue = secretBigInteger;
    }

    @Override // com.google.crypto.tink.signature.SignaturePrivateKey, com.google.crypto.tink.Key
    public EcdsaParameters getParameters() {
        return this.publicKey.getParameters();
    }

    @Override // com.google.crypto.tink.signature.SignaturePrivateKey, com.google.crypto.tink.PrivateKey
    public EcdsaPublicKey getPublicKey() {
        return this.publicKey;
    }
}
