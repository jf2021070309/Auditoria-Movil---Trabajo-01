package com.amazon.aps.iva.t3;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.widget.RemoteViews;
import androidx.core.widget.RemoteViewsCompatService;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.q.n;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: RemoteViewsCompat.kt */
/* loaded from: classes.dex */
public final class j {

    /* compiled from: RemoteViewsCompat.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static final void a(RemoteViews remoteViews, int i, String str, BlendMode blendMode) {
            com.amazon.aps.iva.yb0.j.f(remoteViews, "rv");
            com.amazon.aps.iva.yb0.j.f(str, FirebaseAnalytics.Param.METHOD);
            remoteViews.setBlendMode(i, str, blendMode);
        }

        public static final void b(RemoteViews remoteViews, int i, String str, int i2) {
            com.amazon.aps.iva.yb0.j.f(remoteViews, "rv");
            com.amazon.aps.iva.yb0.j.f(str, FirebaseAnalytics.Param.METHOD);
            remoteViews.setCharSequence(i, str, i2);
        }

        public static final void c(RemoteViews remoteViews, int i, String str, int i2) {
            com.amazon.aps.iva.yb0.j.f(remoteViews, "rv");
            com.amazon.aps.iva.yb0.j.f(str, FirebaseAnalytics.Param.METHOD);
            remoteViews.setCharSequenceAttr(i, str, i2);
        }

        public static final void d(RemoteViews remoteViews, int i, String str, int i2) {
            com.amazon.aps.iva.yb0.j.f(remoteViews, "rv");
            com.amazon.aps.iva.yb0.j.f(str, FirebaseAnalytics.Param.METHOD);
            remoteViews.setColor(i, str, i2);
        }

        public static final void e(RemoteViews remoteViews, int i, String str, int i2) {
            com.amazon.aps.iva.yb0.j.f(remoteViews, "rv");
            com.amazon.aps.iva.yb0.j.f(str, FirebaseAnalytics.Param.METHOD);
            remoteViews.setColorAttr(i, str, i2);
        }

        public static final void f(RemoteViews remoteViews, int i, String str, int i2, int i3) {
            com.amazon.aps.iva.yb0.j.f(remoteViews, "rv");
            com.amazon.aps.iva.yb0.j.f(str, FirebaseAnalytics.Param.METHOD);
            remoteViews.setColorInt(i, str, i2, i3);
        }

        public static final void g(RemoteViews remoteViews, int i, String str, int i2) {
            com.amazon.aps.iva.yb0.j.f(remoteViews, "rv");
            com.amazon.aps.iva.yb0.j.f(str, FirebaseAnalytics.Param.METHOD);
            remoteViews.setColorStateList(i, str, i2);
        }

        public static final void h(RemoteViews remoteViews, int i, String str, ColorStateList colorStateList) {
            com.amazon.aps.iva.yb0.j.f(remoteViews, "rv");
            com.amazon.aps.iva.yb0.j.f(str, FirebaseAnalytics.Param.METHOD);
            remoteViews.setColorStateList(i, str, colorStateList);
        }

        public static final void i(RemoteViews remoteViews, int i, String str, ColorStateList colorStateList, ColorStateList colorStateList2) {
            com.amazon.aps.iva.yb0.j.f(remoteViews, "rv");
            com.amazon.aps.iva.yb0.j.f(str, FirebaseAnalytics.Param.METHOD);
            remoteViews.setColorStateList(i, str, colorStateList, colorStateList2);
        }

        public static final void j(RemoteViews remoteViews, int i, String str, int i2) {
            com.amazon.aps.iva.yb0.j.f(remoteViews, "rv");
            com.amazon.aps.iva.yb0.j.f(str, FirebaseAnalytics.Param.METHOD);
            remoteViews.setColorStateListAttr(i, str, i2);
        }

        public static final void k(RemoteViews remoteViews, int i, String str, float f, int i2) {
            com.amazon.aps.iva.yb0.j.f(remoteViews, "rv");
            com.amazon.aps.iva.yb0.j.f(str, FirebaseAnalytics.Param.METHOD);
            remoteViews.setFloatDimen(i, str, f, i2);
        }

        public static final void l(RemoteViews remoteViews, int i, String str, int i2) {
            com.amazon.aps.iva.yb0.j.f(remoteViews, "rv");
            com.amazon.aps.iva.yb0.j.f(str, FirebaseAnalytics.Param.METHOD);
            remoteViews.setFloatDimen(i, str, i2);
        }

        public static final void m(RemoteViews remoteViews, int i, String str, int i2) {
            com.amazon.aps.iva.yb0.j.f(remoteViews, "rv");
            com.amazon.aps.iva.yb0.j.f(str, FirebaseAnalytics.Param.METHOD);
            remoteViews.setFloatDimenAttr(i, str, i2);
        }

        public static final void n(RemoteViews remoteViews, int i, String str, Icon icon, Icon icon2) {
            com.amazon.aps.iva.yb0.j.f(remoteViews, "rv");
            com.amazon.aps.iva.yb0.j.f(str, FirebaseAnalytics.Param.METHOD);
            remoteViews.setIcon(i, str, icon, icon2);
        }

        public static final void o(RemoteViews remoteViews, int i, String str, float f, int i2) {
            com.amazon.aps.iva.yb0.j.f(remoteViews, "rv");
            com.amazon.aps.iva.yb0.j.f(str, FirebaseAnalytics.Param.METHOD);
            remoteViews.setIntDimen(i, str, f, i2);
        }

        public static final void p(RemoteViews remoteViews, int i, String str, int i2) {
            com.amazon.aps.iva.yb0.j.f(remoteViews, "rv");
            com.amazon.aps.iva.yb0.j.f(str, FirebaseAnalytics.Param.METHOD);
            remoteViews.setIntDimen(i, str, i2);
        }

        public static final void q(RemoteViews remoteViews, int i, String str, int i2) {
            com.amazon.aps.iva.yb0.j.f(remoteViews, "rv");
            com.amazon.aps.iva.yb0.j.f(str, FirebaseAnalytics.Param.METHOD);
            remoteViews.setIntDimenAttr(i, str, i2);
        }
    }

    /* compiled from: RemoteViewsCompat.kt */
    /* loaded from: classes.dex */
    public static final class b {
        public static final b a = new b();

