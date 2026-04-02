package net.hockeyapp.android.metrics;

import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.hockeyapp.android.metrics.model.IJsonSerializable;
/* loaded from: classes4.dex */
public final class JsonHelper {
    private static final String[] a = new String[128];

    static {
        for (int i = 0; i <= 31; i++) {
            a[i] = String.format("\\u%04X", Integer.valueOf(i));
        }
        a[34] = "\\\"";
        a[92] = "\\\\";
        a[8] = "\\b";
        a[12] = "\\f";
        a[10] = "\\n";
        a[13] = "\\r";
        a[9] = "\\t";
    }

    private JsonHelper() {
    }

    private static String a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("\"");
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                String str2 = a[charAt];
                if (str2 == null) {
                    sb.append(charAt);
                } else {
                    sb.append(str2);
                }
            } else if (charAt == 8232) {
                sb.append("\\u2028");
            } else if (charAt == 8233) {
                sb.append("\\u2029");
            } else {
                sb.append(charAt);
            }
        }
        sb.append("\"");
        return sb.toString();
    }

    public static String convert(Integer num) {
        return Integer.toString(num.intValue());
    }

    public static String convert(Long l) {
        return Long.toString(l.longValue());
    }

    public static String convert(char c) {
        return Character.toString(c);
    }

    public static String convert(Float f) {
        return Float.toString(f.floatValue());
    }

    public static String convert(Double d) {
        return Double.toString(d.doubleValue());
    }

    public static String convert(boolean z) {
        return Boolean.toString(z);
    }

    public static String convert(String str) {
        if (str == null) {
            return "null";
        }
        if (str.length() == 0) {
            return "\"\"";
        }
        return a(str);
    }

    public static void writeJsonSerializable(Writer writer, IJsonSerializable iJsonSerializable) {
        if (iJsonSerializable != null) {
            iJsonSerializable.serialize(writer);
        }
    }

    public static <T> void writeDictionary(Writer writer, Map<String, T> map) {
        if (map == null || map.isEmpty()) {
            writer.write("null");
            return;
        }
        Iterator<String> it = map.keySet().iterator();
        if (it.hasNext()) {
            writer.write("{");
            String next = it.next();
            T t = map.get(next);
            writer.write("\"" + next + "\"");
            writer.write(":");
            a(writer, t);
            while (it.hasNext()) {
                String next2 = it.next();
                writer.write(",");
                writer.write("\"" + next2 + "\"");
                writer.write(":");
                a(writer, map.get(next2));
            }
            writer.write("}");
        }
    }

    public static <T extends IJsonSerializable> void writeList(Writer writer, List<T> list) {
        if (list == null || list.isEmpty()) {
            writer.write("null");
            return;
        }
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            writer.write("[");
            it.next().serialize(writer);
            while (it.hasNext()) {
                writer.write(",");
                it.next().serialize(writer);
            }
            writer.write("]");
        }
    }

    private static <T> void a(Writer writer, T t) {
        if (t != null) {
            if (t instanceof String) {
                writer.write(convert((String) t));
                return;
            } else if (t instanceof Double) {
                writer.write(convert((Double) t));
                return;
            } else if (t instanceof Integer) {
                writer.write(convert((Integer) t));
                return;
            } else if (t instanceof Long) {
                writer.write(convert((Long) t));
                return;
            } else if (t instanceof IJsonSerializable) {
                ((IJsonSerializable) t).serialize(writer);
                return;
            } else {
                throw new IOException("Cannot serialize: " + t.toString());
            }
        }
        writer.write("null");
    }
}
