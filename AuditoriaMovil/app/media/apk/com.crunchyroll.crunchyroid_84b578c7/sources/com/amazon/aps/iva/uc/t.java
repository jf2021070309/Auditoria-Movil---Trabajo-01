package com.amazon.aps.iva.uc;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.amazon.aps.iva.hd.a;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
/* compiled from: ImageReader.java */
/* loaded from: classes.dex */
public interface t {

    /* compiled from: ImageReader.java */
    /* loaded from: classes.dex */
    public static final class b implements t {
        public final com.bumptech.glide.load.data.c a;
        public final com.amazon.aps.iva.oc.b b;
        public final List<ImageHeaderParser> c;

        public b(com.amazon.aps.iva.oc.b bVar, com.amazon.aps.iva.hd.j jVar, List list) {
            defpackage.i.l(bVar);
            this.b = bVar;
            defpackage.i.l(list);
            this.c = list;
            this.a = new com.bumptech.glide.load.data.c(jVar, bVar);
        }

        @Override // com.amazon.aps.iva.uc.t
        public final Bitmap a(BitmapFactory.Options options) throws IOException {
            x xVar = this.a.a;
            xVar.reset();
            return BitmapFactory.decodeStream(xVar, null, options);
        }

        @Override // com.amazon.aps.iva.uc.t
        public final void b() {
            x xVar = this.a.a;
            synchronized (xVar) {
                xVar.d = xVar.b.length;
            }
        }

        @Override // com.amazon.aps.iva.uc.t
        public final int c() throws IOException {
            x xVar = this.a.a;
            xVar.reset();
            return com.bumptech.glide.load.a.a(this.b, xVar, this.c);
        }

        @Override // com.amazon.aps.iva.uc.t
        public final ImageHeaderParser.ImageType d() throws IOException {
            x xVar = this.a.a;
            xVar.reset();
            return com.bumptech.glide.load.a.b(this.b, xVar, this.c);
        }
    }

    Bitmap a(BitmapFactory.Options options) throws IOException;

    void b();

    int c() throws IOException;

    ImageHeaderParser.ImageType d() throws IOException;

    /* compiled from: ImageReader.java */
    /* loaded from: classes.dex */
    public static final class a implements t {
        public final ByteBuffer a;
        public final List<ImageHeaderParser> b;
        public final com.amazon.aps.iva.oc.b c;

        public a(com.amazon.aps.iva.oc.b bVar, ByteBuffer byteBuffer, List list) {
            this.a = byteBuffer;
            this.b = list;
            this.c = bVar;
        }

        @Override // com.amazon.aps.iva.uc.t
        public final Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(new a.C0333a(com.amazon.aps.iva.hd.a.c(this.a)), null, options);
        }

        @Override // com.amazon.aps.iva.uc.t
        public final int c() throws IOException {
            ByteBuffer c = com.amazon.aps.iva.hd.a.c(this.a);
            com.amazon.aps.iva.oc.b bVar = this.c;
            if (c == null) {
                return -1;
            }
            List<ImageHeaderParser> list = this.b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                try {
                    int b = list.get(i).b(c, bVar);
                    if (b != -1) {
                        return b;
                    }
                } finally {
                    com.amazon.aps.iva.hd.a.c(c);
                }
            }
            return -1;
        }

        @Override // com.amazon.aps.iva.uc.t
        public final ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.a.c(this.b, com.amazon.aps.iva.hd.a.c(this.a));
        }

        @Override // com.amazon.aps.iva.uc.t
        public final void b() {
        }
    }

    /* compiled from: ImageReader.java */
    /* loaded from: classes.dex */
    public static final class c implements t {
        public final com.amazon.aps.iva.oc.b a;
        public final List<ImageHeaderParser> b;
        public final ParcelFileDescriptorRewinder c;

        public c(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, com.amazon.aps.iva.oc.b bVar) {
            defpackage.i.l(bVar);
            this.a = bVar;
            defpackage.i.l(list);
            this.b = list;
            this.c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.amazon.aps.iva.uc.t
        public final Bitmap a(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.c.a().getFileDescriptor(), null, options);
        }

        @Override // com.amazon.aps.iva.uc.t
        public final int c() throws IOException {
            x xVar;
            ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.c;
            com.amazon.aps.iva.oc.b bVar = this.a;
            List<ImageHeaderParser> list = this.b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ImageHeaderParser imageHeaderParser = list.get(i);
                try {
                    xVar = new x(new FileInputStream(parcelFileDescriptorRewinder.a().getFileDescriptor()), bVar);
                    try {
                        int a = imageHeaderParser.a(xVar, bVar);
                        xVar.release();
                        parcelFileDescriptorRewinder.a();
                        if (a != -1) {
                            return a;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (xVar != null) {
                            xVar.release();
                        }
                        parcelFileDescriptorRewinder.a();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    xVar = null;
                }
            }
            return -1;
        }

        @Override // com.amazon.aps.iva.uc.t
        public final ImageHeaderParser.ImageType d() throws IOException {
            x xVar;
            ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.c;
            com.amazon.aps.iva.oc.b bVar = this.a;
            List<ImageHeaderParser> list = this.b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ImageHeaderParser imageHeaderParser = list.get(i);
                try {
                    xVar = new x(new FileInputStream(parcelFileDescriptorRewinder.a().getFileDescriptor()), bVar);
                    try {
                        ImageHeaderParser.ImageType d = imageHeaderParser.d(xVar);
                        xVar.release();
                        parcelFileDescriptorRewinder.a();
                        if (d != ImageHeaderParser.ImageType.UNKNOWN) {
                            return d;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (xVar != null) {
                            xVar.release();
                        }
                        parcelFileDescriptorRewinder.a();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    xVar = null;
                }
            }
            return ImageHeaderParser.ImageType.UNKNOWN;
        }

        @Override // com.amazon.aps.iva.uc.t
        public final void b() {
        }
    }
}
