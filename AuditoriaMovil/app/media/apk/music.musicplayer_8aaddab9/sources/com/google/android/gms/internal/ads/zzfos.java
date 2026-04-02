package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class zzfos<E> extends zzfoc<E> {
    @CheckForNull
    public Object[] zzd;
    private int zze;

    public zzfos() {
        super(4);
    }

    public zzfos(int i2) {
        super(i2);
        this.zzd = new Object[zzfot.zzl(i2)];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzfoc, com.google.android.gms.internal.ads.zzfod
    public final /* bridge */ /* synthetic */ zzfod zzc(Object obj) {
        zze((zzfos<E>) obj);
        return this;
    }

    public final zzfos<E> zze(E e2) {
        Objects.requireNonNull(e2);
        if (this.zzd != null) {
            int zzl = zzfot.zzl(this.zzb);
            int length = this.zzd.length;
            if (zzl <= length) {
                int i2 = length - 1;
                int hashCode = e2.hashCode();
                int zza = zzfob.zza(hashCode);
                while (true) {
                    int i3 = zza & i2;
                    Object[] objArr = this.zzd;
                    Object obj = objArr[i3];
                    if (obj != null) {
                        if (obj.equals(e2)) {
                            break;
                        }
                        zza = i3 + 1;
                    } else {
                        objArr[i3] = e2;
                        this.zze += hashCode;
                        super.zza(e2);
                        break;
                    }
                }
                return this;
            }
        }
        this.zzd = null;
        super.zza(e2);
        return this;
    }

    public final zzfos<E> zzf(Iterable<? extends E> iterable) {
        if (this.zzd != null) {
            for (E e2 : iterable) {
                zze((zzfos<E>) e2);
            }
        } else {
            super.zzb(iterable);
        }
        return this;
    }

    public final zzfot<E> zzg() {
        zzfot<E> zzp;
        boolean zzq;
        int i2 = this.zzb;
        if (i2 != 0) {
            if (i2 == 1) {
                Object obj = this.zza[0];
                obj.getClass();
                return new zzfqi(obj);
            }
            if (this.zzd == null || zzfot.zzl(i2) != this.zzd.length) {
                zzp = zzfot.zzp(this.zzb, this.zza);
                this.zzb = zzp.size();
            } else {
                zzq = zzfot.zzq(this.zzb, this.zza.length);
                Object[] copyOf = zzq ? Arrays.copyOf(this.zza, this.zzb) : this.zza;
                int i3 = this.zze;
                Object[] objArr = this.zzd;
                zzp = new zzfqd<>(copyOf, i3, objArr, objArr.length - 1, this.zzb);
            }
            this.zzc = true;
            this.zzd = null;
            return zzp;
        }
        return zzfqd.zza;
    }
}
