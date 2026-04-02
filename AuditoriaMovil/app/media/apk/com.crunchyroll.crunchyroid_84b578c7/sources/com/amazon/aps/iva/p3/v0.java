package com.amazon.aps.iva.p3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.w0;
import com.crunchyroll.crunchyroid.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
/* compiled from: WindowInsetsAnimationCompat.java */
/* loaded from: classes.dex */
public final class v0 {
    public final e a;

    /* compiled from: WindowInsetsAnimationCompat.java */
    /* loaded from: classes.dex */
    public static class c extends e {
        public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
        public static final com.amazon.aps.iva.c5.a f = new com.amazon.aps.iva.c5.a();
        public static final DecelerateInterpolator g = new DecelerateInterpolator();

        /* compiled from: WindowInsetsAnimationCompat.java */
        /* loaded from: classes.dex */
        public static class a implements View.OnApplyWindowInsetsListener {
            public final b a;
            public w0 b;

            /* compiled from: WindowInsetsAnimationCompat.java */
            /* renamed from: com.amazon.aps.iva.p3.v0$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class C0600a implements ValueAnimator.AnimatorUpdateListener {
                public final /* synthetic */ v0 a;
                public final /* synthetic */ w0 b;
                public final /* synthetic */ w0 c;
                public final /* synthetic */ int d;
                public final /* synthetic */ View e;

                public C0600a(v0 v0Var, w0 w0Var, w0 w0Var2, int i, View view) {
                    this.a = v0Var;
                    this.b = w0Var;
                    this.c = w0Var2;
                    this.d = i;
                    this.e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    w0.e bVar;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    v0 v0Var = this.a;
                    v0Var.a.d(animatedFraction);
                    float b = v0Var.a.b();
                    PathInterpolator pathInterpolator = c.e;
                    int i = Build.VERSION.SDK_INT;
                    w0 w0Var = this.b;
                    if (i >= 30) {
                        bVar = new w0.d(w0Var);
                    } else if (i >= 29) {
                        bVar = new w0.c(w0Var);
                    } else {
                        bVar = new w0.b(w0Var);
                    }
                    for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                        if ((this.d & i2) == 0) {
                            bVar.c(i2, w0Var.a(i2));
                        } else {
                            com.amazon.aps.iva.g3.f a = w0Var.a(i2);
                            com.amazon.aps.iva.g3.f a2 = this.c.a(i2);
                            float f = 1.0f - b;
                            bVar.c(i2, w0.f(a, (int) (((a.a - a2.a) * f) + 0.5d), (int) (((a.b - a2.b) * f) + 0.5d), (int) (((a.c - a2.c) * f) + 0.5d), (int) (((a.d - a2.d) * f) + 0.5d)));
                        }
                    }
                    c.g(this.e, bVar.b(), Collections.singletonList(v0Var));
                }
            }

            /* compiled from: WindowInsetsAnimationCompat.java */
            /* loaded from: classes.dex */
            public class b extends AnimatorListenerAdapter {
                public final /* synthetic */ v0 a;
                public final /* synthetic */ View b;

                public b(v0 v0Var, View view) {
                    this.a = v0Var;
                    this.b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    v0 v0Var = this.a;
                    v0Var.a.d(1.0f);
                    c.e(this.b, v0Var);
                }
            }

            /* compiled from: WindowInsetsAnimationCompat.java */
            /* renamed from: com.amazon.aps.iva.p3.v0$c$a$c  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class RunnableC0601c implements Runnable {
                public final /* synthetic */ View b;
                public final /* synthetic */ v0 c;
                public final /* synthetic */ a d;
                public final /* synthetic */ ValueAnimator e;

