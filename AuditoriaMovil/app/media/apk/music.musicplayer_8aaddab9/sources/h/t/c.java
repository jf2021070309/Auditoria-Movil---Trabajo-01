package h.t;

import h.o.c.j;
import java.io.Serializable;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public final class c implements Serializable {
    public final Pattern a;

    public c(String str) {
        j.e(str, "pattern");
        Pattern compile = Pattern.compile(str);
        j.d(compile, "compile(pattern)");
        j.e(compile, "nativePattern");
        this.a = compile;
    }

    public String toString() {
        String pattern = this.a.toString();
        j.d(pattern, "nativePattern.toString()");
        return pattern;
    }
}
