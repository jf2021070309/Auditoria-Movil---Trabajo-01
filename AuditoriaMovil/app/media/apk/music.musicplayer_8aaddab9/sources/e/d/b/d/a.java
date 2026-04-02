package e.d.b.d;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Notification;
import android.app.Service;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.renderscript.RenderScript;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Property;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import c.b.i.a1;
import c.i.k.d0;
import ch.qos.logback.core.rolling.helper.Compressor;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.measurement.AppMeasurement;
import com.zipoapps.ads.config.PHAdSize;
import e.d.b.d.l.d;
import e.d.b.d.w.g;
import e.d.b.e.a.a.l0;
import e.d.b.e.a.c.a0;
import e.d.b.e.a.c.s;
import e.d.b.e.a.c.t;
import e.d.b.e.a.g.e;
import e.d.b.e.a.g.i;
import e.d.b.e.a.g.r;
import e.d.d.g;
import e.d.d.l.n;
import e.d.d.l.o;
import e.d.d.w.e0;
import e.d.d.x.c;
import e.h.g.b1;
import e.h.g.h1;
import e.h.g.i1;
import e.h.g.t1;
import e.h.g.v0;
import e.j.d.c0.a0;
import e.j.d.k;
import e.j.d.q;
import e.j.d.w;
import h.m.f;
import h.o.b.p;
import h.o.c.j;
import i.a.f0;
import i.a.g1;
import i.a.z0;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
public final class a {
    public static l0 a;

    /* renamed from: b  reason: collision with root package name */
    public static WeakReference<RenderScript> f6310b;

    /* renamed from: c  reason: collision with root package name */
    public static b1<h1> f6311c;

    public static int A(Context context, int i2, int i3) {
        TypedValue Z = Z(context, i2);
        return Z != null ? Z.data : i3;
    }

    public static int B(View view, int i2) {
        return b0(view.getContext(), i2, view.getClass().getCanonicalName());
    }

