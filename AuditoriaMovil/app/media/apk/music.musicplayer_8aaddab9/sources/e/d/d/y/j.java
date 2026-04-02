package e.d.d.y;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class j {
    public final e.d.d.j.c a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f7740b;

    /* renamed from: c  reason: collision with root package name */
    public final e.d.d.y.r.j f7741c;

    /* renamed from: d  reason: collision with root package name */
    public final e.d.d.y.r.j f7742d;

    /* renamed from: e  reason: collision with root package name */
    public final e.d.d.y.r.j f7743e;

    /* renamed from: f  reason: collision with root package name */
    public final e.d.d.y.r.l f7744f;

    /* renamed from: g  reason: collision with root package name */
    public final e.d.d.y.r.m f7745g;

    /* renamed from: h  reason: collision with root package name */
    public final e.d.d.y.r.n f7746h;

    /* renamed from: i  reason: collision with root package name */
    public final e.d.d.u.h f7747i;

    public j(Context context, e.d.d.g gVar, e.d.d.u.h hVar, e.d.d.j.c cVar, Executor executor, e.d.d.y.r.j jVar, e.d.d.y.r.j jVar2, e.d.d.y.r.j jVar3, e.d.d.y.r.l lVar, e.d.d.y.r.m mVar, e.d.d.y.r.n nVar) {
        this.f7747i = hVar;
        this.a = cVar;
        this.f7740b = executor;
        this.f7741c = jVar;
        this.f7742d = jVar2;
        this.f7743e = jVar3;
        this.f7744f = lVar;
        this.f7745g = mVar;
        this.f7746h = nVar;
    }

    public static j b() {
        e.d.d.g b2 = e.d.d.g.b();
        b2.a();
        return ((q) b2.f7043g.a(q.class)).c();
    }

    public static List<Map<String, String>> c(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public Map<String, p> a() {
        e.d.d.y.r.m mVar = this.f7745g;
        Objects.requireNonNull(mVar);
        HashSet hashSet = new HashSet();
        hashSet.addAll(e.d.d.y.r.m.d(mVar.f7793e));
        hashSet.addAll(e.d.d.y.r.m.d(mVar.f7794f));
        HashMap hashMap = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            hashMap.put(str, mVar.g(str));
        }
        return hashMap;
    }
}
