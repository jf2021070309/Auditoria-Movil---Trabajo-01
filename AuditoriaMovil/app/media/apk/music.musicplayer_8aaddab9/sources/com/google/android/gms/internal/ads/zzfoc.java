package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
/* loaded from: classes.dex */
public class zzfoc<E> extends zzfod<E> {
    public Object[] zza;
    public int zzb = 0;
    public boolean zzc;

    public zzfoc(int i2) {
        this.zza = new Object[i2];
    }

    private final void zze(int i2) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i2) {
            this.zza = Arrays.copyOf(objArr, zzfod.zzd(length, i2));
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (Object[]) objArr.clone();
            this.zzc = false;
        }
    }

    public final zzfoc<E> zza(E e2) {
        Objects.requireNonNull(e2);
        zze(this.zzb + 1);
        Object[] objArr = this.zza;
        int i2 = this.zzb;
        this.zzb = i2 + 1;
        objArr[i2] = e2;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzfod<E> zzb(Iterable<? extends E> iterable) {
        zze(iterable.size() + this.zzb);
        if (iterable instanceof zzfoe) {
            this.zzb = ((zzfoe) iterable).zzg(this.zza, this.zzb);
            return this;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzc(it.next());
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfod
    public /* bridge */ /* synthetic */ zzfod zzc(Object obj) {
        throw null;
    }
}
