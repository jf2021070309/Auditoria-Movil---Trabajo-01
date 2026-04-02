package com.amazon.aps.iva.mn;

import java.util.List;
/* compiled from: FilterOption.kt */
/* loaded from: classes2.dex */
public final class d implements c {
    public final int a;
    public final List<b> b;

    /* JADX WARN: Multi-variable type inference failed */
    public d(int i, List<? extends b> list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.a == dVar.a && com.amazon.aps.iva.yb0.j.a(this.b, dVar.b)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.mn.c
    public final List<b> getOptions() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.mn.c
    public final int getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "FilterRadioGroup(title=" + this.a + ", options=" + this.b + ")";
    }
}
