package ch.qos.logback.core.util;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.helpers.ThrowableToStringArray;
import ch.qos.logback.core.status.Status;
import ch.qos.logback.core.status.StatusManager;
import ch.qos.logback.core.status.StatusUtil;
import e.a.d.a.a;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class StatusPrinter {
    private static PrintStream ps = System.out;
    public static CachingDateFormatter cachingDateFormat = new CachingDateFormatter("HH:mm:ss,SSS");

    private static void appendThrowable(StringBuilder sb, Throwable th) {
        String[] convert;
        for (String str : ThrowableToStringArray.convert(th)) {
            if (!str.startsWith(CoreConstants.CAUSED_BY)) {
                sb.append(Character.isDigit(str.charAt(0)) ? "\t... " : "\tat ");
            }
            sb.append(str);
            sb.append(CoreConstants.LINE_SEPARATOR);
        }
    }

    public static void buildStr(StringBuilder sb, String str, Status status) {
        StringBuilder y;
        String str2;
        if (status.hasChildren()) {
            y = a.y(str);
            str2 = "+ ";
        } else {
            y = a.y(str);
            str2 = "|-";
        }
        y.append(str2);
        String sb2 = y.toString();
        CachingDateFormatter cachingDateFormatter = cachingDateFormat;
        if (cachingDateFormatter != null) {
            sb.append(cachingDateFormatter.format(status.getDate().longValue()));
            sb.append(" ");
        }
        sb.append(sb2);
        sb.append(status);
        sb.append(CoreConstants.LINE_SEPARATOR);
        if (status.getThrowable() != null) {
            appendThrowable(sb, status.getThrowable());
        }
        if (status.hasChildren()) {
            Iterator<Status> it = status.iterator();
            while (it.hasNext()) {
                buildStr(sb, str + "  ", it.next());
            }
        }
    }

    private static void buildStrFromStatusList(StringBuilder sb, List<Status> list) {
        if (list == null) {
            return;
        }
        for (Status status : list) {
            buildStr(sb, "", status);
        }
    }

    public static void print(Context context) {
        print(context, 0L);
    }

    public static void print(Context context, long j2) {
        if (context == null) {
            throw new IllegalArgumentException("Context argument cannot be null");
        }
        StatusManager statusManager = context.getStatusManager();
        if (statusManager != null) {
            print(statusManager, j2);
            return;
        }
        PrintStream printStream = ps;
        StringBuilder y = a.y("WARN: Context named \"");
        y.append(context.getName());
        y.append("\" has no status manager");
        printStream.println(y.toString());
    }

    public static void print(StatusManager statusManager) {
        print(statusManager, 0L);
    }

    public static void print(StatusManager statusManager, long j2) {
        StringBuilder sb = new StringBuilder();
        buildStrFromStatusList(sb, StatusUtil.filterStatusListByTimeThreshold(statusManager.getCopyOfStatusList(), j2));
        ps.println(sb.toString());
    }

    public static void print(List<Status> list) {
        StringBuilder sb = new StringBuilder();
        buildStrFromStatusList(sb, list);
        ps.println(sb.toString());
    }

    public static void printIfErrorsOccured(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Context argument cannot be null");
        }
        StatusManager statusManager = context.getStatusManager();
        if (statusManager != null) {
            if (new StatusUtil(context).getHighestLevel(0L) == 2) {
                print(statusManager);
                return;
            }
            return;
        }
        PrintStream printStream = ps;
        StringBuilder y = a.y("WARN: Context named \"");
        y.append(context.getName());
        y.append("\" has no status manager");
        printStream.println(y.toString());
    }

    public static void printInCaseOfErrorsOrWarnings(Context context) {
        printInCaseOfErrorsOrWarnings(context, 0L);
    }

    public static void printInCaseOfErrorsOrWarnings(Context context, long j2) {
        if (context == null) {
            throw new IllegalArgumentException("Context argument cannot be null");
        }
        StatusManager statusManager = context.getStatusManager();
        if (statusManager != null) {
            if (new StatusUtil(context).getHighestLevel(j2) >= 1) {
                print(statusManager, j2);
                return;
            }
            return;
        }
        PrintStream printStream = ps;
        StringBuilder y = a.y("WARN: Context named \"");
        y.append(context.getName());
        y.append("\" has no status manager");
        printStream.println(y.toString());
    }

    public static void setPrintStream(PrintStream printStream) {
        ps = printStream;
    }
}
