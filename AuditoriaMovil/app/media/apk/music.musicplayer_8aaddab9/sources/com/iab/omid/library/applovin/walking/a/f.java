package com.iab.omid.library.applovin.walking.a;

import android.text.TextUtils;
import com.iab.omid.library.applovin.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class f extends a {
    public f(b.InterfaceC0100b interfaceC0100b, HashSet<String> hashSet, JSONObject jSONObject, long j2) {
        super(interfaceC0100b, hashSet, jSONObject, j2);
    }

    private void b(String str) {
        com.iab.omid.library.applovin.b.a a = com.iab.omid.library.applovin.b.a.a();
        if (a != null) {
            for (com.iab.omid.library.applovin.adsession.a aVar : a.b()) {
                if (((a) this).a.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().a(str, this.f4834c);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.applovin.d.b.b(this.f4833b, this.f4836d.b())) {
            return null;
        }
        this.f4836d.a(this.f4833b);
        return this.f4833b.toString();
    }

    @Override // com.iab.omid.library.applovin.walking.a.b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
        super.onPostExecute(str);
    }
}
