package e.d.d.j;

import android.text.TextUtils;
import e.d.d.k.a.a;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes2.dex */
public class c {
    public final e.d.d.t.b<e.d.d.k.a.a> a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7062b;

    /* renamed from: c  reason: collision with root package name */
    public Integer f7063c = null;

    public c(e.d.d.t.b bVar, String str) {
        this.a = bVar;
        this.f7062b = str;
    }

    public final List<a.c> a() {
        return this.a.get().e(this.f7062b, "");
    }

    public final void b(Collection<a.c> collection) {
        for (a.c cVar : collection) {
            this.a.get().clearConditionalUserProperty(cVar.f7066b, null, null);
        }
    }

    public void c(List<Map<String, String>> list) throws a {
        String str;
        String[] strArr;
        if (this.a.get() == null) {
            throw new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
        ArrayList arrayList = new ArrayList();
        for (Map<String, String> map : list) {
            String[] strArr2 = b.a;
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : b.a) {
                if (!map.containsKey(str2)) {
                    arrayList2.add(str2);
                }
            }
            if (!arrayList2.isEmpty()) {
                throw new a(String.format("The following keys are missing from the experiment info map: %s", arrayList2));
            }
            try {
                arrayList.add(new b(map.get("experimentId"), map.get("variantId"), map.containsKey("triggerEvent") ? map.get("triggerEvent") : "", b.f7055b.parse(map.get("experimentStartTime")), Long.parseLong(map.get("triggerTimeoutMillis")), Long.parseLong(map.get("timeToLiveMillis"))));
            } catch (NumberFormatException e2) {
                throw new a("Could not process experiment: one of the durations could not be converted into a long.", e2);
            } catch (ParseException e3) {
                throw new a("Could not process experiment: parsing experiment start time failed.", e3);
            }
        }
        if (arrayList.isEmpty()) {
            if (this.a.get() == null) {
                throw new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
            }
            b(a());
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashSet.add(((b) it.next()).f7056c);
        }
        List<a.c> a = a();
        HashSet hashSet2 = new HashSet();
        for (a.c cVar : a) {
            hashSet2.add(cVar.f7066b);
        }
        ArrayList arrayList3 = new ArrayList();
        for (a.c cVar2 : a) {
            if (!hashSet.contains(cVar2.f7066b)) {
                arrayList3.add(cVar2);
            }
        }
        b(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            b bVar = (b) it2.next();
            if (!hashSet2.contains(bVar.f7056c)) {
                arrayList4.add(bVar);
            }
        }
        ArrayDeque arrayDeque = new ArrayDeque(a());
        if (this.f7063c == null) {
            this.f7063c = Integer.valueOf(this.a.get().d(this.f7062b));
        }
        int intValue = this.f7063c.intValue();
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            b bVar2 = (b) it3.next();
            while (true) {
                str = null;
                if (arrayDeque.size() < intValue) {
                    break;
                }
                this.a.get().clearConditionalUserProperty(((a.c) arrayDeque.pollFirst()).f7066b, null, null);
            }
            String str3 = this.f7062b;
            Objects.requireNonNull(bVar2);
            a.c cVar3 = new a.c();
            cVar3.a = str3;
            cVar3.f7077m = bVar2.f7059f.getTime();
            cVar3.f7066b = bVar2.f7056c;
            cVar3.f7067c = bVar2.f7057d;
            if (!TextUtils.isEmpty(bVar2.f7058e)) {
                str = bVar2.f7058e;
            }
            cVar3.f7068d = str;
            cVar3.f7069e = bVar2.f7060g;
            cVar3.f7074j = bVar2.f7061h;
            this.a.get().b(cVar3);
            arrayDeque.offer(cVar3);
        }
    }
}
