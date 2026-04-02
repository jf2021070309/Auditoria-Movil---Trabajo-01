package com.amazon.aps.iva.t2;

import java.io.PrintStream;
import java.util.Arrays;
/* compiled from: Easing.java */
/* loaded from: classes.dex */
public class c {
    public static final c b = new c();
    public static final String[] c = {"standard", "accelerate", "decelerate", "linear"};
    public String a = "identity";

    /* compiled from: Easing.java */
    /* loaded from: classes.dex */
    public static class a extends c {
        public final double d;
        public final double e;
        public final double f;
        public final double g;

        public a(String str) {
            this.a = str;
            int indexOf = str.indexOf(40);
            int indexOf2 = str.indexOf(44, indexOf);
            this.d = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
            int i = indexOf2 + 1;
            int indexOf3 = str.indexOf(44, i);
            this.e = Double.parseDouble(str.substring(i, indexOf3).trim());
            int i2 = indexOf3 + 1;
            int indexOf4 = str.indexOf(44, i2);
            this.f = Double.parseDouble(str.substring(i2, indexOf4).trim());
            int i3 = indexOf4 + 1;
            this.g = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
        }

        @Override // com.amazon.aps.iva.t2.c
        public final double a(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > 0.01d) {
                d2 *= 0.5d;
                if (d(d3) < d) {
                    d3 += d2;
                } else {
                    d3 -= d2;
                }
            }
            double d4 = d3 - d2;
            double d5 = d(d4);
            double d6 = d3 + d2;
            double d7 = d(d6);
            double e = e(d4);
            return (((d - d5) * (e(d6) - e)) / (d7 - d5)) + e;
        }

        @Override // com.amazon.aps.iva.t2.c
        public final double b(double d) {
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > 1.0E-4d) {
                d2 *= 0.5d;
                if (d(d3) < d) {
                    d3 += d2;
                } else {
                    d3 -= d2;
                }
            }
            double d4 = d3 - d2;
            double d5 = d(d4);
            double d6 = d3 + d2;
            return (e(d6) - e(d4)) / (d(d6) - d5);
        }

        public final double d(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            double d4 = d2 * d3 * d;
            double d5 = d3 * d * d;
            return (this.f * d5) + (this.d * d4) + (d * d * d);
        }

        public final double e(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            double d4 = d2 * d3 * d;
            double d5 = d3 * d * d;
            return (this.g * d5) + (this.e * d4) + (d * d * d);
        }
    }

    public static c c(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new a(str);
        }
        if (str.startsWith("spline")) {
            return new k(str);
        }
        if (str.startsWith("Schlick")) {
            return new i(str);
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1354466595:
                if (str.equals("accelerate")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1263948740:
                if (str.equals("decelerate")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1197605014:
                if (str.equals("anticipate")) {
                    c2 = 2;
                    break;
                }
                break;
            case -1102672091:
                if (str.equals("linear")) {
                    c2 = 3;
                    break;
                }
                break;
            case -749065269:
                if (str.equals("overshoot")) {
                    c2 = 4;
                    break;
                }
                break;
            case 1312628413:
                if (str.equals("standard")) {
                    c2 = 5;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return new a("cubic(0.4, 0.05, 0.8, 0.7)");
            case 1:
                return new a("cubic(0.0, 0.0, 0.2, 0.95)");
            case 2:
                return new a("cubic(0.36, 0, 0.66, -0.56)");
            case 3:
                return new a("cubic(1, 1, 0, 0)");
            case 4:
                return new a("cubic(0.34, 1.56, 0.64, 1)");
            case 5:
                return new a("cubic(0.4, 0.0, 0.2, 1)");
            default:
                PrintStream printStream = System.err;
                printStream.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(c));
                return b;
        }
    }

    public double b(double d) {
        return 1.0d;
    }

    public final String toString() {
        return this.a;
    }

    public double a(double d) {
        return d;
    }
}
