package com.kwad.components.core.page.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.kwad.sdk.m.l;
/* loaded from: classes.dex */
public class TextProgressBar extends ProgressBar {
    private String OQ;
    private LinearGradient OR;
    private Matrix OS;
    private boolean OT;
    private boolean OU;
    private boolean OV;
    private int OW;
    private int OX;
    private Drawable OY;
    private int OZ;
    private Rect Pa;
    private int[] Pb;
    private int Pc;
    private int Pd;
    private boolean Pe;
    private Paint mPaint;
    private RectF mRectF;

    public TextProgressBar(Context context) {
        this(context, null);
    }

    public TextProgressBar(Context context, AttributeSet attributeSet) {
        super(l.wrapContextIfNeed(context), attributeSet);
        this.OU = false;
        this.OV = true;
        this.Pa = new Rect();
        pw();
    }

    private void pw() {
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setAntiAlias(true);
        this.mPaint.setColor(-1);
        this.mPaint.setTextSize(com.kwad.sdk.d.a.a.a(getContext(), 12.0f));
        this.OZ = com.kwad.sdk.d.a.a.a(getContext(), 2.0f);
        this.mRectF = new RectF();
        this.Pc = -1;
        this.Pd = -117146;
    }

    private void setProgressText(int i) {
        this.OQ = String.valueOf((int) (((i * 1.0f) / getMax()) * 100.0f)) + "%";
    }

    public final void e(String str, int i) {
        this.OQ = str;
        this.OT = true;
        setProgress(i);
        invalidate();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        int width;
        if (this.OU) {
            canvas.save();
            canvas.rotate(90.0f);
            canvas.translate(0.0f, -getWidth());
            super.onDraw(canvas);
            canvas.restore();
        } else {
            super.onDraw(canvas);
        }
        if (!TextUtils.isEmpty(this.OQ)) {
            Paint paint = this.mPaint;
            String str = this.OQ;
            paint.getTextBounds(str, 0, str.length(), this.Pa);
        }
        int height = (getHeight() / 2) - this.Pa.centerY();
        Drawable drawable = this.OY;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = this.OY.getIntrinsicHeight();
            int width2 = (((getWidth() - this.Pa.width()) - intrinsicWidth) - this.OZ) / 2;
            int i = intrinsicWidth + width2;
            this.OY.setBounds(width2, (getHeight() - intrinsicHeight) / 2, i, (getHeight() + intrinsicHeight) / 2);
            this.OY.draw(canvas);
            width = i + this.OZ;
        } else {
            width = (getWidth() / 2) - this.Pa.centerX();
        }
        if (this.Pb != null) {
            float progress = ((getProgress() * 1.0f) / getMax()) * getWidth();
            float f = width;
            if (progress >= f) {
                if (this.OR == null) {
                    this.OR = new LinearGradient(f, 0.0f, width + this.Pa.width(), 0.0f, this.Pb, (float[]) null, Shader.TileMode.CLAMP);
                    Matrix matrix = new Matrix();
                    this.OS = matrix;
                    this.OR.setLocalMatrix(matrix);
                }
                this.mPaint.setShader(this.OR);
                this.OS.setScale(((progress - f) * 1.0f) / this.Pa.width(), 1.0f, f, 0.0f);
                this.OR.setLocalMatrix(this.OS);
            } else {
                this.mPaint.setShader(null);
            }
            canvas.drawText(this.OQ, f, height, this.mPaint);
            return;
        }
        if (!isIndeterminate() && !this.Pe) {
            this.mPaint.setColor(this.Pc);
            String str2 = this.OQ;
            if (str2 != null) {
                canvas.drawText(str2, width, height, this.mPaint);
            }
            return;
        }
        float width3 = (getWidth() * getProgress()) / getMax();
        int save = canvas.save();
        this.mRectF.set(width3, 0.0f, getWidth(), getHeight());
        canvas.clipRect(this.mRectF);
        this.mPaint.setColor(this.Pd);
        String str3 = this.OQ;
        if (str3 != null) {
            canvas.drawText(str3, width, height, this.mPaint);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        this.mRectF.set(0.0f, 0.0f, width3, getHeight());
        canvas.clipRect(this.mRectF);
        this.mPaint.setColor(this.Pc);
        String str4 = this.OQ;
        if (str4 != null) {
            canvas.drawText(str4, width, height, this.mPaint);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null && !TextUtils.isEmpty(this.OQ)) {
            Rect rect = new Rect();
            Paint paint = this.mPaint;
            String str = this.OQ;
            paint.getTextBounds(str, 0, str.length(), rect);
            if (layoutParams.width == -2) {
                layoutParams.width = rect.width() + this.OW + this.OX;
                i = View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824);
            }
            if (layoutParams.height == -2) {
                layoutParams.height = rect.height();
                i2 = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
            }
        }
        if (!this.OU) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i2, i);
        setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        if (this.OU) {
            super.onSizeChanged(i2, i, i3, i4);
        } else {
            super.onSizeChanged(i, i2, i3, i4);
        }
    }

    public void setDrawableLeft(Drawable drawable) {
        this.OY = drawable;
    }

    public void setDrawablePadding(int i) {
        this.OZ = i;
    }

    public void setHasProgress(boolean z) {
        this.OV = z;
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.OW = i;
        this.OX = i3;
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i) {
        if (this.OV) {
            super.setProgress(i);
        } else {
            super.setProgress(0);
        }
    }

    public void setTextColor(int i) {
        this.Pe = false;
        this.Pc = i;
        postInvalidate();
    }

    public final void setTextColor(int i, int i2) {
        this.Pe = true;
        this.Pc = i;
        this.Pd = i2;
        postInvalidate();
    }

    public void setTextDimen(float f) {
        this.mPaint.setTextSize(f);
    }

    public void setTextDimenSp(int i) {
        this.mPaint.setTextSize(TypedValue.applyDimension(2, i, getResources().getDisplayMetrics()));
    }

    public void setVertical(boolean z) {
        this.OU = z;
    }
}
