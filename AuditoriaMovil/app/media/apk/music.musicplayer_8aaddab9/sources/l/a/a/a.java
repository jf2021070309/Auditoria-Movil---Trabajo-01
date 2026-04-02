package l.a.a;

import e.j.d.w;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
/* loaded from: classes2.dex */
public class a extends ArrayList implements b, d {
    public static final /* synthetic */ int a = 0;

    public a() {
    }

    public a(int i2) {
        super(i2);
    }

    public static void f(Collection collection, Writer writer) throws IOException {
        if (collection == null) {
            writer.write("null");
            return;
        }
        boolean z = true;
        writer.write(91);
        for (Object obj : collection) {
            if (z) {
                z = false;
            } else {
                writer.write(44);
            }
            if (obj == null) {
                writer.write("null");
            } else {
                w.K0(obj, writer);
            }
        }
        writer.write(93);
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

    @Override // java.util.AbstractCollection
    public String toString() {
        return b();
    }
}
