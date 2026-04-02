package com.google.zxing.client.result;

import com.google.zxing.Result;
import java.util.Map;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public final class EmailAddressResultParser extends ResultParser {
    private static final Pattern a = Pattern.compile(",");

    @Override // com.google.zxing.client.result.ResultParser
    public EmailAddressParsedResult parse(Result result) {
        String str;
        String str2;
        String[] strArr;
        String str3;
        String massagedText = getMassagedText(result);
        if (massagedText.startsWith("mailto:") || massagedText.startsWith("MAILTO:")) {
            String substring = massagedText.substring(7);
            int indexOf = substring.indexOf(63);
            if (indexOf >= 0) {
                substring = substring.substring(0, indexOf);
            }
            try {
                String c = c(substring);
                String[] split = !c.isEmpty() ? a.split(c) : null;
                Map<String, String> b = b(massagedText);
                if (b != null) {
                    String[] split2 = (split != null || (str3 = b.get("to")) == null) ? split : a.split(str3);
                    String str4 = b.get(com.umeng.ccg.a.a);
                    String[] split3 = str4 != null ? a.split(str4) : null;
                    String str5 = b.get("bcc");
                    r2 = str5 != null ? a.split(str5) : null;
                    str = b.get("body");
                    split = split2;
                    strArr = r2;
                    r2 = split3;
                    str2 = b.get("subject");
                } else {
                    str = null;
                    str2 = null;
                    strArr = null;
                }
                return new EmailAddressParsedResult(split, r2, strArr, str2, str);
            } catch (IllegalArgumentException e) {
                return null;
            }
        } else if (EmailDoCoMoResultParser.a(massagedText)) {
            return new EmailAddressParsedResult(massagedText);
        } else {
            return null;
        }
    }
}
