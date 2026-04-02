package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Collection;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
abstract class zzfqg<E> extends AbstractSet<E> {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        return zzfqh.zzc(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        if (collection != null) {
            return super.retainAll(collection);
        }
        throw null;
    }
}
