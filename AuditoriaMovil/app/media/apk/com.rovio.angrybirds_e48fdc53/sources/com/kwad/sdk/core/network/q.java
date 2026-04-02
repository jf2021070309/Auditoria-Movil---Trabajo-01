package com.kwad.sdk.core.network;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.y;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
/* loaded from: classes.dex */
public final class q {
    private static String apQ = "";
    private static String apR = "";

    public static String Bg() {
        if (TextUtils.isEmpty(apQ)) {
            String property = System.getProperty("http.agent");
            apQ = property;
            if (TextUtils.isEmpty(property)) {
                return apQ;
            }
            StringBuffer stringBuffer = new StringBuffer();
            int length = apQ.length();
            for (int i = 0; i < length; i++) {
                char charAt = apQ.charAt(i);
                if (charAt <= 31 || charAt >= 127) {
                    stringBuffer.append(String.format("\\u%04x", Integer.valueOf(charAt)));
                } else {
                    stringBuffer.append(charAt);
                }
            }
            String stringBuffer2 = stringBuffer.toString();
            apQ = stringBuffer2;
            return stringBuffer2;
        }
        return apQ;
    }

    public static String Bh() {
        String ch;
        if (TextUtils.isEmpty(apR)) {
            Context context = ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getContext();
            if (context == null) {
                return "";
            }
            try {
                ch = y.ch(context);
                apR = ch;
            } catch (Exception e) {
            }
            if (TextUtils.isEmpty(ch)) {
                apR = Build.VERSION.SDK_INT >= 17 ? WebSettings.getDefaultUserAgent(context) : System.getProperty("http.agent");
                String encode = URLEncoder.encode(apR, "UTF-8");
                apR = encode;
                y.af(context, encode);
                return apR;
            }
            return apR;
        }
        return apR;
    }

    public static void b(HttpURLConnection httpURLConnection) {
        httpURLConnection.setRequestProperty("User-Agent", getUserAgent());
        httpURLConnection.setRequestProperty("BrowserUa", Bh());
        httpURLConnection.setRequestProperty("SystemUa", Bg());
    }

    public static String getDefaultUserAgent() {
        return Bg() + "-ksad-android-3.3.44";
    }

    public static String getUserAgent() {
        return ((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).getUserAgent();
    }
}
