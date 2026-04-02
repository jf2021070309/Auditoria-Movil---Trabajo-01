package e.c.a.m.u.c;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public interface s {

    /* loaded from: classes.dex */
    public static final class a implements s {
        public final e.c.a.m.r.k a;

        /* renamed from: b  reason: collision with root package name */
        public final e.c.a.m.s.c0.b f5890b;

        /* renamed from: c  reason: collision with root package name */
        public final List<ImageHeaderParser> f5891c;

        public a(InputStream inputStream, List<ImageHeaderParser> list, e.c.a.m.s.c0.b bVar) {
            Objects.requireNonNull(bVar, "Argument must not be null");
            this.f5890b = bVar;
            Objects.requireNonNull(list, "Argument must not be null");
            this.f5891c = list;
            this.a = new e.c.a.m.r.k(inputStream, bVar);
        }

        @Override // e.c.a.m.u.c.s
        public int a() throws IOException {
            return c.t.m.j(this.f5891c, this.a.a(), this.f5890b);
        }

        @Override // e.c.a.m.u.c.s
        public Bitmap b(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.a.a(), null, options);
        }

        @Override // e.c.a.m.u.c.s
        public void c() {
            w wVar = this.a.a;
            synchronized (wVar) {
                wVar.f5896c = wVar.a.length;
            }
        }

        @Override // e.c.a.m.u.c.s
        public ImageHeaderParser.ImageType d() throws IOException {
            return c.t.m.n(this.f5891c, this.a.a(), this.f5890b);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements s {
        public final e.c.a.m.s.c0.b a;

        /* renamed from: b  reason: collision with root package name */
        public final List<ImageHeaderParser> f5892b;

        /* renamed from: c  reason: collision with root package name */
        public final e.c.a.m.r.m f5893c;

        public b(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, e.c.a.m.s.c0.b bVar) {
            Objects.requireNonNull(bVar, "Argument must not be null");
            this.a = bVar;
            Objects.requireNonNull(list, "Argument must not be null");
            this.f5892b = list;
            this.f5893c = new e.c.a.m.r.m(parcelFileDescriptor);
        }

        @Override // e.c.a.m.u.c.s
        public int a() throws IOException {
            return c.t.m.k(this.f5892b, new e.c.a.m.h(this.f5893c, this.a));
        }

        @Override // e.c.a.m.u.c.s
        public Bitmap b(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f5893c.a().getFileDescriptor(), null, options);
        }

        @Override // e.c.a.m.u.c.s
        public void c() {
        }

        @Override // e.c.a.m.u.c.s
        public ImageHeaderParser.ImageType d() throws IOException {
            return c.t.m.o(this.f5892b, new e.c.a.m.g(this.f5893c, this.a));
        }
    }

    int a() throws IOException;

    Bitmap b(BitmapFactory.Options options) throws IOException;

    void c();

    ImageHeaderParser.ImageType d() throws IOException;
}
