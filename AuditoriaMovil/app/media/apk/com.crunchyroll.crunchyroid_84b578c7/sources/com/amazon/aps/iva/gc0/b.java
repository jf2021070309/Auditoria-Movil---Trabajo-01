package com.amazon.aps.iva.gc0;

import com.amazon.aps.iva.fc0.f;
import com.amazon.aps.iva.fc0.p;
import com.amazon.aps.iva.yb0.e0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.u;
import java.util.ArrayList;
/* compiled from: KClasses.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class b extends u {
    public static final b b = new b();

    @Override // com.amazon.aps.iva.fc0.n
    public final Object get(Object obj) {
        com.amazon.aps.iva.fc0.d dVar;
        com.amazon.aps.iva.fc0.d dVar2 = (com.amazon.aps.iva.fc0.d) obj;
        j.f(dVar2, "<this>");
        ArrayList arrayList = new ArrayList();
        for (p pVar : dVar2.g()) {
            com.amazon.aps.iva.fc0.e b2 = pVar.b();
            if (b2 instanceof com.amazon.aps.iva.fc0.d) {
                dVar = (com.amazon.aps.iva.fc0.d) b2;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.yb0.b, com.amazon.aps.iva.fc0.c
    public final String getName() {
        return "superclasses";
    }

    @Override // com.amazon.aps.iva.yb0.b
    public final f getOwner() {
        return e0.a.c(d.class, "kotlin-reflection");
    }

    @Override // com.amazon.aps.iva.yb0.b
    public final String getSignature() {
        return "getSuperclasses(Lkotlin/reflect/KClass;)Ljava/util/List;";
    }
}
