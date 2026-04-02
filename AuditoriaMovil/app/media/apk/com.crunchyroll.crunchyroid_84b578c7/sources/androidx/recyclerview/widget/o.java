package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.common.ConnectionResult;
import java.util.WeakHashMap;
/* compiled from: FastScroller.java */
/* loaded from: classes.dex */
public final class o extends RecyclerView.o implements RecyclerView.t {
    public static final int[] C = {16842919};
    public static final int[] D = new int[0];
    public int A;
    public final a B;
    public final int a;
    public final int b;
    public final StateListDrawable c;
    public final Drawable d;
    public final int e;
    public final int f;
    public final StateListDrawable g;
    public final Drawable h;
    public final int i;
    public final int j;
    public int k;
    public int l;
    public float m;
    public int n;
    public int o;
    public float p;
    public RecyclerView s;
    public final ValueAnimator z;
    public int q = 0;
    public int r = 0;
    public boolean t = false;
    public boolean u = false;
    public int v = 0;
    public int w = 0;
    public final int[] x = new int[2];
    public final int[] y = new int[2];

    /* compiled from: FastScroller.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o oVar = o.this;
            int i = oVar.A;
            ValueAnimator valueAnimator = oVar.z;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
            } else {
                valueAnimator.cancel();
            }
            oVar.A = 3;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
            valueAnimator.setDuration((long) MediaError.DetailedErrorCode.SEGMENT_UNKNOWN);
            valueAnimator.start();
        }
    }

    /* compiled from: FastScroller.java */
    /* loaded from: classes.dex */
    public class b extends RecyclerView.u {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            boolean z;
            boolean z2;
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            o oVar = o.this;
            int computeVerticalScrollRange = oVar.s.computeVerticalScrollRange();
            int i3 = oVar.r;
            int i4 = computeVerticalScrollRange - i3;
            int i5 = oVar.a;
            if (i4 > 0 && i3 >= i5) {
                z = true;
            } else {
                z = false;
            }
            oVar.t = z;
            int computeHorizontalScrollRange = oVar.s.computeHorizontalScrollRange();
            int i6 = oVar.q;
            if (computeHorizontalScrollRange - i6 > 0 && i6 >= i5) {
                z2 = true;
            } else {
                z2 = false;
            }
            oVar.u = z2;
            boolean z3 = oVar.t;
            if (!z3 && !z2) {
                if (oVar.v != 0) {
                    oVar.h(0);
                    return;
                }
                return;
            }
            if (z3) {
                float f = i3;
                oVar.l = (int) ((((f / 2.0f) + computeVerticalScrollOffset) * f) / computeVerticalScrollRange);
                oVar.k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (oVar.u) {
                float f2 = computeHorizontalScrollOffset;
                float f3 = i6;
                oVar.o = (int) ((((f3 / 2.0f) + f2) * f3) / computeHorizontalScrollRange);
                oVar.n = Math.min(i6, (i6 * i6) / computeHorizontalScrollRange);
            }
            int i7 = oVar.v;
            if (i7 == 0 || i7 == 1) {
                oVar.h(1);
            }
        }
    }

