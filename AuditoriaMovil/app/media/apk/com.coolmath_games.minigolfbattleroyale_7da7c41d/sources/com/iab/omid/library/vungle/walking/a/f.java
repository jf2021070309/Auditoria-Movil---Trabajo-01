package com.iab.omid.library.vungle.walking.a;

import android.text.TextUtils;
import com.iab.omid.library.vungle.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class f extends a {
    public f(b.InterfaceC0078b interfaceC0078b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0078b, hashSet, jSONObject, j);
    }

    private void b(String str) {
        com.iab.omid.library.vungle.b.a a = com.iab.omid.library.vungle.b.a.a();
        if (a != null) {
            for (com.iab.omid.library.vungle.adsession.a aVar : a.b()) {
                if (this.a.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().a(str, this.c);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.vungle.d.b.b(this.b, this.d.b())) {
            return null;
        }
        this.d.a(this.b);
        return this.b.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.vungle.walking.a.b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
        super.onPostExecute(str);
    }
}
