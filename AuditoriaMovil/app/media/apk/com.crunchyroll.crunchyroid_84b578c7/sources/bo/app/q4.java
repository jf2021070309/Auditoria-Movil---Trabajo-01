package bo.app;

import android.net.Uri;
import java.net.URL;
/* loaded from: classes.dex */
public final class q4 {
    private final String a;
    private final Uri b;
    private final URL c;

    public q4(Uri uri) {
        com.amazon.aps.iva.yb0.j.f(uri, "uri");
        this.b = uri;
        String uri2 = uri.toString();
        com.amazon.aps.iva.yb0.j.e(uri2, "uri.toString()");
        this.a = uri2;
        this.c = new URL(uri2);
    }

    public final Uri a() {
        return this.b;
    }

    public final URL b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public String toString() {
        return this.a;
    }

    public q4(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "urlString");
        Uri parse = Uri.parse(str);
        com.amazon.aps.iva.yb0.j.e(parse, "parse(urlString)");
        this.b = parse;
        this.a = str;
        this.c = new URL(str);
    }
}
