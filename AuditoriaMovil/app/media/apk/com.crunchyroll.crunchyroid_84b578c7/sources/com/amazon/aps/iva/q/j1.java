package com.amazon.aps.iva.q;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.view.View;
import android.widget.EditText;
import androidx.emoji2.text.d;
import androidx.emoji2.text.g;
import com.amazon.aps.iva.a6.u1;
import com.amazon.aps.iva.k3.m;
import com.amazon.aps.iva.oy.d;
import com.crunchyroll.crunchyroid.R;
import com.ellation.widgets.input.AdjustableTextInputLayout;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.motion.MaterialBackOrchestrator;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class j1 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((k1) this.c).a();
                throw null;
            case 1:
                g.b bVar = (g.b) this.c;
                synchronized (bVar.d) {
                    if (bVar.h != null) {
                        try {
                            com.amazon.aps.iva.m3.l d = bVar.d();
                            int i = d.e;
                            if (i == 2) {
                                synchronized (bVar.d) {
                                }
                            }
                            if (i == 0) {
                                int i2 = com.amazon.aps.iva.k3.m.a;
                                m.a.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                g.a aVar = bVar.c;
                                Context context = bVar.a;
                                aVar.getClass();
                                Typeface b = com.amazon.aps.iva.g3.i.a.b(context, new com.amazon.aps.iva.m3.l[]{d}, 0);
                                MappedByteBuffer e = com.amazon.aps.iva.g3.p.e(bVar.a, d.a);
                                if (e != null && b != null) {
                                    try {
                                        m.a.a("EmojiCompat.MetadataRepo.create");
                                        androidx.emoji2.text.h hVar = new androidx.emoji2.text.h(b, com.amazon.aps.iva.i4.h.a(e));
                                        m.a.b();
                                        m.a.b();
                                        synchronized (bVar.d) {
                                            d.i iVar = bVar.h;
                                            if (iVar != null) {
                                                iVar.b(hVar);
                                            }
                                        }
                                        bVar.b();
                                        return;
                                    } catch (Throwable th) {
                                        int i3 = com.amazon.aps.iva.k3.m.a;
                                        m.a.b();
                                        throw th;
                                    }
                                }
                                throw new RuntimeException("Unable to open file.");
                            }
                            throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                        } catch (Throwable th2) {
                            synchronized (bVar.d) {
                                d.i iVar2 = bVar.h;
                                if (iVar2 != null) {
                                    iVar2.a(th2);
                                }
                                bVar.b();
                                return;
                            }
                        }
                    }
                    return;
                }
            case 2:
                ArrayList arrayList = (ArrayList) this.c;
                com.amazon.aps.iva.yb0.j.f(arrayList, "$transitioningViews");
                com.amazon.aps.iva.n4.w.c(4, arrayList);
                return;
            case 3:
                com.amazon.aps.iva.b6.x.d(this.c);
                int i4 = u1.a;
                throw null;
            case 4:
                androidx.profileinstaller.c.b((Context) this.c, new com.amazon.aps.iva.m8.d(0), androidx.profileinstaller.c.a, false);
                return;
            case 5:
                com.amazon.aps.iva.mf.c cVar = (com.amazon.aps.iva.mf.c) this.c;
                com.amazon.aps.iva.yb0.j.f(cVar, "this$0");
                cVar.q6();
                return;
            case 6:
                com.amazon.aps.iva.xb0.a aVar2 = (com.amazon.aps.iva.xb0.a) this.c;
                com.amazon.aps.iva.yb0.j.f(aVar2, "$action");
                aVar2.invoke();
                return;
            case 7:
                com.amazon.aps.iva.oy.d dVar = (com.amazon.aps.iva.oy.d) this.c;
                com.amazon.aps.iva.yb0.j.f(dVar, "this$0");
                dVar.h.a(new d.b(dVar));
                return;
            case 8:
                com.amazon.aps.iva.s00.a aVar3 = (com.amazon.aps.iva.s00.a) this.c;
                com.amazon.aps.iva.yb0.j.f(aVar3, "this$0");
                new MaterialAlertDialogBuilder(aVar3.b).setTitle(R.string.unable_to_sync).setMessage(R.string.download_storage_is_full_message).setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) null).show();
                return;
            case 9:
                AdjustableTextInputLayout adjustableTextInputLayout = (AdjustableTextInputLayout) this.c;
                int i5 = AdjustableTextInputLayout.d;
                com.amazon.aps.iva.yb0.j.f(adjustableTextInputLayout, "this$0");
                EditText editText = adjustableTextInputLayout.c;
                if (editText != null) {
                    com.amazon.aps.iva.xw.t0.i(editText, Integer.valueOf(adjustableTextInputLayout.b1(com.ellation.crunchyroll.ui.R.dimen.input_field_padding_horizontal)), Integer.valueOf(adjustableTextInputLayout.b1(com.ellation.crunchyroll.ui.R.dimen.input_field_padding_top_cleared)), Integer.valueOf(adjustableTextInputLayout.b1(com.ellation.crunchyroll.ui.R.dimen.input_field_padding_horizontal)), Integer.valueOf(adjustableTextInputLayout.b1(com.ellation.crunchyroll.ui.R.dimen.input_field_padding_bottom_cleared)));
                    return;
                } else {
                    com.amazon.aps.iva.yb0.j.m("inputEditText");
                    throw null;
                }
            case 10:
                BottomAppBar.G((View) this.c);
                return;
            case 11:
                ((MaterialBackOrchestrator) this.c).startListeningForBackCallbacksWithPriorityOverlay();
                return;
            case 12:
                ((com.amazon.aps.iva.ha0.d) this.c).e(null);
                return;
            default:
                ((Runnable) this.c).run();
                return;
        }
    }
}
