package com.kwad.components.ad.splashscreen.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.kwad.components.ad.splashscreen.local.SplashSkipViewModel;
import com.kwad.components.ad.splashscreen.widget.SkipView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.widget.KSFrameLayout;
/* loaded from: classes.dex */
public class CircleSkipView extends KSFrameLayout implements a {
    private float EY;
    private float EZ;
    private int Fa;
    private ValueAnimator Fb;
    private boolean Fc;
    private SkipView.a Fd;
    private long Fe;
    private float Ff;
    private Paint mPaint;
    private RectF mRectF;
    private int padding;
    private int radius;
    private boolean sC;

    public CircleSkipView(Context context) {
        this(context, null, 0);
    }

    public CircleSkipView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleSkipView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mPaint = new Paint();
        this.EY = 270.0f;
        this.EZ = 360.0f;
        this.radius = 0;
        this.Fa = 0;
        this.Fc = false;
        this.Fe = 0L;
        this.Ff = 0.0f;
        this.padding = 0;
        this.sC = true;
        W(context);
    }

    private void W(Context context) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        X(context);
        addView(Y(context), layoutParams);
        setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.ad.splashscreen.widget.CircleSkipView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (CircleSkipView.this.Fd != null) {
                    CircleSkipView.this.Fd.kW();
                }
            }
        });
    }

    private void X(Context context) {
        this.Fa = com.kwad.sdk.d.a.a.a(context, 2.0f);
        int a = com.kwad.sdk.d.a.a.a(context, 32.0f);
        int i = this.Fa;
        this.radius = a - i;
        this.padding = i / 2;
        int i2 = this.padding;
        int i3 = this.radius;
        this.mRectF = new RectF(i2, i2, i3 + i2, i3 + i2);
    }

    private static TextView Y(Context context) {
        TextView textView = new TextView(context);
        textView.setText(context.getString(R.string.ksad_skip_text));
        textView.setTextColor(-1);
        textView.setTextSize(12.0f);
        return textView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(int i) {
        SkipView.a aVar = this.Fd;
        if (aVar != null) {
            aVar.Z(i);
        }
    }

    static /* synthetic */ boolean a(CircleSkipView circleSkipView, boolean z) {
        circleSkipView.Fc = true;
        return true;
    }

    private void c(final int i, final boolean z) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.Fb = ofFloat;
        ofFloat.setDuration(i);
        this.Fb.setInterpolator(new LinearInterpolator());
        this.Fb.addListener(new AnimatorListenerAdapter() { // from class: com.kwad.components.ad.splashscreen.widget.CircleSkipView.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                if (CircleSkipView.this.Ff != 1.0f || CircleSkipView.this.Fd == null) {
                    return;
                }
                CircleSkipView.this.Fd.kX();
            }
        });
        this.Fb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kwad.components.ad.splashscreen.widget.CircleSkipView.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircleSkipView.this.Ff = floatValue;
                CircleSkipView circleSkipView = CircleSkipView.this;
                circleSkipView.Y((int) ((i / 1000) * circleSkipView.Ff));
                if (z) {
                    CircleSkipView.a(CircleSkipView.this, true);
                    float f = floatValue * 360.0f;
                    CircleSkipView.this.EY = 270.0f - f;
                    CircleSkipView.this.EZ = 360.0f - f;
                    CircleSkipView.this.invalidate();
                }
            }
        });
    }

    private void lG() {
        this.Fc = true;
        ValueAnimator valueAnimator = this.Fb;
        if (valueAnimator != null) {
            valueAnimator.setCurrentPlayTime(this.Fe);
            this.Fb.start();
        }
    }

    private void lH() {
        this.Fc = false;
        ValueAnimator valueAnimator = this.Fb;
        if (valueAnimator != null) {
            this.Fe = valueAnimator.getCurrentPlayTime();
            this.Fb.cancel();
        }
    }

    private void setAnimationPaint(Paint paint) {
        paint.reset();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.Fa);
        paint.setColor(-1);
    }

    private void setBgCirclePaint(Paint paint) {
        paint.reset();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.parseColor("#4D000000"));
        paint.setAntiAlias(true);
    }

    private void setOuterCirclePaint(Paint paint) {
        paint.reset();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.Fa);
        paint.setColor(Color.parseColor("#33FFFFFF"));
        paint.setAntiAlias(true);
    }

    @Override // com.kwad.components.ad.splashscreen.widget.a
    public final void a(SplashSkipViewModel splashSkipViewModel, AdInfo adInfo) {
        this.sC = com.kwad.sdk.core.response.b.a.ci(adInfo);
        boolean cj = com.kwad.sdk.core.response.b.a.cj(adInfo);
        if (this.sC) {
            setVisibility(0);
        }
        c(splashSkipViewModel.skipSecond * 1000, cj);
    }

    @Override // com.kwad.components.ad.splashscreen.widget.a
    public final int ac(int i) {
        getLayoutParams().height = com.kwad.sdk.d.a.a.a(getContext(), 35.0f);
        return getWidth();
    }

    @Override // com.kwad.components.ad.splashscreen.widget.a
    public final void bd() {
        lH();
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        setBgCirclePaint(this.mPaint);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, (Math.min(getWidth(), getHeight()) / 2.0f) - this.Fa, this.mPaint);
        setOuterCirclePaint(this.mPaint);
        canvas.drawArc(this.mRectF, 0.0f, 360.0f, false, this.mPaint);
        if (this.Fc) {
            setAnimationPaint(this.mPaint);
            canvas.drawArc(this.mRectF, this.EY, -this.EZ, false, this.mPaint);
        }
        super.dispatchDraw(canvas);
    }

    @Override // com.kwad.components.ad.splashscreen.widget.a
    public void setOnViewListener(SkipView.a aVar) {
        this.Fd = aVar;
    }

    @Override // com.kwad.components.ad.splashscreen.widget.a
    public final void w(AdInfo adInfo) {
        lH();
    }

    @Override // com.kwad.components.ad.splashscreen.widget.a
    public final void x(AdInfo adInfo) {
        lG();
    }
}
