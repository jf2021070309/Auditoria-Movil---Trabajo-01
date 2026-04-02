package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final /* synthetic */ class zzeno implements zzfln {
    static final zzfln zza = new zzeno();

    private zzeno() {
    }

    @Override // com.google.android.gms.internal.ads.zzfln
    public final Object apply(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        return new zzenq(appSetIdInfo.getId(), appSetIdInfo.getScope());
    }
}
