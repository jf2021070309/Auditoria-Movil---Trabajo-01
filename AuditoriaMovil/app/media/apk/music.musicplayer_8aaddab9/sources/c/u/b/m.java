package c.u.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import c.i.k.d0;
import com.google.android.gms.common.ConnectionResult;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class m extends RecyclerView.l implements RecyclerView.q {
    public static final int[] a = {16842919};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f2663b = new int[0];
    public final ValueAnimator B;
    public int C;
    public final Runnable D;
    public final RecyclerView.r E;

    /* renamed from: c  reason: collision with root package name */
    public final int f2664c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2665d;

    /* renamed from: e  reason: collision with root package name */
    public final StateListDrawable f2666e;

    /* renamed from: f  reason: collision with root package name */
    public final Drawable f2667f;

    /* renamed from: g  reason: collision with root package name */
    public final int f2668g;

    /* renamed from: h  reason: collision with root package name */
    public final int f2669h;

    /* renamed from: i  reason: collision with root package name */
    public final StateListDrawable f2670i;

    /* renamed from: j  reason: collision with root package name */
    public final Drawable f2671j;

    /* renamed from: k  reason: collision with root package name */
    public final int f2672k;

    /* renamed from: l  reason: collision with root package name */
    public final int f2673l;

    /* renamed from: m  reason: collision with root package name */
    public int f2674m;

    /* renamed from: n  reason: collision with root package name */
    public int f2675n;
    public float o;
    public int p;
    public int q;
    public float r;
    public RecyclerView u;
    public int s = 0;
    public int t = 0;
    public boolean v = false;
    public boolean w = false;
    public int x = 0;
    public int y = 0;
    public final int[] z = new int[2];
    public final int[] A = new int[2];

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m mVar = m.this;
            int i2 = mVar.C;
            if (i2 == 1) {
                mVar.B.cancel();
            } else if (i2 != 2) {
                return;
            }
            mVar.C = 3;
            ValueAnimator valueAnimator = mVar.B;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
            mVar.B.setDuration(500);
            mVar.B.start();
        }
    }

    /* loaded from: classes.dex */
    public class b extends RecyclerView.r {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void b(RecyclerView recyclerView, int i2, int i3) {
            m mVar = m.this;
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int computeVerticalScrollRange = mVar.u.computeVerticalScrollRange();
            int i4 = mVar.t;
            mVar.v = computeVerticalScrollRange - i4 > 0 && i4 >= mVar.f2664c;
            int computeHorizontalScrollRange = mVar.u.computeHorizontalScrollRange();
            int i5 = mVar.s;
            boolean z = computeHorizontalScrollRange - i5 > 0 && i5 >= mVar.f2664c;
            mVar.w = z;
            boolean z2 = mVar.v;
            if (!z2 && !z) {
                if (mVar.x != 0) {
                    mVar.m(0);
                    return;
                }
                return;
            }
            if (z2) {
                float f2 = i4;
                mVar.f2675n = (int) ((((f2 / 2.0f) + computeVerticalScrollOffset) * f2) / computeVerticalScrollRange);
                mVar.f2674m = Math.min(i4, (i4 * i4) / computeVerticalScrollRange);
            }
            if (mVar.w) {
                float f3 = computeHorizontalScrollOffset;
                float f4 = i5;
                mVar.q = (int) ((((f4 / 2.0f) + f3) * f4) / computeHorizontalScrollRange);
                mVar.p = Math.min(i5, (i5 * i5) / computeHorizontalScrollRange);
            }
            int i6 = mVar.x;
            if (i6 == 0 || i6 == 1) {
                mVar.m(1);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        public boolean a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.a) {
                this.a = false;
            } else if (((Float) m.this.B.getAnimatedValue()).floatValue() == 0.0f) {
                m mVar = m.this;
                mVar.C = 0;
                mVar.m(0);
            } else {
                m mVar2 = m.this;
                mVar2.C = 2;
                mVar2.u.invalidate();
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            m.this.f2666e.setAlpha(floatValue);
            m.this.f2667f.setAlpha(floatValue);
            m.this.u.invalidate();
        }
    }

    public m(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.B = ofFloat;
        this.C = 0;
        this.D = new a();
        b bVar = new b();
        this.E = bVar;
        this.f2666e = stateListDrawable;
        this.f2667f = drawable;
        this.f2670i = stateListDrawable2;
        this.f2671j = drawable2;
        this.f2668g = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.f2669h = Math.max(i2, drawable.getIntrinsicWidth());
        this.f2672k = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.f2673l = Math.max(i2, drawable2.getIntrinsicWidth());
        this.f2664c = i3;
        this.f2665d = i4;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        RecyclerView recyclerView2 = this.u;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.i0(this);
            RecyclerView recyclerView3 = this.u;
            recyclerView3.x.remove(this);
            if (recyclerView3.y == this) {
                recyclerView3.y = null;
            }
            List<RecyclerView.r> list = this.u.v0;
            if (list != null) {
                list.remove(bVar);
            }
            i();
        }
        this.u = recyclerView;
        recyclerView.j(this);
        this.u.x.add(this);
        this.u.k(bVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.x == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean k2 = k(motionEvent.getX(), motionEvent.getY());
            boolean j2 = j(motionEvent.getX(), motionEvent.getY());
            if (k2 || j2) {
                if (j2) {
                    this.y = 1;
                    this.r = (int) motionEvent.getX();
                } else if (k2) {
                    this.y = 2;
                    this.o = (int) motionEvent.getY();
                }
                m(2);
            }
        } else if (motionEvent.getAction() == 1 && this.x == 2) {
            this.o = 0.0f;
            this.r = 0.0f;
            m(1);
            this.y = 0;
        } else if (motionEvent.getAction() == 2 && this.x == 2) {
            n();
            if (this.y == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.A;
                int i2 = this.f2665d;
                iArr[0] = i2;
                iArr[1] = this.s - i2;
                float max = Math.max(iArr[0], Math.min(iArr[1], x));
                if (Math.abs(this.q - max) >= 2.0f) {
                    int l2 = l(this.r, max, iArr, this.u.computeHorizontalScrollRange(), this.u.computeHorizontalScrollOffset(), this.s);
                    if (l2 != 0) {
                        this.u.scrollBy(l2, 0);
                    }
                    this.r = max;
                }
            }
            if (this.y == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.z;
                int i3 = this.f2665d;
                iArr2[0] = i3;
                iArr2[1] = this.t - i3;
                float max2 = Math.max(iArr2[0], Math.min(iArr2[1], y));
                if (Math.abs(this.f2675n - max2) < 2.0f) {
                    return;
                }
                int l3 = l(this.o, max2, iArr2, this.u.computeVerticalScrollRange(), this.u.computeVerticalScrollOffset(), this.t);
                if (l3 != 0) {
                    this.u.scrollBy(0, l3);
                }
                this.o = max2;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i2 = this.x;
        if (i2 == 1) {
            boolean k2 = k(motionEvent.getX(), motionEvent.getY());
            boolean j2 = j(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (k2 || j2)) {
                if (j2) {
                    this.y = 1;
                    this.r = (int) motionEvent.getX();
                } else if (k2) {
                    this.y = 2;
                    this.o = (int) motionEvent.getY();
                }
                m(2);
                return true;
            }
        } else if (i2 == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void e(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void h(Canvas canvas, RecyclerView recyclerView, RecyclerView.x xVar) {
        if (this.s != this.u.getWidth() || this.t != this.u.getHeight()) {
            this.s = this.u.getWidth();
            this.t = this.u.getHeight();
            m(0);
        } else if (this.C != 0) {
            if (this.v) {
                int i2 = this.s;
                int i3 = this.f2668g;
                int i4 = i2 - i3;
                int i5 = this.f2675n;
                int i6 = this.f2674m;
                int i7 = i5 - (i6 / 2);
                this.f2666e.setBounds(0, 0, i3, i6);
                this.f2667f.setBounds(0, 0, this.f2669h, this.t);
                RecyclerView recyclerView2 = this.u;
                AtomicInteger atomicInteger = c.i.k.d0.a;
                if (d0.d.d(recyclerView2) == 1) {
                    this.f2667f.draw(canvas);
                    canvas.translate(this.f2668g, i7);
                    canvas.scale(-1.0f, 1.0f);
                    this.f2666e.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-this.f2668g, -i7);
                } else {
                    canvas.translate(i4, 0.0f);
                    this.f2667f.draw(canvas);
                    canvas.translate(0.0f, i7);
                    this.f2666e.draw(canvas);
                    canvas.translate(-i4, -i7);
                }
            }
            if (this.w) {
                int i8 = this.t;
                int i9 = this.f2672k;
                int i10 = i8 - i9;
                int i11 = this.q;
                int i12 = this.p;
                int i13 = i11 - (i12 / 2);
                this.f2670i.setBounds(0, 0, i12, i9);
                this.f2671j.setBounds(0, 0, this.s, this.f2673l);
                canvas.translate(0.0f, i10);
                this.f2671j.draw(canvas);
                canvas.translate(i13, 0.0f);
                this.f2670i.draw(canvas);
                canvas.translate(-i13, -i10);
            }
        }
    }

    public final void i() {
        this.u.removeCallbacks(this.D);
    }

    public boolean j(float f2, float f3) {
        if (f3 >= this.t - this.f2672k) {
            int i2 = this.q;
            int i3 = this.p;
            if (f2 >= i2 - (i3 / 2) && f2 <= (i3 / 2) + i2) {
                return true;
            }
        }
        return false;
    }

    public boolean k(float f2, float f3) {
        RecyclerView recyclerView = this.u;
        AtomicInteger atomicInteger = c.i.k.d0.a;
        if (d0.d.d(recyclerView) == 1) {
            if (f2 > this.f2668g) {
                return false;
            }
        } else if (f2 < this.s - this.f2668g) {
            return false;
        }
        int i2 = this.f2675n;
        int i3 = this.f2674m / 2;
        return f3 >= ((float) (i2 - i3)) && f3 <= ((float) (i3 + i2));
    }

    public final int l(float f2, float f3, int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 == 0) {
            return 0;
        }
        int i6 = i2 - i4;
        int i7 = (int) (((f3 - f2) / i5) * i6);
        int i8 = i3 + i7;
        if (i8 >= i6 || i8 < 0) {
            return 0;
        }
        return i7;
    }

    public void m(int i2) {
        if (i2 == 2 && this.x != 2) {
            this.f2666e.setState(a);
            i();
        }
        if (i2 == 0) {
            this.u.invalidate();
        } else {
            n();
        }
        if (this.x == 2 && i2 != 2) {
            this.f2666e.setState(f2663b);
            i();
            this.u.postDelayed(this.D, 1200);
        } else if (i2 == 1) {
            i();
            this.u.postDelayed(this.D, (long) ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.x = i2;
    }

    public void n() {
        int i2 = this.C;
        if (i2 != 0) {
            if (i2 != 3) {
                return;
            }
            this.B.cancel();
        }
        this.C = 1;
        ValueAnimator valueAnimator = this.B;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.B.setDuration(500L);
        this.B.setStartDelay(0L);
        this.B.start();
    }
}
