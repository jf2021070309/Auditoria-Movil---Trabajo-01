package com.amazon.aps.iva.s8;

import android.view.View;
import android.view.ViewParent;
import com.amazon.aps.iva.ne0.k;
import com.amazon.aps.iva.ne0.s;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
/* compiled from: ViewTreeSavedStateRegistryOwner.kt */
/* loaded from: classes.dex */
public final class d {

    /* compiled from: ViewTreeSavedStateRegistryOwner.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<View, View> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final View invoke(View view) {
            View view2 = view;
            j.f(view2, "view");
            ViewParent parent = view2.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* compiled from: ViewTreeSavedStateRegistryOwner.kt */
    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<View, c> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final c invoke(View view) {
            View view2 = view;
            j.f(view2, "view");
            Object tag = view2.getTag(R.id.view_tree_saved_state_registry_owner);
            if (tag instanceof c) {
                return (c) tag;
            }
            return null;
        }
    }

    public static final c a(View view) {
        j.f(view, "<this>");
        return (c) s.X(s.c0(k.R(view, a.h), b.h));
    }

    public static final void b(View view, c cVar) {
        j.f(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, cVar);
    }
}
