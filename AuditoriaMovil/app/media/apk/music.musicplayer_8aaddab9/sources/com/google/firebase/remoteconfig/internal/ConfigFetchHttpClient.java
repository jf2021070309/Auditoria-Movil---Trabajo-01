package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import e.d.d.y.k;
import e.d.d.y.l;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class ConfigFetchHttpClient {
    public static final Pattern a = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: b  reason: collision with root package name */
    public final Context f4751b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4752c;

    /* renamed from: d  reason: collision with root package name */
    public final String f4753d;

    /* renamed from: e  reason: collision with root package name */
    public final String f4754e;

    /* renamed from: f  reason: collision with root package name */
    public final String f4755f;

    /* renamed from: g  reason: collision with root package name */
    public final long f4756g;

    /* renamed from: h  reason: collision with root package name */
    public final long f4757h;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j2, long j3) {
        this.f4751b = context;
        this.f4752c = str;
        this.f4753d = str2;
        Matcher matcher = a.matcher(str);
        this.f4754e = matcher.matches() ? matcher.group(1) : null;
        this.f4755f = str3;
        this.f4756g = j2;
        this.f4757h = j3;
    }

    public final JSONObject a(String str, String str2, Map<String, String> map) throws k {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("appInstanceId", str);
            hashMap.put("appInstanceIdToken", str2);
            hashMap.put("appId", this.f4752c);
            Locale locale = this.f4751b.getResources().getConfiguration().locale;
            hashMap.put("countryCode", locale.getCountry());
            int i2 = Build.VERSION.SDK_INT;
            hashMap.put("languageCode", i2 >= 21 ? locale.toLanguageTag() : locale.toString());
            hashMap.put("platformVersion", Integer.toString(i2));
            hashMap.put("timeZone", TimeZone.getDefault().getID());
            try {
                PackageInfo packageInfo = this.f4751b.getPackageManager().getPackageInfo(this.f4751b.getPackageName(), 0);
                if (packageInfo != null) {
                    hashMap.put("appVersion", packageInfo.versionName);
                    hashMap.put("appBuild", Long.toString(i2 >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            hashMap.put("packageName", this.f4751b.getPackageName());
            hashMap.put("sdkVersion", "21.0.1");
            hashMap.put("analyticsUserProperties", new JSONObject(map));
            return new JSONObject(hashMap);
        }
        throw new k("Fetch failed: Firebase installation id is null.");
    }

    public HttpURLConnection b() throws l {
        try {
            return (HttpURLConnection) new URL(String.format("https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch", this.f4754e, this.f4755f)).openConnection();
        } catch (IOException e2) {
            throw new l(e2.getMessage());
        }
    }

    public final JSONObject c(URLConnection uRLConnection) throws IOException, JSONException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), "utf-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read == -1) {
                return new JSONObject(sb.toString());
            }
            sb.append((char) read);
        }
    }

    public final void d(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a4 A[LOOP:0: B:12:0x009e->B:14:0x00a4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d6 A[Catch: all -> 0x0170, JSONException -> 0x0172, IOException | JSONException -> 0x0174, TRY_LEAVE, TryCatch #6 {all -> 0x0170, blocks: (B:15:0x00ba, B:17:0x00d6, B:51:0x0166, B:52:0x016f, B:58:0x0175, B:59:0x017c), top: B:80:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0166 A[Catch: all -> 0x0170, JSONException -> 0x0172, IOException | JSONException -> 0x0174, TRY_ENTER, TryCatch #6 {all -> 0x0170, blocks: (B:15:0x00ba, B:17:0x00d6, B:51:0x0166, B:52:0x016f, B:58:0x0175, B:59:0x017c), top: B:80:0x00a2 }] */
    @androidx.annotation.Keep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e.d.d.y.r.l.a fetch(java.net.HttpURLConnection r7, java.lang.String r8, java.lang.String r9, java.util.Map<java.lang.String, java.lang.String> r10, java.lang.String r11, java.util.Map<java.lang.String, java.lang.String> r12, java.util.Date r13) throws e.d.d.y.l {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.fetch(java.net.HttpURLConnection, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.util.Map, java.util.Date):e.d.d.y.r.l$a");
    }
}
