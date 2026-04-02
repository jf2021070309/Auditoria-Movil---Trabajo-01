package ch.qos.logback.core.util;

import e.a.d.a.a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public class FileSize {
    private static final int DOUBLE_GROUP = 1;
    private static final Pattern FILE_SIZE_PATTERN = Pattern.compile("([0-9]+)\\s*(|kb|mb|gb)s?", 2);
    public static final long GB_COEFFICIENT = 1073741824;
    public static final long KB_COEFFICIENT = 1024;
    private static final String LENGTH_PART = "([0-9]+)";
    public static final long MB_COEFFICIENT = 1048576;
    private static final int UNIT_GROUP = 2;
    private static final String UNIT_PART = "(|kb|mb|gb)s?";
    public final long size;

    public FileSize(long j2) {
        this.size = j2;
    }

    public static FileSize valueOf(String str) {
        long j2;
        Matcher matcher = FILE_SIZE_PATTERN.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            long longValue = Long.valueOf(group).longValue();
            if (group2.equalsIgnoreCase("")) {
                j2 = 1;
            } else if (group2.equalsIgnoreCase("kb")) {
                j2 = KB_COEFFICIENT;
            } else if (group2.equalsIgnoreCase("mb")) {
                j2 = MB_COEFFICIENT;
            } else if (!group2.equalsIgnoreCase("gb")) {
                throw new IllegalStateException(a.k("Unexpected ", group2));
            } else {
                j2 = GB_COEFFICIENT;
            }
            return new FileSize(longValue * j2);
        }
        throw new IllegalArgumentException(a.l("String value [", str, "] is not in the expected format."));
    }

    public long getSize() {
        return this.size;
    }

    public String toString() {
        long j2 = this.size;
        long j3 = j2 / KB_COEFFICIENT;
        if (j3 == 0) {
            return a.q(new StringBuilder(), this.size, " Bytes");
        }
        long j4 = j2 / MB_COEFFICIENT;
        if (j4 == 0) {
            return j3 + " KB";
        }
        long j5 = j2 / GB_COEFFICIENT;
        if (j5 == 0) {
            return j4 + " MB";
        }
        return j5 + " GB";
    }
}
