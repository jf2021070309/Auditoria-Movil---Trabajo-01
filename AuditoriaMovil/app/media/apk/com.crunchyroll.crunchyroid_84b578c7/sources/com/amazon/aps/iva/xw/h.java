package com.amazon.aps.iva.xw;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ButterKnife.kt */
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<Object, com.amazon.aps.iva.fc0.l<?>, List<Object>> {
    public final /* synthetic */ int[] h;
    public final /* synthetic */ com.amazon.aps.iva.xb0.p<Object, Integer, View> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int[] iArr, i iVar) {
        super(2);
        this.h = iArr;
        this.i = iVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final List<Object> invoke(Object obj, com.amazon.aps.iva.fc0.l<?> lVar) {
        com.amazon.aps.iva.fc0.l<?> lVar2 = lVar;
        com.amazon.aps.iva.yb0.j.f(lVar2, "desc");
        int[] iArr = this.h;
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            View invoke = this.i.invoke(obj, Integer.valueOf(i));
            if (invoke != null) {
                arrayList.add(invoke);
            } else {
                g.a(i, lVar2);
                throw null;
            }
        }
        return arrayList;
    }
}
