package com.kwad.components.offline.c.a;

import android.view.View;
import com.kwad.components.offline.api.tk.IOfflineCompoTachikomaView;
import com.kwad.sdk.components.j;
import com.kwad.sdk.components.k;
import com.kwad.sdk.components.l;
import com.kwad.sdk.utils.ao;
import java.util.Map;
/* loaded from: classes.dex */
public final class g implements l {
    private final IOfflineCompoTachikomaView aaf;

    public g(IOfflineCompoTachikomaView iOfflineCompoTachikomaView) {
        ao.checkNotNull(iOfflineCompoTachikomaView);
        this.aaf = iOfflineCompoTachikomaView;
    }

    @Override // com.kwad.sdk.components.l
    public final void a(j jVar) {
        if (jVar != null) {
            this.aaf.registerHostActionHandler(new c(jVar));
        }
    }

    @Override // com.kwad.sdk.components.l
    public final void a(String str, String str2, k kVar) {
        this.aaf.execute(str, str2, new f(kVar));
    }

    @Override // com.kwad.sdk.components.l
    public final void b(com.kwad.sdk.core.webview.c.g gVar) {
        if (gVar == null) {
            return;
        }
        this.aaf.registerTKBridge(new d(gVar));
    }

    @Override // com.kwad.sdk.components.l
    public final void c(com.kwad.sdk.core.webview.c.a aVar) {
        if (aVar == null) {
            return;
        }
        this.aaf.registerJsBridge(new b(aVar));
    }

    @Override // com.kwad.sdk.components.l
    public final Object execute(String str) {
        return this.aaf.execute(str);
    }

    @Override // com.kwad.sdk.components.l
    public final int getUniqId() {
        return this.aaf.getUniqId();
    }

    @Override // com.kwad.sdk.components.l
    public final View getView() {
        return this.aaf.getView();
    }

    @Override // com.kwad.sdk.components.l
    public final void onDestroy() {
        this.aaf.onDestroy();
    }

    @Override // com.kwad.sdk.components.l
    public final void setCustomEnv(Map<String, Object> map) {
        this.aaf.setCustomEnv(map);
    }
}
