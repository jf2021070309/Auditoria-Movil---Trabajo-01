package c.z;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;
/* loaded from: classes.dex */
public class f<T> extends Property<T, Float> {
    public final Property<T, PointF> a;

    /* renamed from: b  reason: collision with root package name */
    public final PathMeasure f2878b;

    /* renamed from: c  reason: collision with root package name */
    public final float f2879c;

    /* renamed from: d  reason: collision with root package name */
    public final float[] f2880d;

    /* renamed from: e  reason: collision with root package name */
    public final PointF f2881e;

    /* renamed from: f  reason: collision with root package name */
    public float f2882f;

    public f(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f2880d = new float[2];
        this.f2881e = new PointF();
        this.a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f2878b = pathMeasure;
        this.f2879c = pathMeasure.getLength();
    }

    @Override // android.util.Property
    public Float get(Object obj) {
        return Float.valueOf(this.f2882f);
    }

    @Override // android.util.Property
    public void set(Object obj, Float f2) {
        Float f3 = f2;
        this.f2882f = f3.floatValue();
        this.f2878b.getPosTan(f3.floatValue() * this.f2879c, this.f2880d, null);
        PointF pointF = this.f2881e;
        float[] fArr = this.f2880d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.a.set(obj, pointF);
    }
}
