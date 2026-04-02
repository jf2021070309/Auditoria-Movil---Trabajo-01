package com.android.music;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import c.i.d.a;
import c.t.m;
import com.android.music.ActivityPurchaseItem;
import e.a.c.n6;
import e.h.e.g;
import e.h.g.l0;
import e.h.g.x0;
import java.util.Objects;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class ActivityPurchaseItem extends Activity {
    public Bundle a;

    /* renamed from: b  reason: collision with root package name */
    public View f2941b = null;

    /* renamed from: c  reason: collision with root package name */
    public View f2942c = null;

    /* renamed from: d  reason: collision with root package name */
    public TextView f2943d;

    public final void a(Activity activity) {
        l0 l2 = m.l(activity);
        l2.f("di", 0L);
        l2.o("di", System.currentTimeMillis());
        l0 l3 = m.l(x0.f8405d);
        if (l3 != null) {
            l3.m("showRocketPlayer", true);
        }
        activity.finish();
        activity.overridePendingTransition(R.anim.nothing, R.anim.fade_out);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setVolumeControlStream(3);
        requestWindowFeature(1);
        if (bundle == null) {
            bundle = getIntent().getExtras();
        }
        this.a = bundle;
        this.f2942c = findViewById(16908290);
        View inflate = LayoutInflater.from(this).inflate(R.layout.dialog_purchase_item3, (ViewGroup) this.f2942c, false);
        this.f2941b = inflate;
        this.f2943d = (TextView) inflate.findViewById(R.id.unlock);
        View findViewById = this.f2941b.findViewById(R.id.header);
        ((ImageView) this.f2941b.findViewById(R.id.touch)).setOnClickListener(new View.OnClickListener() { // from class: e.a.c.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityPurchaseItem activityPurchaseItem = ActivityPurchaseItem.this;
                activityPurchaseItem.a(activityPurchaseItem);
            }
        });
        int parseColor = Color.parseColor("#0099cc");
        double d2 = (parseColor >> 16) & 255;
        Double.isNaN(d2);
        Double.isNaN(d2);
        double d3 = (parseColor >> 8) & 255;
        Double.isNaN(d3);
        Double.isNaN(d3);
        double d4 = d3 * 0.587d;
        double d5 = (parseColor >> 0) & 255;
        Double.isNaN(d5);
        Double.isNaN(d5);
        if ((d5 * 0.114d) + d4 + (d2 * 0.299d) > 120.0d) {
            Color.colorToHSV(parseColor, r4);
            float[] fArr = {0.0f, 0.0f, Math.max(0.0f, fArr[2] - 0.3f)};
            parseColor = Color.HSVToColor(fArr);
        }
        Color.colorToHSV(parseColor, r0);
        float[] fArr2 = {0.0f, 0.0f, Math.max(0.0f, fArr2[2] - 0.1f)};
        findViewById.setBackgroundColor(Color.HSVToColor(fArr2));
        StateListDrawable stateListDrawable = (StateListDrawable) a.c(this, R.drawable.iv_accent_button_bg);
        Drawable newDrawable = stateListDrawable.getConstantState().newDrawable();
        if (newDrawable instanceof StateListDrawable) {
            stateListDrawable = (StateListDrawable) newDrawable;
        }
        stateListDrawable.addState(new int[0], new ColorDrawable(parseColor));
        this.f2943d.setBackgroundDrawable(stateListDrawable);
        Object obj = n6.a;
        g.g("RocketPlayerAd_show");
        this.f2943d.setOnClickListener(new View.OnClickListener() { // from class: e.a.c.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Objects.requireNonNull(ActivityPurchaseItem.this);
                try {
                    z6.I("com.jrtstudio.AnotherMusicPlayer");
                    Object obj2 = n6.a;
                    e.h.e.g.g("RocketPlayerAd_clicked");
                } catch (Exception unused) {
                }
            }
        });
        setContentView(this.f2941b);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            a(this);
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2 = this.a;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }
}
