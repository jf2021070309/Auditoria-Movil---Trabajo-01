package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.customview.view.AbsSavedState;
import c.b.i.l;
import c.i.k.d0;
import ch.qos.logback.classic.pattern.ThrowableProxyConverter;
import e.d.b.d.r.a;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public class CheckableImageButton extends l implements Checkable {

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f4659c = {16842912};

    /* renamed from: d  reason: collision with root package name */
    public boolean f4660d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4661e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4662f;

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public boolean f4663c;

        /* loaded from: classes2.dex */
        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4663c = parcel.readInt() == 1;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f369b, i2);
            parcel.writeInt(this.f4663c ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.imageButtonStyle);
        this.f4661e = true;
        this.f4662f = true;
        d0.A(this, new a(this));
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f4660d;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i2) {
        if (this.f4660d) {
            int[] iArr = f4659c;
            return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i2 + iArr.length), iArr);
        }
        return super.onCreateDrawableState(i2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f369b);
        setChecked(savedState.f4663c);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f4663c = this.f4660d;
        return savedState;
    }

    public void setCheckable(boolean z) {
        if (this.f4661e != z) {
            this.f4661e = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f4661e || this.f4660d == z) {
            return;
        }
        this.f4660d = z;
        refreshDrawableState();
        sendAccessibilityEvent(ThrowableProxyConverter.BUILDER_CAPACITY);
    }

    public void setPressable(boolean z) {
        this.f4662f = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f4662f) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f4660d);
    }
}
