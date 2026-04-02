package com.rovio.fusion;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;
import com.rovio.fusion.VideoPlayerBridge;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Queue;
/* loaded from: classes2.dex */
public class VideoPlayer implements MediaController.MediaPlayerControl {
    private static final String TAG = "fusion.VideoPlayer";
    private static final boolean VERBOSE_LOGGING = false;
    private long D;
    private String d;
    private String e;
    private Activity f;
    private ViewGroup g;
    public Queue<VideoPlayerBridge.ButtonData> mButtons;
    public Queue<VideoPlayerBridge.LayerData> m_layers;
    private VideoPlayerListener w;
    private HashMap<Long, ArrayList<ExtraButtonInfo>> a = new HashMap<>();
    private HashMap<Long, ArrayList<VideoPlayerBridge.LayerData>> b = new HashMap<>();
    private boolean c = false;
    private VideoView h = null;
    private boolean i = false;
    private int j = 0;
    private int k = 0;
    private Runnable l = null;
    private RelativeLayout m = null;
    private Animation n = null;
    private Animation o = null;
    private Animation p = null;
    private View q = null;
    private boolean r = false;
    private Runnable s = null;
    private boolean t = false;
    private WeakReference<MediaPlayer> u = null;
    private long v = 0;
    private int x = 0;
    private int y = 0;
    private MediaController z = null;
    private Object A = new Object();
    private ArrayList<ImageButton> B = new ArrayList<>();
    private Handler C = new Handler();
    private boolean E = true;
    private boolean F = false;
    private PlaybackEndReason G = PlaybackEndReason.PLAYBACK_COMPLETED;

    /* loaded from: classes2.dex */
    public enum PlaybackEndReason {
        PLAYBACK_COMPLETED,
        CLOSED,
        SKIPPED,
        FILE_NOT_FOUND,
        CONNECTION_LOST,
        UNSUPPORTED_MEDIA_TYPE,
        UNKNOWN_ERROR
    }

    /* loaded from: classes2.dex */
    public enum Position {
        LEFT,
        CENTER,
        RIGHT,
        TOP_LEFT,
        TOP_CENTER,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_CENTER,
        BOTTOM_RIGHT
    }

    /* loaded from: classes2.dex */
    public interface VideoPlayerListener {
        void onVideoEnded(boolean z, int i, float f, float f2);
    }

    protected native void announceOnPause(long j, float f);

    protected native void announceOnResume(long j, float f);

    protected native void onExtraButtonClicked(long j, String str);

    protected native void onPlay(long j, float f);

    protected native void onVideoStarted(long j);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class ExtraButtonInfo {
        public String buttonId;
        public String image;
        public Position position;

        private ExtraButtonInfo() {
        }

        public void setPosition(int i) {
            if (i == 0) {
                this.position = Position.LEFT;
            } else if (i == 1) {
                this.position = Position.CENTER;
            } else {
                this.position = Position.RIGHT;
            }
        }
    }

    public VideoPlayer(VideoPlayerListener videoPlayerListener, Activity activity, ViewGroup viewGroup, String str, int i, String str2, long j) {
        this.d = "";
        this.w = null;
        this.D = 0L;
        this.D = j;
        this.f = activity;
        this.g = viewGroup;
        this.w = videoPlayerListener;
        this.d = str;
        this.e = str2;
    }

    public void load(String str) {
        this.d = str;
    }

    public void setUIMode(int i, String str) {
        this.e = str;
    }

