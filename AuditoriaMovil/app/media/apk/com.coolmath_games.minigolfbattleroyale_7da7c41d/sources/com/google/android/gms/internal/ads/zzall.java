package com.google.android.gms.internal.ads;

import javax.annotation.Nonnull;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzall<T> {
    @Nonnull
    public final T zza;
    private zzalc zzb = new zzalc();
    private boolean zzc;
    private boolean zzd;

    public zzall(@Nonnull T t) {
        this.zza = t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzall) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zza(zzalk<T> zzalkVar) {
        this.zzd = true;
        if (this.zzc) {
            zzalkVar.zza(this.zza, this.zzb.zzb());
        }
    }

    public final void zzb(int i, zzalj<T> zzaljVar) {
        if (this.zzd) {
            return;
        }
        if (i != -1) {
            this.zzb.zza(i);
        }
        this.zzc = true;
        zzaljVar.zza(this.zza);
    }

    public final void zzc(zzalk<T> zzalkVar) {
        if (this.zzd || !this.zzc) {
            return;
        }
        zzale zzb = this.zzb.zzb();
        this.zzb = new zzalc();
        this.zzc = false;
        zzalkVar.zza(this.zza, zzb);
    }
}
