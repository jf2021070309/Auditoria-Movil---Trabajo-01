package com.amazon.aps.iva.hc0;

import com.amazon.aps.iva.ae0.x;
import com.amazon.aps.iva.fc0.f;
import com.amazon.aps.iva.oc0.s0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.e0;
import com.amazon.aps.iva.yb0.h;
import com.amazon.aps.iva.yb0.j;
/* compiled from: reflectLambda.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class c extends h implements p<x, com.amazon.aps.iva.id0.h, s0> {
    public static final c b = new c();

    public c() {
        super(2);
    }

    @Override // com.amazon.aps.iva.yb0.b, com.amazon.aps.iva.fc0.c
    public final String getName() {
        return "loadFunction";
    }

    @Override // com.amazon.aps.iva.yb0.b
    public final f getOwner() {
        return e0.a(x.class);
    }

    @Override // com.amazon.aps.iva.yb0.b
    public final String getSignature() {
        return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final s0 invoke(x xVar, com.amazon.aps.iva.id0.h hVar) {
        x xVar2 = xVar;
        com.amazon.aps.iva.id0.h hVar2 = hVar;
        j.f(xVar2, "p0");
        j.f(hVar2, "p1");
        return xVar2.e(hVar2);
    }
}
