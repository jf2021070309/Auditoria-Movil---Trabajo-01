package com.amazon.aps.iva.ra0;

import android.content.Context;
import android.webkit.WebSettings;
import java.util.regex.Pattern;
/* loaded from: classes4.dex */
public final class a {
    public static final Pattern c = Pattern.compile("(?<=Chrome/)\\S+");
    public final String a;
    public String b = null;

    public a(Context context) {
        this.a = WebSettings.getDefaultUserAgent(context);
    }
}
