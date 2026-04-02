package com.segment.analytics.integrations;

import com.segment.analytics.Traits;
import com.segment.analytics.integrations.BasePayload;
import com.segment.analytics.internal.Utils;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public class IdentifyPayload extends BasePayload {
    static final String TRAITS_KEY = "traits";

    /* loaded from: classes4.dex */
    public static class Builder extends BasePayload.Builder<IdentifyPayload, Builder> {
        private Map<String, Object> traits;

        public Builder() {
        }

        @Override // com.segment.analytics.integrations.BasePayload.Builder
        public /* bridge */ /* synthetic */ IdentifyPayload realBuild(String str, Date date, Map map, Map map2, String str2, String str3, boolean z) {
            return realBuild2(str, date, (Map<String, Object>) map, (Map<String, Object>) map2, str2, str3, z);
        }

        @Override // com.segment.analytics.integrations.BasePayload.Builder
        public Builder self() {
            return this;
        }

        public Builder traits(Map<String, ?> map) {
            Utils.assertNotNull(map, IdentifyPayload.TRAITS_KEY);
            this.traits = Collections.unmodifiableMap(new LinkedHashMap(map));
            return this;
        }

        public Builder(IdentifyPayload identifyPayload) {
            super(identifyPayload);
            this.traits = identifyPayload.traits();
        }

        @Override // com.segment.analytics.integrations.BasePayload.Builder
        /* renamed from: realBuild  reason: avoid collision after fix types in other method */
        public IdentifyPayload realBuild2(String str, Date date, Map<String, Object> map, Map<String, Object> map2, String str2, String str3, boolean z) {
            if (Utils.isNullOrEmpty(str2) && Utils.isNullOrEmpty(this.traits)) {
                throw new NullPointerException("either userId or traits are required");
            }
            return new IdentifyPayload(str, date, map, map2, str2, str3, this.traits, z);
        }
    }

    public IdentifyPayload(String str, Date date, Map<String, Object> map, Map<String, Object> map2, String str2, String str3, Map<String, Object> map3, boolean z) {
        super(BasePayload.Type.identify, str, date, map, map2, str2, str3, z);
        put(TRAITS_KEY, (Object) map3);
    }

    @Override // com.segment.analytics.ValueMap
    public String toString() {
        return "IdentifyPayload{\"userId=\"" + userId() + "\"}";
    }

    public Traits traits() {
        return (Traits) getValueMap(TRAITS_KEY, Traits.class);
    }

    @Override // com.segment.analytics.integrations.BasePayload
    public Builder toBuilder() {
        return new Builder(this);
    }
}
