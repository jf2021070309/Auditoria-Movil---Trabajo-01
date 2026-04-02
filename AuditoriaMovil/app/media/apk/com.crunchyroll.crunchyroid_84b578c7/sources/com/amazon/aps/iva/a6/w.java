package com.amazon.aps.iva.a6;

import com.google.common.base.Function;
import com.google.common.collect.TreeBasedTable;
import java.util.Map;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements Function {
    public final /* synthetic */ int b;

    public /* synthetic */ w(int i) {
        this.b = i;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return new com.amazon.aps.iva.b6.k0((com.amazon.aps.iva.t5.d) obj);
            case 1:
                com.amazon.aps.iva.o7.l lVar = (com.amazon.aps.iva.o7.l) obj;
                int i = com.amazon.aps.iva.o7.h.y;
                return lVar;
            default:
                return TreeBasedTable.a((Map) obj);
        }
    }
}
