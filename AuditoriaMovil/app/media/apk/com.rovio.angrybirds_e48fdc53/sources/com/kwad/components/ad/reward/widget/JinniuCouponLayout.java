package com.kwad.components.ad.reward.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.kwad.sdk.R;
/* loaded from: classes.dex */
public class JinniuCouponLayout extends LinearLayout {
    private float At;
    private Rect Au;
    private RectF Av;
    private RectF Aw;
    private RectF Ax;
    private RectF Ay;
    private Path Az;
    private int endColor;
    private Paint mPaint;
    private float mRadius;
    private int startColor;

    public JinniuCouponLayout(Context context) {
        super(context);
        this.mPaint = new Paint();
        this.At = 4.0f;
        this.mRadius = 10.0f;
        this.Au = new Rect();
        this.Av = new RectF();
        this.Aw = new RectF();
        this.Ax = new RectF();
        this.Ay = new RectF();
        this.Az = new Path();
        this.startColor = Color.parseColor("#FFFE3666");
        this.endColor = Color.parseColor("#FFFD7200");
        a(context, null, 0);
    }

    public JinniuCouponLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mPaint = new Paint();
        this.At = 4.0f;
        this.mRadius = 10.0f;
        this.Au = new Rect();
        this.Av = new RectF();
        this.Aw = new RectF();
        this.Ax = new RectF();
        this.Ay = new RectF();
        this.Az = new Path();
        this.startColor = Color.parseColor("#FFFE3666");
        this.endColor = Color.parseColor("#FFFD7200");
        a(context, attributeSet, 0);
    }

    public JinniuCouponLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mPaint = new Paint();
        this.At = 4.0f;
        this.mRadius = 10.0f;
        this.Au = new Rect();
        this.Av = new RectF();
        this.Aw = new RectF();
        this.Ax = new RectF();
        this.Ay = new RectF();
        this.Az = new Path();
        this.startColor = Color.parseColor("#FFFE3666");
        this.endColor = Color.parseColor("#FFFD7200");
        a(context, attributeSet, i);
    }

    public JinniuCouponLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mPaint = new Paint();
        this.At = 4.0f;
        this.mRadius = 10.0f;
        this.Au = new Rect();
        this.Av = new RectF();
        this.Aw = new RectF();
        this.Ax = new RectF();
        this.Ay = new RectF();
        this.Az = new Path();
        this.startColor = Color.parseColor("#FFFE3666");
        this.endColor = Color.parseColor("#FFFD7200");
        a(context, attributeSet, i);
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ksad_JinniuCouponLayout, i, 0);
        this.mRadius = obtainStyledAttributes.getDimension(R.styleable.ksad_JinniuCouponLayout_ksad_outerRadius, 4.0f);
        this.At = obtainStyledAttributes.getDimension(R.styleable.ksad_JinniuCouponLayout_ksad_verticalRadius, 10.0f);
        obtainStyledAttributes.recycle();
        this.mPaint.setAntiAlias(true);
    }

    private void a(Path path, RectF rectF, RectF rectF2, RectF rectF3) {
        path.reset();
        path.moveTo(this.Av.left, this.Av.top + this.mRadius);
        this.Ay.set(rectF);
        RectF rectF4 = this.Ay;
        rectF4.bottom = rectF4.top + (this.mRadius * 2.0f);
        RectF rectF5 = this.Ay;
        rectF5.right = rectF5.left + (this.mRadius * 2.0f);
        path.arcTo(this.Ay, 180.0f, 90.0f);
        path.lineTo(rectF2.left, rectF2.top);
        path.arcTo(rectF2, -180.0f, -180.0f);
        path.lineTo(rectF.width() - this.mRadius, rectF.top);
        this.Ay.set(rectF);
        RectF rectF6 = this.Ay;
        rectF6.left = rectF6.right - (this.mRadius * 2.0f);
        RectF rectF7 = this.Ay;
        rectF7.bottom = rectF7.top + (this.mRadius * 2.0f);
        path.arcTo(this.Ay, 270.0f, 90.0f);
        this.Ay.set(rectF);
        RectF rectF8 = this.Ay;
        rectF8.left = rectF8.right - (this.mRadius * 2.0f);
        RectF rectF9 = this.Ay;
        rectF9.top = rectF9.bottom - (this.mRadius * 2.0f);
        path.arcTo(this.Ay, 0.0f, 90.0f);
        path.lineTo(rectF3.right, rectF3.bottom);
        path.arcTo(rectF3, 0.0f, -180.0f);
        path.lineTo(rectF.left + this.mRadius, rectF.bottom);
        this.Ay.set(rectF);
        RectF rectF10 = this.Ay;
        rectF10.right = rectF10.left + (this.mRadius * 2.0f);
        RectF rectF11 = this.Ay;
        rectF11.top = rectF11.bottom - (this.mRadius * 2.0f);
        path.arcTo(this.Ay, 90.0f, 90.0f);
    }

    private void setGradientPaint(RectF rectF) {
        this.mPaint.setShader(new LinearGradient(rectF.left, rectF.top, rectF.right, rectF.bottom, this.startColor, this.endColor, Shader.TileMode.CLAMP));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        this.Au.setEmpty();
        getDrawingRect(this.Au);
        this.Av.set(this.Au);
        if (getChildCount() > 1) {
            View childAt = getChildAt(0);
            RectF rectF = this.Aw;
            if (rectF == null) {
                this.Aw = new RectF();
            } else {
                rectF.setEmpty();
            }
            RectF rectF2 = this.Ax;
            if (rectF2 == null) {
                this.Ax = new RectF();
            } else {
                rectF2.setEmpty();
            }
            float measuredWidth = this.Au.left + childAt.getMeasuredWidth();
            RectF rectF3 = this.Aw;
            float f = this.At;
            rectF3.set(measuredWidth, this.Au.top - f, (f * 2.0f) + measuredWidth, this.Au.top + this.At);
            this.Ax.set(this.Aw.left, this.Au.bottom - this.At, this.Aw.right, this.Au.bottom + this.At);
            a(this.Az, this.Av, this.Aw, this.Ax);
            setGradientPaint(this.Av);
            canvas.drawPath(this.Az, this.mPaint);
        }
        super.dispatchDraw(canvas);
    }
}
