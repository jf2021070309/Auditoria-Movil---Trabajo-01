package com.amazon.aps.iva.ke;

import com.amazon.aps.iva.c2.b;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import java.util.Iterator;
/* compiled from: TermsAndPolicy.kt */
/* loaded from: classes.dex */
public final class b extends l implements com.amazon.aps.iva.xb0.l<Integer, q> {
    public final /* synthetic */ com.amazon.aps.iva.c2.b h;
    public final /* synthetic */ String i;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> j;
    public final /* synthetic */ String k;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.amazon.aps.iva.c2.b bVar, String str, com.amazon.aps.iva.xb0.a<q> aVar, String str2, com.amazon.aps.iva.xb0.a<q> aVar2) {
        super(1);
        this.h = bVar;
        this.i = str;
        this.j = aVar;
        this.k = str2;
        this.l = aVar2;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(Integer num) {
        boolean z;
        int intValue = num.intValue();
        a aVar = new a(this.i, this.j, this.k, this.l);
        com.amazon.aps.iva.c2.b bVar = this.h;
        j.f(bVar, "<this>");
        String str = bVar.b;
        Iterator<T> it = bVar.a(0, str.length()).iterator();
        while (it.hasNext()) {
            b.C0158b c0158b = (b.C0158b) it.next();
            int r0 = com.amazon.aps.iva.oe0.q.r0(str, (String) c0158b.a, 0, false, 6);
            T t = c0158b.a;
            int length = ((String) t).length() + r0;
            if (r0 <= intValue && intValue <= length) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                aVar.invoke(t);
            }
        }
        return q.a;
    }
}
