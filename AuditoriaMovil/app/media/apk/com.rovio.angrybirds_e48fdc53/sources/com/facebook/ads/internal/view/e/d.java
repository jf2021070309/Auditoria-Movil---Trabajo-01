package com.facebook.ads.internal.view.e;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.facebook.ads.internal.b.c;
import com.facebook.ads.internal.q.a.o;
import com.facebook.ads.internal.q.a.u;
import com.facebook.internal.NativeProtocol;
import com.umeng.analytics.pro.bg;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class d implements o<Bundle> {
    private final String a;
    private boolean b;
    private final Context c;
    private final com.facebook.ads.internal.m.c d;
    private final a e;
    private final com.facebook.ads.internal.b.a f;
    private int g;
    private int h;
    private final com.facebook.ads.internal.view.e.a i;

    /* loaded from: classes2.dex */
    public interface a {
        boolean g();

        int getCurrentPosition();

        boolean getGlobalVisibleRect(Rect rect);

        long getInitialBufferTime();

        int getMeasuredHeight();

        int getMeasuredWidth();

        com.facebook.ads.internal.view.e.a.a getVideoStartReason();

        float getVolume();

        boolean i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes2.dex */
    public enum b {
        PLAY(0),
        SKIP(1),
        TIME(2),
        MRC(3),
        PAUSE(4),
        RESUME(5),
        MUTE(6),
        UNMUTE(7),
        VIEWABLE_IMPRESSION(10);
        
        public final int j;

        b(int i) {
            this.j = i;
        }
    }

    public d(Context context, com.facebook.ads.internal.m.c cVar, a aVar, List<com.facebook.ads.internal.b.b> list, String str) {
        this(context, cVar, aVar, list, str, null);
    }

    public d(Context context, final com.facebook.ads.internal.m.c cVar, a aVar, List<com.facebook.ads.internal.b.b> list, final String str, Bundle bundle) {
        this.b = true;
        this.g = 0;
        this.h = 0;
        this.c = context;
        this.d = cVar;
        this.e = aVar;
        this.a = str;
        list.add(new com.facebook.ads.internal.b.b(0.5d, -1.0d, 2.0d, true) { // from class: com.facebook.ads.internal.view.e.d.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.ads.internal.b.b
            public void a(boolean z, boolean z2, com.facebook.ads.internal.b.c cVar2) {
                cVar.d(str, d.this.a(b.MRC));
            }
        });
        list.add(new com.facebook.ads.internal.b.b(1.0E-7d, -1.0d, 0.001d, false) { // from class: com.facebook.ads.internal.view.e.d.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.ads.internal.b.b
            public void a(boolean z, boolean z2, com.facebook.ads.internal.b.c cVar2) {
                cVar.d(str, d.this.a(b.VIEWABLE_IMPRESSION));
            }
        });
        if (bundle != null) {
            this.f = new com.facebook.ads.internal.b.a((View) aVar, list, bundle.getBundle("adQualityManager"));
            this.g = bundle.getInt("lastProgressTimeMS");
            this.h = bundle.getInt("lastBoundaryTimeMS");
        } else {
            this.f = new com.facebook.ads.internal.b.a((View) aVar, list);
        }
        this.i = new com.facebook.ads.internal.view.e.a(new Handler(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> a(b bVar) {
        return a(bVar, this.e.getCurrentPosition());
    }

    private Map<String, String> a(b bVar, int i) {
        Map<String, String> c = c(i);
        c.put(NativeProtocol.WEB_DIALOG_ACTION, String.valueOf(bVar.j));
        return c;
    }

    private void a(int i, boolean z) {
        if (i <= PangleAdapterUtils.CPM_DEFLAUT_VALUE || i < this.g) {
            return;
        }
        if (i > this.g) {
            this.f.a((i - this.g) / 1000.0f, d());
            this.g = i;
            if (i - this.h >= 5000) {
                this.d.d(this.a, a(b.TIME, i));
                this.h = this.g;
                this.f.a();
                return;
            }
        }
        if (z) {
            this.d.d(this.a, a(b.TIME, i));
        }
    }

    private void a(Map<String, String> map) {
        map.put("exoplayer", String.valueOf(this.e.g()));
        map.put("prep", Long.toString(this.e.getInitialBufferTime()));
    }

    private void a(Map<String, String> map, int i) {
        map.put("ptime", String.valueOf(this.h / 1000.0f));
        map.put("time", String.valueOf(i / 1000.0f));
    }

    private void b(Map<String, String> map) {
        com.facebook.ads.internal.b.c b2 = this.f.b();
        c.a b3 = b2.b();
        map.put("vwa", String.valueOf(b3.c()));
        map.put("vwm", String.valueOf(b3.b()));
        map.put("vwmax", String.valueOf(b3.d()));
        map.put("vtime_ms", String.valueOf(b3.f() * 1000.0d));
        map.put("mcvt_ms", String.valueOf(b3.g() * 1000.0d));
        c.a c = b2.c();
        map.put("vla", String.valueOf(c.c()));
        map.put("vlm", String.valueOf(c.b()));
        map.put("vlmax", String.valueOf(c.d()));
        map.put("atime_ms", String.valueOf(c.f() * 1000.0d));
        map.put("mcat_ms", String.valueOf(c.g() * 1000.0d));
    }

    private Map<String, String> c(int i) {
        HashMap hashMap = new HashMap();
        u.a(hashMap, this.e.getVideoStartReason() == com.facebook.ads.internal.view.e.a.a.AUTO_STARTED, this.e.i() ? false : true);
        a(hashMap);
        b(hashMap);
        a(hashMap, i);
        c(hashMap);
        return hashMap;
    }

    private void c(Map<String, String> map) {
        Rect rect = new Rect();
        this.e.getGlobalVisibleRect(rect);
        map.put("pt", String.valueOf(rect.top));
        map.put(bg.az, String.valueOf(rect.left));
        map.put("ph", String.valueOf(this.e.getMeasuredHeight()));
        map.put("pw", String.valueOf(this.e.getMeasuredWidth()));
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.c.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        map.put("vph", String.valueOf(displayMetrics.heightPixels));
        map.put("vpw", String.valueOf(displayMetrics.widthPixels));
    }

    public void a(int i) {
        a(i, false);
    }

    public void a(int i, int i2) {
        a(i, true);
        this.h = i2;
        this.g = i2;
        this.f.a();
    }

    public void b() {
        this.c.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.i);
    }

    public void b(int i) {
        a(i, true);
        this.h = 0;
        this.g = 0;
        this.f.a();
    }

    public void c() {
        this.c.getContentResolver().unregisterContentObserver(this.i);
    }

    protected float d() {
        return u.a(this.c) * this.e.getVolume();
    }

    public void e() {
        if (d() < 0.05d) {
            if (this.b) {
                f();
                this.b = false;
            }
        } else if (this.b) {
        } else {
            h();
            this.b = true;
        }
    }

    public void f() {
        this.d.d(this.a, a(b.MUTE));
    }

    @Override // com.facebook.ads.internal.q.a.o
    public Bundle g() {
        a(l(), l());
        Bundle bundle = new Bundle();
        bundle.putInt("lastProgressTimeMS", this.g);
        bundle.putInt("lastBoundaryTimeMS", this.h);
        bundle.putBundle("adQualityManager", this.f.g());
        return bundle;
    }

    public void h() {
        this.d.d(this.a, a(b.UNMUTE));
    }

    public void i() {
        this.d.d(this.a, a(b.SKIP));
    }

    public void j() {
        this.d.d(this.a, a(b.PAUSE));
    }

    public void k() {
        this.d.d(this.a, a(b.RESUME));
    }

    public int l() {
        return this.g;
    }
}
