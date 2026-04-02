package com.kwad.sdk.core.download;

import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes.dex */
public class e implements d {
    private AdInfo mAdInfo;

    public e(AdTemplate adTemplate) {
        this.mAdInfo = com.kwad.sdk.core.response.b.d.ck(adTemplate);
    }

    @Override // com.kwad.sdk.core.download.d
    public final void a(String str, int i, int i2, int i3) {
    }

    @Override // com.kwad.sdk.core.download.d
    public void a(String str, int i, f fVar) {
    }

    @Override // com.kwad.sdk.core.download.d
    public final void a(String str, int i, String str2, f fVar) {
    }

    @Override // com.kwad.sdk.core.download.d
    public final void a(String str, f fVar) {
    }

    @Override // com.kwad.sdk.core.download.d
    public final void a(String str, String str2, f fVar) {
    }

    @Override // com.kwad.sdk.core.download.d
    public final void ao(String str) {
    }

    @Override // com.kwad.sdk.core.download.d
    public final void b(String str, f fVar) {
    }

    @Override // com.kwad.sdk.core.download.d
    public final void c(String str, f fVar) {
    }

    @Override // com.kwad.sdk.core.download.d
    public final void d(String str, f fVar) {
    }

    @Override // com.kwad.sdk.core.download.d
    public final void e(String str, f fVar) {
    }

    @Override // com.kwad.sdk.core.download.d
    public final String nB() {
        return this.mAdInfo.downloadId;
    }

    @Override // com.kwad.sdk.core.download.d
    public final String nC() {
        return this.mAdInfo.adBaseInfo.appPackageName;
    }
}
