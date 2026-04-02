package com.rovio.rcs.ads;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.rovio.fusion.Globals;
import com.rovio.fusion.IActivityListener;
import com.rovio.rcs.ads.VideoPlayer;
import com.rovio.rcs.ads.WebViewAdFactory;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes4.dex */
public class VideoPlayerBridge implements VideoPlayer.VideoPlayerListener, WebViewAdFactory.LoadListener {
    private static final String TAG = "VideoPlayerBridge";
    private static final boolean VERBOSE_LOGGING = false;
    private long a;
    private VideoPlayerWrapper b = new VideoPlayerWrapper(this);
    private String c;

    /* JADX INFO: Access modifiers changed from: private */
    public native void onCustomControlClicked(long j, String str, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public native void onEndCardClick(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public native void onEndCardReady(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public native void onEndCardTrackEvent(long j, String str, String str2);

    /* JADX INFO: Access modifiers changed from: private */
    public native void onVideoEnded(long j, boolean z, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public native void onVideoTrackEvent(long j, String str);

    /* loaded from: classes4.dex */
    public static class VideoPlayerWrapper implements IActivityListener {
        private static final String TAG = "VideoPlayerWrapper";
        private static boolean m_defaultUseActivity = true;
        private VideoPlayer.VideoPlayerListener a;
        private String e;
        private String b = "";
        private VideoPlayer c = null;
        private int d = 0;
        private int f = 0;
        private boolean g = false;
        private int h = 0;

        public VideoPlayerWrapper(VideoPlayer.VideoPlayerListener videoPlayerListener) {
            this.a = videoPlayerListener;
            Globals.registerActivityListener(this);
            a();
        }

        public int getVideoDuration() {
            return this.c != null ? this.c.getDuration() : this.h;
        }

        public float getVideoCompletionThreshold() {
            if (this.c != null) {
                return this.c.getVideoCompletionThreshold();
            }
            return 96.0f;
        }

        public void load(String str) {
            this.b = str;
        }

        public void setUIMode(int i, String str) {
            this.d = i;
            this.e = str;
        }

        public void show() {
            show(null);
        }

        public void show(final String str) {
            if (this.g) {
                Intent intent = new Intent(Globals.getActivity(), AdsActivity.class);
                intent.putExtra("path", this.b);
                intent.putExtra("uiMode", this.d);
                intent.putExtra("uiProperties", this.e);
                intent.putExtra("endCard", str);
                this.f = 1;
                this.h = 0;
                try {
                    Globals.getActivity().startActivityForResult(intent, this.f);
                    return;
                } catch (ActivityNotFoundException e) {
                    return;
                }
            }
            Globals.getActivity().runOnUiThread(new Runnable() { // from class: com.rovio.rcs.ads.VideoPlayerBridge.VideoPlayerWrapper.1
                @Override // java.lang.Runnable
                public void run() {
                    if (VideoPlayerWrapper.this.c != null) {
                        VideoPlayerWrapper.this.c.c();
                    }
                    VideoPlayerWrapper.this.c = new VideoPlayer(VideoPlayerWrapper.this.a, Globals.getActivity(), Globals.getRootViewGroup(), VideoPlayerWrapper.this.b, VideoPlayerWrapper.this.d, VideoPlayerWrapper.this.e);
                    if (str != null) {
                        VideoPlayerWrapper.this.c.a(WebViewAdFactory.instance().a(str));
                    }
                    VideoPlayerWrapper.this.c.a();
                }
            });
        }

        public void hide() {
            if (this.c != null) {
                Globals.getActivity().runOnUiThread(new Runnable() { // from class: com.rovio.rcs.ads.VideoPlayerBridge.VideoPlayerWrapper.2
                    @Override // java.lang.Runnable
                    public void run() {
                        VideoPlayerWrapper.this.c.b();
                    }
                });
            } else if (this.f > 0) {
                Globals.getActivity().finishActivity(this.f);
            }
        }

        public void destroy() {
            destroy(null);
        }

        public void destroy(final WebViewAdFactory.LoadListener loadListener) {
            Globals.unregisterActivityListener(this);
            if (this.c != null) {
                Globals.getActivity().runOnUiThread(new Runnable() { // from class: com.rovio.rcs.ads.VideoPlayerBridge.VideoPlayerWrapper.3
                    @Override // java.lang.Runnable
                    public void run() {
                        VideoPlayerWrapper.this.c.c();
                        if (loadListener != null) {
                            WebViewAdFactory.instance().a(loadListener);
                        }
                    }
                });
            } else if (this.f > 0) {
                Globals.getActivity().finishActivity(this.f);
            }
        }

        @Override // com.rovio.fusion.IActivityListener
        public void onResume() {
            if (this.c != null) {
                this.c.d();
            }
        }

        @Override // com.rovio.fusion.IActivityListener
        public void onPause() {
            if (this.c != null) {
                this.c.e();
            }
        }

        @Override // com.rovio.fusion.IActivityListener
        public void onDestroy() {
        }

        @Override // com.rovio.fusion.IActivityListener
        public void onNewIntent(Intent intent) {
        }

        private void a(ArrayList<String> arrayList) {
            if (arrayList != null) {
                Iterator<String> it = arrayList.iterator();
                while (it.hasNext()) {
                    this.a.onVideoTrackEvent(it.next());
                }
            }
        }

        private void b(ArrayList<String> arrayList) {
            if (arrayList != null) {
                Iterator<String> it = arrayList.iterator();
                String str = null;
                while (it.hasNext()) {
                    String next = it.next();
                    if (str != null) {
                        this.a.onEndCardTrackEvent(str, next);
                        next = null;
                    }
                    str = next;
                }
            }
        }

        @Override // com.rovio.fusion.IActivityListener
        public void onActivityResult(int i, int i2, Intent intent) {
            if (this.f > 0 && this.f == i) {
                if (i2 == 2) {
                    String stringExtra = intent.getStringExtra("control");
                    float floatExtra = intent.getFloatExtra("percent", 0.0f);
                    this.h = intent.getIntExtra("duration", 0);
                    a(intent.getStringArrayListExtra("videoTrackEvents"));
                    b(intent.getStringArrayListExtra("endCardTrackEvents"));
                    this.a.onCustomControlClicked(stringExtra, floatExtra);
                    this.a.onVideoEnded(false, floatExtra);
                } else if (i2 == 3) {
                    String stringExtra2 = intent.getStringExtra("url");
                    a(intent.getStringArrayListExtra("videoTrackEvents"));
                    b(intent.getStringArrayListExtra("endCardTrackEvents"));
                    this.a.onEndCardClick(stringExtra2);
                    this.a.onVideoEnded(false, 100.0f);
                } else if (i2 == 1) {
                    boolean booleanExtra = intent.getBooleanExtra("error", false);
                    float floatExtra2 = intent.getFloatExtra("percent", 0.0f);
                    this.h = intent.getIntExtra("duration", 0);
                    a(intent.getStringArrayListExtra("videoTrackEvents"));
                    b(intent.getStringArrayListExtra("endCardTrackEvents"));
                    this.a.onVideoEnded(booleanExtra, floatExtra2);
                } else if (i2 == 0) {
                    this.a.onVideoEnded(true, 0.0f);
                }
                this.f = 0;
            }
        }

        public static void setDefaultUseActivity(boolean z) {
            m_defaultUseActivity = z;
        }

        private void a() {
            try {
                Globals.getActivity().getPackageManager().getActivityInfo(new ComponentName(Globals.getActivity(), AdsActivity.class), 0);
                this.g = m_defaultUseActivity;
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
    }

    public VideoPlayerBridge(long j) {
        this.a = 0L;
        this.a = j;
    }

    public void load(String str) {
        if (this.b != null) {
            this.b.load(str);
        }
    }

    public void loadEndCard(final String str, final String str2) {
        this.c = str;
        Globals.getActivity().runOnUiThread(new Runnable() { // from class: com.rovio.rcs.ads.VideoPlayerBridge.1
            @Override // java.lang.Runnable
            public void run() {
                WebViewAdFactory.instance().a(str, str2, Globals.getActivity(), VideoPlayerBridge.this);
            }
        });
    }

    public void setUIMode(int i, String str) {
        if (this.b != null) {
            this.b.setUIMode(i, str);
        }
    }

    public void show() {
        if (this.b != null) {
            this.b.show(this.c);
        }
    }

    public void hide() {
        if (this.b != null) {
            this.b.hide();
        }
    }

    public void destroy() {
        if (this.b != null) {
            this.b.destroy(this);
            this.b = null;
            this.a = 0L;
        }
    }

    @Override // com.rovio.rcs.ads.VideoPlayer.VideoPlayerListener
    public void onVideoTrackEvent(final String str) {
        Globals.runOnAppThread(new Runnable() { // from class: com.rovio.rcs.ads.VideoPlayerBridge.2
            @Override // java.lang.Runnable
            public void run() {
                if (VideoPlayerBridge.this.a != 0) {
                    VideoPlayerBridge.this.onVideoTrackEvent(VideoPlayerBridge.this.a, str);
                }
            }
        });
    }

    @Override // com.rovio.rcs.ads.VideoPlayer.VideoPlayerListener
    public void onVideoEnded(final boolean z, final float f) {
        Globals.runOnAppThread(new Runnable() { // from class: com.rovio.rcs.ads.VideoPlayerBridge.3
            @Override // java.lang.Runnable
            public void run() {
                VideoPlayerBridge.this.c = null;
                if (VideoPlayerBridge.this.a != 0) {
                    VideoPlayerBridge.this.onVideoEnded(VideoPlayerBridge.this.a, z, f);
                }
            }
        });
    }

    @Override // com.rovio.rcs.ads.VideoPlayer.VideoPlayerListener
    public void onCustomControlClicked(final String str, final float f) {
        Globals.runOnAppThread(new Runnable() { // from class: com.rovio.rcs.ads.VideoPlayerBridge.4
            @Override // java.lang.Runnable
            public void run() {
                if (VideoPlayerBridge.this.a != 0) {
                    VideoPlayerBridge.this.onCustomControlClicked(VideoPlayerBridge.this.a, str, f);
                }
            }
        });
    }

    @Override // com.rovio.rcs.ads.WebViewAdFactory.LoadListener
    public void onWebViewAdReady(String str, final boolean z) {
        if (this.c.equals(str)) {
            Globals.runOnAppThread(new Runnable() { // from class: com.rovio.rcs.ads.VideoPlayerBridge.5
                @Override // java.lang.Runnable
                public void run() {
                    if (VideoPlayerBridge.this.a != 0) {
                        VideoPlayerBridge.this.onEndCardReady(VideoPlayerBridge.this.a, z);
                    }
                }
            });
        }
    }

    @Override // com.rovio.rcs.ads.VideoPlayer.VideoPlayerListener
    public void onEndCardClick(final String str) {
        Globals.runOnAppThread(new Runnable() { // from class: com.rovio.rcs.ads.VideoPlayerBridge.6
            @Override // java.lang.Runnable
            public void run() {
                if (VideoPlayerBridge.this.a != 0) {
                    VideoPlayerBridge.this.onEndCardClick(VideoPlayerBridge.this.a, str);
                }
            }
        });
    }

    @Override // com.rovio.rcs.ads.VideoPlayer.VideoPlayerListener
    public void onEndCardTrackEvent(final String str, final String str2) {
        Globals.runOnAppThread(new Runnable() { // from class: com.rovio.rcs.ads.VideoPlayerBridge.7
            @Override // java.lang.Runnable
            public void run() {
                if (VideoPlayerBridge.this.a != 0) {
                    VideoPlayerBridge.this.onEndCardTrackEvent(VideoPlayerBridge.this.a, str, str2);
                }
            }
        });
    }
}
