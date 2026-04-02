package com.facebook.ads.internal.q.a;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.StringTokenizer;
import org.json.JSONArray;
/* loaded from: classes2.dex */
public class p {
    public static final String a(String str) {
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, " ", true);
            if (str.length() > 90) {
                if (str.length() > 93 || !str.endsWith("...")) {
                    int i = 0;
                    while (stringTokenizer.hasMoreTokens()) {
                        int length = stringTokenizer.nextToken().length();
                        if (i + length < 90) {
                            i += length;
                        }
                    }
                    return i == 0 ? str.substring(0, 90) + "..." : str.substring(0, i) + "...";
                }
                return str;
            }
            return str;
        }
        return str;
    }

    public static final String a(Throwable th) {
        if (th == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.close();
        return stringWriter.toString();
    }

    public static final String a(StackTraceElement[] stackTraceElementArr) {
        JSONArray jSONArray = new JSONArray();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            jSONArray.put(stackTraceElement.toString());
        }
        return jSONArray.toString();
    }
}
