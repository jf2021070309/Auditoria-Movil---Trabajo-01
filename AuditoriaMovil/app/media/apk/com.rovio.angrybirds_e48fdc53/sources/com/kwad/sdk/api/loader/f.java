package com.kwad.sdk.api.loader;

import android.text.TextUtils;
import com.facebook.share.internal.ShareConstants;
import com.kwad.components.offline.api.BuildConfig;
import com.kwad.sdk.api.core.RequestParamsUtils;
import com.kwad.sdk.api.core.TLSConnectionUtils;
import com.kwad.sdk.api.loader.a;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
class f {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private int aiA;
    private String aiB;
    private final v aiz;
    private final String mUrl;

    /* loaded from: classes.dex */
    public interface a {
        void a(a.b bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(v vVar) {
        this.aiz = vVar;
        String yw = vVar.yw();
        this.mUrl = yw;
        this.aiB = yw;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x004c: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:37:0x004c */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(java.io.InputStream r5) {
        /*
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]
            r1 = 0
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L31
            r2.<init>()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L31
        La:
            int r3 = r5.read(r0)     // Catch: java.io.IOException -> L2d java.lang.Throwable -> L4b
            r4 = -1
            if (r3 == r4) goto L16
            r4 = 0
            r2.write(r0, r4, r3)     // Catch: java.io.IOException -> L2d java.lang.Throwable -> L4b
            goto La
        L16:
            java.lang.String r0 = r2.toString()     // Catch: java.io.IOException -> L2d java.lang.Throwable -> L4b
            if (r5 == 0) goto L24
            r5.close()     // Catch: java.io.IOException -> L20
            goto L24
        L20:
            r5 = move-exception
            r5.printStackTrace()
        L24:
            r2.close()     // Catch: java.io.IOException -> L28
            goto L2c
        L28:
            r5 = move-exception
            r5.printStackTrace()
        L2c:
            return r0
        L2d:
            r0 = move-exception
            goto L33
        L2f:
            r0 = move-exception
            goto L4d
        L31:
            r0 = move-exception
            r2 = r1
        L33:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L4b
            if (r5 == 0) goto L40
            r5.close()     // Catch: java.io.IOException -> L3c
            goto L40
        L3c:
            r5 = move-exception
            r5.printStackTrace()
        L40:
            if (r2 == 0) goto L4a
            r2.close()     // Catch: java.io.IOException -> L46
            goto L4a
        L46:
            r5 = move-exception
            r5.printStackTrace()
        L4a:
            return r1
        L4b:
            r0 = move-exception
            r1 = r2
        L4d:
            if (r5 == 0) goto L57
            r5.close()     // Catch: java.io.IOException -> L53
            goto L57
        L53:
            r5 = move-exception
            r5.printStackTrace()
        L57:
            if (r1 == 0) goto L61
            r1.close()     // Catch: java.io.IOException -> L5d
            goto L61
        L5d:
            r5 = move-exception
            r5.printStackTrace()
        L61:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.sdk.api.loader.f.a(java.io.InputStream):java.lang.String");
    }

    private static void a(HttpURLConnection httpURLConnection, Map<String, String> map) {
        if (map == null || httpURLConnection == null) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    private static HttpURLConnection bU(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        TLSConnectionUtils.wrapHttpURLConnection(httpURLConnection);
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(30000);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(true);
        return httpURLConnection;
    }

    private String d(Map<String, String> map) {
        String aA = g.aA(this.aiz.getContext());
        if (TextUtils.isEmpty(aA)) {
            aA = this.aiz.yx().getSDKVersion();
        }
        int sDKVersionCode = this.aiz.yx().getSDKVersionCode();
        JSONObject appInfo = this.aiz.yx().getAppInfo();
        JSONObject deviceInfo = this.aiz.yx().getDeviceInfo();
        JSONObject networkInfo = this.aiz.yx().getNetworkInfo();
        JSONObject jSONObject = new JSONObject();
        l.putValue(jSONObject, "sdkApiVersion", BuildConfig.VERSION_NAME);
        l.putValue(jSONObject, "sdkApiVersionCode", (int) BuildConfig.VERSION_CODE);
        l.putValue(jSONObject, "sdkVersion", aA);
        l.putValue(jSONObject, "SDKVersionCode", sDKVersionCode);
        l.putValue(jSONObject, "sdkType", 1);
        l.putValue(jSONObject, "appInfo", appInfo);
        l.putValue(jSONObject, "deviceInfo", deviceInfo);
        l.putValue(jSONObject, "networkInfo", networkInfo);
        l.putValue(jSONObject, "sdkAbi", w.wN());
        String jSONObject2 = jSONObject.toString();
        this.aiz.yx().addHp(map);
        JSONObject jSONObject3 = new JSONObject();
        l.putValue(jSONObject3, "version", BuildConfig.VERSION_NAME);
        l.putValue(jSONObject3, "appId", appInfo.optString("appId"));
        l.putValue(jSONObject3, ShareConstants.WEB_DIALOG_PARAM_MESSAGE, this.aiz.yx().getRM(jSONObject2));
        this.aiz.yx().sR(this.mUrl, map, jSONObject3.toString());
        return jSONObject3.toString();
    }

    private static Map<String, String> yn() {
        HashMap hashMap = new HashMap();
        hashMap.put("Accept-Language", "zh-CN");
        hashMap.put("Connection", "keep-alive");
        hashMap.put("Charset", "UTF-8");
        hashMap.put(DownloadUtils.CONTENT_TYPE, "application/json; charset=UTF-8");
        hashMap.put("User-Agent", RequestParamsUtils.getUserAgent());
        return hashMap;
    }

    public final void a(a aVar) {
        HttpURLConnection httpURLConnection = null;
        try {
            Map<String, String> yn = yn();
            String d = d(yn);
            HttpURLConnection bU = bU(this.aiB);
            a(bU, yn);
            bU.connect();
            new DataOutputStream(bU.getOutputStream()).write(d.getBytes());
            int responseCode = bU.getResponseCode();
            if (responseCode == 200) {
                String a2 = a(bU.getInputStream());
                a.b bVar = new a.b();
                if (a2 == null) {
                    throw new AssertionError();
                }
                JSONObject jSONObject = new JSONObject(a2);
                String optString = jSONObject.optString(ShareConstants.WEB_DIALOG_PARAM_DATA);
                if (!TextUtils.isEmpty(optString) && !"null".equals(optString)) {
                    jSONObject.put(ShareConstants.WEB_DIALOG_PARAM_DATA, new JSONObject(this.aiz.yx().getRD(optString)));
                }
                bVar.parseJson(jSONObject);
                aVar.a(bVar);
            } else if (responseCode / 100 != 3) {
                throw new RuntimeException("response code = " + responseCode);
            } else if (this.aiA < 21) {
                this.aiB = bU.getHeaderField("Location");
                this.aiA++;
                a(aVar);
            }
            if (bU != null) {
                try {
                    bU.disconnect();
                } catch (Exception e) {
                }
            }
        } catch (Exception e2) {
            if (0 != 0) {
                try {
                    httpURLConnection.disconnect();
                } catch (Exception e3) {
                }
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    httpURLConnection.disconnect();
                } catch (Exception e4) {
                }
            }
            throw th;
        }
    }
}
