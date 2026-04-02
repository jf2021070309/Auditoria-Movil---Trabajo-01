package com.amazon.aps.iva.wc;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.amazon.aps.iva.hd.l;
import com.amazon.aps.iva.nc.w;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
/* compiled from: AnimatedImageDecoder.java */
/* loaded from: classes.dex */
public final class d {
    public final List<ImageHeaderParser> a;
    public final com.amazon.aps.iva.oc.b b;

    /* compiled from: AnimatedImageDecoder.java */
    /* loaded from: classes.dex */
    public static final class a implements w<Drawable> {
        public final AnimatedImageDrawable b;

        public a(AnimatedImageDrawable animatedImageDrawable) {
            this.b = animatedImageDrawable;
        }

        @Override // com.amazon.aps.iva.nc.w
        public final int a() {
            int intrinsicWidth;
            int intrinsicHeight;
            AnimatedImageDrawable animatedImageDrawable = this.b;
            intrinsicWidth = animatedImageDrawable.getIntrinsicWidth();
            intrinsicHeight = animatedImageDrawable.getIntrinsicHeight();
            int i = intrinsicHeight * intrinsicWidth;
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            char[] cArr = l.a;
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            int i2 = l.a.a[config.ordinal()];
            int i3 = 1;
            if (i2 != 1) {
                if (i2 != 2 && i2 != 3) {
                    i3 = 4;
                    if (i2 == 4) {
                        i3 = 8;
                    }
                } else {
                    i3 = 2;
                }
            }
            return i3 * i * 2;
        }

        @Override // com.amazon.aps.iva.nc.w
        public final void b() {
            AnimatedImageDrawable animatedImageDrawable = this.b;
            animatedImageDrawable.stop();
            animatedImageDrawable.clearAnimationCallbacks();
        }

        @Override // com.amazon.aps.iva.nc.w
        public final Class<Drawable> d() {
            return Drawable.class;
        }

        @Override // com.amazon.aps.iva.nc.w
        public final Drawable get() {
            return this.b;
        }
    }

    /* compiled from: AnimatedImageDecoder.java */
    /* loaded from: classes.dex */
    public static final class b implements com.amazon.aps.iva.kc.j<ByteBuffer, Drawable> {
        public final d a;

        public b(d dVar) {
            this.a = dVar;
        }

        @Override // com.amazon.aps.iva.kc.j
        public final w<Drawable> a(ByteBuffer byteBuffer, int i, int i2, com.amazon.aps.iva.kc.h hVar) throws IOException {
            ImageDecoder.Source createSource;
            createSource = ImageDecoder.createSource(byteBuffer);
            this.a.getClass();
            return d.a(createSource, i, i2, hVar);
        }

        @Override // com.amazon.aps.iva.kc.j
        public final boolean b(ByteBuffer byteBuffer, com.amazon.aps.iva.kc.h hVar) throws IOException {
            ImageHeaderParser.ImageType c = com.bumptech.glide.load.a.c(this.a.a, byteBuffer);
            if (c != ImageHeaderParser.ImageType.ANIMATED_WEBP && (Build.VERSION.SDK_INT < 31 || c != ImageHeaderParser.ImageType.ANIMATED_AVIF)) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: AnimatedImageDecoder.java */
    /* loaded from: classes.dex */
    public static final class c implements com.amazon.aps.iva.kc.j<InputStream, Drawable> {
        public final d a;

        public c(d dVar) {
            this.a = dVar;
        }

        @Override // com.amazon.aps.iva.kc.j
        public final w<Drawable> a(InputStream inputStream, int i, int i2, com.amazon.aps.iva.kc.h hVar) throws IOException {
            ImageDecoder.Source createSource;
            createSource = ImageDecoder.createSource(com.amazon.aps.iva.hd.a.b(inputStream));
            this.a.getClass();
            return d.a(createSource, i, i2, hVar);
        }

        @Override // com.amazon.aps.iva.kc.j
        public final boolean b(InputStream inputStream, com.amazon.aps.iva.kc.h hVar) throws IOException {
            d dVar = this.a;
            List<ImageHeaderParser> list = dVar.a;
            ImageHeaderParser.ImageType b = com.bumptech.glide.load.a.b(dVar.b, inputStream, list);
            if (b != ImageHeaderParser.ImageType.ANIMATED_WEBP && (Build.VERSION.SDK_INT < 31 || b != ImageHeaderParser.ImageType.ANIMATED_AVIF)) {
                return false;
            }
            return true;
        }
    }

    public d(List<ImageHeaderParser> list, com.amazon.aps.iva.oc.b bVar) {
        this.a = list;
        this.b = bVar;
    }

    public static a a(ImageDecoder.Source source, int i, int i2, com.amazon.aps.iva.kc.h hVar) throws IOException {
        Drawable decodeDrawable;
        decodeDrawable = ImageDecoder.decodeDrawable(source, new com.amazon.aps.iva.tc.a(i, i2, hVar));
        if (com.amazon.aps.iva.wc.a.b(decodeDrawable)) {
            return new a(com.amazon.aps.iva.q3.j.a(decodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + decodeDrawable);
    }
}
