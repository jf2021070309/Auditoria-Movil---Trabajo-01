package net.hockeyapp.android.utils;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.hockeyapp.android.Constants;
/* loaded from: classes4.dex */
public class HttpURLConnectionBuilder {
    public static final String DEFAULT_CHARSET = "UTF-8";
    public static final int FIELDS_LIMIT = 25;
    public static final long FORM_FIELD_LIMIT = 4194304;
    private final String a;
    private String b;
    private String c;
    private SimpleMultipartEntity d;
    private int e = 120000;
    private final Map<String, String> f = new HashMap();

    public HttpURLConnectionBuilder(String str) {
        this.a = str;
        this.f.put("User-Agent", Constants.SDK_USER_AGENT);
    }

    public HttpURLConnectionBuilder setRequestMethod(String str) {
        this.b = str;
        return this;
    }

    public HttpURLConnectionBuilder setRequestBody(String str) {
        this.c = str;
        return this;
    }

    public HttpURLConnectionBuilder writeFormFields(Map<String, String> map) {
        if (map.size() > 25) {
            throw new IllegalArgumentException("Fields size too large: " + map.size() + " - max allowed: 25");
        }
        for (String str : map.keySet()) {
            String str2 = map.get(str);
            if (str2.length() > FORM_FIELD_LIMIT) {
                throw new IllegalArgumentException("Form field " + str + " size too large: " + str2.length() + " - max allowed: " + FORM_FIELD_LIMIT);
            }
        }
        try {
            String a = a(map, "UTF-8");
            setHeader(DownloadUtils.CONTENT_TYPE, "application/x-www-form-urlencoded");
            setRequestBody(a);
            return this;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public HttpURLConnectionBuilder writeMultipartData(Map<String, String> map, Context context, List<Uri> list) {
        try {
            this.d = new SimpleMultipartEntity();
            this.d.writeFirstBoundaryIfNeeds();
            for (String str : map.keySet()) {
                this.d.addPart(str, map.get(str));
            }
            int i = 0;
            while (i < list.size()) {
                Uri uri = list.get(i);
                this.d.addPart(MessengerShareContentUtility.ATTACHMENT + i, uri.getLastPathSegment(), context.getContentResolver().openInputStream(uri), i == list.size() + (-1));
                i++;
            }
            this.d.writeLastBoundaryIfNeeds();
            setHeader(DownloadUtils.CONTENT_TYPE, "multipart/form-data; boundary=" + this.d.getBoundary());
            return this;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public HttpURLConnectionBuilder setTimeout(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Timeout has to be positive.");
        }
        this.e = i;
        return this;
    }

    public HttpURLConnectionBuilder setHeader(String str, String str2) {
        this.f.put(str, str2);
        return this;
    }

    public HttpURLConnectionBuilder setBasicAuthorization(String str, String str2) {
        setHeader("Authorization", "Basic " + Base64.encodeToString((str + ":" + str2).getBytes(), 2));
        return this;
    }

    public HttpURLConnection build() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.a).openConnection();
        httpURLConnection.setConnectTimeout(this.e);
        httpURLConnection.setReadTimeout(this.e);
        if (Build.VERSION.SDK_INT <= 9) {
            httpURLConnection.setRequestProperty("Connection", "close");
        }
        if (!TextUtils.isEmpty(this.b)) {
            httpURLConnection.setRequestMethod(this.b);
            if (!TextUtils.isEmpty(this.c) || this.b.equalsIgnoreCase("POST") || this.b.equalsIgnoreCase("PUT")) {
                httpURLConnection.setDoOutput(true);
            }
        }
        for (String str : this.f.keySet()) {
            httpURLConnection.setRequestProperty(str, this.f.get(str));
        }
        if (!TextUtils.isEmpty(this.c)) {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8"));
            bufferedWriter.write(this.c);
            bufferedWriter.flush();
            bufferedWriter.close();
        }
        if (this.d != null) {
            httpURLConnection.setRequestProperty(DownloadUtils.CONTENT_LENGTH, String.valueOf(this.d.getContentLength()));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            bufferedOutputStream.write(this.d.getOutputStream().toByteArray());
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
        }
        return httpURLConnection;
    }

    private static String a(Map<String, String> map, String str) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : map.keySet()) {
            String encode = URLEncoder.encode(str2, str);
            arrayList.add(encode + "=" + URLEncoder.encode(map.get(str2), str));
        }
        return TextUtils.join("&", arrayList);
    }
}
