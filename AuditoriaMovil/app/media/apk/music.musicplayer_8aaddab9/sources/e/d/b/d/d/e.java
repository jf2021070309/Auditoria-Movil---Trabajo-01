package e.d.b.d.d;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.i.k.d0;
import ch.qos.logback.classic.Level;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;
import java.util.Objects;
/* loaded from: classes2.dex */
public abstract class e<V extends View> extends g<V> {

    /* renamed from: c  reason: collision with root package name */
    public Runnable f6347c;

    /* renamed from: d  reason: collision with root package name */
    public OverScroller f6348d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6349e;

    /* renamed from: f  reason: collision with root package name */
    public int f6350f;

    /* renamed from: g  reason: collision with root package name */
    public int f6351g;

    /* renamed from: h  reason: collision with root package name */
    public int f6352h;

    /* renamed from: i  reason: collision with root package name */
    public VelocityTracker f6353i;

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public final CoordinatorLayout a;

        /* renamed from: b  reason: collision with root package name */
        public final V f6354b;

        public a(CoordinatorLayout coordinatorLayout, V v) {
            this.a = coordinatorLayout;
            this.f6354b = v;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f6354b == null || (overScroller = e.this.f6348d) == null) {
                return;
            }
            if (overScroller.computeScrollOffset()) {
                e eVar = e.this;
                eVar.G(this.a, this.f6354b, eVar.f6348d.getCurrY());
                d0.c.m(this.f6354b, this);
                return;
            }
            e eVar2 = e.this;
            CoordinatorLayout coordinatorLayout = this.a;
            V v = this.f6354b;
            AppBarLayout.BaseBehavior baseBehavior = (AppBarLayout.BaseBehavior) eVar2;
            Objects.requireNonNull(baseBehavior);
            AppBarLayout appBarLayout = (AppBarLayout) v;
            baseBehavior.O(coordinatorLayout, appBarLayout);
            if (appBarLayout.f4518j) {
                appBarLayout.c(appBarLayout.d(baseBehavior.K(coordinatorLayout)));
            }
        }
    }

    public e() {
        this.f6350f = -1;
        this.f6352h = -1;
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6350f = -1;
        this.f6352h = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean A(androidx.coordinatorlayout.widget.CoordinatorLayout r21, V r22, android.view.MotionEvent r23) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d.b.d.d.e.A(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public abstract int E();

    public final int F(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4) {
        return H(coordinatorLayout, v, E() - i2, i3, i4);
    }

    public int G(CoordinatorLayout coordinatorLayout, V v, int i2) {
        return H(coordinatorLayout, v, i2, Level.ALL_INT, Integer.MAX_VALUE);
    }

    public abstract int H(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean j(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        View view;
        int findPointerIndex;
        if (this.f6352h < 0) {
            this.f6352h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f6349e) {
            int i2 = this.f6350f;
            if (i2 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i2)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.f6351g) > this.f6352h) {
                this.f6351g = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f6350f = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            AppBarLayout appBarLayout = (AppBarLayout) v;
            WeakReference<View> weakReference = ((AppBarLayout.BaseBehavior) this).f4527n;
            boolean z = (weakReference == null || ((view = weakReference.get()) != null && view.isShown() && !view.canScrollVertically(-1))) && coordinatorLayout.p(v, x, y2);
            this.f6349e = z;
            if (z) {
                this.f6351g = y2;
                this.f6350f = motionEvent.getPointerId(0);
                if (this.f6353i == null) {
                    this.f6353i = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f6348d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f6348d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f6353i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }
}
