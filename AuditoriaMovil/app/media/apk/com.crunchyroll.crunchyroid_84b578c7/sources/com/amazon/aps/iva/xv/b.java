package com.amazon.aps.iva.xv;

import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
/* compiled from: BifCacheModel.kt */
/* loaded from: classes2.dex */
public final class b {
    @SerializedName("id")
    private final String a;
    @SerializedName("parent_id")
    private final String b;
    @SerializedName("file_path")
    private final String c;

    public b(String str, String str2, String str3) {
        j.f(str, "id");
        j.f(str2, "parentId");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (j.a(this.a, bVar.a) && j.a(this.b, bVar.b) && j.a(this.c, bVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        return defpackage.b.c(com.amazon.aps.iva.n4.a.b("BifCacheModel(id=", str, ", parentId=", str2, ", filePath="), this.c, ")");
    }
}
