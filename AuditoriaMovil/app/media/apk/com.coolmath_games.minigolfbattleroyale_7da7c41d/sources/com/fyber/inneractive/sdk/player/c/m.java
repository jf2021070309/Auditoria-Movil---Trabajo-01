package com.fyber.inneractive.sdk.player.c;

import com.ironsource.mediationsdk.logger.IronSourceError;
/* loaded from: classes.dex */
public final class m {
    public static final m a = new m(1.0f, 1.0f);
    public final float b;
    public final float c;
    public final int d;

    public m(float f, float f2) {
        this.b = f;
        this.c = f2;
        this.d = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            m mVar = (m) obj;
            if (this.b == mVar.b && this.c == mVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Float.floatToRawIntBits(this.c);
    }
}
