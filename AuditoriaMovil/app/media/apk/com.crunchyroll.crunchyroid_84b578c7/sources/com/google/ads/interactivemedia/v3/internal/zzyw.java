package com.google.ads.interactivemedia.v3.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
abstract class zzyw implements Iterator {
    zzyx zza;
    zzyx zzb = null;
    int zzc;
    final /* synthetic */ zzyy zzd;

    public zzyw(zzyy zzyyVar) {
        this.zzd = zzyyVar;
        this.zza = zzyyVar.zzd.zzd;
        this.zzc = zzyyVar.zzc;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zza != this.zzd.zzd) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzyx zzyxVar = this.zzb;
        if (zzyxVar != null) {
            this.zzd.zze(zzyxVar, true);
            this.zzb = null;
            this.zzc = this.zzd.zzc;
            return;
        }
        throw new IllegalStateException();
    }

    public final zzyx zza() {
        zzyx zzyxVar = this.zza;
        zzyy zzyyVar = this.zzd;
        if (zzyxVar != zzyyVar.zzd) {
            if (zzyyVar.zzc == this.zzc) {
                this.zza = zzyxVar.zzd;
                this.zzb = zzyxVar;
                return zzyxVar;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }
}
