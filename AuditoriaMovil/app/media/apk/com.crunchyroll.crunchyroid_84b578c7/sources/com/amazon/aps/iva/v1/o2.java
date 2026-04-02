package com.amazon.aps.iva.v1;
/* compiled from: InspectableValue.kt */
/* loaded from: classes.dex */
public final class o2 {
    public final String a;
    public final Object b;

    public o2(String str, Object obj) {
        this.a = str;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, o2Var.a) && com.amazon.aps.iva.yb0.j.a(this.b, o2Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        Object obj = this.b;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ValueElement(name=");
        sb.append(this.a);
        sb.append(", value=");
        return defpackage.b.b(sb, this.b, ')');
    }
}
