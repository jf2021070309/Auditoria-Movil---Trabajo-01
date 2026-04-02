package com.google.android.gms.internal.cast;

import java.util.NoSuchElementException;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
final class zzsl extends zzsn {
    final /* synthetic */ zzsu zza;
    private int zzb = 0;
    private final int zzc;

    public zzsl(zzsu zzsuVar) {
        this.zza = zzsuVar;
        this.zzc = zzsuVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zzb < this.zzc) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.cast.zzsp
    public final byte zza() {
        int i = this.zzb;
        if (i < this.zzc) {
            this.zzb = i + 1;
            return this.zza.zzb(i);
        }
        throw new NoSuchElementException();
    }
}
