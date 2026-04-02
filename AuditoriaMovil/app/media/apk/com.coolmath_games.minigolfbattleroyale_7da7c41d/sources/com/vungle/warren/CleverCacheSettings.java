package com.vungle.warren;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import com.vungle.warren.model.JsonUtil;
/* loaded from: classes2.dex */
public class CleverCacheSettings {
    static final boolean DEFAULT_ENABLED = true;
    static final long DEFAULT_TIMESTAMP = -1;
    static final String KEY_CLEVER_CACHE = "clever_cache";
    static final String KEY_ENABLED = "enabled";
    static final String KEY_TIMESTAMP = "clear_shared_cache_timestamp";
    @SerializedName(KEY_ENABLED)
    private final boolean enabled;
    @SerializedName(KEY_TIMESTAMP)
    private final long timestamp;

    private CleverCacheSettings(boolean z, long j) {
        this.enabled = z;
        this.timestamp = j;
    }

    public String serializeToString() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("clever_cache", new GsonBuilder().create().toJsonTree(this));
        return jsonObject.toString();
    }

    public static CleverCacheSettings fromJson(JsonObject jsonObject) {
        if (JsonUtil.hasNonNull(jsonObject, "clever_cache")) {
            long j = -1;
            boolean z = DEFAULT_ENABLED;
            JsonObject asJsonObject = jsonObject.getAsJsonObject("clever_cache");
            try {
                if (asJsonObject.has(KEY_TIMESTAMP)) {
                    j = asJsonObject.get(KEY_TIMESTAMP).getAsLong();
                }
            } catch (NumberFormatException unused) {
            }
            if (asJsonObject.has(KEY_ENABLED)) {
                JsonElement jsonElement = asJsonObject.get(KEY_ENABLED);
                if (jsonElement.isJsonPrimitive() && "false".equalsIgnoreCase(jsonElement.getAsString())) {
                    z = false;
                }
            }
            return new CleverCacheSettings(z, j);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static CleverCacheSettings deserializeFromString(String str) {
        if (str == null) {
            return null;
        }
        try {
            return fromJson((JsonObject) new GsonBuilder().create().fromJson(str, (Class<Object>) JsonObject.class));
        } catch (JsonSyntaxException unused) {
            return null;
        }
    }

    static CleverCacheSettings getDefault() {
        return new CleverCacheSettings(DEFAULT_ENABLED, -1L);
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return DEFAULT_ENABLED;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CleverCacheSettings cleverCacheSettings = (CleverCacheSettings) obj;
        if (this.enabled == cleverCacheSettings.enabled && this.timestamp == cleverCacheSettings.timestamp) {
            return DEFAULT_ENABLED;
        }
        return false;
    }

    public int hashCode() {
        long j = this.timestamp;
        return ((this.enabled ? 1 : 0) * 31) + ((int) (j ^ (j >>> 32)));
    }
}
