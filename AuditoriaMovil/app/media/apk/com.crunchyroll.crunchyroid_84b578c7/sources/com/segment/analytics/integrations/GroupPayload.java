package com.segment.analytics.integrations;

import com.segment.analytics.Traits;
import com.segment.analytics.integrations.BasePayload;
import com.segment.analytics.internal.Utils;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public class GroupPayload extends BasePayload {
    static final String GROUP_ID_KEY = "groupId";
    static final String TRAITS_KEY = "traits";

    /* loaded from: classes4.dex */
    public static class Builder extends BasePayload.Builder<GroupPayload, Builder> {
        private String groupId;
        private Map<String, Object> traits;

        public Builder() {
        }

        public Builder groupId(String str) {
            this.groupId = Utils.assertNotNullOrEmpty(str, GroupPayload.GROUP_ID_KEY);
            return this;
        }

        @Override // com.segment.analytics.integrations.BasePayload.Builder
        public /* bridge */ /* synthetic */ GroupPayload realBuild(String str, Date date, Map map, Map map2, String str2, String str3, boolean z) {
            return realBuild2(str, date, (Map<String, Object>) map, (Map<String, Object>) map2, str2, str3, z);
        }

        @Override // com.segment.analytics.integrations.BasePayload.Builder
        public Builder self() {
            return this;
        }

        public Builder traits(Map<String, ?> map) {
            Utils.assertNotNull(map, GroupPayload.TRAITS_KEY);
            this.traits = Collections.unmodifiableMap(new LinkedHashMap(map));
            return this;
        }

        public Builder(GroupPayload groupPayload) {
            super(groupPayload);
            this.groupId = groupPayload.groupId();
            this.traits = groupPayload.traits();
        }

        @Override // com.segment.analytics.integrations.BasePayload.Builder
        /* renamed from: realBuild  reason: avoid collision after fix types in other method */
        public GroupPayload realBuild2(String str, Date date, Map<String, Object> map, Map<String, Object> map2, String str2, String str3, boolean z) {
            Utils.assertNotNullOrEmpty(this.groupId, GroupPayload.GROUP_ID_KEY);
            Map<String, Object> map3 = this.traits;
            if (Utils.isNullOrEmpty(map3)) {
                map3 = Collections.emptyMap();
            }
            return new GroupPayload(str, date, map, map2, str2, str3, this.groupId, map3, z);
        }
    }

    public GroupPayload(String str, Date date, Map<String, Object> map, Map<String, Object> map2, String str2, String str3, String str4, Map<String, Object> map3, boolean z) {
        super(BasePayload.Type.group, str, date, map, map2, str2, str3, z);
        put(GROUP_ID_KEY, (Object) str4);
        put(TRAITS_KEY, (Object) map3);
    }

    public String groupId() {
        return getString(GROUP_ID_KEY);
    }

    @Override // com.segment.analytics.ValueMap
    public String toString() {
        return "GroupPayload{groupId=\"" + groupId() + "\"}";
    }

    public Traits traits() {
        return (Traits) getValueMap(TRAITS_KEY, Traits.class);
    }

    @Override // com.segment.analytics.integrations.BasePayload
    public Builder toBuilder() {
        return new Builder(this);
    }
}
