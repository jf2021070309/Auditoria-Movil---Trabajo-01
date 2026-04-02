package com.amazon.aps.iva.x0;

import com.amazon.aps.iva.xb0.p;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ListSaver.kt */
/* loaded from: classes.dex */
public final class a extends com.amazon.aps.iva.yb0.l implements p<o, Object, Object> {
    public final /* synthetic */ p<o, Object, List<Object>> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(p<? super o, Object, ? extends List<Object>> pVar) {
        super(2);
        this.h = pVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(o oVar, Object obj) {
        o oVar2 = oVar;
        com.amazon.aps.iva.yb0.j.f(oVar2, "$this$Saver");
        List<Object> invoke = this.h.invoke(oVar2, obj);
        int size = invoke.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = invoke.get(i);
            if (obj2 != null && !oVar2.a(obj2)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        List<Object> list = invoke;
        if (!list.isEmpty()) {
            return new ArrayList(list);
        }
        return null;
    }
}
