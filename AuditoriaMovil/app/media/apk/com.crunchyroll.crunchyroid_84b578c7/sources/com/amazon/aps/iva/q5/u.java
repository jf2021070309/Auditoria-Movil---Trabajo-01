package com.amazon.aps.iva.q5;

import android.util.SparseBooleanArray;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
/* compiled from: FlagSet.java */
/* loaded from: classes.dex */
public final class u {
    public final SparseBooleanArray a;

    /* compiled from: FlagSet.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final SparseBooleanArray a = new SparseBooleanArray();
        public boolean b;

        @CanIgnoreReturnValue
        public final void a(int i) {
            com.amazon.aps.iva.cq.b.C(!this.b);
            this.a.append(i, true);
        }

        public final u b() {
            com.amazon.aps.iva.cq.b.C(!this.b);
            this.b = true;
            return new u(this.a);
        }
    }

    public u(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public final boolean a(int... iArr) {
        for (int i : iArr) {
            if (this.a.get(i)) {
                return true;
            }
        }
        return false;
    }

    public final int b(int i) {
        com.amazon.aps.iva.cq.b.x(i, c());
        return this.a.keyAt(i);
    }

    public final int c() {
        return this.a.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (com.amazon.aps.iva.t5.g0.a < 24) {
            if (c() != uVar.c()) {
                return false;
            }
            for (int i = 0; i < c(); i++) {
                if (b(i) != uVar.b(i)) {
                    return false;
                }
            }
            return true;
        }
        return this.a.equals(uVar.a);
    }

    public final int hashCode() {
        if (com.amazon.aps.iva.t5.g0.a < 24) {
            int c = c();
            for (int i = 0; i < c(); i++) {
                c = (c * 31) + b(i);
            }
            return c;
        }
        return this.a.hashCode();
    }
}
