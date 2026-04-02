package c.e.c;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class g extends Drawable {
    public static final double a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: b  reason: collision with root package name */
    public static a f1620b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1621c;

    /* renamed from: e  reason: collision with root package name */
    public Paint f1623e;

    /* renamed from: f  reason: collision with root package name */
    public Paint f1624f;

    /* renamed from: g  reason: collision with root package name */
    public final RectF f1625g;

    /* renamed from: h  reason: collision with root package name */
    public float f1626h;

    /* renamed from: i  reason: collision with root package name */
    public Path f1627i;

    /* renamed from: j  reason: collision with root package name */
    public float f1628j;

    /* renamed from: k  reason: collision with root package name */
    public float f1629k;

    /* renamed from: l  reason: collision with root package name */
    public float f1630l;

    /* renamed from: m  reason: collision with root package name */
    public ColorStateList f1631m;
    public final int o;
    public final int p;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1632n = true;
    public boolean q = true;
    public boolean r = false;

    /* renamed from: d  reason: collision with root package name */
    public Paint f1622d = new Paint(5);

    /* loaded from: classes.dex */
    public interface a {
        void a(Canvas canvas, RectF rectF, float f2, Paint paint);
    }

    public g(Resources resources, ColorStateList colorStateList, float f2, float f3, float f4) {
        this.o = resources.getColor(R.color.cardview_shadow_start_color);
        this.p = resources.getColor(R.color.cardview_shadow_end_color);
        this.f1621c = resources.getDimensionPixelSize(R.dimen.cardview_compat_inset_shadow);
        c(colorStateList);
        Paint paint = new Paint(5);
        this.f1623e = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f1626h = (int) (f2 + 0.5f);
        this.f1625g = new RectF();
        Paint paint2 = new Paint(this.f1623e);
        this.f1624f = paint2;
        paint2.setAntiAlias(false);
        d(f3, f4);
    }

    public static float a(float f2, float f3, boolean z) {
        if (z) {
            double d2 = f2;
            double d3 = f3;
            Double.isNaN(d3);
            Double.isNaN(d2);
            return (float) (((1.0d - a) * d3) + d2);
        }
        return f2;
    }

    public static float b(float f2, float f3, boolean z) {
        if (z) {
            double d2 = f2 * 1.5f;
            double d3 = f3;
            Double.isNaN(d3);
            Double.isNaN(d2);
            return (float) (((1.0d - a) * d3) + d2);
        }
        return f2 * 1.5f;
    }

    public final void c(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1631m = colorStateList;
        this.f1622d.setColor(colorStateList.getColorForState(getState(), this.f1631m.getDefaultColor()));
    }

    public final void d(float f2, float f3) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f2 + ". Must be >= 0");
        } else if (f3 < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + f3 + ". Must be >= 0");
        } else {
            int i2 = (int) (f2 + 0.5f);
            if (i2 % 2 == 1) {
                i2--;
            }
            float f4 = i2;
            int i3 = (int) (f3 + 0.5f);
            if (i3 % 2 == 1) {
                i3--;
            }
            float f5 = i3;
            if (f4 > f5) {
                if (!this.r) {
                    this.r = true;
                }
                f4 = f5;
            }
            if (this.f1630l == f4 && this.f1628j == f5) {
                return;
            }
            this.f1630l = f4;
            this.f1628j = f5;
            this.f1629k = (int) ((f4 * 1.5f) + this.f1621c + 0.5f);
            this.f1632n = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i2;
        if (this.f1632n) {
            Rect bounds = getBounds();
            float f2 = this.f1628j;
            float f3 = 1.5f * f2;
            this.f1625g.set(bounds.left + f2, bounds.top + f3, bounds.right - f2, bounds.bottom - f3);
            float f4 = this.f1626h;
            float f5 = -f4;
            RectF rectF = new RectF(f5, f5, f4, f4);
            RectF rectF2 = new RectF(rectF);
            float f6 = -this.f1629k;
            rectF2.inset(f6, f6);
            Path path = this.f1627i;
            if (path == null) {
                this.f1627i = new Path();
            } else {
                path.reset();
            }
            this.f1627i.setFillType(Path.FillType.EVEN_ODD);
            this.f1627i.moveTo(-this.f1626h, 0.0f);
            this.f1627i.rLineTo(-this.f1629k, 0.0f);
            this.f1627i.arcTo(rectF2, 180.0f, 90.0f, false);
            this.f1627i.arcTo(rectF, 270.0f, -90.0f, false);
            this.f1627i.close();
            float f7 = this.f1626h;
            float f8 = f7 / (this.f1629k + f7);
            Paint paint = this.f1623e;
            float f9 = this.f1626h + this.f1629k;
            int i3 = this.o;
            paint.setShader(new RadialGradient(0.0f, 0.0f, f9, new int[]{i3, i3, this.p}, new float[]{0.0f, f8, 1.0f}, Shader.TileMode.CLAMP));
            Paint paint2 = this.f1624f;
            float f10 = -this.f1626h;
            float f11 = this.f1629k;
            float f12 = f10 + f11;
            float f13 = f10 - f11;
            int i4 = this.o;
            paint2.setShader(new LinearGradient(0.0f, f12, 0.0f, f13, new int[]{i4, i4, this.p}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
            this.f1624f.setAntiAlias(false);
            this.f1632n = false;
        }
        canvas.translate(0.0f, this.f1630l / 2.0f);
        float f14 = this.f1626h;
        float f15 = (-f14) - this.f1629k;
        float f16 = (this.f1630l / 2.0f) + f14 + this.f1621c;
        float f17 = f16 * 2.0f;
        boolean z = this.f1625g.width() - f17 > 0.0f;
        boolean z2 = this.f1625g.height() - f17 > 0.0f;
        int save = canvas.save();
        RectF rectF3 = this.f1625g;
        canvas.translate(rectF3.left + f16, rectF3.top + f16);
        canvas.drawPath(this.f1627i, this.f1623e);
        if (z) {
            i2 = save;
            canvas.drawRect(0.0f, f15, this.f1625g.width() - f17, -this.f1626h, this.f1624f);
        } else {
            i2 = save;
        }
        canvas.restoreToCount(i2);
        int save2 = canvas.save();
        RectF rectF4 = this.f1625g;
        canvas.translate(rectF4.right - f16, rectF4.bottom - f16);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f1627i, this.f1623e);
        if (z) {
            canvas.drawRect(0.0f, f15, this.f1625g.width() - f17, (-this.f1626h) + this.f1629k, this.f1624f);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF5 = this.f1625g;
        canvas.translate(rectF5.left + f16, rectF5.bottom - f16);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f1627i, this.f1623e);
        if (z2) {
            canvas.drawRect(0.0f, f15, this.f1625g.height() - f17, -this.f1626h, this.f1624f);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF6 = this.f1625g;
        canvas.translate(rectF6.right - f16, rectF6.top + f16);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f1627i, this.f1623e);
        if (z2) {
            canvas.drawRect(0.0f, f15, this.f1625g.height() - f17, -this.f1626h, this.f1624f);
        }
        canvas.restoreToCount(save4);
        canvas.translate(0.0f, (-this.f1630l) / 2.0f);
        f1620b.a(canvas, this.f1625g, this.f1626h, this.f1622d);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil(b(this.f1628j, this.f1626h, this.q));
        int ceil2 = (int) Math.ceil(a(this.f1628j, this.f1626h, this.q));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f1631m;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f1632n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f1631m;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f1622d.getColor() == colorForState) {
            return false;
        }
        this.f1622d.setColor(colorForState);
        this.f1632n = true;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f1622d.setAlpha(i2);
        this.f1623e.setAlpha(i2);
        this.f1624f.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1622d.setColorFilter(colorFilter);
    }
}
