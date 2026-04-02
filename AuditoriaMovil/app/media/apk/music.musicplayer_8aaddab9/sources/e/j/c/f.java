package e.j.c;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AlertController;
import c.b.c.i;
import c.b.c.l;
import ch.qos.logback.core.CoreConstants;
import com.zipoapps.permissions.MultiplePermissionsRequester;
import e.a.c.l6;
import e.j.d.w;
import h.o.b.q;
import h.o.c.k;
import java.util.Map;
import java.util.Objects;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public final class f extends k implements q<MultiplePermissionsRequester, Map<String, ? extends Boolean>, Boolean, h.k> {
    public final /* synthetic */ i<MultiplePermissionsRequester, Map<String, Boolean>, Boolean> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i<MultiplePermissionsRequester, Map<String, Boolean>, Boolean> iVar) {
        super(3);
        this.a = iVar;
    }

    @Override // h.o.b.q
    public h.k f(MultiplePermissionsRequester multiplePermissionsRequester, Map<String, ? extends Boolean> map, Boolean bool) {
        MultiplePermissionsRequester multiplePermissionsRequester2 = multiplePermissionsRequester;
        boolean booleanValue = bool.booleanValue();
        h.o.c.j.e(multiplePermissionsRequester2, "requester");
        h.o.c.j.e(map, "result");
        i<MultiplePermissionsRequester, Map<String, Boolean>, Boolean> iVar = this.a;
        Boolean valueOf = Boolean.valueOf(booleanValue);
        Objects.requireNonNull((e.a.c.d) iVar);
        int i2 = l6.f5115k;
        if (valueOf.booleanValue()) {
            final l lVar = multiplePermissionsRequester2.a;
            h.o.c.j.e(lVar, CoreConstants.CONTEXT_SCOPE_VALUE);
            String string = lVar.getString(R.string.permission_needed);
            h.o.c.j.d(string, "context.getString(titleResId)");
            String string2 = lVar.getString(R.string.no_permission);
            h.o.c.j.d(string2, "context.getString(messageResId)");
            String string3 = lVar.getString(R.string.go_to_settings);
            h.o.c.j.d(string3, "context.getString(positiveTextResId)");
            String string4 = lVar.getString(R.string.later);
            h.o.c.j.d(string4, "context.getString(negativeTextResId)");
            h.o.c.j.e(lVar, CoreConstants.CONTEXT_SCOPE_VALUE);
            h.o.c.j.e(string, "title");
            h.o.c.j.e(string2, "message");
            h.o.c.j.e(string3, "positiveButtonText");
            h.o.c.j.e(string4, "negativeButtonText");
            i.a aVar = new i.a(lVar);
            AlertController.b bVar = aVar.a;
            bVar.f128d = string;
            bVar.f130f = string2;
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: e.j.c.c
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    Context context = lVar;
                    h.o.c.j.e(context, "$context");
                    h.o.c.j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse(h.o.c.j.i("package:", context.getPackageName())));
                        context.startActivity(intent);
                        e.j.d.k.a.a().f();
                    } catch (Throwable th) {
                        w.y(th);
                    }
                }
            };
            bVar.f131g = string3;
            bVar.f132h = onClickListener;
            d dVar = new DialogInterface.OnClickListener() { // from class: e.j.c.d
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    dialogInterface.dismiss();
                }
            };
            bVar.f133i = string4;
            bVar.f134j = dVar;
            aVar.d();
        }
        return h.k.a;
    }
}
