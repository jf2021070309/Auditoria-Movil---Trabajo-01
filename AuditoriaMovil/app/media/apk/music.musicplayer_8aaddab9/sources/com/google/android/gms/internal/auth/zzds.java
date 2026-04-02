package com.google.android.gms.internal.auth;

import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class zzds extends zzdv {
    public final /* synthetic */ zzeb zza;
    private int zzb = 0;
    private final int zzc;

    public zzds(zzeb zzebVar) {
        this.zza = zzebVar;
        this.zzc = zzebVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.auth.zzdx
    public final byte zza() {
        int i2 = this.zzb;
        if (i2 < this.zzc) {
            this.zzb = i2 + 1;
            return this.zza.zzb(i2);
        }
        throw new NoSuchElementException();
    }
}
