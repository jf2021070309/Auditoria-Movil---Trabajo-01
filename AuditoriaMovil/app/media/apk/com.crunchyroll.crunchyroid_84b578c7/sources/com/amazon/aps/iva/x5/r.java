package com.amazon.aps.iva.x5;

import android.database.SQLException;
import android.os.ConditionVariable;
import com.amazon.aps.iva.x5.a;
import com.amazon.aps.iva.x5.j;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;
/* compiled from: SimpleCache.java */
/* loaded from: classes.dex */
public final class r implements a {
    public static final HashSet<File> j = new HashSet<>();
    public final File a;
    public final d b;
    public final k c;
    public final f d;
    public final HashMap<String, ArrayList<a.b>> e;
    public final Random f;
    public final boolean g;
    public long h;
    public a.C0842a i;

    public r(File file, o oVar, com.amazon.aps.iva.v5.b bVar) {
        boolean add;
        k kVar = new k(bVar, file);
        f fVar = new f(bVar);
        synchronized (r.class) {
            add = j.add(file.getAbsoluteFile());
        }
        if (add) {
            this.a = file;
            this.b = oVar;
            this.c = kVar;
            this.d = fVar;
            this.e = new HashMap<>();
            this.f = new Random();
            this.g = false;
            this.h = -1L;
            ConditionVariable conditionVariable = new ConditionVariable();
            new q(this, conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
    }

    public static void k(r rVar) {
        long j2;
        k kVar = rVar.c;
        File file = rVar.a;
        if (!file.exists()) {
            try {
                m(file);
            } catch (a.C0842a e) {
                rVar.i = e;
                return;
            }
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            com.amazon.aps.iva.t5.p.c();
            rVar.i = new a.C0842a("Failed to list cache directory files: " + file);
            return;
        }
        int length = listFiles.length;
        int i = 0;
        while (true) {
            if (i < length) {
                File file2 = listFiles[i];
                String name = file2.getName();
                if (name.endsWith(".uid")) {
                    try {
                        j2 = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                        break;
                    } catch (NumberFormatException unused) {
                        file2.toString();
                        com.amazon.aps.iva.t5.p.c();
                        file2.delete();
                    }
                }
                i++;
            } else {
                j2 = -1;
                break;
            }
        }
        rVar.h = j2;
        if (j2 == -1) {
            try {
                rVar.h = n(file);
            } catch (IOException e2) {
                String str = "Failed to create cache UID: " + file;
                com.amazon.aps.iva.t5.p.d(str, e2);
                rVar.i = new a.C0842a(str, e2);
                return;
            }
        }
        try {
            kVar.e(rVar.h);
            f fVar = rVar.d;
            if (fVar != null) {
                fVar.b(rVar.h);
                HashMap a = fVar.a();
                rVar.o(file, true, listFiles, a);
                fVar.c(a.keySet());
            } else {
                rVar.o(file, true, listFiles, null);
            }
            UnmodifiableIterator it = ImmutableSet.copyOf((Collection) kVar.a.keySet()).iterator();
            while (it.hasNext()) {
                kVar.f((String) it.next());
            }
            try {
                kVar.g();
            } catch (IOException e3) {
                com.amazon.aps.iva.t5.p.d("Storing index file failed", e3);
            }
        } catch (IOException e4) {
            String str2 = "Failed to initialize cache indices: " + file;
            com.amazon.aps.iva.t5.p.d(str2, e4);
            rVar.i = new a.C0842a(str2, e4);
        }
    }

    public static void m(File file) throws a.C0842a {
        if (!file.mkdirs() && !file.isDirectory()) {
            String str = "Failed to create cache directory: " + file;
            com.amazon.aps.iva.t5.p.c();
            throw new a.C0842a(str);
        }
    }

    public static long n(File file) throws IOException {
        long abs;
        long nextLong = new SecureRandom().nextLong();
        if (nextLong == Long.MIN_VALUE) {
            abs = 0;
        } else {
            abs = Math.abs(nextLong);
        }
        File file2 = new File(file, com.amazon.aps.iva.c80.a.f(Long.toString(abs, 16), ".uid"));
        if (file2.createNewFile()) {
            return abs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    @Override // com.amazon.aps.iva.x5.a
    public final synchronized n a(String str) {
        n nVar;
        j c = this.c.c(str);
        if (c != null) {
            nVar = c.e;
        } else {
            nVar = n.c;
        }
        return nVar;
    }

    @Override // com.amazon.aps.iva.x5.a
    public final synchronized void b(h hVar) {
        j c = this.c.c(hVar.b);
        c.getClass();
        long j2 = hVar.c;
        int i = 0;
        while (true) {
            ArrayList<j.a> arrayList = c.d;
            if (i < arrayList.size()) {
                if (arrayList.get(i).a == j2) {
                    arrayList.remove(i);
                    this.c.f(c.b);
                    notifyAll();
                } else {
                    i++;
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @Override // com.amazon.aps.iva.x5.a
    public final synchronized long c(long j2, long j3, String str) {
        long j4;
        if (j3 == -1) {
            j3 = Long.MAX_VALUE;
        }
        j c = this.c.c(str);
        if (c != null) {
            j4 = c.a(j2, j3);
        } else {
            j4 = -j3;
        }
        return j4;
    }

    @Override // com.amazon.aps.iva.x5.a
    public final synchronized s d(long j2, long j3, String str) throws InterruptedException, a.C0842a {
        s e;
        synchronized (this) {
            a.C0842a c0842a = this.i;
            if (c0842a != null) {
                throw c0842a;
            }
        }
        return e;
        while (true) {
            e = e(j2, j3, str);
            if (e != null) {
                return e;
            }
            wait();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007e A[Catch: all -> 0x0091, LOOP:0: B:22:0x004c->B:39:0x007e, LOOP_END, TryCatch #2 {, blocks: (B:3:0x0001, B:6:0x0006, B:7:0x0007, B:9:0x000f, B:16:0x0038, B:18:0x003c, B:21:0x0042, B:22:0x004c, B:24:0x0055, B:26:0x0063, B:28:0x0069, B:39:0x007e, B:33:0x0073, B:40:0x0081, B:10:0x001f, B:12:0x0027, B:14:0x0033, B:4:0x0002, B:50:0x0093), top: B:56:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x007d A[SYNTHETIC] */
    @Override // com.amazon.aps.iva.x5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.amazon.aps.iva.x5.s e(long r11, long r13, java.lang.String r15) throws com.amazon.aps.iva.x5.a.C0842a {
        /*
            r10 = this;
            monitor-enter(r10)
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L91
            com.amazon.aps.iva.x5.a$a r0 = r10.i     // Catch: java.lang.Throwable -> L94
            if (r0 != 0) goto L93
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L91
            com.amazon.aps.iva.x5.k r0 = r10.c     // Catch: java.lang.Throwable -> L91
            com.amazon.aps.iva.x5.j r0 = r0.c(r15)     // Catch: java.lang.Throwable -> L91
            if (r0 != 0) goto L1f
            com.amazon.aps.iva.x5.s r0 = new com.amazon.aps.iva.x5.s     // Catch: java.lang.Throwable -> L91
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = 0
            r1 = r0
            r2 = r15
            r3 = r11
            r5 = r13
            r1.<init>(r2, r3, r5, r7, r9)     // Catch: java.lang.Throwable -> L91
            goto L38
        L1f:
            com.amazon.aps.iva.x5.s r1 = r0.b(r11, r13)     // Catch: java.lang.Throwable -> L91
            boolean r2 = r1.e     // Catch: java.lang.Throwable -> L91
            if (r2 == 0) goto L37
            java.io.File r2 = r1.f     // Catch: java.lang.Throwable -> L91
            long r2 = r2.length()     // Catch: java.lang.Throwable -> L91
            long r4 = r1.d     // Catch: java.lang.Throwable -> L91
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L37
            r10.q()     // Catch: java.lang.Throwable -> L91
            goto L1f
        L37:
            r0 = r1
        L38:
            boolean r13 = r0.e     // Catch: java.lang.Throwable -> L91
            if (r13 == 0) goto L42
            com.amazon.aps.iva.x5.s r11 = r10.r(r15, r0)     // Catch: java.lang.Throwable -> L91
            monitor-exit(r10)
            return r11
        L42:
            com.amazon.aps.iva.x5.k r13 = r10.c     // Catch: java.lang.Throwable -> L91
            com.amazon.aps.iva.x5.j r13 = r13.d(r15)     // Catch: java.lang.Throwable -> L91
            long r14 = r0.d     // Catch: java.lang.Throwable -> L91
            r1 = 0
            r2 = r1
        L4c:
            java.util.ArrayList<com.amazon.aps.iva.x5.j$a> r3 = r13.d     // Catch: java.lang.Throwable -> L91
            int r4 = r3.size()     // Catch: java.lang.Throwable -> L91
            r5 = 1
            if (r2 >= r4) goto L81
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L91
            com.amazon.aps.iva.x5.j$a r3 = (com.amazon.aps.iva.x5.j.a) r3     // Catch: java.lang.Throwable -> L91
            long r6 = r3.a     // Catch: java.lang.Throwable -> L91
            int r4 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            r8 = -1
            if (r4 > 0) goto L6f
            long r3 = r3.b     // Catch: java.lang.Throwable -> L91
            int r8 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r8 == 0) goto L7b
            long r6 = r6 + r3
            int r3 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r3 <= 0) goto L7a
            goto L7b
        L6f:
            int r3 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r3 == 0) goto L7b
            long r3 = r11 + r14
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 <= 0) goto L7a
            goto L7b
        L7a:
            r5 = r1
        L7b:
            if (r5 == 0) goto L7e
            goto L8a
        L7e:
            int r2 = r2 + 1
            goto L4c
        L81:
            com.amazon.aps.iva.x5.j$a r13 = new com.amazon.aps.iva.x5.j$a     // Catch: java.lang.Throwable -> L91
            r13.<init>(r11, r14)     // Catch: java.lang.Throwable -> L91
            r3.add(r13)     // Catch: java.lang.Throwable -> L91
            r1 = r5
        L8a:
            if (r1 == 0) goto L8e
            monitor-exit(r10)
            return r0
        L8e:
            monitor-exit(r10)
            r11 = 0
            return r11
        L91:
            r11 = move-exception
            goto L97
        L93:
            throw r0     // Catch: java.lang.Throwable -> L94
        L94:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L91
            throw r11     // Catch: java.lang.Throwable -> L91
        L97:
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.x5.r.e(long, long, java.lang.String):com.amazon.aps.iva.x5.s");
    }

    @Override // com.amazon.aps.iva.x5.a
    public final synchronized long f(long j2, long j3, String str) {
        long j4;
        long j5;
        long j6;
        if (j3 == -1) {
            j4 = Long.MAX_VALUE;
        } else {
            j4 = j2 + j3;
        }
        if (j4 < 0) {
            j5 = Long.MAX_VALUE;
        } else {
            j5 = j4;
        }
        long j7 = j2;
        j6 = 0;
        while (j7 < j5) {
            long c = c(j7, j5 - j7, str);
            if (c > 0) {
                j6 += c;
            } else {
                c = -c;
            }
            j7 += c;
        }
        return j6;
    }

    @Override // com.amazon.aps.iva.x5.a
    public final synchronized File g(long j2, long j3, String str) throws a.C0842a {
        synchronized (this) {
            a.C0842a c0842a = this.i;
            if (c0842a != null) {
                throw c0842a;
            }
        }
        return s.b(r0, r11.a, j2, System.currentTimeMillis());
        j c = this.c.c(str);
        c.getClass();
        com.amazon.aps.iva.cq.b.C(c.c(j2, j3));
        if (!this.a.exists()) {
            m(this.a);
            q();
        }
        this.b.e();
        File file = new File(this.a, Integer.toString(this.f.nextInt(10)));
        if (!file.exists()) {
            m(file);
        }
        return s.b(file, c.a, j2, System.currentTimeMillis());
    }

    @Override // com.amazon.aps.iva.x5.a
    public final synchronized void h(String str, m mVar) throws a.C0842a {
        try {
            synchronized (this) {
                synchronized (this) {
                    a.C0842a c0842a = this.i;
                    if (c0842a != null) {
                        throw c0842a;
                    }
                }
                return;
            }
            this.c.g();
            return;
        } catch (IOException e) {
            throw new a.C0842a(e);
        }
        k kVar = this.c;
        j d = kVar.d(str);
        n nVar = d.e;
        n b = nVar.b(mVar);
        d.e = b;
        if (!b.equals(nVar)) {
            kVar.e.f(d);
        }
    }

    @Override // com.amazon.aps.iva.x5.a
    public final synchronized void i(File file, long j2) throws a.C0842a {
        boolean z;
        if (!file.exists()) {
            return;
        }
        if (j2 == 0) {
            file.delete();
            return;
        }
        s a = s.a(file, j2, -9223372036854775807L, this.c);
        a.getClass();
        j c = this.c.c(a.b);
        c.getClass();
        com.amazon.aps.iva.cq.b.C(c.c(a.c, a.d));
        long a2 = l.a(c.e);
        if (a2 != -1) {
            if (a.c + a.d <= a2) {
                z = true;
            } else {
                z = false;
            }
            com.amazon.aps.iva.cq.b.C(z);
        }
        if (this.d != null) {
            try {
                this.d.d(a.d, a.g, file.getName());
            } catch (IOException e) {
                throw new a.C0842a(e);
            }
        }
        l(a);
        try {
            this.c.g();
            notifyAll();
        } catch (IOException e2) {
            throw new a.C0842a(e2);
        }
    }

    @Override // com.amazon.aps.iva.x5.a
    public final synchronized void j(String str) {
        TreeSet<h> treeSet;
        synchronized (this) {
            j c = this.c.c(str);
            if (c != null && !c.c.isEmpty()) {
                treeSet = new TreeSet((Collection) c.c);
            }
            treeSet = new TreeSet();
        }
        for (h hVar : treeSet) {
            p(hVar);
        }
    }

    public final void l(s sVar) {
        k kVar = this.c;
        String str = sVar.b;
        kVar.d(str).c.add(sVar);
        ArrayList<a.b> arrayList = this.e.get(str);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                arrayList.get(size).a();
            }
        }
        this.b.a();
    }

    public final void o(File file, boolean z, File[] fileArr, HashMap hashMap) {
        e eVar;
        long j2;
        long j3;
        if (fileArr != null && fileArr.length != 0) {
            for (File file2 : fileArr) {
                String name = file2.getName();
                if (z && name.indexOf(46) == -1) {
                    o(file2, false, file2.listFiles(), hashMap);
                } else if (!z || (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid"))) {
                    if (hashMap != null) {
                        eVar = (e) hashMap.remove(name);
                    } else {
                        eVar = null;
                    }
                    if (eVar != null) {
                        j3 = eVar.a;
                        j2 = eVar.b;
                    } else {
                        j2 = -9223372036854775807L;
                        j3 = -1;
                    }
                    s a = s.a(file2, j3, j2, this.c);
                    if (a != null) {
                        l(a);
                    } else {
                        file2.delete();
                    }
                }
            }
        } else if (!z) {
            file.delete();
        }
    }

    public final void p(h hVar) {
        boolean z;
        String str = hVar.b;
        k kVar = this.c;
        j c = kVar.c(str);
        if (c != null) {
            boolean remove = c.c.remove(hVar);
            File file = hVar.f;
            if (remove) {
                if (file != null) {
                    file.delete();
                }
                z = true;
            } else {
                z = false;
            }
            if (z) {
                f fVar = this.d;
                if (fVar != null) {
                    String name = file.getName();
                    try {
                        fVar.b.getClass();
                        try {
                            fVar.a.getWritableDatabase().delete(fVar.b, "name = ?", new String[]{name});
                        } catch (SQLException e) {
                            throw new com.amazon.aps.iva.v5.a(e);
                        }
                    } catch (IOException unused) {
                        com.amazon.aps.iva.t5.p.g();
                    }
                }
                kVar.f(c.b);
                ArrayList<a.b> arrayList = this.e.get(hVar.b);
                if (arrayList != null) {
                    int size = arrayList.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        arrayList.get(size).c();
                    }
                }
                this.b.c();
            }
        }
    }

    public final void q() {
        ArrayList arrayList = new ArrayList();
        for (j jVar : Collections.unmodifiableCollection(this.c.a.values())) {
            Iterator<s> it = jVar.c.iterator();
            while (it.hasNext()) {
                s next = it.next();
                if (next.f.length() != next.d) {
                    arrayList.add(next);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            p((h) arrayList.get(i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.x5.s r(java.lang.String r19, com.amazon.aps.iva.x5.s r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            boolean r2 = r0.g
            if (r2 != 0) goto L9
            return r1
        L9:
            java.io.File r2 = r1.f
            r2.getClass()
            java.lang.String r8 = r2.getName()
            long r4 = r1.d
            long r15 = java.lang.System.currentTimeMillis()
            com.amazon.aps.iva.x5.f r3 = r0.d
            if (r3 == 0) goto L26
            r6 = r15
            r3.d(r4, r6, r8)     // Catch: java.io.IOException -> L21
            goto L24
        L21:
            com.amazon.aps.iva.t5.p.g()
        L24:
            r3 = 0
            goto L27
        L26:
            r3 = 1
        L27:
            com.amazon.aps.iva.x5.k r4 = r0.c
            r5 = r19
            com.amazon.aps.iva.x5.j r4 = r4.c(r5)
            java.util.TreeSet<com.amazon.aps.iva.x5.s> r5 = r4.c
            boolean r6 = r5.remove(r1)
            com.amazon.aps.iva.cq.b.C(r6)
            r2.getClass()
            if (r3 == 0) goto L5f
            java.io.File r9 = r2.getParentFile()
            r9.getClass()
            long r11 = r1.c
            int r10 = r4.a
            r13 = r15
            java.io.File r3 = com.amazon.aps.iva.x5.s.b(r9, r10, r11, r13)
            boolean r4 = r2.renameTo(r3)
            if (r4 == 0) goto L56
            r17 = r3
            goto L61
        L56:
            r2.toString()
            r3.toString()
            com.amazon.aps.iva.t5.p.g()
        L5f:
            r17 = r2
        L61:
            boolean r2 = r1.e
            com.amazon.aps.iva.cq.b.C(r2)
            com.amazon.aps.iva.x5.s r2 = new com.amazon.aps.iva.x5.s
            java.lang.String r10 = r1.b
            long r11 = r1.c
            long r13 = r1.d
            r9 = r2
            r9.<init>(r10, r11, r13, r15, r17)
            r5.add(r2)
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.amazon.aps.iva.x5.a$b>> r3 = r0.e
            java.lang.String r1 = r1.b
            java.lang.Object r1 = r3.get(r1)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            if (r1 == 0) goto L93
            int r3 = r1.size()
        L85:
            int r3 = r3 + (-1)
            if (r3 < 0) goto L93
            java.lang.Object r4 = r1.get(r3)
            com.amazon.aps.iva.x5.a$b r4 = (com.amazon.aps.iva.x5.a.b) r4
            r4.b()
            goto L85
        L93:
            com.amazon.aps.iva.x5.d r1 = r0.b
            r1.b()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.x5.r.r(java.lang.String, com.amazon.aps.iva.x5.s):com.amazon.aps.iva.x5.s");
    }
}
