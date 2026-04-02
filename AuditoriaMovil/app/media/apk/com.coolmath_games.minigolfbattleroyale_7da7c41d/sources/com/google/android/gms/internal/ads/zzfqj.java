package com.google.android.gms.internal.ads;

import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
abstract class zzfqj<F, T> implements Iterator<T> {
    final Iterator<? extends F> zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfqj(Iterator<? extends F> it) {
        if (it == null) {
            throw null;
        }
        this.zzb = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return zza(this.zzb.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zzb.remove();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T zza(F f);
}
