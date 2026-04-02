package com.facebook.ads.internal.q.a;

import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.View;
import com.umeng.analytics.AnalyticsConfig;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class s {
    private static final String a = s.class.getSimpleName();
    private boolean b;
    private int c = -1;
    private int d = -1;
    private int e = -1;
    private int f = -1;
    private long g = -1;
    private int h = -1;
    private long i = -1;
    private long j = -1;
    private int k = -1;
    private int l = -1;
    private int m = -1;
    private int n = -1;
    private float o = -1.0f;
    private float p = -1.0f;
    private float q = -1.0f;
    private View r;
    private View s;

    private i f() {
        if (this.r == null || this.s == null) {
            return i.INTERNAL_NULL_VIEW;
        }
        if (this.r != this.s) {
            return i.INTERNAL_NO_CLICK;
        }
        if (Build.VERSION.SDK_INT < 4) {
            return i.INTERNAL_API_TOO_LOW;
        }
        Object tag = this.r.getTag(i.o);
        return tag == null ? i.INTERNAL_NO_TAG : !(tag instanceof i) ? i.INTERNAL_WRONG_TAG_CLASS : (i) tag;
    }

    public void a() {
        this.g = System.currentTimeMillis();
    }

    public void a(MotionEvent motionEvent, View view, View view2) {
        int[] iArr;
        int[] iArr2;
        if (!this.b) {
            this.b = true;
            InputDevice device = motionEvent.getDevice();
            if (device != null) {
                InputDevice.MotionRange motionRange = device.getMotionRange(0);
                InputDevice.MotionRange motionRange2 = device.getMotionRange(1);
                if (motionRange != null && motionRange2 != null) {
                    this.q = Math.min(motionRange.getRange(), motionRange2.getRange());
                }
            }
            if (this.q <= 0.0f) {
                this.q = Math.min(view.getMeasuredWidth(), view.getMeasuredHeight());
            }
        }
        view.getLocationInWindow(new int[2]);
        view2.getLocationInWindow(new int[2]);
        switch (motionEvent.getAction()) {
            case 0:
                this.c = (int) (iArr[0] / v.b);
                this.d = (int) (iArr[1] / v.b);
                this.e = (int) (view.getWidth() / v.b);
                this.f = (int) (view.getHeight() / v.b);
                this.h = 1;
                this.i = System.currentTimeMillis();
                this.k = (int) (((((int) (motionEvent.getX() + 0.5f)) + iArr2[0]) - iArr[0]) / v.b);
                this.l = (int) (((iArr2[1] + ((int) (motionEvent.getY() + 0.5f))) - iArr[1]) / v.b);
                this.o = motionEvent.getPressure();
                this.p = motionEvent.getSize();
                this.r = view2;
                return;
            case 1:
            case 3:
                this.j = System.currentTimeMillis();
                this.m = (int) (((((int) (motionEvent.getX() + 0.5f)) + iArr2[0]) - iArr[0]) / v.b);
                this.n = (int) (((iArr2[1] + ((int) (motionEvent.getY() + 0.5f))) - iArr[1]) / v.b);
                this.s = view2;
                return;
            case 2:
                this.o -= this.o / this.h;
                this.o += motionEvent.getPressure() / this.h;
                this.p -= this.p / this.h;
                this.p += motionEvent.getSize() / this.h;
                this.h++;
                return;
            default:
                return;
        }
    }

    public boolean b() {
        return this.g != -1;
    }

    public long c() {
        if (b()) {
            return System.currentTimeMillis() - this.g;
        }
        return -1L;
    }

    public boolean d() {
        return this.b;
    }

    public Map<String, String> e() {
        if (this.b) {
            String valueOf = String.valueOf((this.p * this.q) / 2.0f);
            long j = (this.g <= 0 || this.j <= this.g) ? -1L : this.j - this.g;
            HashMap hashMap = new HashMap();
            hashMap.put("adPositionX", String.valueOf(this.c));
            hashMap.put("adPositionY", String.valueOf(this.d));
            hashMap.put("width", String.valueOf(this.e));
            hashMap.put("height", String.valueOf(this.f));
            hashMap.put("clickDelayTime", String.valueOf(j));
            hashMap.put(AnalyticsConfig.RTD_START_TIME, String.valueOf(this.i));
            hashMap.put("endTime", String.valueOf(this.j));
            hashMap.put("startX", String.valueOf(this.k));
            hashMap.put("startY", String.valueOf(this.l));
            hashMap.put("clickX", String.valueOf(this.m));
            hashMap.put("clickY", String.valueOf(this.n));
            hashMap.put("endX", String.valueOf(this.m));
            hashMap.put("endY", String.valueOf(this.n));
            hashMap.put("force", String.valueOf(this.o));
            hashMap.put("radiusX", valueOf);
            hashMap.put("radiusY", valueOf);
            hashMap.put("clickedViewTag", String.valueOf(f().a()));
            return hashMap;
        }
        return null;
    }
}
