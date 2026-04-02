package com.amazon.aps.iva.r4;
/* compiled from: LayoutSelection.kt */
/* loaded from: classes.dex */
public final class j {
    public final int a;

    public j(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof j) && this.a == ((j) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return com.amazon.aps.iva.d0.b2.b(new StringBuilder("ContainerInfo(layoutId="), this.a, ')');
    }
}
