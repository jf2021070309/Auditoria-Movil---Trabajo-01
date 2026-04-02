package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzaay extends zzxi {
    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) throws IOException {
        if (zzacvVar.zzt() == 9) {
            zzacvVar.zzn();
            return null;
        }
        return new StringBuffer(zzacvVar.zzi());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ void write(zzacx zzacxVar, Object obj) throws IOException {
        String stringBuffer;
        StringBuffer stringBuffer2 = (StringBuffer) obj;
        if (stringBuffer2 == null) {
            stringBuffer = null;
        } else {
            stringBuffer = stringBuffer2.toString();
        }
        zzacxVar.zzk(stringBuffer);
    }
}
