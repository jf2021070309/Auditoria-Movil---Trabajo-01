package com.amazon.aps.iva.c3;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.amazon.aps.iva.c3.x;
import com.crunchyroll.crunchyroid.R;
import java.util.ArrayList;
/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public final class s {
    public String A;
    public String B;
    public final boolean D;
    public final Notification E;
    @Deprecated
    public final ArrayList<String> F;
    public final Context a;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public IconCompat h;
    public int i;
    public int j;
    public w l;
    public CharSequence m;
    public int n;
    public int o;
    public boolean p;
    public String q;
    public boolean r;
    public String t;
    public Bundle u;
    public Notification x;
    public RemoteViews y;
    public RemoteViews z;
    public final ArrayList<p> b = new ArrayList<>();
    public final ArrayList<b0> c = new ArrayList<>();
    public final ArrayList<p> d = new ArrayList<>();
    public boolean k = true;
    public boolean s = false;
    public int v = 0;
    public int w = 0;
    public int C = 0;

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static AudioAttributes a(AudioAttributes.Builder builder) {
            return builder.build();
        }

        public static AudioAttributes.Builder b() {
            return new AudioAttributes.Builder();
        }

        public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i) {
            return builder.setContentType(i);
        }

        public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i) {
            return builder.setLegacyStreamType(i);
        }

        public static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i) {
            return builder.setUsage(i);
        }
    }

    public s(Context context, String str) {
        Notification notification = new Notification();
        this.E = notification;
        this.a = context;
        this.A = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.j = 0;
        this.F = new ArrayList<>();
        this.D = true;
    }

    public static CharSequence c(CharSequence charSequence) {
        if (charSequence == null) {
            return charSequence;
        }
        if (charSequence.length() > 5120) {
            return charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }

    public final void a(int i, String str, PendingIntent pendingIntent) {
        IconCompat b;
        ArrayList<p> arrayList = this.b;
        if (i == 0) {
            b = null;
        } else {
            b = IconCompat.b(null, "", i);
        }
        arrayList.add(new p(b, str, pendingIntent, new Bundle(), null, null, true, 0, true, false, false));
    }

    public final Notification b() {
        RemoteViews remoteViews;
        Bundle bundle;
        RemoteViews makeHeadsUpContentView;
        RemoteViews makeBigContentView;
        x xVar = new x(this);
        s sVar = xVar.c;
        w wVar = sVar.l;
        if (wVar != null) {
            wVar.apply(xVar);
        }
        if (wVar != null) {
            remoteViews = wVar.makeContentView(xVar);
        } else {
            remoteViews = null;
        }
        Notification a2 = x.a.a(xVar.b);
        if (remoteViews != null) {
            a2.contentView = remoteViews;
        } else {
            RemoteViews remoteViews2 = sVar.y;
            if (remoteViews2 != null) {
                a2.contentView = remoteViews2;
            }
        }
        if (wVar != null && (makeBigContentView = wVar.makeBigContentView(xVar)) != null) {
            a2.bigContentView = makeBigContentView;
        }
        if (wVar != null && (makeHeadsUpContentView = sVar.l.makeHeadsUpContentView(xVar)) != null) {
            a2.headsUpContentView = makeHeadsUpContentView;
        }
        if (wVar != null && (bundle = a2.extras) != null) {
            wVar.addCompatExtras(bundle);
        }
        return a2;
    }

    public final void d(CharSequence charSequence) {
        this.f = c(charSequence);
    }

    public final void e(CharSequence charSequence) {
        this.e = c(charSequence);
    }

    public final void f(int i, boolean z) {
        Notification notification = this.E;
        if (z) {
            notification.flags = i | notification.flags;
            return;
        }
        notification.flags = (~i) & notification.flags;
    }

    public final void g(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.b = bitmap;
            iconCompat = iconCompat2;
        }
        this.h = iconCompat;
    }

    public final void h(w wVar) {
        if (this.l != wVar) {
            this.l = wVar;
            if (wVar != null) {
                wVar.setBuilder(this);
            }
        }
    }
}
