package com.google.zxing.client.result;

import com.facebook.share.internal.ShareConstants;
import com.google.zxing.Result;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public final class VCardResultParser extends ResultParser {
    private static final Pattern a = Pattern.compile("BEGIN:VCARD", 2);
    private static final Pattern b = Pattern.compile("\\d{4}-?\\d{2}-?\\d{2}");
    private static final Pattern c = Pattern.compile("\r\n[ \t]");
    private static final Pattern d = Pattern.compile("\\\\[nN]");
    private static final Pattern e = Pattern.compile("\\\\([,;\\\\])");
    private static final Pattern f = Pattern.compile("=");
    private static final Pattern g = Pattern.compile(";");
    private static final Pattern h = Pattern.compile("(?<!\\\\);+");
    private static final Pattern i = Pattern.compile(",");
    private static final Pattern j = Pattern.compile("[;,]");

    @Override // com.google.zxing.client.result.ResultParser
    public AddressBookParsedResult parse(Result result) {
        String massagedText = getMassagedText(result);
        Matcher matcher = a.matcher(massagedText);
        if (!matcher.find() || matcher.start() != 0) {
            return null;
        }
        List<List<String>> a2 = a((CharSequence) "FN", massagedText, true, false);
        if (a2 == null) {
            a2 = a((CharSequence) "N", massagedText, true, false);
            a((Iterable<List<String>>) a2);
        }
        List<List<String>> list = a2;
        List<String> b2 = b((CharSequence) "NICKNAME", massagedText, true, false);
        String[] split = b2 == null ? null : i.split(b2.get(0));
        List<List<String>> a3 = a((CharSequence) "TEL", massagedText, true, false);
        List<List<String>> a4 = a((CharSequence) "EMAIL", massagedText, true, false);
        List<String> b3 = b((CharSequence) "NOTE", massagedText, false, false);
        List<List<String>> a5 = a((CharSequence) "ADR", massagedText, true, true);
        List<String> b4 = b((CharSequence) "ORG", massagedText, true, true);
        List<String> b5 = b((CharSequence) "BDAY", massagedText, true, false);
        List<String> list2 = (b5 == null || a(b5.get(0))) ? b5 : null;
        List<String> b6 = b((CharSequence) ShareConstants.TITLE, massagedText, true, false);
        List<List<String>> a6 = a((CharSequence) "URL", massagedText, true, false);
        List<String> b7 = b((CharSequence) "IMPP", massagedText, true, false);
        List<String> b8 = b((CharSequence) "GEO", massagedText, true, false);
        String[] split2 = b8 == null ? null : j.split(b8.get(0));
        if (split2 != null && split2.length != 2) {
            split2 = null;
        }
        return new AddressBookParsedResult(a((Collection<List<String>>) list), split, null, a((Collection<List<String>>) a3), b(a3), a((Collection<List<String>>) a4), b(a4), a(b7), a(b3), a((Collection<List<String>>) a5), b(a5), a(b4), a(list2), a(b6), a((Collection<List<String>>) a6), split2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d4, code lost:
        r0 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<java.util.List<java.lang.String>> a(java.lang.CharSequence r12, java.lang.String r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.client.result.VCardResultParser.a(java.lang.CharSequence, java.lang.String, boolean, boolean):java.util.List");
    }

    private static String a(CharSequence charSequence, String str) {
        char charAt;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = 0;
        while (i2 < length) {
            char charAt2 = charSequence.charAt(i2);
            switch (charAt2) {
                case '\n':
                case '\r':
                    break;
                case '=':
                    if (i2 < length - 2 && (charAt = charSequence.charAt(i2 + 1)) != '\r' && charAt != '\n') {
                        char charAt3 = charSequence.charAt(i2 + 2);
                        int parseHexDigit = parseHexDigit(charAt);
                        int parseHexDigit2 = parseHexDigit(charAt3);
                        if (parseHexDigit >= 0 && parseHexDigit2 >= 0) {
                            byteArrayOutputStream.write((parseHexDigit << 4) + parseHexDigit2);
                        }
                        i2 += 2;
                        break;
                    }
                    break;
                default:
                    a(byteArrayOutputStream, str, sb);
                    sb.append(charAt2);
                    break;
            }
            i2++;
        }
        a(byteArrayOutputStream, str, sb);
        return sb.toString();
    }

    private static void a(ByteArrayOutputStream byteArrayOutputStream, String str, StringBuilder sb) {
        String str2;
        if (byteArrayOutputStream.size() > 0) {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (str == null) {
                str2 = new String(byteArray, Charset.forName("UTF-8"));
            } else {
                try {
                    str2 = new String(byteArray, str);
                } catch (UnsupportedEncodingException e2) {
                    str2 = new String(byteArray, Charset.forName("UTF-8"));
                }
            }
            byteArrayOutputStream.reset();
            sb.append(str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<String> b(CharSequence charSequence, String str, boolean z, boolean z2) {
        List<List<String>> a2 = a(charSequence, str, z, z2);
        if (a2 == null || a2.isEmpty()) {
            return null;
        }
        return a2.get(0);
    }

    private static String a(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    private static String[] a(Collection<List<String>> collection) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (List<String> list : collection) {
            String str = list.get(0);
            if (str != null && !str.isEmpty()) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[collection.size()]);
    }

    private static String[] b(Collection<List<String>> collection) {
        String str;
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (List<String> list : collection) {
            int i2 = 1;
            while (true) {
                int i3 = i2;
                if (i3 >= list.size()) {
                    str = null;
                    break;
                }
                str = list.get(i3);
                int indexOf = str.indexOf(61);
                if (indexOf >= 0) {
                    if (!"TYPE".equalsIgnoreCase(str.substring(0, indexOf))) {
                        i2 = i3 + 1;
                    } else {
                        str = str.substring(indexOf + 1);
                        break;
                    }
                }
            }
            arrayList.add(str);
        }
        return (String[]) arrayList.toArray(new String[collection.size()]);
    }

    private static boolean a(CharSequence charSequence) {
        return charSequence == null || b.matcher(charSequence).matches();
    }

    private static void a(Iterable<List<String>> iterable) {
        if (iterable != null) {
            for (List<String> list : iterable) {
                String str = list.get(0);
                String[] strArr = new String[5];
                int i2 = 0;
                int i3 = 0;
                while (i2 < 4) {
                    int indexOf = str.indexOf(59, i3);
                    if (indexOf >= 0) {
                        strArr[i2] = str.substring(i3, indexOf);
                        i2++;
                        i3 = indexOf + 1;
                    }
                }
                strArr[i2] = str.substring(i3);
                StringBuilder sb = new StringBuilder(100);
                a(strArr, 3, sb);
                a(strArr, 1, sb);
                a(strArr, 2, sb);
                a(strArr, 0, sb);
                a(strArr, 4, sb);
                list.set(0, sb.toString().trim());
            }
        }
    }

    private static void a(String[] strArr, int i2, StringBuilder sb) {
        if (strArr[i2] != null && !strArr[i2].isEmpty()) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(strArr[i2]);
        }
    }
}
