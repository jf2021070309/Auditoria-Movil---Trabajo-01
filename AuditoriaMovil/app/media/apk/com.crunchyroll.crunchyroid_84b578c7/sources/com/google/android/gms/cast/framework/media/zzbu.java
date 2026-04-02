package com.google.android.gms.cast.framework.media;

import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.cast.framework.R;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzbu extends ArrayAdapter implements View.OnClickListener {
    private final Context zza;
    private int zzb;

    public zzbu(Context context, List list, int i) {
        super(context, R.layout.cast_tracks_chooser_dialog_row_layout, list == null ? new ArrayList() : list);
        this.zza = context;
        this.zzb = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x008a, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L16;
     */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            r0 = 0
            if (r7 != 0) goto L33
            android.content.Context r7 = r5.zza
            java.lang.String r1 = "layout_inflater"
            java.lang.Object r7 = r7.getSystemService(r1)
            android.view.LayoutInflater r7 = (android.view.LayoutInflater) r7
            java.lang.Object r7 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)
            android.view.LayoutInflater r7 = (android.view.LayoutInflater) r7
            int r1 = com.google.android.gms.cast.framework.R.layout.cast_tracks_chooser_dialog_row_layout
            android.view.View r7 = r7.inflate(r1, r8, r0)
            com.google.android.gms.cast.framework.media.zzbt r8 = new com.google.android.gms.cast.framework.media.zzbt
            int r1 = com.google.android.gms.cast.framework.R.id.text
            android.view.View r1 = r7.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r2 = com.google.android.gms.cast.framework.R.id.radio
            android.view.View r2 = r7.findViewById(r2)
            android.widget.RadioButton r2 = (android.widget.RadioButton) r2
            r3 = 0
            r8.<init>(r5, r1, r2, r3)
            r7.setTag(r8)
            goto L3f
        L33:
            java.lang.Object r8 = r7.getTag()
            com.google.android.gms.cast.framework.media.zzbt r8 = (com.google.android.gms.cast.framework.media.zzbt) r8
            java.lang.Object r8 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)
            com.google.android.gms.cast.framework.media.zzbt r8 = (com.google.android.gms.cast.framework.media.zzbt) r8
        L3f:
            android.widget.RadioButton r1 = r8.zzb
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r1.setTag(r2)
            android.widget.RadioButton r1 = r8.zzb
            int r2 = r5.zzb
            r3 = 1
            if (r2 != r6) goto L50
            r0 = r3
        L50:
            r1.setChecked(r0)
            r7.setOnClickListener(r5)
            java.lang.Object r0 = r5.getItem(r6)
            com.google.android.gms.cast.MediaTrack r0 = (com.google.android.gms.cast.MediaTrack) r0
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.cast.MediaTrack r0 = (com.google.android.gms.cast.MediaTrack) r0
            java.lang.String r1 = r0.getName()
            java.util.Locale r2 = r0.getLanguageLocale()
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 == 0) goto L9e
            int r0 = r0.getSubtype()
            r1 = 2
            if (r0 != r1) goto L80
            android.content.Context r6 = r5.zza
            int r0 = com.google.android.gms.cast.framework.R.string.cast_tracks_chooser_dialog_closed_captions
            java.lang.String r1 = r6.getString(r0)
            goto L9e
        L80:
            if (r2 == 0) goto L8d
            java.lang.String r1 = r2.getDisplayLanguage()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L8d
            goto L9e
        L8d:
            android.content.Context r0 = r5.zza
            int r1 = com.google.android.gms.cast.framework.R.string.cast_tracks_chooser_dialog_default_track_name
            int r6 = r6 + r3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r1 = r0.getString(r1, r6)
        L9e:
            android.widget.TextView r6 = r8.zza
            r6.setText(r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.media.zzbu.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zzb = ((Integer) Preconditions.checkNotNull(((zzbt) Preconditions.checkNotNull((zzbt) view.getTag())).zzb.getTag())).intValue();
        notifyDataSetChanged();
    }

    public final MediaTrack zza() {
        int i = this.zzb;
        if (i >= 0 && i < getCount()) {
            return (MediaTrack) getItem(this.zzb);
        }
        return null;
    }
}
