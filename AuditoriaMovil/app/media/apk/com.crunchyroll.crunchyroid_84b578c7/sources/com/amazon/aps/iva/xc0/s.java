package com.amazon.aps.iva.xc0;

import java.util.Collection;
/* compiled from: AnnotationQualifiersFqNames.kt */
/* loaded from: classes4.dex */
public final class s {
    public final com.amazon.aps.iva.fd0.l a;
    public final Collection<c> b;
    public final boolean c;

    public s(com.amazon.aps.iva.fd0.l lVar, Collection collection) {
        this(lVar, collection, lVar.a == com.amazon.aps.iva.fd0.k.NOT_NULL);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, sVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, sVar.b) && this.c == sVar.c) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JavaDefaultQualifiers(nullabilityQualifier=");
        sb.append(this.a);
        sb.append(", qualifierApplicabilityTypes=");
        sb.append(this.b);
        sb.append(", definitelyNotNull=");
        return defpackage.a.b(sb, this.c, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s(com.amazon.aps.iva.fd0.l lVar, Collection<? extends c> collection, boolean z) {
        com.amazon.aps.iva.yb0.j.f(collection, "qualifierApplicabilityTypes");
        this.a = lVar;
        this.b = collection;
        this.c = z;
    }
}