    /* compiled from: FastScroller.java */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        public boolean a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.a) {
                this.a = false;
                return;
            }
            o oVar = o.this;
            if (((Float) oVar.z.getAnimatedValue()).floatValue() == 0.0f) {
                oVar.A = 0;
                oVar.h(0);
                return;
            }
            oVar.A = 2;
            oVar.s.invalidate();
        }
    }

    /* compiled from: FastScroller.java */
    /* loaded from: classes.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            o oVar = o.this;
            oVar.c.setAlpha(floatValue);
            oVar.d.setAlpha(floatValue);
            oVar.s.invalidate();
        }
    }

    public o(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.z = ofFloat;
        this.A = 0;
        a aVar = new a();
        this.B = aVar;
        b bVar = new b();
        this.c = stateListDrawable;
        this.d = drawable;
        this.g = stateListDrawable2;
        this.h = drawable2;
        this.e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i, drawable2.getIntrinsicWidth());
        this.a = i2;
        this.b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        RecyclerView recyclerView2 = this.s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.removeItemDecoration(this);
                this.s.removeOnItemTouchListener(this);
                this.s.removeOnScrollListener(bVar);
                this.s.removeCallbacks(aVar);
            }
            this.s = recyclerView;
            if (recyclerView != null) {
                recyclerView.addItemDecoration(this);
                this.s.addOnItemTouchListener(this);
                this.s.addOnScrollListener(bVar);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bb, code lost:
        if (r9 >= 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0112, code lost:
        if (r5 >= 0) goto L47;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.o.d(android.view.MotionEvent):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final boolean e(MotionEvent motionEvent) {
        int i = this.v;
        if (i == 1) {
            boolean g = g(motionEvent.getX(), motionEvent.getY());
            boolean f = f(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (g || f)) {
                if (f) {
                    this.w = 1;
                    this.p = (int) motionEvent.getX();
                } else if (g) {
                    this.w = 2;
                    this.m = (int) motionEvent.getY();
                }
                h(2);
                return true;
            }
        } else if (i == 2) {
            return true;
        }
        return false;
    }

    public final boolean f(float f, float f2) {
        if (f2 >= this.r - this.i) {
            int i = this.o;
            int i2 = this.n;
            if (f >= i - (i2 / 2) && f <= (i2 / 2) + i) {
                return true;
            }
        }
        return false;
    }

    public final boolean g(float f, float f2) {
        boolean z;
        RecyclerView recyclerView = this.s;
        WeakHashMap<View, r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
        if (g0.e.d(recyclerView) == 1) {
            z = true;
        } else {
            z = false;
        }
        int i = this.e;
        if (z) {
            if (f > i) {
                return false;
            }
        } else if (f < this.q - i) {
            return false;
        }
        int i2 = this.l;
        int i3 = this.k / 2;
        if (f2 < i2 - i3 || f2 > i3 + i2) {
            return false;
        }
        return true;
    }

    public final void h(int i) {
        a aVar = this.B;
        StateListDrawable stateListDrawable = this.c;
        if (i == 2 && this.v != 2) {
            stateListDrawable.setState(C);
            this.s.removeCallbacks(aVar);
        }
        if (i == 0) {
            this.s.invalidate();
        } else {
            i();
        }
        if (this.v == 2 && i != 2) {
            stateListDrawable.setState(D);
            this.s.removeCallbacks(aVar);
            this.s.postDelayed(aVar, 1200);
        } else if (i == 1) {
            this.s.removeCallbacks(aVar);
            this.s.postDelayed(aVar, (long) ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.v = i;
    }

    public final void i() {
        int i = this.A;
        ValueAnimator valueAnimator = this.z;
        if (i != 0) {
            if (i == 3) {
                valueAnimator.cancel();
            } else {
                return;
            }
        }
        this.A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        if (this.q == this.s.getWidth() && this.r == this.s.getHeight()) {
            if (this.A != 0) {
                if (this.t) {
                    int i = this.q;
                    int i2 = this.e;
                    int i3 = i - i2;
                    int i4 = this.l;
                    int i5 = this.k;
                    int i6 = i4 - (i5 / 2);
                    StateListDrawable stateListDrawable = this.c;
                    stateListDrawable.setBounds(0, 0, i2, i5);
                    int i7 = this.r;
                    int i8 = this.f;
                    Drawable drawable = this.d;
                    drawable.setBounds(0, 0, i8, i7);
                    RecyclerView recyclerView2 = this.s;
                    WeakHashMap<View, r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
                    boolean z = true;
                    if (g0.e.d(recyclerView2) != 1) {
                        z = false;
                    }
                    if (z) {
                        drawable.draw(canvas);
                        canvas.translate(i2, i6);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(-1.0f, 1.0f);
                        canvas.translate(-i2, -i6);
                    } else {
                        canvas.translate(i3, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i6);
                        stateListDrawable.draw(canvas);
                        canvas.translate(-i3, -i6);
                    }
                }
                if (this.u) {
                    int i9 = this.r;
                    int i10 = this.i;
                    int i11 = i9 - i10;
                    int i12 = this.o;
                    int i13 = this.n;
                    int i14 = i12 - (i13 / 2);
                    StateListDrawable stateListDrawable2 = this.g;
                    stateListDrawable2.setBounds(0, 0, i13, i10);
                    int i15 = this.q;
                    int i16 = this.j;
                    Drawable drawable2 = this.h;
                    drawable2.setBounds(0, 0, i15, i16);
                    canvas.translate(0.0f, i11);
                    drawable2.draw(canvas);
                    canvas.translate(i14, 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-i14, -i11);
                    return;
                }
                return;
            }
            return;
        }
        this.q = this.s.getWidth();
        this.r = this.s.getHeight();
        h(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void c(boolean z) {
    }
}
