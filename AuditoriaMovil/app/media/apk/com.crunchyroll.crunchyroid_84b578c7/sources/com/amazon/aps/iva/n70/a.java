package com.amazon.aps.iva.n70;

import android.view.View;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.widgets.overflow.OverflowButton;
import java.util.Iterator;
import java.util.List;
/* compiled from: OverflowButton.kt */
/* loaded from: classes2.dex */
public final class a extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.a70.b, q> {
    public final /* synthetic */ OverflowButton h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(OverflowButton overflowButton) {
        super(1);
        this.h = overflowButton;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(com.amazon.aps.iva.a70.b bVar) {
        com.amazon.aps.iva.xb0.l<View, q> lVar;
        com.amazon.aps.iva.a70.b bVar2 = bVar;
        j.f(bVar2, "menuItem");
        OverflowButton overflowButton = this.h;
        e eVar = overflowButton.b;
        eVar.getClass();
        List<b> list = eVar.b;
        Object obj = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (j.a(((b) next).a, bVar2)) {
                    obj = next;
                    break;
                }
            }
            b bVar3 = (b) obj;
            if (bVar3 != null && (lVar = bVar3.b) != null) {
                lVar.invoke(overflowButton);
            }
            return q.a;
        }
        j.m("menu");
        throw null;
    }
}
