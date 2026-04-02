package com.google.android.gms.internal.cast;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
public final class zzur extends LinkedHashMap {
    private static final zzur zza;
    private boolean zzb;

    static {
        zzur zzurVar = new zzur();
        zza = zzurVar;
        zzurVar.zzb = false;
    }

    private zzur() {
        this.zzb = true;
    }

    private static int zze(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = zzty.zzd;
            int length = bArr.length;
            int zzb = zzty.zzb(length, bArr, 0, length);
            if (zzb == 0) {
                return 1;
            }
            return zzb;
        } else if (!(obj instanceof zztr)) {
            return obj.hashCode();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    private final void zzf() {
        if (this.zzb) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzf();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    Iterator it = entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (map.containsKey(entry.getKey())) {
                            Object value = entry.getValue();
                            Object obj2 = map.get(entry.getKey());
                            if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                                equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                                continue;
                            } else {
                                equals = value.equals(obj2);
                                continue;
                            }
                            if (!equals) {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            i += zze(entry.getValue()) ^ zze(entry.getKey());
        }
        return i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        zzf();
        byte[] bArr = zzty.zzd;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        zzf();
        for (Object obj : map.keySet()) {
            byte[] bArr = zzty.zzd;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzf();
        return super.remove(obj);
    }

    public final zzur zza() {
        if (isEmpty()) {
            return new zzur();
        }
        return new zzur(this);
    }

    public final void zzb() {
        this.zzb = false;
    }

    public final void zzc(zzur zzurVar) {
        zzf();
        if (!zzurVar.isEmpty()) {
            putAll(zzurVar);
        }
    }

    public final boolean zzd() {
        return this.zzb;
    }

    private zzur(Map map) {
        super(map);
        this.zzb = true;
    }
}
