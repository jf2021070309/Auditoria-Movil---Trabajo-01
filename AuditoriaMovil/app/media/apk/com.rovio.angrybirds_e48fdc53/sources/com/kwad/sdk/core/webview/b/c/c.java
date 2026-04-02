package com.kwad.sdk.core.webview.b.c;

import com.facebook.ads.AudienceNetworkActivity;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class c {
    private static final List<String> aza;

    static {
        ArrayList arrayList = new ArrayList();
        aza = arrayList;
        arrayList.add("application/x-javascript");
        arrayList.add("image/jpeg");
        arrayList.add("image/tiff");
        arrayList.add("text/css");
        arrayList.add(AudienceNetworkActivity.WEBVIEW_MIME_TYPE);
        arrayList.add("image/gif");
        arrayList.add("image/png");
        arrayList.add("application/javascript");
        arrayList.add("video/mp4");
        arrayList.add("audio/mpeg");
        arrayList.add("application/json");
        arrayList.add("image/webp");
        arrayList.add("image/apng");
        arrayList.add("image/svg+xml");
        arrayList.add("application/octet-stream");
    }

    public static boolean ej(String str) {
        return aza.contains(str);
    }
}
