package com.facebook.ads.internal.o;

import android.text.TextUtils;
import com.facebook.ads.internal.settings.AdInternalSettings;
/* loaded from: classes2.dex */
public class d {
    public static String a() {
        String urlPrefix = AdInternalSettings.getUrlPrefix();
        return TextUtils.isEmpty(urlPrefix) ? "https://graph.facebook-com/network_ads_common" : String.format("https://graph.%s.facebook.com/network_ads_common", urlPrefix);
    }

    public static String b() {
        String urlPrefix = AdInternalSettings.getUrlPrefix();
        return TextUtils.isEmpty(urlPrefix) ? "https://www.facebook.com/adnw_logging/" : String.format("https://www.%s.facebook.com/adnw_logging/", urlPrefix);
    }
}
