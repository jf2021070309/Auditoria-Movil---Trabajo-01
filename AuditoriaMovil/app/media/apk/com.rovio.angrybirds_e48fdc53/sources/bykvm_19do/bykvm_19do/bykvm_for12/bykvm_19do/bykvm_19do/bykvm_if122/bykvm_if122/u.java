package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class u {
    private static final Pattern c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final Pattern d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    private final String a;
    private final String b;

    private u(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str4;
    }

    public static u a(String str) {
        Matcher matcher = c.matcher(str);
        if (matcher.lookingAt()) {
            String lowerCase = matcher.group(1).toLowerCase(Locale.US);
            String lowerCase2 = matcher.group(2).toLowerCase(Locale.US);
            Matcher matcher2 = d.matcher(str);
            String str2 = null;
            for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
                matcher2.region(end, str.length());
                if (!matcher2.lookingAt()) {
                    return null;
                }
                String group = matcher2.group(1);
                if (group != null && group.equalsIgnoreCase("charset")) {
                    String group2 = matcher2.group(2);
                    if (group2 == null) {
                        group2 = matcher2.group(3);
                    } else if (group2.startsWith("'") && group2.endsWith("'") && group2.length() > 2) {
                        group2 = group2.substring(1, group2.length() - 1);
                    }
                    if (str2 != null && !group2.equalsIgnoreCase(str2)) {
                        return null;
                    }
                    str2 = group2;
                }
            }
            return new u(str, lowerCase, lowerCase2, str2);
        }
        return null;
    }

    public Charset a() {
        return a((Charset) null);
    }

    public Charset a(Charset charset) {
        try {
            String str = this.b;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException e) {
            return charset;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof u) && ((u) obj).a.equals(this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a;
    }
}