    public static ColorStateList C(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        ColorStateList a2;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (a2 = c.b.d.a.a.a(context, resourceId)) == null) ? typedArray.getColorStateList(i2) : a2;
    }

    public static ColorStateList D(Context context, a1 a1Var, int i2) {
        int resourceId;
        ColorStateList a2;
        return (!a1Var.f1083b.hasValue(i2) || (resourceId = a1Var.f1083b.getResourceId(i2, 0)) == 0 || (a2 = c.b.d.a.a.a(context, resourceId)) == null) ? a1Var.c(i2) : a2;
    }

    public static float E(String[] strArr, int i2) {
        float parseFloat = Float.parseFloat(strArr[i2]);
        if (parseFloat < 0.0f || parseFloat > 1.0f) {
            throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
        }
        return parseFloat;
    }

    public static Drawable F(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        Drawable b2;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (b2 = c.b.d.a.a.b(context, resourceId)) == null) ? typedArray.getDrawable(i2) : b2;
    }

    public static TextView G(Toolbar toolbar, CharSequence charSequence) {
        for (int i2 = 0; i2 < toolbar.getChildCount(); i2++) {
            View childAt = toolbar.getChildAt(i2);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    return textView;
                }
            }
        }
        return null;
    }

    public static String H(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    public static void I(FrameLayout frameLayout, ShimmerFrameLayout shimmerFrameLayout) {
        shimmerFrameLayout.b();
        shimmerFrameLayout.setVisibility(8);
        frameLayout.setVisibility(8);
    }

    public static final boolean J(Activity activity) {
        j.e(activity, "<this>");
        if (activity instanceof AdActivity ? true : activity instanceof AppLovinFullscreenActivity) {
            return true;
        }
        return activity instanceof AudienceNetworkActivity;
    }

    public static boolean K(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("(");
        return str.startsWith(sb.toString()) && str.endsWith(")");
    }

    public static boolean L(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean M(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }

    public static boolean N(View view) {
        AtomicInteger atomicInteger = d0.a;
        return d0.d.d(view) == 1;
    }

    @TargetApi(17)
    public static boolean O(Resources resources) {
        return resources.getConfiguration().getLayoutDirection() == 1;
    }

    public static int P(int i2, int i3, float f2) {
        return c.i.e.b.b(c.i.e.b.e(i3, Math.round(Color.alpha(i3) * f2)), i2);
    }

    public static long Q(Context context, Uri uri) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;
        long j2 = 0;
        try {
            try {
                cursor = contentResolver.query(uri, new String[]{"_size"}, null, null, null);
                if (cursor.moveToFirst() && !cursor.isNull(0)) {
                    j2 = cursor.getLong(0);
                }
            } catch (Exception e2) {
                Log.w("DocumentFile", "Failed query: " + e2);
            }
            return j2;
        } finally {
            q(cursor);
        }
    }

    public static float R(float f2, float f3, float f4) {
        return (f4 * f3) + ((1.0f - f4) * f2);
    }

    public static void S(String str, Bundle bundle) {
        try {
            g.b();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String H = H(bundle);
            if (H != null) {
                bundle2.putString("_nt", H);
            }
            String string5 = bundle.getString("google.c.a.ts");
            if (string5 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string5));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e2);
                }
            }
            String string6 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string6 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string6));
                } catch (NumberFormatException e3) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e3);
                }
            }
            String str2 = true != e0.l(bundle) ? "data" : "display";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String obj = bundle2.toString();
                str.length();
                obj.length();
            }
            g b2 = g.b();
            b2.a();
            e.d.d.k.a.a aVar = (e.d.d.k.a.a) b2.f7043g.a(e.d.d.k.a.a.class);
            if (aVar != null) {
                aVar.c(AppMeasurement.FCM_ORIGIN, str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static void T(int i2, Notification notification) {
        x();
        h1 h1Var = new h1(null);
        h1Var.a = 2;
        h1Var.f8303d = i2;
        h1Var.f8302c = notification;
        f6311c.b(h1Var);
    }

    public static PorterDuff.Mode U(int i2, PorterDuff.Mode mode) {
        if (i2 != 3) {
            if (i2 != 5) {
                if (i2 != 9) {
                    switch (i2) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static void V(AnimatorSet animatorSet, List<Animator> list) {
        int size = list.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Animator animator = list.get(i2);
            j2 = Math.max(j2, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j2);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }

    public static int W(Activity activity, int i2, int i3) {
        if (activity.isFinishing() || i2 < i3) {
            return i2;
        }
        activity.getClass().getName();
        int i4 = t1.a;
        return i2 + ((i2 - i3) / (Math.max((int) ((v0.a(activity, false) / 64) * 2.0f), 10) - 1)) + 1;
    }

    public static int X(Activity activity, int i2, int i3) {
        if (activity.isFinishing() || i2 < i3) {
            return i2;
        }
        int i4 = i2 - i3;
        activity.getClass().getName();
        int i5 = t1.a;
        return i2 - ((i4 / Math.max((int) ((v0.a(activity, false) / 64) * 2.0f), 10)) + 1);
    }

    public static String Y(Context context, Uri uri, String str, String str2) {
        Cursor cursor;
        Throwable th;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
            try {
                try {
                    if (!cursor.moveToFirst() || cursor.isNull(0)) {
                        q(cursor);
                        return null;
                    }
                    String string = cursor.getString(0);
                    q(cursor);
                    return string;
                } catch (Exception e2) {
                    e = e2;
                    Log.w("DocumentFile", "Failed query: " + e);
                    q(cursor);
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                q(cursor);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th3) {
            cursor = null;
            th = th3;
            q(cursor);
            throw th;
        }
    }

    public static TypedValue Z(Context context, int i2) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static <ResultT> ResultT a(r<ResultT> rVar) throws ExecutionException {
        Exception exc;
        if (rVar.e()) {
            return rVar.d();
        }
        synchronized (rVar.a) {
            exc = rVar.f7036e;
        }
        throw new ExecutionException(exc);
    }

    public static boolean a0(Context context, int i2, boolean z) {
        TypedValue Z = Z(context, i2);
        return (Z == null || Z.type != 18) ? z : Z.data != 0;
    }

    public static String b(File file) {
        if (file.getName().endsWith(".apk")) {
            return file.getName().replaceFirst("(_\\d+)?\\.apk", "").replace("base-", "config.").replace("-", ".config.").replace(".config.master", "").replace("config.master", "");
        }
        throw new IllegalArgumentException("Non-apk found in splits directory.");
    }

    public static int b0(Context context, int i2, String str) {
        TypedValue Z = Z(context, i2);
        if (Z != null) {
            return Z.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i2)));
    }

    public static String c(String str, String str2) {
        return e.a.d.a.a.s(new StringBuilder(str.length() + 1 + String.valueOf(str2).length()), str, ":", str2);
    }

    public static void c0(View view, float f2) {
        Drawable background = view.getBackground();
        if (background instanceof e.d.b.d.w.g) {
            e.d.b.d.w.g gVar = (e.d.b.d.w.g) background;
            g.b bVar = gVar.f6591c;
            if (bVar.o != f2) {
                bVar.o = f2;
                gVar.x();
            }
        }
    }

    public static String d(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(e.a.d.a.a.b(str.length(), 2, String.valueOf(str2).length(), String.valueOf(str3).length()));
        e.a.d.a.a.M(sb, str, ":", str2, ":");
        sb.append(str3);
        return sb.toString();
    }

    public static void d0(View view, e.d.b.d.w.g gVar) {
        e.d.b.d.o.a aVar = gVar.f6591c.f6603b;
        if (aVar != null && aVar.f6471b) {
            float f2 = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                f2 += d0.l((View) parent);
            }
            g.b bVar = gVar.f6591c;
            if (bVar.f6615n != f2) {
                bVar.f6615n = f2;
                gVar.x();
            }
        }
    }

    public static String e(List<File> list) throws NoSuchAlgorithmException, IOException {
        int read;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        byte[] bArr = new byte[Compressor.BUFFER_SIZE];
        for (File file : list) {
            FileInputStream fileInputStream = new FileInputStream(file);
            do {
                try {
                    read = fileInputStream.read(bArr);
                    if (read > 0) {
                        messageDigest.update(bArr, 0, read);
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        a0.a.a(th, th2);
                    }
                    throw th;
                }
            } while (read != -1);
            fileInputStream.close();
        }
        return Base64.encodeToString(messageDigest.digest(), 11);
    }

    public static boolean e0(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static void f(PackageManager packageManager, ComponentName componentName, int i2) {
        ComponentInfo componentInfo;
        int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
        if (componentEnabledSetting != 1) {
            if (componentEnabledSetting != 2) {
                String packageName = componentName.getPackageName();
                String className = componentName.getClassName();
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(packageName, i2 | AdRequest.MAX_CONTENT_URL_LENGTH);
                    ComponentInfo[][] componentInfoArr = {packageInfo.activities, packageInfo.services, packageInfo.providers};
                    int i3 = 0;
                    loop0: while (true) {
                        if (i3 >= 3) {
                            componentInfo = null;
                            break;
                        }
                        ComponentInfo[] componentInfoArr2 = componentInfoArr[i3];
                        if (componentInfoArr2 != null) {
                            int length = componentInfoArr2.length;
                            for (int i4 = 0; i4 < length; i4++) {
                                componentInfo = componentInfoArr2[i4];
                                if (componentInfo.name.equals(className)) {
                                    break loop0;
                                }
                            }
                            continue;
                        }
                        i3++;
                    }
                    if (componentInfo != null) {
                        if (componentInfo.isEnabled()) {
                            return;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
        }
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [i.a.j2.a] */
    public static void f0(Activity activity, final FrameLayout frameLayout, final ShimmerFrameLayout shimmerFrameLayout, View view, f.a.e.a aVar) {
        if (e.j.d.j.a() || frameLayout == null) {
            return;
        }
        view.getLayoutParams().height = (int) (AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(activity, v0.b(activity, false)).getHeight() * activity.getResources().getDisplayMetrics().density);
        view.invalidate();
        PHAdSize adaptiveAnchoredBanner = PHAdSize.adaptiveAnchoredBanner(activity);
        j.e(adaptiveAnchoredBanner, "bannerSize");
        final k a2 = k.a.a();
        j.e(adaptiveAnchoredBanner, "bannerSize");
        if (w.a == null) {
            a2.c().k(4, null, "PremiumHelper set an undelivered exceptions handler", new Object[0]);
            w.a = new f.a.g.b() { // from class: e.j.d.a
                @Override // f.a.g.b
                public final void a(Object obj) {
                    k kVar = k.this;
                    h.o.c.j.e(kVar, "this$0");
                    kVar.c().k(6, (Throwable) obj, null, new Object[0]);
                }
            };
        }
        final q qVar = new q(a2, adaptiveAnchoredBanner, null);
        final h.m.g gVar = h.m.g.a;
        int i2 = g1.T;
        gVar.get(g1.a.a);
        final z0 z0Var = z0.a;
        ?? r2 = new Object() { // from class: i.a.j2.a
            public final void a(f.a.b bVar) {
                i.a.e0 e0Var = i.a.e0.this;
                f fVar = gVar;
                p pVar = qVar;
                c cVar = new c(i.a.a0.a(e0Var, fVar), bVar);
                f.a.h.a.b.set((f.a.h.c.a.a) bVar, new f.a.h.a.a(new b(cVar)));
                f0.DEFAULT.invoke(pVar, cVar, cVar);
            }
        };
        f.a.a aVar2 = f.a.d.a.a.a;
        Objects.requireNonNull(aVar2, "scheduler == null");
        f.a.h.b.a aVar3 = new f.a.h.b.a(new f.a.g.b() { // from class: e.h.g.f
            @Override // f.a.g.b
            public final void a(Object obj) {
                ShimmerFrameLayout shimmerFrameLayout2 = ShimmerFrameLayout.this;
                FrameLayout frameLayout2 = frameLayout;
                e.j.d.c0.a0 a0Var = (e.j.d.c0.a0) obj;
                shimmerFrameLayout2.b();
                shimmerFrameLayout2.setVisibility(8);
                if (!(a0Var instanceof a0.c)) {
                    frameLayout2.setVisibility(8);
                    return;
                }
                frameLayout2.removeAllViews();
                frameLayout2.addView((View) ((a0.c) a0Var).f8619b);
            }
        }, new f.a.g.b() { // from class: e.h.g.g
            @Override // f.a.g.b
            public final void a(Object obj) {
                FrameLayout frameLayout2 = frameLayout;
                ShimmerFrameLayout shimmerFrameLayout2 = shimmerFrameLayout;
                Throwable th = (Throwable) obj;
                shimmerFrameLayout2.b();
                shimmerFrameLayout2.setVisibility(8);
                frameLayout2.setVisibility(8);
            }
        });
        try {
            f.a.h.c.a.b bVar = new f.a.h.c.a.b(aVar3, aVar2);
            try {
                f.a.h.c.a.a aVar4 = new f.a.h.c.a.a(bVar);
                bVar.a(aVar4);
                r2.a(aVar4);
                aVar.a(aVar3);
            } catch (NullPointerException e2) {
                throw e2;
            } catch (Throwable th) {
                w.D0(th);
                NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                nullPointerException.initCause(th);
                throw nullPointerException;
            }
        } catch (NullPointerException e3) {
            throw e3;
        } catch (Throwable th2) {
            w.D0(th2);
            NullPointerException nullPointerException2 = new NullPointerException("subscribeActual failed");
            nullPointerException2.initCause(th2);
            throw nullPointerException2;
        }
    }

    public static void g(s sVar, InputStream inputStream, OutputStream outputStream, long j2) throws IOException {
        byte[] bArr = new byte[16384];
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream, 4096));
        int readInt = dataInputStream.readInt();
        if (readInt != -771763713) {
            String valueOf = String.valueOf(String.format("%x", Integer.valueOf(readInt)));
            throw new e.d.b.e.a.c.r(valueOf.length() != 0 ? "Unexpected magic=".concat(valueOf) : new String("Unexpected magic="));
        }
        int read = dataInputStream.read();
        if (read != 4) {
            throw new e.d.b.e.a.c.r(e.a.d.a.a.R(30, "Unexpected version=", read));
        }
        long j3 = 0;
        while (true) {
            long j4 = j2 - j3;
            try {
                int read2 = dataInputStream.read();
                if (read2 == -1) {
                    throw new IOException("Patch file overrun");
                }
                if (read2 == 0) {
                    return;
                }
                switch (read2) {
                    case 247:
                        read2 = dataInputStream.readUnsignedShort();
                        i(bArr, dataInputStream, outputStream, read2, j4);
                        break;
                    case 248:
                        read2 = dataInputStream.readInt();
                        i(bArr, dataInputStream, outputStream, read2, j4);
                        break;
                    case 249:
                        long readUnsignedShort = dataInputStream.readUnsignedShort();
                        read2 = dataInputStream.read();
                        if (read2 == -1) {
                            throw new IOException("Unexpected end of patch");
                        }
                        h(bArr, sVar, outputStream, readUnsignedShort, read2, j4);
                        break;
                    case 250:
                        read2 = dataInputStream.readUnsignedShort();
                        h(bArr, sVar, outputStream, dataInputStream.readUnsignedShort(), read2, j4);
                        break;
                    case 251:
                        read2 = dataInputStream.readInt();
                        h(bArr, sVar, outputStream, dataInputStream.readUnsignedShort(), read2, j4);
                        break;
                    case 252:
                        long readInt2 = dataInputStream.readInt();
                        read2 = dataInputStream.read();
                        if (read2 == -1) {
                            throw new IOException("Unexpected end of patch");
                        }
                        h(bArr, sVar, outputStream, readInt2, read2, j4);
                        break;
                    case 253:
                        read2 = dataInputStream.readUnsignedShort();
                        h(bArr, sVar, outputStream, dataInputStream.readInt(), read2, j4);
                        break;
                    case 254:
                        read2 = dataInputStream.readInt();
                        h(bArr, sVar, outputStream, dataInputStream.readInt(), read2, j4);
                        break;
                    case 255:
                        long readLong = dataInputStream.readLong();
                        read2 = dataInputStream.readInt();
                        h(bArr, sVar, outputStream, readLong, read2, j4);
                        break;
                    default:
                        i(bArr, dataInputStream, outputStream, read2, j4);
                        break;
                }
                j3 += read2;
            } finally {
                outputStream.flush();
            }
        }
    }

    public static void g0(Service service, String str, int i2, Notification notification, int i3, e.h.g.g1 g1Var) {
        if (service != null) {
            x();
            h1 h1Var = new h1(null);
            h1Var.a = 1;
            h1Var.f8303d = i2;
            h1Var.f8302c = notification;
            h1Var.f8305f = service;
            h1Var.f8307h = i3;
            h1Var.f8301b = g1Var;
            h1Var.f8306g = str;
            f6311c.b(h1Var);
        }
    }

    public static void h(byte[] bArr, s sVar, OutputStream outputStream, long j2, int i2, long j3) throws IOException {
        InputStream f2;
        int i3 = i2;
        if (i3 < 0) {
            throw new IOException("copyLength negative");
        }
        if (j2 < 0) {
            throw new IOException("inputOffset negative");
        }
        long j4 = i3;
        if (j4 > j3) {
            throw new IOException("Output length overrun");
        }
        try {
            t tVar = new t(sVar, j2, j4);
            synchronized (tVar) {
                f2 = tVar.f(0L, tVar.a());
            }
            while (i3 > 0) {
                int min = Math.min(i3, 16384);
                int i4 = 0;
                while (i4 < min) {
                    int read = f2.read(bArr, i4, min - i4);
                    if (read == -1) {
                        throw new IOException("truncated input stream");
                    }
                    i4 += read;
                }
                outputStream.write(bArr, 0, min);
                i3 -= min;
            }
            if (f2 != null) {
                f2.close();
            }
        } catch (EOFException e2) {
            throw new IOException("patch underrun", e2);
        }
    }

    public static int h0(Resources resources, float f2) {
        return (int) (f2 * resources.getDisplayMetrics().density);
    }

    public static void i(byte[] bArr, DataInputStream dataInputStream, OutputStream outputStream, int i2, long j2) throws IOException {
        if (i2 < 0) {
            throw new IOException("copyLength negative");
        }
        if (i2 > j2) {
            throw new IOException("Output length overrun");
        }
        while (i2 > 0) {
            try {
                int min = Math.min(i2, 16384);
                dataInputStream.readFully(bArr, 0, min);
                outputStream.write(bArr, 0, min);
                i2 -= min;
            } catch (EOFException unused) {
                throw new IOException("patch underrun");
            }
        }
    }

    public static PorterDuffColorFilter i0(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }

    public static boolean j(int i2, int i3) {
        if (i2 == 5) {
            if (i3 != 5) {
                return true;
            }
            i2 = 5;
        }
        if (i2 != 6 || i3 == 6 || i3 == 5) {
            if (i2 != 4 || i3 == 4) {
                if (i2 == 3 && (i3 == 2 || i3 == 7 || i3 == 1 || i3 == 8)) {
                    return true;
                }
                if (i2 == 2) {
                    return i3 == 1 || i3 == 8;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    public static <ResultT> ResultT k(r<ResultT> rVar) throws ExecutionException, InterruptedException {
        boolean z;
        Objects.requireNonNull(rVar, "Task must not be null");
        synchronized (rVar.a) {
            z = rVar.f7034c;
        }
        if (z) {
            return (ResultT) a(rVar);
        }
        e.d.b.e.a.g.s sVar = new e.d.b.e.a.g.s(null);
        Executor executor = e.f7021b;
        rVar.f7033b.a(new e.d.b.e.a.g.k(executor, sVar));
        rVar.c();
        rVar.f7033b.a(new i(executor, sVar));
        rVar.c();
        sVar.a.await();
        return (ResultT) a(rVar);
    }

    public static long l(byte[] bArr, int i2) {
        return ((n(bArr, i2 + 2) << 16) | n(bArr, i2)) & 4294967295L;
    }

    public static boolean m(int i2) {
        return i2 == 5 || i2 == 6 || i2 == 4;
    }

    public static int n(byte[] bArr, int i2) {
        return ((bArr[i2 + 1] & 255) << 8) | (bArr[i2] & 255);
    }

    public static boolean o(int i2) {
        return i2 == 2 || i2 == 7 || i2 == 3;
    }

    public static void p(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void q(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void r(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static Bitmap s(Bitmap bitmap, Bitmap.Config config) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), config);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColor(-16777216);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public static n<?> t(String str, String str2) {
        final c cVar = new c(str, str2);
        n.b a2 = n.a(e.d.d.x.f.class);
        a2.f7114d = 1;
        a2.c(new e.d.d.l.q() { // from class: e.d.d.l.a
            @Override // e.d.d.l.q
            public final Object a(o oVar) {
                return cVar;
            }
        });
        return a2.b();
    }

    public static Animator u(d dVar, float f2, float f3, float f4) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(dVar, (Property<d, V>) d.c.a, (TypeEvaluator) d.b.a, (Object[]) new d.e[]{new d.e(f2, f3, f4)});
        if (Build.VERSION.SDK_INT >= 21) {
            d.e revealInfo = dVar.getRevealInfo();
            if (revealInfo != null) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) dVar, (int) f2, (int) f3, revealInfo.f6402c, f4);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofObject, createCircularReveal);
                return animatorSet;
            }
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        return ofObject;
    }

    public static e.d.b.d.w.d v(int i2) {
        if (i2 != 0 && i2 == 1) {
            return new e.d.b.d.w.e();
        }
        return new e.d.b.d.w.i();
    }

    public static float w(float f2, float f3, float f4, float f5) {
        return (float) Math.hypot(f4 - f2, f5 - f3);
    }

    public static void x() {
        if (f6311c == null) {
            f6311c = new i1();
        }
    }

    public static boolean y(Context context, Uri uri) {
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{"document_id"}, null, null, null);
            return cursor.getCount() > 0;
        } catch (Exception e2) {
            Log.w("DocumentFile", "Failed query: " + e2);
            return false;
        } finally {
            q(cursor);
        }
    }

    public static n<?> z(final String str, final e.d.d.x.g<Context> gVar) {
        n.b a2 = n.a(e.d.d.x.f.class);
        a2.f7114d = 1;
        a2.a(new e.d.d.l.w(Context.class, 1, 0));
        a2.c(new e.d.d.l.q() { // from class: e.d.d.x.b
            @Override // e.d.d.l.q
            public final Object a(o oVar) {
                return new c(str, gVar.a((Context) oVar.a(Context.class)));
            }
        });
        return a2.b();
    }
}
