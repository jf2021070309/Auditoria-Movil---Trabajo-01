package com.segment.analytics;

import android.content.Context;
import com.amazon.aps.iva.oa.a;
import com.segment.analytics.ValueMap;
import java.util.Collections;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class ProjectSettings extends ValueMap {
    private static final String EDGE_FUNCTIONS_KEY = "edgeFunction";
    private static final String INTEGRATIONS_KEY = "integrations";
    private static final String PLAN_KEY = "plan";
    private static final String TIMESTAMP_KEY = "timestamp";
    private static final String TRACKING_PLAN_KEY = "track";

    /* loaded from: classes4.dex */
    public static class Cache extends ValueMap.Cache<ProjectSettings> {
        private static final String PROJECT_SETTINGS_CACHE_KEY_PREFIX = "project-settings-plan-";

        public Cache(Context context, Cartographer cartographer, String str) {
            super(context, cartographer, a.a(PROJECT_SETTINGS_CACHE_KEY_PREFIX, str), str, ProjectSettings.class);
        }

        @Override // com.segment.analytics.ValueMap.Cache
        public /* bridge */ /* synthetic */ ProjectSettings create(Map map) {
            return create((Map<String, Object>) map);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.segment.analytics.ValueMap.Cache
        public ProjectSettings create(Map<String, Object> map) {
            return new ProjectSettings(map);
        }
    }

    public ProjectSettings(Map<String, Object> map) {
        super(Collections.unmodifiableMap(map));
    }

    public static ProjectSettings create(Map<String, Object> map) {
        map.put(TIMESTAMP_KEY, Long.valueOf(System.currentTimeMillis()));
        return new ProjectSettings(map);
    }

    public ValueMap edgeFunctions() {
        return getValueMap(EDGE_FUNCTIONS_KEY);
    }

    public ValueMap integrations() {
        return getValueMap(INTEGRATIONS_KEY);
    }

    public ValueMap plan() {
        return getValueMap(PLAN_KEY);
    }

    public long timestamp() {
        return getLong(TIMESTAMP_KEY, 0L);
    }

    public ValueMap trackingPlan() {
        ValueMap plan = plan();
        if (plan == null) {
            return null;
        }
        return plan.getValueMap(TRACKING_PLAN_KEY);
    }
}
