package com.amazon.aps.iva.q5;
/* compiled from: AuxEffectInfo.java */
/* loaded from: classes.dex */
public final class h {
    public final int a = 0;
    public final float b = 0.0f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.a == hVar.a && Float.compare(hVar.b, this.b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + ((527 + this.a) * 31);
    }
}
