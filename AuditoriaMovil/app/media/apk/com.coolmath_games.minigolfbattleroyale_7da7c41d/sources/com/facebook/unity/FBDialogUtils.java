package com.facebook.unity;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.share.internal.ShareConstants;
import com.facebook.share.internal.ShareFeedContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.widget.ShareDialog;
/* loaded from: classes.dex */
class FBDialogUtils {
    FBDialogUtils() {
    }

    public static ShareLinkContent.Builder createShareContentBuilder(Bundle bundle) {
        ShareLinkContent.Builder builder = new ShareLinkContent.Builder();
        if (bundle.containsKey("content_title")) {
            builder.setContentTitle(bundle.getString("content_title"));
        }
        if (bundle.containsKey("content_description")) {
            builder.setContentDescription(bundle.getString("content_description"));
        }
        if (bundle.containsKey(ShareConstants.STORY_DEEP_LINK_URL)) {
            builder.setContentUrl(Uri.parse(bundle.getString(ShareConstants.STORY_DEEP_LINK_URL)));
        }
        if (bundle.containsKey("photo_url")) {
            builder.setImageUrl(Uri.parse(bundle.getString("photo_url")));
        }
        return builder;
    }

    public static ShareFeedContent.Builder createFeedContentBuilder(Bundle bundle) {
        ShareFeedContent.Builder builder = new ShareFeedContent.Builder();
        if (bundle.containsKey("toId")) {
            builder.setToId(bundle.getString("toId"));
        }
        if (bundle.containsKey("link")) {
            builder.setLink(bundle.getString("link"));
        }
        if (bundle.containsKey("linkName")) {
            builder.setLinkName(bundle.getString("linkName"));
        }
        if (bundle.containsKey("linkCaption")) {
            builder.setLinkCaption(bundle.getString("linkCaption"));
        }
        if (bundle.containsKey("linkDescription")) {
            builder.setLinkDescription(bundle.getString("linkDescription"));
        }
        if (bundle.containsKey("picture")) {
            builder.setPicture(bundle.getString("picture"));
        }
        if (bundle.containsKey("mediaSource")) {
            builder.setMediaSource(bundle.getString("mediaSource"));
        }
        return builder;
    }

    public static ShareDialog.Mode intToMode(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return ShareDialog.Mode.FEED;
                }
                return ShareDialog.Mode.WEB;
            }
            return ShareDialog.Mode.NATIVE;
        }
        return ShareDialog.Mode.AUTOMATIC;
    }
}
