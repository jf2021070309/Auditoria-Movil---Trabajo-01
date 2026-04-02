package com.amazon.aps.iva.hd0;

import com.amazon.aps.iva.gd0.t;
import com.amazon.aps.iva.hd0.a;
import com.amazon.aps.iva.xc0.d0;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
/* loaded from: classes4.dex */
public final class b implements t.c {
    public static final boolean i = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
    public static final HashMap j;
    public int[] a = null;
    public String b = null;
    public int c = 0;
    public String[] d = null;
    public String[] e = null;
    public String[] f = null;
    public a.EnumC0334a g = null;
    public String[] h = null;

    static {
        HashMap hashMap = new HashMap();
        j = hashMap;
        hashMap.put(com.amazon.aps.iva.nd0.b.l(new com.amazon.aps.iva.nd0.c("kotlin.jvm.internal.KotlinClass")), a.EnumC0334a.CLASS);
        hashMap.put(com.amazon.aps.iva.nd0.b.l(new com.amazon.aps.iva.nd0.c("kotlin.jvm.internal.KotlinFileFacade")), a.EnumC0334a.FILE_FACADE);
        hashMap.put(com.amazon.aps.iva.nd0.b.l(new com.amazon.aps.iva.nd0.c("kotlin.jvm.internal.KotlinMultifileClass")), a.EnumC0334a.MULTIFILE_CLASS);
        hashMap.put(com.amazon.aps.iva.nd0.b.l(new com.amazon.aps.iva.nd0.c("kotlin.jvm.internal.KotlinMultifileClassPart")), a.EnumC0334a.MULTIFILE_CLASS_PART);
        hashMap.put(com.amazon.aps.iva.nd0.b.l(new com.amazon.aps.iva.nd0.c("kotlin.jvm.internal.KotlinSyntheticClass")), a.EnumC0334a.SYNTHETIC_CLASS);
    }

    @Override // com.amazon.aps.iva.gd0.t.c
    public final t.a b(com.amazon.aps.iva.nd0.b bVar, com.amazon.aps.iva.tc0.b bVar2) {
        a.EnumC0334a enumC0334a;
        com.amazon.aps.iva.nd0.c b = bVar.b();
        if (b.equals(d0.a)) {
            return new C0336b();
        }
        if (b.equals(d0.o)) {
            return new c();
        }
        if (i || this.g != null || (enumC0334a = (a.EnumC0334a) j.get(bVar)) == null) {
            return null;
        }
        this.g = enumC0334a;
        return new d();
    }

    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
    /* renamed from: com.amazon.aps.iva.hd0.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0336b implements t.a {
        public C0336b() {
        }

        @Override // com.amazon.aps.iva.gd0.t.a
        public final t.b b(com.amazon.aps.iva.nd0.f fVar) {
            String b = fVar.b();
            if ("d1".equals(b)) {
                return new com.amazon.aps.iva.hd0.c(this);
            }
            if ("d2".equals(b)) {
                return new com.amazon.aps.iva.hd0.d(this);
            }
            return null;
        }

        @Override // com.amazon.aps.iva.gd0.t.a
        public final void c(Object obj, com.amazon.aps.iva.nd0.f fVar) {
            String b = fVar.b();
            boolean equals = "k".equals(b);
            b bVar = b.this;
            if (equals) {
                if (obj instanceof Integer) {
                    bVar.g = a.EnumC0334a.getById(((Integer) obj).intValue());
                }
            } else if ("mv".equals(b)) {
                if (obj instanceof int[]) {
                    bVar.a = (int[]) obj;
                }
            } else if ("xs".equals(b)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (!str.isEmpty()) {
                        bVar.b = str;
                    }
                }
            } else if ("xi".equals(b)) {
                if (obj instanceof Integer) {
                    bVar.c = ((Integer) obj).intValue();
                }
            } else if ("pn".equals(b) && (obj instanceof String) && !((String) obj).isEmpty()) {
                bVar.getClass();
            }
        }

        @Override // com.amazon.aps.iva.gd0.t.a
        public final t.a d(com.amazon.aps.iva.nd0.b bVar, com.amazon.aps.iva.nd0.f fVar) {
            return null;
        }

        @Override // com.amazon.aps.iva.gd0.t.a
        public final void a() {
        }

        @Override // com.amazon.aps.iva.gd0.t.a
        public final void f(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.sd0.f fVar2) {
        }

        @Override // com.amazon.aps.iva.gd0.t.a
        public final void e(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.nd0.b bVar, com.amazon.aps.iva.nd0.f fVar2) {
        }
    }

    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
    /* loaded from: classes4.dex */
    public class c implements t.a {
        public c() {
        }

