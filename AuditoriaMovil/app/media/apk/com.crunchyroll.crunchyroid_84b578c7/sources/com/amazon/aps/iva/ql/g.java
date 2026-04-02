package com.amazon.aps.iva.ql;

import android.content.SharedPreferences;
import com.amazon.aps.iva.ab.t;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ve0.l0;
import com.ellation.crunchyroll.api.GsonHolder;
import com.google.gson.Gson;
/* compiled from: PlayerSettingsStorage.kt */
/* loaded from: classes2.dex */
public final class g implements c {
    public static g g;
    public final com.amazon.aps.iva.yy.a a;
    public final com.amazon.aps.iva.yy.a b;
    public final com.amazon.aps.iva.yy.a c;
    public final com.amazon.aps.iva.yy.a d;
    public final com.amazon.aps.iva.yy.a e;
    public final com.amazon.aps.iva.yy.a f;

    public g(SharedPreferences sharedPreferences) {
        this.a = l1.u(sharedPreferences, "player_audio_language", "en-US");
        this.b = l1.u(sharedPreferences, "player_subtitles_language", "en-US");
        com.amazon.aps.iva.rl.a aVar = new com.amazon.aps.iva.rl.a(0, 0, 0, true);
        Gson gsonHolder = GsonHolder.getInstance();
        com.amazon.aps.iva.yb0.j.f(gsonHolder, "gson");
        l0 g2 = t.g(0, 0, null, 7);
        this.c = new com.amazon.aps.iva.yy.a(g2, new com.amazon.aps.iva.zy.c(aVar, sharedPreferences, g2, gsonHolder));
        Boolean bool = Boolean.TRUE;
        this.d = l1.u(sharedPreferences, "player_autoplay_setting", bool);
        this.e = l1.u(sharedPreferences, "stream_over_cellular", bool);
        this.f = l1.u(sharedPreferences, "show_closed_captions", bool);
    }

    @Override // com.amazon.aps.iva.ql.c
    public final com.amazon.aps.iva.yy.a a() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.ql.c
    public final com.amazon.aps.iva.yy.a b() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.ql.c
    public final com.amazon.aps.iva.yy.a c() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.ql.f
    public final com.amazon.aps.iva.yy.a d() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.ql.f
    public final com.amazon.aps.iva.yy.a e() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.ql.c
    public final com.amazon.aps.iva.yy.a f() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.ql.f
    public final com.amazon.aps.iva.yy.a g() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.ql.c
    public final com.amazon.aps.iva.yy.a h() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.ql.f
    public final com.amazon.aps.iva.yy.a i() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.ql.f
    public final com.amazon.aps.iva.yy.a j() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.ql.c
    public final com.amazon.aps.iva.yy.a k() {
        return this.e;
    }
}
