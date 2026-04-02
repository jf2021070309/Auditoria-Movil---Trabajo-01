package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import c.e.c.b;
import c.e.c.d;
import c.e.c.e;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class CardView extends FrameLayout {
    public static final int[] a = {16842801};

    /* renamed from: b  reason: collision with root package name */
    public static final e f269b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f270c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f271d;

    /* renamed from: e  reason: collision with root package name */
    public int f272e;

    /* renamed from: f  reason: collision with root package name */
    public int f273f;

    /* renamed from: g  reason: collision with root package name */
    public final Rect f274g;

    /* renamed from: h  reason: collision with root package name */
    public final Rect f275h;

    /* renamed from: i  reason: collision with root package name */
    public final d f276i;

    /* loaded from: classes.dex */
    public class a implements d {
        public Drawable a;

        public a() {
        }

        public boolean a() {
            return CardView.this.getPreventCornerOverlap();
        }

        public void b(int i2, int i3, int i4, int i5) {
            CardView.this.f275h.set(i2, i3, i4, i5);
            CardView cardView = CardView.this;
            Rect rect = cardView.f274g;
            CardView.super.setPadding(i2 + rect.left, i3 + rect.top, i4 + rect.right, i5 + rect.bottom);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            f269b = new b();
        } else {
            f269b = new c.e.c.a();
        }
        f269b.i();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.cardViewStyle);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f274g = rect;
        this.f275h = new Rect();
        a aVar = new a();
        this.f276i = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.e.b.a, R.attr.cardViewStyle, R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(a);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(R.color.cardview_light_background) : getResources().getColor(R.color.cardview_dark_background));
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f270c = obtainStyledAttributes.getBoolean(7, false);
        this.f271d = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        float f2 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f272e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f273f = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        f269b.a(aVar, context, colorStateList, dimension, dimension2, f2);
    }

    public ColorStateList getCardBackgroundColor() {
        return f269b.h(this.f276i);
    }

    public float getCardElevation() {
        return f269b.c(this.f276i);
    }

    public int getContentPaddingBottom() {
        return this.f274g.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f274g.left;
    }

    public int getContentPaddingRight() {
        return this.f274g.right;
    }

    public int getContentPaddingTop() {
        return this.f274g.top;
    }

    public float getMaxCardElevation() {
        return f269b.g(this.f276i);
    }

    public boolean getPreventCornerOverlap() {
        return this.f271d;
    }

    public float getRadius() {
        return f269b.d(this.f276i);
    }

    public boolean getUseCompatPadding() {
        return this.f270c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        e eVar = f269b;
        if (eVar instanceof b) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(eVar.k(this.f276i)), View.MeasureSpec.getSize(i2)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(eVar.j(this.f276i)), View.MeasureSpec.getSize(i3)), mode2);
        }
        super.onMeasure(i2, i3);
    }

    public void setCardBackgroundColor(int i2) {
        f269b.m(this.f276i, ColorStateList.valueOf(i2));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f269b.m(this.f276i, colorStateList);
    }

    public void setCardElevation(float f2) {
        f269b.f(this.f276i, f2);
    }

    public void setMaxCardElevation(float f2) {
        f269b.n(this.f276i, f2);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i2) {
        this.f273f = i2;
        super.setMinimumHeight(i2);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i2) {
        this.f272e = i2;
        super.setMinimumWidth(i2);
    }

    @Override // android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f271d) {
            this.f271d = z;
            f269b.l(this.f276i);
        }
    }

    public void setRadius(float f2) {
        f269b.b(this.f276i, f2);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f270c != z) {
            this.f270c = z;
            f269b.e(this.f276i);
        }
    }
}
