package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;
/* loaded from: classes2.dex */
public final class zzio extends zzir {
    public final /* synthetic */ zzix zza;
    private int zzb = 0;
    private final int zzc;

    public zzio(zzix zzixVar) {
        this.zza = zzixVar;
        this.zzc = zzixVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzit
    public final byte zza() {
        int i2 = this.zzb;
        if (i2 < this.zzc) {
            this.zzb = i2 + 1;
            return this.zza.zzb(i2);
        }
        throw new NoSuchElementException();
    }
}
