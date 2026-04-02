package c.i.c;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Objects;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class m {
    public Context a;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f1976e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f1977f;

    /* renamed from: g  reason: collision with root package name */
    public PendingIntent f1978g;

    /* renamed from: h  reason: collision with root package name */
    public Bitmap f1979h;

    /* renamed from: i  reason: collision with root package name */
    public int f1980i;

    /* renamed from: j  reason: collision with root package name */
    public int f1981j;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1983l;

    /* renamed from: m  reason: collision with root package name */
    public n f1984m;
    public Bundle o;
    public RemoteViews r;
    public RemoteViews s;
    public String t;
    public boolean u;
    public Notification v;
    @Deprecated
    public ArrayList<String> w;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<j> f1973b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<r> f1974c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<j> f1975d = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    public boolean f1982k = true;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1985n = false;
    public int p = 0;
    public int q = 0;

    public m(Context context, String str) {
        Notification notification = new Notification();
        this.v = notification;
        this.a = context;
        this.t = str;
        notification.when = System.currentTimeMillis();
        this.v.audioStreamType = -1;
        this.f1981j = 0;
        this.w = new ArrayList<>();
        this.u = true;
    }

    public static CharSequence e(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public m a(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
        this.f1973b.add(new j(i2, charSequence, pendingIntent));
        return this;
    }

    public m b(j jVar) {
        this.f1973b.add(jVar);
        return this;
    }

    public Notification c() {
        Notification build;
        Bundle bundle;
        RemoteViews g2;
        o oVar = new o(this);
        n nVar = oVar.f1987c.f1984m;
        if (nVar != null) {
            nVar.b(oVar);
        }
        RemoteViews h2 = nVar != null ? nVar.h(oVar) : null;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            build = oVar.f1986b.build();
        } else if (i2 >= 24) {
            build = oVar.f1986b.build();
        } else if (i2 >= 21) {
            oVar.f1986b.setExtras(oVar.f1991g);
            build = oVar.f1986b.build();
            RemoteViews remoteViews = oVar.f1988d;
            if (remoteViews != null) {
                build.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = oVar.f1989e;
            if (remoteViews2 != null) {
                build.bigContentView = remoteViews2;
            }
        } else if (i2 >= 20) {
            oVar.f1986b.setExtras(oVar.f1991g);
            build = oVar.f1986b.build();
            RemoteViews remoteViews3 = oVar.f1988d;
            if (remoteViews3 != null) {
                build.contentView = remoteViews3;
            }
            RemoteViews remoteViews4 = oVar.f1989e;
            if (remoteViews4 != null) {
                build.bigContentView = remoteViews4;
            }
        } else {
            SparseArray<Bundle> a = p.a(oVar.f1990f);
            if (a != null) {
                oVar.f1991g.putSparseParcelableArray("android.support.actionExtras", a);
            }
            oVar.f1986b.setExtras(oVar.f1991g);
            build = oVar.f1986b.build();
            RemoteViews remoteViews5 = oVar.f1988d;
            if (remoteViews5 != null) {
                build.contentView = remoteViews5;
            }
            RemoteViews remoteViews6 = oVar.f1989e;
            if (remoteViews6 != null) {
                build.bigContentView = remoteViews6;
            }
        }
        if (h2 != null) {
            build.contentView = h2;
        } else {
            RemoteViews remoteViews7 = oVar.f1987c.r;
            if (remoteViews7 != null) {
                build.contentView = remoteViews7;
            }
        }
        if (nVar != null && (g2 = nVar.g(oVar)) != null) {
            build.bigContentView = g2;
        }
        if (i2 >= 21 && nVar != null) {
            Objects.requireNonNull(oVar.f1987c.f1984m);
        }
        if (nVar != null && (bundle = build.extras) != null) {
            nVar.a(bundle);
        }
        return build;
    }

    public long d() {
        if (this.f1982k) {
            return this.v.when;
        }
        return 0L;
    }

    public m f(int i2) {
        this.p = i2;
        return this;
    }

    public m g(PendingIntent pendingIntent) {
        this.f1978g = pendingIntent;
        return this;
    }

    public m h(CharSequence charSequence) {
        this.f1977f = e(charSequence);
        return this;
    }

    public m i(CharSequence charSequence) {
        this.f1976e = e(charSequence);
        return this;
    }

    public final void j(int i2, boolean z) {
        if (z) {
            Notification notification = this.v;
            notification.flags = i2 | notification.flags;
            return;
        }
        Notification notification2 = this.v;
        notification2.flags = (i2 ^ (-1)) & notification2.flags;
    }

    public m k(Bitmap bitmap) {
        if (bitmap != null && Build.VERSION.SDK_INT < 27) {
            Resources resources = this.a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double d2 = dimensionPixelSize;
                double max = Math.max(1, bitmap.getWidth());
                Double.isNaN(d2);
                Double.isNaN(max);
                Double.isNaN(d2);
                Double.isNaN(max);
                double d3 = d2 / max;
                double d4 = dimensionPixelSize2;
                double max2 = Math.max(1, bitmap.getHeight());
                Double.isNaN(d4);
                Double.isNaN(max2);
                Double.isNaN(d4);
                Double.isNaN(max2);
                double min = Math.min(d3, d4 / max2);
                double width = bitmap.getWidth();
                Double.isNaN(width);
                Double.isNaN(width);
                double height = bitmap.getHeight();
                Double.isNaN(height);
                Double.isNaN(height);
                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(width * min), (int) Math.ceil(height * min), true);
            }
        }
        this.f1979h = bitmap;
        return this;
    }

    public m l(boolean z) {
        j(2, z);
        return this;
    }

    public m m(int i2) {
        this.f1981j = i2;
        return this;
    }

    public m n(boolean z) {
        this.f1982k = z;
        return this;
    }

    public m o(int i2) {
        this.v.icon = i2;
        return this;
    }

    public m p(n nVar) {
        if (this.f1984m != nVar) {
            this.f1984m = nVar;
            nVar.i(this);
        }
        return this;
    }

    public m q(boolean z) {
        this.f1983l = z;
        return this;
    }

    public m r(int i2) {
        this.q = i2;
        return this;
    }
}
