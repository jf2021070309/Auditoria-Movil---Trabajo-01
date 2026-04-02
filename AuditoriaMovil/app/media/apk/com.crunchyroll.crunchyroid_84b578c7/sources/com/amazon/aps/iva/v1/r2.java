package com.amazon.aps.iva.v1;

import android.view.View;
import android.view.ViewParent;
import com.crunchyroll.crunchyroid.R;
import java.util.Iterator;
/* compiled from: ViewCompositionStrategy.android.kt */
/* loaded from: classes.dex */
public final class r2 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ a b;

    public r2(a aVar) {
        this.b = aVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        com.amazon.aps.iva.yb0.j.f(view, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean z;
        Boolean bool;
        com.amazon.aps.iva.yb0.j.f(view, "v");
        a aVar = this.b;
        com.amazon.aps.iva.yb0.j.f(aVar, "<this>");
        Iterator it = com.amazon.aps.iva.ne0.k.R(aVar.getParent(), com.amazon.aps.iva.p3.n0.b).iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            ViewParent viewParent = (ViewParent) it.next();
            if (viewParent instanceof View) {
                View view2 = (View) viewParent;
                com.amazon.aps.iva.yb0.j.f(view2, "<this>");
                Object tag = view2.getTag(R.id.is_pooling_container_tag);
                if (tag instanceof Boolean) {
                    bool = (Boolean) tag;
                } else {
                    bool = null;
                }
                if (bool != null) {
                    z = bool.booleanValue();
                }
                if (z) {
                    z = true;
                    break;
                }
            }
        }
        if (!z) {
            aVar.d();
        }
    }
}
