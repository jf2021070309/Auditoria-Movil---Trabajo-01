package androidx.fragment.app;

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
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.amazon.aps.iva.p3.w0;
import com.crunchyroll.crunchyroid.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Metadata;
/* compiled from: FragmentContainerView.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0001J\u0019\u0010\u000e\u001a\u00028\u0000\"\n\b\u0000\u0010\r*\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/animation/LayoutTransition;", "transition", "Lcom/amazon/aps/iva/kb0/q;", "setLayoutTransition", "Landroid/view/View$OnApplyWindowInsetsListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnApplyWindowInsetsListener", "", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "Landroidx/fragment/app/Fragment;", "F", "getFragment", "()Landroidx/fragment/app/Fragment;", "fragment_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {
    public final ArrayList b;
    public final ArrayList c;
    public View.OnApplyWindowInsetsListener d;
    public boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        com.amazon.aps.iva.yb0.j.f(context, "context");
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.e = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.m4.a.b, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    public final void a(View view) {
        if (this.c.contains(view)) {
            this.b.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Fragment fragment;
        com.amazon.aps.iva.yb0.j.f(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            fragment = (Fragment) tag;
        } else {
            fragment = null;
        }
        if (fragment != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        w0 w0Var;
        com.amazon.aps.iva.yb0.j.f(windowInsets, "insets");
        w0 h = w0.h(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.d;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            com.amazon.aps.iva.yb0.j.e(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            w0Var = w0.h(null, onApplyWindowInsets);
        } else {
            WeakHashMap<View, r0> weakHashMap = g0.a;
            WindowInsets g = h.g();
            if (g != null) {
                WindowInsets b = g0.h.b(this, g);
                if (!b.equals(g)) {
                    h = w0.h(this, b);
                }
            }
            w0Var = h;
        }
        if (!w0Var.a.n()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                g0.b(getChildAt(i), w0Var);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        com.amazon.aps.iva.yb0.j.f(canvas, "canvas");
        if (this.e) {
            for (View view : this.b) {
                super.drawChild(canvas, view, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        com.amazon.aps.iva.yb0.j.f(canvas, "canvas");
        com.amazon.aps.iva.yb0.j.f(view, "child");
        if (this.e) {
            ArrayList arrayList = this.b;
            if ((!arrayList.isEmpty()) && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        com.amazon.aps.iva.yb0.j.f(view, "view");
        this.c.remove(view);
        if (this.b.remove(view)) {
            this.e = true;
        }
        super.endViewTransition(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v14, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    public final <F extends Fragment> F getFragment() {
        h hVar;
        Fragment fragment;
        FragmentManager supportFragmentManager;
        FragmentContainerView fragmentContainerView = this;
        while (true) {
            hVar = null;
            if (fragmentContainerView != 0) {
                Object tag = fragmentContainerView.getTag(R.id.fragment_container_view_tag);
                if (tag instanceof Fragment) {
                    fragment = (Fragment) tag;
                } else {
                    fragment = null;
                }
                if (fragment != null) {
                    break;
                }
                ViewParent parent = fragmentContainerView.getParent();
                if (parent instanceof View) {
                    fragmentContainerView = (View) parent;
                } else {
                    fragmentContainerView = 0;
                }
            } else {
                fragment = null;
                break;
            }
        }
        if (fragment != null) {
            if (fragment.isAdded()) {
                supportFragmentManager = fragment.getChildFragmentManager();
            } else {
                throw new IllegalStateException("The Fragment " + fragment + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
        } else {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof h) {
                    hVar = (h) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (hVar != null) {
                supportFragmentManager = hVar.getSupportFragmentManager();
            } else {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
        }
        return (F) supportFragmentManager.B(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        com.amazon.aps.iva.yb0.j.f(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View childAt = getChildAt(childCount);
                com.amazon.aps.iva.yb0.j.e(childAt, "view");
                a(childAt);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        com.amazon.aps.iva.yb0.j.f(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        com.amazon.aps.iva.yb0.j.e(childAt, "view");
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        com.amazon.aps.iva.yb0.j.f(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            com.amazon.aps.iva.yb0.j.e(childAt, "view");
            a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            com.amazon.aps.iva.yb0.j.e(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.e = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        com.amazon.aps.iva.yb0.j.f(onApplyWindowInsetsListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.d = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        com.amazon.aps.iva.yb0.j.f(view, "view");
        if (view.getParent() == this) {
            this.c.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        super(context, attributeSet);
        View view;
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(attributeSet, "attrs");
        com.amazon.aps.iva.yb0.j.f(fragmentManager, "fm");
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.e = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.m4.a.b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment B = fragmentManager.B(id);
        if (classAttribute != null && B == null) {
            if (id == -1) {
                throw new IllegalStateException(defpackage.e.e("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            j F = fragmentManager.F();
            context.getClassLoader();
            Fragment a = F.a(classAttribute);
            com.amazon.aps.iva.yb0.j.e(a, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a.onInflate(context, attributeSet, (Bundle) null);
            a aVar = new a(fragmentManager);
            aVar.r = true;
            a.mContainer = this;
            aVar.d(getId(), a, string, 1);
            if (!aVar.i) {
                aVar.j = false;
                aVar.s.y(aVar, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it = fragmentManager.c.d().iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            Fragment fragment = pVar.c;
            if (fragment.mContainerId == getId() && (view = fragment.mView) != null && view.getParent() == null) {
                fragment.mContainer = this;
                pVar.a();
            }
        }
    }
}
