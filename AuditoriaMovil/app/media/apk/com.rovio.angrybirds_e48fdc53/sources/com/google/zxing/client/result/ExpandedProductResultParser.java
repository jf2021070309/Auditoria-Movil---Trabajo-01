package com.google.zxing.client.result;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import java.util.HashMap;
/* loaded from: classes2.dex */
public final class ExpandedProductResultParser extends ResultParser {
    @Override // com.google.zxing.client.result.ResultParser
    public ExpandedProductParsedResult parse(Result result) {
        if (result.getBarcodeFormat() != BarcodeFormat.RSS_EXPANDED) {
            return null;
        }
        String massagedText = getMassagedText(result);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        HashMap hashMap = new HashMap();
        int i = 0;
        while (i < massagedText.length()) {
            String a = a(i, massagedText);
            if (a == null) {
                return null;
            }
            int length = i + a.length() + 2;
            String b = b(length, massagedText);
            i = length + b.length();
            char c = 65535;
            switch (a.hashCode()) {
                case 1536:
                    if (a.equals("00")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1537:
                    if (a.equals("01")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1567:
                    if (a.equals("10")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1568:
                    if (a.equals("11")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1570:
                    if (a.equals("13")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1572:
                    if (a.equals("15")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1574:
                    if (a.equals("17")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1567966:
                    if (a.equals("3100")) {
                        c = 7;
                        break;
                    }
                    break;
                case 1567967:
                    if (a.equals("3101")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 1567968:
                    if (a.equals("3102")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 1567969:
                    if (a.equals("3103")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 1567970:
                    if (a.equals("3104")) {
                        c = 11;
                        break;
                    }
                    break;
                case 1567971:
                    if (a.equals("3105")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 1567972:
                    if (a.equals("3106")) {
                        c = '\r';
                        break;
                    }
                    break;
                case 1567973:
                    if (a.equals("3107")) {
                        c = 14;
                        break;
                    }
                    break;
                case 1567974:
                    if (a.equals("3108")) {
                        c = 15;
                        break;
                    }
                    break;
                case 1567975:
                    if (a.equals("3109")) {
                        c = 16;
                        break;
                    }
                    break;
                case 1568927:
                    if (a.equals("3200")) {
                        c = 17;
                        break;
                    }
                    break;
                case 1568928:
                    if (a.equals("3201")) {
                        c = 18;
                        break;
                    }
                    break;
                case 1568929:
                    if (a.equals("3202")) {
                        c = 19;
                        break;
                    }
                    break;
                case 1568930:
                    if (a.equals("3203")) {
                        c = 20;
                        break;
                    }
                    break;
                case 1568931:
                    if (a.equals("3204")) {
                        c = 21;
                        break;
                    }
                    break;
                case 1568932:
                    if (a.equals("3205")) {
                        c = 22;
                        break;
                    }
                    break;
                case 1568933:
                    if (a.equals("3206")) {
                        c = 23;
                        break;
                    }
                    break;
                case 1568934:
                    if (a.equals("3207")) {
                        c = 24;
                        break;
                    }
                    break;
                case 1568935:
                    if (a.equals("3208")) {
                        c = 25;
                        break;
                    }
                    break;
                case 1568936:
                    if (a.equals("3209")) {
                        c = 26;
                        break;
                    }
                    break;
                case 1575716:
                    if (a.equals("3920")) {
                        c = 27;
                        break;
                    }
                    break;
                case 1575717:
                    if (a.equals("3921")) {
                        c = 28;
                        break;
                    }
                    break;
                case 1575718:
                    if (a.equals("3922")) {
                        c = 29;
                        break;
                    }
                    break;
                case 1575719:
                    if (a.equals("3923")) {
                        c = 30;
                        break;
                    }
                    break;
                case 1575747:
                    if (a.equals("3930")) {
                        c = 31;
                        break;
                    }
                    break;
                case 1575748:
                    if (a.equals("3931")) {
                        c = ' ';
                        break;
                    }
                    break;
                case 1575749:
                    if (a.equals("3932")) {
                        c = '!';
                        break;
                    }
                    break;
                case 1575750:
                    if (a.equals("3933")) {
                        c = '\"';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    str2 = b;
                    break;
                case 1:
                    str = b;
                    break;
                case 2:
                    str3 = b;
                    break;
                case 3:
                    str4 = b;
                    break;
                case 4:
                    str5 = b;
                    break;
                case 5:
                    str6 = b;
                    break;
                case 6:
                    str7 = b;
                    break;
                case 7:
                case '\b':
                case '\t':
                case '\n':
                case 11:
                case '\f':
                case '\r':
                case 14:
                case 15:
                case 16:
                    str9 = ExpandedProductParsedResult.KILOGRAM;
                    str10 = a.substring(3);
                    str8 = b;
                    break;
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    str9 = ExpandedProductParsedResult.POUND;
                    str10 = a.substring(3);
                    str8 = b;
                    break;
                case 27:
                case 28:
                case 29:
                case 30:
                    str12 = a.substring(3);
                    str11 = b;
                    break;
                case 31:
                case ' ':
                case '!':
                case '\"':
                    if (b.length() < 4) {
                        return null;
                    }
                    str11 = b.substring(3);
                    str13 = b.substring(0, 3);
                    str12 = a.substring(3);
                    break;
                default:
                    hashMap.put(a, b);
                    break;
            }
        }
        return new ExpandedProductParsedResult(massagedText, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, hashMap);
    }

    private static String a(int i, String str) {
        if (str.charAt(i) != '(') {
            return null;
        }
        String substring = str.substring(i + 1);
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < substring.length(); i2++) {
            char charAt = substring.charAt(i2);
            if (charAt == ')') {
                return sb.toString();
            }
            if (charAt < '0' || charAt > '9') {
                return null;
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    private static String b(int i, String str) {
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(i);
        for (int i2 = 0; i2 < substring.length(); i2++) {
            char charAt = substring.charAt(i2);
            if (charAt == '(') {
                if (a(i2, substring) != null) {
                    break;
                }
                sb.append('(');
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }
}
