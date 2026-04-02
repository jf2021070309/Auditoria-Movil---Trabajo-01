package com.zipoapps.premiumhelper.configuration.appconfig;

import android.app.Activity;
import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.common.internal.ImagesContract;
import com.zipoapps.ads.config.AdManagerConfiguration;
import com.zipoapps.premiumhelper.util.PHMessagingService;
import e.j.a.b;
import e.j.d.b0.c.g;
import e.j.d.w;
import e.j.d.y.b;
import h.o.c.f;
import h.o.c.j;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class PremiumHelperConfiguration {
    private final boolean adManagerTestAds;
    private final Map<String, String> configMap;
    private final Class<? extends Activity> introActivityClass;
    private final boolean isDebugMode;
    private final Class<? extends Activity> mainActivityClass;
    private final PHMessagingService.a pushMessageListener;
    private final int rateDialogLayout;
    private final int[] relaunchOneTimeActivityLayout;
    private final int[] relaunchPremiumActivityLayout;
    private final int[] startLikeProActivityLayout;
    private final Integer startLikeProTextNoTrial;
    private final Integer startLikeProTextTrial;
    private final boolean useTestLayouts;

    /* loaded from: classes.dex */
    public static final class a {
        public final boolean a;

        /* renamed from: b  reason: collision with root package name */
        public final HashMap<String, String> f4899b;

        /* renamed from: c  reason: collision with root package name */
        public int f4900c;

        /* renamed from: d  reason: collision with root package name */
        public int[] f4901d;

        /* renamed from: e  reason: collision with root package name */
        public Integer f4902e;

        /* renamed from: f  reason: collision with root package name */
        public Integer f4903f;

        /* renamed from: g  reason: collision with root package name */
        public int[] f4904g;

        /* renamed from: h  reason: collision with root package name */
        public int[] f4905h;

        /* renamed from: i  reason: collision with root package name */
        public Class<? extends Activity> f4906i;

        /* renamed from: j  reason: collision with root package name */
        public Class<? extends Activity> f4907j;

        /* renamed from: k  reason: collision with root package name */
        public PHMessagingService.a f4908k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f4909l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f4910m;

        public a(boolean z) {
            HashMap<String, String> hashMap = new HashMap<>();
            int[] iArr = {0};
            int[] iArr2 = {0};
            int[] iArr3 = {0};
            j.e(hashMap, "configMap");
            j.e(iArr, "startLikeProActivityLayout");
            j.e(iArr2, "relaunchPremiumActivityLayout");
            j.e(iArr3, "relaunchOneTimeActivityLayout");
            this.a = z;
            this.f4899b = hashMap;
            this.f4900c = 0;
            this.f4901d = iArr;
            this.f4902e = null;
            this.f4903f = null;
            this.f4904g = iArr2;
            this.f4905h = iArr3;
            this.f4906i = null;
            this.f4907j = null;
            this.f4908k = null;
            this.f4909l = false;
            this.f4910m = true;
        }

        public final a a(AdManagerConfiguration adManagerConfiguration) {
            j.e(adManagerConfiguration, "configuration");
            HashMap<String, String> hashMap = this.f4899b;
            String str = e.j.d.y.b.f8872f.a;
            String banner = adManagerConfiguration.getBanner();
            if (banner == null) {
                banner = "";
            }
            hashMap.put(str, banner);
            this.f4899b.put(e.j.d.y.b.f8873g.a, adManagerConfiguration.getInterstitial());
            HashMap<String, String> hashMap2 = this.f4899b;
            String str2 = e.j.d.y.b.f8874h.a;
            String str3 = adManagerConfiguration.getNative();
            if (str3 == null) {
                str3 = "";
            }
            hashMap2.put(str2, str3);
            HashMap<String, String> hashMap3 = this.f4899b;
            String str4 = e.j.d.y.b.f8875i.a;
            String rewarded = adManagerConfiguration.getRewarded();
            if (rewarded == null) {
                rewarded = "";
            }
            hashMap3.put(str4, rewarded);
            HashMap<String, String> hashMap4 = this.f4899b;
            String str5 = e.j.d.y.b.f8876j.a;
            String exit_banner = adManagerConfiguration.getExit_banner();
            if (exit_banner == null) {
                exit_banner = "";
            }
            hashMap4.put(str5, exit_banner);
            HashMap<String, String> hashMap5 = this.f4899b;
            String str6 = e.j.d.y.b.f8877k.a;
            String exit_native = adManagerConfiguration.getExit_native();
            hashMap5.put(str6, exit_native != null ? exit_native : "");
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:144:0x01b0, code lost:
            if (r2 == false) goto L111;
         */
        /* JADX WARN: Removed duplicated region for block: B:101:0x0117  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x0154  */
        /* JADX WARN: Removed duplicated region for block: B:152:0x01e9  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x00f1  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x00f5  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.zipoapps.premiumhelper.configuration.appconfig.PremiumHelperConfiguration b() {
            /*
                Method dump skipped, instructions count: 523
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zipoapps.premiumhelper.configuration.appconfig.PremiumHelperConfiguration.a.b():com.zipoapps.premiumhelper.configuration.appconfig.PremiumHelperConfiguration");
        }

        public final a c(String str) {
            j.e(str, "defaultSku");
            this.f4899b.put(e.j.d.y.b.f8869c.a, str);
            return this;
        }

        public final a d(Class<? extends Activity> cls) {
            j.e(cls, "mainActivityClass");
            this.f4906i = cls;
            return this;
        }

        public final a e(String str) {
            j.e(str, ImagesContract.URL);
            this.f4899b.put(e.j.d.y.b.r.a, str);
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.a == aVar.a && j.a(this.f4899b, aVar.f4899b) && this.f4900c == aVar.f4900c && j.a(this.f4901d, aVar.f4901d) && j.a(this.f4902e, aVar.f4902e) && j.a(this.f4903f, aVar.f4903f) && j.a(this.f4904g, aVar.f4904g) && j.a(this.f4905h, aVar.f4905h) && j.a(this.f4906i, aVar.f4906i) && j.a(this.f4907j, aVar.f4907j) && j.a(this.f4908k, aVar.f4908k) && this.f4909l == aVar.f4909l && this.f4910m == aVar.f4910m;
            }
            return false;
        }

        public final a f(g.b bVar) {
            j.e(bVar, "rateDialogMode");
            this.f4899b.put(e.j.d.y.b.o.a, bVar.name());
            return this;
        }

        public final a g(int... iArr) {
            j.e(iArr, "relaunchOneTimeActivityLayout");
            this.f4905h = iArr;
            return this;
        }

        public final a h(int... iArr) {
            j.e(iArr, "relaunchPremiumActivityLayout");
            this.f4904g = iArr;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v25 */
        /* JADX WARN: Type inference failed for: r0v26 */
        /* JADX WARN: Type inference failed for: r2v23, types: [boolean] */
        public int hashCode() {
            boolean z = this.a;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int hashCode = (Arrays.hashCode(this.f4901d) + ((((this.f4899b.hashCode() + (r0 * 31)) * 31) + this.f4900c) * 31)) * 31;
            Integer num = this.f4902e;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f4903f;
            int hashCode3 = (Arrays.hashCode(this.f4905h) + ((Arrays.hashCode(this.f4904g) + ((hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31)) * 31)) * 31;
            Class<? extends Activity> cls = this.f4906i;
            int hashCode4 = (hashCode3 + (cls == null ? 0 : cls.hashCode())) * 31;
            Class<? extends Activity> cls2 = this.f4907j;
            int hashCode5 = (hashCode4 + (cls2 == null ? 0 : cls2.hashCode())) * 31;
            PHMessagingService.a aVar = this.f4908k;
            int hashCode6 = (hashCode5 + (aVar != null ? aVar.hashCode() : 0)) * 31;
            ?? r2 = this.f4909l;
            int i2 = r2;
            if (r2 != 0) {
                i2 = 1;
            }
            int i3 = (hashCode6 + i2) * 31;
            boolean z2 = this.f4910m;
            return i3 + (z2 ? 1 : z2 ? 1 : 0);
        }

        public final <T> a i(b.a<T> aVar, T t) {
            j.e(aVar, "param");
            this.f4899b.put(aVar.a, String.valueOf(t));
            return this;
        }

        public final a j(long j2) {
            i(e.j.d.y.b.v, Long.valueOf(j2));
            return this;
        }

        public final a k(long j2, b.EnumC0180b enumC0180b) {
            j.e(enumC0180b, "type");
            i(e.j.d.y.b.w, Long.valueOf(j2));
            i(e.j.d.y.b.x, enumC0180b);
            return this;
        }

        public final a l(String... strArr) {
            j.e(strArr, "name");
            b.a.d dVar = e.j.d.y.b.C;
            String join = TextUtils.join(",", strArr);
            j.d(join, "join(\",\", name)");
            i(dVar, join);
            return this;
        }

        public final a m(boolean z) {
            this.f4899b.put(e.j.d.y.b.z.a, String.valueOf(z));
            return this;
        }

        public final a n(boolean z) {
            this.f4899b.put(e.j.d.y.b.u.a, String.valueOf(z));
            return this;
        }

        public final a o(int... iArr) {
            j.e(iArr, "startLikeProActivityLayout");
            this.f4901d = iArr;
            return this;
        }

        public final a p(String str) {
            j.e(str, ImagesContract.URL);
            this.f4899b.put(e.j.d.y.b.q.a, str);
            return this;
        }

        public String toString() {
            StringBuilder y = e.a.d.a.a.y("Builder(isDebugMode=");
            y.append(this.a);
            y.append(", configMap=");
            y.append(this.f4899b);
            y.append(", rateDialogLayout=");
            y.append(this.f4900c);
            y.append(", startLikeProActivityLayout=");
            y.append(Arrays.toString(this.f4901d));
            y.append(", startLikeProTextNoTrial=");
            y.append(this.f4902e);
            y.append(", startLikeProTextTrial=");
            y.append(this.f4903f);
            y.append(", relaunchPremiumActivityLayout=");
            y.append(Arrays.toString(this.f4904g));
            y.append(", relaunchOneTimeActivityLayout=");
            y.append(Arrays.toString(this.f4905h));
            y.append(", mainActivityClass=");
            y.append(this.f4906i);
            y.append(", introActivityClass=");
            y.append(this.f4907j);
            y.append(", pushMessageListener=");
            y.append(this.f4908k);
            y.append(", adManagerTestAds=");
            y.append(this.f4909l);
            y.append(", useTestLayouts=");
            y.append(this.f4910m);
            y.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return y.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements e.j.d.y.a {
        public b() {
        }

        @Override // e.j.d.y.a
        public Map<String, String> a() {
            return PremiumHelperConfiguration.this.getConfigMap();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // e.j.d.y.a
        public <T> T b(String str, T t) {
            j.e(str, Action.KEY_ATTRIBUTE);
            Object obj = null;
            obj = null;
            obj = null;
            if (t instanceof String) {
                obj = PremiumHelperConfiguration.this.getConfigMap().get(str);
            } else if (t instanceof Boolean) {
                String str2 = PremiumHelperConfiguration.this.getConfigMap().get(str);
                if (str2 != null) {
                    obj = h.t.g.t(str2);
                }
            } else if (t instanceof Long) {
                String str3 = PremiumHelperConfiguration.this.getConfigMap().get(str);
                if (str3 != null) {
                    obj = h.t.g.u(str3);
                }
            } else if (!(t instanceof Double)) {
                throw new IllegalStateException("Unsupported type");
            } else {
                String str4 = PremiumHelperConfiguration.this.getConfigMap().get(str);
                if (str4 != null) {
                    obj = w.G0(str4);
                }
            }
            return obj == null ? t : obj;
        }

        @Override // e.j.d.y.a
        public boolean contains(String str) {
            j.e(str, Action.KEY_ATTRIBUTE);
            return PremiumHelperConfiguration.this.getConfigMap().containsKey(str);
        }

        @Override // e.j.d.y.a
        public String name() {
            return "App Default";
        }
    }

    public PremiumHelperConfiguration(Class<? extends Activity> cls, Class<? extends Activity> cls2, PHMessagingService.a aVar, int i2, int[] iArr, Integer num, Integer num2, int[] iArr2, int[] iArr3, boolean z, boolean z2, boolean z3, Map<String, String> map) {
        j.e(cls, "mainActivityClass");
        j.e(iArr, "startLikeProActivityLayout");
        j.e(iArr2, "relaunchPremiumActivityLayout");
        j.e(iArr3, "relaunchOneTimeActivityLayout");
        j.e(map, "configMap");
        this.mainActivityClass = cls;
        this.introActivityClass = cls2;
        this.pushMessageListener = aVar;
        this.rateDialogLayout = i2;
        this.startLikeProActivityLayout = iArr;
        this.startLikeProTextNoTrial = num;
        this.startLikeProTextTrial = num2;
        this.relaunchPremiumActivityLayout = iArr2;
        this.relaunchOneTimeActivityLayout = iArr3;
        this.isDebugMode = z;
        this.adManagerTestAds = z2;
        this.useTestLayouts = z3;
        this.configMap = map;
    }

    public /* synthetic */ PremiumHelperConfiguration(Class cls, Class cls2, PHMessagingService.a aVar, int i2, int[] iArr, Integer num, Integer num2, int[] iArr2, int[] iArr3, boolean z, boolean z2, boolean z3, Map map, int i3, f fVar) {
        this(cls, cls2, aVar, i2, iArr, num, num2, iArr2, iArr3, z, z2, z3, (i3 & 4096) != 0 ? new HashMap() : map);
    }

    public final Class<? extends Activity> component1() {
        return this.mainActivityClass;
    }

    public final boolean component10() {
        return this.isDebugMode;
    }

    public final boolean component11() {
        return this.adManagerTestAds;
    }

    public final boolean component12() {
        return this.useTestLayouts;
    }

    public final Map<String, String> component13() {
        return this.configMap;
    }

    public final Class<? extends Activity> component2() {
        return this.introActivityClass;
    }

    public final PHMessagingService.a component3() {
        return this.pushMessageListener;
    }

    public final int component4() {
        return this.rateDialogLayout;
    }

    public final int[] component5() {
        return this.startLikeProActivityLayout;
    }

    public final Integer component6() {
        return this.startLikeProTextNoTrial;
    }

    public final Integer component7() {
        return this.startLikeProTextTrial;
    }

    public final int[] component8() {
        return this.relaunchPremiumActivityLayout;
    }

    public final int[] component9() {
        return this.relaunchOneTimeActivityLayout;
    }

    public final PremiumHelperConfiguration copy(Class<? extends Activity> cls, Class<? extends Activity> cls2, PHMessagingService.a aVar, int i2, int[] iArr, Integer num, Integer num2, int[] iArr2, int[] iArr3, boolean z, boolean z2, boolean z3, Map<String, String> map) {
        j.e(cls, "mainActivityClass");
        j.e(iArr, "startLikeProActivityLayout");
        j.e(iArr2, "relaunchPremiumActivityLayout");
        j.e(iArr3, "relaunchOneTimeActivityLayout");
        j.e(map, "configMap");
        return new PremiumHelperConfiguration(cls, cls2, aVar, i2, iArr, num, num2, iArr2, iArr3, z, z2, z3, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PremiumHelperConfiguration) {
            PremiumHelperConfiguration premiumHelperConfiguration = (PremiumHelperConfiguration) obj;
            return j.a(this.mainActivityClass, premiumHelperConfiguration.mainActivityClass) && j.a(this.introActivityClass, premiumHelperConfiguration.introActivityClass) && j.a(this.pushMessageListener, premiumHelperConfiguration.pushMessageListener) && this.rateDialogLayout == premiumHelperConfiguration.rateDialogLayout && j.a(this.startLikeProActivityLayout, premiumHelperConfiguration.startLikeProActivityLayout) && j.a(this.startLikeProTextNoTrial, premiumHelperConfiguration.startLikeProTextNoTrial) && j.a(this.startLikeProTextTrial, premiumHelperConfiguration.startLikeProTextTrial) && j.a(this.relaunchPremiumActivityLayout, premiumHelperConfiguration.relaunchPremiumActivityLayout) && j.a(this.relaunchOneTimeActivityLayout, premiumHelperConfiguration.relaunchOneTimeActivityLayout) && this.isDebugMode == premiumHelperConfiguration.isDebugMode && this.adManagerTestAds == premiumHelperConfiguration.adManagerTestAds && this.useTestLayouts == premiumHelperConfiguration.useTestLayouts && j.a(this.configMap, premiumHelperConfiguration.configMap);
        }
        return false;
    }

    public final boolean getAdManagerTestAds() {
        return this.adManagerTestAds;
    }

    public final Map<String, String> getConfigMap() {
        return this.configMap;
    }

    public final Class<? extends Activity> getIntroActivityClass() {
        return this.introActivityClass;
    }

    public final Class<? extends Activity> getMainActivityClass() {
        return this.mainActivityClass;
    }

    public final PHMessagingService.a getPushMessageListener() {
        return this.pushMessageListener;
    }

    public final int getRateDialogLayout() {
        return this.rateDialogLayout;
    }

    public final int[] getRelaunchOneTimeActivityLayout() {
        return this.relaunchOneTimeActivityLayout;
    }

    public final int[] getRelaunchPremiumActivityLayout() {
        return this.relaunchPremiumActivityLayout;
    }

    public final int[] getStartLikeProActivityLayout() {
        return this.startLikeProActivityLayout;
    }

    public final Integer getStartLikeProTextNoTrial() {
        return this.startLikeProTextNoTrial;
    }

    public final Integer getStartLikeProTextTrial() {
        return this.startLikeProTextTrial;
    }

    public final boolean getUseTestLayouts() {
        return this.useTestLayouts;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.mainActivityClass.hashCode() * 31;
        Class<? extends Activity> cls = this.introActivityClass;
        int hashCode2 = (hashCode + (cls == null ? 0 : cls.hashCode())) * 31;
        PHMessagingService.a aVar = this.pushMessageListener;
        int hashCode3 = (Arrays.hashCode(this.startLikeProActivityLayout) + ((((hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.rateDialogLayout) * 31)) * 31;
        Integer num = this.startLikeProTextNoTrial;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.startLikeProTextTrial;
        int hashCode5 = (Arrays.hashCode(this.relaunchOneTimeActivityLayout) + ((Arrays.hashCode(this.relaunchPremiumActivityLayout) + ((hashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31)) * 31)) * 31;
        boolean z = this.isDebugMode;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode5 + i2) * 31;
        boolean z2 = this.adManagerTestAds;
        int i4 = z2;
        if (z2 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        boolean z3 = this.useTestLayouts;
        return this.configMap.hashCode() + ((i5 + (z3 ? 1 : z3 ? 1 : 0)) * 31);
    }

    public final boolean isDebugMode() {
        return this.isDebugMode;
    }

    public final e.j.d.y.a repository() {
        return new b();
    }

    public String toString() {
        Class<?> cls;
        StringBuilder sb = new StringBuilder();
        sb.append(j.i("MainActivity : ", getMainActivityClass().getName()));
        j.d(sb, "append(value)");
        sb.append('\n');
        j.d(sb, "append('\\n')");
        PHMessagingService.a pushMessageListener = getPushMessageListener();
        String str = "not set";
        if (pushMessageListener != null && (cls = pushMessageListener.getClass()) != null) {
            str = cls.getName();
        }
        sb.append(j.i("PushMessageListener : ", str));
        j.d(sb, "append(value)");
        sb.append('\n');
        j.d(sb, "append('\\n')");
        sb.append(j.i("rateDialogLayout : ", Integer.valueOf(getRateDialogLayout())));
        j.d(sb, "append(value)");
        sb.append('\n');
        j.d(sb, "append('\\n')");
        sb.append(j.i("startLikeProActivityLayout : ", getStartLikeProActivityLayout()));
        j.d(sb, "append(value)");
        sb.append('\n');
        j.d(sb, "append('\\n')");
        sb.append(j.i("startLikeProTextNoTrial : ", getStartLikeProTextNoTrial()));
        j.d(sb, "append(value)");
        sb.append('\n');
        j.d(sb, "append('\\n')");
        sb.append(j.i("startLikeProTextTrial : ", getStartLikeProTextTrial()));
        j.d(sb, "append(value)");
        sb.append('\n');
        j.d(sb, "append('\\n')");
        sb.append(j.i("relaunchPremiumActivityLayout : ", getRelaunchPremiumActivityLayout()));
        j.d(sb, "append(value)");
        sb.append('\n');
        j.d(sb, "append('\\n')");
        sb.append(j.i("relaunchOneTimeActivityLayout : ", getRelaunchOneTimeActivityLayout()));
        j.d(sb, "append(value)");
        sb.append('\n');
        j.d(sb, "append('\\n')");
        sb.append(j.i("isDebugMode : ", Boolean.valueOf(isDebugMode())));
        j.d(sb, "append(value)");
        sb.append('\n');
        j.d(sb, "append('\\n')");
        sb.append(j.i("adManagerTestAds : ", Boolean.valueOf(getAdManagerTestAds())));
        j.d(sb, "append(value)");
        sb.append('\n');
        j.d(sb, "append('\\n')");
        sb.append(j.i("useTestLayouts : ", Boolean.valueOf(getUseTestLayouts())));
        j.d(sb, "append(value)");
        sb.append('\n');
        j.d(sb, "append('\\n')");
        sb.append("configMap : ");
        j.d(sb, "append(value)");
        sb.append('\n');
        j.d(sb, "append('\\n')");
        sb.append(new JSONObject(new e.d.e.j().f(getConfigMap())).toString(4));
        j.d(sb, "append(value)");
        sb.append('\n');
        j.d(sb, "append('\\n')");
        String sb2 = sb.toString();
        j.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
