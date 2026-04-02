package com.google.android.gms.cast.framework.media.widget;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import com.google.android.gms.common.util.PlatformVersion;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
final class zzg extends View.AccessibilityDelegate {
    final /* synthetic */ CastSeekBar zza;

    public /* synthetic */ zzg(CastSeekBar castSeekBar, zzf zzfVar) {
        this.zza = castSeekBar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(SeekBar.class.getName());
        accessibilityEvent.setItemCount(this.zza.zza.zzb);
        accessibilityEvent.setCurrentItemIndex(this.zza.getProgress());
    }

    @Override // android.view.View.AccessibilityDelegate
    @TargetApi(16)
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(SeekBar.class.getName());
        if (PlatformVersion.isAtLeastJellyBean() && view.isEnabled()) {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    @TargetApi(16)
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (!view.isEnabled()) {
            return false;
        }
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (PlatformVersion.isAtLeastJellyBean() && (i == 4096 || i == 8192)) {
            CastSeekBar.zzb(this.zza);
            CastSeekBar castSeekBar = this.zza;
            int i2 = castSeekBar.zza.zzb / 20;
            if (i == 8192) {
                i2 = -i2;
            }
            CastSeekBar.zza(castSeekBar, castSeekBar.getProgress() + i2);
            CastSeekBar.zzc(this.zza);
        }
        return false;
    }
}
