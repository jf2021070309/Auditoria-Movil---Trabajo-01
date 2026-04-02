package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final /* synthetic */ class zzdpn implements zzfln {
    static final zzfln zza = new zzdpn();

    private zzdpn() {
    }

    @Override // com.google.android.gms.internal.ads.zzfln
    public final Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (zzdpp zzdppVar : (List) obj) {
            if (zzdppVar != null) {
                arrayList.add(zzdppVar);
            }
        }
        return arrayList;
    }
}
