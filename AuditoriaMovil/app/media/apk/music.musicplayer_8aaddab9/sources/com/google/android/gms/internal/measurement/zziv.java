package com.google.android.gms.internal.measurement;

import e.a.d.a.a;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;
/* loaded from: classes2.dex */
public class zziv extends zziu {
    public final byte[] zza;

    public zziv(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzix) && zzd() == ((zzix) obj).zzd()) {
            if (zzd() == 0) {
                return true;
            }
            if (obj instanceof zziv) {
                zziv zzivVar = (zziv) obj;
                int zzk = zzk();
                int zzk2 = zzivVar.zzk();
                if (zzk == 0 || zzk2 == 0 || zzk == zzk2) {
                    int zzd = zzd();
                    if (zzd > zzivVar.zzd()) {
                        int zzd2 = zzd();
                        StringBuilder sb = new StringBuilder(40);
                        sb.append("Length too large: ");
                        sb.append(zzd);
                        sb.append(zzd2);
                        throw new IllegalArgumentException(sb.toString());
                    } else if (zzd <= zzivVar.zzd()) {
                        byte[] bArr = this.zza;
                        byte[] bArr2 = zzivVar.zza;
                        zzivVar.zzc();
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
                        throw new IllegalArgumentException(a.S(59, "Ran off end of other: 0, ", zzd, ", ", zzivVar.zzd()));
                    }
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public byte zza(int i2) {
        return this.zza[i2];
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public byte zzb(int i2) {
        return this.zza[i2];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public final int zze(int i2, int i3, int i4) {
        return zzkf.zzd(i2, this.zza, 0, i4);
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public final zzix zzf(int i2, int i3) {
        int zzj = zzix.zzj(0, i3, zzd());
        return zzj == 0 ? zzix.zzb : new zzis(this.zza, 0, zzj);
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public final void zzh(zzin zzinVar) throws IOException {
        ((zzjc) zzinVar).zzc(this.zza, 0, zzd());
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public final boolean zzi() {
        return zzmq.zzf(this.zza, 0, zzd());
    }
}
