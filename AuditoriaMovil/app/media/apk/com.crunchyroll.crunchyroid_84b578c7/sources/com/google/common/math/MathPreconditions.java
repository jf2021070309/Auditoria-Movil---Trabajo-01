package com.google.common.math;

import com.amazon.aps.iva.b8.l1;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.math.BigInteger;
import java.math.RoundingMode;
/* JADX INFO: Access modifiers changed from: package-private */
@ElementTypesAreNonnullByDefault
@CanIgnoreReturnValue
@GwtCompatible
/* loaded from: classes3.dex */
public final class MathPreconditions {
    private MathPreconditions() {
    }

    public static void checkInRangeForRoundingInputs(boolean z, double d, RoundingMode roundingMode) {
        if (z) {
            return;
        }
        String valueOf = String.valueOf(roundingMode);
        StringBuilder sb = new StringBuilder(valueOf.length() + 83);
        sb.append("rounded value is out of range for input ");
        sb.append(d);
        sb.append(" and rounding mode ");
        sb.append(valueOf);
        throw new ArithmeticException(sb.toString());
    }

    public static void checkNoOverflow(boolean z, String str, int i, int i2) {
        if (z) {
            return;
        }
        StringBuilder sb = new StringBuilder(e.a(str, 36));
        sb.append("overflow: ");
        sb.append(str);
        sb.append("(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(")");
        throw new ArithmeticException(sb.toString());
    }

    public static int checkNonNegative(String str, int i) {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder(e.a(str, 27));
        sb.append(str);
        sb.append(" (");
        sb.append(i);
        sb.append(") must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    public static int checkPositive(String str, int i) {
        if (i > 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder(e.a(str, 26));
        sb.append(str);
        sb.append(" (");
        sb.append(i);
        sb.append(") must be > 0");
        throw new IllegalArgumentException(sb.toString());
    }

    public static void checkRoundingUnnecessary(boolean z) {
        if (z) {
            return;
        }
        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
    }

    public static void checkNoOverflow(boolean z, String str, long j, long j2) {
        if (z) {
            return;
        }
        StringBuilder sb = new StringBuilder(e.a(str, 54));
        sb.append("overflow: ");
        sb.append(str);
        sb.append("(");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(")");
        throw new ArithmeticException(sb.toString());
    }

    public static long checkNonNegative(String str, long j) {
        if (j >= 0) {
            return j;
        }
        StringBuilder sb = new StringBuilder(e.a(str, 36));
        sb.append(str);
        sb.append(" (");
        sb.append(j);
        sb.append(") must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    public static long checkPositive(String str, long j) {
        if (j > 0) {
            return j;
        }
        StringBuilder sb = new StringBuilder(e.a(str, 35));
        sb.append(str);
        sb.append(" (");
        sb.append(j);
        sb.append(") must be > 0");
        throw new IllegalArgumentException(sb.toString());
    }

    public static BigInteger checkNonNegative(String str, BigInteger bigInteger) {
        if (bigInteger.signum() >= 0) {
            return bigInteger;
        }
        String valueOf = String.valueOf(bigInteger);
        throw new IllegalArgumentException(l1.b(valueOf.length() + e.a(str, 16), str, " (", valueOf, ") must be >= 0"));
    }

    public static BigInteger checkPositive(String str, BigInteger bigInteger) {
        if (bigInteger.signum() > 0) {
            return bigInteger;
        }
        String valueOf = String.valueOf(bigInteger);
        throw new IllegalArgumentException(l1.b(valueOf.length() + e.a(str, 15), str, " (", valueOf, ") must be > 0"));
    }

    public static double checkNonNegative(String str, double d) {
        if (d >= 0.0d) {
            return d;
        }
        StringBuilder sb = new StringBuilder(e.a(str, 40));
        sb.append(str);
        sb.append(" (");
        sb.append(d);
        sb.append(") must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }
}
