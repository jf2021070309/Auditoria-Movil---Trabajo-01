package com.facebook.ads.internal.n;

import android.graphics.Color;
import android.graphics.Typeface;
import com.facebook.ads.internal.settings.AdInternalSettings;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class h {
    private Typeface a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;

    public h() {
        this.a = Typeface.DEFAULT;
        this.b = -1;
        this.c = -16777216;
        this.d = -11643291;
        this.e = 0;
        this.f = -12420889;
        this.g = -12420889;
        this.h = AdInternalSettings.isVideoAutoplay();
        this.i = AdInternalSettings.isVideoAutoplayOnMobile();
    }

    public h(JSONObject jSONObject) {
        this.a = Typeface.DEFAULT;
        this.b = -1;
        this.c = -16777216;
        this.d = -11643291;
        this.e = 0;
        this.f = -12420889;
        this.g = -12420889;
        this.h = AdInternalSettings.isVideoAutoplay();
        this.i = AdInternalSettings.isVideoAutoplayOnMobile();
        int parseColor = jSONObject.getBoolean("background_transparent") ? 0 : Color.parseColor(jSONObject.getString("background_color"));
        int parseColor2 = Color.parseColor(jSONObject.getString("title_text_color"));
        int parseColor3 = Color.parseColor(jSONObject.getString("description_text_color"));
        int parseColor4 = jSONObject.getBoolean("button_transparent") ? 0 : Color.parseColor(jSONObject.getString("button_color"));
        int parseColor5 = jSONObject.getBoolean("button_border_transparent") ? 0 : Color.parseColor(jSONObject.getString("button_border_color"));
        int parseColor6 = Color.parseColor(jSONObject.getString("button_text_color"));
        Typeface create = Typeface.create(jSONObject.getString("android_typeface"), 0);
        this.b = parseColor;
        this.c = parseColor2;
        this.d = parseColor3;
        this.e = parseColor4;
        this.g = parseColor5;
        this.f = parseColor6;
        this.a = create;
    }

    public Typeface a() {
        return this.a;
    }

    public void a(int i) {
        this.b = i;
    }

    public void a(Typeface typeface) {
        this.a = typeface;
    }

    public void a(boolean z) {
        this.i = z;
    }

    public int b() {
        return this.b;
    }

    public void b(int i) {
        this.c = i;
    }

    public void b(boolean z) {
        this.h = z;
    }

    public int c() {
        return this.c;
    }

    public void c(int i) {
        this.d = i;
    }

    public int d() {
        return this.d;
    }

    public void d(int i) {
        this.e = i;
    }

    public int e() {
        return this.e;
    }

    public void e(int i) {
        this.f = i;
    }

    public int f() {
        return this.f;
    }

    public void f(int i) {
        this.g = i;
    }

    public int g() {
        return this.g;
    }

    public int h() {
        return 16;
    }

    public int i() {
        return 10;
    }

    public boolean j() {
        return this.h;
    }

    public boolean k() {
        return this.i;
    }
}
