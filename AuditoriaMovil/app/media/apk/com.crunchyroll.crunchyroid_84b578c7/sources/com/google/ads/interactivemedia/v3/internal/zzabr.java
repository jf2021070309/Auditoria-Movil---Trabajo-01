package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzabr extends zzxi {
    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) throws IOException {
        if (zzacvVar.zzt() == 9) {
            zzacvVar.zzn();
            return null;
        }
        try {
            int zzc = zzacvVar.zzc();
            if (zzc <= 255 && zzc >= -128) {
                return Byte.valueOf((byte) zzc);
            }
            String zzf = zzacvVar.zzf();
            throw new zzwz("Lossy conversion from " + zzc + " to byte; at path " + zzf);
        } catch (NumberFormatException e) {
            throw new zzwz(e);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ void write(zzacx zzacxVar, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            zzacxVar.zzf();
        } else {
            zzacxVar.zzh(number.byteValue());
        }
    }
}
