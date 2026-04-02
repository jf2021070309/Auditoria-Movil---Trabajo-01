package com.google.android.gms.internal.pal;

import java.util.NoSuchElementException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzabp extends zzabr {
    final /* synthetic */ zzaby zza;
    private int zzb = 0;
    private final int zzc;

    public zzabp(zzaby zzabyVar) {
        this.zza = zzabyVar;
        this.zzc = zzabyVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zzb < this.zzc) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.pal.zzabt
    public final byte zza() {
        int i = this.zzb;
        if (i < this.zzc) {
            this.zzb = i + 1;
            return this.zza.zzb(i);
        }
        throw new NoSuchElementException();
    }
}
