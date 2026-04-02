package com.google.crypto.tink.aead;

import com.google.crypto.tink.AccessesPartialKey;
import com.google.crypto.tink.Key;
import com.google.crypto.tink.aead.XChaCha20Poly1305Parameters;
import com.google.crypto.tink.annotations.Alpha;
import com.google.crypto.tink.util.Bytes;
import com.google.crypto.tink.util.SecretBytes;
import com.google.errorprone.annotations.Immutable;
import com.google.errorprone.annotations.RestrictedApi;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Objects;
@Immutable
@Alpha
/* loaded from: classes4.dex */
public final class XChaCha20Poly1305Key extends AeadKey {
    private final Integer idRequirement;
    private final SecretBytes keyBytes;
    private final Bytes outputPrefix;
    private final XChaCha20Poly1305Parameters parameters;

    private XChaCha20Poly1305Key(XChaCha20Poly1305Parameters xChaCha20Poly1305Parameters, SecretBytes secretBytes, Bytes bytes, Integer num) {
        this.parameters = xChaCha20Poly1305Parameters;
        this.keyBytes = secretBytes;
        this.outputPrefix = bytes;
        this.idRequirement = num;
    }

    @AccessesPartialKey
    @RestrictedApi(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {AccessesPartialKey.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public static XChaCha20Poly1305Key create(SecretBytes secretBytes) throws GeneralSecurityException {
        return create(XChaCha20Poly1305Parameters.Variant.NO_PREFIX, secretBytes, null);
    }

    private static Bytes getOutputPrefix(XChaCha20Poly1305Parameters xChaCha20Poly1305Parameters, Integer num) {
        if (xChaCha20Poly1305Parameters.getVariant() == XChaCha20Poly1305Parameters.Variant.NO_PREFIX) {
            return Bytes.copyFrom(new byte[0]);
        }
        if (xChaCha20Poly1305Parameters.getVariant() == XChaCha20Poly1305Parameters.Variant.CRUNCHY) {
            return Bytes.copyFrom(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        }
        if (xChaCha20Poly1305Parameters.getVariant() == XChaCha20Poly1305Parameters.Variant.TINK) {
            return Bytes.copyFrom(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        throw new IllegalStateException("Unknown Variant: " + xChaCha20Poly1305Parameters.getVariant());
    }

    @Override // com.google.crypto.tink.Key
    public boolean equalsKey(Key key) {
        if (!(key instanceof XChaCha20Poly1305Key)) {
            return false;
        }
        XChaCha20Poly1305Key xChaCha20Poly1305Key = (XChaCha20Poly1305Key) key;
        if (!xChaCha20Poly1305Key.parameters.equals(this.parameters) || !xChaCha20Poly1305Key.keyBytes.equalsSecretBytes(this.keyBytes) || !Objects.equals(xChaCha20Poly1305Key.idRequirement, this.idRequirement)) {
            return false;
        }
        return true;
    }

    @Override // com.google.crypto.tink.Key
    public Integer getIdRequirementOrNull() {
        return this.idRequirement;
    }

    @RestrictedApi(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {AccessesPartialKey.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public SecretBytes getKeyBytes() {
        return this.keyBytes;
    }

    @RestrictedApi(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {AccessesPartialKey.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public static XChaCha20Poly1305Key create(XChaCha20Poly1305Parameters.Variant variant, SecretBytes secretBytes, Integer num) throws GeneralSecurityException {
        XChaCha20Poly1305Parameters.Variant variant2 = XChaCha20Poly1305Parameters.Variant.NO_PREFIX;
        if (variant != variant2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + variant + " the value of idRequirement must be non-null");
        } else if (variant == variant2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        } else {
            if (secretBytes.size() == 32) {
                XChaCha20Poly1305Parameters create = XChaCha20Poly1305Parameters.create(variant);
                return new XChaCha20Poly1305Key(create, secretBytes, getOutputPrefix(create, num), num);
            }
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + secretBytes.size());
        }
    }

    @Override // com.google.crypto.tink.aead.AeadKey, com.google.crypto.tink.Key
    public XChaCha20Poly1305Parameters getParameters() {
        return this.parameters;
    }

    @Override // com.google.crypto.tink.aead.AeadKey
    public Bytes getOutputPrefix() {
        return this.outputPrefix;
    }
}
