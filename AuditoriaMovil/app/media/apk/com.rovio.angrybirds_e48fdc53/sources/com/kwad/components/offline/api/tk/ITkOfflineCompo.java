package com.kwad.components.offline.api.tk;

import android.content.Context;
import com.kwad.components.offline.api.IOfflineCompo;
import com.kwad.components.offline.api.tk.model.StyleTemplate;
import org.json.JSONObject;
/* loaded from: classes.dex */
public interface ITkOfflineCompo extends IOfflineCompo<ITkOfflineCompoInitConfig> {
    public static final String IMPL = "com.kwad.tachikoma.TkOfflineCompoImpl";
    public static final String PACKAGE_NAME = "com.kwad.components.tachikoma";

    /* loaded from: classes.dex */
    public enum TKState {
        READY,
        SO_FAIL
    }

    StyleTemplate checkStyleTemplateById(Context context, String str, String str2, String str3, int i);

    String getJsBaseDir(Context context, String str);

    TKState getState();

    String getTKVersion();

    IOfflineCompoTachikomaView getView(Context context, String str, int i, int i2);

    void loadTkFileByTemplateId(Context context, String str, String str2, String str3, int i, TKDownloadListener tKDownloadListener);

    void onConfigRefresh(Context context, JSONObject jSONObject);

    void onDestroy();
}
