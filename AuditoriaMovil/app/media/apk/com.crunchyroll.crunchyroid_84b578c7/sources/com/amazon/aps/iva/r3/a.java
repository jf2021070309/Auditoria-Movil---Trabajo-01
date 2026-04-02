package com.amazon.aps.iva.r3;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
/* compiled from: PathInterpolatorCompat.java */
/* loaded from: classes.dex */
public final class a {
    public static Interpolator a(float f, float f2) {
        return new PathInterpolator(f, f2);
    }

    public static Interpolator b(float f, float f2, float f3, float f4) {
        return new PathInterpolator(f, f2, f3, f4);
    }

    public static Interpolator c(Path path) {
        return new PathInterpolator(path);
    }
}
