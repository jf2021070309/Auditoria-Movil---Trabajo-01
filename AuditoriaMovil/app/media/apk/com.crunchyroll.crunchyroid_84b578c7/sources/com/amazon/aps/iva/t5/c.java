package com.amazon.aps.iva.t5;

import android.os.Bundle;
import com.amazon.aps.iva.q5.k;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: BundleableUtil.java */
/* loaded from: classes.dex */
public final class c {
    public static <T extends com.amazon.aps.iva.q5.k> ImmutableList<T> a(k.a<T> aVar, List<Bundle> list) {
        ImmutableList.Builder builder = ImmutableList.builder();
        for (int i = 0; i < list.size(); i++) {
            Bundle bundle = list.get(i);
            bundle.getClass();
            builder.add((ImmutableList.Builder) aVar.e(bundle));
        }
        return builder.build();
    }

    public static <T extends com.amazon.aps.iva.q5.k> ArrayList<Bundle> b(Collection<T> collection) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        for (T t : collection) {
            arrayList.add(t.toBundle());
        }
        return arrayList;
    }
}
