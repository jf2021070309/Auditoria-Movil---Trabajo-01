package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final /* synthetic */ class zzdpa implements zzfln {
    static final zzfln zza = new zzdpa();

    private zzdpa() {
    }

    @Override // com.google.android.gms.internal.ads.zzfln
    public final Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (zzblr zzblrVar : (List) obj) {
            if (zzblrVar != null) {
                arrayList.add(zzblrVar);
            }
        }
        return arrayList;
    }
}
