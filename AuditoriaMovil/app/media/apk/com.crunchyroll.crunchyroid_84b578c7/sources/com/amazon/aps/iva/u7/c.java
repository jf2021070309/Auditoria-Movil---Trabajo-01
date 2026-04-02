package com.amazon.aps.iva.u7;

import android.graphics.Color;
import android.graphics.PointF;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.t5.p;
import com.google.common.primitives.Ints;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: SsaStyle.java */
/* loaded from: classes.dex */
public final class c {
    public final String a;
    public final int b;
    public final Integer c;
    public final Integer d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;

    /* compiled from: SsaStyle.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final int j;
        public final int k;

        public a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = i7;
            this.h = i8;
            this.i = i9;
            this.j = i10;
            this.k = i11;
        }
    }

    /* compiled from: SsaStyle.java */
    /* loaded from: classes.dex */
    public static final class b {
        public static final Pattern a = Pattern.compile("\\{([^}]*)\\}");
        public static final Pattern b = Pattern.compile(g0.o("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        public static final Pattern c = Pattern.compile(g0.o("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        public static final Pattern d = Pattern.compile("\\\\an(\\d+)");

        public static PointF a(String str) {
            String group;
            String str2;
            Matcher matcher = b.matcher(str);
            Matcher matcher2 = c.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    p.f();
                }
                str2 = matcher.group(1);
                group = matcher.group(2);
            } else if (find2) {
                String group2 = matcher2.group(1);
                group = matcher2.group(2);
                str2 = group2;
            } else {
                return null;
            }
            str2.getClass();
            float parseFloat = Float.parseFloat(str2.trim());
            group.getClass();
            return new PointF(parseFloat, Float.parseFloat(group.trim()));
        }
    }

    public c(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.a = str;
        this.b = i;
        this.c = num;
        this.d = num2;
        this.e = f;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = i2;
    }

    public static int a(String str) {
        boolean z;
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z = true;
                    break;
                default:
                    z = false;
                    break;
            }
            if (z) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        p.g();
        return -1;
    }

    public static boolean b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt != 1 && parseInt != -1) {
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
            p.h("Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }

    public static Integer c(String str) {
        long parseLong;
        boolean z;
        try {
            if (str.startsWith("&H")) {
                parseLong = Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            if (parseLong <= 4294967295L) {
                z = true;
            } else {
                z = false;
            }
            com.amazon.aps.iva.cq.b.t(z);
            int checkedCast = Ints.checkedCast(((parseLong >> 24) & 255) ^ 255);
            int checkedCast2 = Ints.checkedCast((parseLong >> 16) & 255);
            return Integer.valueOf(Color.argb(checkedCast, Ints.checkedCast(parseLong & 255), Ints.checkedCast((parseLong >> 8) & 255), checkedCast2));
        } catch (IllegalArgumentException e) {
            p.h("Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }
}
