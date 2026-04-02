package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzghs implements zzghf {
    private final zzghi zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzghs(zzghi zzghiVar, String str, Object[] objArr) {
        this.zza = zzghiVar;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i2 = charAt & 8191;
        int i3 = 13;
        int i4 = 1;
        while (true) {
            int i5 = i4 + 1;
            char charAt2 = str.charAt(i4);
            if (charAt2 < 55296) {
                this.zzd = i2 | (charAt2 << i3);
                return;
            }
            i2 |= (charAt2 & 8191) << i3;
            i3 += 13;
            i4 = i5;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzghf
    public final boolean zza() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.gms.internal.ads.zzghf
    public final zzghi zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzghf
    public final int zzc() {
        return (this.zzd & 1) == 1 ? 1 : 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
