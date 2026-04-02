package com.segment.analytics.integrations;

import com.segment.analytics.AnalyticsContext;
import com.segment.analytics.ValueMap;
import com.segment.analytics.internal.NanoDate;
import com.segment.analytics.internal.Utils;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
/* loaded from: classes4.dex */
public abstract class BasePayload extends ValueMap {
    static final String ANONYMOUS_ID_KEY = "anonymousId";
    static final String CHANNEL_KEY = "channel";
    static final String CONTEXT_KEY = "context";
    static final String INTEGRATIONS_KEY = "integrations";
    static final String MESSAGE_ID = "messageId";
    static final String TIMESTAMP_KEY = "timestamp";
    static final String TYPE_KEY = "type";
    static final String USER_ID_KEY = "userId";

    /* loaded from: classes4.dex */
    public enum Channel {
        browser,
        mobile,
        server
    }

    /* loaded from: classes4.dex */
    public enum Type {
        alias,
        group,
        identify,
        screen,
        track
    }

    public BasePayload(Type type, String str, Date date, Map<String, Object> map, Map<String, Object> map2, String str2, String str3, boolean z) {
        put(CHANNEL_KEY, (Object) Channel.mobile);
        put(TYPE_KEY, (Object) type);
        put(MESSAGE_ID, (Object) str);
        if (z) {
            put(TIMESTAMP_KEY, (Object) Utils.toISO8601NanoFormattedString(date));
        } else {
            put(TIMESTAMP_KEY, (Object) Utils.toISO8601String(date));
        }
        put(CONTEXT_KEY, (Object) map);
        put(INTEGRATIONS_KEY, (Object) map2);
        if (!Utils.isNullOrEmpty(str2)) {
            put(USER_ID_KEY, (Object) str2);
        }
        put(ANONYMOUS_ID_KEY, (Object) str3);
    }

    public String anonymousId() {
        return getString(ANONYMOUS_ID_KEY);
    }

    public AnalyticsContext context() {
        return (AnalyticsContext) getValueMap(CONTEXT_KEY, AnalyticsContext.class);
    }

    public ValueMap integrations() {
        return getValueMap(INTEGRATIONS_KEY);
    }

    public String messageId() {
        return getString(MESSAGE_ID);
    }

    public Date timestamp() {
        String string = getString(TIMESTAMP_KEY);
        if (Utils.isNullOrEmpty(string)) {
            return null;
        }
        if (string.length() == 24) {
            return Utils.parseISO8601Date(string);
        }
        return Utils.parseISO8601DateWithNanos(string);
    }

    public abstract Builder toBuilder();

    public Type type() {
        return (Type) getEnum(Type.class, TYPE_KEY);
    }

    public String userId() {
        return getString(USER_ID_KEY);
    }

    /* loaded from: classes4.dex */
    public static abstract class Builder<P extends BasePayload, B extends Builder> {
        private String anonymousId;
        private Map<String, Object> context;
        private Map<String, Object> integrationsBuilder;
        private String messageId;
        private boolean nanosecondTimestamps;
        private Date timestamp;
        private String userId;

        public Builder() {
            this.nanosecondTimestamps = false;
        }

        public B anonymousId(String str) {
            this.anonymousId = Utils.assertNotNullOrEmpty(str, BasePayload.ANONYMOUS_ID_KEY);
            return self();
        }

        public P build() {
            Map<String, Object> immutableCopyOf;
            if (Utils.isNullOrEmpty(this.userId) && Utils.isNullOrEmpty(this.anonymousId)) {
                throw new NullPointerException("either userId or anonymousId is required");
            }
            if (Utils.isNullOrEmpty(this.integrationsBuilder)) {
                immutableCopyOf = Collections.emptyMap();
            } else {
                immutableCopyOf = Utils.immutableCopyOf(this.integrationsBuilder);
            }
            Map<String, Object> map = immutableCopyOf;
            if (Utils.isNullOrEmpty(this.messageId)) {
                this.messageId = UUID.randomUUID().toString();
            }
            if (this.timestamp == null) {
                if (this.nanosecondTimestamps) {
                    this.timestamp = new NanoDate();
                } else {
                    this.timestamp = new Date();
                }
            }
            if (Utils.isNullOrEmpty(this.context)) {
                this.context = Collections.emptyMap();
            }
            return realBuild(this.messageId, this.timestamp, this.context, map, this.userId, this.anonymousId, this.nanosecondTimestamps);
        }

        public B context(Map<String, ?> map) {
            Utils.assertNotNull(map, BasePayload.CONTEXT_KEY);
            this.context = Collections.unmodifiableMap(new LinkedHashMap(map));
            return self();
        }

        public B integration(String str, boolean z) {
            Utils.assertNotNullOrEmpty(str, "key");
            if (this.integrationsBuilder == null) {
                this.integrationsBuilder = new LinkedHashMap();
            }
            this.integrationsBuilder.put(str, Boolean.valueOf(z));
            return self();
        }

        public B integrations(Map<String, ?> map) {
            if (Utils.isNullOrEmpty(map)) {
                return self();
            }
            if (this.integrationsBuilder == null) {
                this.integrationsBuilder = new LinkedHashMap();
            }
            this.integrationsBuilder.putAll(map);
            return self();
        }

        public boolean isUserIdSet() {
            return !Utils.isNullOrEmpty(this.userId);
        }

        public B messageId(String str) {
            Utils.assertNotNullOrEmpty(str, BasePayload.MESSAGE_ID);
            this.messageId = str;
            return self();
        }

        public B nanosecondTimestamps(boolean z) {
            this.nanosecondTimestamps = z;
            return self();
        }

        public abstract P realBuild(String str, Date date, Map<String, Object> map, Map<String, Object> map2, String str2, String str3, boolean z);

        public abstract B self();

        public B timestamp(Date date) {
            Utils.assertNotNull(date, BasePayload.TIMESTAMP_KEY);
            this.timestamp = date;
            return self();
        }

        public B userId(String str) {
            this.userId = Utils.assertNotNullOrEmpty(str, BasePayload.USER_ID_KEY);
            return self();
        }

        public Builder(BasePayload basePayload) {
            this.nanosecondTimestamps = false;
            String string = basePayload.getString(BasePayload.TIMESTAMP_KEY);
            if (string != null && string.length() > 24) {
                this.nanosecondTimestamps = true;
            }
            this.messageId = basePayload.messageId();
            this.timestamp = basePayload.timestamp();
            this.context = basePayload.context();
            this.integrationsBuilder = new LinkedHashMap(basePayload.integrations());
            this.userId = basePayload.userId();
            this.anonymousId = basePayload.anonymousId();
        }

        public B integration(String str, Map<String, Object> map) {
            Utils.assertNotNullOrEmpty(str, "key");
            Utils.assertNotNullOrEmpty(map, "options");
            if (this.integrationsBuilder == null) {
                this.integrationsBuilder = new LinkedHashMap();
            }
            this.integrationsBuilder.put(str, Utils.immutableCopyOf(map));
            return self();
        }
    }

    @Override // com.segment.analytics.ValueMap
    public BasePayload putValue(String str, Object obj) {
        super.putValue(str, obj);
        return this;
    }
}
