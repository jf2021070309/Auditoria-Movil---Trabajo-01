package com.amazon.aps.iva.rc;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.amazon.aps.iva.lc.d;
import com.amazon.aps.iva.rc.o;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: FileLoader.java */
/* loaded from: classes.dex */
public final class f<Data> implements o<File, Data> {
    public final d<Data> a;

    /* compiled from: FileLoader.java */
    /* loaded from: classes.dex */
    public static class b extends a<ParcelFileDescriptor> {

        /* compiled from: FileLoader.java */
        /* loaded from: classes.dex */
        public class a implements d<ParcelFileDescriptor> {
            @Override // com.amazon.aps.iva.rc.f.d
            public final Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            @Override // com.amazon.aps.iva.rc.f.d
            public final void b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // com.amazon.aps.iva.rc.f.d
            public final ParcelFileDescriptor c(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    /* compiled from: FileLoader.java */
    /* loaded from: classes.dex */
    public interface d<Data> {
        Class<Data> a();

        void b(Data data) throws IOException;

        Data c(File file) throws FileNotFoundException;
    }

    /* compiled from: FileLoader.java */
    /* loaded from: classes.dex */
    public static class e extends a<InputStream> {

        /* compiled from: FileLoader.java */
        /* loaded from: classes.dex */
        public class a implements d<InputStream> {
            @Override // com.amazon.aps.iva.rc.f.d
            public final Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // com.amazon.aps.iva.rc.f.d
            public final void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // com.amazon.aps.iva.rc.f.d
            public final InputStream c(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public f(d<Data> dVar) {
        this.a = dVar;
    }

    @Override // com.amazon.aps.iva.rc.o
    public final o.a buildLoadData(File file, int i, int i2, com.amazon.aps.iva.kc.h hVar) {
        File file2 = file;
        return new o.a(new com.amazon.aps.iva.gd.b(file2), new c(file2, this.a));
    }

    @Override // com.amazon.aps.iva.rc.o
    public final /* bridge */ /* synthetic */ boolean handles(File file) {
        return true;
    }

    /* compiled from: FileLoader.java */
    /* loaded from: classes.dex */
    public static class a<Data> implements p<File, Data> {
        public final d<Data> a;

        public a(d<Data> dVar) {
            this.a = dVar;
        }

        @Override // com.amazon.aps.iva.rc.p
        public final o<File, Data> build(s sVar) {
            return new f(this.a);
        }

        @Override // com.amazon.aps.iva.rc.p
        public final void teardown() {
        }
    }

    /* compiled from: FileLoader.java */
    /* loaded from: classes.dex */
    public static final class c<Data> implements com.amazon.aps.iva.lc.d<Data> {
        public final File b;
        public final d<Data> c;
        public Data d;

        public c(File file, d<Data> dVar) {
            this.b = file;
            this.c = dVar;
        }

        @Override // com.amazon.aps.iva.lc.d
        public final Class<Data> a() {
            return this.c.a();
        }

        @Override // com.amazon.aps.iva.lc.d
        public final void b() {
            Data data = this.d;
            if (data != null) {
                try {
                    this.c.b(data);
                } catch (IOException unused) {
                }
            }
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, Data] */
        @Override // com.amazon.aps.iva.lc.d
        public final void d(com.amazon.aps.iva.ec.c cVar, d.a<? super Data> aVar) {
            try {
                Data c = this.c.c(this.b);
                this.d = c;
                aVar.f(c);
            } catch (FileNotFoundException e) {
                Log.isLoggable("FileLoader", 3);
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
