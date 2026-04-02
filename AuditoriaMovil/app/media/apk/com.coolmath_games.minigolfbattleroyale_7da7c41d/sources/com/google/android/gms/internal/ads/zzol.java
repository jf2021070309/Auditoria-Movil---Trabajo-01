package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzol {
    private final zzamf zza = new zzamf(10);

    public final zzaiv zza(zznv zznvVar, zzaju zzajuVar) throws IOException {
        zzaiv zzaivVar = null;
        int i = 0;
        while (true) {
            try {
                ((zznp) zznvVar).zzh(this.zza.zzi(), 0, 10, false);
                this.zza.zzh(0);
                if (this.zza.zzr() != 4801587) {
                    break;
                }
                this.zza.zzk(3);
                int zzA = this.zza.zzA();
                int i2 = zzA + 10;
                if (zzaivVar == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.zza.zzi(), 0, bArr, 0, 10);
                    ((zznp) zznvVar).zzh(bArr, 10, zzA, false);
                    zzaivVar = zzajw.zza(bArr, i2, zzajuVar, new zzaix());
                } else {
                    ((zznp) zznvVar).zzj(zzA, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        zznvVar.zzl();
        ((zznp) zznvVar).zzj(i, false);
        return zzaivVar;
    }
}
