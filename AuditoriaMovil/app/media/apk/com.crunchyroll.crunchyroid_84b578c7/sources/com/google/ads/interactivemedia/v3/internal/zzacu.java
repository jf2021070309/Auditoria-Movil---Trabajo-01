package com.google.ads.interactivemedia.v3.internal;

import com.amazon.aps.iva.k.q;
import java.io.IOException;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzacu extends zzyp {
    @Override // com.google.ads.interactivemedia.v3.internal.zzyp
    public final void zza(zzacv zzacvVar) throws IOException {
        String b;
        int i;
        int i2 = zzacvVar.zza;
        if (i2 == 0) {
            i2 = zzacvVar.zzb();
        }
        if (i2 == 13) {
            i = 9;
        } else if (i2 == 12) {
            i = 8;
        } else if (i2 != 14) {
            b = q.b("Expected a name but was ", zzacw.zza(zzacvVar.zzt()), zzacvVar.zzg());
            throw new IllegalStateException(b);
        } else {
            i = 10;
        }
        zzacvVar.zza = i;
    }
}
