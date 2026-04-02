package com.segment.analytics;

import android.app.Activity;
import android.os.Bundle;
import com.segment.analytics.Middleware;
import com.segment.analytics.integrations.AliasPayload;
import com.segment.analytics.integrations.BasePayload;
import com.segment.analytics.integrations.GroupPayload;
import com.segment.analytics.integrations.IdentifyPayload;
import com.segment.analytics.integrations.Integration;
import com.segment.analytics.integrations.ScreenPayload;
import com.segment.analytics.integrations.TrackPayload;
import com.segment.analytics.internal.Utils;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class IntegrationOperation {
    static final IntegrationOperation FLUSH = new IntegrationOperation() { // from class: com.segment.analytics.IntegrationOperation.9
        @Override // com.segment.analytics.IntegrationOperation
        public void run(String str, Integration<?> integration, ProjectSettings projectSettings) {
            integration.flush();
        }

        public String toString() {
            return "Flush";
        }
    };
    static final IntegrationOperation RESET = new IntegrationOperation() { // from class: com.segment.analytics.IntegrationOperation.10
        @Override // com.segment.analytics.IntegrationOperation
        public void run(String str, Integration<?> integration, ProjectSettings projectSettings) {
            integration.reset();
        }

        public String toString() {
            return "Reset";
        }
    };

    /* renamed from: com.segment.analytics.IntegrationOperation$11  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass11 {
        static final /* synthetic */ int[] $SwitchMap$com$segment$analytics$integrations$BasePayload$Type;

        static {
            int[] iArr = new int[BasePayload.Type.values().length];
            $SwitchMap$com$segment$analytics$integrations$BasePayload$Type = iArr;
            try {
                iArr[BasePayload.Type.identify.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$segment$analytics$integrations$BasePayload$Type[BasePayload.Type.alias.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$segment$analytics$integrations$BasePayload$Type[BasePayload.Type.group.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$segment$analytics$integrations$BasePayload$Type[BasePayload.Type.track.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$segment$analytics$integrations$BasePayload$Type[BasePayload.Type.screen.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private IntegrationOperation() {
    }

    public static void alias(AliasPayload aliasPayload, String str, Integration<?> integration) {
        if (isIntegrationEnabled(aliasPayload.integrations(), str)) {
            integration.alias(aliasPayload);
        }
    }

    public static List<Middleware> getMiddlewareList(Map<String, List<Middleware>> map, String str) {
        List<Middleware> list = map.get(str);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    public static void group(GroupPayload groupPayload, String str, Integration<?> integration) {
        if (isIntegrationEnabled(groupPayload.integrations(), str)) {
            integration.group(groupPayload);
        }
    }

    public static void identify(IdentifyPayload identifyPayload, String str, Integration<?> integration) {
        if (isIntegrationEnabled(identifyPayload.integrations(), str)) {
            integration.identify(identifyPayload);
        }
    }

    public static boolean isIntegrationEnabled(ValueMap valueMap, String str) {
        if (Utils.isNullOrEmpty(valueMap) || "Segment.io".equals(str)) {
            return true;
        }
        if (valueMap.containsKey(str)) {
            return valueMap.getBoolean(str, true);
        }
        if (!valueMap.containsKey(Options.ALL_INTEGRATIONS_KEY)) {
            return true;
        }
        return valueMap.getBoolean(Options.ALL_INTEGRATIONS_KEY, true);
    }

    public static IntegrationOperation onActivityCreated(final Activity activity, final Bundle bundle) {
        return new IntegrationOperation() { // from class: com.segment.analytics.IntegrationOperation.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.segment.analytics.IntegrationOperation
            public void run(String str, Integration<?> integration, ProjectSettings projectSettings) {
                integration.onActivityCreated(activity, bundle);
            }

            public String toString() {
                return "Activity Created";
            }
        };
    }

    public static IntegrationOperation onActivityDestroyed(final Activity activity) {
        return new IntegrationOperation() { // from class: com.segment.analytics.IntegrationOperation.7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.segment.analytics.IntegrationOperation
            public void run(String str, Integration<?> integration, ProjectSettings projectSettings) {
                integration.onActivityDestroyed(activity);
            }

            public String toString() {
                return "Activity Destroyed";
            }
        };
    }

    public static IntegrationOperation onActivityPaused(final Activity activity) {
        return new IntegrationOperation() { // from class: com.segment.analytics.IntegrationOperation.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.segment.analytics.IntegrationOperation
            public void run(String str, Integration<?> integration, ProjectSettings projectSettings) {
                integration.onActivityPaused(activity);
            }

            public String toString() {
                return "Activity Paused";
            }
        };
    }

    public static IntegrationOperation onActivityResumed(final Activity activity) {
        return new IntegrationOperation() { // from class: com.segment.analytics.IntegrationOperation.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.segment.analytics.IntegrationOperation
            public void run(String str, Integration<?> integration, ProjectSettings projectSettings) {
                integration.onActivityResumed(activity);
            }

            public String toString() {
                return "Activity Resumed";
            }
        };
    }

    public static IntegrationOperation onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
        return new IntegrationOperation() { // from class: com.segment.analytics.IntegrationOperation.6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.segment.analytics.IntegrationOperation
            public void run(String str, Integration<?> integration, ProjectSettings projectSettings) {
                integration.onActivitySaveInstanceState(activity, bundle);
            }

            public String toString() {
                return "Activity Save Instance";
            }
        };
    }

    public static IntegrationOperation onActivityStarted(final Activity activity) {
        return new IntegrationOperation() { // from class: com.segment.analytics.IntegrationOperation.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.segment.analytics.IntegrationOperation
            public void run(String str, Integration<?> integration, ProjectSettings projectSettings) {
                integration.onActivityStarted(activity);
            }

            public String toString() {
                return "Activity Started";
            }
        };
    }

    public static IntegrationOperation onActivityStopped(final Activity activity) {
        return new IntegrationOperation() { // from class: com.segment.analytics.IntegrationOperation.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.segment.analytics.IntegrationOperation
            public void run(String str, Integration<?> integration, ProjectSettings projectSettings) {
                integration.onActivityStopped(activity);
            }

            public String toString() {
                return "Activity Stopped";
            }
        };
    }

    public static void runMiddlewareChain(BasePayload basePayload, List<Middleware> list, Middleware.Callback callback) {
        new MiddlewareChainRunner(0, basePayload, list, callback).proceed(basePayload);
    }

    public static void screen(ScreenPayload screenPayload, String str, Integration<?> integration) {
        if (isIntegrationEnabled(screenPayload.integrations(), str)) {
            integration.screen(screenPayload);
        }
    }

    public static IntegrationOperation segmentEvent(final BasePayload basePayload, final Map<String, List<Middleware>> map) {
        return new IntegrationOperation() { // from class: com.segment.analytics.IntegrationOperation.8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.segment.analytics.IntegrationOperation
            public void run(final String str, final Integration<?> integration, final ProjectSettings projectSettings) {
                IntegrationOperation.runMiddlewareChain(basePayload, IntegrationOperation.getMiddlewareList(map, str), new Middleware.Callback() { // from class: com.segment.analytics.IntegrationOperation.8.1
                    @Override // com.segment.analytics.Middleware.Callback
                    public void invoke(BasePayload basePayload2) {
                        int i = AnonymousClass11.$SwitchMap$com$segment$analytics$integrations$BasePayload$Type[basePayload2.type().ordinal()];
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i != 4) {
                                        if (i == 5) {
                                            IntegrationOperation.screen((ScreenPayload) basePayload2, str, integration);
                                            return;
                                        }
                                        throw new AssertionError("unknown type " + basePayload2.type());
                                    }
                                    IntegrationOperation.track((TrackPayload) basePayload2, str, integration, projectSettings);
                                    return;
                                }
                                IntegrationOperation.group((GroupPayload) basePayload2, str, integration);
                                return;
                            }
                            IntegrationOperation.alias((AliasPayload) basePayload2, str, integration);
                            return;
                        }
                        IntegrationOperation.identify((IdentifyPayload) basePayload2, str, integration);
                    }
                });
            }

            public String toString() {
                return basePayload.toString();
            }
        };
    }

    public static void track(TrackPayload trackPayload, String str, Integration<?> integration, ProjectSettings projectSettings) {
        ValueMap integrations = trackPayload.integrations();
        ValueMap trackingPlan = projectSettings.trackingPlan();
        if (Utils.isNullOrEmpty(trackingPlan)) {
            if (isIntegrationEnabled(integrations, str)) {
                integration.track(trackPayload);
                return;
            }
            return;
        }
        ValueMap valueMap = trackingPlan.getValueMap(trackPayload.event());
        if (Utils.isNullOrEmpty(valueMap)) {
            if (!Utils.isNullOrEmpty(integrations)) {
                if (isIntegrationEnabled(integrations, str)) {
                    integration.track(trackPayload);
                    return;
                }
                return;
            }
            ValueMap valueMap2 = trackingPlan.getValueMap("__default");
            if (Utils.isNullOrEmpty(valueMap2)) {
                integration.track(trackPayload);
            } else if (valueMap2.getBoolean("enabled", true) || "Segment.io".equals(str)) {
                integration.track(trackPayload);
            }
        } else if (!valueMap.getBoolean("enabled", true)) {
            if ("Segment.io".equals(str)) {
                integration.track(trackPayload);
            }
        } else {
            ValueMap valueMap3 = new ValueMap();
            ValueMap valueMap4 = valueMap.getValueMap("integrations");
            if (!Utils.isNullOrEmpty(valueMap4)) {
                valueMap3.putAll(valueMap4);
            }
            valueMap3.putAll(integrations);
            if (isIntegrationEnabled(valueMap3, str)) {
                integration.track(trackPayload);
            }
        }
    }

    public abstract void run(String str, Integration<?> integration, ProjectSettings projectSettings);
}
