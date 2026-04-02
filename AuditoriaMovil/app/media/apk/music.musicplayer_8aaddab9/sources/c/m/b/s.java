package c.m.b;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import music.musicplayer.R;
/* loaded from: classes.dex */
public final class s extends FrameLayout {
    public final List<View> a;

    /* renamed from: b  reason: collision with root package name */
    public final List<View> f2405b;

    /* renamed from: c  reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f2406c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2407d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        super(context, attributeSet);
        View view;
        h.o.c.j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        h.o.c.j.e(attributeSet, "attrs");
        h.o.c.j.e(fragmentManager, "fm");
        this.a = new ArrayList();
        this.f2405b = new ArrayList();
        this.f2407d = true;
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = c.m.a.f2307b;
        h.o.c.j.d(iArr, "FragmentContainerView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment E = fragmentManager.E(id);
        if (classAttribute != null && E == null) {
            if (id == -1) {
                String i2 = string != null ? h.o.c.j.i(" with tag ", string) : "";
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + ((Object) classAttribute) + i2);
            }
            Fragment a = fragmentManager.H().a(context.getClassLoader(), classAttribute);
            h.o.c.j.d(a, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a.onInflate(context, attributeSet, (Bundle) null);
            d dVar = new d(fragmentManager);
            dVar.p = true;
            a.mContainer = this;
            dVar.d(getId(), a, string, 1);
            if (dVar.f2320g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            dVar.f2321h = false;
            dVar.q.B(dVar, true);
        }
        Iterator it = ((ArrayList) fragmentManager.f402c.e()).iterator();
        while (it.hasNext()) {
            b0 b0Var = (b0) it.next();
            Fragment fragment = b0Var.f2309c;
            if (fragment.mContainerId == getId() && (view = fragment.mView) != null && view.getParent() == null) {
                fragment.mContainer = this;
                b0Var.b();
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        h.o.c.j.e(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof Fragment ? (Fragment) tag : null) != null) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        c.i.k.j0 t;
        h.o.c.j.e(windowInsets, "insets");
        c.i.k.j0 k2 = c.i.k.j0.k(windowInsets, null);
        h.o.c.j.d(k2, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f2406c;
        if (onApplyWindowInsetsListener != null) {
            h.o.c.j.c(onApplyWindowInsetsListener);
            h.o.c.j.e(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            h.o.c.j.e(this, "v");
            h.o.c.j.e(windowInsets, "insets");
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            h.o.c.j.d(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            t = c.i.k.j0.k(onApplyWindowInsets, null);
        } else {
            t = c.i.k.d0.t(this, k2);
        }
        if (!t.h()) {
            int i2 = 0;
            int childCount = getChildCount();
            if (childCount > 0) {
                while (true) {
                    int i3 = i2 + 1;
                    c.i.k.d0.e(getChildAt(i2), t);
                    if (i3 >= childCount) {
                        break;
                    }
                    i2 = i3;
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        h.o.c.j.e(canvas, "canvas");
        if (this.f2407d) {
            for (View view : this.a) {
                super.drawChild(canvas, view, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        h.o.c.j.e(canvas, "canvas");
        h.o.c.j.e(view, "child");
        if (this.f2407d && (!this.a.isEmpty()) && this.a.contains(view)) {
            return false;
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        h.o.c.j.e(view, "view");
        this.f2405b.remove(view);
        if (this.a.remove(view)) {
            this.f2407d = true;
        }
        super.endViewTransition(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v12, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    public final <F extends Fragment> F getFragment() {
        Fragment fragment;
        FragmentManager supportFragmentManager;
        o oVar = null;
        s sVar = this;
        while (true) {
            if (sVar == 0) {
                fragment = null;
                break;
            }
            Object tag = sVar.getTag(R.id.fragment_container_view_tag);
            fragment = tag instanceof Fragment ? (Fragment) tag : null;
            if (fragment != null) {
                break;
            }
            ViewParent parent = sVar.getParent();
            sVar = parent instanceof View ? (View) parent : 0;
        }
        if (fragment == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof o) {
                    oVar = (o) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (oVar == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            supportFragmentManager = oVar.getSupportFragmentManager();
        } else if (!fragment.isAdded()) {
            throw new IllegalStateException("The Fragment " + fragment + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        } else {
            supportFragmentManager = fragment.getChildFragmentManager();
        }
        return (F) supportFragmentManager.E(getId());
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        h.o.c.j.e(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount() - 1;
        if (childCount >= 0) {
            while (true) {
                int i2 = childCount - 1;
                View childAt = getChildAt(childCount);
                h.o.c.j.d(childAt, "view");
                if (this.f2405b.contains(childAt)) {
                    this.a.add(childAt);
                }
                if (i2 < 0) {
                    break;
                }
                childCount = i2;
            }
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        h.o.c.j.e(view, "view");
        if (this.f2405b.contains(view)) {
            this.a.add(view);
        }
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i2) {
        View childAt = getChildAt(i2);
        h.o.c.j.d(childAt, "view");
        if (this.f2405b.contains(childAt)) {
            this.a.add(childAt);
        }
        super.removeViewAt(i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        h.o.c.j.e(view, "view");
        if (this.f2405b.contains(view)) {
            this.a.add(view);
        }
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i2, int i3) {
        int i4 = i2 + i3;
        if (i2 < i4) {
            int i5 = i2;
            while (true) {
                int i6 = i5 + 1;
                View childAt = getChildAt(i5);
                h.o.c.j.d(childAt, "view");
                if (this.f2405b.contains(childAt)) {
                    this.a.add(childAt);
                }
                if (i6 >= i4) {
                    break;
                }
                i5 = i6;
            }
        }
        super.removeViews(i2, i3);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i2, int i3) {
        int i4 = i2 + i3;
        if (i2 < i4) {
            int i5 = i2;
            while (true) {
                int i6 = i5 + 1;
                View childAt = getChildAt(i5);
                h.o.c.j.d(childAt, "view");
                if (this.f2405b.contains(childAt)) {
                    this.a.add(childAt);
                }
                if (i6 >= i4) {
                    break;
                }
                i5 = i6;
            }
        }
        super.removeViewsInLayout(i2, i3);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.f2407d = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        h.o.c.j.e(onApplyWindowInsetsListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f2406c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        h.o.c.j.e(view, "view");
        if (view.getParent() == this) {
            this.f2405b.add(view);
        }
        super.startViewTransition(view);
    }
}
