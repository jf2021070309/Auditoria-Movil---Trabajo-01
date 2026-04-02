package com.kwad.sdk.core.diskcache.a;

import com.kuaishou.weapon.p0.bh;
import com.kwad.sdk.utils.q;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
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
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class a implements Closeable {
    static final Pattern ana = Pattern.compile("[a-z0-9_-]{1,64}");
    private static final OutputStream anp = new OutputStream() { // from class: com.kwad.sdk.core.diskcache.a.a.3
        @Override // java.io.OutputStream
        public final void write(int i) {
        }
    };
    private final File anb;
    private final File anc;
    private final File and;
    private final File ane;
    private final int anf;
    private int ang;
    private final int anh;
    private Writer anj;
    private int anl;
    private long maxSize;
    private long size = 0;
    private int ani = 0;
    private final LinkedHashMap<String, b> ank = new LinkedHashMap<>(0, 0.75f, true);
    private long anm = 0;
    final ThreadPoolExecutor ann = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.kwad.sdk.core.diskcache.a.a.1
        private final AtomicInteger poolNumber = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ksad-DiskLruCache-" + this.poolNumber.getAndIncrement());
        }
    });
    private final Callable<Void> ano = new Callable<Void>() { // from class: com.kwad.sdk.core.diskcache.a.a.2
        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.concurrent.Callable
        /* renamed from: Aj */
        public Void call() {
            synchronized (a.this) {
                if (a.this.anj == null) {
                    return null;
                }
                a.this.trimToSize();
                a.this.Ap();
                if (a.this.Ao()) {
                    a.this.Am();
                    a.a(a.this, 0);
                }
                return null;
            }
        }
    };

    /* renamed from: com.kwad.sdk.core.diskcache.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0249a {
        private final b anr;
        private final boolean[] ans;
        private boolean ant;
        private boolean anu;

        /* renamed from: com.kwad.sdk.core.diskcache.a.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0250a extends FilterOutputStream {
            private C0250a(OutputStream outputStream) {
                super(outputStream);
            }

            /* synthetic */ C0250a(C0249a c0249a, OutputStream outputStream, byte b) {
                this(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                try {
                    this.out.close();
                } catch (IOException e) {
                    C0249a.b(C0249a.this, true);
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public final void flush() {
                try {
                    this.out.flush();
                } catch (IOException e) {
                    C0249a.b(C0249a.this, true);
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public final void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException e) {
                    C0249a.b(C0249a.this, true);
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public final void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException e) {
                    C0249a.b(C0249a.this, true);
                }
            }
        }

        private C0249a(b bVar) {
            this.anr = bVar;
            this.ans = bVar.anx ? null : new boolean[a.this.anh];
        }

        /* synthetic */ C0249a(a aVar, b bVar, byte b) {
            this(bVar);
        }

        static /* synthetic */ boolean b(C0249a c0249a, boolean z) {
            c0249a.ant = true;
            return true;
        }

        public final void abort() {
            a.this.a(this, false);
        }

        public final OutputStream bT(int i) {
            FileOutputStream fileOutputStream;
            C0250a c0250a;
            synchronized (a.this) {
                if (this.anr.any != this) {
                    throw new IllegalStateException();
                }
                if (!this.anr.anx) {
                    this.ans[0] = true;
                }
                File bV = this.anr.bV(0);
                try {
                    fileOutputStream = new FileOutputStream(bV);
                } catch (FileNotFoundException e) {
                    a.this.anb.mkdirs();
                    try {
                        fileOutputStream = new FileOutputStream(bV);
                    } catch (FileNotFoundException e2) {
                        return a.anp;
                    }
                }
                c0250a = new C0250a(this, fileOutputStream, (byte) 0);
            }
            return c0250a;
        }

        public final void commit() {
            if (this.ant) {
                a.this.a(this, false);
                a.this.remove(this.anr.key);
            } else {
                a.this.a(this, true);
            }
            this.anu = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class b {
        private final long[] anw;
        private boolean anx;
        private C0249a any;
        private long anz;
        private final String key;

        private b(String str) {
            this.key = str;
            this.anw = new long[a.this.anh];
        }

        /* synthetic */ b(a aVar, String str, byte b) {
            this(str);
        }

        static /* synthetic */ boolean a(b bVar, boolean z) {
            bVar.anx = true;
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String[] strArr) {
            if (strArr.length != a.this.anh) {
                throw c(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.anw[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException e) {
                    throw c(strArr);
                }
            }
        }

        private static IOException c(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public final String Ar() {
            long[] jArr;
            StringBuilder sb = new StringBuilder();
            for (long j : this.anw) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        public final File bU(int i) {
            File file = a.this.anb;
            return new File(file, this.key + i);
        }

        public final File bV(int i) {
            File file = a.this.anb;
            return new File(file, this.key + i + bh.k);
        }
    }

    /* loaded from: classes.dex */
    public final class c implements Closeable {
        private File[] anA;
        private final InputStream[] anB;
        private final long[] anw;
        private final long anz;
        private final String key;

        private c(String str, long j, File[] fileArr, InputStream[] inputStreamArr, long[] jArr) {
            this.key = str;
            this.anz = j;
            this.anA = fileArr;
            this.anB = inputStreamArr;
            this.anw = jArr;
        }

        /* synthetic */ c(a aVar, String str, long j, File[] fileArr, InputStream[] inputStreamArr, long[] jArr, byte b) {
            this(str, j, fileArr, inputStreamArr, jArr);
        }

        public final File bW(int i) {
            return this.anA[0];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (InputStream inputStream : this.anB) {
                com.kwad.sdk.crash.utils.b.closeQuietly(inputStream);
            }
        }
    }

    private a(File file, int i, int i2, long j, int i3) {
        this.anb = file;
        this.anf = i;
        this.anc = new File(file, "journal");
        this.and = new File(file, "journal.tmp");
        this.ane = new File(file, "journal.bkp");
        this.anh = i2;
        this.maxSize = j;
        this.ang = i3;
    }

    private void Ak() {
        com.kwad.sdk.core.diskcache.a.b bVar = new com.kwad.sdk.core.diskcache.a.b(new FileInputStream(this.anc), com.kwad.sdk.crash.utils.a.US_ASCII);
        try {
            String readLine = bVar.readLine();
            String readLine2 = bVar.readLine();
            String readLine3 = bVar.readLine();
            String readLine4 = bVar.readLine();
            String readLine5 = bVar.readLine();
            if (!"libcore.io.DiskLruCache".equals(readLine) || !"1".equals(readLine2) || !Integer.toString(this.anf).equals(readLine3) || !Integer.toString(this.anh).equals(readLine4) || !"".equals(readLine5)) {
                throw new IOException("unexpected journal header: [" + readLine + ", " + readLine2 + ", " + readLine4 + ", " + readLine5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    cy(bVar.readLine());
                    i++;
                } catch (EOFException e) {
                    this.anl = i - this.ank.size();
                    com.kwad.sdk.crash.utils.b.closeQuietly(bVar);
                    return;
                }
            }
        } catch (Throwable th) {
            com.kwad.sdk.crash.utils.b.closeQuietly(bVar);
            throw th;
        }
    }

    private void Al() {
        p(this.and);
        Iterator<b> it = this.ank.values().iterator();
        while (it.hasNext()) {
            b next = it.next();
            int i = 0;
            if (next.any == null) {
                while (i < this.anh) {
                    this.size += next.anw[i];
                    this.ani++;
                    i++;
                }
            } else {
                next.any = null;
                while (i < this.anh) {
                    p(next.bU(i));
                    p(next.bV(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void Am() {
        Writer writer = this.anj;
        if (writer != null) {
            com.kwad.sdk.crash.utils.b.closeQuietly(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.and), com.kwad.sdk.crash.utils.a.US_ASCII));
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.anf));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.anh));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (b bVar : this.ank.values()) {
            bufferedWriter.write(bVar.any != null ? "DIRTY " + bVar.key + '\n' : "CLEAN " + bVar.key + bVar.Ar() + '\n');
        }
        com.kwad.sdk.crash.utils.b.closeQuietly(bufferedWriter);
        if (this.anc.exists()) {
            a(this.anc, this.ane, true);
        }
        a(this.and, this.anc, false);
        this.ane.delete();
        this.anj = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.anc, true), com.kwad.sdk.crash.utils.a.US_ASCII));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Ao() {
        int i = this.anl;
        return i >= 2000 && i >= this.ank.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Ap() {
        while (this.ani > this.ang) {
            remove(this.ank.entrySet().iterator().next().getKey());
        }
    }

    static /* synthetic */ int a(a aVar, int i) {
        aVar.anl = 0;
        return 0;
    }

    public static a a(File file, int i, int i2, long j) {
        return a(file, 1, 1, 209715200L, Integer.MAX_VALUE);
    }

    public static a a(File file, int i, int i2, long j, int i3) {
        if (j > 0) {
            if (i3 > 0) {
                if (i2 > 0) {
                    File file2 = new File(file, "journal.bkp");
                    if (file2.exists()) {
                        File file3 = new File(file, "journal");
                        if (file3.exists()) {
                            file2.delete();
                        } else {
                            a(file2, file3, false);
                        }
                    }
                    a aVar = new a(file, i, i2, j, i3);
                    if (aVar.anc.exists()) {
                        try {
                            aVar.Ak();
                            aVar.Al();
                            aVar.anj = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(aVar.anc, true), com.kwad.sdk.crash.utils.a.US_ASCII));
                            return aVar;
                        } catch (IOException e) {
                            PrintStream printStream = System.out;
                            printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                            aVar.delete();
                        }
                    }
                    file.mkdirs();
                    a aVar2 = new a(file, i, i2, j, i3);
                    aVar2.Am();
                    return aVar2;
                }
                throw new IllegalArgumentException("valueCount <= 0");
            }
            throw new IllegalArgumentException("maxFileCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(C0249a c0249a, boolean z) {
        b bVar = c0249a.anr;
        if (bVar.any != c0249a) {
            throw new IllegalStateException();
        }
        if (z && !bVar.anx) {
            for (int i = 0; i < this.anh; i++) {
                if (!c0249a.ans[i]) {
                    c0249a.abort();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                } else if (!bVar.bV(i).exists()) {
                    c0249a.abort();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.anh; i2++) {
            File bV = bVar.bV(i2);
            if (!z) {
                p(bV);
            } else if (bV.exists()) {
                File bU = bVar.bU(i2);
                bV.renameTo(bU);
                long j = bVar.anw[i2];
                long length = bU.length();
                bVar.anw[i2] = length;
                this.size = (this.size - j) + length;
                this.ani++;
            }
        }
        this.anl++;
        bVar.any = null;
        if (bVar.anx || z) {
            b.a(bVar, true);
            this.anj.write("CLEAN " + bVar.key + bVar.Ar() + '\n');
            if (z) {
                long j2 = this.anm;
                this.anm = 1 + j2;
                bVar.anz = j2;
            }
        } else {
            this.ank.remove(bVar.key);
            this.anj.write("REMOVE " + bVar.key + '\n');
        }
        this.anj.flush();
        if (this.size > this.maxSize || this.ani > this.ang || Ao()) {
            this.ann.submit(this.ano);
        }
    }

    private static void a(File file, File file2, boolean z) {
        if (z) {
            p(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    private static void cB(String str) {
        if (ana.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
    }

    private void checkNotClosed() {
        if (this.anj == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private void cy(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i = indexOf + 1;
        int indexOf2 = str.indexOf(32, i);
        if (indexOf2 == -1) {
            substring = str.substring(i);
            if (indexOf == 6 && str.startsWith("REMOVE")) {
                this.ank.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, indexOf2);
        }
        b bVar = this.ank.get(substring);
        if (bVar == null) {
            bVar = new b(this, substring, (byte) 0);
            this.ank.put(substring, bVar);
        }
        if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
            String[] split = str.substring(indexOf2 + 1).split(" ");
            b.a(bVar, true);
            bVar.any = null;
            bVar.b(split);
        } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
            bVar.any = new C0249a(this, bVar, (byte) 0);
        } else if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    private synchronized C0249a e(String str, long j) {
        checkNotClosed();
        cB(str);
        b bVar = this.ank.get(str);
        if (bVar == null) {
            bVar = new b(this, str, (byte) 0);
            this.ank.put(str, bVar);
        } else if (bVar.any != null) {
            return null;
        }
        C0249a c0249a = new C0249a(this, bVar, (byte) 0);
        bVar.any = c0249a;
        Writer writer = this.anj;
        writer.write("DIRTY " + str + '\n');
        this.anj.flush();
        return c0249a;
    }

    private static void p(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trimToSize() {
        while (this.size > this.maxSize) {
            remove(this.ank.entrySet().iterator().next().getKey());
        }
    }

    public final synchronized int An() {
        return this.ang;
    }

    public final C0249a cA(String str) {
        return e(str, -1L);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.anj == null) {
            return;
        }
        Iterator it = new ArrayList(this.ank.values()).iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.any != null) {
                bVar.any.abort();
            }
        }
        trimToSize();
        Ap();
        com.kwad.sdk.crash.utils.b.closeQuietly(this.anj);
        this.anj = null;
    }

    public final synchronized c cz(String str) {
        checkNotClosed();
        cB(str);
        b bVar = this.ank.get(str);
        if (bVar == null) {
            return null;
        }
        if (bVar.anx) {
            int i = this.anh;
            File[] fileArr = new File[i];
            InputStream[] inputStreamArr = new InputStream[i];
            for (int i2 = 0; i2 < this.anh; i2++) {
                try {
                    File bU = bVar.bU(i2);
                    fileArr[i2] = bU;
                    inputStreamArr[i2] = new FileInputStream(bU);
                } catch (FileNotFoundException e) {
                    for (int i3 = 0; i3 < this.anh && inputStreamArr[i3] != null; i3++) {
                        com.kwad.sdk.crash.utils.b.closeQuietly(inputStreamArr[i3]);
                    }
                    return null;
                }
            }
            this.anl++;
            this.anj.append((CharSequence) ("READ " + str + '\n'));
            if (Ao()) {
                this.ann.submit(this.ano);
            }
            return new c(this, str, bVar.anz, fileArr, inputStreamArr, bVar.anw, (byte) 0);
        }
        return null;
    }

    public final void delete() {
        close();
        q.deleteContents(this.anb);
    }

    public final synchronized void flush() {
        checkNotClosed();
        trimToSize();
        Ap();
        this.anj.flush();
    }

    public final File getDirectory() {
        return this.anb;
    }

    public final synchronized long getMaxSize() {
        return this.maxSize;
    }

    public final synchronized boolean remove(String str) {
        checkNotClosed();
        cB(str);
        b bVar = this.ank.get(str);
        if (bVar != null && bVar.any == null) {
            for (int i = 0; i < this.anh; i++) {
                File bU = bVar.bU(i);
                if (bU.exists() && !bU.delete()) {
                    throw new IOException("failed to delete " + bU);
                }
                this.size -= bVar.anw[i];
                this.ani--;
                bVar.anw[i] = 0;
            }
            this.anl++;
            this.anj.append((CharSequence) ("REMOVE " + str + '\n'));
            this.ank.remove(str);
            if (Ao()) {
                this.ann.submit(this.ano);
            }
            return true;
        }
        return false;
    }
}
