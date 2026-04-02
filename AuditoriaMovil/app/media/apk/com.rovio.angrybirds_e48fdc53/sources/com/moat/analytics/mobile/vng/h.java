package com.moat.analytics.mobile.vng;

import android.view.View;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes2.dex */
abstract class h<PlayerOrIMAAd> extends c<PlayerOrIMAAd> {
    int l;
    private a m;
    private int n;
    private double o;
    private int p;
    private int q;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes2.dex */
    public enum a {
        UNINITIALIZED,
        PAUSED,
        PLAYING,
        STOPPED,
        COMPLETED
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(String str) {
        super(str);
        this.p = Integer.MIN_VALUE;
        this.l = Integer.MIN_VALUE;
        this.n = Integer.MIN_VALUE;
        this.o = Double.NaN;
        this.q = 0;
        this.m = a.UNINITIALIZED;
    }

    private void n() {
        this.h.postDelayed(new Runnable() { // from class: com.moat.analytics.mobile.vng.h.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (h.this.j.get() == null || h.this.i()) {
                        h.this.h();
                    } else if (Boolean.valueOf(h.this.m()).booleanValue()) {
                        h.this.h.postDelayed(this, 200L);
                    } else {
                        h.this.h();
                    }
                } catch (Exception e) {
                    h.this.h();
                    m.a(e);
                }
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.moat.analytics.mobile.vng.c
    public JSONObject a(MoatAdEvent moatAdEvent) {
        Integer valueOf;
        if (moatAdEvent.b.equals(MoatAdEvent.a)) {
            try {
                valueOf = j();
            } catch (Exception e) {
                valueOf = Integer.valueOf(this.n);
            }
            moatAdEvent.b = valueOf;
        } else {
            valueOf = moatAdEvent.b;
        }
        if (moatAdEvent.b.intValue() < 0 || (moatAdEvent.b.intValue() == 0 && moatAdEvent.d == MoatAdEventType.AD_EVT_COMPLETE && this.n > 0)) {
            valueOf = Integer.valueOf(this.n);
            moatAdEvent.b = valueOf;
        }
        if (moatAdEvent.d == MoatAdEventType.AD_EVT_COMPLETE) {
            if (valueOf.intValue() == Integer.MIN_VALUE || this.l == Integer.MIN_VALUE || !a(valueOf, Integer.valueOf(this.l))) {
                this.m = a.STOPPED;
                moatAdEvent.d = MoatAdEventType.AD_EVT_STOPPED;
            } else {
                this.m = a.COMPLETED;
            }
        }
        return super.a(moatAdEvent);
    }

    @Override // com.moat.analytics.mobile.vng.c
    public boolean a(Map<String, String> map, PlayerOrIMAAd playerorimaad, View view) {
        try {
            if (!this.e) {
                n();
            }
        } catch (Exception e) {
            m.a(e);
        }
        return super.a(map, playerorimaad, view);
    }

    protected abstract Integer j();

    protected abstract boolean k();

    protected abstract Integer l();

    boolean m() {
        MoatAdEventType moatAdEventType;
        boolean z = false;
        if (this.j.get() == null || i()) {
            return false;
        }
        try {
            int intValue = j().intValue();
            if (this.n < 0 || intValue >= 0) {
                this.n = intValue;
                if (intValue == 0) {
                    return true;
                }
                int intValue2 = l().intValue();
                boolean k = k();
                double d = intValue2 / 4.0d;
                double a2 = s.a();
                MoatAdEventType moatAdEventType2 = null;
                if (intValue > this.p) {
                    this.p = intValue;
                }
                if (this.l == Integer.MIN_VALUE) {
                    this.l = intValue2;
                }
                if (k) {
                    if (this.m == a.UNINITIALIZED) {
                        moatAdEventType2 = MoatAdEventType.AD_EVT_START;
                        this.m = a.PLAYING;
                    } else if (this.m == a.PAUSED) {
                        moatAdEventType2 = MoatAdEventType.AD_EVT_PLAYING;
                        this.m = a.PLAYING;
                    } else {
                        int floor = ((int) Math.floor(intValue / d)) - 1;
                        if (floor > -1 && floor < 3) {
                            moatAdEventType = f[floor];
                            if (!this.g.containsKey(moatAdEventType)) {
                                this.g.put(moatAdEventType, 1);
                                moatAdEventType2 = moatAdEventType;
                            }
                        }
                        moatAdEventType = null;
                        moatAdEventType2 = moatAdEventType;
                    }
                } else if (this.m != a.PAUSED) {
                    moatAdEventType2 = MoatAdEventType.AD_EVT_PAUSED;
                    this.m = a.PAUSED;
                }
                boolean z2 = moatAdEventType2 != null;
                if (!z2 && !Double.isNaN(this.o) && Math.abs(this.o - a2) > 0.05d) {
                    moatAdEventType2 = MoatAdEventType.AD_EVT_VOLUME_CHANGE;
                    z2 = true;
                }
                if (z2) {
                    dispatchEvent(new MoatAdEvent(moatAdEventType2, Integer.valueOf(intValue), Double.valueOf(a2)));
                }
                this.o = a2;
                this.q = 0;
                z = true;
                return true;
            }
            return false;
        } catch (Exception e) {
            int i = this.q;
            this.q = i + 1;
            return i < 5 ? true : z;
        }
    }

    @Override // com.moat.analytics.mobile.vng.c, com.moat.analytics.mobile.vng.b
    public void stopTracking() {
        try {
            dispatchEvent(new MoatAdEvent(MoatAdEventType.AD_EVT_COMPLETE));
            p.a("[SUCCESS] ", a() + " stopTracking succeeded for " + e());
        } catch (Exception e) {
            m.a(e);
        }
    }
}
