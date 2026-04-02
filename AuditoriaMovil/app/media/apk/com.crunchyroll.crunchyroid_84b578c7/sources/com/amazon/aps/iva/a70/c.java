package com.amazon.aps.iva.a70;

import com.amazon.aps.iva.yb0.j;
import java.util.List;
/* compiled from: ActionMenuUiModel.kt */
/* loaded from: classes2.dex */
public final class c<T> {
    public final List<a<T>> a;
    public final String b;

    public c(List<a<T>> list, String str) {
        j.f(str, "title");
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (j.a(this.a, cVar.a) && j.a(this.b, cVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ActionMenuUiModel(menu=" + this.a + ", title=" + this.b + ")";
    }
}
