package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class zzfoi extends zzfoj {
    public final transient int zza;
    public final transient int zzb;
    public final /* synthetic */ zzfoj zzc;

    public zzfoi(zzfoj zzfojVar, int i2, int i3) {
        this.zzc = zzfojVar;
        this.zza = i2;
        this.zzb = i3;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        zzflx.zze(i2, this.zzb, "index");
        return this.zzc.get(i2 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    @CheckForNull
    public final Object[] zzb() {
        return this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfoj, java.util.List
    /* renamed from: zzh */
    public final zzfoj subList(int i2, int i3) {
        zzflx.zzg(i2, i3, this.zzb);
        zzfoj zzfojVar = this.zzc;
        int i4 = this.zza;
        return zzfojVar.subList(i2 + i4, i3 + i4);
    }
}
