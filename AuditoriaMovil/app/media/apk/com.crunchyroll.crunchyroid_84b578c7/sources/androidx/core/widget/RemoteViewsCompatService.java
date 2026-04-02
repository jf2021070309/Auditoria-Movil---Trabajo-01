package androidx.core.widget;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcel;
import android.util.Base64;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import com.amazon.aps.iva.t3.j;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import java.util.Objects;
import kotlin.Metadata;
/* compiled from: RemoteViewsCompatService.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/core/widget/RemoteViewsCompatService;", "Landroid/widget/RemoteViewsService;", "<init>", "()V", "a", "b", "core-remoteviews_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class RemoteViewsCompatService extends RemoteViewsService {
    public static final /* synthetic */ int b = 0;

    @Override // android.widget.RemoteViewsService
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        boolean z;
        j.f(intent, "intent");
        int intExtra = intent.getIntExtra("appWidgetId", -1);
        boolean z2 = true;
        if (intExtra != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int intExtra2 = intent.getIntExtra("androidx.core.widget.extra.view_id", -1);
            if (intExtra2 == -1) {
                z2 = false;
            }
            if (z2) {
                return new b(this, intExtra, intExtra2);
            }
            throw new IllegalStateException("No view id was present in the intent".toString());
        }
        throw new IllegalStateException("No app widget id was present in the intent".toString());
    }

    /* compiled from: RemoteViewsCompatService.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public final byte[] a;
        public final String b;
        public final long c;

        /* compiled from: RemoteViewsCompatService.kt */
        /* renamed from: androidx.core.widget.RemoteViewsCompatService$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0026a {
            public static Object a(byte[] bArr, l lVar) {
                j.f(bArr, "bytes");
                j.f(lVar, "creator");
                Parcel obtain = Parcel.obtain();
                j.e(obtain, "obtain()");
                try {
                    obtain.unmarshall(bArr, 0, bArr.length);
                    obtain.setDataPosition(0);
                    return lVar.invoke(obtain);
                } finally {
                    obtain.recycle();
                }
            }

            public static Long b(Context context) {
                j.f(context, "context");
                try {
                    return Long.valueOf(com.amazon.aps.iva.e3.a.a(context.getPackageManager().getPackageInfo(context.getPackageName(), 0)));
                } catch (PackageManager.NameNotFoundException unused) {
                    Objects.toString(context.getPackageManager());
                    return null;
                }
            }

            public static byte[] c(p pVar) {
                Parcel obtain = Parcel.obtain();
                j.e(obtain, "obtain()");
                try {
                    obtain.setDataPosition(0);
                    pVar.invoke(obtain, 0);
                    byte[] marshall = obtain.marshall();
                    j.e(marshall, "{\n                    pa…shall()\n                }");
                    return marshall;
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a(byte[] bArr, String str, long j) {
            this.a = bArr;
            this.b = str;
            this.c = j;
        }

        public a(Parcel parcel) {
            j.f(parcel, "parcel");
            byte[] bArr = new byte[parcel.readInt()];
            this.a = bArr;
            parcel.readByteArray(bArr);
            String readString = parcel.readString();
            j.c(readString);
            this.b = readString;
            this.c = parcel.readLong();
        }
    }

    /* compiled from: RemoteViewsCompatService.kt */
    /* loaded from: classes.dex */
    public static final class b implements RemoteViewsService.RemoteViewsFactory {
        public static final j.c e = new j.c(new long[0], new RemoteViews[0], false, 1);
        public final Context a;
        public final int b;
        public final int c;
        public j.c d;

        public b(Context context, int i, int i2) {
            com.amazon.aps.iva.yb0.j.f(context, "mContext");
            this.a = context;
            this.b = i;
            this.c = i2;
            this.d = e;
        }

        public final void a() {
            Long b;
            Context context = this.a;
            com.amazon.aps.iva.yb0.j.f(context, "context");
            SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.core.widget.prefs.RemoteViewsCompat", 0);
            com.amazon.aps.iva.yb0.j.e(sharedPreferences, "context.getSharedPrefere…S_FILENAME, MODE_PRIVATE)");
            StringBuilder sb = new StringBuilder();
            sb.append(this.b);
            sb.append(':');
            sb.append(this.c);
            j.c cVar = null;
            String string = sharedPreferences.getString(sb.toString(), null);
            if (string != null) {
                c cVar2 = c.h;
                com.amazon.aps.iva.yb0.j.f(cVar2, "creator");
                byte[] decode = Base64.decode(string, 0);
                com.amazon.aps.iva.yb0.j.e(decode, "decode(hexString, Base64.DEFAULT)");
                a aVar = (a) a.C0026a.a(decode, cVar2);
                if (com.amazon.aps.iva.yb0.j.a(Build.VERSION.INCREMENTAL, aVar.b) && (b = a.C0026a.b(context)) != null && b.longValue() == aVar.c) {
                    try {
                        cVar = (j.c) a.C0026a.a(aVar.a, androidx.core.widget.b.h);
                    } catch (Throwable unused) {
                    }
                }
            }
            if (cVar == null) {
                cVar = e;
            }
            this.d = cVar;
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final int getCount() {
            return this.d.a.length;
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final long getItemId(int i) {
            return this.d.a[i];
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final /* bridge */ /* synthetic */ RemoteViews getLoadingView() {
            return null;
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final RemoteViews getViewAt(int i) {
            return this.d.b[i];
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final int getViewTypeCount() {
            return this.d.d;
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final boolean hasStableIds() {
            return this.d.c;
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final void onCreate() {
            a();
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final void onDataSetChanged() {
            a();
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final void onDestroy() {
        }
    }
}
