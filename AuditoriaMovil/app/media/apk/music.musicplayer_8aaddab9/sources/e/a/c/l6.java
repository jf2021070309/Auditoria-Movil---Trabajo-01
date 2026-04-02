package e.a.c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import c.p.j;
import com.android.music.MediaPlaybackActivity;
import com.android.music.MusicApp;
import com.zipoapps.permissions.MultiplePermissionsRequester;
import e.h.g.j0;
import e.j.a.o.f;
import java.util.Objects;
import music.musicplayer.R;
/* loaded from: classes.dex */
public abstract class l6 extends e.g.a.d.j implements View.OnCreateContextMenuListener, ServiceConnection, f.a, e.j.d.b0.d.d {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ int f5115k = 0;

    /* renamed from: l  reason: collision with root package name */
    public e.h.g.a1 f5116l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f5117m = false;

    /* renamed from: n  reason: collision with root package name */
    public final MultiplePermissionsRequester f5118n;

    public l6() {
        MultiplePermissionsRequester multiplePermissionsRequester = new MultiplePermissionsRequester(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"});
        g gVar = new g(this);
        h.o.c.j.e(gVar, "action");
        e.j.c.e eVar = new e.j.c.e(gVar);
        h.o.c.j.e(eVar, "action");
        multiplePermissionsRequester.f4890d = eVar;
        e eVar2 = e.a;
        h.o.c.j.e(eVar2, "action");
        e.j.c.g gVar2 = new e.j.c.g(eVar2);
        h.o.c.j.e(gVar2, "action");
        multiplePermissionsRequester.f4891e = gVar2;
        d dVar = d.a;
        h.o.c.j.e(dVar, "action");
        e.j.c.f fVar = new e.j.c.f(dVar);
        h.o.c.j.e(fVar, "action");
        multiplePermissionsRequester.f4892f = fVar;
        this.f5118n = multiplePermissionsRequester;
    }

    public abstract boolean K();

    @Override // c.b.c.l, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Configuration a = u6.a(context, context.getResources().getConfiguration());
        applyOverrideConfiguration(a);
        super.attachBaseContext(context.createConfigurationContext(a));
    }

    @Override // e.j.d.b0.d.d
    public void m(boolean z) {
        if (!isFinishing() && ((c.p.r) getLifecycle()).f2467c.isAtLeast(j.b.CREATED)) {
            this.f5117m = true;
            this.f5118n.i();
        }
        MusicApp.s = true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        try {
            if (isFinishing()) {
                finish();
            } else if (!K()) {
                finish();
            } else if (c.i.g.h.z(this)) {
                finish();
            }
        } catch (Exception e2) {
            c.i.g.b.l(e2);
            e.h.g.s1.l(e2, true);
        }
    }

    @Override // e.g.a.d.j, e.g.a.d.i, c.m.b.o, androidx.activity.ComponentActivity, c.i.c.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 28) {
            final ViewGroup viewGroup = (ViewGroup) findViewById(R.id.buttonbar);
            final ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.bottom_ad_view);
            final ViewGroup viewGroup3 = (ViewGroup) findViewById(R.id.main_layout);
            c.i.k.d0.C(viewGroup, new c.i.k.u() { // from class: e.a.c.f
                @Override // c.i.k.u
                public final c.i.k.j0 a(View view, c.i.k.j0 j0Var) {
                    l6 l6Var = l6.this;
                    ViewGroup viewGroup4 = viewGroup2;
                    ViewGroup viewGroup5 = viewGroup3;
                    ViewGroup viewGroup6 = viewGroup;
                    Objects.requireNonNull(l6Var);
                    if (j0Var.f()) {
                        c.i.e.c a = j0Var.a(7);
                        viewGroup4.setPadding(0, 0, 0, a.f2038e);
                        if (l6Var.getIntent().getBooleanExtra("withtabs", false)) {
                            viewGroup6.setPadding(0, a.f2036c, 0, 0);
                        } else {
                            viewGroup5.setPadding(0, a.f2036c, 0, 0);
                        }
                    }
                    return j0Var;
                }
            });
        }
    }

    @Override // e.g.a.d.j, c.m.b.o, android.app.Activity
    public void onResume() {
        super.onResume();
        e.h.g.j0.g(new j0.b() { // from class: e.a.c.h
            @Override // e.h.g.j0.b
            public final void a() {
                l6 l6Var = l6.this;
                Objects.requireNonNull(l6Var);
                e.h.g.a1 g2 = c.i.g.b.g(l6Var);
                e.h.g.a1 a1Var = l6Var.f5116l;
                if (a1Var != null && !g2.equals(a1Var)) {
                    Object obj = e.h.g.j1.a;
                    try {
                        Intent intent = l6Var.getIntent();
                        if (intent == null) {
                            intent = new Intent();
                            intent.setComponent(new ComponentName(l6Var, l6Var.getClass()));
                        }
                        l6Var.overridePendingTransition(0, 0);
                        intent.addFlags(65536);
                        l6Var.finish();
                        l6Var.overridePendingTransition(0, 0);
                        l6Var.startActivity(intent);
                    } catch (Exception unused) {
                    }
                }
                l6Var.f5116l = g2;
            }
        });
        if (MediaPlaybackActivity.f2951c) {
            MediaPlaybackActivity.f2951c = false;
            if (!((Boolean) e.j.d.k.a.a().f8812i.b("is_showing_interstitial_on_back_from_player", Boolean.FALSE)).booleanValue() || c.i.g.h.x() || z6.G()) {
                return;
            }
            e.j.d.k g2 = c.i.g.h.g();
            h.o.c.j.e(this, "activity");
            g2.j(this, null, false);
        }
    }

    @Override // c.b.c.l, c.m.b.o, android.app.Activity
    public void onStart() {
        super.onStart();
        if (!MusicApp.s || this.f5117m || isFinishing()) {
            return;
        }
        this.f5118n.i();
    }
}
