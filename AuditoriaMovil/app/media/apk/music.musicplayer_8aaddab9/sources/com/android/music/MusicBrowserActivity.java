package com.android.music;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import c.b.c.l;
import e.a.c.a7;
import e.a.c.g7;
import e.a.c.i4;
import e.a.c.z6;
import e.h.f.a;
import e.h.g.j0;
import e.h.g.s1;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class MusicBrowserActivity extends l {

    /* renamed from: c  reason: collision with root package name */
    public final ServiceConnection f2974c = new a();

    /* renamed from: d  reason: collision with root package name */
    public int f2975d;

    /* renamed from: e  reason: collision with root package name */
    public z6.e f2976e;

    /* loaded from: classes.dex */
    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                MusicBrowserActivity.this.unbindService(this);
            } catch (IllegalArgumentException unused) {
            }
            e.h.f.a R0 = a.AbstractBinderC0175a.R0(iBinder);
            if (R0 != null) {
                try {
                    R0.n(2);
                } catch (Exception unused2) {
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    @Override // c.m.b.o, androidx.activity.ComponentActivity, c.i.c.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        a7.e();
        if (intent != null && "newmusic".equals(intent.getAction())) {
            TrackBrowserActivity.Q(this);
            finish();
        } else if ("android.intent.action.VIEW".equals(intent.getAction())) {
            try {
                intent.setComponent(new ComponentName(this, MediaPlaybackActivity.class));
                startActivity(intent);
            } catch (Exception e2) {
                s1.l(e2, true);
            }
            finish();
        } else {
            int c2 = g7.c(this, "activetab", R.id.artisttab);
            this.f2975d = c2;
            if (c2 != R.id.artisttab && c2 != R.id.albumtab && c2 != R.id.songtab && c2 != R.id.playlisttab) {
                this.f2975d = R.id.artisttab;
            }
            if ("true".equals(getIntent().getStringExtra("autoshuffle"))) {
                this.f2976e = z6.e(this, this.f2974c);
            }
            z6.a(this, this.f2975d);
        }
        j0.f(i4.a);
        g7.k("bf", System.currentTimeMillis());
    }

    @Override // c.b.c.l, c.m.b.o, android.app.Activity
    public void onDestroy() {
        z6.e eVar = this.f2976e;
        if (eVar != null) {
            z6.a0(eVar);
        }
        super.onDestroy();
    }

    @Override // c.m.b.o, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent == null || !"newmusic".equals(intent.getAction())) {
            return;
        }
        TrackBrowserActivity.Q(this);
    }
}
