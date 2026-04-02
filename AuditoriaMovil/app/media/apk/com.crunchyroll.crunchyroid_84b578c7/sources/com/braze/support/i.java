package com.braze.support;

import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.braze.support.BrazeLogger;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
/* loaded from: classes.dex */
public final class i {
    public static final i a = new i();

    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a {
        public static final a b = new a();

        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Caught exception while trying to read BrazeLogger tag from system properties.";
        }
    }

    private i() {
    }

    public static final String a(String str) {
        BufferedReader bufferedReader;
        j.f(str, "key");
        try {
            InputStream inputStream = Runtime.getRuntime().exec(new String[]{"/system/bin/getprop", str}).getInputStream();
            j.e(inputStream, "getRuntime()\n           …             .inputStream");
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, com.amazon.aps.iva.oe0.a.b);
            if (inputStreamReader instanceof BufferedReader) {
                bufferedReader = (BufferedReader) inputStreamReader;
            } else {
                bufferedReader = new BufferedReader(inputStreamReader, 8192);
            }
            String readLine = bufferedReader.readLine();
            j.e(readLine, "{\n            Runtime.ge…er().readLine()\n        }");
            return readLine;
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(a, BrazeLogger.Priority.E, e, a.b);
            return "";
        }
    }
}
