package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class zzghx implements Iterator<zzges> {
    private final ArrayDeque<zzghy> zza;
    private zzges zzb;

    public /* synthetic */ zzghx(zzgex zzgexVar, zzghw zzghwVar) {
        zzgex zzgexVar2;
        if (!(zzgexVar instanceof zzghy)) {
            this.zza = null;
            this.zzb = (zzges) zzgexVar;
            return;
        }
        zzghy zzghyVar = (zzghy) zzgexVar;
        ArrayDeque<zzghy> arrayDeque = new ArrayDeque<>(zzghyVar.zzf());
        this.zza = arrayDeque;
        arrayDeque.push(zzghyVar);
        zzgexVar2 = zzghyVar.zzd;
        this.zzb = zzb(zzgexVar2);
    }

    private final zzges zzb(zzgex zzgexVar) {
        while (zzgexVar instanceof zzghy) {
            zzghy zzghyVar = (zzghy) zzgexVar;
            this.zza.push(zzghyVar);
            zzgexVar = zzghyVar.zzd;
        }
        return (zzges) zzgexVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* renamed from: zza */
    public final zzges next() {
        zzges zzgesVar;
        zzgex zzgexVar;
        zzges zzgesVar2 = this.zzb;
        if (zzgesVar2 != null) {
            do {
                ArrayDeque<zzghy> arrayDeque = this.zza;
                zzgesVar = null;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    break;
                }
                zzgexVar = this.zza.pop().zze;
                zzgesVar = zzb(zzgexVar);
            } while (zzgesVar.zzr());
            this.zzb = zzgesVar;
            return zzgesVar2;
        }
        throw new NoSuchElementException();
    }
}
