package ch.qos.logback.core.util;
/* loaded from: classes.dex */
public class ContentTypeUtil {
    public static String getSubType(String str) {
        int indexOf;
        int i2;
        if (str == null || (indexOf = str.indexOf(47)) == -1 || (i2 = indexOf + 1) >= str.length()) {
            return null;
        }
        return str.substring(i2);
    }

    public static boolean isTextual(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("text");
    }
}
