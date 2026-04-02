package com.adcolony.sdk;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.media.MediaPlayer;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class u extends FrameLayout {
    public static final int ADCOLONY_IAP_ENGAGEMENT_END_CARD = 0;
    public static final int ADCOLONY_IAP_ENGAGEMENT_OVERLAY = 1;
    float a;
    int b;
    private aa c;
    private aa d;
    private ac e;
    private String f;
    private String g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private ImageView l;
    private String m;
    private String n;
    private String o;
    private String p;
    private ExecutorService q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(Context context, d dVar, ac acVar) {
        super(context);
        this.m = "";
        this.n = "";
        this.o = "";
        this.p = "";
        this.a = 1.0f;
        this.b = 2;
        this.q = Executors.newSingleThreadExecutor();
        this.e = acVar;
        this.p = acVar.a;
        this.f = as.b(dVar.b(), "id");
        au.b.a("Retrieving container tied to ad session id: ").b(this.f);
        this.c = a.a().j().b().get(this.f);
        setLayoutParams(new FrameLayout.LayoutParams(this.c.o(), this.c.n()));
        addView(this.c);
        d();
    }

    public boolean destroy() {
        if (this.i) {
            au.e.b("Ignoring subsequent call to destroy()");
            return false;
        } else if (a.b()) {
            af a = a.a();
            this.i = true;
            JSONObject a2 = as.a();
            as.a(a2, "id", this.f);
            d dVar = this.j ? new d("AdSession.on_native_ad_view_destroyed", this.c.b(), a2) : new d("AdSession.on_ad_view_destroyed", this.c.b(), a2);
            if (a.v()) {
                a.c(dVar);
            } else {
                dVar.a();
            }
            return true;
        } else {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        ab j = a.a().j();
        j.a(this.c);
        if (this.d != null) {
            j.a(this.d);
        }
        ad remove = j.e().remove(this.f);
        if (remove != null) {
            for (MediaPlayer mediaPlayer : remove.c().c().values()) {
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
                mediaPlayer.release();
            }
            remove.d().a().autoPause();
            remove.d().a().release();
        }
        j.d().remove(this.f);
        this.c = null;
        this.e = null;
        removeAllViews();
        this.q.shutdown();
        return true;
    }

    public boolean setVolume(float f) {
        if (f < PangleAdapterUtils.CPM_DEFLAUT_VALUE || f > 1.0d) {
            return false;
        }
        if (this.i) {
            au.e.b("Ignoring call to setVolume as view has been destroyed.");
            return false;
        }
        if (f > PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
            this.a = f;
        }
        JSONObject a = as.a();
        as.a(a, "id", this.f);
        as.a(a, "volume", f);
        new d(this.j ? "AdSession.on_native_ad_view_set_volume" : "AdSession.on_ad_view_destroyed", this.c.b(), a).a();
        return true;
    }

    public boolean setMuted(boolean z) {
        if (this.i) {
            au.e.b("Ignoring call to setMuted() as view has been destroyed");
            return false;
        } else if (z) {
            return setVolume(0.0f);
        } else {
            return setVolume(this.a);
        }
    }

    public String getZoneID() {
        if (this.i) {
            au.e.b("Ignoring call to getZoneID() as view has been destroyed");
            return "";
        }
        return this.p;
    }

    public boolean pause() {
        if (this.i) {
            au.e.b("Ignoring call to pause() as view has been destroyed");
            return false;
        }
        JSONObject a = as.a();
        as.a(a, "id", this.f);
        new d("AdSession.on_manual_pause", this.c.b(), a).a();
        return true;
    }

    public boolean resume() {
        if (this.i) {
            au.e.b("Ignoring call to resume() as view has been destroyed");
            return false;
        }
        JSONObject a = as.a();
        as.a(a, "id", this.f);
        new d("AdSession.on_manual_resume", this.c.b(), a).a();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        if (this.g.equals("") || !a.d()) {
            return false;
        }
        this.l = new ImageView(a.c());
        this.l.setImageBitmap(BitmapFactory.decodeFile(this.g));
        return true;
    }

    private void d() {
        try {
            this.q.submit(new Runnable() { // from class: com.adcolony.sdk.u.1
                @Override // java.lang.Runnable
                public void run() {
                    JSONObject a = as.a();
                    as.a(a, "id", u.this.f);
                    while (!u.this.i) {
                        Rect rect = new Rect();
                        Rect rect2 = new Rect();
                        u.this.getLocalVisibleRect(rect);
                        u.this.getGlobalVisibleRect(rect2);
                        ViewParent parent = u.this.getParent();
                        if (parent != null) {
                            parent.getChildVisibleRect(u.this, rect2, null);
                        }
                        boolean z = rect.bottom - rect.top > u.this.c.n() / 2;
                        boolean z2 = (rect2.bottom - rect2.top < u.this.c.n() / 2 || rect2.bottom - rect2.top >= u.this.c.n()) && u.this.k;
                        boolean z3 = rect.bottom > u.this.c.n() || rect.bottom < 0 || rect.top < 0 || rect2.top <= 0;
                        if (!z3 && !z2 && z && !u.this.h) {
                            u.this.k = true;
                            u.this.h = true;
                            new d(u.this.j ? "AdSession.on_native_ad_view_visible" : "AdSession.on_ad_view_visible", u.this.c.b(), a).a();
                        } else if ((!z || (z && z3)) && u.this.h) {
                            u.this.h = false;
                            new d(u.this.j ? "AdSession.on_native_ad_view_hidden" : "AdSession.on_ad_view_hidden", u.this.c.b(), a).a();
                            au.d.b("AdColonyAdView has been hidden.");
                        }
                        try {
                            Thread.sleep(50L);
                        } catch (InterruptedException e) {
                        }
                    }
                }
            });
        } catch (RejectedExecutionException e) {
            JSONObject a = as.a();
            as.a(a, "id", this.f);
            new d("AdSession.on_error", this.c.b(), a).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setNative(boolean z) {
        this.j = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setAdvertiserName(String str) {
        this.m = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setTitle(String str) {
        this.n = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setDescription(String str) {
        this.o = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setImageFilepath(String str) {
        this.g = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setExpandedContainer(aa aaVar) {
        this.d = aaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getAdSessionId() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public aa getContainer() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public aa getExpandedContainer() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getAdvertiserName() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ImageView getIcon() {
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getTitle() {
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getDescription() {
        return this.o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ac getListener() {
        return this.e;
    }
}
