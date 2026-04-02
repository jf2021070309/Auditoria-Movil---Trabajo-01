package com.fyber.inneractive.sdk.player.a;

import com.fyber.inneractive.sdk.util.IAlog;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c implements Closeable {
    static final Pattern a = Pattern.compile("[a-z0-9_-]{1,120}");
    private static final OutputStream q = new OutputStream() { // from class: com.fyber.inneractive.sdk.player.a.c.2
        @Override // java.io.OutputStream
        public final void write(int i) throws IOException {
        }
    };
    InterfaceC0048c c;
    private final File e;
    private final File f;
    private final File g;
    private final File h;
    private Writer m;
    private int n;
    private long l = 0;
    final LinkedHashMap<String, b> b = new LinkedHashMap<>(0, 0.75f, true);
    private long o = 0;
    final ThreadPoolExecutor d = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    private final Callable<Void> p = new Callable<Void>() { // from class: com.fyber.inneractive.sdk.player.a.c.1
        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            synchronized (c.this) {
                if (c.this.m == null) {
                    return null;
                }
                c.this.j();
                if (c.this.i()) {
                    c.this.h();
                    c.e(c.this);
                }
                return null;
            }
        }
    };
    private final int i = 0;
    private final int k = 1;
    private long j = 52428800;

    /* renamed from: com.fyber.inneractive.sdk.player.a.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0048c {
        boolean a(String str);
    }

    static /* synthetic */ int e(c cVar) {
        cVar.n = 0;
        return 0;
    }

    private c(File file) {
        this.e = file;
        this.f = new File(file, "journal");
        this.g = new File(file, "journal.tmp");
        this.h = new File(file, "journal.bkp");
    }

    public static c a(File file) throws IOException {
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                a(file2, file3, false);
            }
        }
        c cVar = new c(file);
        if (cVar.f.exists()) {
            try {
                cVar.f();
                cVar.g();
                return cVar;
            } catch (IOException e) {
                PrintStream printStream = System.out;
                printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                cVar.d();
            }
        }
        file.mkdirs();
        c cVar2 = new c(file);
        cVar2.h();
        return cVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f3, code lost:
        throw new java.io.IOException("unexpected journal line: " + r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void f() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.a.c.f():void");
    }

    private void g() throws IOException {
        b(this.g);
        Iterator<b> it = this.b.values().iterator();
        while (it.hasNext()) {
            b next = it.next();
            int i = 0;
            if (next.d == null) {
                while (i < this.k) {
                    this.l += next.b[i];
                    i++;
                }
            } else {
                next.d = null;
                while (i < this.k) {
                    b(next.a(i));
                    b(next.b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void h() throws IOException {
        if (this.m != null) {
            this.m.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.g), m.a));
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.i));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.k));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (b bVar : this.b.values()) {
            if (bVar.d != null) {
                bufferedWriter.write("DIRTY " + bVar.a + '\n');
            } else {
                bufferedWriter.write("CLEAN " + bVar.a + bVar.a() + '\n');
            }
        }
        bufferedWriter.close();
        if (this.f.exists()) {
            a(this.f, this.h, true);
        }
        a(this.g, this.f, false);
        this.h.delete();
        this.m = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f, true), m.a));
    }

    private static void b(File file) throws IOException {
        IAlog.a("DiskLruCache deleteIfExists - %s", file);
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void a(File file, File file2, boolean z) throws IOException {
        if (z) {
            b(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public final synchronized d a(String str) throws IOException {
        b();
        e(str);
        b bVar = this.b.get(str);
        if (bVar == null) {
            return null;
        }
        if (bVar.c) {
            InputStream[] inputStreamArr = new InputStream[this.k];
            for (int i = 0; i < this.k; i++) {
                try {
                    inputStreamArr[i] = new FileInputStream(bVar.a(i));
                } catch (FileNotFoundException unused) {
                    for (int i2 = 0; i2 < this.k && inputStreamArr[i2] != null; i2++) {
                        m.a(inputStreamArr[i2]);
                    }
                    return null;
                }
            }
            this.n++;
            this.m.append((CharSequence) ("READ " + str + '\n'));
            if (i()) {
                this.d.submit(this.p);
            }
            return new d(this, str, bVar.e, inputStreamArr, bVar.b, (byte) 0);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File b(String str) {
        b();
        e(str);
        b bVar = this.b.get(str);
        if (bVar == null) {
            return null;
        }
        return bVar.a(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized a c(String str) throws IOException {
        b();
        e(str);
        b bVar = this.b.get(str);
        if (bVar == null) {
            bVar = new b(this, str, (byte) 0);
            this.b.put(str, bVar);
        } else if (bVar.d != null) {
            return null;
        }
        a aVar = new a(this, bVar, (byte) 0);
        bVar.d = aVar;
        Writer writer = this.m;
        writer.write("DIRTY " + str + '\n');
        this.m.flush();
        return aVar;
    }

    public final synchronized long a() {
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i() {
        int i = this.n;
        return i >= 2000 && i >= this.b.size();
    }

    public final synchronized boolean d(String str) throws IOException {
        IAlog.a("DiskLruCache remove %s", str);
        b();
        e(str);
        b bVar = this.b.get(str);
        if (bVar != null && bVar.d == null) {
            for (int i = 0; i < this.k; i++) {
                File a2 = bVar.a(i);
                if (a2.exists() && !a2.delete()) {
                    throw new IOException("failed to delete " + a2);
                }
                this.l -= bVar.b[i];
                bVar.b[i] = 0;
            }
            this.n++;
            this.m.append((CharSequence) ("REMOVE " + str + '\n'));
            this.b.remove(str);
            if (i()) {
                this.d.submit(this.p);
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        if (this.m == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void c() throws IOException {
        b();
        j();
        this.m.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.m == null) {
            return;
        }
        Iterator it = new ArrayList(this.b.values()).iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.d != null) {
                bVar.d.b();
            }
        }
        j();
        this.m.close();
        this.m = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() throws IOException {
        while (this.l > this.j) {
            String key = this.b.entrySet().iterator().next().getKey();
            InterfaceC0048c interfaceC0048c = this.c;
            if (interfaceC0048c != null) {
                if (interfaceC0048c.a(key)) {
                    d(key);
                } else {
                    boolean z = false;
                    for (String str : this.b.keySet()) {
                        if (this.c.a(str)) {
                            z |= d(str);
                        }
                    }
                    if (!z) {
                        return;
                    }
                }
            } else {
                d(key);
            }
        }
    }

    public final void d() throws IOException {
        IAlog.a("DiskLruCache delete cache", new Object[0]);
        close();
        m.a(this.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(String str) {
        if (a.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
    }

    /* loaded from: classes.dex */
    public final class d implements Closeable {
        private final String b;
        private final long c;
        private final InputStream[] d;
        private final long[] e;

        /* synthetic */ d(c cVar, String str, long j, InputStream[] inputStreamArr, long[] jArr, byte b) {
            this(str, j, inputStreamArr, jArr);
        }

        private d(String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.b = str;
            this.c = j;
            this.d = inputStreamArr;
            this.e = jArr;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (InputStream inputStream : this.d) {
                m.a(inputStream);
            }
        }
    }

    /* loaded from: classes.dex */
    public final class a {
        final b a;
        final boolean[] b;
        boolean c;
        boolean d;

        /* synthetic */ a(c cVar, b bVar, byte b) {
            this(bVar);
        }

        private a(b bVar) {
            this.a = bVar;
            this.b = bVar.c ? null : new boolean[c.this.k];
        }

        public final OutputStream a() throws IOException {
            FileOutputStream fileOutputStream;
            C0047a c0047a;
            if (c.this.k <= 0) {
                throw new IllegalArgumentException("Expected index 0 to be greater than 0 and less than the maximum value count of " + c.this.k);
            }
            synchronized (c.this) {
                if (this.a.d != this) {
                    throw new IllegalStateException();
                }
                if (!this.a.c) {
                    this.b[0] = true;
                }
                File b = this.a.b(0);
                try {
                    fileOutputStream = new FileOutputStream(b);
                } catch (FileNotFoundException unused) {
                    c.this.e.mkdirs();
                    try {
                        fileOutputStream = new FileOutputStream(b);
                    } catch (FileNotFoundException unused2) {
                        return c.q;
                    }
                }
                c0047a = new C0047a(this, fileOutputStream, (byte) 0);
            }
            return c0047a;
        }

        public final void b() throws IOException {
            c.this.a(this, false);
        }

        /* renamed from: com.fyber.inneractive.sdk.player.a.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private class C0047a extends FilterOutputStream {
            /* synthetic */ C0047a(a aVar, OutputStream outputStream, byte b) {
                this(outputStream);
            }

            private C0047a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public final void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    a.this.c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public final void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    a.this.c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    a.this.c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public final void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    a.this.c = true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class b {
        final String a;
        final long[] b;
        boolean c;
        a d;
        long e;

        /* synthetic */ b(c cVar, String str, byte b) {
            this(str);
        }

        private b(String str) {
            this.a = str;
            this.b = new long[c.this.k];
        }

        public final String a() throws IOException {
            long[] jArr;
            StringBuilder sb = new StringBuilder();
            for (long j : this.b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        final void a(String[] strArr) throws IOException {
            if (strArr.length != c.this.k) {
                throw b(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.b[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    throw b(strArr);
                }
            }
        }

        private static IOException b(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public final File a(int i) {
            File file = c.this.e;
            return new File(file, this.a + "." + i);
        }

        public final File b(int i) {
            File file = c.this.e;
            return new File(file, this.a + "." + i + ".tmp");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(a aVar, boolean z) throws IOException {
        b bVar = aVar.a;
        if (bVar.d != aVar) {
            throw new IllegalStateException();
        }
        if (z && !bVar.c) {
            for (int i = 0; i < this.k; i++) {
                if (!aVar.b[i]) {
                    aVar.b();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                } else if (!bVar.b(i).exists()) {
                    aVar.b();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.k; i2++) {
            File b2 = bVar.b(i2);
            if (z) {
                if (b2.exists()) {
                    File a2 = bVar.a(i2);
                    b2.renameTo(a2);
                    long j = bVar.b[i2];
                    long length = a2.length();
                    bVar.b[i2] = length;
                    this.l = (this.l - j) + length;
                }
            } else {
                b(b2);
            }
        }
        this.n++;
        bVar.d = null;
        if (!(bVar.c | z)) {
            this.b.remove(bVar.a);
            this.m.write("REMOVE " + bVar.a + '\n');
        } else {
            bVar.c = true;
            this.m.write("CLEAN " + bVar.a + bVar.a() + '\n');
            if (z) {
                long j2 = this.o;
                this.o = 1 + j2;
                bVar.e = j2;
            }
        }
        this.m.flush();
        if (this.l > this.j || i()) {
            this.d.submit(this.p);
        }
    }
}
