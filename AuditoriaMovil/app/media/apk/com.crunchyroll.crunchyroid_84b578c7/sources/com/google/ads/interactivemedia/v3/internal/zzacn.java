package com.google.ads.interactivemedia.v3.internal;

import java.sql.Timestamp;
import java.util.Date;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzacn implements zzxj {
    @Override // com.google.ads.interactivemedia.v3.internal.zzxj
    public final zzxi zza(zzwm zzwmVar, zzact zzactVar) {
        if (zzactVar.zzc() != Timestamp.class) {
            return null;
        }
        return new zzacp(zzwmVar.zza(zzact.zza(Date.class)), null);
    }
}
