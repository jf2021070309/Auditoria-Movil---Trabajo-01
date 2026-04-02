package com.google.ads.interactivemedia.v3.internal;

import com.amazon.aps.iva.c.b;
import java.io.IOException;
import java.math.BigInteger;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzaau extends zzxi {
    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) throws IOException {
        if (zzacvVar.zzt() == 9) {
            zzacvVar.zzn();
            return null;
        }
        String zzi = zzacvVar.zzi();
        try {
            return new BigInteger(zzi);
        } catch (NumberFormatException e) {
            throw new zzwz(b.a("Failed parsing '", zzi, "' as BigInteger; at path ", zzacvVar.zzf()), e);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* synthetic */ void write(zzacx zzacxVar, Object obj) throws IOException {
        zzacxVar.zzj((BigInteger) obj);
    }
}
