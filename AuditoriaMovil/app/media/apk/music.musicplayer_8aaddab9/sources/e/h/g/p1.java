package e.h.g;

import android.content.Context;
import android.os.Build;
import android.os.StatFs;
import ch.qos.logback.classic.net.SyslogAppender;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public class p1 {

    /* renamed from: f  reason: collision with root package name */
    public static String[] f8358f;

    /* renamed from: i  reason: collision with root package name */
    public static String f8361i;
    public static final String[] a = {"/storage/UsbDriveA", "/storage/UsbDriveB", "/storage/UsbDriveC", "/storage/UsbDriveD", "/storage/UsbDriveE", "/storage/UsbDriveF", "/storage/USBDisk1"};

    /* renamed from: b  reason: collision with root package name */
    public static final ArrayList<String> f8354b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public static final ArrayList<String> f8355c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public static final ArrayList<String> f8356d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public static final ArrayList<ArrayList<String>> f8357e = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    public static a f8359g = null;

    /* renamed from: h  reason: collision with root package name */
    public static Boolean f8360h = null;

    /* renamed from: j  reason: collision with root package name */
    public static String f8362j = null;

    /* renamed from: k  reason: collision with root package name */
    public static String f8363k = null;

    /* loaded from: classes2.dex */
    public class a {
        public a(p1 p1Var) {
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public boolean a = false;

        /* renamed from: b  reason: collision with root package name */
        public boolean f8364b = false;

        /* renamed from: c  reason: collision with root package name */
        public String f8365c;

        /* renamed from: d  reason: collision with root package name */
        public String f8366d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f8367e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f8368f;

        /* renamed from: g  reason: collision with root package name */
        public String f8369g;

        /* renamed from: h  reason: collision with root package name */
        public String[] f8370h;

        /* renamed from: i  reason: collision with root package name */
        public String f8371i;

        public b() {
            new ArrayList();
            this.f8365c = null;
            new ArrayList();
            this.f8371i = null;
        }

        public String a() {
            return this.f8366d;
        }

        public String b() {
            return this.f8365c;
        }

        public String c() {
            return this.f8371i;
        }

        public boolean d() {
            return this.a;
        }

        public boolean e() {
            return this.f8364b && this.f8371i != null;
        }

        public boolean f() {
            return this.f8367e;
        }

        public boolean g() {
            return this.f8368f;
        }
    }

    static {
        f8361i = null;
        try {
            String str = System.getenv("SECONDARY_STORAGE");
            if (str != null) {
                f8361i = str.split(":")[0];
            }
            if (f8361i == null) {
                f8361i = System.getenv("EXTERNAL_STORAGE").split(":")[0];
            }
        } catch (Throwable th) {
            s1.l(th, true);
        }
    }

    public static boolean a(Context context, File file) {
        boolean z = false;
        try {
            if (!file.exists() || !file.isDirectory() || !file.canWrite()) {
                String str = "Don't add path because it cannot be written to " + file;
                int i2 = t1.a;
                return false;
            }
            StatFs statFs = new StatFs(file.getAbsolutePath());
            if (statFs.getBlockSize() * statFs.getBlockCount() <= 0) {
                String str2 = "Don't add path because it has no size " + file;
                int i3 = t1.a;
                return false;
            }
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length <= 0) {
                try {
                    File file2 = new File(file.getAbsolutePath() + File.separator + System.nanoTime());
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                    bufferedOutputStream.write("TEst".getBytes());
                    bufferedOutputStream.close();
                    if (file2.exists()) {
                        if (file2.delete()) {
                            z = true;
                        }
                    }
                } catch (IOException unused) {
                } catch (Exception e2) {
                    s1.l(e2, true);
                }
                if (z) {
                    return z;
                }
                File file3 = new File(file.getAbsolutePath() + "/tmp");
                file3.mkdirs();
                if (!file3.exists()) {
                    String str3 = "Don't add path because it really cannot be written to " + file;
                    int i4 = t1.a;
                    return z;
                }
                file3.delete();
            }
            return true;
        } catch (Exception unused2) {
            String str4 = "Don't add path because of error " + file;
            int i5 = t1.a;
            return false;
        }
    }

    public static synchronized b b(Context context, e.h.c.a aVar, boolean z) {
        b bVar;
        String[] strArr;
        File[] listFiles;
        synchronized (p1.class) {
            bVar = new b();
            ArrayList<String> arrayList = f8354b;
            arrayList.clear();
            ArrayList<String> arrayList2 = f8355c;
            arrayList2.clear();
            ArrayList<ArrayList<String>> arrayList3 = f8357e;
            arrayList3.clear();
            ArrayList<String> arrayList4 = f8356d;
            arrayList4.clear();
            f8358f = null;
            String absolutePath = j1.c().getAbsolutePath();
            int i2 = t1.a;
            arrayList.add(absolutePath);
            arrayList3.add(new ArrayList<>());
            Boolean valueOf = Boolean.valueOf(d(context, true) != null);
            f8360h = valueOf;
            if (valueOf.booleanValue()) {
                String d2 = d(context, true);
                if (d2 != null && d2.length() > 0 && !d2.equals(absolutePath)) {
                    f8361i = d2;
                    arrayList.add(d2);
                    arrayList3.add(new ArrayList<>());
                } else if (d2 != null) {
                    d2.equals(absolutePath);
                }
            }
            boolean equalsIgnoreCase = "samsung".equalsIgnoreCase(Build.MANUFACTURER);
            if (arrayList.size() < 2 && (!equalsIgnoreCase || !v0.g())) {
                arrayList2.clear();
                arrayList3.clear();
                arrayList4.clear();
                f8358f = null;
                g();
                h();
                Iterator<String> it = arrayList4.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    ArrayList<String> arrayList5 = f8354b;
                    if (!arrayList5.contains(next)) {
                        arrayList5.add(next);
                    }
                }
                f8356d.clear();
                j(z);
                f();
                if (f8354b.size() < 2) {
                    ArrayList<String> arrayList6 = f8355c;
                    if (arrayList6.size() > 0) {
                        Iterator<String> it2 = arrayList6.iterator();
                        while (it2.hasNext()) {
                            String next2 = it2.next();
                            ArrayList<String> arrayList7 = f8354b;
                            if (!arrayList7.contains(next2)) {
                                arrayList7.add(next2);
                                f8357e.add(new ArrayList<>());
                            }
                        }
                        j(z);
                        f();
                    }
                }
            }
            if (f8354b.size() < 2 && aVar.c() > 0) {
                for (int i3 = 0; i3 < aVar.c(); i3++) {
                    String a2 = aVar.a(i3);
                    ArrayList<String> arrayList8 = f8354b;
                    if (!arrayList8.contains(a2)) {
                        arrayList8.add(a2);
                        f8357e.add(new ArrayList<>());
                    }
                    j(z);
                    f();
                }
            }
            if ("lenovo".equalsIgnoreCase(Build.MANUFACTURER)) {
                ArrayList<String> arrayList9 = f8354b;
                if (arrayList9.size() < 2) {
                    File file = new File("/storage/sdcard1");
                    if (file.exists() && !arrayList9.contains(file.getAbsolutePath())) {
                        arrayList9.add("/storage/sdcard1");
                        f8357e.add(new ArrayList<>());
                    }
                }
            }
            for (String str : a) {
                File file2 = new File(str);
                if (file2.exists() && (listFiles = file2.listFiles()) != null && listFiles.length > 0) {
                    ArrayList<String> arrayList10 = f8354b;
                    if (!arrayList10.contains(str)) {
                        arrayList10.add(str);
                        f8357e.add(new ArrayList<>());
                    }
                }
            }
            for (int i4 = 0; i4 < aVar.c(); i4++) {
                String a3 = aVar.a(i4);
                ArrayList<String> arrayList11 = f8354b;
                if (!arrayList11.contains(a3)) {
                    arrayList11.add(a3);
                    f8357e.add(new ArrayList<>());
                }
            }
            i(context, bVar);
            if (bVar.a && bVar.e()) {
                bVar.f8368f = t0.c(bVar.f8371i, true);
                if (v0.g()) {
                    String e2 = e(context);
                    bVar.f8369g = e2;
                    if (e2 == null) {
                        bVar.f8369g = bVar.f8371i + "/Android/media/" + x0.f8405d.getPackageName();
                    }
                }
            }
            if (bVar.a) {
                bVar.f8366d = bVar.f8365c;
            }
        }
        return bVar;
    }

    public static synchronized b c(Context context, boolean z) {
        b b2;
        synchronized (p1.class) {
            b2 = b(context, new e.h.c.a(), z);
        }
        return b2;
    }

    public static String d(Context context, boolean z) {
        if (f8359g == null) {
            f8359g = new a(new p1());
        }
        Objects.requireNonNull(f8359g);
        try {
            File[] externalFilesDirs = context.getExternalFilesDirs(null);
            if (externalFilesDirs == null || externalFilesDirs.length <= 1 || externalFilesDirs[1] == null || externalFilesDirs[1].getAbsolutePath().length() <= 0) {
                s1.c("SF: System only reports one storage area, doing deeper dive");
                return null;
            }
            File file = externalFilesDirs[1];
            if (!a(context, file)) {
                s1.c("SF: Unable to validate storage area " + file);
                return null;
            }
            String absolutePath = externalFilesDirs[1].getAbsolutePath();
            f8362j = absolutePath;
            String[] split = absolutePath.split(Pattern.quote(File.separator));
            if (split.length > 4) {
                StringBuilder sb = new StringBuilder();
                int i2 = 0;
                while (i2 < split.length - 4) {
                    sb.append(split[i2]);
                    i2++;
                    if (i2 < split.length - 4) {
                        sb.append(File.separator);
                    }
                }
                return sb.toString();
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static String e(Context context) {
        if (f8359g == null) {
            f8359g = new a(new p1());
        }
        Objects.requireNonNull(f8359g);
        if (f8363k == null) {
            try {
                File[] externalMediaDirs = context.getExternalMediaDirs();
                if (externalMediaDirs != null && externalMediaDirs.length > 1 && externalMediaDirs[1] != null && externalMediaDirs[1].getAbsolutePath().length() > 0) {
                    File file = externalMediaDirs[1];
                    f8363k = externalMediaDirs[1].getAbsolutePath();
                }
            } catch (NullPointerException unused) {
            }
        }
        return f8363k;
    }

    public static void f() {
        if (f8354b.size() > 0) {
            int i2 = 0;
            Iterator<ArrayList<String>> it = f8357e.iterator();
            while (it.hasNext()) {
                ArrayList<String> next = it.next();
                if (next.size() <= 0 && i2 != 0 && next.size() > 0) {
                    String str = f8354b.get(i2);
                    String str2 = null;
                    Iterator<String> it2 = next.iterator();
                    while (it2.hasNext()) {
                        String next2 = it2.next();
                        if (next2.length() > 0 && next2.length() < str.length()) {
                            str = next2;
                            str2 = str;
                        }
                    }
                    if (str2 != null) {
                        ArrayList<String> arrayList = f8354b;
                        arrayList.get(i2);
                        int i3 = t1.a;
                        arrayList.get(i2);
                        arrayList.set(i2, str2);
                    }
                }
                i2++;
            }
        }
    }

    public static void g() {
        f8354b.add(j1.c().getAbsolutePath());
        try {
            File file = new File("/proc/mounts");
            if (file.exists()) {
                Scanner scanner = new Scanner(file);
                while (scanner.hasNext()) {
                    String nextLine = scanner.nextLine();
                    String[] split = nextLine.split(" ");
                    if (split.length <= 1) {
                        split = nextLine.split(SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
                    }
                    if (split.length > 1) {
                        if (nextLine.startsWith("/dev/block/vold/")) {
                            String replace = split[1].replace("\\040", " ");
                            ArrayList<String> arrayList = f8354b;
                            if (!arrayList.contains(replace)) {
                                arrayList.add(replace);
                            }
                        } else if (nextLine.startsWith("/dev/fuse")) {
                            String str = split[1];
                            ArrayList<String> arrayList2 = f8355c;
                            if (!arrayList2.contains(str)) {
                                arrayList2.add(str);
                            }
                        } else {
                            String str2 = split[0];
                            ArrayList<String> arrayList3 = f8354b;
                            if (arrayList3.contains(str2) || f8355c.contains(str2)) {
                                String str3 = split[1];
                                if (!arrayList3.contains(str3)) {
                                    arrayList3.add(str3);
                                }
                            }
                        }
                    }
                }
                scanner.close();
            }
        } catch (Exception e2) {
            s1.l(e2, true);
        }
    }

    public static void h() {
        File c2 = j1.c();
        if (c2 != null) {
            f8356d.add(c2.getAbsolutePath());
        }
        try {
            File file = new File("/system/etc/vold.fstab");
            if (file.exists()) {
                Scanner scanner = new Scanner(file);
                while (scanner.hasNext()) {
                    String nextLine = scanner.nextLine();
                    if (nextLine.startsWith("dev_mount")) {
                        String[] split = nextLine.split(" ");
                        if (split.length <= 2) {
                            split = nextLine.split(SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
                        }
                        if (split.length > 2) {
                            String str = split[2];
                            if (str.contains(":")) {
                                str = str.substring(0, str.indexOf(":"));
                            }
                            ArrayList<String> arrayList = f8356d;
                            if (!arrayList.contains(str)) {
                                arrayList.add(str);
                            }
                        }
                    }
                }
                scanner.close();
            }
        } catch (Exception e2) {
            s1.l(e2, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f6 A[LOOP:2: B:80:0x01f0->B:82:0x01f6, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void i(android.content.Context r11, e.h.g.p1.b r12) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.g.p1.i(android.content.Context, e.h.g.p1$b):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:6|(3:47|48|19)|10|11|12|(4:14|15|16|18)(5:23|24|(2:29|(4:31|32|33|34))|40|41)|19) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a4, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a5, code lost:
        r3 = r1;
        r1 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010f A[Catch: IllegalArgumentException -> 0x0197, TRY_ENTER, TryCatch #8 {IllegalArgumentException -> 0x0197, blocks: (B:50:0x00c5, B:52:0x00d2, B:54:0x00d8, B:62:0x00eb, B:72:0x010f, B:73:0x0125, B:96:0x0199), top: B:123:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0175 A[Catch: IllegalArgumentException -> 0x0195, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IllegalArgumentException -> 0x0195, blocks: (B:75:0x012d, B:77:0x0142, B:86:0x0175, B:80:0x0155), top: B:111:0x012d }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0199 A[Catch: IllegalArgumentException -> 0x0197, TRY_ENTER, TRY_LEAVE, TryCatch #8 {IllegalArgumentException -> 0x0197, blocks: (B:50:0x00c5, B:52:0x00d2, B:54:0x00d8, B:62:0x00eb, B:72:0x010f, B:73:0x0125, B:96:0x0199), top: B:123:0x00c5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void j(boolean r11) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.g.p1.j(boolean):void");
    }
}
