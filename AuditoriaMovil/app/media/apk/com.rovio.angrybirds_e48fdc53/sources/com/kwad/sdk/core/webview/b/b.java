package com.kwad.sdk.core.webview.b;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebResourceResponse;
import com.facebook.internal.ServerProtocol;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.core.webview.b.c.b;
import com.kwad.sdk.crash.utils.h;
import com.kwad.sdk.utils.q;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class b {
    private static final Map<String, com.kwad.sdk.core.webview.b.a.b> ayN = new ConcurrentHashMap();
    private static final Map<String, String> ayO = new ConcurrentHashMap();

    private static String W(String str, String str2) {
        return str + Uri.parse(str2).getPath();
    }

    private static void X(String str, String str2) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return;
        }
        ayO.put(str, str2);
    }

    public static WebResourceResponse a(Context context, String str, com.kwad.sdk.h.a.b bVar, b.a aVar, boolean z) {
        com.kwad.sdk.core.webview.b.a.b bVar2;
        StringBuilder sb;
        String sb2;
        try {
            bVar2 = a(context, bVar, str, aVar);
        } catch (Exception e) {
            c.printStackTraceOnly(e);
            aVar.msg = "获取配置文件失败 崩溃" + Log.getStackTraceString(e);
            bVar2 = null;
        }
        if (bVar2 == null) {
            b(z, aVar.msg);
            if (TextUtils.isEmpty(aVar.msg)) {
                aVar.msg = "获取配置文件失败";
            }
            return null;
        }
        if (TextUtils.isEmpty(bVar2.ayV)) {
            b(z, "getResource [" + str + "] getFilePath from url fail");
            sb2 = "getFilePath from url fail";
        } else {
            if (com.kwad.sdk.core.webview.b.c.c.ej(bVar2.ayR)) {
                BufferedInputStream fp = q.fp(bVar2.ayV);
                if (fp != null) {
                    return a(fp, bVar2);
                }
                b(z, "getResource [" + str + "] inputStream is null");
                sb = new StringBuilder("inputStream is null,本地加载路径：");
                sb.append(bVar2.ayV);
            } else {
                b(z, "mimetype为: " + bVar2.ayR + "不在拦截范围的文件");
                sb = new StringBuilder("mimetype为: ");
                sb.append(bVar2.ayR);
                sb.append("不在拦截范围的文件");
            }
            sb2 = sb.toString();
        }
        aVar.msg = sb2;
        return null;
    }

    private static WebResourceResponse a(InputStream inputStream, com.kwad.sdk.core.webview.b.a.b bVar) {
        String str = bVar.ayR;
        if (Build.VERSION.SDK_INT >= 21) {
            HashMap hashMap = new HashMap();
            hashMap.put("Access-Control-Allow-Origin", bVar.ayU.ayP);
            hashMap.put("Access-Control-Allow-Credentials", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            hashMap.put("Timing-Allow-Origin", bVar.ayU.ayQ);
            hashMap.put("content-type", str);
            hashMap.put("Date", bVar.ayU.ayS);
            hashMap.put("union-cache ", "1");
            return new WebResourceResponse(bVar.ayR, "", bVar.status, "OK", hashMap, inputStream);
        }
        return new WebResourceResponse(str, "UTF-8", inputStream);
    }

    private static com.kwad.sdk.core.webview.b.a.b a(Context context, com.kwad.sdk.h.a.b bVar, String str, b.a aVar) {
        InputStreamReader inputStreamReader;
        FileInputStream fileInputStream = null;
        try {
            String ec = ec(bVar.aCj);
            com.kwad.sdk.core.webview.b.a.b eb = !TextUtils.isEmpty(ec) ? eb(W(ec, str)) : null;
            if (eb != null) {
                com.kwad.sdk.crash.utils.b.closeQuietly((Closeable) null);
                com.kwad.sdk.crash.utils.b.closeQuietly((Closeable) null);
                return eb;
            }
            String E = com.kwad.sdk.core.webview.b.c.a.E(context, bVar.aCk);
            if (E == null) {
                aVar.msg = "获取配置文件失败 offlinepackage 为空";
                com.kwad.sdk.crash.utils.b.closeQuietly((Closeable) null);
                com.kwad.sdk.crash.utils.b.closeQuietly((Closeable) null);
                return null;
            }
            File file = new File(E);
            if (!file.exists()) {
                aVar.msg = "获取配置文件失败 下载文件路径不存在 " + E;
                com.kwad.sdk.crash.utils.b.closeQuietly((Closeable) null);
                com.kwad.sdk.crash.utils.b.closeQuietly((Closeable) null);
                return null;
            }
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                inputStreamReader = new InputStreamReader(fileInputStream2);
                try {
                    String b = h.b(inputStreamReader);
                    if (TextUtils.isEmpty(b)) {
                        aVar.msg = "获取配置文件失败 mainfest文件不存在";
                        com.kwad.sdk.crash.utils.b.closeQuietly(fileInputStream2);
                        com.kwad.sdk.crash.utils.b.closeQuietly(inputStreamReader);
                        return null;
                    }
                    JSONObject jSONObject = new JSONObject(b);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                        com.kwad.sdk.core.webview.b.a.b bVar2 = new com.kwad.sdk.core.webview.b.a.b();
                        bVar2.parseJson(jSONObject2);
                        String host = Uri.parse("https://" + next).getHost();
                        bVar2.ayW = host;
                        bVar2.ayV = com.kwad.sdk.core.webview.b.c.a.D(context, bVar.aCk) + "/" + next;
                        if (TextUtils.isEmpty(bVar2.ayR)) {
                            bVar2.ayR = URLConnection.getFileNameMap().getContentTypeFor(bVar2.ayV);
                        }
                        a(next, bVar2);
                        ec = host;
                    }
                    X(bVar.aCj, ec);
                    com.kwad.sdk.core.webview.b.a.b eb2 = eb(W(ec, str));
                    com.kwad.sdk.crash.utils.b.closeQuietly(fileInputStream2);
                    com.kwad.sdk.crash.utils.b.closeQuietly(inputStreamReader);
                    return eb2;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    com.kwad.sdk.crash.utils.b.closeQuietly(fileInputStream);
                    com.kwad.sdk.crash.utils.b.closeQuietly(inputStreamReader);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStreamReader = null;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStreamReader = null;
        }
    }

    private static void a(String str, com.kwad.sdk.core.webview.b.a.b bVar) {
        ayN.put(String.valueOf(str.hashCode()), bVar);
    }

    private static void b(boolean z, String str) {
        if (z) {
            return;
        }
        c.d("HybridResourceManager", str);
    }

    private static com.kwad.sdk.core.webview.b.a.b eb(String str) {
        return ayN.get(String.valueOf(str.hashCode()));
    }

    private static String ec(String str) {
        return ayO.get(str);
    }
}
