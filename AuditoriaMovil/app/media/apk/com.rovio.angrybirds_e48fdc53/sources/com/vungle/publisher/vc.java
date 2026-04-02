package com.vungle.publisher;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.vungle.publisher.bw;
import com.vungle.publisher.env.r;
import com.vungle.publisher.hk;
import com.vungle.publisher.log.Logger;
import com.vungle.publisher.wm;
import dagger.Lazy;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.json.JSONException;
import org.json.JSONObject;
import rx.Observable;
import rx.schedulers.Schedulers;
import rx.subjects.PublishSubject;
@Singleton
/* loaded from: classes4.dex */
public class vc extends tq {
    @Inject
    qg a;
    @Inject
    protected bw b;
    @Inject
    Lazy<yk> c;
    @Inject
    com.vungle.publisher.env.o d;
    @Inject
    zf e;
    @Inject
    wm.a f;
    @Inject
    Lazy<r> g;
    @Inject
    String h;
    @Inject
    com.vungle.publisher.log.g i;
    @Inject
    yd j;
    @Inject
    hk.a k;
    private PublishSubject<Boolean> l = PublishSubject.create();

    public void a(cz<?, ?, ?, ?> czVar) {
        qw.a(czVar).retryWhen(this.j.a("config failure retry")).subscribe(vd.a(this, czVar), vi.a(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ void a(cz czVar, JsonObject jsonObject) {
        this.i.c.info("report ad successfully sent");
        this.c.get().a(czVar.c_());
        czVar.i().r();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ void d(Throwable th) {
        this.i.c.severe("error sending report ad: " + th.getMessage());
    }

    public void a(String str, JsonObject jsonObject) {
        qw.b(jsonObject).subscribe(vj.a(this, str), vk.a(this, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ void b(String str, JsonObject jsonObject) {
        File file = new File(str);
        if (file != null && file.exists()) {
            file.delete();
        }
        this.i.c.info("logs successfully reported");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ void a(String str, Throwable th) {
        File file = new File(str);
        if (file != null && file.exists()) {
            file.delete();
        }
        this.i.c.severe("error while reporting logs: " + th.getMessage());
    }

    public void a() {
        this.l.flatMap(vl.a(this, zk.f(this.h) ? "https://adr.api.vungle.col/config" : this.h)).subscribe(vm.a(this), vn.a(this));
        this.l.onNext(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ Observable a(String str, Boolean bool) {
        return qw.a(str, this.d.d()).retryWhen(this.j.a("config failure retry"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ void c(JsonObject jsonObject) {
        this.i.c.info("request config successful");
        ArrayList arrayList = new ArrayList();
        Iterator<JsonElement> it = jsonObject.getAsJsonArray("placements").iterator();
        while (it.hasNext()) {
            s sVar = new s();
            JsonObject asJsonObject = it.next().getAsJsonObject();
            sVar.b = asJsonObject.get("is_auto_cached").getAsBoolean();
            sVar.c = asJsonObject.get("is_incentivized").getAsBoolean();
            sVar.a = asJsonObject.get("reference_id").getAsString();
            arrayList.add(sVar);
        }
        this.d.a(arrayList);
        hk[] d = this.k.d(arrayList);
        int b = this.k.b(d);
        if (b < d.length) {
            this.i.c.warning("Not all Placement were inserted or Updated. Expected: " + d.length + " Actual: " + b);
        }
        if (jsonObject.has("will_play_ad")) {
            JsonObject asJsonObject2 = jsonObject.getAsJsonObject("will_play_ad");
            if (asJsonObject2.has("enabled")) {
                this.d.a(asJsonObject2.get("enabled").getAsBoolean());
                this.d.a(asJsonObject2.get("request_timeout").getAsInt());
            }
        }
        if (jsonObject.has("config")) {
            JsonObject asJsonObject3 = jsonObject.getAsJsonObject("config");
            if (asJsonObject3.has("refresh_time")) {
                Observable.timer(asJsonObject3.get("refresh_time").getAsLong(), TimeUnit.MILLISECONDS, Schedulers.io()).take(1).subscribe(vh.a(this));
            }
        }
        if (jsonObject.has("playback")) {
            JsonObject asJsonObject4 = jsonObject.getAsJsonObject("playback");
            if (asJsonObject4.has("buffer_timeout")) {
                this.d.b(asJsonObject4.get("buffer_timeout").getAsInt());
            } else {
                Logger.w(Logger.PROTOCOL_TAG, "null playback buffer timeout millis");
            }
        } else {
            Logger.w(Logger.PROTOCOL_TAG, "null playback buffer timeout millis");
        }
        if (jsonObject.has("viewability")) {
            JsonObject asJsonObject5 = jsonObject.getAsJsonObject("viewability");
            if (asJsonObject5.has("moat")) {
                this.d.a(Boolean.valueOf(asJsonObject5.get("moat").getAsBoolean()));
            }
        }
        if (this.d.g() && !this.d.h()) {
            this.e.a();
        }
        if (jsonObject.has("logging")) {
            JsonObject asJsonObject6 = jsonObject.getAsJsonObject("logging");
            if (asJsonObject6.has("enabled")) {
                this.d.b(Boolean.valueOf(asJsonObject6.get("enabled").getAsBoolean()));
            }
            this.i.c.info("setting logger status to " + this.d.i());
            this.i.a(this.d.i());
        }
        if (jsonObject.has("exception_reporting")) {
            this.d.b(jsonObject.get("exception_reporting").getAsBoolean());
        }
        if (jsonObject.has("vduid")) {
            this.d.a(jsonObject.get("vduid").getAsString());
        }
        this.a.a(new td(true, null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ void a(Long l) {
        this.l.onNext(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ void c(Throwable th) {
        this.i.c.severe("error sending request config: " + th.getMessage());
    }

    public void a(String str, String str2) {
        qw.a(str, false, str2).subscribe(vo.a(this), vp.a(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ void b(JsonObject jsonObject) {
        try {
            this.a.a(new au(this.f.e(new JSONObject(jsonObject.toString())), null));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ void b(Throwable th) {
        this.i.c.severe("error requesting streaming ad: " + th.getMessage());
        this.a.a(new ak());
    }

    public void b() {
        qw.b().retry(5L).subscribe(ve.a(this), vf.a(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ void a(JsonObject jsonObject) {
        this.i.c.info("sending track install successful");
        this.g.get().b(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ void a(Throwable th) {
        this.i.c.severe("error sending track install: " + th.getMessage());
    }

    public void c() {
        this.b.a(vg.a(this), bw.b.unfilledAd);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ void d() {
        try {
            qw.c();
        } catch (Exception e) {
            this.i.c.severe("error sending unfilled ad: " + e.getMessage());
        }
    }
}
