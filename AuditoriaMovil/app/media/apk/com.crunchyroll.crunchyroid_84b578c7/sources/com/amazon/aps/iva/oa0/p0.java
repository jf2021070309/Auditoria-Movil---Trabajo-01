package com.amazon.aps.iva.oa0;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.common.net.HttpHeaders;
import java.net.HttpURLConnection;
import java.net.URL;
/* compiled from: SingularExceptionReporter.java */
/* loaded from: classes4.dex */
public final class p0 extends HandlerThread {
    public static p0 e;
    public final Handler b;
    public final Context c;
    public y d;

    public p0(Context context) {
        super("singular_exception_reporter");
        this.b = null;
        this.c = null;
        this.d = null;
        start();
        this.b = new Handler(getLooper());
        this.c = context;
    }

    public static void a(p0 p0Var, com.amazon.aps.iva.if0.c cVar) {
        p0Var.getClass();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://exceptions.singular.net/v2/exceptions/android").openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json");
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setDoOutput(true);
            byte[] bytes = cVar.toString().getBytes();
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_LENGTH, Integer.toString(bytes.length));
            httpURLConnection.getOutputStream().write(bytes);
            httpURLConnection.connect();
            httpURLConnection.getResponseCode();
        } catch (Throwable unused) {
        }
    }

    public static p0 b(Context context, Boolean bool) {
        Handler handler;
        if (e == null) {
            synchronized (p0.class) {
                p0 p0Var = new p0(context);
                e = p0Var;
                if (p0Var.d == null && (handler = p0Var.b) != null && p0Var.c != null) {
                    handler.post(new n0(p0Var, bool));
                }
            }
        }
        return e;
    }
}
