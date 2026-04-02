package com.amazon.aps.iva.zr;

import com.amazon.aps.iva.d0.b2;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Pattern;
/* compiled from: Config.java */
/* loaded from: classes2.dex */
public final class a {
    public static final Pattern p0 = Pattern.compile("[^a-zA-Z0-9_]");
    public static final Set<Integer> q0 = j("500-599");
    public static final Set<Integer> r0 = j("400-499");
    public static final String s0;
    public static final String t0;
    public static Properties u0;
    public static final a v0;
    public final boolean A;
    public final Set<EnumC0928a> B;
    public final Set<EnumC0928a> C;
    public final boolean D;
    public final String E;
    public final List<String> F;
    @Deprecated
    public final List<String> G;
    public final Integer H;
    public final Integer I;
    public final String J;
    public final Integer K;
    public final boolean L;
    public final String M;
    public final Integer N;
    public final boolean O;
    public final boolean P;
    public final String Q;
    public final String R;
    public final boolean S;
    public final List<String> T;
    public final boolean U;
    public final Map<String, String> V;
    public final Map<String, String> W;
    public final Double X;
    public final Double Y;
    public final boolean Z;
    public final String a;
    @Deprecated
    public final String a0;
    public final String b;
    public final Map<String, String> b0;
    public final String c;
    public final int c0;
    public final boolean d;
    public final boolean d0;
    public final boolean e;
    public final int e0;
    public final String f;
    public final String f0;
    public final String g;
    public final int g0;
    public final int h;
    public final String h0;
    public final String i;
    public final String i0;
    public final boolean j;
    public final int j0;
    public final boolean k;
    public final String k0;
    public final Map<String, String> l;
    public final String l0;
    public final Map<String, String> m;
    public final int m0;
    public final Map<String, String> n;
    public final int n0;
    public final Map<String, String> o;
    public final int o0;
    public final List<String> p;
    public final Map<String, String> q;
    public final Set<Integer> r;
    public final Set<Integer> s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final Set<String> x;
    public final Integer y;
    public final Integer z;