    public void show() {
        this.c = false;
        if (this.p != null) {
            this.p.cancel();
        }
        a();
        b();
        this.h.setVideoPath(this.d);
        if (this.o == null) {
            this.o = new AlphaAnimation(0.0f, 1.0f);
            this.o.setDuration(400L);
            this.o.setAnimationListener(new Animation.AnimationListener() { // from class: com.rovio.fusion.VideoPlayer.1
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    VideoPlayer.this.o = null;
                    VideoPlayer.this.d();
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                }
            });
            this.m.startAnimation(this.o);
        }
        h();
    }

    public void close() {
        e();
        a(true);
    }

    public void destroy() {
        e();
        a(true);
    }

    private void a() {
        if (this.m == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.m = new RelativeLayout(this.f);
            this.m.setBackgroundColor(-16777216);
            this.m.setOnKeyListener(new View.OnKeyListener() { // from class: com.rovio.fusion.VideoPlayer.2
                @Override // android.view.View.OnKeyListener
                public boolean onKey(View view, int i, KeyEvent keyEvent) {
                    if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 4) {
                        VideoPlayer.this.G = PlaybackEndReason.SKIPPED;
                        VideoPlayer.this.close();
                        return true;
                    }
                    return false;
                }
            });
            this.m.setOnTouchListener(new View.OnTouchListener() { // from class: com.rovio.fusion.VideoPlayer.3
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    return false;
                }
            });
            this.g.addView(this.m, layoutParams);
        }
    }

    private void b() {
        if (this.h == null) {
            this.h = new VideoView(this.f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.h.setLayoutParams(layoutParams);
            this.h.setZOrderMediaOverlay(true);
            this.h.setBackgroundColor(-16777216);
            this.i = false;
            this.k = 0;
            this.r = false;
            this.h.setOnKeyListener(new View.OnKeyListener() { // from class: com.rovio.fusion.VideoPlayer.4
                @Override // android.view.View.OnKeyListener
                public boolean onKey(View view, int i, KeyEvent keyEvent) {
                    if (keyEvent.getKeyCode() == 4) {
                        if (VideoPlayer.this.z != null) {
                            VideoPlayer.this.z.hide();
                            VideoPlayer.this.z = null;
                            return true;
                        }
                        VideoPlayer.this.G = PlaybackEndReason.SKIPPED;
                        VideoPlayer.this.a(false, VideoPlayer.this.f());
                        VideoPlayer.this.a(true);
                        return true;
                    }
                    return false;
                }
            });
            this.h.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.rovio.fusion.VideoPlayer.5
                @Override // android.media.MediaPlayer.OnPreparedListener
                public void onPrepared(MediaPlayer mediaPlayer) {
                    VideoPlayer.this.u = new WeakReference(mediaPlayer);
                    if (VideoPlayer.this.i) {
                        VideoPlayer.this.i = false;
                        VideoPlayer.this.i();
                        return;
                    }
                    VideoPlayer.this.g();
                    VideoPlayer.this.k = VideoPlayer.this.h.getDuration();
                    mediaPlayer.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: com.rovio.fusion.VideoPlayer.5.1
                        @Override // android.media.MediaPlayer.OnInfoListener
                        public boolean onInfo(MediaPlayer mediaPlayer2, int i, int i2) {
                            if (i == 701) {
                                VideoPlayer.this.h();
                                return false;
                            } else if (i == 702) {
                                VideoPlayer.this.i();
                                return false;
                            } else {
                                return false;
                            }
                        }
                    });
                    VideoPlayer.this.h.postDelayed(VideoPlayer.this.l, 100L);
                    VideoPlayer.this.d();
                    VideoPlayer.this.onVideoStarted(VideoPlayer.this.D);
                }
            });
            this.h.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.rovio.fusion.VideoPlayer.6
                @Override // android.media.MediaPlayer.OnCompletionListener
                public void onCompletion(MediaPlayer mediaPlayer) {
                    VideoPlayer.this.a(false, 100.0f);
                    VideoPlayer.this.a(true);
                }
            });
            this.h.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.rovio.fusion.VideoPlayer.7
                @Override // android.media.MediaPlayer.OnErrorListener
                public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                    float f;
                    int currentPosition = mediaPlayer.getCurrentPosition();
                    if (currentPosition < 0 || currentPosition > VideoPlayer.this.k) {
                        currentPosition = VideoPlayer.this.j;
                    }
                    if (VideoPlayer.this.k > 0 && currentPosition > 0 && currentPosition <= VideoPlayer.this.k) {
                        f = (currentPosition * 100) / VideoPlayer.this.k;
                    } else {
                        f = 0.0f;
                    }
                    if (i == 100) {
                        VideoPlayer.this.G = PlaybackEndReason.CONNECTION_LOST;
                    } else {
                        VideoPlayer.this.G = PlaybackEndReason.UNKNOWN_ERROR;
                    }
                    VideoPlayer.this.a(true, f);
                    mediaPlayer.reset();
                    VideoPlayer.this.a(false);
                    return true;
                }
            });
            this.h.setOnTouchListener(new View.OnTouchListener() { // from class: com.rovio.fusion.VideoPlayer.8
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (VideoPlayer.this.F && VideoPlayer.this.E) {
                        VideoPlayer.this.j();
                        return true;
                    }
                    return false;
                }
            });
            this.l = new Runnable() { // from class: com.rovio.fusion.VideoPlayer.9
                @Override // java.lang.Runnable
                public void run() {
                    if (VideoPlayer.this.h != null && VideoPlayer.this.k > 0) {
                        if (VideoPlayer.this.h.isPlaying()) {
                            VideoPlayer.this.j = VideoPlayer.this.h.getCurrentPosition();
                            VideoPlayer.this.onPlay(VideoPlayer.this.D, VideoPlayer.this.j / 1000.0f);
                        }
                        VideoPlayer.this.h.postDelayed(VideoPlayer.this.l, 250L);
                    }
                }
            };
            this.m.addView(this.h);
        }
    }

    private void c() {
        synchronized (this.A) {
            if (this.E) {
                if (this.z == null) {
                    this.z = new MediaController(this.f);
                }
            } else if (this.z != null) {
                this.z.hide();
                this.z = null;
            }
            if (this.z != null) {
                this.z.setMediaPlayer(this);
                this.z.setAnchorView(this.h);
                k();
                l();
                this.C.post(new Runnable() { // from class: com.rovio.fusion.VideoPlayer.10
                    @Override // java.lang.Runnable
                    public void run() {
                        VideoPlayer.this.j();
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.o == null && this.k != 0) {
            i();
            c();
            if (this.j < this.y) {
                this.j = this.y;
            }
            this.h.setBackgroundColor(0);
            this.h.seekTo(this.j);
            this.F = true;
            this.h.start();
        }
    }

    private void e() {
        this.F = false;
        if (this.h != null && this.h.isPlaying()) {
            this.h.stopPlayback();
        }
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float f() {
        float f = 1.0f;
        if (this.h != null && this.h.isPlaying()) {
            f = this.h.getCurrentPosition() / this.h.getDuration();
        } else if (this.k > 0 && this.j > 0 && this.j <= this.k) {
            f = this.j / this.k;
        }
        return f * 100.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, float f) {
        this.w.onVideoEnded(z, this.G.ordinal(), f, this.k / 1000.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        if (this.u != null) {
            this.u.clear();
        }
        i();
        if (this.o != null) {
            this.o.setAnimationListener(null);
            this.o.cancel();
            this.o = null;
        }
        if (this.h != null) {
            this.h.removeCallbacks(this.l);
            this.l = null;
            if (this.h.isPlaying()) {
                this.h.stopPlayback();
            } else {
                this.h.suspend();
            }
            this.h.setBackgroundColor(-16777216);
            this.h.post(new Runnable() { // from class: com.rovio.fusion.VideoPlayer.11
                @Override // java.lang.Runnable
                public void run() {
                    if (VideoPlayer.this.m != null) {
                        VideoPlayer.this.m.removeView(VideoPlayer.this.h);
                    }
                    VideoPlayer.this.h = null;
                }
            });
        }
        if (this.m != null) {
            if (z) {
                if (this.p == null) {
                    this.p = new AlphaAnimation(1.0f, 0.0f);
                    this.p.setDuration(400L);
                    this.p.setAnimationListener(new Animation.AnimationListener() { // from class: com.rovio.fusion.VideoPlayer.12
                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationEnd(Animation animation) {
                            VideoPlayer.this.p = null;
                            if (VideoPlayer.this.m != null) {
                                VideoPlayer.this.g.removeView(VideoPlayer.this.m);
                                VideoPlayer.this.m = null;
                            }
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationRepeat(Animation animation) {
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationStart(Animation animation) {
                        }
                    });
                    this.m.startAnimation(this.p);
                    return;
                }
                return;
            }
            this.m.clearAnimation();
            this.g.removeView(this.m);
            this.m = null;
        }
    }

    public void resume() {
        if (this.i) {
            onResume();
        } else {
            start();
        }
    }

    public void onResume() {
        if (this.h != null && this.i) {
            this.h.seekTo(this.j);
            this.h.start();
            this.F = true;
            if (!this.h.isPlaying()) {
                h();
            }
            this.h.postDelayed(this.l, 100L);
        }
        announceOnResume(this.D, this.j / 1000.0f);
    }

    public void onPause() {
        i();
        if (this.h != null) {
            if (this.u != null) {
                this.u.clear();
            }
            this.i = this.h.isPlaying();
            this.j = this.h.getCurrentPosition();
            this.h.pause();
            this.h.removeCallbacks(this.l);
        }
        announceOnPause(this.D, this.j / 1000.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.q == null) {
            ProgressBar progressBar = new ProgressBar(this.f, null, 16842874);
            progressBar.setIndeterminate(true);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            RelativeLayout relativeLayout = new RelativeLayout(this.f);
            relativeLayout.setBackgroundColor(-16777216);
            relativeLayout.addView(progressBar, layoutParams);
            relativeLayout.setFocusable(true);
            this.m.addView(relativeLayout, new RelativeLayout.LayoutParams(-1, -1));
            this.q = relativeLayout;
            this.q.requestFocus();
            if (this.s == null) {
                this.s = new Runnable() { // from class: com.rovio.fusion.VideoPlayer.13
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoPlayer.this.s != null) {
                            VideoPlayer.this.s = null;
                            float f = 0.0f;
                            if (VideoPlayer.this.k > 0) {
                                f = (VideoPlayer.this.j * 100) / VideoPlayer.this.k;
                            }
                            VideoPlayer.this.a(true, f);
                            VideoPlayer.this.a(true);
                        }
                    }
                };
            }
            this.q.postDelayed(this.s, 30000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void i() {
        if (this.q != null) {
            if (this.s != null && this.q.removeCallbacks(this.s)) {
                this.s = null;
            }
            if (this.n == null) {
                this.n = new AlphaAnimation(1.0f, 0.0f);
                this.n.setDuration(400L);
                this.n.setAnimationListener(new Animation.AnimationListener() { // from class: com.rovio.fusion.VideoPlayer.14
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        new Handler().post(new Runnable() { // from class: com.rovio.fusion.VideoPlayer.14.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (VideoPlayer.this.q != null) {
                                    if (VideoPlayer.this.m != null) {
                                        VideoPlayer.this.m.removeView(VideoPlayer.this.q);
                                        VideoPlayer.this.m.requestFocus();
                                    }
                                    VideoPlayer.this.q = null;
                                    VideoPlayer.this.n = null;
                                }
                            }
                        });
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                this.q.startAnimation(this.n);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        synchronized (this.A) {
            if (this.z != null) {
                this.z.setEnabled(true);
                this.z.show();
                this.z.requestFocus();
            } else {
                c();
            }
        }
    }

    private void k() {
        Long l = new Long(this.D);
        if (this.a.containsKey(l)) {
            Iterator<ExtraButtonInfo> it = this.a.get(l).iterator();
            while (it.hasNext()) {
                a(it.next());
            }
        }
    }

    private void l() {
        Long l = new Long(this.D);
        if (this.b.containsKey(l)) {
            Iterator<VideoPlayerBridge.LayerData> it = this.b.get(l).iterator();
            while (it.hasNext()) {
                addExtraLayer(it.next());
            }
        }
    }

    public void addExtraLayer(long j, String str, float f, int i, String str2, String str3, float f2) {
        VideoPlayerBridge.LayerData layerData = new VideoPlayerBridge.LayerData(j, str, f, i, str2, str3, f2);
        Long l = new Long(j);
        if (this.b.containsKey(l)) {
            this.b.get(l).add(layerData);
            return;
        }
        ArrayList<VideoPlayerBridge.LayerData> arrayList = new ArrayList<>();
        arrayList.add(layerData);
        this.b.put(l, arrayList);
    }

    public void addExtraLayer(VideoPlayerBridge.LayerData layerData) {
        String a = a(layerData.m_image);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (layerData.m_position == Position.LEFT.ordinal() || layerData.m_position == Position.TOP_LEFT.ordinal() || layerData.m_position == Position.BOTTOM_LEFT.ordinal()) {
            layoutParams2.addRule(9, 1);
        } else if (layerData.m_position == Position.RIGHT.ordinal() || layerData.m_position == Position.TOP_RIGHT.ordinal() || layerData.m_position == Position.BOTTOM_RIGHT.ordinal()) {
            layoutParams2.addRule(11, 1);
        } else {
            layoutParams2.addRule(14, 1);
        }
        if (layerData.m_position == Position.TOP_LEFT.ordinal() || layerData.m_position == Position.TOP_CENTER.ordinal() || layerData.m_position == Position.TOP_RIGHT.ordinal()) {
            layoutParams2.addRule(10, 1);
        } else if (layerData.m_position == Position.BOTTOM_LEFT.ordinal() || layerData.m_position == Position.BOTTOM_CENTER.ordinal() || layerData.m_position == Position.BOTTOM_RIGHT.ordinal()) {
            layoutParams2.addRule(12, 1);
        } else {
            layoutParams2.addRule(15, 1);
        }
        final RelativeLayout relativeLayout = new RelativeLayout(this.f);
        if (a.length() > 0) {
            ImageView imageView = new ImageView(this.f);
            imageView.setImageResource(b(a));
            imageView.setBackgroundDrawable(null);
            relativeLayout.addView(imageView, layoutParams2);
        }
        if (layerData.m_text.length() > 0) {
            TextView textView = new TextView(this.f);
            textView.setBackgroundDrawable(null);
            if (layerData.m_fontSize > 0.0f) {
                textView.setTextSize(0, layerData.m_fontSize);
            } else {
                textView.setTextSize(1, 0.1f);
            }
            textView.setText(layerData.m_text);
            relativeLayout.addView(textView, layoutParams2);
        }
        this.m.addView(relativeLayout, layoutParams);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.9f);
        alphaAnimation.setDuration((int) (layerData.m_secondsVisible * 1000.0f));
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.rovio.fusion.VideoPlayer.15
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                new Handler().post(new Runnable() { // from class: com.rovio.fusion.VideoPlayer.15.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (relativeLayout != null && VideoPlayer.this.m != null) {
                            VideoPlayer.this.m.removeView(relativeLayout);
                        }
                    }
                });
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        relativeLayout.startAnimation(alphaAnimation);
    }

    private void a(ExtraButtonInfo extraButtonInfo) {
        String a = a(extraButtonInfo.image);
        ImageButton imageButton = new ImageButton(this.f);
        imageButton.setTag(extraButtonInfo.buttonId);
        imageButton.setImageResource(b(a));
        imageButton.setClickable(true);
        imageButton.requestFocus();
        imageButton.setBackgroundDrawable(null);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.rovio.fusion.VideoPlayer.16
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                VideoPlayer.this.onExtraButtonClicked(VideoPlayer.this.D, (String) view.getTag());
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (extraButtonInfo.position == Position.LEFT) {
            layoutParams.gravity = 51;
        } else if (extraButtonInfo.position == Position.CENTER) {
            layoutParams.gravity = 49;
        } else {
            layoutParams.gravity = 53;
        }
        if (this.z != null) {
            this.z.addView(imageButton, layoutParams);
        }
        this.B.add(imageButton);
    }

    private String a(String str) {
        int lastIndexOf;
        if (str == null || (lastIndexOf = str.lastIndexOf(47)) == str.length() - 1) {
            return null;
        }
        String[] split = str.substring(lastIndexOf + 1).split("\\.");
        if (split.length != 0) {
            return split[0];
        }
        return null;
    }

    private int b(String str) {
        return this.f.getResources().getIdentifier(str.toLowerCase(), "drawable", this.f.getPackageName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(long j, String str, String str2, int i) {
        ExtraButtonInfo extraButtonInfo = new ExtraButtonInfo();
        extraButtonInfo.buttonId = str;
        extraButtonInfo.image = str2;
        extraButtonInfo.setPosition(i);
        Long l = new Long(j);
        if (this.a.containsKey(l)) {
            this.a.get(l).add(extraButtonInfo);
            return;
        }
        ArrayList<ExtraButtonInfo> arrayList = new ArrayList<>();
        arrayList.add(extraButtonInfo);
        this.a.put(l, arrayList);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        return this.x;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (this.h != null) {
            return this.h.getCurrentPosition();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (this.h != null) {
            return this.h.getDuration();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        if (this.h != null) {
            return this.h.isPlaying();
        }
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        if (this.h != null) {
            this.h.pause();
        }
    }

    public void hide() {
        if (this.h != null) {
            this.h.setZOrderMediaOverlay(false);
        }
    }

    public void visible() {
        if (this.h != null) {
            this.h.setZOrderMediaOverlay(true);
        }
    }

    public void setStartingPos(int i) {
        this.y = i;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i) {
        if (this.h != null) {
            this.h.seekTo(i);
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        if (this.h != null) {
            this.h.start();
        }
    }
}
