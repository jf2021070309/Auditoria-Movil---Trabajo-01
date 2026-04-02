package com.amazon.aps.iva.vb0;

import com.amazon.aps.iva.lb0.o0;
import com.amazon.aps.iva.ne0.h;
import com.amazon.aps.iva.yb0.j;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
/* compiled from: FileTreeWalk.kt */
/* loaded from: classes4.dex */
public final class b implements h<File> {
    public final File a;
    public final com.amazon.aps.iva.vb0.c b;
    public final int c;

    /* compiled from: FileTreeWalk.kt */
    /* loaded from: classes4.dex */
    public static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File file) {
            super(file);
            j.f(file, "rootDir");
        }
    }

    /* compiled from: FileTreeWalk.kt */
    /* renamed from: com.amazon.aps.iva.vb0.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public final class C0793b extends com.amazon.aps.iva.lb0.b<File> {
        public final ArrayDeque<c> d;

        /* compiled from: FileTreeWalk.kt */
        /* renamed from: com.amazon.aps.iva.vb0.b$b$a */
        /* loaded from: classes4.dex */
        public final class a extends a {
            public boolean b;
            public File[] c;
            public int d;
            public boolean e;
            public final /* synthetic */ C0793b f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0793b c0793b, File file) {
                super(file);
                j.f(file, "rootDir");
                this.f = c0793b;
            }

            @Override // com.amazon.aps.iva.vb0.b.c
            public final File a() {
                boolean z = this.e;
                File file = this.a;
                C0793b c0793b = this.f;
                if (!z && this.c == null) {
                    b.this.getClass();
                    File[] listFiles = file.listFiles();
                    this.c = listFiles;
                    if (listFiles == null) {
                        b.this.getClass();
                        this.e = true;
                    }
                }
                File[] fileArr = this.c;
                if (fileArr != null) {
                    int i = this.d;
                    j.c(fileArr);
                    if (i < fileArr.length) {
                        File[] fileArr2 = this.c;
                        j.c(fileArr2);
                        int i2 = this.d;
                        this.d = i2 + 1;
                        return fileArr2[i2];
                    }
                }
                if (!this.b) {
                    this.b = true;
                    return file;
                }
                b.this.getClass();
                return null;
            }
        }

        /* compiled from: FileTreeWalk.kt */
        /* renamed from: com.amazon.aps.iva.vb0.b$b$b  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public final class C0794b extends c {
            public boolean b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0794b(File file) {
                super(file);
                j.f(file, "rootFile");
            }

            @Override // com.amazon.aps.iva.vb0.b.c
            public final File a() {
                if (this.b) {
                    return null;
                }
                this.b = true;
                return this.a;
            }
        }

        /* compiled from: FileTreeWalk.kt */
        /* renamed from: com.amazon.aps.iva.vb0.b$b$c */
        /* loaded from: classes4.dex */
        public final class c extends a {
            public boolean b;
            public File[] c;
            public int d;
            public final /* synthetic */ C0793b e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(C0793b c0793b, File file) {
                super(file);
                j.f(file, "rootDir");
                this.e = c0793b;
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
                if (r0.length == 0) goto L21;
             */
            @Override // com.amazon.aps.iva.vb0.b.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.io.File a() {
                /*
                    r5 = this;
                    boolean r0 = r5.b
                    java.io.File r1 = r5.a
                    com.amazon.aps.iva.vb0.b$b r2 = r5.e
                    if (r0 != 0) goto L11
                    com.amazon.aps.iva.vb0.b r0 = com.amazon.aps.iva.vb0.b.this
                    r0.getClass()
                    r0 = 1
                    r5.b = r0
                    return r1
                L11:
                    java.io.File[] r0 = r5.c
                    r3 = 0
                    if (r0 == 0) goto L25
                    int r4 = r5.d
                    com.amazon.aps.iva.yb0.j.c(r0)
                    int r0 = r0.length
                    if (r4 >= r0) goto L1f
                    goto L25
                L1f:
                    com.amazon.aps.iva.vb0.b r0 = com.amazon.aps.iva.vb0.b.this
                    r0.getClass()
                    return r3
                L25:
                    java.io.File[] r0 = r5.c
                    if (r0 != 0) goto L46
                    java.io.File[] r0 = r1.listFiles()
                    r5.c = r0
                    if (r0 != 0) goto L36
                    com.amazon.aps.iva.vb0.b r0 = com.amazon.aps.iva.vb0.b.this
                    r0.getClass()
                L36:
                    java.io.File[] r0 = r5.c
                    if (r0 == 0) goto L40
                    com.amazon.aps.iva.yb0.j.c(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L46
                L40:
                    com.amazon.aps.iva.vb0.b r0 = com.amazon.aps.iva.vb0.b.this
                    r0.getClass()
                    return r3
                L46:
                    java.io.File[] r0 = r5.c
                    com.amazon.aps.iva.yb0.j.c(r0)
                    int r1 = r5.d
                    int r2 = r1 + 1
                    r5.d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.vb0.b.C0793b.c.a():java.io.File");
            }
        }

        /* compiled from: FileTreeWalk.kt */
        /* renamed from: com.amazon.aps.iva.vb0.b$b$d */
        /* loaded from: classes4.dex */
        public /* synthetic */ class d {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[com.amazon.aps.iva.vb0.c.values().length];
                try {
                    iArr[com.amazon.aps.iva.vb0.c.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[com.amazon.aps.iva.vb0.c.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                a = iArr;
            }
        }

        public C0793b() {
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.d = arrayDeque;
            boolean isDirectory = b.this.a.isDirectory();
            File file = b.this.a;
            if (isDirectory) {
                arrayDeque.push(c(file));
            } else if (file.isFile()) {
                arrayDeque.push(new C0794b(file));
            } else {
                this.b = o0.Done;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amazon.aps.iva.lb0.b
        public final void b() {
            T t;
            File a2;
            while (true) {
                ArrayDeque<c> arrayDeque = this.d;
                c peek = arrayDeque.peek();
                if (peek == null) {
                    t = 0;
                    break;
                }
                a2 = peek.a();
                if (a2 == null) {
                    arrayDeque.pop();
                } else if (j.a(a2, peek.a) || !a2.isDirectory() || arrayDeque.size() >= b.this.c) {
                    break;
                } else {
                    arrayDeque.push(c(a2));
                }
            }
            t = a2;
            if (t != 0) {
                this.c = t;
                this.b = o0.Ready;
                return;
            }
            this.b = o0.Done;
        }

        public final a c(File file) {
            int i = d.a[b.this.b.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return new a(this, file);
                }
                throw new com.amazon.aps.iva.kb0.h();
            }
            return new c(this, file);
        }
    }

    /* compiled from: FileTreeWalk.kt */
    /* loaded from: classes4.dex */
    public static abstract class c {
        public final File a;

        public c(File file) {
            j.f(file, "root");
            this.a = file;
        }

        public abstract File a();
    }

    public b(File file, com.amazon.aps.iva.vb0.c cVar) {
        j.f(file, "start");
        this.a = file;
        this.b = cVar;
        this.c = Integer.MAX_VALUE;
    }

    @Override // com.amazon.aps.iva.ne0.h
    public final Iterator<File> iterator() {
        return new C0793b();
    }
}
