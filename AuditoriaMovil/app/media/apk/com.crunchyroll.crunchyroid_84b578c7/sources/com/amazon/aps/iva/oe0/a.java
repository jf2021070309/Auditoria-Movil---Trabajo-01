package com.amazon.aps.iva.oe0;

import java.nio.charset.Charset;
import org.apache.commons.codec.binary.Hex;
/* compiled from: Charsets.kt */
/* loaded from: classes4.dex */
public final class a {
    public static final a a = new a();
    public static final Charset b;
    public static volatile Charset c;
    public static volatile Charset d;

    static {
        Charset forName = Charset.forName(Hex.DEFAULT_CHARSET_NAME);
        com.amazon.aps.iva.yb0.j.e(forName, "forName(\"UTF-8\")");
        b = forName;
        com.amazon.aps.iva.yb0.j.e(Charset.forName("UTF-16"), "forName(\"UTF-16\")");
        com.amazon.aps.iva.yb0.j.e(Charset.forName("UTF-16BE"), "forName(\"UTF-16BE\")");
        com.amazon.aps.iva.yb0.j.e(Charset.forName("UTF-16LE"), "forName(\"UTF-16LE\")");
        com.amazon.aps.iva.yb0.j.e(Charset.forName("US-ASCII"), "forName(\"US-ASCII\")");
        com.amazon.aps.iva.yb0.j.e(Charset.forName("ISO-8859-1"), "forName(\"ISO-8859-1\")");
    }
}
