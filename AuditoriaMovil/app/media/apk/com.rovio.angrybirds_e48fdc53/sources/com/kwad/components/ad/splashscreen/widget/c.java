package com.kwad.components.ad.splashscreen.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.AnimationDrawable;
import com.kwad.sdk.R;
/* loaded from: classes.dex */
public final class c extends AnimationDrawable {
    private Bitmap FM;
    private Bitmap FN;
    private Bitmap FO;
    private Bitmap FP;
    private Bitmap FQ;
    private Bitmap FR;
    private int FS;
    private RectF FT;
    private Paint FU;
    private Paint FV;
    private PorterDuffXfermode FW;
    private final int FX;
    private final int FY;
    private float FZ;
    private float Ga;
    private RectF Gb;
    private Paint Gc;
    private int Gd;
    private int Ge;
    private ValueAnimator Gf;
    private final float Gg = 6.0f;
    private final float Gh = 11.0f;
    private float Gi;
    private float Gj;
    private int Gk;
    private Context mContext;

    public c(Context context, int i) {
        this.mContext = context;
        this.FX = com.kwad.sdk.d.a.a.a(context, 51.0f);
        this.FY = com.kwad.sdk.d.a.a.a(context, 61.0f);
        this.Gk = i;
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(float f) {
        if (f <= 6.0f) {
            float f2 = f / 6.0f;
            int i = this.Gk;
            if (i == 0) {
                this.Gb.top = this.Ge * (1.0f - f2);
                this.FT.offsetTo(this.Gb.left + this.Ga, this.Gb.top + this.FZ);
                this.Gj = (f2 * 30.0f) + 290.0f;
            } else if (i == 1) {
                float f3 = 1.0f - f2;
                this.Gb.left = this.Gd * f3;
                this.FT.offsetTo(this.Gb.left + this.Ga, this.Gb.top + this.FZ);
                this.Gj = f3 * 30.0f;
            } else if (i != 2) {
            } else {
                this.Gb.right = this.Gd * f2;
                this.FT.offsetTo(this.Gb.right + this.Ga, this.Gb.top + this.FZ);
                this.Gj = (f2 * 30.0f) + 330.0f;
            }
        }
    }

    private void init() {
        float f;
        float f2;
        Matrix matrix;
        float f3;
        this.FM = BitmapFactory.decodeResource(this.mContext.getResources(), R.drawable.ksad_splash_hand);
        this.FN = BitmapFactory.decodeResource(this.mContext.getResources(), R.drawable.ksad_splash_hand_lt);
        this.FO = BitmapFactory.decodeResource(this.mContext.getResources(), R.drawable.ksad_splash_hand_lb);
        this.FP = BitmapFactory.decodeResource(this.mContext.getResources(), R.drawable.ksad_splash_hand_rt);
        this.FQ = BitmapFactory.decodeResource(this.mContext.getResources(), R.drawable.ksad_splash_hand_rb);
        Bitmap decodeResource = BitmapFactory.decodeResource(this.mContext.getResources(), R.drawable.ksad_splash_side_bg);
        int i = this.Gk;
        if (i != 0) {
            if (i == 1) {
                matrix = new Matrix();
                f3 = 270.0f;
            } else if (i == 2) {
                matrix = new Matrix();
                f3 = 90.0f;
            }
            matrix.postRotate(f3);
            this.FR = Bitmap.createBitmap(decodeResource, 0, 0, decodeResource.getWidth(), decodeResource.getHeight(), matrix, true);
        } else {
            this.FR = decodeResource;
        }
        this.FS = com.kwad.sdk.d.a.a.a(this.mContext, 10.0f);
        this.Gc = new Paint(1);
        int i2 = this.Gk;
        if (i2 == 0) {
            this.Ge = (int) this.mContext.getResources().getDimension(R.dimen.ksad_splash_hand_bgh);
            int dimension = (int) this.mContext.getResources().getDimension(R.dimen.ksad_splash_hand_bgw);
            this.Gd = dimension;
            this.FZ = (-this.FY) * 0.22f;
            f = dimension;
            f2 = 0.08f;
        } else if (i2 != 1) {
            if (i2 == 2) {
                this.Ge = (int) this.mContext.getResources().getDimension(R.dimen.ksad_splash_hand_bgw);
                this.Gd = (int) this.mContext.getResources().getDimension(R.dimen.ksad_splash_hand_bgh);
                this.FZ = this.Ge * 0.09f;
                f = -this.FX;
                f2 = 0.5f;
            }
            this.Gb = new RectF(0.0f, 0.0f, this.Gd, this.Ge);
            this.FU = new Paint(3);
            Paint paint = new Paint(3);
            this.FV = paint;
            paint.setDither(true);
            this.FT = new RectF(this.Gb.right - this.FX, 0.0f, this.Gb.right, this.FY);
            this.FW = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 6.0f, 11.0f);
            this.Gf = ofFloat;
            ofFloat.setDuration(1100L);
            this.Gf.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kwad.components.ad.splashscreen.widget.c.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    c.this.Gi = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    c cVar = c.this;
                    cVar.c(cVar.Gi);
                    c.this.invalidateSelf();
                }
            });
            this.Gf.setRepeatCount(-1);
        } else {
            this.Ge = (int) this.mContext.getResources().getDimension(R.dimen.ksad_splash_hand_bgw);
            this.Gd = (int) this.mContext.getResources().getDimension(R.dimen.ksad_splash_hand_bgh);
            this.FZ = this.Ge * 0.09f;
            f = -this.FX;
            f2 = 0.2f;
        }
        this.Ga = f * f2;
        this.Gb = new RectF(0.0f, 0.0f, this.Gd, this.Ge);
        this.FU = new Paint(3);
        Paint paint2 = new Paint(3);
        this.FV = paint2;
        paint2.setDither(true);
        this.FT = new RectF(this.Gb.right - this.FX, 0.0f, this.Gb.right, this.FY);
        this.FW = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 6.0f, 11.0f);
        this.Gf = ofFloat2;
        ofFloat2.setDuration(1100L);
        this.Gf.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kwad.components.ad.splashscreen.widget.c.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                c.this.Gi = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c cVar = c.this;
                cVar.c(cVar.Gi);
                c.this.invalidateSelf();
            }
        });
        this.Gf.setRepeatCount(-1);
    }

    @Override // android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        if (this.Gb == null) {
            return;
        }
        canvas.save();
        canvas.translate((getIntrinsicWidth() - this.Gd) / 2, (getIntrinsicHeight() - this.Ge) / 2);
        float f = this.Gi;
        if (f <= 6.0f) {
            this.Gc.setAlpha((int) ((f * 255.0f) / 6.0f));
            this.FV.setAlpha(255);
        } else {
            int i = (int) ((1.0f - ((f - 6.0f) / 5.0f)) * 255.0f);
            this.Gc.setAlpha(i);
            this.FV.setAlpha(i);
        }
        int save = canvas.save();
        int saveLayer = canvas.saveLayer(this.Gb, this.Gc, 31);
        canvas.drawBitmap(this.FR, (Rect) null, this.Gb, this.Gc);
        canvas.rotate(this.Gj, this.FT.centerX(), this.FT.centerY());
        this.FU.setXfermode(this.FW);
        int i2 = this.Gk;
        if (i2 != 0) {
            if (i2 == 1) {
                canvas.drawBitmap(this.FN, (Rect) null, this.FT, this.FU);
                bitmap = this.FO;
            }
            canvas.drawBitmap(this.FM, (Rect) null, this.FT, this.FU);
            canvas.restoreToCount(saveLayer);
            canvas.rotate(this.Gj, this.FT.centerX(), this.FT.centerY());
            canvas.drawBitmap(this.FM, (Rect) null, this.FT, this.FV);
            canvas.restoreToCount(save);
            canvas.restore();
        }
        canvas.drawBitmap(this.FP, (Rect) null, this.FT, this.FU);
        bitmap = this.FQ;
        canvas.drawBitmap(bitmap, (Rect) null, this.FT, this.FU);
        canvas.drawBitmap(this.FM, (Rect) null, this.FT, this.FU);
        canvas.restoreToCount(saveLayer);
        canvas.rotate(this.Gj, this.FT.centerX(), this.FT.centerY());
        canvas.drawBitmap(this.FM, (Rect) null, this.FT, this.FV);
        canvas.restoreToCount(save);
        canvas.restore();
    }

    @Override // android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.Ge + this.FY + this.FS;
    }

    @Override // android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.Gd + this.FX;
    }

    @Override // android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.AnimationDrawable, android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ValueAnimator valueAnimator = this.Gf;
        if (valueAnimator != null) {
            return valueAnimator.isRunning();
        }
        return false;
    }

    @Override // android.graphics.drawable.AnimationDrawable, android.graphics.drawable.Animatable
    public final void start() {
        ValueAnimator valueAnimator = this.Gf;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    @Override // android.graphics.drawable.AnimationDrawable, android.graphics.drawable.Animatable
    public final void stop() {
        ValueAnimator valueAnimator = this.Gf;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
