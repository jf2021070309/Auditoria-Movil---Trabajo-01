package e.d.b.e.a.a;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public final class z {
    public static final e.d.b.e.a.c.e a = new e.d.b.e.a.c.e("AssetPackStorage");

    /* renamed from: b  reason: collision with root package name */
    public final Context f6982b;

    /* renamed from: c  reason: collision with root package name */
    public final a2 f6983c;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        timeUnit.toMillis(14L);
        timeUnit.toMillis(28L);
    }

    public z(Context context, a2 a2Var) {
        this.f6982b = context;
        this.f6983c = a2Var;
    }

    public static void c(File file) {
        File[] listFiles;
        if (file.listFiles() == null || file.listFiles().length <= 1) {
            return;
        }
        long e2 = e(file);
        for (File file2 : file.listFiles()) {
            if (!file2.getName().equals(String.valueOf(e2)) && !file2.getName().equals("stale.tmp")) {
                j(file2);
            }
        }
    }

    public static long e(File file) {
        File[] listFiles;
        if (file.exists()) {
            ArrayList arrayList = new ArrayList();
            try {
                for (File file2 : file.listFiles()) {
                    if (!file2.getName().equals("stale.tmp")) {
                        arrayList.add(Long.valueOf(file2.getName()));
                    }
                }
            } catch (NumberFormatException e2) {
                a.c(e2, "Corrupt asset pack directories.", new Object[0]);
            }
            if (arrayList.isEmpty()) {
                return -1L;
            }
            Collections.sort(arrayList);
            return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
        }
        return -1L;
    }

    public static boolean j(File file) {
        boolean z;
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            z = true;
            for (File file2 : listFiles) {
                z &= j(file2);
            }
        } else {
            z = true;
        }
        return file.delete() && true == z;
    }

    public final File a(String str, int i2, long j2) {
        return new File(new File(o(str), String.valueOf(i2)), String.valueOf(j2));
    }

    public final File b(String str, int i2, long j2, String str2) {
        return new File(new File(new File(q(str, i2, j2), "_slices"), "_unverified"), str2);
    }

    public final void d(String str, int i2, long j2, int i3) throws IOException {
        File file = new File(h(str, i2, j2), "merge.tmp");
        Properties properties = new Properties();
        properties.put("numberOfMerges", String.valueOf(i3));
        file.getParentFile().mkdirs();
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final e.d.b.e.a.a.b f(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r8.r()
            r0.<init>(r1, r9)
            boolean r1 = r0.exists()
            r2 = 3
            r3 = 6
            r4 = 1
            r5 = 0
            r6 = 0
            if (r1 != 0) goto L22
            e.d.b.e.a.c.e r0 = e.d.b.e.a.a.z.a
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r5] = r9
            java.lang.String r9 = "Pack not found with pack name: %s"
            r0.a(r2, r9, r1)
        L1f:
            r9 = r6
            goto L93
        L22:
            java.io.File r1 = new java.io.File
            e.d.b.e.a.a.a2 r7 = r8.f6983c
            int r7 = r7.a()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r1.<init>(r0, r7)
            boolean r0 = r1.exists()
            r7 = 2
            if (r0 != 0) goto L50
            e.d.b.e.a.c.e r0 = e.d.b.e.a.a.z.a
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r1[r5] = r9
            e.d.b.e.a.a.a2 r9 = r8.f6983c
            int r9 = r9.a()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r1[r4] = r9
            java.lang.String r9 = "Pack not found with pack name: %s app version: %s"
            r0.a(r2, r9, r1)
            goto L1f
        L50:
            java.io.File[] r0 = r1.listFiles()
            if (r0 == 0) goto L7b
            int r1 = r0.length
            if (r1 != 0) goto L5a
            goto L7b
        L5a:
            if (r1 <= r4) goto L74
            e.d.b.e.a.c.e r0 = e.d.b.e.a.a.z.a
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r1[r5] = r9
            e.d.b.e.a.a.a2 r9 = r8.f6983c
            int r9 = r9.a()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r1[r4] = r9
            java.lang.String r9 = "Multiple pack versions found for pack name: %s app version: %s"
            r0.a(r3, r9, r1)
            goto L1f
        L74:
            r9 = r0[r5]
            java.lang.String r9 = r9.getCanonicalPath()
            goto L93
        L7b:
            e.d.b.e.a.c.e r0 = e.d.b.e.a.a.z.a
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r1[r5] = r9
            e.d.b.e.a.a.a2 r9 = r8.f6983c
            int r9 = r9.a()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r1[r4] = r9
            java.lang.String r9 = "No pack version found for pack name: %s app version: %s"
            r0.a(r2, r9, r1)
            goto L1f
        L93:
            if (r9 != 0) goto L96
            return r6
        L96:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "assets"
            r0.<init>(r9, r1)
            boolean r1 = r0.isDirectory()
            if (r1 != 0) goto Laf
            e.d.b.e.a.c.e r9 = e.d.b.e.a.a.z.a
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r5] = r0
            java.lang.String r0 = "Failed to find assets directory: %s"
            r9.a(r3, r0, r1)
            return r6
        Laf:
            java.lang.String r0 = r0.getCanonicalPath()
            e.d.b.e.a.a.d0 r1 = new e.d.b.e.a.a.d0
            r1.<init>(r5, r9, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d.b.e.a.a.z.f(java.lang.String):e.d.b.e.a.a.b");
    }

    public final File g(String str, int i2, long j2, String str2) {
        return new File(new File(new File(q(str, i2, j2), "_slices"), "_verified"), str2);
    }

    public final File h(String str, int i2, long j2) {
        return new File(q(str, i2, j2), "_packs");
    }

    public final File i(String str, int i2, long j2, String str2) {
        return new File(n(str, i2, j2, str2), "checkpoint.dat");
    }

    public final int k(String str, int i2, long j2) throws IOException {
        File file = new File(h(str, i2, j2), "merge.tmp");
        if (file.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("numberOfMerges") != null) {
                    try {
                        return Integer.parseInt(properties.getProperty("numberOfMerges"));
                    } catch (NumberFormatException e2) {
                        throw new p0("Merge checkpoint file corrupt.", e2);
                    }
                }
                throw new p0("Merge checkpoint file corrupt.");
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    e.d.b.e.a.c.a0.a.a(th, th2);
                }
                throw th;
            }
        }
        return 0;
    }

    public final File l(String str, int i2, long j2, String str2) {
        return new File(n(str, i2, j2, str2), "slice.zip");
    }

    public final long m(String str) {
        return e(new File(o(str), String.valueOf((int) e(o(str)))));
    }

    public final File n(String str, int i2, long j2, String str2) {
        return new File(new File(new File(q(str, i2, j2), "_slices"), "_metadata"), str2);
    }

    public final File o(String str) {
        return new File(r(), str);
    }

    public final List<File> p() {
        File[] listFiles;
        ArrayList arrayList = new ArrayList();
        try {
        } catch (IOException e2) {
            a.a(6, "Could not process directory while scanning installed packs. %s", new Object[]{e2});
        }
        if (r().exists() && r().listFiles() != null) {
            for (File file : r().listFiles()) {
                if (!file.getCanonicalPath().equals(new File(r(), "_tmp").getCanonicalPath())) {
                    arrayList.add(file);
                }
            }
            return arrayList;
        }
        return arrayList;
    }

    public final File q(String str, int i2, long j2) {
        return new File(new File(new File(new File(r(), "_tmp"), str), String.valueOf(i2)), String.valueOf(j2));
    }

    public final File r() {
        return new File(this.f6982b.getFilesDir(), "assetpacks");
    }
}
