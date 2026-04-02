package c.e.c;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
public class f extends Drawable {
    public float a;

    /* renamed from: c  reason: collision with root package name */
    public final RectF f1611c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f1612d;

    /* renamed from: e  reason: collision with root package name */
    public float f1613e;

    /* renamed from: h  reason: collision with root package name */
    public ColorStateList f1616h;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuffColorFilter f1617i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f1618j;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1614f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1615g = true;

    /* renamed from: k  reason: collision with root package name */
    public PorterDuff.Mode f1619k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f1610b = new Paint(5);

    public f(ColorStateList colorStateList, float f2) {
        this.a = f2;
        b(colorStateList);
        this.f1611c = new RectF();
        this.f1612d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1616h = colorStateList;
        this.f1610b.setColor(colorStateList.getColorForState(getState(), this.f1616h.getDefaultColor()));
    }

    public final void c(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f1611c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f1612d.set(rect);
        if (this.f1614f) {
            float b2 = g.b(this.f1613e, this.a, this.f1615g);
            this.f1612d.inset((int) Math.ceil(g.a(this.f1613e, this.a, this.f1615g)), (int) Math.ceil(b2));
            this.f1611c.set(this.f1612d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f1610b;
        if (this.f1617i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f1617i);
            z = true;
        }
        RectF rectF = this.f1611c;
        float f2 = this.a;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f1612d, this.a);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f1618j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f1616h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f1616h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f1610b.getColor();
        if (z) {
            this.f1610b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f1618j;
        if (colorStateList2 == null || (mode = this.f1619k) == null) {
            return z;
        }
        this.f1617i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f1610b.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1610b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f1618j = colorStateList;
        this.f1617i = a(colorStateList, this.f1619k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f1619k = mode;
        this.f1617i = a(this.f1618j, mode);
        invalidateSelf();
    }
}
