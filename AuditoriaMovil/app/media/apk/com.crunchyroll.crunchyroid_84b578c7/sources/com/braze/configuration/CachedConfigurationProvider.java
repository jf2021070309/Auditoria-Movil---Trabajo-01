package com.braze.configuration;

import android.content.Context;
import android.content.res.Resources;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.oe0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.braze.support.BrazeLogger;
import com.braze.support.PackageUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\f\b\u0017\u0018\u0000 02\u00020\u0001:\u000212B%\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\n\u0012\b\b\u0002\u0010!\u001a\u00020 ¢\u0006\u0004\b.\u0010/J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u001a\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002J\u0016\u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0006J\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00112\u0006\u0010\t\u001a\u00020\u00022\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0006H\u0004J$\u0010\u0015\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0004J$\u0010\u0016\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0004J$\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0007J$\u0010\u0018\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0007J\u0018\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0006H\u0007R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010!\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R%\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00063"}, d2 = {"Lcom/braze/configuration/CachedConfigurationProvider;", "", "", "key", "Lcom/braze/configuration/CachedConfigurationProvider$b;", "resourceType", "", "getResourceIdentifier", "getFallbackConfigKey", "primaryKey", "", "defaultValue", "getBooleanValue", "getStringValue", "getIntValue", "getColorValue", "(Ljava/lang/String;)Ljava/lang/Integer;", "", "getStringSetValue", "getDrawableValue", "type", "getRuntimeConfigurationValue", "getResourceConfigurationValue", "getConfigurationValue", "readResourceValue", "resourceId", "getValueFromResources", "Landroid/content/Context;", "context", "Landroid/content/Context;", "shouldUseConfigurationCache", "Z", "Lcom/braze/configuration/RuntimeAppConfigurationProvider;", "runtimeAppConfigurationProvider", "Lcom/braze/configuration/RuntimeAppConfigurationProvider;", "getRuntimeAppConfigurationProvider", "()Lcom/braze/configuration/RuntimeAppConfigurationProvider;", "setRuntimeAppConfigurationProvider", "(Lcom/braze/configuration/RuntimeAppConfigurationProvider;)V", "", "configurationCache", "Ljava/util/Map;", "getConfigurationCache", "()Ljava/util/Map;", "resourcePackageName", "Ljava/lang/String;", "<init>", "(Landroid/content/Context;ZLcom/braze/configuration/RuntimeAppConfigurationProvider;)V", "Companion", "a", "b", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class CachedConfigurationProvider {
    public static final a Companion = new a(null);
    private final Map<String, Object> configurationCache;
    private Context context;
    private final String resourcePackageName;
    private RuntimeAppConfigurationProvider runtimeAppConfigurationProvider;
    private boolean shouldUseConfigurationCache;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        INTEGER("integer"),
        COLOR("color"),
        BOOLEAN("bool"),
        STRING("string"),
        DRAWABLE_IDENTIFIER("drawable"),
        STRING_ARRAY("array");
        
        private final String b;

        b(String str) {
            this.b = str;
        }

        public final String b() {
            return this.b;
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.STRING_ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.INTEGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.COLOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b.DRAWABLE_IDENTIFIER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;
        final /* synthetic */ Object c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Object obj) {
            super(0);
            this.b = str;
            this.c = obj;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            StringBuilder sb = new StringBuilder("Using resources value for key: '");
            sb.append(this.b);
            sb.append("' and value: '");
            return defpackage.b.b(sb, this.c, '\'');
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;
        final /* synthetic */ Object c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Object obj) {
            super(0);
            this.b = str;
            this.c = obj;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            StringBuilder sb = new StringBuilder("Using runtime override value for key: '");
            sb.append(this.b);
            sb.append("' and value: '");
            return defpackage.b.b(sb, this.c, '\'');
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;
        final /* synthetic */ Object c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Object obj) {
            super(0);
            this.b = str;
            this.c = obj;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            StringBuilder sb = new StringBuilder("Primary key '");
            sb.append(this.b);
            sb.append("' had no identifier. No secondary key to read resource value. Returning default value: '");
            return defpackage.b.b(sb, this.c, '\'');
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends l implements com.amazon.aps.iva.xb0.a {
        public static final g b = new g();

        public g() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Caught exception retrieving resource value";
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ b b;
        final /* synthetic */ String c;
        final /* synthetic */ Object d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(b bVar, String str, Object obj) {
            super(0);
            this.b = bVar;
            this.c = str;
            this.d = obj;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Unable to find the xml " + this.b + " configuration value with primary key '" + this.c + "'. Using default value '" + this.d + "'.";
        }
    }

    public CachedConfigurationProvider(Context context, boolean z, RuntimeAppConfigurationProvider runtimeAppConfigurationProvider) {
        j.f(context, "context");
        j.f(runtimeAppConfigurationProvider, "runtimeAppConfigurationProvider");
        this.context = context;
        this.shouldUseConfigurationCache = z;
        this.runtimeAppConfigurationProvider = runtimeAppConfigurationProvider;
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(new HashMap());
        j.e(synchronizedMap, "synchronizedMap(HashMap())");
        this.configurationCache = synchronizedMap;
        this.resourcePackageName = PackageUtils.getResourcePackageName(this.context);
    }

    private final String getFallbackConfigKey(String str) {
        if (q.i0(str, "braze", false)) {
            return m.f0(str, "braze", "appboy");
        }
        return null;
    }

    private final int getResourceIdentifier(String str, b bVar) {
        if (str == null) {
            return 0;
        }
        return this.context.getResources().getIdentifier(str, bVar.b(), this.resourcePackageName);
    }

    public final boolean getBooleanValue(String str, boolean z) {
        j.f(str, "primaryKey");
        Object configurationValue = getConfigurationValue(b.BOOLEAN, str, Boolean.valueOf(z));
        j.d(configurationValue, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) configurationValue).booleanValue();
    }

    public final Integer getColorValue(String str) {
        j.f(str, "primaryKey");
        return (Integer) getConfigurationValue(b.COLOR, str, null);
    }

    public final Map<String, Object> getConfigurationCache() {
        return this.configurationCache;
    }

    public final Object getConfigurationValue(b bVar, String str, Object obj) {
        j.f(bVar, "type");
        j.f(str, "key");
        if (this.shouldUseConfigurationCache && this.configurationCache.containsKey(str)) {
            return this.configurationCache.get(str);
        }
        if (this.runtimeAppConfigurationProvider.containsKey(str)) {
            return getRuntimeConfigurationValue(bVar, str, obj);
        }
        return getResourceConfigurationValue(bVar, str, obj);
    }

    public final int getDrawableValue(String str, int i) {
        j.f(str, "primaryKey");
        Object configurationValue = getConfigurationValue(b.DRAWABLE_IDENTIFIER, str, Integer.valueOf(i));
        j.d(configurationValue, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) configurationValue).intValue();
    }

    public final int getIntValue(String str, int i) {
        j.f(str, "primaryKey");
        Object configurationValue = getConfigurationValue(b.INTEGER, str, Integer.valueOf(i));
        j.d(configurationValue, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) configurationValue).intValue();
    }

    public final Object getResourceConfigurationValue(b bVar, String str, Object obj) {
        j.f(bVar, "type");
        j.f(str, "key");
        Object readResourceValue = readResourceValue(bVar, str, obj);
        this.configurationCache.put(str, readResourceValue);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new d(str, readResourceValue), 3, (Object) null);
        return readResourceValue;
    }

    public final RuntimeAppConfigurationProvider getRuntimeAppConfigurationProvider() {
        return this.runtimeAppConfigurationProvider;
    }

    public final Object getRuntimeConfigurationValue(b bVar, String str, Object obj) {
        Object valueOf;
        int intValue;
        j.f(bVar, "type");
        j.f(str, "key");
        switch (c.a[bVar.ordinal()]) {
            case 1:
                RuntimeAppConfigurationProvider runtimeAppConfigurationProvider = this.runtimeAppConfigurationProvider;
                j.d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                valueOf = Boolean.valueOf(runtimeAppConfigurationProvider.getBooleanValue(str, ((Boolean) obj).booleanValue()));
                break;
            case 2:
                valueOf = this.runtimeAppConfigurationProvider.getStringValue(str, (String) obj);
                break;
            case 3:
                RuntimeAppConfigurationProvider runtimeAppConfigurationProvider2 = this.runtimeAppConfigurationProvider;
                j.d(obj, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String?>");
                valueOf = runtimeAppConfigurationProvider2.getStringSetValue(str, (Set) obj);
                break;
            case 4:
            case 5:
                if (obj == null) {
                    intValue = this.runtimeAppConfigurationProvider.getIntValue(str, 0);
                } else {
                    intValue = this.runtimeAppConfigurationProvider.getIntValue(str, ((Integer) obj).intValue());
                }
                valueOf = Integer.valueOf(intValue);
                break;
            case 6:
                valueOf = Integer.valueOf(getResourceIdentifier(this.runtimeAppConfigurationProvider.getStringValue(str, ""), b.DRAWABLE_IDENTIFIER));
                break;
            default:
                throw new com.amazon.aps.iva.kb0.h();
        }
        this.configurationCache.put(str, valueOf);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new e(str, valueOf), 3, (Object) null);
        return valueOf;
    }

    public final Set<String> getStringSetValue(String str, Set<String> set) {
        j.f(str, "primaryKey");
        Object configurationValue = getConfigurationValue(b.STRING_ARRAY, str, set);
        if (configurationValue == null) {
            return set;
        }
        return (Set) configurationValue;
    }

    public final String getStringValue(String str, String str2) {
        j.f(str, "primaryKey");
        return (String) getConfigurationValue(b.STRING, str, str2);
    }

    public final Object getValueFromResources(b bVar, int i) {
        j.f(bVar, "type");
        Resources resources = this.context.getResources();
        switch (c.a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(resources.getBoolean(i));
            case 2:
                String string = resources.getString(i);
                j.e(string, "resources.getString(resourceId)");
                return string;
            case 3:
                String[] stringArray = resources.getStringArray(i);
                j.e(stringArray, "resources.getStringArray(resourceId)");
                return new HashSet(f1.K(Arrays.copyOf(stringArray, stringArray.length)));
            case 4:
                return Integer.valueOf(resources.getInteger(i));
            case 5:
                return Integer.valueOf(resources.getColor(i));
            case 6:
                return Integer.valueOf(i);
            default:
                throw new com.amazon.aps.iva.kb0.h();
        }
    }

    public final Object readResourceValue(b bVar, String str, Object obj) {
        int resourceIdentifier;
        j.f(bVar, "type");
        j.f(str, "key");
        try {
            resourceIdentifier = getResourceIdentifier(str, bVar);
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, g.b);
        }
        if (resourceIdentifier != 0) {
            return getValueFromResources(bVar, resourceIdentifier);
        }
        String fallbackConfigKey = getFallbackConfigKey(str);
        if (fallbackConfigKey == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new f(str, obj), 3, (Object) null);
            return obj;
        }
        int resourceIdentifier2 = getResourceIdentifier(fallbackConfigKey, bVar);
        if (resourceIdentifier2 != 0) {
            return getValueFromResources(bVar, resourceIdentifier2);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new h(bVar, str, obj), 3, (Object) null);
        return obj;
    }

    public /* synthetic */ CachedConfigurationProvider(Context context, boolean z, RuntimeAppConfigurationProvider runtimeAppConfigurationProvider, int i, com.amazon.aps.iva.yb0.e eVar) {
        this(context, (i & 2) != 0 ? true : z, (i & 4) != 0 ? new RuntimeAppConfigurationProvider(context) : runtimeAppConfigurationProvider);
    }
}
