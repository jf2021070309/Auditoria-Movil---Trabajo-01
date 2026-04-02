package e.c.a.m.u.c;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import e.c.a.m.l;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Objects;
/* loaded from: classes.dex */
public class b0<T> implements e.c.a.m.o<T, Bitmap> {
    public static final e.c.a.m.l<Long> a = new e.c.a.m.l<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: b  reason: collision with root package name */
    public static final e.c.a.m.l<Integer> f5850b = new e.c.a.m.l<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: c  reason: collision with root package name */
    public static final e f5851c = new e();

    /* renamed from: d  reason: collision with root package name */
    public final f<T> f5852d;

    /* renamed from: e  reason: collision with root package name */
    public final e.c.a.m.s.c0.d f5853e;

    /* renamed from: f  reason: collision with root package name */
    public final e f5854f;

    /* loaded from: classes.dex */
    public class a implements l.b<Long> {
        public final ByteBuffer a = ByteBuffer.allocate(8);

        @Override // e.c.a.m.l.b
        public void a(byte[] bArr, Long l2, MessageDigest messageDigest) {
            Long l3 = l2;
            messageDigest.update(bArr);
            synchronized (this.a) {
                this.a.position(0);
                messageDigest.update(this.a.putLong(l3.longValue()).array());
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements l.b<Integer> {
        public final ByteBuffer a = ByteBuffer.allocate(4);

        @Override // e.c.a.m.l.b
        public void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            Integer num2 = num;
            if (num2 == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.a) {
                this.a.position(0);
                messageDigest.update(this.a.putInt(num2.intValue()).array());
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements f<AssetFileDescriptor> {
        public c(a aVar) {
        }

        @Override // e.c.a.m.u.c.b0.f
        public void a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements f<ByteBuffer> {
        @Override // e.c.a.m.u.c.b0.f
        public void a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new c0(this, byteBuffer));
        }
    }

    /* loaded from: classes.dex */
    public static class e {
    }

    /* loaded from: classes.dex */
    public interface f<T> {
        void a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    /* loaded from: classes.dex */
    public static final class g implements f<ParcelFileDescriptor> {
        @Override // e.c.a.m.u.c.b0.f
        public void a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    public b0(e.c.a.m.s.c0.d dVar, f<T> fVar) {
        e eVar = f5851c;
        this.f5853e = dVar;
        this.f5852d = fVar;
        this.f5854f = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap c(android.media.MediaMetadataRetriever r9, long r10, int r12, int r13, int r14, e.c.a.m.u.c.l r15) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto L59
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r13 == r0) goto L59
            if (r14 == r0) goto L59
            e.c.a.m.u.c.l r0 = e.c.a.m.u.c.l.f5865e
            if (r15 == r0) goto L59
            r0 = 18
            java.lang.String r0 = r9.extractMetadata(r0)     // Catch: java.lang.Throwable -> L53
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L53
            r1 = 19
            java.lang.String r1 = r9.extractMetadata(r1)     // Catch: java.lang.Throwable -> L53
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L53
            r2 = 24
            java.lang.String r2 = r9.extractMetadata(r2)     // Catch: java.lang.Throwable -> L53
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L53
            r3 = 90
            if (r2 == r3) goto L36
            r3 = 270(0x10e, float:3.78E-43)
            if (r2 != r3) goto L39
        L36:
            r8 = r1
            r1 = r0
            r0 = r8
        L39:
            float r13 = r15.b(r0, r1, r13, r14)     // Catch: java.lang.Throwable -> L53
            float r14 = (float) r0     // Catch: java.lang.Throwable -> L53
            float r14 = r14 * r13
            int r6 = java.lang.Math.round(r14)     // Catch: java.lang.Throwable -> L53
            float r14 = (float) r1     // Catch: java.lang.Throwable -> L53
            float r13 = r13 * r14
            int r7 = java.lang.Math.round(r13)     // Catch: java.lang.Throwable -> L53
            r2 = r9
            r3 = r10
            r5 = r12
            android.graphics.Bitmap r13 = r2.getScaledFrameAtTime(r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L53
            goto L5a
        L53:
            r13 = 3
            java.lang.String r14 = "VideoDecoder"
            android.util.Log.isLoggable(r14, r13)
        L59:
            r13 = 0
        L5a:
            if (r13 != 0) goto L60
            android.graphics.Bitmap r13 = r9.getFrameAtTime(r10, r12)
        L60:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.a.m.u.c.b0.c(android.media.MediaMetadataRetriever, long, int, int, int, e.c.a.m.u.c.l):android.graphics.Bitmap");
    }

    @Override // e.c.a.m.o
    public boolean a(T t, e.c.a.m.m mVar) {
        return true;
    }

    @Override // e.c.a.m.o
    public e.c.a.m.s.w<Bitmap> b(T t, int i2, int i3, e.c.a.m.m mVar) throws IOException {
        long longValue = ((Long) mVar.c(a)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) mVar.c(f5850b);
            if (num == null) {
                num = 2;
            }
            l lVar = (l) mVar.c(l.f5867g);
            if (lVar == null) {
                lVar = l.f5866f;
            }
            l lVar2 = lVar;
            Objects.requireNonNull(this.f5854f);
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    this.f5852d.a(mediaMetadataRetriever, t);
                    Bitmap c2 = c(mediaMetadataRetriever, longValue, num.intValue(), i2, i3, lVar2);
                    mediaMetadataRetriever.release();
                    return e.c.a.m.u.c.e.b(c2, this.f5853e);
                } catch (RuntimeException e2) {
                    throw new IOException(e2);
                }
            } catch (Throwable th) {
                mediaMetadataRetriever.release();
                throw th;
            }
        }
        throw new IllegalArgumentException(e.a.d.a.a.h("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", longValue));
    }
}
