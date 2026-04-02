package com.kwad.components.offline.a;

import android.content.Context;
import com.kwad.components.offline.api.adLive.IAdLiveOfflineCompo;
import com.kwad.components.offline.api.core.adlive.IAdLiveEndRequest;
import com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView;
import com.kwad.components.offline.api.core.adlive.IAdLivePlayModule;
/* loaded from: classes.dex */
public class a implements com.kwad.components.core.n.a.a.a {
    private final IAdLiveOfflineCompo Zn;

    public a(IAdLiveOfflineCompo iAdLiveOfflineCompo) {
        this.Zn = iAdLiveOfflineCompo;
    }

    @Override // com.kwad.components.core.n.a.a.a
    public final IAdLiveEndRequest getAdLiveEndRequest(String str) {
        return this.Zn.getAdLiveEndRequest(str);
    }

    @Override // com.kwad.components.core.n.a.a.a
    public final IAdLivePlayModule getAdLivePlayModule(IAdLiveOfflineView iAdLiveOfflineView, String str, String str2) {
        return this.Zn.getAdLivePlayModule(iAdLiveOfflineView, str, str2);
    }

    @Override // com.kwad.sdk.components.a
    public final Class<a> getComponentsType() {
        return a.class;
    }

    @Override // com.kwad.components.core.n.a.a.a
    public final IAdLiveOfflineView getView(Context context, int i) {
        return this.Zn.getView(context, i);
    }

    @Override // com.kwad.sdk.components.a
    public final void init(Context context) {
    }

    @Override // com.kwad.components.core.n.a.a.a
    public final boolean oi() {
        return this.Zn.getState() == IAdLiveOfflineCompo.AdLiveState.READY;
    }

    @Override // com.kwad.sdk.components.a
    public final int priority() {
        return this.Zn.priority();
    }
}
