package c.t;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.graphics.Path;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.util.Property;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.annotation.RecentlyNonNull;
import androidx.recyclerview.widget.RecyclerView;
import c.c0.v;
import c.c0.y;
import c.u.b.x;
import com.android.billingclient.api.SkuDetails;
import com.applovin.sdk.AppLovinEventTypes;
import com.bumptech.glide.load.ImageHeaderParser;
import com.google.android.gms.internal.play_billing.zza;
import e.a.a.a.b0;
import e.a.a.a.q;
import e.a.a.a.r;
import e.d.b.b.i.d;
import e.h.g.l0;
import e.h.g.x0;
import e.j.d.w;
import i.a.s;
import i.a.t;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public final class m {
    public static long a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f2565b;

    /* loaded from: classes.dex */
    public static final class a implements r {
        public final /* synthetic */ s a;

        public a(s sVar) {
            this.a = sVar;
        }

        public final void a(e.a.a.a.j jVar, List<SkuDetails> list) {
            h.o.c.j.d(jVar, "billingResult");
            this.a.M(new e.a.a.a.s(jVar, list));
        }
    }

    /* loaded from: classes.dex */
    public class b implements e.c.a.m.j {
        public final /* synthetic */ InputStream a;

        public b(InputStream inputStream) {
            this.a = inputStream;
        }

        @Override // e.c.a.m.j
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.b(this.a);
            } finally {
                this.a.reset();
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements e.c.a.m.i {
        public final /* synthetic */ InputStream a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ e.c.a.m.s.c0.b f2566b;

        public c(InputStream inputStream, e.c.a.m.s.c0.b bVar) {
            this.a = inputStream;
            this.f2566b = bVar;
        }

        @Override // e.c.a.m.i
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.c(this.a, this.f2566b);
            } finally {
                this.a.reset();
            }
        }
    }

    public static <T> ObjectAnimator A(T t, Property<T, PointF> property, Path path) {
        return Build.VERSION.SDK_INT >= 21 ? ObjectAnimator.ofObject(t, property, (TypeConverter) null, path) : ObjectAnimator.ofFloat(t, new c.z.f(property, path), 0.0f, 1.0f);
    }

    @RecentlyNonNull
    public static final Object B(@RecentlyNonNull e.a.a.a.c cVar, @RecentlyNonNull q qVar, @RecentlyNonNull h.m.d<? super e.a.a.a.s> dVar) {
        s a2 = w.a(null, 1);
        cVar.f(qVar, new a(a2));
        return ((t) a2).d(dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [e.d.b.b.i.d$a] */
    public static <TInput, TResult, TException extends Throwable> TResult C(int i2, TInput tinput, e.d.b.b.i.b<TInput, TResult, TException> bVar, e.d.b.b.j.b0.a<TInput, TResult> aVar) throws Throwable {
        TResult tresult;
        if (i2 < 1) {
            return (TResult) bVar.a(tinput);
        }
        do {
            tresult = (TResult) bVar.a(tinput);
            d.a aVar2 = (d.a) tinput;
            d.b bVar2 = (d.b) tresult;
            URL url = bVar2.f6056b;
            if (url != null) {
                g("CctTransportBackend", "Following redirect to: %s", url);
                tinput = new d.a(bVar2.f6056b, aVar2.f6054b, aVar2.f6055c);
            } else {
                tinput = null;
            }
            if (tinput == null) {
                break;
            }
            i2--;
        } while (i2 >= 1);
        return tresult;
    }

    public static int D(y yVar) {
        int ordinal = yVar.ordinal();
        if (ordinal != 0) {
            int i2 = 1;
            if (ordinal != 1) {
                i2 = 2;
                if (ordinal != 2) {
                    i2 = 3;
                    if (ordinal != 3) {
                        i2 = 4;
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                return 5;
                            }
                            throw new IllegalArgumentException("Could not convert " + yVar + " to int");
                        }
                    }
                }
            }
            return i2;
        }
        return 0;
    }

    public static e.a.a.a.j E(Bundle bundle, String str, String str2) {
        e.a.a.a.j jVar = b0.f4974k;
        if (bundle == null) {
            zza.zzk("BillingClient", String.format("%s got null owned items list", str2));
            return jVar;
        }
        int zza = zza.zza(bundle, "BillingClient");
        zza.zzh(bundle, "BillingClient");
        e.a.a.a.j jVar2 = new e.a.a.a.j();
        jVar2.a = zza;
        if (zza != 0) {
            zza.zzk("BillingClient", String.format("%s failed. Response code: %s", str2, Integer.valueOf(zza)));
            return jVar2;
        } else if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            zza.zzk("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", str2));
            return jVar;
        } else {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            if (stringArrayList == null) {
                zza.zzk("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", str2));
                return jVar;
            } else if (stringArrayList2 == null) {
                zza.zzk("BillingClient", String.format("Bundle returned from %s contains null purchases list.", str2));
                return jVar;
            } else if (stringArrayList3 == null) {
                zza.zzk("BillingClient", String.format("Bundle returned from %s contains null signatures list.", str2));
                return jVar;
            } else {
                return b0.f4975l;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x005a -> B:33:0x005d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static c.c0.e a(byte[] r7) {
        /*
            c.c0.e r0 = new c.c0.e
            r0.<init>()
            if (r7 != 0) goto L8
            return r0
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            int r7 = r2.readInt()     // Catch: java.io.IOException -> L3e java.lang.Throwable -> L5e
        L17:
            if (r7 <= 0) goto L32
            java.lang.String r3 = r2.readUTF()     // Catch: java.io.IOException -> L3e java.lang.Throwable -> L5e
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.io.IOException -> L3e java.lang.Throwable -> L5e
            boolean r4 = r2.readBoolean()     // Catch: java.io.IOException -> L3e java.lang.Throwable -> L5e
            c.c0.e$a r5 = new c.c0.e$a     // Catch: java.io.IOException -> L3e java.lang.Throwable -> L5e
            r5.<init>(r3, r4)     // Catch: java.io.IOException -> L3e java.lang.Throwable -> L5e
            java.util.Set<c.c0.e$a> r3 = r0.a     // Catch: java.io.IOException -> L3e java.lang.Throwable -> L5e
            r3.add(r5)     // Catch: java.io.IOException -> L3e java.lang.Throwable -> L5e
            int r7 = r7 + (-1)
            goto L17
        L32:
            r2.close()     // Catch: java.io.IOException -> L36
            goto L3a
        L36:
            r7 = move-exception
            r7.printStackTrace()
        L3a:
            r1.close()     // Catch: java.io.IOException -> L59
            goto L5d
        L3e:
            r7 = move-exception
            goto L48
        L40:
            r0 = move-exception
            r2 = r7
            r7 = r0
            goto L5f
        L44:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r6
        L48:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L5e
            if (r2 == 0) goto L55
            r2.close()     // Catch: java.io.IOException -> L51
            goto L55
        L51:
            r7 = move-exception
            r7.printStackTrace()
        L55:
            r1.close()     // Catch: java.io.IOException -> L59
            goto L5d
        L59:
            r7 = move-exception
            r7.printStackTrace()
        L5d:
            return r0
        L5e:
            r7 = move-exception
        L5f:
            if (r2 == 0) goto L69
            r2.close()     // Catch: java.io.IOException -> L65
            goto L69
        L65:
            r0 = move-exception
            r0.printStackTrace()
        L69:
            r1.close()     // Catch: java.io.IOException -> L6d
            goto L71
        L6d:
            r0 = move-exception
            r0.printStackTrace()
        L71:
            goto L73
        L72:
            throw r7
        L73:
            goto L72
        */
        throw new UnsupportedOperationException("Method not decompiled: c.t.m.a(byte[]):c.c0.e");
    }

    public static void b(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static int c(RecyclerView.x xVar, x xVar2, View view, View view2, RecyclerView.m mVar, boolean z) {
        if (mVar.A() == 0 || xVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (z) {
            return Math.min(xVar2.l(), xVar2.b(view2) - xVar2.e(view));
        }
        return Math.abs(mVar.T(view) - mVar.T(view2)) + 1;
    }

    public static int d(RecyclerView.x xVar, x xVar2, View view, View view2, RecyclerView.m mVar, boolean z, boolean z2) {
        if (mVar.A() == 0 || xVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (xVar.b() - Math.max(mVar.T(view), mVar.T(view2))) - 1) : Math.max(0, Math.min(mVar.T(view), mVar.T(view2)));
        if (z) {
            return Math.round((max * (Math.abs(xVar2.b(view2) - xVar2.e(view)) / (Math.abs(mVar.T(view) - mVar.T(view2)) + 1))) + (xVar2.k() - xVar2.e(view)));
        }
        return max;
    }

    public static int e(RecyclerView.x xVar, x xVar2, View view, View view2, RecyclerView.m mVar, boolean z) {
        if (mVar.A() == 0 || xVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (z) {
            return (int) (((xVar2.b(view2) - xVar2.e(view)) / (Math.abs(mVar.T(view) - mVar.T(view2)) + 1)) * xVar.b());
        }
        return xVar.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c6, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.view.animation.Interpolator f(android.content.Context r4, org.xmlpull.v1.XmlPullParser r5) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r5.getDepth()
            r1 = 0
        L5:
            int r2 = r5.next()
            r3 = 3
            if (r2 != r3) goto L12
            int r3 = r5.getDepth()
            if (r3 <= r0) goto Lc6
        L12:
            r3 = 1
            if (r2 == r3) goto Lc6
            r3 = 2
            if (r2 == r3) goto L19
            goto L5
        L19:
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r5)
            java.lang.String r2 = r5.getName()
            java.lang.String r3 = "linearInterpolator"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L2f
            android.view.animation.LinearInterpolator r1 = new android.view.animation.LinearInterpolator
            r1.<init>()
            goto L5
        L2f:
            java.lang.String r3 = "accelerateInterpolator"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L3e
            android.view.animation.AccelerateInterpolator r2 = new android.view.animation.AccelerateInterpolator
            r2.<init>(r4, r1)
        L3c:
            r1 = r2
            goto L5
        L3e:
            java.lang.String r3 = "decelerateInterpolator"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L4c
            android.view.animation.DecelerateInterpolator r2 = new android.view.animation.DecelerateInterpolator
            r2.<init>(r4, r1)
            goto L3c
        L4c:
            java.lang.String r3 = "accelerateDecelerateInterpolator"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L5a
            android.view.animation.AccelerateDecelerateInterpolator r1 = new android.view.animation.AccelerateDecelerateInterpolator
            r1.<init>()
            goto L5
        L5a:
            java.lang.String r3 = "cycleInterpolator"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L68
            android.view.animation.CycleInterpolator r2 = new android.view.animation.CycleInterpolator
            r2.<init>(r4, r1)
            goto L3c
        L68:
            java.lang.String r3 = "anticipateInterpolator"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L76
            android.view.animation.AnticipateInterpolator r2 = new android.view.animation.AnticipateInterpolator
            r2.<init>(r4, r1)
            goto L3c
        L76:
            java.lang.String r3 = "overshootInterpolator"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L84
            android.view.animation.OvershootInterpolator r2 = new android.view.animation.OvershootInterpolator
            r2.<init>(r4, r1)
            goto L3c
        L84:
            java.lang.String r3 = "anticipateOvershootInterpolator"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L92
            android.view.animation.AnticipateOvershootInterpolator r2 = new android.view.animation.AnticipateOvershootInterpolator
            r2.<init>(r4, r1)
            goto L3c
        L92:
            java.lang.String r3 = "bounceInterpolator"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto La1
            android.view.animation.BounceInterpolator r1 = new android.view.animation.BounceInterpolator
            r1.<init>()
            goto L5
        La1:
            java.lang.String r3 = "pathInterpolator"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Laf
            c.a0.a.a.e r2 = new c.a0.a.a.e
            r2.<init>(r4, r1, r5)
            goto L3c
        Laf:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r0 = "Unknown interpolator name: "
            java.lang.StringBuilder r0 = e.a.d.a.a.y(r0)
            java.lang.String r5 = r5.getName()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
        Lc6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.t.m.f(android.content.Context, org.xmlpull.v1.XmlPullParser):android.view.animation.Interpolator");
    }

    public static void g(String str, String str2, Object obj) {
        m(str);
        String.format(str2, obj);
    }

    public static void h(String str, String str2, Throwable th) {
        Log.e(m(str), str2, th);
    }

    public static int i(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        return cursor.getColumnIndexOrThrow("`" + str + "`");
    }

    public static int j(List<ImageHeaderParser> list, InputStream inputStream, e.c.a.m.s.c0.b bVar) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new e.c.a.m.u.c.w(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return k(list, new c(inputStream, bVar));
    }

    public static int k(List<ImageHeaderParser> list, e.c.a.m.i iVar) throws IOException {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            int a2 = iVar.a(list.get(i2));
            if (a2 != -1) {
                return a2;
            }
        }
        return -1;
    }

    public static l0 l(Context context) {
        if (context == null) {
            context = x0.f8405d;
        }
        return l0.i(context, "vprefs");
    }

    public static String m(String str) {
        return e.a.d.a.a.k("TransportRuntime.", str);
    }

    public static ImageHeaderParser.ImageType n(List<ImageHeaderParser> list, InputStream inputStream, e.c.a.m.s.c0.b bVar) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new e.c.a.m.u.c.w(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return o(list, new b(inputStream));
    }

    public static ImageHeaderParser.ImageType o(List<ImageHeaderParser> list, e.c.a.m.j jVar) throws IOException {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ImageHeaderParser.ImageType a2 = jVar.a(list.get(i2));
            if (a2 != ImageHeaderParser.ImageType.UNKNOWN) {
                return a2;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public static c.c0.a p(int i2) {
        if (i2 != 0) {
            if (i2 == 1) {
                return c.c0.a.LINEAR;
            }
            throw new IllegalArgumentException(e.a.d.a.a.f("Could not convert ", i2, " to BackoffPolicy"));
        }
        return c.c0.a.EXPONENTIAL;
    }

    public static c.c0.s q(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (Build.VERSION.SDK_INT < 30 || i2 != 5) {
                                throw new IllegalArgumentException(e.a.d.a.a.f("Could not convert ", i2, " to NetworkType"));
                            }
                            return c.c0.s.TEMPORARILY_UNMETERED;
                        }
                        return c.c0.s.METERED;
                    }
                    return c.c0.s.NOT_ROAMING;
                }
                return c.c0.s.UNMETERED;
            }
            return c.c0.s.CONNECTED;
        }
        return c.c0.s.NOT_REQUIRED;
    }

    public static v r(int i2) {
        if (i2 != 0) {
            if (i2 == 1) {
                return v.DROP_WORK_REQUEST;
            }
            throw new IllegalArgumentException(e.a.d.a.a.f("Could not convert ", i2, " to OutOfQuotaPolicy"));
        }
        return v.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
    }

    public static y s(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                return y.CANCELLED;
                            }
                            throw new IllegalArgumentException(e.a.d.a.a.f("Could not convert ", i2, " to State"));
                        }
                        return y.BLOCKED;
                    }
                    return y.FAILED;
                }
                return y.SUCCEEDED;
            }
            return y.RUNNING;
        }
        return y.ENQUEUED;
    }

    @SuppressLint({"NewApi"})
    public static boolean t() {
        try {
            if (f2565b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f2565b == null) {
                a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f2565b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f2565b.invoke(null, Long.valueOf(a))).booleanValue();
        } catch (Exception e2) {
            if (e2 instanceof InvocationTargetException) {
                Throwable cause = e2.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new RuntimeException(cause);
            }
            return false;
        }
    }

    public static boolean u(Uri uri) {
        return uri != null && AppLovinEventTypes.USER_VIEWED_CONTENT.equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean v(int i2, int i3) {
        return i2 != Integer.MIN_VALUE && i3 != Integer.MIN_VALUE && i2 <= 512 && i3 <= 384;
    }

    public static Interpolator w(Context context, int i2) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 21) {
            return AnimationUtils.loadInterpolator(context, i2);
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                if (i2 == 17563663) {
                    return new c.n.a.a.a();
                }
                if (i2 == 17563661) {
                    return new c.n.a.a.b();
                }
                if (i2 == 17563662) {
                    return new c.n.a.a.c();
                }
                XmlResourceParser animation = context.getResources().getAnimation(i2);
                context.getResources();
                context.getTheme();
                Interpolator f2 = f(context, animation);
                animation.close();
                return f2;
            } catch (IOException e2) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i2));
                notFoundException.initCause(e2);
                throw notFoundException;
            } catch (XmlPullParserException e3) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i2));
                notFoundException2.initCause(e3);
                throw notFoundException2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    public static void x(String str, String str2) {
        Log.isLoggable(str, 2);
    }

    public static void y(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static String z(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            sb.append(str.charAt(i2));
            if (str2.length() > i2) {
                sb.append(str2.charAt(i2));
            }
        }
        return sb.toString();
    }
}
