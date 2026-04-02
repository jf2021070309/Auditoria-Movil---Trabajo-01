package com.amazon.aps.iva.fc0;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: TypesJVM.kt */
/* loaded from: classes4.dex */
public final class v implements TypeVariable<GenericDeclaration>, Type {
    public final q b;

    public v(q qVar) {
        com.amazon.aps.iva.yb0.j.f(qVar, "typeParameter");
        this.b = qVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof TypeVariable) && com.amazon.aps.iva.yb0.j.a(getName(), ((TypeVariable) obj).getName())) {
            getGenericDeclaration();
            throw null;
        }
        return false;
    }

    @Override // java.lang.reflect.TypeVariable
    public final Type[] getBounds() {
        List<p> upperBounds = this.b.getUpperBounds();
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(upperBounds));
        for (p pVar : upperBounds) {
            arrayList.add(w.b(pVar, true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public final GenericDeclaration getGenericDeclaration() {
        throw new com.amazon.aps.iva.kb0.i(com.amazon.aps.iva.oa.a.a("An operation is not implemented: ", "getGenericDeclaration() is not yet supported for type variables created from KType: " + this.b));
    }

    @Override // java.lang.reflect.TypeVariable
    public final String getName() {
        return this.b.getName();
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return getName();
    }

    public final int hashCode() {
        getName().hashCode();
        getGenericDeclaration();
        throw null;
    }

    public final String toString() {
        return getName();
    }
}
