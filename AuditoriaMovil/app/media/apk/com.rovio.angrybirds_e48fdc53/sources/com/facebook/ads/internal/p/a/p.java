package com.facebook.ads.internal.p.a;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes2.dex */
public class p implements Map<String, String> {
    private Map<String, String> a = new HashMap();

    public p a(Map<? extends String, ? extends String> map) {
        putAll(map);
        return this;
    }

    public String a() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.a.keySet()) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(str);
            String str2 = this.a.get(str);
            if (str2 != null) {
                sb.append("=");
                try {
                    sb.append(URLEncoder.encode(str2, "UTF-8"));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        }
        return sb.toString();
    }

    @Override // java.util.Map
    /* renamed from: a */
    public String get(Object obj) {
        return this.a.get(obj);
    }

    @Override // java.util.Map
    /* renamed from: a */
    public String put(String str, String str2) {
        return this.a.put(str, str2);
    }

    @Override // java.util.Map
    /* renamed from: b */
    public String remove(Object obj) {
        return this.a.remove(obj);
    }

    public byte[] b() {
        try {
            return a().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // java.util.Map
    public void clear() {
        this.a.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<String, String>> entrySet() {
        return this.a.entrySet();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Map
    public Set<String> keySet() {
        return this.a.keySet();
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends String> map) {
        this.a.putAll(map);
    }

    @Override // java.util.Map
    public int size() {
        return this.a.size();
    }

    @Override // java.util.Map
    public Collection<String> values() {
        return this.a.values();
    }
}
