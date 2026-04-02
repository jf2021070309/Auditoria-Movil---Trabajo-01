package ch.qos.logback.core.helpers;

import ch.qos.logback.core.CoreConstants;
import e.a.d.a.a;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class ThrowableToStringArray {
    public static String[] convert(Throwable th) {
        LinkedList linkedList = new LinkedList();
        extract(linkedList, th, null);
        return (String[]) linkedList.toArray(new String[0]);
    }

    private static void extract(List<String> list, Throwable th, StackTraceElement[] stackTraceElementArr) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int findNumberOfCommonFrames = findNumberOfCommonFrames(stackTrace, stackTraceElementArr);
        list.add(formatFirstLine(th, stackTraceElementArr));
        for (int i2 = 0; i2 < stackTrace.length - findNumberOfCommonFrames; i2++) {
            StringBuilder y = a.y("\tat ");
            y.append(stackTrace[i2].toString());
            list.add(y.toString());
        }
        if (findNumberOfCommonFrames != 0) {
            list.add("\t... " + findNumberOfCommonFrames + " common frames omitted");
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            extract(list, cause, stackTrace);
        }
    }

    private static int findNumberOfCommonFrames(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        int i2 = 0;
        if (stackTraceElementArr2 == null) {
            return 0;
        }
        int length = stackTraceElementArr.length - 1;
        for (int length2 = stackTraceElementArr2.length - 1; length >= 0 && length2 >= 0 && stackTraceElementArr[length].equals(stackTraceElementArr2[length2]); length2--) {
            i2++;
            length--;
        }
        return i2;
    }

    private static String formatFirstLine(Throwable th, StackTraceElement[] stackTraceElementArr) {
        StringBuilder y = a.y(stackTraceElementArr != null ? CoreConstants.CAUSED_BY : "");
        y.append(th.getClass().getName());
        String sb = y.toString();
        if (th.getMessage() != null) {
            StringBuilder A = a.A(sb, ": ");
            A.append(th.getMessage());
            return A.toString();
        }
        return sb;
    }
}
