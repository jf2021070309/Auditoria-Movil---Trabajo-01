package com.google.ads.interactivemedia.v3.internal;

import com.amazon.aps.iva.c.b;
import java.io.IOException;
import java.util.Currency;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzabd extends zzxi {
    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) throws IOException {
        String zzi = zzacvVar.zzi();
        try {
            return Currency.getInstance(zzi);
        } catch (IllegalArgumentException e) {
            throw new zzwz(b.a("Failed parsing '", zzi, "' as Currency; at path ", zzacvVar.zzf()), e);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* synthetic */ void write(zzacx zzacxVar, Object obj) throws IOException {
        zzacxVar.zzk(((Currency) obj).getCurrencyCode());
    }
}
