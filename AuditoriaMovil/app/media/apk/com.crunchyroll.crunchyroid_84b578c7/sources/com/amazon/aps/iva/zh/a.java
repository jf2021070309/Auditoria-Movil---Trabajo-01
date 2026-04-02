package com.amazon.aps.iva.zh;

import android.view.View;
import com.crunchyroll.music.artist.ArtistActivity;
import com.crunchyroll.profiles.presentation.avatar.AvatarSelectionActivity;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a c;

    public /* synthetic */ a(int i, com.amazon.aps.iva.xb0.a aVar) {
        this.b = i;
        this.c = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        com.amazon.aps.iva.xb0.a aVar = this.c;
        switch (i) {
            case 0:
                int i2 = ArtistActivity.m;
                com.amazon.aps.iva.yb0.j.f(aVar, "$callback");
                aVar.invoke();
                return;
            default:
                int i3 = AvatarSelectionActivity.n;
                com.amazon.aps.iva.yb0.j.f(aVar, "$callback");
                aVar.invoke();
                return;
        }
    }
}
