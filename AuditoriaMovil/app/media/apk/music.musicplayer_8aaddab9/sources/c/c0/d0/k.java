package c.c0.d0;

import android.content.Context;
import android.os.Build;
import c.c0.r;
import java.io.File;
import java.util.HashMap;
/* loaded from: classes.dex */
public class k {
    public static final String a = r.e("WrkDbPathHelper");

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f1367b = {"-journal", "-shm", "-wal"};

    public static void a(Context context) {
        File databasePath;
        File databasePath2;
        String[] strArr;
        File databasePath3 = context.getDatabasePath("androidx.work.workdb");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 23 || !databasePath3.exists()) {
            return;
        }
        r.c().a(a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
        HashMap hashMap = new HashMap();
        if (i2 >= 23) {
            hashMap.put(context.getDatabasePath("androidx.work.workdb"), i2 < 23 ? context.getDatabasePath("androidx.work.workdb") : new File(context.getNoBackupFilesDir(), "androidx.work.workdb"));
            for (String str : f1367b) {
                hashMap.put(new File(databasePath.getPath() + str), new File(databasePath2.getPath() + str));
            }
        }
        for (File file : hashMap.keySet()) {
            File file2 = (File) hashMap.get(file);
            if (file.exists() && file2 != null) {
                if (file2.exists()) {
                    r.c().f(a, String.format("Over-writing contents of %s", file2), new Throwable[0]);
                }
                r.c().a(a, file.renameTo(file2) ? String.format("Migrated %s to %s", file, file2) : String.format("Renaming %s to %s failed", file, file2), new Throwable[0]);
            }
        }
    }
}
