package com.ellation.crunchyroll.extension;

import androidx.lifecycle.g;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.xw.x;
import com.amazon.aps.iva.yb0.j;
/* compiled from: LifecycleExtensions.kt */
/* loaded from: classes2.dex */
public final class LifecycleExtensionsKt {
    public static final x a(o oVar) {
        j.f(oVar, "<this>");
        return new x(oVar);
    }

    public static final void b(final g gVar, final a<q> aVar) {
        j.f(gVar, "<this>");
        gVar.addObserver(new com.amazon.aps.iva.i5.g() { // from class: com.ellation.crunchyroll.extension.LifecycleExtensionsKt$whenDestroyed$1
            @Override // com.amazon.aps.iva.i5.g
            public final void onDestroy(o oVar) {
                j.f(oVar, "owner");
                aVar.invoke();
                gVar.removeObserver(this);
            }
        });
    }
}
