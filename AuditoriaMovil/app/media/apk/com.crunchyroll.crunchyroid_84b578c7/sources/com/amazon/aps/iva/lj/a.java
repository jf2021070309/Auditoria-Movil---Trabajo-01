package com.amazon.aps.iva.lj;

import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.drm.DrmProxyService;
/* compiled from: DrmLicenseRepository.kt */
/* loaded from: classes.dex */
public final class a implements com.amazon.aps.iva.zj.a {
    public final DrmProxyService a;

    public a(DrmProxyService drmProxyService) {
        j.f(drmProxyService, "drmProxyService");
        this.a = drmProxyService;
    }

    @Override // com.amazon.aps.iva.zj.a
    public final String a() {
        return this.a.getSecurePlayWidevineLicenceUrl();
    }

    @Override // com.amazon.aps.iva.zj.a
    public final String b(String str) {
        return this.a.getWidevineLicense(str);
    }
}
