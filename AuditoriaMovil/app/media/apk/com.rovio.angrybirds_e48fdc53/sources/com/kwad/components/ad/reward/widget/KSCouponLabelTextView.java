package com.kwad.components.ad.reward.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;
import com.kwad.components.core.widget.d;
import com.kwad.components.core.widget.e;
import com.kwad.sdk.R;
/* loaded from: classes.dex */
public class KSCouponLabelTextView extends TextView implements d {
    private float AA;
    private float AB;
    private float AC;
    private final RectF AE;
    private final RectF AF;
    private final Path AG;
    private Path AH;
    private Path AI;
    private boolean AJ;
    private final Rect Au;
    private final RectF Av;
    private final RectF Ay;
    private final Paint mPaint;
    private int strokeColor;

    public KSCouponLabelTextView(Context context) {
        super(context);
        this.mPaint = new Paint();
        this.Au = new Rect();
        this.Av = new RectF();
        this.AE = new RectF();
        this.AF = new RectF();
        this.AG = new Path();
        this.Ay = new RectF();
        this.AJ = true;
        a(context, null, 0);
    }

    public KSCouponLabelTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mPaint = new Paint();
        this.Au = new Rect();
        this.Av = new RectF();
        this.AE = new RectF();
        this.AF = new RectF();
        this.AG = new Path();
        this.Ay = new RectF();
        this.AJ = true;
        a(context, attributeSet, 0);
    }

    public KSCouponLabelTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mPaint = new Paint();
        this.Au = new Rect();
        this.Av = new RectF();
        this.AE = new RectF();
        this.AF = new RectF();
        this.AG = new Path();
        this.Ay = new RectF();
        this.AJ = true;
        a(context, attributeSet, i);
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ksad_KSCouponLabelTextView, i, 0);
        int color = context.getResources().getColor(R.color.ksad_reward_main_color);
        this.AA = obtainStyledAttributes.getDimension(R.styleable.ksad_KSCouponLabelTextView_ksad_labelRadius, 8.0f);
        this.AB = obtainStyledAttributes.getDimension(R.styleable.ksad_KSCouponLabelTextView_ksad_strokeSize, 2.0f);
        this.strokeColor = obtainStyledAttributes.getColor(R.styleable.ksad_KSCouponLabelTextView_ksad_strokeColor, color);
        this.AC = obtainStyledAttributes.getDimension(R.styleable.ksad_KSCouponLabelTextView_ksad_sideRadius, 16.0f);
        obtainStyledAttributes.recycle();
        kk();
    }

    private void a(Path path, Path path2, Path path3, RectF rectF, RectF rectF2, RectF rectF3) {
        path.reset();
        float f = this.AA;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        path2.addArc(rectF2, 90.0f, -180.0f);
        path3.addArc(rectF3, 90.0f, 180.0f);
        path.op(this.AH, Path.Op.DIFFERENCE);
        path.op(this.AI, Path.Op.DIFFERENCE);
    }

    private void a(RectF rectF, RectF rectF2) {
        rectF2.set(rectF);
        rectF2.left -= this.AC;
        rectF2.right = rectF2.left + (this.AC * 2.0f);
        rectF2.top += (rectF.height() - (this.AC * 2.0f)) / 2.0f;
        rectF2.bottom = rectF2.top + (this.AC * 2.0f);
    }

    private void b(Path path, RectF rectF, RectF rectF2, RectF rectF3) {
        path.reset();
        path.moveTo(rectF.left, rectF.top + this.AA);
        this.Ay.set(rectF);
        RectF rectF4 = this.Ay;
        rectF4.bottom = rectF4.top + (this.AA * 2.0f);
        RectF rectF5 = this.Ay;
        rectF5.right = rectF5.left + (this.AA * 2.0f);
        path.arcTo(this.Ay, 180.0f, 90.0f);
        path.lineTo(rectF.width() - this.AA, rectF.top);
        this.Ay.set(rectF);
        RectF rectF6 = this.Ay;
        rectF6.left = rectF6.right - (this.AA * 2.0f);
        RectF rectF7 = this.Ay;
        rectF7.bottom = rectF7.top + (this.AA * 2.0f);
        path.arcTo(this.Ay, 270.0f, 90.0f);
        path.lineTo(rectF.right, rectF3.top);
        path.arcTo(rectF3, 270.0f, -180.0f);
        path.lineTo(rectF.right, rectF.bottom - this.AA);
        this.Ay.set(rectF);
        RectF rectF8 = this.Ay;
        rectF8.left = rectF8.right - (this.AA * 2.0f);
        RectF rectF9 = this.Ay;
        rectF9.top = rectF9.bottom - (this.AA * 2.0f);
        path.arcTo(this.Ay, 0.0f, 90.0f);
        path.lineTo(rectF.left + this.AA, rectF.bottom);
        this.Ay.set(rectF);
        RectF rectF10 = this.Ay;
        rectF10.right = rectF10.left + (this.AA * 2.0f);
        RectF rectF11 = this.Ay;
        rectF11.top = rectF11.bottom - (this.AA * 2.0f);
        path.arcTo(this.Ay, 90.0f, 90.0f);
        path.lineTo(rectF.left, rectF2.bottom);
        path.arcTo(rectF2, 90.0f, -180.0f);
        path.close();
    }

    private void b(RectF rectF, RectF rectF2) {
        rectF2.set(rectF);
        rectF2.right += this.AC;
        rectF2.left = rectF2.right - (this.AC * 2.0f);
        rectF2.top += (rectF.height() - (this.AC * 2.0f)) / 2.0f;
        rectF2.bottom = rectF2.top + (this.AC * 2.0f);
    }

    private void kk() {
        this.mPaint.setColor(this.strokeColor);
        this.mPaint.setStrokeWidth(this.AB);
        this.mPaint.setStyle(Paint.Style.STROKE);
        this.mPaint.setAntiAlias(true);
    }

    @Override // com.kwad.components.core.widget.d
    public final void a(e eVar) {
        int color = getResources().getColor(R.color.ksad_reward_main_color);
        this.strokeColor = color;
        setTextColor(color);
        kk();
        invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.Au.setEmpty();
        getDrawingRect(this.Au);
        float f = this.AB / 2.0f;
        this.Av.set(this.Au);
        this.Av.left += f;
        this.Av.top += f;
        this.Av.right -= f;
        this.Av.bottom -= f;
        a(this.Av, this.AE);
        b(this.Av, this.AF);
        if (Build.VERSION.SDK_INT >= 19) {
            Path path = this.AH;
            if (path == null) {
                this.AH = new Path();
            } else {
                path.reset();
            }
            Path path2 = this.AI;
            if (path2 == null) {
                this.AI = new Path();
            } else {
                path2.reset();
            }
            a(this.AG, this.AH, this.AI, this.Av, this.AE, this.AF);
        } else {
            b(this.AG, this.Av, this.AE, this.AF);
        }
        canvas.drawPath(this.AG, this.mPaint);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.AJ) {
            if (((float) (getPaddingLeft() + getPaddingRight())) + getPaint().measureText(getText().toString()) <= ((float) getMeasuredWidth())) {
                return;
            }
            setVisibility(8);
        }
    }
}
