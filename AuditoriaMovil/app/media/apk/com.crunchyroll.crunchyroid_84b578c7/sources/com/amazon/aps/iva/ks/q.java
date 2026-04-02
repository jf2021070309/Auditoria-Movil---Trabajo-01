package com.amazon.aps.iva.ks;
/* compiled from: ResolvedVideoResolutionProperty.kt */
/* loaded from: classes2.dex */
public final class q extends com.amazon.aps.iva.is.b {
    private final int resolution;
    private final int width;

    public q(int i, int i2) {
        super("ResolvedVideoResolution");
        this.width = i;
        this.resolution = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.width == qVar.width && this.resolution == qVar.resolution) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.resolution) + (Integer.hashCode(this.width) * 31);
    }

    public final String toString() {
        return com.amazon.aps.iva.q.n.a("ResolvedVideoResolutionProperty(width=", this.width, ", resolution=", this.resolution, ")");
    }
}
