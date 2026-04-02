package l.a.a;

import e.j.d.w;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class c extends HashMap implements Map, b, d {
    public static void f(Map map, Writer writer) throws IOException {
        if (map == null) {
            writer.write("null");
            return;
        }
        boolean z = true;
        writer.write(123);
        for (Map.Entry entry : map.entrySet()) {
            if (z) {
                z = false;
            } else {
                writer.write(44);
            }
            writer.write(34);
            writer.write(w.D(String.valueOf(entry.getKey())));
            writer.write(34);
            writer.write(58);
            w.K0(entry.getValue(), writer);
        }
        writer.write(125);
    }

    @Override // l.a.a.d
    public void a(Writer writer) throws IOException {
        f(this, writer);
    }

    @Override // l.a.a.b
    public String b() {
        StringWriter stringWriter = new StringWriter();
        try {
            f(this, stringWriter);
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // java.util.AbstractMap
    public String toString() {
        return b();
    }
}
