package com.google.android.gms.internal.auth;

import e.a.d.a.a;
import java.nio.charset.Charset;
import java.util.Objects;
/* loaded from: classes.dex */
public class zzdz extends zzdy {
    public final byte[] zza;

    public zzdz(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.auth.zzeb
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzeb) && zzd() == ((zzeb) obj).zzd()) {
            if (zzd() == 0) {
                return true;
            }
            if (obj instanceof zzdz) {
                zzdz zzdzVar = (zzdz) obj;
                int zzj = zzj();
                int zzj2 = zzdzVar.zzj();
                if (zzj == 0 || zzj2 == 0 || zzj == zzj2) {
                    int zzd = zzd();
                    if (zzd > zzdzVar.zzd()) {
                        int zzd2 = zzd();
                        StringBuilder sb = new StringBuilder(40);
                        sb.append("Length too large: ");
                        sb.append(zzd);
                        sb.append(zzd2);
                        throw new IllegalArgumentException(sb.toString());
                    } else if (zzd <= zzdzVar.zzd()) {
                        byte[] bArr = this.zza;
                        byte[] bArr2 = zzdzVar.zza;
                        zzdzVar.zzc();
                        int i2 = 0;
                        int i3 = 0;
                        while (i2 < zzd) {
                            if (bArr[i2] != bArr2[i3]) {
                                return false;
                            }
                            i2++;
                            i3++;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException(a.S(59, "Ran off end of other: 0, ", zzd, ", ", zzdzVar.zzd()));
                    }
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.auth.zzeb
    public byte zza(int i2) {
        return this.zza[i2];
    }

    @Override // com.google.android.gms.internal.auth.zzeb
    public byte zzb(int i2) {
        return this.zza[i2];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.auth.zzeb
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.auth.zzeb
    public final int zze(int i2, int i3, int i4) {
        return zzev.zzd(i2, this.zza, 0, i4);
    }

    @Override // com.google.android.gms.internal.auth.zzeb
    public final zzeb zzf(int i2, int i3) {
        int zzi = zzeb.zzi(0, i3, zzd());
        return zzi == 0 ? zzeb.zzb : new zzdw(this.zza, 0, zzi);
    }

    @Override // com.google.android.gms.internal.auth.zzeb
    public final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.auth.zzeb
    public final boolean zzh() {
        return zzhd.zzd(this.zza, 0, zzd());
    }
}
