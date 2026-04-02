package com.amazon.aps.iva.z;
/* compiled from: AnimationVectors.kt */
/* loaded from: classes.dex */
public final class o extends p {
    public float a;
    public float b;
    public float c;
    public float d;
    public final int e = 4;

    public o(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // com.amazon.aps.iva.z.p
    public final float a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return 0.0f;
                    }
                    return this.d;
                }
                return this.c;
            }
            return this.b;
        }
        return this.a;
    }

    @Override // com.amazon.aps.iva.z.p
    public final int b() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.z.p
    public final p c() {
        return new o(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // com.amazon.aps.iva.z.p
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
    }

    @Override // com.amazon.aps.iva.z.p
    public final void e(float f, int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.d = f;
                        return;
                    }
                    return;
                }
                this.c = f;
                return;
            }
            this.b = f;
            return;
        }
        this.a = f;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (oVar.a == this.a) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (oVar.b == this.b) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        if (oVar.c == this.c) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        if (oVar.d == this.d) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + com.amazon.aps.iva.e4.t0.b(this.c, com.amazon.aps.iva.e4.t0.b(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.a + ", v2 = " + this.b + ", v3 = " + this.c + ", v4 = " + this.d;
    }
}
