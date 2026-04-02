package com.amazon.aps.iva.oc0;

import com.amazon.aps.iva.he0.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: MultiFieldValueClassRepresentation.kt */
/* loaded from: classes4.dex */
public final class d0<Type extends com.amazon.aps.iva.he0.i> extends a1<Type> {
    public final List<com.amazon.aps.iva.kb0.j<com.amazon.aps.iva.nd0.f, Type>> a;
    public final Map<com.amazon.aps.iva.nd0.f, Type> b;

    public d0(ArrayList arrayList) {
        boolean z;
        this.a = arrayList;
        Map<com.amazon.aps.iva.nd0.f, Type> Z = com.amazon.aps.iva.lb0.i0.Z(arrayList);
        if (Z.size() == arrayList.size()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.b = Z;
            return;
        }
        throw new IllegalArgumentException("Some properties have the same names".toString());
    }

    @Override // com.amazon.aps.iva.oc0.a1
    public final List<com.amazon.aps.iva.kb0.j<com.amazon.aps.iva.nd0.f, Type>> a() {
        return this.a;
    }

    public final String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + this.a + ')';
    }
}
