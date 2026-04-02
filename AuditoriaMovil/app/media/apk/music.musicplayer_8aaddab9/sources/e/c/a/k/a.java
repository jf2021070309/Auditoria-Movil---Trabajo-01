package e.c.a.k;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import ch.qos.logback.core.CoreConstants;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class a implements Closeable {
    public final File a;

    /* renamed from: b  reason: collision with root package name */
    public final File f5490b;

    /* renamed from: c  reason: collision with root package name */
    public final File f5491c;

    /* renamed from: d  reason: collision with root package name */
    public final File f5492d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5493e;

    /* renamed from: f  reason: collision with root package name */
    public long f5494f;

    /* renamed from: g  reason: collision with root package name */
    public final int f5495g;

    /* renamed from: i  reason: collision with root package name */
    public Writer f5497i;

    /* renamed from: k  reason: collision with root package name */
    public int f5499k;

    /* renamed from: h  reason: collision with root package name */
    public long f5496h = 0;

    /* renamed from: j  reason: collision with root package name */
    public final LinkedHashMap<String, d> f5498j = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: l  reason: collision with root package name */
    public long f5500l = 0;

    /* renamed from: m  reason: collision with root package name */
    public final ThreadPoolExecutor f5501m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));

    /* renamed from: n  reason: collision with root package name */
    public final Callable<Void> f5502n = new CallableC0110a();

    /* renamed from: e.c.a.k.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class CallableC0110a implements Callable<Void> {
        public CallableC0110a() {
        }

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            synchronized (a.this) {
                a aVar = a.this;
                if (aVar.f5497i == null) {
                    return null;
                }
                aVar.M();
                if (a.this.v()) {
                    a.this.I();
                    a.this.f5499k = 0;
                }
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements ThreadFactory {
        public b(CallableC0110a callableC0110a) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* loaded from: classes.dex */
    public final class c {
        public final d a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f5503b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f5504c;

        public c(d dVar, CallableC0110a callableC0110a) {
            this.a = dVar;
            this.f5503b = dVar.f5509e ? null : new boolean[a.this.f5495g];
        }

        public void a() throws IOException {
            a.a(a.this, this, false);
        }

        public File b(int i2) throws IOException {
            File file;
            synchronized (a.this) {
                d dVar = this.a;
                if (dVar.f5510f != this) {
                    throw new IllegalStateException();
                }
                if (!dVar.f5509e) {
                    this.f5503b[i2] = true;
                }
                file = dVar.f5508d[i2];
                if (!a.this.a.exists()) {
                    a.this.a.mkdirs();
                }
            }
            return file;
        }
    }

    /* loaded from: classes.dex */
    public final class d {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f5506b;

        /* renamed from: c  reason: collision with root package name */
        public File[] f5507c;

        /* renamed from: d  reason: collision with root package name */
        public File[] f5508d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f5509e;

        /* renamed from: f  reason: collision with root package name */
        public c f5510f;

        /* renamed from: g  reason: collision with root package name */
        public long f5511g;

        public d(String str, CallableC0110a callableC0110a) {
            this.a = str;
            int i2 = a.this.f5495g;
            this.f5506b = new long[i2];
            this.f5507c = new File[i2];
            this.f5508d = new File[i2];
            StringBuilder sb = new StringBuilder(str);
            sb.append(CoreConstants.DOT);
            int length = sb.length();
            for (int i3 = 0; i3 < a.this.f5495g; i3++) {
                sb.append(i3);
                this.f5507c[i3] = new File(a.this.a, sb.toString());
                sb.append(".tmp");
                this.f5508d[i3] = new File(a.this.a, sb.toString());
                sb.setLength(length);
            }
        }

        public String a() throws IOException {
            long[] jArr;
            StringBuilder sb = new StringBuilder();
            for (long j2 : this.f5506b) {
                sb.append(' ');
                sb.append(j2);
            }
            return sb.toString();
        }

        public final IOException b(String[] strArr) throws IOException {
            StringBuilder y = e.a.d.a.a.y("unexpected journal line: ");
            y.append(Arrays.toString(strArr));
            throw new IOException(y.toString());
        }
    }

    /* loaded from: classes.dex */
    public final class e {
        public final File[] a;

        public e(a aVar, String str, long j2, File[] fileArr, long[] jArr, CallableC0110a callableC0110a) {
            this.a = fileArr;
        }
    }

    public a(File file, int i2, int i3, long j2) {
        this.a = file;
        this.f5493e = i2;
        this.f5490b = new File(file, "journal");
        this.f5491c = new File(file, "journal.tmp");
        this.f5492d = new File(file, "journal.bkp");
        this.f5495g = i3;
        this.f5494f = j2;
    }

    public static void K(File file, File file2, boolean z) throws IOException {
        if (z) {
            i(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static void a(a aVar, c cVar, boolean z) throws IOException {
        synchronized (aVar) {
            d dVar = cVar.a;
            if (dVar.f5510f != cVar) {
                throw new IllegalStateException();
            }
            if (z && !dVar.f5509e) {
                for (int i2 = 0; i2 < aVar.f5495g; i2++) {
                    if (!cVar.f5503b[i2]) {
                        cVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                    } else if (!dVar.f5508d[i2].exists()) {
                        cVar.a();
                        return;
                    }
                }
            }
            for (int i3 = 0; i3 < aVar.f5495g; i3++) {
                File file = dVar.f5508d[i3];
                if (!z) {
                    i(file);
                } else if (file.exists()) {
                    File file2 = dVar.f5507c[i3];
                    file.renameTo(file2);
                    long j2 = dVar.f5506b[i3];
                    long length = file2.length();
                    dVar.f5506b[i3] = length;
                    aVar.f5496h = (aVar.f5496h - j2) + length;
                }
            }
            aVar.f5499k++;
            dVar.f5510f = null;
            if (dVar.f5509e || z) {
                dVar.f5509e = true;
                aVar.f5497i.append((CharSequence) "CLEAN");
                aVar.f5497i.append(' ');
                aVar.f5497i.append((CharSequence) dVar.a);
                aVar.f5497i.append((CharSequence) dVar.a());
                aVar.f5497i.append('\n');
                if (z) {
                    long j3 = aVar.f5500l;
                    aVar.f5500l = 1 + j3;
                    dVar.f5511g = j3;
                }
            } else {
                aVar.f5498j.remove(dVar.a);
                aVar.f5497i.append((CharSequence) "REMOVE");
                aVar.f5497i.append(' ');
                aVar.f5497i.append((CharSequence) dVar.a);
                aVar.f5497i.append('\n');
            }
            r(aVar.f5497i);
            if (aVar.f5496h > aVar.f5494f || aVar.v()) {
                aVar.f5501m.submit(aVar.f5502n);
            }
        }
    }

    @TargetApi(26)
    public static void h(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void i(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    public static void r(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static a y(File file, int i2, int i3, long j2) throws IOException {
        if (j2 > 0) {
            if (i3 > 0) {
                File file2 = new File(file, "journal.bkp");
                if (file2.exists()) {
                    File file3 = new File(file, "journal");
                    if (file3.exists()) {
                        file2.delete();
                    } else {
                        K(file2, file3, false);
                    }
                }
                a aVar = new a(file, i2, i3, j2);
                if (aVar.f5490b.exists()) {
                    try {
                        aVar.B();
                        aVar.z();
                        return aVar;
                    } catch (IOException e2) {
                        PrintStream printStream = System.out;
                        printStream.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                        aVar.close();
                        e.c.a.k.c.a(aVar.a);
                    }
                }
                file.mkdirs();
                a aVar2 = new a(file, i2, i3, j2);
                aVar2.I();
                return aVar2;
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final void B() throws IOException {
        e.c.a.k.b bVar = new e.c.a.k.b(new FileInputStream(this.f5490b), e.c.a.k.c.a);
        try {
            String f2 = bVar.f();
            String f3 = bVar.f();
            String f4 = bVar.f();
            String f5 = bVar.f();
            String f6 = bVar.f();
            if (!"libcore.io.DiskLruCache".equals(f2) || !"1".equals(f3) || !Integer.toString(this.f5493e).equals(f4) || !Integer.toString(this.f5495g).equals(f5) || !"".equals(f6)) {
                throw new IOException("unexpected journal header: [" + f2 + ", " + f3 + ", " + f5 + ", " + f6 + "]");
            }
            int i2 = 0;
            while (true) {
                try {
                    H(bVar.f());
                    i2++;
                } catch (EOFException unused) {
                    this.f5499k = i2 - this.f5498j.size();
                    if (bVar.f5516e == -1) {
                        I();
                    } else {
                        this.f5497i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f5490b, true), e.c.a.k.c.a));
                    }
                    try {
                        bVar.close();
                        return;
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                bVar.close();
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void H(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new IOException(e.a.d.a.a.k("unexpected journal line: ", str));
        }
        int i2 = indexOf + 1;
        int indexOf2 = str.indexOf(32, i2);
        if (indexOf2 == -1) {
            substring = str.substring(i2);
            if (indexOf == 6 && str.startsWith("REMOVE")) {
                this.f5498j.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i2, indexOf2);
        }
        d dVar = this.f5498j.get(substring);
        if (dVar == null) {
            dVar = new d(substring, null);
            this.f5498j.put(substring, dVar);
        }
        if (indexOf2 == -1 || indexOf != 5 || !str.startsWith("CLEAN")) {
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f5510f = new c(dVar, null);
                return;
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException(e.a.d.a.a.k("unexpected journal line: ", str));
            } else {
                return;
            }
        }
        String[] split = str.substring(indexOf2 + 1).split(" ");
        dVar.f5509e = true;
        dVar.f5510f = null;
        if (split.length != a.this.f5495g) {
            dVar.b(split);
            throw null;
        }
        for (int i3 = 0; i3 < split.length; i3++) {
            try {
                dVar.f5506b[i3] = Long.parseLong(split[i3]);
            } catch (NumberFormatException unused) {
                dVar.b(split);
                throw null;
            }
        }
    }

    public final synchronized void I() throws IOException {
        Writer writer = this.f5497i;
        if (writer != null) {
            h(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f5491c), e.c.a.k.c.a));
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f5493e));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f5495g));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (d dVar : this.f5498j.values()) {
            if (dVar.f5510f != null) {
                bufferedWriter.write("DIRTY " + dVar.a + '\n');
            } else {
                bufferedWriter.write("CLEAN " + dVar.a + dVar.a() + '\n');
            }
        }
        h(bufferedWriter);
        if (this.f5490b.exists()) {
            K(this.f5490b, this.f5492d, true);
        }
        K(this.f5491c, this.f5490b, false);
        this.f5492d.delete();
        this.f5497i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f5490b, true), e.c.a.k.c.a));
    }

    public final void M() throws IOException {
        while (this.f5496h > this.f5494f) {
            String key = this.f5498j.entrySet().iterator().next().getKey();
            synchronized (this) {
                f();
                d dVar = this.f5498j.get(key);
                if (dVar != null && dVar.f5510f == null) {
                    for (int i2 = 0; i2 < this.f5495g; i2++) {
                        File file = dVar.f5507c[i2];
                        if (file.exists() && !file.delete()) {
                            throw new IOException("failed to delete " + file);
                        }
                        long j2 = this.f5496h;
                        long[] jArr = dVar.f5506b;
                        this.f5496h = j2 - jArr[i2];
                        jArr[i2] = 0;
                    }
                    this.f5499k++;
                    this.f5497i.append((CharSequence) "REMOVE");
                    this.f5497i.append(' ');
                    this.f5497i.append((CharSequence) key);
                    this.f5497i.append('\n');
                    this.f5498j.remove(key);
                    if (v()) {
                        this.f5501m.submit(this.f5502n);
                    }
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.f5497i == null) {
            return;
        }
        Iterator it = new ArrayList(this.f5498j.values()).iterator();
        while (it.hasNext()) {
            c cVar = ((d) it.next()).f5510f;
            if (cVar != null) {
                cVar.a();
            }
        }
        M();
        h(this.f5497i);
        this.f5497i = null;
    }

    public final void f() {
        if (this.f5497i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public c m(String str) throws IOException {
        synchronized (this) {
            f();
            d dVar = this.f5498j.get(str);
            if (dVar == null) {
                dVar = new d(str, null);
                this.f5498j.put(str, dVar);
            } else if (dVar.f5510f != null) {
                return null;
            }
            c cVar = new c(dVar, null);
            dVar.f5510f = cVar;
            this.f5497i.append((CharSequence) "DIRTY");
            this.f5497i.append(' ');
            this.f5497i.append((CharSequence) str);
            this.f5497i.append('\n');
            r(this.f5497i);
            return cVar;
        }
    }

    public synchronized e u(String str) throws IOException {
        f();
        d dVar = this.f5498j.get(str);
        if (dVar == null) {
            return null;
        }
        if (dVar.f5509e) {
            for (File file : dVar.f5507c) {
                if (!file.exists()) {
                    return null;
                }
            }
            this.f5499k++;
            this.f5497i.append((CharSequence) "READ");
            this.f5497i.append(' ');
            this.f5497i.append((CharSequence) str);
            this.f5497i.append('\n');
            if (v()) {
                this.f5501m.submit(this.f5502n);
            }
            return new e(this, str, dVar.f5511g, dVar.f5507c, dVar.f5506b, null);
        }
        return null;
    }

    public final boolean v() {
        int i2 = this.f5499k;
        return i2 >= 2000 && i2 >= this.f5498j.size();
    }

    public final void z() throws IOException {
        i(this.f5491c);
        Iterator<d> it = this.f5498j.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i2 = 0;
            if (next.f5510f == null) {
                while (i2 < this.f5495g) {
                    this.f5496h += next.f5506b[i2];
                    i2++;
                }
            } else {
                next.f5510f = null;
                while (i2 < this.f5495g) {
                    i(next.f5507c[i2]);
                    i(next.f5508d[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }
}
