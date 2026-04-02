package c.m.b;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import c.m.b.n0.d;
import ch.qos.logback.core.joran.action.Action;
/* loaded from: classes.dex */
public class w implements LayoutInflater.Factory2 {
    public final FragmentManager a;

    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ b0 a;

        public a(b0 b0Var) {
            this.a = b0Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b0 b0Var = this.a;
            Fragment fragment = b0Var.f2309c;
            b0Var.k();
            k0.f((ViewGroup) fragment.mView.getParent(), w.this.a).e();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public w(FragmentManager fragmentManager) {
        this.a = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        b0 f2;
        if (s.class.getName().equals(str)) {
            return new s(context, attributeSet, this.a);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, Action.CLASS_ATTRIBUTE);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.m.a.a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                ClassLoader classLoader = context.getClassLoader();
                c.f.h<ClassLoader, c.f.h<String, Class<?>>> hVar = u.a;
                try {
                    z = Fragment.class.isAssignableFrom(u.b(classLoader, attributeValue));
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (z) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    Fragment E = resourceId != -1 ? this.a.E(resourceId) : null;
                    if (E == null && string != null) {
                        E = this.a.F(string);
                    }
                    if (E == null && id != -1) {
                        E = this.a.E(id);
                    }
                    if (E == null) {
                        E = this.a.H().a(context.getClassLoader(), attributeValue);
                        E.mFromLayout = true;
                        E.mFragmentId = resourceId != 0 ? resourceId : id;
                        E.mContainerId = id;
                        E.mTag = string;
                        E.mInLayout = true;
                        FragmentManager fragmentManager = this.a;
                        E.mFragmentManager = fragmentManager;
                        v<?> vVar = fragmentManager.p;
                        E.mHost = vVar;
                        E.onInflate(vVar.f2408b, attributeSet, E.mSavedFragmentState);
                        f2 = this.a.a(E);
                        if (FragmentManager.L(2)) {
                            String str2 = "Fragment " + E + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId);
                        }
                    } else if (E.mInLayout) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    } else {
                        E.mInLayout = true;
                        FragmentManager fragmentManager2 = this.a;
                        E.mFragmentManager = fragmentManager2;
                        v<?> vVar2 = fragmentManager2.p;
                        E.mHost = vVar2;
                        E.onInflate(vVar2.f2408b, attributeSet, E.mSavedFragmentState);
                        f2 = this.a.f(E);
                        if (FragmentManager.L(2)) {
                            String str3 = "Retained Fragment " + E + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId);
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    c.m.b.n0.d dVar = c.m.b.n0.d.a;
                    h.o.c.j.e(E, "fragment");
                    c.m.b.n0.e eVar = new c.m.b.n0.e(E, viewGroup);
                    c.m.b.n0.d dVar2 = c.m.b.n0.d.a;
                    c.m.b.n0.d.c(eVar);
                    d.c a2 = c.m.b.n0.d.a(E);
                    if (a2.f2394b.contains(d.a.DETECT_FRAGMENT_TAG_USAGE) && c.m.b.n0.d.f(a2, E.getClass(), c.m.b.n0.e.class)) {
                        c.m.b.n0.d.b(a2, eVar);
                    }
                    E.mContainer = viewGroup;
                    f2.k();
                    f2.j();
                    View view2 = E.mView;
                    if (view2 != null) {
                        if (resourceId != 0) {
                            view2.setId(resourceId);
                        }
                        if (E.mView.getTag() == null) {
                            E.mView.setTag(string);
                        }
                        E.mView.addOnAttachStateChangeListener(new a(f2));
                        return E.mView;
                    }
                    throw new IllegalStateException(e.a.d.a.a.l("Fragment ", attributeValue, " did not create a view."));
                }
            }
            return null;
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
