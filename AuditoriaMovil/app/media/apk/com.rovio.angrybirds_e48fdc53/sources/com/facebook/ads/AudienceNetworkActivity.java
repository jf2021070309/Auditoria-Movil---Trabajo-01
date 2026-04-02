package com.facebook.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.ads.internal.adapters.ad;
import com.facebook.ads.internal.adapters.m;
import com.facebook.ads.internal.adapters.n;
import com.facebook.ads.internal.j.d;
import com.facebook.ads.internal.q.a.v;
import com.facebook.ads.internal.settings.a;
import com.facebook.ads.internal.view.a;
import com.facebook.ads.internal.view.b.c;
import com.facebook.ads.internal.view.e.b;
import com.facebook.ads.internal.view.e.b.z;
import com.facebook.ads.internal.view.f;
import com.facebook.ads.internal.view.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public class AudienceNetworkActivity extends Activity {
    @Deprecated
    public static final String AD_ICON_URL = "adIconUrl";
    @Deprecated
    public static final String AD_SUBTITLE = "adSubtitle";
    @Deprecated
    public static final String AD_TITLE = "adTitle";
    public static final String AUDIENCE_NETWORK_UNIQUE_ID_EXTRA = "uniqueId";
    public static final String AUTOPLAY = "autoplay";
    public static final String BROWSER_URL = "browserURL";
    public static final String CLIENT_TOKEN = "clientToken";
    @Deprecated
    public static final String CONTEXT_SWITCH_BEHAVIOR = "contextSwitchBehavior";
    @Deprecated
    public static final String END_CARD_ACTIVATION_COMMAND = "facebookRewardedVideoEndCardActivationCommand";
    @Deprecated
    public static final String END_CARD_MARKUP = "facebookRewardedVideoEndCardMarkup";
    public static final String HANDLER_TIME = "handlerTime";
    public static final String PLACEMENT_ID = "placementId";
    public static final String PREDEFINED_ORIENTATION_KEY = "predefinedOrientationKey";
    public static final String REQUEST_TIME = "requestTime";
    public static final String REWARD_SERVER_URL = "rewardServerURL";
    public static final String SKIP_DELAY_SECONDS_KEY = "skipAfterSeconds";
    public static final String VIDEO_LOGGER = "videoLogger";
    public static final String VIDEO_MPD = "videoMPD";
    @Deprecated
    public static final String VIDEO_REPORT_URL = "videoReportURL";
    public static final String VIDEO_SEEK_TIME = "videoSeekTime";
    public static final String VIDEO_URL = "videoURL";
    public static final String VIEW_TYPE = "viewType";
    @Deprecated
    public static final String WEBVIEW_ENCODING = "utf-8";
    @Deprecated
    public static final String WEBVIEW_MIME_TYPE = "text/html";
    private RelativeLayout b;
    private String d;
    private a.EnumC0117a e;
    private long f;
    private long g;
    private int h;
    private com.facebook.ads.internal.view.a i;
    private c j;
    private final List<BackButtonInterceptor> a = new ArrayList();
    private int c = -1;

    /* loaded from: classes2.dex */
    public interface BackButtonInterceptor {
        boolean interceptBackButton();
    }

    /* loaded from: classes2.dex */
    public enum Type {
        INTERSTITIAL_WEB_VIEW(a.EnumC0117a.INTERSTITIAL_WEB_VIEW),
        INTERSTITIAL_NATIVE_VIDEO(a.EnumC0117a.INTERSTITIAL_NATIVE_VIDEO),
        INTERSTITIAL_NATIVE_IMAGE(a.EnumC0117a.INTERSTITIAL_NATIVE_IMAGE),
        INTERSTITIAL_NATIVE_CAROUSEL(a.EnumC0117a.INTERSTITIAL_NATIVE_CAROUSEL),
        FULL_SCREEN_VIDEO(a.EnumC0117a.FULL_SCREEN_VIDEO),
        REWARDED_VIDEO(a.EnumC0117a.REWARDED_VIDEO),
        BROWSER(a.EnumC0117a.BROWSER);
        
        a.EnumC0117a a;

        Type(a.EnumC0117a enumC0117a) {
            this.a = enumC0117a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class a implements View.OnLongClickListener {
        private a() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (AudienceNetworkActivity.this.j != null && AudienceNetworkActivity.this.b != null) {
                AudienceNetworkActivity.this.j.setBounds(0, 0, AudienceNetworkActivity.this.b.getWidth(), AudienceNetworkActivity.this.b.getHeight());
                AudienceNetworkActivity.this.j.a(AudienceNetworkActivity.this.j.a() ? false : true);
            }
            return true;
        }
    }

    private void a(Intent intent, Bundle bundle) {
        if (bundle != null) {
            this.c = bundle.getInt(PREDEFINED_ORIENTATION_KEY, -1);
            this.d = bundle.getString(AUDIENCE_NETWORK_UNIQUE_ID_EXTRA);
            this.e = (a.EnumC0117a) bundle.getSerializable(VIEW_TYPE);
            return;
        }
        this.c = intent.getIntExtra(PREDEFINED_ORIENTATION_KEY, -1);
        this.d = intent.getStringExtra(AUDIENCE_NETWORK_UNIQUE_ID_EXTRA);
        this.e = (a.EnumC0117a) intent.getSerializableExtra(VIEW_TYPE);
        this.h = intent.getIntExtra(SKIP_DELAY_SECONDS_KEY, 0) * 1000;
    }

    private void a(Intent intent, boolean z) {
        if (!com.facebook.ads.internal.l.a.b(this) || this.e == a.EnumC0117a.BROWSER) {
            return;
        }
        this.j = new c();
        this.j.a(intent.getStringExtra(PLACEMENT_ID));
        this.j.b(getPackageName());
        long longExtra = intent.getLongExtra(REQUEST_TIME, 0L);
        if (longExtra != 0) {
            this.j.a(longExtra);
        }
        TextView textView = new TextView(this);
        textView.setText("Debug");
        textView.setTextColor(-1);
        textView.setBackgroundColor(Color.argb(160, 0, 0, 0));
        textView.setPadding(5, 5, 5, 5);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(12, -1);
        layoutParams.addRule(11, -1);
        textView.setLayoutParams(layoutParams);
        a aVar = new a();
        textView.setOnLongClickListener(aVar);
        if (z) {
            this.b.addView(textView);
        } else {
            this.b.setOnLongClickListener(aVar);
        }
        this.b.getOverlay().add(this.j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        LocalBroadcastManager.getInstance(this).sendBroadcast(new Intent(str + ":" + this.d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, d dVar) {
        Intent intent = new Intent(str + ":" + this.d);
        intent.putExtra("event", dVar);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    public void addBackButtonInterceptor(BackButtonInterceptor backButtonInterceptor) {
        this.a.add(backButtonInterceptor);
    }

    @Override // android.app.Activity
    public void finish() {
        if (isFinishing()) {
            return;
        }
        if (this.e == a.EnumC0117a.REWARDED_VIDEO) {
            a(z.REWARDED_VIDEO_CLOSED.a());
        } else {
            a("com.facebook.ads.interstitial.dismissed");
        }
        super.finish();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        this.g += currentTimeMillis - this.f;
        this.f = currentTimeMillis;
        if (this.g > this.h) {
            boolean z2 = false;
            Iterator<BackButtonInterceptor> it = this.a.iterator();
            while (true) {
                z = z2;
                if (!it.hasNext()) {
                    break;
                }
                z2 = it.next().interceptBackButton() ? true : z;
            }
            if (z) {
                return;
            }
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        if (this.i instanceof n) {
            ((n) this.i).a(configuration);
        } else if (this.i instanceof q) {
            ((q) this.i).a(configuration);
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean z = true;
        super.onCreate(bundle);
        com.facebook.ads.internal.q.a.d.a();
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        this.b = new RelativeLayout(this);
        v.a(this.b, -16777216);
        setContentView(this.b, new RelativeLayout.LayoutParams(-1, -1));
        Intent intent = getIntent();
        a(intent, bundle);
        com.facebook.ads.internal.m.d a2 = com.facebook.ads.internal.m.d.a(this);
        if (this.e == a.EnumC0117a.FULL_SCREEN_VIDEO) {
            com.facebook.ads.internal.view.v vVar = new com.facebook.ads.internal.view.v(this, a2, new a.InterfaceC0118a() { // from class: com.facebook.ads.AudienceNetworkActivity.1
                @Override // com.facebook.ads.internal.view.a.InterfaceC0118a
                public void a(View view) {
                    AudienceNetworkActivity.this.b.addView(view);
                }

                @Override // com.facebook.ads.internal.view.a.InterfaceC0118a
                public void a(String str) {
                    AudienceNetworkActivity.this.a(str);
                }

                @Override // com.facebook.ads.internal.view.a.InterfaceC0118a
                public void a(String str, d dVar) {
                    AudienceNetworkActivity.this.a(str, dVar);
                }
            });
            vVar.a(this.b);
            this.i = vVar;
            z = false;
        } else if (this.e == a.EnumC0117a.REWARDED_VIDEO) {
            this.i = new q(this, a2, new b(this), new a.InterfaceC0118a() { // from class: com.facebook.ads.AudienceNetworkActivity.2
                @Override // com.facebook.ads.internal.view.a.InterfaceC0118a
                public void a(View view) {
                    AudienceNetworkActivity.this.b.addView(view);
                }

                @Override // com.facebook.ads.internal.view.a.InterfaceC0118a
                public void a(String str) {
                    AudienceNetworkActivity.this.a(str);
                    String a3 = z.REWARDED_VIDEO_END_ACTIVITY.a();
                    String a4 = z.REWARDED_VIDEO_ERROR.a();
                    if (str.equals(a3) || str.equals(a4)) {
                        AudienceNetworkActivity.this.finish();
                    }
                }

                @Override // com.facebook.ads.internal.view.a.InterfaceC0118a
                public void a(String str, d dVar) {
                    AudienceNetworkActivity.this.a(str);
                }
            }, (ad) intent.getSerializableExtra("rewardedVideoAdDataBundle"));
            z = false;
        } else if (this.e == a.EnumC0117a.INTERSTITIAL_WEB_VIEW) {
            this.i = new f(this, a2, new a.InterfaceC0118a() { // from class: com.facebook.ads.AudienceNetworkActivity.3
                @Override // com.facebook.ads.internal.view.a.InterfaceC0118a
                public void a(View view) {
                    AudienceNetworkActivity.this.b.addView(view);
                }

                @Override // com.facebook.ads.internal.view.a.InterfaceC0118a
                public void a(String str) {
                    AudienceNetworkActivity.this.a(str);
                }

                @Override // com.facebook.ads.internal.view.a.InterfaceC0118a
                public void a(String str, d dVar) {
                    AudienceNetworkActivity.this.a(str, dVar);
                }
            });
        } else if (this.e == a.EnumC0117a.BROWSER) {
            this.i = new com.facebook.ads.internal.view.b(this, a2, new a.InterfaceC0118a() { // from class: com.facebook.ads.AudienceNetworkActivity.4
                @Override // com.facebook.ads.internal.view.a.InterfaceC0118a
                public void a(View view) {
                    AudienceNetworkActivity.this.b.addView(view);
                }

                @Override // com.facebook.ads.internal.view.a.InterfaceC0118a
                public void a(String str) {
                    AudienceNetworkActivity.this.a(str);
                }

                @Override // com.facebook.ads.internal.view.a.InterfaceC0118a
                public void a(String str, d dVar) {
                    AudienceNetworkActivity.this.a(str, dVar);
                }
            });
            z = false;
        } else if (this.e != a.EnumC0117a.INTERSTITIAL_NATIVE_VIDEO && this.e != a.EnumC0117a.INTERSTITIAL_NATIVE_IMAGE && this.e != a.EnumC0117a.INTERSTITIAL_NATIVE_CAROUSEL) {
            com.facebook.ads.internal.j.b.a(com.facebook.ads.internal.j.a.a(null, "Unable to infer viewType from intent or savedInstanceState"));
            a("com.facebook.ads.interstitial.error");
            finish();
            return;
        } else {
            this.i = m.a(intent.getStringExtra(AUDIENCE_NETWORK_UNIQUE_ID_EXTRA));
            if (this.i == null) {
                com.facebook.ads.internal.j.b.a(com.facebook.ads.internal.j.a.a(null, "Unable to find view"));
                a("com.facebook.ads.interstitial.error");
                finish();
                return;
            }
            this.i.setListener(new a.InterfaceC0118a() { // from class: com.facebook.ads.AudienceNetworkActivity.5
                @Override // com.facebook.ads.internal.view.a.InterfaceC0118a
                public void a(View view) {
                    AudienceNetworkActivity.this.b.addView(view);
                }

                @Override // com.facebook.ads.internal.view.a.InterfaceC0118a
                public void a(String str) {
                    AudienceNetworkActivity.this.a(str);
                }

                @Override // com.facebook.ads.internal.view.a.InterfaceC0118a
                public void a(String str, d dVar) {
                    AudienceNetworkActivity.this.a(str, dVar);
                }
            });
            z = false;
        }
        this.i.a(intent, bundle, this);
        a("com.facebook.ads.interstitial.displayed");
        this.f = System.currentTimeMillis();
        a(intent, z);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        if (this.b != null) {
            this.b.removeAllViews();
        }
        if (this.i != null) {
            m.a(this.i);
            this.i.onDestroy();
            this.i = null;
        }
        if (this.j != null && com.facebook.ads.internal.l.a.b(this)) {
            this.j.b();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        this.g += System.currentTimeMillis() - this.f;
        if (this.i != null) {
            this.i.i();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.f = System.currentTimeMillis();
        if (this.i != null) {
            this.i.j();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.i != null) {
            this.i.a(bundle);
        }
        bundle.putInt(PREDEFINED_ORIENTATION_KEY, this.c);
        bundle.putString(AUDIENCE_NETWORK_UNIQUE_ID_EXTRA, this.d);
        bundle.putSerializable(VIEW_TYPE, this.e);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.c != -1) {
            setRequestedOrientation(this.c);
        }
    }

    public void removeBackButtonInterceptor(BackButtonInterceptor backButtonInterceptor) {
        this.a.remove(backButtonInterceptor);
    }
}
