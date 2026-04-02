package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
class zzfmz implements Iterator {
    final Iterator zza;
    final Collection zzb;
    final /* synthetic */ zzfna zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfmz(zzfna zzfnaVar) {
        Iterator it;
        this.zzc = zzfnaVar;
        this.zzb = this.zzc.zzb;
        Collection collection = zzfnaVar.zzb;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.zza = it;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfmz(zzfna zzfnaVar, Iterator it) {
        this.zzc = zzfnaVar;
        this.zzb = this.zzc.zzb;
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        zza();
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        this.zza.remove();
        zzfnd zzfndVar = this.zzc.zze;
        i = zzfndVar.zzb;
        zzfndVar.zzb = i - 1;
        this.zzc.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza() {
        this.zzc.zza();
        if (this.zzc.zzb != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }
}
