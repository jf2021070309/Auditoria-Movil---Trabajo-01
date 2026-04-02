package com.amazon.aps.iva.bu;

import com.amazon.aps.iva.a0.r;
import com.amazon.aps.iva.du.x;
import java.util.ArrayList;
import java.util.List;
/* compiled from: CommentInitialData.kt */
/* loaded from: classes2.dex */
public final class a {
    public final List<x> a;
    public final int b;
    public final Integer c;

    public a(int i, ArrayList arrayList, Integer num) {
        this.a = arrayList;
        this.b = i;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, aVar.a) && this.b == aVar.b && com.amazon.aps.iva.yb0.j.a(this.c, aVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int a = r.a(this.b, this.a.hashCode() * 31, 31);
        Integer num = this.c;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return a + hashCode;
    }

    public final String toString() {
        return "CommentInitialData(items=" + this.a + ", total=" + this.b + ", nextPage=" + this.c + ")";
    }
}
