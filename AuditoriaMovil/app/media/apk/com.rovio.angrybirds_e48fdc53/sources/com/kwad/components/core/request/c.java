package com.kwad.components.core.request;

import com.kwad.components.core.response.model.AdResultData;
/* loaded from: classes.dex */
public class c extends b {
    @Override // com.kwad.components.core.request.b
    public void a(int i, String str, boolean z) {
        onError(i, str);
    }

    @Override // com.kwad.components.core.request.i
    public void a(AdResultData adResultData) {
    }

    @Override // com.kwad.components.core.request.b
    public void a(AdResultData adResultData, boolean z) {
        a(adResultData);
    }

    @Override // com.kwad.components.core.request.i
    public void onError(int i, String str) {
    }
}
