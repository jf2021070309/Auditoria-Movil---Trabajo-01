package e.d.d.m.j.k;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class b {
    public final Map<String, String> a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final int f7235b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7236c;

    public b(int i2, int i3) {
        this.f7235b = i2;
        this.f7236c = i3;
    }

    public synchronized void a(Map<String, String> map) {
        String trim;
        int i2 = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key == null) {
                throw new IllegalArgumentException("Custom attribute key must not be null.");
            }
            int i3 = this.f7236c;
            String trim2 = key.trim();
            if (trim2.length() > i3) {
                trim2 = trim2.substring(0, i3);
            }
            if (this.a.size() >= this.f7235b && !this.a.containsKey(trim2)) {
                i2++;
            }
            String value = entry.getValue();
            Map<String, String> map2 = this.a;
            if (value == null) {
                trim = "";
            } else {
                int i4 = this.f7236c;
                trim = value.trim();
                if (trim.length() > i4) {
                    trim = trim.substring(0, i4);
                }
            }
            map2.put(trim2, trim);
        }
        if (i2 > 0) {
            e.d.d.m.j.f fVar = e.d.d.m.j.f.a;
            fVar.d("Ignored " + i2 + " entries when adding custom keys. Maximum allowable: " + this.f7235b);
        }
    }
}
