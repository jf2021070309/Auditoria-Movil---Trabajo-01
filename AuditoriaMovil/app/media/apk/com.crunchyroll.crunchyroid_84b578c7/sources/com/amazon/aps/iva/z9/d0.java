package com.amazon.aps.iva.z9;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Choreographer;
import android.view.View;
import android.widget.ImageView;
import com.amazon.aps.iva.e4.t0;
import com.amazon.aps.iva.ia.e;
import com.amazon.aps.iva.la.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
/* compiled from: LottieDrawable.java */
/* loaded from: classes.dex */
public final class d0 extends Drawable implements Drawable.Callback, Animatable {
    public Rect A;
    public RectF B;
    public com.amazon.aps.iva.aa.a C;
    public Rect D;
    public Rect E;
    public RectF F;
    public RectF G;
    public Matrix H;
    public Matrix I;
    public boolean J;
    public h b;
    public final com.amazon.aps.iva.ma.d c;
    public boolean d;
    public boolean e;
    public boolean f;
    public c g;
    public final ArrayList<b> h;
    public com.amazon.aps.iva.ea.b i;
    public String j;
    public com.amazon.aps.iva.ea.a k;
    public Map<String, Typeface> l;
    public String m;
    public boolean n;
    public boolean o;
    public boolean p;
    public com.amazon.aps.iva.ia.c q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public n0 v;
    public boolean w;
    public final Matrix x;
    public Bitmap y;
    public Canvas z;

    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f;
            d0 d0Var = d0.this;
            com.amazon.aps.iva.ia.c cVar = d0Var.q;
            if (cVar != null) {
                com.amazon.aps.iva.ma.d dVar = d0Var.c;
                h hVar = dVar.m;
                if (hVar == null) {
                    f = 0.0f;
                } else {
                    float f2 = dVar.i;
                    float f3 = hVar.k;
                    f = (f2 - f3) / (hVar.l - f3);
                }
                cVar.t(f);
            }
        }
    }

    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public interface b {
        void run();
    }

    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public enum c {
        NONE,
        PLAY,
        RESUME
    }

    public d0() {
        com.amazon.aps.iva.ma.d dVar = new com.amazon.aps.iva.ma.d();
        this.c = dVar;
        this.d = true;
        this.e = false;
        this.f = false;
        this.g = c.NONE;
        this.h = new ArrayList<>();
        a aVar = new a();
        this.o = false;
        this.p = true;
        this.r = 255;
        this.v = n0.AUTOMATIC;
        this.w = false;
        this.x = new Matrix();
        this.J = false;
        dVar.addUpdateListener(aVar);
    }

    public static void f(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public final <T> void a(final com.amazon.aps.iva.fa.e eVar, final T t, final com.amazon.aps.iva.na.c<T> cVar) {
        float f;
        com.amazon.aps.iva.ia.c cVar2 = this.q;
        if (cVar2 == null) {
            this.h.add(new b() { // from class: com.amazon.aps.iva.z9.s
                @Override // com.amazon.aps.iva.z9.d0.b
                public final void run() {
                    d0.this.a(eVar, t, cVar);
                }
            });
            return;
        }
        boolean z = true;
        if (eVar == com.amazon.aps.iva.fa.e.c) {
            cVar2.i(cVar, t);
        } else {
            com.amazon.aps.iva.fa.f fVar = eVar.b;
            if (fVar != null) {
                fVar.i(cVar, t);
            } else {
                ArrayList arrayList = new ArrayList();
                this.q.d(eVar, 0, arrayList, new com.amazon.aps.iva.fa.e(new String[0]));
                for (int i = 0; i < arrayList.size(); i++) {
                    ((com.amazon.aps.iva.fa.e) arrayList.get(i)).b.i(cVar, t);
                }
                z = true ^ arrayList.isEmpty();
            }
        }
        if (z) {
            invalidateSelf();
            if (t == h0.E) {
                com.amazon.aps.iva.ma.d dVar = this.c;
                h hVar = dVar.m;
                if (hVar == null) {
                    f = 0.0f;
                } else {
                    float f2 = dVar.i;
                    float f3 = hVar.k;
                    f = (f2 - f3) / (hVar.l - f3);
                }
                x(f);
            }
        }
    }

    public final boolean b() {
        if (!this.d && !this.e) {
            return false;
        }
        return true;
    }

    public final void c() {
        h hVar = this.b;
        if (hVar == null) {
            return;
        }
        c.a aVar = com.amazon.aps.iva.ka.v.a;
        Rect rect = hVar.j;
        com.amazon.aps.iva.ia.c cVar = new com.amazon.aps.iva.ia.c(this, new com.amazon.aps.iva.ia.e(Collections.emptyList(), hVar, "__container", -1L, e.a.PRE_COMP, -1L, null, Collections.emptyList(), new com.amazon.aps.iva.ga.k(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, Collections.emptyList(), e.b.NONE, null, false, null, null), hVar.i, hVar);
        this.q = cVar;
        if (this.t) {
            cVar.s(true);
        }
        this.q.H = this.p;
    }

    public final void d() {
        com.amazon.aps.iva.ma.d dVar = this.c;
        if (dVar.n) {
            dVar.cancel();
            if (!isVisible()) {
                this.g = c.NONE;
            }
        }
        this.b = null;
        this.q = null;
        this.i = null;
        dVar.m = null;
        dVar.k = -2.14748365E9f;
        dVar.l = 2.14748365E9f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f) {
            try {
                if (this.w) {
                    k(canvas, this.q);
                } else {
                    g(canvas);
                }
            } catch (Throwable unused) {
                com.amazon.aps.iva.ma.c.a.getClass();
            }
        } else if (this.w) {
            k(canvas, this.q);
        } else {
            g(canvas);
        }
        this.J = false;
        com.amazon.aps.iva.e.z.s();
    }

    public final void e() {
        h hVar = this.b;
        if (hVar == null) {
            return;
        }
        this.w = this.v.useSoftwareRendering(Build.VERSION.SDK_INT, hVar.n, hVar.o);
    }

    public final void g(Canvas canvas) {
        com.amazon.aps.iva.ia.c cVar = this.q;
        h hVar = this.b;
        if (cVar != null && hVar != null) {
            Matrix matrix = this.x;
            matrix.reset();
            Rect bounds = getBounds();
            if (!bounds.isEmpty()) {
                matrix.preScale(bounds.width() / hVar.j.width(), bounds.height() / hVar.j.height());
                matrix.preTranslate(bounds.left, bounds.top);
            }
            cVar.h(canvas, matrix, this.r);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.r;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        h hVar = this.b;
        if (hVar == null) {
            return -1;
        }
        return hVar.j.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        h hVar = this.b;
        if (hVar == null) {
            return -1;
        }
        return hVar.j.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final com.amazon.aps.iva.ea.a h() {
        if (getCallback() == null) {
            return null;
        }
        if (this.k == null) {
            com.amazon.aps.iva.ea.a aVar = new com.amazon.aps.iva.ea.a(getCallback());
            this.k = aVar;
            String str = this.m;
            if (str != null) {
                aVar.e = str;
            }
        }
        return this.k;
    }

    public final void i() {
        this.h.clear();
        com.amazon.aps.iva.ma.d dVar = this.c;
        dVar.f(true);
        Iterator it = dVar.d.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(dVar);
        }
        if (!isVisible()) {
            this.g = c.NONE;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.J) {
            return;
        }
        this.J = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        com.amazon.aps.iva.ma.d dVar = this.c;
        if (dVar == null) {
            return false;
        }
        return dVar.n;
    }

    public final void j() {
        float d;
        float c2;
        if (this.q == null) {
            this.h.add(new b() { // from class: com.amazon.aps.iva.z9.c0
                @Override // com.amazon.aps.iva.z9.d0.b
                public final void run() {
                    d0.this.j();
                }
            });
            return;
        }
        e();
        boolean b2 = b();
        com.amazon.aps.iva.ma.d dVar = this.c;
        if (b2 || dVar.getRepeatCount() == 0) {
            if (isVisible()) {
                dVar.n = true;
                boolean e = dVar.e();
                Iterator it = dVar.c.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationStart(dVar, e);
                }
                if (dVar.e()) {
                    d = dVar.c();
                } else {
                    d = dVar.d();
                }
                dVar.g((int) d);
                dVar.g = 0L;
                dVar.j = 0;
                if (dVar.n) {
                    dVar.f(false);
                    Choreographer.getInstance().postFrameCallback(dVar);
                }
                this.g = c.NONE;
            } else {
                this.g = c.PLAY;
            }
        }
        if (!b()) {
            if (dVar.e < 0.0f) {
                c2 = dVar.d();
            } else {
                c2 = dVar.c();
            }
            n((int) c2);
            dVar.f(true);
            dVar.a(dVar.e());
            if (!isVisible()) {
                this.g = c.NONE;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(android.graphics.Canvas r10, com.amazon.aps.iva.ia.c r11) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.z9.d0.k(android.graphics.Canvas, com.amazon.aps.iva.ia.c):void");
    }

    public final void l() {
        float c2;
        if (this.q == null) {
            this.h.add(new b() { // from class: com.amazon.aps.iva.z9.x
                @Override // com.amazon.aps.iva.z9.d0.b
                public final void run() {
                    d0.this.l();
                }
            });
            return;
        }
        e();
        boolean b2 = b();
        com.amazon.aps.iva.ma.d dVar = this.c;
        if (b2 || dVar.getRepeatCount() == 0) {
            if (isVisible()) {
                dVar.n = true;
                dVar.f(false);
                Choreographer.getInstance().postFrameCallback(dVar);
                dVar.g = 0L;
                if (dVar.e() && dVar.i == dVar.d()) {
                    dVar.g(dVar.c());
                } else if (!dVar.e() && dVar.i == dVar.c()) {
                    dVar.g(dVar.d());
                }
                Iterator it = dVar.d.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(dVar);
                }
                this.g = c.NONE;
            } else {
                this.g = c.RESUME;
            }
        }
        if (!b()) {
            if (dVar.e < 0.0f) {
                c2 = dVar.d();
            } else {
                c2 = dVar.c();
            }
            n((int) c2);
            dVar.f(true);
            dVar.a(dVar.e());
            if (!isVisible()) {
                this.g = c.NONE;
            }
        }
    }

    public final boolean m(h hVar) {
        boolean z = false;
        if (this.b == hVar) {
            return false;
        }
        this.J = true;
        d();
        this.b = hVar;
        c();
        com.amazon.aps.iva.ma.d dVar = this.c;
        if (dVar.m == null) {
            z = true;
        }
        dVar.m = hVar;
        if (z) {
            dVar.h(Math.max(dVar.k, hVar.k), Math.min(dVar.l, hVar.l));
        } else {
            dVar.h((int) hVar.k, (int) hVar.l);
        }
        float f = dVar.i;
        dVar.i = 0.0f;
        dVar.h = 0.0f;
        dVar.g((int) f);
        dVar.b();
        x(dVar.getAnimatedFraction());
        ArrayList<b> arrayList = this.h;
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar != null) {
                bVar.run();
            }
            it.remove();
        }
        arrayList.clear();
        hVar.a.a = this.s;
        e();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public final void n(int i) {
        if (this.b == null) {
            this.h.add(new u(this, i, 1));
        } else {
            this.c.g(i);
        }
    }

    public final void o(final int i) {
        if (this.b == null) {
            this.h.add(new b() { // from class: com.amazon.aps.iva.z9.w
                @Override // com.amazon.aps.iva.z9.d0.b
                public final void run() {
                    d0.this.o(i);
                }
            });
            return;
        }
        com.amazon.aps.iva.ma.d dVar = this.c;
        dVar.h(dVar.k, i + 0.99f);
    }

    public final void p(final String str) {
        h hVar = this.b;
        if (hVar == null) {
            this.h.add(new b() { // from class: com.amazon.aps.iva.z9.y
                @Override // com.amazon.aps.iva.z9.d0.b
                public final void run() {
                    d0.this.p(str);
                }
            });
            return;
        }
        com.amazon.aps.iva.fa.h c2 = hVar.c(str);
        if (c2 != null) {
            o((int) (c2.b + c2.c));
            return;
        }
        throw new IllegalArgumentException(defpackage.e.e("Cannot find marker with name ", str, "."));
    }

    public final void q(final float f) {
        h hVar = this.b;
        if (hVar == null) {
            this.h.add(new b() { // from class: com.amazon.aps.iva.z9.b0
                @Override // com.amazon.aps.iva.z9.d0.b
                public final void run() {
                    d0.this.q(f);
                }
            });
            return;
        }
        float f2 = hVar.k;
        float f3 = hVar.l;
        PointF pointF = com.amazon.aps.iva.ma.f.a;
        float a2 = t0.a(f3, f2, f, f2);
        com.amazon.aps.iva.ma.d dVar = this.c;
        dVar.h(dVar.k, a2);
    }

    public final void r(final int i, final int i2) {
        if (this.b == null) {
            this.h.add(new b() { // from class: com.amazon.aps.iva.z9.t
                @Override // com.amazon.aps.iva.z9.d0.b
                public final void run() {
                    d0.this.r(i, i2);
                }
            });
            return;
        }
        this.c.h(i, i2 + 0.99f);
    }

    public final void s(final String str) {
        h hVar = this.b;
        if (hVar == null) {
            this.h.add(new b() { // from class: com.amazon.aps.iva.z9.r
                @Override // com.amazon.aps.iva.z9.d0.b
                public final void run() {
                    d0.this.s(str);
                }
            });
            return;
        }
        com.amazon.aps.iva.fa.h c2 = hVar.c(str);
        if (c2 != null) {
            int i = (int) c2.b;
            r(i, ((int) c2.c) + i);
            return;
        }
        throw new IllegalArgumentException(defpackage.e.e("Cannot find marker with name ", str, "."));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.r = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        com.amazon.aps.iva.ma.c.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean z3 = !isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            c cVar = this.g;
            if (cVar == c.PLAY) {
                j();
            } else if (cVar == c.RESUME) {
                l();
            }
        } else if (this.c.n) {
            i();
            this.g = c.RESUME;
        } else if (!z3) {
            this.g = c.NONE;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        j();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.h.clear();
        com.amazon.aps.iva.ma.d dVar = this.c;
        dVar.f(true);
        dVar.a(dVar.e());
        if (!isVisible()) {
            this.g = c.NONE;
        }
    }

    public final void t(final String str, final String str2, final boolean z) {
        float f;
        h hVar = this.b;
        if (hVar == null) {
            this.h.add(new b() { // from class: com.amazon.aps.iva.z9.z
                @Override // com.amazon.aps.iva.z9.d0.b
                public final void run() {
                    d0.this.t(str, str2, z);
                }
            });
            return;
        }
        com.amazon.aps.iva.fa.h c2 = hVar.c(str);
        if (c2 != null) {
            int i = (int) c2.b;
            com.amazon.aps.iva.fa.h c3 = this.b.c(str2);
            if (c3 != null) {
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                r(i, (int) (c3.b + f));
                return;
            }
            throw new IllegalArgumentException(defpackage.e.e("Cannot find marker with name ", str2, "."));
        }
        throw new IllegalArgumentException(defpackage.e.e("Cannot find marker with name ", str, "."));
    }

    public final void u(int i) {
        if (this.b == null) {
            this.h.add(new u(this, i, 0));
            return;
        }
        com.amazon.aps.iva.ma.d dVar = this.c;
        dVar.h(i, (int) dVar.l);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public final void v(final String str) {
        h hVar = this.b;
        if (hVar == null) {
            this.h.add(new b() { // from class: com.amazon.aps.iva.z9.a0
                @Override // com.amazon.aps.iva.z9.d0.b
                public final void run() {
                    d0.this.v(str);
                }
            });
            return;
        }
        com.amazon.aps.iva.fa.h c2 = hVar.c(str);
        if (c2 != null) {
            u((int) c2.b);
            return;
        }
        throw new IllegalArgumentException(defpackage.e.e("Cannot find marker with name ", str, "."));
    }

    public final void w(final float f) {
        h hVar = this.b;
        if (hVar == null) {
            this.h.add(new b() { // from class: com.amazon.aps.iva.z9.v
                @Override // com.amazon.aps.iva.z9.d0.b
                public final void run() {
                    d0.this.w(f);
                }
            });
            return;
        }
        float f2 = hVar.k;
        float f3 = hVar.l;
        PointF pointF = com.amazon.aps.iva.ma.f.a;
        u((int) t0.a(f3, f2, f, f2));
    }

    public final void x(final float f) {
        h hVar = this.b;
        if (hVar == null) {
            this.h.add(new b() { // from class: com.amazon.aps.iva.z9.q
                @Override // com.amazon.aps.iva.z9.d0.b
                public final void run() {
                    d0.this.x(f);
                }
            });
            return;
        }
        float f2 = hVar.k;
        float f3 = hVar.l;
        PointF pointF = com.amazon.aps.iva.ma.f.a;
        this.c.g(t0.a(f3, f2, f, f2));
        com.amazon.aps.iva.e.z.s();
    }
}
