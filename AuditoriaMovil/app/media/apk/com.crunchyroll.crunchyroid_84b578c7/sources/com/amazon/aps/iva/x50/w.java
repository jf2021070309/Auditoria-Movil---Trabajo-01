package com.amazon.aps.iva.x50;

import java.util.regex.Pattern;
/* compiled from: WebUrlDetector.kt */
/* loaded from: classes2.dex */
public final class w {
    public static final Pattern a;

    static {
        String e = defpackage.e.e("(", "([a-zA-Z0-9[ -\ud7ff豈-\ufdcfﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd\u30000-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]](?:[a-zA-Z0-9[ -\ud7ff豈-\ufdcfﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd\u30000-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]_\\-]{0,61}[a-zA-Z0-9[ -\ud7ff豈-\ufdcfﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd\u30000-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]]){0,1}\\.)+(xn\\-\\-[\\w\\-]{0,58}\\w|[a-zA-Z[ -\ud7ff豈-\ufdcfﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd\u30000-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]]{2,63})", "|((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9])))");
        a = Pattern.compile("(((?:(?i:http|https|rtsp)://(?:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,64}(?:\\:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,25})?\\@)?)?(?:" + e + ")(?:\\:\\d{1,5})?)([/\\?](?:(?:[a-zA-Z0-9[ -\ud7ff豈-\ufdcfﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd\u30000-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]];/\\?:@&=#~\\-\\.\\+!\\*'\\(\\),_\\$])|(?:%[a-fA-F0-9]{2}))*)?(?:\\b|$|^))");
    }
}
