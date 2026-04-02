package bo.app;

import com.braze.support.BrazeLogger;
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
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class l0 {
    static final Pattern o = Pattern.compile("[a-z0-9_-]{1,120}");
    private static final String p = BrazeLogger.getBrazeLogTag(l0.class);
    private static final OutputStream q = new b();
    private final File a;
    private final File b;
    private final File c;
    private final File d;
    private final int e;
    private long f;
    private final int g;
    private Writer i;
    private int k;
    private long h = 0;
    private final LinkedHashMap j = new LinkedHashMap(0, 0.75f, true);
    private long l = 0;
    final ThreadPoolExecutor m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    private final Callable n = new a();

    /* loaded from: classes.dex */
    public class a implements Callable {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            synchronized (l0.this) {
                if (l0.this.i != null) {
                    l0.this.i();
                    if (l0.this.e()) {
                        l0.this.h();
                        l0.this.k = 0;
                    }
                    return null;
                }
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public final class c {
        private final s0 a;
        private final boolean[] b;
        private boolean c;
        private boolean d;

        /* loaded from: classes.dex */
        public class a extends FilterOutputStream {
            public /* synthetic */ a(c cVar, OutputStream outputStream, a aVar) {
                this(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    c.this.c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    c.this.c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i) {
                try {
                    ((FilterOutputStream) this).out.write(i);
                } catch (IOException unused) {
                    c.this.c = true;
                }
            }

            private a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i, i2);
                } catch (IOException unused) {
                    c.this.c = true;
                }
            }
        }

        public /* synthetic */ c(l0 l0Var, s0 s0Var, a aVar) {
            this(s0Var);
        }

        private c(s0 s0Var) {
            this.a = s0Var;
            this.b = s0Var.c ? null : new boolean[l0.this.g];
        }

        public void b() {
            if (this.c) {
                l0.this.a(this, false);
                l0.this.d(this.a.a);
            } else {
                l0.this.a(this, true);
            }
            this.d = true;
        }

        public OutputStream a(int i) {
            FileOutputStream fileOutputStream;
            a aVar;
            if (i >= 0 && i < l0.this.g) {
                synchronized (l0.this) {
                    s0 s0Var = this.a;
                    if (s0Var.d == this) {
                        if (!s0Var.c) {
                            this.b[i] = true;
                        }
                        File b = s0Var.b(i);
                        try {
                            fileOutputStream = new FileOutputStream(b);
                        } catch (FileNotFoundException unused) {
                            l0.this.a.mkdirs();
                            try {
                                fileOutputStream = new FileOutputStream(b);
                            } catch (FileNotFoundException unused2) {
                                return l0.q;
                            }
                        }
                        aVar = new a(this, fileOutputStream, null);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                return aVar;
            }
            StringBuilder d = com.amazon.aps.iva.e4.e.d("Expected index ", i, " to be greater than 0 and less than the maximum value count of ");
            d.append(l0.this.g);
            throw new IllegalArgumentException(d.toString());
        }

        public void a() {
            l0.this.a(this, false);
        }
    }

    /* loaded from: classes.dex */
    public final class d implements Closeable {
        private final String a;
        private final long b;
        private final InputStream[] c;
        private final long[] d;

        public /* synthetic */ d(l0 l0Var, String str, long j, InputStream[] inputStreamArr, long[] jArr, a aVar) {
            this(str, j, inputStreamArr, jArr);
        }

        public InputStream a(int i) {
            return this.c[i];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.c) {
                n6.a(inputStream);
            }
        }

        private d(String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.a = str;
            this.b = j;
            this.c = inputStreamArr;
            this.d = jArr;
        }
    }

    private l0(File file, int i, int i2, long j) {
        this.a = file;
        this.e = i;
        this.b = new File(file, "journal");
        this.c = new File(file, "journal.tmp");
        this.d = new File(file, "journal.bkp");
        this.g = i2;
        this.f = j;
    }

    private void g() {
        m5 m5Var = new m5(new FileInputStream(this.b), n6.a);
        try {
            String c2 = m5Var.c();
            String c3 = m5Var.c();
            String c4 = m5Var.c();
            String c5 = m5Var.c();
            String c6 = m5Var.c();
            if ("libcore.io.DiskLruCache".equals(c2) && "1".equals(c3) && Integer.toString(this.e).equals(c4) && Integer.toString(this.g).equals(c5) && "".equals(c6)) {
                int i = 0;
                while (true) {
                    try {
                        c(m5Var.c());
                        i++;
                    } catch (EOFException unused) {
                        this.k = i - this.j.size();
                        if (m5Var.b()) {
                            h();
                        } else {
                            this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), n6.a));
                        }
                        n6.a(m5Var);
                        return;
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + c2 + ", " + c3 + ", " + c5 + ", " + c6 + "]");
            }
        } catch (Throwable th) {
            n6.a(m5Var);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void h() {
        Writer writer = this.i;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), n6.a));
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.e));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.g));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (s0 s0Var : this.j.values()) {
            if (s0Var.d != null) {
                bufferedWriter.write("DIRTY " + s0Var.a + '\n');
            } else {
                bufferedWriter.write("CLEAN " + s0Var.a + s0Var.a() + '\n');
            }
        }
        bufferedWriter.close();
        if (this.b.exists()) {
            a(this.b, this.d, true);
        }
        a(this.c, this.b, false);
        this.d.delete();
        this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), n6.a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        while (this.h > this.f) {
            d((String) ((Map.Entry) this.j.entrySet().iterator().next()).getKey());
        }
    }

    private void c(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                substring = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.j.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i, indexOf2);
            }
            s0 s0Var = (s0) this.j.get(substring);
            if (s0Var == null) {
                s0Var = new s0(substring, this.g, this.a);
                this.j.put(substring, s0Var);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                s0Var.c = true;
                s0Var.d = null;
                s0Var.b(split);
                return;
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                s0Var.d = new c(this, s0Var, null);
                return;
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: ".concat(str));
            } else {
                return;
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e() {
        int i = this.k;
        return i >= 2000 && i >= this.j.size();
    }

    private void f() {
        a(this.c);
        Iterator it = this.j.values().iterator();
        while (it.hasNext()) {
            s0 s0Var = (s0) it.next();
            int i = 0;
            if (s0Var.d == null) {
                while (i < this.g) {
                    this.h += s0Var.b[i];
                    i++;
                }
            } else {
                s0Var.d = null;
                while (i < this.g) {
                    a(s0Var.a(i));
                    a(s0Var.b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    public synchronized d b(String str) {
        InputStream inputStream;
        b();
        e(str);
        s0 s0Var = (s0) this.j.get(str);
        if (s0Var == null) {
            return null;
        }
        if (s0Var.c) {
            InputStream[] inputStreamArr = new InputStream[this.g];
            for (int i = 0; i < this.g; i++) {
                try {
                    inputStreamArr[i] = new FileInputStream(s0Var.a(i));
                } catch (FileNotFoundException unused) {
                    for (int i2 = 0; i2 < this.g && (inputStream = inputStreamArr[i2]) != null; i2++) {
                        n6.a(inputStream);
                    }
                    return null;
                }
            }
            this.k++;
            this.i.append((CharSequence) ("READ " + str + '\n'));
            if (e()) {
                this.m.submit(this.n);
            }
            return new d(this, str, s0Var.e, inputStreamArr, s0Var.b, null);
        }
        return null;
    }

    public synchronized boolean d(String str) {
        b();
        e(str);
        s0 s0Var = (s0) this.j.get(str);
        if (s0Var != null && s0Var.d == null) {
            for (int i = 0; i < this.g; i++) {
                File a2 = s0Var.a(i);
                if (a2.exists() && !a2.delete()) {
                    throw new IOException("failed to delete " + a2);
                }
                long j = this.h;
                long[] jArr = s0Var.b;
                this.h = j - jArr[i];
                jArr[i] = 0;
            }
            this.k++;
            this.i.append((CharSequence) ("REMOVE " + str + '\n'));
            this.j.remove(str);
            if (e()) {
                this.m.submit(this.n);
            }
            return true;
        }
        return false;
    }

    private void e(String str) {
        if (!o.matcher(str).matches()) {
            throw new IllegalArgumentException(defpackage.e.e("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
    }

    public static l0 a(File file, int i, int i2, long j) {
        if (j > 0) {
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
                l0 l0Var = new l0(file, i, i2, j);
                if (l0Var.b.exists()) {
                    try {
                        l0Var.g();
                        l0Var.f();
                        return l0Var;
                    } catch (IOException e) {
                        String str = p;
                        BrazeLogger.w(str, "DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                        l0Var.d();
                    }
                }
                file.mkdirs();
                l0 l0Var2 = new l0(file, i, i2, j);
                l0Var2.h();
                return l0Var2;
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private void b() {
        if (this.i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public void d() {
        c();
        n6.a(this.a);
    }

    public synchronized void c() {
        if (this.i == null) {
            return;
        }
        Iterator it = new ArrayList(this.j.values()).iterator();
        while (it.hasNext()) {
            c cVar = ((s0) it.next()).d;
            if (cVar != null) {
                cVar.a();
            }
        }
        i();
        this.i.close();
        this.i = null;
    }

    private static void a(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* loaded from: classes.dex */
    public class b extends OutputStream {
        @Override // java.io.OutputStream
        public void write(int i) {
        }
    }

    private static void a(File file, File file2, boolean z) {
        if (z) {
            a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public c a(String str) {
        return a(str, -1L);
    }

    private synchronized c a(String str, long j) {
        b();
        e(str);
        s0 s0Var = (s0) this.j.get(str);
        if (j == -1 || (s0Var != null && s0Var.e == j)) {
            if (s0Var == null) {
                s0Var = new s0(str, this.g, this.a);
                this.j.put(str, s0Var);
            } else if (s0Var.d != null) {
                return null;
            }
            c cVar = new c(this, s0Var, null);
            s0Var.d = cVar;
            Writer writer = this.i;
            writer.write("DIRTY " + str + '\n');
            this.i.flush();
            return cVar;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(c cVar, boolean z) {
        s0 s0Var = cVar.a;
        if (s0Var.d == cVar) {
            if (z && !s0Var.c) {
                for (int i = 0; i < this.g; i++) {
                    if (cVar.b[i]) {
                        if (!s0Var.b(i).exists()) {
                            cVar.a();
                            return;
                        }
                    } else {
                        cVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                }
            }
            for (int i2 = 0; i2 < this.g; i2++) {
                File b2 = s0Var.b(i2);
                if (z) {
                    if (b2.exists()) {
                        File a2 = s0Var.a(i2);
                        b2.renameTo(a2);
                        long j = s0Var.b[i2];
                        long length = a2.length();
                        s0Var.b[i2] = length;
                        this.h = (this.h - j) + length;
                    }
                } else {
                    a(b2);
                }
            }
            this.k++;
            s0Var.d = null;
            if (s0Var.c | z) {
                s0Var.c = true;
                this.i.write("CLEAN " + s0Var.a + s0Var.a() + '\n');
                if (z) {
                    long j2 = this.l;
                    this.l = 1 + j2;
                    s0Var.e = j2;
                }
            } else {
                this.j.remove(s0Var.a);
                this.i.write("REMOVE " + s0Var.a + '\n');
            }
            this.i.flush();
            if (this.h > this.f || e()) {
                this.m.submit(this.n);
            }
            return;
        }
        throw new IllegalStateException();
    }
}
