package com.kongzue.dialog.util;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;

import com.kongzue.dialog.listener.OnDismissListener;

/**
 * Author: @Kongzue
 * Github: https://github.com/kongzue/
 * Homepage: http://kongzue.com/
 * Mail: myzcxhh@live.cn
 * CreateTime: 2018/12/14 13:28
 */
public class KongzueDialogHelper {

    private AlertDialog alertDialog;
    private OnDismissListener onDismissListener;

    public KongzueDialogHelper setAlertDialog(AlertDialog alertDialog, OnDismissListener onDismissListener) {
        this.alertDialog = alertDialog;
        this.onDismissListener = onDismissListener;
        return this;
    }

    public void show() {
        alertDialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public void onDismiss(DialogInterface dialog) {
                onDismissListener.onDismiss();
            }
        });
        alertDialog.show();
    }

}
