package com.amazon.aps.iva.y7;

import com.amazon.aps.iva.q5.h0;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.t5.v;
import java.util.regex.Pattern;
/* compiled from: WebvttParserUtil.java */
/* loaded from: classes.dex */
public final class h {
    public static final Pattern a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(v vVar) {
        String f = vVar.f();
        if (f != null && f.startsWith("WEBVTT")) {
            return true;
        }
        return false;
    }

    public static float b(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) throws NumberFormatException {
        int i = g0.a;
        String[] split = str.split("\\.", 2);
        long j = 0;
        for (String str2 : split[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (split.length == 2) {
            j2 += Long.parseLong(split[1]);
        }
        return j2 * 1000;
    }

    public static void d(v vVar) throws h0 {
        int i = vVar.b;
        if (a(vVar)) {
            return;
        }
        vVar.F(i);
        throw h0.a("Expected WEBVTT. Got " + vVar.f(), null);
    }
}
