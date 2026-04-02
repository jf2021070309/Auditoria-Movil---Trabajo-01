package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class zzgkq implements Iterator {
    public int zza = 0;
    public final /* synthetic */ zzgkr zzb;

    public zzgkq(zzgkr zzgkrVar) {
        this.zzb = zzgkrVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb.zza.size() || this.zzb.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zza >= this.zzb.zza.size()) {
            zzgkr zzgkrVar = this.zzb;
            zzgkrVar.zza.add(zzgkrVar.zzb.next());
            return next();
        }
        List<E> list = this.zzb.zza;
        int i2 = this.zza;
        this.zza = i2 + 1;
        return list.get(i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
