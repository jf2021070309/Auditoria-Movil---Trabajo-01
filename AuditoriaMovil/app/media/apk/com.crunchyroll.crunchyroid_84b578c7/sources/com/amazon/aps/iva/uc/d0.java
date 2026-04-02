package com.amazon.aps.iva.uc;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.amazon.aps.iva.j0.j0;
import com.amazon.aps.iva.kc.g;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: VideoDecoder.java */
/* loaded from: classes.dex */
public final class d0<T> implements com.amazon.aps.iva.kc.j<T, Bitmap> {
    public static final com.amazon.aps.iva.kc.g<Long> d = new com.amazon.aps.iva.kc.g<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());
    public static final com.amazon.aps.iva.kc.g<Integer> e = new com.amazon.aps.iva.kc.g<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());
    public static final f f = new f();
    public static final List<String> g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));
    public final e<T> a;
    public final com.amazon.aps.iva.oc.c b;
    public final f c = f;

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes.dex */
    public class a implements g.b<Long> {
        public final ByteBuffer a = ByteBuffer.allocate(8);

        @Override // com.amazon.aps.iva.kc.g.b
        public final void a(byte[] bArr, Long l, MessageDigest messageDigest) {
            Long l2 = l;
            messageDigest.update(bArr);
            synchronized (this.a) {
                this.a.position(0);
                messageDigest.update(this.a.putLong(l2.longValue()).array());
            }
        }
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes.dex */
    public class b implements g.b<Integer> {
        public final ByteBuffer a = ByteBuffer.allocate(4);

        @Override // com.amazon.aps.iva.kc.g.b
        public final void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            Integer num2 = num;
            if (num2 != null) {
                messageDigest.update(bArr);
                synchronized (this.a) {
                    this.a.position(0);
                    messageDigest.update(this.a.putInt(num2.intValue()).array());
                }
            }
        }
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes.dex */
    public static final class c implements e<AssetFileDescriptor> {
        @Override // com.amazon.aps.iva.uc.d0.e
        public final void a(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) throws IOException {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaExtractor.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }

        @Override // com.amazon.aps.iva.uc.d0.e
        public final void b(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes.dex */
    public static final class d implements e<ByteBuffer> {
        @Override // com.amazon.aps.iva.uc.d0.e
        public final void a(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) throws IOException {
            mediaExtractor.setDataSource(new e0(byteBuffer));
        }

        @Override // com.amazon.aps.iva.uc.d0.e
        public final void b(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new e0(byteBuffer));
        }
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes.dex */
    public interface e<T> {
        void a(MediaExtractor mediaExtractor, T t) throws IOException;

        void b(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes.dex */
    public static class f {
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes.dex */
    public static final class g implements e<ParcelFileDescriptor> {
        @Override // com.amazon.aps.iva.uc.d0.e
        public final void a(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        @Override // com.amazon.aps.iva.uc.d0.e
        public final void b(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes.dex */
    public static final class h extends RuntimeException {
        public h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    public d0(com.amazon.aps.iva.oc.c cVar, e<T> eVar) {
        this.b = cVar;
        this.a = eVar;
    }

    @Override // com.amazon.aps.iva.kc.j
    public final com.amazon.aps.iva.nc.w<Bitmap> a(T t, int i, int i2, com.amazon.aps.iva.kc.h hVar) throws IOException {
        long longValue = ((Long) hVar.c(d)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException(j0.f("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", longValue));
        }
        Integer num = (Integer) hVar.c(e);
        if (num == null) {
            num = 2;
        }
        m mVar = (m) hVar.c(m.f);
        if (mVar == null) {
            mVar = m.e;
        }
        m mVar2 = mVar;
        this.c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.a.b(mediaMetadataRetriever, t);
            return com.amazon.aps.iva.uc.e.c(c(t, mediaMetadataRetriever, longValue, num.intValue(), i, i2, mVar2), this.b);
        } finally {
            if (Build.VERSION.SDK_INT >= 29) {
                mediaMetadataRetriever.release();
            } else {
                mediaMetadataRetriever.release();
            }
        }
    }

    @Override // com.amazon.aps.iva.kc.j
    public final boolean b(T t, com.amazon.aps.iva.kc.h hVar) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
        if (r4 == null) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap c(T r17, android.media.MediaMetadataRetriever r18, long r19, int r21, int r22, int r23, com.amazon.aps.iva.uc.m r24) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.uc.d0.c(java.lang.Object, android.media.MediaMetadataRetriever, long, int, int, int, com.amazon.aps.iva.uc.m):android.graphics.Bitmap");
    }
}
