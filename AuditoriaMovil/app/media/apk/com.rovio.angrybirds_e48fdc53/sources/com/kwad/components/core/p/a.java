package com.kwad.components.core.p;

import android.content.Context;
import com.kwad.components.core.o.a.b;
import com.kwad.components.offline.api.BuildConfig;
import com.kwad.sdk.collector.f;
import com.kwad.sdk.core.config.d;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.core.report.i;
import com.kwad.sdk.core.report.r;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.internal.api.SceneImpl;
import com.kwad.sdk.utils.InstalledAppInfoManager;
import com.kwad.sdk.utils.aw;
import com.kwad.sdk.utils.g;
import com.kwad.sdk.utils.l;
import com.kwad.sdk.utils.t;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class a {
    private static boolean PC = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.kwad.components.core.p.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0205a {
        private static final a PE = new a();
    }

    protected a() {
    }

    private static r a(long j, AdTemplate adTemplate, String str) {
        return new r(j, adTemplate, str);
    }

    private static r b(long j, AdTemplate adTemplate) {
        return new r(j, adTemplate);
    }

    public static a pC() {
        return C0205a.PE;
    }

    public static r z(long j) {
        return new r(j);
    }

    public final void X(AdTemplate adTemplate) {
        i.a2(b(10007L, adTemplate));
    }

    public final void Y(AdTemplate adTemplate) {
        i.a2(b(10208L, adTemplate));
    }

    public final void Z(AdTemplate adTemplate) {
        i.a2(b(10209L, adTemplate));
    }

    public final void a(int i, AdTemplate adTemplate, String str) {
        i.a2(a(i, adTemplate, str));
    }

    public final void a(long j, int i) {
        if (d.zQ()) {
            r z = z(20000L);
            z.timestamp = System.currentTimeMillis();
            z.asA = i;
            z.posId = j;
            z.asB = BuildConfig.VERSION_CODE;
            i.a2(z);
        }
    }

    public final void a(b bVar) {
        r z = z(10215L);
        z.Pt = bVar.Pt;
        z.Pz = bVar.Pz;
        z.PA = bVar.PA;
        z.PB = bVar.PB;
        i.a2(z);
    }

    public final void a(AdTemplate adTemplate, int i, int i2) {
        r b = b(12006L, adTemplate);
        b.UT = i;
        b.arG = i2;
        i.a2(b);
    }

    public final void a(AdTemplate adTemplate, long j, int i) {
        r b = b(104L, adTemplate);
        b.clickTime = l.cG(adTemplate);
        b.asf = j;
        b.asg = i;
        i.a2(b);
    }

    public final void a(AdTemplate adTemplate, long j, long j2, int i) {
        r b = b(10203L, adTemplate);
        b.Xl = j;
        b.blockDuration = j2;
        b.arF = i;
        i.a2(b);
    }

    public final void a(AdTemplate adTemplate, String str, String str2) {
        r b = b(10003L, adTemplate);
        b.arQ = str;
        b.errorMsg = str2;
        i.a2(b);
    }

    public final void a(SceneImpl sceneImpl, boolean z, String str) {
        r z2 = z(10216L);
        z2.asb = z;
        z2.asc = str;
        z2.adScene = sceneImpl;
        i.a2(z2);
    }

    public final void a(boolean z, List<Integer> list) {
        r z2 = z(10204L);
        z2.asb = z;
        if (list.size() > 0) {
            JSONArray jSONArray = new JSONArray();
            for (Integer num : list) {
                jSONArray.put(num);
            }
            z2.asa = jSONArray;
        }
        i.a2(z2);
    }

    public final void aA(int i) {
        r z = z(10104L);
        z.arR = i;
        i.a2(z);
    }

    public final void aB(int i) {
        r z = z(10107L);
        z.arS = i;
        i.a2(z);
    }

    public final void ah(Context context) {
        r z = z(11L);
        JSONArray[] c = InstalledAppInfoManager.c(context, d.xz());
        z.arJ = c[0];
        z.arK = c[1];
        i.a2(z);
    }

    public final void b(AdTemplate adTemplate, int i, int i2) {
        r b = b(10002L, adTemplate);
        b.Ce();
        b.arQ = com.kwad.sdk.core.response.b.d.cc(adTemplate) ? com.kwad.sdk.core.response.b.a.F(com.kwad.sdk.core.response.b.d.ck(adTemplate)) : com.kwad.sdk.core.response.b.d.cm(adTemplate);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("what", i);
            jSONObject.put("extra", i2);
            b.errorMsg = jSONObject.toString();
        } catch (JSONException e) {
            c.printStackTraceOnly(e);
        }
        i.a2(b);
    }

    public final void b(AdTemplate adTemplate, String str, String str2) {
        r b = b(10005L, adTemplate);
        b.arQ = com.kwad.sdk.core.response.b.d.cc(adTemplate) ? com.kwad.sdk.core.response.b.a.F(com.kwad.sdk.core.response.b.d.ck(adTemplate)) : com.kwad.sdk.core.response.b.d.cm(adTemplate);
        b.arQ = str;
        b.errorMsg = str2;
        i.a2(b);
    }

    public final void c(AdTemplate adTemplate, int i, String str) {
        r b = b(10109L, adTemplate);
        b.arS = 1;
        b.arT = str;
        i.a2(b);
    }

    public final void c(JSONArray jSONArray) {
        r z = z(10200L);
        z.arV = jSONArray;
        i.a2(z);
    }

    public final void d(AdTemplate adTemplate, int i, String str) {
        r b = b(107L, adTemplate);
        b.errorCode = i;
        b.errorMsg = str;
        i.a2(b);
    }

    public final void e(String str, String str2, boolean z) {
        r z2 = z(12200L);
        z2.asy = str;
        z2.asz = str2;
        i.a(z2, z);
    }

    public final void e(JSONObject jSONObject, int i) {
        r z = z(10201L);
        t.putValue(jSONObject, "appChangeType", i);
        z.arU = jSONObject;
        i.a2(z);
    }

    public final void f(AdTemplate adTemplate, int i) {
        r b = b(10108L, adTemplate);
        b.arS = i;
        i.a2(b);
    }

    public final void g(AdTemplate adTemplate, int i) {
        if (d.zQ()) {
            AdInfo ck = com.kwad.sdk.core.response.b.d.ck(adTemplate);
            r z = z(20000L);
            z.timestamp = System.currentTimeMillis();
            z.asA = i;
            z.trace = ck.trace;
            z.asB = BuildConfig.VERSION_CODE;
            z.posId = com.kwad.sdk.core.response.b.d.cd(adTemplate);
            i.a2(z);
        }
    }

    public final void g(AdTemplate adTemplate, long j) {
        r b = b(10202L, adTemplate);
        b.arZ = j;
        i.a2(b);
    }

    public final void h(AdTemplate adTemplate, long j) {
        r b = b(10206L, adTemplate);
        b.asp = j;
        i.a2(b);
    }

    public final void i(AdTemplate adTemplate, long j) {
        r b = b(10207L, adTemplate);
        b.asq = j;
        i.a2(b);
    }

    public final void pD() {
        if (PC) {
            return;
        }
        PC = true;
        g.execute(new aw() { // from class: com.kwad.components.core.p.a.1
            @Override // com.kwad.sdk.utils.aw
            public final void doTask() {
                r z = a.z(8L);
                z.asr = f.yE();
                i.a2(z);
            }
        });
    }

    public final void pE() {
        i.a2(z(10101L));
    }

    public final void pF() {
        i.a2(z(10106L));
    }
}
