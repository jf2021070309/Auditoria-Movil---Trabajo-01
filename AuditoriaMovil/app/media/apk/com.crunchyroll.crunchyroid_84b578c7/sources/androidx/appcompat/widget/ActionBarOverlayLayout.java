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
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.f;
import com.amazon.aps.iva.k.a0;
import com.amazon.aps.iva.k.g;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r;
import com.amazon.aps.iva.p3.r0;
import com.amazon.aps.iva.p3.s;
import com.amazon.aps.iva.p3.t;
import com.amazon.aps.iva.p3.w0;
import com.amazon.aps.iva.q.h0;
import com.amazon.aps.iva.q.i0;
import com.crunchyroll.crunchyroid.R;
import java.util.WeakHashMap;
@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements h0, r, s {
    public static final int[] C = {R.attr.actionBarSize, 16842841};
    public final c A;
    public final t B;
    public int b;
    public int c;
    public ContentFrameLayout d;
    public ActionBarContainer e;
    public i0 f;
    public Drawable g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public final Rect o;
    public final Rect p;
    public final Rect q;
    public w0 r;
    public w0 s;
    public w0 t;
    public w0 u;
    public d v;
    public OverScroller w;
    public ViewPropertyAnimator x;
    public final a y;
    public final b z;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.x = null;
            actionBarOverlayLayout.l = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.x = null;
            actionBarOverlayLayout.l = false;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.k();
            actionBarOverlayLayout.x = actionBarOverlayLayout.e.animate().translationY(0.0f).setListener(actionBarOverlayLayout.y);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.k();
            actionBarOverlayLayout.x = actionBarOverlayLayout.e.animate().translationY(-actionBarOverlayLayout.e.getHeight()).setListener(actionBarOverlayLayout.y);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    /* loaded from: classes.dex */
    public static class e extends ViewGroup.MarginLayoutParams {
        public e() {
            super(-1, -1);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0;
        this.o = new Rect();
        this.p = new Rect();
        this.q = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        w0 w0Var = w0.b;
        this.r = w0Var;
        this.s = w0Var;
        this.t = w0Var;
        this.u = w0Var;
        this.y = new a();
        this.z = new b();
        this.A = new c();
        l(context);
        this.B = new t();
    }

    public static boolean j(FrameLayout frameLayout, Rect rect, boolean z) {
        boolean z2;
        e eVar = (e) frameLayout.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // com.amazon.aps.iva.q.h0
    public final boolean a() {
        m();
        return this.f.a();
    }

    @Override // com.amazon.aps.iva.q.h0
    public final boolean b() {
        m();
        return this.f.b();
    }

    @Override // com.amazon.aps.iva.q.h0
    public final boolean c() {
        m();
        return this.f.c();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // com.amazon.aps.iva.q.h0
    public final boolean d() {
        m();
        return this.f.d();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.g != null && !this.h) {
            if (this.e.getVisibility() == 0) {
                i = (int) (this.e.getTranslationY() + this.e.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.g.setBounds(0, i, getWidth(), this.g.getIntrinsicHeight() + i);
            this.g.draw(canvas);
        }
    }

    @Override // com.amazon.aps.iva.q.h0
    public final void e() {
        m();
        this.f.e();
    }

    @Override // com.amazon.aps.iva.q.h0
    public final void f(f fVar, g.d dVar) {
        m();
        this.f.f(fVar, dVar);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // com.amazon.aps.iva.q.h0
    public final boolean g() {
        m();
        return this.f.g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        t tVar = this.B;
        return tVar.b | tVar.a;
    }

    public CharSequence getTitle() {
        m();
        return this.f.getTitle();
    }

    @Override // com.amazon.aps.iva.q.h0
    public final void h(int i) {
        m();
        if (i != 2) {
            if (i != 5) {
                if (i == 109) {
                    setOverlayMode(true);
                    return;
                }
                return;
            }
            this.f.v();
            return;
        }
        this.f.m();
    }

    @Override // com.amazon.aps.iva.q.h0
    public final void i() {
        m();
        this.f.o();
    }

    public final void k() {
        removeCallbacks(this.z);
        removeCallbacks(this.A);
        ViewPropertyAnimator viewPropertyAnimator = this.x;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void l(Context context) {
        boolean z;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(C);
        boolean z2 = false;
        this.b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.g = drawable;
        if (drawable == null) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        }
        this.h = z2;
        this.w = new OverScroller(context);
    }

    public final void m() {
        i0 wrapper;
        if (this.d == null) {
            this.d = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.e = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof i0) {
                wrapper = (i0) findViewById;
            } else if (findViewById instanceof Toolbar) {
                wrapper = ((Toolbar) findViewById).getWrapper();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
            }
            this.f = wrapper;
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m();
        w0 h = w0.h(this, windowInsets);
        boolean j = j(this.e, new Rect(h.c(), h.e(), h.d(), h.b()), false);
        WeakHashMap<View, r0> weakHashMap = g0.a;
        Rect rect = this.o;
        g0.i.b(this, h, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        w0.k kVar = h.a;
        w0 m = kVar.m(i, i2, i3, i4);
        this.r = m;
        boolean z = true;
        if (!this.s.equals(m)) {
            this.s = this.r;
            j = true;
        }
        Rect rect2 = this.p;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
        } else {
            z = j;
        }
        if (z) {
            requestLayout();
        }
        return kVar.a().a.c().a.b().g();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        l(getContext());
        WeakHashMap<View, r0> weakHashMap = g0.a;
        g0.h.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int measuredHeight;
        w0.e bVar;
        m();
        measureChildWithMargins(this.e, i, 0, i2, 0);
        e eVar = (e) this.e.getLayoutParams();
        int max = Math.max(0, this.e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.e.getMeasuredState());
        WeakHashMap<View, r0> weakHashMap = g0.a;
        if ((g0.d.g(this) & 256) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            measuredHeight = this.b;
            if (this.j && this.e.getTabContainer() != null) {
                measuredHeight += this.b;
            }
        } else {
            measuredHeight = this.e.getVisibility() != 8 ? this.e.getMeasuredHeight() : 0;
        }
        Rect rect = this.o;
        Rect rect2 = this.q;
        rect2.set(rect);
        w0 w0Var = this.r;
        this.t = w0Var;
        if (!this.i && !z) {
            rect2.top += measuredHeight;
            rect2.bottom += 0;
            this.t = w0Var.a.m(0, measuredHeight, 0, 0);
        } else {
            com.amazon.aps.iva.g3.f b2 = com.amazon.aps.iva.g3.f.b(w0Var.c(), this.t.e() + measuredHeight, this.t.d(), this.t.b() + 0);
            w0 w0Var2 = this.t;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 30) {
                bVar = new w0.d(w0Var2);
            } else if (i3 >= 29) {
                bVar = new w0.c(w0Var2);
            } else {
                bVar = new w0.b(w0Var2);
            }
            bVar.g(b2);
            this.t = bVar.b();
        }
        j(this.d, rect2, true);
        if (!this.u.equals(this.t)) {
            w0 w0Var3 = this.t;
            this.u = w0Var3;
            g0.b(this.d, w0Var3);
        }
        measureChildWithMargins(this.d, i, 0, i2, 0);
        e eVar2 = (e) this.d.getLayoutParams();
        int max3 = Math.max(max, this.d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        boolean z2 = false;
        if (!this.k || !z) {
            return false;
        }
        this.w.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.w.getFinalY() > this.e.getHeight()) {
            z2 = true;
        }
        if (z2) {
            k();
            this.A.run();
        } else {
            k();
            this.z.run();
        }
        this.l = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // com.amazon.aps.iva.p3.s
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        onNestedScroll(view, i, i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        a0 a0Var;
        com.amazon.aps.iva.o.g gVar;
        this.B.a(i, 0);
        this.m = getActionBarHideOffset();
        k();
        d dVar = this.v;
        if (dVar == null || (gVar = (a0Var = (a0) dVar).t) == null) {
            return;
        }
        gVar.a();
        a0Var.t = null;
    }

    @Override // com.amazon.aps.iva.p3.r
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // com.amazon.aps.iva.p3.r
    public final void onStopNestedScroll(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i) {
        boolean z;
        boolean z2;
        super.onWindowSystemUiVisibilityChanged(i);
        m();
        int i2 = this.n ^ i;
        this.n = i;
        if ((i & 4) == 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 256) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        d dVar = this.v;
        if (dVar != null) {
            ((a0) dVar).p = !z2;
            if (!z && z2) {
                a0 a0Var = (a0) dVar;
                if (!a0Var.q) {
                    a0Var.q = true;
                    a0Var.z(true);
                }
            } else {
                a0 a0Var2 = (a0) dVar;
                if (a0Var2.q) {
                    a0Var2.q = false;
                    a0Var2.z(true);
                }
            }
        }
        if ((i2 & 256) != 0 && this.v != null) {
            WeakHashMap<View, r0> weakHashMap = g0.a;
            g0.h.c(this);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.c = i;
        d dVar = this.v;
        if (dVar != null) {
            ((a0) dVar).o = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        k();
        this.e.setTranslationY(-Math.max(0, Math.min(i, this.e.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.v = dVar;
        if (getWindowToken() != null) {
            ((a0) this.v).o = this.c;
            int i = this.n;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap<View, r0> weakHashMap = g0.a;
                g0.h.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.j = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.k) {
            this.k = z;
            if (!z) {
                k();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        m();
        this.f.setIcon(i);
    }

    public void setLogo(int i) {
        m();
        this.f.r(i);
    }

    public void setOverlayMode(boolean z) {
        boolean z2;
        this.i = z;
        if (z && getContext().getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.h = z2;
    }

    @Override // com.amazon.aps.iva.q.h0
    public void setWindowCallback(Window.Callback callback) {
        m();
        this.f.setWindowCallback(callback);
    }

    @Override // com.amazon.aps.iva.q.h0
    public void setWindowTitle(CharSequence charSequence) {
        m();
        this.f.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    @Override // com.amazon.aps.iva.p3.r
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // com.amazon.aps.iva.p3.r
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.e.getVisibility() != 0) {
            return false;
        }
        return this.k;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.k || this.l) {
            return;
        }
        if (this.m <= this.e.getHeight()) {
            k();
            postDelayed(this.z, 600L);
            return;
        }
        k();
        postDelayed(this.A, 600L);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.m + i2;
        this.m = i5;
        setActionBarHideOffset(i5);
    }

    public void setIcon(Drawable drawable) {
        m();
        this.f.setIcon(drawable);
    }

    @Override // com.amazon.aps.iva.p3.r
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }
}
