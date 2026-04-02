package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import com.crunchyroll.crunchyroid.R;
/* loaded from: classes.dex */
public final class SeekBar extends View {
    public final RectF b;
    public final RectF c;
    public final RectF d;
    public final Paint e;
    public final Paint f;
    public final Paint g;
    public final Paint h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;

    /* loaded from: classes.dex */
    public static abstract class a {
    }

    public SeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new RectF();
        this.c = new RectF();
        this.d = new RectF();
        Paint paint = new Paint(1);
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.f = paint2;
        Paint paint3 = new Paint(1);
        this.g = paint3;
        Paint paint4 = new Paint(1);
        this.h = paint4;
        setWillNotDraw(false);
        paint3.setColor(-7829368);
        paint.setColor(-3355444);
        paint2.setColor(-65536);
        paint4.setColor(-1);
        this.n = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_progressbar_bar_height);
        this.o = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_progressbar_active_bar_height);
        this.m = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_progressbar_active_radius);
    }

    public final void a() {
        int i;
        int i2;
        if (isFocused()) {
            i = this.o;
        } else {
            i = this.n;
        }
        int width = getWidth();
        int height = getHeight();
        int i3 = (height - i) / 2;
        RectF rectF = this.d;
        int i4 = this.n;
        float f = i3;
        float f2 = height - i3;
        rectF.set(i4 / 2, f, width - (i4 / 2), f2);
        if (isFocused()) {
            i2 = this.m;
        } else {
            i2 = this.n / 2;
        }
        float f3 = width - (i2 * 2);
        float f4 = (this.i / this.k) * f3;
        RectF rectF2 = this.b;
        int i5 = this.n;
        rectF2.set(i5 / 2, f, (i5 / 2) + f4, f2);
        this.c.set(rectF2.right, f, (this.n / 2) + ((this.j / this.k) * f3), f2);
        this.l = i2 + ((int) f4);
        invalidate();
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return android.widget.SeekBar.class.getName();
    }

    public int getMax() {
        return this.k;
    }

    public int getProgress() {
        return this.i;
    }

    public int getSecondProgress() {
        return this.j;
    }

    public int getSecondaryProgressColor() {
        return this.e.getColor();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (isFocused()) {
            i = this.m;
        } else {
            i = this.n / 2;
        }
        float f = i;
        canvas.drawRoundRect(this.d, f, f, this.g);
        RectF rectF = this.c;
        if (rectF.right > rectF.left) {
            canvas.drawRoundRect(rectF, f, f, this.e);
        }
        canvas.drawRoundRect(this.b, f, f, this.f);
        canvas.drawCircle(this.l, getHeight() / 2, f, this.h);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        a();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a();
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        return super.performAccessibilityAction(i, bundle);
    }

    public void setActiveBarHeight(int i) {
        this.o = i;
        a();
    }

    public void setActiveRadius(int i) {
        this.m = i;
        a();
    }

    public void setBarHeight(int i) {
        this.n = i;
        a();
    }

    public void setMax(int i) {
        this.k = i;
        a();
    }

    public void setProgress(int i) {
        int i2 = this.k;
        if (i > i2) {
            i = i2;
        } else if (i < 0) {
            i = 0;
        }
        this.i = i;
        a();
    }

    public void setProgressColor(int i) {
        this.f.setColor(i);
    }

    public void setSecondaryProgress(int i) {
        int i2 = this.k;
        if (i > i2) {
            i = i2;
        } else if (i < 0) {
            i = 0;
        }
        this.j = i;
        a();
    }

    public void setSecondaryProgressColor(int i) {
        this.e.setColor(i);
    }

    public void setAccessibilitySeekListener(a aVar) {
    }
}
