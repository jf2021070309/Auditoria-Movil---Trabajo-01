package androidx.leanback.widget;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.crunchyroll.crunchyroid.R;
/* loaded from: classes.dex */
public class PagingIndicator extends View {
    public boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public d[] j;
    public int[] k;
    public int[] l;
    public int[] m;
    public int n;
    public int o;
    public int p;
    public int q;
    public final Paint r;
    public final Paint s;
    public Bitmap t;
    public Paint u;
    public final Rect v;
    public final float w;
    public static final DecelerateInterpolator x = new DecelerateInterpolator();
    public static final a y = new a();
    public static final b z = new b();
    public static final c A = new c();

    /* loaded from: classes.dex */
    public static class a extends Property<d, Float> {
        public a() {
            super(Float.class, "alpha");
        }

        @Override // android.util.Property
        public final Float get(d dVar) {
            return Float.valueOf(dVar.a);
        }

        @Override // android.util.Property
        public final void set(d dVar, Float f) {
            d dVar2 = dVar;
            dVar2.a = f.floatValue();
            dVar2.a();
            PagingIndicator.this.invalidate();
        }
    }

    /* loaded from: classes.dex */
    public static class b extends Property<d, Float> {
        public b() {
            super(Float.class, "diameter");
        }

        @Override // android.util.Property
        public final Float get(d dVar) {
            return Float.valueOf(dVar.e);
        }

        @Override // android.util.Property
        public final void set(d dVar, Float f) {
            d dVar2 = dVar;
            float floatValue = f.floatValue();
            dVar2.e = floatValue;
            float f2 = floatValue / 2.0f;
            dVar2.f = f2;
            PagingIndicator pagingIndicator = PagingIndicator.this;
            dVar2.g = f2 * pagingIndicator.w;
            pagingIndicator.invalidate();
        }
    }

    /* loaded from: classes.dex */
    public static class c extends Property<d, Float> {
        public c() {
            super(Float.class, "translation_x");
        }

        @Override // android.util.Property
        public final Float get(d dVar) {
            return Float.valueOf(dVar.c);
        }

        @Override // android.util.Property
        public final void set(d dVar, Float f) {
            d dVar2 = dVar;
            dVar2.c = f.floatValue() * dVar2.h * dVar2.i;
            PagingIndicator.this.invalidate();
        }
    }

    /* loaded from: classes.dex */
    public class d {
        public float a;
        public int b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public float h = 1.0f;
        public float i;

        public d() {
            this.i = PagingIndicator.this.b ? 1.0f : -1.0f;
        }

        public final void a() {
            int round = Math.round(this.a * 255.0f);
            PagingIndicator pagingIndicator = PagingIndicator.this;
            this.b = Color.argb(round, Color.red(pagingIndicator.q), Color.green(pagingIndicator.q), Color.blue(pagingIndicator.q));
        }
    }

