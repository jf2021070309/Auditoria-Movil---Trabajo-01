package com.amazon.aps.iva.oe0;

import com.amazon.aps.iva.ee0.f1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: Regex.kt */
/* loaded from: classes4.dex */
public final class f implements Serializable {
    public final Pattern b;

    public f(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "pattern");
        Pattern compile = Pattern.compile(str);
        com.amazon.aps.iva.yb0.j.e(compile, "compile(pattern)");
        this.b = compile;
    }

    public final e a(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "input");
        Matcher matcher = this.b.matcher(str);
        com.amazon.aps.iva.yb0.j.e(matcher, "nativePattern.matcher(input)");
        if (!matcher.matches()) {
            return null;
        }
        return new e(matcher, str);
    }

    public final boolean b(CharSequence charSequence) {
        com.amazon.aps.iva.yb0.j.f(charSequence, "input");
        return this.b.matcher(charSequence).matches();
    }

    public final List c(int i, CharSequence charSequence) {
        com.amazon.aps.iva.yb0.j.f(charSequence, "input");
        q.B0(i);
        Matcher matcher = this.b.matcher(charSequence);
        if (i != 1 && matcher.find()) {
            int i2 = 10;
            if (i > 0 && i <= 10) {
                i2 = i;
            }
            ArrayList arrayList = new ArrayList(i2);
            int i3 = i - 1;
            int i4 = 0;
            do {
                arrayList.add(charSequence.subSequence(i4, matcher.start()).toString());
                i4 = matcher.end();
                if (i3 >= 0 && arrayList.size() == i3) {
                    break;
                }
            } while (matcher.find());
            arrayList.add(charSequence.subSequence(i4, charSequence.length()).toString());
            return arrayList;
        }
        return f1.J(charSequence.toString());
    }

    public final String toString() {
        String pattern = this.b.toString();
        com.amazon.aps.iva.yb0.j.e(pattern, "nativePattern.toString()");
        return pattern;
    }
}
