package com.braze.ui.actions.brazeactions;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.if0.c;
import com.amazon.aps.iva.kb0.j;
import com.amazon.aps.iva.q.c0;
import com.amazon.aps.iva.yb0.e;
import com.braze.enums.Channel;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.ui.actions.brazeactions.steps.AddToCustomAttributeArrayStep;
import com.braze.ui.actions.brazeactions.steps.AddToSubscriptionGroupStep;
import com.braze.ui.actions.brazeactions.steps.ContainerStep;
import com.braze.ui.actions.brazeactions.steps.IBrazeActionStep;
import com.braze.ui.actions.brazeactions.steps.LogCustomEventStep;
import com.braze.ui.actions.brazeactions.steps.NoOpStep;
import com.braze.ui.actions.brazeactions.steps.OpenLinkExternallyStep;
import com.braze.ui.actions.brazeactions.steps.OpenLinkInWebViewStep;
import com.braze.ui.actions.brazeactions.steps.RemoveFromCustomAttributeArrayStep;
import com.braze.ui.actions.brazeactions.steps.RequestPushPermissionStep;
import com.braze.ui.actions.brazeactions.steps.SetCustomUserAttributeStep;
import com.braze.ui.actions.brazeactions.steps.SetEmailSubscriptionStep;
import com.braze.ui.actions.brazeactions.steps.SetPushNotificationSubscriptionStep;
import com.braze.ui.actions.brazeactions.steps.StepData;
import com.google.common.primitives.UnsignedBytes;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: BrazeActionParser.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001!B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\f\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u0002J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0017*\u00020\u0002H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lcom/braze/ui/actions/brazeactions/BrazeActionParser;", "", "Landroid/net/Uri;", "", "isBrazeActionUri", "Landroid/content/Context;", "context", "uri", "Lcom/braze/enums/Channel;", "channel", "Lcom/amazon/aps/iva/kb0/q;", "execute", "Lcom/braze/ui/actions/brazeactions/steps/StepData;", "data", "parse$android_sdk_ui_release", "(Landroid/content/Context;Lcom/braze/ui/actions/brazeactions/steps/StepData;)V", "parse", "", "action", "Lcom/amazon/aps/iva/if0/c;", "parseEncodedActionToJson$android_sdk_ui_release", "(Ljava/lang/String;)Lcom/amazon/aps/iva/if0/c;", "parseEncodedActionToJson", "Lcom/amazon/aps/iva/kb0/j;", "getBrazeActionVersionAndJson$android_sdk_ui_release", "(Landroid/net/Uri;)Lcom/amazon/aps/iva/kb0/j;", "getBrazeActionVersionAndJson", "Lcom/braze/ui/actions/brazeactions/BrazeActionParser$ActionType;", "getActionType$android_sdk_ui_release", "(Lcom/braze/ui/actions/brazeactions/steps/StepData;)Lcom/braze/ui/actions/brazeactions/BrazeActionParser$ActionType;", "getActionType", "<init>", "()V", "ActionType", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BrazeActionParser {
    public static final BrazeActionParser INSTANCE = new BrazeActionParser();

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum ADD_TO_SUBSCRIPTION_GROUP uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: BrazeActionParser.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0080\u0001\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0018B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0019"}, d2 = {"Lcom/braze/ui/actions/brazeactions/BrazeActionParser$ActionType;", "", "key", "", "impl", "Lcom/braze/ui/actions/brazeactions/steps/IBrazeActionStep;", "(Ljava/lang/String;ILjava/lang/String;Lcom/braze/ui/actions/brazeactions/steps/IBrazeActionStep;)V", "getImpl", "()Lcom/braze/ui/actions/brazeactions/steps/IBrazeActionStep;", "getKey", "()Ljava/lang/String;", "CONTAINER", "LOG_CUSTOM_EVENT", "SET_CUSTOM_ATTRIBUTE", "REQUEST_PUSH_PERMISSION", "ADD_TO_SUBSCRIPTION_GROUP", "REMOVE_FROM_SUBSCRIPTION_GROUP", "ADD_TO_CUSTOM_ATTRIBUTE_ARRAY", "REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY", "SET_EMAIL_SUBSCRIPTION", "SET_PUSH_NOTIFICATION_SUBSCRIPTION", "OPEN_LINK_IN_WEBVIEW", "OPEN_LINK_EXTERNALLY", "INVALID", "Companion", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class ActionType {
        private static final /* synthetic */ ActionType[] $VALUES;
        public static final ActionType ADD_TO_CUSTOM_ATTRIBUTE_ARRAY;
        public static final ActionType ADD_TO_SUBSCRIPTION_GROUP;
        public static final Companion Companion;
        public static final ActionType INVALID;
        public static final ActionType OPEN_LINK_EXTERNALLY;
        public static final ActionType OPEN_LINK_IN_WEBVIEW;
        public static final ActionType REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY;
        public static final ActionType REMOVE_FROM_SUBSCRIPTION_GROUP;
        public static final ActionType SET_EMAIL_SUBSCRIPTION;
        public static final ActionType SET_PUSH_NOTIFICATION_SUBSCRIPTION;
        private static final Map<String, ActionType> map;
        private final IBrazeActionStep impl;
        private final String key;
        public static final ActionType CONTAINER = new ActionType("CONTAINER", 0, "container", ContainerStep.INSTANCE);
        public static final ActionType LOG_CUSTOM_EVENT = new ActionType("LOG_CUSTOM_EVENT", 1, "logCustomEvent", LogCustomEventStep.INSTANCE);
        public static final ActionType SET_CUSTOM_ATTRIBUTE = new ActionType("SET_CUSTOM_ATTRIBUTE", 2, "setCustomUserAttribute", SetCustomUserAttributeStep.INSTANCE);
        public static final ActionType REQUEST_PUSH_PERMISSION = new ActionType("REQUEST_PUSH_PERMISSION", 3, "requestPushPermission", RequestPushPermissionStep.INSTANCE);

        /* compiled from: BrazeActionParser.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/braze/ui/actions/brazeactions/BrazeActionParser$ActionType$Companion;", "", "()V", "map", "", "", "Lcom/braze/ui/actions/brazeactions/BrazeActionParser$ActionType;", "fromValue", "value", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(e eVar) {
                this();
            }

            public final ActionType fromValue(String str) {
                Map map = ActionType.map;
                if (str == null) {
                    str = "";
                }
                Object obj = map.get(str);
                if (obj == null) {
                    obj = ActionType.INVALID;
                }
                return (ActionType) obj;
            }
        }

        private static final /* synthetic */ ActionType[] $values() {
            return new ActionType[]{CONTAINER, LOG_CUSTOM_EVENT, SET_CUSTOM_ATTRIBUTE, REQUEST_PUSH_PERMISSION, ADD_TO_SUBSCRIPTION_GROUP, REMOVE_FROM_SUBSCRIPTION_GROUP, ADD_TO_CUSTOM_ATTRIBUTE_ARRAY, REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY, SET_EMAIL_SUBSCRIPTION, SET_PUSH_NOTIFICATION_SUBSCRIPTION, OPEN_LINK_IN_WEBVIEW, OPEN_LINK_EXTERNALLY, INVALID};
        }

        static {
            AddToSubscriptionGroupStep addToSubscriptionGroupStep = AddToSubscriptionGroupStep.INSTANCE;
            ADD_TO_SUBSCRIPTION_GROUP = new ActionType("ADD_TO_SUBSCRIPTION_GROUP", 4, "addToSubscriptionGroup", addToSubscriptionGroupStep);
            REMOVE_FROM_SUBSCRIPTION_GROUP = new ActionType("REMOVE_FROM_SUBSCRIPTION_GROUP", 5, "removeFromSubscriptionGroup", addToSubscriptionGroupStep);
            ADD_TO_CUSTOM_ATTRIBUTE_ARRAY = new ActionType("ADD_TO_CUSTOM_ATTRIBUTE_ARRAY", 6, "addToCustomAttributeArray", AddToCustomAttributeArrayStep.INSTANCE);
            REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY = new ActionType("REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY", 7, "removeFromCustomAttributeArray", RemoveFromCustomAttributeArrayStep.INSTANCE);
            SET_EMAIL_SUBSCRIPTION = new ActionType("SET_EMAIL_SUBSCRIPTION", 8, "setEmailNotificationSubscriptionType", SetEmailSubscriptionStep.INSTANCE);
            SET_PUSH_NOTIFICATION_SUBSCRIPTION = new ActionType("SET_PUSH_NOTIFICATION_SUBSCRIPTION", 9, "setPushNotificationSubscriptionType", SetPushNotificationSubscriptionStep.INSTANCE);
            OPEN_LINK_IN_WEBVIEW = new ActionType("OPEN_LINK_IN_WEBVIEW", 10, "openLinkInWebview", OpenLinkInWebViewStep.INSTANCE);
            OPEN_LINK_EXTERNALLY = new ActionType("OPEN_LINK_EXTERNALLY", 11, "openLink", OpenLinkExternallyStep.INSTANCE);
            INVALID = new ActionType("INVALID", 12, "", NoOpStep.INSTANCE);
            $VALUES = $values();
            Companion = new Companion(null);
            ActionType[] values = values();
            int w = k.w(values.length);
            LinkedHashMap linkedHashMap = new LinkedHashMap(w < 16 ? 16 : w);
            for (ActionType actionType : values) {
                linkedHashMap.put(actionType.key, actionType);
            }
            map = linkedHashMap;
        }

        private ActionType(String str, int i, String str2, IBrazeActionStep iBrazeActionStep) {
            this.key = str2;
            this.impl = iBrazeActionStep;
        }

        public static final ActionType fromValue(String str) {
            return Companion.fromValue(str);
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) $VALUES.clone();
        }

        public final IBrazeActionStep getImpl() {
            return this.impl;
        }

        public final String getKey() {
            return this.key;
        }
    }

    private BrazeActionParser() {
    }

    public final void execute(Context context, Uri uri, Channel channel) {
        j brazeActionVersionAndJson$android_sdk_ui_release;
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(uri, "uri");
        com.amazon.aps.iva.yb0.j.f(channel, "channel");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.V, (Throwable) null, new BrazeActionParser$execute$1(channel, uri), 2, (Object) null);
        try {
            brazeActionVersionAndJson$android_sdk_ui_release = getBrazeActionVersionAndJson$android_sdk_ui_release(uri);
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, new BrazeActionParser$execute$4(uri));
        }
        if (brazeActionVersionAndJson$android_sdk_ui_release == null) {
            BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.I, (Throwable) null, BrazeActionParser$execute$2.INSTANCE, 2, (Object) null);
            return;
        }
        String str = (String) brazeActionVersionAndJson$android_sdk_ui_release.b;
        c cVar = (c) brazeActionVersionAndJson$android_sdk_ui_release.c;
        if (!com.amazon.aps.iva.yb0.j.a(str, "v1")) {
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new BrazeActionParser$execute$3(str), 3, (Object) null);
            return;
        }
        parse$android_sdk_ui_release(context, new StepData(cVar, channel));
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new BrazeActionParser$execute$5(uri), 2, (Object) null);
    }

    public final /* synthetic */ ActionType getActionType$android_sdk_ui_release(StepData stepData) {
        com.amazon.aps.iva.yb0.j.f(stepData, "data");
        ActionType fromValue = ActionType.Companion.fromValue(JsonUtils.getOptionalString(stepData.getSrcJson(), "type"));
        if (!fromValue.getImpl().isValid(stepData)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new BrazeActionParser$getActionType$1(fromValue, stepData), 3, (Object) null);
            return ActionType.INVALID;
        }
        return fromValue;
    }

    public final /* synthetic */ j getBrazeActionVersionAndJson$android_sdk_ui_release(Uri uri) {
        c cVar;
        com.amazon.aps.iva.yb0.j.f(uri, "<this>");
        String host = uri.getHost();
        String lastPathSegment = uri.getLastPathSegment();
        if (host != null && lastPathSegment != null) {
            try {
                cVar = parseEncodedActionToJson$android_sdk_ui_release(lastPathSegment);
            } catch (Exception e) {
                BrazeLogger.INSTANCE.brazelog(uri, BrazeLogger.Priority.E, e, new BrazeActionParser$getBrazeActionVersionAndJson$json$1(lastPathSegment));
                cVar = null;
            }
            if (cVar == null) {
                return null;
            }
            return new j(host, cVar);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, uri, (BrazeLogger.Priority) null, (Throwable) null, new BrazeActionParser$getBrazeActionVersionAndJson$1(uri), 3, (Object) null);
        return null;
    }

    public final boolean isBrazeActionUri(Uri uri) {
        String str;
        if (uri != null) {
            str = uri.getScheme();
        } else {
            str = null;
        }
        return com.amazon.aps.iva.yb0.j.a(str, "brazeActions");
    }

    public final /* synthetic */ void parse$android_sdk_ui_release(Context context, StepData stepData) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(stepData, "data");
        try {
            ActionType actionType$android_sdk_ui_release = getActionType$android_sdk_ui_release(stepData);
            if (actionType$android_sdk_ui_release == ActionType.INVALID) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new BrazeActionParser$parse$1(actionType$android_sdk_ui_release, stepData), 2, (Object) null);
            actionType$android_sdk_ui_release.getImpl().run(context, stepData);
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, new BrazeActionParser$parse$2(stepData));
        }
    }

    public final /* synthetic */ c parseEncodedActionToJson$android_sdk_ui_release(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "action");
        byte[] decode = Base64.decode(str, 8);
        com.amazon.aps.iva.yb0.j.e(decode, "decode(action, Base64.URL_SAFE)");
        int length = decode.length / 2;
        int[] iArr = new int[length];
        int p = k.p(0, decode.length - 1, 2);
        if (p >= 0) {
            int i = 0;
            while (true) {
                iArr[i / 2] = (decode[i] & UnsignedBytes.MAX_VALUE) | ((decode[i + 1] & UnsignedBytes.MAX_VALUE) << 8);
                if (i == p) {
                    break;
                }
                i += 2;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = iArr[i2];
            if (i3 >= 0 && i3 <= 65535) {
                sb.append((char) i3);
            } else {
                throw new IllegalArgumentException(c0.a("Invalid Char code: ", i3));
            }
        }
        return new c(sb.toString());
    }
}
