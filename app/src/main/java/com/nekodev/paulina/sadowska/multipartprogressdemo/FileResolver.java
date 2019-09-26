package com.nekodev.paulina.sadowska.multipartprogressdemo;

import android.content.Context;
import android.net.Uri;

import io.reactivex.annotations.Nullable;

/**
 * Created by Paulina Sadowska on 09.12.2017.
 */

class FileResolver {

    private final Context Context;

    FileResolver(Context Context) {
        this.Context = Context;
    }

    @Nullable
    String getFilePath(Uri selectedImage) {
        if (selectedImage == null) {
            return null;
        }

        return utils.ContentFile.getPathFromUri(Context, selectedImage);
    }
}
