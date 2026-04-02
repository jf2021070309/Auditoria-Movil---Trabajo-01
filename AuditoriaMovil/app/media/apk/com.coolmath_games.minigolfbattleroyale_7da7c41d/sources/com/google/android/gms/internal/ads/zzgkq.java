package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzgkq implements Iterator {
    int zza = 0;
    final /* synthetic */ zzgkr zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgkq(zzgkr zzgkrVar) {
        this.zzb = zzgkrVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb.zza.size() || this.zzb.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zza < this.zzb.zza.size()) {
            List<E> list = this.zzb.zza;
            int i = this.zza;
            this.zza = i + 1;
            return list.get(i);
        }
        zzgkr zzgkrVar = this.zzb;
        zzgkrVar.zza.add(zzgkrVar.zzb.next());
        return next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
