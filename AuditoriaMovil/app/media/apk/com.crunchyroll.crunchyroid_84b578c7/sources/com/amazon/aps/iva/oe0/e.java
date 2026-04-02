package com.amazon.aps.iva.oe0;

import java.util.regex.Matcher;
/* compiled from: Regex.kt */
/* loaded from: classes4.dex */
public final class e implements c {
    public final Matcher a;
    public final CharSequence b;
    public d c;

    public e(Matcher matcher, CharSequence charSequence) {
        com.amazon.aps.iva.yb0.j.f(charSequence, "input");
        this.a = matcher;
        this.b = charSequence;
    }

    public final com.amazon.aps.iva.ec0.j a() {
        Matcher matcher = this.a;
        return com.amazon.aps.iva.aq.j.T(matcher.start(), matcher.end());
    }

    public final e b() {
        int i;
        Matcher matcher = this.a;
        int end = matcher.end();
        if (matcher.end() == matcher.start()) {
            i = 1;
        } else {
            i = 0;
        }
        int i2 = end + i;
        CharSequence charSequence = this.b;
        if (i2 <= charSequence.length()) {
            Matcher matcher2 = matcher.pattern().matcher(charSequence);
            com.amazon.aps.iva.yb0.j.e(matcher2, "matcher.pattern().matcher(input)");
            return com.amazon.aps.iva.a60.b.h(matcher2, i2, charSequence);
        }
        return null;
    }

    @Override // com.amazon.aps.iva.oe0.c
    public final String getValue() {
        String group = this.a.group();
        com.amazon.aps.iva.yb0.j.e(group, "matchResult.group()");
        return group;
    }
}
