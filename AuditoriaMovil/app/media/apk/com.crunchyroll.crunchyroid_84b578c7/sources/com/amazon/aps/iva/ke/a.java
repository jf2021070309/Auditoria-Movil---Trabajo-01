package com.amazon.aps.iva.ke;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: TermsAndPolicy.kt */
/* loaded from: classes.dex */
public final class a extends l implements com.amazon.aps.iva.xb0.l<String, q> {
    public final /* synthetic */ String h;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> i;
    public final /* synthetic */ String j;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, com.amazon.aps.iva.xb0.a<q> aVar, String str2, com.amazon.aps.iva.xb0.a<q> aVar2) {
        super(1);
        this.h = str;
        this.i = aVar;
        this.j = str2;
        this.k = aVar2;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(String str) {
        String str2 = str;
        j.f(str2, "clickedAnnotation");
        if (j.a(str2, this.h)) {
            this.i.invoke();
        } else if (j.a(str2, this.j)) {
            this.k.invoke();
        }
        return q.a;
    }
}
