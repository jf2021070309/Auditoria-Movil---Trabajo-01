package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzemw implements zzery<zzerx<Bundle>> {
    private final Set<String> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzemw(Set<String> set) {
        this.zza = set;
    }

    @Override // com.google.android.gms.internal.ads.zzery
    public final zzfsm<zzerx<Bundle>> zza() {
        final ArrayList arrayList = new ArrayList();
        for (String str : this.zza) {
            arrayList.add(str);
        }
        return zzfsd.zza(new zzerx(arrayList) { // from class: com.google.android.gms.internal.ads.zzemv
            private final ArrayList zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = arrayList;
            }

            @Override // com.google.android.gms.internal.ads.zzerx
            public final void zzf(Object obj) {
                ((Bundle) obj).putStringArrayList("ad_types", this.zza);
            }
        });
    }
}
