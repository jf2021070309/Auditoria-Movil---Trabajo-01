package com.vungle.publisher;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.adunit.AdUnitActivity;
/* loaded from: classes4.dex */
public class t extends o implements Parcelable {
    static final Orientation b = Orientation.matchVideo;
    public static final Parcelable.Creator<t> CREATOR = new Parcelable.Creator<t>() { // from class: com.vungle.publisher.t.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public t createFromParcel(Parcel parcel) {
            return new t(new o[0]).a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public t[] newArray(int i) {
            return new t[i];
        }
    };

    public t(o... oVarArr) {
        if (oVarArr != null) {
            for (o oVar : oVarArr) {
                if (oVar != null) {
                    this.a.putAll(oVar.a);
                }
            }
        }
    }

    @Override // com.vungle.publisher.o, com.vungle.publisher.p
    public boolean isBackButtonImmediatelyEnabled() {
        return this.a.getBoolean("isBackButtonEnabled", false);
    }

    @Override // com.vungle.publisher.o, com.vungle.publisher.p
    public boolean isImmersiveMode() {
        return this.a.getBoolean("isImmersiveMode", false);
    }

    @Override // com.vungle.publisher.o, com.vungle.publisher.p
    public String getIncentivizedCancelDialogBodyText() {
        String string = this.a.getString("incentivizedCancelDialogBodyText");
        if (string == null) {
            return "Closing this video early will prevent you from earning your reward. Are you sure?";
        }
        return string;
    }

    @Override // com.vungle.publisher.o, com.vungle.publisher.p
    public String getIncentivizedCancelDialogCloseButtonText() {
        String string = this.a.getString("incentivizedCancelDialogNegativeButtonText");
        if (!zk.a(string)) {
            return "Close video";
        }
        return string;
    }

    @Override // com.vungle.publisher.o, com.vungle.publisher.p
    public String getIncentivizedCancelDialogKeepWatchingButtonText() {
        String string = this.a.getString("incentivizedCancelDialogPositiveButtonText");
        if (!zk.a(string)) {
            return "Keep watching";
        }
        return string;
    }

    @Override // com.vungle.publisher.o, com.vungle.publisher.p
    public String getIncentivizedCancelDialogTitle() {
        String string = this.a.getString("incentivizedCancelDialogTitle");
        if (string == null) {
            return "Close video?";
        }
        return string;
    }

    @Override // com.vungle.publisher.o, com.vungle.publisher.p
    public Orientation getOrientation() {
        Orientation orientation = (Orientation) this.a.getParcelable(AdUnitActivity.EXTRA_ORIENTATION);
        return orientation == null ? b : orientation;
    }

    @Override // com.vungle.publisher.o, com.vungle.publisher.p
    public boolean isSoundEnabled() {
        return this.a.getBoolean("isSoundEnabled", true);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }

    protected t a(Parcel parcel) {
        this.a = parcel.readBundle(t.class.getClassLoader());
        return this;
    }
}
