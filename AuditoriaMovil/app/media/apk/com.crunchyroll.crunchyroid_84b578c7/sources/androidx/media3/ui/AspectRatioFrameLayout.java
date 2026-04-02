package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.amazon.aps.iva.c8.u;
import com.google.common.primitives.Ints;
/* loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public final b b;
    public float c;
    public int d;

    /* loaded from: classes.dex */
    public interface a {
    }

    /* loaded from: classes.dex */
    public final class b implements Runnable {
        public boolean b;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.b = false;
            int i = AspectRatioFrameLayout.e;
            AspectRatioFrameLayout.this.getClass();
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, u.a, 0, 0);
            try {
                this.d = obtainStyledAttributes.getInt(0, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.b = new b();
    }

    public int getResizeMode() {
        return this.d;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        float f2;
        super.onMeasure(i, i2);
        if (this.c <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        float f5 = (this.c / (f3 / f4)) - 1.0f;
        int i3 = (Math.abs(f5) > 0.01f ? 1 : (Math.abs(f5) == 0.01f ? 0 : -1));
        b bVar = this.b;
        if (i3 <= 0) {
            if (!bVar.b) {
                bVar.b = true;
                AspectRatioFrameLayout.this.post(bVar);
                return;
            }
            return;
        }
        int i4 = this.d;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 4) {
                        if (f5 > 0.0f) {
                            f = this.c;
                        } else {
                            f2 = this.c;
                        }
                    }
                } else {
                    f = this.c;
                }
                measuredWidth = (int) (f4 * f);
            } else {
                f2 = this.c;
            }
            measuredHeight = (int) (f3 / f2);
        } else if (f5 > 0.0f) {
            f2 = this.c;
            measuredHeight = (int) (f3 / f2);
        } else {
            f = this.c;
            measuredWidth = (int) (f4 * f);
        }
        if (!bVar.b) {
            bVar.b = true;
            AspectRatioFrameLayout.this.post(bVar);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Ints.MAX_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(measuredHeight, Ints.MAX_POWER_OF_TWO));
    }

    public void setAspectRatio(float f) {
        if (this.c != f) {
            this.c = f;
            requestLayout();
        }
    }

    public void setResizeMode(int i) {
        if (this.d != i) {
            this.d = i;
            requestLayout();
        }
    }

    public void setAspectRatioListener(a aVar) {
    }
}
