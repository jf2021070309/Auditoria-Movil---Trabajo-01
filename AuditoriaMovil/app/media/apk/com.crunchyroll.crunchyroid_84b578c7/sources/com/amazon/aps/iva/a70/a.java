package com.amazon.aps.iva.a70;

import com.amazon.aps.iva.yb0.j;
/* compiled from: ActionMenuUiModel.kt */
/* loaded from: classes2.dex */
public final class a<T> {
    public final b a;
    public final T b;

    public a(b bVar, T t) {
        j.f(bVar, "item");
        this.a = bVar;
        this.b = t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (j.a(this.a, aVar.a) && j.a(this.b, aVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = this.a.a * 31;
        T t = this.b;
        if (t == null) {
            hashCode = 0;
        } else {
            hashCode = t.hashCode();
        }
        return i + hashCode;
    }

    public final String toString() {
        return "ActionMenuEntry(item=" + this.a + ", data=" + this.b + ")";
    }
}
