package com.facebook.ads.internal.a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.share.internal.ShareConstants;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class b {
    private static final String a = b.class.getSimpleName();

    public static a a(Context context, com.facebook.ads.internal.m.c cVar, String str, Uri uri, Map<String, String> map) {
        if (uri == null) {
            return null;
        }
        String authority = uri.getAuthority();
        String queryParameter = uri.getQueryParameter("video_url");
        if (!TextUtils.isEmpty(uri.getQueryParameter(ShareConstants.WEB_DIALOG_PARAM_DATA))) {
            try {
                JSONObject jSONObject = new JSONObject(uri.getQueryParameter(ShareConstants.WEB_DIALOG_PARAM_DATA));
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    map.put(next, jSONObject.getString(next));
                }
            } catch (JSONException e) {
                Log.w(a, "Unable to parse json data in AdActionFactory.", e);
            }
        }
        char c = 65535;
        switch (authority.hashCode()) {
            case -1458789996:
                if (authority.equals("passthrough")) {
                    c = 2;
                    break;
                }
                break;
            case 109770977:
                if (authority.equals("store")) {
                    c = 0;
                    break;
                }
                break;
            case 1546100943:
                if (authority.equals("open_link")) {
                    c = 1;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                if (queryParameter != null) {
                    return null;
                }
                return new e(context, cVar, str, uri, map);
            case 1:
                return new g(context, cVar, str, uri, map);
            case 2:
                return new h(context, cVar, str, uri, map);
            default:
                return new i(context, cVar, str, uri);
        }
    }

    public static boolean a(String str) {
        return "store".equalsIgnoreCase(str) || "open_link".equalsIgnoreCase(str);
    }
}
