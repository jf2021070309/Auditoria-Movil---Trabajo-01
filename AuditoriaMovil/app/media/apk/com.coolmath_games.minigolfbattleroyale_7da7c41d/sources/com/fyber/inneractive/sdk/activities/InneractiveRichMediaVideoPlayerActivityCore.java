package com.fyber.inneractive.sdk.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.VideoView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.gms.drive.DriveFile;
/* loaded from: classes.dex */
public class InneractiveRichMediaVideoPlayerActivityCore extends Activity {
    public static final String VIDEO_CURRENT_POSITION = "video_current_position";
    public static final String VIDEO_URL = "video_url";
    private View a;
    private VideoView b;
    private int c = 0;
    private final MediaPlayer.OnPreparedListener d = new MediaPlayer.OnPreparedListener() { // from class: com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore.1
        @Override // android.media.MediaPlayer.OnPreparedListener
        public final void onPrepared(MediaPlayer mediaPlayer) {
            IAlog.b("onPrepared", new Object[0]);
            InneractiveRichMediaVideoPlayerActivityCore.this.b.seekTo(InneractiveRichMediaVideoPlayerActivityCore.this.c);
            InneractiveRichMediaVideoPlayerActivityCore.this.b.start();
        }
    };

    protected void initWindowFeatures() {
        requestWindowFeature(1);
        getWindow().addFlags(1024);
        getWindow().addFlags(128);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        initWindowFeatures();
        super.onCreate(bundle);
        if (bundle != null) {
            this.c = bundle.getInt(VIDEO_CURRENT_POSITION, 0);
        }
        setContentView(R.layout.ia_rich_media_video);
        this.b = (VideoView) findViewById(R.id.mraid_video_view);
        Intent intent = getIntent();
        String stringExtra = (intent == null || !intent.hasExtra("video_url")) ? null : intent.getStringExtra("video_url");
        if (TextUtils.isEmpty(stringExtra)) {
            IAlog.b("Error: video can not be played.", new Object[0]);
            finish();
        } else {
            this.b.setVideoPath(stringExtra);
            this.b.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore.3
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer) {
                    InneractiveRichMediaVideoPlayerActivityCore.this.finish();
                }
            });
            this.b.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore.4
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                    IAlog.b("Error: video can not be played.", new Object[0]);
                    InneractiveRichMediaVideoPlayerActivityCore.this.finish();
                    return false;
                }
            });
            this.b.setOnPreparedListener(this.d);
        }
        View findViewById = findViewById(R.id.ia_iv_close_button);
        this.a = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InneractiveRichMediaVideoPlayerActivityCore.this.finish();
            }
        });
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.c = this.b.getCurrentPosition();
        this.b.pause();
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        VideoView videoView = this.b;
        bundle.putInt(VIDEO_CURRENT_POSITION, videoView == null ? 0 : videoView.getCurrentPosition());
    }

    public static boolean startRichMediaIntent(Context context, String str) {
        Intent intent = new Intent(context, InneractiveRichMediaVideoPlayerActivityCore.class);
        intent.setFlags(DriveFile.MODE_READ_ONLY);
        intent.putExtra("video_url", str);
        try {
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            IAlog.b("Activity InneractiveRichMediaVideoPlayerActivityCore was not found. Did you declare it in your AndroidManifest.xml?", new Object[0]);
            return false;
        }
    }
}
