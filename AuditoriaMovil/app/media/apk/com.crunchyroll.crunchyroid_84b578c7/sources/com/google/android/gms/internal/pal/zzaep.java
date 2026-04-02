package com.google.android.gms.internal.pal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzaep implements zzaec {
    private final zzaef zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzaep(zzaef zzaefVar, String str, Object[] objArr) {
        this.zza = zzaefVar;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 >= 55296) {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            } else {
                this.zzd = i | (charAt2 << i2);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.pal.zzaec
    public final zzaef zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.pal.zzaec
    public final boolean zzb() {
        if ((this.zzd & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.pal.zzaec
    public final int zzc() {
        if ((this.zzd & 1) == 1) {
            return 1;
        }
        return 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