    public PagingIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        boolean z2;
        AnimatorSet animatorSet = new AnimatorSet();
        Resources resources = getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.d5.a.b, 0, 0);
        int d2 = d(obtainStyledAttributes, 6, R.dimen.lb_page_indicator_dot_radius);
        this.d = d2;
        int i = d2 * 2;
        this.c = i;
        int d3 = d(obtainStyledAttributes, 2, R.dimen.lb_page_indicator_arrow_radius);
        this.g = d3;
        int i2 = d3 * 2;
        this.f = i2;
        this.e = d(obtainStyledAttributes, 5, R.dimen.lb_page_indicator_dot_gap);
        this.h = d(obtainStyledAttributes, 4, R.dimen.lb_page_indicator_arrow_gap);
        int color = obtainStyledAttributes.getColor(3, getResources().getColor(R.color.lb_page_indicator_dot));
        Paint paint = new Paint(1);
        this.r = paint;
        paint.setColor(color);
        this.q = obtainStyledAttributes.getColor(0, getResources().getColor(R.color.lb_page_indicator_arrow_background));
        if (this.u == null && obtainStyledAttributes.hasValue(1)) {
            setArrowColor(obtainStyledAttributes.getColor(1, 0));
        }
        obtainStyledAttributes.recycle();
        if (resources.getConfiguration().getLayoutDirection() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.b = z2;
        int color2 = resources.getColor(R.color.lb_page_indicator_arrow_shadow);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.lb_page_indicator_arrow_shadow_radius);
        this.i = dimensionPixelSize;
        Paint paint2 = new Paint(1);
        this.s = paint2;
        float dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.lb_page_indicator_arrow_shadow_offset);
        paint2.setShadowLayer(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2, color2);
        this.t = e();
        this.v = new Rect(0, 0, this.t.getWidth(), this.t.getHeight());
        float f = i2;
        this.w = this.t.getWidth() / f;
        AnimatorSet animatorSet2 = new AnimatorSet();
        a aVar = y;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, aVar, 0.0f, 1.0f);
        ofFloat.setDuration(167L);
        DecelerateInterpolator decelerateInterpolator = x;
        ofFloat.setInterpolator(decelerateInterpolator);
        float f2 = i;
        b bVar = z;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object) null, bVar, f2, f);
        ofFloat2.setDuration(417L);
        ofFloat2.setInterpolator(decelerateInterpolator);
        animatorSet2.playTogether(ofFloat, ofFloat2, c());
        AnimatorSet animatorSet3 = new AnimatorSet();
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat((Object) null, aVar, 1.0f, 0.0f);
        ofFloat3.setDuration(167L);
        ofFloat3.setInterpolator(decelerateInterpolator);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat((Object) null, bVar, f, f2);
        ofFloat4.setDuration(417L);
        ofFloat4.setInterpolator(decelerateInterpolator);
        animatorSet3.playTogether(ofFloat3, ofFloat4, c());
        animatorSet.playTogether(animatorSet2, animatorSet3);
        setLayerType(1, null);
    }

    private int getDesiredHeight() {
        return getPaddingBottom() + getPaddingTop() + this.f + this.i;
    }

    private int getDesiredWidth() {
        return getPaddingRight() + getPaddingLeft() + getRequiredWidth();
    }

    private int getRequiredWidth() {
        return ((this.o - 3) * this.e) + (this.h * 2) + (this.d * 2);
    }

    private void setSelectedPage(int i) {
        if (i == this.p) {
            return;
        }
        this.p = i;
        a();
    }

    public final void a() {
        int i;
        float f;
        int i2 = 0;
        while (true) {
            i = this.p;
            f = -1.0f;
            if (i2 >= i) {
                break;
            }
            d dVar = this.j[i2];
            dVar.c = 0.0f;
            dVar.d = 0.0f;
            PagingIndicator pagingIndicator = PagingIndicator.this;
            dVar.e = pagingIndicator.c;
            float f2 = pagingIndicator.d;
            dVar.f = f2;
            dVar.g = f2 * pagingIndicator.w;
            dVar.a = 0.0f;
            dVar.a();
            d dVar2 = this.j[i2];
            if (i2 != 0) {
                f = 1.0f;
            }
            dVar2.h = f;
            dVar2.d = this.l[i2];
            i2++;
        }
        d dVar3 = this.j[i];
        dVar3.c = 0.0f;
        dVar3.d = 0.0f;
        PagingIndicator pagingIndicator2 = PagingIndicator.this;
        dVar3.e = pagingIndicator2.f;
        float f3 = pagingIndicator2.g;
        dVar3.f = f3;
        dVar3.g = f3 * pagingIndicator2.w;
        dVar3.a = 1.0f;
        dVar3.a();
        d[] dVarArr = this.j;
        int i3 = this.p;
        d dVar4 = dVarArr[i3];
        if (i3 <= 0) {
            f = 1.0f;
        }
        dVar4.h = f;
        dVar4.d = this.k[i3];
        while (true) {
            i3++;
            if (i3 < this.o) {
                d dVar5 = this.j[i3];
                dVar5.c = 0.0f;
                dVar5.d = 0.0f;
                PagingIndicator pagingIndicator3 = PagingIndicator.this;
                dVar5.e = pagingIndicator3.c;
                float f4 = pagingIndicator3.d;
                dVar5.f = f4;
                dVar5.g = f4 * pagingIndicator3.w;
                dVar5.a = 0.0f;
                dVar5.a();
                d dVar6 = this.j[i3];
                dVar6.h = 1.0f;
                dVar6.d = this.m[i3];
            } else {
                return;
            }
        }
    }

    public final void b() {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int requiredWidth = getRequiredWidth();
        int i = (paddingLeft + width) / 2;
        int i2 = this.o;
        int[] iArr = new int[i2];
        this.k = iArr;
        int[] iArr2 = new int[i2];
        this.l = iArr2;
        int[] iArr3 = new int[i2];
        this.m = iArr3;
        boolean z2 = this.b;
        int i3 = this.d;
        int i4 = this.h;
        int i5 = this.e;
        int i6 = 1;
        if (z2) {
            int i7 = i - (requiredWidth / 2);
            iArr[0] = ((i7 + i3) - i5) + i4;
            iArr2[0] = i7 + i3;
            iArr3[0] = (i4 * 2) + ((i7 + i3) - (i5 * 2));
            while (i6 < this.o) {
                int[] iArr4 = this.k;
                int[] iArr5 = this.l;
                int i8 = i6 - 1;
                iArr4[i6] = iArr5[i8] + i4;
                iArr5[i6] = iArr5[i8] + i5;
                this.m[i6] = iArr4[i8] + i4;
                i6++;
            }
        } else {
            int i9 = (requiredWidth / 2) + i;
            iArr[0] = ((i9 - i3) + i5) - i4;
            iArr2[0] = i9 - i3;
            iArr3[0] = ((i5 * 2) + (i9 - i3)) - (i4 * 2);
            while (i6 < this.o) {
                int[] iArr6 = this.k;
                int[] iArr7 = this.l;
                int i10 = i6 - 1;
                iArr6[i6] = iArr7[i10] - i4;
                iArr7[i6] = iArr7[i10] - i5;
                this.m[i6] = iArr6[i10] - i4;
                i6++;
            }
        }
        this.n = paddingTop + this.g;
        a();
    }

    public final ObjectAnimator c() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, A, (-this.h) + this.e, 0.0f);
        ofFloat.setDuration(417L);
        ofFloat.setInterpolator(x);
        return ofFloat;
    }

    public final int d(TypedArray typedArray, int i, int i2) {
        return typedArray.getDimensionPixelOffset(i, getResources().getDimensionPixelOffset(i2));
    }

    public final Bitmap e() {
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.lb_ic_nav_arrow);
        if (this.b) {
            return decodeResource;
        }
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        return Bitmap.createBitmap(decodeResource, 0, 0, decodeResource.getWidth(), decodeResource.getHeight(), matrix, false);
    }

    public int[] getDotSelectedLeftX() {
        return this.l;
    }

    public int[] getDotSelectedRightX() {
        return this.m;
    }

    public int[] getDotSelectedX() {
        return this.k;
    }

    public int getPageCount() {
        return this.o;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        for (int i = 0; i < this.o; i++) {
            d dVar = this.j[i];
            float f = dVar.d + dVar.c;
            PagingIndicator pagingIndicator = PagingIndicator.this;
            canvas.drawCircle(f, pagingIndicator.n, dVar.f, pagingIndicator.r);
            if (dVar.a > 0.0f) {
                Paint paint = pagingIndicator.s;
                paint.setColor(dVar.b);
                canvas.drawCircle(f, pagingIndicator.n, dVar.f, paint);
                Bitmap bitmap = pagingIndicator.t;
                float f2 = dVar.g;
                float f3 = pagingIndicator.n;
                canvas.drawBitmap(bitmap, pagingIndicator.v, new Rect((int) (f - f2), (int) (f3 - f2), (int) (f + f2), (int) (f3 + f2)), pagingIndicator.u);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int desiredHeight = getDesiredHeight();
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 1073741824) {
                desiredHeight = View.MeasureSpec.getSize(i2);
            }
        } else {
            desiredHeight = Math.min(desiredHeight, View.MeasureSpec.getSize(i2));
        }
        int desiredWidth = getDesiredWidth();
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 1073741824) {
                desiredWidth = View.MeasureSpec.getSize(i);
            }
        } else {
            desiredWidth = Math.min(desiredWidth, View.MeasureSpec.getSize(i));
        }
        setMeasuredDimension(desiredWidth, desiredHeight);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        boolean z2;
        float f;
        super.onRtlPropertiesChanged(i);
        if (i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.b != z2) {
            this.b = z2;
            this.t = e();
            d[] dVarArr = this.j;
            if (dVarArr != null) {
                for (d dVar : dVarArr) {
                    if (PagingIndicator.this.b) {
                        f = 1.0f;
                    } else {
                        f = -1.0f;
                    }
                    dVar.i = f;
                }
            }
            b();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        setMeasuredDimension(i, i2);
        b();
    }

    public void setArrowBackgroundColor(int i) {
        this.q = i;
    }

    public void setArrowColor(int i) {
        if (this.u == null) {
            this.u = new Paint();
        }
        this.u.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
    }

    public void setDotBackgroundColor(int i) {
        this.r.setColor(i);
    }

    public void setPageCount(int i) {
        if (i > 0) {
            this.o = i;
            this.j = new d[i];
            for (int i2 = 0; i2 < this.o; i2++) {
                this.j[i2] = new d();
            }
            b();
            setSelectedPage(0);
            return;
        }
        throw new IllegalArgumentException("The page count should be a positive integer");
    }
}
