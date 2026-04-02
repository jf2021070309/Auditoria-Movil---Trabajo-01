package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.Logger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public class KeysMap {
    private final Map<String, String> keys = new HashMap();
    private final int maxEntries;
    private final int maxEntryLength;

    public KeysMap(int i, int i2) {
        this.maxEntries = i;
        this.maxEntryLength = i2;
    }

    private String sanitizeKey(String str) {
        if (str != null) {
            return sanitizeAttribute(str);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public synchronized Map<String, String> getKeys() {
        return Collections.unmodifiableMap(new HashMap(this.keys));
    }

    public String sanitizeAttribute(String str) {
        if (str != null) {
            String trim = str.trim();
            int length = trim.length();
            int i = this.maxEntryLength;
            if (length > i) {
                return trim.substring(0, i);
            }
            return trim;
        }
        return str;
    }

    public synchronized void setKey(String str, String str2) {
        String sanitizeAttribute;
        String sanitizeKey = sanitizeKey(str);
        if (this.keys.size() >= this.maxEntries && !this.keys.containsKey(sanitizeKey)) {
            Logger logger = Logger.getLogger();
            logger.w("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.maxEntries);
        }
        Map<String, String> map = this.keys;
        if (str2 == null) {
            sanitizeAttribute = "";
        } else {
            sanitizeAttribute = sanitizeAttribute(str2);
        }
        map.put(sanitizeKey, sanitizeAttribute);
    }

    public synchronized void setKeys(Map<String, String> map) {
        String sanitizeAttribute;
        int i = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String sanitizeKey = sanitizeKey(entry.getKey());
            if (this.keys.size() >= this.maxEntries && !this.keys.containsKey(sanitizeKey)) {
                i++;
            }
            String value = entry.getValue();
            Map<String, String> map2 = this.keys;
            if (value == null) {
                sanitizeAttribute = "";
            } else {
                sanitizeAttribute = sanitizeAttribute(value);
            }
            map2.put(sanitizeKey, sanitizeAttribute);
        }
        if (i > 0) {
            Logger logger = Logger.getLogger();
            logger.w("Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.maxEntries);
        }
    }
}
