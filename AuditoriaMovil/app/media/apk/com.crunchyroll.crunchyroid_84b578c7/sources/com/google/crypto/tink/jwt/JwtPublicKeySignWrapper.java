package com.google.crypto.tink.jwt;

import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.util.List;
/* loaded from: classes4.dex */
class JwtPublicKeySignWrapper implements PrimitiveWrapper<JwtPublicKeySignInternal, JwtPublicKeySign> {
    private static final JwtPublicKeySignWrapper WRAPPER = new JwtPublicKeySignWrapper();

    @Immutable
    /* loaded from: classes4.dex */
    public static class WrappedJwtPublicKeySign implements JwtPublicKeySign {
        private final PrimitiveSet<JwtPublicKeySignInternal> primitives;

        public WrappedJwtPublicKeySign(PrimitiveSet<JwtPublicKeySignInternal> primitiveSet) {
            this.primitives = primitiveSet;
        }

        @Override // com.google.crypto.tink.jwt.JwtPublicKeySign
        public String signAndEncode(RawJwt rawJwt) throws GeneralSecurityException {
            PrimitiveSet.Entry<JwtPublicKeySignInternal> primary = this.primitives.getPrimary();
            return this.primitives.getPrimary().getPrimitive().signAndEncodeWithKid(rawJwt, JwtFormat.getKid(primary.getKeyId(), primary.getOutputPrefixType()));
        }
    }

    public static void register() throws GeneralSecurityException {
        Registry.registerPrimitiveWrapper(WRAPPER);
    }

    private static void validate(PrimitiveSet<JwtPublicKeySignInternal> primitiveSet) throws GeneralSecurityException {
        if (primitiveSet.getPrimary() != null) {
            for (List<PrimitiveSet.Entry<JwtPublicKeySignInternal>> list : primitiveSet.getAll()) {
                for (PrimitiveSet.Entry<JwtPublicKeySignInternal> entry : list) {
                    if (entry.getOutputPrefixType() != OutputPrefixType.RAW && entry.getOutputPrefixType() != OutputPrefixType.TINK) {
                        throw new GeneralSecurityException("unsupported OutputPrefixType");
                    }
                }
            }
            return;
        }
        throw new GeneralSecurityException("Primitive set has no primary.");
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<JwtPublicKeySignInternal> getInputPrimitiveClass() {
        return JwtPublicKeySignInternal.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<JwtPublicKeySign> getPrimitiveClass() {
        return JwtPublicKeySign.class;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public JwtPublicKeySign wrap(PrimitiveSet<JwtPublicKeySignInternal> primitiveSet) throws GeneralSecurityException {
        validate(primitiveSet);
        return new WrappedJwtPublicKeySign(primitiveSet);
    }
}
