package e.d.d.m.j.n;

import android.content.Context;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class f {
    public final File a;

    /* renamed from: b  reason: collision with root package name */
    public final File f7507b;

    /* renamed from: c  reason: collision with root package name */
    public final File f7508c;

    /* renamed from: d  reason: collision with root package name */
    public final File f7509d;

    /* renamed from: e  reason: collision with root package name */
    public final File f7510e;

    public f(Context context) {
        File file = new File(context.getFilesDir(), ".com.google.firebase.crashlytics.files.v1");
        g(file);
        this.a = file;
        File file2 = new File(file, "open-sessions");
        g(file2);
        this.f7507b = file2;
        File file3 = new File(file, "reports");
        g(file3);
        this.f7508c = file3;
        File file4 = new File(file, "priority-reports");
        g(file4);
        this.f7509d = file4;
        File file5 = new File(file, "native-reports");
        g(file5);
        this.f7510e = file5;
    }

    public static synchronized File g(File file) {
        synchronized (f.class) {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
                e.d.d.m.j.f.a.a(3);
                file.delete();
            }
            if (file.mkdirs()) {
                return file;
            }
            throw new IllegalStateException("Could not create Crashlytics-specific directory: " + file);
        }
    }

    public static boolean h(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                h(file2);
            }
        }
        return file.delete();
    }

    public static <T> List<T> i(T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    public File a(String str) {
        return new File(this.a, str);
    }

    public List<File> b() {
        return i(this.f7510e.listFiles());
    }

    public List<File> c() {
        return i(this.f7509d.listFiles());
    }

    public List<File> d() {
        return i(this.f7508c.listFiles());
    }

    public final File e(String str) {
        File file = new File(this.f7507b, str);
        file.mkdirs();
        return file;
    }

    public File f(String str, String str2) {
        return new File(e(str), str2);
    }
}
