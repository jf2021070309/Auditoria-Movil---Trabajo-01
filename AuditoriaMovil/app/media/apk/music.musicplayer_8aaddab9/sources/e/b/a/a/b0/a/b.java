package e.b.a.a.b0.a;

import android.content.Context;
import e.j.d.w;
import h.o.c.j;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;
import k.g;
import k.n;
import k.o;
import k.p;
import k.q;
import k.r;
import k.y;
/* loaded from: classes.dex */
public class b {
    public final File a;

    public b(Context context, String str) {
        File file = new File(context.getDir("com_birbit_jobqueue_jobs", 0), e.a.d.a.a.k("files_", str));
        this.a = file;
        file.mkdirs();
    }

    public byte[] a(String str) throws IOException {
        File c2 = c(str);
        if (c2.exists() && c2.canRead()) {
            Logger logger = o.a;
            j.e(c2, "<this>");
            g l2 = w.l(new n(new FileInputStream(c2), y.a));
            try {
                r rVar = (r) l2;
                rVar.f9637b.g0(rVar.a);
                return rVar.f9637b.y();
            } finally {
                try {
                    ((r) l2).close();
                } catch (IOException unused) {
                }
            }
        }
        return null;
    }

    public void b(String str, byte[] bArr) throws IOException {
        File c2 = c(str);
        Logger logger = o.a;
        j.e(c2, "<this>");
        j.e(c2, "<this>");
        FileOutputStream fileOutputStream = new FileOutputStream(c2, false);
        j.e(fileOutputStream, "<this>");
        k.f k2 = w.k(new p(fileOutputStream, new y()));
        try {
            q qVar = (q) k2;
            qVar.O(bArr);
            qVar.flush();
        } finally {
            try {
                ((q) k2).close();
            } catch (IOException unused) {
            }
        }
    }

    public final File c(String str) {
        return new File(this.a, e.a.d.a.a.k(str, ".jobs"));
    }
}
