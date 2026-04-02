package com.google.crypto.tink.aead;

import com.google.errorprone.annotations.Immutable;
import java.util.Objects;
/* loaded from: classes4.dex */
public final class XChaCha20Poly1305Parameters extends AeadParameters {
    private final Variant variant;

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

    private XChaCha20Poly1305Parameters(Variant variant) {
        this.variant = variant;
    }

    public static XChaCha20Poly1305Parameters create() {
        return new XChaCha20Poly1305Parameters(Variant.NO_PREFIX);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof XChaCha20Poly1305Parameters) || ((XChaCha20Poly1305Parameters) obj).getVariant() != getVariant()) {
            return false;
        }
        return true;
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
        return Objects.hashCode(this.variant);
    }

    public String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.variant + ")";
    }

    public static XChaCha20Poly1305Parameters create(Variant variant) {
        return new XChaCha20Poly1305Parameters(variant);
    }
}
