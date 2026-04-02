package com.google.zxing.common;

import java.nio.charset.Charset;
/* loaded from: classes2.dex */
public final class StringUtils {
    public static final String GB2312 = "GB2312";
    public static final String SHIFT_JIS = "SJIS";
    private static final String a = Charset.defaultCharset().name();
    private static final boolean b;

    static {
        b = SHIFT_JIS.equalsIgnoreCase(a) || "EUC_JP".equalsIgnoreCase(a);
    }

    private StringUtils() {
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String guessEncoding(byte[] r23, java.util.Map<com.google.zxing.DecodeHintType, ?> r24) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.common.StringUtils.guessEncoding(byte[], java.util.Map):java.lang.String");
    }
}
