package e.c.a.m.u;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import e.c.a.m.m;
import e.c.a.m.n;
import e.c.a.m.o;
import e.c.a.m.s.w;
import e.c.a.m.u.c.d;
import e.c.a.m.u.c.e;
import e.c.a.m.u.c.l;
import e.c.a.m.u.c.r;
import java.io.IOException;
/* loaded from: classes.dex */
public abstract class a<T> implements o<ImageDecoder.Source, T> {
    public final r a = r.a();

    /* renamed from: e.c.a.m.u.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0125a implements ImageDecoder.OnHeaderDecodedListener {
        public final /* synthetic */ int a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f5841b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ boolean f5842c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ e.c.a.m.b f5843d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ l f5844e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ n f5845f;

        /* renamed from: e.c.a.m.u.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0126a implements ImageDecoder.OnPartialImageListener {
            public C0126a(C0125a c0125a) {
            }

            @Override // android.graphics.ImageDecoder.OnPartialImageListener
            public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                return false;
            }
        }

        public C0125a(int i2, int i3, boolean z, e.c.a.m.b bVar, l lVar, n nVar) {
            this.a = i2;
            this.f5841b = i3;
            this.f5842c = z;
            this.f5843d = bVar;
            this.f5844e = lVar;
            this.f5845f = nVar;
        }

        @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
        @SuppressLint({"Override"})
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            boolean z = false;
            if (a.this.a.b(this.a, this.f5841b, this.f5842c, false)) {
                imageDecoder.setAllocator(3);
            } else {
                imageDecoder.setAllocator(1);
            }
            if (this.f5843d == e.c.a.m.b.PREFER_RGB_565) {
                imageDecoder.setMemorySizePolicy(0);
            }
            imageDecoder.setOnPartialImageListener(new C0126a(this));
            Size size = imageInfo.getSize();
            int i2 = this.a;
            if (i2 == Integer.MIN_VALUE) {
                i2 = size.getWidth();
            }
            int i3 = this.f5841b;
            if (i3 == Integer.MIN_VALUE) {
                i3 = size.getHeight();
            }
            float b2 = this.f5844e.b(size.getWidth(), size.getHeight(), i2, i3);
            int round = Math.round(size.getWidth() * b2);
            int round2 = Math.round(b2 * size.getHeight());
            if (Log.isLoggable("ImageDecoder", 2)) {
                size.getWidth();
                size.getHeight();
            }
            imageDecoder.setTargetSize(round, round2);
            int i4 = Build.VERSION.SDK_INT;
            if (i4 < 28) {
                if (i4 >= 26) {
                    imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
                    return;
                }
                return;
            }
            if (this.f5845f == n.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                z = true;
            }
            imageDecoder.setTargetColorSpace(ColorSpace.get(z ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
        }
    }

    @Override // e.c.a.m.o
    public /* bridge */ /* synthetic */ boolean a(ImageDecoder.Source source, m mVar) throws IOException {
        return true;
    }

    @Override // e.c.a.m.o
    /* renamed from: c */
    public final w<T> b(ImageDecoder.Source source, int i2, int i3, m mVar) throws IOException {
        e.c.a.m.b bVar = (e.c.a.m.b) mVar.c(e.c.a.m.u.c.m.a);
        l lVar = (l) mVar.c(l.f5867g);
        e.c.a.m.l<Boolean> lVar2 = e.c.a.m.u.c.m.f5871d;
        C0125a c0125a = new C0125a(i2, i3, mVar.c(lVar2) != null && ((Boolean) mVar.c(lVar2)).booleanValue(), bVar, lVar, (n) mVar.c(e.c.a.m.u.c.m.f5869b));
        d dVar = (d) this;
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, c0125a);
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            decodeBitmap.getWidth();
            decodeBitmap.getHeight();
        }
        return new e(decodeBitmap, dVar.f5857b);
    }
}
