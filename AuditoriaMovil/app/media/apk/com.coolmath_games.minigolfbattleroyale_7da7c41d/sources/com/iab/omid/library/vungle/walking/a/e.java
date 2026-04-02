package com.iab.omid.library.vungle.walking.a;

import com.iab.omid.library.vungle.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class e extends a {
    public e(b.InterfaceC0078b interfaceC0078b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0078b, hashSet, jSONObject, j);
    }

    private void b(String str) {
        com.iab.omid.library.vungle.b.a a = com.iab.omid.library.vungle.b.a.a();
        if (a != null) {
            for (com.iab.omid.library.vungle.adsession.a aVar : a.b()) {
                if (this.a.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().b(str, this.c);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.b.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.vungle.walking.a.b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        b(str);
        super.onPostExecute(str);
    }
}
