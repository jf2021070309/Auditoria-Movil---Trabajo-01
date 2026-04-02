package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzghu extends zzgep {
    final zzghx zza;
    zzger zzb = zzb();
    final /* synthetic */ zzghy zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzghu(zzghy zzghyVar) {
        this.zzc = zzghyVar;
        this.zza = new zzghx(this.zzc, null);
    }

    private final zzger zzb() {
        if (this.zza.hasNext()) {
            return this.zza.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // com.google.android.gms.internal.ads.zzger
    public final byte zza() {
        zzger zzgerVar = this.zzb;
        if (zzgerVar == null) {
            throw new NoSuchElementException();
        }
        byte zza = zzgerVar.zza();
        if (!this.zzb.hasNext()) {
            this.zzb = zzb();
        }
        return zza;
    }
}
