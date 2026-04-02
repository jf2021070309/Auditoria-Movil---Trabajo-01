package com.kwad.components.ad.interstitial.aggregate;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import com.kwad.sdk.R;
/* loaded from: classes.dex */
public class ViewPagerIndicator extends View {
    private float iA;
    private Paint iB;
    private float iC;
    private float iD;
    private float iE;
    private int iF;
    private Paint iG;
    private float iH;
    private boolean iI;
    private a iJ;
    private ValueAnimator iK;
    private int iq;
    private int iw;
    private int ix;
    private int iy;
    private float iz;
    private final Context mContext;

    /* loaded from: classes.dex */
    public interface a {
        void ct();
    }

    public ViewPagerIndicator(Context context) {
        this(context, null);
    }

    public ViewPagerIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewPagerIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mContext = context;
        setWillNotDraw(false);
        a(context, attributeSet, i);
        cx();
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ksad_ViewPagerIndicator, i, 0);
        this.iA = obtainStyledAttributes.getDimension(R.styleable.ksad_ViewPagerIndicator_ksad_dot_distance, com.kwad.sdk.d.a.a.a(this.mContext, 5.0f));
        this.iC = obtainStyledAttributes.getDimension(R.styleable.ksad_ViewPagerIndicator_ksad_dot_height, com.kwad.sdk.d.a.a.a(this.mContext, 6.0f));
        this.iD = obtainStyledAttributes.getDimension(R.styleable.ksad_ViewPagerIndicator_ksad_dot_selected_width, com.kwad.sdk.d.a.a.a(this.mContext, 50.0f));
        this.iE = obtainStyledAttributes.getDimension(R.styleable.ksad_ViewPagerIndicator_ksad_dot_unselected_width, com.kwad.sdk.d.a.a.a(this.mContext, 6.0f));
        this.ix = obtainStyledAttributes.getColor(R.styleable.ksad_ViewPagerIndicator_ksad_default_color, getResources().getColor(R.color.ksad_88_white));
        this.iw = obtainStyledAttributes.getColor(R.styleable.ksad_ViewPagerIndicator_ksad_height_color, getResources().getColor(R.color.ksad_white));
        obtainStyledAttributes.recycle();
    }

    private void a(Canvas canvas) {
        float f;
        Paint paint;
        int i;
        RectF rectF = new RectF();
        for (int i2 = 0; i2 < this.iy; i2++) {
            int i3 = this.iq;
            if (i2 < i3) {
                f = i2 * (this.iA + this.iE);
            } else {
                if (i2 == i3) {
                    rectF.left = i2 * (this.iA + this.iE);
                    float f2 = rectF.left;
                    float f3 = this.iE;
                    rectF.right = f2 + f3 + ((this.iD - f3) * (1.0f - this.iz));
                    if (this.iI) {
                        this.iB.setColor(this.iw);
                        paint = this.iB;
                        i = (int) (((1.0f - this.iz) * 127.0f) + 127.0f);
                        paint.setAlpha(i);
                    }
                    this.iB.setColor(this.ix);
                } else if (i2 == i3 + 1) {
                    float f4 = this.iA;
                    float f5 = this.iE;
                    rectF.left = ((i2 - 1) * (f4 + f5)) + f5 + ((this.iD - f5) * (1.0f - this.iz)) + f4;
                    float f6 = rectF.left;
                    float f7 = this.iz;
                    float f8 = this.iD;
                    float f9 = this.iE;
                    rectF.right = f6 + (f7 * (f8 - f9)) + f9;
                    if (this.iI) {
                        this.iB.setColor(this.iw);
                        paint = this.iB;
                        i = (int) (255.0f - ((1.0f - this.iz) * 127.0f));
                        paint.setAlpha(i);
                    }
                    this.iB.setColor(this.ix);
                } else {
                    float f10 = this.iA;
                    f = ((i2 - 1) * (this.iE + f10)) + f10 + this.iD;
                }
                rectF.top = 0.0f;
                rectF.bottom = rectF.top + this.iC;
                float f11 = this.iC;
                canvas.drawRoundRect(rectF, f11 / 2.0f, f11 / 2.0f, this.iB);
            }
            rectF.left = f;
            rectF.right = rectF.left + this.iE;
            this.iB.setColor(this.ix);
            rectF.top = 0.0f;
            rectF.bottom = rectF.top + this.iC;
            float f112 = this.iC;
            canvas.drawRoundRect(rectF, f112 / 2.0f, f112 / 2.0f, this.iB);
        }
    }

    static /* synthetic */ boolean a(ViewPagerIndicator viewPagerIndicator, boolean z) {
        viewPagerIndicator.iI = true;
        return true;
    }

    private void b(Canvas canvas) {
        if (this.iI || this.iq != 0) {
            return;
        }
        RectF rectF = new RectF(0.0f, 0.0f, this.iH, this.iC);
        float f = this.iC;
        canvas.drawRoundRect(rectF, f / 2.0f, f / 2.0f, this.iG);
    }

    private void cx() {
        Paint paint = new Paint(1);
        this.iB = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.iB.setStrokeWidth(1.0f);
        this.iB.setColor(this.ix);
        Paint paint2 = new Paint(1);
        this.iG = paint2;
        paint2.setStyle(Paint.Style.FILL_AND_STROKE);
        this.iG.setStrokeWidth(1.0f);
        this.iG.setColor(this.iw);
    }

    private void cy() {
        if (this.iF <= 0) {
            setVisibility(8);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.iE, this.iD);
        this.iK = ofFloat;
        ofFloat.setDuration(this.iF * 1000);
        this.iK.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kwad.components.ad.interstitial.aggregate.ViewPagerIndicator.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ViewPagerIndicator.this.iH = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ViewPagerIndicator.this.invalidate();
            }
        });
        this.iK.addListener(new AnimatorListenerAdapter() { // from class: com.kwad.components.ad.interstitial.aggregate.ViewPagerIndicator.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                ViewPagerIndicator.a(ViewPagerIndicator.this, true);
                if (ViewPagerIndicator.this.iJ != null) {
                    ViewPagerIndicator.this.iJ.ct();
                }
            }
        });
        this.iK.start();
    }

    public final void cA() {
        ValueAnimator valueAnimator = this.iK;
        if (valueAnimator != null) {
            valueAnimator.resume();
        }
    }

    public final void cz() {
        ValueAnimator valueAnimator = this.iK;
        if (valueAnimator != null) {
            valueAnimator.pause();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        a(canvas);
        b(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 != 1073741824) {
            size2 = mode2 == Integer.MIN_VALUE ? (int) this.iC : 0;
        }
        if (mode != 1073741824) {
            if (mode == Integer.MIN_VALUE) {
                size = this.iy > 1 ? (int) (this.iD + ((i3 - 1) * (this.iA + this.iE))) : (int) this.iD;
            } else {
                size = 0;
            }
        }
        setMeasuredDimension(size, size2);
    }

    public void setFirstAdShowTime(int i) {
        this.iF = i;
    }

    public void setPlayProgressListener(a aVar) {
        this.iJ = aVar;
    }

    public void setViewPager(ViewPager viewPager) {
        PagerAdapter adapter = viewPager.getAdapter();
        if (adapter == null) {
            return;
        }
        int count = adapter.getCount();
        this.iy = count;
        if (count <= 1) {
            return;
        }
        this.iI = false;
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.kwad.components.ad.interstitial.aggregate.ViewPagerIndicator.3
            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public final void onPageScrollStateChanged(int i) {
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public final void onPageScrolled(int i, float f, int i2) {
                ViewPagerIndicator.this.iq = i;
                ViewPagerIndicator.this.iz = f;
                ViewPagerIndicator.this.invalidate();
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public final void onPageSelected(int i) {
                ViewPagerIndicator.this.iq = i;
                ViewPagerIndicator.this.iz = 0.0f;
                ViewPagerIndicator.this.invalidate();
            }
        });
        cy();
    }
}
