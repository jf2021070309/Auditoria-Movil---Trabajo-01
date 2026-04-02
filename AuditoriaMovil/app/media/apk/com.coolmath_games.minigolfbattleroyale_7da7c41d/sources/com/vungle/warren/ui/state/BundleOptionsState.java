package com.vungle.warren.ui.state;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class BundleOptionsState implements OptionsState, Parcelable {
    public static final Parcelable.Creator<BundleOptionsState> CREATOR = new Parcelable.Creator<BundleOptionsState>() { // from class: com.vungle.warren.ui.state.BundleOptionsState.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BundleOptionsState createFromParcel(Parcel parcel) {
            return new BundleOptionsState(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BundleOptionsState[] newArray(int i) {
            return new BundleOptionsState[i];
        }
    };
    private Map<String, String> strings = new HashMap();
    private Map<String, Boolean> bools = new HashMap();
    private Map<String, Integer> ints = new HashMap();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public BundleOptionsState() {
    }

    @Override // com.vungle.warren.ui.state.OptionsState
    public void put(String str, String str2) {
        this.strings.put(str, str2);
    }

    @Override // com.vungle.warren.ui.state.OptionsState
    public void put(String str, boolean z) {
        this.bools.put(str, Boolean.valueOf(z));
    }

    @Override // com.vungle.warren.ui.state.OptionsState
    public void put(String str, int i) {
        this.ints.put(str, Integer.valueOf(i));
    }

    @Override // com.vungle.warren.ui.state.OptionsState
    public boolean getBoolean(String str, boolean z) {
        Boolean bool = this.bools.get(str);
        return bool == null ? z : bool.booleanValue();
    }

    @Override // com.vungle.warren.ui.state.OptionsState
    public String getString(String str) {
        return this.strings.get(str);
    }

    @Override // com.vungle.warren.ui.state.OptionsState
    public Integer getInt(String str, int i) {
        Integer num = this.ints.get(str);
        if (num != null) {
            i = num.intValue();
        }
        return Integer.valueOf(i);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.ints.size());
        for (Map.Entry<String, Integer> entry : this.ints.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeValue(entry.getValue());
        }
        parcel.writeInt(this.strings.size());
        for (Map.Entry<String, String> entry2 : this.strings.entrySet()) {
            parcel.writeString(entry2.getKey());
            parcel.writeValue(entry2.getValue());
        }
        parcel.writeInt(this.bools.size());
        for (Map.Entry<String, Boolean> entry3 : this.bools.entrySet()) {
            parcel.writeString(entry3.getKey());
            parcel.writeValue(entry3.getValue());
        }
    }

    protected BundleOptionsState(Parcel parcel) {
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            this.ints.put(parcel.readString(), (Integer) parcel.readValue(String.class.getClassLoader()));
        }
        int readInt2 = parcel.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            this.strings.put(parcel.readString(), (String) parcel.readValue(String.class.getClassLoader()));
        }
        int readInt3 = parcel.readInt();
        for (int i3 = 0; i3 < readInt3; i3++) {
            this.bools.put(parcel.readString(), (Boolean) parcel.readValue(Boolean.class.getClassLoader()));
        }
    }
}
