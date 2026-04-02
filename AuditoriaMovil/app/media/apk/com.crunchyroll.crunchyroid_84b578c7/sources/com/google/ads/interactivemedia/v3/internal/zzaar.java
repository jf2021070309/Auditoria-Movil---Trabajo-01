package com.google.ads.interactivemedia.v3.internal;

import com.amazon.aps.iva.c.b;
import java.io.IOException;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzaar extends zzxi {
    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) throws IOException {
        if (zzacvVar.zzt() == 9) {
            zzacvVar.zzn();
            return null;
        }
        String zzi = zzacvVar.zzi();
        if (zzi.length() == 1) {
            return Character.valueOf(zzi.charAt(0));
        }
        throw new zzwz(b.a("Expecting character, got: ", zzi, "; at ", zzacvVar.zzf()));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ void write(zzacx zzacxVar, Object obj) throws IOException {
        String obj2;
        Character ch = (Character) obj;
        if (ch == null) {
            obj2 = null;
        } else {
            obj2 = ch.toString();
        }
        zzacxVar.zzk(obj2);
    }
}
