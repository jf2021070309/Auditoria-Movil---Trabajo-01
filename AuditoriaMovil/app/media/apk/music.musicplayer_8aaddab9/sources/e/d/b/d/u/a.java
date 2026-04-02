package e.d.b.d.u;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import e.d.b.d.w.g;
import e.d.b.d.w.j;
import e.d.b.d.w.n;
/* loaded from: classes2.dex */
public class a extends Drawable implements n, c.i.e.m.a {
    public b a;

    /* loaded from: classes2.dex */
    public static final class b extends Drawable.ConstantState {
        public g a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f6575b;

        public b(b bVar) {
            this.a = (g) bVar.a.f6591c.newDrawable();
            this.f6575b = bVar.f6575b;
        }

        public b(g gVar) {
            this.a = gVar;
            this.f6575b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new a(new b(this), null);
        }
    }

    public a(b bVar, C0144a c0144a) {
        this.a = bVar;
    }

    public a(j jVar) {
        this.a = new b(new g(jVar));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.a;
        if (bVar.f6575b) {
            bVar.a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.a.a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.a = new b(this.a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.a.a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.a.a.setState(iArr)) {
            onStateChange = true;
        }
        boolean b2 = e.d.b.d.u.b.b(iArr);
        b bVar = this.a;
        if (bVar.f6575b != b2) {
            bVar.f6575b = b2;
            return true;
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.a.a.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.a.setColorFilter(colorFilter);
    }

    @Override // e.d.b.d.w.n
    public void setShapeAppearanceModel(j jVar) {
        g gVar = this.a.a;
        gVar.f6591c.a = jVar;
        gVar.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, c.i.e.m.a
    public void setTint(int i2) {
        this.a.a.setTint(i2);
    }

    @Override // android.graphics.drawable.Drawable, c.i.e.m.a
    public void setTintList(ColorStateList colorStateList) {
        this.a.a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, c.i.e.m.a
    public void setTintMode(PorterDuff.Mode mode) {
        this.a.a.setTintMode(mode);
    }
}
