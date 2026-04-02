package e.h.d;

import android.content.Context;
import com.jrtstudio.audio.Bookmark;
import java.io.Serializable;
import java.util.ArrayList;
/* loaded from: classes.dex */
public interface z extends Serializable {
    void C(Context context);

    t D(Context context, boolean z);

    ArrayList<t> E();

    String F();

    boolean H(Context context, t tVar, int i2);

    boolean L(Context context, boolean z);

    void N(Context context, Bookmark bookmark);

    void O(Context context);

    boolean R();

    void S(Context context, boolean z);

    void U(Context context, int i2, int i3);

    boolean Y(Context context, z zVar);

    z g();

    int getPosition();

    void k(Context context);

    boolean m();

    t n();

    void o(Context context, z zVar);

    Bookmark s(Context context);

    int size();

    void x(Context context, int i2);
}
