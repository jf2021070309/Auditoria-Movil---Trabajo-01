package com.kwad.sdk.utils;
/* loaded from: classes3.dex */
public final class az {
    private final int mHeight;
    private final int mWidth;

    public az(int i, int i2) {
        this.mWidth = i;
        this.mHeight = i2;
    }

    public final float Jr() {
        return this.mWidth;
    }

    public final float Js() {
        return this.mHeight;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof az) {
            az azVar = (az) obj;
            if (this.mWidth == azVar.mWidth && this.mHeight == azVar.mHeight) {
                return true;
            }
        }
        return false;
    }

    public final int getHeight() {
        return this.mHeight;
    }

    public final int hashCode() {
        int i = this.mHeight;
        int i2 = this.mWidth;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public final String toString() {
        return this.mWidth + "x" + this.mHeight;
    }
}
