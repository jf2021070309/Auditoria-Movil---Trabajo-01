package com.google.ads.interactivemedia.v3.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzsf implements Iterator {
    final /* synthetic */ zzsg zza;
    private int zzb;
    private int zzc = -1;
    private int zzd;
    private int zze;

    public zzsf(zzsg zzsgVar) {
        this.zza = zzsgVar;
        this.zzb = zzsh.zza(zzsgVar.zzb);
        zzsh zzshVar = zzsgVar.zzb;
        this.zzd = zzshVar.zzd;
        this.zze = zzshVar.zzc;
    }

    private final void zza() {
        if (this.zza.zzb.zzd == this.zzd) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        if (this.zzb != -2 && this.zze > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Object zza = this.zza.zza(this.zzb);
            this.zzc = this.zzb;
            this.zzb = zzsh.zzn(this.zza.zzb)[this.zzb];
            this.zze--;
            return zza;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        zza();
        if (this.zzc != -1) {
            z = true;
        } else {
            z = false;
        }
        zzrm.zzh(z, "no calls to next() since the last call to remove()");
        zzsh zzshVar = this.zza.zzb;
        int i = this.zzc;
        zzshVar.zzl(i, zzsi.zzc(zzshVar.zza[i]));
        int i2 = this.zzb;
        zzsh zzshVar2 = this.zza.zzb;
        if (i2 == zzshVar2.zzc) {
            this.zzb = this.zzc;
        }
        this.zzc = -1;
        this.zzd = zzshVar2.zzd;
    }
}
