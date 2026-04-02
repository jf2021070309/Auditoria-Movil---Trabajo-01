package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfqh {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzb(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzc(Set<?> set, Collection<?> collection) {
        if (collection != null) {
            if (collection instanceof zzfpt) {
                collection = ((zzfpt) collection).zza();
            }
            if (!(collection instanceof Set) || collection.size() <= set.size()) {
                return zzb(set, collection.iterator());
            }
            Iterator<?> it = set.iterator();
            if (collection != null) {
                boolean z = false;
                while (it.hasNext()) {
                    if (collection.contains(it.next())) {
                        it.remove();
                        z = true;
                    }
                }
                return z;
            }
            throw null;
        }
        throw null;
    }
}
