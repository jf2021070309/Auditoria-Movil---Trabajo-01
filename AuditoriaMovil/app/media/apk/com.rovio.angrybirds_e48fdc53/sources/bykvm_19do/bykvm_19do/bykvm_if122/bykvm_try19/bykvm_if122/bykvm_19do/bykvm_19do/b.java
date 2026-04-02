package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.bykvm_19do;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class b implements bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.b {
    private bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a a;
    private c b;

    public b(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a aVar) {
        this.a = aVar;
    }

    private <T> T a(String str, T t) {
        try {
            String a = this.a.a(this.b.a(str), "");
            return TextUtils.isEmpty(a) ? t : (T) new JSONObject((String) this.b.b(a)).get(str);
        } catch (Throwable th) {
            return t;
        }
    }

    private <T> void b(String str, T t) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, t);
            this.a.b(this.b.a(str), this.b.a(jSONObject.toString()));
        } catch (Throwable th) {
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public String a(String str, String str2) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a aVar = this.a;
        return aVar == null ? str2 : this.b == null ? aVar.a(str, str2) : (String) a(str, str2);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public void a() {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a aVar = this.a;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    public void a(c cVar) {
        this.b = cVar;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public void a(String str) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a aVar = this.a;
        if (aVar == null) {
            return;
        }
        if (this.b == null) {
            aVar.a(str);
        }
        this.a.a(this.b.a(str));
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public void a(String str, float f) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a aVar = this.a;
        if (aVar == null) {
            return;
        }
        if (this.b == null) {
            aVar.a(str, f);
        } else {
            b(str, (String) Float.valueOf(f));
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public void a(String str, int i) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a aVar = this.a;
        if (aVar == null) {
            return;
        }
        if (this.b == null) {
            aVar.a(str, i);
        } else {
            b(str, (String) Integer.valueOf(i));
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public void a(String str, long j) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a aVar = this.a;
        if (aVar == null) {
            return;
        }
        if (this.b == null) {
            aVar.a(str, j);
        } else {
            b(str, (String) Long.valueOf(j));
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public void a(String str, boolean z) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a aVar = this.a;
        if (aVar == null) {
            return;
        }
        if (this.b == null) {
            aVar.a(str, z);
        } else {
            b(str, (String) Boolean.valueOf(z));
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public float b(String str, float f) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a aVar = this.a;
        return aVar == null ? f : this.b == null ? aVar.b(str, f) : ((Float) a(str, (String) Float.valueOf(f))).floatValue();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public int b(String str, int i) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a aVar = this.a;
        return aVar == null ? i : this.b == null ? aVar.b(str, i) : ((Integer) a(str, (String) Integer.valueOf(i))).intValue();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public long b(String str, long j) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a aVar = this.a;
        return aVar == null ? j : this.b == null ? aVar.b(str, j) : ((Long) a(str, (String) Long.valueOf(j))).longValue();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public Map<String, ?> b() {
        try {
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a aVar = this.a;
            if (aVar == null) {
                return Collections.emptyMap();
            }
            Map<String, ?> b = aVar.b();
            if (this.b != null) {
                HashMap hashMap = new HashMap();
                for (Map.Entry<String, ?> entry : b.entrySet()) {
                    String str = (String) this.b.b(entry.getKey());
                    Object value = entry.getValue();
                    if (value instanceof Set) {
                        HashSet hashSet = new HashSet();
                        for (String str2 : (Set) value) {
                            hashSet.add(this.b.b(str2));
                        }
                        hashMap.put(str, hashSet);
                    } else {
                        hashMap.put(str, new JSONObject((String) this.b.b(value.toString())).get(str));
                    }
                }
                return hashMap;
            }
            return b;
        } catch (Throwable th) {
            return Collections.emptyMap();
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public void b(String str, String str2) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a aVar = this.a;
        if (aVar == null) {
            return;
        }
        if (this.b == null) {
            aVar.b(str, str2);
        } else {
            b(str, str2);
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public boolean b(String str, boolean z) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a aVar = this.a;
        return aVar == null ? z : this.b == null ? aVar.b(str, z) : ((Boolean) a(str, (String) Boolean.valueOf(z))).booleanValue();
    }
}
