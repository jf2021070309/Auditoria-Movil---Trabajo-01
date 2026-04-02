package e.h.g;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.provider.DocumentsContract;
import com.google.android.gms.common.api.CommonStatusCodes;
import e.a.c.y6;
import e.h.g.j0;
import e.h.g.q0;
import e.h.g.r0;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public class q0 {

    /* renamed from: b  reason: collision with root package name */
    public static b f8373b;
    public static long a = TimeUnit.SECONDS.toMillis(60);

    /* renamed from: c  reason: collision with root package name */
    public static final ReentrantLock f8374c = new ReentrantLock(true);

    /* loaded from: classes.dex */
    public interface a {
        void a(boolean z);
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    public static boolean a(final File file) {
        y0 y0Var = new y0(f8374c);
        boolean z = false;
        if (file != null) {
            try {
                if (j(file)) {
                    e.h.g.p0.a aVar = null;
                    try {
                        aVar = l(file);
                    } catch (FileNotFoundException unused) {
                    }
                    if (aVar != null) {
                        z = aVar.a();
                        if (z) {
                            z = !file.exists();
                            if (!z) {
                                z = r0.d(new r0.a() { // from class: e.h.g.k
                                    @Override // e.h.g.r0.a
                                    public final boolean a() {
                                        boolean z2 = !file.exists();
                                        if (!z2) {
                                            int i2 = t1.a;
                                        }
                                        return z2;
                                    }
                                });
                            }
                            if (!z) {
                                file.getAbsolutePath();
                                int i2 = t1.a;
                            }
                        }
                    } else {
                        file.getAbsolutePath();
                        int i3 = t1.a;
                    }
                } else {
                    int i4 = t1.a;
                    z = true;
                }
            } catch (Throwable th) {
                try {
                    y0Var.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        y0Var.close();
        return z;
    }

    public static boolean b(File file) {
        String b2;
        e.h.g.p0.a a2;
        e.h.g.p0.a g2;
        boolean z = false;
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return true;
        }
        y0 y0Var = new y0(f8374c);
        try {
            file.getAbsolutePath();
            int i2 = t1.a;
            if (f8373b != null && o(file) && (b2 = ((y6.a) f8373b).b(file)) != null && file.getAbsolutePath().startsWith(b2) && (a2 = ((y6.a) f8373b).a(file)) != null && (g2 = g(a2, file)) != null) {
                z = g2.b();
            }
            y0Var.close();
            return z;
        } catch (Throwable th) {
            try {
                y0Var.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
        if (r1.length() == 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String c(e.h.g.p0.a r10) {
        /*
            e.h.g.y0 r0 = new e.h.g.y0
            java.util.concurrent.locks.ReentrantLock r1 = e.h.g.q0.f8374c
            r0.<init>(r1)
            java.lang.String r1 = r10.f()     // Catch: java.lang.Throwable -> L61
            if (r1 == 0) goto L13
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L61
            if (r2 != 0) goto L3e
        L13:
            e.h.g.r0 r2 = new e.h.g.r0     // Catch: java.lang.Throwable -> L61
            r2.<init>()     // Catch: java.lang.Throwable -> L61
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L61
        L1c:
            r5 = 50
            e.h.g.j1.n(r5, r2)     // Catch: java.lang.Throwable -> L61
            java.lang.String r1 = r10.f()     // Catch: java.lang.Throwable -> L26
            goto L27
        L26:
        L27:
            if (r1 == 0) goto L2f
            int r5 = r1.length()     // Catch: java.lang.Throwable -> L61
            if (r5 != 0) goto L3e
        L2f:
            long r5 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L61
            long r5 = r5 - r3
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r5 = r5 / r7
            long r7 = e.h.g.q0.a     // Catch: java.lang.Throwable -> L61
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 < 0) goto L1c
        L3e:
            if (r1 == 0) goto L46
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L61
            if (r2 != 0) goto L5d
        L46:
            android.net.Uri r10 = r10.g()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r10 = android.net.Uri.decode(r10)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = "\\/"
            java.lang.String[] r10 = r10.split(r2)     // Catch: java.lang.Throwable -> L5d
            int r2 = r10.length     // Catch: java.lang.Throwable -> L5d
            int r2 = r2 + (-1)
            r1 = r10[r2]     // Catch: java.lang.Throwable -> L5d
        L5d:
            r0.close()
            return r1
        L61:
            r10 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L66
            goto L6a
        L66:
            r0 = move-exception
            r10.addSuppressed(r0)
        L6a:
            goto L6c
        L6b:
            throw r10
        L6c:
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.g.q0.c(e.h.g.p0.a):java.lang.String");
    }

    public static BufferedOutputStream d(File file, int i2) throws IOException {
        BufferedOutputStream bufferedOutputStream;
        y0 y0Var = new y0(f8374c);
        try {
            BufferedOutputStream bufferedOutputStream2 = null;
            if (o(file)) {
                Object obj = j1.a;
                file.getAbsolutePath();
                int i3 = t1.a;
                e.h.g.p0.a l2 = l(file);
                if (file.exists() && l2 != null) {
                    boolean z = true;
                    if (!l2.b()) {
                        r0 r0Var = new r0();
                        long nanoTime = System.nanoTime();
                        while (true) {
                            j1.n(1000, r0Var);
                            if (!l2.b()) {
                                if ((System.nanoTime() - nanoTime) / 1000000 >= a) {
                                    z = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (z) {
                        String k2 = k(i2);
                        try {
                            try {
                                bufferedOutputStream = new BufferedOutputStream(x0.f8405d.getContentResolver().openOutputStream(l2.g(), k2));
                            } catch (IllegalArgumentException unused) {
                                e.h.g.p0.a g2 = g(((y6.a) f8373b).a(file), file);
                                if (file.exists()) {
                                    bufferedOutputStream2 = new BufferedOutputStream(x0.f8405d.getContentResolver().openOutputStream(g2.g(), k2));
                                }
                            }
                        } catch (IllegalArgumentException unused2) {
                            e.h.g.p0.a l3 = l(file);
                            if (file.exists()) {
                                bufferedOutputStream = new BufferedOutputStream(x0.f8405d.getContentResolver().openOutputStream(l3.g(), k2));
                            } else {
                                String str = "don't bother with trying to open stream for non-existing file = " + file;
                            }
                        }
                        bufferedOutputStream2 = bufferedOutputStream;
                    }
                } else if (file.exists()) {
                    String str2 = "Failed to find document file = " + file;
                }
            }
            if (bufferedOutputStream2 != null) {
                y0Var.close();
                return bufferedOutputStream2;
            }
            BufferedOutputStream m2 = m(file, i2);
            y0Var.close();
            return m2;
        } catch (Throwable th) {
            try {
                y0Var.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static boolean e(File file) {
        y0 y0Var = new y0(f8374c);
        Boolean bool = null;
        try {
            if (!o(file)) {
                bool = Boolean.valueOf(file.isDirectory());
            } else if (j(file)) {
                try {
                    e.h.g.p0.a l2 = l(file);
                    if (l2 != null) {
                        bool = Boolean.valueOf(l2.h());
                    }
                } catch (FileNotFoundException unused) {
                }
            } else {
                bool = Boolean.FALSE;
            }
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            y0Var.close();
            return booleanValue;
        } catch (Throwable th) {
            try {
                y0Var.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long f(File file) {
        y0 y0Var = new y0(f8374c);
        long j2 = -1;
        try {
            if (j(file)) {
                if (o(file)) {
                    try {
                        e.h.g.p0.a l2 = l(file);
                        if (l2 != null) {
                            j2 = l2.i();
                        }
                    } catch (FileNotFoundException unused) {
                    }
                }
                if (j2 < 0) {
                    j2 = file.length();
                }
            }
            y0Var.close();
            return j2;
        } catch (Throwable th) {
            try {
                y0Var.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static e.h.g.p0.a g(e.h.g.p0.a aVar, File file) {
        if ((v0.e() || file.exists()) && f8373b != null) {
            Uri g2 = aVar.g();
            String str = "baseUri = " + g2;
            int i2 = t1.a;
            String replace = file.getAbsolutePath().replace(((y6.a) f8373b).b(file), "");
            if (replace.startsWith("/")) {
                replace = replace.substring(1);
            }
            String encode = Uri.encode(replace);
            if (!g2.toString().endsWith("%2F") && !g2.toString().endsWith("%3A")) {
                encode = e.a.d.a.a.k("%2F", encode);
            }
            Uri parse = Uri.parse(g2.toString() + encode);
            if (DocumentsContract.isDocumentUri(x0.f8405d, parse)) {
                e.h.g.p0.a d2 = e.h.g.p0.a.d(x0.f8405d, parse);
                StringBuilder y = e.a.d.a.a.y("dFile = ");
                y.append(d2.g());
                y.toString();
                return d2;
            }
        }
        return null;
    }

    @TargetApi(CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
    public static Uri h(File file) throws FileNotFoundException {
        final e.h.g.p0.a l2;
        String str = "create document file dir = " + file;
        int i2 = t1.a;
        Uri uri = null;
        if (j(file)) {
            file.getAbsolutePath();
            e.h.g.p0.a l3 = l(file);
            if (l3 != null && l3.b()) {
                uri = l3.g();
            }
            if (uri == null) {
                file.getAbsolutePath();
            }
        } else {
            File parentFile = file.getParentFile();
            if (parentFile != null && !j(parentFile) && h(parentFile) == null) {
                parentFile.getAbsolutePath();
                return null;
            } else if (j(parentFile) && !j(file) && (l2 = l(parentFile)) != null) {
                StringBuilder y = e.a.d.a.a.y("Create folder directory ");
                y.append(l2.g());
                y.append(" + ");
                y.append(file.getName());
                y.toString();
                uri = DocumentsContract.createDocument(x0.f8405d.getContentResolver(), l2.g(), "vnd.android.document/directory", file.getName());
                if (r0.d(new r0.a() { // from class: e.h.g.i
                    @Override // e.h.g.r0.a
                    public final boolean a() {
                        boolean b2 = e.h.g.p0.a.this.b();
                        if (!b2) {
                            int i3 = t1.a;
                        }
                        return b2;
                    }
                }) && uri != null) {
                    file.getAbsolutePath();
                } else if (file.exists()) {
                    file.getAbsolutePath();
                } else {
                    file.getAbsolutePath();
                }
            }
        }
        return uri;
    }

    public static boolean i(File file) {
        boolean z = false;
        if (o(file)) {
            try {
                z = a(file);
            } catch (IllegalStateException | SecurityException unused) {
                r0 r0Var = new r0();
                long nanoTime = System.nanoTime();
                boolean z2 = false;
                do {
                    j1.n(50, r0Var);
                    try {
                        z2 = a(file);
                        z = true;
                    } catch (Throwable unused2) {
                    }
                    if (z) {
                        break;
                    }
                } while ((System.nanoTime() - nanoTime) / 1000000 < a);
                z = z2;
            }
            if (!z) {
                z = a(file);
            }
        }
        return !z ? file.delete() : z;
    }

    public static boolean j(File file) {
        try {
            return b(file);
        } catch (IllegalStateException | SecurityException unused) {
            r0 r0Var = new r0();
            long nanoTime = System.nanoTime();
            do {
                j1.n(50, r0Var);
                try {
                    return b(file);
                } catch (Throwable unused2) {
                    if ((System.nanoTime() - nanoTime) / 1000000 < a) {
                        return b(file);
                    }
                }
            } while ((System.nanoTime() - nanoTime) / 1000000 < a);
            return b(file);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:9:0x0013
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static java.lang.String k(int r3) {
        /*
            e.h.g.y0 r0 = new e.h.g.y0
            java.util.concurrent.locks.ReentrantLock r1 = e.h.g.q0.f8374c
            r0.<init>(r1)
            java.lang.String r1 = "w"
            r2 = 1
            if (r3 == r2) goto Ld
            goto Lf
        Ld:
            java.lang.String r1 = "wa"
        Lf:
            r0.close()
            return r1
        L13:
            r3 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L18
            goto L1c
        L18:
            r0 = move-exception
            r3.addSuppressed(r0)
        L1c:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.g.q0.k(int):java.lang.String");
    }

    @TargetApi(CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
    public static e.h.g.p0.a l(final File file) throws FileNotFoundException {
        String b2;
        y0 y0Var = new y0(f8374c);
        e.h.g.p0.a aVar = null;
        try {
            file.getAbsolutePath();
            int i2 = t1.a;
            if (f8373b != null && o(file) && (b2 = ((y6.a) f8373b).b(file)) != null) {
                if (b2.endsWith("/")) {
                    b2 = b2.substring(0, b2.length() - 1);
                }
                String absolutePath = file.getAbsolutePath();
                if (absolutePath.startsWith(b2)) {
                    e.h.g.p0.a a2 = ((y6.a) f8373b).a(file);
                    if (absolutePath.equals(b2)) {
                        y0Var.close();
                        return a2;
                    } else if (a2 != null) {
                        if (j(file)) {
                            e.h.g.p0.a g2 = g(a2, file);
                            if (g2 != null) {
                                String str = "returning " + g2.g();
                                y0Var.close();
                                return g2;
                            }
                        } else {
                            file.getAbsolutePath();
                            Uri h2 = h(file.getParentFile());
                            if (h2 != null) {
                                h2.toString();
                                file.getName();
                                final Uri createDocument = DocumentsContract.createDocument(x0.f8405d.getContentResolver(), h2, "", file.getName());
                                if (r0.d(new r0.a() { // from class: e.h.g.h
                                    @Override // e.h.g.r0.a
                                    public final boolean a() {
                                        boolean z = q0.j(file) && e.h.g.p0.a.d(x0.f8405d, createDocument).b();
                                        if (!z) {
                                            int i3 = t1.a;
                                        }
                                        return z;
                                    }
                                }) && createDocument != null) {
                                    e.h.g.p0.a d2 = e.h.g.p0.a.d(x0.f8405d, createDocument);
                                    if (d2.b()) {
                                        d2.g().toString();
                                        y0Var.close();
                                        return d2;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    aVar = e.h.g.p0.a.c(file);
                }
            }
            y0Var.close();
            return aVar;
        } catch (Throwable th) {
            try {
                y0Var.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static synchronized BufferedOutputStream m(File file, int i2) throws IOException {
        BufferedOutputStream bufferedOutputStream;
        synchronized (q0.class) {
            File parentFile = file.getParentFile();
            boolean j2 = j(parentFile);
            bufferedOutputStream = null;
            FileNotFoundException e2 = null;
            int i3 = 0;
            while (true) {
                if (i3 < 2) {
                    if (file.exists() && i2 == 0 && i3 == 0) {
                        t0.a(file, false);
                    }
                    boolean z = true;
                    if (!j2) {
                        try {
                            if (parentFile.mkdirs()) {
                                j2 = true;
                            } else if (parentFile.getParentFile().canWrite()) {
                                parentFile.mkdir();
                            } else {
                                parentFile.getParentFile().setWritable(true);
                                parentFile.mkdirs();
                            }
                        } catch (FileNotFoundException e3) {
                            e2 = e3;
                            Thread.sleep(100L);
                        } catch (IOException e4) {
                            e2 = e4;
                            try {
                                Thread.sleep(100L);
                            } catch (InterruptedException unused) {
                            }
                        }
                    }
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    if (i2 != 1) {
                        z = false;
                    }
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file, z));
                    break;
                }
                break;
                i3++;
            }
            if (bufferedOutputStream == null) {
                if (e2 instanceof FileNotFoundException) {
                    throw e2;
                }
                if (e2 instanceof IOException) {
                    throw e2;
                }
            }
        }
        return bufferedOutputStream;
    }

    public static String n(e.h.g.p0.a aVar) {
        try {
            return c(aVar);
        } catch (IllegalStateException | SecurityException unused) {
            r0 r0Var = new r0();
            long nanoTime = System.nanoTime();
            do {
                j1.n(50, r0Var);
                try {
                    return c(aVar);
                } catch (Throwable unused2) {
                    if ((System.nanoTime() - nanoTime) / 1000000 < a) {
                        return c(aVar);
                    }
                }
            } while ((System.nanoTime() - nanoTime) / 1000000 < a);
            return c(aVar);
        }
    }

    public static boolean o(File file) {
        b bVar = f8373b;
        if (bVar == null) {
            return false;
        }
        return ((y6.a) bVar).c(file);
    }

    public static boolean p(File file) {
        try {
            return e(file);
        } catch (IllegalStateException | SecurityException unused) {
            r0 r0Var = new r0();
            long nanoTime = System.nanoTime();
            do {
                j1.n(50, r0Var);
                try {
                    return e(file);
                } catch (Throwable unused2) {
                    if ((System.nanoTime() - nanoTime) / 1000000 < a) {
                        return e(file);
                    }
                }
            } while ((System.nanoTime() - nanoTime) / 1000000 < a);
            return e(file);
        }
    }

    public static long q(File file) {
        try {
            return f(file);
        } catch (IllegalStateException | SecurityException unused) {
            r0 r0Var = new r0();
            long nanoTime = System.nanoTime();
            do {
                j1.n(50, r0Var);
                try {
                    return f(file);
                } catch (Throwable unused2) {
                    if ((System.nanoTime() - nanoTime) / 1000000 < a) {
                        return f(file);
                    }
                }
            } while ((System.nanoTime() - nanoTime) / 1000000 < a);
            return f(file);
        }
    }

    public static File[] r(File file) {
        b bVar;
        y0 y0Var = new y0(f8374c);
        try {
            File[] fileArr = null;
            if (p(file)) {
                if (o(file) && j(file) && (bVar = f8373b) != null) {
                    e.h.g.p0.a a2 = ((y6.a) bVar).a(file);
                    String b2 = ((y6.a) f8373b).b(file);
                    if (b2 != null && a2 != null) {
                        String path = file.getPath();
                        int i2 = 0;
                        if (b2.endsWith("/")) {
                            b2 = b2.substring(0, b2.length() - 1);
                        }
                        if (path.startsWith(b2) && path.length() == b2.length()) {
                            e.h.g.p0.a[] j2 = a2.j();
                            fileArr = new File[j2.length];
                            int length = j2.length;
                            int i3 = 0;
                            while (i2 < length) {
                                fileArr[i3] = new File(file, n(j2[i2]));
                                i3++;
                                i2++;
                            }
                        } else {
                            e.h.g.p0.a aVar = null;
                            while (aVar == null && a2 != null) {
                                e.h.g.p0.a[] j3 = a2.j();
                                if (j3 != null && j3.length > 0) {
                                    for (e.h.g.p0.a aVar2 : j3) {
                                        String str = b2 + "/" + n(aVar2);
                                        if (path.equals(str)) {
                                            a2 = null;
                                            aVar = aVar2;
                                            break;
                                        } else if (path.startsWith(str)) {
                                            a2 = aVar2;
                                            b2 = str;
                                            break;
                                        }
                                    }
                                }
                                a2 = null;
                            }
                            if (aVar != null) {
                                e.h.g.p0.a[] j4 = aVar.j();
                                fileArr = new File[j4.length];
                                int length2 = j4.length;
                                int i4 = 0;
                                while (i2 < length2) {
                                    fileArr[i4] = new File(file, n(j4[i2]));
                                    i4++;
                                    i2++;
                                }
                            }
                        }
                    }
                }
                if (fileArr == null) {
                    fileArr = file.listFiles();
                }
            }
            y0Var.close();
            return fileArr;
        } finally {
            try {
                y0Var.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
    }

    public static void s(final Activity activity, final int i2, final Intent intent, final a aVar) {
        j0.g(new j0.b() { // from class: e.h.g.j
            @Override // e.h.g.j0.b
            public final void a() {
                Activity activity2 = activity;
                int i3 = i2;
                Intent intent2 = intent;
                q0.a aVar2 = aVar;
                if (activity2 != null) {
                    ((y6.a) q0.f8373b).d(activity2, i3, intent2, aVar2);
                } else if (aVar2 != null) {
                    aVar2.a(false);
                }
            }
        });
    }
}
