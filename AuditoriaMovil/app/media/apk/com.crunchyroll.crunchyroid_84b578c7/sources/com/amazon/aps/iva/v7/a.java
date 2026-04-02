package com.amazon.aps.iva.v7;

import com.amazon.aps.iva.q7.c;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: SubripDecoder.java */
/* loaded from: classes.dex */
public final class a extends c {
    public static final Pattern o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    public static final Pattern p = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder m = new StringBuilder();
    public final ArrayList<String> n = new ArrayList<>();

    public static long h(Matcher matcher, int i) {
        long j;
        String group = matcher.group(i + 1);
        if (group != null) {
            j = Long.parseLong(group) * 60 * 60 * 1000;
        } else {
            j = 0;
        }
        String group2 = matcher.group(i + 2);
        group2.getClass();
        String group3 = matcher.group(i + 3);
        group3.getClass();
        long parseLong = (Long.parseLong(group3) * 1000) + (Long.parseLong(group2) * 60 * 1000) + j;
        String group4 = matcher.group(i + 4);
        if (group4 != null) {
            parseLong += Long.parseLong(group4);
        }
        return parseLong * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0222  */
    @Override // com.amazon.aps.iva.q7.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.q7.d g(int r19, byte[] r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.v7.a.g(int, byte[], boolean):com.amazon.aps.iva.q7.d");
    }
}
