package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.Logger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: LegacyTokenHelper.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eJ \u0010\u0011\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/facebook/LegacyTokenHelper;", "", "context", "Landroid/content/Context;", "cacheKey", "", "(Landroid/content/Context;Ljava/lang/String;)V", "cache", "Landroid/content/SharedPreferences;", "clear", "", "deserializeKey", SDKConstants.PARAM_KEY, "bundle", "Landroid/os/Bundle;", "load", "save", "serializeKey", "editor", "Landroid/content/SharedPreferences$Editor;", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class LegacyTokenHelper {
    public static final String APPLICATION_ID_KEY = "com.facebook.TokenCachingStrategy.ApplicationId";
    public static final Companion Companion = new Companion(null);
    public static final String DECLINED_PERMISSIONS_KEY = "com.facebook.TokenCachingStrategy.DeclinedPermissions";
    public static final String DEFAULT_CACHE_KEY = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY";
    public static final String EXPIRATION_DATE_KEY = "com.facebook.TokenCachingStrategy.ExpirationDate";
    public static final String EXPIRED_PERMISSIONS_KEY = "com.facebook.TokenCachingStrategy.ExpiredPermissions";
    private static final long INVALID_BUNDLE_MILLISECONDS = Long.MIN_VALUE;
    private static final String IS_SSO_KEY = "com.facebook.TokenCachingStrategy.IsSSO";
    private static final String JSON_VALUE = "value";
    private static final String JSON_VALUE_ENUM_TYPE = "enumType";
    private static final String JSON_VALUE_TYPE = "valueType";
    public static final String LAST_REFRESH_DATE_KEY = "com.facebook.TokenCachingStrategy.LastRefreshDate";
    public static final String PERMISSIONS_KEY = "com.facebook.TokenCachingStrategy.Permissions";
    private static final String TAG;
    public static final String TOKEN_KEY = "com.facebook.TokenCachingStrategy.Token";
    public static final String TOKEN_SOURCE_KEY = "com.facebook.TokenCachingStrategy.AccessTokenSource";
    private static final String TYPE_BOOLEAN = "bool";
    private static final String TYPE_BOOLEAN_ARRAY = "bool[]";
    private static final String TYPE_BYTE = "byte";
    private static final String TYPE_BYTE_ARRAY = "byte[]";
    private static final String TYPE_CHAR = "char";
    private static final String TYPE_CHAR_ARRAY = "char[]";
    private static final String TYPE_DOUBLE = "double";
    private static final String TYPE_DOUBLE_ARRAY = "double[]";
    private static final String TYPE_ENUM = "enum";
    private static final String TYPE_FLOAT = "float";
    private static final String TYPE_FLOAT_ARRAY = "float[]";
    private static final String TYPE_INTEGER = "int";
    private static final String TYPE_INTEGER_ARRAY = "int[]";
    private static final String TYPE_LONG = "long";
    private static final String TYPE_LONG_ARRAY = "long[]";
    private static final String TYPE_SHORT = "short";
    private static final String TYPE_SHORT_ARRAY = "short[]";
    private static final String TYPE_STRING = "string";
    private static final String TYPE_STRING_LIST = "stringList";
    private final SharedPreferences cache;
    private final String cacheKey;

    public LegacyTokenHelper(Context context) {
        this(context, null, 2, null);
    }

    @JvmStatic
    public static final String getApplicationId(Bundle bundle) {
        return Companion.getApplicationId(bundle);
    }

    @JvmStatic
    public static final Date getExpirationDate(Bundle bundle) {
        return Companion.getExpirationDate(bundle);
    }

    @JvmStatic
    public static final long getExpirationMilliseconds(Bundle bundle) {
        return Companion.getExpirationMilliseconds(bundle);
    }

    @JvmStatic
    public static final Date getLastRefreshDate(Bundle bundle) {
        return Companion.getLastRefreshDate(bundle);
    }

    @JvmStatic
    public static final long getLastRefreshMilliseconds(Bundle bundle) {
        return Companion.getLastRefreshMilliseconds(bundle);
    }

    @JvmStatic
    public static final Set<String> getPermissions(Bundle bundle) {
        return Companion.getPermissions(bundle);
    }

    @JvmStatic
    public static final AccessTokenSource getSource(Bundle bundle) {
        return Companion.getSource(bundle);
    }

    @JvmStatic
    public static final String getToken(Bundle bundle) {
        return Companion.getToken(bundle);
    }

    @JvmStatic
    public static final boolean hasTokenInformation(Bundle bundle) {
        return Companion.hasTokenInformation(bundle);
    }

    @JvmStatic
    public static final void putApplicationId(Bundle bundle, String str) {
        Companion.putApplicationId(bundle, str);
    }

    @JvmStatic
    public static final void putDeclinedPermissions(Bundle bundle, Collection<String> collection) {
        Companion.putDeclinedPermissions(bundle, collection);
    }

    @JvmStatic
    public static final void putExpirationDate(Bundle bundle, Date date) {
        Companion.putExpirationDate(bundle, date);
    }

    @JvmStatic
    public static final void putExpirationMilliseconds(Bundle bundle, long j) {
        Companion.putExpirationMilliseconds(bundle, j);
    }

    @JvmStatic
    public static final void putExpiredPermissions(Bundle bundle, Collection<String> collection) {
        Companion.putExpiredPermissions(bundle, collection);
    }

    @JvmStatic
    public static final void putLastRefreshDate(Bundle bundle, Date date) {
        Companion.putLastRefreshDate(bundle, date);
    }

    @JvmStatic
    public static final void putLastRefreshMilliseconds(Bundle bundle, long j) {
        Companion.putLastRefreshMilliseconds(bundle, j);
    }

    @JvmStatic
    public static final void putPermissions(Bundle bundle, Collection<String> collection) {
        Companion.putPermissions(bundle, collection);
    }

    @JvmStatic
    public static final void putSource(Bundle bundle, AccessTokenSource accessTokenSource) {
        Companion.putSource(bundle, accessTokenSource);
    }

    @JvmStatic
    public static final void putToken(Bundle bundle, String str) {
        Companion.putToken(bundle, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
        if ((r4.length() == 0) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LegacyTokenHelper(android.content.Context r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r2.<init>()
            r0 = 0
            if (r4 == 0) goto L19
            r1 = r4
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            if (r1 != 0) goto L16
            r1 = 1
            goto L17
        L16:
            r1 = r0
        L17:
            if (r1 == 0) goto L1b
        L19:
            java.lang.String r4 = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY"
        L1b:
            r2.cacheKey = r4
            android.content.Context r4 = r3.getApplicationContext()
            if (r4 == 0) goto L24
            r3 = r4
        L24:
            java.lang.String r4 = r2.cacheKey
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r4, r0)
            java.lang.String r4 = "context.getSharedPrefere…ey, Context.MODE_PRIVATE)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r2.cache = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.LegacyTokenHelper.<init>(android.content.Context, java.lang.String):void");
    }

    public /* synthetic */ LegacyTokenHelper(Context context, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : str);
    }

    public final Bundle load() {
        Bundle bundle = new Bundle();
        for (String key : this.cache.getAll().keySet()) {
            try {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                deserializeKey(key, bundle);
            } catch (JSONException e) {
                Logger.Companion companion = Logger.Companion;
                LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                String str = TAG;
                companion.log(loggingBehavior, 5, str, "Error reading cached value for key: '" + key + "' -- " + e);
                return null;
            }
        }
        return bundle;
    }

    public final void save(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        SharedPreferences.Editor editor = this.cache.edit();
        for (String key : bundle.keySet()) {
            try {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                Intrinsics.checkNotNullExpressionValue(editor, "editor");
                serializeKey(key, bundle, editor);
            } catch (JSONException e) {
                Logger.Companion companion = Logger.Companion;
                LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                String str = TAG;
                companion.log(loggingBehavior, 5, str, "Error processing value for key: '" + key + "' -- " + e);
                return;
            }
        }
        editor.apply();
    }

    public final void clear() {
        this.cache.edit().clear().apply();
    }

    private final void serializeKey(String str, Bundle bundle, SharedPreferences.Editor editor) throws JSONException {
        float[] fArr;
        Object obj = bundle.get(str);
        if (obj != null) {
            Intrinsics.checkNotNullExpressionValue(obj, "bundle[key] ?: // Cannot…ll values.\n        return");
            String str2 = null;
            JSONArray jSONArray = null;
            JSONObject jSONObject = new JSONObject();
            if (obj instanceof Byte) {
                jSONObject.put("value", (int) ((Number) obj).byteValue());
                str2 = TYPE_BYTE;
            } else if (obj instanceof Short) {
                jSONObject.put("value", (int) ((Number) obj).shortValue());
                str2 = TYPE_SHORT;
            } else if (obj instanceof Integer) {
                jSONObject.put("value", ((Number) obj).intValue());
                str2 = TYPE_INTEGER;
            } else if (obj instanceof Long) {
                jSONObject.put("value", ((Number) obj).longValue());
                str2 = TYPE_LONG;
            } else if (obj instanceof Float) {
                jSONObject.put("value", ((Number) obj).floatValue());
                str2 = TYPE_FLOAT;
            } else if (obj instanceof Double) {
                jSONObject.put("value", ((Number) obj).doubleValue());
                str2 = TYPE_DOUBLE;
            } else if (obj instanceof Boolean) {
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
                jSONObject.put("value", ((Boolean) obj).booleanValue());
                str2 = TYPE_BOOLEAN;
            } else if (obj instanceof Character) {
                jSONObject.put("value", obj.toString());
                str2 = TYPE_CHAR;
            } else if (obj instanceof String) {
                jSONObject.put("value", obj);
                str2 = TYPE_STRING;
            } else if (obj instanceof Enum) {
                jSONObject.put("value", obj.toString());
                jSONObject.put(JSON_VALUE_ENUM_TYPE, ((Enum) obj).getClass().getName());
                str2 = TYPE_ENUM;
            } else {
                JSONArray jSONArray2 = new JSONArray();
                int i = 0;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    while (i < length) {
                        jSONArray2.put((int) bArr[i]);
                        i++;
                    }
                    str2 = TYPE_BYTE_ARRAY;
                } else if (obj instanceof short[]) {
                    short[] sArr = (short[]) obj;
                    int length2 = sArr.length;
                    while (i < length2) {
                        jSONArray2.put((int) sArr[i]);
                        i++;
                    }
                    str2 = TYPE_SHORT_ARRAY;
                } else if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    int length3 = iArr.length;
                    while (i < length3) {
                        jSONArray2.put(iArr[i]);
                        i++;
                    }
                    str2 = TYPE_INTEGER_ARRAY;
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    int length4 = jArr.length;
                    while (i < length4) {
                        jSONArray2.put(jArr[i]);
                        i++;
                    }
                    str2 = TYPE_LONG_ARRAY;
                } else if (obj instanceof float[]) {
                    int length5 = ((float[]) obj).length;
                    while (i < length5) {
                        jSONArray2.put(fArr[i]);
                        i++;
                    }
                    str2 = TYPE_FLOAT_ARRAY;
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    int length6 = dArr.length;
                    while (i < length6) {
                        jSONArray2.put(dArr[i]);
                        i++;
                    }
                    str2 = TYPE_DOUBLE_ARRAY;
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    int length7 = zArr.length;
                    while (i < length7) {
                        jSONArray2.put(zArr[i]);
                        i++;
                    }
                    str2 = TYPE_BOOLEAN_ARRAY;
                } else if (obj instanceof char[]) {
                    char[] cArr = (char[]) obj;
                    int length8 = cArr.length;
                    while (i < length8) {
                        jSONArray2.put(String.valueOf(cArr[i]));
                        i++;
                    }
                    str2 = TYPE_CHAR_ARRAY;
                } else if (obj instanceof List) {
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                    }
                    for (Object obj2 : (List) obj) {
                        if (obj2 == null) {
                            obj2 = JSONObject.NULL;
                        }
                        jSONArray2.put(obj2);
                    }
                    str2 = TYPE_STRING_LIST;
                }
                jSONArray = jSONArray2;
            }
            if (str2 != null) {
                jSONObject.put(JSON_VALUE_TYPE, str2);
                if (jSONArray != null) {
                    jSONObject.putOpt("value", jSONArray);
                }
                String jSONObject2 = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "json.toString()");
                editor.putString(str, jSONObject2);
            }
        }
    }

    private final void deserializeKey(String str, Bundle bundle) throws JSONException {
        String str2;
        String string = this.cache.getString(str, JsonUtils.EMPTY_JSON);
        if (string == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        JSONObject jSONObject = new JSONObject(string);
        String string2 = jSONObject.getString(JSON_VALUE_TYPE);
        if (Intrinsics.areEqual(string2, TYPE_BOOLEAN)) {
            bundle.putBoolean(str, jSONObject.getBoolean("value"));
            return;
        }
        int i = 0;
        if (Intrinsics.areEqual(string2, TYPE_BOOLEAN_ARRAY)) {
            JSONArray jSONArray = jSONObject.getJSONArray("value");
            int length = jSONArray.length();
            boolean[] zArr = new boolean[length];
            while (i < length) {
                zArr[i] = jSONArray.getBoolean(i);
                i++;
            }
            bundle.putBooleanArray(str, zArr);
        } else if (Intrinsics.areEqual(string2, TYPE_BYTE)) {
            bundle.putByte(str, (byte) jSONObject.getInt("value"));
        } else if (Intrinsics.areEqual(string2, TYPE_BYTE_ARRAY)) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("value");
            int length2 = jSONArray2.length();
            byte[] bArr = new byte[length2];
            while (i < length2) {
                bArr[i] = (byte) jSONArray2.getInt(i);
                i++;
            }
            bundle.putByteArray(str, bArr);
        } else if (Intrinsics.areEqual(string2, TYPE_SHORT)) {
            bundle.putShort(str, (short) jSONObject.getInt("value"));
        } else if (Intrinsics.areEqual(string2, TYPE_SHORT_ARRAY)) {
            JSONArray jSONArray3 = jSONObject.getJSONArray("value");
            int length3 = jSONArray3.length();
            short[] sArr = new short[length3];
            while (i < length3) {
                sArr[i] = (short) jSONArray3.getInt(i);
                i++;
            }
            bundle.putShortArray(str, sArr);
        } else if (Intrinsics.areEqual(string2, TYPE_INTEGER)) {
            bundle.putInt(str, jSONObject.getInt("value"));
        } else if (Intrinsics.areEqual(string2, TYPE_INTEGER_ARRAY)) {
            JSONArray jSONArray4 = jSONObject.getJSONArray("value");
            int length4 = jSONArray4.length();
            int[] iArr = new int[length4];
            while (i < length4) {
                iArr[i] = jSONArray4.getInt(i);
                i++;
            }
            bundle.putIntArray(str, iArr);
        } else if (Intrinsics.areEqual(string2, TYPE_LONG)) {
            bundle.putLong(str, jSONObject.getLong("value"));
        } else if (Intrinsics.areEqual(string2, TYPE_LONG_ARRAY)) {
            JSONArray jSONArray5 = jSONObject.getJSONArray("value");
            int length5 = jSONArray5.length();
            long[] jArr = new long[length5];
            while (i < length5) {
                jArr[i] = jSONArray5.getLong(i);
                i++;
            }
            bundle.putLongArray(str, jArr);
        } else if (Intrinsics.areEqual(string2, TYPE_FLOAT)) {
            bundle.putFloat(str, (float) jSONObject.getDouble("value"));
        } else if (Intrinsics.areEqual(string2, TYPE_FLOAT_ARRAY)) {
            JSONArray jSONArray6 = jSONObject.getJSONArray("value");
            int length6 = jSONArray6.length();
            float[] fArr = new float[length6];
            while (i < length6) {
                fArr[i] = (float) jSONArray6.getDouble(i);
                i++;
            }
            bundle.putFloatArray(str, fArr);
        } else if (Intrinsics.areEqual(string2, TYPE_DOUBLE)) {
            bundle.putDouble(str, jSONObject.getDouble("value"));
        } else if (Intrinsics.areEqual(string2, TYPE_DOUBLE_ARRAY)) {
            JSONArray jSONArray7 = jSONObject.getJSONArray("value");
            int length7 = jSONArray7.length();
            double[] dArr = new double[length7];
            while (i < length7) {
                dArr[i] = jSONArray7.getDouble(i);
                i++;
            }
            bundle.putDoubleArray(str, dArr);
        } else if (Intrinsics.areEqual(string2, TYPE_CHAR)) {
            String string3 = jSONObject.getString("value");
            if (string3 == null || string3.length() != 1) {
                return;
            }
            bundle.putChar(str, string3.charAt(0));
        } else if (Intrinsics.areEqual(string2, TYPE_CHAR_ARRAY)) {
            JSONArray jSONArray8 = jSONObject.getJSONArray("value");
            int length8 = jSONArray8.length();
            char[] cArr = new char[length8];
            for (int i2 = 0; i2 < length8; i2++) {
                String string4 = jSONArray8.getString(i2);
                if (string4 != null && string4.length() == 1) {
                    cArr[i2] = string4.charAt(0);
                }
            }
            bundle.putCharArray(str, cArr);
        } else if (Intrinsics.areEqual(string2, TYPE_STRING)) {
            bundle.putString(str, jSONObject.getString("value"));
        } else if (Intrinsics.areEqual(string2, TYPE_STRING_LIST)) {
            JSONArray jSONArray9 = jSONObject.getJSONArray("value");
            int length9 = jSONArray9.length();
            ArrayList<String> arrayList = new ArrayList<>(length9);
            while (i < length9) {
                Object obj = jSONArray9.get(i);
                if (obj == JSONObject.NULL) {
                    str2 = null;
                } else if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                } else {
                    str2 = (String) obj;
                }
                arrayList.add(i, str2);
                i++;
            }
            bundle.putStringArrayList(str, arrayList);
        } else if (Intrinsics.areEqual(string2, TYPE_ENUM)) {
            try {
                Class<?> cls = Class.forName(jSONObject.getString(JSON_VALUE_ENUM_TYPE));
                if (cls == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<out kotlin.Enum<*>>");
                }
                bundle.putSerializable(str, Enum.valueOf(cls, jSONObject.getString("value")));
            } catch (ClassNotFoundException | IllegalArgumentException unused) {
            }
        }
    }

    /* compiled from: LegacyTokenHelper.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010'\u001a\u0004\u0018\u00010\u00042\u0006\u0010(\u001a\u00020)H\u0007J\u001e\u0010*\u001a\u0004\u0018\u00010+2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010,\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010-\u001a\u0004\u0018\u00010+2\u0006\u0010(\u001a\u00020)H\u0007J\u0010\u0010.\u001a\u00020\n2\u0006\u0010(\u001a\u00020)H\u0007J\u0012\u0010/\u001a\u0004\u0018\u00010+2\u0006\u0010(\u001a\u00020)H\u0007J\u0010\u00100\u001a\u00020\n2\u0006\u0010(\u001a\u00020)H\u0007J\u0018\u00101\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001022\u0006\u0010(\u001a\u00020)H\u0007J\u0012\u00103\u001a\u0004\u0018\u0001042\u0006\u0010(\u001a\u00020)H\u0007J\u0012\u00105\u001a\u0004\u0018\u00010\u00042\u0006\u0010(\u001a\u00020)H\u0007J\u0012\u00106\u001a\u0002072\b\u0010(\u001a\u0004\u0018\u00010)H\u0007J\u001a\u00108\u001a\u0002092\u0006\u0010(\u001a\u00020)2\b\u0010:\u001a\u0004\u0018\u00010\u0004H\u0007J\"\u0010;\u001a\u0002092\u0006\u0010(\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010\u00042\u0006\u0010<\u001a\u00020+H\u0002J\u001e\u0010=\u001a\u0002092\u0006\u0010(\u001a\u00020)2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00040>H\u0007J\u0018\u0010?\u001a\u0002092\u0006\u0010(\u001a\u00020)2\u0006\u0010:\u001a\u00020+H\u0007J\u0018\u0010@\u001a\u0002092\u0006\u0010(\u001a\u00020)2\u0006\u0010:\u001a\u00020\nH\u0007J\u001e\u0010A\u001a\u0002092\u0006\u0010(\u001a\u00020)2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00040>H\u0007J\u0018\u0010B\u001a\u0002092\u0006\u0010(\u001a\u00020)2\u0006\u0010:\u001a\u00020+H\u0007J\u0018\u0010C\u001a\u0002092\u0006\u0010(\u001a\u00020)2\u0006\u0010:\u001a\u00020\nH\u0007J\u001e\u0010D\u001a\u0002092\u0006\u0010(\u001a\u00020)2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00040>H\u0007J\u0018\u0010E\u001a\u0002092\u0006\u0010(\u001a\u00020)2\u0006\u0010:\u001a\u000204H\u0007J\u0018\u0010F\u001a\u0002092\u0006\u0010(\u001a\u00020)2\u0006\u0010:\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006G"}, d2 = {"Lcom/facebook/LegacyTokenHelper$Companion;", "", "()V", "APPLICATION_ID_KEY", "", "DECLINED_PERMISSIONS_KEY", "DEFAULT_CACHE_KEY", "EXPIRATION_DATE_KEY", "EXPIRED_PERMISSIONS_KEY", "INVALID_BUNDLE_MILLISECONDS", "", "IS_SSO_KEY", "JSON_VALUE", "JSON_VALUE_ENUM_TYPE", "JSON_VALUE_TYPE", "LAST_REFRESH_DATE_KEY", "PERMISSIONS_KEY", "TAG", "TOKEN_KEY", "TOKEN_SOURCE_KEY", "TYPE_BOOLEAN", "TYPE_BOOLEAN_ARRAY", "TYPE_BYTE", "TYPE_BYTE_ARRAY", "TYPE_CHAR", "TYPE_CHAR_ARRAY", "TYPE_DOUBLE", "TYPE_DOUBLE_ARRAY", "TYPE_ENUM", "TYPE_FLOAT", "TYPE_FLOAT_ARRAY", "TYPE_INTEGER", "TYPE_INTEGER_ARRAY", "TYPE_LONG", "TYPE_LONG_ARRAY", "TYPE_SHORT", "TYPE_SHORT_ARRAY", "TYPE_STRING", "TYPE_STRING_LIST", "getApplicationId", "bundle", "Landroid/os/Bundle;", "getDate", "Ljava/util/Date;", SDKConstants.PARAM_KEY, "getExpirationDate", "getExpirationMilliseconds", "getLastRefreshDate", "getLastRefreshMilliseconds", "getPermissions", "", "getSource", "Lcom/facebook/AccessTokenSource;", "getToken", "hasTokenInformation", "", "putApplicationId", "", "value", "putDate", "date", "putDeclinedPermissions", "", "putExpirationDate", "putExpirationMilliseconds", "putExpiredPermissions", "putLastRefreshDate", "putLastRefreshMilliseconds", "putPermissions", "putSource", "putToken", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final boolean hasTokenInformation(Bundle bundle) {
            String string;
            if (bundle == null || (string = bundle.getString(LegacyTokenHelper.TOKEN_KEY)) == null) {
                return false;
            }
            return ((string.length() == 0) || bundle.getLong(LegacyTokenHelper.EXPIRATION_DATE_KEY, 0L) == 0) ? false : true;
        }

        @JvmStatic
        public final String getToken(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return bundle.getString(LegacyTokenHelper.TOKEN_KEY);
        }

        @JvmStatic
        public final void putToken(Bundle bundle, String value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putString(LegacyTokenHelper.TOKEN_KEY, value);
        }

        @JvmStatic
        public final Date getExpirationDate(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return getDate(bundle, LegacyTokenHelper.EXPIRATION_DATE_KEY);
        }

        @JvmStatic
        public final void putExpirationDate(Bundle bundle, Date value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(value, "value");
            putDate(bundle, LegacyTokenHelper.EXPIRATION_DATE_KEY, value);
        }

        @JvmStatic
        public final long getExpirationMilliseconds(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return bundle.getLong(LegacyTokenHelper.EXPIRATION_DATE_KEY);
        }

        @JvmStatic
        public final void putExpirationMilliseconds(Bundle bundle, long j) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.putLong(LegacyTokenHelper.EXPIRATION_DATE_KEY, j);
        }

        @JvmStatic
        public final Set<String> getPermissions(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            ArrayList<String> stringArrayList = bundle.getStringArrayList(LegacyTokenHelper.PERMISSIONS_KEY);
            if (stringArrayList != null) {
                Intrinsics.checkNotNullExpressionValue(stringArrayList, "bundle.getStringArrayLis…SIONS_KEY) ?: return null");
                return new HashSet(stringArrayList);
            }
            return null;
        }

        @JvmStatic
        public final void putPermissions(Bundle bundle, Collection<String> value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putStringArrayList(LegacyTokenHelper.PERMISSIONS_KEY, new ArrayList<>(value));
        }

        @JvmStatic
        public final void putDeclinedPermissions(Bundle bundle, Collection<String> value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putStringArrayList(LegacyTokenHelper.DECLINED_PERMISSIONS_KEY, new ArrayList<>(value));
        }

        @JvmStatic
        public final void putExpiredPermissions(Bundle bundle, Collection<String> value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putStringArrayList(LegacyTokenHelper.EXPIRED_PERMISSIONS_KEY, new ArrayList<>(value));
        }

        @JvmStatic
        public final AccessTokenSource getSource(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            if (bundle.containsKey(LegacyTokenHelper.TOKEN_SOURCE_KEY)) {
                return (AccessTokenSource) bundle.getSerializable(LegacyTokenHelper.TOKEN_SOURCE_KEY);
            }
            return bundle.getBoolean(LegacyTokenHelper.IS_SSO_KEY) ? AccessTokenSource.FACEBOOK_APPLICATION_WEB : AccessTokenSource.WEB_VIEW;
        }

        @JvmStatic
        public final void putSource(Bundle bundle, AccessTokenSource value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putSerializable(LegacyTokenHelper.TOKEN_SOURCE_KEY, value);
        }

        @JvmStatic
        public final Date getLastRefreshDate(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return getDate(bundle, LegacyTokenHelper.LAST_REFRESH_DATE_KEY);
        }

        @JvmStatic
        public final void putLastRefreshDate(Bundle bundle, Date value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(value, "value");
            putDate(bundle, LegacyTokenHelper.LAST_REFRESH_DATE_KEY, value);
        }

        @JvmStatic
        public final long getLastRefreshMilliseconds(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return bundle.getLong(LegacyTokenHelper.LAST_REFRESH_DATE_KEY);
        }

        @JvmStatic
        public final void putLastRefreshMilliseconds(Bundle bundle, long j) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.putLong(LegacyTokenHelper.LAST_REFRESH_DATE_KEY, j);
        }

        @JvmStatic
        public final String getApplicationId(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return bundle.getString(LegacyTokenHelper.APPLICATION_ID_KEY);
        }

        @JvmStatic
        public final void putApplicationId(Bundle bundle, String str) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.putString(LegacyTokenHelper.APPLICATION_ID_KEY, str);
        }

        private final Date getDate(Bundle bundle, String str) {
            if (bundle == null) {
                return null;
            }
            long j = bundle.getLong(str, Long.MIN_VALUE);
            if (j == Long.MIN_VALUE) {
                return null;
            }
            return new Date(j);
        }

        private final void putDate(Bundle bundle, String str, Date date) {
            bundle.putLong(str, date.getTime());
        }
    }

    static {
        String simpleName = LegacyTokenHelper.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "LegacyTokenHelper::class.java.simpleName");
        TAG = simpleName;
    }
}
