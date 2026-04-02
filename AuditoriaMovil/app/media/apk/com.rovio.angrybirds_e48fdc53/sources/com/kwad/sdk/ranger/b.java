package com.kwad.sdk.ranger;

import android.text.TextUtils;
import android.util.Log;
import com.facebook.internal.ServerProtocol;
import com.kwad.sdk.utils.aw;
import com.kwad.sdk.utils.g;
import com.kwad.sdk.utils.s;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* loaded from: classes3.dex */
public class b {
    public static final String TAG = "Ranger_" + b.class.getSimpleName();
    private String value;

    /* loaded from: classes3.dex */
    static class a {
        private static final b aGK = new b((byte) 0);
    }

    private b() {
    }

    /* synthetic */ b(byte b) {
        this();
    }

    public static b Hk() {
        return a.aGK;
    }

    static /* synthetic */ com.kwad.sdk.ranger.b.a.c a(b bVar, String str, String str2) {
        return ah(str, str2);
    }

    private static Object a(com.kwad.sdk.ranger.a.a aVar, boolean z, Class<?> cls) {
        Object[] Hu = aVar.aHn.Hu();
        return (Hu == null || Hu.length == 0) ? z ? s.b(cls, aVar.aHn.name, new Object[0]) : s.f(aVar.aHi, aVar.aHn.name, new Object[0]) : z ? s.b(cls, aVar.aHn.name, Hu) : s.f(aVar.aHi, aVar.aHn.name, Hu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.kwad.sdk.ranger.a.a aVar) {
        com.kwad.sdk.ranger.a.a aVar2;
        Object b;
        if (aVar.aHo != null && !aVar.aHo.Hr()) {
            if (TextUtils.isEmpty(aVar.aHk)) {
                if (aVar.aHn != null && !aVar.aHn.Hr()) {
                    aVar2 = aVar.aHo;
                    b = b(aVar);
                }
                a(aVar.aHo);
            }
            aVar2 = aVar.aHo;
            b = c(aVar);
            aVar2.aHi = b;
            a(aVar.aHo);
        } else if (!TextUtils.isEmpty(aVar.aHk)) {
            l(c(aVar));
        } else if (aVar.aHn != null && !aVar.aHn.Hr()) {
            l(b(aVar));
        } else {
            String str = TAG;
            com.kwad.sdk.core.e.c.d(str, "node.nodeClassName:" + aVar.aHj);
            this.value = s.fu(aVar.aHj) ? ServerProtocol.DIALOG_RETURN_SCOPES_TRUE : "false";
        }
    }

    private static com.kwad.sdk.ranger.b.a.c ah(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        com.kwad.sdk.ranger.b.a.c cVar = new com.kwad.sdk.ranger.b.a.c();
        cVar.name = str;
        cVar.aHA = str2;
        return cVar;
    }

    private Object b(com.kwad.sdk.ranger.a.a aVar) {
        if (!aVar.aHn.aHw) {
            if (aVar.aHi != null) {
                return a(aVar, false, (Class<?>) null);
            }
            return null;
        }
        try {
            Class<?> cls = !TextUtils.isEmpty(aVar.aHj) ? Class.forName(aVar.aHj) : aVar.aHi != null ? aVar.aHi.getClass() : null;
            if (cls != null) {
                return a(aVar, true, cls);
            }
            return null;
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.w(TAG, Log.getStackTraceString(e));
            return null;
        }
    }

    private static Object c(com.kwad.sdk.ranger.a.a aVar) {
        if (aVar.aHl) {
            try {
                return s.c(Class.forName(aVar.aHj), aVar.aHk);
            } catch (Exception e) {
                com.kwad.sdk.core.e.c.w(TAG, Log.getStackTraceString(e));
            }
        } else if (aVar.aHi != null) {
            return s.f(aVar.aHi, aVar.aHk);
        }
        return null;
    }

    private void l(Object obj) {
        String str;
        if (obj != null) {
            str = String.valueOf(obj);
        } else {
            com.kwad.sdk.core.e.c.w(TAG, "value is null by ob null");
            str = "";
        }
        this.value = str;
    }

    public final void b(d dVar) {
        if (dVar == null || dVar.aGS == null || dVar.aGS.isEmpty()) {
            return;
        }
        final List<com.kwad.sdk.ranger.a.a> list = dVar.aGS;
        g.schedule(new aw() { // from class: com.kwad.sdk.ranger.b.1
            @Override // com.kwad.sdk.utils.aw
            public final void doTask() {
                ArrayList arrayList = new ArrayList();
                for (com.kwad.sdk.ranger.a.a aVar : list) {
                    if (aVar != null && !TextUtils.isEmpty(aVar.aHm)) {
                        String str = aVar.aHm;
                        b.this.a(aVar);
                        b bVar = b.this;
                        com.kwad.sdk.ranger.b.a.c a2 = b.a(bVar, str, bVar.value);
                        if (a2 != null) {
                            arrayList.add(a2);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                com.kwad.sdk.ranger.b.a.d dVar2 = new com.kwad.sdk.ranger.b.a.d();
                dVar2.aHB = arrayList;
                com.kwad.sdk.ranger.b.a.a(dVar2);
            }
        }, 120L, TimeUnit.SECONDS);
    }
}
