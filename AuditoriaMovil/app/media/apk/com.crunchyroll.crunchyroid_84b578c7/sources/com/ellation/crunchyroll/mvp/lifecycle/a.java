package com.ellation.crunchyroll.mvp.lifecycle;

import android.view.View;
import com.amazon.aps.iva.i5.i0;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.yb0.j;
import java.util.WeakHashMap;
/* compiled from: PresenterLifecycleObserver.kt */
/* loaded from: classes2.dex */
public final class a {
    public static final void a(k kVar, o oVar) {
        j.f(kVar, "<this>");
        j.f(oVar, "lifecycleOwner");
        oVar.getLifecycle().addObserver(new PresenterLifecycleObserver(kVar));
    }

    public static final void b(k kVar, View view) {
        j.f(kVar, "<this>");
        j.f(view, "view");
        if (!view.isInEditMode()) {
            WeakHashMap<View, r0> weakHashMap = g0.a;
            if (g0.g.b(view)) {
                o a = i0.a(view);
                j.c(a);
                a(kVar, a);
                return;
            }
            view.addOnAttachStateChangeListener(new com.amazon.aps.iva.cz.a(view, kVar, view));
        }
    }
}
