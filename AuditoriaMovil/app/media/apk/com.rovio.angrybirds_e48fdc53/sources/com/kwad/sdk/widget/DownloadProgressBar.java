package com.kwad.sdk.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
/* loaded from: classes3.dex */
public class DownloadProgressBar extends View {
    private Runnable Ds;
    Paint aLO;
    Paint aLP;
    Paint aLQ;
    private String aLR;
    private float aLS;
    private Rect aLT;
    private LinearGradient aLU;
    private LinearGradient aLV;
    private LinearGradient aLW;
    private Matrix mMatrix;
    private Path mPath;
    private RectF mRectF;
    private long mStartTime;

    public DownloadProgressBar(Context context) {
        this(context, null, 0);
    }

    public DownloadProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DownloadProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Ds = new Runnable() { // from class: com.kwad.sdk.widget.DownloadProgressBar.1
            @Override // java.lang.Runnable
            public final void run() {
                DownloadProgressBar.this.invalidate();
                if (DownloadProgressBar.this.getWindowVisibility() == 0) {
                    DownloadProgressBar.this.postDelayed(this, 34L);
                }
            }
        };
        this.aLO = new Paint(1);
        this.aLP = new Paint(1);
        this.mRectF = new RectF();
        Paint paint = new Paint(1);
        this.aLQ = paint;
        paint.setTextSize(com.kwad.sdk.d.a.a.a(context, 16.0f));
        this.aLQ.setColor(-1);
        this.aLQ.setTextAlign(Paint.Align.CENTER);
        this.aLT = new Rect();
        this.mMatrix = new Matrix();
        this.mPath = new Path();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.Ds);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.clipPath(this.mPath);
        this.aLO.setShader(this.aLU);
        canvas.drawRect(this.mRectF, this.aLO);
        this.aLO.setShader(this.aLV);
        canvas.drawRect(0.0f, 0.0f, (getWidth() * this.aLS) / 100.0f, getHeight(), this.aLO);
        float f = this.aLS;
        float f2 = 0.0f;
        if (f > 0.0f && f < 100.0f) {
            long elapsedRealtime = (SystemClock.elapsedRealtime() - this.mStartTime) % 2500;
            int i = (elapsedRealtime > 1500L ? 1 : (elapsedRealtime == 1500L ? 0 : -1));
            float f3 = i >= 0 ? 0.0f : ((float) elapsedRealtime) / 1500.0f;
            this.mMatrix.reset();
            this.mMatrix.setScale(1.0f, f3);
            this.aLW.setLocalMatrix(this.mMatrix);
            this.aLP.setShader(this.aLW);
            canvas.drawRect(0.0f, 0.0f, ((getWidth() * this.aLS) / 100.0f) * f3, getHeight(), this.aLP);
            if (elapsedRealtime > 500 && i <= 0) {
                f2 = ((float) (elapsedRealtime - 500)) / 1000.0f;
            }
            float width = ((getWidth() * this.aLS) / 100.0f) * f2;
            this.mMatrix.reset();
            this.mMatrix.setScale(1.0f, f3);
            this.aLW.setLocalMatrix(this.mMatrix);
            this.aLP.setShader(this.aLW);
            canvas.drawRect(0.0f, 0.0f, width, getHeight(), this.aLP);
        }
        String str = this.aLR;
        if (str != null) {
            this.aLQ.getTextBounds(str, 0, str.length(), this.aLT);
            canvas.drawText(this.aLR, getWidth() / 2.0f, (getHeight() / 2.0f) - ((this.aLT.top + this.aLT.bottom) / 2.0f), this.aLQ);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.aLU = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{1291525714, 1291569420}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.aLV = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{-319918, -276212}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.aLO.setShader(this.aLU);
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{16501004, -276212}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.aLW = linearGradient;
        this.aLP.setShader(linearGradient);
        float f = i;
        this.mRectF.set(0.0f, 0.0f, f, i2);
        this.mPath.reset();
        float f2 = f / 2.0f;
        this.mPath.addRoundRect(this.mRectF, f2, f2, Path.Direction.CW);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i != 0) {
            removeCallbacks(this.Ds);
            return;
        }
        float f = this.aLS;
        if (f <= 0.0f || f >= 100.0f) {
            return;
        }
        this.mStartTime = SystemClock.elapsedRealtime();
        post(this.Ds);
    }

    public void setProgress(float f) {
        this.aLS = f;
        invalidate();
        if (f == 0.0f || f == 100.0f) {
            removeCallbacks(this.Ds);
        } else if (getWindowVisibility() == 0 && this.mStartTime == 0) {
            post(this.Ds);
        }
    }

    public void setText(String str) {
        this.aLR = str;
        invalidate();
    }
}
