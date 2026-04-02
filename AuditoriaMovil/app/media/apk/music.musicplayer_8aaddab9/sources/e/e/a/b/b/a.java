package e.e.a.b.b;

import java.io.File;
/* loaded from: classes.dex */
public final class a {
    public final File a;

    /* renamed from: b  reason: collision with root package name */
    public final File f7931b;

    public a(String str, File file) {
        this.f7931b = a(file, str, "values");
        this.a = a(file, str, "backup");
    }

    public final File a(File file, String str, String str2) {
        File file2 = new File(new File(new File(file, "preferences"), str), str2);
        if (file2.exists() && !file2.isDirectory()) {
            file2.delete();
        }
        if (file2.exists() || file2.mkdirs()) {
            return file2;
        }
        throw new e.e.a.a.a(String.format("Can't create preferences directory in %s", file2.getAbsolutePath()));
    }
}
