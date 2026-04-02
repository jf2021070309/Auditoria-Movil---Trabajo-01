package com.kwad.components.offline.api.tk;

import com.kwad.components.offline.api.tk.model.StyleTemplate;
/* loaded from: classes.dex */
public interface TKDownloadListener {
    void onFailed(String str);

    void onSuccess(StyleTemplate styleTemplate);
}
