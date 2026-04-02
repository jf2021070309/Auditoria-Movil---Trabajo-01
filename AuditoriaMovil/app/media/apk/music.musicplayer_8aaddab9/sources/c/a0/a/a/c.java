package c.a0.a.a;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.InflateException;
import c.t.m;
import java.util.ArrayList;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public class c {

    /* loaded from: classes.dex */
    public static class a implements TypeEvaluator<c.i.e.d[]> {
        public c.i.e.d[] a;

        @Override // android.animation.TypeEvaluator
        public c.i.e.d[] evaluate(float f2, c.i.e.d[] dVarArr, c.i.e.d[] dVarArr2) {
            c.i.e.d[] dVarArr3 = dVarArr;
            c.i.e.d[] dVarArr4 = dVarArr2;
            if (c.i.a.g(dVarArr3, dVarArr4)) {
                if (!c.i.a.g(this.a, dVarArr3)) {
                    this.a = c.i.a.r(dVarArr3);
                }
                for (int i2 = 0; i2 < dVarArr3.length; i2++) {
                    c.i.e.d dVar = this.a[i2];
                    c.i.e.d dVar2 = dVarArr3[i2];
                    c.i.e.d dVar3 = dVarArr4[i2];
                    Objects.requireNonNull(dVar);
                    dVar.a = dVar2.a;
                    int i3 = 0;
                    while (true) {
                        float[] fArr = dVar2.f2039b;
                        if (i3 < fArr.length) {
                            dVar.f2039b[i3] = (dVar3.f2039b[i3] * f2) + ((1.0f - f2) * fArr[i3]);
                            i3++;
                        }
                    }
                }
                return this.a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:181:0x034d, code lost:
        if (r26 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x034f, code lost:
        if (r13 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0351, code lost:
        r1 = new android.animation.Animator[r13.size()];
        r2 = r13.iterator();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0360, code lost:
        if (r2.hasNext() == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0362, code lost:
        r1[r3] = (android.animation.Animator) r2.next();
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x036e, code lost:
        if (r27 != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0370, code lost:
        r26.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0374, code lost:
        r26.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0377, code lost:
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.animation.Animator a(android.content.Context r21, android.content.res.Resources r22, android.content.res.Resources.Theme r23, org.xmlpull.v1.XmlPullParser r24, android.util.AttributeSet r25, android.animation.AnimatorSet r26, int r27, float r28) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a0.a.a.c.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    public static Keyframe b(Keyframe keyframe, float f2) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f2) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f2) : Keyframe.ofObject(f2);
    }

    public static PropertyValuesHolder c(TypedArray typedArray, int i2, int i3, int i4, String str) {
        PropertyValuesHolder ofInt;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i3);
        boolean z = peekValue != null;
        int i5 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i4);
        boolean z2 = peekValue2 != null;
        int i6 = z2 ? peekValue2.type : 0;
        if (i2 == 4) {
            i2 = ((z && d(i5)) || (z2 && d(i6))) ? 3 : 0;
        }
        boolean z3 = i2 == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i2 != 2) {
            d dVar = i2 == 3 ? d.a : null;
            if (z3) {
                if (z) {
                    float dimension = i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f);
                    if (z2) {
                        ofInt = PropertyValuesHolder.ofFloat(str, dimension, i6 == 5 ? typedArray.getDimension(i4, 0.0f) : typedArray.getFloat(i4, 0.0f));
                    } else {
                        ofInt = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    ofInt = PropertyValuesHolder.ofFloat(str, i6 == 5 ? typedArray.getDimension(i4, 0.0f) : typedArray.getFloat(i4, 0.0f));
                }
            } else if (!z) {
                if (z2) {
                    ofInt = PropertyValuesHolder.ofInt(str, i6 == 5 ? (int) typedArray.getDimension(i4, 0.0f) : d(i6) ? typedArray.getColor(i4, 0) : typedArray.getInt(i4, 0));
                }
                if (propertyValuesHolder == null && dVar != null) {
                    propertyValuesHolder.setEvaluator(dVar);
                    return propertyValuesHolder;
                }
            } else {
                int dimension2 = i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : d(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0);
                if (z2) {
                    ofInt = PropertyValuesHolder.ofInt(str, dimension2, i6 == 5 ? (int) typedArray.getDimension(i4, 0.0f) : d(i6) ? typedArray.getColor(i4, 0) : typedArray.getInt(i4, 0));
                } else {
                    ofInt = PropertyValuesHolder.ofInt(str, dimension2);
                }
            }
            propertyValuesHolder = ofInt;
            return propertyValuesHolder == null ? propertyValuesHolder : propertyValuesHolder;
        }
        String string = typedArray.getString(i3);
        String string2 = typedArray.getString(i4);
        c.i.e.d[] p = c.i.a.p(string);
        c.i.e.d[] p2 = c.i.a.p(string2);
        if (p == null && p2 == null) {
            return null;
        }
        if (p == null) {
            if (p2 != null) {
                return PropertyValuesHolder.ofObject(str, new a(), p2);
            }
            return null;
        }
        a aVar = new a();
        if (p2 == null) {
            ofObject = PropertyValuesHolder.ofObject(str, aVar, p);
        } else if (!c.i.a.g(p, p2)) {
            throw new InflateException(" Can't morph from " + string + " to " + string2);
        } else {
            ofObject = PropertyValuesHolder.ofObject(str, aVar, p, p2);
        }
        return ofObject;
    }

    public static boolean d(int i2) {
        return i2 >= 28 && i2 <= 31;
    }

    public static ValueAnimator e(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f2, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        ValueAnimator valueAnimator2;
        TypedArray typedArray;
        TypedArray typedArray2;
        ValueAnimator valueAnimator3;
        TypedArray R = c.i.a.R(resources, theme, attributeSet, c.a0.a.a.a.f691g);
        TypedArray R2 = c.i.a.R(resources, theme, attributeSet, c.a0.a.a.a.f695k);
        ValueAnimator valueAnimator4 = valueAnimator == null ? new ValueAnimator() : valueAnimator;
        long j2 = c.i.a.J(xmlPullParser, "duration") ? R.getInt(1, 300) : 300;
        int i2 = 0;
        long j3 = !c.i.a.J(xmlPullParser, "startOffset") ? 0 : R.getInt(2, 0);
        int i3 = !c.i.a.J(xmlPullParser, "valueType") ? 4 : R.getInt(7, 4);
        if (c.i.a.J(xmlPullParser, "valueFrom") && c.i.a.J(xmlPullParser, "valueTo")) {
            if (i3 == 4) {
                TypedValue peekValue = R.peekValue(5);
                boolean z = peekValue != null;
                int i4 = z ? peekValue.type : 0;
                TypedValue peekValue2 = R.peekValue(6);
                boolean z2 = peekValue2 != null;
                i3 = ((z && d(i4)) || (z2 && d(z2 ? peekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder c2 = c(R, i3, 5, 6, "");
            if (c2 != null) {
                valueAnimator4.setValues(c2);
            }
        }
        valueAnimator4.setDuration(j2);
        valueAnimator4.setStartDelay(j3);
        valueAnimator4.setRepeatCount(!c.i.a.J(xmlPullParser, "repeatCount") ? 0 : R.getInt(3, 0));
        valueAnimator4.setRepeatMode(!c.i.a.J(xmlPullParser, "repeatMode") ? 1 : R.getInt(4, 1));
        if (R2 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator4;
            String A = c.i.a.A(R2, xmlPullParser, "pathData", 1);
            if (A != null) {
                String A2 = c.i.a.A(R2, xmlPullParser, "propertyXName", 2);
                String A3 = c.i.a.A(R2, xmlPullParser, "propertyYName", 3);
                if (A2 == null && A3 == null) {
                    throw new InflateException(R2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path q = c.i.a.q(A);
                float f3 = 0.5f * f2;
                PathMeasure pathMeasure = new PathMeasure(q, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f4 = 0.0f;
                do {
                    f4 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f4));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(q, false);
                int min = Math.min(100, ((int) (f4 / f3)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f5 = f4 / (min - 1);
                valueAnimator2 = valueAnimator4;
                typedArray = R;
                int i5 = 0;
                float f6 = 0.0f;
                while (true) {
                    if (i2 >= min) {
                        break;
                    }
                    int i6 = min;
                    pathMeasure2.getPosTan(f6 - ((Float) arrayList.get(i5)).floatValue(), fArr3, null);
                    fArr[i2] = fArr3[0];
                    fArr2[i2] = fArr3[1];
                    f6 += f5;
                    int i7 = i5 + 1;
                    if (i7 < arrayList.size() && f6 > ((Float) arrayList.get(i7)).floatValue()) {
                        pathMeasure2.nextContour();
                        i5 = i7;
                    }
                    i2++;
                    min = i6;
                }
                PropertyValuesHolder ofFloat = A2 != null ? PropertyValuesHolder.ofFloat(A2, fArr) : null;
                PropertyValuesHolder ofFloat2 = A3 != null ? PropertyValuesHolder.ofFloat(A3, fArr2) : null;
                if (ofFloat == null) {
                    i2 = 0;
                    objectAnimator.setValues(ofFloat2);
                } else {
                    i2 = 0;
                    if (ofFloat2 == null) {
                        objectAnimator.setValues(ofFloat);
                    } else {
                        objectAnimator.setValues(ofFloat, ofFloat2);
                    }
                }
            } else {
                valueAnimator2 = valueAnimator4;
                typedArray = R;
                objectAnimator.setPropertyName(c.i.a.A(R2, xmlPullParser, "propertyName", 0));
            }
        } else {
            valueAnimator2 = valueAnimator4;
            typedArray = R;
        }
        if (c.i.a.J(xmlPullParser, "interpolator")) {
            typedArray2 = typedArray;
            i2 = typedArray2.getResourceId(i2, i2);
        } else {
            typedArray2 = typedArray;
        }
        if (i2 > 0) {
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(m.w(context, i2));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        typedArray2.recycle();
        if (R2 != null) {
            R2.recycle();
        }
        return valueAnimator3;
    }
}
