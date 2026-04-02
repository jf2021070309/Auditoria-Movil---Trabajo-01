package com.me.game.pm_tools;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.me.game.pm_tools.app.LandscapeActivity;
/* loaded from: classes5.dex */
public class MainActivity extends Activity {
    private static final String d = "SHOW_NON_CLOSE_DLG";
    private boolean a = false;
    private j b;
    private k c;

    /* loaded from: classes5.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MainActivity.this.c == null) {
                MainActivity.this.c = new k(MainActivity.this);
            }
            MainActivity.this.c.show();
        }
    }

    /* loaded from: classes5.dex */
    public class b implements e0 {
        public b() {
        }

        @Override // com.me.game.pm_tools.e0
        public void a(i iVar) {
            MainActivity.this.c();
        }
    }

    public static void d(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.putExtra(d, true);
        context.startActivity(intent);
    }

    public void c() {
        try {
            String string = getPackageManager().getApplicationInfo(getPackageName(), 128).metaData.getString("pm_tools_start");
            Intent intent = new Intent();
            intent.setClassName(getPackageName(), string);
            startActivity(intent);
            finish();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                startActivity(new Intent(this, LandscapeActivity.class));
                finish();
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean booleanExtra = getIntent().getBooleanExtra(d, false);
        this.a = booleanExtra;
        if (booleanExtra) {
            return;
        }
        com.me.game.pm_tools.b.attachApplication(this);
        b0.c().j("More mod games, get it in playmods.net~");
        getApplication().registerActivityLifecycleCallbacks(new g0(this));
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        j jVar = this.b;
        if (jVar != null) {
            jVar.dismiss();
        }
        k kVar = this.c;
        if (kVar != null) {
            kVar.dismiss();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        try {
            if (this.a) {
                if (com.me.game.pm_tools.b.d.c()) {
                    finish();
                    return;
                }
                long j = 0;
                if (getResources().getConfiguration().orientation != 1) {
                    setRequestedOrientation(1);
                    j = 1000;
                }
                com.me.game.pm_tools.b.d.f(new a(), j);
            } else if (com.me.game.pm_tools.b.d.c()) {
                if (this.b == null) {
                    j jVar = new j(this);
                    this.b = jVar;
                    jVar.o(new b());
                }
                this.b.show();
            } else {
                c();
            }
        } catch (Exception unused) {
            c();
        }
    }
}
