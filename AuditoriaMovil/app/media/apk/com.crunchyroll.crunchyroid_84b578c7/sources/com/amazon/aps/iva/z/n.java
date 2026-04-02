package com.amazon.aps.iva.z;
/* compiled from: AnimationVectors.kt */
/* loaded from: classes.dex */
public final class n extends p {
    public float a;
    public float b;
    public final int c = 2;

    public n(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // com.amazon.aps.iva.z.p
    public final float a(int i) {
        if (i != 0) {
            if (i != 1) {
                return 0.0f;
            }
            return this.b;
        }
        return this.a;
    }

    @Override // com.amazon.aps.iva.z.p
    public final int b() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.z.p
    public final p c() {
        return new n(0.0f, 0.0f);
    }

    @Override // com.amazon.aps.iva.z.p
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
    }

    @Override // com.amazon.aps.iva.z.p
    public final void e(float f, int i) {
        if (i != 0) {
            if (i == 1) {
                this.b = f;
                return;
            }
            return;
        }
        this.a = f;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (nVar.a == this.a) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (nVar.b == this.b) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}
