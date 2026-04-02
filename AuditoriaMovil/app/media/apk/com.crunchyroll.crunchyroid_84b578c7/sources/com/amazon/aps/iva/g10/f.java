package com.amazon.aps.iva.g10;

import com.amazon.aps.iva.d10.i;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import java.util.Collection;
import java.util.List;
/* compiled from: EditDownloadsPresenter.kt */
/* loaded from: classes2.dex */
public final class f extends l implements com.amazon.aps.iva.xb0.l<List<? extends i>, q> {
    public final /* synthetic */ e h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar) {
        super(1);
        this.h = eVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(List<? extends i> list) {
        List<? extends i> list2 = list;
        j.f(list2, "panels");
        e eVar = this.h;
        eVar.getClass();
        if (list2.isEmpty()) {
            eVar.b.u();
            eVar.getView().qf();
        } else {
            eVar.getView().z4();
            List<? extends i> list3 = list2;
            int i = 0;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                for (i iVar : list3) {
                    if (iVar.d && (i = i + 1) < 0) {
                        f1.R();
                        throw null;
                    }
                }
            }
            if (i == 0) {
                eVar.getView().B7();
                eVar.getView().H8();
                eVar.getView().g4();
            } else {
                eVar.getView().w9(i);
                eVar.getView().v5();
                if (i == list2.size()) {
                    eVar.getView().lf();
                } else {
                    eVar.getView().H8();
                }
            }
        }
        return q.a;
    }
}