                public RunnableC0601c(View view, v0 v0Var, a aVar, ValueAnimator valueAnimator) {
                    this.b = view;
                    this.c = v0Var;
                    this.d = aVar;
                    this.e = valueAnimator;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    c.h(this.b, this.c, this.d);
                    this.e.start();
                }
            }

            public a(View view, b bVar) {
                w0 w0Var;
                w0.e bVar2;
                this.a = bVar;
                WeakHashMap<View, r0> weakHashMap = g0.a;
                w0 a = g0.j.a(view);
                if (a != null) {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 30) {
                        bVar2 = new w0.d(a);
                    } else if (i >= 29) {
                        bVar2 = new w0.c(a);
                    } else {
                        bVar2 = new w0.b(a);
                    }
                    w0Var = bVar2.b();
                } else {
                    w0Var = null;
                }
                this.b = w0Var;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                Interpolator interpolator;
                if (!view.isLaidOut()) {
                    this.b = w0.h(view, windowInsets);
                    return c.i(view, windowInsets);
                }
                w0 h = w0.h(view, windowInsets);
                if (this.b == null) {
                    WeakHashMap<View, r0> weakHashMap = g0.a;
                    this.b = g0.j.a(view);
                }
                if (this.b == null) {
                    this.b = h;
                    return c.i(view, windowInsets);
                }
                b j = c.j(view);
                if (j != null && Objects.equals(j.mDispachedInsets, windowInsets)) {
                    return c.i(view, windowInsets);
                }
                w0 w0Var = this.b;
                int i = 0;
                for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                    if (!h.a(i2).equals(w0Var.a(i2))) {
                        i |= i2;
                    }
                }
                if (i == 0) {
                    return c.i(view, windowInsets);
                }
                w0 w0Var2 = this.b;
                if ((i & 8) != 0) {
                    if (h.a(8).d > w0Var2.a(8).d) {
                        interpolator = c.e;
                    } else {
                        interpolator = c.f;
                    }
                } else {
                    interpolator = c.g;
                }
                v0 v0Var = new v0(i, interpolator, 160L);
                e eVar = v0Var.a;
                eVar.d(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(eVar.a());
                com.amazon.aps.iva.g3.f a = h.a(i);
                com.amazon.aps.iva.g3.f a2 = w0Var2.a(i);
                int min = Math.min(a.a, a2.a);
                int i3 = a.b;
                int i4 = a2.b;
                int min2 = Math.min(i3, i4);
                int i5 = a.c;
                int i6 = a2.c;
                int min3 = Math.min(i5, i6);
                int i7 = a.d;
                int i8 = i;
                int i9 = a2.d;
                a aVar = new a(com.amazon.aps.iva.g3.f.b(min, min2, min3, Math.min(i7, i9)), com.amazon.aps.iva.g3.f.b(Math.max(a.a, a2.a), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i9)));
                c.f(view, v0Var, windowInsets, false);
                duration.addUpdateListener(new C0600a(v0Var, h, w0Var2, i8, view));
                duration.addListener(new b(v0Var, view));
                x.a(view, new RunnableC0601c(view, v0Var, aVar, duration));
                this.b = h;
                return c.i(view, windowInsets);
            }
        }

        public static void e(View view, v0 v0Var) {
            b j = j(view);
            if (j != null) {
                j.onEnd(v0Var);
                if (j.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    e(viewGroup.getChildAt(i), v0Var);
                }
            }
        }

        public static void f(View view, v0 v0Var, WindowInsets windowInsets, boolean z) {
            b j = j(view);
            if (j != null) {
                j.mDispachedInsets = windowInsets;
                if (!z) {
                    j.onPrepare(v0Var);
                    if (j.getDispatchMode() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    f(viewGroup.getChildAt(i), v0Var, windowInsets, z);
                }
            }
        }

        public static void g(View view, w0 w0Var, List<v0> list) {
            b j = j(view);
            if (j != null) {
                w0Var = j.onProgress(w0Var, list);
                if (j.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    g(viewGroup.getChildAt(i), w0Var, list);
                }
            }
        }

        public static void h(View view, v0 v0Var, a aVar) {
            b j = j(view);
            if (j != null) {
                j.onStart(v0Var, aVar);
                if (j.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    h(viewGroup.getChildAt(i), v0Var, aVar);
                }
            }
        }

        public static WindowInsets i(View view, WindowInsets windowInsets) {
            if (view.getTag(R.id.tag_on_apply_window_listener) != null) {
                return windowInsets;
            }
            return view.onApplyWindowInsets(windowInsets);
        }

        public static b j(View view) {
            Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
            if (tag instanceof a) {
                return ((a) tag).a;
            }
            return null;
        }
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    /* loaded from: classes.dex */
    public static class d extends e {
        public final WindowInsetsAnimation e;

        /* compiled from: WindowInsetsAnimationCompat.java */
        /* loaded from: classes.dex */
        public static class a extends WindowInsetsAnimation$Callback {
            public final b a;
            public List<v0> b;
            public ArrayList<v0> c;
            public final HashMap<WindowInsetsAnimation, v0> d;

            public a(b bVar) {
                super(bVar.getDispatchMode());
                this.d = new HashMap<>();
                this.a = bVar;
            }

            public final v0 a(WindowInsetsAnimation windowInsetsAnimation) {
                v0 v0Var = this.d.get(windowInsetsAnimation);
                if (v0Var == null) {
                    v0 v0Var2 = new v0(windowInsetsAnimation);
                    this.d.put(windowInsetsAnimation, v0Var2);
                    return v0Var2;
                }
                return v0Var;
            }

            public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.a.onEnd(a(windowInsetsAnimation));
                this.d.remove(windowInsetsAnimation);
            }

            public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.a.onPrepare(a(windowInsetsAnimation));
            }

            public final WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                float fraction;
                ArrayList<v0> arrayList = this.c;
                if (arrayList == null) {
                    ArrayList<v0> arrayList2 = new ArrayList<>(list.size());
                    this.c = arrayList2;
                    this.b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        WindowInsetsAnimation d = com.amazon.aps.iva.f8.o.d(list.get(size));
                        v0 a = a(d);
                        fraction = d.getFraction();
                        a.a.d(fraction);
                        this.c.add(a);
                    } else {
                        return this.a.onProgress(w0.h(null, windowInsets), this.b).g();
                    }
                }
            }

            public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                a onStart = this.a.onStart(a(windowInsetsAnimation), new a(bounds));
                onStart.getClass();
                com.amazon.aps.iva.f8.l.c();
                return com.amazon.aps.iva.d2.f0.c(onStart.a.d(), onStart.b.d());
            }
        }

        public d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.e = windowInsetsAnimation;
        }

        @Override // com.amazon.aps.iva.p3.v0.e
        public final long a() {
            long durationMillis;
            durationMillis = this.e.getDurationMillis();
            return durationMillis;
        }

        @Override // com.amazon.aps.iva.p3.v0.e
        public final float b() {
            float interpolatedFraction;
            interpolatedFraction = this.e.getInterpolatedFraction();
            return interpolatedFraction;
        }

        @Override // com.amazon.aps.iva.p3.v0.e
        public final int c() {
            int typeMask;
            typeMask = this.e.getTypeMask();
            return typeMask;
        }

        @Override // com.amazon.aps.iva.p3.v0.e
        public final void d(float f) {
            this.e.setFraction(f);
        }
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    /* loaded from: classes.dex */
    public static class e {
        public final int a;
        public float b;
        public final Interpolator c;
        public final long d;

        public e(int i, Interpolator interpolator, long j) {
            this.a = i;
            this.c = interpolator;
            this.d = j;
        }

        public long a() {
            return this.d;
        }

        public float b() {
            Interpolator interpolator = this.c;
            if (interpolator != null) {
                return interpolator.getInterpolation(this.b);
            }
            return this.b;
        }

        public int c() {
            return this.a;
        }

        public void d(float f) {
            this.b = f;
        }
    }

    public v0(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new d(com.amazon.aps.iva.d2.e0.b(i, interpolator, j));
        } else {
            this.a = new c(i, interpolator, j);
        }
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final com.amazon.aps.iva.g3.f a;
        public final com.amazon.aps.iva.g3.f b;

        public a(com.amazon.aps.iva.g3.f fVar, com.amazon.aps.iva.g3.f fVar2) {
            this.a = fVar;
            this.b = fVar2;
        }

        public final String toString() {
            return "Bounds{lower=" + this.a + " upper=" + this.b + "}";
        }

        public a(WindowInsetsAnimation.Bounds bounds) {
            Insets lowerBound;
            Insets upperBound;
            lowerBound = bounds.getLowerBound();
            this.a = com.amazon.aps.iva.g3.f.c(lowerBound);
            upperBound = bounds.getUpperBound();
            this.b = com.amazon.aps.iva.g3.f.c(upperBound);
        }
    }

    public v0(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new d(windowInsetsAnimation);
        }
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    /* loaded from: classes.dex */
    public static abstract class b {
        public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
        public static final int DISPATCH_MODE_STOP = 0;
        WindowInsets mDispachedInsets;
        private final int mDispatchMode;

        public b(int i) {
            this.mDispatchMode = i;
        }

        public final int getDispatchMode() {
            return this.mDispatchMode;
        }

        public abstract w0 onProgress(w0 w0Var, List<v0> list);

        public void onEnd(v0 v0Var) {
        }

        public void onPrepare(v0 v0Var) {
        }

        public a onStart(v0 v0Var, a aVar) {
            return aVar;
        }
    }
}
