package com.amazon.aps.iva.c00;

import android.content.Context;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: PanelContentRouter.kt */
/* loaded from: classes2.dex */
public interface f {

    /* compiled from: PanelContentRouter.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static g a(Context context) {
            com.amazon.aps.iva.yb0.j.f(context, "context");
            com.amazon.aps.iva.i50.c cVar = new com.amazon.aps.iva.i50.c(context, new com.amazon.aps.iva.i50.a(context, true));
            e eVar = new e(context);
            com.amazon.aps.iva.yb0.j.f(context, "context");
            return new g(cVar, eVar);
        }
    }

    void a(Panel panel, com.amazon.aps.iva.no.a aVar);
}
