package com.amazon.aps.iva.ap;

import com.amazon.aps.iva.yb0.j;
import java.io.Serializable;
/* compiled from: WatchScreenRawInput.kt */
/* loaded from: classes2.dex */
public final class h implements Serializable {
    public final a b;
    public final String c;

    public h(a aVar, String str) {
        this.b = aVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (j.a(this.b, hVar.b) && j.a(this.c, hVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.b.hashCode() * 31;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "WatchScreenRawInput(contentInput=" + this.b + ", assetId=" + this.c + ")";
    }
}
