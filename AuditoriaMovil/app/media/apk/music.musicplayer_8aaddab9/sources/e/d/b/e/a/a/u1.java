package e.d.b.e.a.a;

import java.io.File;
import java.io.IOException;
/* loaded from: classes2.dex */
public final class u1 {
    public static final e.d.b.e.a.c.e a = new e.d.b.e.a.c.e("MergeSliceTaskHandler");

    /* renamed from: b  reason: collision with root package name */
    public final z f6965b;

    public u1(z zVar) {
        this.f6965b = zVar;
    }

    public static void b(File file, File file2) {
        File[] listFiles;
        if (!file.isDirectory()) {
            if (file2.exists()) {
                String valueOf = String.valueOf(file2);
                throw new p0(e.a.d.a.a.r(new StringBuilder(valueOf.length() + 51), "File clashing with existing file from other slice: ", valueOf));
            } else if (file.renameTo(file2)) {
                return;
            } else {
                String valueOf2 = String.valueOf(file);
                throw new p0(e.a.d.a.a.r(new StringBuilder(valueOf2.length() + 21), "Unable to move file: ", valueOf2));
            }
        }
        file2.mkdirs();
        for (File file3 : file.listFiles()) {
            b(file3, new File(file2, file3.getName()));
        }
        if (file.delete()) {
            return;
        }
        String valueOf3 = String.valueOf(file);
        throw new p0(e.a.d.a.a.r(new StringBuilder(valueOf3.length() + 28), "Unable to delete directory: ", valueOf3));
    }

    public final void a(t1 t1Var) {
        File g2 = this.f6965b.g(t1Var.f6822b, t1Var.f6954c, t1Var.f6955d, t1Var.f6956e);
        if (!g2.exists()) {
            throw new p0(String.format("Cannot find verified files for slice %s.", t1Var.f6956e), t1Var.a);
        }
        File h2 = this.f6965b.h(t1Var.f6822b, t1Var.f6954c, t1Var.f6955d);
        if (!h2.exists()) {
            h2.mkdirs();
        }
        b(g2, h2);
        try {
            this.f6965b.d(t1Var.f6822b, t1Var.f6954c, t1Var.f6955d, this.f6965b.k(t1Var.f6822b, t1Var.f6954c, t1Var.f6955d) + 1);
        } catch (IOException e2) {
            a.a(6, "Writing merge checkpoint failed with %s.", new Object[]{e2.getMessage()});
            throw new p0("Writing merge checkpoint failed.", e2, t1Var.a);
        }
    }
}
