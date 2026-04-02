package com.amazon.aps.iva.b8;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
/* compiled from: SessionCommand.java */
/* loaded from: classes.dex */
public final class x1 implements com.amazon.aps.iva.q5.k {
    public static final ImmutableList<Integer> e = ImmutableList.of(40010);
    public static final ImmutableList<Integer> f = ImmutableList.of(50000, 50001, 50002, 50003, 50004, 50005, 50006);
    public static final String g = com.amazon.aps.iva.t5.g0.L(0);
    public static final String h = com.amazon.aps.iva.t5.g0.L(1);
    public static final String i = com.amazon.aps.iva.t5.g0.L(2);
    public static final com.amazon.aps.iva.q5.b j = new com.amazon.aps.iva.q5.b(9);
    public final int b;
    public final String c;
    public final Bundle d;

    public x1(int i2) {
        com.amazon.aps.iva.cq.b.v(i2 != 0, "commandCode shouldn't be COMMAND_CODE_CUSTOM");
        this.b = i2;
        this.c = "";
        this.d = Bundle.EMPTY;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        if (this.b != x1Var.b || !TextUtils.equals(this.c, x1Var.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.c, Integer.valueOf(this.b));
    }

    @Override // com.amazon.aps.iva.q5.k
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(g, this.b);
        bundle.putString(h, this.c);
        bundle.putBundle(i, this.d);
        return bundle;
    }

    public x1(String str, Bundle bundle) {
        this.b = 0;
        str.getClass();
        this.c = str;
        bundle.getClass();
        this.d = new Bundle(bundle);
    }
}
