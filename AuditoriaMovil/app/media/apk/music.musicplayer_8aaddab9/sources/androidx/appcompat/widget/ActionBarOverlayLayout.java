package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import c.b.c.b0;
import c.b.h.g;
import c.b.h.i.m;
import c.b.i.c0;
import c.b.i.d0;
import c.b.i.g1;
import c.i.k.d0;
import c.i.k.j0;
import c.i.k.q;
import c.i.k.r;
import c.i.k.s;
import c.i.k.t;
import ch.qos.logback.classic.Level;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements c0, s, q, r {
    public static final int[] a = {R.attr.actionBarSize, 16842841};
    public OverScroller A;
    public ViewPropertyAnimator B;
    public final AnimatorListenerAdapter C;
    public final Runnable D;
    public final Runnable E;
    public final t F;

    /* renamed from: b  reason: collision with root package name */
    public int f178b;

    /* renamed from: c  reason: collision with root package name */
    public int f179c;

    /* renamed from: d  reason: collision with root package name */
    public ContentFrameLayout f180d;

    /* renamed from: e  reason: collision with root package name */
    public ActionBarContainer f181e;

    /* renamed from: f  reason: collision with root package name */
    public d0 f182f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f183g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f184h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f185i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f186j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f187k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f188l;

    /* renamed from: m  reason: collision with root package name */
    public int f189m;

    /* renamed from: n  reason: collision with root package name */
    public int f190n;
    public final Rect o;
    public final Rect p;
    public final Rect q;
    public final Rect r;
    public final Rect s;
    public final Rect t;
    public final Rect u;
    public j0 v;
    public j0 w;
    public j0 x;
    public j0 y;
    public d z;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = null;
            actionBarOverlayLayout.f188l = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = null;
            actionBarOverlayLayout.f188l = false;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = actionBarOverlayLayout.f181e.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.C);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = actionBarOverlayLayout.f181e.animate().translationY(-ActionBarOverlayLayout.this.f181e.getHeight()).setListener(ActionBarOverlayLayout.this.C);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    /* loaded from: classes.dex */
    public static class e extends ViewGroup.MarginLayoutParams {
        public e(int i2, int i3) {
            super(i2, i3);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f179c = 0;
        this.o = new Rect();
        this.p = new Rect();
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        j0 j0Var = j0.a;
        this.v = j0Var;
        this.w = j0Var;
        this.x = j0Var;
        this.y = j0Var;
        this.C = new a();
        this.D = new b();
        this.E = new c();
        r(context);
        this.F = new t();
    }

    @Override // c.b.i.c0
    public void a(Menu menu, m.a aVar) {
        s();
        this.f182f.a(menu, aVar);
    }

    @Override // c.b.i.c0
    public boolean b() {
        s();
        return this.f182f.b();
    }

    @Override // c.b.i.c0
    public void c() {
        s();
        this.f182f.c();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // c.b.i.c0
    public boolean d() {
        s();
        return this.f182f.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        if (this.f183g == null || this.f184h) {
            return;
        }
        if (this.f181e.getVisibility() == 0) {
            i2 = (int) (this.f181e.getTranslationY() + this.f181e.getBottom() + 0.5f);
        } else {
            i2 = 0;
        }
        this.f183g.setBounds(0, i2, getWidth(), this.f183g.getIntrinsicHeight() + i2);
        this.f183g.draw(canvas);
    }

    @Override // c.i.k.r
    public void e(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    @Override // c.b.i.c0
    public boolean f() {
        s();
        return this.f182f.f();
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT >= 21) {
            return super.fitSystemWindows(rect);
        }
        s();
        boolean p = p(this.f181e, rect, true, true, false, true);
        this.r.set(rect);
        Rect rect2 = this.r;
        Rect rect3 = this.o;
        Method method = g1.a;
        if (method != null) {
            try {
                method.invoke(this, rect2, rect3);
            } catch (Exception unused) {
            }
        }
        if (!this.s.equals(this.r)) {
            this.s.set(this.r);
            p = true;
        }
        if (!this.p.equals(this.o)) {
            this.p.set(this.o);
            p = true;
        }
        if (p) {
            requestLayout();
        }
        return true;
    }

    @Override // c.b.i.c0
    public boolean g() {
        s();
        return this.f182f.g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f181e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.F.a();
    }

    public CharSequence getTitle() {
        s();
        return this.f182f.getTitle();
    }

    @Override // c.b.i.c0
    public boolean h() {
        s();
        return this.f182f.h();
    }

    @Override // c.b.i.c0
    public void i(int i2) {
        s();
        if (i2 == 2) {
            this.f182f.v();
        } else if (i2 == 5) {
            this.f182f.w();
        } else if (i2 != 109) {
        } else {
            setOverlayMode(true);
        }
    }

    @Override // c.b.i.c0
    public void j() {
        s();
        this.f182f.i();
    }

    @Override // c.i.k.q
    public void k(View view, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    @Override // c.i.k.q
    public boolean l(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    @Override // c.i.k.q
    public void m(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    @Override // c.i.k.q
    public void n(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // c.i.k.q
    public void o(View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 == 0) {
            onNestedPreScroll(view, i2, i3, iArr);
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        s();
        j0 k2 = j0.k(windowInsets, this);
        boolean p = p(this.f181e, new Rect(k2.c(), k2.e(), k2.d(), k2.b()), true, true, false, true);
        Rect rect = this.o;
        AtomicInteger atomicInteger = c.i.k.d0.a;
        if (Build.VERSION.SDK_INT >= 21) {
            d0.h.b(this, k2, rect);
        }
        Rect rect2 = this.o;
        j0 m2 = k2.f2164b.m(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.v = m2;
        boolean z = true;
        if (!this.w.equals(m2)) {
            this.w = this.v;
            p = true;
        }
        if (this.p.equals(this.o)) {
            z = p;
        } else {
            this.p.set(this.o);
        }
        if (z) {
            requestLayout();
        }
        return k2.f2164b.a().f2164b.c().f2164b.b().i();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        r(getContext());
        c.i.k.d0.y(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i8 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        int measuredHeight;
        s();
        measureChildWithMargins(this.f181e, i2, 0, i3, 0);
        e eVar = (e) this.f181e.getLayoutParams();
        int max = Math.max(0, this.f181e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f181e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f181e.getMeasuredState());
        AtomicInteger atomicInteger = c.i.k.d0.a;
        boolean z = (d0.c.g(this) & 256) != 0;
        if (z) {
            measuredHeight = this.f178b;
            if (this.f186j && this.f181e.getTabContainer() != null) {
                measuredHeight += this.f178b;
            }
        } else {
            measuredHeight = this.f181e.getVisibility() != 8 ? this.f181e.getMeasuredHeight() : 0;
        }
        this.q.set(this.o);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 21) {
            this.x = this.v;
        } else {
            this.t.set(this.r);
        }
        if (!this.f185i && !z) {
            Rect rect = this.q;
            rect.top += measuredHeight;
            rect.bottom += 0;
            if (i4 >= 21) {
                this.x = this.x.f2164b.m(0, measuredHeight, 0, 0);
            }
        } else if (i4 >= 21) {
            c.i.e.c b2 = c.i.e.c.b(this.x.c(), this.x.e() + measuredHeight, this.x.d(), this.x.b() + 0);
            j0 j0Var = this.x;
            j0.e dVar = i4 >= 30 ? new j0.d(j0Var) : i4 >= 29 ? new j0.c(j0Var) : i4 >= 20 ? new j0.b(j0Var) : new j0.e(j0Var);
            dVar.d(b2);
            this.x = dVar.b();
        } else {
            Rect rect2 = this.t;
            rect2.top += measuredHeight;
            rect2.bottom += 0;
        }
        p(this.f180d, this.q, true, true, true, true);
        if (i4 >= 21 && !this.y.equals(this.x)) {
            j0 j0Var2 = this.x;
            this.y = j0Var2;
            c.i.k.d0.e(this.f180d, j0Var2);
        } else if (i4 < 21 && !this.u.equals(this.t)) {
            this.u.set(this.t);
            this.f180d.a(this.t);
        }
        measureChildWithMargins(this.f180d, i2, 0, i3, 0);
        e eVar2 = (e) this.f180d.getLayoutParams();
        int max3 = Math.max(max, this.f180d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.f180d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f180d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i2, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i3, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, c.i.k.s
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        if (this.f187k && z) {
            this.A.fling(0, 0, 0, (int) f3, 0, 0, Level.ALL_INT, Integer.MAX_VALUE);
            if (this.A.getFinalY() > this.f181e.getHeight()) {
                q();
                this.E.run();
            } else {
                q();
                this.D.run();
            }
            this.f188l = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, c.i.k.s
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, c.i.k.s
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, c.i.k.s
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.f189m + i3;
        this.f189m = i6;
        setActionBarHideOffset(i6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, c.i.k.s
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        b0 b0Var;
        g gVar;
        this.F.a = i2;
        this.f189m = getActionBarHideOffset();
        q();
        d dVar = this.z;
        if (dVar == null || (gVar = (b0Var = (b0) dVar).w) == null) {
            return;
        }
        gVar.a();
        b0Var.w = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, c.i.k.s
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f181e.getVisibility() != 0) {
            return false;
        }
        return this.f187k;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, c.i.k.s
    public void onStopNestedScroll(View view) {
        if (this.f187k && !this.f188l) {
            if (this.f189m <= this.f181e.getHeight()) {
                q();
                postDelayed(this.D, 600L);
            } else {
                q();
                postDelayed(this.E, 600L);
            }
        }
        d dVar = this.z;
        if (dVar != null) {
            Objects.requireNonNull((b0) dVar);
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i2) {
        super.onWindowSystemUiVisibilityChanged(i2);
        s();
        int i3 = this.f190n ^ i2;
        this.f190n = i2;
        boolean z = (i2 & 4) == 0;
        boolean z2 = (i2 & 256) != 0;
        d dVar = this.z;
        if (dVar != null) {
            ((b0) dVar).r = !z2;
            if (z || !z2) {
                b0 b0Var = (b0) dVar;
                if (b0Var.t) {
                    b0Var.t = false;
                    b0Var.x(true);
                }
            } else {
                b0 b0Var2 = (b0) dVar;
                if (!b0Var2.t) {
                    b0Var2.t = true;
                    b0Var2.x(true);
                }
            }
        }
        if ((i3 & 256) == 0 || this.z == null) {
            return;
        }
        c.i.k.d0.y(this);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.f179c = i2;
        d dVar = this.z;
        if (dVar != null) {
            ((b0) dVar).q = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = 1
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = 1
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = 1
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.p(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    public void q() {
        removeCallbacks(this.D);
        removeCallbacks(this.E);
        ViewPropertyAnimator viewPropertyAnimator = this.B;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void r(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(a);
        this.f178b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f183g = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f184h = context.getApplicationInfo().targetSdkVersion < 19;
        this.A = new OverScroller(context);
    }

    public void s() {
        c.b.i.d0 wrapper;
        if (this.f180d == null) {
            this.f180d = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f181e = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof c.b.i.d0) {
                wrapper = (c.b.i.d0) findViewById;
            } else if (!(findViewById instanceof Toolbar)) {
                StringBuilder y = e.a.d.a.a.y("Can't make a decor toolbar out of ");
                y.append(findViewById.getClass().getSimpleName());
                throw new IllegalStateException(y.toString());
            } else {
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f182f = wrapper;
        }
    }

    public void setActionBarHideOffset(int i2) {
        q();
        this.f181e.setTranslationY(-Math.max(0, Math.min(i2, this.f181e.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.z = dVar;
        if (getWindowToken() != null) {
            ((b0) this.z).q = this.f179c;
            int i2 = this.f190n;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                c.i.k.d0.y(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f186j = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f187k) {
            this.f187k = z;
            if (z) {
                return;
            }
            q();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i2) {
        s();
        this.f182f.setIcon(i2);
    }

    public void setIcon(Drawable drawable) {
        s();
        this.f182f.setIcon(drawable);
    }

    public void setLogo(int i2) {
        s();
        this.f182f.n(i2);
    }

    public void setOverlayMode(boolean z) {
        this.f185i = z;
        this.f184h = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i2) {
    }

    @Override // c.b.i.c0
    public void setWindowCallback(Window.Callback callback) {
        s();
        this.f182f.setWindowCallback(callback);
    }

    @Override // c.b.i.c0
    public void setWindowTitle(CharSequence charSequence) {
        s();
        this.f182f.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
