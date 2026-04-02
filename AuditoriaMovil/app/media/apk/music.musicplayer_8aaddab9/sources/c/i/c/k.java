package c.i.c;

import android.app.Notification;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
/* loaded from: classes.dex */
public class k extends n {

    /* renamed from: b  reason: collision with root package name */
    public Bitmap f1969b;

    /* renamed from: c  reason: collision with root package name */
    public IconCompat f1970c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1971d;

    /* loaded from: classes.dex */
    public static class a {
        public static void a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
            bigPictureStyle.bigLargeIcon(bitmap);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
            bigPictureStyle.bigLargeIcon(icon);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static void a(Notification.BigPictureStyle bigPictureStyle, boolean z) {
            bigPictureStyle.showBigPictureWhenCollapsed(z);
        }
    }

    @Override // c.i.c.n
    public void b(i iVar) {
        int i2 = Build.VERSION.SDK_INT;
        o oVar = (o) iVar;
        Bitmap bitmap = null;
        Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(oVar.f1986b).setBigContentTitle(null).bigPicture(this.f1969b);
        if (this.f1971d) {
            IconCompat iconCompat = this.f1970c;
            if (iconCompat == null) {
                a.a(bigPicture, null);
            } else if (i2 >= 23) {
                b.a(bigPicture, iconCompat.j(oVar.a));
            } else if (iconCompat.f() == 1) {
                IconCompat iconCompat2 = this.f1970c;
                int i3 = iconCompat2.f346b;
                if (i3 == -1 && i2 >= 23) {
                    Object obj = iconCompat2.f347c;
                    if (obj instanceof Bitmap) {
                        bitmap = (Bitmap) obj;
                    }
                } else if (i3 == 1) {
                    bitmap = (Bitmap) iconCompat2.f347c;
                } else if (i3 != 5) {
                    throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                } else {
                    bitmap = IconCompat.a((Bitmap) iconCompat2.f347c, true);
                }
                a.a(bigPicture, bitmap);
            } else {
                a.a(bigPicture, null);
            }
        }
        if (i2 >= 31) {
            c.a(bigPicture, false);
        }
    }

    @Override // c.i.c.n
    public String f() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    public k j(Bitmap bitmap) {
        this.f1970c = null;
        this.f1971d = true;
        return this;
    }
}
