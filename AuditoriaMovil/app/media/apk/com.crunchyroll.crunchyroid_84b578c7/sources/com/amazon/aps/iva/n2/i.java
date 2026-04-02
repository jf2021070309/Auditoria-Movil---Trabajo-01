package com.amazon.aps.iva.n2;

import java.util.ArrayList;
/* compiled from: TextDecoration.kt */
/* loaded from: classes.dex */
public final class i {
    public static final i b = new i(0);
    public static final i c = new i(1);
    public static final i d = new i(2);
    public final int a;

    public i(int i) {
        this.a = i;
    }

    public final boolean a(i iVar) {
        int i = iVar.a;
        int i2 = this.a;
        if ((i | i2) == i2) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        if (this.a == ((i) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + com.amazon.aps.iva.gr.n.t(arrayList, ", ", null, 62) + ']';
    }
}
