package com.amazon.aps.iva.mp;

import com.amazon.aps.iva.lb0.b0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: DataConstraints.kt */
/* loaded from: classes2.dex */
public interface a {

    /* compiled from: DataConstraints.kt */
    /* renamed from: com.amazon.aps.iva.mp.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0519a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Map a(a aVar, Map map, String str, String str2, Set set, int i) {
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            if ((i & 8) != 0) {
                set = b0.b;
            }
            return aVar.a(map, str, str2, set);
        }
    }

    <T> Map<String, T> a(Map<String, ? extends T> map, String str, String str2, Set<String> set);

    List<String> b(List<String> list);

    LinkedHashMap c(Map map);
}
