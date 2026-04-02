package com.adcolony.sdk;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class AdColonyNativeAdView extends u {
    private EngagementButton c;
    private boolean d;
    private String e;
    private String f;
    private String g;

    @Override // com.adcolony.sdk.u
    public /* bridge */ /* synthetic */ boolean destroy() {
        return super.destroy();
    }

    @Override // com.adcolony.sdk.u
    public /* bridge */ /* synthetic */ String getZoneID() {
        return super.getZoneID();
    }

    @Override // com.adcolony.sdk.u
    public /* bridge */ /* synthetic */ boolean pause() {
        return super.pause();
    }

    @Override // com.adcolony.sdk.u
    public /* bridge */ /* synthetic */ boolean resume() {
        return super.resume();
    }

    @Override // com.adcolony.sdk.u
    public /* bridge */ /* synthetic */ boolean setMuted(boolean z) {
        return super.setMuted(z);
    }

    @Override // com.adcolony.sdk.u
    public /* bridge */ /* synthetic */ boolean setVolume(float f) {
        return super.setVolume(f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdColonyNativeAdView(Context context, d dVar, ac acVar) {
        super(context, dVar, acVar);
        JSONObject b = dVar.b();
        setNative(true);
        this.d = as.d(b, "engagement_enabled");
        this.e = as.b(b, "engagement_click_action");
        this.f = as.b(b, "engagement_click_action_type");
        this.g = as.b(b, "engagement_text");
        if (this.d) {
            this.c = new EngagementButton(context);
            this.c.setText(this.g);
            this.c.setOnClickListener(new View.OnClickListener() { // from class: com.adcolony.sdk.AdColonyNativeAdView.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (AdColonyNativeAdView.this.c()) {
                        au.e.b("Ignoring engagement click as view has been destroyed.");
                        return;
                    }
                    JSONObject a = as.a();
                    as.a(a, "id", AdColonyNativeAdView.this.getAdSessionId());
                    new d("AdSession.on_native_engagement", AdColonyNativeAdView.this.getContainer().b(), a).a();
                }
            });
        }
    }

    @Override // com.adcolony.sdk.u
    public String getAdvertiserName() {
        if (c()) {
            au.e.b("Ignoring call to getAdvertiserName() as view has been destroyed");
            return "";
        }
        return super.getAdvertiserName();
    }

    @Override // com.adcolony.sdk.u
    public ImageView getIcon() {
        ImageView icon = super.getIcon();
        if (icon == null) {
            return null;
        }
        if (c()) {
            au.e.b("Ignoring call to getIcon() as view has been destroyed");
            return null;
        }
        return icon;
    }

    @Override // com.adcolony.sdk.u
    public String getTitle() {
        if (c()) {
            au.e.b("Ignoring call to getTitle() as view has been destroyed");
            return "";
        }
        return super.getTitle();
    }

    @Override // com.adcolony.sdk.u
    public String getDescription() {
        if (c()) {
            au.e.b("Ignoring call to getDescription() as view has been destroyed");
            return "";
        }
        return super.getDescription();
    }

    public boolean isEngagementEnabled() {
        if (c()) {
            au.e.b("Ignoring call to isEngagementEnabled() as view has been destroyed");
            return false;
        }
        return this.d;
    }

    public EngagementButton getEngagementButton() {
        if (c()) {
            au.e.b("Ignoring call to getEngagementButton() as view has been destroyed");
            return null;
        }
        return this.c;
    }

    /* loaded from: classes2.dex */
    public class EngagementButton extends Button {
        boolean a;
        View.OnClickListener b;

        EngagementButton(Context context) {
            super(context);
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            if (!this.a) {
                super.setOnClickListener(onClickListener);
                this.b = onClickListener;
                this.a = true;
            }
        }

        public View.OnClickListener getOnClickListener() {
            return this.b;
        }
    }
}
