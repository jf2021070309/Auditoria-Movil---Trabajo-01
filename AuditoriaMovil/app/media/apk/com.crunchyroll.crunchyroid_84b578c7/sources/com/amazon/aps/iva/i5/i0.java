package com.amazon.aps.iva.i5;

import android.view.View;
import android.view.ViewParent;
import com.crunchyroll.crunchyroid.R;
/* compiled from: ViewTreeLifecycleOwner.kt */
/* loaded from: classes.dex */
public final class i0 {

    /* compiled from: ViewTreeLifecycleOwner.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<View, View> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final View invoke(View view) {
            View view2 = view;
            com.amazon.aps.iva.yb0.j.f(view2, "currentView");
            ViewParent parent = view2.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* compiled from: ViewTreeLifecycleOwner.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<View, o> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final o invoke(View view) {
            View view2 = view;
            com.amazon.aps.iva.yb0.j.f(view2, "viewParent");
            Object tag = view2.getTag(R.id.view_tree_lifecycle_owner);
            if (tag instanceof o) {
                return (o) tag;
            }
            return null;
        }
    }

    public static final o a(View view) {
        com.amazon.aps.iva.yb0.j.f(view, "<this>");
        return (o) com.amazon.aps.iva.ne0.s.X(com.amazon.aps.iva.ne0.s.c0(com.amazon.aps.iva.ne0.k.R(view, a.h), b.h));
    }

    public static final void b(View view, o oVar) {
        com.amazon.aps.iva.yb0.j.f(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, oVar);
    }
}
