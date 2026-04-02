package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.a;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.J;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.server.HttpFunctions;
import com.ironsource.mediationsdk.server.ServerURL;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class E implements com.ironsource.mediationsdk.utils.i {
    private static boolean am;
    M A;
    com.ironsource.mediationsdk.adunit.c.g B;
    boolean C;
    boolean D;
    boolean E;
    boolean F;
    boolean G;
    int H;
    C0124r I;
    C0122p J;
    com.ironsource.mediationsdk.impressionData.a K;
    private final String L;
    private final String M;
    private AbstractAdapter N;
    private AtomicBoolean O;
    private final Object P;
    private AtomicBoolean Q;
    private boolean R;
    private List<IronSource.AD_UNIT> S;
    private Set<IronSource.AD_UNIT> T;
    private Set<IronSource.AD_UNIT> U;
    private boolean V;
    private final String W;
    private boolean X;
    private boolean Y;
    private boolean Z;
    final String a;
    private Boolean aa;
    private IronSourceBannerLayout ab;
    private String ac;
    private com.ironsource.mediationsdk.adunit.c.h ad;
    private com.ironsource.mediationsdk.sdk.f ae;
    private boolean af;
    private boolean ag;
    private CopyOnWriteArraySet<String> ah;
    private CopyOnWriteArraySet<String> ai;
    private CopyOnWriteArraySet<String> aj;
    private C0126t ak;
    private com.ironsource.c.a al;
    Y b;
    B c;
    L d;
    C0117k e;
    IronSourceLoggerManager f;
    com.ironsource.mediationsdk.sdk.j g;
    com.ironsource.mediationsdk.logger.b h;
    com.ironsource.mediationsdk.utils.k i;
    public String j;
    public String k;
    String l;
    public String m;
    public Map<String, String> n;
    public String o;
    public String p;
    Context q;
    Boolean r;
    IronSourceSegment s;
    int t;
    boolean u;
    boolean v;
    boolean w;
    Boolean x;
    InterfaceC0131y y;
    P z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.mediationsdk.E$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[c.a.a().length];
            b = iArr;
            try {
                int i = c.a.a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = b;
                int i2 = c.a.b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = b;
                int i3 = c.a.c;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = b;
                int i4 = c.a.d;
                iArr4[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr5 = new int[IronSource.AD_UNIT.values().length];
            a = iArr5;
            try {
                iArr5[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[IronSource.AD_UNIT.OFFERWALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[IronSource.AD_UNIT.BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface a {
        void a(String str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class b {
        static volatile E a = new E((byte) 0);
    }

    private E() {
        this.a = getClass().getName();
        this.L = "!SDK-VERSION-STRING!:com.ironsource:mediationsdk:\u200b7.1.12.2";
        this.M = "Activity=";
        this.P = new Object();
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.R = false;
        this.p = null;
        this.r = null;
        this.V = true;
        this.W = IronSourceConstants.KEY_SESSION_DEPTH;
        this.x = null;
        this.f = IronSourceLoggerManager.getLogger(0);
        com.ironsource.mediationsdk.logger.b bVar = new com.ironsource.mediationsdk.logger.b(null, 1);
        this.h = bVar;
        this.f.addLogger(bVar);
        this.g = new com.ironsource.mediationsdk.sdk.j();
        Y y = new Y();
        this.b = y;
        y.m = this.g;
        B b2 = new B();
        this.c = b2;
        com.ironsource.mediationsdk.sdk.j jVar = this.g;
        b2.m = jVar;
        b2.n.a = jVar;
        L l = new L();
        this.d = l;
        l.b = this.g;
        this.O = new AtomicBoolean();
        this.T = new HashSet();
        this.U = new HashSet();
        this.v = false;
        this.u = false;
        this.X = false;
        this.Q = new AtomicBoolean(true);
        this.t = 0;
        this.Y = false;
        this.w = false;
        this.Z = false;
        this.p = UUID.randomUUID().toString();
        this.aa = Boolean.FALSE;
        this.F = false;
        this.ac = null;
        this.y = null;
        this.z = null;
        this.ae = null;
        this.A = null;
        this.C = false;
        this.af = false;
        this.D = false;
        this.G = false;
        this.ah = new CopyOnWriteArraySet<>();
        this.ai = new CopyOnWriteArraySet<>();
        this.aj = new CopyOnWriteArraySet<>();
        this.I = null;
        this.ak = null;
        this.J = null;
        this.e = null;
        this.H = 1;
        this.K = new com.ironsource.mediationsdk.impressionData.a();
        this.al = new com.ironsource.c.a();
    }

    /* synthetic */ E(byte b2) {
        this();
    }

    private void A() {
        this.f.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.i.a.e.size(); i++) {
            String str = this.i.a.e.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.i.b.a(str));
            }
        }
        if (arrayList.size() > 0) {
            synchronized (this.aj) {
                this.J = new C0122p(arrayList, this.i.c.d, this.j, this.k);
            }
            this.aj.clear();
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, 1);
        a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        b(IronSourceConstants.TROUBLESHOOTING_BN_INIT_FAILED, mediationAdditionalData);
        a(IronSource.AD_UNIT.BANNER, false);
    }

    private void B() {
        if (this.aa.booleanValue()) {
            this.aa = Boolean.FALSE;
            a(this.ab, this.ac);
            this.ab = null;
            this.ac = null;
        }
    }

    private boolean C() {
        com.ironsource.mediationsdk.utils.k kVar = this.i;
        return (kVar == null || kVar.c == null || this.i.c.d == null) ? false : true;
    }

    private static boolean D() {
        return ContextProvider.getInstance().getCurrentActiveActivity() != null;
    }

    private int a(com.ironsource.mediationsdk.model.p pVar) {
        return !this.ag && pVar.l.n ? 2 : 1;
    }

    public static E a() {
        return b.a;
    }

    private com.ironsource.mediationsdk.utils.k a(Context context, String str) {
        if (IronSourceUtils.isInitResponseCached(context)) {
            String cachedValueByKeyOfCachedInitResponse = IronSourceUtils.getCachedValueByKeyOfCachedInitResponse(context, "appKey");
            String cachedValueByKeyOfCachedInitResponse2 = IronSourceUtils.getCachedValueByKeyOfCachedInitResponse(context, DataKeys.USER_ID);
            String cachedValueByKeyOfCachedInitResponse3 = IronSourceUtils.getCachedValueByKeyOfCachedInitResponse(context, "response");
            String str2 = this.j;
            if (str2 != null && cachedValueByKeyOfCachedInitResponse.equals(str2) && cachedValueByKeyOfCachedInitResponse2.equals(str)) {
                return new com.ironsource.mediationsdk.utils.k(context, cachedValueByKeyOfCachedInitResponse, cachedValueByKeyOfCachedInitResponse2, cachedValueByKeyOfCachedInitResponse3);
            }
        }
        return null;
    }

    public static String a(Context context) {
        try {
            String[] a2 = com.ironsource.environment.h.a(context);
            if (a2[0] != null) {
                return a2[0];
            }
        } catch (Exception unused) {
        }
        return "";
    }

    private static String a(String str, int i) {
        if (i == 0) {
            return null;
        }
        int i2 = AnonymousClass1.b[i - 1];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return "placement " + str + " is capped";
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(int i, JSONObject jSONObject) {
        com.ironsource.mediationsdk.a.h.e().b(new com.ironsource.mediationsdk.adunit.a.a(i, jSONObject));
    }

    private void a(IronSource.AD_UNIT ad_unit) {
        String str = ad_unit + " ad unit has already been initialized";
        this.f.log(IronSourceLogger.IronSourceTag.API, str, 3);
        IronSourceUtils.sendAutomationLog(str);
    }

    private void a(IronSource.AD_UNIT ad_unit, boolean z) {
        int i = AnonymousClass1.a[ad_unit.ordinal()];
        if (i == 1) {
            if (this.u) {
                Iterator<String> it = this.ai.iterator();
                while (it.hasNext()) {
                    W.a().a(it.next(), ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                }
                this.ai.clear();
            } else if (z || d() || this.U.contains(ad_unit)) {
                this.g.onRewardedVideoAvailabilityChanged(false);
            }
        } else if (i == 2) {
            if (!this.v) {
                if (this.F) {
                    this.F = false;
                    C0121o.a().a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                    return;
                }
                return;
            }
            Iterator<String> it2 = this.ah.iterator();
            while (it2.hasNext()) {
                C0132z.a().a(it2.next(), ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            }
            this.ah.clear();
        } else if (i == 3) {
            if (z || i() || this.U.contains(ad_unit)) {
                this.g.onOfferwallAvailable(false);
            }
        } else if (i != 4) {
        } else {
            synchronized (this.aa) {
                if (this.aa.booleanValue()) {
                    this.aa = Boolean.FALSE;
                    C0116j.a().a(this.ab, new IronSourceError(IronSourceError.ERROR_BN_INIT_FAILED_AFTER_LOAD, "Init had failed"));
                    this.ab = null;
                    this.ac = null;
                }
            }
        }
    }

    public static void a(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        C0132z.a().a = iSDemandOnlyInterstitialListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        W.a().a = iSDemandOnlyRewardedVideoListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str, com.ironsource.mediationsdk.utils.c cVar) {
        if (str != null) {
            try {
                if (str.length() > 64) {
                    cVar.a(ErrorBuilder.buildInvalidKeyValueError("segment", IronSourceConstants.SUPERSONIC_CONFIG_NAME, "segment value should not exceed 64 characters."));
                }
            } catch (Exception unused) {
                cVar.a(ErrorBuilder.buildInvalidKeyValueError("segment", IronSourceConstants.SUPERSONIC_CONFIG_NAME, "segment value should not exceed 64 characters."));
            }
        }
    }

    private void a(ArrayList<NetworkSettings> arrayList) {
        this.f.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in programmatic mode", 0);
        this.A = new M(arrayList, new com.ironsource.mediationsdk.server.b(this.j, IronSourceUtils.getUserIdForNetworks(), this.i.c.d), com.ironsource.mediationsdk.c.b.a().b());
        B();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(JSONObject jSONObject, Object[][] objArr) {
        for (int i = 0; i <= 0; i++) {
            try {
                Object[] objArr2 = objArr[0];
                jSONObject.put(objArr2[0].toString(), objArr2[1]);
            } catch (Exception e) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "IronSourceObject addToDictionary: " + Log.getStackTraceString(e), 3);
                return;
            }
        }
    }

    public static void a(boolean z) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        logger.log(ironSourceTag, "setAdaptersDebug : " + z, 1);
        C0110d.a().b(z);
    }

    private synchronized void a(boolean z, IronSource.AD_UNIT... ad_unitArr) {
        String str;
        String str2;
        int i = 0;
        for (IronSource.AD_UNIT ad_unit : ad_unitArr) {
            if (ad_unit.equals(IronSource.AD_UNIT.INTERSTITIAL)) {
                this.w = true;
            } else if (ad_unit.equals(IronSource.AD_UNIT.BANNER)) {
                this.Z = true;
            } else if (ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO)) {
                this.Y = true;
            }
        }
        if (J.a().b() == J.a.INIT_FAILED) {
            try {
                if (this.g != null) {
                    int length = ad_unitArr.length;
                    while (i < length) {
                        IronSource.AD_UNIT ad_unit2 = ad_unitArr[i];
                        if (!this.T.contains(ad_unit2)) {
                            a(ad_unit2, true);
                        }
                        i++;
                    }
                }
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        } else if (!this.R) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(z);
            int length2 = ad_unitArr.length;
            boolean z2 = false;
            while (i < length2) {
                IronSource.AD_UNIT ad_unit3 = ad_unitArr[i];
                if (this.T.contains(ad_unit3)) {
                    this.f.log(IronSourceLogger.IronSourceTag.API, ad_unit3 + " ad unit has started initializing.", 3);
                } else {
                    this.T.add(ad_unit3);
                    this.U.add(ad_unit3);
                    try {
                        mediationAdditionalData.put(ad_unit3.toString(), true);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    z2 = true;
                }
                i++;
            }
            if (z2) {
                try {
                    StringBuilder sb = new StringBuilder();
                    String str3 = ",androidx=" + IronSourceUtils.isAndroidXAvailable();
                    String str4 = ",Activity=" + D();
                    if (a.AnonymousClass1.d()) {
                        sb.append(IronSourceConstants.IS_APP_LANGUAGE_KOTLIN);
                        str2 = a.AnonymousClass1.c();
                    } else {
                        str2 = IronSourceConstants.IS_APP_LANGUAGE_JAVA;
                    }
                    sb.append(str2);
                    sb.append(str3);
                    if (m()) {
                        sb.append(str4);
                    }
                    mediationAdditionalData.put(IronSourceConstants.EVENTS_EXT1, sb.toString());
                    int i2 = this.t + 1;
                    this.t = i2;
                    mediationAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, i2);
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
                com.ironsource.mediationsdk.a.h.e().b(new com.ironsource.mediationsdk.adunit.a.a(14, mediationAdditionalData));
            }
            return;
        } else {
            J.a().b(z);
            if (this.S == null) {
                return;
            }
            JSONObject mediationAdditionalData2 = IronSourceUtils.getMediationAdditionalData(z);
            boolean z3 = false;
            for (IronSource.AD_UNIT ad_unit4 : ad_unitArr) {
                if (this.T.contains(ad_unit4)) {
                    a(ad_unit4);
                } else {
                    this.T.add(ad_unit4);
                    this.U.add(ad_unit4);
                    try {
                        mediationAdditionalData2.put(ad_unit4.toString(), true);
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                    if (this.S == null || !this.S.contains(ad_unit4)) {
                        a(ad_unit4, false);
                    } else {
                        b(ad_unit4);
                    }
                    z3 = true;
                }
            }
            if (z3) {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    String str5 = ",androidx=" + IronSourceUtils.isAndroidXAvailable();
                    String str6 = ",Activity=" + D();
                    if (a.AnonymousClass1.d()) {
                        sb2.append(IronSourceConstants.IS_APP_LANGUAGE_KOTLIN);
                        str = a.AnonymousClass1.c();
                    } else {
                        str = IronSourceConstants.IS_APP_LANGUAGE_JAVA;
                    }
                    sb2.append(str);
                    sb2.append(str5);
                    if (m()) {
                        sb2.append(str6);
                    }
                    mediationAdditionalData2.put(IronSourceConstants.EVENTS_EXT1, sb2.toString());
                    int i3 = this.t + 1;
                    this.t = i3;
                    mediationAdditionalData2.put(IronSourceConstants.KEY_SESSION_DEPTH, i3);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                com.ironsource.mediationsdk.a.h.e().b(new com.ironsource.mediationsdk.adunit.a.a(14, mediationAdditionalData2));
            }
            return;
        }
    }

    private static boolean a(AbstractC0108b abstractC0108b) {
        return abstractC0108b.k > 0 && abstractC0108b.l > 0;
    }

    private static boolean a(String str, int i, int i2) {
        return str != null && str.length() >= i && str.length() <= i2;
    }

    private com.ironsource.mediationsdk.utils.k b(Context context, String str, a aVar) {
        Vector vector;
        com.ironsource.mediationsdk.utils.k kVar = null;
        if (IronSourceUtils.isNetworkConnected(context)) {
            try {
                String a2 = a(context);
                if (TextUtils.isEmpty(a2)) {
                    a2 = com.ironsource.environment.h.y(context);
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
                }
                String str2 = a2;
                if (this.s != null) {
                    IronSourceSegment ironSourceSegment = this.s;
                    Vector vector2 = new Vector();
                    if (ironSourceSegment.b != -1) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(ironSourceSegment.b);
                        vector2.add(new Pair("age", sb.toString()));
                    }
                    if (!TextUtils.isEmpty(ironSourceSegment.c)) {
                        vector2.add(new Pair(IronSourceSegment.GENDER, ironSourceSegment.c));
                    }
                    if (ironSourceSegment.d != -1) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(ironSourceSegment.d);
                        vector2.add(new Pair(IronSourceSegment.LEVEL, sb2.toString()));
                    }
                    if (ironSourceSegment.e != null) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(ironSourceSegment.e);
                        vector2.add(new Pair(IronSourceSegment.PAYING, sb3.toString()));
                    }
                    if (ironSourceSegment.f != -1.0d) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(ironSourceSegment.f);
                        vector2.add(new Pair(IronSourceSegment.IAPT, sb4.toString()));
                    }
                    if (ironSourceSegment.g != 0) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(ironSourceSegment.g);
                        vector2.add(new Pair(IronSourceSegment.USER_CREATION_DATE, sb5.toString()));
                    }
                    if (!TextUtils.isEmpty(ironSourceSegment.a)) {
                        vector2.add(new Pair("segName", ironSourceSegment.a));
                    }
                    vector2.addAll(ironSourceSegment.h);
                    vector = vector2;
                } else {
                    vector = null;
                }
                String stringFromURL = HttpFunctions.getStringFromURL(ServerURL.getCPVProvidersURL(context, this.j, str, str2, this.o, false, vector), aVar);
                if (stringFromURL == null) {
                    IronLog.INTERNAL.warning("serverResponseString is null");
                    return null;
                }
                if (IronSourceUtils.getSerr() == 1) {
                    IronLog.INTERNAL.verbose("encrypt");
                    String optString = new JSONObject(stringFromURL).optString("response", null);
                    if (TextUtils.isEmpty(optString)) {
                        IronLog.INTERNAL.warning("encryptedResponse is empty - return null");
                        return null;
                    }
                    stringFromURL = IronSourceAES.decode(com.ironsource.mediationsdk.utils.g.a().b(), optString);
                    if (TextUtils.isEmpty(stringFromURL)) {
                        IronLog.INTERNAL.warning("encoded response invalid - return null");
                        if (!am) {
                            am = true;
                            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
                            try {
                                mediationAdditionalData.put("status", "false");
                                mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, 1);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            com.ironsource.mediationsdk.a.h.e().b(new com.ironsource.mediationsdk.adunit.a.a(114, mediationAdditionalData));
                        }
                        return null;
                    }
                }
                com.ironsource.mediationsdk.utils.k kVar2 = new com.ironsource.mediationsdk.utils.k(context, this.j, str, stringFromURL);
                try {
                    if (kVar2.a()) {
                        return kVar2;
                    }
                    IronLog.INTERNAL.warning("response invalid - return null");
                    return null;
                } catch (Exception e2) {
                    e = e2;
                    kVar = kVar2;
                    IronLog.INTERNAL.warning("exception = " + e);
                    e.printStackTrace();
                    return kVar;
                }
            } catch (Exception e3) {
                e = e3;
                IronLog.INTERNAL.warning("exception = " + e);
                e.printStackTrace();
                return kVar;
            }
        }
        return null;
    }

    private static void b(int i, JSONObject jSONObject) {
        com.ironsource.mediationsdk.a.d.e().b(new com.ironsource.mediationsdk.adunit.a.a(i, jSONObject));
    }

    private void b(IronSource.AD_UNIT ad_unit) {
        int i = AnonymousClass1.a[ad_unit.ordinal()];
        if (i == 1) {
            q();
        } else if (i == 2) {
            y();
        } else if (i == 3) {
            this.d.a(this.j, this.k);
        } else if (i != 4) {
        } else {
            z();
        }
    }

    private void n() {
        this.f.log(IronSourceLogger.IronSourceTag.INTERNAL, "Rewarded Video started in programmatic mode", 0);
        List<NetworkSettings> s = s();
        if (s.size() <= 0) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, this.H);
            a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            a((int) IronSourceConstants.TROUBLESHOOTING_RV_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        this.y = this.i.c.a.l.n ? new F(s, this.i.c.a, this.j, IronSourceUtils.getUserIdForNetworks(), com.ironsource.mediationsdk.c.b.a().b()) : new S(s, this.i.c.a, this.j, IronSourceUtils.getUserIdForNetworks(), com.ironsource.mediationsdk.c.b.a().b());
        Boolean bool = this.r;
        if (bool != null) {
            this.y.a(this.q, bool.booleanValue());
            if (this.r.booleanValue()) {
                this.b.a(this.q, false);
            }
        }
    }

    private void o() {
        this.f.log(IronSourceLogger.IronSourceTag.INTERNAL, "Rewarded Video started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.i.a.a.size(); i++) {
            String str = this.i.a.a.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.i.b.a(str));
            }
        }
        if (arrayList.size() <= 0) {
            a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        synchronized (this.ai) {
            this.ak = new C0126t(arrayList, this.i.c.a, this.j, this.k);
        }
        if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        Iterator<String> it = this.ai.iterator();
        while (it.hasNext()) {
            this.ak.a(it.next(), (String) null, false);
        }
        this.ai.clear();
    }

    private Placement p(String str) {
        com.ironsource.mediationsdk.model.p pVar = this.i.c.a;
        if (pVar != null) {
            Iterator<Placement> it = pVar.a.iterator();
            while (it.hasNext()) {
                Placement next = it.next();
                if (next.getPlacementName().equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    private void p() {
        NetworkSettings a2;
        NetworkSettings a3;
        NetworkSettings a4;
        com.ironsource.mediationsdk.model.p pVar = this.i.c.a;
        int i = pVar.e;
        for (int i2 = 0; i2 < this.i.a.a.size(); i2++) {
            String str = this.i.a.a.get(i2);
            if (!TextUtils.isEmpty(str) && (a4 = this.i.b.a(str)) != null) {
                Z z = new Z(a4, i);
                if (a(z)) {
                    z.s = this.b;
                    z.n = i2 + 1;
                    this.b.a((AbstractC0108b) z);
                }
            }
        }
        if (this.b.c.size() <= 0) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, this.H);
            a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            a((int) IronSourceConstants.TROUBLESHOOTING_RV_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        this.b.n = pVar.b.a;
        this.b.b = pVar.c;
        this.b.o = pVar.h;
        String b2 = this.i.b();
        if (!TextUtils.isEmpty(b2) && (a3 = this.i.b.a(b2)) != null) {
            Z z2 = new Z(a3, i);
            if (a(z2)) {
                z2.s = this.b;
                Y y = this.b;
                y.h.log(IronSourceLogger.IronSourceTag.INTERNAL, z2.d + " is set as backfill", 0);
                y.d = z2;
            }
        }
        String c = this.i.c();
        if (!TextUtils.isEmpty(c) && (a2 = this.i.b.a(c)) != null) {
            Z z3 = new Z(a2, i);
            if (a(z3)) {
                z3.s = this.b;
                Y y2 = this.b;
                y2.h.log(IronSourceLogger.IronSourceTag.INTERNAL, z3.d + " is set as premium", 0);
                y2.e = z3;
            }
        }
        Y y3 = this.b;
        y3.p = new C0129w(pVar.i, y3);
        this.b.a(this.j, IronSourceUtils.getUserIdForNetworks());
    }

    private void q() {
        if (this.u) {
            o();
            return;
        }
        com.ironsource.mediationsdk.model.p pVar = this.i.c.a;
        this.C = pVar.l.a;
        this.ag = pVar.l.b;
        int a2 = a(pVar);
        this.H = a2;
        a((int) IronSourceConstants.TROUBLESHOOTING_RV_FORK, IronSourceUtils.getMediationAdditionalData(false, this.C, a2));
        if (this.ag) {
            r();
        } else if (this.C) {
            n();
        } else {
            p();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void q(java.lang.String r5) {
        /*
            r4 = this;
            com.ironsource.mediationsdk.model.Placement r5 = r4.p(r5)     // Catch: java.lang.Exception -> L26
            if (r5 != 0) goto Ld
            com.ironsource.mediationsdk.model.Placement r5 = r4.b()     // Catch: java.lang.Exception -> Lb
            goto Ld
        Lb:
            r0 = move-exception
            goto L28
        Ld:
            if (r5 != 0) goto L31
            java.lang.String r0 = "showProgrammaticRewardedVideo error: empty default placement in response"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r4.f     // Catch: java.lang.Exception -> Lb
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch: java.lang.Exception -> Lb
            r3 = 3
            r1.log(r2, r0, r3)     // Catch: java.lang.Exception -> Lb
            com.ironsource.mediationsdk.logger.IronSourceError r1 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch: java.lang.Exception -> Lb
            r2 = 1021(0x3fd, float:1.431E-42)
            r1.<init>(r2, r0)     // Catch: java.lang.Exception -> Lb
            com.ironsource.mediationsdk.sdk.j r0 = r4.g     // Catch: java.lang.Exception -> Lb
            r0.onRewardedVideoAdShowFailed(r1)     // Catch: java.lang.Exception -> Lb
            return
        L26:
            r0 = move-exception
            r5 = 0
        L28:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r4.f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r3 = "showProgrammaticRewardedVideo()"
            r1.logException(r2, r3, r0)
        L31:
            boolean r0 = r4.ag
            if (r0 == 0) goto L3b
            com.ironsource.mediationsdk.adunit.c.h r0 = r4.ad
            r0.a(r5)
            return
        L3b:
            com.ironsource.mediationsdk.y r0 = r4.y
            r0.a(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.E.q(java.lang.String):void");
    }

    private Placement r(String str) {
        Placement p = p(str);
        if (p == null) {
            this.f.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
            p = b();
            if (p == null) {
                this.f.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found, please make sure you are using the right placements.", 3);
                return null;
            }
        }
        String a2 = a(p.getPlacementName(), com.ironsource.mediationsdk.utils.c.b(ContextProvider.getInstance().getApplicationContext(), p));
        if (TextUtils.isEmpty(a2)) {
            return p;
        }
        this.f.log(IronSourceLogger.IronSourceTag.API, a2, 1);
        this.g.onRewardedVideoAdShowFailed(ErrorBuilder.buildCappedPerPlacementError(a2));
        return null;
    }

    private void r() {
        IronLog.INTERNAL.verbose("");
        List<NetworkSettings> s = s();
        if (s.size() <= 0) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, this.H);
            a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            a((int) IronSourceConstants.TROUBLESHOOTING_RV_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        com.ironsource.mediationsdk.adunit.c.h hVar = new com.ironsource.mediationsdk.adunit.c.h(s, this.i.c.a, IronSourceUtils.getUserIdForNetworks(), false, com.ironsource.mediationsdk.c.b.a().b());
        this.ad = hVar;
        Boolean bool = this.r;
        if (bool != null) {
            hVar.b(bool.booleanValue());
        }
    }

    private InterstitialPlacement s(String str) {
        com.ironsource.mediationsdk.model.i iVar = this.i.c.b;
        if (iVar != null) {
            Iterator<InterstitialPlacement> it = iVar.a.iterator();
            while (it.hasNext()) {
                InterstitialPlacement next = it.next();
                if (next.getPlacementName().equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    private List<NetworkSettings> s() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.i.a.a.size(); i++) {
            String str = this.i.a.a.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.i.b.a(str));
            }
        }
        return arrayList;
    }

    private List<NetworkSettings> t() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.i.a.d.size(); i++) {
            String str = this.i.a.d.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.i.b.a(str));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void t(java.lang.String r5) {
        /*
            r4 = this;
            com.ironsource.mediationsdk.model.InterstitialPlacement r5 = r4.s(r5)     // Catch: java.lang.Exception -> L26
            if (r5 != 0) goto Ld
            com.ironsource.mediationsdk.model.InterstitialPlacement r5 = r4.e()     // Catch: java.lang.Exception -> Lb
            goto Ld
        Lb:
            r0 = move-exception
            goto L28
        Ld:
            if (r5 != 0) goto L31
            java.lang.String r0 = "showProgrammaticInterstitial error: empty default placement in response"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r4.f     // Catch: java.lang.Exception -> Lb
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch: java.lang.Exception -> Lb
            r3 = 3
            r1.log(r2, r0, r3)     // Catch: java.lang.Exception -> Lb
            com.ironsource.mediationsdk.logger.IronSourceError r1 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch: java.lang.Exception -> Lb
            r2 = 1020(0x3fc, float:1.43E-42)
            r1.<init>(r2, r0)     // Catch: java.lang.Exception -> Lb
            com.ironsource.mediationsdk.sdk.j r0 = r4.g     // Catch: java.lang.Exception -> Lb
            r0.onInterstitialAdShowFailed(r1)     // Catch: java.lang.Exception -> Lb
            return
        L26:
            r0 = move-exception
            r5 = 0
        L28:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r4.f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r3 = "showProgrammaticInterstitial()"
            r1.logException(r2, r3, r0)
        L31:
            boolean r0 = r4.E
            if (r0 == 0) goto L40
            com.ironsource.mediationsdk.adunit.c.g r0 = r4.B
            com.ironsource.mediationsdk.model.Placement r1 = new com.ironsource.mediationsdk.model.Placement
            r1.<init>(r5)
            r0.a(r1)
            return
        L40:
            com.ironsource.mediationsdk.P r0 = r4.z
            java.lang.String r5 = r5.getPlacementName()
            r0.a(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.E.t(java.lang.String):void");
    }

    private InterstitialPlacement u(String str) {
        InterstitialPlacement s = s(str);
        if (s == null) {
            this.f.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
            s = e();
            if (s == null) {
                this.f.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found, please make sure you are using the right placements.", 3);
                return null;
            }
        }
        String a2 = a(s.getPlacementName(), w(s.getPlacementName()));
        if (TextUtils.isEmpty(a2)) {
            return s;
        }
        this.f.log(IronSourceLogger.IronSourceTag.API, a2, 1);
        this.g.e = s;
        this.g.onInterstitialAdShowFailed(ErrorBuilder.buildCappedPerPlacementError(a2));
        return null;
    }

    private void u() {
        IronLog.INTERNAL.verbose("");
        List<NetworkSettings> t = t();
        if (t.size() <= 0) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
            a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            b(IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.INTERSTITIAL, false);
            return;
        }
        com.ironsource.mediationsdk.adunit.c.g gVar = new com.ironsource.mediationsdk.adunit.c.g(t, this.i.c.b, IronSourceUtils.getUserIdForNetworks(), com.ironsource.mediationsdk.c.b.a().b());
        this.B = gVar;
        Boolean bool = this.r;
        if (bool != null) {
            gVar.b(bool.booleanValue());
        }
        if (this.F) {
            this.F = false;
            this.B.e();
        }
    }

    private void v() {
        this.f.log(IronSourceLogger.IronSourceTag.INTERNAL, "Adunit: Interstitial is now initiated - programmatic mode", 0);
        List<NetworkSettings> t = t();
        if (t.size() <= 0) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
            a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            b(IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.INTERSTITIAL, false);
            return;
        }
        P p = new P(t, this.i.c.b, this.j, IronSourceUtils.getUserIdForNetworks(), this.i.c.b.f, com.ironsource.mediationsdk.c.b.a().b());
        this.z = p;
        Boolean bool = this.r;
        if (bool != null) {
            p.a(bool.booleanValue());
            if (this.r.booleanValue()) {
                this.c.a(this.q, false);
            }
        }
        if (this.F) {
            this.F = false;
            this.z.d();
        }
    }

    private static boolean v(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    private int w(String str) {
        com.ironsource.mediationsdk.utils.k kVar = this.i;
        if (kVar == null || kVar.c == null || this.i.c.b == null) {
            return c.a.d;
        }
        InterstitialPlacement interstitialPlacement = null;
        try {
            interstitialPlacement = s(str);
            if (interstitialPlacement == null && (interstitialPlacement = e()) == null) {
                this.f.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found", 3);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return interstitialPlacement == null ? c.a.d : com.ironsource.mediationsdk.utils.c.b(ContextProvider.getInstance().getApplicationContext(), interstitialPlacement);
    }

    private void w() {
        NetworkSettings a2;
        com.ironsource.mediationsdk.model.i iVar = this.i.c.b;
        int i = iVar.e;
        this.c.n.a(IronSource.AD_UNIT.INTERSTITIAL, iVar.f);
        for (int i2 = 0; i2 < this.i.a.d.size(); i2++) {
            String str = this.i.a.d.get(i2);
            if (!TextUtils.isEmpty(str) && (a2 = this.i.b.a(str)) != null) {
                C c = new C(a2, i);
                if (a(c)) {
                    c.s = this.c;
                    c.n = i2 + 1;
                    this.c.a((AbstractC0108b) c);
                }
            }
        }
        if (this.c.c.size() <= 0) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, 1);
            a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            b(IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.INTERSTITIAL, false);
            return;
        }
        this.c.b = iVar.c;
        this.c.a(this.j, IronSourceUtils.getUserIdForNetworks());
        if (this.F) {
            this.F = false;
            this.c.c();
        }
    }

    private com.ironsource.mediationsdk.model.g x(String str) {
        com.ironsource.mediationsdk.model.g a2;
        com.ironsource.mediationsdk.model.f fVar = this.i.c.d;
        if (fVar == null) {
            return null;
        }
        return (TextUtils.isEmpty(str) || (a2 = fVar.a(str)) == null) ? fVar.a() : a2;
    }

    private void x() {
        this.f.log(IronSourceLogger.IronSourceTag.INTERNAL, "Interstitial started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.i.a.d.size(); i++) {
            String str = this.i.a.d.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.i.b.a(str));
            }
        }
        if (arrayList.size() <= 0) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, 1);
            a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            b(IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.INTERSTITIAL, false);
            return;
        }
        synchronized (this.ah) {
            this.I = new C0124r(arrayList, this.i.c.b, this.j, this.k);
        }
        Iterator<String> it = this.ah.iterator();
        while (it.hasNext()) {
            this.I.a(it.next(), (String) null, false);
        }
        this.ah.clear();
    }

    private void y() {
        if (this.v) {
            x();
            return;
        }
        com.ironsource.mediationsdk.model.i iVar = this.i.c.b;
        this.D = iVar.i.a;
        this.E = iVar.i.b;
        b(IronSourceConstants.TROUBLESHOOTING_IS_FORK, IronSourceUtils.getMediationAdditionalData(false, this.D, 1));
        if (!this.D) {
            w();
        } else if (this.E) {
            u();
        } else {
            v();
        }
    }

    private void z() {
        NetworkSettings a2;
        if (this.X) {
            A();
            return;
        }
        synchronized (this.aa) {
            this.G = this.i.c.d.g.a;
            IronLog.INTERNAL.verbose("mIsBnProgrammatic = " + this.G);
            IronLog.INTERNAL.verbose("mIsBnLoadBeforeInitCompleted = " + this.aa);
            b(IronSourceConstants.TROUBLESHOOTING_BN_FORK, IronSourceUtils.getMediationAdditionalData(false, this.G, 1));
            ArrayList<NetworkSettings> arrayList = new ArrayList<>();
            for (int i = 0; i < this.i.a.e.size(); i++) {
                String str = this.i.a.e.get(i);
                if (!TextUtils.isEmpty(str) && (a2 = this.i.b.a(str)) != null) {
                    arrayList.add(a2);
                }
            }
            if (arrayList.size() <= 0) {
                JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, this.G, 1);
                a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
                b(IronSourceConstants.TROUBLESHOOTING_BN_INIT_FAILED, mediationAdditionalData);
                a(IronSource.AD_UNIT.BANNER, false);
            } else if (this.G) {
                a(arrayList);
            } else {
                this.e = new C0117k(arrayList, this.j, IronSourceUtils.getUserIdForNetworks(), this.i.c.d.b, this.i.c.d.e, this.i.c.d.f);
                B();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c9 A[Catch: all -> 0x02e0, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x000e, B:9:0x0010, B:11:0x0018, B:17:0x006c, B:19:0x009d, B:21:0x00a7, B:23:0x00ad, B:25:0x00b7, B:27:0x00bd, B:29:0x00c7, B:31:0x00cd, B:33:0x00d7, B:35:0x00e3, B:36:0x014f, B:41:0x01c9, B:42:0x0235, B:46:0x02ad, B:48:0x02b3, B:49:0x02ce, B:44:0x023a, B:45:0x02a7, B:38:0x0154, B:39:0x01c1, B:50:0x02de, B:13:0x001e, B:15:0x002f), top: B:55:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02b3 A[Catch: all -> 0x02e0, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x000e, B:9:0x0010, B:11:0x0018, B:17:0x006c, B:19:0x009d, B:21:0x00a7, B:23:0x00ad, B:25:0x00b7, B:27:0x00bd, B:29:0x00c7, B:31:0x00cd, B:33:0x00d7, B:35:0x00e3, B:36:0x014f, B:41:0x01c9, B:42:0x0235, B:46:0x02ad, B:48:0x02b3, B:49:0x02ce, B:44:0x023a, B:45:0x02a7, B:38:0x0154, B:39:0x01c1, B:50:0x02de, B:13:0x001e, B:15:0x002f), top: B:55:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ironsource.mediationsdk.utils.k a(android.content.Context r11, java.lang.String r12, com.ironsource.mediationsdk.E.a r13) {
        /*
            Method dump skipped, instructions count: 739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.E.a(android.content.Context, java.lang.String, com.ironsource.mediationsdk.E$a):com.ironsource.mediationsdk.utils.k");
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0146 A[Catch: all -> 0x0240, TryCatch #4 {, blocks: (B:5:0x0004, B:11:0x0014, B:13:0x0018, B:16:0x002b, B:18:0x002f, B:23:0x0046, B:32:0x007b, B:34:0x0087, B:37:0x009d, B:39:0x00a4, B:41:0x00ae, B:44:0x00c4, B:45:0x00c6, B:49:0x00cf, B:55:0x00db, B:56:0x00dd, B:66:0x00f4, B:68:0x00fa, B:72:0x0112, B:74:0x011e, B:76:0x012d, B:77:0x012f, B:80:0x0138, B:86:0x0146, B:88:0x0150, B:89:0x0153, B:91:0x0160, B:93:0x0173, B:94:0x0176, B:96:0x017e, B:98:0x0195, B:99:0x0198, B:100:0x01a4, B:106:0x01d5, B:108:0x01e4, B:109:0x020b, B:111:0x0221, B:103:0x01ad, B:105:0x01d0, B:81:0x013c, B:112:0x0227, B:24:0x004e, B:29:0x005c, B:46:0x00c7, B:47:0x00cc, B:57:0x00de, B:59:0x00e2, B:61:0x00e9, B:62:0x00f0, B:65:0x00f3), top: B:126:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0153 A[Catch: all -> 0x0240, TryCatch #4 {, blocks: (B:5:0x0004, B:11:0x0014, B:13:0x0018, B:16:0x002b, B:18:0x002f, B:23:0x0046, B:32:0x007b, B:34:0x0087, B:37:0x009d, B:39:0x00a4, B:41:0x00ae, B:44:0x00c4, B:45:0x00c6, B:49:0x00cf, B:55:0x00db, B:56:0x00dd, B:66:0x00f4, B:68:0x00fa, B:72:0x0112, B:74:0x011e, B:76:0x012d, B:77:0x012f, B:80:0x0138, B:86:0x0146, B:88:0x0150, B:89:0x0153, B:91:0x0160, B:93:0x0173, B:94:0x0176, B:96:0x017e, B:98:0x0195, B:99:0x0198, B:100:0x01a4, B:106:0x01d5, B:108:0x01e4, B:109:0x020b, B:111:0x0221, B:103:0x01ad, B:105:0x01d0, B:81:0x013c, B:112:0x0227, B:24:0x004e, B:29:0x005c, B:46:0x00c7, B:47:0x00cc, B:57:0x00de, B:59:0x00e2, B:61:0x00e9, B:62:0x00f0, B:65:0x00f3), top: B:126:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(android.app.Activity r9, com.ironsource.mediationsdk.IronSourceBannerLayout r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.E.a(android.app.Activity, com.ironsource.mediationsdk.IronSourceBannerLayout, java.lang.String, java.lang.String):void");
    }

    public final synchronized void a(Activity activity, String str, String str2) {
        if (str2 != null) {
            b(activity, str, str2);
            return;
        }
        this.f.log(IronSourceLogger.IronSourceTag.API, "adm cannot be null", 3);
        W.a().a(str, new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "adm cannot be null"));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00bf A[Catch: all -> 0x00f5, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x000e, B:10:0x0012, B:12:0x001c, B:37:0x0087, B:13:0x0036, B:15:0x003e, B:17:0x0042, B:18:0x0046, B:20:0x004e, B:21:0x0051, B:23:0x0059, B:25:0x005d, B:26:0x0061, B:28:0x0069, B:29:0x006c, B:31:0x0074, B:33:0x0078, B:34:0x007c, B:36:0x0084, B:51:0x00bf, B:53:0x00c3, B:54:0x00cd, B:55:0x00d8, B:57:0x00de, B:38:0x008a, B:40:0x008e, B:42:0x009b, B:44:0x009f, B:46:0x00ac, B:48:0x00b0, B:49:0x00b6, B:45:0x00a5, B:41:0x0094), top: B:63:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00de A[Catch: all -> 0x00f5, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x000e, B:10:0x0012, B:12:0x001c, B:37:0x0087, B:13:0x0036, B:15:0x003e, B:17:0x0042, B:18:0x0046, B:20:0x004e, B:21:0x0051, B:23:0x0059, B:25:0x005d, B:26:0x0061, B:28:0x0069, B:29:0x006c, B:31:0x0074, B:33:0x0078, B:34:0x007c, B:36:0x0084, B:51:0x00bf, B:53:0x00c3, B:54:0x00cd, B:55:0x00d8, B:57:0x00de, B:38:0x008a, B:40:0x008e, B:42:0x009b, B:44:0x009f, B:46:0x00ac, B:48:0x00b0, B:49:0x00b6, B:45:0x00a5, B:41:0x0094), top: B:63:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(android.content.Context r8, java.lang.String r9, com.ironsource.mediationsdk.sdk.f r10, com.ironsource.mediationsdk.IronSource.AD_UNIT... r11) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.E.a(android.content.Context, java.lang.String, com.ironsource.mediationsdk.sdk.f, com.ironsource.mediationsdk.IronSource$AD_UNIT[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0085 A[Catch: all -> 0x0295, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x000c, B:7:0x0016, B:9:0x001a, B:12:0x001e, B:14:0x0022, B:16:0x0036, B:17:0x0038, B:19:0x0040, B:20:0x0042, B:22:0x004a, B:23:0x004c, B:28:0x0067, B:30:0x0085, B:31:0x008f, B:33:0x00ad, B:35:0x00b6, B:37:0x00bc, B:38:0x00c4, B:41:0x00db, B:43:0x00e1, B:44:0x00e3, B:48:0x00fb, B:49:0x0115, B:51:0x0125, B:52:0x0134, B:54:0x0138, B:56:0x0140, B:57:0x0165, B:59:0x0169, B:61:0x017c, B:62:0x0181, B:64:0x018b, B:65:0x0194, B:68:0x01a7, B:70:0x01cb, B:71:0x01d4, B:73:0x01fe, B:74:0x0207, B:76:0x020e, B:78:0x0217, B:79:0x021a, B:81:0x0225, B:83:0x0229, B:84:0x0235, B:88:0x0244, B:87:0x0241, B:89:0x0254, B:91:0x025e, B:92:0x0267, B:39:0x00c8, B:40:0x00d1, B:24:0x004f, B:26:0x0057, B:27:0x0061, B:96:0x0284, B:99:0x0289), top: B:107:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad A[Catch: all -> 0x0295, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x000c, B:7:0x0016, B:9:0x001a, B:12:0x001e, B:14:0x0022, B:16:0x0036, B:17:0x0038, B:19:0x0040, B:20:0x0042, B:22:0x004a, B:23:0x004c, B:28:0x0067, B:30:0x0085, B:31:0x008f, B:33:0x00ad, B:35:0x00b6, B:37:0x00bc, B:38:0x00c4, B:41:0x00db, B:43:0x00e1, B:44:0x00e3, B:48:0x00fb, B:49:0x0115, B:51:0x0125, B:52:0x0134, B:54:0x0138, B:56:0x0140, B:57:0x0165, B:59:0x0169, B:61:0x017c, B:62:0x0181, B:64:0x018b, B:65:0x0194, B:68:0x01a7, B:70:0x01cb, B:71:0x01d4, B:73:0x01fe, B:74:0x0207, B:76:0x020e, B:78:0x0217, B:79:0x021a, B:81:0x0225, B:83:0x0229, B:84:0x0235, B:88:0x0244, B:87:0x0241, B:89:0x0254, B:91:0x025e, B:92:0x0267, B:39:0x00c8, B:40:0x00d1, B:24:0x004f, B:26:0x0057, B:27:0x0061, B:96:0x0284, B:99:0x0289), top: B:107:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d1 A[Catch: all -> 0x0295, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x000c, B:7:0x0016, B:9:0x001a, B:12:0x001e, B:14:0x0022, B:16:0x0036, B:17:0x0038, B:19:0x0040, B:20:0x0042, B:22:0x004a, B:23:0x004c, B:28:0x0067, B:30:0x0085, B:31:0x008f, B:33:0x00ad, B:35:0x00b6, B:37:0x00bc, B:38:0x00c4, B:41:0x00db, B:43:0x00e1, B:44:0x00e3, B:48:0x00fb, B:49:0x0115, B:51:0x0125, B:52:0x0134, B:54:0x0138, B:56:0x0140, B:57:0x0165, B:59:0x0169, B:61:0x017c, B:62:0x0181, B:64:0x018b, B:65:0x0194, B:68:0x01a7, B:70:0x01cb, B:71:0x01d4, B:73:0x01fe, B:74:0x0207, B:76:0x020e, B:78:0x0217, B:79:0x021a, B:81:0x0225, B:83:0x0229, B:84:0x0235, B:88:0x0244, B:87:0x0241, B:89:0x0254, B:91:0x025e, B:92:0x0267, B:39:0x00c8, B:40:0x00d1, B:24:0x004f, B:26:0x0057, B:27:0x0061, B:96:0x0284, B:99:0x0289), top: B:107:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1 A[Catch: all -> 0x0295, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x000c, B:7:0x0016, B:9:0x001a, B:12:0x001e, B:14:0x0022, B:16:0x0036, B:17:0x0038, B:19:0x0040, B:20:0x0042, B:22:0x004a, B:23:0x004c, B:28:0x0067, B:30:0x0085, B:31:0x008f, B:33:0x00ad, B:35:0x00b6, B:37:0x00bc, B:38:0x00c4, B:41:0x00db, B:43:0x00e1, B:44:0x00e3, B:48:0x00fb, B:49:0x0115, B:51:0x0125, B:52:0x0134, B:54:0x0138, B:56:0x0140, B:57:0x0165, B:59:0x0169, B:61:0x017c, B:62:0x0181, B:64:0x018b, B:65:0x0194, B:68:0x01a7, B:70:0x01cb, B:71:0x01d4, B:73:0x01fe, B:74:0x0207, B:76:0x020e, B:78:0x0217, B:79:0x021a, B:81:0x0225, B:83:0x0229, B:84:0x0235, B:88:0x0244, B:87:0x0241, B:89:0x0254, B:91:0x025e, B:92:0x0267, B:39:0x00c8, B:40:0x00d1, B:24:0x004f, B:26:0x0057, B:27:0x0061, B:96:0x0284, B:99:0x0289), top: B:107:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0125 A[Catch: all -> 0x0295, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x000c, B:7:0x0016, B:9:0x001a, B:12:0x001e, B:14:0x0022, B:16:0x0036, B:17:0x0038, B:19:0x0040, B:20:0x0042, B:22:0x004a, B:23:0x004c, B:28:0x0067, B:30:0x0085, B:31:0x008f, B:33:0x00ad, B:35:0x00b6, B:37:0x00bc, B:38:0x00c4, B:41:0x00db, B:43:0x00e1, B:44:0x00e3, B:48:0x00fb, B:49:0x0115, B:51:0x0125, B:52:0x0134, B:54:0x0138, B:56:0x0140, B:57:0x0165, B:59:0x0169, B:61:0x017c, B:62:0x0181, B:64:0x018b, B:65:0x0194, B:68:0x01a7, B:70:0x01cb, B:71:0x01d4, B:73:0x01fe, B:74:0x0207, B:76:0x020e, B:78:0x0217, B:79:0x021a, B:81:0x0225, B:83:0x0229, B:84:0x0235, B:88:0x0244, B:87:0x0241, B:89:0x0254, B:91:0x025e, B:92:0x0267, B:39:0x00c8, B:40:0x00d1, B:24:0x004f, B:26:0x0057, B:27:0x0061, B:96:0x0284, B:99:0x0289), top: B:107:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0138 A[Catch: all -> 0x0295, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x000c, B:7:0x0016, B:9:0x001a, B:12:0x001e, B:14:0x0022, B:16:0x0036, B:17:0x0038, B:19:0x0040, B:20:0x0042, B:22:0x004a, B:23:0x004c, B:28:0x0067, B:30:0x0085, B:31:0x008f, B:33:0x00ad, B:35:0x00b6, B:37:0x00bc, B:38:0x00c4, B:41:0x00db, B:43:0x00e1, B:44:0x00e3, B:48:0x00fb, B:49:0x0115, B:51:0x0125, B:52:0x0134, B:54:0x0138, B:56:0x0140, B:57:0x0165, B:59:0x0169, B:61:0x017c, B:62:0x0181, B:64:0x018b, B:65:0x0194, B:68:0x01a7, B:70:0x01cb, B:71:0x01d4, B:73:0x01fe, B:74:0x0207, B:76:0x020e, B:78:0x0217, B:79:0x021a, B:81:0x0225, B:83:0x0229, B:84:0x0235, B:88:0x0244, B:87:0x0241, B:89:0x0254, B:91:0x025e, B:92:0x0267, B:39:0x00c8, B:40:0x00d1, B:24:0x004f, B:26:0x0057, B:27:0x0061, B:96:0x0284, B:99:0x0289), top: B:107:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0169 A[Catch: all -> 0x0295, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x000c, B:7:0x0016, B:9:0x001a, B:12:0x001e, B:14:0x0022, B:16:0x0036, B:17:0x0038, B:19:0x0040, B:20:0x0042, B:22:0x004a, B:23:0x004c, B:28:0x0067, B:30:0x0085, B:31:0x008f, B:33:0x00ad, B:35:0x00b6, B:37:0x00bc, B:38:0x00c4, B:41:0x00db, B:43:0x00e1, B:44:0x00e3, B:48:0x00fb, B:49:0x0115, B:51:0x0125, B:52:0x0134, B:54:0x0138, B:56:0x0140, B:57:0x0165, B:59:0x0169, B:61:0x017c, B:62:0x0181, B:64:0x018b, B:65:0x0194, B:68:0x01a7, B:70:0x01cb, B:71:0x01d4, B:73:0x01fe, B:74:0x0207, B:76:0x020e, B:78:0x0217, B:79:0x021a, B:81:0x0225, B:83:0x0229, B:84:0x0235, B:88:0x0244, B:87:0x0241, B:89:0x0254, B:91:0x025e, B:92:0x0267, B:39:0x00c8, B:40:0x00d1, B:24:0x004f, B:26:0x0057, B:27:0x0061, B:96:0x0284, B:99:0x0289), top: B:107:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a7 A[Catch: all -> 0x0295, TRY_ENTER, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x000c, B:7:0x0016, B:9:0x001a, B:12:0x001e, B:14:0x0022, B:16:0x0036, B:17:0x0038, B:19:0x0040, B:20:0x0042, B:22:0x004a, B:23:0x004c, B:28:0x0067, B:30:0x0085, B:31:0x008f, B:33:0x00ad, B:35:0x00b6, B:37:0x00bc, B:38:0x00c4, B:41:0x00db, B:43:0x00e1, B:44:0x00e3, B:48:0x00fb, B:49:0x0115, B:51:0x0125, B:52:0x0134, B:54:0x0138, B:56:0x0140, B:57:0x0165, B:59:0x0169, B:61:0x017c, B:62:0x0181, B:64:0x018b, B:65:0x0194, B:68:0x01a7, B:70:0x01cb, B:71:0x01d4, B:73:0x01fe, B:74:0x0207, B:76:0x020e, B:78:0x0217, B:79:0x021a, B:81:0x0225, B:83:0x0229, B:84:0x0235, B:88:0x0244, B:87:0x0241, B:89:0x0254, B:91:0x025e, B:92:0x0267, B:39:0x00c8, B:40:0x00d1, B:24:0x004f, B:26:0x0057, B:27:0x0061, B:96:0x0284, B:99:0x0289), top: B:107:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(android.content.Context r9, java.lang.String r10, boolean r11, com.ironsource.mediationsdk.sdk.f r12, com.ironsource.mediationsdk.IronSource.AD_UNIT... r13) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.E.a(android.content.Context, java.lang.String, boolean, com.ironsource.mediationsdk.sdk.f, com.ironsource.mediationsdk.IronSource$AD_UNIT[]):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(AbstractAdapter abstractAdapter) {
        this.N = abstractAdapter;
    }

    public final void a(IronSourceBannerLayout ironSourceBannerLayout, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("placementName = " + str);
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
            StringBuilder sb = new StringBuilder("loadBanner can't be called - ");
            sb.append(ironSourceBannerLayout == null ? "banner layout is null " : "banner layout is destroyed");
            String sb2 = sb.toString();
            this.f.log(IronSourceLogger.IronSourceTag.API, sb2, 3);
            C0116j.a().a(ironSourceBannerLayout, ErrorBuilder.buildLoadFailedError(sb2));
        } else if (!this.Z) {
            this.f.log(IronSourceLogger.IronSourceTag.API, "init() must be called before loadBanner()", 3);
            C0116j.a().a(ironSourceBannerLayout, ErrorBuilder.buildLoadFailedError("init() must be called before loadBanner()"));
        } else if (ironSourceBannerLayout.getSize().getDescription().equals("CUSTOM") && (ironSourceBannerLayout.getSize().getWidth() <= 0 || ironSourceBannerLayout.getSize().getHeight() <= 0)) {
            this.f.log(IronSourceLogger.IronSourceTag.API, "loadBanner: Unsupported banner size. Height and width must be bigger than 0", 3);
            C0116j.a().a(ironSourceBannerLayout, ErrorBuilder.unsupportedBannerSize(""));
        } else {
            J.a b2 = J.a().b();
            if (b2 == J.a.INIT_FAILED) {
                this.f.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                C0116j.a().a(ironSourceBannerLayout, new IronSourceError(IronSourceError.ERROR_BN_LOAD_AFTER_INIT_FAILED, "Init() had failed"));
            } else if (b2 == J.a.INIT_IN_PROGRESS) {
                if (J.a().c()) {
                    this.f.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                    C0116j.a().a(ironSourceBannerLayout, new IronSourceError(IronSourceError.ERROR_BN_LOAD_AFTER_LONG_INITIATION, "Init had failed"));
                    return;
                }
                this.ab = ironSourceBannerLayout;
                this.aa = Boolean.TRUE;
                this.ac = str;
            } else {
                synchronized (this.aa) {
                    if (this.e == null && this.A == null) {
                        this.ab = ironSourceBannerLayout;
                        this.aa = Boolean.TRUE;
                        this.ac = str;
                    } else if (!C()) {
                        this.f.log(IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
                        C0116j.a().a(ironSourceBannerLayout, new IronSourceError(IronSourceError.ERROR_BN_LOAD_NO_CONFIG, "No banner configurations found"));
                    } else if (this.G) {
                        this.A.a(ironSourceBannerLayout, x(str));
                    } else {
                        this.e.a(ironSourceBannerLayout, x(str));
                    }
                }
            }
        }
    }

    @Override // com.ironsource.mediationsdk.utils.i
    public final void a(String str) {
        try {
            IronSourceLoggerManager ironSourceLoggerManager = this.f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, "onInitFailed(reason:" + str + ")", 1);
            IronSourceUtils.sendAutomationLog("Mediation init failed");
            if (this.g != null) {
                for (IronSource.AD_UNIT ad_unit : this.T) {
                    a(ad_unit, true);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void a(String str, List<String> list) {
        IronLog ironLog = IronLog.API;
        ironLog.verbose("key = " + str + ", values = " + list.toString());
        String checkMetaDataKeyValidity = MetaDataUtils.checkMetaDataKeyValidity(str);
        String checkMetaDataValueValidity = MetaDataUtils.checkMetaDataValueValidity(list);
        if (checkMetaDataKeyValidity.length() > 0) {
            IronLog.API.verbose(checkMetaDataKeyValidity);
        } else if (checkMetaDataValueValidity.length() > 0) {
            IronLog.API.verbose(checkMetaDataValueValidity);
        } else {
            MetaData formatMetaData = MetaDataUtils.formatMetaData(str, list);
            String metaDataKey = formatMetaData.getMetaDataKey();
            List<String> metaDataValue = formatMetaData.getMetaDataValue();
            if (MetaDataUtils.isMediationOnlyKey(metaDataKey)) {
                com.ironsource.mediationsdk.c.b.a().a(metaDataKey, metaDataValue);
            } else {
                C0110d.a().a(metaDataKey, metaDataValue);
            }
            try {
                ConcurrentHashMap<String, List<String>> concurrentHashMap = C0110d.a().c;
                concurrentHashMap.putAll(com.ironsource.mediationsdk.c.b.a().d());
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, List<String>> entry : concurrentHashMap.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                this.al.a(jSONObject);
            } catch (JSONException e) {
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.error("got the following error " + e.getMessage());
                e.printStackTrace();
            }
            com.ironsource.mediationsdk.a.h.e().b(new com.ironsource.mediationsdk.adunit.a.a(J.a().b() == J.a.INITIATED ? 51 : 50, IronSourceUtils.getJsonForMetaData(str, list, metaDataValue)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str, boolean z) {
        IronLog ironLog = IronLog.API;
        ironLog.verbose("userId = " + str + ", isFromPublisher = " + z);
        this.k = str;
        if (z) {
            com.ironsource.mediationsdk.a.h.e().b(new com.ironsource.mediationsdk.adunit.a.a(52, IronSourceUtils.getJsonForUserId(false)));
        }
    }

    @Override // com.ironsource.mediationsdk.utils.i
    public final void a(List<IronSource.AD_UNIT> list, boolean z, com.ironsource.mediationsdk.model.h hVar) {
        IronSource.AD_UNIT[] values;
        IronLog.INTERNAL.verbose("");
        try {
            this.S = list;
            this.R = true;
            this.f.log(IronSourceLogger.IronSourceTag.API, "onInitSuccess()", 1);
            IronSourceUtils.sendAutomationLog("init success");
            if (z) {
                JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
                try {
                    mediationAdditionalData.put("revived", true);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                com.ironsource.mediationsdk.a.h.e().b(new com.ironsource.mediationsdk.adunit.a.a(114, mediationAdditionalData));
            }
            com.ironsource.mediationsdk.a.d.e().d();
            com.ironsource.mediationsdk.a.h.e().d();
            C0110d a2 = C0110d.a();
            String str = this.j;
            String str2 = this.k;
            a2.a = str;
            a2.b = str2;
            for (IronSource.AD_UNIT ad_unit : IronSource.AD_UNIT.values()) {
                if (this.T.contains(ad_unit)) {
                    if (list.contains(ad_unit)) {
                        b(ad_unit);
                    } else {
                        a(ad_unit, false);
                    }
                }
            }
            if (this.ae != null) {
                IronLog.CALLBACK.verbose("onInitializationCompleted");
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized AbstractAdapter b(String str) {
        try {
            if (this.N != null && this.N.getProviderName().equals(str)) {
                return this.N;
            }
        } catch (Exception e) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, "getOfferwallAdapter exception: " + e, 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Placement b() {
        com.ironsource.mediationsdk.model.p pVar = this.i.c.a;
        if (pVar != null) {
            return pVar.a();
        }
        return null;
    }

    public final synchronized void b(Activity activity, String str, String str2) {
        this.f.log(IronSourceLogger.IronSourceTag.API, "loadISDemandOnlyRewardedVideo() instanceId=" + str, 1);
        if (!this.Y) {
            this.f.log(IronSourceLogger.IronSourceTag.API, "initISDemandOnly() must be called before loadISDemandOnlyRewardedVideo()", 3);
            W.a().a(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "initISDemandOnly() must be called before loadISDemandOnlyRewardedVideo()"));
        } else if (!this.u) {
            this.f.log(IronSourceLogger.IronSourceTag.API, "Rewarded video was initialized in mediation mode", 3);
            W.a().a(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Rewarded video was initialized in mediation mode"));
        } else {
            boolean z = false;
            if (activity != null) {
                ContextProvider.getInstance().updateActivity(activity);
            } else if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
                if (str2 != null) {
                    z = true;
                }
                a((int) IronSourceConstants.TROUBLESHOOTING_DO_CALLED_RV_LOAD_WITH_NO_ACTIVITY, IronSourceUtils.getMediationAdditionalData(true, z, 1));
                this.f.log(IronSourceLogger.IronSourceTag.API, "Rewarded video was initialized and loaded without Activity", 3);
                W.a().a(str, new IronSourceError(IronSourceError.ERROR_DO_RV_LOAD_MISSING_ACTIVITY, "Rewarded video was initialized and loaded without Activity"));
                return;
            }
            J.a b2 = J.a().b();
            if (b2 == J.a.INIT_FAILED) {
                this.f.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                W.a().a(str, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else if (b2 == J.a.INIT_IN_PROGRESS) {
                if (J.a().c()) {
                    this.f.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                    W.a().a(str, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                    return;
                }
                synchronized (this.ai) {
                    this.ai.add(str);
                }
                if (str2 != null) {
                    a((int) IronSourceConstants.TROUBLESHOOTING_DO_IAB_RV_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.getMediationAdditionalData(true, true, this.H));
                }
            } else {
                synchronized (this.ai) {
                    if (this.ak == null) {
                        this.ai.add(str);
                        if (str2 != null) {
                            a((int) IronSourceConstants.TROUBLESHOOTING_DO_IAB_RV_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.getMediationAdditionalData(true, true, this.H));
                        }
                    } else if (!d()) {
                        this.f.log(IronSourceLogger.IronSourceTag.API, "No rewarded video configurations found", 3);
                        W.a().a(str, ErrorBuilder.buildInitFailedError("the server response does not contain rewarded video data", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                    } else if (str2 == null) {
                        this.ak.a(str, (String) null, false);
                    } else {
                        this.ak.a(str, str2, true);
                    }
                }
            }
        }
    }

    public final void b(boolean z) {
        this.x = Boolean.valueOf(z);
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        logger.log(ironSourceTag, "setConsent : " + z, 1);
        C0110d.a().a(z);
        if (this.N != null) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f;
            IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.ADAPTER_API;
            ironSourceLoggerManager.log(ironSourceTag2, "Offerwall | setConsent(consent:" + z + ")", 1);
            this.N.setConsent(z);
        }
        int i = z ? 40 : 41;
        this.al.a(z);
        com.ironsource.mediationsdk.a.h.e().b(new com.ironsource.mediationsdk.adunit.a.a(i, IronSourceUtils.getMediationAdditionalData(false)));
    }

    public final synchronized void c(Activity activity, String str, String str2) {
        if (str2 != null) {
            d(activity, str, str2);
            return;
        }
        this.f.log(IronSourceLogger.IronSourceTag.API, "adm cannot be null", 3);
        C0132z.a().a(str, new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "adm cannot be null"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
        if (r9.ad.b() != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c() {
        /*
            r9 = this;
            java.lang.String r0 = "isRewardedVideoAvailable():"
            r1 = 1
            r2 = 0
            boolean r3 = r9.u     // Catch: java.lang.Throwable -> L89
            if (r3 == 0) goto L13
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r9.f     // Catch: java.lang.Throwable -> L89
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch: java.lang.Throwable -> L89
            java.lang.String r5 = "Rewarded Video was initialized in demand only mode. Use isISDemandOnlyRewardedVideoAvailable instead"
            r6 = 3
            r3.log(r4, r5, r6)     // Catch: java.lang.Throwable -> L89
            return r2
        L13:
            boolean r3 = r9.ag     // Catch: java.lang.Throwable -> L89
            if (r3 == 0) goto L27
            com.ironsource.mediationsdk.adunit.c.h r3 = r9.ad     // Catch: java.lang.Throwable -> L89
            if (r3 == 0) goto L25
            com.ironsource.mediationsdk.adunit.c.h r3 = r9.ad     // Catch: java.lang.Throwable -> L89
            boolean r3 = r3.b()     // Catch: java.lang.Throwable -> L89
            if (r3 == 0) goto L25
        L23:
            r3 = r1
            goto L3e
        L25:
            r3 = r2
            goto L3e
        L27:
            boolean r3 = r9.C     // Catch: java.lang.Throwable -> L89
            if (r3 == 0) goto L38
            com.ironsource.mediationsdk.y r3 = r9.y     // Catch: java.lang.Throwable -> L89
            if (r3 == 0) goto L25
            com.ironsource.mediationsdk.y r3 = r9.y     // Catch: java.lang.Throwable -> L89
            boolean r3 = r3.a_()     // Catch: java.lang.Throwable -> L89
            if (r3 == 0) goto L25
            goto L23
        L38:
            com.ironsource.mediationsdk.Y r3 = r9.b     // Catch: java.lang.Throwable -> L89
            boolean r3 = r3.c()     // Catch: java.lang.Throwable -> L89
        L3e:
            org.json.JSONObject r4 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r2)     // Catch: java.lang.Throwable -> L84
            boolean r5 = r9.C     // Catch: java.lang.Throwable -> L84
            if (r5 == 0) goto L5c
            java.lang.Object[][] r5 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L84
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L84
            java.lang.String r7 = "programmatic"
            r6[r2] = r7     // Catch: java.lang.Throwable -> L84
            int r7 = r9.H     // Catch: java.lang.Throwable -> L84
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L84
            r6[r1] = r7     // Catch: java.lang.Throwable -> L84
            r5[r2] = r6     // Catch: java.lang.Throwable -> L84
            a(r4, r5)     // Catch: java.lang.Throwable -> L84
        L5c:
            com.ironsource.mediationsdk.adunit.a.a r5 = new com.ironsource.mediationsdk.adunit.a.a     // Catch: java.lang.Throwable -> L84
            if (r3 == 0) goto L63
            r6 = 1101(0x44d, float:1.543E-42)
            goto L65
        L63:
            r6 = 1102(0x44e, float:1.544E-42)
        L65:
            r5.<init>(r6, r4)     // Catch: java.lang.Throwable -> L84
            com.ironsource.mediationsdk.a.h r4 = com.ironsource.mediationsdk.a.h.e()     // Catch: java.lang.Throwable -> L84
            r4.b(r5)     // Catch: java.lang.Throwable -> L84
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r9.f     // Catch: java.lang.Throwable -> L84
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r5 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch: java.lang.Throwable -> L84
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L84
            r6.append(r3)     // Catch: java.lang.Throwable -> L84
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L84
            r4.log(r5, r6, r1)     // Catch: java.lang.Throwable -> L84
            r2 = r3
            goto La7
        L84:
            r4 = move-exception
            r8 = r4
            r4 = r3
            r3 = r8
            goto L8b
        L89:
            r3 = move-exception
            r4 = r2
        L8b:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r9.f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r6 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            r7.append(r4)
            java.lang.String r0 = r7.toString()
            r5.log(r6, r0, r1)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r4 = "isRewardedVideoAvailable()"
            r0.logException(r1, r4, r3)
        La7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.E.c():boolean");
    }

    public final boolean c(String str) {
        try {
            this.f.log(IronSourceLogger.IronSourceTag.API, this.a + ":setDynamicUserId(dynamicUserId:" + str + ")", 1);
            com.ironsource.mediationsdk.utils.c cVar = new com.ironsource.mediationsdk.utils.c();
            if (!a(str, 1, 128)) {
                cVar.a(ErrorBuilder.buildInvalidKeyValueError(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, IronSourceConstants.SUPERSONIC_CONFIG_NAME, "dynamicUserId is invalid, should be between 1-128 chars in length."));
            }
            if (!cVar.a()) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, cVar.b().toString(), 2);
                return false;
            }
            this.m = str;
            com.ironsource.mediationsdk.a.h.e().b(new com.ironsource.mediationsdk.adunit.a.a(52, IronSourceUtils.getJsonForUserId(true)));
            return true;
        } catch (Exception e) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.logException(ironSourceTag, this.a + ":setDynamicUserId(dynamicUserId:" + str + ")", e);
            return false;
        }
    }

    public final synchronized void d(Activity activity, String str, String str2) {
        this.f.log(IronSourceLogger.IronSourceTag.API, "loadISDemandOnlyInterstitial() instanceId=" + str, 1);
        if (!this.w) {
            this.f.log(IronSourceLogger.IronSourceTag.API, "initISDemandOnly() must be called before loadISDemandOnlyInterstitial()", 3);
            C0132z.a().a(str, new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "initISDemandOnly() must be called before loadISDemandOnlyInterstitial()"));
        } else if (!this.v) {
            this.f.log(IronSourceLogger.IronSourceTag.API, "Interstitial was initialized in mediation mode. Use loadInterstitial instead", 3);
            C0132z.a().a(str, new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "Interstitial was initialized in mediation mode. Use loadInterstitial instead"));
        } else {
            boolean z = false;
            if (activity != null) {
                ContextProvider.getInstance().updateActivity(activity);
            } else if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
                if (str2 != null) {
                    z = true;
                }
                b(IronSourceConstants.TROUBLESHOOTING_DO_CALLED_IS_LOAD_WITH_NO_ACTIVITY, IronSourceUtils.getMediationAdditionalData(true, z, 1));
                this.f.log(IronSourceLogger.IronSourceTag.API, "Interstitial was initialized and loaded without Activity", 3);
                C0132z.a().a(str, new IronSourceError(IronSourceError.ERROR_DO_IS_LOAD_MISSING_ACTIVITY, "Interstitial was initialized and loaded without Activity"));
                return;
            }
            J.a b2 = J.a().b();
            if (b2 == J.a.INIT_FAILED) {
                this.f.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                C0132z.a().a(str, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            } else if (b2 == J.a.INIT_IN_PROGRESS) {
                if (J.a().c()) {
                    this.f.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                    C0132z.a().a(str, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                    return;
                }
                synchronized (this.ah) {
                    this.ah.add(str);
                }
                if (str2 != null) {
                    b(IronSourceConstants.TROUBLESHOOTING_DO_IAB_IS_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.getMediationAdditionalData(true, true, 1));
                }
            } else {
                synchronized (this.ah) {
                    if (this.I == null) {
                        this.ah.add(str);
                        if (str2 != null) {
                            b(IronSourceConstants.TROUBLESHOOTING_DO_IAB_IS_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.getMediationAdditionalData(true, true, 1));
                        }
                    } else if (!h()) {
                        this.f.log(IronSourceLogger.IronSourceTag.API, "No interstitial configurations found", 3);
                        C0132z.a().a(str, ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                    } else if (str2 == null) {
                        this.I.a(str, (String) null, false);
                    } else {
                        this.I.a(str, str2, true);
                    }
                }
            }
        }
    }

    public final void d(String str) {
        try {
            this.f.log(IronSourceLogger.IronSourceTag.INTERNAL, this.a + ":setMediationType(mediationType:" + str + ")", 1);
            if (a(str, 1, 64) && v(str)) {
                this.o = str;
            } else {
                this.f.log(IronSourceLogger.IronSourceTag.INTERNAL, " mediationType value is invalid - should be alphanumeric and 1-64 chars in length", 1);
            }
        } catch (Exception e) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.logException(ironSourceTag, this.a + ":setMediationType(mediationType:" + str + ")", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        com.ironsource.mediationsdk.utils.k kVar = this.i;
        return (kVar == null || kVar.c == null || this.i.c.a == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InterstitialPlacement e() {
        com.ironsource.mediationsdk.model.i iVar = this.i.c.b;
        if (iVar != null) {
            return iVar.a();
        }
        return null;
    }

    public final void e(String str) {
        String str2 = "showRewardedVideo(" + str + ")";
        this.f.log(IronSourceLogger.IronSourceTag.API, str2, 1);
        try {
            if (this.u) {
                this.f.log(IronSourceLogger.IronSourceTag.API, "Rewarded Video was initialized in demand only mode. Use showISDemandOnlyRewardedVideo instead", 3);
                this.g.onRewardedVideoAdShowFailed(ErrorBuilder.buildInitFailedError("Rewarded Video was initialized in demand only mode. Use showISDemandOnlyRewardedVideo instead", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else if (!d()) {
                this.g.onRewardedVideoAdShowFailed(ErrorBuilder.buildInitFailedError("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else if (this.C) {
                q(str);
            } else {
                Placement r = r(str);
                if (r != null) {
                    this.b.a(r);
                    this.b.a(r.getPlacementName());
                }
            }
        } catch (Exception e) {
            this.f.logException(IronSourceLogger.IronSourceTag.API, str2, e);
            this.g.onRewardedVideoAdShowFailed(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, e.getMessage()));
        }
    }

    @Override // com.ironsource.mediationsdk.utils.i
    public final void f() {
        synchronized (this.aa) {
            if (this.aa.booleanValue()) {
                this.aa = Boolean.FALSE;
                C0116j.a().a(this.ab, new IronSourceError(IronSourceError.ERROR_BN_LOAD_WHILE_LONG_INITIATION, "init had failed"));
                this.ab = null;
                this.ac = null;
            }
        }
        if (this.F) {
            this.F = false;
            C0121o.a().a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
        }
        synchronized (this.ah) {
            Iterator<String> it = this.ah.iterator();
            while (it.hasNext()) {
                C0132z.a().a(it.next(), ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            }
            this.ah.clear();
        }
        synchronized (this.ai) {
            Iterator<String> it2 = this.ai.iterator();
            while (it2.hasNext()) {
                W.a().a(it2.next(), ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            }
            this.ai.clear();
        }
    }

    public final synchronized void f(String str) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "showISDemandOnlyRewardedVideo() instanceId=" + str, 1);
        try {
        } catch (Exception e) {
            this.f.logException(IronSourceLogger.IronSourceTag.API, "showISDemandOnlyRewardedVideo", e);
            W.a().b(str, new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, e.getMessage()));
        }
        if (!this.u) {
            this.f.log(IronSourceLogger.IronSourceTag.API, "Rewarded video was initialized in mediation mode. Use showRewardedVideo instead", 3);
            W.a().b(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Rewarded video was initialized in mediation mode. Use showRewardedVideo instead"));
        } else if (this.ak == null) {
            this.f.log(IronSourceLogger.IronSourceTag.API, "Rewarded video was not initiated", 3);
            W.a().b(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Rewarded video was not initiated"));
        } else {
            C0126t c0126t = this.ak;
            if (c0126t.a.containsKey(str)) {
                C0127u c0127u = c0126t.a.get(str);
                c0126t.a(IronSourceConstants.RV_INSTANCE_SHOW, c0127u);
                c0127u.a();
                return;
            }
            C0126t.a(1500, str);
            W.a().b(str, ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
        if (r9.B.b() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
        if (r9.c.e() != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g() {
        /*
            r9 = this;
            java.lang.String r0 = "isInterstitialReady():"
            r1 = 1
            r2 = 0
            boolean r3 = r9.v     // Catch: java.lang.Throwable -> L78
            if (r3 == 0) goto L13
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r9.f     // Catch: java.lang.Throwable -> L78
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch: java.lang.Throwable -> L78
            java.lang.String r5 = "Interstitial was initialized in demand only mode. Use isISDemandOnlyInterstitialReady instead"
            r6 = 3
            r3.log(r4, r5, r6)     // Catch: java.lang.Throwable -> L78
            return r2
        L13:
            boolean r3 = r9.D     // Catch: java.lang.Throwable -> L78
            if (r3 == 0) goto L38
            boolean r3 = r9.E     // Catch: java.lang.Throwable -> L78
            if (r3 == 0) goto L2b
            com.ironsource.mediationsdk.adunit.c.g r3 = r9.B     // Catch: java.lang.Throwable -> L78
            if (r3 == 0) goto L29
            com.ironsource.mediationsdk.adunit.c.g r3 = r9.B     // Catch: java.lang.Throwable -> L78
            boolean r3 = r3.b()     // Catch: java.lang.Throwable -> L78
            if (r3 == 0) goto L29
        L27:
            r3 = r1
            goto L45
        L29:
            r3 = r2
            goto L45
        L2b:
            com.ironsource.mediationsdk.P r3 = r9.z     // Catch: java.lang.Throwable -> L78
            if (r3 == 0) goto L29
            com.ironsource.mediationsdk.P r3 = r9.z     // Catch: java.lang.Throwable -> L78
            boolean r3 = r3.e()     // Catch: java.lang.Throwable -> L78
            if (r3 == 0) goto L29
            goto L27
        L38:
            com.ironsource.mediationsdk.B r3 = r9.c     // Catch: java.lang.Throwable -> L78
            if (r3 == 0) goto L29
            com.ironsource.mediationsdk.B r3 = r9.c     // Catch: java.lang.Throwable -> L78
            boolean r3 = r3.e()     // Catch: java.lang.Throwable -> L78
            if (r3 == 0) goto L29
            goto L27
        L45:
            boolean r4 = r9.D     // Catch: java.lang.Throwable -> L73
            org.json.JSONObject r4 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r2, r4, r1)     // Catch: java.lang.Throwable -> L73
            com.ironsource.mediationsdk.adunit.a.a r5 = new com.ironsource.mediationsdk.adunit.a.a     // Catch: java.lang.Throwable -> L73
            if (r3 == 0) goto L52
            r6 = 2101(0x835, float:2.944E-42)
            goto L54
        L52:
            r6 = 2102(0x836, float:2.946E-42)
        L54:
            r5.<init>(r6, r4)     // Catch: java.lang.Throwable -> L73
            com.ironsource.mediationsdk.a.d r4 = com.ironsource.mediationsdk.a.d.e()     // Catch: java.lang.Throwable -> L73
            r4.b(r5)     // Catch: java.lang.Throwable -> L73
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r9.f     // Catch: java.lang.Throwable -> L73
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r5 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch: java.lang.Throwable -> L73
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L73
            r6.append(r3)     // Catch: java.lang.Throwable -> L73
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L73
            r4.log(r5, r6, r1)     // Catch: java.lang.Throwable -> L73
            r2 = r3
            goto L96
        L73:
            r4 = move-exception
            r8 = r4
            r4 = r3
            r3 = r8
            goto L7a
        L78:
            r3 = move-exception
            r4 = r2
        L7a:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r9.f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r6 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            r7.append(r4)
            java.lang.String r0 = r7.toString()
            r5.log(r6, r0, r1)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r4 = "isInterstitialReady()"
            r0.logException(r1, r4, r3)
        L96:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.E.g():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean g(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.ironsource.mediationsdk.t r0 = r4.ak     // Catch: java.lang.Throwable -> L3a
            r1 = 0
            if (r0 == 0) goto L38
            com.ironsource.mediationsdk.t r0 = r4.ak     // Catch: java.lang.Throwable -> L3a
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.u> r2 = r0.a     // Catch: java.lang.Throwable -> L3a
            boolean r2 = r2.containsKey(r5)     // Catch: java.lang.Throwable -> L3a
            r3 = 1
            if (r2 != 0) goto L18
            r0 = 1500(0x5dc, float:2.102E-42)
            com.ironsource.mediationsdk.C0126t.a(r0, r5)     // Catch: java.lang.Throwable -> L3a
        L16:
            r5 = r1
            goto L34
        L18:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.u> r0 = r0.a     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r5 = r0.get(r5)     // Catch: java.lang.Throwable -> L3a
            com.ironsource.mediationsdk.u r5 = (com.ironsource.mediationsdk.C0127u) r5     // Catch: java.lang.Throwable -> L3a
            boolean r0 = r5.b()     // Catch: java.lang.Throwable -> L3a
            r2 = 0
            if (r0 == 0) goto L2e
            r0 = 1210(0x4ba, float:1.696E-42)
            com.ironsource.mediationsdk.C0126t.a(r0, r5, r2)     // Catch: java.lang.Throwable -> L3a
            r5 = r3
            goto L34
        L2e:
            r0 = 1211(0x4bb, float:1.697E-42)
            com.ironsource.mediationsdk.C0126t.a(r0, r5, r2)     // Catch: java.lang.Throwable -> L3a
            goto L16
        L34:
            if (r5 == 0) goto L38
            monitor-exit(r4)
            return r3
        L38:
            monitor-exit(r4)
            return r1
        L3a:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.E.g(java.lang.String):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
        if (android.text.TextUtils.isEmpty(r7) == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "showInterstitial("
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r6.f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            r3 = 1
            r1.log(r2, r0, r3)
            r1 = 510(0x1fe, float:7.15E-43)
            boolean r2 = r6.v     // Catch: java.lang.Exception -> L90
            if (r2 == 0) goto L36
            java.lang.String r7 = "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r6.f     // Catch: java.lang.Exception -> L90
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch: java.lang.Exception -> L90
            r4 = 3
            r2.log(r3, r7, r4)     // Catch: java.lang.Exception -> L90
            com.ironsource.mediationsdk.sdk.j r2 = r6.g     // Catch: java.lang.Exception -> L90
            com.ironsource.mediationsdk.logger.IronSourceError r3 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch: java.lang.Exception -> L90
            r3.<init>(r1, r7)     // Catch: java.lang.Exception -> L90
            r2.onInterstitialAdShowFailed(r3)     // Catch: java.lang.Exception -> L90
            return
        L36:
            boolean r2 = r6.h()     // Catch: java.lang.Exception -> L90
            if (r2 != 0) goto L4a
            com.ironsource.mediationsdk.sdk.j r7 = r6.g     // Catch: java.lang.Exception -> L90
            java.lang.String r2 = "showInterstitial can't be called before the Interstitial ad unit initialization completed successfully"
            java.lang.String r3 = "Interstitial"
            com.ironsource.mediationsdk.logger.IronSourceError r2 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r2, r3)     // Catch: java.lang.Exception -> L90
            r7.onInterstitialAdShowFailed(r2)     // Catch: java.lang.Exception -> L90
            return
        L4a:
            boolean r2 = r6.D     // Catch: java.lang.Exception -> L90
            if (r2 == 0) goto L52
            r6.t(r7)     // Catch: java.lang.Exception -> L90
            return
        L52:
            com.ironsource.mediationsdk.model.InterstitialPlacement r2 = r6.u(r7)     // Catch: java.lang.Exception -> L90
            r3 = 0
            org.json.JSONObject r3 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3)     // Catch: java.lang.Exception -> L90
            java.lang.String r4 = "placement"
            if (r2 == 0) goto L67
            java.lang.String r7 = r2.getPlacementName()     // Catch: org.json.JSONException -> L6e java.lang.Exception -> L90
        L63:
            r3.put(r4, r7)     // Catch: org.json.JSONException -> L6e java.lang.Exception -> L90
            goto L72
        L67:
            boolean r5 = android.text.TextUtils.isEmpty(r7)     // Catch: org.json.JSONException -> L6e java.lang.Exception -> L90
            if (r5 != 0) goto L72
            goto L63
        L6e:
            r7 = move-exception
            r7.printStackTrace()     // Catch: java.lang.Exception -> L90
        L72:
            com.ironsource.mediationsdk.adunit.a.a r7 = new com.ironsource.mediationsdk.adunit.a.a     // Catch: java.lang.Exception -> L90
            r4 = 2100(0x834, float:2.943E-42)
            r7.<init>(r4, r3)     // Catch: java.lang.Exception -> L90
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.a.d.e()     // Catch: java.lang.Exception -> L90
            r3.b(r7)     // Catch: java.lang.Exception -> L90
            if (r2 == 0) goto L8f
            com.ironsource.mediationsdk.B r7 = r6.c     // Catch: java.lang.Exception -> L90
            r7.a(r2)     // Catch: java.lang.Exception -> L90
            com.ironsource.mediationsdk.B r7 = r6.c     // Catch: java.lang.Exception -> L90
            r2.getPlacementName()     // Catch: java.lang.Exception -> L90
            r7.d()     // Catch: java.lang.Exception -> L90
        L8f:
            return
        L90:
            r7 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r6.f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            r2.logException(r3, r0, r7)
            com.ironsource.mediationsdk.sdk.j r0 = r6.g
            com.ironsource.mediationsdk.logger.IronSourceError r2 = new com.ironsource.mediationsdk.logger.IronSourceError
            java.lang.String r7 = r7.getMessage()
            r2.<init>(r1, r7)
            r0.onInterstitialAdShowFailed(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.E.h(java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h() {
        com.ironsource.mediationsdk.utils.k kVar = this.i;
        return (kVar == null || kVar.c == null || this.i.c.b == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i() {
        com.ironsource.mediationsdk.utils.k kVar = this.i;
        return (kVar == null || kVar.c == null || this.i.c.c == null) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean i(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.ironsource.mediationsdk.r r0 = r4.I     // Catch: java.lang.Throwable -> L3a
            r1 = 0
            if (r0 == 0) goto L38
            com.ironsource.mediationsdk.r r0 = r4.I     // Catch: java.lang.Throwable -> L3a
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.s> r2 = r0.a     // Catch: java.lang.Throwable -> L3a
            boolean r2 = r2.containsKey(r5)     // Catch: java.lang.Throwable -> L3a
            r3 = 1
            if (r2 != 0) goto L18
            r0 = 2500(0x9c4, float:3.503E-42)
            com.ironsource.mediationsdk.C0124r.a(r0, r5)     // Catch: java.lang.Throwable -> L3a
        L16:
            r5 = r1
            goto L34
        L18:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.s> r0 = r0.a     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r5 = r0.get(r5)     // Catch: java.lang.Throwable -> L3a
            com.ironsource.mediationsdk.s r5 = (com.ironsource.mediationsdk.C0125s) r5     // Catch: java.lang.Throwable -> L3a
            boolean r0 = r5.b()     // Catch: java.lang.Throwable -> L3a
            r2 = 0
            if (r0 == 0) goto L2e
            r0 = 2211(0x8a3, float:3.098E-42)
            com.ironsource.mediationsdk.C0124r.a(r0, r5, r2)     // Catch: java.lang.Throwable -> L3a
            r5 = r3
            goto L34
        L2e:
            r0 = 2212(0x8a4, float:3.1E-42)
            com.ironsource.mediationsdk.C0124r.a(r0, r5, r2)     // Catch: java.lang.Throwable -> L3a
            goto L16
        L34:
            if (r5 == 0) goto L38
            monitor-exit(r4)
            return r3
        L38:
            monitor-exit(r4)
            return r1
        L3a:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.E.i(java.lang.String):boolean");
    }

    public final void j(String str) {
        String str2 = "showOfferwall(" + str + ")";
        this.f.log(IronSourceLogger.IronSourceTag.API, str2, 1);
        try {
            if (!i()) {
                this.g.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
                return;
            }
            com.ironsource.mediationsdk.model.k a2 = this.i.c.c.a(str);
            if (a2 == null) {
                this.f.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
                a2 = this.i.c.c.a();
                if (a2 == null) {
                    this.f.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found, please make sure you are using the right placements.", 3);
                    return;
                }
            }
            this.d.a(a2.b);
        } catch (Exception e) {
            this.f.logException(IronSourceLogger.IronSourceTag.API, str2, e);
            this.g.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
        }
    }

    public final boolean j() {
        try {
            if (this.d != null) {
                return this.d.a();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public final InterstitialPlacement k(String str) {
        try {
            InterstitialPlacement s = s(str);
            if (s == null) {
                try {
                    this.f.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 2);
                    s = e();
                } catch (Exception unused) {
                    return s;
                }
            }
            IronSourceLoggerManager ironSourceLoggerManager = this.f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, "getPlacementInfo(placement: " + str + "):" + s, 1);
            return s;
        } catch (Exception unused2) {
            return null;
        }
    }

    public final String k() {
        return this.j;
    }

    public final Placement l(String str) {
        try {
            Placement p = p(str);
            if (p == null) {
                try {
                    this.f.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 2);
                    p = b();
                } catch (Exception unused) {
                    return p;
                }
            }
            IronSourceLoggerManager ironSourceLoggerManager = this.f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, "getPlacementInfo(placement: " + str + "):" + p, 1);
            return p;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String l() {
        /*
            r8 = this;
            r0 = 0
            r1 = 83005(0x1443d, float:1.16315E-40)
            a(r1, r0)
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.API
            java.lang.String r2 = ""
            r1.info(r2)
            com.ironsource.mediationsdk.utils.k r1 = r8.i
            if (r1 != 0) goto L1b
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.ADAPTER_API
            java.lang.String r2 = "bidding data cannot be retrieved, SDK not initialized"
            r1.error(r2)
            goto Le6
        L1b:
            com.ironsource.mediationsdk.model.o r1 = r1.b
            java.lang.String r2 = "IronSource"
            com.ironsource.mediationsdk.model.NetworkSettings r1 = r1.a(r2)
            if (r1 == 0) goto Le6
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            com.ironsource.mediationsdk.d r3 = com.ironsource.mediationsdk.C0110d.a()
            org.json.JSONObject r4 = r1.getApplicationSettings()
            r5 = 1
            r6 = 0
            com.ironsource.mediationsdk.AbstractAdapter r1 = r3.a(r1, r4, r5, r6)
            if (r1 == 0) goto L3e
            org.json.JSONObject r2 = r1.getPlayerBiddingData()     // Catch: java.lang.Exception -> Lc5
        L3e:
            com.ironsource.mediationsdk.utils.k r1 = r8.i     // Catch: java.lang.Exception -> Lc5
            com.ironsource.mediationsdk.model.h r1 = r1.c     // Catch: java.lang.Exception -> Lc5
            com.ironsource.sdk.f.a r1 = r1.e     // Catch: java.lang.Exception -> Lc5
            com.ironsource.mediationsdk.utils.o r1 = r1.c()     // Catch: java.lang.Exception -> Lc5
            boolean r3 = r1.c     // Catch: java.lang.Exception -> Lc5
            if (r3 == 0) goto L56
            com.ironsource.environment.e.b r2 = new com.ironsource.environment.e.b     // Catch: java.lang.Exception -> Lc5
            r2.<init>()     // Catch: java.lang.Exception -> Lc5
            org.json.JSONObject r2 = r2.a()     // Catch: java.lang.Exception -> Lc5
            goto L62
        L56:
            com.ironsource.mediationsdk.f r3 = com.ironsource.mediationsdk.C0112f.a()     // Catch: java.lang.Exception -> Lc5
            org.json.JSONObject r4 = r1.b     // Catch: java.lang.Exception -> Lc5
            java.util.ArrayList<java.lang.String> r5 = r1.a     // Catch: java.lang.Exception -> Lc5
            org.json.JSONObject r2 = r3.a(r2, r4, r5)     // Catch: java.lang.Exception -> Lc5
        L62:
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch: java.lang.Exception -> Lc5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc5
            java.lang.String r5 = "bidding data: "
            r4.<init>(r5)     // Catch: java.lang.Exception -> Lc5
            r4.append(r2)     // Catch: java.lang.Exception -> Lc5
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Lc5
            r3.info(r4)     // Catch: java.lang.Exception -> Lc5
            if (r2 == 0) goto Le6
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch: java.lang.Exception -> Lc5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc5
            java.lang.String r5 = "raw biddingData length: "
            r4.<init>(r5)     // Catch: java.lang.Exception -> Lc5
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Exception -> Lc5
            int r5 = r5.length()     // Catch: java.lang.Exception -> Lc5
            r4.append(r5)     // Catch: java.lang.Exception -> Lc5
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Lc5
            r3.info(r4)     // Catch: java.lang.Exception -> Lc5
            boolean r1 = r1.d     // Catch: java.lang.Exception -> Lc5
            if (r1 == 0) goto L9f
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> Lc5
            java.lang.String r1 = com.ironsource.mediationsdk.utils.IronSourceAES.compressAndEncrypt(r1)     // Catch: java.lang.Exception -> Lc5
            goto La6
        L9f:
            com.ironsource.mediationsdk.C0112f.a()     // Catch: java.lang.Exception -> Lc5
            java.lang.String r1 = com.ironsource.mediationsdk.C0112f.b(r2)     // Catch: java.lang.Exception -> Lc5
        La6:
            if (r1 == 0) goto Le7
            com.ironsource.mediationsdk.logger.IronLog r2 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch: java.lang.Exception -> Lc0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc0
            java.lang.String r4 = "biddingData length: "
            r3.<init>(r4)     // Catch: java.lang.Exception -> Lc0
            int r4 = r1.length()     // Catch: java.lang.Exception -> Lc0
            r3.append(r4)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> Lc0
            r2.info(r3)     // Catch: java.lang.Exception -> Lc0
            goto Le7
        Lc0:
            r2 = move-exception
            r7 = r2
            r2 = r1
            r1 = r7
            goto Lc7
        Lc5:
            r1 = move-exception
            r2 = r0
        Lc7:
            r3 = 83007(0x1443f, float:1.16318E-40)
            a(r3, r0)
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.ADAPTER_API
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "got error during creating the token: "
            r4.<init>(r5)
            java.lang.String r1 = r1.getMessage()
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r3.error(r1)
            r1 = r2
            goto Le7
        Le6:
            r1 = r0
        Le7:
            if (r1 != 0) goto Lef
            r2 = 83006(0x1443e, float:1.16316E-40)
            a(r2, r0)
        Lef:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.E.l():java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean m() {
        return this.u || this.v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean m(String str) {
        if (this.v) {
            return false;
        }
        boolean z = w(str) != c.a.d;
        if (z) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(this.v, this.D, 1);
            try {
                mediationAdditionalData.put("placement", str);
                if (this.D) {
                    mediationAdditionalData.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
                }
            } catch (Exception unused) {
            }
            com.ironsource.mediationsdk.a.d.e().b(new com.ironsource.mediationsdk.adunit.a.a(IronSourceConstants.IS_CHECK_CAPPED_TRUE, mediationAdditionalData));
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean n(String str) {
        if (C()) {
            com.ironsource.mediationsdk.model.g gVar = null;
            try {
                gVar = this.i.c.d.a(str);
                if (gVar == null && (gVar = this.i.c.d.a()) == null) {
                    this.f.log(IronSourceLogger.IronSourceTag.API, "Banner default placement was not found", 3);
                    return false;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (gVar == null) {
                return false;
            }
            return com.ironsource.mediationsdk.utils.c.b(ContextProvider.getInstance().getApplicationContext(), gVar.getPlacementName());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int o(String str) {
        com.ironsource.mediationsdk.utils.k kVar = this.i;
        if (kVar == null || kVar.c == null || this.i.c.a == null) {
            return c.a.d;
        }
        Placement placement = null;
        try {
            placement = p(str);
            if (placement == null && (placement = b()) == null) {
                this.f.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found", 3);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return placement == null ? c.a.d : com.ironsource.mediationsdk.utils.c.b(ContextProvider.getInstance().getApplicationContext(), placement);
    }
}
