package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final /* synthetic */ class zzenk implements zzfln {
    public static final zzfln zza = new zzenk();

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
