package com.kwad.components.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.kwad.components.core.page.AdWebViewActivityProxy;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.ai;
/* loaded from: classes.dex */
public class ComplianceTextView extends TextView {
    private String Yc;
    private String Yd;
    private String Ye;
    private String Yf;
    private String Yg;
    private int Yh;
    private String Yi;
    private int Yj;
    private boolean Yk;
    private AdTemplate mAdTemplate;

    public ComplianceTextView(Context context) {
        this(context, null);
    }

    public ComplianceTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ComplianceTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Yh = 154;
        init(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, String str3) {
        StringBuilder sb;
        String str4;
        if (TextUtils.isEmpty(str)) {
            setVisibility(8);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(this.Yf) || !TextUtils.isEmpty(this.Yg)) {
            sb2.append("  ");
        }
        if (!TextUtils.isEmpty(this.Yf)) {
            sb2.append(str2);
        }
        if (!TextUtils.isEmpty(this.Yf) && !TextUtils.isEmpty(this.Yg)) {
            sb2.append(" | ");
        }
        if (!TextUtils.isEmpty(this.Yg)) {
            sb2.append(str3);
        }
        getContext();
        int width = ((!ai.IK() ? this.Yh : getWidth()) - getPaddingLeft()) - getPaddingRight();
        if (width < 0) {
            return;
        }
        if (a(str, sb2.toString(), width)) {
            sb = new StringBuilder();
            sb.append(str);
            str4 = "\n";
        } else {
            sb = new StringBuilder();
            sb.append(str);
            str4 = "   ";
        }
        sb.append(str4);
        this.Yi = sb.toString();
        l(str2, str3);
        requestLayout();
    }

    private boolean a(String str, String str2, int i) {
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        String str3 = str + str2;
        if (Build.VERSION.SDK_INT >= 23) {
            staticLayout2 = StaticLayout.Builder.obtain(str, 0, str.length(), getPaint(), i).build();
            staticLayout = StaticLayout.Builder.obtain(str3, 0, str3.length(), getPaint(), i).build();
        } else {
            StaticLayout staticLayout3 = new StaticLayout(str, getPaint(), i, Layout.Alignment.ALIGN_NORMAL, 0.0f, 0.0f, true);
            staticLayout = new StaticLayout(str3, getPaint(), i, Layout.Alignment.ALIGN_NORMAL, 0.0f, 0.0f, true);
            staticLayout2 = staticLayout3;
        }
        return staticLayout.getLineCount() > staticLayout2.getLineCount();
    }

    private void init(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ksad_ComplianceTextView);
        this.Yh = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.ksad_ComplianceTextView_ksad_width_in_landscape, 154);
        this.Yj = obtainStyledAttributes.getColor(R.styleable.ksad_ComplianceTextView_ksad_privacy_color, getResources().getColor(R.color.ksad_default_privacy_link_color));
        this.Yk = obtainStyledAttributes.getBoolean(R.styleable.ksad_ComplianceTextView_ksad_show_clickable_underline, true);
        if (getBackground() == null) {
            setBackground(ContextCompat.getDrawable(context, R.drawable.ksad_compliance_view_bg));
        }
        obtainStyledAttributes.recycle();
    }

    private void l(final String str, final String str2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.Yi);
        if (!TextUtils.isEmpty(this.Yf)) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.setSpan(new ClickableSpan() { // from class: com.kwad.components.core.widget.ComplianceTextView.2
                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    AdWebViewActivityProxy.launch(ComplianceTextView.this.getContext(), new AdWebViewActivityProxy.a.C0206a().as(str).at(ComplianceTextView.this.Yf).ax(true).V(ComplianceTextView.this.mAdTemplate).oE());
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setColor(ComplianceTextView.this.Yj);
                    textPaint.setUnderlineText(ComplianceTextView.this.Yk);
                }
            }, length, spannableStringBuilder.length(), 33);
        }
        if (!TextUtils.isEmpty(this.Yf) && !TextUtils.isEmpty(this.Yg)) {
            spannableStringBuilder.append((CharSequence) " | ");
        }
        if (!TextUtils.isEmpty(this.Yg)) {
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str2);
            spannableStringBuilder.setSpan(new ClickableSpan() { // from class: com.kwad.components.core.widget.ComplianceTextView.3
                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    AdWebViewActivityProxy.launch(ComplianceTextView.this.getContext(), new AdWebViewActivityProxy.a.C0206a().as(str2).at(ComplianceTextView.this.Yg).ax(true).V(ComplianceTextView.this.mAdTemplate).oE());
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setColor(ComplianceTextView.this.Yj);
                    textPaint.setUnderlineText(ComplianceTextView.this.Yk);
                }
            }, length2, spannableStringBuilder.length(), 33);
        }
        spannableStringBuilder.append((CharSequence) " ");
        setMovementMethod(LinkMovementMethod.getInstance());
        setHighlightColor(ContextCompat.getColor(getContext(), R.color.ksad_translucent));
        setText(spannableStringBuilder);
    }

    public void setAdTemplate(AdTemplate adTemplate) {
        this.mAdTemplate = adTemplate;
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(ck.downloadSafeInfo.appName)) {
            sb.append("应用名：");
            sb.append(ck.downloadSafeInfo.appName);
            sb.append(" ");
        }
        if (!TextUtils.isEmpty(ck.downloadSafeInfo.appVersion)) {
            sb.append("版本号：");
            sb.append(ck.downloadSafeInfo.appVersion);
            sb.append(" ");
        }
        if (ck.downloadSafeInfo.packageSize > 0) {
            sb.append("应用大小：");
            sb.append(com.kwad.components.core.t.e.a(ck.downloadSafeInfo.packageSize, true));
            sb.append(" ");
        }
        if (!TextUtils.isEmpty(ck.downloadSafeInfo.corporationName)) {
            sb.append("开发者：");
            sb.append(ck.downloadSafeInfo.corporationName);
            sb.append(" ");
        }
        this.Yc = sb.toString();
        this.Yd = "权限信息";
        this.Ye = "隐私政策";
        this.Yf = ck.downloadSafeInfo.appPermissionInfoUrl;
        this.Yg = ck.downloadSafeInfo.appPrivacyUrl;
        if (this.Yh > 0) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            getContext();
            layoutParams.width = !ai.IK() ? com.kwad.sdk.d.a.a.a(getContext(), this.Yh) : -1;
            setLayoutParams(layoutParams);
        }
        post(new Runnable() { // from class: com.kwad.components.core.widget.ComplianceTextView.1
            @Override // java.lang.Runnable
            public final void run() {
                ComplianceTextView complianceTextView = ComplianceTextView.this;
                complianceTextView.a(complianceTextView.Yc, ComplianceTextView.this.Yd, ComplianceTextView.this.Ye);
            }
        });
    }
}
