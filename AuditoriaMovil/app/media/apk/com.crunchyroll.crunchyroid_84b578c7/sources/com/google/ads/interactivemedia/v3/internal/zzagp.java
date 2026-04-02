package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzagp implements Iterator {
    private final ArrayDeque zza;
    private zzadn zzb;

    public /* synthetic */ zzagp(zzadr zzadrVar, zzago zzagoVar) {
        zzadr zzadrVar2;
        if (zzadrVar instanceof zzagr) {
            zzagr zzagrVar = (zzagr) zzadrVar;
            ArrayDeque arrayDeque = new ArrayDeque(zzagrVar.zzf());
            this.zza = arrayDeque;
            arrayDeque.push(zzagrVar);
            zzadrVar2 = zzagrVar.zzd;
            this.zzb = zzb(zzadrVar2);
            return;
        }
        this.zza = null;
        this.zzb = (zzadn) zzadrVar;
    }

    private final zzadn zzb(zzadr zzadrVar) {
        while (zzadrVar instanceof zzagr) {
            zzagr zzagrVar = (zzagr) zzadrVar;
            this.zza.push(zzagrVar);
            zzadrVar = zzagrVar.zzd;
        }
        return (zzadn) zzadrVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zzb != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* renamed from: zza */
    public final zzadn next() {
        zzadn zzadnVar;
        zzadr zzadrVar;
        zzadn zzadnVar2 = this.zzb;
        if (zzadnVar2 != null) {
            do {
                ArrayDeque arrayDeque = this.zza;
                zzadnVar = null;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    break;
                }
                zzadrVar = ((zzagr) this.zza.pop()).zze;
                zzadnVar = zzb(zzadrVar);
            } while (zzadnVar.zzd() == 0);
            this.zzb = zzadnVar;
            return zzadnVar2;
        }
        throw new NoSuchElementException();
    }
}