        @Override // com.amazon.aps.iva.gd0.t.a
        public final t.b b(com.amazon.aps.iva.nd0.f fVar) {
            if ("b".equals(fVar.b())) {
                return new e(this);
            }
            return null;
        }

        @Override // com.amazon.aps.iva.gd0.t.a
        public final t.a d(com.amazon.aps.iva.nd0.b bVar, com.amazon.aps.iva.nd0.f fVar) {
            return null;
        }

        @Override // com.amazon.aps.iva.gd0.t.a
        public final void a() {
        }

        @Override // com.amazon.aps.iva.gd0.t.a
        public final void c(Object obj, com.amazon.aps.iva.nd0.f fVar) {
        }

        @Override // com.amazon.aps.iva.gd0.t.a
        public final void f(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.sd0.f fVar2) {
        }

        @Override // com.amazon.aps.iva.gd0.t.a
        public final void e(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.nd0.b bVar, com.amazon.aps.iva.nd0.f fVar2) {
        }
    }

    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
    /* loaded from: classes4.dex */
    public class d implements t.a {
        public d() {
        }

        @Override // com.amazon.aps.iva.gd0.t.a
        public final t.b b(com.amazon.aps.iva.nd0.f fVar) {
            String b = fVar.b();
            if (!"data".equals(b) && !"filePartClassNames".equals(b)) {
                if ("strings".equals(b)) {
                    return new g(this);
                }
                return null;
            }
            return new f(this);
        }

        @Override // com.amazon.aps.iva.gd0.t.a
        public final void c(Object obj, com.amazon.aps.iva.nd0.f fVar) {
            String str;
            String b = fVar.b();
            boolean equals = "version".equals(b);
            b bVar = b.this;
            if (equals) {
                if (obj instanceof int[]) {
                    bVar.a = (int[]) obj;
                }
            } else if ("multifileClassName".equals(b)) {
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = null;
                }
                bVar.b = str;
            }
        }

        @Override // com.amazon.aps.iva.gd0.t.a
        public final t.a d(com.amazon.aps.iva.nd0.b bVar, com.amazon.aps.iva.nd0.f fVar) {
            return null;
        }

        @Override // com.amazon.aps.iva.gd0.t.a
        public final void a() {
        }

        @Override // com.amazon.aps.iva.gd0.t.a
        public final void f(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.sd0.f fVar2) {
        }

        @Override // com.amazon.aps.iva.gd0.t.a
        public final void e(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.nd0.b bVar, com.amazon.aps.iva.nd0.f fVar2) {
        }
    }

    @Override // com.amazon.aps.iva.gd0.t.c
    public final void a() {
    }

    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
    /* loaded from: classes4.dex */
    public static abstract class a implements t.b {
        public final ArrayList a = new ArrayList();

        @Override // com.amazon.aps.iva.gd0.t.b
        public final void a() {
            f((String[]) this.a.toArray(new String[0]));
        }

        @Override // com.amazon.aps.iva.gd0.t.b
        public final t.a b(com.amazon.aps.iva.nd0.b bVar) {
            return null;
        }

        @Override // com.amazon.aps.iva.gd0.t.b
        public final void e(Object obj) {
            if (obj instanceof String) {
                this.a.add((String) obj);
            }
        }

        public abstract void f(String[] strArr);

        @Override // com.amazon.aps.iva.gd0.t.b
        public final void c(com.amazon.aps.iva.sd0.f fVar) {
        }

        @Override // com.amazon.aps.iva.gd0.t.b
        public final void d(com.amazon.aps.iva.nd0.b bVar, com.amazon.aps.iva.nd0.f fVar) {
        }
    }
}
