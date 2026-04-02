package com.amazon.aps.iva.vp;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.ne0.e;
import com.amazon.aps.iva.ne0.s;
import com.amazon.aps.iva.tp.m;
import com.amazon.aps.iva.tp.n;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
/* compiled from: BatchFileOrchestrator.kt */
/* loaded from: classes2.dex */
public final class f implements m {
    public static final com.amazon.aps.iva.oe0.f j = new com.amazon.aps.iva.oe0.f("\\d+");
    public final File b;
    public final n c;
    public final com.amazon.aps.iva.iq.a d;
    public final a e;
    public final long f;
    public final long g;
    public File h;
    public int i;

    /* compiled from: BatchFileOrchestrator.kt */
    /* loaded from: classes2.dex */
    public static final class a implements FileFilter {
        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            if (file != null && ((Boolean) com.amazon.aps.iva.tp.b.f(file, Boolean.FALSE, com.amazon.aps.iva.tp.f.h)).booleanValue()) {
                String name = file.getName();
                j.e(name, "file.name");
                if (f.j.b(name)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: BatchFileOrchestrator.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<File, Boolean> {
        public final /* synthetic */ long h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j) {
            super(1);
            this.h = j;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(File file) {
            long longValue;
            boolean z;
            File file2 = file;
            j.f(file2, "it");
            String name = file2.getName();
            j.e(name, "it.name");
            Long X = com.amazon.aps.iva.oe0.l.X(name);
            if (X == null) {
                longValue = 0;
            } else {
                longValue = X.longValue();
            }
            if (longValue < this.h) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public f(File file, n nVar, com.amazon.aps.iva.iq.a aVar) {
        j.f(aVar, "internalLogger");
        this.b = file;
        this.c = nVar;
        this.d = aVar;
        this.e = new a();
        double d = nVar.a;
        this.f = (long) (1.05d * d);
        this.g = (long) (d * 0.95d);
    }

    public static boolean d(File file, long j2) {
        long longValue;
        long currentTimeMillis = System.currentTimeMillis();
        String name = file.getName();
        j.e(name, "file.name");
        Long X = com.amazon.aps.iva.oe0.l.X(name);
        if (X == null) {
            longValue = 0;
        } else {
            longValue = X.longValue();
        }
        if (longValue >= currentTimeMillis - j2) {
            return true;
        }
        return false;
    }

    public final void a() {
        e.a aVar = new e.a(s.V(x.k0(f()), new b(System.currentTimeMillis() - this.c.e)));
        while (aVar.hasNext()) {
            File file = (File) aVar.next();
            j.f(file, "<this>");
            ((Boolean) com.amazon.aps.iva.tp.b.f(file, Boolean.FALSE, com.amazon.aps.iva.tp.d.h)).booleanValue();
        }
    }

    @Override // com.amazon.aps.iva.tp.m
    public final File b() {
        if (!e()) {
            return null;
        }
        return this.b;
    }

    @Override // com.amazon.aps.iva.tp.m
    public final File c(int i) {
        boolean z;
        File file = null;
        if (!e()) {
            return null;
        }
        long j2 = i;
        n nVar = this.c;
        int i2 = (j2 > nVar.c ? 1 : (j2 == nVar.c ? 0 : -1));
        com.amazon.aps.iva.iq.a aVar = this.d;
        if (i2 > 0) {
            String format = String.format(Locale.US, "Can't write data with size %d (max item size is %d)", Arrays.copyOf(new Object[]{Integer.valueOf(i), Long.valueOf(nVar.c)}, 2));
            j.e(format, "format(locale, this, *args)");
            l1.z(aVar, format, null, 6);
            return null;
        }
        a();
        List<File> f = f();
        long j3 = 0;
        for (File file2 : f) {
            j3 += com.amazon.aps.iva.tp.b.c(file2);
        }
        long j4 = nVar.f;
        long j5 = j3 - j4;
        if (j5 > 0) {
            String format2 = String.format(Locale.US, "Too much disk space used (%d/%d): cleaning up to free %d bytes…", Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5)}, 3));
            j.e(format2, "format(locale, this, *args)");
            l1.z(aVar, format2, null, 6);
            for (File file3 : f) {
                if (j5 > 0) {
                    long c = com.amazon.aps.iva.tp.b.c(file3);
                    if (((Boolean) com.amazon.aps.iva.tp.b.f(file3, Boolean.FALSE, com.amazon.aps.iva.tp.d.h)).booleanValue()) {
                        j5 -= c;
                    }
                }
            }
        }
        File file4 = (File) x.E0(f());
        if (file4 != null) {
            File file5 = this.h;
            int i3 = this.i;
            if (j.a(file5, file4)) {
                boolean d = d(file4, this.g);
                boolean z2 = false;
                if (com.amazon.aps.iva.tp.b.c(file4) + j2 < nVar.b) {
                    z = true;
                } else {
                    z = false;
                }
                if (i3 < nVar.d) {
                    z2 = true;
                }
                if (d && z && z2) {
                    this.i = i3 + 1;
                    file = file4;
                }
            }
        }
        if (file == null) {
            File file6 = new File(this.b, String.valueOf(System.currentTimeMillis()));
            this.h = file6;
            this.i = 1;
            return file6;
        }
        return file;
    }

    public final boolean e() {
        if (com.amazon.aps.iva.tp.b.b(this.b)) {
            if (this.b.isDirectory()) {
                File file = this.b;
                j.f(file, "<this>");
                if (((Boolean) com.amazon.aps.iva.tp.b.f(file, Boolean.FALSE, com.amazon.aps.iva.tp.c.h)).booleanValue()) {
                    return true;
                }
                com.amazon.aps.iva.iq.a aVar = this.d;
                String format = String.format(Locale.US, "The provided root dir is not writable: %s", Arrays.copyOf(new Object[]{this.b.getPath()}, 1));
                j.e(format, "format(locale, this, *args)");
                l1.z(aVar, format, null, 6);
                return false;
            }
            com.amazon.aps.iva.iq.a aVar2 = this.d;
            String format2 = String.format(Locale.US, "The provided root file is not a directory: %s", Arrays.copyOf(new Object[]{this.b.getPath()}, 1));
            j.e(format2, "format(locale, this, *args)");
            l1.z(aVar2, format2, null, 6);
            return false;
        }
        synchronized (this.b) {
            if (com.amazon.aps.iva.tp.b.b(this.b)) {
                return true;
            }
            if (com.amazon.aps.iva.tp.b.d(this.b)) {
                return true;
            }
            com.amazon.aps.iva.iq.a aVar3 = this.d;
            String format3 = String.format(Locale.US, "The provided root file can't be created: %s", Arrays.copyOf(new Object[]{this.b.getPath()}, 1));
            j.e(format3, "format(locale, this, *args)");
            l1.z(aVar3, format3, null, 6);
            return false;
        }
    }

    public final List<File> f() {
        File file = this.b;
        j.f(file, "<this>");
        a aVar = this.e;
        j.f(aVar, "filter");
        File[] fileArr = (File[]) com.amazon.aps.iva.tp.b.f(file, null, new com.amazon.aps.iva.tp.h(aVar));
        boolean z = false;
        if (fileArr == null) {
            fileArr = new File[0];
        }
        File[] fileArr2 = fileArr;
        if (fileArr2.length == 0) {
            z = true;
        }
        if (!z) {
            Object[] copyOf = Arrays.copyOf(fileArr2, fileArr2.length);
            j.e(copyOf, "copyOf(this, size)");
            fileArr2 = (Comparable[]) copyOf;
            if (fileArr2.length > 1) {
                Arrays.sort(fileArr2);
            }
        }
        return com.amazon.aps.iva.lb0.m.B(fileArr2);
    }

    @Override // com.amazon.aps.iva.tp.m
    public final File h(Set<? extends File> set) {
        boolean z;
        Object obj = null;
        if (!e()) {
            return null;
        }
        a();
        Iterator<T> it = f().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            File file = (File) next;
            if (!set.contains(file) && !d(file, this.f)) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                obj = next;
                break;
            }
        }
        return (File) obj;
    }
}
