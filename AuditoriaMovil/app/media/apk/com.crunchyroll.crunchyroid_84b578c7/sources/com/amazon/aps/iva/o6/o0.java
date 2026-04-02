package com.amazon.aps.iva.o6;

import android.os.Bundle;
import com.amazon.aps.iva.q5.s0;
import com.google.common.collect.ImmutableList;
/* compiled from: TrackGroupArray.java */
/* loaded from: classes.dex */
public final class o0 implements com.amazon.aps.iva.q5.k {
    public static final o0 e = new o0(new s0[0]);
    public static final String f = com.amazon.aps.iva.t5.g0.L(0);
    public final int b;
    public final ImmutableList<s0> c;
    public int d;

    static {
        new com.amazon.aps.iva.q5.a0(5);
    }

    public o0(s0... s0VarArr) {
        this.c = ImmutableList.copyOf(s0VarArr);
        this.b = s0VarArr.length;
        int i = 0;
        while (true) {
            ImmutableList<s0> immutableList = this.c;
            if (i < immutableList.size()) {
                int i2 = i + 1;
                for (int i3 = i2; i3 < immutableList.size(); i3++) {
                    if (immutableList.get(i).equals(immutableList.get(i3))) {
                        com.amazon.aps.iva.t5.p.d("", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                }
                i = i2;
            } else {
                return;
            }
        }
    }

    public final s0 a(int i) {
        return this.c.get(i);
    }

    public final int b(s0 s0Var) {
        int indexOf = this.c.indexOf(s0Var);
        if (indexOf < 0) {
            return -1;
        }
        return indexOf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o0.class != obj.getClass()) {
            return false;
        }
        o0 o0Var = (o0) obj;
        if (this.b == o0Var.b && this.c.equals(o0Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.c.hashCode();
        }
        return this.d;
    }

    @Override // com.amazon.aps.iva.q5.k
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f, com.amazon.aps.iva.t5.c.b(this.c));
        return bundle;
    }
}
