package com.kwad.sdk.core.videocache;

import android.text.TextUtils;
import com.kwad.sdk.utils.ao;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
final class d {
    private static final Pattern awu = Pattern.compile("[R,r]ange:[ ]?bytes=(\\d*)-");
    private static final Pattern awv = Pattern.compile("GET /(.*) HTTP");
    public final long aww;
    public final boolean awx;
    public final String uri;

    private d(String str) {
        ao.fF(str);
        long dL = dL(str);
        this.aww = Math.max(0L, dL);
        this.awx = dL >= 0;
        this.uri = dM(str);
    }

    public static d b(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (TextUtils.isEmpty(readLine)) {
                return new d(sb.toString());
            }
            sb.append(readLine);
            sb.append('\n');
        }
    }

    private static long dL(String str) {
        Matcher matcher = awu.matcher(str);
        if (matcher.find()) {
            return Long.parseLong(matcher.group(1));
        }
        return -1L;
    }

    private static String dM(String str) {
        Matcher matcher = awv.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        throw new IllegalArgumentException("Invalid request `" + str + "`: url not found!");
    }

    public final String toString() {
        return "GetRequest{rangeOffset=" + this.aww + ", partial=" + this.awx + ", uri='" + this.uri + "'}";
    }
}
