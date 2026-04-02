package com.amazon.aps.iva.z;
/* compiled from: Easing.kt */
/* loaded from: classes.dex */
public final class y {
    public static final s a = new s(0.4f, 0.2f);
    public static final a b;

    static {
        boolean z;
        boolean z2 = true;
        if (!Float.isNaN(0.0f) && !Float.isNaN(0.0f) && !Float.isNaN(0.2f) && !Float.isNaN(1.0f)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (Float.isNaN(0.4f) || Float.isNaN(0.0f) || Float.isNaN(1.0f) || Float.isNaN(1.0f)) {
                z2 = false;
            }
            if (z2) {
                b = a.a;
                return;
            }
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.4, 0.0, 1.0, 1.0.".toString());
        }
        throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.0, 0.0, 0.2, 1.0.".toString());
    }

    /* compiled from: Easing.kt */
    /* loaded from: classes.dex */
    public static final class a implements x {
        public static final a a = new a();

        @Override // com.amazon.aps.iva.z.x
        public final float a(float f) {
            return f;
        }
    }
}
