package e.d.b.b.j.y;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class k implements e {
    public final a a;

    /* renamed from: b  reason: collision with root package name */
    public final i f6304b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, m> f6305c;

    /* loaded from: classes.dex */
    public static class a {
        public final Context a;

        /* renamed from: b  reason: collision with root package name */
        public Map<String, String> f6306b = null;

        public a(Context context) {
            this.a = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public e.d.b.b.j.y.d a(java.lang.String r15) {
            /*
                Method dump skipped, instructions count: 254
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: e.d.b.b.j.y.k.a.a(java.lang.String):e.d.b.b.j.y.d");
        }
    }

    public k(Context context, i iVar) {
        a aVar = new a(context);
        this.f6305c = new HashMap();
        this.a = aVar;
        this.f6304b = iVar;
    }

    @Override // e.d.b.b.j.y.e
    public synchronized m get(String str) {
        if (this.f6305c.containsKey(str)) {
            return this.f6305c.get(str);
        }
        d a2 = this.a.a(str);
        if (a2 == null) {
            return null;
        }
        i iVar = this.f6304b;
        m create = a2.create(new c(iVar.a, iVar.f6300b, iVar.f6301c, str));
        this.f6305c.put(str, create);
        return create;
    }
}
