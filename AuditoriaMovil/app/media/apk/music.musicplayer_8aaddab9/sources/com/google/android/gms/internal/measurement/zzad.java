package com.google.android.gms.internal.measurement;

import e.a.d.a.a;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes2.dex */
public final class zzad implements Iterator<zzap> {
    public final /* synthetic */ zzae zza;
    private int zzb = 0;

    public zzad(zzae zzaeVar) {
        this.zza = zzaeVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zza.zzc();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ zzap next() {
        if (this.zzb < this.zza.zzc()) {
            zzae zzaeVar = this.zza;
            int i2 = this.zzb;
            this.zzb = i2 + 1;
            return zzaeVar.zze(i2);
        }
        throw new NoSuchElementException(a.R(32, "Out of bounds index: ", this.zzb));
    }
}
