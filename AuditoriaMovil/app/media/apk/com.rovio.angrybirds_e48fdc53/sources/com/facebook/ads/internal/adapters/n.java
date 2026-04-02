package com.facebook.ads.internal.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.adapters.m;
import com.facebook.ads.internal.view.a;
import com.facebook.ads.internal.view.e.c.a;
import com.facebook.ads.internal.view.e.c.d;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.unity3d.ads.adunit.AdUnitActivity;
import java.util.HashMap;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class n extends l implements View.OnTouchListener, com.facebook.ads.internal.view.a {
    static final /* synthetic */ boolean i;
    private static final String j;
    private com.facebook.ads.internal.view.e.a.a C;
    private a.InterfaceC0118a k;
    private Activity l;
    private com.facebook.ads.internal.view.c.a p;
    private TextView q;
    private TextView r;
    private ImageView s;
    private a.C0122a t;
    private com.facebook.ads.internal.view.e.c.n u;
    private ViewGroup v;
    private com.facebook.ads.internal.view.e.c.d w;
    private com.facebook.ads.internal.view.e.c.j x;
    final int f = 64;
    final int g = 64;
    final int h = 16;
    private AudienceNetworkActivity.BackButtonInterceptor m = new AudienceNetworkActivity.BackButtonInterceptor() { // from class: com.facebook.ads.internal.adapters.n.1
        @Override // com.facebook.ads.AudienceNetworkActivity.BackButtonInterceptor
        public boolean interceptBackButton() {
            if (n.this.x == null) {
                return false;
            }
            if (n.this.x.a()) {
                if (n.this.x.getSkipSeconds() != 0 && n.this.b != null) {
                    n.this.b.e();
                }
                if (n.this.b != null) {
                    n.this.b.f();
                    return false;
                }
                return false;
            }
            return true;
        }
    };
    private final View.OnTouchListener n = new View.OnTouchListener() { // from class: com.facebook.ads.internal.adapters.n.2
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (n.this.x == null) {
                    n.this.l.finish();
                } else if (n.this.x.a()) {
                    if (n.this.x.getSkipSeconds() != 0 && n.this.b != null) {
                        n.this.b.e();
                    }
                    if (n.this.b != null) {
                        n.this.b.f();
                    }
                    n.this.l.finish();
                }
            }
            return true;
        }
    };
    private m.a o = m.a.UNSPECIFIED;
    private int y = -1;
    private int z = -10525069;
    private int A = -12286980;
    private boolean B = false;

    static {
        i = !n.class.desiredAssertionStatus();
        j = n.class.getSimpleName();
    }

    private void a(int i2) {
        float f = com.facebook.ads.internal.q.a.v.b;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (56.0f * f), (int) (56.0f * f));
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        int i3 = (int) (16.0f * f);
        this.x.setPadding(i3, i3, i3, i3);
        this.x.setLayoutParams(layoutParams);
        d.a aVar = h() ? d.a.FADE_OUT_ON_PLAY : d.a.VISIBLE;
        int id = this.b.getId();
        if (i2 == 1 && (m() || n())) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -15658735});
            gradientDrawable.setCornerRadius(0.0f);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams2.addRule(10);
            this.b.setLayoutParams(layoutParams2);
            a(this.b);
            a(this.x);
            if (this.t != null) {
                a(this.t);
            }
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, (int) (((this.p != null ? 64 : 0) + 60 + 16 + 16 + 16) * f));
            layoutParams3.addRule(12);
            RelativeLayout relativeLayout = new RelativeLayout(this.d);
            if (Build.VERSION.SDK_INT >= 16) {
                relativeLayout.setBackground(gradientDrawable);
            } else {
                relativeLayout.setBackgroundDrawable(gradientDrawable);
            }
            relativeLayout.setLayoutParams(layoutParams3);
            relativeLayout.setPadding(i3, 0, i3, (int) (((this.p != null ? 64 : 0) + 16 + 16) * f));
            this.v = relativeLayout;
            if (!this.B) {
                this.w.a(relativeLayout, aVar);
            }
            a(relativeLayout);
            if (this.u != null) {
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, (int) (6.0f * f));
                layoutParams4.addRule(12);
                layoutParams4.topMargin = (int) ((-6.0f) * f);
                this.u.setLayoutParams(layoutParams4);
                a(this.u);
            }
            if (this.p != null) {
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, (int) (64.0f * f));
                layoutParams5.bottomMargin = (int) (16.0f * f);
                layoutParams5.leftMargin = (int) (16.0f * f);
                layoutParams5.rightMargin = (int) (16.0f * f);
                layoutParams5.addRule(1);
                layoutParams5.addRule(12);
                this.p.setLayoutParams(layoutParams5);
                a(this.p);
            }
            if (this.s != null) {
                RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams((int) (60.0f * f), (int) (60.0f * f));
                layoutParams6.addRule(12);
                layoutParams6.addRule(9);
                this.s.setLayoutParams(layoutParams6);
                a(relativeLayout, this.s);
            }
            if (this.q != null) {
                RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams7.bottomMargin = (int) (36.0f * f);
                layoutParams7.addRule(12);
                layoutParams7.addRule(9);
                this.q.setEllipsize(TextUtils.TruncateAt.END);
                this.q.setGravity(8388611);
                this.q.setLayoutParams(layoutParams7);
                this.q.setMaxLines(1);
                this.q.setPadding((int) (72.0f * f), 0, 0, 0);
                this.q.setTextColor(-1);
                this.q.setTextSize(18.0f);
                a(relativeLayout, this.q);
            }
            if (this.r != null) {
                RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams8.addRule(12);
                layoutParams8.addRule(9);
                layoutParams8.bottomMargin = (int) (4.0f * f);
                this.r.setEllipsize(TextUtils.TruncateAt.END);
                this.r.setGravity(8388611);
                this.r.setLayoutParams(layoutParams8);
                this.r.setMaxLines(1);
                this.r.setPadding((int) (72.0f * f), 0, 0, 0);
                this.r.setTextColor(-1);
                a(relativeLayout, this.r);
            }
            ((ViewGroup) this.b.getParent()).setBackgroundColor(-16777216);
        } else if (i2 == 1) {
            RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams9.addRule(10);
            this.b.setLayoutParams(layoutParams9);
            a(this.b);
            a(this.x);
            if (this.t != null) {
                a(this.t);
            }
            LinearLayout linearLayout = new LinearLayout(this.d);
            this.v = linearLayout;
            linearLayout.setGravity(112);
            linearLayout.setOrientation(1);
            RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams10.leftMargin = (int) (33.0f * f);
            layoutParams10.rightMargin = (int) (33.0f * f);
            layoutParams10.topMargin = (int) (8.0f * f);
            if (this.p == null) {
                layoutParams10.bottomMargin = (int) (16.0f * f);
            } else {
                layoutParams10.bottomMargin = (int) (80.0f * f);
            }
            layoutParams10.addRule(3, id);
            linearLayout.setLayoutParams(layoutParams10);
            a(linearLayout);
            if (this.p != null) {
                RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-1, (int) (64.0f * f));
                layoutParams11.bottomMargin = (int) (16.0f * f);
                layoutParams11.leftMargin = (int) (33.0f * f);
                layoutParams11.rightMargin = (int) (33.0f * f);
                layoutParams11.addRule(1);
                layoutParams11.addRule(12);
                this.p.setLayoutParams(layoutParams11);
                a(this.p);
            }
            if (this.q != null) {
                LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams12.weight = 2.0f;
                layoutParams12.gravity = 17;
                this.q.setEllipsize(TextUtils.TruncateAt.END);
                this.q.setGravity(17);
                this.q.setLayoutParams(layoutParams12);
                this.q.setMaxLines(2);
                this.q.setPadding(0, 0, 0, 0);
                this.q.setTextColor(this.z);
                this.q.setTextSize(24.0f);
                a(linearLayout, this.q);
            }
            if (this.s != null) {
                LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams((int) (64.0f * f), (int) (64.0f * f));
                layoutParams13.weight = 0.0f;
                layoutParams13.gravity = 17;
                this.s.setLayoutParams(layoutParams13);
                a(linearLayout, this.s);
            }
            if (this.r != null) {
                LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams14.weight = 2.0f;
                layoutParams14.gravity = 16;
                this.r.setEllipsize(TextUtils.TruncateAt.END);
                this.r.setGravity(16);
                this.r.setLayoutParams(layoutParams14);
                this.r.setMaxLines(2);
                this.r.setPadding(0, 0, 0, 0);
                this.r.setTextColor(this.z);
                a(linearLayout, this.r);
            }
            if (this.u != null) {
                RelativeLayout.LayoutParams layoutParams15 = new RelativeLayout.LayoutParams(-1, (int) (6.0f * f));
                layoutParams15.addRule(3, id);
                this.u.setLayoutParams(layoutParams15);
                a(this.u);
            }
            ((ViewGroup) this.b.getParent()).setBackgroundColor(this.y);
        } else if (!o() || n()) {
            GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -15658735});
            gradientDrawable2.setCornerRadius(0.0f);
            this.b.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            a(this.b);
            a(this.x);
            if (this.t != null) {
                a(this.t);
            }
            RelativeLayout.LayoutParams layoutParams16 = new RelativeLayout.LayoutParams(-1, (int) (124.0f * f));
            layoutParams16.addRule(12);
            RelativeLayout relativeLayout2 = new RelativeLayout(this.d);
            if (Build.VERSION.SDK_INT >= 16) {
                relativeLayout2.setBackground(gradientDrawable2);
            } else {
                relativeLayout2.setBackgroundDrawable(gradientDrawable2);
            }
            relativeLayout2.setLayoutParams(layoutParams16);
            relativeLayout2.setPadding(i3, 0, i3, i3);
            this.v = relativeLayout2;
            if (!this.B) {
                this.w.a(relativeLayout2, aVar);
            }
            a(relativeLayout2);
            if (this.p != null) {
                RelativeLayout.LayoutParams layoutParams17 = new RelativeLayout.LayoutParams((int) (110.0f * f), (int) (56.0f * f));
                layoutParams17.rightMargin = (int) (16.0f * f);
                layoutParams17.bottomMargin = (int) (16.0f * f);
                layoutParams17.addRule(12);
                layoutParams17.addRule(11);
                this.p.setLayoutParams(layoutParams17);
                a(this.p);
            }
            if (this.s != null) {
                RelativeLayout.LayoutParams layoutParams18 = new RelativeLayout.LayoutParams((int) (64.0f * f), (int) (64.0f * f));
                layoutParams18.addRule(12);
                layoutParams18.addRule(9);
                layoutParams18.bottomMargin = (int) (8.0f * f);
                this.s.setLayoutParams(layoutParams18);
                a(relativeLayout2, this.s);
            }
            if (this.q != null) {
                RelativeLayout.LayoutParams layoutParams19 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams19.bottomMargin = (int) (48.0f * f);
                layoutParams19.addRule(12);
                layoutParams19.addRule(9);
                this.q.setEllipsize(TextUtils.TruncateAt.END);
                this.q.setGravity(8388611);
                this.q.setLayoutParams(layoutParams19);
                this.q.setMaxLines(1);
                this.q.setPadding((int) (80.0f * f), 0, this.p != null ? (int) (126.0f * f) : 0, 0);
                this.q.setTextColor(-1);
                this.q.setTextSize(24.0f);
                a(relativeLayout2, this.q);
            }
            if (this.r != null) {
                RelativeLayout.LayoutParams layoutParams20 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams20.addRule(12);
                layoutParams20.addRule(9);
                this.r.setEllipsize(TextUtils.TruncateAt.END);
                this.r.setGravity(8388611);
                this.r.setLayoutParams(layoutParams20);
                this.r.setMaxLines(2);
                this.r.setTextColor(-1);
                this.r.setPadding((int) (80.0f * f), 0, this.p != null ? (int) (126.0f * f) : 0, 0);
                a(relativeLayout2, this.r);
            }
            if (this.u != null) {
                RelativeLayout.LayoutParams layoutParams21 = new RelativeLayout.LayoutParams(-1, (int) (6.0f * f));
                layoutParams21.addRule(12);
                this.u.setLayoutParams(layoutParams21);
                a(this.u);
            }
            ((ViewGroup) this.b.getParent()).setBackgroundColor(-16777216);
        } else {
            RelativeLayout.LayoutParams layoutParams22 = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams22.addRule(9);
            this.b.setLayoutParams(layoutParams22);
            a(this.b);
            a(this.x);
            if (this.t != null) {
                a(this.t);
            }
            LinearLayout linearLayout2 = new LinearLayout(this.d);
            this.v = linearLayout2;
            linearLayout2.setGravity(112);
            linearLayout2.setOrientation(1);
            RelativeLayout.LayoutParams layoutParams23 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams23.leftMargin = (int) (16.0f * f);
            layoutParams23.rightMargin = (int) (16.0f * f);
            layoutParams23.topMargin = (int) (8.0f * f);
            layoutParams23.bottomMargin = (int) (80.0f * f);
            layoutParams23.addRule(1, id);
            linearLayout2.setLayoutParams(layoutParams23);
            a(linearLayout2);
            if (this.u != null) {
                RelativeLayout.LayoutParams layoutParams24 = new RelativeLayout.LayoutParams(-1, (int) (6.0f * f));
                layoutParams24.addRule(5, id);
                layoutParams24.addRule(7, id);
                layoutParams24.addRule(3, id);
                layoutParams24.topMargin = (int) ((-6.0f) * f);
                this.u.setLayoutParams(layoutParams24);
                a(this.u);
            }
            if (this.q != null) {
                LinearLayout.LayoutParams layoutParams25 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams25.weight = 2.0f;
                layoutParams25.gravity = 17;
                this.q.setEllipsize(TextUtils.TruncateAt.END);
                this.q.setGravity(17);
                this.q.setLayoutParams(layoutParams25);
                this.q.setMaxLines(10);
                this.q.setPadding(0, 0, 0, 0);
                this.q.setTextColor(this.z);
                this.q.setTextSize(24.0f);
                a(linearLayout2, this.q);
            }
            if (this.s != null) {
                LinearLayout.LayoutParams layoutParams26 = new LinearLayout.LayoutParams((int) (64.0f * f), (int) (64.0f * f));
                layoutParams26.weight = 0.0f;
                layoutParams26.gravity = 17;
                this.s.setLayoutParams(layoutParams26);
                a(linearLayout2, this.s);
            }
            if (this.r != null) {
                LinearLayout.LayoutParams layoutParams27 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams27.weight = 2.0f;
                layoutParams27.gravity = 16;
                this.r.setEllipsize(TextUtils.TruncateAt.END);
                this.r.setGravity(17);
                this.r.setLayoutParams(layoutParams27);
                this.r.setMaxLines(10);
                this.r.setPadding(0, 0, 0, 0);
                this.r.setTextColor(this.z);
                a(linearLayout2, this.r);
            }
            if (this.p != null) {
                RelativeLayout.LayoutParams layoutParams28 = new RelativeLayout.LayoutParams(-1, (int) (64.0f * f));
                layoutParams28.bottomMargin = (int) (16.0f * f);
                layoutParams28.leftMargin = (int) (16.0f * f);
                layoutParams28.rightMargin = (int) (16.0f * f);
                layoutParams28.addRule(1);
                layoutParams28.addRule(12);
                layoutParams28.addRule(1, id);
                this.p.setLayoutParams(layoutParams28);
                a(this.p);
            }
            ((ViewGroup) this.b.getParent()).setBackgroundColor(this.y);
        }
        View rootView = this.b.getRootView();
        if (rootView != null) {
            rootView.setOnTouchListener(this);
        }
    }

    private void a(View view) {
        if (this.k == null) {
            return;
        }
        this.k.a(view);
    }

    private void a(ViewGroup viewGroup, View view) {
        if (viewGroup != null) {
            viewGroup.addView(view);
        }
    }

    private void b(View view) {
        ViewGroup viewGroup;
        if (view == null || (viewGroup = (ViewGroup) view.getParent()) == null) {
            return;
        }
        viewGroup.removeView(view);
    }

    private boolean m() {
        return ((double) (this.b.getVideoHeight() > 0 ? ((float) this.b.getVideoWidth()) / ((float) this.b.getVideoHeight()) : -1.0f)) <= 0.9d;
    }

    private boolean n() {
        if (this.b.getVideoHeight() <= 0) {
            return false;
        }
        Rect rect = new Rect();
        this.l.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        if (rect.width() > rect.height()) {
            return ((float) (rect.width() - ((rect.height() * this.b.getVideoWidth()) / this.b.getVideoHeight()))) - (192.0f * com.facebook.ads.internal.q.a.v.b) < 0.0f;
        }
        return ((((float) (rect.height() - ((rect.width() * this.b.getVideoHeight()) / this.b.getVideoWidth()))) - (com.facebook.ads.internal.q.a.v.b * 64.0f)) - (com.facebook.ads.internal.q.a.v.b * 64.0f)) - (40.0f * com.facebook.ads.internal.q.a.v.b) < 0.0f;
    }

    private boolean o() {
        float videoWidth = this.b.getVideoHeight() > 0 ? this.b.getVideoWidth() / this.b.getVideoHeight() : -1.0f;
        return ((double) videoWidth) > 0.9d && ((double) videoWidth) < 1.1d;
    }

    private void p() {
        b(this.b);
        b(this.p);
        b(this.q);
        b(this.r);
        b(this.s);
        b(this.u);
        b(this.v);
        b(this.x);
        if (this.t != null) {
            b(this.t);
        }
    }

    @Override // com.facebook.ads.internal.adapters.l
    protected void a() {
        if (this.c == null) {
            Log.e(j, "Unable to add UI without a valid ad response.");
            return;
        }
        String string = this.c.getString("ct");
        String optString = this.c.getJSONObject("context").optString(AdUnitActivity.EXTRA_ORIENTATION);
        if (!optString.isEmpty()) {
            this.o = m.a.a(Integer.parseInt(optString));
        }
        if (this.c.has("layout") && !this.c.isNull("layout")) {
            JSONObject jSONObject = this.c.getJSONObject("layout");
            this.y = (int) jSONObject.optLong("bgColor", this.y);
            this.z = (int) jSONObject.optLong("textColor", this.z);
            this.A = (int) jSONObject.optLong("accentColor", this.A);
            this.B = jSONObject.optBoolean("persistentAdDetails", this.B);
        }
        JSONObject jSONObject2 = this.c.getJSONObject("text");
        this.b.setId(Build.VERSION.SDK_INT >= 17 ? View.generateViewId() : com.facebook.ads.internal.q.a.v.a());
        int c = c();
        Context context = this.d;
        if (c < 0) {
            c = 0;
        }
        this.x = new com.facebook.ads.internal.view.e.c.j(context, c, this.A);
        this.x.setOnTouchListener(this.n);
        this.b.a(this.x);
        if (this.c.has("cta") && !this.c.isNull("cta")) {
            JSONObject jSONObject3 = this.c.getJSONObject("cta");
            this.p = new com.facebook.ads.internal.view.c.a(this.d, jSONObject3.getString("url"), jSONObject3.getString("text"), this.A, this.b, this.a, string);
            com.facebook.ads.internal.a.b.a(this.d, this.a, string, Uri.parse(jSONObject3.getString("url")), new HashMap());
        }
        if (this.c.has("icon") && !this.c.isNull("icon")) {
            JSONObject jSONObject4 = this.c.getJSONObject("icon");
            this.s = new ImageView(this.d);
            new com.facebook.ads.internal.view.b.d(this.s).a((int) (com.facebook.ads.internal.q.a.v.b * 64.0f), (int) (com.facebook.ads.internal.q.a.v.b * 64.0f)).a(jSONObject4.getString("url"));
        }
        if (this.c.has(MessengerShareContentUtility.MEDIA_IMAGE) && !this.c.isNull(MessengerShareContentUtility.MEDIA_IMAGE)) {
            JSONObject jSONObject5 = this.c.getJSONObject(MessengerShareContentUtility.MEDIA_IMAGE);
            com.facebook.ads.internal.view.e.c.g gVar = new com.facebook.ads.internal.view.e.c.g(this.d);
            this.b.a(gVar);
            gVar.setImage(jSONObject5.getString("url"));
        }
        String optString2 = jSONObject2.optString("title");
        if (!optString2.isEmpty()) {
            this.q = new TextView(this.d);
            this.q.setText(optString2);
            this.q.setTypeface(Typeface.defaultFromStyle(1));
        }
        String optString3 = jSONObject2.optString(MessengerShareContentUtility.SUBTITLE);
        if (!optString3.isEmpty()) {
            this.r = new TextView(this.d);
            this.r.setText(optString3);
            this.r.setTextSize(16.0f);
        }
        this.u = new com.facebook.ads.internal.view.e.c.n(this.d);
        this.b.a(this.u);
        String d = d();
        if (!TextUtils.isEmpty(d)) {
            this.t = new a.C0122a(this.d, "AdChoices", d, new float[]{0.0f, 0.0f, 8.0f, 0.0f}, string);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(10);
            layoutParams.addRule(9);
            this.t.setLayoutParams(layoutParams);
        }
        this.b.a(new com.facebook.ads.internal.view.e.c.k(this.d));
        com.facebook.ads.internal.view.e.c.l lVar = new com.facebook.ads.internal.view.e.c.l(this.d);
        this.b.a(lVar);
        d.a aVar = h() ? d.a.FADE_OUT_ON_PLAY : d.a.VISIBLE;
        this.b.a(new com.facebook.ads.internal.view.e.c.d(lVar, aVar));
        this.w = new com.facebook.ads.internal.view.e.c.d(new RelativeLayout(this.d), aVar);
        this.b.a(this.w);
    }

    @Override // com.facebook.ads.internal.view.a
    public void a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        this.l = audienceNetworkActivity;
        if (!i && this.k == null) {
            throw new AssertionError();
        }
        audienceNetworkActivity.addBackButtonInterceptor(this.m);
        p();
        a(this.l.getResources().getConfiguration().orientation);
        if (h()) {
            e();
        } else {
            f();
        }
    }

    public void a(Configuration configuration) {
        p();
        a(configuration.orientation);
    }

    @Override // com.facebook.ads.internal.view.a
    public void a(Bundle bundle) {
    }

    protected boolean h() {
        if (i || this.c != null) {
            try {
                return this.c.getJSONObject("video").getBoolean(AudienceNetworkActivity.AUTOPLAY);
            } catch (Exception e) {
                Log.w(String.valueOf(n.class), "Invalid JSON", e);
                return true;
            }
        }
        throw new AssertionError();
    }

    @Override // com.facebook.ads.internal.view.a
    public void i() {
        if (this.b == null || this.b.getState() != com.facebook.ads.internal.view.e.d.d.STARTED) {
            return;
        }
        this.C = this.b.getVideoStartReason();
        this.b.a(false);
    }

    @Override // com.facebook.ads.internal.view.a
    public void j() {
        if (this.b == null || this.C == null) {
            return;
        }
        this.b.a(this.C);
    }

    public m.a k() {
        return this.o;
    }

    public void l() {
        if (this.l != null) {
            this.l.finish();
        }
    }

    @Override // com.facebook.ads.internal.adapters.l, com.facebook.ads.internal.adapters.AdAdapter
    public void onDestroy() {
        if (this.c != null && this.a != null) {
            String optString = this.c.optString("ct");
            if (!TextUtils.isEmpty(optString)) {
                this.a.h(optString, new HashMap());
            }
        }
        if (this.b != null) {
            this.b.f();
        }
        m.a(this);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.b != null) {
            this.b.getEventBus().a((com.facebook.ads.internal.j.e<com.facebook.ads.internal.j.f, com.facebook.ads.internal.j.d>) new com.facebook.ads.internal.view.e.b.t(view, motionEvent));
            return true;
        }
        return true;
    }

    @Override // com.facebook.ads.internal.view.a
    public void setListener(a.InterfaceC0118a interfaceC0118a) {
        this.k = interfaceC0118a;
    }
}
