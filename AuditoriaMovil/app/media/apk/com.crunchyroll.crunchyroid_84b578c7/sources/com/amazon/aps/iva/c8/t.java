package com.amazon.aps.iva.c8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.media3.ui.c;
import com.crunchyroll.crunchyroid.R;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: PlayerControlViewLayoutManager.java */
/* loaded from: classes.dex */
public final class t {
    public boolean A;
    public boolean B;
    public final androidx.media3.ui.c a;
    public final View b;
    public final ViewGroup c;
    public final ViewGroup d;
    public final ViewGroup e;
    public final ViewGroup f;
    public final ViewGroup g;
    public final ViewGroup h;
    public final ViewGroup i;
    public final View j;
    public final View k;
    public final AnimatorSet l;
    public final AnimatorSet m;
    public final AnimatorSet n;
    public final AnimatorSet o;
    public final AnimatorSet p;
    public final ValueAnimator q;
    public final ValueAnimator r;
    public final com.amazon.aps.iva.e.h s = new com.amazon.aps.iva.e.h(this, 5);
    public final o t = new o(this, 0);
    public final p u = new p(this, 0);
    public final com.amazon.aps.iva.e.d v = new com.amazon.aps.iva.e.d(this, 8);
    public final com.amazon.aps.iva.m6.e w = new com.amazon.aps.iva.m6.e(this, 1);
    public final q x = new View.OnLayoutChangeListener() { // from class: com.amazon.aps.iva.c8.q
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            int i10;
            int height;
            int i11;
            int height2;
            boolean z;
            t tVar = t.this;
            androidx.media3.ui.c cVar = tVar.a;
            int width = (cVar.getWidth() - cVar.getPaddingLeft()) - cVar.getPaddingRight();
            int height3 = (cVar.getHeight() - cVar.getPaddingBottom()) - cVar.getPaddingTop();
            ViewGroup viewGroup = tVar.c;
            int d2 = t.d(viewGroup);
            boolean z2 = false;
            if (viewGroup != null) {
                i10 = viewGroup.getPaddingRight() + viewGroup.getPaddingLeft();
            } else {
                i10 = 0;
            }
            int i12 = d2 - i10;
            if (viewGroup == null) {
                height = 0;
            } else {
                height = viewGroup.getHeight();
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                }
            }
            if (viewGroup != null) {
                i11 = viewGroup.getPaddingBottom() + viewGroup.getPaddingTop();
            } else {
                i11 = 0;
            }
            int i13 = height - i11;
            int max = Math.max(i12, t.d(tVar.k) + t.d(tVar.i));
            ViewGroup viewGroup2 = tVar.d;
            if (viewGroup2 == null) {
                height2 = 0;
            } else {
                height2 = viewGroup2.getHeight();
                ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    height2 += marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                }
            }
            int i14 = (height2 * 2) + i13;
            if (width > max && height3 > i14) {
                z = false;
            } else {
                z = true;
            }
            if (tVar.A != z) {
                tVar.A = z;
                view.post(new o(tVar, 1));
            }
            if (i4 - i2 != i8 - i6) {
                z2 = true;
            }
            if (!tVar.A && z2) {
                view.post(new p(tVar, 1));
            }
        }
    };
    public boolean C = true;
    public int z = 0;
    public final ArrayList y = new ArrayList();

    /* compiled from: PlayerControlViewLayoutManager.java */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            t tVar = t.this;
            View view = tVar.b;
            if (view != null) {
                view.setVisibility(4);
            }
            ViewGroup viewGroup = tVar.c;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
            ViewGroup viewGroup2 = tVar.e;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            t tVar = t.this;
            View view = tVar.j;
            if ((view instanceof androidx.media3.ui.b) && !tVar.A) {
                androidx.media3.ui.b bVar = (androidx.media3.ui.b) view;
                ValueAnimator valueAnimator = bVar.F;
                if (valueAnimator.isStarted()) {
                    valueAnimator.cancel();
                }
                valueAnimator.setFloatValues(bVar.G, 0.0f);
                valueAnimator.setDuration(250L);
                valueAnimator.start();
            }
        }
    }

    /* compiled from: PlayerControlViewLayoutManager.java */
    /* loaded from: classes.dex */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            int i;
            t tVar = t.this;
            View view = tVar.b;
            if (view != null) {
                view.setVisibility(0);
            }
            ViewGroup viewGroup = tVar.c;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            ViewGroup viewGroup2 = tVar.e;
            if (viewGroup2 != null) {
                if (tVar.A) {
                    i = 0;
                } else {
                    i = 4;
                }
                viewGroup2.setVisibility(i);
            }
            View view2 = tVar.j;
            if ((view2 instanceof androidx.media3.ui.b) && !tVar.A) {
                androidx.media3.ui.b bVar = (androidx.media3.ui.b) view2;
                ValueAnimator valueAnimator = bVar.F;
                if (valueAnimator.isStarted()) {
                    valueAnimator.cancel();
                }
                bVar.H = false;
                valueAnimator.setFloatValues(bVar.G, 1.0f);
                valueAnimator.setDuration(250L);
                valueAnimator.start();
            }
        }
    }

    /* compiled from: PlayerControlViewLayoutManager.java */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        public final /* synthetic */ androidx.media3.ui.c a;

        public c(androidx.media3.ui.c cVar) {
            this.a = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            t tVar = t.this;
            tVar.i(1);
            if (tVar.B) {
                this.a.post(tVar.s);
                tVar.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            t.this.i(3);
        }
    }

    /* compiled from: PlayerControlViewLayoutManager.java */
    /* loaded from: classes.dex */
    public class d extends AnimatorListenerAdapter {
        public final /* synthetic */ androidx.media3.ui.c a;

        public d(androidx.media3.ui.c cVar) {
            this.a = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            t tVar = t.this;
            tVar.i(2);
            if (tVar.B) {
                this.a.post(tVar.s);
                tVar.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            t.this.i(3);
        }
    }

    /* compiled from: PlayerControlViewLayoutManager.java */
    /* loaded from: classes.dex */
    public class e extends AnimatorListenerAdapter {
        public final /* synthetic */ androidx.media3.ui.c a;

        public e(androidx.media3.ui.c cVar) {
            this.a = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            t tVar = t.this;
            tVar.i(2);
            if (tVar.B) {
                this.a.post(tVar.s);
                tVar.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            t.this.i(3);
        }
    }

    /* compiled from: PlayerControlViewLayoutManager.java */
    /* loaded from: classes.dex */
    public class f extends AnimatorListenerAdapter {
        public f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            t.this.i(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            t.this.i(4);
        }
    }

    /* compiled from: PlayerControlViewLayoutManager.java */
    /* loaded from: classes.dex */
    public class g extends AnimatorListenerAdapter {
        public g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            t.this.i(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            t.this.i(4);
        }
    }

    /* compiled from: PlayerControlViewLayoutManager.java */
    /* loaded from: classes.dex */
    public class h extends AnimatorListenerAdapter {
        public h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ViewGroup viewGroup = t.this.f;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            t tVar = t.this;
            ViewGroup viewGroup = tVar.h;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
                ViewGroup viewGroup2 = tVar.h;
                viewGroup2.setTranslationX(viewGroup2.getWidth());
                ViewGroup viewGroup3 = tVar.h;
                viewGroup3.scrollTo(viewGroup3.getWidth(), 0);
            }
        }
    }

    /* compiled from: PlayerControlViewLayoutManager.java */
    /* loaded from: classes.dex */
    public class i extends AnimatorListenerAdapter {
        public i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ViewGroup viewGroup = t.this.h;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            ViewGroup viewGroup = t.this.f;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.amazon.aps.iva.c8.q] */
    public t(androidx.media3.ui.c cVar) {
        this.a = cVar;
        this.b = cVar.findViewById(R.id.exo_controls_background);
        this.c = (ViewGroup) cVar.findViewById(R.id.exo_center_controls);
        this.e = (ViewGroup) cVar.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) cVar.findViewById(R.id.exo_bottom_bar);
        this.d = viewGroup;
        this.i = (ViewGroup) cVar.findViewById(R.id.exo_time);
        View findViewById = cVar.findViewById(R.id.exo_progress);
        this.j = findViewById;
        this.f = (ViewGroup) cVar.findViewById(R.id.exo_basic_controls);
        this.g = (ViewGroup) cVar.findViewById(R.id.exo_extra_controls);
        this.h = (ViewGroup) cVar.findViewById(R.id.exo_extra_controls_scroll_view);
        View findViewById2 = cVar.findViewById(R.id.exo_overflow_show);
        this.k = findViewById2;
        View findViewById3 = cVar.findViewById(R.id.exo_overflow_hide);
        if (findViewById2 != null && findViewById3 != null) {
            findViewById2.setOnClickListener(new r(this, 0));
            findViewById3.setOnClickListener(new s(this, 0));
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new m(this, 1));
        ofFloat.addListener(new a());
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.amazon.aps.iva.c8.n
            public final /* synthetic */ t b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = r2;
                t tVar = this.b;
                switch (i2) {
                    case 0:
                        tVar.getClass();
                        tVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        tVar.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = tVar.b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = tVar.c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = tVar.e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                            return;
                        }
                        return;
                }
            }
        });
        ofFloat2.addListener(new b());
        Resources resources = cVar.getResources();
        float dimension = resources.getDimension(R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(R.dimen.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new c(cVar));
        animatorSet.play(ofFloat).with(e(0.0f, dimension, findViewById)).with(e(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new d(cVar));
        animatorSet2.play(e(dimension, dimension2, findViewById)).with(e(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new e(cVar));
        animatorSet3.play(ofFloat).with(e(0.0f, dimension2, findViewById)).with(e(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new f());
        animatorSet4.play(ofFloat2).with(e(dimension, 0.0f, findViewById)).with(e(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new g());
        animatorSet5.play(ofFloat2).with(e(dimension2, 0.0f, findViewById)).with(e(dimension2, 0.0f, viewGroup));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.q = ofFloat3;
        ofFloat3.setDuration(250L);
        ofFloat3.addUpdateListener(new m(this, 0));
        ofFloat3.addListener(new h());
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.r = ofFloat4;
        ofFloat4.setDuration(250L);
        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.amazon.aps.iva.c8.n
            public final /* synthetic */ t b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = r2;
                t tVar = this.b;
                switch (i2) {
                    case 0:
                        tVar.getClass();
                        tVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        tVar.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = tVar.b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = tVar.c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = tVar.e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                            return;
                        }
                        return;
                }
            }
        });
        ofFloat4.addListener(new i());
    }

    public static void a(t tVar, View view) {
        tVar.g();
        if (view.getId() == R.id.exo_overflow_show) {
            tVar.q.start();
        } else if (view.getId() == R.id.exo_overflow_hide) {
            tVar.r.start();
        }
    }

    public static int d(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        }
        return width;
    }

    public static ObjectAnimator e(float f2, float f3, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", f2, f3);
    }

    public static boolean j(View view) {
        int id = view.getId();
        if (id != R.id.exo_bottom_bar && id != R.id.exo_prev && id != R.id.exo_next && id != R.id.exo_rew && id != R.id.exo_rew_with_amount && id != R.id.exo_ffwd && id != R.id.exo_ffwd_with_amount) {
            return false;
        }
        return true;
    }

    public final void b(float f2) {
        ViewGroup viewGroup = this.h;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f2) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f2);
        }
        ViewGroup viewGroup3 = this.f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f2);
        }
    }

    public final boolean c(View view) {
        if (view != null && this.y.contains(view)) {
            return true;
        }
        return false;
    }

    public final void f() {
        androidx.media3.ui.c cVar = this.a;
        cVar.removeCallbacks(this.w);
        cVar.removeCallbacks(this.t);
        cVar.removeCallbacks(this.v);
        cVar.removeCallbacks(this.u);
    }

    public final void g() {
        if (this.z == 3) {
            return;
        }
        f();
        androidx.media3.ui.c cVar = this.a;
        int showTimeoutMs = cVar.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.C) {
                long j = showTimeoutMs;
                if (j >= 0) {
                    cVar.postDelayed(this.w, j);
                }
            } else if (this.z == 1) {
                cVar.postDelayed(this.u, 2000L);
            } else {
                long j2 = showTimeoutMs;
                if (j2 >= 0) {
                    cVar.postDelayed(this.v, j2);
                }
            }
        }
    }

    public final void h(View view, boolean z) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.y;
        if (!z) {
            view.setVisibility(8);
            arrayList.remove(view);
            return;
        }
        if (this.A && j(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        arrayList.add(view);
    }

    public final void i(int i2) {
        int i3 = this.z;
        this.z = i2;
        androidx.media3.ui.c cVar = this.a;
        if (i2 == 2) {
            cVar.setVisibility(8);
        } else if (i3 == 2) {
            cVar.setVisibility(0);
        }
        if (i3 != i2) {
            Iterator<c.l> it = cVar.e.iterator();
            while (it.hasNext()) {
                it.next().G(cVar.getVisibility());
            }
        }
    }

    public final void k() {
        if (!this.C) {
            i(0);
            g();
            return;
        }
        int i2 = this.z;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        return;
                    }
                } else {
                    this.B = true;
                }
            } else {
                this.p.start();
            }
        } else {
            this.o.start();
        }
        g();
    }
}
