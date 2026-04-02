package com.fyber.inneractive.sdk.m;

import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.fyber.inneractive.sdk.util.q;
import java.io.ByteArrayInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
final class j {
    private static final Pattern g = Pattern.compile("max-age=(\\d+)");
    private static final SimpleDateFormat h = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.ENGLISH);
    final byte[] a;
    final Map<String, String> b;
    final String c;
    final String d;
    final int e;
    final String f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(byte[] bArr, Map<String, String> map, String str, String str2, int i, String str3) {
        this.a = bArr;
        this.b = map;
        this.c = str;
        this.d = str2;
        this.e = i;
        this.f = str3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        boolean z;
        String str;
        if (TextUtils.isEmpty(this.f)) {
            return false;
        }
        loop0: while (true) {
            z = true;
            for (String str2 : this.b.keySet()) {
                if (!z) {
                    break loop0;
                } else if (str2 != null && str2.equalsIgnoreCase("Cache-Control")) {
                    String str3 = this.b.get(str2);
                    if (str3 != null) {
                        Matcher matcher = g.matcher(str3.toLowerCase(Locale.ENGLISH));
                        int a = (matcher.find() && matcher.groupCount() == 1) ? q.a(matcher.group(1), 0) : 0;
                        if ((str3.toLowerCase(Locale.ENGLISH).contains("public") || str3.toLowerCase(Locale.ENGLISH).contains("private") || a > TimeUnit.SECONDS.convert(1L, TimeUnit.HOURS)) && !str3.toLowerCase(Locale.ENGLISH).contains("no-") && !str3.toLowerCase(Locale.ENGLISH).contains("must-")) {
                            break;
                        }
                        z = false;
                    } else {
                        continue;
                    }
                } else {
                    if (str2 == null || !str2.equalsIgnoreCase("Vary")) {
                        if (str2 != null && str2.equalsIgnoreCase("Pragma")) {
                            String str4 = this.b.get(str2);
                            if (str4 != null) {
                                z = !str4.equalsIgnoreCase("no-cache");
                            }
                        } else if (str2 != null && str2.equalsIgnoreCase("Expires") && (str = this.b.get(str2)) != null) {
                            try {
                                Date parse = h.parse(str);
                                if (parse != null && parse.getTime() + TimeUnit.MILLISECONDS.convert(1L, TimeUnit.HOURS) > System.currentTimeMillis()) {
                                    break;
                                }
                            } catch (ParseException unused) {
                                continue;
                            }
                        }
                    }
                    z = false;
                }
            }
        }
        return z;
    }

    public final WebResourceResponse b() {
        return new WebResourceResponse(this.c, this.d, this.e, this.f, this.b, new ByteArrayInputStream(this.a));
    }
}
