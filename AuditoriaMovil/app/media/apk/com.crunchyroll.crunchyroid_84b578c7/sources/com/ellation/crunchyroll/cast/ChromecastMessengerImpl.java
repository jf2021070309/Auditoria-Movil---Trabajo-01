package com.ellation.crunchyroll.cast;

import android.annotation.SuppressLint;
import android.os.Handler;
import com.amazon.aps.iva.mf0.a;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.ye.b;
import com.amazon.aps.iva.ye.g;
import com.google.gson.Gson;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChromecastMessengerImpl.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/ellation/crunchyroll/cast/ChromecastMessengerImpl;", "Lcom/ellation/crunchyroll/cast/ChromecastMessengerInternal;", "Lcom/amazon/aps/iva/ye/g;", "event", "Lcom/amazon/aps/iva/kb0/q;", "sendMessage", "", "channel", "Ljava/lang/String;", "Lkotlin/Function0;", "Lcom/amazon/aps/iva/ye/b;", "getCastSession", "Lcom/amazon/aps/iva/xb0/a;", "Lcom/google/gson/Gson;", "gson", "Lcom/google/gson/Gson;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "<init>", "(Ljava/lang/String;Lcom/amazon/aps/iva/xb0/a;Lcom/google/gson/Gson;Landroid/os/Handler;)V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ChromecastMessengerImpl implements ChromecastMessengerInternal {
    private final String channel;
    private final com.amazon.aps.iva.xb0.a<b> getCastSession;
    private final Gson gson;
    private final Handler handler;

    /* JADX WARN: Multi-variable type inference failed */
    public ChromecastMessengerImpl(String str, com.amazon.aps.iva.xb0.a<? extends b> aVar, Gson gson, Handler handler) {
        j.f(str, "channel");
        j.f(aVar, "getCastSession");
        j.f(gson, "gson");
        j.f(handler, "handler");
        this.channel = str;
        this.getCastSession = aVar;
        this.gson = gson;
        this.handler = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendMessage$lambda$0(g gVar, ChromecastMessengerImpl chromecastMessengerImpl) {
        j.f(gVar, "$event");
        j.f(chromecastMessengerImpl, "this$0");
        a.C0515a c0515a = com.amazon.aps.iva.mf0.a.a;
        c0515a.f("Chromecast message: " + gVar, new Object[0]);
        b invoke = chromecastMessengerImpl.getCastSession.invoke();
        if (invoke != null) {
            String str = chromecastMessengerImpl.channel;
            String json = chromecastMessengerImpl.gson.toJson(gVar);
            j.e(json, "gson.toJson(event)");
            invoke.sendMessage(str, json);
        }
    }

    @Override // com.ellation.crunchyroll.cast.ChromecastMessengerInternal, com.amazon.aps.iva.ye.h
    @SuppressLint({"ForbiddenMethod"})
    public void sendMessage(final g gVar) {
        j.f(gVar, "event");
        this.handler.post(new Runnable() { // from class: com.ellation.crunchyroll.cast.a
            @Override // java.lang.Runnable
            public final void run() {
                ChromecastMessengerImpl.sendMessage$lambda$0(g.this, this);
            }
        });
    }
}
