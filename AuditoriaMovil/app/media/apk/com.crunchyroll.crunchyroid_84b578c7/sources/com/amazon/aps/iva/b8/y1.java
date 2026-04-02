package com.amazon.aps.iva.b8;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
/* compiled from: SessionCommands.java */
/* loaded from: classes.dex */
public final class y1 implements com.amazon.aps.iva.q5.k {
    public static final y1 c = new y1(new HashSet());
    public static final String d = com.amazon.aps.iva.t5.g0.L(0);
    public final ImmutableSet<x1> b;

    static {
        new com.amazon.aps.iva.q5.e(15);
    }

    public y1() {
        throw null;
    }

    public y1(HashSet hashSet) {
        this.b = ImmutableSet.copyOf((Collection) hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        return this.b.equals(((y1) obj).b);
    }

    public final int hashCode() {
        return com.amazon.aps.iva.o3.b.b(this.b);
    }

    @Override // com.amazon.aps.iva.q5.k
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        UnmodifiableIterator<x1> it = this.b.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toBundle());
        }
        bundle.putParcelableArrayList(d, arrayList);
        return bundle;
    }
}
