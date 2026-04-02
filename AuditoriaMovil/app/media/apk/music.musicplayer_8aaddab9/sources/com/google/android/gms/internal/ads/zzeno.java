package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;
/* loaded from: classes.dex */
public final /* synthetic */ class zzeno implements zzfln {
    public static final zzfln zza = new zzeno();

    private zzeno() {
    }

    @Override // com.google.android.gms.internal.ads.zzfln
    public final Object apply(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        return new zzenq(appSetIdInfo.getId(), appSetIdInfo.getScope());
    }
}
