package com.amazon.aps.iva.n0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.q1;
/* compiled from: Ripple.android.kt */
/* loaded from: classes.dex */
public final class e extends g {
    public e() {
        throw null;
    }

    @Override // com.amazon.aps.iva.n0.g
    public final p b(com.amazon.aps.iva.c0.k kVar, boolean z, float f, q1 q1Var, q1 q1Var2, com.amazon.aps.iva.o0.i iVar) {
        View view;
        com.amazon.aps.iva.yb0.j.f(kVar, "interactionSource");
        iVar.s(331259447);
        e0.b bVar = e0.a;
        iVar.s(-1737891121);
        Object i = iVar.i(androidx.compose.ui.platform.d.f);
        while (!(i instanceof ViewGroup)) {
            Object parent = ((View) i).getParent();
            if (parent instanceof View) {
                com.amazon.aps.iva.yb0.j.e(parent, "parent");
                i = parent;
            } else {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + i + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
        }
        ViewGroup viewGroup = (ViewGroup) i;
        e0.b bVar2 = e0.a;
        iVar.G();
        iVar.s(1643267286);
        boolean isInEditMode = viewGroup.isInEditMode();
        Object obj = i.a.a;
        if (isInEditMode) {
            iVar.s(511388516);
            boolean H = iVar.H(kVar) | iVar.H(this);
            Object t = iVar.t();
            if (H || t == obj) {
                t = new c(z, f, q1Var, q1Var2);
                iVar.n(t);
            }
            iVar.G();
            c cVar = (c) t;
            iVar.G();
            iVar.G();
            return cVar;
        }
        iVar.G();
        int childCount = viewGroup.getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 < childCount) {
                view = viewGroup.getChildAt(i2);
                if (view instanceof m) {
                    break;
                }
                i2++;
            } else {
                view = null;
                break;
            }
        }
        if (view == null) {
            Context context = viewGroup.getContext();
            com.amazon.aps.iva.yb0.j.e(context, "view.context");
            view = new m(context);
            viewGroup.addView(view);
        }
        iVar.s(1618982084);
        boolean H2 = iVar.H(kVar) | iVar.H(this) | iVar.H(view);
        Object t2 = iVar.t();
        if (H2 || t2 == obj) {
            t2 = new b(z, f, q1Var, q1Var2, (m) view);
            iVar.n(t2);
        }
        iVar.G();
        b bVar3 = (b) t2;
        e0.b bVar4 = e0.a;
        iVar.G();
        return bVar3;
    }
}
