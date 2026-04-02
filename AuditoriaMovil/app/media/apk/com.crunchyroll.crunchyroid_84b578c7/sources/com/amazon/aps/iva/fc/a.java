package com.amazon.aps.iva.fc;

import android.annotation.TargetApi;
import android.os.StrictMode;
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
/* compiled from: DiskLruCache.java */
/* loaded from: classes.dex */
public final class a implements Closeable {
    public final File b;
    public final File c;
    public final File d;
    public final File e;
    public final long g;
    public BufferedWriter j;
    public int l;
    public long i = 0;
    public final LinkedHashMap<String, d> k = new LinkedHashMap<>(0, 0.75f, true);
    public long m = 0;
    public final ThreadPoolExecutor n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b());
    public final CallableC0247a o = new CallableC0247a();
    public final int f = 1;
    public final int h = 1;

    /* compiled from: DiskLruCache.java */
    /* renamed from: com.amazon.aps.iva.fc.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class CallableC0247a implements Callable<Void> {
        public CallableC0247a() {
        }

        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            synchronized (a.this) {
                a aVar = a.this;
                if (aVar.j != null) {
                    aVar.y();
                    if (a.this.m()) {
                        a.this.v();
                        a.this.l = 0;
                    }
                    return null;
                }
                return null;
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: classes.dex */
    public static final class b implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: classes.dex */
    public final class c {
        public final d a;
        public final boolean[] b;
        public boolean c;

        public c(d dVar) {
            boolean[] zArr;
            this.a = dVar;
            if (dVar.e) {
                zArr = null;
            } else {
                zArr = new boolean[a.this.h];
            }
            this.b = zArr;
        }

        public final void a() throws IOException {
            a.a(a.this, this, false);
        }

        public final File b() throws IOException {
            File file;
            synchronized (a.this) {
                d dVar = this.a;
                if (dVar.f == this) {
                    if (!dVar.e) {
                        this.b[0] = true;
                    }
                    file = dVar.d[0];
                    a.this.b.mkdirs();
                } else {
                    throw new IllegalStateException();
                }
            }
            return file;
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: classes.dex */
    public final class d {
        public final String a;
        public final long[] b;
        public final File[] c;
        public final File[] d;
        public boolean e;
        public c f;

        public d(String str) {
            this.a = str;
            int i = a.this.h;
            this.b = new long[i];
            this.c = new File[i];
            this.d = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i2 = 0; i2 < a.this.h; i2++) {
                sb.append(i2);
                File[] fileArr = this.c;
                String sb2 = sb.toString();
                File file = a.this.b;
                fileArr[i2] = new File(file, sb2);
                sb.append(".tmp");
                this.d[i2] = new File(file, sb.toString());
                sb.setLength(length);
            }
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
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: classes.dex */
    public final class e {
        public final File[] a;

        public e(File[] fileArr) {
            this.a = fileArr;
        }
    }

    public a(File file, long j) {
        this.b = file;
        this.c = new File(file, "journal");
        this.d = new File(file, "journal.tmp");
        this.e = new File(file, "journal.bkp");
        this.g = j;
    }

    public static void a(a aVar, c cVar, boolean z) throws IOException {
        synchronized (aVar) {
            d dVar = cVar.a;
            if (dVar.f == cVar) {
                if (z && !dVar.e) {
                    for (int i = 0; i < aVar.h; i++) {
                        if (cVar.b[i]) {
                            if (!dVar.d[i].exists()) {
                                cVar.a();
                                return;
                            }
                        } else {
                            cVar.a();
                            throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                        }
                    }
                }
                for (int i2 = 0; i2 < aVar.h; i2++) {
                    File file = dVar.d[i2];
                    if (z) {
                        if (file.exists()) {
                            File file2 = dVar.c[i2];
                            file.renameTo(file2);
                            long j = dVar.b[i2];
                            long length = file2.length();
                            dVar.b[i2] = length;
                            aVar.i = (aVar.i - j) + length;
                        }
                    } else {
                        f(file);
                    }
                }
                aVar.l++;
                dVar.f = null;
                if (dVar.e | z) {
                    dVar.e = true;
                    aVar.j.append((CharSequence) "CLEAN");
                    aVar.j.append(' ');
                    aVar.j.append((CharSequence) dVar.a);
                    aVar.j.append((CharSequence) dVar.a());
                    aVar.j.append('\n');
                    if (z) {
                        aVar.m++;
                        dVar.getClass();
                    }
                } else {
                    aVar.k.remove(dVar.a);
                    aVar.j.append((CharSequence) "REMOVE");
                    aVar.j.append(' ');
                    aVar.j.append((CharSequence) dVar.a);
                    aVar.j.append('\n');
                }
                i(aVar.j);
                if (aVar.i > aVar.g || aVar.m()) {
                    aVar.n.submit(aVar.o);
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    @TargetApi(26)
    public static void c(Writer writer) throws IOException {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void f(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    public static void i(Writer writer) throws IOException {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static a n(File file, long j) throws IOException {
        if (j > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    x(file2, file3, false);
                }
            }
            a aVar = new a(file, j);
            if (aVar.c.exists()) {
                try {
                    aVar.s();
                    aVar.p();
                    return aVar;
                } catch (IOException e2) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                    aVar.close();
                    com.amazon.aps.iva.fc.c.a(aVar.b);
                }
            }
            file.mkdirs();
            a aVar2 = new a(file, j);
            aVar2.v();
            return aVar2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public static void x(File file, File file2, boolean z) throws IOException {
        if (z) {
            f(file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.j == null) {
            return;
        }
        Iterator it = new ArrayList(this.k.values()).iterator();
        while (it.hasNext()) {
            c cVar = ((d) it.next()).f;
            if (cVar != null) {
                cVar.a();
            }
        }
        y();
        c(this.j);
        this.j = null;
    }

    public final c h(String str) throws IOException {
        synchronized (this) {
            if (this.j != null) {
                d dVar = this.k.get(str);
                if (dVar == null) {
                    dVar = new d(str);
                    this.k.put(str, dVar);
                } else if (dVar.f != null) {
                    return null;
                }
                c cVar = new c(dVar);
                dVar.f = cVar;
                this.j.append((CharSequence) "DIRTY");
                this.j.append(' ');
                this.j.append((CharSequence) str);
                this.j.append('\n');
                i(this.j);
                return cVar;
            }
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized e k(String str) throws IOException {
        if (this.j != null) {
            d dVar = this.k.get(str);
            if (dVar == null) {
                return null;
            }
            if (!dVar.e) {
                return null;
            }
            for (File file : dVar.c) {
                if (!file.exists()) {
                    return null;
                }
            }
            this.l++;
            this.j.append((CharSequence) "READ");
            this.j.append(' ');
            this.j.append((CharSequence) str);
            this.j.append('\n');
            if (m()) {
                this.n.submit(this.o);
            }
            return new e(dVar.c);
        }
        throw new IllegalStateException("cache is closed");
    }

    public final boolean m() {
        int i = this.l;
        if (i >= 2000 && i >= this.k.size()) {
            return true;
        }
        return false;
    }

    public final void p() throws IOException {
        f(this.d);
        Iterator<d> it = this.k.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            c cVar = next.f;
            int i = this.h;
            int i2 = 0;
            if (cVar == null) {
                while (i2 < i) {
                    this.i += next.b[i2];
                    i2++;
                }
            } else {
                next.f = null;
                while (i2 < i) {
                    f(next.c[i2]);
                    f(next.d[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    public final void s() throws IOException {
        File file = this.c;
        com.amazon.aps.iva.fc.b bVar = new com.amazon.aps.iva.fc.b(new FileInputStream(file), com.amazon.aps.iva.fc.c.a);
        try {
            String a = bVar.a();
            String a2 = bVar.a();
            String a3 = bVar.a();
            String a4 = bVar.a();
            String a5 = bVar.a();
            if ("libcore.io.DiskLruCache".equals(a) && "1".equals(a2) && Integer.toString(this.f).equals(a3) && Integer.toString(this.h).equals(a4) && "".equals(a5)) {
                boolean z = false;
                int i = 0;
                while (true) {
                    try {
                        t(bVar.a());
                        i++;
                    } catch (EOFException unused) {
                        this.l = i - this.k.size();
                        if (bVar.f == -1) {
                            z = true;
                        }
                        if (z) {
                            v();
                        } else {
                            this.j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), com.amazon.aps.iva.fc.c.a));
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
            } else {
                throw new IOException("unexpected journal header: [" + a + ", " + a2 + ", " + a4 + ", " + a5 + "]");
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

    public final void t(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            LinkedHashMap<String, d> linkedHashMap = this.k;
            if (indexOf2 == -1) {
                substring = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    linkedHashMap.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i, indexOf2);
            }
            d dVar = linkedHashMap.get(substring);
            if (dVar == null) {
                dVar = new d(substring);
                linkedHashMap.put(substring, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.e = true;
                dVar.f = null;
                if (split.length == a.this.h) {
                    for (int i2 = 0; i2 < split.length; i2++) {
                        try {
                            dVar.b[i2] = Long.parseLong(split[i2]);
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + Arrays.toString(split));
                        }
                    }
                    return;
                }
                throw new IOException("unexpected journal line: " + Arrays.toString(split));
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f = new c(dVar);
                return;
            } else if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                return;
            } else {
                throw new IOException("unexpected journal line: ".concat(str));
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    public final synchronized void v() throws IOException {
        BufferedWriter bufferedWriter = this.j;
        if (bufferedWriter != null) {
            c(bufferedWriter);
        }
        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.d), com.amazon.aps.iva.fc.c.a));
        bufferedWriter2.write("libcore.io.DiskLruCache");
        bufferedWriter2.write("\n");
        bufferedWriter2.write("1");
        bufferedWriter2.write("\n");
        bufferedWriter2.write(Integer.toString(this.f));
        bufferedWriter2.write("\n");
        bufferedWriter2.write(Integer.toString(this.h));
        bufferedWriter2.write("\n");
        bufferedWriter2.write("\n");
        for (d dVar : this.k.values()) {
            if (dVar.f != null) {
                bufferedWriter2.write("DIRTY " + dVar.a + '\n');
            } else {
                bufferedWriter2.write("CLEAN " + dVar.a + dVar.a() + '\n');
            }
        }
        c(bufferedWriter2);
        if (this.c.exists()) {
            x(this.c, this.e, true);
        }
        x(this.d, this.c, false);
        this.e.delete();
        this.j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c, true), com.amazon.aps.iva.fc.c.a));
    }

    public final void y() throws IOException {
        while (this.i > this.g) {
            String key = this.k.entrySet().iterator().next().getKey();
            synchronized (this) {
                if (this.j != null) {
                    d dVar = this.k.get(key);
                    if (dVar != null && dVar.f == null) {
                        for (int i = 0; i < this.h; i++) {
                            File file = dVar.c[i];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j = this.i;
                            long[] jArr = dVar.b;
                            this.i = j - jArr[i];
                            jArr[i] = 0;
                        }
                        this.l++;
                        this.j.append((CharSequence) "REMOVE");
                        this.j.append(' ');
                        this.j.append((CharSequence) key);
                        this.j.append('\n');
                        this.k.remove(key);
                        if (m()) {
                            this.n.submit(this.o);
                        }
                    }
                } else {
                    throw new IllegalStateException("cache is closed");
                }
            }
        }
    }
}
