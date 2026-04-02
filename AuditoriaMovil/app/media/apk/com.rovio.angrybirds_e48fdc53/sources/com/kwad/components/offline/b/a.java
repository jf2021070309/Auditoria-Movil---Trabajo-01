package com.kwad.components.offline.b;

import android.content.Context;
import com.kwad.components.offline.api.obiwan.IObiwanLogcat;
import com.kwad.components.offline.api.obiwan.IObiwanOfflineCompo;
/* loaded from: classes.dex */
public class a implements com.kwad.components.core.n.a.b.a {
    private final IObiwanOfflineCompo ZA;

    public a(IObiwanOfflineCompo iObiwanOfflineCompo) {
        this.ZA = iObiwanOfflineCompo;
    }

    @Override // com.kwad.sdk.components.a
    public final Class getComponentsType() {
        return a.class;
    }

    public final IObiwanLogcat getLog() {
        return this.ZA.getLog();
    }

    @Override // com.kwad.sdk.components.a
    public final void init(Context context) {
    }

    @Override // com.kwad.sdk.components.a
    public final int priority() {
        return this.ZA.priority();
    }

    public final void updateConfigs() {
        this.ZA.updateConfigs();
    }
}
