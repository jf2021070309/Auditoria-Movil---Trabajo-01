package com.amazon.aps.iva.vb0;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import java.util.ArrayList;
/* compiled from: FileReadWrite.kt */
/* loaded from: classes4.dex */
public final class d extends l implements com.amazon.aps.iva.xb0.l<String, q> {
    public final /* synthetic */ ArrayList<String> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ArrayList<String> arrayList) {
        super(1);
        this.h = arrayList;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(String str) {
        String str2 = str;
        j.f(str2, "it");
        this.h.add(str2);
        return q.a;
    }
}
