package com.vungle.publisher;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.share.internal.ShareConstants;
import com.vungle.publisher.image.AssetBitmapFactory;
import javax.inject.Inject;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public class og extends LinearLayout implements View.OnClickListener {
    private qg a;
    private boolean b;
    private TextView c;

    public og(Context context) {
        super(context);
        this.b = false;
        setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.b) {
            this.a.a(new aq());
            return;
        }
        this.b = true;
        a();
    }

    private void a() {
        setBackgroundColor(Color.parseColor("#000000"));
        this.c.setVisibility(0);
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a {
        @Inject
        zo a;
        @Inject
        qg b;

        public og a(Context context, boolean z) {
            og ogVar = new og(context);
            ogVar.setGravity(16);
            oa oaVar = new oa(context);
            this.a.a(oaVar, AssetBitmapFactory.a.privacy);
            TextView textView = new TextView(context);
            textView.setText(ShareConstants.WEB_DIALOG_PARAM_PRIVACY);
            textView.setTextSize(16.0f);
            textView.setTextColor(-1);
            textView.setVisibility(8);
            textView.setPadding(10, 0, 10, 0);
            if (z) {
                ogVar.addView(oaVar);
                ogVar.addView(textView);
            } else {
                ogVar.addView(textView);
                ogVar.addView(oaVar);
            }
            ogVar.a = this.b;
            ogVar.c = textView;
            ogVar.setVisibility(8);
            return ogVar;
        }
    }
}
