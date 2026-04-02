package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
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
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.h;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class l implements AppLovinCommunicatorSubscriber, h.a {
    private final k a;
    private Object b;
    private WeakReference<View> c = new WeakReference<>(null);
    private String d;
    private com.applovin.impl.sdk.utils.h e;
    private com.applovin.impl.sdk.utils.m f;
    private int g;

    public l(k kVar) {
        this.a = kVar;
        AppLovinCommunicator.getInstance(kVar.J()).subscribe(this, "safedk_ad_info");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View a(final Activity activity) {
        Button button;
        int dpToPx = AppLovinSdkUtils.dpToPx(activity, 40);
        int i = dpToPx / 10;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPx, dpToPx, 8388629);
        layoutParams.setMargins(i, i, i, i);
        try {
            ImageButton imageButton = new ImageButton(activity);
            imageButton.setImageDrawable(activity.getResources().getDrawable(R.drawable.applovin_ic_white_small));
            imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageButton.setPadding(i, i, i, i * 2);
            button = imageButton;
        } catch (Resources.NotFoundException unused) {
            Button button2 = new Button(activity);
            button2.setText("ⓘ");
            button2.setTextColor(-1);
            button2.setAllCaps(false);
            button2.setTextSize(2, 20.0f);
            button2.setPadding(0, 0, 0, 0);
            button = button2;
        }
        button.setLayoutParams(layoutParams);
        button.setBackground(e());
        button.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.sdk.l.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                l.this.a((Context) activity);
            }
        });
        if (com.applovin.impl.sdk.utils.f.d()) {
            button.setElevation(AppLovinSdkUtils.dpToPx(activity, 5));
        }
        return button;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        final String f = f();
        final WeakReference weakReference = new WeakReference(context);
        new AlertDialog.Builder(context).setTitle("Ad Info").setMessage(f).setNegativeButton("Close", (DialogInterface.OnClickListener) null).setPositiveButton("Report", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.l.5
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (weakReference.get() != null) {
                    l.this.a((Context) weakReference.get(), f);
                }
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str) {
        com.applovin.impl.sdk.utils.j jVar = new com.applovin.impl.sdk.utils.j();
        jVar.b("Describe your issue below:\n\n\n").a("Ad Info:").a(str).a("\nDebug Info:\n").a("Platform", "Android").a("AppLovin SDK Version", AppLovinSdk.VERSION).a("Plugin Version", this.a.a(com.applovin.impl.sdk.c.b.dz)).a("Ad Review Version", Utils.getSafedkVersion()).a("App Package Name", context.getPackageName()).a("Device", Build.DEVICE).a("OS Version", Build.VERSION.RELEASE).a("AppLovin Random Token", this.a.o());
        if (this.d != null) {
            jVar.a("\nSafeDK Ad Info:\n");
            jVar.a(this.d);
        }
        Intent intent = new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.SUBJECT", "MAX Ad Report").setPackage("com.google.android.gm");
        if (this.b instanceof com.applovin.impl.sdk.a.g) {
            intent.putExtra("android.intent.extra.SUBJECT", "AppLovin Ad Report");
            JSONObject b = ((com.applovin.impl.sdk.a.g) this.b).b();
            Uri cacheTextWithFileName = AppLovinContentProviderUtils.cacheTextWithFileName(b.toString(), "ad_response.json");
            if (cacheTextWithFileName != null) {
                intent.putExtra("android.intent.extra.STREAM", cacheTextWithFileName);
            } else {
                jVar.a("\nAd Response:\n");
                jVar.a(b.toString());
            }
        }
        intent.putExtra("android.intent.extra.TEXT", jVar.toString());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            intent.setPackage(null);
            context.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.a.ac().b() && this.c.get() == null) {
            Activity a = this.a.ad().a();
            View findViewById = a.findViewById(16908290);
            if (findViewById instanceof FrameLayout) {
                r z = this.a.z();
                z.b("AppLovinSdk", "Displaying creative debugger button for ad: " + this.b);
                final FrameLayout frameLayout = (FrameLayout) findViewById;
                final View a2 = a(a);
                frameLayout.addView(a2);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(150L);
                a2.startAnimation(alphaAnimation);
                findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.applovin.impl.sdk.l.3
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public void onGlobalLayout() {
                        if (a2.getParent() == null) {
                            frameLayout.addView(a2);
                        }
                    }
                });
                this.c = new WeakReference<>(a2);
            }
        }
    }

    private Drawable e() {
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

    private String f() {
        com.applovin.impl.sdk.utils.j jVar = new com.applovin.impl.sdk.utils.j();
        Object obj = this.b;
        if (obj instanceof com.applovin.impl.sdk.a.g) {
            com.applovin.impl.sdk.a.g gVar = (com.applovin.impl.sdk.a.g) obj;
            jVar.a("Network", "APPLOVIN").a(gVar).b(gVar);
        } else if (obj instanceof com.applovin.impl.mediation.a.a) {
            jVar.a((com.applovin.impl.mediation.a.a) obj);
        }
        jVar.a(this.a);
        return jVar.toString();
    }

    public void a() {
        com.applovin.impl.sdk.utils.h hVar = this.e;
        if (hVar != null) {
            hVar.b();
        }
        this.b = null;
        this.c = new WeakReference<>(null);
        this.d = null;
    }

    public void a(Object obj) {
        if (com.applovin.impl.mediation.c.c.b(obj)) {
            return;
        }
        this.b = obj;
        if (((Boolean) this.a.a(com.applovin.impl.sdk.c.b.bC)).booleanValue() && this.a.p().isCreativeDebuggerEnabled()) {
            if (this.e == null) {
                this.e = new com.applovin.impl.sdk.utils.h(this.a, this);
            }
            this.e.a();
        }
    }

    @Override // com.applovin.impl.sdk.utils.h.a
    public void b() {
        if (this.g == 0) {
            this.f = com.applovin.impl.sdk.utils.m.a(TimeUnit.SECONDS.toMillis(3L), this.a, new Runnable() { // from class: com.applovin.impl.sdk.l.1
                @Override // java.lang.Runnable
                public void run() {
                    l.this.g = 0;
                }
            });
        }
        int i = this.g;
        if (i % 2 == 0) {
            this.g = i + 1;
        }
    }

    @Override // com.applovin.impl.sdk.utils.h.a
    public void c() {
        int i = this.g;
        if (i % 2 == 1) {
            this.g = i + 1;
        }
        if (this.g / 2 == 2) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.l.2
                @Override // java.lang.Runnable
                public void run() {
                    l.this.a.af().a(new Bundle(), "show_creative_debugger");
                    l.this.d();
                }
            });
            this.g = 0;
            this.f.d();
            this.e.b();
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return l.class.getSimpleName();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("safedk_ad_info".equals(appLovinCommunicatorMessage.getTopic())) {
            this.d = appLovinCommunicatorMessage.getMessageData().toString();
        }
    }
}
