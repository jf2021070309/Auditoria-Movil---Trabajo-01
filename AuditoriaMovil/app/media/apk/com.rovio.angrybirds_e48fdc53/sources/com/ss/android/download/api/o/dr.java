package com.ss.android.download.api.o;

import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.download.api.constant.BaseConstants;
import com.ss.android.downloadlib.addownload.wb;
import com.ss.android.socialbase.appdownloader.bn.q;
import com.umeng.analytics.pro.bg;
import java.util.List;
/* loaded from: classes3.dex */
public class dr {
    public static boolean dr(Uri uri) {
        if (uri == null) {
            return false;
        }
        String scheme = uri.getScheme();
        if (TextUtils.isEmpty(scheme)) {
            return false;
        }
        if (wb.ll().optInt("market_url_opt", 1) == 0) {
            return BaseConstants.SCHEME_MARKET.equals(scheme);
        }
        return BaseConstants.SCHEME_MARKET.equals(scheme) || "appmarket".equals(scheme) || "oaps".equals(scheme) || "oppomarket".equals(scheme) || "mimarket".equals(scheme) || "vivomarket".equals(scheme) || "vivoMarket".equals(scheme) || "gomarket".equals(scheme) || "goMarket".equals(scheme) || "mstore".equals(scheme) || BaseConstants.MARKET_SCHEME_SAMSUNG.equals(scheme);
    }

    public static String ge(Uri uri) {
        String scheme = uri.getScheme();
        List<String> pathSegments = uri.getPathSegments();
        if (wb.ll().optInt("market_scheme_opt") == 1 && q.bn() && BaseConstants.MARKET_SCHEME_SAMSUNG.equals(scheme) && pathSegments != null && pathSegments.size() == 1) {
            return pathSegments.get(0);
        }
        return ge.dr(uri.getQueryParameter("id"), uri.getQueryParameter("packagename"), uri.getQueryParameter("pkg"), uri.getQueryParameter(bg.o), uri.getQueryParameter("appId"));
    }
}
