package com.amazon.aps.iva.c3;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public final class q extends w {
    public IconCompat a;
    public IconCompat b;
    public boolean c;

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static Notification.BigPictureStyle a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
            return bigPictureStyle.bigPicture(bitmap);
        }

        public static Notification.BigPictureStyle b(Notification.Builder builder) {
            return new Notification.BigPictureStyle(builder);
        }

        public static Notification.BigPictureStyle c(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
            return bigPictureStyle.setBigContentTitle(charSequence);
        }

        public static void d(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
            bigPictureStyle.bigLargeIcon(bitmap);
        }

        public static void e(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
            bigPictureStyle.setSummaryText(charSequence);
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
            bigPictureStyle.bigLargeIcon(icon);
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class c {
        public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
            bigPictureStyle.bigPicture(icon);
        }

        public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
            bigPictureStyle.setContentDescription(charSequence);
        }

        public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z) {
            bigPictureStyle.showBigPictureWhenCollapsed(z);
        }
    }

    public final void a(CharSequence charSequence) {
        this.mBigContentTitle = s.c(charSequence);
    }

    @Override // com.amazon.aps.iva.c3.w
    public final void apply(m mVar) {
        Context context;
        Bitmap bitmap;
        Context context2;
        int i = Build.VERSION.SDK_INT;
        Notification.BigPictureStyle c2 = a.c(a.b(((x) mVar).b), this.mBigContentTitle);
        IconCompat iconCompat = this.a;
        if (iconCompat != null) {
            if (i >= 31) {
                if (mVar instanceof x) {
                    context2 = ((x) mVar).a;
                } else {
                    context2 = null;
                }
                c.a(c2, IconCompat.a.f(iconCompat, context2));
            } else {
                int i2 = iconCompat.a;
                if (i2 == -1) {
                    i2 = IconCompat.a.c(iconCompat.b);
                }
                if (i2 == 1) {
                    IconCompat iconCompat2 = this.a;
                    int i3 = iconCompat2.a;
                    if (i3 == -1) {
                        Object obj = iconCompat2.b;
                        if (obj instanceof Bitmap) {
                            bitmap = (Bitmap) obj;
                        } else {
                            bitmap = null;
                        }
                    } else if (i3 == 1) {
                        bitmap = (Bitmap) iconCompat2.b;
                    } else if (i3 == 5) {
                        Bitmap bitmap2 = (Bitmap) iconCompat2.b;
                        int min = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.6666667f);
                        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        Paint paint = new Paint(3);
                        float f = min;
                        float f2 = 0.5f * f;
                        float f3 = 0.9166667f * f2;
                        float f4 = 0.010416667f * f;
                        paint.setColor(0);
                        paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
                        canvas.drawCircle(f2, f2, f3, paint);
                        paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
                        canvas.drawCircle(f2, f2, f3, paint);
                        paint.clearShadowLayer();
                        paint.setColor(-16777216);
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                        Matrix matrix = new Matrix();
                        matrix.setTranslate((-(bitmap2.getWidth() - min)) / 2.0f, (-(bitmap2.getHeight() - min)) / 2.0f);
                        bitmapShader.setLocalMatrix(matrix);
                        paint.setShader(bitmapShader);
                        canvas.drawCircle(f2, f2, f3, paint);
                        canvas.setBitmap(null);
                        bitmap = createBitmap;
                    } else {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    c2 = a.a(c2, bitmap);
                }
            }
        }
        if (this.c) {
            IconCompat iconCompat3 = this.b;
            if (iconCompat3 == null) {
                a.d(c2, null);
            } else {
                if (mVar instanceof x) {
                    context = ((x) mVar).a;
                } else {
                    context = null;
                }
                b.a(c2, IconCompat.a.f(iconCompat3, context));
            }
        }
        if (this.mSummaryTextSet) {
            a.e(c2, this.mSummaryText);
        }
        if (i >= 31) {
            c.c(c2, false);
            c.b(c2, null);
        }
    }

    public final void b(CharSequence charSequence) {
        this.mSummaryText = s.c(charSequence);
        this.mSummaryTextSet = true;
    }

    @Override // com.amazon.aps.iva.c3.w
    public final String getClassName() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
