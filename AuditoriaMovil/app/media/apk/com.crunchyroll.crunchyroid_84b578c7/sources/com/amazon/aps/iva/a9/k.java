package com.amazon.aps.iva.a9;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
/* compiled from: PatternPathMotion.java */
/* loaded from: classes.dex */
public final class k extends j {
    public final Path a;
    public final Matrix b;

    public k(Path path) {
        Path path2 = new Path();
        this.a = path2;
        Matrix matrix = new Matrix();
        this.b = matrix;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f = fArr[0];
        float f2 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f3 = fArr[0];
        float f4 = fArr[1];
        if (f3 == f && f4 == f2) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        matrix.setTranslate(-f3, -f4);
        float f5 = f - f3;
        float f6 = f2 - f4;
        float sqrt = 1.0f / ((float) Math.sqrt((f6 * f6) + (f5 * f5)));
        matrix.postScale(sqrt, sqrt);
        matrix.postRotate((float) Math.toDegrees(-Math.atan2(f6, f5)));
        path.transform(matrix, path2);
    }

    @Override // com.amazon.aps.iva.a9.j
    public final Path getPath(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float sqrt = (float) Math.sqrt((f6 * f6) + (f5 * f5));
        double atan2 = Math.atan2(f6, f5);
        Matrix matrix = this.b;
        matrix.setScale(sqrt, sqrt);
        matrix.postRotate((float) Math.toDegrees(atan2));
        matrix.postTranslate(f, f2);
        Path path = new Path();
        this.a.transform(matrix, path);
        return path;
    }
}
