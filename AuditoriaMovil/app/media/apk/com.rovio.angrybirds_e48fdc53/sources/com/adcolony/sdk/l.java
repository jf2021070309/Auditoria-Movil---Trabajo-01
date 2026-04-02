package com.adcolony.sdk;

import android.media.SoundPool;
import java.util.HashMap;
import org.json.JSONObject;
/* loaded from: classes2.dex */
class l {
    final String a;
    private final int b;
    private HashMap<Integer, Integer> c = new HashMap<>();
    private HashMap<Integer, Integer> d = new HashMap<>();
    private HashMap<Integer, Integer> f = new HashMap<>();
    private HashMap<Integer, Boolean> e = new HashMap<>();
    private HashMap<Integer, Integer> g = new HashMap<>();
    private HashMap<String, Integer> h = new HashMap<>();
    private SoundPool i = new SoundPool(50, 3, 0);

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(final String str, final int i) {
        this.a = str;
        this.b = i;
        this.i.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: com.adcolony.sdk.l.1
            @Override // android.media.SoundPool.OnLoadCompleteListener
            public void onLoadComplete(SoundPool soundPool, int i2, int i3) {
                JSONObject a = as.a();
                as.b(a, "id", ((Integer) l.this.f.get(Integer.valueOf(i2))).intValue());
                as.a(a, "ad_session_id", str);
                if (i3 == 0) {
                    new d("AudioPlayer.on_ready", i, a).a();
                    l.this.g.put(l.this.f.get(Integer.valueOf(i2)), Integer.valueOf(i2));
                    return;
                }
                new d("AudioPlayer.on_error", i, a).a();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(d dVar) {
        JSONObject b = dVar.b();
        int load = this.i.load(as.b(b, "filepath"), 1);
        int i = as.d(b, "repeats") ? -1 : 0;
        this.f.put(Integer.valueOf(load), Integer.valueOf(as.c(b, "id")));
        au.d.a("Load audio with id = ").b(load);
        this.d.put(Integer.valueOf(load), Integer.valueOf(i));
        this.e.put(Integer.valueOf(load), false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(d dVar) {
        this.i.unload(this.g.get(Integer.valueOf(as.c(dVar.b(), "id"))).intValue());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(d dVar) {
        int intValue = this.g.get(Integer.valueOf(as.c(dVar.b(), "id"))).intValue();
        if (!this.e.get(Integer.valueOf(intValue)).booleanValue()) {
            int play = this.i.play(intValue, 1.0f, 1.0f, 0, this.d.get(Integer.valueOf(intValue)).intValue(), 1.0f);
            if (play != 0) {
                this.c.put(Integer.valueOf(intValue), Integer.valueOf(play));
                return;
            }
            JSONObject a = as.a();
            as.b(a, "id", as.c(dVar.b(), "id"));
            as.a(a, "ad_session_id", this.a);
            new d("AudioPlayer.on_error", this.b, a).a();
            return;
        }
        this.i.resume(this.c.get(Integer.valueOf(intValue)).intValue());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(d dVar) {
        int intValue = this.g.get(Integer.valueOf(as.c(dVar.b(), "id"))).intValue();
        this.i.pause(this.c.get(Integer.valueOf(intValue)).intValue());
        this.e.put(Integer.valueOf(intValue), true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(d dVar) {
        this.i.stop(this.c.get(this.g.get(Integer.valueOf(as.c(dVar.b(), "id")))).intValue());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SoundPool a() {
        return this.i;
    }
}
