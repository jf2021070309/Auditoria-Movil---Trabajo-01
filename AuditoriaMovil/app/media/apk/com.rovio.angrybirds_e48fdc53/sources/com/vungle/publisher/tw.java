package com.vungle.publisher;

import java.net.HttpURLConnection;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public class tw {
    long a;
    private HttpURLConnection b;
    private int c;
    private String d;
    private List<ts> e;

    public HttpURLConnection a() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        this.c = i;
    }

    public int b() {
        return this.c;
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a {
        @Inject
        Provider<tw> a;

        public tw a(HttpURLConnection httpURLConnection, int i, List<ts> list, long j) {
            tw twVar = this.a.get();
            twVar.b = httpURLConnection;
            twVar.e = list;
            twVar.c = i;
            twVar.d = httpURLConnection == null ? null : String.valueOf(httpURLConnection.getURL());
            twVar.a = j;
            return twVar;
        }
    }
}
