package com.google.crypto.tink.signature;

import com.google.crypto.tink.AccessesPartialKey;
import com.google.crypto.tink.Key;
import com.google.crypto.tink.annotations.Alpha;
import com.google.crypto.tink.internal.EllipticCurvesUtil;
import com.google.crypto.tink.signature.EcdsaParameters;
import com.google.crypto.tink.util.Bytes;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import com.google.errorprone.annotations.RestrictedApi;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.util.Objects;
@Immutable
@Alpha
/* loaded from: classes4.dex */
public final class EcdsaPublicKey extends SignaturePublicKey {
    private final Integer idRequirement;
    private final Bytes outputPrefix;
    private final EcdsaParameters parameters;
    private final ECPoint publicPoint;

    /* loaded from: classes4.dex */
    public static class Builder {
        private Integer idRequirement;
        private EcdsaParameters parameters;
        private ECPoint publicPoint;

        private Bytes getOutputPrefix() {
            if (this.parameters.getVariant() == EcdsaParameters.Variant.NO_PREFIX) {
                return Bytes.copyFrom(new byte[0]);
            }
            if (this.parameters.getVariant() != EcdsaParameters.Variant.LEGACY && this.parameters.getVariant() != EcdsaParameters.Variant.CRUNCHY) {
                if (this.parameters.getVariant() == EcdsaParameters.Variant.TINK) {
                    return Bytes.copyFrom(ByteBuffer.allocate(5).put((byte) 1).putInt(this.idRequirement.intValue()).array());
                }
                throw new IllegalStateException("Unknown EcdsaParameters.Variant: " + this.parameters.getVariant());
            }
            return Bytes.copyFrom(ByteBuffer.allocate(5).put((byte) 0).putInt(this.idRequirement.intValue()).array());
        }

        public EcdsaPublicKey build() throws GeneralSecurityException {
            EcdsaParameters ecdsaParameters = this.parameters;
            if (ecdsaParameters != null) {
                ECPoint eCPoint = this.publicPoint;
                if (eCPoint != null) {
                    EllipticCurvesUtil.checkPointOnCurve(eCPoint, ecdsaParameters.getCurveType().toParameterSpec().getCurve());
                    if (this.parameters.hasIdRequirement() && this.idRequirement == null) {
                        throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                    }
                    if (!this.parameters.hasIdRequirement() && this.idRequirement != null) {
                        throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                    }
                    return new EcdsaPublicKey(this.parameters, this.publicPoint, getOutputPrefix(), this.idRequirement);
                }
                throw new GeneralSecurityException("Cannot build without public point");
            }
            throw new GeneralSecurityException("Cannot build without parameters");
        }

        @CanIgnoreReturnValue
        public Builder setIdRequirement(Integer num) {
            this.idRequirement = num;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setParameters(EcdsaParameters ecdsaParameters) {
            this.parameters = ecdsaParameters;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPublicPoint(ECPoint eCPoint) {
            this.publicPoint = eCPoint;
            return this;
        }

        private Builder() {
            this.parameters = null;
            this.publicPoint = null;
            this.idRequirement = null;
        }
    }

    @RestrictedApi(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {AccessesPartialKey.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public static Builder builder() {
        return new Builder();
    }

    @Override // com.google.crypto.tink.Key
    public boolean equalsKey(Key key) {
        if (!(key instanceof EcdsaPublicKey)) {
            return false;
        }
        EcdsaPublicKey ecdsaPublicKey = (EcdsaPublicKey) key;
        if (!ecdsaPublicKey.parameters.equals(this.parameters) || !ecdsaPublicKey.publicPoint.equals(this.publicPoint) || !Objects.equals(ecdsaPublicKey.idRequirement, this.idRequirement)) {
            return false;
        }
        return true;
    }

    @Override // com.google.crypto.tink.Key
    public Integer getIdRequirementOrNull() {
        return this.idRequirement;
    }

    @Override // com.google.crypto.tink.signature.SignaturePublicKey
    public Bytes getOutputPrefix() {
        return this.outputPrefix;
    }

    @RestrictedApi(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {AccessesPartialKey.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public ECPoint getPublicPoint() {
        return this.publicPoint;
    }

    private EcdsaPublicKey(EcdsaParameters ecdsaParameters, ECPoint eCPoint, Bytes bytes, Integer num) {
        this.parameters = ecdsaParameters;
        this.publicPoint = eCPoint;
        this.outputPrefix = bytes;
        this.idRequirement = num;
    }

    @Override // com.google.crypto.tink.signature.SignaturePublicKey, com.google.crypto.tink.Key
    public EcdsaParameters getParameters() {
        return this.parameters;
    }
}
