package e.c.a.m.t;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import e.c.a.m.r.d;
import e.c.a.m.t.n;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public class f<Data> implements n<File, Data> {
    public final d<Data> a;

    /* loaded from: classes.dex */
    public static class a<Data> implements o<File, Data> {
        public final d<Data> a;

        public a(d<Data> dVar) {
            this.a = dVar;
        }

        @Override // e.c.a.m.t.o
        public final n<File, Data> b(r rVar) {
            return new f(this.a);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a<ParcelFileDescriptor> {

        /* loaded from: classes.dex */
        public class a implements d<ParcelFileDescriptor> {
            @Override // e.c.a.m.t.f.d
            public Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            @Override // e.c.a.m.t.f.d
            public ParcelFileDescriptor b(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }

            @Override // e.c.a.m.t.f.d
            public void c(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }
        }

        public b() {
            super(new a());
        }
    }

    /* loaded from: classes.dex */
    public static final class c<Data> implements e.c.a.m.r.d<Data> {
        public final File a;

        /* renamed from: b  reason: collision with root package name */
        public final d<Data> f5787b;

        /* renamed from: c  reason: collision with root package name */
        public Data f5788c;

        public c(File file, d<Data> dVar) {
            this.a = file;
            this.f5787b = dVar;
        }

        @Override // e.c.a.m.r.d
        public Class<Data> a() {
            return this.f5787b.a();
        }

        @Override // e.c.a.m.r.d
        public void b() {
            Data data = this.f5788c;
            if (data != null) {
                try {
                    this.f5787b.c(data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // e.c.a.m.r.d
        public void cancel() {
        }

        @Override // e.c.a.m.r.d
        public e.c.a.m.a d() {
            return e.c.a.m.a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, Data] */
        @Override // e.c.a.m.r.d
        public void e(e.c.a.f fVar, d.a<? super Data> aVar) {
            try {
                Data b2 = this.f5787b.b(this.a);
                this.f5788c = b2;
                aVar.f(b2);
            } catch (FileNotFoundException e2) {
                Log.isLoggable("FileLoader", 3);
                aVar.c(e2);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d<Data> {
        Class<Data> a();

        Data b(File file) throws FileNotFoundException;

        void c(Data data) throws IOException;
    }

    /* loaded from: classes.dex */
    public static class e extends a<InputStream> {

        /* loaded from: classes.dex */
        public class a implements d<InputStream> {
            @Override // e.c.a.m.t.f.d
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // e.c.a.m.t.f.d
            public InputStream b(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }

            @Override // e.c.a.m.t.f.d
            public void c(InputStream inputStream) throws IOException {
                inputStream.close();
            }
        }

        public e() {
            super(new a());
        }
    }

    public f(d<Data> dVar) {
        this.a = dVar;
    }

    @Override // e.c.a.m.t.n
    public /* bridge */ /* synthetic */ boolean a(File file) {
        return true;
    }

    @Override // e.c.a.m.t.n
    public n.a b(File file, int i2, int i3, e.c.a.m.m mVar) {
        File file2 = file;
        return new n.a(new e.c.a.r.b(file2), new c(file2, this.a));
    }
}
