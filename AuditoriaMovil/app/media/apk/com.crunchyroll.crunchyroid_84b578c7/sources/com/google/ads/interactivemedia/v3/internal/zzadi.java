package com.google.ads.interactivemedia.v3.internal;

import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzadi extends zzadk {
    final /* synthetic */ zzadr zza;
    private int zzb = 0;
    private final int zzc;

    public zzadi(zzadr zzadrVar) {
        this.zza = zzadrVar;
        this.zzc = zzadrVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zzb < this.zzc) {
            return true;
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadm
    public final byte zza() {
        int i = this.zzb;
        if (i < this.zzc) {
            this.zzb = i + 1;
            return this.zza.zzb(i);
        }
        throw new NoSuchElementException();
    }
}
