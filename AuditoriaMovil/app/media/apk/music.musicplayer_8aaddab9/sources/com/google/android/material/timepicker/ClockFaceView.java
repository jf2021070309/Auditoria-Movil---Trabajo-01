package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import c.i.k.d0;
import c.i.k.e;
import c.i.k.k0.b;
import com.google.android.material.timepicker.ClockHandView;
import e.d.b.d.a;
import e.d.b.d.a0.c;
import e.d.b.d.b;
import java.util.Arrays;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public class ClockFaceView extends c implements ClockHandView.c {
    public final SparseArray<TextView> A;
    public final e B;
    public final int[] C;
    public final float[] D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public String[] I;
    public float J;
    public final ColorStateList K;
    public final ClockHandView x;
    public final Rect y;
    public final RectF z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.y = new Rect();
        this.z = new RectF();
        SparseArray<TextView> sparseArray = new SparseArray<>();
        this.A = sparseArray;
        this.D = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f6316e, R.attr.materialClockStyle, 2131887168);
        Resources resources = getResources();
        ColorStateList C = a.C(context, obtainStyledAttributes, 1);
        this.K = C;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.x = clockHandView;
        this.E = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = C.getColorForState(new int[]{16842913}, C.getDefaultColor());
        this.C = new int[]{colorForState, colorForState, C.getDefaultColor()};
        clockHandView.f4698g.add(this);
        int defaultColor = c.b.d.a.a.a(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList C2 = a.C(context, obtainStyledAttributes, 0);
        setBackgroundColor(C2 != null ? C2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new e.d.b.d.a0.a(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.B = new e.d.b.d.a0.b(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.I = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        for (int i2 = 0; i2 < Math.max(this.I.length, size); i2++) {
            TextView textView = this.A.get(i2);
            if (i2 >= this.I.length) {
                removeView(textView);
                this.A.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    this.A.put(i2, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.I[i2]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i2));
                d0.A(textView, this.B);
                textView.setTextColor(this.K);
            }
        }
        this.F = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.G = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.H = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.c
    public void a(float f2, boolean z) {
        if (Math.abs(this.J - f2) > 0.001f) {
            this.J = f2;
            t();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) b.C0040b.a(1, this.I.length, false, 1).a);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        t();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.H / Math.max(Math.max(this.F / displayMetrics.heightPixels, this.G / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public final void t() {
        RectF rectF = this.x.f4702k;
        for (int i2 = 0; i2 < this.A.size(); i2++) {
            TextView textView = this.A.get(i2);
            if (textView != null) {
                textView.getDrawingRect(this.y);
                this.y.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                offsetDescendantRectToMyCoords(textView, this.y);
                this.z.set(this.y);
                textView.getPaint().setShader(!RectF.intersects(rectF, this.z) ? null : new RadialGradient(rectF.centerX() - this.z.left, rectF.centerY() - this.z.top, 0.5f * rectF.width(), this.C, this.D, Shader.TileMode.CLAMP));
                textView.invalidate();
            }
        }
    }
}
