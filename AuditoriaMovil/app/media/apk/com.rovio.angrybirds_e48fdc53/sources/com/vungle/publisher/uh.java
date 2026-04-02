package com.vungle.publisher;

import java.net.HttpURLConnection;
import java.net.URL;
import javax.inject.Singleton;
@Singleton
/* loaded from: classes4.dex */
public class uh {
    public HttpURLConnection a(String str) {
        return (HttpURLConnection) new URL(str).openConnection();
    }
}
