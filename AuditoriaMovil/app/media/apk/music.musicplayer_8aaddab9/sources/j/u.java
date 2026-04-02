package j;

import ch.qos.logback.core.CoreConstants;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class u {
    public static final Pattern a = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f9552b = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: c  reason: collision with root package name */
    public final String f9553c;

    /* renamed from: d  reason: collision with root package name */
    public final String f9554d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public final String f9555e;

    public u(String str, String str2, String str3, @Nullable String str4) {
        this.f9553c = str;
        this.f9554d = str2;
        this.f9555e = str4;
    }

    public static u b(String str) {
        Matcher matcher = a.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException("No subtype found for: \"" + str + CoreConstants.DOUBLE_QUOTE_CHAR);
        }
        String group = matcher.group(1);
        Locale locale = Locale.US;
        String lowerCase = group.toLowerCase(locale);
        String lowerCase2 = matcher.group(2).toLowerCase(locale);
        String str2 = null;
        Matcher matcher2 = f9552b.matcher(str);
        for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder y = e.a.d.a.a.y("Parameter is not formatted correctly: \"");
                y.append(str.substring(end));
                y.append("\" for: \"");
                y.append(str);
                y.append(CoreConstants.DOUBLE_QUOTE_CHAR);
                throw new IllegalArgumentException(y.toString());
            }
            String group2 = matcher2.group(1);
            if (group2 != null && group2.equalsIgnoreCase("charset")) {
                String group3 = matcher2.group(2);
                if (group3 == null) {
                    group3 = matcher2.group(3);
                } else if (group3.startsWith("'") && group3.endsWith("'") && group3.length() > 2) {
                    group3 = group3.substring(1, group3.length() - 1);
                }
                if (str2 != null && !group3.equalsIgnoreCase(str2)) {
                    throw new IllegalArgumentException("Multiple charsets defined: \"" + str2 + "\" and: \"" + group3 + "\" for: \"" + str + CoreConstants.DOUBLE_QUOTE_CHAR);
                }
                str2 = group3;
            }
        }
        return new u(str, lowerCase, lowerCase2, str2);
    }

    @Nullable
    public Charset a(@Nullable Charset charset) {
        try {
            String str = this.f9555e;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof u) && ((u) obj).f9553c.equals(this.f9553c);
    }

    public int hashCode() {
        return this.f9553c.hashCode();
    }

    public String toString() {
        return this.f9553c;
    }
}
