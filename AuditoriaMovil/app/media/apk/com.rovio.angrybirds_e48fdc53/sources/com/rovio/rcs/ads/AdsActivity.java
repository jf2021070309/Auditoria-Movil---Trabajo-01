package com.rovio.rcs.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.rovio.rcs.ads.VideoPlayer;
import java.util.ArrayList;
/* loaded from: classes4.dex */
public class AdsActivity extends Activity implements VideoPlayer.VideoPlayerListener {
    static final int RESULT_CLICK_END_CARD = 3;
    static final int RESULT_CLICK_VIDEO = 2;
    static final int RESULT_END = 1;
    private static final String TAG = "AdsActivity";
    private static final boolean VERBOSE_LOGGING = false;
    private VideoPlayer a;
    private ArrayList<String> b;
    private ArrayList<String> c;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        RelativeLayout relativeLayout = new RelativeLayout(this);
        addContentView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
        this.a = new VideoPlayer(this, this, relativeLayout, intent.getStringExtra("path"), intent.getIntExtra("uiMode", 0), intent.getStringExtra("uiProperties"));
        String stringExtra = intent.getStringExtra("endCard");
        if (stringExtra != null) {
            this.a.a(WebViewAdFactory.instance().a(stringExtra));
        }
        this.a.a();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.a.d();
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.a.e();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.a.c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.rovio.rcs.ads.VideoPlayer.VideoPlayerListener
    public void onVideoEnded(boolean z, float f) {
        Intent intent = new Intent();
        intent.putExtra("error", z);
        intent.putExtra("percent", f);
        intent.putExtra("duration", this.a.getDuration());
        intent.putStringArrayListExtra("videoTrackEvents", this.b);
        intent.putStringArrayListExtra("endCardTrackEvents", this.c);
        setResult(1, intent);
        finish();
    }

    @Override // com.rovio.rcs.ads.VideoPlayer.VideoPlayerListener
    public void onVideoTrackEvent(String str) {
        if (this.b == null) {
            this.b = new ArrayList<>();
        }
        this.b.add(str);
    }

    @Override // com.rovio.rcs.ads.VideoPlayer.VideoPlayerListener
    public void onCustomControlClicked(String str, float f) {
        Intent intent = new Intent();
        intent.putExtra("control", str);
        intent.putExtra("percent", f);
        intent.putExtra("duration", this.a.getDuration());
        intent.putStringArrayListExtra("videoTrackEvents", this.b);
        intent.putStringArrayListExtra("endCardTrackEvents", this.c);
        setResult(2, intent);
        finish();
    }

    @Override // com.rovio.rcs.ads.VideoPlayer.VideoPlayerListener
    public void onEndCardClick(String str) {
        Intent intent = new Intent();
        intent.putExtra("url", str);
        intent.putStringArrayListExtra("videoTrackEvents", this.b);
        intent.putStringArrayListExtra("endCardTrackEvents", this.c);
        setResult(3, intent);
        finish();
    }

    @Override // com.rovio.rcs.ads.VideoPlayer.VideoPlayerListener
    public void onEndCardTrackEvent(String str, String str2) {
        if (this.c == null) {
            this.c = new ArrayList<>();
        }
        this.c.add(str);
        this.c.add(str2);
    }
}
