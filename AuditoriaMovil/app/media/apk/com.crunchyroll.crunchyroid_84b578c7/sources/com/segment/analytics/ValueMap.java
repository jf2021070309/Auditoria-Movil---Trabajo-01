package com.segment.analytics;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.aps.iva.if0.c;
import com.segment.analytics.internal.Utils;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes4.dex */
public class ValueMap implements Map<String, Object> {
    private final Map<String, Object> delegate;

    /* loaded from: classes4.dex */
    public static class Cache<T extends ValueMap> {
        private final Cartographer cartographer;
        private final Class<T> clazz;
        private final String key;
        private final SharedPreferences preferences;
        private T value;

        public Cache(Context context, Cartographer cartographer, String str, String str2, Class<T> cls) {
            this.cartographer = cartographer;
            this.preferences = Utils.getSegmentSharedPreferences(context, str2);
            this.key = str;
            this.clazz = cls;
        }

        public T create(Map<String, Object> map) {
            return (T) ValueMap.createValueMap(map, this.clazz);
        }

        public void delete() {
            this.preferences.edit().remove(this.key).apply();
        }

        public T get() {
            if (this.value == null) {
                String string = this.preferences.getString(this.key, null);
                if (Utils.isNullOrEmpty(string)) {
                    return null;
                }
                try {
                    this.value = create(this.cartographer.fromJson(string));
                } catch (IOException unused) {
                    return null;
                }
            }
            return this.value;
        }

        public boolean isSet() {
            return this.preferences.contains(this.key);
        }

        public void set(T t) {
            this.value = t;
            this.preferences.edit().putString(this.key, this.cartographer.toJson(t)).apply();
        }
    }

    public ValueMap() {
        this.delegate = new LinkedHashMap();
    }

    private <T extends ValueMap> T coerceToValueMap(Object obj, Class<T> cls) {
        if (obj == null) {
            return null;
        }
        if (cls.isAssignableFrom(obj.getClass())) {
            return (T) obj;
        }
        if (!(obj instanceof Map)) {
            return null;
        }
        return (T) createValueMap((Map) obj, cls);
    }

    public static <T extends ValueMap> T createValueMap(Map map, Class<T> cls) {
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(Map.class);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(map);
        } catch (Exception e) {
            throw new AssertionError("Could not create instance of " + cls.getCanonicalName() + ".\n" + e);
        }
    }

    @Override // java.util.Map
    public void clear() {
        this.delegate.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.delegate.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.delegate.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<String, Object>> entrySet() {
        return this.delegate.entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj != this && !this.delegate.equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.delegate.get(obj);
    }

    public boolean getBoolean(String str, boolean z) {
        Object obj = get(str);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof String) {
            return Boolean.valueOf((String) obj).booleanValue();
        }
        return z;
    }

    public char getChar(String str, char c) {
        Object obj = get(str);
        if (obj instanceof Character) {
            return ((Character) obj).charValue();
        }
        if (obj != null && (obj instanceof String)) {
            String str2 = (String) obj;
            if (str2.length() == 1) {
                return str2.charAt(0);
            }
        }
        return c;
    }

    public double getDouble(String str, double d) {
        Object obj = get(str);
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf((String) obj).doubleValue();
            } catch (NumberFormatException unused) {
            }
        }
        return d;
    }

    public <T extends Enum<T>> T getEnum(Class<T> cls, String str) {
        if (cls != null) {
            Object obj = get(str);
            if (cls.isInstance(obj)) {
                return (T) obj;
            }
            if (obj instanceof String) {
                return (T) Enum.valueOf(cls, (String) obj);
            }
            return null;
        }
        throw new IllegalArgumentException("enumType may not be null");
    }

    public float getFloat(String str, float f) {
        return Utils.coerceToFloat(get(str), f);
    }

    public int getInt(String str, int i) {
        Object obj = get(str);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.valueOf((String) obj).intValue();
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public <T extends ValueMap> List<T> getList(Object obj, Class<T> cls) {
        Object obj2 = get(obj);
        if (obj2 instanceof List) {
            List<Object> list = (List) obj2;
            try {
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    ValueMap coerceToValueMap = coerceToValueMap(obj3, cls);
                    if (coerceToValueMap != null) {
                        arrayList.add(coerceToValueMap);
                    }
                }
                return arrayList;
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    public long getLong(String str, long j) {
        Object obj = get(str);
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf((String) obj).longValue();
            } catch (NumberFormatException unused) {
            }
        }
        return j;
    }

    public String getString(String str) {
        Object obj = get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj != null) {
            return String.valueOf(obj);
        }
        return null;
    }

    public ValueMap getValueMap(Object obj) {
        Object obj2 = get(obj);
        if (obj2 instanceof ValueMap) {
            return (ValueMap) obj2;
        }
        if (obj2 instanceof Map) {
            return new ValueMap((Map) obj2);
        }
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.delegate.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.delegate.isEmpty();
    }

    @Override // java.util.Map
    public Set<String> keySet() {
        return this.delegate.keySet();
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends Object> map) {
        this.delegate.putAll(map);
    }

    public ValueMap putValue(String str, Object obj) {
        this.delegate.put(str, obj);
        return this;
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return this.delegate.remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return this.delegate.size();
    }

    public c toJsonObject() {
        return Utils.toJsonObject(this.delegate);
    }

    public String toString() {
        return this.delegate.toString();
    }

    public Map<String, String> toStringMap() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : entrySet()) {
            hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        return hashMap;
    }

    @Override // java.util.Map
    public Collection<Object> values() {
        return this.delegate.values();
    }

    @Override // java.util.Map
    public Object put(String str, Object obj) {
        return this.delegate.put(str, obj);
    }

    public ValueMap(int i) {
        this.delegate = new LinkedHashMap(i);
    }

    public ValueMap(Map<String, Object> map) {
        if (map != null) {
            this.delegate = map;
            return;
        }
        throw new IllegalArgumentException("Map must not be null.");
    }

    public <T extends ValueMap> T getValueMap(String str, Class<T> cls) {
        return (T) coerceToValueMap(get(str), cls);
    }
}
