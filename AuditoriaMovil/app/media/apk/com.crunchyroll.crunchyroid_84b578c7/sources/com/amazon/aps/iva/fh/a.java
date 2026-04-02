package com.amazon.aps.iva.fh;

import com.amazon.aps.iva.j0.j0;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
/* compiled from: AppLaunchedEvent.kt */
/* loaded from: classes.dex */
public final class a implements Serializable {
    @SerializedName("a")
    private final long b;
    @SerializedName("b")
    private final String c;

    public a(long j) {
        String d = j0.d("randomUUID().toString()");
        this.b = j;
        this.c = d;
    }

    public final String a() {
        return this.c;
    }

    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.b == aVar.b && j.a(this.c, aVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        long j = this.b;
        String str = this.c;
        return "AppLaunchedEvent(timeStamp=" + j + ", id=" + str + ")";
    }
}
