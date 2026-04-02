package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes.dex */
public final class zzfqh {
    public static int zza(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i2 += next != null ? next.hashCode() : 0;
        }
        return i2;
    }

    public static boolean zzb(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }

    public static boolean zzc(Set<?> set, Collection<?> collection) {
        Objects.requireNonNull(collection);
        if (collection instanceof zzfpt) {
            collection = ((zzfpt) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return zzb(set, collection.iterator());
        }
        Iterator<?> it = set.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}
