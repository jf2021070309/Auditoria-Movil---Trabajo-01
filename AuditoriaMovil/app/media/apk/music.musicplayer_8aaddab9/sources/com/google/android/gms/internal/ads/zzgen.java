package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class zzgen extends zzgep {
    public final /* synthetic */ zzgex zza;
    private int zzb = 0;
    private final int zzc;

    public zzgen(zzgex zzgexVar) {
        this.zza = zzgexVar;
        this.zzc = zzgexVar.zzc();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzger
    public final byte zza() {
        int i2 = this.zzb;
        if (i2 < this.zzc) {
            this.zzb = i2 + 1;
            return this.zza.zzb(i2);
        }
        throw new NoSuchElementException();
    }
}
