package com.facebook.appevents;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import com.facebook.FacebookSdk;
import com.facebook.appevents.aam.MetadataRule;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
/* compiled from: UserDataStore.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u001f\u001a\u00020 H\u0007J\b\u0010!\u001a\u00020\u0004H\u0007J\r\u0010\"\u001a\u00020\u0004H\u0001¢\u0006\u0002\b#J\b\u0010$\u001a\u00020 H\u0002J\b\u0010%\u001a\u00020 H\u0007J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0004H\u0002J\u0018\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0004H\u0002J\u001c\u0010+\u001a\u00020 2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0015H\u0007J\u0012\u0010-\u001a\u00020 2\b\u0010,\u001a\u0004\u0018\u00010.H\u0007Jl\u0010-\u001a\u00020 2\b\u0010/\u001a\u0004\u0018\u00010\u00042\b\u00100\u001a\u0004\u0018\u00010\u00042\b\u00101\u001a\u0004\u0018\u00010\u00042\b\u00102\u001a\u0004\u0018\u00010\u00042\b\u00103\u001a\u0004\u0018\u00010\u00042\b\u00104\u001a\u0004\u0018\u00010\u00042\b\u00105\u001a\u0004\u0018\u00010\u00042\b\u00106\u001a\u0004\u0018\u00010\u00042\b\u00107\u001a\u0004\u0018\u00010\u00042\b\u00108\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u00109\u001a\u00020 2\b\u0010,\u001a\u0004\u0018\u00010.H\u0002J\u0018\u0010:\u001a\u00020 2\u0006\u0010;\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R$\u0010\u0014\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001c\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/facebook/appevents/UserDataStore;", "", "()V", "CITY", "", "COUNTRY", "DATA_SEPARATOR", "DATE_OF_BIRTH", "EMAIL", "FIRST_NAME", "GENDER", "INTERNAL_USER_DATA_KEY", "LAST_NAME", "MAX_NUM", "", "PHONE", "STATE", "TAG", "USER_DATA_KEY", "ZIP", "enabledInternalUserData", "", "getEnabledInternalUserData", "()Ljava/util/Map;", "externalHashedUserData", "Ljava/util/concurrent/ConcurrentHashMap;", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "internalHashedUserData", "sharedPreferences", "Landroid/content/SharedPreferences;", "clear", "", "getAllHashedUserData", "getHashedUserData", "getHashedUserData$facebook_core_release", "initAndWait", "initStore", "maybeSHA256Hashed", "", "data", "normalizeData", "type", "setInternalUd", "ud", "setUserDataAndHash", "Landroid/os/Bundle;", "email", "firstName", "lastName", "phone", "dateOfBirth", InneractiveMediationDefs.KEY_GENDER, "city", "state", "zip", UserDataStore.COUNTRY, "updateHashUserData", "writeDataIntoCache", SDKConstants.PARAM_KEY, "value", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class UserDataStore {
    public static final String CITY = "ct";
    public static final String COUNTRY = "country";
    private static final String DATA_SEPARATOR = ",";
    public static final String DATE_OF_BIRTH = "db";
    public static final String EMAIL = "em";
    public static final String FIRST_NAME = "fn";
    public static final String GENDER = "ge";
    public static final UserDataStore INSTANCE = new UserDataStore();
    private static final String INTERNAL_USER_DATA_KEY = "com.facebook.appevents.UserDataStore.internalUserData";
    public static final String LAST_NAME = "ln";
    private static final int MAX_NUM = 5;
    public static final String PHONE = "ph";
    public static final String STATE = "st";
    private static final String TAG;
    private static final String USER_DATA_KEY = "com.facebook.appevents.UserDataStore.userData";
    public static final String ZIP = "zp";
    private static final ConcurrentHashMap<String, String> externalHashedUserData;
    private static final AtomicBoolean initialized;
    private static final ConcurrentHashMap<String, String> internalHashedUserData;
    private static SharedPreferences sharedPreferences;

    static {
        String simpleName = UserDataStore.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "UserDataStore::class.java.simpleName");
        TAG = simpleName;
        initialized = new AtomicBoolean(false);
        externalHashedUserData = new ConcurrentHashMap<>();
        internalHashedUserData = new ConcurrentHashMap<>();
    }

    private UserDataStore() {
    }

    public static final /* synthetic */ ConcurrentHashMap access$getExternalHashedUserData$p(UserDataStore userDataStore) {
        if (CrashShieldHandler.isObjectCrashing(UserDataStore.class)) {
            return null;
        }
        try {
            return externalHashedUserData;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, UserDataStore.class);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean access$getInitialized$p(UserDataStore userDataStore) {
        if (CrashShieldHandler.isObjectCrashing(UserDataStore.class)) {
            return null;
        }
        try {
            return initialized;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, UserDataStore.class);
            return null;
        }
    }

    public static final /* synthetic */ ConcurrentHashMap access$getInternalHashedUserData$p(UserDataStore userDataStore) {
        if (CrashShieldHandler.isObjectCrashing(UserDataStore.class)) {
            return null;
        }
        try {
            return internalHashedUserData;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, UserDataStore.class);
            return null;
        }
    }

    public static final /* synthetic */ SharedPreferences access$getSharedPreferences$p(UserDataStore userDataStore) {
        if (CrashShieldHandler.isObjectCrashing(UserDataStore.class)) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences2 = sharedPreferences;
            if (sharedPreferences2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
            }
            return sharedPreferences2;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, UserDataStore.class);
            return null;
        }
    }

    public static final /* synthetic */ String access$getTAG$p(UserDataStore userDataStore) {
        if (CrashShieldHandler.isObjectCrashing(UserDataStore.class)) {
            return null;
        }
        try {
            return TAG;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, UserDataStore.class);
            return null;
        }
    }

    public static final /* synthetic */ void access$initAndWait(UserDataStore userDataStore) {
        if (CrashShieldHandler.isObjectCrashing(UserDataStore.class)) {
            return;
        }
        try {
            userDataStore.initAndWait();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, UserDataStore.class);
        }
    }

    public static final /* synthetic */ void access$setSharedPreferences$p(UserDataStore userDataStore, SharedPreferences sharedPreferences2) {
        if (CrashShieldHandler.isObjectCrashing(UserDataStore.class)) {
            return;
        }
        try {
            sharedPreferences = sharedPreferences2;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, UserDataStore.class);
        }
    }

    public static final /* synthetic */ void access$updateHashUserData(UserDataStore userDataStore, Bundle bundle) {
        if (CrashShieldHandler.isObjectCrashing(UserDataStore.class)) {
            return;
        }
        try {
            userDataStore.updateHashUserData(bundle);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, UserDataStore.class);
        }
    }

    public static final /* synthetic */ void access$writeDataIntoCache(UserDataStore userDataStore, String str, String str2) {
        if (CrashShieldHandler.isObjectCrashing(UserDataStore.class)) {
            return;
        }
        try {
            userDataStore.writeDataIntoCache(str, str2);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, UserDataStore.class);
        }
    }

    @JvmStatic
    public static final void initStore() {
        if (CrashShieldHandler.isObjectCrashing(UserDataStore.class)) {
            return;
        }
        try {
            if (initialized.get()) {
                return;
            }
            INSTANCE.initAndWait();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, UserDataStore.class);
        }
    }

    private final void writeDataIntoCache(final String str, final String str2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            FacebookSdk.getExecutor().execute(new Runnable() { // from class: com.facebook.appevents.UserDataStore$writeDataIntoCache$1
                @Override // java.lang.Runnable
                public final void run() {
                    if (CrashShieldHandler.isObjectCrashing(this)) {
                        return;
                    }
                    try {
                        if (CrashShieldHandler.isObjectCrashing(this)) {
                            return;
                        }
                        if (!UserDataStore.access$getInitialized$p(UserDataStore.INSTANCE).get()) {
                            UserDataStore.access$initAndWait(UserDataStore.INSTANCE);
                        }
                        UserDataStore.access$getSharedPreferences$p(UserDataStore.INSTANCE).edit().putString(str, str2).apply();
                    } catch (Throwable th) {
                        CrashShieldHandler.handleThrowable(th, this);
                    }
                }
            });
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @JvmStatic
    public static final void setUserDataAndHash(final Bundle bundle) {
        if (CrashShieldHandler.isObjectCrashing(UserDataStore.class)) {
            return;
        }
        try {
            InternalAppEventsLogger.Companion.getAnalyticsExecutor().execute(new Runnable() { // from class: com.facebook.appevents.UserDataStore$setUserDataAndHash$1
                @Override // java.lang.Runnable
                public final void run() {
                    if (CrashShieldHandler.isObjectCrashing(this)) {
                        return;
                    }
                    try {
                        if (CrashShieldHandler.isObjectCrashing(this)) {
                            return;
                        }
                        if (!UserDataStore.access$getInitialized$p(UserDataStore.INSTANCE).get()) {
                            Log.w(UserDataStore.access$getTAG$p(UserDataStore.INSTANCE), "initStore should have been called before calling setUserData");
                            UserDataStore.access$initAndWait(UserDataStore.INSTANCE);
                        }
                        UserDataStore.access$updateHashUserData(UserDataStore.INSTANCE, bundle);
                        UserDataStore.access$writeDataIntoCache(UserDataStore.INSTANCE, "com.facebook.appevents.UserDataStore.userData", Utility.mapToJsonStr(UserDataStore.access$getExternalHashedUserData$p(UserDataStore.INSTANCE)));
                        UserDataStore.access$writeDataIntoCache(UserDataStore.INSTANCE, "com.facebook.appevents.UserDataStore.internalUserData", Utility.mapToJsonStr(UserDataStore.access$getInternalHashedUserData$p(UserDataStore.INSTANCE)));
                    } catch (Throwable th) {
                        CrashShieldHandler.handleThrowable(th, this);
                    }
                }
            });
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, UserDataStore.class);
        }
    }

    @JvmStatic
    public static final void setUserDataAndHash(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        if (CrashShieldHandler.isObjectCrashing(UserDataStore.class)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                bundle.putString(EMAIL, str);
            }
            if (str2 != null) {
                bundle.putString(FIRST_NAME, str2);
            }
            if (str3 != null) {
                bundle.putString(LAST_NAME, str3);
            }
            if (str4 != null) {
                bundle.putString(PHONE, str4);
            }
            if (str5 != null) {
                bundle.putString(DATE_OF_BIRTH, str5);
            }
            if (str6 != null) {
                bundle.putString(GENDER, str6);
            }
            if (str7 != null) {
                bundle.putString(CITY, str7);
            }
            if (str8 != null) {
                bundle.putString(STATE, str8);
            }
            if (str9 != null) {
                bundle.putString(ZIP, str9);
            }
            if (str10 != null) {
                bundle.putString(COUNTRY, str10);
            }
            setUserDataAndHash(bundle);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, UserDataStore.class);
        }
    }

    @JvmStatic
    public static final void clear() {
        if (CrashShieldHandler.isObjectCrashing(UserDataStore.class)) {
            return;
        }
        try {
            InternalAppEventsLogger.Companion.getAnalyticsExecutor().execute(new Runnable() { // from class: com.facebook.appevents.UserDataStore$clear$1
                @Override // java.lang.Runnable
                public final void run() {
                    if (CrashShieldHandler.isObjectCrashing(this)) {
                        return;
                    }
                    try {
                        if (CrashShieldHandler.isObjectCrashing(this)) {
                            return;
                        }
                        if (!UserDataStore.access$getInitialized$p(UserDataStore.INSTANCE).get()) {
                            Log.w(UserDataStore.access$getTAG$p(UserDataStore.INSTANCE), "initStore should have been called before calling setUserData");
                            UserDataStore.access$initAndWait(UserDataStore.INSTANCE);
                        }
                        UserDataStore.access$getExternalHashedUserData$p(UserDataStore.INSTANCE).clear();
                        UserDataStore.access$getSharedPreferences$p(UserDataStore.INSTANCE).edit().putString("com.facebook.appevents.UserDataStore.userData", null).apply();
                    } catch (Throwable th) {
                        CrashShieldHandler.handleThrowable(th, this);
                    }
                }
            });
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, UserDataStore.class);
        }
    }

    @JvmStatic
    public static final String getHashedUserData$facebook_core_release() {
        if (CrashShieldHandler.isObjectCrashing(UserDataStore.class)) {
            return null;
        }
        try {
            if (!initialized.get()) {
                Log.w(TAG, "initStore should have been called before calling setUserID");
                INSTANCE.initAndWait();
            }
            return Utility.mapToJsonStr(externalHashedUserData);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, UserDataStore.class);
            return null;
        }
    }

    @JvmStatic
    public static final String getAllHashedUserData() {
        if (CrashShieldHandler.isObjectCrashing(UserDataStore.class)) {
            return null;
        }
        try {
            if (!initialized.get()) {
                INSTANCE.initAndWait();
            }
            HashMap hashMap = new HashMap();
            hashMap.putAll(externalHashedUserData);
            hashMap.putAll(INSTANCE.getEnabledInternalUserData());
            return Utility.mapToJsonStr(hashMap);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, UserDataStore.class);
            return null;
        }
    }

    private final Map<String, String> getEnabledInternalUserData() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            Set<String> enabledRuleNames = MetadataRule.Companion.getEnabledRuleNames();
            for (String str : internalHashedUserData.keySet()) {
                if (enabledRuleNames.contains(str)) {
                    hashMap.put(str, internalHashedUserData.get(str));
                }
            }
            return hashMap;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final synchronized void initAndWait() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        if (initialized.get()) {
            return;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext());
        Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "PreferenceManager.getDef….getApplicationContext())");
        sharedPreferences = defaultSharedPreferences;
        if (defaultSharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
        }
        String string = defaultSharedPreferences.getString(USER_DATA_KEY, "");
        if (string == null) {
            string = "";
        }
        Intrinsics.checkNotNullExpressionValue(string, "sharedPreferences.getStr…(USER_DATA_KEY, \"\") ?: \"\"");
        SharedPreferences sharedPreferences2 = sharedPreferences;
        if (sharedPreferences2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
        }
        String string2 = sharedPreferences2.getString(INTERNAL_USER_DATA_KEY, "");
        if (string2 == null) {
            string2 = "";
        }
        Intrinsics.checkNotNullExpressionValue(string2, "sharedPreferences.getStr…_USER_DATA_KEY, \"\") ?: \"\"");
        externalHashedUserData.putAll(Utility.jsonStrToMap(string));
        internalHashedUserData.putAll(Utility.jsonStrToMap(string2));
        initialized.set(true);
    }

    private final void updateHashUserData(Bundle bundle) {
        if (CrashShieldHandler.isObjectCrashing(this) || bundle == null) {
            return;
        }
        try {
            for (String key : bundle.keySet()) {
                Object obj = bundle.get(key);
                if (obj != null) {
                    Intrinsics.checkNotNullExpressionValue(obj, "ud[key] ?: continue");
                    String obj2 = obj.toString();
                    if (maybeSHA256Hashed(obj2)) {
                        ConcurrentHashMap<String, String> concurrentHashMap = externalHashedUserData;
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        String lowerCase = obj2.toLowerCase();
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                        concurrentHashMap.put(key, lowerCase);
                    } else {
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        String sha256hash = Utility.sha256hash(normalizeData(key, obj2));
                        if (sha256hash != null) {
                            externalHashedUserData.put(key, sha256hash);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x00cc A[Catch: all -> 0x0130, TryCatch #0 {all -> 0x0130, blocks: (B:89:0x0009, B:91:0x0016, B:92:0x001b, B:93:0x0023, B:95:0x0029, B:100:0x004f, B:107:0x0064, B:110:0x006a, B:111:0x006d, B:113:0x0087, B:116:0x0093, B:118:0x00a1, B:120:0x00ab, B:126:0x00ba, B:129:0x00cc, B:134:0x00d9, B:141:0x010a, B:135:0x00e2, B:137:0x00e6, B:139:0x00f7, B:140:0x0102, B:123:0x00b0, B:124:0x00b7, B:125:0x00b8, B:142:0x0117, B:143:0x0120), top: B:148:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00cb A[SYNTHETIC] */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void setInternalUd(java.util.Map<java.lang.String, java.lang.String> r12) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.UserDataStore.setInternalUd(java.util.Map):void");
    }

    private final boolean maybeSHA256Hashed(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            return new Regex("[A-Fa-f0-9]{64}").matches(str);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final String normalizeData(String str, String str2) {
        String str3;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            String str4 = str2;
            int length = str4.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.compare((int) str4.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            String obj = str4.subSequence(i, length + 1).toString();
            if (obj != null) {
                String lowerCase = obj.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                if (Intrinsics.areEqual(EMAIL, str)) {
                    if (Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                        return lowerCase;
                    }
                    Log.e(TAG, "Setting email failure: this is not a valid email address");
                    return "";
                } else if (Intrinsics.areEqual(PHONE, str)) {
                    return new Regex("[^0-9]").replace(lowerCase, "");
                } else if (Intrinsics.areEqual(GENDER, str)) {
                    if (!(lowerCase.length() > 0)) {
                        str3 = "";
                    } else if (lowerCase == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    } else {
                        str3 = lowerCase.substring(0, 1);
                        Intrinsics.checkNotNullExpressionValue(str3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                    if (!Intrinsics.areEqual(InneractiveMediationDefs.GENDER_FEMALE, str3) && !Intrinsics.areEqual(InneractiveMediationDefs.GENDER_MALE, str3)) {
                        Log.e(TAG, "Setting gender failure: the supported value for gender is f or m");
                        return "";
                    }
                    return str3;
                } else {
                    return lowerCase;
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }
}
