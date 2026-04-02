package com.amazon.aps.iva.l70;

import com.amazon.aps.iva.i70.k;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
/* compiled from: PhoneNumberInputPresenter.kt */
/* loaded from: classes2.dex */
public final class b extends l implements com.amazon.aps.iva.xb0.l<k, q> {
    public final /* synthetic */ c h;
    public final /* synthetic */ a i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, a aVar) {
        super(1);
        this.h = cVar;
        this.i = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(k kVar) {
        k kVar2 = kVar;
        if (kVar2 != null) {
            this.i.B(kVar2);
        }
        com.amazon.aps.iva.xb0.a<q> aVar = this.h.h;
        if (aVar != null) {
            aVar.invoke();
        }
        return q.a;
    }
}
