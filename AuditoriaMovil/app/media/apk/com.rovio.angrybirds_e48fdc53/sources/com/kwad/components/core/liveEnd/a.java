package com.kwad.components.core.liveEnd;

import android.text.TextUtils;
import com.kwad.components.offline.api.core.adlive.IAdLiveEndRequest;
import com.kwad.sdk.core.network.b;
import com.kwad.sdk.utils.aq;
import java.util.Map;
/* loaded from: classes.dex */
public final class a extends b {
    private IAdLiveEndRequest fJ;

    public a(IAdLiveEndRequest iAdLiveEndRequest) {
        this.fJ = iAdLiveEndRequest;
    }

    @Override // com.kwad.sdk.core.network.b
    public final void buildBaseBody() {
    }

    @Override // com.kwad.sdk.core.network.b
    public final void buildBaseHeader() {
    }

    @Override // com.kwad.sdk.core.network.b, com.kwad.sdk.core.network.g
    public final Map<String, String> getBodyMap() {
        return this.fJ.getBodyMap();
    }

    @Override // com.kwad.sdk.core.network.b, com.kwad.sdk.core.network.g
    public final Map<String, String> getHeader() {
        IAdLiveEndRequest iAdLiveEndRequest = this.fJ;
        if (iAdLiveEndRequest == null || iAdLiveEndRequest.getHeader() == null || this.fJ.getHeader().size() <= 0) {
            return super.getHeader();
        }
        for (String str : this.fJ.getHeader().keySet()) {
            if (!TextUtils.isEmpty(this.fJ.getHeader().get(str))) {
                addHeader(str, this.fJ.getHeader().get(str));
            }
        }
        return super.getHeader();
    }

    @Override // com.kwad.sdk.core.network.b, com.kwad.sdk.core.network.g
    public final String getUrl() {
        return aq.appendUrl(this.fJ.getUrl(), this.fJ.getUrlParam());
    }
}