        private final RemoteViews.RemoteCollectionItems b(c cVar) {
            RemoteViews.RemoteCollectionItems.Builder viewTypeCount = new RemoteViews.RemoteCollectionItems.Builder().setHasStableIds(cVar.c).setViewTypeCount(cVar.d);
            long[] jArr = cVar.a;
            int length = jArr.length;
            for (int i = 0; i < length; i++) {
                viewTypeCount.addItem(jArr[i], cVar.b[i]);
            }
            RemoteViews.RemoteCollectionItems build = viewTypeCount.build();
            com.amazon.aps.iva.yb0.j.e(build, "Builder()\n              …\n                .build()");
            return build;
        }

        public final void a(RemoteViews remoteViews, int i, c cVar) {
            com.amazon.aps.iva.yb0.j.f(remoteViews, "remoteViews");
            com.amazon.aps.iva.yb0.j.f(cVar, FirebaseAnalytics.Param.ITEMS);
            remoteViews.setRemoteAdapter(i, b(cVar));
        }
    }

    public static final void a(Context context, RemoteViews remoteViews, int i, int i2, c cVar) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(remoteViews, "remoteViews");
        if (Build.VERSION.SDK_INT > 31) {
            b.a.a(remoteViews, i2, cVar);
            return;
        }
        int i3 = RemoteViewsCompatService.b;
        Intent putExtra = new Intent(context, RemoteViewsCompatService.class).putExtra("appWidgetId", i).putExtra("androidx.core.widget.extra.view_id", i2);
        com.amazon.aps.iva.yb0.j.e(putExtra, "Intent(context, RemoteVi…ra(EXTRA_VIEW_ID, viewId)");
        boolean z2 = true;
        putExtra.setData(Uri.parse(putExtra.toUri(1)));
        if (context.getPackageManager().resolveService(putExtra, 0) != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            remoteViews.setRemoteAdapter(i2, putExtra);
            Long b2 = RemoteViewsCompatService.a.C0026a.b(context);
            if (b2 == null) {
                z2 = false;
            }
            if (z2) {
                byte[] c2 = RemoteViewsCompatService.a.C0026a.c(new androidx.core.widget.a(cVar));
                String str = Build.VERSION.INCREMENTAL;
                com.amazon.aps.iva.yb0.j.e(str, "INCREMENTAL");
                RemoteViewsCompatService.a aVar = new RemoteViewsCompatService.a(c2, str, b2.longValue());
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.core.widget.prefs.RemoteViewsCompat", 0);
                com.amazon.aps.iva.yb0.j.e(sharedPreferences, "context.getSharedPrefere…S_FILENAME, MODE_PRIVATE)");
                SharedPreferences.Editor edit = sharedPreferences.edit();
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append(':');
                sb.append(i2);
                String sb2 = sb.toString();
                String encodeToString = Base64.encodeToString(RemoteViewsCompatService.a.C0026a.c(new androidx.core.widget.d(aVar)), 0);
                com.amazon.aps.iva.yb0.j.e(encodeToString, "encodeToString(serialize…celable), Base64.DEFAULT)");
                edit.putString(sb2, encodeToString).apply();
                AppWidgetManager.getInstance(context).notifyAppWidgetViewDataChanged(i, i2);
                return;
            }
            throw new IllegalStateException("Couldn't obtain version code for app".toString());
        }
        throw new IllegalStateException("RemoteViewsCompatService could not be resolved, ensure that you have declared it in your app manifest.".toString());
    }

    /* compiled from: RemoteViewsCompat.kt */
    /* loaded from: classes.dex */
    public static final class c {
        public final long[] a;
        public final RemoteViews[] b;
        public final boolean c;
        public final int d;

        /* compiled from: RemoteViewsCompat.kt */
        /* loaded from: classes.dex */
        public static final class a {
            public final ArrayList<Long> a = new ArrayList<>();
            public final ArrayList<RemoteViews> b = new ArrayList<>();
            public boolean c;
            public int d;

            public final c a() {
                int i = this.d;
                ArrayList<RemoteViews> arrayList = this.b;
                if (i < 1) {
                    ArrayList arrayList2 = new ArrayList(r.Y(arrayList));
                    Iterator<RemoteViews> it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(Integer.valueOf(it.next().getLayoutId()));
                    }
                    this.d = x.n0(arrayList2).size();
                }
                long[] Y0 = x.Y0(this.a);
                Object[] array = arrayList.toArray(new RemoteViews[0]);
                com.amazon.aps.iva.yb0.j.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                return new c(Y0, (RemoteViews[]) array, this.c, Math.max(this.d, 1));
            }
        }

        public c(long[] jArr, RemoteViews[] remoteViewsArr, boolean z, int i) {
            this.a = jArr;
            this.b = remoteViewsArr;
            this.c = z;
            this.d = i;
            if (!(jArr.length == remoteViewsArr.length)) {
                throw new IllegalArgumentException("RemoteCollectionItems has different number of ids and views".toString());
            }
            if (i >= 1) {
                ArrayList arrayList = new ArrayList(remoteViewsArr.length);
                for (RemoteViews remoteViews : remoteViewsArr) {
                    arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
                }
                int size = x.n0(arrayList).size();
                if (!(size <= i)) {
                    throw new IllegalArgumentException(n.a("View type count is set to ", i, ", but the collection contains ", size, " different layout ids").toString());
                }
                return;
            }
            throw new IllegalArgumentException("View type count must be >= 1".toString());
        }

        public c(Parcel parcel) {
            com.amazon.aps.iva.yb0.j.f(parcel, "parcel");
            int readInt = parcel.readInt();
            long[] jArr = new long[readInt];
            this.a = jArr;
            parcel.readLongArray(jArr);
            Parcelable.Creator creator = RemoteViews.CREATOR;
            com.amazon.aps.iva.yb0.j.e(creator, "CREATOR");
            RemoteViews[] remoteViewsArr = new RemoteViews[readInt];
            parcel.readTypedArray(remoteViewsArr, creator);
            for (int i = 0; i < readInt; i++) {
                if (remoteViewsArr[i] == null) {
                    throw new IllegalArgumentException("null element found in " + remoteViewsArr + '.');
                }
            }
            this.b = remoteViewsArr;
            this.c = parcel.readInt() == 1;
            this.d = parcel.readInt();
        }
    }
}
