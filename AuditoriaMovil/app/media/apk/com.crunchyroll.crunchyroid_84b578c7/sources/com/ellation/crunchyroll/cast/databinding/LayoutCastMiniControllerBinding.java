package com.ellation.crunchyroll.cast.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.amazon.aps.iva.d9.a;
import com.amazon.aps.iva.e.z;
import com.ellation.crunchyroll.cast.R;
/* loaded from: classes2.dex */
public final class LayoutCastMiniControllerBinding implements a {
    public final ViewStub castMiniController;
    private final View rootView;

    private LayoutCastMiniControllerBinding(View view, ViewStub viewStub) {
        this.rootView = view;
        this.castMiniController = viewStub;
    }

    public static LayoutCastMiniControllerBinding bind(View view) {
        int i = R.id.cast_mini_controller;
        ViewStub viewStub = (ViewStub) z.u(i, view);
        if (viewStub != null) {
            return new LayoutCastMiniControllerBinding(view, viewStub);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static LayoutCastMiniControllerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.layout_cast_mini_controller, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // com.amazon.aps.iva.d9.a
    public View getRoot() {
        return this.rootView;
    }
}
