package com.amazon.aps.iva.ma;

import android.animation.Animator;
import android.graphics.PointF;
import android.view.Choreographer;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.z9.h;
import java.util.Iterator;
/* compiled from: LottieValueAnimator.java */
/* loaded from: classes.dex */
public final class d extends a implements Choreographer.FrameCallback {
    public h m;
    public float e = 1.0f;
    public boolean f = false;
    public long g = 0;
    public float h = 0.0f;
    public float i = 0.0f;
    public int j = 0;
    public float k = -2.14748365E9f;
    public float l = 2.14748365E9f;
    public boolean n = false;
    public boolean o = false;

    public final float c() {
        h hVar = this.m;
        if (hVar == null) {
            return 0.0f;
        }
        float f = this.l;
        if (f == 2.14748365E9f) {
            return hVar.l;
        }
        return f;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        a(e());
        f(true);
    }

    public final float d() {
        h hVar = this.m;
        if (hVar == null) {
            return 0.0f;
        }
        float f = this.k;
        if (f == -2.14748365E9f) {
            return hVar.k;
        }
        return f;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        float d;
        float c;
        boolean z = false;
        if (this.n) {
            f(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        h hVar = this.m;
        if (hVar != null && this.n) {
            long j2 = this.g;
            long j3 = 0;
            if (j2 != 0) {
                j3 = j - j2;
            }
            float abs = ((float) j3) / ((1.0E9f / hVar.m) / Math.abs(this.e));
            float f = this.h;
            if (e()) {
                abs = -abs;
            }
            float f2 = f + abs;
            float d2 = d();
            float c2 = c();
            PointF pointF = f.a;
            if (f2 >= d2 && f2 <= c2) {
                z = true;
            }
            boolean z2 = !z;
            float f3 = this.h;
            float b = f.b(f2, d(), c());
            this.h = b;
            if (this.o) {
                b = (float) Math.floor(b);
            }
            this.i = b;
            this.g = j;
            if (!this.o || this.h != f3) {
                b();
            }
            if (z2) {
                if (getRepeatCount() != -1 && this.j >= getRepeatCount()) {
                    if (this.e < 0.0f) {
                        c = d();
                    } else {
                        c = c();
                    }
                    this.h = c;
                    this.i = c;
                    f(true);
                    a(e());
                } else {
                    Iterator it = this.c.iterator();
                    while (it.hasNext()) {
                        ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
                    }
                    this.j++;
                    if (getRepeatMode() == 2) {
                        this.f = !this.f;
                        this.e = -this.e;
                    } else {
                        if (e()) {
                            d = c();
                        } else {
                            d = d();
                        }
                        this.h = d;
                        this.i = d;
                    }
                    this.g = j;
                }
            }
            if (this.m != null) {
                float f4 = this.i;
                if (f4 < this.k || f4 > this.l) {
                    throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.k), Float.valueOf(this.l), Float.valueOf(this.i)));
                }
            }
            z.s();
        }
    }

    public final boolean e() {
        if (this.e < 0.0f) {
            return true;
        }
        return false;
    }

    public final void f(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.n = false;
        }
    }

    public final void g(float f) {
        if (this.h == f) {
            return;
        }
        float b = f.b(f, d(), c());
        this.h = b;
        if (this.o) {
            b = (float) Math.floor(b);
        }
        this.i = b;
        this.g = 0L;
        b();
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float d;
        float c;
        float d2;
        if (this.m == null) {
            return 0.0f;
        }
        if (e()) {
            d = c() - this.i;
            c = c();
            d2 = d();
        } else {
            d = this.i - d();
            c = c();
            d2 = d();
        }
        return d / (c - d2);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        float f;
        h hVar = this.m;
        if (hVar == null) {
            f = 0.0f;
        } else {
            float f2 = this.i;
            float f3 = hVar.k;
            f = (f2 - f3) / (hVar.l - f3);
        }
        return Float.valueOf(f);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        h hVar = this.m;
        if (hVar == null) {
            return 0L;
        }
        return hVar.b();
    }

    public final void h(float f, float f2) {
        float f3;
        float f4;
        if (f <= f2) {
            h hVar = this.m;
            if (hVar == null) {
                f3 = -3.4028235E38f;
            } else {
                f3 = hVar.k;
            }
            if (hVar == null) {
                f4 = Float.MAX_VALUE;
            } else {
                f4 = hVar.l;
            }
            float b = f.b(f, f3, f4);
            float b2 = f.b(f2, f3, f4);
            if (b != this.k || b2 != this.l) {
                this.k = b;
                this.l = b2;
                g((int) f.b(this.i, b, b2));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.n;
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.f) {
            this.f = false;
            this.e = -this.e;
        }
    }
}
