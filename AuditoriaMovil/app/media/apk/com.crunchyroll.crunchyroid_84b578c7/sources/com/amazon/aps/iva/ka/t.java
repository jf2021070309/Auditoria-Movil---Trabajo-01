package com.amazon.aps.iva.ka;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.amazon.aps.iva.la.c;
import com.amazon.aps.iva.ma.g;
/* compiled from: KeyframeParser.java */
/* loaded from: classes.dex */
public final class t {
    public static final LinearInterpolator a = new LinearInterpolator();
    public static final c.a b = c.a.a("t", "s", "e", "o", "i", "h", "to", "ti");
    public static final c.a c = c.a.a("x", "y");

    public static Interpolator a(PointF pointF, PointF pointF2) {
        pointF.x = com.amazon.aps.iva.ma.f.b(pointF.x, -1.0f, 1.0f);
        pointF.y = com.amazon.aps.iva.ma.f.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = com.amazon.aps.iva.ma.f.b(pointF2.x, -1.0f, 1.0f);
        float b2 = com.amazon.aps.iva.ma.f.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = b2;
        float f = pointF.x;
        float f2 = pointF.y;
        float f3 = pointF2.x;
        g.a aVar = com.amazon.aps.iva.ma.g.a;
        try {
            return com.amazon.aps.iva.r3.a.b(f, f2, f3, b2);
        } catch (IllegalArgumentException e) {
            if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                return com.amazon.aps.iva.r3.a.b(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
            }
            return new LinearInterpolator();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0200 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.animation.Interpolator] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> com.amazon.aps.iva.na.a<T> b(com.amazon.aps.iva.la.c r25, com.amazon.aps.iva.z9.h r26, float r27, com.amazon.aps.iva.ka.l0<T> r28, boolean r29, boolean r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ka.t.b(com.amazon.aps.iva.la.c, com.amazon.aps.iva.z9.h, float, com.amazon.aps.iva.ka.l0, boolean, boolean):com.amazon.aps.iva.na.a");
    }
}
