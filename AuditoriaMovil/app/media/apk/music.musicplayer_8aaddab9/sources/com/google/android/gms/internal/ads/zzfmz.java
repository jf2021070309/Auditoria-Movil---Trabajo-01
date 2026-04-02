package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class zzfmz implements Iterator {
    public final Iterator zza;
    public final Collection zzb;
    public final /* synthetic */ zzfna zzc;

    public zzfmz(zzfna zzfnaVar) {
        this.zzc = zzfnaVar;
        Collection collection = zzfnaVar.zzb;
        this.zzb = collection;
        this.zza = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public zzfmz(zzfna zzfnaVar, Iterator it) {
        this.zzc = zzfnaVar;
        this.zzb = zzfnaVar.zzb;
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
        int i2;
        this.zza.remove();
        zzfnd zzfndVar = this.zzc.zze;
        i2 = zzfndVar.zzb;
        zzfndVar.zzb = i2 - 1;
        this.zzc.zzb();
    }

    public final void zza() {
        this.zzc.zza();
        if (this.zzc.zzb != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }
}
