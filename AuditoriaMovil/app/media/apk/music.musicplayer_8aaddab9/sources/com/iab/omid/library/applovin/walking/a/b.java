package com.iab.omid.library.applovin.walking.a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public abstract class b extends AsyncTask<Object, Void, String> {
    private a a;

    /* renamed from: d  reason: collision with root package name */
    public final InterfaceC0100b f4836d;

    /* loaded from: classes2.dex */
    public interface a {
        void a(b bVar);
    }

    /* renamed from: com.iab.omid.library.applovin.walking.a.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0100b {
        void a(JSONObject jSONObject);

        JSONObject b();
    }

    public b(InterfaceC0100b interfaceC0100b) {
        this.f4836d = interfaceC0100b;
    }

    public void a(a aVar) {
        this.a = aVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
