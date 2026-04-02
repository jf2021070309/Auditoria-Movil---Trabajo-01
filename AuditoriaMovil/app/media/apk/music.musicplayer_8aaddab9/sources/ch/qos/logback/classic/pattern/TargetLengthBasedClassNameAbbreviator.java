package ch.qos.logback.classic.pattern;

import e.a.d.a.a;
import java.io.PrintStream;
/* loaded from: classes.dex */
public class TargetLengthBasedClassNameAbbreviator implements Abbreviator {
    public final int targetLength;

    public TargetLengthBasedClassNameAbbreviator(int i2) {
        this.targetLength = i2;
    }

    public static int computeDotIndexes(String str, int[] iArr) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int indexOf = str.indexOf(46, i2);
            if (indexOf == -1 || i3 >= 16) {
                break;
            }
            iArr[i3] = indexOf;
            i3++;
            i2 = indexOf + 1;
        }
        return i3;
    }

    public static void printArray(String str, int[] iArr) {
        System.out.print(str);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            PrintStream printStream = System.out;
            if (i2 == 0) {
                printStream.print(iArr[i2]);
            } else {
                StringBuilder y = a.y(", ");
                y.append(iArr[i2]);
                printStream.print(y.toString());
            }
        }
        System.out.println();
    }

    @Override // ch.qos.logback.classic.pattern.Abbreviator
    public String abbreviate(String str) {
        String substring;
        StringBuilder sb = new StringBuilder(this.targetLength);
        if (str != null) {
            if (str.length() < this.targetLength) {
                return str;
            }
            int[] iArr = new int[16];
            int[] iArr2 = new int[17];
            int computeDotIndexes = computeDotIndexes(str, iArr);
            if (computeDotIndexes == 0) {
                return str;
            }
            computeLengthArray(str, iArr, iArr2, computeDotIndexes);
            for (int i2 = 0; i2 <= computeDotIndexes; i2++) {
                if (i2 == 0) {
                    substring = str.substring(0, iArr2[i2] - 1);
                } else {
                    int i3 = i2 - 1;
                    substring = str.substring(iArr[i3], iArr[i3] + iArr2[i2]);
                }
                sb.append(substring);
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Class name may not be null");
    }

    public void computeLengthArray(String str, int[] iArr, int[] iArr2, int i2) {
        int length = str.length() - this.targetLength;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = (iArr[i3] - (i3 > 0 ? iArr[i3 - 1] : -1)) - 1;
            int i5 = (length <= 0 || i4 < 1) ? i4 : 1;
            length -= i4 - i5;
            iArr2[i3] = i5 + 1;
            i3++;
        }
        iArr2[i2] = str.length() - iArr[i2 - 1];
    }
}
