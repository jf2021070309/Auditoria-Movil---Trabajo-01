package e.j.d.c0;

import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Process;
import ch.qos.logback.classic.Level;
import ch.qos.logback.core.CoreConstants;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.android.gms.common.internal.ImagesContract;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.UUID;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public final class b0 {
    public static final b0 a = new b0();

    /* loaded from: classes2.dex */
    public enum a {
        NONE,
        THREE_DAYS,
        SEVEN_DAYS,
        THIRTY_DAYS
    }

    /* loaded from: classes2.dex */
    public enum b {
        NONE,
        YEARLY,
        MONTHLY,
        WEEKLY
    }

    @h.m.i.a.e(c = "com.zipoapps.premiumhelper.util.PremiumHelperUtils", f = "PremiumHelperUtils.kt", l = {357, 365, 369}, m = "withRetry")
    /* loaded from: classes2.dex */
    public static final class c<T> extends h.m.i.a.c {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public int f8620b;

        /* renamed from: c  reason: collision with root package name */
        public long f8621c;

        /* renamed from: d  reason: collision with root package name */
        public double f8622d;

        /* renamed from: e  reason: collision with root package name */
        public Object f8623e;

        /* renamed from: f  reason: collision with root package name */
        public Object f8624f;

        /* renamed from: g  reason: collision with root package name */
        public /* synthetic */ Object f8625g;

        /* renamed from: i  reason: collision with root package name */
        public int f8627i;

        public c(h.m.d<? super c> dVar) {
            super(dVar);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            this.f8625g = obj;
            this.f8627i |= Level.ALL_INT;
            return b0.this.p(0, 0L, 0L, 0.0d, null, this);
        }
    }

    public static final String e(Context context) {
        String string;
        h.o.c.j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        try {
            if (context.getApplicationInfo().labelRes == 0) {
                string = context.getApplicationInfo().nonLocalizedLabel.toString();
            } else {
                string = context.getString(context.getApplicationInfo().labelRes);
                h.o.c.j.d(string, "{\n                contex…o.labelRes)\n            }");
            }
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    public static final int g(Context context) {
        h.o.c.j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        return (int) ((System.currentTimeMillis() - i(context)) / 86400000);
    }

    public static final int h(long j2) {
        String id = TimeZone.getDefault().getID();
        Map<String, String> map = l.c.a.p.a;
        l.c.a.p y = l.c.a.p.y(id, map);
        l.c.a.d z = l.c.a.d.z(j2);
        l.c.a.f fVar = l.c.a.f.a;
        e.j.d.w.k0(z, "instant");
        e.j.d.w.k0(y, "zone");
        l.c.a.e eVar = l.c.a.f.c0(z.f9674b, z.f9675c, y.v().a(z)).f9681c;
        Map<String, String> map2 = l.c.a.p.a;
        l.c.a.p y2 = l.c.a.p.y(TimeZone.getDefault().getID(), map);
        l.c.a.d z2 = l.c.a.d.z(System.currentTimeMillis());
        l.c.a.e l0 = l.c.a.e.l0(e.j.d.w.G(z2.f9674b + y2.v().a(z2).f9708g, 86400L));
        l.c.a.l lVar = l.c.a.l.a;
        Objects.requireNonNull(eVar);
        l.c.a.e T = l.c.a.e.T(l0);
        long c0 = T.c0() - eVar.c0();
        int i2 = T.f9679e - eVar.f9679e;
        if (c0 > 0 && i2 < 0) {
            c0--;
            i2 = (int) (T.G() - eVar.o0(c0).G());
        } else if (c0 < 0 && i2 > 0) {
            c0++;
            i2 -= T.f0();
        }
        int i3 = (int) (c0 % 12);
        int s0 = e.j.d.w.s0(c0 / 12);
        return (((s0 | i3) | i2) == 0 ? l.c.a.l.a : new l.c.a.l(s0, i3, i2)).f9698e;
    }

    public static final long i(Context context) {
        h.o.c.j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
        } catch (Throwable unused) {
            return System.currentTimeMillis();
        }
    }

    public static final String j(Context context) {
        h.o.c.j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        try {
            int myPid = Process.myPid();
            Object systemService = context.getSystemService("activity");
            if (systemService != null) {
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                        if (runningAppProcessInfo.pid == myPid) {
                            return runningAppProcessInfo.processName;
                        }
                    }
                    return null;
                }
                return null;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
        } catch (Throwable th) {
            e.j.d.w.y(th);
            return null;
        }
    }

    public static final String k(Context context) {
        h.o.c.j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            h.o.c.j.d(str, "{\n            context.pa… 0).versionName\n        }");
            return str;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static final void m(Context context) {
        h.o.c.j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        try {
            try {
                String packageName = context.getPackageName();
                h.o.c.j.d(packageName, "context.packageName");
                String format = String.format("%s?id=%s", Arrays.copyOf(new Object[]{"market://details", packageName}, 2));
                h.o.c.j.d(format, "format(format, *args)");
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(format));
                intent.addFlags(1476919296);
                context.startActivity(intent);
                e.j.d.k.a.a().f();
            } catch (ActivityNotFoundException unused) {
                String packageName2 = context.getPackageName();
                h.o.c.j.d(packageName2, "context.packageName");
                String format2 = String.format("%s?id=%s", Arrays.copyOf(new Object[]{"https://play.google.com/store/apps/details", packageName2}, 2));
                h.o.c.j.d(format2, "format(format, *args)");
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(format2));
                intent2.addFlags(1476919296);
                context.startActivity(intent2);
                e.j.d.k.a.a().f();
            }
        } catch (Throwable th) {
            n.a.a.b("PremiumHelper").d(th, "Failed to open google play", new Object[0]);
        }
    }

    public static final void n(Context context, String str) {
        Object y;
        h.o.c.j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        h.o.c.j.e(str, ImagesContract.URL);
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            context.startActivity(intent);
            e.j.d.k.a.a().f();
            y = h.k.a;
        } catch (Throwable th) {
            y = e.j.d.w.y(th);
        }
        Throwable a2 = h.g.a(y);
        if (a2 == null) {
            return;
        }
        n.a.a.f9946d.c(a2);
    }

    public static final void o(Context context) {
        h.o.c.j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        StringBuilder y = e.a.d.a.a.y("https://play.google.com/store/apps/details?id=");
        y.append((Object) context.getPackageName());
        y.append("&referrer=utm_source%3Dshare_my_app");
        intent.putExtra("android.intent.extra.TEXT", y.toString());
        intent.setType("text/plain");
        context.startActivity(Intent.createChooser(intent, null));
        e.j.d.k.a.a().f();
    }

    public final Purchase a(Context context, String str) {
        h.o.c.j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        h.o.c.j.e(str, AppLovinEventParameters.PRODUCT_IDENTIFIER);
        return new Purchase("{\n\"orderId\":\"DEBUG.OFFER." + UUID.randomUUID() + "\",\n\"packageName\":\"" + ((Object) context.getPackageName()) + "\",\n\"productId\":\"" + str + "\",\n\"purchaseTime\":" + System.currentTimeMillis() + ",\n\"purchaseState\":0,\n\"purchaseToken\":\"debugtoken." + UUID.randomUUID() + "\",\n\"obfuscatedAccountId\":\"debugaccount." + UUID.randomUUID() + "\",\n\"acknowledged\":true,\n\"autoRenewing\":true\n}", UUID.randomUUID().toString());
    }

    public final SkuDetails b(String str, String str2, String str3) {
        h.o.c.j.e(str, AppLovinEventParameters.PRODUCT_IDENTIFIER);
        h.o.c.j.e(str2, "skuType");
        h.o.c.j.e(str3, "price");
        StringBuilder sb = new StringBuilder();
        sb.append("{\n\"title\":\"Debug offer\",\n\"price\":\"");
        sb.append(str3);
        sb.append("\",\n\"type\":\"");
        sb.append(str2);
        sb.append("\",\n\"subscriptionPeriod\":\"P1Y\",\n\"freeTrialPeriod\":\"P1W\",\n\"description\":\"debug-offer\",\n\"price_amount_micros\":890000,\n\"price_currency_code\":\"USD\",\n\"productId\":\"");
        return new SkuDetails(e.a.d.a.a.r(sb, str, "\"\n}"));
    }

    public final String c(Context context, SkuDetails skuDetails) {
        a aVar;
        b bVar;
        String string;
        h.o.c.j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        h.o.c.j.e(skuDetails, "skuDetails");
        String c2 = skuDetails.c();
        h.o.c.j.d(c2, "skuDetails.price");
        if (c2.length() == 0) {
            return "";
        }
        Resources resources = context.getResources();
        String d2 = skuDetails.d();
        h.o.c.j.d(d2, "this.sku");
        if (h.t.g.a(d2, "trial_0d", false, 2)) {
            aVar = a.NONE;
        } else {
            String d3 = skuDetails.d();
            h.o.c.j.d(d3, "this.sku");
            if (h.t.g.a(d3, "trial_3d", false, 2)) {
                aVar = a.THREE_DAYS;
            } else {
                String d4 = skuDetails.d();
                h.o.c.j.d(d4, "this.sku");
                if (h.t.g.a(d4, "trial_7d", false, 2)) {
                    aVar = a.SEVEN_DAYS;
                } else {
                    String d5 = skuDetails.d();
                    h.o.c.j.d(d5, "this.sku");
                    aVar = h.t.g.a(d5, "trial_30d", false, 2) ? a.THIRTY_DAYS : a.NONE;
                }
            }
        }
        String d6 = skuDetails.d();
        h.o.c.j.d(d6, "this.sku");
        if (h.t.g.b(d6, "_onetime", false, 2)) {
            bVar = b.NONE;
        } else {
            String d7 = skuDetails.d();
            h.o.c.j.d(d7, "this.sku");
            if (h.t.g.b(d7, "_weekly", false, 2)) {
                bVar = b.WEEKLY;
            } else {
                String d8 = skuDetails.d();
                h.o.c.j.d(d8, "this.sku");
                if (h.t.g.b(d8, "_monthly", false, 2)) {
                    bVar = b.MONTHLY;
                } else {
                    String d9 = skuDetails.d();
                    h.o.c.j.d(d9, "this.sku");
                    bVar = h.t.g.b(d9, "_yearly", false, 2) ? b.YEARLY : b.NONE;
                }
            }
        }
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            string = resources.getString(R.string.sku_price_onetime);
        } else if (ordinal == 1) {
            string = resources.getStringArray(R.array.sku_yearly_prices)[aVar.ordinal()];
        } else if (ordinal == 2) {
            string = resources.getStringArray(R.array.sku_monthly_prices)[aVar.ordinal()];
        } else if (ordinal != 3) {
            throw new h.e();
        } else {
            string = resources.getStringArray(R.array.sku_weekly_prices)[aVar.ordinal()];
        }
        String format = MessageFormat.format(string, skuDetails.c());
        h.o.c.j.d(format, "format(priceString, skuDetails.price)");
        return format;
    }

    public final a d(SkuDetails skuDetails) {
        String d2 = skuDetails.d();
        h.o.c.j.d(d2, "this.sku");
        if (h.t.g.a(d2, "trial_0d", false, 2)) {
            return a.NONE;
        }
        String d3 = skuDetails.d();
        h.o.c.j.d(d3, "this.sku");
        if (h.t.g.a(d3, "trial_3d", false, 2)) {
            return a.THREE_DAYS;
        }
        String d4 = skuDetails.d();
        h.o.c.j.d(d4, "this.sku");
        if (h.t.g.a(d4, "trial_7d", false, 2)) {
            return a.SEVEN_DAYS;
        }
        String d5 = skuDetails.d();
        h.o.c.j.d(d5, "this.sku");
        return h.t.g.a(d5, "trial_30d", false, 2) ? a.THIRTY_DAYS : a.NONE;
    }

    public final String f(Context context, e.j.d.h hVar) {
        String string;
        h.o.c.j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        h.o.c.j.e(hVar, "offer");
        if (hVar.f8801c == null) {
            String string2 = context.getString(R.string.ph_start_trial_cta);
            h.o.c.j.d(string2, "{\n            context.ge…tart_trial_cta)\n        }");
            return string2;
        }
        e.j.d.y.b bVar = e.j.d.k.a.a().f8812i;
        a d2 = d(hVar.f8801c);
        if (d2 == a.NONE) {
            Integer startLikeProTextNoTrial = bVar.J.getStartLikeProTextNoTrial();
            string = context.getString(startLikeProTextNoTrial == null ? R.string.ph_start_premium_cta : startLikeProTextNoTrial.intValue());
        } else {
            string = bVar.J.getStartLikeProTextTrial() != null ? context.getString(bVar.J.getStartLikeProTextTrial().intValue()) : ((Boolean) bVar.f(e.j.d.y.b.y)).booleanValue() ? context.getResources().getStringArray(R.array.cta_titles)[d2.ordinal()] : context.getString(R.string.ph_start_trial_cta);
        }
        h.o.c.j.d(string, "{\n\n            val confi…}\n            }\n        }");
        return string;
    }

    public final boolean l(Context context, String str) {
        boolean z;
        h.o.c.j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        h.o.c.j.e(str, "packageNames");
        boolean z2 = true;
        if (str.length() == 0) {
            return false;
        }
        List<String> p = h.t.g.p(str, new String[]{","}, false, 0, 6);
        h.o.c.j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        h.o.c.j.e(p, "packageNames");
        if (!p.isEmpty()) {
            for (String str2 : p) {
                h.o.c.j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
                h.o.c.j.e(str2, "packageName");
                try {
                    context.getPackageManager().getPackageInfo(h.t.g.v(str2).toString(), 0);
                    z = true;
                    continue;
                } catch (PackageManager.NameNotFoundException unused) {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
        }
        z2 = false;
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00e2 -> B:17:0x0051). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object p(int r19, long r20, long r22, double r24, h.o.b.l<? super h.m.d<? super e.j.d.c0.a0<? extends T>>, ? extends java.lang.Object> r26, h.m.d<? super e.j.d.c0.a0<? extends T>> r27) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.d.c0.b0.p(int, long, long, double, h.o.b.l, h.m.d):java.lang.Object");
    }
}
