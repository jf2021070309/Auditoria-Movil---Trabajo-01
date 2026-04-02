package com.google.android.gms.internal.pal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
abstract class zzzp implements Iterator {
    zzzq zza;
    zzzq zzb = null;
    int zzc;
    final /* synthetic */ zzzr zzd;

    public zzzp(zzzr zzzrVar) {
        this.zzd = zzzrVar;
        this.zza = zzzrVar.zze.zzd;
        this.zzc = zzzrVar.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zza != this.zzd.zze) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzzq zzzqVar = this.zzb;
        if (zzzqVar != null) {
            this.zzd.zze(zzzqVar, true);
            this.zzb = null;
            this.zzc = this.zzd.zzd;
            return;
        }
        throw new IllegalStateException();
    }

    public final zzzq zza() {
        zzzq zzzqVar = this.zza;
        zzzr zzzrVar = this.zzd;
        if (zzzqVar != zzzrVar.zze) {
            if (zzzrVar.zzd == this.zzc) {
                this.zza = zzzqVar.zzd;
                this.zzb = zzzqVar;
                return zzzqVar;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }
}
