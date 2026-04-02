package com.amazon.aps.iva.xw;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: ButterKnife.kt */
/* loaded from: classes2.dex */
public final class g {

    /* JADX INFO: Add missing generic type declarations: [T, V] */
    /* compiled from: ButterKnife.kt */
    /* loaded from: classes2.dex */
    public static final class a<T, V> extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<T, com.amazon.aps.iva.fc0.l<?>, V> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<T, Integer, View> h;
        public final /* synthetic */ int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, com.amazon.aps.iva.xb0.p pVar) {
            super(2);
            this.h = pVar;
            this.i = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(Object obj, com.amazon.aps.iva.fc0.l<?> lVar) {
            com.amazon.aps.iva.fc0.l<?> lVar2 = lVar;
            com.amazon.aps.iva.yb0.j.f(lVar2, "desc");
            int i = this.i;
            View invoke = this.h.invoke(obj, Integer.valueOf(i));
            if (invoke != null) {
                return invoke;
            }
            g.a(i, lVar2);
            throw null;
        }
    }

    public static final void a(int i, com.amazon.aps.iva.fc0.l lVar) {
        String name = lVar.getName();
        throw new IllegalStateException("View ID " + i + " for '" + name + "' not found.");
    }

    public static final v b(Activity activity, int i) {
        com.amazon.aps.iva.yb0.j.f(activity, "<this>");
        return new v(new f(i, j.h));
    }

    public static final v c(int i, View view) {
        com.amazon.aps.iva.yb0.j.f(view, "<this>");
        return h(i, i.h);
    }

    public static final v d(Activity activity, int i) {
        com.amazon.aps.iva.yb0.j.f(activity, "<this>");
        return h(i, j.h);
    }

    public static final v e(androidx.fragment.app.g gVar, int i) {
        com.amazon.aps.iva.yb0.j.f(gVar, "<this>");
        return h(i, l.h);
    }

    public static final v f(Fragment fragment, int i) {
        com.amazon.aps.iva.yb0.j.f(fragment, "<this>");
        return h(i, m.h);
    }

    public static final v g(RecyclerView.f0 f0Var, int i) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "<this>");
        return h(i, n.h);
    }

    public static final <T, V extends View> v<T, V> h(int i, com.amazon.aps.iva.xb0.p<? super T, ? super Integer, ? extends View> pVar) {
        return new v<>(new a(i, pVar));
    }
}
