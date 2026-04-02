package com.amazon.aps.iva.f90;

import com.google.common.base.Function;
import com.google.common.escape.Escaper;
import com.google.common.graph.ImmutableNetwork;
import com.google.common.graph.Network;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return ((Escaper) obj2).escape((String) obj);
            default:
                return ImmutableNetwork.b((Network) obj2, obj);
        }
    }
}
