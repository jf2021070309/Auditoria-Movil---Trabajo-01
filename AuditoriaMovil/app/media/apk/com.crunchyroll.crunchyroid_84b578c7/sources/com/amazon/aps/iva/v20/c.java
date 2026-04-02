package com.amazon.aps.iva.v20;

import android.app.Dialog;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.v20.a;
import com.amazon.aps.iva.w20.g;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: MembershipCardDialog.kt */
/* loaded from: classes2.dex */
public final class c extends l implements p<i, Integer, q> {
    public final /* synthetic */ a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar) {
        super(2);
        this.h = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(i iVar, Integer num) {
        i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            a.C0781a c0781a = a.c;
            a aVar = this.h;
            aVar.getClass();
            com.amazon.aps.iva.fc0.l<?> lVar = a.d[0];
            Dialog requireDialog = aVar.requireDialog();
            j.e(requireDialog, "requireDialog()");
            com.amazon.aps.iva.w20.f.a((f) com.amazon.aps.iva.cq.b.I(((g) aVar.b.getValue(aVar, lVar)).b, iVar2).getValue(), null, new b(requireDialog), iVar2, 0, 2);
        }
        return q.a;
    }
}
