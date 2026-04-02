package com.amazon.aps.iva.q5;

import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;
import java.util.List;
/* compiled from: AdViewProvider.java */
/* loaded from: classes.dex */
public interface d {
    default List<a> getAdOverlayInfos() {
        return ImmutableList.of();
    }

    ViewGroup getAdViewGroup();
}
