package com.amazon.aps.iva.wv;

import com.google.gson.annotations.SerializedName;
import java.util.List;
/* compiled from: DownloadInOrderCache.kt */
/* loaded from: classes2.dex */
public final class w {
    @SerializedName("id")
    private final String a;
    @SerializedName("in_order_list")
    private final List<String> b;

    public w(String str, List<String> list) {
        com.amazon.aps.iva.yb0.j.f(str, "id");
        com.amazon.aps.iva.yb0.j.f(list, "inOrderList");
        this.a = str;
        this.b = list;
    }

    public static w a(w wVar, List list) {
        String str = wVar.a;
        com.amazon.aps.iva.yb0.j.f(str, "id");
        return new w(str, list);
    }

    public final String b() {
        return this.a;
    }

    public final List<String> c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, wVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, wVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str = this.a;
        List<String> list = this.b;
        return "Order(id=" + str + ", inOrderList=" + list + ")";
    }
}
