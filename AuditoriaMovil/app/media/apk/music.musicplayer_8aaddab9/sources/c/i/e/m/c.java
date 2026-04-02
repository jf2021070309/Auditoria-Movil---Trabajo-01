package c.i.e.m;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
public class c extends Drawable implements Drawable.Callback, b, a {
    public static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    public int f2057b;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f2058c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2059d;

    /* renamed from: e  reason: collision with root package name */
    public e f2060e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2061f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f2062g;

    public c(Drawable drawable) {
        this.f2060e = new e(this.f2060e);
        a(drawable);
    }

    public c(e eVar, Resources resources) {
        Drawable.ConstantState constantState;
        this.f2060e = eVar;
        if (eVar == null || (constantState = eVar.f2064b) == null) {
            return;
        }
        a(constantState.newDrawable(resources));
    }

    @Override // c.i.e.m.b
    public final void a(Drawable drawable) {
        Drawable drawable2 = this.f2062g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2062g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            e eVar = this.f2060e;
            if (eVar != null) {
                eVar.f2064b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // c.i.e.m.b
    public final Drawable b() {
        return this.f2062g;
    }

    public boolean c() {
        return true;
    }

    public final boolean d(int[] iArr) {
        if (c()) {
            e eVar = this.f2060e;
            ColorStateList colorStateList = eVar.f2065c;
            PorterDuff.Mode mode = eVar.f2066d;
            if (colorStateList == null || mode == null) {
                this.f2059d = false;
                clearColorFilter();
            } else {
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (!this.f2059d || colorForState != this.f2057b || mode != this.f2058c) {
                    setColorFilter(colorForState, mode);
                    this.f2057b = colorForState;
                    this.f2058c = mode;
                    this.f2059d = true;
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f2062g.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        e eVar = this.f2060e;
        return changingConfigurations | (eVar != null ? eVar.getChangingConfigurations() : 0) | this.f2062g.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        e eVar = this.f2060e;
        if (eVar != null) {
            if (eVar.f2064b != null) {
                eVar.a = getChangingConfigurations();
                return this.f2060e;
            }
            return null;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f2062g.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f2062g.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f2062g.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        return c.i.a.y(this.f2062g);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f2062g.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f2062g.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f2062g.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f2062g.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f2062g.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f2062g.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f2062g.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        e eVar;
        ColorStateList colorStateList = (!c() || (eVar = this.f2060e) == null) ? null : eVar.f2065c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f2062g.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f2062g.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f2061f && super.mutate() == this) {
            this.f2060e = new e(this.f2060e);
            Drawable drawable = this.f2062g;
            if (drawable != null) {
                drawable.mutate();
            }
            e eVar = this.f2060e;
            if (eVar != null) {
                Drawable drawable2 = this.f2062g;
                eVar.f2064b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f2061f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2062g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i2) {
        return c.i.a.d0(this.f2062g, i2);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i2) {
        return this.f2062g.setLevel(i2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f2062g.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        this.f2062g.setAutoMirrored(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i2) {
        this.f2062g.setChangingConfigurations(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2062g.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f2062g.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f2062g.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return d(iArr) || this.f2062g.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, c.i.e.m.a
    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    @Override // android.graphics.drawable.Drawable, c.i.e.m.a
    public void setTintList(ColorStateList colorStateList) {
        this.f2060e.f2065c = colorStateList;
        d(getState());
    }

    @Override // android.graphics.drawable.Drawable, c.i.e.m.a
    public void setTintMode(PorterDuff.Mode mode) {
        this.f2060e.f2066d = mode;
        d(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f2062g.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
