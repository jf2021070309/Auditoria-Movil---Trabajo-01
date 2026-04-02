package c.a0.a.a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public class e implements Interpolator {
    public float[] a;

    /* renamed from: b  reason: collision with root package name */
    public float[] f705b;

    public e(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray R = c.i.a.R(context.getResources(), context.getTheme(), attributeSet, a.f696l);
        if (c.i.a.J(xmlPullParser, "pathData")) {
            String A = c.i.a.A(R, xmlPullParser, "pathData", 4);
            Path q = c.i.a.q(A);
            if (q == null) {
                throw new InflateException(e.a.d.a.a.k("The path is null, which is created from ", A));
            }
            a(q);
        } else if (!c.i.a.J(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else {
            if (!c.i.a.J(xmlPullParser, "controlY1")) {
                throw new InflateException("pathInterpolator requires the controlY1 attribute");
            }
            float f2 = !c.i.a.J(xmlPullParser, "controlX1") ? 0.0f : R.getFloat(0, 0.0f);
            float f3 = !c.i.a.J(xmlPullParser, "controlY1") ? 0.0f : R.getFloat(1, 0.0f);
            boolean J = c.i.a.J(xmlPullParser, "controlX2");
            if (J != c.i.a.J(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            }
            if (J) {
                float f4 = !c.i.a.J(xmlPullParser, "controlX2") ? 0.0f : R.getFloat(2, 0.0f);
                float f5 = !c.i.a.J(xmlPullParser, "controlY2") ? 0.0f : R.getFloat(3, 0.0f);
                Path path = new Path();
                path.moveTo(0.0f, 0.0f);
                path.cubicTo(f2, f3, f4, f5, 1.0f, 1.0f);
                a(path);
            } else {
                Path path2 = new Path();
                path2.moveTo(0.0f, 0.0f);
                path2.quadTo(f2, f3, 1.0f, 1.0f);
                a(path2);
            }
        }
        R.recycle();
    }

    public final void a(Path path) {
        int i2 = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min((int) AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS, ((int) (length / 0.002f)) + 1);
        if (min <= 0) {
            throw new IllegalArgumentException("The Path has a invalid length " + length);
        }
        this.a = new float[min];
        this.f705b = new float[min];
        float[] fArr = new float[2];
        for (int i3 = 0; i3 < min; i3++) {
            pathMeasure.getPosTan((i3 * length) / (min - 1), fArr, null);
            this.a[i3] = fArr[0];
            this.f705b[i3] = fArr[1];
        }
        if (Math.abs(this.a[0]) <= 1.0E-5d && Math.abs(this.f705b[0]) <= 1.0E-5d) {
            int i4 = min - 1;
            if (Math.abs(this.a[i4] - 1.0f) <= 1.0E-5d && Math.abs(this.f705b[i4] - 1.0f) <= 1.0E-5d) {
                float f2 = 0.0f;
                int i5 = 0;
                while (i2 < min) {
                    float[] fArr2 = this.a;
                    int i6 = i5 + 1;
                    float f3 = fArr2[i5];
                    if (f3 < f2) {
                        throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f3);
                    }
                    fArr2[i2] = f3;
                    i2++;
                    f2 = f3;
                    i5 = i6;
                }
                if (pathMeasure.nextContour()) {
                    throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                }
                return;
            }
        }
        StringBuilder y = e.a.d.a.a.y("The Path must start at (0,0) and end at (1,1) start: ");
        y.append(this.a[0]);
        y.append(",");
        y.append(this.f705b[0]);
        y.append(" end:");
        int i7 = min - 1;
        y.append(this.a[i7]);
        y.append(",");
        y.append(this.f705b[i7]);
        throw new IllegalArgumentException(y.toString());
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        int i2 = 0;
        int length = this.a.length - 1;
        while (length - i2 > 1) {
            int i3 = (i2 + length) / 2;
            if (f2 < this.a[i3]) {
                length = i3;
            } else {
                i2 = i3;
            }
        }
        float[] fArr = this.a;
        float f3 = fArr[length] - fArr[i2];
        if (f3 == 0.0f) {
            return this.f705b[i2];
        }
        float[] fArr2 = this.f705b;
        float f4 = fArr2[i2];
        return e.a.d.a.a.a(fArr2[length], f4, (f2 - fArr[i2]) / f3, f4);
    }
}
