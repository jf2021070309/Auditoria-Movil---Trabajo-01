package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.graph.AbstractBaseGraph;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return AbstractBaseGraph.AnonymousClass2.d((AbstractBaseGraph.AnonymousClass2) obj2, obj);
            default:
                return UndirectedGraphConnections.a(obj2, obj);
        }
    }
}
