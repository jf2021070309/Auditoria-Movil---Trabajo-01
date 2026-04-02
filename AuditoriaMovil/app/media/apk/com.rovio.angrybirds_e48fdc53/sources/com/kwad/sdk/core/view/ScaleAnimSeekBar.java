package com.kwad.sdk.core.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class ScaleAnimSeekBar extends View {
    private int axA;
    private int axB;
    private int axC;
    private boolean axD;
    private int axE;
    private int axF;
    private int axG;
    private int axH;
    private int axI;
    private int axJ;
    private int axK;
    private GradientDrawable axL;
    private GradientDrawable axM;
    private GradientDrawable axN;
    private Rect axO;
    private Rect axP;
    private Rect axQ;
    private Rect axR;
    private Drawable axS;
    private boolean axT;
    private boolean axU;
    private boolean axV;
    private boolean axW;
    private boolean axX;
    private WeakReference<a> axY;
    private boolean axZ;
    private Paint axu;
    private int axv;
    private int axw;
    private int axx;
    private int axy;
    private int axz;
    private boolean aya;
    private ValueAnimator ayb;
    private ValueAnimator ayc;
    private ValueAnimator ayd;
    private float aye;
    private float ayf;
    private float ayg;
    private float ayh;
    private int ayi;
    private boolean ayj;

    /* loaded from: classes.dex */
    public interface a {
        void a(ScaleAnimSeekBar scaleAnimSeekBar);

        void a(ScaleAnimSeekBar scaleAnimSeekBar, boolean z);

        void sw();
    }

    public ScaleAnimSeekBar(Context context) {
        this(context, null);
    }

    public ScaleAnimSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScaleAnimSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.axA = 100;
        this.axD = false;
        this.axS = null;
        this.axT = false;
        this.axU = false;
        this.axV = false;
        this.axW = true;
        this.axZ = true;
        this.aya = false;
        this.aye = 1.0f;
        this.ayf = 1.34f;
        this.ayg = 1.0f;
        this.ayh = 2.0f;
        init(context, attributeSet);
    }

    private void a(int i, boolean z, boolean z2) {
        int i2 = this.axz;
        if (i <= i2 || i >= (i2 = this.axA)) {
            i = i2;
        }
        h(z, i);
        a onSeekBarChangedListener = getOnSeekBarChangedListener();
        if (onSeekBarChangedListener != null && this.axH != this.axG) {
            this.axV = z2;
            onSeekBarChangedListener.a(this, z2);
            this.axV = false;
        }
        this.axH = this.axG;
    }

    private void a(Canvas canvas, Rect rect, GradientDrawable gradientDrawable) {
        canvas.save();
        Rect rect2 = new Rect();
        rect2.top = (int) (rect.top * this.ayg);
        rect2.bottom = (int) (rect.bottom * this.ayg);
        rect2.left = rect.left;
        rect2.right = rect.right;
        gradientDrawable.setBounds(rect2);
        gradientDrawable.setCornerRadius(this.axB * this.ayg);
        gradientDrawable.draw(canvas);
        canvas.restore();
    }

    private void bh(boolean z) {
        if (this.axZ) {
            boolean z2 = z;
            bi(z2);
            bj(z2);
        }
    }

    private void bi(boolean z) {
        float f = this.aye;
        float f2 = z ? this.ayf : 1.0f;
        ValueAnimator valueAnimator = this.ayb;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.ayb = valueAnimator2;
            valueAnimator2.setDuration(250L);
            this.ayb.setInterpolator(new LinearInterpolator());
            this.ayb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kwad.sdk.core.view.ScaleAnimSeekBar.3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    ScaleAnimSeekBar.this.aye = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                    ScaleAnimSeekBar.this.requestLayout();
                }
            });
        } else {
            valueAnimator.cancel();
        }
        this.ayb.setFloatValues(f, f2);
        this.ayb.start();
    }

    private void bj(boolean z) {
        float f = this.ayg;
        float f2 = z ? this.ayh : 1.0f;
        ValueAnimator valueAnimator = this.ayc;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.ayc = valueAnimator2;
            valueAnimator2.setDuration(250L);
            this.ayc.setInterpolator(new LinearInterpolator());
            this.ayc.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kwad.sdk.core.view.ScaleAnimSeekBar.4
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    ScaleAnimSeekBar.this.ayg = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                    ScaleAnimSeekBar.this.requestLayout();
                }
            });
        } else {
            valueAnimator.cancel();
        }
        this.ayc.setFloatValues(f, f2);
        this.ayc.start();
    }

    private void bo(Context context) {
        this.axZ = true;
        this.ayi = com.kwad.sdk.d.a.a.a(context, 10.0f);
        this.axy = com.kwad.sdk.d.a.a.a(context, 3.0f);
        this.axF = com.kwad.sdk.d.a.a.a(context, 20.0f);
        this.axS = null;
        this.aya = false;
        this.axC = com.kwad.sdk.d.a.a.a(context, 0.3f);
        this.axB = com.kwad.sdk.d.a.a.a(context, 1.0f);
        this.axv = 654311423;
        this.axw = -1;
        this.axx = 1090519039;
        this.axz = 0;
        this.axA = 100;
        this.axD = false;
    }

    private void c(Canvas canvas) {
        canvas.save();
        Drawable drawable = this.axS;
        if (drawable != null) {
            drawable.setBounds(this.axR);
            this.axS.draw(canvas);
        } else {
            this.axu.setColor(this.axw);
            canvas.drawCircle(this.axR.centerX(), this.axR.centerY(), (this.axR.width() * this.aye) / 2.0f, this.axu);
        }
        canvas.restore();
    }

    private float cA(int i) {
        int i2 = this.axE;
        int i3 = this.axz;
        return ((i2 * (i - i3)) / (this.axA - i3)) - (i2 / 2.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int cB(int i) {
        int i2 = this.axE;
        return i > i2 / 2 ? this.axA : i < (-i2) / 2 ? this.axz : Math.round(((i + (i2 / 2.0f)) * (this.axA - this.axz)) / i2) + this.axz;
    }

    private boolean d(float f, float f2) {
        return this.axR.left < this.axR.right && this.axR.top < this.axR.bottom && f >= (((float) this.axR.left) * this.aye) - ((float) this.axF) && f <= (((float) this.axR.right) * this.aye) + ((float) this.axF) && f2 >= (((float) this.axR.top) * this.aye) - ((float) this.axF) && f2 <= (((float) this.axR.bottom) * this.aye) + ((float) this.axF);
    }

    private boolean e(float f, float f2) {
        return this.axO.left < this.axO.right && this.axO.top < this.axO.bottom && f >= (((float) this.axO.left) * this.ayg) - ((float) this.axF) && f <= (((float) this.axO.right) * this.ayg) + ((float) this.axF) && f2 >= (((float) this.axO.top) * this.ayg) - ((float) this.axF) && f2 <= (((float) this.axO.bottom) * this.ayg) + ((float) this.axF);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(float f) {
        this.axR.left = (int) (f - this.axy);
        this.axR.right = (int) (this.axy + f);
        this.axP.right = (int) f;
        invalidate();
    }

    private a getOnSeekBarChangedListener() {
        WeakReference<a> weakReference = this.axY;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private float h(float f) {
        float f2 = this.axE / 2;
        if (f > f2) {
            return f2;
        }
        float f3 = -f2;
        return f < f3 ? f3 : f;
    }

    private void h(boolean z, int i) {
        if (!z) {
            this.axG = i;
            g(h(cA(i)));
            return;
        }
        float h = h(cA(this.axG));
        float h2 = h(cA(i));
        ValueAnimator valueAnimator = this.ayd;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.ayd = valueAnimator2;
            valueAnimator2.setDuration(300L);
            this.ayd.setInterpolator(new Interpolator() { // from class: com.kwad.sdk.core.view.ScaleAnimSeekBar.1
                @Override // android.animation.TimeInterpolator
                public final float getInterpolation(float f) {
                    float f2 = f - 1.0f;
                    return (f2 * f2 * f2) + 1.0f;
                }
            });
            this.ayd.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kwad.sdk.core.view.ScaleAnimSeekBar.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                    ScaleAnimSeekBar scaleAnimSeekBar = ScaleAnimSeekBar.this;
                    scaleAnimSeekBar.axG = scaleAnimSeekBar.cB((int) floatValue);
                    ScaleAnimSeekBar.this.g(floatValue);
                }
            });
        } else {
            valueAnimator.cancel();
        }
        this.ayd.setFloatValues(h, h2);
        this.ayd.start();
    }

    private void init(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            bo(context);
        }
        Paint paint = new Paint();
        this.axu = paint;
        paint.setStyle(Paint.Style.FILL);
        this.axu.setAntiAlias(true);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.axL = gradientDrawable;
        gradientDrawable.setShape(0);
        this.axL.setColor(this.axv);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        this.axM = gradientDrawable2;
        gradientDrawable2.setShape(0);
        this.axM.setColor(this.axw);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        this.axN = gradientDrawable3;
        gradientDrawable3.setShape(0);
        this.axN.setColor(this.axx);
        this.axO = new Rect();
        this.axP = new Rect();
        this.axR = new Rect();
        this.axQ = new Rect();
        this.axG = this.axz;
    }

    private void v(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this.axE = this.axZ ? (int) (i - ((this.ayi * 2) * (this.ayf - this.aye))) : i - (this.ayi * 2);
        this.axO.top = -this.axC;
        Rect rect = this.axO;
        rect.bottom = -rect.top;
        this.axO.left = (this.axD ? -i : -this.axE) / 2;
        this.axO.right = this.axD ? i / 2 : this.axE / 2;
        this.axP.top = -this.axC;
        Rect rect2 = this.axP;
        rect2.bottom = -rect2.top;
        this.axP.left = (this.axD ? -i : -this.axE) / 2;
        this.axP.right = (-this.axE) / 2;
        this.axQ.top = -this.axC;
        this.axQ.bottom = -this.axP.top;
        Rect rect3 = this.axQ;
        if (!this.axD) {
            i = this.axE;
        }
        rect3.left = (-i) / 2;
        this.axQ.right = (-this.axE) / 2;
        this.axR.top = -this.axy;
        this.axR.bottom = this.axy;
        this.axR.left = ((-this.axE) / 2) - this.axy;
        this.axR.right = ((-this.axE) / 2) + this.axy;
        setThumbDrawable(this.axS);
        setProgress(this.axG);
        setSecondaryProgress(this.axI);
    }

    public final void bg(boolean z) {
        this.ayj = z;
        bh(z);
    }

    public int getMaxProgress() {
        return this.axA;
    }

    public int getProgress() {
        return this.axG;
    }

    public int getProgressLength() {
        return this.axE;
    }

    public int getProgressX() {
        return (int) (getX() + (this.axy * this.ayf));
    }

    public int getSecondaryProgress() {
        return this.axI;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(this.axK / 2, this.axJ / 2);
        a(canvas, this.axO, this.axL);
        a(canvas, this.axQ, this.axN);
        a(canvas, this.axP, this.axM);
        if (this.ayj) {
            c(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            size = getWidth();
        }
        this.axK = size;
        if (mode2 == 1073741824) {
            this.axJ = size2;
        } else {
            this.axJ = getHeight();
        }
        v(this.axK, this.axJ);
        setMeasuredDimension(this.axK, this.axJ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
        if (r3 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
        r3.requestDisallowInterceptTouchEvent(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008e, code lost:
        if (r3 != null) goto L32;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            float r0 = r8.getX()
            int r1 = r7.axK
            r2 = 2
            int r1 = r1 / r2
            float r1 = (float) r1
            float r0 = r0 - r1
            float r1 = r8.getY()
            int r3 = r7.axJ
            int r3 = r3 / r2
            float r3 = (float) r3
            float r1 = r1 - r3
            android.view.ViewParent r3 = r7.getParent()
            com.kwad.sdk.core.view.ScaleAnimSeekBar$a r4 = r7.getOnSeekBarChangedListener()
            int r5 = r8.getAction()
            r6 = 1
            if (r5 == 0) goto L5d
            r8 = 0
            if (r5 == r6) goto L3a
            if (r5 == r2) goto L29
            goto L91
        L29:
            boolean r1 = r7.axT
            if (r1 != 0) goto L31
            boolean r1 = r7.axU
            if (r1 == 0) goto L91
        L31:
            int r0 = (int) r0
            int r0 = r7.cB(r0)
            r7.a(r0, r8, r6)
            goto L91
        L3a:
            r7.axX = r8
            boolean r1 = r7.axU
            if (r1 != 0) goto L44
            boolean r1 = r7.axT
            if (r1 == 0) goto L57
        L44:
            r7.axU = r8
            r7.axT = r8
            int r0 = (int) r0
            int r0 = r7.cB(r0)
            boolean r1 = r7.aya
            r7.a(r0, r1, r6)
            if (r4 == 0) goto L57
            r4.a(r7)
        L57:
            if (r3 == 0) goto L91
            r3.requestDisallowInterceptTouchEvent(r8)
            goto L91
        L5d:
            boolean r2 = r7.axW
            if (r2 != 0) goto L66
            boolean r8 = super.onTouchEvent(r8)
            return r8
        L66:
            boolean r8 = r7.d(r0, r1)
            if (r8 == 0) goto L7e
            r7.bh(r6)
            r7.axT = r6
            r7.axX = r6
            if (r4 == 0) goto L78
            r4.sw()
        L78:
            if (r3 == 0) goto L91
        L7a:
            r3.requestDisallowInterceptTouchEvent(r6)
            goto L91
        L7e:
            boolean r8 = r7.e(r0, r1)
            if (r8 == 0) goto L91
            r7.bh(r6)
            r7.axU = r6
            if (r4 == 0) goto L8e
            r4.sw()
        L8e:
            if (r3 == 0) goto L91
            goto L7a
        L91:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.sdk.core.view.ScaleAnimSeekBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setMaxProgress(int i) {
        this.axA = i;
    }

    public void setMinProgress(int i) {
        this.axz = i;
        if (this.axG < i) {
            this.axG = i;
        }
    }

    public void setOnSeekBarChangeListener(a aVar) {
        this.axY = new WeakReference<>(aVar);
    }

    public void setProgress(int i) {
        a(i, false, false);
    }

    public void setProgressBackgroundColor(int i) {
        this.axv = i;
        this.axL.setColor(i);
    }

    public void setProgressColor(int i) {
        this.axw = i;
        this.axM.setColor(i);
    }

    public void setSecondaryProgress(int i) {
        int i2 = this.axz;
        if (i <= i2 || i >= (i2 = this.axA)) {
            i = i2;
        }
        this.axI = i;
        this.axQ.right = (int) h(cA(i));
        invalidate();
    }

    public void setSecondaryProgressColor(int i) {
        this.axx = i;
        this.axN.setColor(i);
    }

    public void setThumbDrawable(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        this.axS = drawable;
    }

    public void setThumbEnable(boolean z) {
        this.axW = z;
    }

    public void setThumbScale(float f) {
        this.aye = f;
    }

    public void setThumbTouchOffset(int i) {
        this.axF = i;
        invalidate();
    }
}
