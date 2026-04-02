package com.rovio.fusion;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import com.rovio.fusion.VideoPlayer;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
/* loaded from: classes2.dex */
public class VideoPlayerBridge implements IActivityListener, VideoPlayer.VideoPlayerListener, Serializable {
    private static final String TAG = "fusion.VideoPlayerBridge";
    private static final boolean VERBOSE_LOGGING = false;
    private long a;
    private String d;
    private ButtonCollection f;
    private LayerCollection g;
    private boolean k;
    private String b = "";
    private int c = 0;
    private VideoPlayer e = null;
    private int h = 0;
    private boolean i = false;
    private boolean j = false;
    private float l = 0.0f;

    protected native void onVideoEnded(long j, boolean z, int i, float f, float f2);

    protected native void onVideoPaused(long j, boolean z, int i, float f, float f2);

    /* loaded from: classes2.dex */
    class ButtonData implements Serializable {
        private long b;
        private String c;
        private String d;
        private int e;

        ButtonData(long j, String str, String str2, int i) {
            this.b = j;
            this.c = str;
            this.d = str2;
            this.e = i;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public long a() {
            return this.b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public String b() {
            return this.c;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public String c() {
            return this.d;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int d() {
            return this.e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class ButtonCollection implements Serializable {
        int a = 0;
        public LinkedList<ButtonData> mButtons = new LinkedList<>();

        ButtonCollection() {
        }
    }

    /* loaded from: classes2.dex */
    public static class LayerData implements Serializable {
        public String m_font;
        public float m_fontSize;
        public long m_handle;
        public String m_image;
        public int m_position;
        public float m_secondsVisible;
        public String m_text;

        /* JADX INFO: Access modifiers changed from: package-private */
        public LayerData(long j, String str, float f, int i, String str2, String str3, float f2) {
            this.m_handle = j;
            this.m_image = str;
            this.m_secondsVisible = f;
            this.m_position = i;
            this.m_text = str2;
            this.m_font = str3;
            this.m_fontSize = f2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class LayerCollection implements Serializable {
        int a = 0;
        public LinkedList<LayerData> m_layers = new LinkedList<>();

        LayerCollection() {
        }
    }

    public VideoPlayerBridge(long j, boolean z) {
        this.a = 0L;
        this.f = null;
        this.g = null;
        this.k = false;
        this.a = j;
        this.f = new ButtonCollection();
        this.g = new LayerCollection();
        this.k = false;
        if (z) {
            a();
        }
        Globals.registerActivityListener(this);
    }

    public void load(String str) {
        this.b = str;
    }

    public void setUIMode(int i, String str) {
        this.c = i;
        this.d = str;
    }

    public void playWithPath(long j, String str, boolean z, float f) {
        Log.i("VideoPlayerBridge", "playWithPath() givenPath:" + str);
        load(str);
        this.l = f;
        play();
    }

    public void play() {
        this.k = false;
        if (this.i) {
            Intent intent = new Intent(Globals.getActivity(), VideoPlayerActivity.class);
            intent.putExtra("path", this.b);
            intent.putExtra("uiMode", this.c);
            intent.putExtra("uiProperties", this.d);
            intent.putExtra("handle", this.a);
            intent.putExtra("startPositionSeconds", this.l);
            try {
                intent.putExtra("extraButtonCollection", this.f);
            } catch (Exception e) {
            }
            try {
                intent.putExtra("extraLayerCollection", this.g);
            } catch (Exception e2) {
            }
            this.h = 1;
            try {
                Globals.getActivity().startActivityForResult(intent, this.h);
                return;
            } catch (ActivityNotFoundException e3) {
                return;
            }
        }
        Globals.getActivity().runOnUiThread(new Runnable() { // from class: com.rovio.fusion.VideoPlayerBridge.1
            @Override // java.lang.Runnable
            public void run() {
                VideoPlayerBridge.this.e = new VideoPlayer(this, Globals.getActivity(), Globals.getRootViewGroup(), VideoPlayerBridge.this.b, VideoPlayerBridge.this.c, VideoPlayerBridge.this.d, VideoPlayerBridge.this.a);
                VideoPlayerBridge.this.e.setStartingPos((int) (VideoPlayerBridge.this.l * 1000.0f));
                Iterator<ButtonData> it = VideoPlayerBridge.this.f.mButtons.iterator();
                while (it.hasNext()) {
                    ButtonData next = it.next();
                    VideoPlayerBridge.this.e.a(next.a(), next.b(), next.c(), next.d());
                }
                Iterator<LayerData> it2 = VideoPlayerBridge.this.g.m_layers.iterator();
                while (it2.hasNext()) {
                    LayerData next2 = it2.next();
                    VideoPlayerBridge.this.e.addExtraLayer(next2.m_handle, next2.m_image, next2.m_secondsVisible, next2.m_position, next2.m_text, next2.m_font, next2.m_fontSize);
                }
                VideoPlayerBridge.this.e.show();
            }
        });
    }

    public void close() {
        this.j = true;
        if (this.e != null) {
            Globals.getActivity().runOnUiThread(new Runnable() { // from class: com.rovio.fusion.VideoPlayerBridge.2
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (this) {
                        if (VideoPlayerBridge.this.e != null) {
                            VideoPlayerBridge.this.e.close();
                            VideoPlayerBridge.this.e = null;
                        }
                    }
                    VideoPlayerBridge.this.g.m_layers.clear();
                }
            });
        } else if (this.h > 0) {
            Globals.getActivity().finishActivity(this.h);
        }
    }

    public void destroy() {
        Globals.unregisterActivityListener(this);
        if (this.e != null) {
            Globals.getActivity().runOnUiThread(new Runnable() { // from class: com.rovio.fusion.VideoPlayerBridge.3
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (this) {
                        if (VideoPlayerBridge.this.e != null) {
                            VideoPlayerBridge.this.e.destroy();
                        }
                    }
                }
            });
        } else if (this.h > 0) {
            Globals.getActivity().finishActivity(this.h);
        }
    }

    public void show() {
        if (this.e != null) {
            this.e.visible();
        }
    }

    public void hide() {
        if (this.e != null) {
            this.e.hide();
        }
    }

    public void pause() {
        if (this.e != null) {
            this.e.pause();
        }
    }

    public void resume() {
        if (this.e != null) {
            this.e.visible();
            this.e.resume();
        } else if (VideoPlayerActivity.sm_videoPlayer != null) {
            VideoPlayerActivity.sm_videoPlayer.visible();
            VideoPlayerActivity.sm_videoPlayer.resume();
        }
    }

    public boolean isPaused() {
        return this.e == null || !this.e.isPlaying();
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onResume() {
        if (this.e != null) {
            this.e.onResume();
        }
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onPause() {
        if (this.e != null) {
            this.e.onPause();
        }
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onNewIntent(Intent intent) {
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.h == i) {
            if (intent != null && intent.hasExtra("com.rovio.fusion_activity") && intent.getStringExtra("com.rovio.fusion_activity").equals("VideoPlayerActivity")) {
                if (intent.getIntExtra("endingType", 0) == 2) {
                    onVideoEnded(false, intent.getIntExtra("reason", 0), intent.getFloatExtra("percent", 0.0f), intent.getFloatExtra("duration", 0.0f));
                } else {
                    onVideoEnded(intent.getBooleanExtra("error", false), intent.getIntExtra("reason", 0), intent.getFloatExtra("percent", 0.0f), intent.getFloatExtra("duration", 0.0f));
                }
            } else if (this.j) {
                onVideoEnded(true, VideoPlayer.PlaybackEndReason.CLOSED.ordinal(), 0.0f, 0.0f);
            } else {
                onVideoEnded(true, VideoPlayer.PlaybackEndReason.UNKNOWN_ERROR.ordinal(), 0.0f, 0.0f);
            }
        }
        this.h = 0;
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onDestroy() {
        if (this.e != null) {
            this.e.destroy();
        }
    }

    @Override // com.rovio.fusion.VideoPlayer.VideoPlayerListener
    public void onVideoEnded(final boolean z, final int i, final float f, final float f2) {
        if (!this.k) {
            this.k = true;
            if (this.a != 0) {
                Globals.runOnGLThread(new Runnable() { // from class: com.rovio.fusion.VideoPlayerBridge.4
                    @Override // java.lang.Runnable
                    public void run() {
                        VideoPlayerBridge.this.onVideoEnded(VideoPlayerBridge.this.a, z, i, f2 > 0.0f ? (f / 100.0f) * f2 : 0.0f, f2);
                    }
                });
            }
        }
    }

    public void addExtraButton(final long j, final String str, final String str2, final int i) {
        if (this.e != null) {
            Globals.getActivity().runOnUiThread(new Runnable() { // from class: com.rovio.fusion.VideoPlayerBridge.5
                @Override // java.lang.Runnable
                public void run() {
                    VideoPlayerBridge.this.e.a(j, str, str2, i);
                }
            });
            return;
        }
        this.f.mButtons.add(new ButtonData(j, str, str2, i));
    }

    public void addExtraLayer(final long j, final String str, final float f, final int i, final String str2, final String str3, final float f2) {
        if (this.e != null) {
            Globals.getActivity().runOnUiThread(new Runnable() { // from class: com.rovio.fusion.VideoPlayerBridge.6
                @Override // java.lang.Runnable
                public void run() {
                    VideoPlayerBridge.this.e.addExtraLayer(j, str, f, i, str2, str3, f2);
                }
            });
            return;
        }
        this.g.m_layers.add(new LayerData(j, str, f, i, str2, str3, f2));
    }

    private void a() {
        try {
            Globals.getActivity().getPackageManager().getActivityInfo(new ComponentName(Globals.getActivity(), VideoPlayerActivity.class), 0);
            this.i = true;
        } catch (PackageManager.NameNotFoundException e) {
        }
    }
}
