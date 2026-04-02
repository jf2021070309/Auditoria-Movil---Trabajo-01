package com.amazon.aps.iva.s5;

import android.os.Bundle;
import com.amazon.aps.iva.q5.k;
import com.amazon.aps.iva.q5.m;
import com.amazon.aps.iva.t5.g0;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
/* compiled from: CueGroup.java */
/* loaded from: classes.dex */
public final class b implements k {
    public static final b d = new b(ImmutableList.of(), 0);
    public static final String e = g0.L(0);
    public static final String f = g0.L(1);
    public static final m g = new m(4);
    public final ImmutableList<a> b;
    public final long c;

    public b(List<a> list, long j) {
        this.b = ImmutableList.copyOf((Collection) list);
        this.c = j;
    }

    @Override // com.amazon.aps.iva.q5.k
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        ImmutableList.Builder builder = ImmutableList.builder();
        int i = 0;
        while (true) {
            ImmutableList<a> immutableList = this.b;
            if (i < immutableList.size()) {
                if (immutableList.get(i).e == null) {
                    builder.add((ImmutableList.Builder) immutableList.get(i));
                }
                i++;
            } else {
                bundle.putParcelableArrayList(e, com.amazon.aps.iva.t5.c.b(builder.build()));
                bundle.putLong(f, this.c);
                return bundle;
            }
        }
    }
}
