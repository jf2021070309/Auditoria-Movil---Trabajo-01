package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class zzne {
    public final List<byte[]> zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final float zze;
    public final String zzf;

    private zzne(List<byte[]> list, int i2, int i3, int i4, float f2, String str) {
        this.zza = list;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = f2;
        this.zzf = str;
    }

    public static zzne zza(zzamf zzamfVar) throws zzaha {
        String str;
        int i2;
        int i3;
        float f2;
        try {
            zzamfVar.zzk(4);
            int zzn = (zzamfVar.zzn() & 3) + 1;
            if (zzn != 3) {
                ArrayList arrayList = new ArrayList();
                int zzn2 = zzamfVar.zzn() & 31;
                for (int i4 = 0; i4 < zzn2; i4++) {
                    arrayList.add(zzb(zzamfVar));
                }
                int zzn3 = zzamfVar.zzn();
                for (int i5 = 0; i5 < zzn3; i5++) {
                    arrayList.add(zzb(zzamfVar));
                }
                if (zzn2 > 0) {
                    zzalv zzb = zzalw.zzb((byte[]) arrayList.get(0), zzn, ((byte[]) arrayList.get(0)).length);
                    int i6 = zzb.zze;
                    int i7 = zzb.zzf;
                    float f3 = zzb.zzg;
                    str = zzakv.zza(zzb.zza, zzb.zzb, zzb.zzc);
                    i2 = i6;
                    i3 = i7;
                    f2 = f3;
                } else {
                    str = null;
                    i2 = -1;
                    i3 = -1;
                    f2 = 1.0f;
                }
                return new zzne(arrayList, zzn, i2, i3, f2, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw zzaha.zzb("Error parsing AVC config", e2);
        }
    }

    private static byte[] zzb(zzamf zzamfVar) {
        int zzo = zzamfVar.zzo();
        int zzg = zzamfVar.zzg();
        zzamfVar.zzk(zzo);
        return zzakv.zzc(zzamfVar.zzi(), zzg, zzo);
    }
}
