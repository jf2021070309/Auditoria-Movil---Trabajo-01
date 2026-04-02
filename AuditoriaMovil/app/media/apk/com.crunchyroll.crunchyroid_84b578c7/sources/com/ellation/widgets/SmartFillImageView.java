package com.ellation.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.amazon.aps.iva.q.q;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.ui.R;
import kotlin.Metadata;
/* compiled from: SmartFillImageView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/ellation/widgets/SmartFillImageView;", "Lcom/amazon/aps/iva/q/q;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SmartFillImageView extends q {
    public final int b;
    public Matrix c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SmartFillImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        float f2;
        float f3;
        float f4;
        super.onMeasure(i, i2);
        if (getDrawable() != null) {
            float intrinsicWidth = getDrawable().getIntrinsicWidth();
            float intrinsicHeight = getDrawable().getIntrinsicHeight();
            float size = View.MeasureSpec.getSize(i);
            float size2 = View.MeasureSpec.getSize(i2);
            float f5 = size / intrinsicWidth;
            float f6 = size2 / intrinsicHeight;
            if (f5 <= f6) {
                f5 = f6;
            }
            float f7 = intrinsicWidth * f5;
            float f8 = intrinsicHeight * f5;
            float f9 = 0.0f;
            switch (this.b) {
                case 1:
                    f = size - f7;
                    f9 = f;
                    f3 = 0.0f;
                    break;
                case 2:
                    f9 = size - f7;
                    f3 = size2 - f8;
                    break;
                case 3:
                    f2 = size2 - f8;
                    f3 = f2;
                    break;
                case 4:
                    f = (size - f7) / 2;
                    f9 = f;
                    f3 = 0.0f;
                    break;
                case 5:
                    f9 = (size - f7) / 2;
                    f3 = size2 - f8;
                    break;
                case 6:
                    f2 = (size2 - f8) / 2;
                    f3 = f2;
                    break;
                case 7:
                    f9 = size - f7;
                    f3 = (size2 - f8) / 2;
                    break;
                case 8:
                    float f10 = getResources().getDisplayMetrics().scaledDensity;
                    if (intrinsicWidth > size) {
                        f4 = ((size - intrinsicWidth) / 2.0f) / f10;
                    } else {
                        f4 = 0.0f;
                    }
                    Matrix matrix = this.c;
                    if (matrix != null) {
                        matrix.postTranslate(f4, 0.0f);
                        Matrix matrix2 = this.c;
                        if (matrix2 != null) {
                            setImageMatrix(matrix2);
                            return;
                        } else {
                            j.m("scaleMatrix");
                            throw null;
                        }
                    }
                    j.m("scaleMatrix");
                    throw null;
                default:
                    f3 = 0.0f;
                    break;
            }
            Matrix matrix3 = this.c;
            if (matrix3 != null) {
                matrix3.setScale(f5, f5);
                Matrix matrix4 = this.c;
                if (matrix4 != null) {
                    setImageMatrix(matrix4);
                    Matrix matrix5 = this.c;
                    if (matrix5 != null) {
                        matrix5.postTranslate(f9, f3);
                        Matrix matrix6 = this.c;
                        if (matrix6 != null) {
                            setImageMatrix(matrix6);
                            return;
                        } else {
                            j.m("scaleMatrix");
                            throw null;
                        }
                    }
                    j.m("scaleMatrix");
                    throw null;
                }
                j.m("scaleMatrix");
                throw null;
            }
            j.m("scaleMatrix");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartFillImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        int[] iArr = R.styleable.SmartFillImageView;
        j.e(iArr, "SmartFillImageView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        j.e(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        this.b = obtainStyledAttributes.getInt(R.styleable.SmartFillImageView_align, 0);
        obtainStyledAttributes.recycle();
        Matrix matrix = new Matrix();
        this.c = matrix;
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
        Matrix matrix2 = this.c;
        if (matrix2 != null) {
            matrix2.setScale(1.0f, 1.0f);
            Matrix matrix3 = this.c;
            if (matrix3 != null) {
                setImageMatrix(matrix3);
                return;
            } else {
                j.m("scaleMatrix");
                throw null;
            }
        }
        j.m("scaleMatrix");
        throw null;
    }
}
