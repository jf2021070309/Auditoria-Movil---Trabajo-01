package com.segment.analytics.integrations;

import com.segment.analytics.Properties;
import com.segment.analytics.integrations.BasePayload;
import com.segment.analytics.internal.Utils;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public class ScreenPayload extends BasePayload {
    static final String CATEGORY_KEY = "category";
    static final String NAME_KEY = "name";
    static final String PROPERTIES_KEY = "properties";

    /* loaded from: classes4.dex */
    public static class Builder extends BasePayload.Builder<ScreenPayload, Builder> {
        private String category;
        private String name;
        private Map<String, Object> properties;

        public Builder() {
        }

        @Deprecated
        public Builder category(String str) {
            this.category = str;
            return this;
        }

        public Builder name(String str) {
            this.name = str;
            return this;
        }

        public Builder properties(Map<String, ?> map) {
            Utils.assertNotNull(map, ScreenPayload.PROPERTIES_KEY);
            this.properties = Collections.unmodifiableMap(new LinkedHashMap(map));
            return this;
        }

        @Override // com.segment.analytics.integrations.BasePayload.Builder
        public /* bridge */ /* synthetic */ ScreenPayload realBuild(String str, Date date, Map map, Map map2, String str2, String str3, boolean z) {
            return realBuild2(str, date, (Map<String, Object>) map, (Map<String, Object>) map2, str2, str3, z);
        }

        @Override // com.segment.analytics.integrations.BasePayload.Builder
        public Builder self() {
            return this;
        }

        public Builder(ScreenPayload screenPayload) {
            super(screenPayload);
            this.name = screenPayload.name();
            this.properties = screenPayload.properties();
        }

        @Override // com.segment.analytics.integrations.BasePayload.Builder
        /* renamed from: realBuild  reason: avoid collision after fix types in other method */
        public ScreenPayload realBuild2(String str, Date date, Map<String, Object> map, Map<String, Object> map2, String str2, String str3, boolean z) {
            if (Utils.isNullOrEmpty(this.name) && Utils.isNullOrEmpty(this.category)) {
                throw new NullPointerException("either name or category is required");
            }
            Map<String, Object> map3 = this.properties;
            if (Utils.isNullOrEmpty(map3)) {
                map3 = Collections.emptyMap();
            }
            return new ScreenPayload(str, date, map, map2, str2, str3, this.name, this.category, map3, z);
        }
    }

    public ScreenPayload(String str, Date date, Map<String, Object> map, Map<String, Object> map2, String str2, String str3, String str4, String str5, Map<String, Object> map3, boolean z) {
        super(BasePayload.Type.screen, str, date, map, map2, str2, str3, z);
        if (!Utils.isNullOrEmpty(str4)) {
            put("name", (Object) str4);
        }
        if (!Utils.isNullOrEmpty(str5)) {
            put(CATEGORY_KEY, (Object) str5);
        }
        put(PROPERTIES_KEY, (Object) map3);
    }

    @Deprecated
    public String category() {
        return getString(CATEGORY_KEY);
    }

    public String event() {
        String name = name();
        if (!Utils.isNullOrEmpty(name)) {
            return name;
        }
        return category();
    }

    public String name() {
        return getString("name");
    }

    public Properties properties() {
        return (Properties) getValueMap(PROPERTIES_KEY, Properties.class);
    }

    @Override // com.segment.analytics.ValueMap
    public String toString() {
        return "ScreenPayload{name=\"" + name() + ",category=\"" + category() + "\"}";
    }

    @Override // com.segment.analytics.integrations.BasePayload
    public Builder toBuilder() {
        return new Builder(this);
    }
}
