package com.amazon.aps.iva.y;
/* compiled from: EnterExitTransition.kt */
/* loaded from: classes.dex */
public final class x0 {
    public final float a;
    public final com.amazon.aps.iva.z.z<Float> b;

    public x0(float f, com.amazon.aps.iva.z.z<Float> zVar) {
        this.a = f;
        this.b = zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        if (Float.compare(this.a, x0Var.a) == 0 && com.amazon.aps.iva.yb0.j.a(this.b, x0Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Fade(alpha=" + this.a + ", animationSpec=" + this.b + ')';
    }
}
