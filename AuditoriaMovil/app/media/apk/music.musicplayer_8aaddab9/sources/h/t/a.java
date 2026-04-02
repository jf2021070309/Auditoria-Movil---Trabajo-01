package h.t;

import h.o.c.j;
import java.nio.charset.Charset;
/* loaded from: classes2.dex */
public final class a {
    public static final Charset a;

    static {
        Charset forName = Charset.forName("UTF-8");
        j.d(forName, "forName(\"UTF-8\")");
        a = forName;
        j.d(Charset.forName("UTF-16"), "forName(\"UTF-16\")");
        j.d(Charset.forName("UTF-16BE"), "forName(\"UTF-16BE\")");
        j.d(Charset.forName("UTF-16LE"), "forName(\"UTF-16LE\")");
        j.d(Charset.forName("US-ASCII"), "forName(\"US-ASCII\")");
        j.d(Charset.forName("ISO-8859-1"), "forName(\"ISO-8859-1\")");
    }
}
