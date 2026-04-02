package com.kuaishou.weapon.p0;

import android.content.Context;
import android.net.Proxy;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.msdk.api.v2.GMNetworkPlatformConst;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ah {
    public static JSONObject a(Context context) {
        int port;
        String str;
        try {
            if (Build.VERSION.SDK_INT >= 14) {
                str = System.getProperty("http.proxyHost");
                String property = System.getProperty("http.proxyPort");
                if (property == null) {
                    property = GMNetworkPlatformConst.AD_NETWORK_NO_PRICE;
                }
                port = Integer.parseInt(property);
            } else {
                String host = Proxy.getHost(context);
                port = Proxy.getPort(context);
                str = host;
            }
            if (TextUtils.isEmpty(str) || port == -1) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.umeng.analytics.pro.bg.aG, str);
            jSONObject.put("p", port);
            return jSONObject;
        } catch (Exception e) {
            return null;
        } catch (Throwable th) {
            return null;
        }
    }
}
