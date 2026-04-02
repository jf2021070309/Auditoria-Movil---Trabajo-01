package com.rovio.fusion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.rovio.fusion.VideoPlayer;
import com.rovio.fusion.VideoPlayerBridge;
/* loaded from: classes2.dex */
public class VideoPlayerActivity extends AppCompatActivity implements VideoPlayer.VideoPlayerListener {
    public static final int ENDING_CLICK = 2;
    public static final int ENDING_END = 1;
    private static final String TAG = "fusion.VideoPlayerActivity";
    private static final boolean VERBOSE_LOGGING = true;
    public static VideoPlayer sm_videoPlayer = null;
    private VideoPlayer a = null;

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.d(TAG, "onCreate");
        Intent intent = getIntent();
        RelativeLayout relativeLayout = new RelativeLayout(this);
        addContentView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
        this.a = new VideoPlayer(this, this, relativeLayout, intent.getStringExtra("path"), intent.getIntExtra("uiMode", 0), intent.getStringExtra("uiProperties"), intent.getLongExtra("handle", 0L));
        this.a.setStartingPos((int) (1000.0d * intent.getFloatExtra("startPositionSeconds", 0.0f)));
        sm_videoPlayer = this.a;
        this.a.mButtons = ((VideoPlayerBridge.ButtonCollection) intent.getSerializableExtra("extraButtonCollection")).mButtons;
        this.a.m_layers = ((VideoPlayerBridge.LayerCollection) intent.getSerializableExtra("extraLayerCollection")).m_layers;
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
        for (VideoPlayerBridge.ButtonData buttonData : this.a.mButtons) {
            Log.d(TAG, "retrieve button data:" + buttonData.a() + " " + buttonData.b() + " " + buttonData.c() + " " + buttonData.d());
            this.a.a(buttonData.a(), buttonData.b(), buttonData.c(), buttonData.d());
        }
        for (VideoPlayerBridge.LayerData layerData : this.a.m_layers) {
            Log.d(TAG, "retrieve layer data:" + layerData.m_image + " " + layerData.m_position);
            this.a.addExtraLayer(layerData.m_handle, layerData.m_image, layerData.m_secondsVisible, layerData.m_position, layerData.m_text, layerData.m_font, layerData.m_fontSize);
        }
        this.a.show();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
        this.a.onResume();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
        this.a.onPause();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
        sm_videoPlayer = null;
        this.a.destroy();
    }

    @Override // com.rovio.fusion.VideoPlayer.VideoPlayerListener
    public void onVideoEnded(boolean z, int i, float f, float f2) {
        Log.d(TAG, "onVideoEnded " + z + " " + f);
        this.a.onPause();
        Intent intent = new Intent();
        intent.putExtra("com.rovio.fusion_activity", "VideoPlayerActivity");
        intent.putExtra("error", z);
        intent.putExtra("percent", f);
        intent.putExtra("duration", f2);
        intent.putExtra("reason", i);
        intent.putExtra("endingType", 1);
        setResult(-1, intent);
        finish();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Log.d(TAG, "onKeyDown()");
        if (keyEvent.getKeyCode() == 4) {
            int ordinal = VideoPlayer.PlaybackEndReason.SKIPPED.ordinal();
            this.a.onPause();
            float duration = this.a.getDuration() / 1000.0f;
            float currentPosition = this.a.getDuration() > 0 ? (100.0f * this.a.getCurrentPosition()) / this.a.getDuration() : 0.0f;
            Intent intent = new Intent();
            intent.putExtra("com.rovio.fusion_activity", "VideoPlayerActivity");
            intent.putExtra("error", false);
            intent.putExtra("percent", currentPosition);
            intent.putExtra("duration", duration);
            intent.putExtra("reason", ordinal);
            intent.putExtra("endingType", 2);
            setResult(-1, intent);
            finish();
        }
        return super.onKeyDown(i, keyEvent);
    }
}
