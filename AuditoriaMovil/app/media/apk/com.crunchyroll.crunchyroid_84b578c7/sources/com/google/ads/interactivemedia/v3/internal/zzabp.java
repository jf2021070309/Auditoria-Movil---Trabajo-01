package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzabp extends zzxi {
    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) throws IOException {
        int zzt = zzacvVar.zzt();
        if (zzt == 9) {
            zzacvVar.zzn();
            return null;
        } else if (zzt == 6) {
            return Boolean.valueOf(Boolean.parseBoolean(zzacvVar.zzi()));
        } else {
            return Boolean.valueOf(zzacvVar.zzs());
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* synthetic */ void write(zzacx zzacxVar, Object obj) throws IOException {
        zzacxVar.zzi((Boolean) obj);
    }
}
