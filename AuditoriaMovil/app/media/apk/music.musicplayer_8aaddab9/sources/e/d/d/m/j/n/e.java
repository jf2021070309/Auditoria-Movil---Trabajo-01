package e.d.d.m.j.n;

import ch.qos.logback.core.rolling.helper.Compressor;
import e.d.d.m.j.l.a0;
import e.d.d.m.j.l.d0.g;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
public class e {
    public static final Charset a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final int f7500b = 15;

    /* renamed from: c  reason: collision with root package name */
    public static final g f7501c = new g();

    /* renamed from: d  reason: collision with root package name */
    public static final Comparator<? super File> f7502d = new Comparator() { // from class: e.d.d.m.j.n.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Charset charset = e.a;
            return ((File) obj2).getName().compareTo(((File) obj).getName());
        }
    };

    /* renamed from: e  reason: collision with root package name */
    public static final FilenameFilter f7503e = new FilenameFilter() { // from class: e.d.d.m.j.n.d
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            Charset charset = e.a;
            return str.startsWith("event");
        }
    };

    /* renamed from: f  reason: collision with root package name */
    public final AtomicInteger f7504f = new AtomicInteger(0);

    /* renamed from: g  reason: collision with root package name */
    public final f f7505g;

    /* renamed from: h  reason: collision with root package name */
    public final e.d.d.m.j.p.f f7506h;

    public e(f fVar, e.d.d.m.j.p.f fVar2) {
        this.f7505g = fVar;
        this.f7506h = fVar2;
    }

    public static String e(File file) throws IOException {
        byte[] bArr = new byte[Compressor.BUFFER_SIZE];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), a);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void f(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), a);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void a(List<File> list) {
        for (File file : list) {
            file.delete();
        }
    }

    public final List<File> b() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f7505g.c());
        arrayList.addAll(this.f7505g.b());
        Comparator<? super File> comparator = f7502d;
        Collections.sort(arrayList, comparator);
        List<File> d2 = this.f7505g.d();
        Collections.sort(d2, comparator);
        arrayList.addAll(d2);
        return arrayList;
    }

    public SortedSet<String> c() {
        return new TreeSet(f.i(this.f7505g.f7507b.list())).descendingSet();
    }

    public void d(a0.e.d dVar, String str, boolean z) {
        int i2 = ((e.d.d.m.j.p.e) this.f7506h).d().b().a;
        Objects.requireNonNull(f7501c);
        e.d.d.p.j.d dVar2 = (e.d.d.p.j.d) g.a;
        Objects.requireNonNull(dVar2);
        StringWriter stringWriter = new StringWriter();
        try {
            dVar2.a(dVar, stringWriter);
        } catch (IOException unused) {
        }
        try {
            f(this.f7505g.f(str, e.a.d.a.a.l("event", String.format(Locale.US, "%010d", Integer.valueOf(this.f7504f.getAndIncrement())), z ? "_" : "")), stringWriter.toString());
        } catch (IOException e2) {
            e.d.d.m.j.f.a.e("Could not persist event for session " + str, e2);
        }
        List<File> i3 = f.i(this.f7505g.e(str).listFiles(new FilenameFilter() { // from class: e.d.d.m.j.n.b
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                Charset charset = e.a;
                return str2.startsWith("event") && !str2.endsWith("_");
            }
        }));
        Collections.sort(i3, new Comparator() { // from class: e.d.d.m.j.n.c
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                Charset charset = e.a;
                String name = ((File) obj).getName();
                int i4 = e.f7500b;
                return name.substring(0, i4).compareTo(((File) obj2).getName().substring(0, i4));
            }
        });
        int size = i3.size();
        for (File file : i3) {
            if (size <= i2) {
                return;
            }
            f.h(file);
            size--;
        }
    }
}
