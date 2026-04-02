package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.amazon.aps.iva.f5.b;
import com.amazon.aps.iva.f5.f;
/* loaded from: classes.dex */
public class HorizontalGridView extends b {
    public boolean h;
    public boolean i;
    public Paint j;
    public Bitmap k;
    public LinearGradient l;
    public int m;
    public int n;
    public Bitmap o;
    public LinearGradient p;
    public int q;
    public int r;
    public final Rect s;

    public HorizontalGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private Bitmap getTempBitmapHigh() {
        Bitmap bitmap = this.o;
        if (bitmap == null || bitmap.getWidth() != this.q || this.o.getHeight() != getHeight()) {
            this.o = Bitmap.createBitmap(this.q, getHeight(), Bitmap.Config.ARGB_8888);
        }
        return this.o;
    }

    private Bitmap getTempBitmapLow() {
        Bitmap bitmap = this.k;
        if (bitmap == null || bitmap.getWidth() != this.m || this.k.getHeight() != getHeight()) {
            this.k = Bitmap.createBitmap(this.m, getHeight(), Bitmap.Config.ARGB_8888);
        }
        return this.k;
    }

    public final void U2() {
        if (!this.h && !this.i) {
            setLayerType(0, null);
            setWillNotDraw(true);
            return;
        }
        setLayerType(2, null);
        setWillNotDraw(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        int i;
        int width;
        int i2;
        int i3;
        int i4;
        boolean z2 = this.h;
        f fVar = this.b;
        boolean z3 = true;
        if (z2) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                fVar.getClass();
                f.d dVar = (f.d) childAt.getLayoutParams();
                dVar.getClass();
                if (childAt.getLeft() + dVar.e < getPaddingLeft() - this.n) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (this.i) {
            for (int childCount2 = getChildCount() - 1; childCount2 >= 0; childCount2--) {
                View childAt2 = getChildAt(childCount2);
                fVar.getClass();
                f.d dVar2 = (f.d) childAt2.getLayoutParams();
                dVar2.getClass();
                if (childAt2.getRight() - dVar2.g > (getWidth() - getPaddingRight()) + this.r) {
                    break;
                }
            }
        }
        z3 = false;
        if (!z) {
            this.k = null;
        }
        if (!z3) {
            this.o = null;
        }
        if (!z && !z3) {
            super.draw(canvas);
            return;
        }
        if (this.h) {
            i = (getPaddingLeft() - this.n) - this.m;
        } else {
            i = 0;
        }
        if (this.i) {
            width = (getWidth() - getPaddingRight()) + this.r + this.q;
        } else {
            width = getWidth();
        }
        int save = canvas.save();
        if (this.h) {
            i2 = this.m;
        } else {
            i2 = 0;
        }
        int i6 = i2 + i;
        if (this.i) {
            i3 = this.q;
        } else {
            i3 = 0;
        }
        canvas.clipRect(i6, 0, width - i3, getHeight());
        super.draw(canvas);
        canvas.restoreToCount(save);
        Canvas canvas2 = new Canvas();
        Rect rect = this.s;
        rect.top = 0;
        rect.bottom = getHeight();
        if (z && this.m > 0) {
            Bitmap tempBitmapLow = getTempBitmapLow();
            tempBitmapLow.eraseColor(0);
            canvas2.setBitmap(tempBitmapLow);
            int save2 = canvas2.save();
            canvas2.clipRect(0, 0, this.m, getHeight());
            float f = -i;
            canvas2.translate(f, 0.0f);
            super.draw(canvas2);
            canvas2.restoreToCount(save2);
            this.j.setShader(this.l);
            canvas2.drawRect(0.0f, 0.0f, this.m, getHeight(), this.j);
            rect.left = 0;
            rect.right = this.m;
            canvas.translate(i, 0.0f);
            canvas.drawBitmap(tempBitmapLow, rect, rect, (Paint) null);
            canvas.translate(f, 0.0f);
        }
        if (z3 && this.q > 0) {
            Bitmap tempBitmapHigh = getTempBitmapHigh();
            tempBitmapHigh.eraseColor(0);
            canvas2.setBitmap(tempBitmapHigh);
            int save3 = canvas2.save();
            canvas2.clipRect(0, 0, this.q, getHeight());
            canvas2.translate(-(width - this.q), 0.0f);
            super.draw(canvas2);
            canvas2.restoreToCount(save3);
            this.j.setShader(this.p);
            canvas2.drawRect(0.0f, 0.0f, this.q, getHeight(), this.j);
            rect.left = 0;
            rect.right = this.q;
            canvas.translate(width - i4, 0.0f);
            canvas.drawBitmap(tempBitmapHigh, rect, rect, (Paint) null);
            canvas.translate(-(width - this.q), 0.0f);
        }
    }

    public final boolean getFadingLeftEdge() {
        return this.h;
    }

    public final int getFadingLeftEdgeLength() {
        return this.m;
    }

    public final int getFadingLeftEdgeOffset() {
        return this.n;
    }

    public final boolean getFadingRightEdge() {
        return this.i;
    }

    public final int getFadingRightEdgeLength() {
        return this.q;
    }

    public final int getFadingRightEdgeOffset() {
        return this.r;
    }

    public final void setFadingLeftEdge(boolean z) {
        if (this.h != z) {
            this.h = z;
            if (!z) {
                this.k = null;
            }
            invalidate();
            U2();
        }
    }

    public final void setFadingLeftEdgeLength(int i) {
        if (this.m != i) {
            this.m = i;
            if (i != 0) {
                this.l = new LinearGradient(0.0f, 0.0f, this.m, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
            } else {
                this.l = null;
            }
            invalidate();
        }
    }

    public final void setFadingLeftEdgeOffset(int i) {
        if (this.n != i) {
            this.n = i;
            invalidate();
        }
    }

    public final void setFadingRightEdge(boolean z) {
        if (this.i != z) {
            this.i = z;
            if (!z) {
                this.o = null;
            }
            invalidate();
            U2();
        }
    }

    public final void setFadingRightEdgeLength(int i) {
        if (this.q != i) {
            this.q = i;
            if (i != 0) {
                this.p = new LinearGradient(0.0f, 0.0f, this.q, 0.0f, -16777216, 0, Shader.TileMode.CLAMP);
            } else {
                this.p = null;
            }
            invalidate();
        }
    }

    public final void setFadingRightEdgeOffset(int i) {
        if (this.r != i) {
            this.r = i;
            invalidate();
        }
    }

    public void setNumRows(int i) {
        f fVar = this.b;
        if (i >= 0) {
            fVar.E = i;
            requestLayout();
            return;
        }
        fVar.getClass();
        throw new IllegalArgumentException();
    }

    public void setRowHeight(TypedArray typedArray) {
        if (typedArray.peekValue(1) != null) {
            setRowHeight(typedArray.getLayoutDimension(1, 0));
        }
    }

    public HorizontalGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.j = new Paint();
        this.s = new Rect();
        this.b.setOrientation(0);
        b1(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.d5.a.e);
        setRowHeight(obtainStyledAttributes);
        setNumRows(obtainStyledAttributes.getInt(0, 1));
        obtainStyledAttributes.recycle();
        U2();
        Paint paint = new Paint();
        this.j = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    public void setRowHeight(int i) {
        this.b.G(i);
        requestLayout();
    }
}
