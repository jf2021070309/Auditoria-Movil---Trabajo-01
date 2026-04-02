package com.google.android.gms.internal.measurement;
/* loaded from: classes2.dex */
public final class zzlm implements zzkz {
    private final zzlc zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzlm(zzlc zzlcVar, String str, Object[] objArr) {
        this.zza = zzlcVar;
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

    @Override // com.google.android.gms.internal.measurement.zzkz
    public final zzlc zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzkz
    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.gms.internal.measurement.zzkz
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
