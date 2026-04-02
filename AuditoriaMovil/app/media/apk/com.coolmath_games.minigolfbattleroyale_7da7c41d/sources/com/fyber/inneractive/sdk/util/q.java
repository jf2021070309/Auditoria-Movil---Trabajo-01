package com.fyber.inneractive.sdk.util;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.Reference;
import java.nio.ByteBuffer;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class q {
    public static StringBuffer a(InputStream inputStream) throws IOException {
        ByteBuffer b = c.a().b();
        StringBuffer stringBuffer = new StringBuffer();
        c.a();
        byte[] b2 = c.b(b);
        int i = 0;
        while (i != -1) {
            stringBuffer.append(new String(b2, 0, i));
            i = inputStream.read(b2);
        }
        c.a().a(b);
        return stringBuffer;
    }

    public static boolean a(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (inputStream != null) {
            byte[] bArr = new byte[65536];
            int i = 0;
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                i += read;
                outputStream.write(bArr, 0, read);
            }
            IAlog.b("Copied stream content length = %d", Integer.valueOf(i));
            return i > 0;
        }
        throw new IOException("Unable to copy from or to a null stream.");
    }

    public static void a(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static String a(Throwable th) {
        try {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            return "------\r\n" + stringWriter.toString() + "------\r\n";
        } catch (Exception unused) {
            return "bad stackToString";
        }
    }

    public static void a(View view) {
        if (view == null || view.getParent() == null || !(view.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) view.getParent()).removeView(view);
    }

    public static String a() {
        StringBuilder sb = new StringBuilder();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i = 7; i >= 0 && i < 13 && i < stackTrace.length; i++) {
            sb.append(stackTrace[i].toString());
            sb.append(",");
        }
        Log.d("stack trace:", sb.toString());
        return sb.toString();
    }

    public static String b(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.getBuffer().toString();
    }

    public static <T> T a(Reference<T> reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    public static int a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static float a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Float.parseFloat(str);
            } catch (NumberFormatException unused) {
            }
        }
        return -1.0f;
    }

    public static String a(Map<String, String> map) {
        try {
            return new JSONObject(map).toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }
}
