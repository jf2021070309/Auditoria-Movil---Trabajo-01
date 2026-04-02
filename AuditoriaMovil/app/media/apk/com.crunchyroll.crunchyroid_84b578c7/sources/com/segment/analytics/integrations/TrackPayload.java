package com.segment.analytics.integrations;

import com.segment.analytics.Properties;
import com.segment.analytics.integrations.BasePayload;
import com.segment.analytics.internal.Utils;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public class TrackPayload extends BasePayload {
    static final String EVENT_KEY = "event";
    static final String PROPERTIES_KEY = "properties";

    /* loaded from: classes4.dex */
    public static class Builder extends BasePayload.Builder<TrackPayload, Builder> {
        private String event;
        private Map<String, Object> properties;

        public Builder() {
        }

        public Builder event(String str) {
            this.event = Utils.assertNotNullOrEmpty(str, TrackPayload.EVENT_KEY);
            return this;
        }

        public Builder properties(Map<String, ?> map) {
            Utils.assertNotNull(map, TrackPayload.PROPERTIES_KEY);
            this.properties = Collections.unmodifiableMap(new LinkedHashMap(map));
            return this;
        }

        @Override // com.segment.analytics.integrations.BasePayload.Builder
        public /* bridge */ /* synthetic */ TrackPayload realBuild(String str, Date date, Map map, Map map2, String str2, String str3, boolean z) {
            return realBuild2(str, date, (Map<String, Object>) map, (Map<String, Object>) map2, str2, str3, z);
        }

        @Override // com.segment.analytics.integrations.BasePayload.Builder
        public Builder self() {
            return this;
        }

        public Builder(TrackPayload trackPayload) {
            super(trackPayload);
            this.event = trackPayload.event();
            this.properties = trackPayload.properties();
        }

        @Override // com.segment.analytics.integrations.BasePayload.Builder
        /* renamed from: realBuild  reason: avoid collision after fix types in other method */
        public TrackPayload realBuild2(String str, Date date, Map<String, Object> map, Map<String, Object> map2, String str2, String str3, boolean z) {
            Utils.assertNotNullOrEmpty(this.event, TrackPayload.EVENT_KEY);
            Map<String, Object> map3 = this.properties;
            if (Utils.isNullOrEmpty(map3)) {
                map3 = Collections.emptyMap();
            }
            return new TrackPayload(str, date, map, map2, str2, str3, this.event, map3, z);
        }
    }

    public TrackPayload(String str, Date date, Map<String, Object> map, Map<String, Object> map2, String str2, String str3, String str4, Map<String, Object> map3, boolean z) {
        super(BasePayload.Type.track, str, date, map, map2, str2, str3, z);
        put(EVENT_KEY, (Object) str4);
        put(PROPERTIES_KEY, (Object) map3);
    }

    public String event() {
        return getString(EVENT_KEY);
    }

    public Properties properties() {
        return (Properties) getValueMap(PROPERTIES_KEY, Properties.class);
    }

    @Override // com.segment.analytics.ValueMap
    public String toString() {
        return "TrackPayload{event=\"" + event() + "\"}";
    }

    @Override // com.segment.analytics.integrations.BasePayload
    public Builder toBuilder() {
        return new Builder(this);
    }
}
