package com.ellation.widgets.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.amazon.aps.iva.yb0.j;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.reflect.Field;
import kotlin.Metadata;
/* compiled from: AppBarLayoutBehavior.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/ellation/widgets/behavior/AppBarLayoutBehavior;", "Lcom/google/android/material/appbar/AppBarLayout$Behavior;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class AppBarLayoutBehavior extends AppBarLayout.Behavior {
    public a b;
    public boolean c;
    public boolean d;

    /* compiled from: AppBarLayoutBehavior.kt */
    /* loaded from: classes2.dex */
    public interface a {
        void a(int i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarLayoutBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.f(context, "context");
    }

    public static Field a() {
        Class superclass = AppBarLayoutBehavior.class.getSuperclass();
        j.c(superclass);
        Class superclass2 = superclass.getSuperclass();
        j.c(superclass2);
        Class superclass3 = superclass2.getSuperclass();
        j.c(superclass3);
        Field declaredField = superclass3.getDeclaredField("flingRunnable");
        j.e(declaredField, "javaClass.superclass!!.s…redField(\"flingRunnable\")");
        return declaredField;
    }

    public static Field b() {
        Class superclass = AppBarLayoutBehavior.class.getSuperclass();
        j.c(superclass);
        Class superclass2 = superclass.getSuperclass();
        j.c(superclass2);
        Class superclass3 = superclass2.getSuperclass();
        j.c(superclass3);
        Field declaredField = superclass3.getDeclaredField("scroller");
        j.e(declaredField, "javaClass.superclass!!.s…DeclaredField(\"scroller\")");
        return declaredField;
    }

    public final void c(AppBarLayout appBarLayout) {
        Runnable runnable;
        OverScroller overScroller;
        try {
            Field a2 = a();
            Field b = b();
            boolean z = true;
            a2.setAccessible(true);
            b.setAccessible(true);
            Object obj = a2.get(this);
            if (obj instanceof Runnable) {
                runnable = (Runnable) obj;
            } else {
                runnable = null;
            }
            Object obj2 = b.get(this);
            if (obj2 instanceof OverScroller) {
                overScroller = (OverScroller) obj2;
            } else {
                overScroller = null;
            }
            if (runnable != null) {
                appBarLayout.removeCallbacks(runnable);
                a2.set(this, null);
            }
            if (overScroller == null || overScroller.isFinished()) {
                z = false;
            }
            if (z) {
                overScroller.abortAnimation();
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout.Behavior, com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        AppBarLayout appBarLayout = (AppBarLayout) view;
        j.f(coordinatorLayout, "parent");
        j.f(appBarLayout, "child");
        j.f(motionEvent, "ev");
        this.d = this.c;
        if (motionEvent.getActionMasked() == 0) {
            c(appBarLayout);
        }
        return super.onInterceptTouchEvent(coordinatorLayout, appBarLayout, motionEvent);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.Behavior, com.google.android.material.appbar.ViewOffsetBehavior
    public final boolean setTopAndBottomOffset(int i) {
        a aVar = this.b;
        if (aVar != null) {
            aVar.a(i);
        }
        return super.setTopAndBottomOffset(i);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
        j.f(coordinatorLayout, "coordinatorLayout");
        j.f(appBarLayout, "child");
        j.f(view, "target");
        j.f(iArr, "consumed");
        if (i3 == 1) {
            this.c = true;
        }
        if (this.d) {
            return;
        }
        super.onNestedPreScroll(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void onNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        j.f(coordinatorLayout, "coordinatorLayout");
        j.f(appBarLayout, "child");
        j.f(view, "target");
        j.f(iArr, "consumed");
        if (this.d) {
            return;
        }
        super.onNestedScroll(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5, iArr);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
        j.f(coordinatorLayout, "parent");
        j.f(appBarLayout, "child");
        j.f(view, "directTargetChild");
        j.f(view2, "target");
        c(appBarLayout);
        return super.onStartNestedScroll(coordinatorLayout, appBarLayout, view, view2, i, i2);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void onStopNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        j.f(coordinatorLayout, "coordinatorLayout");
        j.f(appBarLayout, "abl");
        j.f(view, "target");
        super.onStopNestedScroll(coordinatorLayout, appBarLayout, view, i);
        this.c = false;
        this.d = false;
    }
}
