package bolts;

import android.content.Context;
import android.net.Uri;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import bolts.AppLink;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.AnalyticsEvents;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class WebViewAppLinkResolver implements AppLinkResolver {
    private final Context a;

    public WebViewAppLinkResolver(Context context) {
        this.a = context;
    }

    @Override // bolts.AppLinkResolver
    public Task<AppLink> getAppLinkFromUrlInBackground(final Uri uri) {
        final Capture capture = new Capture();
        final Capture capture2 = new Capture();
        return Task.callInBackground(new Callable<Void>() { // from class: bolts.WebViewAppLinkResolver.3
            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public Void call() {
                URL url;
                URL url2 = new URL(uri.toString());
                HttpURLConnection httpURLConnection = null;
                while (url2 != null) {
                    URLConnection openConnection = url2.openConnection();
                    if (openConnection instanceof HttpURLConnection) {
                        ((HttpURLConnection) openConnection).setInstanceFollowRedirects(true);
                    }
                    openConnection.setRequestProperty("Prefer-Html-Meta-Tags", "al");
                    openConnection.connect();
                    if (openConnection instanceof HttpURLConnection) {
                        HttpURLConnection httpURLConnection2 = (HttpURLConnection) openConnection;
                        if (httpURLConnection2.getResponseCode() < 300 || httpURLConnection2.getResponseCode() >= 400) {
                            url = null;
                        } else {
                            URL url3 = new URL(httpURLConnection2.getHeaderField("Location"));
                            httpURLConnection2.disconnect();
                            url = url3;
                        }
                        url2 = url;
                        httpURLConnection = openConnection;
                    } else {
                        httpURLConnection = openConnection;
                        url2 = null;
                    }
                }
                try {
                    capture.set(WebViewAppLinkResolver.b(httpURLConnection));
                    capture2.set(httpURLConnection.getContentType());
                    return null;
                } finally {
                    if (httpURLConnection instanceof HttpURLConnection) {
                        httpURLConnection.disconnect();
                    }
                }
            }
        }).onSuccessTask(new Continuation<Void, Task<JSONArray>>() { // from class: bolts.WebViewAppLinkResolver.2
            @Override // bolts.Continuation
            /* renamed from: a */
            public Task<JSONArray> then(Task<Void> task) {
                final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                WebView webView = new WebView(WebViewAppLinkResolver.this.a);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.setNetworkAvailable(false);
                webView.setWebViewClient(new WebViewClient() { // from class: bolts.WebViewAppLinkResolver.2.1
                    private boolean b = false;

                    private void a(WebView webView2) {
                        if (!this.b) {
                            this.b = true;
                            webView2.loadUrl("javascript:boltsWebViewAppLinkResolverResult.setValue((function() {  var metaTags = document.getElementsByTagName('meta');  var results = [];  for (var i = 0; i < metaTags.length; i++) {    var property = metaTags[i].getAttribute('property');    if (property && property.substring(0, 'al:'.length) === 'al:') {      var tag = { \"property\": metaTags[i].getAttribute('property') };      if (metaTags[i].hasAttribute('content')) {        tag['content'] = metaTags[i].getAttribute('content');      }      results.push(tag);    }  }  return JSON.stringify(results);})())");
                        }
                    }

                    @Override // android.webkit.WebViewClient
                    public void onPageFinished(WebView webView2, String str) {
                        super.onPageFinished(webView2, str);
                        a(webView2);
                    }

                    @Override // android.webkit.WebViewClient
                    public void onLoadResource(WebView webView2, String str) {
                        super.onLoadResource(webView2, str);
                        a(webView2);
                    }
                });
                webView.addJavascriptInterface(new Object() { // from class: bolts.WebViewAppLinkResolver.2.2
                    @JavascriptInterface
                    public void setValue(String str) {
                        try {
                            taskCompletionSource.trySetResult(new JSONArray(str));
                        } catch (JSONException e) {
                            taskCompletionSource.trySetError(e);
                        }
                    }
                }, "boltsWebViewAppLinkResolverResult");
                webView.loadDataWithBaseURL(uri.toString(), (String) capture.get(), capture2.get() != null ? ((String) capture2.get()).split(";")[0] : null, null, null);
                return taskCompletionSource.getTask();
            }
        }, Task.UI_THREAD_EXECUTOR).onSuccess(new Continuation<JSONArray, AppLink>() { // from class: bolts.WebViewAppLinkResolver.1
            @Override // bolts.Continuation
            /* renamed from: a */
            public AppLink then(Task<JSONArray> task) {
                return WebViewAppLinkResolver.b(WebViewAppLinkResolver.b(task.getResult()), uri);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.Map] */
    public static Map<String, Object> b(JSONArray jSONArray) {
        ArrayList arrayList;
        HashMap hashMap = new HashMap();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String[] split = jSONObject.getString("property").split(":");
            if (split[0].equals("al")) {
                HashMap hashMap2 = hashMap;
                for (int i2 = 1; i2 < split.length; i2++) {
                    List list = (List) hashMap2.get(split[i2]);
                    if (list == null) {
                        ArrayList arrayList2 = new ArrayList();
                        hashMap2.put(split[i2], arrayList2);
                        arrayList = arrayList2;
                    } else {
                        arrayList = list;
                    }
                    HashMap hashMap3 = arrayList.size() > 0 ? (Map) arrayList.get(arrayList.size() - 1) : null;
                    if (hashMap3 == null || i2 == split.length - 1) {
                        hashMap3 = new HashMap();
                        arrayList.add(hashMap3);
                    }
                    hashMap2 = hashMap3;
                }
                if (jSONObject.has("content")) {
                    if (jSONObject.isNull("content")) {
                        hashMap2.put("value", null);
                    } else {
                        hashMap2.put("value", jSONObject.getString("content"));
                    }
                }
            }
        }
        return hashMap;
    }

    private static List<Map<String, Object>> a(Map<String, Object> map, String str) {
        List<Map<String, Object>> list = (List) map.get(str);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AppLink b(Map<String, Object> map, Uri uri) {
        Uri uri2;
        ArrayList arrayList = new ArrayList();
        List<Map> list = (List) map.get("android");
        if (list == null) {
            list = Collections.emptyList();
        }
        for (Map map2 : list) {
            List<Map<String, Object>> a = a(map2, "url");
            List<Map<String, Object>> a2 = a(map2, "package");
            List<Map<String, Object>> a3 = a(map2, "class");
            List<Map<String, Object>> a4 = a(map2, "app_name");
            int max = Math.max(a.size(), Math.max(a2.size(), Math.max(a3.size(), a4.size())));
            int i = 0;
            while (i < max) {
                arrayList.add(new AppLink.Target((String) (a2.size() > i ? a2.get(i).get("value") : null), (String) (a3.size() > i ? a3.get(i).get("value") : null), a((String) (a.size() > i ? a.get(i).get("value") : null)), (String) (a4.size() > i ? a4.get(i).get("value") : null)));
                i++;
            }
        }
        List list2 = (List) map.get(AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_WEB);
        if (list2 == null || list2.size() <= 0) {
            uri2 = uri;
        } else {
            Map map3 = (Map) list2.get(0);
            List list3 = (List) map3.get("url");
            List list4 = (List) map3.get("should_fallback");
            uri2 = (list4 == null || list4.size() <= 0 || !Arrays.asList("no", "false", AppEventsConstants.EVENT_PARAM_VALUE_NO).contains(((String) ((Map) list4.get(0)).get("value")).toLowerCase())) ? uri : null;
            if (uri2 != null && list3 != null && list3.size() > 0) {
                uri2 = a((String) ((Map) list3.get(0)).get("value"));
            }
        }
        return new AppLink(uri, arrayList, uri2);
    }

    private static Uri a(String str) {
        if (str == null) {
            return null;
        }
        return Uri.parse(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(URLConnection uRLConnection) {
        InputStream inputStream;
        InputStream errorStream;
        int i = 0;
        if (uRLConnection instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            try {
                errorStream = uRLConnection.getInputStream();
            } catch (Exception e) {
                errorStream = httpURLConnection.getErrorStream();
            }
            inputStream = errorStream;
        } else {
            inputStream = uRLConnection.getInputStream();
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            String contentEncoding = uRLConnection.getContentEncoding();
            if (contentEncoding == null) {
                String[] split = uRLConnection.getContentType().split(";");
                int length = split.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    String trim = split[i].trim();
                    if (!trim.startsWith("charset=")) {
                        i++;
                    } else {
                        contentEncoding = trim.substring("charset=".length());
                        break;
                    }
                }
                if (contentEncoding == null) {
                    contentEncoding = "UTF-8";
                }
            }
            return new String(byteArrayOutputStream.toByteArray(), contentEncoding);
        } finally {
            inputStream.close();
        }
    }
}
