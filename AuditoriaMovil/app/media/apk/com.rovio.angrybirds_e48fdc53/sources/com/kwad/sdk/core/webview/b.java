package com.kwad.sdk.core.webview;

import android.view.ViewGroup;
import android.webkit.WebView;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.af;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class b {
    public ViewGroup MZ;
    public WebView My;
    public com.kwad.sdk.widget.e aym;
    public af ayn;
    public boolean ayo = true;
    public boolean ayp = true;
    private List<AdTemplate> ayq = null;
    public JSONObject mReportExtData;
    public int mScreenOrientation;

    public final List<AdTemplate> DW() {
        return this.ayq;
    }

    public final boolean DX() {
        List<AdTemplate> list = this.ayq;
        return list == null || list.size() == 0;
    }

    public final AdTemplate getAdTemplate() {
        List<AdTemplate> list = this.ayq;
        if (list == null || list.size() == 0) {
            return null;
        }
        return this.ayq.get(0);
    }

    public final void setAdTemplate(AdTemplate adTemplate) {
        if (adTemplate == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.ayq = arrayList;
        arrayList.add(adTemplate);
    }

    public final void setAdTemplateList(List<AdTemplate> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (AdTemplate adTemplate : list) {
            arrayList.add(adTemplate);
        }
        this.ayq = arrayList;
    }
}
