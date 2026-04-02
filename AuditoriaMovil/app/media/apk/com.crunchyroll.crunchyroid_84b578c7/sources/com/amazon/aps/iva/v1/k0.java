package com.amazon.aps.iva.v1;

import android.view.PointerIcon;
import android.view.View;
/* compiled from: AndroidComposeView.android.kt */
/* loaded from: classes.dex */
public final class k0 {
    public static final k0 a = new k0();

    public final void a(View view, com.amazon.aps.iva.p1.p pVar) {
        PointerIcon systemIcon;
        com.amazon.aps.iva.yb0.j.f(view, "view");
        if (pVar instanceof com.amazon.aps.iva.p1.a) {
            ((com.amazon.aps.iva.p1.a) pVar).getClass();
            systemIcon = null;
        } else if (pVar instanceof com.amazon.aps.iva.p1.b) {
            systemIcon = PointerIcon.getSystemIcon(view.getContext(), ((com.amazon.aps.iva.p1.b) pVar).c);
            com.amazon.aps.iva.yb0.j.e(systemIcon, "getSystemIcon(view.context, icon.type)");
        } else {
            systemIcon = PointerIcon.getSystemIcon(view.getContext(), 1000);
            com.amazon.aps.iva.yb0.j.e(systemIcon, "getSystemIcon(\n         …DEFAULT\n                )");
        }
        if (!com.amazon.aps.iva.yb0.j.a(view.getPointerIcon(), systemIcon)) {
            view.setPointerIcon(systemIcon);
        }
    }
}
