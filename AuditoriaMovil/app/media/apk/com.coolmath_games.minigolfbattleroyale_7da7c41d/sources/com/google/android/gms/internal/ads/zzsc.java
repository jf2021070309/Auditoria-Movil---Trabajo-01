package com.google.android.gms.internal.ads;

import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzsc extends zzsm {
    private zzoh zza;
    private zzsb zzb;

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.zzsm
    protected final void zza(boolean z) {
        super.zza(z);
        if (z) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsm
    protected final long zzb(zzamf zzamfVar) {
        if (zzd(zzamfVar.zzi())) {
            int i = (zzamfVar.zzi()[2] & UByte.MAX_VALUE) >> 4;
            if (i != 6) {
                if (i == 7) {
                    i = 7;
                }
                int zzc = zzoc.zzc(zzamfVar, i);
                zzamfVar.zzh(0);
                return zzc;
            }
            zzamfVar.zzk(4);
            zzamfVar.zzH();
            int zzc2 = zzoc.zzc(zzamfVar, i);
            zzamfVar.zzh(0);
            return zzc2;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzsm
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzamf zzamfVar, long j, zzsk zzskVar) {
        byte[] zzi = zzamfVar.zzi();
        zzoh zzohVar = this.zza;
        if (zzohVar == null) {
            zzoh zzohVar2 = new zzoh(zzi, 17);
            this.zza = zzohVar2;
            zzskVar.zza = zzohVar2.zzc(Arrays.copyOfRange(zzi, 9, zzamfVar.zze()), null);
            return true;
        } else if ((zzi[0] & ByteCompanionObject.MAX_VALUE) == 3) {
            zzog zzb = zzoe.zzb(zzamfVar);
            zzoh zze = zzohVar.zze(zzb);
            this.zza = zze;
            this.zzb = new zzsb(zze, zzb);
            return true;
        } else if (zzd(zzi)) {
            zzsb zzsbVar = this.zzb;
            if (zzsbVar != null) {
                zzsbVar.zza(j);
                zzskVar.zzb = this.zzb;
            }
            if (zzskVar.zza != null) {
                return false;
            }
            throw null;
        } else {
            return true;
        }
    }
}
