package com.google.android.gms.internal.play_billing;
/* loaded from: classes2.dex */
public final class zzo extends zzp {
    public final transient int zza;
    public final transient int zzb;
    public final /* synthetic */ zzp zzc;

    public zzo(zzp zzpVar, int i2, int i3) {
        this.zzc = zzpVar;
        this.zza = i2;
        this.zzb = i3;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        zzj.zza(i2, this.zzb, "index");
        return this.zzc.get(i2 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzm
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzm
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzm
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.play_billing.zzp, java.util.List
    /* renamed from: zzf */
    public final zzp subList(int i2, int i3) {
        zzj.zzc(i2, i3, this.zzb);
        zzp zzpVar = this.zzc;
        int i4 = this.zza;
        return zzpVar.subList(i2 + i4, i3 + i4);
    }
}
