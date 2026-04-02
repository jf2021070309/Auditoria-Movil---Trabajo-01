package com.amazon.aps.iva.z;
/* compiled from: AnimationVectors.kt */
/* loaded from: classes.dex */
public final class m extends p {
    public float a;
    public final int b = 1;

    public m(float f) {
        this.a = f;
    }

    @Override // com.amazon.aps.iva.z.p
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return 0.0f;
    }

    @Override // com.amazon.aps.iva.z.p
    public final int b() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.z.p
    public final p c() {
        return new m(0.0f);
    }

    @Override // com.amazon.aps.iva.z.p
    public final void d() {
        this.a = 0.0f;
    }

    @Override // com.amazon.aps.iva.z.p
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof m)) {
            return false;
        }
        if (((m) obj).a == this.a) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
