package com.google.crypto.tink.jwt;

import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.util.List;
/* loaded from: classes4.dex */
class JwtMacWrapper implements PrimitiveWrapper<JwtMacInternal, JwtMac> {
    private static final JwtMacWrapper WRAPPER = new JwtMacWrapper();

    @Immutable
    /* loaded from: classes4.dex */
    public static class WrappedJwtMac implements JwtMac {
        private final PrimitiveSet<JwtMacInternal> primitives;

        @Override // com.google.crypto.tink.jwt.JwtMac
        public String computeMacAndEncode(RawJwt rawJwt) throws GeneralSecurityException {
            PrimitiveSet.Entry<JwtMacInternal> primary = this.primitives.getPrimary();
            return primary.getPrimitive().computeMacAndEncodeWithKid(rawJwt, JwtFormat.getKid(primary.getKeyId(), primary.getOutputPrefixType()));
        }

        @Override // com.google.crypto.tink.jwt.JwtMac
        public VerifiedJwt verifyMacAndDecode(String str, JwtValidator jwtValidator) throws GeneralSecurityException {
            GeneralSecurityException generalSecurityException = null;
            for (List<PrimitiveSet.Entry<JwtMacInternal>> list : this.primitives.getAll()) {
                for (PrimitiveSet.Entry<JwtMacInternal> entry : list) {
                    try {
                        return entry.getPrimitive().verifyMacAndDecodeWithKid(str, jwtValidator, JwtFormat.getKid(entry.getKeyId(), entry.getOutputPrefixType()));
                    } catch (GeneralSecurityException e) {
                        if (e instanceof JwtInvalidException) {
                            generalSecurityException = e;
                        }
                    }
                }
            }
            if (generalSecurityException != null) {
                throw generalSecurityException;
            }
            throw new GeneralSecurityException("invalid MAC");
        }

        private WrappedJwtMac(PrimitiveSet<JwtMacInternal> primitiveSet) {
            this.primitives = primitiveSet;
        }
    }

    public static void register() throws GeneralSecurityException {
        Registry.registerPrimitiveWrapper(WRAPPER);
    }

    private static void validate(PrimitiveSet<JwtMacInternal> primitiveSet) throws GeneralSecurityException {
        if (primitiveSet.getPrimary() != null) {
            for (List<PrimitiveSet.Entry<JwtMacInternal>> list : primitiveSet.getAll()) {
                for (PrimitiveSet.Entry<JwtMacInternal> entry : list) {
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
    public Class<JwtMacInternal> getInputPrimitiveClass() {
        return JwtMacInternal.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<JwtMac> getPrimitiveClass() {
        return JwtMac.class;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public JwtMac wrap(PrimitiveSet<JwtMacInternal> primitiveSet) throws GeneralSecurityException {
        validate(primitiveSet);
        return new WrappedJwtMac(primitiveSet);
    }
}
