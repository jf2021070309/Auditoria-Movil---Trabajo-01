package com.google.android.gms.internal.measurement;

import java.io.IOException;
/* loaded from: classes2.dex */
public final class zzlg<T> implements zzln<T> {
    private final zzlc zza;
    private final zzmb<?, ?> zzb;
    private final boolean zzc;
    private final zzjk<?> zzd;

    private zzlg(zzmb<?, ?> zzmbVar, zzjk<?> zzjkVar, zzlc zzlcVar) {
        this.zzb = zzmbVar;
        this.zzc = zzjkVar.zzc(zzlcVar);
        this.zzd = zzjkVar;
        this.zza = zzlcVar;
    }

    public static <T> zzlg<T> zzc(zzmb<?, ?> zzmbVar, zzjk<?> zzjkVar, zzlc zzlcVar) {
        return new zzlg<>(zzmbVar, zzjkVar, zzlcVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final int zza(T t) {
        zzmb<?, ?> zzmbVar = this.zzb;
        int zzb = zzmbVar.zzb(zzmbVar.zzc(t));
        if (this.zzc) {
            this.zzd.zza(t);
            throw null;
        }
        return zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final int zzb(T t) {
        int hashCode = this.zzb.zzc(t).hashCode();
        if (this.zzc) {
            this.zzd.zza(t);
            throw null;
        }
        return hashCode;
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final T zze() {
        return (T) this.zza.zzbC().zzaC();
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final void zzf(T t) {
        this.zzb.zzg(t);
        this.zzd.zzb(t);
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final void zzg(T t, T t2) {
        zzlp.zzF(this.zzb, t, t2);
        if (this.zzc) {
            zzlp.zzE(this.zzd, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final void zzh(T t, byte[] bArr, int i2, int i3, zzik zzikVar) throws IOException {
        zzjx zzjxVar = (zzjx) t;
        if (zzjxVar.zzc == zzmc.zzc()) {
            zzjxVar.zzc = zzmc.zze();
        }
        zzju zzjuVar = (zzju) t;
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final boolean zzi(T t, T t2) {
        if (this.zzb.zzc(t).equals(this.zzb.zzc(t2))) {
            if (this.zzc) {
                this.zzd.zza(t);
                this.zzd.zza(t2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final boolean zzj(T t) {
        this.zzd.zza(t);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final void zzm(T t, zzjf zzjfVar) throws IOException {
        this.zzd.zza(t);
        throw null;
    }
}
