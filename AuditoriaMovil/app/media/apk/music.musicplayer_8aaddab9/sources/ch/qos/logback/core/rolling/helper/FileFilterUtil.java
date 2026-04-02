package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.classic.Level;
import ch.qos.logback.core.CoreConstants;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public class FileFilterUtil {

    /* loaded from: classes.dex */
    public static class a implements FilenameFilter {
        public final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.matches(this.a);
        }
    }

    public static String afterLastSlash(String str) {
        int lastIndexOf = str.lastIndexOf(47);
        return lastIndexOf == -1 ? str : str.substring(lastIndexOf + 1);
    }

    public static int extractCounter(File file, String str) {
        Pattern compile = Pattern.compile(str);
        String name = file.getName();
        Matcher matcher = compile.matcher(name);
        if (matcher.matches()) {
            return Integer.valueOf(matcher.group(1)).intValue();
        }
        throw new IllegalStateException("The regex [" + str + "] should match [" + name + "]");
    }

    public static File[] filesInFolderMatchingStemRegex(File file, String str) {
        return file == null ? new File[0] : (file.exists() && file.isDirectory()) ? file.listFiles(new a(str)) : new File[0];
    }

    public static int findHighestCounter(File[] fileArr, String str) {
        int i2 = Level.ALL_INT;
        for (File file : fileArr) {
            int extractCounter = extractCounter(file, str);
            if (i2 < extractCounter) {
                i2 = extractCounter;
            }
        }
        return i2;
    }

    public static String slashify(String str) {
        return str.replace(CoreConstants.ESCAPE_CHAR, '/');
    }
}
