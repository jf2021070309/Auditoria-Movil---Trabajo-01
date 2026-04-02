package com.iab.omid.library.applovin.walking.a;

import com.iab.omid.library.applovin.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class e extends a {
    public e(b.InterfaceC0100b interfaceC0100b, HashSet<String> hashSet, JSONObject jSONObject, long j2) {
        super(interfaceC0100b, hashSet, jSONObject, j2);
    }

    private void b(String str) {
        com.iab.omid.library.applovin.b.a a = com.iab.omid.library.applovin.b.a.a();
        if (a != null) {
            for (com.iab.omid.library.applovin.adsession.a aVar : a.b()) {
                if (((a) this).a.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().b(str, this.f4834c);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f4833b.toString();
    }

    @Override // com.iab.omid.library.applovin.walking.a.b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        b(str);
        super.onPostExecute(str);
    }
}
