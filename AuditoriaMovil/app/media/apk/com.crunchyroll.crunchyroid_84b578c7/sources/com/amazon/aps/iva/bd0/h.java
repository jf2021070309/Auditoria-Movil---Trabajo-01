package com.amazon.aps.iva.bd0;

import com.amazon.aps.iva.oc0.s0;
import com.amazon.aps.iva.yb0.e0;
import java.util.Collection;
/* compiled from: LazyJavaClassMemberScope.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class h extends com.amazon.aps.iva.yb0.h implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nd0.f, Collection<? extends s0>> {
    public h(Object obj) {
        super(1, obj);
    }

    @Override // com.amazon.aps.iva.yb0.b, com.amazon.aps.iva.fc0.c
    public final String getName() {
        return "searchMethodsInSupertypesWithoutBuiltinMagic";
    }

    @Override // com.amazon.aps.iva.yb0.b
    public final com.amazon.aps.iva.fc0.f getOwner() {
        return e0.a(k.class);
    }

    @Override // com.amazon.aps.iva.yb0.b
    public final String getSignature() {
        return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Collection<? extends s0> invoke(com.amazon.aps.iva.nd0.f fVar) {
        com.amazon.aps.iva.nd0.f fVar2 = fVar;
        com.amazon.aps.iva.yb0.j.f(fVar2, "p0");
        return k.w((k) this.receiver, fVar2);
    }
}
