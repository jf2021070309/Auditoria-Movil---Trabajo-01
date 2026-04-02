package e.c.a.m.u.g;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import c.t.m;
import e.c.a.m.q;
import e.c.a.m.u.g.g;
/* loaded from: classes.dex */
public class c extends Drawable implements g.b, Animatable {
    public final a a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5913b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5914c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5915d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5916e;

    /* renamed from: f  reason: collision with root package name */
    public int f5917f;

    /* renamed from: g  reason: collision with root package name */
    public int f5918g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f5919h;

    /* renamed from: i  reason: collision with root package name */
    public Paint f5920i;

    /* renamed from: j  reason: collision with root package name */
    public Rect f5921j;

    /* loaded from: classes.dex */
    public static final class a extends Drawable.ConstantState {
        public final g a;

        public a(g gVar) {
            this.a = gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new c(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new c(this);
        }
    }

    public c(Context context, e.c.a.l.a aVar, q<Bitmap> qVar, int i2, int i3, Bitmap bitmap) {
        a aVar2 = new a(new g(e.c.a.b.b(context), aVar, i2, i3, qVar, bitmap));
        this.f5916e = true;
        this.f5918g = -1;
        this.a = aVar2;
    }

    public c(a aVar) {
        this.f5916e = true;
        this.f5918g = -1;
        this.a = aVar;
    }

    @Override // e.c.a.m.u.g.g.b
    public void a() {
        g gVar;
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        g.a aVar = this.a.a.f5930i;
        if ((aVar != null ? aVar.f5937e : -1) == gVar.a.c() - 1) {
            this.f5917f++;
        }
        int i2 = this.f5918g;
        if (i2 == -1 || this.f5917f < i2) {
            return;
        }
        stop();
    }

    public Bitmap b() {
        return this.a.a.f5933l;
    }

    public final Paint c() {
        if (this.f5920i == null) {
            this.f5920i = new Paint(2);
        }
        return this.f5920i;
    }

    public final void d() {
        m.b(!this.f5915d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.a.a.a.c() == 1) {
            invalidateSelf();
        } else if (this.f5913b) {
        } else {
            this.f5913b = true;
            g gVar = this.a.a;
            if (gVar.f5931j) {
                throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
            }
            if (gVar.f5924c.contains(this)) {
                throw new IllegalStateException("Cannot subscribe twice in a row");
            }
            boolean isEmpty = gVar.f5924c.isEmpty();
            gVar.f5924c.add(this);
            if (isEmpty && !gVar.f5927f) {
                gVar.f5927f = true;
                gVar.f5931j = false;
                gVar.a();
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f5915d) {
            return;
        }
        if (this.f5919h) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f5921j == null) {
                this.f5921j = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f5921j);
            this.f5919h = false;
        }
        g gVar = this.a.a;
        g.a aVar = gVar.f5930i;
        Bitmap bitmap = aVar != null ? aVar.f5939g : gVar.f5933l;
        if (this.f5921j == null) {
            this.f5921j = new Rect();
        }
        canvas.drawBitmap(bitmap, (Rect) null, this.f5921j, c());
    }

    public final void e() {
        this.f5913b = false;
        g gVar = this.a.a;
        gVar.f5924c.remove(this);
        if (gVar.f5924c.isEmpty()) {
            gVar.f5927f = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.a.a.q;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.a.a.p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f5913b;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f5919h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        c().setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        c().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        m.b(!this.f5915d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f5916e = z;
        if (!z) {
            e();
        } else if (this.f5914c) {
            d();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f5914c = true;
        this.f5917f = 0;
        if (this.f5916e) {
            d();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f5914c = false;
        e();
    }
}
