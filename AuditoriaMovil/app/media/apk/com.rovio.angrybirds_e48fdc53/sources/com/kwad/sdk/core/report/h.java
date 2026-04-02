package com.kwad.sdk.core.report;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONArray;
/* loaded from: classes.dex */
public final class h extends com.kwad.sdk.core.network.d {
    protected String ara;

    public h(String str) {
        this.ara = "";
        this.ara = str;
    }

    public h(List<r> list) {
        this.ara = "";
        if (list == null || list.size() <= 0) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (r rVar : list) {
            com.kwad.sdk.utils.t.putValue(jSONArray, rVar.buildReportData());
        }
        putBody("actionList", jSONArray);
    }

    @Override // com.kwad.sdk.core.network.b
    public final String getBodyParamsString() {
        String bodyParamsString = super.getBodyParamsString();
        try {
            if (TextUtils.isEmpty(this.ara)) {
                return bodyParamsString;
            }
            StringBuilder sb = new StringBuilder(bodyParamsString);
            sb.insert(sb.length() - 1, this.ara);
            return sb.toString();
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTrace(e);
            return bodyParamsString;
        }
    }

    @Override // com.kwad.sdk.core.network.b, com.kwad.sdk.core.network.g
    public final String getUrl() {
        return com.kwad.sdk.h.xd();
    }
}
