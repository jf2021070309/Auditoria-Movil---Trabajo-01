package com.amazon.aps.iva.a2;
/* compiled from: SemanticsProperties.kt */
/* loaded from: classes.dex */
public final class x extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<a<com.amazon.aps.iva.kb0.a<? extends Boolean>>, a<com.amazon.aps.iva.kb0.a<? extends Boolean>>, a<com.amazon.aps.iva.kb0.a<? extends Boolean>>> {
    public static final x h = new x();

    public x() {
        super(2);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final a<com.amazon.aps.iva.kb0.a<? extends Boolean>> invoke(a<com.amazon.aps.iva.kb0.a<? extends Boolean>> aVar, a<com.amazon.aps.iva.kb0.a<? extends Boolean>> aVar2) {
        String str;
        com.amazon.aps.iva.kb0.a<? extends Boolean> aVar3;
        a<com.amazon.aps.iva.kb0.a<? extends Boolean>> aVar4 = aVar;
        a<com.amazon.aps.iva.kb0.a<? extends Boolean>> aVar5 = aVar2;
        com.amazon.aps.iva.yb0.j.f(aVar5, "childValue");
        if (aVar4 == null || (str = aVar4.a) == null) {
            str = aVar5.a;
        }
        if (aVar4 == null || (aVar3 = aVar4.b) == null) {
            aVar3 = aVar5.b;
        }
        return new a<>(str, aVar3);
    }
}
