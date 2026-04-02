package com.amazon.aps.iva.q5;

import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/* compiled from: TrackSelectionOverride.java */
/* loaded from: classes.dex */
public final class t0 implements k {
    public static final String d = com.amazon.aps.iva.t5.g0.L(0);
    public static final String e = com.amazon.aps.iva.t5.g0.L(1);
    public static final com.amazon.aps.iva.g1.e f = new com.amazon.aps.iva.g1.e(4);
    public final s0 b;
    public final ImmutableList<Integer> c;

    public t0(s0 s0Var, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= s0Var.b)) {
            throw new IndexOutOfBoundsException();
        }
        this.b = s0Var;
        this.c = ImmutableList.copyOf((Collection) list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t0.class != obj.getClass()) {
            return false;
        }
        t0 t0Var = (t0) obj;
        if (this.b.equals(t0Var.b) && this.c.equals(t0Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.c.hashCode() * 31) + this.b.hashCode();
    }

    @Override // com.amazon.aps.iva.q5.k
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putBundle(d, this.b.toBundle());
        bundle.putIntArray(e, Ints.toArray(this.c));
        return bundle;
    }
}
