package com.amazon.aps.iva.rc;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.amazon.aps.iva.lc.d;
import com.amazon.aps.iva.rc.o;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: DirectResourceLoader.java */
/* loaded from: classes.dex */
public final class e<DataT> implements o<Integer, DataT> {
    public final Context a;
    public final InterfaceC0675e<DataT> b;

    /* compiled from: DirectResourceLoader.java */
    /* renamed from: com.amazon.aps.iva.rc.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0675e<DataT> {
        Class<DataT> a();

        void b(DataT datat) throws IOException;

        Object c(Resources resources, int i, Resources.Theme theme);
    }

    public e(Context context, InterfaceC0675e<DataT> interfaceC0675e) {
        this.a = context.getApplicationContext();
        this.b = interfaceC0675e;
    }

    @Override // com.amazon.aps.iva.rc.o
    public final o.a buildLoadData(Integer num, int i, int i2, com.amazon.aps.iva.kc.h hVar) {
        Resources resources;
        Integer num2 = num;
        Resources.Theme theme = (Resources.Theme) hVar.c(com.amazon.aps.iva.wc.i.b);
        if (theme != null) {
            resources = theme.getResources();
        } else {
            resources = this.a.getResources();
        }
        return new o.a(new com.amazon.aps.iva.gd.b(num2), new d(theme, resources, this.b, num2.intValue()));
    }

    @Override // com.amazon.aps.iva.rc.o
    public final /* bridge */ /* synthetic */ boolean handles(Integer num) {
        return true;
    }

    /* compiled from: DirectResourceLoader.java */
    /* loaded from: classes.dex */
    public static final class a implements p<Integer, AssetFileDescriptor>, InterfaceC0675e<AssetFileDescriptor> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // com.amazon.aps.iva.rc.e.InterfaceC0675e
        public final Class<AssetFileDescriptor> a() {
            return AssetFileDescriptor.class;
        }

        @Override // com.amazon.aps.iva.rc.e.InterfaceC0675e
        public final void b(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        @Override // com.amazon.aps.iva.rc.p
        public final o<Integer, AssetFileDescriptor> build(s sVar) {
            return new e(this.a, this);
        }

        @Override // com.amazon.aps.iva.rc.e.InterfaceC0675e
        public final Object c(Resources resources, int i, Resources.Theme theme) {
            return resources.openRawResourceFd(i);
        }

        @Override // com.amazon.aps.iva.rc.p
        public final void teardown() {
        }
    }

    /* compiled from: DirectResourceLoader.java */
    /* loaded from: classes.dex */
    public static final class b implements p<Integer, Drawable>, InterfaceC0675e<Drawable> {
        public final Context a;

        public b(Context context) {
            this.a = context;
        }

        @Override // com.amazon.aps.iva.rc.e.InterfaceC0675e
        public final Class<Drawable> a() {
            return Drawable.class;
        }

        @Override // com.amazon.aps.iva.rc.e.InterfaceC0675e
        public final /* bridge */ /* synthetic */ void b(Drawable drawable) throws IOException {
        }

        @Override // com.amazon.aps.iva.rc.p
        public final o<Integer, Drawable> build(s sVar) {
            return new e(this.a, this);
        }

        @Override // com.amazon.aps.iva.rc.e.InterfaceC0675e
        public final Object c(Resources resources, int i, Resources.Theme theme) {
            Context context = this.a;
            return com.amazon.aps.iva.wc.e.a(context, context, i, theme);
        }

        @Override // com.amazon.aps.iva.rc.p
        public final void teardown() {
        }
    }

    /* compiled from: DirectResourceLoader.java */
    /* loaded from: classes.dex */
    public static final class c implements p<Integer, InputStream>, InterfaceC0675e<InputStream> {
        public final Context a;

        public c(Context context) {
            this.a = context;
        }

        @Override // com.amazon.aps.iva.rc.e.InterfaceC0675e
        public final Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // com.amazon.aps.iva.rc.e.InterfaceC0675e
        public final void b(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        @Override // com.amazon.aps.iva.rc.p
        public final o<Integer, InputStream> build(s sVar) {
            return new e(this.a, this);
        }

        @Override // com.amazon.aps.iva.rc.e.InterfaceC0675e
        public final Object c(Resources resources, int i, Resources.Theme theme) {
            return resources.openRawResource(i);
        }

        @Override // com.amazon.aps.iva.rc.p
        public final void teardown() {
        }
    }

    /* compiled from: DirectResourceLoader.java */
    /* loaded from: classes.dex */
    public static final class d<DataT> implements com.amazon.aps.iva.lc.d<DataT> {
        public final Resources.Theme b;
        public final Resources c;
        public final InterfaceC0675e<DataT> d;
        public final int e;
        public DataT f;

        public d(Resources.Theme theme, Resources resources, InterfaceC0675e<DataT> interfaceC0675e, int i) {
            this.b = theme;
            this.c = resources;
            this.d = interfaceC0675e;
            this.e = i;
        }

        @Override // com.amazon.aps.iva.lc.d
        public final Class<DataT> a() {
            return this.d.a();
        }

        @Override // com.amazon.aps.iva.lc.d
        public final void b() {
            DataT datat = this.f;
            if (datat != null) {
                try {
                    this.d.b(datat);
                } catch (IOException unused) {
                }
            }
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [DataT, java.lang.Object] */
        @Override // com.amazon.aps.iva.lc.d
        public final void d(com.amazon.aps.iva.ec.c cVar, d.a<? super DataT> aVar) {
            try {
                ?? r4 = (DataT) this.d.c(this.c, this.e, this.b);
                this.f = r4;
                aVar.f(r4);
            } catch (Resources.NotFoundException e) {
                aVar.c(e);
            }
        }

        @Override // com.amazon.aps.iva.lc.d
        public final com.amazon.aps.iva.kc.a e() {
            return com.amazon.aps.iva.kc.a.LOCAL;
        }

        @Override // com.amazon.aps.iva.lc.d
        public final void cancel() {
        }
    }
}
