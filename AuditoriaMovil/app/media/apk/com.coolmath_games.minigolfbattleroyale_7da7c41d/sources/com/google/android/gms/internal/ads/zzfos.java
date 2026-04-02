package com.google.android.gms.internal.ads;

import java.util.Arrays;
import javax.annotation.CheckForNull;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfos<E> extends zzfoc<E> {
    @CheckForNull
    Object[] zzd;
    private int zze;

    public zzfos() {
        super(4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzfoc, com.google.android.gms.internal.ads.zzfod
    public final /* bridge */ /* synthetic */ zzfod zzc(Object obj) {
        zze((zzfos<E>) obj);
        return this;
    }

    public final zzfos<E> zze(E e) {
        if (e != null) {
            if (this.zzd != null) {
                int zzl = zzfot.zzl(this.zzb);
                Object[] objArr = this.zzd;
                int length = objArr.length;
                if (zzl <= length) {
                    objArr.getClass();
                    int i = length - 1;
                    int hashCode = e.hashCode();
                    int zza = zzfob.zza(hashCode);
                    while (true) {
                        int i2 = zza & i;
                        Object[] objArr2 = this.zzd;
                        Object obj = objArr2[i2];
                        if (obj != null) {
                            if (obj.equals(e)) {
                                break;
                            }
                            zza = i2 + 1;
                        } else {
                            objArr2[i2] = e;
                            this.zze += hashCode;
                            super.zza(e);
                            break;
                        }
                    }
                    return this;
                }
            }
            this.zzd = null;
            super.zza(e);
            return this;
        }
        throw null;
    }

    public final zzfos<E> zzf(Iterable<? extends E> iterable) {
        if (this.zzd != null) {
            for (E e : iterable) {
                zze((zzfos<E>) e);
            }
        } else {
            super.zzb(iterable);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfos(int i) {
        super(i);
        this.zzd = new Object[zzfot.zzl(i)];
    }

    public final zzfot<E> zzg() {
        zzfot<E> zzp;
        boolean zzq;
        int i = this.zzb;
        if (i != 0) {
            if (i == 1) {
                Object obj = this.zza[0];
                obj.getClass();
                return new zzfqi(obj);
            }
            if (this.zzd == null || zzfot.zzl(i) != this.zzd.length) {
                zzp = zzfot.zzp(this.zzb, this.zza);
                this.zzb = zzp.size();
            } else {
                zzq = zzfot.zzq(this.zzb, this.zza.length);
                Object[] copyOf = zzq ? Arrays.copyOf(this.zza, this.zzb) : this.zza;
                int i2 = this.zze;
                Object[] objArr = this.zzd;
                zzp = new zzfqd<>(copyOf, i2, objArr, objArr.length - 1, this.zzb);
            }
            this.zzc = true;
            this.zzd = null;
            return zzp;
        }
        return zzfqd.zza;
    }
}
