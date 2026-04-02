package c.u.b;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import c.i.k.d0;
import c.i.k.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class o extends RecyclerView.l implements RecyclerView.o {
    public e A;
    public Rect C;
    public long D;

    /* renamed from: d  reason: collision with root package name */
    public float f2691d;

    /* renamed from: e  reason: collision with root package name */
    public float f2692e;

    /* renamed from: f  reason: collision with root package name */
    public float f2693f;

    /* renamed from: g  reason: collision with root package name */
    public float f2694g;

    /* renamed from: h  reason: collision with root package name */
    public float f2695h;

    /* renamed from: i  reason: collision with root package name */
    public float f2696i;

    /* renamed from: j  reason: collision with root package name */
    public float f2697j;

    /* renamed from: k  reason: collision with root package name */
    public float f2698k;

    /* renamed from: m  reason: collision with root package name */
    public d f2700m;
    public int o;
    public int q;
    public RecyclerView r;
    public VelocityTracker t;
    public List<RecyclerView.a0> u;
    public List<Integer> v;
    public c.i.k.i z;
    public final List<View> a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final float[] f2689b = new float[2];

    /* renamed from: c  reason: collision with root package name */
    public RecyclerView.a0 f2690c = null;

    /* renamed from: l  reason: collision with root package name */
    public int f2699l = -1;

    /* renamed from: n  reason: collision with root package name */
    public int f2701n = 0;
    public List<f> p = new ArrayList();
    public final Runnable s = new a();
    public RecyclerView.h w = null;
    public View x = null;
    public int y = -1;
    public final RecyclerView.q B = new b();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00e4  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0102 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x010e  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 308
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: c.u.b.o.a.run():void");
        }
    }

    /* loaded from: classes.dex */
    public class b implements RecyclerView.q {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
            ((i.b) o.this.z.a).a.onTouchEvent(motionEvent);
            VelocityTracker velocityTracker = o.this.t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (o.this.f2699l == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(o.this.f2699l);
            if (findPointerIndex >= 0) {
                o oVar = o.this;
                if (oVar.f2690c == null && actionMasked == 2 && oVar.f2701n != 2) {
                    Objects.requireNonNull(oVar.f2700m);
                }
            }
            o oVar2 = o.this;
            RecyclerView.a0 a0Var = oVar2.f2690c;
            if (a0Var == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (findPointerIndex >= 0) {
                        oVar2.s(motionEvent, oVar2.o, findPointerIndex);
                        o.this.p(a0Var);
                        o oVar3 = o.this;
                        oVar3.r.removeCallbacks(oVar3.s);
                        o.this.s.run();
                        o.this.r.invalidate();
                        return;
                    }
                    return;
                } else if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    o oVar4 = o.this;
                    if (pointerId == oVar4.f2699l) {
                        oVar4.f2699l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        o oVar5 = o.this;
                        oVar5.s(motionEvent, oVar5.o, actionIndex);
                        return;
                    }
                    return;
                } else {
                    VelocityTracker velocityTracker2 = oVar2.t;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                }
            }
            o.this.r(null, 0);
            o.this.f2699l = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
            ((i.b) o.this.z.a).a.onTouchEvent(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            f fVar = null;
            if (actionMasked == 0) {
                o.this.f2699l = motionEvent.getPointerId(0);
                o.this.f2691d = motionEvent.getX();
                o.this.f2692e = motionEvent.getY();
                o oVar = o.this;
                VelocityTracker velocityTracker = oVar.t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                oVar.t = VelocityTracker.obtain();
                o oVar2 = o.this;
                if (oVar2.f2690c == null) {
                    if (!oVar2.p.isEmpty()) {
                        View m2 = oVar2.m(motionEvent);
                        int size = oVar2.p.size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            }
                            f fVar2 = oVar2.p.get(size);
                            if (fVar2.f2709e.f527b == m2) {
                                fVar = fVar2;
                                break;
                            }
                            size--;
                        }
                    }
                    if (fVar != null) {
                        o oVar3 = o.this;
                        oVar3.f2691d -= fVar.f2713i;
                        oVar3.f2692e -= fVar.f2714j;
                        oVar3.l(fVar.f2709e, true);
                        if (o.this.a.remove(fVar.f2709e.f527b)) {
                            o oVar4 = o.this;
                            oVar4.f2700m.a(oVar4.r, fVar.f2709e);
                        }
                        o.this.r(fVar.f2709e, fVar.f2710f);
                        o oVar5 = o.this;
                        oVar5.s(motionEvent, oVar5.o, 0);
                    }
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                o oVar6 = o.this;
                oVar6.f2699l = -1;
                oVar6.r(null, 0);
            } else {
                int i2 = o.this.f2699l;
                if (i2 != -1 && motionEvent.findPointerIndex(i2) >= 0) {
                    o oVar7 = o.this;
                    if (oVar7.f2690c == null && actionMasked == 2 && oVar7.f2701n != 2) {
                        Objects.requireNonNull(oVar7.f2700m);
                    }
                }
            }
            VelocityTracker velocityTracker2 = o.this.t;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return o.this.f2690c != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void e(boolean z) {
            if (z) {
                o.this.r(null, 0);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends f {

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ int f2702n;
        public final /* synthetic */ RecyclerView.a0 o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RecyclerView.a0 a0Var, int i2, int i3, float f2, float f3, float f4, float f5, int i4, RecyclerView.a0 a0Var2) {
            super(a0Var, i2, i3, f2, f3, f4, f5);
            this.f2702n = i4;
            this.o = a0Var2;
        }

        @Override // c.u.b.o.f, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f2716l) {
                this.f2709e.v(true);
            }
            this.f2716l = true;
            if (this.f2715k) {
                return;
            }
            if (this.f2702n <= 0) {
                o oVar = o.this;
                oVar.f2700m.a(oVar.r, this.o);
            } else {
                o.this.a.add(this.o.f527b);
                this.f2712h = true;
                int i2 = this.f2702n;
                if (i2 > 0) {
                    o oVar2 = o.this;
                    oVar2.r.post(new p(oVar2, this, i2));
                }
            }
            o oVar3 = o.this;
            View view = oVar3.x;
            View view2 = this.o.f527b;
            if (view == view2) {
                oVar3.q(view2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d {
        public static final Interpolator a = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final Interpolator f2703b = new b();

        /* renamed from: c  reason: collision with root package name */
        public int f2704c = -1;

        /* loaded from: classes.dex */
        public class a implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f2) {
                return f2 * f2 * f2 * f2 * f2;
            }
        }

        /* loaded from: classes.dex */
        public class b implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f2) {
                float f3 = f2 - 1.0f;
                return (f3 * f3 * f3 * f3 * f3) + 1.0f;
            }
        }

        public static int c(int i2, int i3) {
            int i4;
            int i5 = i2 & 789516;
            if (i5 == 0) {
                return i2;
            }
            int i6 = i2 & (i5 ^ (-1));
            if (i3 == 0) {
                i4 = i5 << 2;
            } else {
                int i7 = i5 << 1;
                i6 |= (-789517) & i7;
                i4 = (i7 & 789516) << 2;
            }
            return i6 | i4;
        }

        public abstract void a(RecyclerView recyclerView, RecyclerView.a0 a0Var);

        public int b(int i2, int i3) {
            int i4;
            int i5 = i2 & 3158064;
            if (i5 == 0) {
                return i2;
            }
            int i6 = i2 & (i5 ^ (-1));
            if (i3 == 0) {
                i4 = i5 >> 2;
            } else {
                int i7 = i5 >> 1;
                i6 |= (-3158065) & i7;
                i4 = (i7 & 3158064) >> 2;
            }
            return i6 | i4;
        }

        public final int d(RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            AtomicInteger atomicInteger = c.i.k.d0.a;
            return b(208947, d0.d.d(recyclerView));
        }

        public int e(RecyclerView recyclerView, int i2, int i3, long j2) {
            if (this.f2704c == -1) {
                this.f2704c = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            int i4 = this.f2704c;
            float min = Math.min(1.0f, (Math.abs(i3) * 1.0f) / i2) - 1.0f;
            int signum = (int) (((int) Math.signum(i3)) * i4 * ((min * min * min * min * min) + 1.0f));
            float f2 = j2 <= 2000 ? ((float) j2) / 2000.0f : 1.0f;
            int i5 = (int) (signum * f2 * f2 * f2 * f2 * f2);
            return i5 == 0 ? i3 > 0 ? 1 : -1 : i5;
        }

        public void f(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var, float f2, float f3, int i2, boolean z) {
            View view = a0Var.f527b;
            if (Build.VERSION.SDK_INT >= 21 && z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
                Float valueOf = Float.valueOf(c.i.k.d0.l(view));
                int childCount = recyclerView.getChildCount();
                float f4 = 0.0f;
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = recyclerView.getChildAt(i3);
                    if (childAt != view) {
                        float l2 = c.i.k.d0.l(childAt);
                        if (l2 > f4) {
                            f4 = l2;
                        }
                    }
                }
                c.i.k.d0.B(view, f4 + 1.0f);
                view.setTag(R.id.item_touch_helper_previous_elevation, valueOf);
            }
            view.setTranslationX(f2);
            view.setTranslationY(f3);
        }
    }

    /* loaded from: classes.dex */
    public class e extends GestureDetector.SimpleOnGestureListener {
        public boolean a = true;

        public e() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View m2;
            RecyclerView.a0 M;
            if (!this.a || (m2 = o.this.m(motionEvent)) == null || (M = o.this.r.M(m2)) == null) {
                return;
            }
            o oVar = o.this;
            if ((oVar.f2700m.d(oVar.r, M) & 16711680) != 0) {
                int pointerId = motionEvent.getPointerId(0);
                int i2 = o.this.f2699l;
                if (pointerId == i2) {
                    int findPointerIndex = motionEvent.findPointerIndex(i2);
                    float x = motionEvent.getX(findPointerIndex);
                    float y = motionEvent.getY(findPointerIndex);
                    o oVar2 = o.this;
                    oVar2.f2691d = x;
                    oVar2.f2692e = y;
                    oVar2.f2696i = 0.0f;
                    oVar2.f2695h = 0.0f;
                    Objects.requireNonNull(oVar2.f2700m);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class f implements Animator.AnimatorListener {
        public final float a;

        /* renamed from: b  reason: collision with root package name */
        public final float f2706b;

        /* renamed from: c  reason: collision with root package name */
        public final float f2707c;

        /* renamed from: d  reason: collision with root package name */
        public final float f2708d;

        /* renamed from: e  reason: collision with root package name */
        public final RecyclerView.a0 f2709e;

        /* renamed from: f  reason: collision with root package name */
        public final int f2710f;

        /* renamed from: g  reason: collision with root package name */
        public final ValueAnimator f2711g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f2712h;

        /* renamed from: i  reason: collision with root package name */
        public float f2713i;

        /* renamed from: j  reason: collision with root package name */
        public float f2714j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f2715k = false;

        /* renamed from: l  reason: collision with root package name */
        public boolean f2716l = false;

        /* renamed from: m  reason: collision with root package name */
        public float f2717m;

        /* loaded from: classes.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.this.f2717m = valueAnimator.getAnimatedFraction();
            }
        }

        public f(RecyclerView.a0 a0Var, int i2, int i3, float f2, float f3, float f4, float f5) {
            this.f2710f = i3;
            this.f2709e = a0Var;
            this.a = f2;
            this.f2706b = f3;
            this.f2707c = f4;
            this.f2708d = f5;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f2711g = ofFloat;
            ofFloat.addUpdateListener(new a());
            ofFloat.setTarget(a0Var.f527b);
            ofFloat.addListener(this);
            this.f2717m = 0.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f2717m = 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f2716l) {
                this.f2709e.v(true);
            }
            this.f2716l = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: classes.dex */
    public interface g {
        void b(View view, View view2, int i2, int i3);
    }

    public o(d dVar) {
        this.f2700m = dVar;
    }

    public static boolean o(View view, float f2, float f3, float f4, float f5) {
        return f2 >= f4 && f2 <= f4 + ((float) view.getWidth()) && f3 >= f5 && f3 <= f5 + ((float) view.getHeight());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void b(View view) {
        q(view);
        RecyclerView.a0 M = this.r.M(view);
        if (M == null) {
            return;
        }
        RecyclerView.a0 a0Var = this.f2690c;
        if (a0Var != null && M == a0Var) {
            r(null, 0);
            return;
        }
        l(M, false);
        if (this.a.remove(M.f527b)) {
            this.f2700m.a(this.r, M);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void d(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void f(Rect rect, View view, RecyclerView recyclerView, RecyclerView.x xVar) {
        rect.setEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.x xVar) {
        float f2;
        float f3;
        this.y = -1;
        if (this.f2690c != null) {
            n(this.f2689b);
            float[] fArr = this.f2689b;
            float f4 = fArr[0];
            f3 = fArr[1];
            f2 = f4;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        d dVar = this.f2700m;
        RecyclerView.a0 a0Var = this.f2690c;
        List<f> list = this.p;
        int i2 = this.f2701n;
        Objects.requireNonNull(dVar);
        int i3 = 0;
        for (int size = list.size(); i3 < size; size = size) {
            f fVar = list.get(i3);
            float f5 = fVar.a;
            float f6 = fVar.f2707c;
            if (f5 == f6) {
                fVar.f2713i = fVar.f2709e.f527b.getTranslationX();
            } else {
                fVar.f2713i = e.a.d.a.a.a(f6, f5, fVar.f2717m, f5);
            }
            float f7 = fVar.f2706b;
            float f8 = fVar.f2708d;
            if (f7 == f8) {
                fVar.f2714j = fVar.f2709e.f527b.getTranslationY();
            } else {
                fVar.f2714j = e.a.d.a.a.a(f8, f7, fVar.f2717m, f7);
            }
            int save = canvas.save();
            dVar.f(canvas, recyclerView, fVar.f2709e, fVar.f2713i, fVar.f2714j, fVar.f2710f, false);
            canvas.restoreToCount(save);
            i3++;
        }
        if (a0Var != null) {
            int save2 = canvas.save();
            dVar.f(canvas, recyclerView, a0Var, f2, f3, i2, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void h(Canvas canvas, RecyclerView recyclerView, RecyclerView.x xVar) {
        boolean z = false;
        if (this.f2690c != null) {
            n(this.f2689b);
            float[] fArr = this.f2689b;
            float f2 = fArr[0];
            float f3 = fArr[1];
        }
        d dVar = this.f2700m;
        RecyclerView.a0 a0Var = this.f2690c;
        List<f> list = this.p;
        Objects.requireNonNull(dVar);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            int save = canvas.save();
            View view = list.get(i2).f2709e.f527b;
            canvas.restoreToCount(save);
        }
        if (a0Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i3 = size - 1; i3 >= 0; i3--) {
            f fVar = list.get(i3);
            boolean z2 = fVar.f2716l;
            if (z2 && !fVar.f2712h) {
                list.remove(i3);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    public void i(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.i0(this);
            RecyclerView recyclerView3 = this.r;
            RecyclerView.q qVar = this.B;
            recyclerView3.x.remove(qVar);
            if (recyclerView3.y == qVar) {
                recyclerView3.y = null;
            }
            List<RecyclerView.o> list = this.r.K;
            if (list != null) {
                list.remove(this);
            }
            for (int size = this.p.size() - 1; size >= 0; size--) {
                f fVar = this.p.get(0);
                fVar.f2711g.cancel();
                this.f2700m.a(this.r, fVar.f2709e);
            }
            this.p.clear();
            this.x = null;
            this.y = -1;
            VelocityTracker velocityTracker = this.t;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.t = null;
            }
            e eVar = this.A;
            if (eVar != null) {
                eVar.a = false;
                this.A = null;
            }
            if (this.z != null) {
                this.z = null;
            }
        }
        this.r = recyclerView;
        Resources resources = recyclerView.getResources();
        this.f2693f = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
        this.f2694g = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
        this.q = ViewConfiguration.get(this.r.getContext()).getScaledTouchSlop();
        this.r.j(this);
        this.r.x.add(this.B);
        RecyclerView recyclerView4 = this.r;
        if (recyclerView4.K == null) {
            recyclerView4.K = new ArrayList();
        }
        recyclerView4.K.add(this);
        this.A = new e();
        this.z = new c.i.k.i(this.r.getContext(), this.A);
    }

    public final int j(RecyclerView.a0 a0Var, int i2) {
        if ((i2 & 12) != 0) {
            int i3 = this.f2695h > 0.0f ? 8 : 4;
            VelocityTracker velocityTracker = this.t;
            if (velocityTracker != null && this.f2699l > -1) {
                d dVar = this.f2700m;
                float f2 = this.f2694g;
                Objects.requireNonNull(dVar);
                velocityTracker.computeCurrentVelocity(1000, f2);
                float xVelocity = this.t.getXVelocity(this.f2699l);
                float yVelocity = this.t.getYVelocity(this.f2699l);
                int i4 = xVelocity > 0.0f ? 8 : 4;
                float abs = Math.abs(xVelocity);
                if ((i4 & i2) != 0 && i3 == i4) {
                    d dVar2 = this.f2700m;
                    float f3 = this.f2693f;
                    Objects.requireNonNull(dVar2);
                    if (abs >= f3 && abs > Math.abs(yVelocity)) {
                        return i4;
                    }
                }
            }
            Objects.requireNonNull(this.f2700m);
            float width = this.r.getWidth() * 0.5f;
            if ((i2 & i3) == 0 || Math.abs(this.f2695h) <= width) {
                return 0;
            }
            return i3;
        }
        return 0;
    }

    public final int k(RecyclerView.a0 a0Var, int i2) {
        if ((i2 & 3) != 0) {
            int i3 = this.f2696i > 0.0f ? 2 : 1;
            VelocityTracker velocityTracker = this.t;
            if (velocityTracker != null && this.f2699l > -1) {
                d dVar = this.f2700m;
                float f2 = this.f2694g;
                Objects.requireNonNull(dVar);
                velocityTracker.computeCurrentVelocity(1000, f2);
                float xVelocity = this.t.getXVelocity(this.f2699l);
                float yVelocity = this.t.getYVelocity(this.f2699l);
                int i4 = yVelocity > 0.0f ? 2 : 1;
                float abs = Math.abs(yVelocity);
                if ((i4 & i2) != 0 && i4 == i3) {
                    d dVar2 = this.f2700m;
                    float f3 = this.f2693f;
                    Objects.requireNonNull(dVar2);
                    if (abs >= f3 && abs > Math.abs(xVelocity)) {
                        return i4;
                    }
                }
            }
            Objects.requireNonNull(this.f2700m);
            float height = this.r.getHeight() * 0.5f;
            if ((i2 & i3) == 0 || Math.abs(this.f2696i) <= height) {
                return 0;
            }
            return i3;
        }
        return 0;
    }

    public void l(RecyclerView.a0 a0Var, boolean z) {
        f fVar;
        int size = this.p.size();
        do {
            size--;
            if (size < 0) {
                return;
            }
            fVar = this.p.get(size);
        } while (fVar.f2709e != a0Var);
        fVar.f2715k |= z;
        if (!fVar.f2716l) {
            fVar.f2711g.cancel();
        }
        this.p.remove(size);
    }

    public View m(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.a0 a0Var = this.f2690c;
        if (a0Var != null) {
            View view = a0Var.f527b;
            if (o(view, x, y, this.f2697j + this.f2695h, this.f2698k + this.f2696i)) {
                return view;
            }
        }
        for (int size = this.p.size() - 1; size >= 0; size--) {
            f fVar = this.p.get(size);
            View view2 = fVar.f2709e.f527b;
            if (o(view2, x, y, fVar.f2713i, fVar.f2714j)) {
                return view2;
            }
        }
        RecyclerView recyclerView = this.r;
        int e2 = recyclerView.f523l.e();
        while (true) {
            e2--;
            if (e2 < 0) {
                return null;
            }
            View d2 = recyclerView.f523l.d(e2);
            float translationX = d2.getTranslationX();
            float translationY = d2.getTranslationY();
            if (x >= d2.getLeft() + translationX && x <= d2.getRight() + translationX && y >= d2.getTop() + translationY && y <= d2.getBottom() + translationY) {
                return d2;
            }
        }
    }

    public final void n(float[] fArr) {
        if ((this.o & 12) != 0) {
            fArr[0] = (this.f2697j + this.f2695h) - this.f2690c.f527b.getLeft();
        } else {
            fArr[0] = this.f2690c.f527b.getTranslationX();
        }
        if ((this.o & 3) != 0) {
            fArr[1] = (this.f2698k + this.f2696i) - this.f2690c.f527b.getTop();
        } else {
            fArr[1] = this.f2690c.f527b.getTranslationY();
        }
    }

    public void p(RecyclerView.a0 a0Var) {
        boolean z;
        List<RecyclerView.a0> list;
        RecyclerView.a0 a0Var2;
        int bottom;
        int abs;
        int top;
        int abs2;
        int left;
        int abs3;
        int right;
        int i2;
        int i3;
        if (!this.r.isLayoutRequested() && this.f2701n == 2) {
            Objects.requireNonNull(this.f2700m);
            int i4 = (int) (this.f2697j + this.f2695h);
            int i5 = (int) (this.f2698k + this.f2696i);
            if (Math.abs(i5 - a0Var.f527b.getTop()) >= a0Var.f527b.getHeight() * 0.5f || Math.abs(i4 - a0Var.f527b.getLeft()) >= a0Var.f527b.getWidth() * 0.5f) {
                List<RecyclerView.a0> list2 = this.u;
                if (list2 == null) {
                    this.u = new ArrayList();
                    this.v = new ArrayList();
                } else {
                    list2.clear();
                    this.v.clear();
                }
                Objects.requireNonNull(this.f2700m);
                int round = Math.round(this.f2697j + this.f2695h) - 0;
                int round2 = Math.round(this.f2698k + this.f2696i) - 0;
                int width = a0Var.f527b.getWidth() + round + 0;
                int height = a0Var.f527b.getHeight() + round2 + 0;
                int i6 = (round + width) / 2;
                int i7 = (round2 + height) / 2;
                RecyclerView.m layoutManager = this.r.getLayoutManager();
                int A = layoutManager.A();
                int i8 = 0;
                while (i8 < A) {
                    View z2 = layoutManager.z(i8);
                    if (z2 != a0Var.f527b && z2.getBottom() >= round2 && z2.getTop() <= height && z2.getRight() >= round && z2.getLeft() <= width) {
                        RecyclerView.a0 M = this.r.M(z2);
                        Objects.requireNonNull(this.f2700m);
                        int abs4 = Math.abs(i6 - ((z2.getRight() + z2.getLeft()) / 2));
                        int abs5 = Math.abs(i7 - ((z2.getBottom() + z2.getTop()) / 2));
                        int i9 = (abs5 * abs5) + (abs4 * abs4);
                        int size = this.u.size();
                        i2 = round;
                        i3 = round2;
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < size) {
                            int i12 = size;
                            if (i9 <= this.v.get(i10).intValue()) {
                                break;
                            }
                            i11++;
                            i10++;
                            size = i12;
                        }
                        this.u.add(i11, M);
                        this.v.add(i11, Integer.valueOf(i9));
                    } else {
                        i2 = round;
                        i3 = round2;
                    }
                    i8++;
                    round = i2;
                    round2 = i3;
                }
                List<RecyclerView.a0> list3 = this.u;
                if (list3.size() == 0) {
                    return;
                }
                Objects.requireNonNull(this.f2700m);
                int width2 = a0Var.f527b.getWidth() + i4;
                int height2 = a0Var.f527b.getHeight() + i5;
                int left2 = i4 - a0Var.f527b.getLeft();
                int top2 = i5 - a0Var.f527b.getTop();
                int size2 = list3.size();
                RecyclerView.a0 a0Var3 = null;
                int i13 = 0;
                int i14 = -1;
                while (i13 < size2) {
                    RecyclerView.a0 a0Var4 = list3.get(i13);
                    if (left2 <= 0 || (right = a0Var4.f527b.getRight() - width2) >= 0) {
                        list = list3;
                        a0Var2 = a0Var3;
                    } else {
                        list = list3;
                        a0Var2 = a0Var3;
                        if (a0Var4.f527b.getRight() > a0Var.f527b.getRight()) {
                            int abs6 = Math.abs(right);
                            a0Var2 = a0Var3;
                            if (abs6 > i14) {
                                i14 = abs6;
                                a0Var2 = a0Var4;
                            }
                        }
                    }
                    if (left2 < 0 && (left = a0Var4.f527b.getLeft() - i4) > 0 && a0Var4.f527b.getLeft() < a0Var.f527b.getLeft() && (abs3 = Math.abs(left)) > i14) {
                        i14 = abs3;
                        a0Var2 = a0Var4;
                    }
                    if (top2 < 0 && (top = a0Var4.f527b.getTop() - i5) > 0 && a0Var4.f527b.getTop() < a0Var.f527b.getTop() && (abs2 = Math.abs(top)) > i14) {
                        i14 = abs2;
                        a0Var2 = a0Var4;
                    }
                    if (top2 > 0 && (bottom = a0Var4.f527b.getBottom() - height2) < 0 && a0Var4.f527b.getBottom() > a0Var.f527b.getBottom() && (abs = Math.abs(bottom)) > i14) {
                        i14 = abs;
                        a0Var2 = a0Var4;
                    }
                    i13++;
                    list3 = list;
                    a0Var3 = a0Var2;
                }
                if (a0Var3 == null) {
                    this.u.clear();
                    this.v.clear();
                    return;
                }
                int f2 = a0Var3.f();
                a0Var.f();
                e.g.a.e.c cVar = (e.g.a.e.c) this.f2700m;
                e.g.a.a.m mVar = cVar.f8035i.get();
                if (mVar != null) {
                    if (cVar.f8033g == -1) {
                        cVar.f8034h = mVar.j(a0Var);
                        if (a0Var instanceof e.g.a.e.a) {
                            cVar.f8039m = ((e.g.a.e.a) a0Var).u;
                        }
                    }
                    cVar.f8033g = mVar.j(a0Var3);
                    if (a0Var3 instanceof e.g.a.e.a) {
                        cVar.f8032f = ((e.g.a.e.a) a0Var3).u;
                    }
                    cVar.f8031e = a0Var.g();
                    int g2 = a0Var3.g();
                    cVar.f8030d = g2;
                    cVar.f8036j.a(cVar.f8031e, g2);
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    d dVar = this.f2700m;
                    RecyclerView recyclerView = this.r;
                    Objects.requireNonNull(dVar);
                    RecyclerView.m layoutManager2 = recyclerView.getLayoutManager();
                    if (layoutManager2 instanceof g) {
                        ((g) layoutManager2).b(a0Var.f527b, a0Var3.f527b, i4, i5);
                        return;
                    }
                    if (layoutManager2.g()) {
                        if (layoutManager2.F(a0Var3.f527b) <= recyclerView.getPaddingLeft()) {
                            recyclerView.n0(f2);
                        }
                        if (layoutManager2.I(a0Var3.f527b) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                            recyclerView.n0(f2);
                        }
                    }
                    if (layoutManager2.h()) {
                        if (layoutManager2.J(a0Var3.f527b) <= recyclerView.getPaddingTop()) {
                            recyclerView.n0(f2);
                        }
                        if (layoutManager2.D(a0Var3.f527b) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                            recyclerView.n0(f2);
                        }
                    }
                }
            }
        }
    }

    public void q(View view) {
        if (view == this.x) {
            this.x = null;
            if (this.w != null) {
                this.r.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ae, code lost:
        if (r1 > 0) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r(androidx.recyclerview.widget.RecyclerView.a0 r22, int r23) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.u.b.o.r(androidx.recyclerview.widget.RecyclerView$a0, int):void");
    }

    public void s(MotionEvent motionEvent, int i2, int i3) {
        float x = motionEvent.getX(i3);
        float y = motionEvent.getY(i3);
        float f2 = x - this.f2691d;
        this.f2695h = f2;
        this.f2696i = y - this.f2692e;
        if ((i2 & 4) == 0) {
            this.f2695h = Math.max(0.0f, f2);
        }
        if ((i2 & 8) == 0) {
            this.f2695h = Math.min(0.0f, this.f2695h);
        }
        if ((i2 & 1) == 0) {
            this.f2696i = Math.max(0.0f, this.f2696i);
        }
        if ((i2 & 2) == 0) {
            this.f2696i = Math.min(0.0f, this.f2696i);
        }
    }
}
