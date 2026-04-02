package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzwi extends zzxi {
    public zzwi(zzwm zzwmVar) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) throws IOException {
        if (zzacvVar.zzt() == 9) {
            zzacvVar.zzn();
            return null;
        }
        return Float.valueOf((float) zzacvVar.zza());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ void write(zzacx zzacxVar, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            zzacxVar.zzf();
            return;
        }
        float floatValue = number.floatValue();
        zzwm.zzg(floatValue);
        if (!(number instanceof Float)) {
            number = Float.valueOf(floatValue);
        }
        zzacxVar.zzj(number);
    }
}
