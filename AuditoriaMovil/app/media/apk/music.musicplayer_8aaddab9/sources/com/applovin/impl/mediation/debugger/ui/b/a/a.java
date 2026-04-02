package com.applovin.impl.mediation.debugger.ui.b.a;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.impl.mediation.debugger.a.b.b;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.f;
import com.applovin.sdk.R;
/* loaded from: classes.dex */
public class a extends c {
    private final com.applovin.impl.mediation.debugger.a.b.b a;
    private final Context o;

    public a(com.applovin.impl.mediation.debugger.a.b.b bVar, Context context) {
        super(c.b.DETAIL);
        this.a = bVar;
        this.o = context;
        this.f3614d = q();
        this.f3615e = r();
    }

    private SpannedString q() {
        return StringUtils.createSpannedString(this.a.i(), b() ? -16777216 : -7829368, 18, 1);
    }

    private SpannedString r() {
        if (b()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) s());
            spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
            spannableStringBuilder.append((CharSequence) t());
            if (this.a.a() == b.a.INVALID_INTEGRATION) {
                spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
                spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString("Invalid Integration", -65536));
            }
            return new SpannedString(spannableStringBuilder);
        }
        return null;
    }

    private SpannedString s() {
        if (this.a.d()) {
            if (TextUtils.isEmpty(this.a.j())) {
                return StringUtils.createListItemDetailSpannedString(this.a.e() ? "Retrieving SDK Version..." : "SDK Found", -16777216);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("SDK\t\t\t\t\t  ", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.a.j(), -16777216));
            return new SpannedString(spannableStringBuilder);
        }
        return StringUtils.createListItemDetailSpannedString("SDK Missing", -65536);
    }

    private SpannedString t() {
        if (this.a.e()) {
            if (TextUtils.isEmpty(this.a.k())) {
                return StringUtils.createListItemDetailSpannedString("Adapter Found", -16777216);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ADAPTER  ", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.a.k(), -16777216));
            if (this.a.f()) {
                spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("  LATEST  ", Color.rgb(255, 127, 0)));
                spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.a.l(), -16777216));
            }
            return new SpannedString(spannableStringBuilder);
        }
        return StringUtils.createListItemDetailSpannedString("Adapter Missing", -65536);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.c
    public boolean b() {
        return this.a.a() != b.a.MISSING;
    }

    public com.applovin.impl.mediation.debugger.a.b.b d() {
        return this.a;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.c
    public int e() {
        int o = this.a.o();
        return o > 0 ? o : R.drawable.applovin_ic_mediation_placeholder;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.c
    public int f() {
        return b() ? R.drawable.applovin_ic_disclosure_arrow : super.e();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.c
    public int g() {
        return f.a(R.color.applovin_sdk_disclosureButtonColor, this.o);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("MediatedNetworkListItemViewModel{text=");
        y.append((Object) this.f3614d);
        y.append(", detailText=");
        y.append((Object) this.f3615e);
        y.append(", network=");
        y.append(this.a);
        y.append("}");
        return y.toString();
    }
}
