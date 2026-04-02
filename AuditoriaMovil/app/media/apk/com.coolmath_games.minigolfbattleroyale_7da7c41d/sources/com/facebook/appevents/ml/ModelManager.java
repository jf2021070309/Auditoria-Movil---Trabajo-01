package com.facebook.appevents.ml;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.integrity.IntegrityManager;
import com.facebook.appevents.internal.FileDownloadTask;
import com.facebook.appevents.ml.ModelManager;
import com.facebook.appevents.suggestedevents.SuggestedEventsManager;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.share.internal.ShareConstants;
import com.vungle.warren.model.VisionDataDBAdapter;
import com.vungle.warren.ui.JavascriptBridge;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ModelManager.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u000289B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001aH\u0007J\b\u0010\u001e\u001a\u00020\u001aH\u0002J\n\u0010\u001f\u001a\u0004\u0018\u00010\u001cH\u0002J\u0012\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#H\u0007J\u0010\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020&H\u0002J\u0014\u0010'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0002J\u0010\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020\u001cH\u0002J9\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010.2\u0006\u0010\"\u001a\u00020#2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020(0.2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00040.H\u0007¢\u0006\u0002\u00101J%\u00102\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010.2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020(H\u0002¢\u0006\u0002\u00106J%\u00107\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010.2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020(H\u0002¢\u0006\u0002\u00106R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u001c\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/facebook/appevents/ml/ModelManager;", "", "()V", "ASSET_URI_KEY", "", "CACHE_KEY_MODELS", "CACHE_KEY_REQUEST_TIMESTAMP", "MODEL_ASSERT_STORE", "MODEL_REQUEST_INTERVAL_MILLISECONDS", "", "MTML_INTEGRITY_DETECT_PREDICTION", "", "MTML_SUGGESTED_EVENTS_PREDICTION", "MTML_USE_CASE", "RULES_URI_KEY", "SDK_MODEL_ASSET", "THRESHOLD_KEY", "USE_CASE_KEY", "VERSION_ID_KEY", "isLocaleEnglish", "", "()Z", "taskHandlers", "", "Lcom/facebook/appevents/ml/ModelManager$TaskHandler;", "addModels", "", ModelManager.CACHE_KEY_MODELS, "Lorg/json/JSONObject;", "enable", "enableMTML", "fetchModels", "getRuleFile", "Ljava/io/File;", "task", "Lcom/facebook/appevents/ml/ModelManager$Task;", "isValidTimestamp", VisionDataDBAdapter.VisionDataColumns.COLUMN_TIMESTAMP, "", "parseJsonArray", "", "jsonArray", "Lorg/json/JSONArray;", "parseRawJsonObject", "jsonObject", "predict", "", "denses", "texts", "(Lcom/facebook/appevents/ml/ModelManager$Task;[[F[Ljava/lang/String;)[Ljava/lang/String;", "processIntegrityDetectionResult", "res", "Lcom/facebook/appevents/ml/MTensor;", ModelManager.THRESHOLD_KEY, "(Lcom/facebook/appevents/ml/MTensor;[F)[Ljava/lang/String;", "processSuggestedEventResult", "Task", "TaskHandler", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class ModelManager {
    private static final String ASSET_URI_KEY = "asset_uri";
    private static final String CACHE_KEY_MODELS = "models";
    private static final String CACHE_KEY_REQUEST_TIMESTAMP = "model_request_timestamp";
    private static final String MODEL_ASSERT_STORE = "com.facebook.internal.MODEL_STORE";
    private static final int MODEL_REQUEST_INTERVAL_MILLISECONDS = 259200000;
    private static final String MTML_USE_CASE = "MTML";
    private static final String RULES_URI_KEY = "rules_uri";
    private static final String SDK_MODEL_ASSET = "%s/model_asset";
    private static final String THRESHOLD_KEY = "thresholds";
    private static final String USE_CASE_KEY = "use_case";
    private static final String VERSION_ID_KEY = "version_id";
    public static final ModelManager INSTANCE = new ModelManager();
    private static final Map<String, TaskHandler> taskHandlers = new ConcurrentHashMap();
    private static final List<String> MTML_SUGGESTED_EVENTS_PREDICTION = CollectionsKt.listOf((Object[]) new String[]{"other", AppEventsConstants.EVENT_NAME_COMPLETED_REGISTRATION, AppEventsConstants.EVENT_NAME_ADDED_TO_CART, AppEventsConstants.EVENT_NAME_PURCHASED, AppEventsConstants.EVENT_NAME_INITIATED_CHECKOUT});
    private static final List<String> MTML_INTEGRITY_DETECT_PREDICTION = CollectionsKt.listOf((Object[]) new String[]{IntegrityManager.INTEGRITY_TYPE_NONE, IntegrityManager.INTEGRITY_TYPE_ADDRESS, IntegrityManager.INTEGRITY_TYPE_HEALTH});

    @Metadata(k = 3, mv = {1, 5, 1})
    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Task.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Task.MTML_APP_EVENT_PREDICTION.ordinal()] = 1;
            $EnumSwitchMapping$0[Task.MTML_INTEGRITY_DETECT.ordinal()] = 2;
        }
    }

    private ModelManager() {
    }

    public static final /* synthetic */ void access$addModels(ModelManager modelManager, JSONObject jSONObject) {
        if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
            return;
        }
        try {
            modelManager.addModels(jSONObject);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ModelManager.class);
        }
    }

    public static final /* synthetic */ void access$enableMTML(ModelManager modelManager) {
        if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
            return;
        }
        try {
            modelManager.enableMTML();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ModelManager.class);
        }
    }

    public static final /* synthetic */ JSONObject access$fetchModels(ModelManager modelManager) {
        if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
            return null;
        }
        try {
            return modelManager.fetchModels();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ModelManager.class);
            return null;
        }
    }

    public static final /* synthetic */ boolean access$isValidTimestamp(ModelManager modelManager, long j) {
        if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
            return false;
        }
        try {
            return modelManager.isValidTimestamp(j);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ModelManager.class);
            return false;
        }
    }

    public static final /* synthetic */ float[] access$parseJsonArray(ModelManager modelManager, JSONArray jSONArray) {
        if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
            return null;
        }
        try {
            return modelManager.parseJsonArray(jSONArray);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ModelManager.class);
            return null;
        }
    }

    /* compiled from: ModelManager.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/appevents/ml/ModelManager$Task;", "", "(Ljava/lang/String;I)V", "toKey", "", "toUseCase", "MTML_INTEGRITY_DETECT", "MTML_APP_EVENT_PREDICTION", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes.dex */
    public enum Task {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        @Metadata(k = 3, mv = {1, 5, 1})
        /* loaded from: classes.dex */
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[Task.values().length];
                $EnumSwitchMapping$0 = iArr;
                iArr[Task.MTML_INTEGRITY_DETECT.ordinal()] = 1;
                $EnumSwitchMapping$0[Task.MTML_APP_EVENT_PREDICTION.ordinal()] = 2;
                int[] iArr2 = new int[Task.values().length];
                $EnumSwitchMapping$1 = iArr2;
                iArr2[Task.MTML_INTEGRITY_DETECT.ordinal()] = 1;
                $EnumSwitchMapping$1[Task.MTML_APP_EVENT_PREDICTION.ordinal()] = 2;
            }
        }

        public final String toKey() {
            int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return "app_event_pred";
                }
                throw new NoWhenBranchMatchedException();
            }
            return "integrity_detect";
        }

        public final String toUseCase() {
            int i = WhenMappings.$EnumSwitchMapping$1[ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return "MTML_APP_EVENT_PRED";
                }
                throw new NoWhenBranchMatchedException();
            }
            return "MTML_INTEGRITY_DETECT";
        }
    }

    @JvmStatic
    public static final void enable() {
        if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
            return;
        }
        try {
            Utility.runOnNonUiThread(new Runnable() { // from class: com.facebook.appevents.ml.ModelManager$enable$1
                /* JADX WARN: Removed duplicated region for block: B:25:0x0060 A[Catch: all -> 0x0083, Exception -> 0x0087, TryCatch #3 {Exception -> 0x0087, all -> 0x0083, blocks: (B:8:0x0012, B:10:0x0024, B:15:0x0031, B:17:0x003c, B:19:0x004a, B:21:0x0050, B:26:0x0077, B:23:0x0058, B:25:0x0060, B:16:0x0037), top: B:37:0x0012, outer: #1 }] */
                /* JADX WARN: Removed duplicated region for block: B:28:0x0082 A[RETURN] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        r7 = this;
                        java.lang.String r0 = "model_request_timestamp"
                        java.lang.String r1 = "models"
                        boolean r2 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(r7)
                        if (r2 == 0) goto Lb
                        return
                    Lb:
                        boolean r2 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(r7)     // Catch: java.lang.Throwable -> L88
                        if (r2 == 0) goto L12
                        return
                    L12:
                        android.content.Context r2 = com.facebook.FacebookSdk.getApplicationContext()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L87
                        java.lang.String r3 = "com.facebook.internal.MODEL_STORE"
                        r4 = 0
                        android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r4)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L87
                        r3 = 0
                        java.lang.String r3 = r2.getString(r1, r3)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L87
                        if (r3 == 0) goto L37
                        r5 = r3
                        java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L87
                        int r5 = r5.length()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L87
                        if (r5 != 0) goto L2e
                        r4 = 1
                    L2e:
                        if (r4 == 0) goto L31
                        goto L37
                    L31:
                        org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L87
                        r4.<init>(r3)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L87
                        goto L3c
                    L37:
                        org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L87
                        r4.<init>()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L87
                    L3c:
                        r5 = 0
                        long r5 = r2.getLong(r0, r5)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L87
                        com.facebook.internal.FeatureManager$Feature r3 = com.facebook.internal.FeatureManager.Feature.ModelRequest     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L87
                        boolean r3 = com.facebook.internal.FeatureManager.isEnabled(r3)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L87
                        if (r3 == 0) goto L58
                        int r3 = r4.length()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L87
                        if (r3 == 0) goto L58
                        com.facebook.appevents.ml.ModelManager r3 = com.facebook.appevents.ml.ModelManager.INSTANCE     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L87
                        boolean r3 = com.facebook.appevents.ml.ModelManager.access$isValidTimestamp(r3, r5)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L87
                        if (r3 != 0) goto L77
                    L58:
                        com.facebook.appevents.ml.ModelManager r3 = com.facebook.appevents.ml.ModelManager.INSTANCE     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L87
                        org.json.JSONObject r4 = com.facebook.appevents.ml.ModelManager.access$fetchModels(r3)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L87
                        if (r4 == 0) goto L82
                        android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L87
                        java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L87
                        android.content.SharedPreferences$Editor r1 = r2.putString(r1, r3)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L87
                        long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L87
                        android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r2)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L87
                        r0.apply()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L87
                    L77:
                        com.facebook.appevents.ml.ModelManager r0 = com.facebook.appevents.ml.ModelManager.INSTANCE     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L87
                        com.facebook.appevents.ml.ModelManager.access$addModels(r0, r4)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L87
                        com.facebook.appevents.ml.ModelManager r0 = com.facebook.appevents.ml.ModelManager.INSTANCE     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L87
                        com.facebook.appevents.ml.ModelManager.access$enableMTML(r0)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L87
                        goto L87
                    L82:
                        return
                    L83:
                        r0 = move-exception
                        com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r0, r7)     // Catch: java.lang.Throwable -> L88
                    L87:
                        return
                    L88:
                        r0 = move-exception
                        com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r0, r7)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.ml.ModelManager$enable$1.run():void");
                }
            });
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ModelManager.class);
        }
    }

    private final boolean isValidTimestamp(long j) {
        if (CrashShieldHandler.isObjectCrashing(this) || j == 0) {
            return false;
        }
        try {
            return System.currentTimeMillis() - j < ((long) MODEL_REQUEST_INTERVAL_MILLISECONDS);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final void addModels(JSONObject jSONObject) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                try {
                    TaskHandler build = TaskHandler.Companion.build(jSONObject.getJSONObject(keys.next()));
                    if (build != null) {
                        taskHandlers.put(build.getUseCase(), build);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final JSONObject parseRawJsonObject(JSONObject jSONObject) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put(VERSION_ID_KEY, jSONObject3.getString(VERSION_ID_KEY));
                    jSONObject4.put(USE_CASE_KEY, jSONObject3.getString(USE_CASE_KEY));
                    jSONObject4.put(THRESHOLD_KEY, jSONObject3.getJSONArray(THRESHOLD_KEY));
                    jSONObject4.put(ASSET_URI_KEY, jSONObject3.getString(ASSET_URI_KEY));
                    if (jSONObject3.has(RULES_URI_KEY)) {
                        jSONObject4.put(RULES_URI_KEY, jSONObject3.getString(RULES_URI_KEY));
                    }
                    jSONObject2.put(jSONObject3.getString(USE_CASE_KEY), jSONObject4);
                }
                return jSONObject2;
            } catch (JSONException unused) {
                return new JSONObject();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final JSONObject fetchModels() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            String[] strArr = {USE_CASE_KEY, VERSION_ID_KEY, ASSET_URI_KEY, RULES_URI_KEY, THRESHOLD_KEY};
            Bundle bundle = new Bundle();
            bundle.putString(GraphRequest.FIELDS_PARAM, TextUtils.join(",", strArr));
            GraphRequest.Companion companion = GraphRequest.Companion;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(SDK_MODEL_ASSET, Arrays.copyOf(new Object[]{FacebookSdk.getApplicationId()}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            GraphRequest newGraphPathRequest = companion.newGraphPathRequest(null, format, null);
            newGraphPathRequest.setSkipClientToken(true);
            newGraphPathRequest.setParameters(bundle);
            JSONObject jSONObject = newGraphPathRequest.executeAndWait().getJSONObject();
            if (jSONObject != null) {
                return parseRawJsonObject(jSONObject);
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final void enableMTML() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            String str = null;
            int i = 0;
            for (Map.Entry<String, TaskHandler> entry : taskHandlers.entrySet()) {
                String key = entry.getKey();
                TaskHandler value = entry.getValue();
                if (Intrinsics.areEqual(key, Task.MTML_APP_EVENT_PREDICTION.toUseCase())) {
                    str = value.getAssetUri();
                    i = Math.max(i, value.getVersionId());
                    if (FeatureManager.isEnabled(FeatureManager.Feature.SuggestedEvents) && isLocaleEnglish()) {
                        arrayList.add(value.setOnPostExecute(new Runnable() { // from class: com.facebook.appevents.ml.ModelManager$enableMTML$1
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (CrashShieldHandler.isObjectCrashing(this)) {
                                    return;
                                }
                                try {
                                    if (CrashShieldHandler.isObjectCrashing(this)) {
                                        return;
                                    }
                                    SuggestedEventsManager.enable();
                                } catch (Throwable th) {
                                    CrashShieldHandler.handleThrowable(th, this);
                                }
                            }
                        }));
                    }
                }
                if (Intrinsics.areEqual(key, Task.MTML_INTEGRITY_DETECT.toUseCase())) {
                    String assetUri = value.getAssetUri();
                    int max = Math.max(i, value.getVersionId());
                    if (FeatureManager.isEnabled(FeatureManager.Feature.IntelligentIntegrity)) {
                        arrayList.add(value.setOnPostExecute(new Runnable() { // from class: com.facebook.appevents.ml.ModelManager$enableMTML$2
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (CrashShieldHandler.isObjectCrashing(this)) {
                                    return;
                                }
                                try {
                                    if (CrashShieldHandler.isObjectCrashing(this)) {
                                        return;
                                    }
                                    IntegrityManager.enable();
                                } catch (Throwable th) {
                                    CrashShieldHandler.handleThrowable(th, this);
                                }
                            }
                        }));
                    }
                    str = assetUri;
                    i = max;
                }
            }
            if (str == null || i <= 0 || arrayList.isEmpty()) {
                return;
            }
            TaskHandler.Companion.execute(new TaskHandler(MTML_USE_CASE, str, null, i, null), arrayList);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final boolean isLocaleEnglish() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            Locale resourceLocale = Utility.getResourceLocale();
            if (resourceLocale != null) {
                String language = resourceLocale.getLanguage();
                Intrinsics.checkNotNullExpressionValue(language, "locale.language");
                if (!StringsKt.contains$default((CharSequence) language, (CharSequence) "en", false, 2, (Object) null)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final float[] parseJsonArray(JSONArray jSONArray) {
        if (CrashShieldHandler.isObjectCrashing(this) || jSONArray == null) {
            return null;
        }
        try {
            float[] fArr = new float[jSONArray.length()];
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    String string = jSONArray.getString(i);
                    Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                    fArr[i] = Float.parseFloat(string);
                } catch (JSONException unused) {
                }
            }
            return fArr;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    @JvmStatic
    public static final File getRuleFile(Task task) {
        if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(task, "task");
            TaskHandler taskHandler = taskHandlers.get(task.toUseCase());
            if (taskHandler != null) {
                return taskHandler.getRuleFile();
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ModelManager.class);
            return null;
        }
    }

    @JvmStatic
    public static final String[] predict(Task task, float[][] denses, String[] texts) {
        Model model;
        if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(task, "task");
            Intrinsics.checkNotNullParameter(denses, "denses");
            Intrinsics.checkNotNullParameter(texts, "texts");
            TaskHandler taskHandler = taskHandlers.get(task.toUseCase());
            if (taskHandler == null || (model = taskHandler.getModel()) == null) {
                return null;
            }
            float[] thresholds = taskHandler.getThresholds();
            int length = texts.length;
            int length2 = denses[0].length;
            MTensor mTensor = new MTensor(new int[]{length, length2});
            for (int i = 0; i < length; i++) {
                System.arraycopy(denses[i], 0, mTensor.getData(), i * length2, length2);
            }
            MTensor predictOnMTML = model.predictOnMTML(mTensor, texts, task.toKey());
            if (predictOnMTML != null && thresholds != null) {
                if (!(predictOnMTML.getData().length == 0)) {
                    if (!(thresholds.length == 0)) {
                        int i2 = WhenMappings.$EnumSwitchMapping$0[task.ordinal()];
                        if (i2 != 1) {
                            if (i2 == 2) {
                                return INSTANCE.processIntegrityDetectionResult(predictOnMTML, thresholds);
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        return INSTANCE.processSuggestedEventResult(predictOnMTML, thresholds);
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ModelManager.class);
            return null;
        }
    }

    private final String[] processSuggestedEventResult(MTensor mTensor, float[] fArr) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            int shape = mTensor.getShape(0);
            int shape2 = mTensor.getShape(1);
            float[] data = mTensor.getData();
            if (shape2 != fArr.length) {
                return null;
            }
            IntRange until = RangesKt.until(0, shape);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
            Iterator<Integer> it = until.iterator();
            while (it.hasNext()) {
                int nextInt = ((IntIterator) it).nextInt();
                String str = "other";
                int length = fArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    if (data[(nextInt * shape2) + i2] >= fArr[i]) {
                        str = MTML_SUGGESTED_EVENTS_PREDICTION.get(i2);
                    }
                    i++;
                    i2 = i3;
                }
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final String[] processIntegrityDetectionResult(MTensor mTensor, float[] fArr) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            int shape = mTensor.getShape(0);
            int shape2 = mTensor.getShape(1);
            float[] data = mTensor.getData();
            if (shape2 != fArr.length) {
                return null;
            }
            IntRange until = RangesKt.until(0, shape);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
            Iterator<Integer> it = until.iterator();
            while (it.hasNext()) {
                int nextInt = ((IntIterator) it).nextInt();
                String str = IntegrityManager.INTEGRITY_TYPE_NONE;
                int length = fArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    if (data[(nextInt * shape2) + i2] >= fArr[i]) {
                        str = MTML_INTEGRITY_DETECT_PREDICTION.get(i2);
                    }
                    i++;
                    i2 = i3;
                }
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ModelManager.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0002\u0018\u0000 *2\u00020\u0001:\u0001*B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0010\u0010)\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\f\"\u0004\b$\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lcom/facebook/appevents/ml/ModelManager$TaskHandler;", "", "useCase", "", "assetUri", "ruleUri", "versionId", "", ModelManager.THRESHOLD_KEY, "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I[F)V", "getAssetUri", "()Ljava/lang/String;", "setAssetUri", "(Ljava/lang/String;)V", "model", "Lcom/facebook/appevents/ml/Model;", "getModel", "()Lcom/facebook/appevents/ml/Model;", "setModel", "(Lcom/facebook/appevents/ml/Model;)V", "onPostExecute", "Ljava/lang/Runnable;", "ruleFile", "Ljava/io/File;", "getRuleFile", "()Ljava/io/File;", "setRuleFile", "(Ljava/io/File;)V", "getRuleUri", "setRuleUri", "getThresholds", "()[F", "setThresholds", "([F)V", "getUseCase", "setUseCase", "getVersionId", "()I", "setVersionId", "(I)V", "setOnPostExecute", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes.dex */
    public static final class TaskHandler {
        public static final Companion Companion = new Companion(null);
        private String assetUri;
        private Model model;
        private Runnable onPostExecute;
        private File ruleFile;
        private String ruleUri;
        private float[] thresholds;
        private String useCase;
        private int versionId;

        public TaskHandler(String useCase, String assetUri, String str, int i, float[] fArr) {
            Intrinsics.checkNotNullParameter(useCase, "useCase");
            Intrinsics.checkNotNullParameter(assetUri, "assetUri");
            this.useCase = useCase;
            this.assetUri = assetUri;
            this.ruleUri = str;
            this.versionId = i;
            this.thresholds = fArr;
        }

        public final String getUseCase() {
            return this.useCase;
        }

        public final void setUseCase(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.useCase = str;
        }

        public final String getAssetUri() {
            return this.assetUri;
        }

        public final void setAssetUri(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.assetUri = str;
        }

        public final String getRuleUri() {
            return this.ruleUri;
        }

        public final void setRuleUri(String str) {
            this.ruleUri = str;
        }

        public final int getVersionId() {
            return this.versionId;
        }

        public final void setVersionId(int i) {
            this.versionId = i;
        }

        public final float[] getThresholds() {
            return this.thresholds;
        }

        public final void setThresholds(float[] fArr) {
            this.thresholds = fArr;
        }

        public final File getRuleFile() {
            return this.ruleFile;
        }

        public final void setRuleFile(File file) {
            this.ruleFile = file;
        }

        public final Model getModel() {
            return this.model;
        }

        public final void setModel(Model model) {
            this.model = model;
        }

        public final TaskHandler setOnPostExecute(Runnable runnable) {
            this.onPostExecute = runnable;
            return this;
        }

        /* compiled from: ModelManager.kt */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\"\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0004J\u001c\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016¨\u0006\u0017"}, d2 = {"Lcom/facebook/appevents/ml/ModelManager$TaskHandler$Companion;", "", "()V", "build", "Lcom/facebook/appevents/ml/ModelManager$TaskHandler;", "json", "Lorg/json/JSONObject;", "deleteOldFiles", "", "useCase", "", "versionId", "", JavascriptBridge.MraidHandler.DOWNLOAD_ACTION, ShareConstants.MEDIA_URI, "name", "onComplete", "Lcom/facebook/appevents/internal/FileDownloadTask$Callback;", "execute", "handler", "master", "slaves", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final TaskHandler build(JSONObject jSONObject) {
                String useCase;
                String assetUri;
                String optString;
                int i;
                float[] access$parseJsonArray;
                if (jSONObject != null) {
                    try {
                        useCase = jSONObject.getString(ModelManager.USE_CASE_KEY);
                        assetUri = jSONObject.getString(ModelManager.ASSET_URI_KEY);
                        optString = jSONObject.optString(ModelManager.RULES_URI_KEY, null);
                        i = jSONObject.getInt(ModelManager.VERSION_ID_KEY);
                        access$parseJsonArray = ModelManager.access$parseJsonArray(ModelManager.INSTANCE, jSONObject.getJSONArray(ModelManager.THRESHOLD_KEY));
                        Intrinsics.checkNotNullExpressionValue(useCase, "useCase");
                        Intrinsics.checkNotNullExpressionValue(assetUri, "assetUri");
                    } catch (Exception unused) {
                        return null;
                    }
                }
                return new TaskHandler(useCase, assetUri, optString, i, access$parseJsonArray);
            }

            public final void execute(TaskHandler handler) {
                Intrinsics.checkNotNullParameter(handler, "handler");
                execute(handler, CollectionsKt.listOf(handler));
            }

            public final void execute(TaskHandler master, final List<TaskHandler> slaves) {
                Intrinsics.checkNotNullParameter(master, "master");
                Intrinsics.checkNotNullParameter(slaves, "slaves");
                Companion companion = this;
                companion.deleteOldFiles(master.getUseCase(), master.getVersionId());
                companion.download(master.getAssetUri(), master.getUseCase() + "_" + master.getVersionId(), new FileDownloadTask.Callback() { // from class: com.facebook.appevents.ml.ModelManager$TaskHandler$Companion$execute$1
                    @Override // com.facebook.appevents.internal.FileDownloadTask.Callback
                    public final void onComplete(File file) {
                        Intrinsics.checkNotNullParameter(file, "file");
                        final Model build = Model.Companion.build(file);
                        if (build != null) {
                            for (final ModelManager.TaskHandler taskHandler : slaves) {
                                ModelManager.TaskHandler.Companion.download(taskHandler.getRuleUri(), taskHandler.getUseCase() + "_" + taskHandler.getVersionId() + "_rule", new FileDownloadTask.Callback() { // from class: com.facebook.appevents.ml.ModelManager$TaskHandler$Companion$execute$1.1
                                    @Override // com.facebook.appevents.internal.FileDownloadTask.Callback
                                    public final void onComplete(File file2) {
                                        Runnable runnable;
                                        Intrinsics.checkNotNullParameter(file2, "file");
                                        ModelManager.TaskHandler.this.setModel(build);
                                        ModelManager.TaskHandler.this.setRuleFile(file2);
                                        runnable = ModelManager.TaskHandler.this.onPostExecute;
                                        if (runnable != null) {
                                            runnable.run();
                                        }
                                    }
                                });
                            }
                        }
                    }
                });
            }

            private final void deleteOldFiles(String str, int i) {
                File[] listFiles;
                File mlDir = Utils.getMlDir();
                if (mlDir == null || (listFiles = mlDir.listFiles()) == null) {
                    return;
                }
                if (listFiles.length == 0) {
                    return;
                }
                String str2 = str + "_" + i;
                for (File f : listFiles) {
                    Intrinsics.checkNotNullExpressionValue(f, "f");
                    String name = f.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "name");
                    if (StringsKt.startsWith$default(name, str, false, 2, (Object) null) && !StringsKt.startsWith$default(name, str2, false, 2, (Object) null)) {
                        f.delete();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void download(String str, String str2, FileDownloadTask.Callback callback) {
                File file = new File(Utils.getMlDir(), str2);
                if (str == null || file.exists()) {
                    callback.onComplete(file);
                } else {
                    new FileDownloadTask(str, file, callback).execute(new String[0]);
                }
            }
        }
    }
}
