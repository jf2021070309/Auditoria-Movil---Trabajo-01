package com.google.ads.interactivemedia.v3.internal;

import com.amazon.aps.iva.c.b;
import java.io.IOException;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzzx extends zzxi {
    private static final zzxj zza = zzb(zzxf.LAZILY_PARSED_NUMBER);
    private final zzxg zzb;

    private zzzx(zzxg zzxgVar) {
        this.zzb = zzxgVar;
    }

    public static zzxj zza(zzxg zzxgVar) {
        if (zzxgVar == zzxf.LAZILY_PARSED_NUMBER) {
            return zza;
        }
        return zzb(zzxgVar);
    }

    private static zzxj zzb(zzxg zzxgVar) {
        return new zzzw(new zzzx(zzxgVar));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) throws IOException {
        int zzt = zzacvVar.zzt();
        int i = zzt - 1;
        if (i != 5 && i != 6) {
            if (i == 8) {
                zzacvVar.zzn();
                return null;
            }
            throw new zzwz(b.a("Expecting number, got: ", zzacw.zza(zzt), "; at path ", zzacvVar.zze()));
        }
        return this.zzb.zza(zzacvVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* synthetic */ void write(zzacx zzacxVar, Object obj) throws IOException {
        zzacxVar.zzj((Number) obj);
    }
}
