package com.ellation.crunchyroll.viewbinding;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.g;
import com.amazon.aps.iva.bc0.b;
import com.amazon.aps.iva.d9.a;
import com.amazon.aps.iva.i5.g;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.viewbinding.FragmentViewBindingDelegate;
/* compiled from: FragmentViewBindingDelegate.kt */
/* loaded from: classes2.dex */
public final class FragmentViewBindingDelegate<T extends a> implements b<Fragment, T> {
    public final Fragment a;
    public final l<View, T> b;
    public T c;

    /* JADX WARN: Multi-variable type inference failed */
    public FragmentViewBindingDelegate(Fragment fragment, l<? super View, ? extends T> lVar) {
        j.f(fragment, "fragment");
        j.f(lVar, "viewBindingFactory");
        this.a = fragment;
        this.b = lVar;
        fragment.getLifecycle().addObserver(new g(this) { // from class: com.ellation.crunchyroll.viewbinding.FragmentViewBindingDelegate.1
            public final com.amazon.aps.iva.a60.a b;
            public final /* synthetic */ FragmentViewBindingDelegate<T> c;

            /* JADX WARN: Type inference failed for: r0v0, types: [com.amazon.aps.iva.a60.a] */
            {
                this.c = this;
                this.b = new w() { // from class: com.amazon.aps.iva.a60.a
                    @Override // com.amazon.aps.iva.i5.w
                    public final void onChanged(Object obj) {
                        o oVar = (o) obj;
                        final FragmentViewBindingDelegate fragmentViewBindingDelegate = FragmentViewBindingDelegate.this;
                        j.f(fragmentViewBindingDelegate, "this$0");
                        if (oVar != null) {
                            oVar.getLifecycle().addObserver(new g() { // from class: com.ellation.crunchyroll.viewbinding.FragmentViewBindingDelegate$1$viewLifecycleOwnerLiveDataObserver$1$1
                                @Override // com.amazon.aps.iva.i5.g
                                public final void onDestroy(o oVar2) {
                                    j.f(oVar2, "owner");
                                    fragmentViewBindingDelegate.c = null;
                                }
                            });
                        }
                    }
                };
            }

            @Override // com.amazon.aps.iva.i5.g
            public final void onCreate(o oVar) {
                j.f(oVar, "owner");
                this.c.a.getViewLifecycleOwnerLiveData().f(this.b);
            }

            @Override // com.amazon.aps.iva.i5.g
            public final void onDestroy(o oVar) {
                j.f(oVar, "owner");
                this.c.a.getViewLifecycleOwnerLiveData().j(this.b);
            }
        });
    }

    @Override // com.amazon.aps.iva.bc0.b
    /* renamed from: a */
    public final T getValue(Fragment fragment, com.amazon.aps.iva.fc0.l<?> lVar) {
        j.f(fragment, "thisRef");
        j.f(lVar, "property");
        T t = this.c;
        if (t != null) {
            return t;
        }
        if (this.a.getViewLifecycleOwner().getLifecycle().getCurrentState().isAtLeast(g.b.INITIALIZED)) {
            View requireView = fragment.requireView();
            j.e(requireView, "thisRef.requireView()");
            T invoke = this.b.invoke(requireView);
            this.c = invoke;
            return invoke;
        }
        throw new IllegalStateException("Should not attempt to get bindings when Fragment views are destroyed.");
    }
}
