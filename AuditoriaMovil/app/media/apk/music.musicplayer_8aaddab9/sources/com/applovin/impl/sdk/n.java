package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.i;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.google.ads.mediation.facebook.FacebookAdapter;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class n implements AppLovinCommunicatorSubscriber, i.a {
    private final m a;

    /* renamed from: b  reason: collision with root package name */
    private Object f4150b;

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<View> f4151c = new WeakReference<>(null);

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, Bundle> f4152d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final Object f4153e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private com.applovin.impl.sdk.utils.i f4154f;

    /* renamed from: g  reason: collision with root package name */
    private com.applovin.impl.sdk.utils.n f4155g;

    /* renamed from: h  reason: collision with root package name */
    private int f4156h;

    public n(m mVar) {
        this.a = mVar;
        AppLovinCommunicator.getInstance(mVar.L()).subscribe(this, "safedk_ad_info");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View a(final Activity activity) {
        Button button;
        int dpToPx = AppLovinSdkUtils.dpToPx(activity, 40);
        int i2 = dpToPx / 10;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPx, dpToPx, 8388629);
        layoutParams.setMargins(i2, i2, i2, i2);
        try {
            ImageButton imageButton = new ImageButton(activity);
            imageButton.setImageDrawable(activity.getResources().getDrawable(R.drawable.applovin_ic_white_small));
            imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageButton.setPadding(i2, i2, i2, i2 * 2);
            button = imageButton;
        } catch (Throwable unused) {
            Button button2 = new Button(activity);
            button2.setText("ⓘ");
            button2.setTextColor(-1);
            button2.setAllCaps(false);
            button2.setTextSize(2, 20.0f);
            button2.setPadding(0, 0, 0, 0);
            button = button2;
        }
        button.setLayoutParams(layoutParams);
        button.setBackground(g());
        button.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.sdk.n.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                n.this.a((Context) activity);
            }
        });
        if (com.applovin.impl.sdk.utils.g.d()) {
            button.setElevation(AppLovinSdkUtils.dpToPx(activity, 5));
        }
        return button;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        final String h2 = h();
        final WeakReference weakReference = new WeakReference(context);
        new AlertDialog.Builder(context).setTitle("Ad Info").setMessage(h2).setNegativeButton("Close", (DialogInterface.OnClickListener) null).setPositiveButton("Report", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.n.5
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                if (weakReference.get() != null) {
                    n.this.a((Context) weakReference.get(), h2);
                }
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str) {
        com.applovin.impl.sdk.utils.k kVar = new com.applovin.impl.sdk.utils.k();
        kVar.b("Describe your issue below:\n\n\n").a("Ad Info:").a(str).a("\nDebug Info:\n").a("Platform", "fireos".equals(this.a.V().f()) ? "Fire OS" : "Android").a("AppLovin SDK Version", AppLovinSdk.VERSION).a("Plugin Version", this.a.a(com.applovin.impl.sdk.c.b.dA)).a("Ad Review Version", Utils.getSafedkVersion()).a("App Package Name", context.getPackageName()).a("Device", Build.DEVICE).a("OS Version", Build.VERSION.RELEASE).a("AppLovin Random Token", this.a.o()).a(e());
        Intent intent = new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.SUBJECT", "MAX Ad Report").setPackage("com.google.android.gm");
        if (this.f4150b instanceof com.applovin.impl.sdk.ad.e) {
            intent.putExtra("android.intent.extra.SUBJECT", "AppLovin Ad Report");
            JSONObject originalFullResponse = ((com.applovin.impl.sdk.ad.e) this.f4150b).getOriginalFullResponse();
            Uri cacheTextWithFileName = AppLovinContentProviderUtils.cacheTextWithFileName(originalFullResponse.toString(), "ad_response.json");
            if (cacheTextWithFileName != null) {
                intent.putExtra("android.intent.extra.STREAM", cacheTextWithFileName);
            } else {
                kVar.a("\nAd Response:\n");
                kVar.a(originalFullResponse.toString());
            }
        }
        intent.putExtra("android.intent.extra.TEXT", kVar.toString());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            intent.setPackage(null);
            context.startActivity(intent);
        }
    }

    private String d() {
        Object obj = this.f4150b;
        if (obj instanceof com.applovin.impl.mediation.a.a) {
            return ((com.applovin.impl.mediation.a.a) obj).f();
        }
        if (com.applovin.impl.mediation.c.c.a(obj)) {
            return ((com.applovin.impl.sdk.ad.e) this.f4150b).I();
        }
        return null;
    }

    private Bundle e() {
        Bundle bundle;
        String d2 = d();
        if (StringUtils.isValidString(d2)) {
            synchronized (this.f4153e) {
                bundle = this.f4152d.get(d2);
            }
            return bundle;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.a.ad().b() && this.f4151c.get() == null) {
            Activity a = this.a.ae().a();
            View findViewById = a.findViewById(16908290);
            if (findViewById instanceof FrameLayout) {
                v B = this.a.B();
                StringBuilder y = e.a.d.a.a.y("Displaying creative debugger button for ad: ");
                y.append(this.f4150b);
                B.b("AppLovinSdk", y.toString());
                final FrameLayout frameLayout = (FrameLayout) findViewById;
                final View a2 = a(a);
                frameLayout.addView(a2);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(150L);
                a2.startAnimation(alphaAnimation);
                findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.applovin.impl.sdk.n.3
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public void onGlobalLayout() {
                        if (a2.getParent() == null) {
                            frameLayout.addView(a2);
                        }
                    }
                });
                this.f4151c = new WeakReference<>(a2);
            }
        }
    }

    private Drawable g() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.rgb(5, 131, 170));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(Color.rgb(2, 98, 127));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    private String h() {
        com.applovin.impl.sdk.utils.k kVar = new com.applovin.impl.sdk.utils.k();
        Object obj = this.f4150b;
        if (obj instanceof com.applovin.impl.sdk.ad.e) {
            com.applovin.impl.sdk.ad.e eVar = (com.applovin.impl.sdk.ad.e) obj;
            kVar.a("Network", "APPLOVIN").a(eVar).b(eVar);
        } else if (obj instanceof com.applovin.impl.mediation.a.a) {
            kVar.a((com.applovin.impl.mediation.a.a) obj);
        }
        kVar.a(this.a);
        kVar.a(e());
        return kVar.toString();
    }

    public void a() {
        String d2 = d();
        if (StringUtils.isValidString(d2)) {
            synchronized (this.f4153e) {
                this.f4152d.remove(d2);
            }
        }
        com.applovin.impl.sdk.utils.i iVar = this.f4154f;
        if (iVar != null) {
            iVar.b();
        }
        this.f4150b = null;
        this.f4151c = new WeakReference<>(null);
    }

    public void a(Object obj) {
        if (com.applovin.impl.mediation.c.c.b(obj)) {
            return;
        }
        this.f4150b = obj;
        if (((Boolean) this.a.a(com.applovin.impl.sdk.c.b.bM)).booleanValue() && this.a.p().isCreativeDebuggerEnabled()) {
            if (this.f4154f == null) {
                this.f4154f = new com.applovin.impl.sdk.utils.i(this.a, this);
            }
            this.f4154f.a();
        }
    }

    @Override // com.applovin.impl.sdk.utils.i.a
    public void b() {
        if (this.f4156h == 0) {
            this.f4155g = com.applovin.impl.sdk.utils.n.a(TimeUnit.SECONDS.toMillis(3L), this.a, new Runnable() { // from class: com.applovin.impl.sdk.n.1
                @Override // java.lang.Runnable
                public void run() {
                    n.this.f4156h = 0;
                }
            });
        }
        int i2 = this.f4156h;
        if (i2 % 2 == 0) {
            this.f4156h = i2 + 1;
        }
    }

    @Override // com.applovin.impl.sdk.utils.i.a
    public void c() {
        int i2 = this.f4156h;
        if (i2 % 2 == 1) {
            this.f4156h = i2 + 1;
        }
        if (this.f4156h / 2 == 2) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.n.2
                @Override // java.lang.Runnable
                public void run() {
                    n.this.a.ag().a(new Bundle(), "show_creative_debugger");
                    n.this.f();
                }
            });
            this.f4156h = 0;
            this.f4155g.d();
            this.f4154f.b();
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return n.class.getSimpleName();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("safedk_ad_info".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle bundle = appLovinCommunicatorMessage.getMessageData().getBundle("public");
            Bundle bundle2 = appLovinCommunicatorMessage.getMessageData().getBundle("private");
            String string = BundleUtils.getString(FacebookAdapter.KEY_ID, bundle2);
            MaxAdFormat formatFromString = MaxAdFormat.formatFromString(BundleUtils.getString("ad_format", bundle2));
            if (!StringUtils.isValidString(string) || formatFromString == null || !formatFromString.isFullscreenAd() || bundle == null) {
                return;
            }
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                bundle.remove(str);
                BundleUtils.put(StringUtils.toHumanReadableString(str), obj, bundle);
            }
            synchronized (this.f4153e) {
                this.f4152d.put(string, bundle);
            }
        }
    }
}
