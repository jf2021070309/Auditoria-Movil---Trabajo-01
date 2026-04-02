package com.amazon.aps.iva.e;

import androidx.activity.OnBackPressedDispatcher;
import java.util.ListIterator;
/* compiled from: OnBackPressedDispatcher.kt */
/* loaded from: classes.dex */
public final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<b, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ OnBackPressedDispatcher h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(OnBackPressedDispatcher onBackPressedDispatcher) {
        super(1);
        this.h = onBackPressedDispatcher;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(b bVar) {
        m mVar;
        b bVar2 = bVar;
        com.amazon.aps.iva.yb0.j.f(bVar2, "backEvent");
        com.amazon.aps.iva.lb0.k<m> kVar = this.h.c;
        ListIterator<m> listIterator = kVar.listIterator(kVar.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                mVar = listIterator.previous();
                if (mVar.isEnabled()) {
                    break;
                }
            } else {
                mVar = null;
                break;
            }
        }
        m mVar2 = mVar;
        if (mVar2 != null) {
            mVar2.handleOnBackProgressed(bVar2);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
