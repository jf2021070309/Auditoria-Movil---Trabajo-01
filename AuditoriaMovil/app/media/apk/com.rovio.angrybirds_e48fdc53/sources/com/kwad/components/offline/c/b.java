package com.kwad.components.offline.c;

import android.content.Context;
import com.kwad.components.offline.api.tk.IOfflineCompoTachikomaView;
import com.kwad.components.offline.api.tk.ITkOfflineCompo;
import com.kwad.components.offline.api.tk.TKDownloadListener;
import com.kwad.components.offline.api.tk.model.StyleTemplate;
import com.kwad.components.offline.c.a.g;
import com.kwad.sdk.components.l;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class b implements com.kwad.components.core.n.a.c.c {
    private final ITkOfflineCompo ZH;

    public b(ITkOfflineCompo iTkOfflineCompo) {
        this.ZH = iTkOfflineCompo;
    }

    @Override // com.kwad.components.core.n.a.c.c
    public final l a(Context context, String str, int i, int i2) {
        IOfflineCompoTachikomaView view = this.ZH.getView(context, str, i, i2);
        if (view == null) {
            return null;
        }
        return new g(view);
    }

    @Override // com.kwad.components.core.n.a.c.c
    public final StyleTemplate checkStyleTemplateById(Context context, String str, String str2, String str3, int i) {
        return this.ZH.checkStyleTemplateById(context, str, str2, str3, i);
    }

    @Override // com.kwad.sdk.components.a
    public final Class<b> getComponentsType() {
        return b.class;
    }

    @Override // com.kwad.components.core.n.a.c.c
    public final String getJsBaseDir(Context context, String str) {
        return this.ZH.getJsBaseDir(context, str);
    }

    @Override // com.kwad.components.core.n.a.c.c
    public final ITkOfflineCompo.TKState getState() {
        return this.ZH.getState();
    }

    @Override // com.kwad.sdk.components.a
    public final void init(Context context) {
    }

    @Override // com.kwad.components.core.n.a.c.c
    public final void loadTkFileByTemplateId(Context context, String str, String str2, String str3, int i, TKDownloadListener tKDownloadListener) {
        this.ZH.loadTkFileByTemplateId(context, str, str2, str3, i, tKDownloadListener);
    }

    public final void onConfigRefresh(Context context, JSONObject jSONObject) {
        this.ZH.onConfigRefresh(context, jSONObject);
    }

    @Override // com.kwad.components.core.n.a.c.c
    public final void onDestroy() {
        this.ZH.onDestroy();
    }

    @Override // com.kwad.sdk.components.a
    public final int priority() {
        return this.ZH.priority();
    }
}
