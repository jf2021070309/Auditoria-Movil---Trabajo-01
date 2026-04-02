package com.google.android.gms.internal.cast_tv;

import java.util.NoSuchElementException;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
final class zzgk extends zzgm {
    final /* synthetic */ zzgu zza;
    private int zzb = 0;
    private final int zzc;

    public zzgk(zzgu zzguVar) {
        this.zza = zzguVar;
        this.zzc = zzguVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zzb < this.zzc) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzgo
    public final byte zza() {
        int i = this.zzb;
        if (i < this.zzc) {
            this.zzb = i + 1;
            return this.zza.zzb(i);
        }
        throw new NoSuchElementException();
    }
}
