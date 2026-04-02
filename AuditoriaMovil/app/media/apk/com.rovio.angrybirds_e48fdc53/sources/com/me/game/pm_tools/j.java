package com.me.game.pm_tools;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
/* loaded from: classes5.dex */
public class j extends i<o0> implements e0 {
    public static final String h = "icon_youtube.png";
    public static final String i = "icon_tiktok.png";
    public static final String j = "icon_telegram.png";
    public static final String k = "icon_discord.png";
    public static final String l = "icon_twitter.png";
    private HashMap<String, String> f;
    private e0 g;

    /* loaded from: classes5.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (com.me.game.pm_tools.b.d.c()) {
                j jVar = j.this;
                jVar.a(jVar);
                return;
            }
            Context context = j.this.a;
            t.a(context, "http://www.playmods.one?packageName=" + j.this.getContext().getPackageName());
        }
    }

    /* loaded from: classes5.dex */
    public class b implements f0<String> {
        public b() {
        }

        @Override // com.me.game.pm_tools.f0
        /* renamed from: b */
        public void a(View view, int i, String str) {
            j jVar = j.this;
            t.a(jVar.a, (String) jVar.f.get(str));
        }
    }

    /* loaded from: classes5.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j jVar = j.this;
            jVar.a(jVar);
        }
    }

    public j(Context context) {
        super(context);
        this.f = new HashMap<>();
        setCancelable(false);
        this.d = false;
        this.f.put("icon_youtube.png", l0.c().b().b);
        this.f.put("icon_tiktok.png", l0.c().b().c);
        this.f.put("icon_telegram.png", l0.c().b().d);
        this.f.put("icon_discord.png", l0.c().b().e);
        this.f.put("icon_twitter.png", l0.c().b().f);
    }

    @Override // com.me.game.pm_tools.e0
    public void a(i iVar) {
        dismiss();
        e0 e0Var = this.g;
        if (e0Var != null) {
            e0Var.a(iVar);
        }
    }

    @Override // com.me.game.pm_tools.i
    /* renamed from: m */
    public o0 b() {
        return o0.n(this.a);
    }

    @Override // com.me.game.pm_tools.i
    /* renamed from: n */
    public void h(o0 o0Var) {
        o0Var.setOnDownClickListener(new a());
        o0Var.setOnItemClickListener(new b());
        o0Var.setCloseListener(new c());
    }

    public void o(e0 e0Var) {
        this.g = e0Var;
    }
}
