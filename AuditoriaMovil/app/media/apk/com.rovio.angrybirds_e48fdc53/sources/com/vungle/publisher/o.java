package com.vungle.publisher;

import android.os.Bundle;
import com.unity3d.ads.adunit.AdUnitActivity;
import javax.inject.Inject;
/* loaded from: classes4.dex */
public class o implements p {
    protected Bundle a = new Bundle();

    @Inject
    public o() {
        d(true);
    }

    @Override // com.vungle.publisher.p
    public boolean isBackButtonImmediatelyEnabled() {
        return this.a.getBoolean("isBackButtonEnabled");
    }

    public void a(boolean z) {
        this.a.putBoolean("isBackButtonEnabled", z);
    }

    @Override // com.vungle.publisher.p
    public boolean isImmersiveMode() {
        return this.a.getBoolean("isImmersiveMode", true);
    }

    public void b(boolean z) {
        this.a.putBoolean("isImmersiveMode", z);
    }

    @Override // com.vungle.publisher.p
    public String getIncentivizedCancelDialogBodyText() {
        return this.a.getString("incentivizedCancelDialogBodyText");
    }

    public void a(String str) {
        this.a.putString("incentivizedCancelDialogBodyText", str);
    }

    @Override // com.vungle.publisher.p
    public String getIncentivizedCancelDialogCloseButtonText() {
        return this.a.getString("incentivizedCancelDialogNegativeButtonText");
    }

    public void b(String str) {
        this.a.putString("incentivizedCancelDialogNegativeButtonText", str);
    }

    @Override // com.vungle.publisher.p
    public String getIncentivizedCancelDialogKeepWatchingButtonText() {
        return this.a.getString("incentivizedCancelDialogPositiveButtonText");
    }

    public void c(String str) {
        this.a.putString("incentivizedCancelDialogPositiveButtonText", str);
    }

    @Override // com.vungle.publisher.p
    public String getIncentivizedCancelDialogTitle() {
        return this.a.getString("incentivizedCancelDialogTitle");
    }

    public void d(String str) {
        this.a.putString("incentivizedCancelDialogTitle", str);
    }

    public void e(String str) {
        this.a.putString("incentivizedUserId", str);
    }

    @Override // com.vungle.publisher.p
    public String getIncentivizedUserId() {
        return this.a.getString("incentivizedUserId");
    }

    @Override // com.vungle.publisher.p
    public Orientation getOrientation() {
        return (Orientation) this.a.getParcelable(AdUnitActivity.EXTRA_ORIENTATION);
    }

    public void a(Orientation orientation) {
        this.a.putParcelable(AdUnitActivity.EXTRA_ORIENTATION, orientation);
    }

    @Override // com.vungle.publisher.p
    public boolean isSoundEnabled() {
        return this.a.getBoolean("isSoundEnabled");
    }

    public void c(boolean z) {
        this.a.putBoolean("isSoundEnabled", z);
    }

    @Override // com.vungle.publisher.p
    public boolean isTransitionAnimationEnabled() {
        return this.a.getBoolean("isTransitionAnimationEnabled");
    }

    public void d(boolean z) {
        this.a.putBoolean("isTransitionAnimationEnabled", z);
    }

    public void a(int i) {
        this.a.putInt("flexViewCloseTimerInSecKey", i);
    }

    @Override // com.vungle.publisher.p
    public int getFlexViewCloseTimeInSec() {
        return this.a.getInt("flexViewCloseTimerInSecKey", 0);
    }

    public void b(int i) {
        this.a.putInt("ordinalViewCount", i);
    }

    @Override // com.vungle.publisher.p
    public int getOrdinalViewCount() {
        return this.a.getInt("ordinalViewCount", 0);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof o) && a((o) obj);
    }

    public boolean a(o oVar) {
        return oVar != null && oVar.a.equals(this.a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(123);
        a(sb, this.a);
        sb.append('}');
        return sb.toString();
    }

    protected void a(StringBuilder sb, Bundle bundle) {
        boolean z = true;
        for (String str : bundle.keySet()) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str).append(" = ").append(bundle.get(str));
        }
    }
}
