package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public abstract class zzfnn<T> implements Iterator<T> {
    public int zzb;
    public int zzc;
    public int zzd;
    public final /* synthetic */ zzfns zze;

    public /* synthetic */ zzfnn(zzfns zzfnsVar, zzfnq zzfnqVar) {
        int i2;
        this.zze = zzfnsVar;
        i2 = zzfnsVar.zzf;
        this.zzb = i2;
        this.zzc = zzfnsVar.zzm();
        this.zzd = -1;
    }

    private final void zzb() {
        int i2;
        i2 = this.zze.zzf;
        if (i2 != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator
    public final T next() {
        zzb();
        if (hasNext()) {
            int i2 = this.zzc;
            this.zzd = i2;
            T zza = zza(i2);
            this.zzc = this.zze.zzn(this.zzc);
            return zza;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzb();
        zzflx.zzb(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        zzfns zzfnsVar = this.zze;
        zzfnsVar.remove(zzfns.zzs(zzfnsVar, this.zzd));
        this.zzc--;
        this.zzd = -1;
    }

    public abstract T zza(int i2);
}
