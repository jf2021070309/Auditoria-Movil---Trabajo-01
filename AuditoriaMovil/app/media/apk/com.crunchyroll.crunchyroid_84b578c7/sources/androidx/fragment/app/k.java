package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.amazon.aps.iva.o4.d;
/* compiled from: FragmentLayoutInflaterFactory.java */
/* loaded from: classes.dex */
public final class k implements LayoutInflater.Factory2 {
    public final FragmentManager b;

    public k(FragmentManager fragmentManager) {
        this.b = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        p f;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        FragmentManager fragmentManager = this.b;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, fragmentManager);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.m4.a.a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z = Fragment.class.isAssignableFrom(j.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (z) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    Fragment B = resourceId != -1 ? fragmentManager.B(resourceId) : null;
                    if (B == null && string != null) {
                        B = fragmentManager.C(string);
                    }
                    if (B == null && id != -1) {
                        B = fragmentManager.B(id);
                    }
                    if (B == null) {
                        j F = fragmentManager.F();
                        context.getClassLoader();
                        B = F.a(attributeValue);
                        B.mFromLayout = true;
                        B.mFragmentId = resourceId != 0 ? resourceId : id;
                        B.mContainerId = id;
                        B.mTag = string;
                        B.mInLayout = true;
                        B.mFragmentManager = fragmentManager;
                        com.amazon.aps.iva.n4.n<?> nVar = fragmentManager.v;
                        B.mHost = nVar;
                        B.onInflate(nVar.c, attributeSet, B.mSavedFragmentState);
                        f = fragmentManager.a(B);
                        if (FragmentManager.H(2)) {
                            B.toString();
                            Integer.toHexString(resourceId);
                        }
                    } else if (!B.mInLayout) {
                        B.mInLayout = true;
                        B.mFragmentManager = fragmentManager;
                        com.amazon.aps.iva.n4.n<?> nVar2 = fragmentManager.v;
                        B.mHost = nVar2;
                        B.onInflate(nVar2.c, attributeSet, B.mSavedFragmentState);
                        f = fragmentManager.f(B);
                        if (FragmentManager.H(2)) {
                            B.toString();
                            Integer.toHexString(resourceId);
                        }
                    } else {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    d.b bVar = com.amazon.aps.iva.o4.d.a;
                    com.amazon.aps.iva.o4.e eVar = new com.amazon.aps.iva.o4.e(B, viewGroup);
                    com.amazon.aps.iva.o4.d.c(eVar);
                    d.b a2 = com.amazon.aps.iva.o4.d.a(B);
                    if (a2.a.contains(d.a.DETECT_FRAGMENT_TAG_USAGE) && com.amazon.aps.iva.o4.d.e(a2, B.getClass(), com.amazon.aps.iva.o4.e.class)) {
                        com.amazon.aps.iva.o4.d.b(a2, eVar);
                    }
                    B.mContainer = viewGroup;
                    f.i();
                    f.h();
                    View view2 = B.mView;
                    if (view2 != null) {
                        if (resourceId != 0) {
                            view2.setId(resourceId);
                        }
                        if (B.mView.getTag() == null) {
                            B.mView.setTag(string);
                        }
                        B.mView.addOnAttachStateChangeListener(new a(f));
                        return B.mView;
                    }
                    throw new IllegalStateException(defpackage.e.e("Fragment ", attributeValue, " did not create a view."));
                }
            }
            return null;
        }
        return null;
    }

    /* compiled from: FragmentLayoutInflaterFactory.java */
    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ p b;

        public a(p pVar) {
            this.b = pVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            p pVar = this.b;
            Fragment fragment = pVar.c;
            pVar.i();
            u.f((ViewGroup) fragment.mView.getParent(), k.this.b).e();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}
