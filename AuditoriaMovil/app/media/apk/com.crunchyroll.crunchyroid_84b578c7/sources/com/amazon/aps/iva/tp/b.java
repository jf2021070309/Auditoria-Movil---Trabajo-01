package com.amazon.aps.iva.tp;

import com.amazon.aps.iva.e4.l1;
import java.io.File;
import java.nio.charset.Charset;
/* compiled from: FileExt.kt */
/* loaded from: classes2.dex */
public final class b {

    /* compiled from: FileExt.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<File, Boolean> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(File file) {
            File file2 = file;
            com.amazon.aps.iva.yb0.j.f(file2, "$this$safeCall");
            return Boolean.valueOf(file2.canRead());
        }
    }

    /* compiled from: FileExt.kt */
    /* renamed from: com.amazon.aps.iva.tp.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0746b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<File, Boolean> {
        public static final C0746b h = new C0746b();

        public C0746b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(File file) {
            File file2 = file;
            com.amazon.aps.iva.yb0.j.f(file2, "$this$safeCall");
            return Boolean.valueOf(file2.exists());
        }
    }

    /* compiled from: FileExt.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<File, Long> {
        public static final c h = new c();

        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Long invoke(File file) {
            File file2 = file;
            com.amazon.aps.iva.yb0.j.f(file2, "$this$safeCall");
            return Long.valueOf(file2.length());
        }
    }

    /* compiled from: FileExt.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<File, Boolean> {
        public static final d h = new d();

        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(File file) {
            File file2 = file;
            com.amazon.aps.iva.yb0.j.f(file2, "$this$safeCall");
            return Boolean.valueOf(file2.mkdirs());
        }
    }

    public static final boolean a(File file) {
        com.amazon.aps.iva.yb0.j.f(file, "<this>");
        return ((Boolean) f(file, Boolean.FALSE, a.h)).booleanValue();
    }

    public static final boolean b(File file) {
        com.amazon.aps.iva.yb0.j.f(file, "<this>");
        return ((Boolean) f(file, Boolean.FALSE, C0746b.h)).booleanValue();
    }

    public static final long c(File file) {
        com.amazon.aps.iva.yb0.j.f(file, "<this>");
        return ((Number) f(file, 0L, c.h)).longValue();
    }

    public static final boolean d(File file) {
        com.amazon.aps.iva.yb0.j.f(file, "<this>");
        return ((Boolean) f(file, Boolean.FALSE, d.h)).booleanValue();
    }

    public static String e(File file) {
        Charset charset = com.amazon.aps.iva.oe0.a.b;
        com.amazon.aps.iva.yb0.j.f(file, "<this>");
        com.amazon.aps.iva.yb0.j.f(charset, "charset");
        if (!b(file) || !a(file)) {
            return null;
        }
        return (String) f(file, null, new j(charset));
    }

    public static final <T> T f(File file, T t, com.amazon.aps.iva.xb0.l<? super File, ? extends T> lVar) {
        try {
            return lVar.invoke(file);
        } catch (SecurityException e) {
            com.amazon.aps.iva.iq.a aVar = com.amazon.aps.iva.dq.c.a;
            String path = file.getPath();
            l1.z(aVar, "Security exception was thrown for file " + path, e, 4);
            return t;
        } catch (Exception e2) {
            com.amazon.aps.iva.iq.a aVar2 = com.amazon.aps.iva.dq.c.a;
            String path2 = file.getPath();
            l1.z(aVar2, "Unexpected exception was thrown for file " + path2, e2, 4);
            return t;
        }
    }
}
