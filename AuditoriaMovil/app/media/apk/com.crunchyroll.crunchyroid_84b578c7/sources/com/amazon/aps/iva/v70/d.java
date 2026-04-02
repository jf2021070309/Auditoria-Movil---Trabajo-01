package com.amazon.aps.iva.v70;

import com.amazon.aps.iva.yb0.j;
/* compiled from: SwitcherUiModel.kt */
/* loaded from: classes2.dex */
public final class d {
    public final b a;
    public final b b;

    public d(b bVar, b bVar2) {
        this.a = bVar;
        this.b = bVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (j.a(this.a, dVar.a) && j.a(this.b, dVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SwitcherUiModel(buttonOne=" + this.a + ", buttonTwo=" + this.b + ")";
    }
}
