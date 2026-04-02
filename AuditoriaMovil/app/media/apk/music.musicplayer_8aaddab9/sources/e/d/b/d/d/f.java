package e.d.b.d.d;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.i.k.d0;
import c.i.k.j0;
import ch.qos.logback.classic.Level;
import com.google.android.material.appbar.AppBarLayout;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
public abstract class f extends g<View> {

    /* renamed from: c  reason: collision with root package name */
    public final Rect f6356c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f6357d;

    /* renamed from: e  reason: collision with root package name */
    public int f6358e;

    /* renamed from: f  reason: collision with root package name */
    public int f6359f;

    public f() {
        this.f6356c = new Rect();
        this.f6357d = new Rect();
        this.f6358e = 0;
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6356c = new Rect();
        this.f6357d = new Rect();
        this.f6358e = 0;
    }

    @Override // e.d.b.d.d.g
    public void C(CoordinatorLayout coordinatorLayout, View view, int i2) {
        AppBarLayout F = ((AppBarLayout.ScrollingViewBehavior) this).F(coordinatorLayout.d(view));
        if (F == null) {
            coordinatorLayout.r(view, i2);
            this.f6358e = 0;
            return;
        }
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        Rect rect = this.f6356c;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, F.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((F.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        j0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null) {
            AtomicInteger atomicInteger = d0.a;
            if (d0.c.b(coordinatorLayout) && !d0.c.b(view)) {
                rect.left = lastWindowInsets.c() + rect.left;
                rect.right -= lastWindowInsets.d();
            }
        }
        Rect rect2 = this.f6357d;
        int i3 = fVar.f329c;
        Gravity.apply(i3 == 0 ? 8388659 : i3, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i2);
        int E = E(F);
        view.layout(rect2.left, rect2.top - E, rect2.right, rect2.bottom - E);
        this.f6358e = rect2.top - F.getBottom();
    }

    public final int E(View view) {
        int i2;
        if (this.f6359f == 0) {
            return 0;
        }
        float f2 = 0.0f;
        if (view instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).a;
            int E = cVar instanceof AppBarLayout.BaseBehavior ? ((AppBarLayout.BaseBehavior) cVar).E() : 0;
            if ((downNestedPreScrollRange == 0 || totalScrollRange + E > downNestedPreScrollRange) && (i2 = totalScrollRange - downNestedPreScrollRange) != 0) {
                f2 = 1.0f + (E / i2);
            }
        }
        int i3 = this.f6359f;
        return c.i.a.k((int) (f2 * i3), 0, i3);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int i5) {
        j0 lastWindowInsets;
        int i6 = view.getLayoutParams().height;
        if (i6 == -1 || i6 == -2) {
            AppBarLayout F = ((AppBarLayout.ScrollingViewBehavior) this).F(coordinatorLayout.d(view));
            if (F != null) {
                int size = View.MeasureSpec.getSize(i4);
                if (size > 0) {
                    AtomicInteger atomicInteger = d0.a;
                    if (d0.c.b(F) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                        size += lastWindowInsets.b() + lastWindowInsets.e();
                    }
                } else {
                    size = coordinatorLayout.getHeight();
                }
                coordinatorLayout.s(view, i2, i3, View.MeasureSpec.makeMeasureSpec((size + F.getTotalScrollRange()) - F.getMeasuredHeight(), i6 == -1 ? 1073741824 : Level.ALL_INT), i5);
                return true;
            }
            return false;
        }
        return false;
    }
}