    /* compiled from: Config.java */
    /* renamed from: com.amazon.aps.iva.zr.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public enum EnumC0928a {
        DATADOG,
        B3,
        HAYSTACK
    }

    static {
        EnumC0928a enumC0928a = EnumC0928a.DATADOG;
        s0 = enumC0928a.name();
        t0 = enumC0928a.name();
        v0 = new a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:1|(1:3)|(2:5|(4:7|8|9|10))|13|(4:16|(2:18|19)(1:21)|20|14)|22|23|(17:25|26|27|(14:29|30|31|(1:33)|34|(1:36)|37|38|39|40|41|42|43|44)|51|31|(0)|34|(0)|37|38|39|40|41|42|43|44)|53|27|(0)|51|31|(0)|34|(0)|37|38|39|40|41|42|43|44) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x02ff, code lost:
        r2 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a() {
        /*
            Method dump skipped, instructions count: 999
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.zr.a.<init>():void");
    }

    public static Set<EnumC0928a> a(Set<String> set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : set) {
            try {
                linkedHashSet.add(EnumC0928a.valueOf(str.toUpperCase(Locale.US)));
            } catch (IllegalArgumentException unused) {
            }
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    @Deprecated
    public static Boolean b(String str, Boolean bool) {
        try {
            bool = o(bool, Boolean.class, i(str, null));
        } catch (NumberFormatException unused) {
        }
        return (Boolean) bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    public static Integer c(String str, Integer num) {
        try {
            num = o(num, Integer.class, i(str, null));
        } catch (NumberFormatException unused) {
        }
        return (Integer) num;
    }

    @Deprecated
    public static Map d(String str) {
        String i = i(str, null);
        n(str);
        return l(i);
    }

    public static Boolean e(Properties properties, String str, Boolean bool) {
        return (Boolean) o(bool, Boolean.class, properties.getProperty(str));
    }

    public static Integer f(Properties properties, String str, Integer num) {
        return (Integer) o(num, Integer.class, properties.getProperty(str));
    }

    public static List<String> g(Properties properties, String str, List<String> list) {
        String property = properties.getProperty(str);
        if (property != null && !property.trim().isEmpty()) {
            return k(property);
        }
        return list;
    }

    public static Map<String, String> h(Properties properties, String str, Map<String, String> map) {
        String property = properties.getProperty(str);
        if (property != null && !property.trim().isEmpty()) {
            return l(property);
        }
        return map;
    }

    @Deprecated
    public static String i(String str, String str2) {
        String n = n(str);
        String property = System.getProperties().getProperty(n);
        if (property != null) {
            return property;
        }
        String str3 = System.getenv(p0.matcher(n(str).toUpperCase(Locale.US)).replaceAll("_"));
        if (str3 != null) {
            return str3;
        }
        String property2 = u0.getProperty(n);
        if (property2 != null) {
            return property2;
        }
        return str2;
    }

    public static Set j(String str) throws NumberFormatException {
        String replaceAll = str.replaceAll("\\s", "");
        if (replaceAll.matches("\\d{3}(?:-\\d{3})?(?:,\\d{3}(?:-\\d{3})?)*")) {
            String[] split = replaceAll.split(",", -1);
            HashSet hashSet = new HashSet();
            for (String str2 : split) {
                String[] split2 = str2.split("-", -1);
                if (split2.length == 1) {
                    hashSet.add(Integer.valueOf(Integer.parseInt(split2[0])));
                } else if (split2.length == 2) {
                    int parseInt = Integer.parseInt(split2[0]);
                    int parseInt2 = Integer.parseInt(split2[1]);
                    int max = Math.max(parseInt, parseInt2);
                    for (int min = Math.min(parseInt, parseInt2); min <= max; min++) {
                        hashSet.add(Integer.valueOf(min));
                    }
                }
            }
            return Collections.unmodifiableSet(hashSet);
        }
        throw new NumberFormatException();
    }

    public static List<String> k(String str) {
        if (str != null && !str.trim().isEmpty()) {
            String[] split = str.split(",", -1);
            for (int i = 0; i < split.length; i++) {
                split[i] = split[i].trim();
            }
            return Collections.unmodifiableList(Arrays.asList(split));
        }
        return Collections.emptyList();
    }

    public static Map l(String str) {
        if (str != null && !str.trim().isEmpty()) {
            if (!str.matches("(([^,:]+:[^,:]*,)*([^,:]+:[^,:]*),?)?")) {
                return Collections.emptyMap();
            }
            String[] split = str.split(",", -1);
            HashMap hashMap = new HashMap(split.length + 1, 1.0f);
            for (String str2 : split) {
                String[] split2 = str2.split(":", -1);
                if (split2.length == 2) {
                    String trim = split2[0].trim();
                    String trim2 = split2[1].trim();
                    if (trim2.length() > 0) {
                        hashMap.put(trim, trim2);
                    }
                }
            }
            return Collections.unmodifiableMap(hashMap);
        }
        return Collections.emptyMap();
    }

    public static Set<String> m(String str) {
        String[] split;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : str.split("[,\\s]+")) {
            if (!str2.isEmpty()) {
                linkedHashSet.add(str2);
            }
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public static String n(String str) {
        return com.amazon.aps.iva.oa.a.a("dd.", str);
    }

    public static Object o(Object obj, Class cls, String str) {
        if (str != null && !str.trim().isEmpty()) {
            try {
                return cls.getMethod("valueOf", String.class).invoke(null, str);
            } catch (IllegalAccessException e) {
                e = e;
                throw new NumberFormatException(e.toString());
            } catch (NoSuchMethodException e2) {
                e = e2;
                throw new NumberFormatException(e.toString());
            } catch (NumberFormatException e3) {
                throw e3;
            } catch (Throwable th) {
                throw new NumberFormatException(th.toString());
            }
        }
        return obj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Config{runtimeId='");
        sb.append(this.a);
        sb.append("', site='");
        sb.append(this.b);
        sb.append("', serviceName='");
        sb.append(this.c);
        sb.append("', traceEnabled=");
        sb.append(this.d);
        sb.append(", integrationsEnabled=");
        sb.append(this.e);
        sb.append(", writerType='");
        sb.append(this.f);
        sb.append("', agentHost='");
        sb.append(this.g);
        sb.append("', agentPort=");
        sb.append(this.h);
        sb.append(", agentUnixDomainSocket='");
        sb.append(this.i);
        sb.append("', prioritySamplingEnabled=");
        sb.append(this.j);
        sb.append(", traceResolverEnabled=");
        sb.append(this.k);
        sb.append(", serviceMapping=");
        sb.append(this.l);
        sb.append(", tags=");
        sb.append(this.m);
        sb.append(", spanTags=");
        sb.append(this.n);
        sb.append(", jmxTags=");
        sb.append(this.o);
        sb.append(", excludedClasses=");
        sb.append(this.p);
        sb.append(", headerTags=");
        sb.append(this.q);
        sb.append(", httpServerErrorStatuses=");
        sb.append(this.r);
        sb.append(", httpClientErrorStatuses=");
        sb.append(this.s);
        sb.append(", httpServerTagQueryString=");
        sb.append(this.t);
        sb.append(", httpClientTagQueryString=");
        sb.append(this.u);
        sb.append(", httpClientSplitByDomain=");
        sb.append(this.v);
        sb.append(", dbClientSplitByInstance=");
        sb.append(this.w);
        sb.append(", splitByTags=");
        sb.append(this.x);
        sb.append(", scopeDepthLimit=");
        sb.append(this.y);
        sb.append(", partialFlushMinSpans=");
        sb.append(this.z);
        sb.append(", runtimeContextFieldInjection=");
        sb.append(this.A);
        sb.append(", propagationStylesToExtract=");
        sb.append(this.B);
        sb.append(", propagationStylesToInject=");
        sb.append(this.C);
        sb.append(", jmxFetchEnabled=");
        sb.append(this.D);
        sb.append(", jmxFetchConfigDir='");
        sb.append(this.E);
        sb.append("', jmxFetchConfigs=");
        sb.append(this.F);
        sb.append(", jmxFetchMetricsConfigs=");
        sb.append(this.G);
        sb.append(", jmxFetchCheckPeriod=");
        sb.append(this.H);
        sb.append(", jmxFetchRefreshBeansPeriod=");
        sb.append(this.I);
        sb.append(", jmxFetchStatsdHost='");
        sb.append(this.J);
        sb.append("', jmxFetchStatsdPort=");
        sb.append(this.K);
        sb.append(", healthMetricsEnabled=");
        sb.append(this.L);
        sb.append(", healthMetricsStatsdHost='");
        sb.append(this.M);
        sb.append("', healthMetricsStatsdPort=");
        sb.append(this.N);
        sb.append(", logsInjectionEnabled=");
        sb.append(this.O);
        sb.append(", reportHostName=");
        sb.append(this.P);
        sb.append(", traceAnnotations='");
        sb.append(this.Q);
        sb.append("', traceMethods='");
        sb.append(this.R);
        sb.append("', traceExecutorsAll=");
        sb.append(this.S);
        sb.append(", traceExecutors=");
        sb.append(this.T);
        sb.append(", traceAnalyticsEnabled=");
        sb.append(this.U);
        sb.append(", traceSamplingServiceRules=");
        sb.append(this.V);
        sb.append(", traceSamplingOperationRules=");
        sb.append(this.W);
        sb.append(", traceSampleRate=");
        sb.append(this.X);
        sb.append(", traceRateLimit=");
        sb.append(this.Y);
        sb.append(", profilingEnabled=");
        sb.append(this.Z);
        sb.append(", profilingUrl='");
        sb.append(this.a0);
        sb.append("', profilingTags=");
        sb.append(this.b0);
        sb.append(", profilingStartDelay=");
        sb.append(this.c0);
        sb.append(", profilingStartForceFirst=");
        sb.append(this.d0);
        sb.append(", profilingUploadPeriod=");
        sb.append(this.e0);
        sb.append(", profilingTemplateOverrideFile='");
        sb.append(this.f0);
        sb.append("', profilingUploadTimeout=");
        sb.append(this.g0);
        sb.append(", profilingUploadCompression='");
        sb.append(this.h0);
        sb.append("', profilingProxyHost='");
        sb.append(this.i0);
        sb.append("', profilingProxyPort=");
        sb.append(this.j0);
        sb.append(", profilingProxyUsername='");
        sb.append(this.k0);
        sb.append("', profilingProxyPassword='");
        sb.append(this.l0);
        sb.append("', profilingExceptionSampleLimit=");
        sb.append(this.m0);
        sb.append(", profilingExceptionHistogramTopItems=");
        sb.append(this.n0);
        sb.append(", profilingExceptionHistogramMaxCollectionSize=");
        return b2.b(sb, this.o0, '}');
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x01cd, code lost:
        if (r0.isEmpty() == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(java.util.Properties r6, com.amazon.aps.iva.zr.a r7) {
        /*
            Method dump skipped, instructions count: 1005
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.zr.a.<init>(java.util.Properties, com.amazon.aps.iva.zr.a):void");
    }
}
