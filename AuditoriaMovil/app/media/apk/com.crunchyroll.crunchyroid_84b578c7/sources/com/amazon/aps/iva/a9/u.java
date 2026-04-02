package com.amazon.aps.iva.a9;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: TransitionValues.java */
/* loaded from: classes.dex */
public final class u {
    public View b;
    public final HashMap a = new HashMap();
    public final ArrayList<n> c = new ArrayList<>();

    @Deprecated
    public u() {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.b == uVar.b && this.a.equals(uVar.a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        HashMap hashMap;
        StringBuilder b = com.amazon.aps.iva.b6.x.b("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        b.append(this.b);
        b.append("\n");
        String f = com.amazon.aps.iva.c80.a.f(b.toString(), "    values:");
        for (String str : this.a.keySet()) {
            f = f + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return f;
    }

    public u(View view) {
        this.b = view;
    }
}
