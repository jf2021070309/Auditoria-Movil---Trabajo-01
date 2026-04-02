package com.amazon.aps.iva.yc;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.amazon.aps.iva.yc.f;
import java.util.ArrayList;
/* compiled from: GifDrawable.java */
/* loaded from: classes.dex */
public final class c extends Drawable implements f.b, Animatable {
    public final a b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public final int h;
    public boolean i;
    public Paint j;
    public Rect k;

    /* compiled from: GifDrawable.java */
    /* loaded from: classes.dex */
    public static final class a extends Drawable.ConstantState {
        public final f a;

        public a(f fVar) {
            this.a = fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new c(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new c(this);
        }
    }

    public c() {
        throw null;
    }

    public c(a aVar) {
        this.f = true;
        this.h = -1;
        defpackage.i.l(aVar);
        this.b = aVar;
    }

    @Override // com.amazon.aps.iva.yc.f.b
    public final void a() {
        f fVar;
        int i;
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
        f.a aVar = this.b.a.i;
        if (aVar != null) {
            i = aVar.f;
        } else {
            i = -1;
        }
        if (i == fVar.a.c() - 1) {
            this.g++;
        }
        int i2 = this.h;
        if (i2 != -1 && this.g >= i2) {
            stop();
        }
    }

    public final void b() {
        defpackage.i.k(!this.e, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        a aVar = this.b;
        if (aVar.a.a.c() == 1) {
            invalidateSelf();
        } else if (!this.c) {
            this.c = true;
            f fVar = aVar.a;
            if (!fVar.j) {
                ArrayList arrayList = fVar.c;
                if (!arrayList.contains(this)) {
                    boolean isEmpty = arrayList.isEmpty();
                    arrayList.add(this);
                    if (isEmpty && !fVar.f) {
                        fVar.f = true;
                        fVar.j = false;
                        fVar.a();
                    }
                    invalidateSelf();
                    return;
                }
                throw new IllegalStateException("Cannot subscribe twice in a row");
            }
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        if (this.e) {
            return;
        }
        if (this.i) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.k == null) {
                this.k = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.k);
            this.i = false;
        }
        f fVar = this.b.a;
        f.a aVar = fVar.i;
        if (aVar != null) {
            bitmap = aVar.h;
        } else {
            bitmap = fVar.l;
        }
        if (this.k == null) {
            this.k = new Rect();
        }
        Rect rect = this.k;
        if (this.j == null) {
            this.j = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.j);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.b.a.q;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.b.a.p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.i = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.j == null) {
            this.j = new Paint(2);
        }
        this.j.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.j == null) {
            this.j = new Paint(2);
        }
        this.j.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        defpackage.i.k(!this.e, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f = z;
        if (!z) {
            this.c = false;
            f fVar = this.b.a;
            ArrayList arrayList = fVar.c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                fVar.f = false;
            }
        } else if (this.d) {
            b();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.d = true;
        this.g = 0;
        if (this.f) {
            b();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.d = false;
        this.c = false;
        f fVar = this.b.a;
        ArrayList arrayList = fVar.c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            fVar.f = false;
        }
    }
}
