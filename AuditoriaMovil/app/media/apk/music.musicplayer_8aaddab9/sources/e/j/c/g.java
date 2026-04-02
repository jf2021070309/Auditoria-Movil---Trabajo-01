package e.j.c;

import android.content.DialogInterface;
import androidx.appcompat.app.AlertController;
import c.b.c.i;
import c.b.c.l;
import ch.qos.logback.core.CoreConstants;
import com.zipoapps.permissions.BasePermissionRequester;
import com.zipoapps.permissions.MultiplePermissionsRequester;
import e.a.c.l6;
import h.o.b.p;
import h.o.c.k;
import java.util.List;
import java.util.Objects;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public final class g extends k implements p<MultiplePermissionsRequester, List<? extends String>, h.k> {
    public final /* synthetic */ h<MultiplePermissionsRequester, List<String>> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h<MultiplePermissionsRequester, List<String>> hVar) {
        super(2);
        this.a = hVar;
    }

    @Override // h.o.b.p
    public h.k i(MultiplePermissionsRequester multiplePermissionsRequester, List<? extends String> list) {
        final MultiplePermissionsRequester multiplePermissionsRequester2 = multiplePermissionsRequester;
        h.o.c.j.e(multiplePermissionsRequester2, "requester");
        h.o.c.j.e(list, "result");
        Objects.requireNonNull((e.a.c.e) this.a);
        int i2 = l6.f5115k;
        l lVar = multiplePermissionsRequester2.a;
        h.o.c.j.e(lVar, CoreConstants.CONTEXT_SCOPE_VALUE);
        h.o.c.j.e(multiplePermissionsRequester2, "permissionRequester");
        String string = lVar.getString(R.string.permission_needed);
        h.o.c.j.d(string, "context.getString(titleResId)");
        String string2 = lVar.getString(R.string.permission_needed_message);
        h.o.c.j.d(string2, "context.getString(messageResId)");
        String string3 = lVar.getString(R.string.ok);
        h.o.c.j.d(string3, "context.getString(positiveTextResId)");
        h.o.c.j.e(lVar, CoreConstants.CONTEXT_SCOPE_VALUE);
        h.o.c.j.e(multiplePermissionsRequester2, "permissionRequester");
        h.o.c.j.e(string, "title");
        h.o.c.j.e(string2, "message");
        h.o.c.j.e(string3, "positiveButtonText");
        i.a aVar = new i.a(lVar);
        AlertController.b bVar = aVar.a;
        bVar.f128d = string;
        bVar.f130f = string2;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: e.j.c.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                BasePermissionRequester basePermissionRequester = BasePermissionRequester.this;
                h.o.c.j.e(basePermissionRequester, "$permissionRequester");
                basePermissionRequester.i();
                dialogInterface.dismiss();
            }
        };
        bVar.f131g = string3;
        bVar.f132h = onClickListener;
        aVar.d();
        return h.k.a;
    }
}
