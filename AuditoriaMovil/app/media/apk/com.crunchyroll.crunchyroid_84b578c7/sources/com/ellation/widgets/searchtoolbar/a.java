package com.ellation.widgets.searchtoolbar;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
/* compiled from: SearchToolbarLayout.kt */
/* loaded from: classes2.dex */
public final class a extends l implements com.amazon.aps.iva.xb0.l<String, q> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<String, q> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(com.amazon.aps.iva.xb0.l<? super String, q> lVar) {
        super(1);
        this.h = lVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(String str) {
        String str2 = str;
        if (str2 != null) {
            this.h.invoke(str2);
        }
        return q.a;
    }
}
