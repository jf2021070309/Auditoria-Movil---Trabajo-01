package com.amazon.aps.iva.oa0;

import com.amazon.aps.iva.oa0.a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.zip.GZIPInputStream;
/* compiled from: SingularRequestHandler.java */
/* loaded from: classes4.dex */
public final class c1 {
    public static int a;
    public static final String[] b;

    static {
        new com.amazon.aps.iva.b30.j(c1.class.getSimpleName());
        a = 0;
        b = new String[]{"e", "global_properties", "referrer_data"};
    }

    public static boolean a(u0 u0Var, a.InterfaceC0561a interfaceC0561a, long j, int i, HttpURLConnection httpURLConnection) throws IOException {
        InputStreamReader inputStreamReader;
        httpURLConnection.connect();
        int responseCode = httpURLConnection.getResponseCode();
        StringBuffer stringBuffer = new StringBuffer();
        InputStream inputStream = httpURLConnection.getInputStream();
        if (httpURLConnection.getContentEncoding() != null && httpURLConnection.getContentEncoding().equals("gzip")) {
            inputStreamReader = new InputStreamReader(new GZIPInputStream(inputStream));
        } else {
            inputStreamReader = new InputStreamReader(inputStream);
        }
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                stringBuffer.append(readLine);
            } else {
                String stringBuffer2 = stringBuffer.toString();
                httpURLConnection.disconnect();
                int i2 = f1.b;
                System.currentTimeMillis();
                return interfaceC0561a.a(u0Var, responseCode, stringBuffer2);
            }
        }
    }
}
