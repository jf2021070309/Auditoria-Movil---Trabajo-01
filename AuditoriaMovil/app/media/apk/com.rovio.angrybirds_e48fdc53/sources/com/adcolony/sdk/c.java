package com.adcolony.sdk;

import android.media.MediaPlayer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
/* loaded from: classes2.dex */
class c {
    final String a;
    private final int b;
    private HashMap<Integer, MediaPlayer> c = new HashMap<>();
    private HashMap<Integer, a> d = new HashMap<>();
    private HashMap<Integer, Boolean> e = new HashMap<>();
    private HashMap<Integer, Boolean> f = new HashMap<>();
    private ArrayList<MediaPlayer> g = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(String str, int i) {
        this.a = str;
        this.b = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(d dVar) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        JSONObject b = dVar.b();
        int c = as.c(b, "id");
        a aVar = new a(c, as.d(b, "repeats"));
        this.c.put(Integer.valueOf(c), mediaPlayer);
        this.d.put(Integer.valueOf(c), aVar);
        this.e.put(Integer.valueOf(c), false);
        this.f.put(Integer.valueOf(c), false);
        mediaPlayer.setOnErrorListener(aVar);
        mediaPlayer.setOnPreparedListener(aVar);
        try {
            mediaPlayer.setDataSource(as.b(b, "filepath"));
        } catch (Exception e) {
            JSONObject a2 = as.a();
            as.b(a2, "id", c);
            as.a(a2, "ad_session_id", this.a);
            new d("AudioPlayer.on_error", this.b, a2).a();
        }
        mediaPlayer.prepareAsync();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.g.clear();
        for (MediaPlayer mediaPlayer : this.c.values()) {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.pause();
                this.g.add(mediaPlayer);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Iterator<MediaPlayer> it = this.g.iterator();
        while (it.hasNext()) {
            it.next().start();
        }
        this.g.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(d dVar) {
        int c = as.c(dVar.b(), "id");
        if (this.f.get(Integer.valueOf(c)).booleanValue()) {
            this.c.get(Integer.valueOf(c)).pause();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(d dVar) {
        int c = as.c(dVar.b(), "id");
        if (this.e.get(Integer.valueOf(c)).booleanValue()) {
            this.c.get(Integer.valueOf(c)).start();
            this.f.put(Integer.valueOf(c), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(d dVar) {
        this.c.remove(Integer.valueOf(as.c(dVar.b(), "id"))).release();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(d dVar) {
        int c = as.c(dVar.b(), "id");
        if (this.f.get(Integer.valueOf(c)).booleanValue()) {
            MediaPlayer mediaPlayer = this.c.get(Integer.valueOf(c));
            mediaPlayer.pause();
            mediaPlayer.seekTo(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HashMap<Integer, MediaPlayer> c() {
        return this.c;
    }

    /* loaded from: classes2.dex */
    private class a implements MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener {
        int a;
        boolean b;

        a(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            JSONObject a = as.a();
            as.b(a, "id", this.a);
            as.a(a, "ad_session_id", c.this.a);
            new d("AudioPlayer.on_error", c.this.b, a).a();
            return true;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            mediaPlayer.setLooping(this.b);
            c.this.e.put(Integer.valueOf(this.a), true);
            JSONObject a = as.a();
            as.b(a, "id", this.a);
            as.a(a, "ad_session_id", c.this.a);
            new d("AudioPlayer.on_ready", c.this.b, a).a();
        }
    }
}
