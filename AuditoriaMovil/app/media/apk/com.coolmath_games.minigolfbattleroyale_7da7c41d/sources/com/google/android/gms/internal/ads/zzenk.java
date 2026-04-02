package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final /* synthetic */ class zzenk implements zzfln {
    static final zzfln zza = new zzenk();

    private zzenk() {
    }

    @Override // com.google.android.gms.internal.ads.zzfln
    public final Object apply(Object obj) {
        final ArrayList arrayList = (ArrayList) obj;
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzerx(arrayList) { // from class: com.google.android.gms.internal.ads.zzenl
            private final ArrayList zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = arrayList;
            }

            @Override // com.google.android.gms.internal.ads.zzerx
            public final void zzf(Object obj2) {
                ((Bundle) obj2).putStringArrayList("android_permissions", this.zza);
            }
        };
    }
}
