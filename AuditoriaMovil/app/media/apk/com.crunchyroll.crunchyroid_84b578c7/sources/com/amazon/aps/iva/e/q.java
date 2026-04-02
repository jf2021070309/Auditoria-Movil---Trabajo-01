package com.amazon.aps.iva.e;

import androidx.activity.OnBackPressedDispatcher;
import java.util.ListIterator;
/* compiled from: OnBackPressedDispatcher.kt */
/* loaded from: classes.dex */
public final class q extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ OnBackPressedDispatcher h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(OnBackPressedDispatcher onBackPressedDispatcher) {
        super(0);
        this.h = onBackPressedDispatcher;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        m mVar;
        OnBackPressedDispatcher onBackPressedDispatcher = this.h;
        com.amazon.aps.iva.lb0.k<m> kVar = onBackPressedDispatcher.c;
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
        onBackPressedDispatcher.d = null;
        if (mVar2 != null) {
            mVar2.handleOnBackCancelled();
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
